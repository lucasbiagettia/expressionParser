package element;

import userMessages.ExpressionException;

public class DivisionOperator extends Element{
	private final TypeOfElement typeOfElement = TypeOfElement.arithmeticOperator;
	private final int priority = 50;
	private final int value = (Integer) null;
	
	@Override
	public boolean solveBoolean(Double leftElement, Double rightElement) throws ExpressionException {
		//TODO definir expresi�n
		throw new ExpressionException("Error");
	}

	@Override
	public double solveArithmetic(Double leftElement, Double rightElement) throws ExpressionException {
		if (rightElement == 0) {
			throw new ExpressionException("Error");
		}else {
		return leftElement + rightElement;
		}
	}
}