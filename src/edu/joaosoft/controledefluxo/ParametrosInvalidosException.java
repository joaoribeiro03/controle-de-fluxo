package edu.joaosoft.controledefluxo;

@SuppressWarnings("serial")
public class ParametrosInvalidosException extends Exception {

	@Override
	public String getMessage() {
		return "O segundo parametro deve ser maior que o primeiro";
	}
}
