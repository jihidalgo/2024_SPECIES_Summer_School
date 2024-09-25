public class PopEvaluator1 extends algorithm.AbstractPopEvaluator {

	public double evaluate(int idxExpr, int k) {
		double result = 0.0;

		double t = 0.0;

		if(idxExpr<50&& idxExpr>=0){
			result=evaluate1(idxExpr, k);
		}
		if(idxExpr<100&& idxExpr>=50){
			result=evaluate2(idxExpr, k);
		}
		if(idxExpr<150&& idxExpr>=100){
			result=evaluate3(idxExpr, k);
		}
		if(idxExpr<200&& idxExpr>=150){
			result=evaluate4(idxExpr, k);
		}
		if(idxExpr<250&& idxExpr>=200){
			result=evaluate5(idxExpr, k);
		}
		if(idxExpr<300&& idxExpr>=250){
			result=evaluate6(idxExpr, k);
		}
		if(idxExpr<350&& idxExpr>=300){
			result=evaluate7(idxExpr, k);
		}
		if(idxExpr<400&& idxExpr>=350){
			result=evaluate8(idxExpr, k);
		}
		if(idxExpr<450&& idxExpr>=400){
			result=evaluate9(idxExpr, k);
		}
		if(idxExpr<500&& idxExpr>=450){
			result=evaluate10(idxExpr, k);
		}
		if(idxExpr<550&& idxExpr>=500){
			result=evaluate11(idxExpr, k);
		}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate1(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 0:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)*getVariable(5,k)*getVariable(7,k)+getVariable(2,k)*getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,+3)*getVariable(7,k);
					break;
				case 1:
					result = 72*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(9,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 2:
					result = 14*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k);
					break;
				case 3:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(9,k)/getVariable(5,k)+getVariable(7,k);
					break;
				case 4:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k);
					break;
				case 5:
					result = 96*Math.pow(10,+2)/getVariable(3,k);
					break;
				case 6:
					result = 96*Math.pow(10,+2)/4*Math.pow(10,-3)*getVariable(3,k)-getVariable(3,k)-getVariable(5,k);
					break;
				case 7:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(1,k)*getVariable(6,k)/getVariable(1,k)+4*Math.pow(10,-3)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(4,k)/22*Math.pow(10,+4)*getVariable(6,k);
					break;
				case 8:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(1,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(6,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(4,k)/getVariable(4,k)/getVariable(6,k)/4*Math.pow(10,+3)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)/getVariable(7,k);
					break;
				case 9:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)+getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)+getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 10:
					result = 96*Math.pow(10,+2)/getVariable(3,k);
					break;
				case 11:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 12:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)/getVariable(7,k)+getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(2,k)+getVariable(3,k)/getVariable(6,k)*getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(7,k)-getVariable(7,k);
					break;
				case 13:
					result = 96*Math.pow(10,+1)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)*4*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(6,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)-getVariable(3,k)/98*Math.pow(10,+8)-getVariable(6,k)/getVariable(1,k)*getVariable(7,k)/34*Math.pow(10,-4)+getVariable(7,k)*getVariable(5,k)-getVariable(6,k);
					break;
				case 14:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(2,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)*getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 15:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 16:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+4*Math.pow(10,-3)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)-getVariable(5,k)/getVariable(2,k)+84*Math.pow(10,-8)*getVariable(9,k)*getVariable(4,k)-getVariable(3,k)-getVariable(6,k)+getVariable(4,k)/getVariable(3,k)*getVariable(3,k)/5*Math.pow(10,+2)/getVariable(2,k)+getVariable(6,k);
					break;
				case 17:
					result = 96*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k);
					break;
				case 18:
					result = 96*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 19:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(4,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(2,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 20:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)-getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)+getVariable(1,k)/getVariable(1,k)+getVariable(4,k)/getVariable(3,k)+getVariable(6,k)+getVariable(1,k)-getVariable(4,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 21:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k);
					break;
				case 22:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)/getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k);
					break;
				case 23:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)+getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k);
					break;
				case 24:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)*getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(3,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(9,k)*4*Math.pow(10,-3)/getVariable(6,k)-8*Math.pow(10,+8)/getVariable(1,k)*getVariable(7,k)/getVariable(7,k)-62*Math.pow(10,-4)-getVariable(9,k)/getVariable(9,k)-getVariable(9,k)/getVariable(2,k);
					break;
				case 25:
					result = 64*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)*getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/4*Math.pow(10,-3)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(4,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 26:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)*getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 27:
					result = 96*Math.pow(10,-2)/getVariable(4,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(5,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 28:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)*getVariable(7,k)/getVariable(5,k)+getVariable(7,k)+getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k);
					break;
				case 29:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(4,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/11*Math.pow(10,-3)*getVariable(7,k)-getVariable(7,k);
					break;
				case 30:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k);
					break;
				case 31:
					result = 66*Math.pow(10,+2)/getVariable(2,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 32:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)/getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 33:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)/getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)*getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 34:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(9,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(4,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)-getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 35:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)+getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k);
					break;
				case 36:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 37:
					result = 95*Math.pow(10,+2)/getVariable(7,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(5,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)*getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 38:
					result = 96*Math.pow(10,+2)*getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(9,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 39:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(9,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 40:
					result = getVariable(3,k);
					break;
				case 41:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)*getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 42:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 43:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 44:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)+getVariable(6,k)-getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 45:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 46:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+4*Math.pow(10,-3)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/51*Math.pow(10,+6)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)-83*Math.pow(10,+9)/getVariable(6,k)*40*Math.pow(10,+9)-getVariable(1,k)/getVariable(7,k)+getVariable(7,k)-72*Math.pow(10,-9)/getVariable(2,k);
					break;
				case 47:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k);
					break;
				case 48:
					result = 94*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(9,k)+getVariable(2,k)/getVariable(3,k);
					break;
				case 49:
					result = 95*Math.pow(10,+2)+getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)*getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate2(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 50:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(6,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)*getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k)*getVariable(7,k)+getVariable(6,k)-getVariable(9,k);
					break;
				case 51:
					result = 96*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)*getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(2,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*6*Math.pow(10,+4)-getVariable(7,k);
					break;
				case 52:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)/getVariable(7,k)+getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(2,k)*getVariable(3,k)/getVariable(6,k)*getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(7,k)-96*Math.pow(10,+2)/getVariable(7,k)*getVariable(1,k);
					break;
				case 53:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(1,k)-getVariable(7,k)+getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)-getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(9,k)/4*Math.pow(10,+3)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k);
					break;
				case 54:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(6,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)*getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)-getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(3,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k);
					break;
				case 55:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)-getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-2)*getVariable(7,k);
					break;
				case 56:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 57:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)/getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/4*Math.pow(10,-3)*getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)+getVariable(4,k)/getVariable(6,k)*getVariable(3,k)-getVariable(6,k)/70*Math.pow(10,+1)-91*Math.pow(10,+8)*getVariable(7,k)/getVariable(7,k)+76*Math.pow(10,-8)/getVariable(2,k)/getVariable(1,k)*getVariable(4,k)/getVariable(3,k)-getVariable(9,k);
					break;
				case 58:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/4*Math.pow(10,-3)/getVariable(4,k);
					break;
				case 59:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 60:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 61:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(2,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)-getVariable(2,k)*getVariable(6,k)/getVariable(6,k)/getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 62:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)/getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)/getVariable(7,k)+getVariable(2,k)*52*Math.pow(10,-3)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(4,k)+getVariable(3,k)/getVariable(7,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 63:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 64:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)+getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)-4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 65:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(1,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 66:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/4*Math.pow(10,-3)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/95*Math.pow(10,-6)*getVariable(7,k);
					break;
				case 67:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)*getVariable(5,k)*getVariable(7,k)+4*Math.pow(10,-3)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(4,k)/72*Math.pow(10,-1)-getVariable(6,k)/getVariable(1,k)*getVariable(7,k)*getVariable(7,k);
					break;
				case 68:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 69:
					result = 96*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 70:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 71:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)*getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+4*Math.pow(10,-3)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/97*Math.pow(10,-2)*getVariable(7,k);
					break;
				case 72:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k);
					break;
				case 73:
					result = getVariable(3,k);
					break;
				case 74:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-83*Math.pow(10,-5)-getVariable(4,k)/getVariable(7,k)+6*Math.pow(10,+8)-getVariable(5,k)/getVariable(7,k)/getVariable(7,k)*getVariable(4,k)+getVariable(5,k)*getVariable(7,k)*getVariable(2,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)+getVariable(9,k)-getVariable(3,k)-getVariable(6,k)/12*Math.pow(10,-8)*getVariable(1,k);
					break;
				case 75:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(9,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/4*Math.pow(10,-3)+getVariable(1,k)/getVariable(9,k)+getVariable(4,k)/getVariable(3,k)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)*71*Math.pow(10,+4)/getVariable(3,k)+88*Math.pow(10,+4)*getVariable(6,k);
					break;
				case 76:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(6,k)+getVariable(7,k)-getVariable(3,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)+getVariable(3,k)*getVariable(6,k)*getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 77:
					result = 96*Math.pow(10,+2)/getVariable(4,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(3,k)/getVariable(7,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+4*Math.pow(10,-3)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-77*Math.pow(10,+3)/getVariable(1,k);
					break;
				case 78:
					result = 95*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k);
					break;
				case 79:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(2,k)-getVariable(5,k)-getVariable(4,k)*getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k)*getVariable(4,k);
					break;
				case 80:
					result = 95*Math.pow(10,+2)/getVariable(3,k)*getVariable(7,k)-getVariable(5,k)-getVariable(4,k);
					break;
				case 81:
					result = 96*Math.pow(10,+2)+getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(9,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 82:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 83:
					result = 95*Math.pow(10,+2)/getVariable(1,k)/getVariable(3,k)*getVariable(5,k)-getVariable(4,k)-getVariable(2,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(2,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 84:
					result = 96*Math.pow(10,+2)+getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k);
					break;
				case 85:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)+getVariable(1,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 86:
					result = 89*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)/getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)-getVariable(6,k)+getVariable(1,k)-getVariable(7,k)/getVariable(7,k);
					break;
				case 87:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)*getVariable(3,k)*getVariable(6,k)/getVariable(1,k)/getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/53*Math.pow(10,+1)*getVariable(7,k)*getVariable(7,k)-getVariable(3,k)+getVariable(2,k);
					break;
				case 88:
					result = 96*Math.pow(10,+9)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)+getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(4,k)/getVariable(9,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 89:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(4,k)*getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k)*71*Math.pow(10,-3)-getVariable(7,k)-getVariable(7,k)/getVariable(3,k)*getVariable(3,k)-getVariable(2,k)+getVariable(1,k);
					break;
				case 90:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(1,k)/getVariable(5,k)*getVariable(5,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)-getVariable(6,k)-20*Math.pow(10,-6)+getVariable(4,k)+getVariable(4,k)+getVariable(9,k)+getVariable(7,k)/63*Math.pow(10,-9)-getVariable(2,k)-getVariable(1,k)-getVariable(2,k)/getVariable(9,k)+82*Math.pow(10,-6)+getVariable(9,k)*getVariable(1,k)*getVariable(1,k)-37*Math.pow(10,+8)-getVariable(2,k)/getVariable(6,k)-getVariable(2,k)-getVariable(2,k)/getVariable(6,k);
					break;
				case 91:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(2,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k);
					break;
				case 92:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)/getVariable(7,k)+getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(2,k)+getVariable(3,k)/getVariable(6,k)*getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(7,k)-96*Math.pow(10,+2)/getVariable(7,k)*4*Math.pow(10,-3)-getVariable(3,k)-getVariable(4,k)*getVariable(9,k)+getVariable(9,k);
					break;
				case 93:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)/getVariable(4,k)-getVariable(7,k)/getVariable(1,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+4*Math.pow(10,-3)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k);
					break;
				case 94:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-4*Math.pow(10,-3)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*28*Math.pow(10,-1)+getVariable(5,k)/getVariable(7,k)*getVariable(2,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(4,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)*getVariable(7,k);
					break;
				case 95:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 96:
					result = getVariable(3,k);
					break;
				case 97:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(1,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 98:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)*getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(9,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k)*getVariable(7,k)*getVariable(3,k);
					break;
				case 99:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)+getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate3(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 100:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(1,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k);
					break;
				case 101:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-91*Math.pow(10,-9)*getVariable(1,k)*getVariable(7,k);
					break;
				case 102:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 103:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(4,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)/getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 104:
					result = 95*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k);
					break;
				case 105:
					result = getVariable(3,k);
					break;
				case 106:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 107:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)/getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-2)*getVariable(7,k);
					break;
				case 108:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)/getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)*getVariable(7,k);
					break;
				case 109:
					result = 95*Math.pow(10,+2)/getVariable(7,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 110:
					result = 96*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k)-getVariable(1,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(1,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)*getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*60*Math.pow(10,+9)*getVariable(7,k);
					break;
				case 111:
					result = 95*Math.pow(10,+2)/getVariable(3,k);
					break;
				case 112:
					result = 95*Math.pow(10,+2)/getVariable(3,k)-getVariable(2,k)-getVariable(5,k)-getVariable(4,k)-getVariable(6,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 113:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)/getVariable(7,k)+getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(2,k)+getVariable(3,k)/getVariable(6,k)/getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/95*Math.pow(10,+2)-getVariable(7,k)/getVariable(7,k);
					break;
				case 114:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(7,k)/getVariable(5,k)*getVariable(7,k)+getVariable(7,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(4,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 115:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 116:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(9,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k);
					break;
				case 117:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)+getVariable(7,k)+getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(2,k)+95*Math.pow(10,+2)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 118:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)*getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(7,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k);
					break;
				case 119:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(2,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(3,k)-getVariable(7,k)*getVariable(4,k)/getVariable(5,k)*getVariable(9,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+2*Math.pow(10,-3)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)/getVariable(7,k);
					break;
				case 120:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)+getVariable(5,k)+getVariable(7,k)-getVariable(2,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)+getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+4*Math.pow(10,-3)/getVariable(6,k)-getVariable(3,k)/getVariable(7,k)*93*Math.pow(10,+3)*getVariable(7,k);
					break;
				case 121:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)*getVariable(7,k)-getVariable(7,k)/getVariable(7,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 122:
					result = 96*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k);
					break;
				case 123:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)*getVariable(5,k)/getVariable(7,k)+getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(2,k)+getVariable(3,k)/getVariable(6,k)*getVariable(1,k)/getVariable(9,k)+getVariable(4,k)/getVariable(4,k)+getVariable(1,k)/getVariable(7,k)-95*Math.pow(10,+2)/getVariable(7,k)*4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 124:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(4,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 125:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(3,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)/getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 126:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)+getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(4,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k)*getVariable(7,k)*getVariable(9,k)-getVariable(9,k)+getVariable(9,k)*getVariable(9,k)-getVariable(4,k)/getVariable(1,k)*32*Math.pow(10,-4)-getVariable(4,k);
					break;
				case 127:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(1,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(9,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)+getVariable(4,k)/getVariable(3,k)+getVariable(6,k);
					break;
				case 128:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)+getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(4,k)-getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 129:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(9,k)/getVariable(3,k)*getVariable(6,k)*getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k);
					break;
				case 130:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k);
					break;
				case 131:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(7,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(1,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k);
					break;
				case 132:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)+getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(5,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)+getVariable(1,k)+getVariable(6,k)/getVariable(7,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 133:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(2,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)+getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k)*getVariable(7,k);
					break;
				case 134:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(7,k)+4*Math.pow(10,-3)/getVariable(6,k)-getVariable(1,k)/78*Math.pow(10,-9)*getVariable(7,k)*22*Math.pow(10,-1)+getVariable(7,k)-getVariable(6,k)*getVariable(6,k)/getVariable(6,k)-getVariable(4,k);
					break;
				case 135:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(1,k)*getVariable(4,k)/getVariable(5,k)*getVariable(7,k)/getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+4*Math.pow(10,-3)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k);
					break;
				case 136:
					result = 96*Math.pow(10,+4)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)+getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(2,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)*getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)-getVariable(4,k)/getVariable(1,k);
					break;
				case 137:
					result = 96*Math.pow(10,+2)/getVariable(2,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(1,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)*getVariable(1,k)+getVariable(6,k)*getVariable(7,k)+getVariable(6,k)/getVariable(1,k)*getVariable(7,k)/getVariable(7,k);
					break;
				case 138:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)*getVariable(5,k)*getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)*getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k);
					break;
				case 139:
					result = 96*Math.pow(10,+6)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 140:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)/getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)/getVariable(7,k)/getVariable(3,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)*62*Math.pow(10,-4)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)*getVariable(7,k)+getVariable(7,k);
					break;
				case 141:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(1,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)/getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 142:
					result = 96*Math.pow(10,+2)/getVariable(3,k)*getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 143:
					result = 38*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)/getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(9,k)+getVariable(6,k)/getVariable(1,k);
					break;
				case 144:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)*getVariable(7,k)*getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)/4*Math.pow(10,-5)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 145:
					result = 95*Math.pow(10,+2)+4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k);
					break;
				case 146:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)+getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 147:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)+getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k);
					break;
				case 148:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)*getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 149:
					result = 95*Math.pow(10,+2)*getVariable(3,k)*getVariable(3,k)-getVariable(6,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/4*Math.pow(10,-3)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate4(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 150:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k)/71*Math.pow(10,-6)+getVariable(7,k)-getVariable(5,k)/getVariable(7,k)/getVariable(7,k)*getVariable(4,k)+getVariable(5,k)/getVariable(7,k)*getVariable(2,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)+getVariable(9,k)*getVariable(4,k)+40*Math.pow(10,+2)/getVariable(6,k)*51*Math.pow(10,-6)*getVariable(1,k);
					break;
				case 151:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(2,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)+getVariable(7,k);
					break;
				case 152:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(9,k)-getVariable(5,k)*getVariable(7,k)*getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(1,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 153:
					result = 96*Math.pow(10,+2)/getVariable(6,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)-getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 154:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k);
					break;
				case 155:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(6,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(1,k)/getVariable(7,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/48*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 156:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)*getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(4,k);
					break;
				case 157:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 158:
					result = 5*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 159:
					result = 95*Math.pow(10,+8)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)+getVariable(4,k)/getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/4*Math.pow(10,-3)*getVariable(3,k)/getVariable(7,k)+getVariable(1,k)/getVariable(9,k)+getVariable(6,k)/getVariable(6,k)-getVariable(1,k)/getVariable(4,k);
					break;
				case 160:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(2,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 161:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(3,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(1,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 162:
					result = getVariable(3,k)/getVariable(3,k);
					break;
				case 163:
					result = 96*Math.pow(10,+2)+getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/4*Math.pow(10,-3)*getVariable(3,k)/getVariable(1,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 164:
					result = 96*Math.pow(10,+2)/getVariable(6,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,+3)*getVariable(7,k);
					break;
				case 165:
					result = 95*Math.pow(10,+3)-getVariable(3,k)/4*Math.pow(10,-3)-getVariable(3,k)-getVariable(5,k)-getVariable(4,k)/getVariable(4,k)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)+getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/23*Math.pow(10,+2)-getVariable(6,k)/75*Math.pow(10,+3)*31*Math.pow(10,-3)/89*Math.pow(10,-4)/getVariable(1,k)*getVariable(7,k)+getVariable(7,k)-getVariable(9,k)*getVariable(9,k)-89*Math.pow(10,-8)/getVariable(4,k)+getVariable(6,k)+getVariable(6,k)*getVariable(9,k)-getVariable(1,k);
					break;
				case 166:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k);
					break;
				case 167:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)*getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)+getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(3,k)/getVariable(1,k)+getVariable(9,k)-getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 168:
					result = 95*Math.pow(10,+9)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k);
					break;
				case 169:
					result = 95*Math.pow(10,+2)/getVariable(1,k)*getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/4*Math.pow(10,-3)+getVariable(5,k)-getVariable(7,k)/97*Math.pow(10,-3)/getVariable(7,k)*getVariable(4,k)+getVariable(5,k)/getVariable(7,k)-getVariable(2,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/69*Math.pow(10,+6)+getVariable(3,k)/getVariable(6,k)*getVariable(1,k)*46*Math.pow(10,+8)*getVariable(7,k)*getVariable(2,k);
					break;
				case 170:
					result = getVariable(3,k);
					break;
				case 171:
					result = 96*Math.pow(10,+2)/getVariable(3,k)-getVariable(3,k)-getVariable(9,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(9,k)/getVariable(1,k)+getVariable(9,k)-getVariable(3,k)+4*Math.pow(10,-3)/getVariable(6,k)-getVariable(4,k)/getVariable(7,k)*getVariable(7,k)+40*Math.pow(10,-9)*20*Math.pow(10,-6)-getVariable(4,k)/getVariable(1,k);
					break;
				case 172:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)/getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 173:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(2,k)/getVariable(5,k)+getVariable(7,k)+getVariable(7,k);
					break;
				case 174:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 175:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(9,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k);
					break;
				case 176:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 177:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 178:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)+getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+4*Math.pow(10,-3)/getVariable(6,k)-getVariable(1,k)/27*Math.pow(10,+3)*72*Math.pow(10,-5)*getVariable(7,k)/getVariable(7,k)/getVariable(2,k)/getVariable(6,k)/getVariable(9,k);
					break;
				case 179:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(3,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/4*Math.pow(10,-3)*getVariable(3,k)/getVariable(1,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-52*Math.pow(10,+5)/getVariable(1,k)*68*Math.pow(10,+6)*getVariable(7,k)-getVariable(7,k);
					break;
				case 180:
					result = 95*Math.pow(10,+9)/getVariable(3,k)/getVariable(6,k)-getVariable(5,k);
					break;
				case 181:
					result = 95*Math.pow(10,+2)/getVariable(7,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)+getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(1,k);
					break;
				case 182:
					result = 95*Math.pow(10,-2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(6,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/88*Math.pow(10,+6)+getVariable(9,k)/53*Math.pow(10,-5)-getVariable(3,k)/getVariable(6,k)*getVariable(1,k)-getVariable(7,k)-getVariable(7,k)/getVariable(3,k)-getVariable(6,k)+6*Math.pow(10,+8)-getVariable(6,k);
					break;
				case 183:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(6,k)/getVariable(6,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+4*Math.pow(10,-3)/getVariable(9,k)+getVariable(4,k)/getVariable(6,k)-getVariable(1,k)/8*Math.pow(10,-6)+getVariable(7,k);
					break;
				case 184:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(6,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)-getVariable(9,k)/getVariable(3,k)+4*Math.pow(10,-3)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*47*Math.pow(10,+1)-getVariable(7,k);
					break;
				case 185:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)*getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 186:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(4,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 187:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(9,k)-4*Math.pow(10,-3)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k);
					break;
				case 188:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(3,k)-getVariable(7,k)-getVariable(5,k)/getVariable(7,k)+getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(2,k)+getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(7,k)-96*Math.pow(10,+2)/getVariable(7,k)*4*Math.pow(10,-3)/getVariable(6,k);
					break;
				case 189:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(4,k)/getVariable(3,k)+4*Math.pow(10,-3)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)*getVariable(4,k);
					break;
				case 190:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(7,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)/getVariable(7,k)/53*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 191:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)*getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)+getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-9)*getVariable(7,k);
					break;
				case 192:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(9,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(9,k)/getVariable(1,k)+getVariable(6,k)/getVariable(6,k)+getVariable(6,k)/getVariable(6,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 193:
					result = 7*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(4,k)-getVariable(4,k)-getVariable(7,k)/getVariable(1,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(2,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(7,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,+3)/getVariable(7,k);
					break;
				case 194:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(9,k)-getVariable(7,k);
					break;
				case 195:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(9,k)+getVariable(7,k)-4*Math.pow(10,+3)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k);
					break;
				case 196:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(7,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(7,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 197:
					result = getVariable(3,k);
					break;
				case 198:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 199:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)*getVariable(5,k)+4*Math.pow(10,-3)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(9,k)+37*Math.pow(10,+8)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)*getVariable(7,k)/86*Math.pow(10,+8)+getVariable(7,k)/getVariable(1,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate5(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 200:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(6,k)-getVariable(5,k)-getVariable(4,k)-getVariable(6,k)/getVariable(9,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(3,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(4,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 201:
					result = 96*Math.pow(10,+2)/getVariable(3,k)+getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 202:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 203:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 204:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(1,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(4,k)/4*Math.pow(10,-3)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k);
					break;
				case 205:
					result = 19*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 206:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 207:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(7,k)/getVariable(3,k)*getVariable(6,k)/getVariable(7,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-8)/getVariable(7,k);
					break;
				case 208:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 209:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(3,k)-getVariable(4,k)-getVariable(2,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)-getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 210:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k);
					break;
				case 211:
					result = 96*Math.pow(10,+2)/getVariable(3,k)*getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)/getVariable(6,k)/getVariable(7,k)-getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k);
					break;
				case 212:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/4*Math.pow(10,-3)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(1,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)-getVariable(9,k)+getVariable(4,k)/getVariable(6,k)-7*Math.pow(10,-1)/getVariable(1,k)*getVariable(7,k);
					break;
				case 213:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/4*Math.pow(10,-3)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/26*Math.pow(10,+9)-getVariable(6,k)+getVariable(1,k)*getVariable(7,k)*getVariable(7,k)*getVariable(9,k)*getVariable(3,k)*71*Math.pow(10,-6)-getVariable(2,k)-getVariable(2,k)*2*Math.pow(10,-2)*61*Math.pow(10,+3)-getVariable(2,k);
					break;
				case 214:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(6,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,+3)-getVariable(7,k);
					break;
				case 215:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)+getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)-getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 216:
					result = 76*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)-getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 217:
					result = 96*Math.pow(10,+8)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 218:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)/getVariable(7,k)/getVariable(4,k)*getVariable(7,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(4,k)+getVariable(3,k)/getVariable(6,k)-86*Math.pow(10,+4)/getVariable(1,k)*23*Math.pow(10,+2)-getVariable(7,k)*getVariable(7,k);
					break;
				case 219:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)*getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k)*60*Math.pow(10,-3)-getVariable(7,k)/getVariable(2,k)-getVariable(4,k)-getVariable(1,k)+13*Math.pow(10,+2)-getVariable(9,k)*getVariable(6,k)*getVariable(7,k)*19*Math.pow(10,+2)+getVariable(7,k)-getVariable(2,k)+getVariable(9,k)*getVariable(3,k)-getVariable(1,k)/getVariable(2,k);
					break;
				case 220:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(9,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k);
					break;
				case 221:
					result = 95*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k);
					break;
				case 222:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)+getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 223:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 224:
					result = getVariable(3,k)/getVariable(3,k);
					break;
				case 225:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(7,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k);
					break;
				case 226:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k)*70*Math.pow(10,+8)*54*Math.pow(10,-3)/getVariable(7,k)+getVariable(9,k);
					break;
				case 227:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)*getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)*getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-2)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)+getVariable(6,k)/getVariable(2,k);
					break;
				case 228:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k)*getVariable(2,k)/getVariable(7,k)+getVariable(6,k);
					break;
				case 229:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(6,k)*getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k);
					break;
				case 230:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)-getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 231:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)*getVariable(6,k)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 232:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k);
					break;
				case 233:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(6,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)+getVariable(3,k)*getVariable(6,k);
					break;
				case 234:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)+getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(2,k)/4*Math.pow(10,-3)*getVariable(9,k);
					break;
				case 235:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)/getVariable(7,k)+96*Math.pow(10,+2)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+4*Math.pow(10,-3)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*8*Math.pow(10,+4)+getVariable(7,k);
					break;
				case 236:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(1,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(2,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 237:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)*getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(7,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 238:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k);
					break;
				case 239:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k);
					break;
				case 240:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 241:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(4,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-1)*getVariable(7,k);
					break;
				case 242:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)/getVariable(7,k)+getVariable(1,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(2,k)+getVariable(3,k)/getVariable(6,k)*getVariable(1,k)/95*Math.pow(10,+2)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 243:
					result = 95*Math.pow(10,+3)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 244:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(9,k)-getVariable(4,k);
					break;
				case 245:
					result = 96*Math.pow(10,+2)/4*Math.pow(10,-3)+getVariable(3,k);
					break;
				case 246:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(4,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 247:
					result = 96*Math.pow(10,+6)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)+getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 248:
					result = 95*Math.pow(10,+2)/getVariable(3,k)+getVariable(2,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(2,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k);
					break;
				case 249:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate6(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 250:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)*getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 251:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(9,k);
					break;
				case 252:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(1,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(4,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)-getVariable(1,k)-getVariable(7,k);
					break;
				case 253:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)/getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)+getVariable(4,k)/getVariable(5,k)+getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(4,k)/getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-3*Math.pow(10,-3)/getVariable(7,k)*getVariable(7,k);
					break;
				case 254:
					result = 95*Math.pow(10,+2)/getVariable(3,k);
					break;
				case 255:
					result = 96*Math.pow(10,+2)/getVariable(3,k)*getVariable(3,k)-getVariable(4,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)*getVariable(5,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(9,k)+getVariable(9,k)/getVariable(9,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,+3)*getVariable(7,k);
					break;
				case 256:
					result = 96*Math.pow(10,+2)-getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(2,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)-getVariable(7,k);
					break;
				case 257:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(2,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)/getVariable(9,k)-getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 258:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(9,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(2,k)+getVariable(9,k)/getVariable(1,k)+getVariable(6,k)/getVariable(1,k)-getVariable(6,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 259:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)*getVariable(2,k)/getVariable(3,k)*getVariable(6,k)*getVariable(1,k)+getVariable(4,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 260:
					result = 95*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(4,k)/11*Math.pow(10,+9)-getVariable(6,k)/getVariable(1,k)*getVariable(7,k)-getVariable(7,k);
					break;
				case 261:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)/getVariable(4,k)/getVariable(7,k)-getVariable(5,k)/getVariable(7,k)+getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(7,k)+getVariable(3,k)/getVariable(6,k)*getVariable(1,k)/96*Math.pow(10,+2)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)/getVariable(4,k)*getVariable(3,k);
					break;
				case 262:
					result = 95*Math.pow(10,+2)+getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 263:
					result = 96*Math.pow(10,+2)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(3,k)/getVariable(5,k)+getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 264:
					result = 87*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)-getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k)*getVariable(7,k);
					break;
				case 265:
					result = 96*Math.pow(10,+2)-getVariable(9,k)/getVariable(6,k)-getVariable(5,k)-getVariable(4,k)/getVariable(7,k)/getVariable(5,k)+getVariable(4,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 266:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 267:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)-getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)-getVariable(7,k);
					break;
				case 268:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)*getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 269:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)+getVariable(7,k)*getVariable(9,k)/getVariable(4,k)/getVariable(5,k)*getVariable(9,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 270:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(2,k)*getVariable(6,k)/getVariable(1,k)+4*Math.pow(10,-3)/getVariable(9,k)+53*Math.pow(10,+6)/getVariable(1,k)-getVariable(6,k)/getVariable(1,k)*getVariable(7,k)/getVariable(7,k)*getVariable(3,k)-getVariable(7,k)/getVariable(4,k)*getVariable(2,k);
					break;
				case 271:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)*getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 272:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,+3)/getVariable(7,k)*getVariable(7,k);
					break;
				case 273:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)/getVariable(4,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 274:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)+getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 275:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k);
					break;
				case 276:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-9)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/17*Math.pow(10,+2)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)-getVariable(6,k)/25*Math.pow(10,-6)*getVariable(1,k);
					break;
				case 277:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)+getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)*getVariable(2,k)/getVariable(6,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(6,k);
					break;
				case 278:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(2,k)*getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(2,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(6,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 279:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)+getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(1,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 280:
					result = 95*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(3,k)-getVariable(4,k)/getVariable(7,k);
					break;
				case 281:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)-getVariable(7,k)/80*Math.pow(10,-6)*getVariable(2,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)-66*Math.pow(10,-3)/getVariable(6,k)*39*Math.pow(10,-1)-getVariable(1,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 282:
					result = 61*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k);
					break;
				case 283:
					result = 96*Math.pow(10,+2)/getVariable(3,k);
					break;
				case 284:
					result = 96*Math.pow(10,+2)/getVariable(7,k)/getVariable(3,k)+getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(4,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(7,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 285:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-92*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(7,k);
					break;
				case 286:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(9,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/4*Math.pow(10,-3)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)/getVariable(1,k)/getVariable(9,k)+getVariable(4,k)/getVariable(6,k)-getVariable(1,k)/19*Math.pow(10,-9)+getVariable(7,k);
					break;
				case 287:
					result = 96*Math.pow(10,+6)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)+getVariable(7,k)/getVariable(4,k)/4*Math.pow(10,-1)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(4,k)/9*Math.pow(10,+5)-getVariable(6,k)/getVariable(1,k);
					break;
				case 288:
					result = 95*Math.pow(10,-2)-getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)-getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(3,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/27*Math.pow(10,+8)*getVariable(7,k)-getVariable(7,k);
					break;
				case 289:
					result = 95*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-23*Math.pow(10,-6)-getVariable(3,k);
					break;
				case 290:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)+getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k)*getVariable(7,k);
					break;
				case 291:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(1,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 292:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k);
					break;
				case 293:
					result = 96*Math.pow(10,+2)+getVariable(3,k)/getVariable(5,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)-getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(7,k)*getVariable(6,k)/getVariable(1,k)+getVariable(4,k)*getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 294:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)*getVariable(2,k)/getVariable(3,k)*getVariable(6,k)*getVariable(1,k)+getVariable(9,k)/getVariable(1,k)+getVariable(6,k)+getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 295:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/4*Math.pow(10,-3)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)*getVariable(1,k)-getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-73*Math.pow(10,+6)/getVariable(1,k)-getVariable(7,k);
					break;
				case 296:
					result = 96*Math.pow(10,+2)*getVariable(3,k);
					break;
				case 297:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(2,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 298:
					result = 95*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k);
					break;
				case 299:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(7,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)*getVariable(7,k)/getVariable(3,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate7(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 300:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)*getVariable(2,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,+3)*getVariable(7,k);
					break;
				case 301:
					result = 96*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)-getVariable(4,k)/getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(6,k)+4*Math.pow(10,+6)/getVariable(7,k)-getVariable(6,k)/getVariable(1,k)*getVariable(4,k);
					break;
				case 302:
					result = 96*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(2,k);
					break;
				case 303:
					result = 96*Math.pow(10,+2)+getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 304:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)+getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k)*getVariable(7,k)+getVariable(6,k)/getVariable(5,k);
					break;
				case 305:
					result = 89*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)-getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 306:
					result = 96*Math.pow(10,+2)/4*Math.pow(10,+3)/getVariable(3,k);
					break;
				case 307:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)*getVariable(4,k)/getVariable(5,k)*getVariable(1,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)*getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 308:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(4,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)*getVariable(7,k)/getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(3,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-2)*getVariable(7,k);
					break;
				case 309:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(3,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)+getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k);
					break;
				case 310:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 311:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(7,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 312:
					result = 96*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(2,k)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k)/4*Math.pow(10,+9)/getVariable(7,k)*getVariable(4,k)+getVariable(5,k)/getVariable(7,k)*getVariable(2,k)/getVariable(3,k)/getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)*getVariable(7,k);
					break;
				case 313:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)/getVariable(7,k)/getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(2,k)+getVariable(3,k)/getVariable(6,k)*getVariable(1,k)/96*Math.pow(10,+2)+getVariable(4,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k)*getVariable(7,k);
					break;
				case 314:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)+getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)-getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k)*60*Math.pow(10,+6)-getVariable(1,k)*52*Math.pow(10,+1)+getVariable(2,k)*53*Math.pow(10,+4)*getVariable(1,k)/getVariable(7,k)+getVariable(1,k)*getVariable(7,k)*getVariable(1,k)*getVariable(5,k)/getVariable(4,k)*getVariable(2,k)*getVariable(4,k);
					break;
				case 315:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 316:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)/getVariable(4,k)-getVariable(7,k)/getVariable(5,k);
					break;
				case 317:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(1,k)/getVariable(4,k)+getVariable(5,k)-getVariable(7,k);
					break;
				case 318:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k);
					break;
				case 319:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)/getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k);
					break;
				case 320:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(6,k);
					break;
				case 321:
					result = 95*Math.pow(10,+2)-getVariable(3,k)/getVariable(3,k)-getVariable(1,k)-getVariable(4,k);
					break;
				case 322:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(1,k)+getVariable(7,k)-getVariable(1,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 323:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)*getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(7,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k);
					break;
				case 324:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)+getVariable(7,k)/getVariable(4,k)/getVariable(3,k)*getVariable(7,k)+getVariable(2,k)/getVariable(1,k)*getVariable(6,k)/getVariable(1,k)+4*Math.pow(10,-3)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/96*Math.pow(10,+2)*getVariable(7,k);
					break;
				case 325:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)*getVariable(7,k)/getVariable(9,k)+getVariable(2,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(5,k)+getVariable(2,k)*getVariable(3,k)*getVariable(6,k)/getVariable(3,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 326:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(1,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(1,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)-4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 327:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k);
					break;
				case 328:
					result = 95*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k);
					break;
				case 329:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 330:
					result = 96*Math.pow(10,+8)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 331:
					result = 96*Math.pow(10,+3)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)+getVariable(7,k)+getVariable(6,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k);
					break;
				case 332:
					result = 95*Math.pow(10,+6)/getVariable(9,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 333:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)/getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)/getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 334:
					result = 96*Math.pow(10,+4)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(2,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)/getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(9,k)+getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 335:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)+getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(7,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 336:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(7,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k);
					break;
				case 337:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 338:
					result = getVariable(3,k);
					break;
				case 339:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 340:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(2,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 341:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(3,k)/getVariable(1,k)-4*Math.pow(10,-4)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/73*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 342:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(9,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)+getVariable(7,k)-getVariable(3,k)-getVariable(3,k)*44*Math.pow(10,-8)+getVariable(1,k);
					break;
				case 343:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(4,k)+getVariable(3,k)/getVariable(6,k)-52*Math.pow(10,-8)/getVariable(1,k)*getVariable(6,k);
					break;
				case 344:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)*getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(6,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k);
					break;
				case 345:
					result = 96*Math.pow(10,+2)-getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(4,k)/getVariable(3,k)+getVariable(3,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k)*getVariable(7,k);
					break;
				case 346:
					result = 96*Math.pow(10,+9)/getVariable(3,k)/getVariable(9,k)-getVariable(5,k)-getVariable(4,k)/getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(7,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(4,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 347:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)*getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(7,k)-getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)-getVariable(7,k);
					break;
				case 348:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k);
					break;
				case 349:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/4*Math.pow(10,-3)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(6,k)+getVariable(7,k)/getVariable(6,k)-getVariable(1,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate8(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 350:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(2,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 351:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)-getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/2*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k);
					break;
				case 352:
					result = 96*Math.pow(10,+2)/getVariable(3,k)+getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(2,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)/getVariable(2,k)/getVariable(3,k);
					break;
				case 353:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 354:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(9,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(3,k)*getVariable(7,k)+getVariable(2,k)/getVariable(9,k)*getVariable(6,k)+getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 355:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)/getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/4*Math.pow(10,-3)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-3*Math.pow(10,-8)/getVariable(1,k)*getVariable(7,k)*7*Math.pow(10,+9)/getVariable(7,k);
					break;
				case 356:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)*getVariable(9,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 357:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/43*Math.pow(10,+9)-getVariable(6,k)/76*Math.pow(10,-5)*79*Math.pow(10,+4)-getVariable(1,k)-getVariable(7,k)/getVariable(7,k)*getVariable(2,k)*48*Math.pow(10,-8)*getVariable(3,k);
					break;
				case 358:
					result = 96*Math.pow(10,+8)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(6,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(6,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 359:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+4*Math.pow(10,-3)-getVariable(7,k)/getVariable(7,k)*getVariable(9,k)*getVariable(5,k)+getVariable(7,k)/45*Math.pow(10,+1)*getVariable(2,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)-getVariable(6,k);
					break;
				case 360:
					result = 41*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 361:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(4,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(9,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 362:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k);
					break;
				case 363:
					result = 96*Math.pow(10,-2)/getVariable(3,k)/getVariable(7,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)/getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/28*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 364:
					result = 95*Math.pow(10,+2)/getVariable(6,k)/getVariable(3,k)-getVariable(5,k)*getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(9,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 365:
					result = 95*Math.pow(10,+4)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)+getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,+3)*getVariable(7,k);
					break;
				case 366:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)/getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k);
					break;
				case 367:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(2,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)+getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/4*Math.pow(10,-3)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(4,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 368:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(1,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)*getVariable(1,k)+getVariable(9,k)-getVariable(3,k)+getVariable(6,k)/getVariable(3,k)-getVariable(7,k)/getVariable(7,k);
					break;
				case 369:
					result = 96*Math.pow(10,+2)*getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k);
					break;
				case 370:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k);
					break;
				case 371:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)+getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+4*Math.pow(10,-3)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)*getVariable(7,k)*getVariable(3,k)-getVariable(6,k)*14*Math.pow(10,-3)/56*Math.pow(10,+1)-getVariable(3,k)/getVariable(2,k)/28*Math.pow(10,+9)+getVariable(7,k);
					break;
				case 372:
					result = 96*Math.pow(10,+2)/getVariable(2,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+4*Math.pow(10,-3)/getVariable(4,k)+getVariable(3,k)+getVariable(6,k)-getVariable(1,k)/36*Math.pow(10,+1)*getVariable(7,k);
					break;
				case 373:
					result = 96*Math.pow(10,+2)-getVariable(3,k)/getVariable(3,k)-getVariable(7,k)-getVariable(4,k)-getVariable(7,k)*getVariable(5,k)+getVariable(7,k)-getVariable(7,k)*getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(7,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 374:
					result = 95*Math.pow(10,+2)-getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(2,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)+4*Math.pow(10,-3)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/50*Math.pow(10,-1)*getVariable(7,k);
					break;
				case 375:
					result = 32*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)-getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)+getVariable(1,k);
					break;
				case 376:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(9,k)-getVariable(5,k)-getVariable(4,k)*getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 377:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)+getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/26*Math.pow(10,+1)*getVariable(7,k);
					break;
				case 378:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/4*Math.pow(10,-3)*82*Math.pow(10,+2)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)+getVariable(4,k)-getVariable(6,k)/3*Math.pow(10,-9)*getVariable(1,k);
					break;
				case 379:
					result = 96*Math.pow(10,+2)+getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)*getVariable(7,k)-getVariable(7,k)*getVariable(4,k)/getVariable(5,k)*getVariable(6,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 380:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(3,k)+getVariable(9,k)/4*Math.pow(10,-3)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k);
					break;
				case 381:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(6,k)+getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)*getVariable(7,k)+getVariable(4,k)/getVariable(5,k)*getVariable(7,k)*getVariable(2,k)/getVariable(3,k)*getVariable(6,k)*getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 382:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/4*Math.pow(10,-3)*getVariable(5,k)+getVariable(7,k)*getVariable(2,k)*getVariable(3,k)/26*Math.pow(10,+1)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)-getVariable(6,k)/28*Math.pow(10,+8)*getVariable(1,k);
					break;
				case 383:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(6,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)/getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)*4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 384:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(9,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(5,k)-getVariable(7,k)/getVariable(3,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(2,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k)*41*Math.pow(10,-1)/getVariable(7,k)+getVariable(7,k);
					break;
				case 385:
					result = 96*Math.pow(10,+2)*getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)-getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)-getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)-getVariable(7,k);
					break;
				case 386:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(5,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 387:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)+getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(1,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 388:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k)*getVariable(2,k);
					break;
				case 389:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(3,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(9,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(4,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)*getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k)*getVariable(7,k);
					break;
				case 390:
					result = 95*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k);
					break;
				case 391:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 392:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(9,k)*getVariable(6,k)/getVariable(1,k)*getVariable(4,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(3,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 393:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(9,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)+getVariable(7,k)-getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 394:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(1,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(1,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(1,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 395:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)/getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)*getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 396:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)-getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 397:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(6,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(5,k)/getVariable(1,k)+getVariable(6,k)/getVariable(7,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 398:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)/getVariable(7,k)+getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(4,k)+getVariable(3,k)/getVariable(6,k)*getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/95*Math.pow(10,+2)-getVariable(7,k)/getVariable(7,k);
					break;
				case 399:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(9,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)*getVariable(4,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(1,k)+getVariable(7,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate9(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 400:
					result = 95*Math.pow(10,+2)*getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k);
					break;
				case 401:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+4*Math.pow(10,-3)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(3,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/92*Math.pow(10,+9)*getVariable(7,k);
					break;
				case 402:
					result = 96*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 403:
					result = 95*Math.pow(10,+2)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/4*Math.pow(10,-3)+getVariable(5,k)-52*Math.pow(10,-3)/getVariable(7,k)/getVariable(7,k)*getVariable(4,k)+getVariable(5,k)/getVariable(7,k)*getVariable(2,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k);
					break;
				case 404:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 405:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/4*Math.pow(10,+3)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)-getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-95*Math.pow(10,-9)/getVariable(1,k)*getVariable(7,k)*getVariable(7,k);
					break;
				case 406:
					result = 96*Math.pow(10,+2)/getVariable(3,k);
					break;
				case 407:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k);
					break;
				case 408:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(1,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+4*Math.pow(10,-3)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)*getVariable(1,k);
					break;
				case 409:
					result = 95*Math.pow(10,+6)/getVariable(3,k)/getVariable(3,k)-getVariable(3,k)-getVariable(7,k)-getVariable(6,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(6,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(3,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 410:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 411:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)-getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)+getVariable(7,k)+getVariable(6,k)/getVariable(1,k);
					break;
				case 412:
					result = 96*Math.pow(10,+2)+getVariable(3,k)/getVariable(3,k)-getVariable(5,k)+getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(9,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 413:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(3,k)/getVariable(4,k)-getVariable(7,k)/4*Math.pow(10,-3)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k);
					break;
				case 414:
					result = 95*Math.pow(10,+2)/getVariable(3,k);
					break;
				case 415:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k);
					break;
				case 416:
					result = 95*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)+getVariable(7,k)/getVariable(7,k)/10*Math.pow(10,+2)*getVariable(4,k)+getVariable(5,k)/getVariable(1,k)*getVariable(2,k)/getVariable(6,k)+getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)-82*Math.pow(10,+8)+getVariable(6,k)*86*Math.pow(10,+3)/getVariable(1,k);
					break;
				case 417:
					result = 95*Math.pow(10,+2)/getVariable(2,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(4,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*4*Math.pow(10,-3)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k);
					break;
				case 418:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(1,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(1,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 419:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k);
					break;
				case 420:
					result = 96*Math.pow(10,+8)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(2,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 421:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k)*getVariable(9,k)/getVariable(3,k);
					break;
				case 422:
					result = getVariable(3,k);
					break;
				case 423:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)+getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 424:
					result = 95*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k)-getVariable(3,k)-72*Math.pow(10,-2)-getVariable(5,k)/getVariable(7,k)+getVariable(7,k)-getVariable(5,k)/getVariable(7,k)/getVariable(7,k)*getVariable(4,k)+getVariable(5,k)/getVariable(7,k)*getVariable(2,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+55*Math.pow(10,+4)/getVariable(9,k)-getVariable(3,k)/getVariable(6,k)*25*Math.pow(10,-9)/getVariable(1,k);
					break;
				case 425:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)*getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(6,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(6,k)-4*Math.pow(10,-3)/getVariable(7,k);
					break;
				case 426:
					result = 96*Math.pow(10,+2)/getVariable(3,k)-getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k);
					break;
				case 427:
					result = 96*Math.pow(10,+5)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(4,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(7,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 428:
					result = 41*Math.pow(10,+2)/4*Math.pow(10,-3)/getVariable(3,k);
					break;
				case 429:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(1,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 430:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(9,k);
					break;
				case 431:
					result = 96*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(2,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/4*Math.pow(10,-3)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-16*Math.pow(10,+8)/getVariable(1,k)*getVariable(7,k);
					break;
				case 432:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 433:
					result = 96*Math.pow(10,+2)/getVariable(2,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k);
					break;
				case 434:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k)-getVariable(7,k)+getVariable(5,k);
					break;
				case 435:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)-getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 436:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)*getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 437:
					result = 61*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-8)*getVariable(5,k);
					break;
				case 438:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)*getVariable(7,k)-4*Math.pow(10,-3)*getVariable(7,k)/getVariable(4,k)-getVariable(5,k)+getVariable(7,k)/getVariable(2,k)+getVariable(3,k)/getVariable(6,k)+getVariable(6,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/54*Math.pow(10,-9)*getVariable(7,k);
					break;
				case 439:
					result = 2*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k);
					break;
				case 440:
					result = 96*Math.pow(10,+2)/getVariable(3,k);
					break;
				case 441:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)*getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/4*Math.pow(10,-3)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/31*Math.pow(10,+8)*getVariable(7,k);
					break;
				case 442:
					result = 31*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)-getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 443:
					result = 96*Math.pow(10,+2)-4*Math.pow(10,-3)/getVariable(3,k)-7*Math.pow(10,+2)-getVariable(3,k);
					break;
				case 444:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)*getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(4,k)+getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 445:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(1,k)+getVariable(7,k)-4*Math.pow(10,-3)-getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(4,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 446:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(4,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)*getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-4*Math.pow(10,+3)/getVariable(7,k);
					break;
				case 447:
					result = 95*Math.pow(10,+2)-getVariable(3,k)/getVariable(3,k);
					break;
				case 448:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 449:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(7,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate10(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 450:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(9,k)-getVariable(7,k)/getVariable(2,k)+getVariable(7,k)*getVariable(7,k)/getVariable(4,k);
					break;
				case 451:
					result = 78*Math.pow(10,+2)/getVariable(3,k)*getVariable(3,k)-getVariable(4,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(3,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 452:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k);
					break;
				case 453:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(1,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)-getVariable(7,k)-4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 454:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-31*Math.pow(10,-3)/getVariable(7,k)/getVariable(4,k)*getVariable(1,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 455:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(2,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)*getVariable(1,k)/getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 456:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(1,k)-getVariable(5,k);
					break;
				case 457:
					result = 95*Math.pow(10,+2)+getVariable(3,k)+getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(4,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)-getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 458:
					result = 95*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 459:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,-3)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-57*Math.pow(10,+1)/getVariable(1,k)*63*Math.pow(10,+9)/getVariable(7,k)+getVariable(7,k)+53*Math.pow(10,+3)/getVariable(4,k)-getVariable(6,k)-getVariable(4,k);
					break;
				case 460:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(1,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)-getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k);
					break;
				case 461:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(4,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)-getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k);
					break;
				case 462:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k);
					break;
				case 463:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(3,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(1,k)/getVariable(3,k)+getVariable(6,k)+getVariable(1,k)-4*Math.pow(10,-8)/getVariable(7,k)*60*Math.pow(10,+3)-getVariable(7,k)/getVariable(5,k)*getVariable(2,k)/71*Math.pow(10,+6)-getVariable(1,k)-getVariable(9,k)+80*Math.pow(10,+4)*getVariable(2,k);
					break;
				case 464:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(9,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k)*4*Math.pow(10,-3)*getVariable(3,k);
					break;
				case 465:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(7,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(6,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(9,k)-getVariable(7,k)+4*Math.pow(10,-6)*getVariable(7,k);
					break;
				case 466:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(1,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(1,k)/getVariable(3,k)/getVariable(6,k)/getVariable(1,k)+getVariable(9,k);
					break;
				case 467:
					result = 95*Math.pow(10,+2)/getVariable(3,k);
					break;
				case 468:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)+getVariable(4,k)-getVariable(3,k)/getVariable(5,k)+getVariable(3,k)-getVariable(7,k)/getVariable(7,k)/getVariable(2,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(3,k)*getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 469:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(4,k);
					break;
				case 470:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)+getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,+3)*getVariable(7,k);
					break;
				case 471:
					result = 11*Math.pow(10,+2)*getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)-getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 472:
					result = 95*Math.pow(10,+2)/getVariable(7,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(2,k);
					break;
				case 473:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(2,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(7,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/4*Math.pow(10,-3)+getVariable(1,k)/getVariable(9,k)+getVariable(4,k)/getVariable(6,k)-40*Math.pow(10,-4)/getVariable(1,k)*getVariable(7,k);
					break;
				case 474:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(2,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(7,k);
					break;
				case 475:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-4*Math.pow(10,+3)/getVariable(7,k)/getVariable(4,k)*getVariable(5,k)-getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)*getVariable(1,k)/getVariable(4,k)+74*Math.pow(10,+5)/getVariable(3,k)-getVariable(6,k)/getVariable(1,k)*getVariable(7,k)+84*Math.pow(10,-6)*getVariable(7,k)-getVariable(4,k)*22*Math.pow(10,-5)*getVariable(9,k);
					break;
				case 476:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)/getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(1,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 477:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)+getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/4*Math.pow(10,-4)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 478:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 479:
					result = getVariable(2,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)/getVariable(7,k)+getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(2,k)+getVariable(3,k)/getVariable(6,k)*getVariable(1,k)/getVariable(9,k)+getVariable(4,k)/getVariable(6,k)+getVariable(1,k)/getVariable(7,k)-96*Math.pow(10,+9)/getVariable(7,k)*getVariable(3,k);
					break;
				case 480:
					result = 80*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k);
					break;
				case 481:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)/getVariable(7,k)+getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(2,k)+getVariable(3,k);
					break;
				case 482:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(1,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)-getVariable(6,k)-getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/4*Math.pow(10,-3)-getVariable(1,k)/getVariable(7,k)*getVariable(7,k)+getVariable(4,k)/getVariable(3,k);
					break;
				case 483:
					result = 95*Math.pow(10,+2)*getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(1,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k)+getVariable(7,k)-getVariable(7,k);
					break;
				case 484:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-getVariable(5,k)/getVariable(7,k)+getVariable(7,k)-getVariable(4,k)/getVariable(5,k)/getVariable(7,k)*getVariable(2,k)+getVariable(3,k)/getVariable(6,k)*getVariable(1,k)/getVariable(6,k)+getVariable(7,k)/getVariable(6,k)+getVariable(1,k)/getVariable(7,k)-96*Math.pow(10,+2)/getVariable(4,k)*getVariable(1,k);
					break;
				case 485:
					result = getVariable(3,k)/getVariable(3,k)/getVariable(2,k)-getVariable(4,k)-getVariable(6,k)-getVariable(5,k)/getVariable(7,k)+96*Math.pow(10,+2)+getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k);
					break;
				case 486:
					result = 96*Math.pow(10,+2)/getVariable(3,k)+getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)+getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 487:
					result = 96*Math.pow(10,+2)/getVariable(3,k)-getVariable(1,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(4,k);
					break;
				case 488:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)*getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)/getVariable(7,k);
					break;
				case 489:
					result = 96*Math.pow(10,+2)/getVariable(3,k)+getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)*getVariable(4,k)/getVariable(5,k)-getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(3,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 490:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)*getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 491:
					result = 96*Math.pow(10,+6)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(4,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 492:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(9,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(3,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)*getVariable(3,k)+4*Math.pow(10,-3)/getVariable(6,k)-getVariable(1,k)/60*Math.pow(10,-5)*getVariable(7,k)/getVariable(7,k)*getVariable(2,k)-getVariable(4,k)+getVariable(6,k)+getVariable(9,k)+getVariable(3,k)*getVariable(9,k)*getVariable(7,k)*getVariable(4,k)+getVariable(3,k);
					break;
				case 493:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)*getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)+getVariable(7,k);
					break;
				case 494:
					result = 96*Math.pow(10,+2)+getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(7,k)*getVariable(2,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)*getVariable(9,k)-getVariable(3,k)+4*Math.pow(10,-3)/98*Math.pow(10,+9)-getVariable(6,k)/getVariable(1,k)*getVariable(7,k);
					break;
				case 495:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k);
					break;
				case 496:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(3,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/52*Math.pow(10,+3)*getVariable(7,k);
					break;
				case 497:
					result = 96*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(3,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)/getVariable(7,k)+getVariable(6,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+4*Math.pow(10,-3)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/getVariable(7,k);
					break;
				case 498:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k);
					break;
				case 499:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)-getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/4*Math.pow(10,-3)+getVariable(4,k)/getVariable(6,k)-getVariable(1,k)/32*Math.pow(10,+9)*getVariable(9,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate11(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 500:
					result = 95*Math.pow(10,+2)/getVariable(3,k);
					break;
				case 501:
					result = 96*Math.pow(10,-2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-32*Math.pow(10,-3)-getVariable(4,k)/getVariable(7,k)+getVariable(5,k)-getVariable(7,k);
					break;
				case 502:
					result = 96*Math.pow(10,+2)+getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-4*Math.pow(10,-3)-getVariable(4,k);
					break;
				case 503:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)-4*Math.pow(10,-3)+getVariable(5,k)-getVariable(7,k)/getVariable(7,k)-getVariable(4,k)*getVariable(5,k)-getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k);
					break;
				case 504:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)*getVariable(7,k)+getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/4*Math.pow(10,-3)*getVariable(5,k)+getVariable(7,k)/getVariable(2,k)*getVariable(3,k)/getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)/26*Math.pow(10,-1)*getVariable(7,k)+getVariable(7,k)+getVariable(4,k)-getVariable(9,k);
					break;
				case 505:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k);
					break;
				case 506:
					result = 77*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)/getVariable(7,k)-getVariable(7,k)/getVariable(4,k)*getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 507:
					result = 68*Math.pow(10,+6)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(6,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)*getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(7,k)*getVariable(2,k);
					break;
				case 508:
					result = 95*Math.pow(10,+8)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(4,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 509:
					result = 15*Math.pow(10,+2)/getVariable(1,k)/getVariable(3,k)-getVariable(9,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(4,k)/getVariable(1,k)+4*Math.pow(10,-3)/getVariable(9,k)+getVariable(3,k)/getVariable(6,k)-getVariable(1,k)*27*Math.pow(10,-6)*getVariable(7,k);
					break;
				case 510:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(6,k)+getVariable(7,k)+getVariable(2,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)+getVariable(9,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/4*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 511:
					result = 95*Math.pow(10,+2)/getVariable(3,k)/getVariable(3,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)*getVariable(7,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

}
