package com.practice;

public enum CalculatorOperations {
	ADD(1), SUBTRACT(2), MULTIPLY(3), DIVIDE(4);

	private int operationCode;

	private CalculatorOperations(int operationCode) {
		this.operationCode = operationCode;
	}

	public static CalculatorOperations get(int operationCode) {

		switch (operationCode) {
		case 1:
			return ADD;
		case 2:
			return SUBTRACT;
		case 3:
			return MULTIPLY;
		case 4:
			return DIVIDE;
		}

		return null;
	}
}
