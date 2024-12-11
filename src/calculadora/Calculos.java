package calculadora;

import exception.DivisaoInvalidaException;

public class Calculos {
	
	private Double primeiroNumero;
	private Double segundoNumero;
	private String operacao = null;
	private Double resposta = 0.0;
	
	public Calculos() {
		
	}
	
	public Calculos(Double primeiroNumero, Double segundoNumero, String operacao) {
		
		this.primeiroNumero = primeiroNumero;
	    this.segundoNumero = segundoNumero;
	    this.operacao = operacao;
	    calcular();
	}   
	

	public Double getPrimeiroNumero() {
		return primeiroNumero;
	}


	public Double getSegundoNumero() {
		return segundoNumero;
	}


	public String getOperacao() {
		return operacao;
	}


	public Double getResposta() {
		return resposta;
	}


	public void calcular() {
		if(operacao.equals("+")) {
			resposta = adicao (primeiroNumero, segundoNumero);
			  
		}else if(operacao.equals("-")) {
			resposta = subtracao(primeiroNumero, segundoNumero);
			
		}else if (operacao.equals("*")) {
			resposta = multiplicacao(primeiroNumero, segundoNumero);
			
		}else {
			resposta = divisao(primeiroNumero, segundoNumero);
		}
		
	
	}
	public Double adicao(Double x, Double y) {
		return x +y;
		
	}
	
	public Double subtracao(Double x, Double y) {
		return x - y;
		
	}
	
	public Double multiplicacao(Double x, Double y) {
		return x * y;
	}
	
	public Double divisao(Double x, Double y) {
		if(y == 0) {
			throw new DivisaoInvalidaException();
		}else {
			return x / y;
		}
		
	}

}
