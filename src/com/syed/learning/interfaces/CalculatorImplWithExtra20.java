package com.syed.learning.interfaces;

public class CalculatorImplWithExtra20 implements Calculator{

	@Override
	public double sum(double a, double b) {
		// TODO Auto-generated method stub
		return a+b+20;
	}

	@Override
	public double subtract(double a, double b) {
		// TODO Auto-generated method stub
		return a-b+20;
	}

	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a*b+20;
	}

	@Override
	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		return a/b+20;
	}

}
