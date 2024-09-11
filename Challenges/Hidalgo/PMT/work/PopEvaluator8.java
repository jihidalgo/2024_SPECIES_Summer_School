public class PopEvaluator8 extends algorithm.AbstractPopEvaluator {

	public double evaluate(int idxExpr, int k) {
		double result = 0.0;

		double t = 0.0;

		if(idxExpr<50&& idxExpr>=0){
			result=evaluate1(idxExpr, k);
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
					result = getVariable(4,k)*getVariable(8,k)*32*Math.pow(10,-2)+97*Math.pow(10,+1)*getVariable(6,k)*getVariable(6,k)*81*Math.pow(10,-8)*19*Math.pow(10,-1)+getVariable(7,k)*99*Math.pow(10,-6)*getVariable(2,k)+68*Math.pow(10,-1)+99*Math.pow(10,-2)+getVariable(7,k)*99*Math.pow(10,-4)-getVariable(4,k)*getVariable(4,k)*62*Math.pow(10,-4)*65*Math.pow(10,-4)*getVariable(2,k);
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
