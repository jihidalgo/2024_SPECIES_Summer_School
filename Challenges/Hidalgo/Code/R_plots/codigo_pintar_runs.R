## Parser for Pancreas Model Tools log file
## Improvisation to extract runs
## 
## General idea :
## Read all file in a vector; a single line per vector element
## Find those elements that contain the string run #<number>
## These make the start of a run and the end of the first n-1 runs
## The last run would finish at the string 
## 
## 
## Code bases on the example at C:\Users\omgmv\Documents\PMT\exp2\PancreasModelTools_2024-08-31_01-01-26.log

# Tests
# folder <- "C:\\Users\\omgmv\\Documents\\PMT\\exp2\\"
# file <- "PancreasModelTools_2024-08-31_01-01-26.log"

read_log <- function(folder,file){
  filename <-file.path(folder,file)
  log<- readLines(con = filename)
  log
}

prepare_log <- function(log){
  #browser()
  grep(x = log,pattern = "Run #\\w",perl = T,value = T)
  grep(x = log,pattern = "Aug",perl = T,value = T)
  msg <- grep(x = log,pattern = "INFO: .* performed",perl = T,value = T)
  msg <- gsub(x = msg,pattern = "-->> Infinity or NaN.*$",replacement = "")
  msg <- gsub(x = msg,pattern = "^(.*?) -->> (.*$)","\\2")
  msg <- gsub(x = msg,pattern = "-->>",replacement = ";")
  msg <- gsub(x = msg,pattern = "[^\\.0-9;]",replacement = "")
  msg <- gsub(x = msg,pattern = ";\\.+",replacement = ";")
  msg <- do.call(rbind,strsplit(msg,split = ";"))
  data <- as.data.frame(msg)
  names(data)<- c("Best","Mean","SD")
  
  data <- lapply(data,as.numeric)
  data <- as.data.frame(data)
  data$generation <-(((1:nrow(data))-1) %% 10 )+1 
  data$run <- as.factor( (((1:nrow(data))-1) %/% 10 )+1 )
  data
}

#test
#data <- prepare_log(read_log(folder,file))

# InputData <-list(c(folder ="C:\\Users\\omgmv\\Documents\\PMT\\exp2\\" ,
#        filename = "PancreasModelTools_2024-08-31_01-01-26.log",
#        experiment = "Grammar Product Depth 4"),
#      c(folder = "C:\\Users\\omgmv\\Documents\\PMT - Copy\\exp3\\",
#        filename = "PancreasModelTools_2024-08-31_06-09-32.log",
#        experiment = "Grammar Product Depth 17"),
#      c(folder = "C:\\Users\\omgmv\\Documents\\PMT - Grammar2\\exp4\\" ,
#        filename = "PancreasModelTools_2024-08-31_06-05-39.log",
#        experiment = "Grammar with Division Depth 4"),
#      c(folder = "C:\\Users\\omgmv\\Documents\\PMT - Grammar2 - Copy\\exp5\\" ,
#        filename = "PancreasModelTools_2024-08-31_10-56-06.log",
#        experiment = "Grammar with Division Depth 17")
#        )


setwd("~/outcomesGlobal/Models/")
logfiles <- list.files(recursive = T,pattern = "*.log")

folder <- dirname(logfiles)
filename <- basename(logfiles)
experiment <- gsub(pattern = "\\.log",replacement = "" ,x = basename(logfiles))

InputData <- mapply(FUN = function(x,y,z){
  out <- c(x,y,z)
  names(out)<-c("folder","filename","experiment")
  out
  },
  folder,filename,experiment,SIMPLIFY = F)

InputData <- lapply(InputData,FUN = function(input){
  #browser()
  data <- prepare_log(read_log(input["folder"],input["filename"]))
  data$Experiment <- input["experiment"]
  data
  })

InputData <- do.call(rbind,InputData)
InputData <- cbind(InputData,setNames(as.data.frame(do.call(rbind,strsplit(InputData$Experiment,"_"))),
                                       c("Algorithm","Grammar","Depth")))

#################################################
### Plots 
### 
require(ggplot2)
require(plyr)

##### Plotting the Best Individual of each run
# ggplot(InputData) +  geom_point(aes(x = generation, y = Best,colour = run))
# 
# 
# ggplot(InputData) +
#   geom_line(aes(x = generation, y = Best,colour = run)) + ggtitle("Best Individual")+
#   facet_grid(cols=vars(Experiment)) + scale_y_log10()+theme_classic() + theme(legend.position = "bottom")

result <- ddply(.data = InputData,.variables = c("Experiment","generation","Algorithm","Grammar","Depth"),
                summarize,mean = mean(Best),sd = sd(Best,na.rm =T))

# ggplot(result,mapping = aes(colour = Experiment)) + 
#   geom_crossbar(aes(x=generation,y=mean,ymin=mean-sd,ymax=mean+sd)) +
#   geom_line(aes(x = generation, y = mean)) +
#   ggtitle("Run Means") +
#   scale_y_log10()+
#   theme_classic() + theme(legend.position = "bottom")


plot4 <- subset(result,subset = Algorithm != "GE")
ggplot(plot4) + 
  geom_ribbon(aes(x=generation,y=mean,ymin=mean-sd,ymax=mean+sd,fill = Experiment),alpha = 0.2) +
  geom_line(aes(x = generation, y = mean,colour = Experiment,lty = Depth),lwd = 1) +
  ggtitle("Run Means") +theme_classic() + theme(legend.position = "bottom") +guides(fill=guide_legend(ncol=2))+
  facet_grid(rows = vars(Algorithm),cols =vars(Grammar) )  +
  scale_x_continuous(name = "generations (%)",breaks = seq(0,10,2),labels = 10 * seq(0,10,2)) +
  scale_y_continuous(name = "RMSE")

ggplot(plot4) + 
  geom_line(aes(x = generation, y = mean,colour = Experiment,lty = Depth),lwd = 1) +
  ggtitle("Run Means") +theme_classic() +
  #facet_grid(rows = vars(Algorithm),cols =vars(Grammar) )+
  scale_x_continuous(name = "generations (%)",breaks = seq(0,10,2),labels = 10 * seq(0,10,2)) +
  scale_y_continuous(name = "RMSE")+
  theme(legend.position = "bottom") +guides(fill=guide_legend(ncol=2))


plotGE <- subset(result,subset = Algorithm == "GE")
ggplot(plotGE) + 
  geom_ribbon(aes(x=generation,y=mean,ymin=mean-sd,ymax=mean+sd,fill = Experiment),alpha = 0.2) +
  geom_line(aes(x = generation, y = mean,colour = Experiment,lty = Grammar),lwd = 1) +
  ggtitle("Run Means") + 
  theme_classic() + theme(legend.position = "bottom") +
  guides(fill=guide_legend(ncol=3))+
  scale_x_continuous(name = "generations (%)",breaks = seq(0,10,2),labels = 10 * seq(0,10,2))+
  scale_y_continuous(name = "RMSE")

ggplot(result) + 
  geom_ribbon(aes(x=generation,y=mean,ymin=mean-sd,ymax=mean+sd,fill = Experiment),alpha = 0.2) +
  geom_line(aes(x = generation, y = mean,colour = Experiment,lty = Depth),lwd = 1) +
  ggtitle("Run Means") +theme_classic() + theme(legend.position = "bottom") +
  guides(fill=guide_legend(ncol=4))+
  facet_grid(cols =vars(Algorithm) )+
  scale_x_continuous(name = "generations (%)",,breaks = seq(0,10,2),labels = 10 * seq(0,10,2))+
  scale_y_continuous(name = "RMSE")
