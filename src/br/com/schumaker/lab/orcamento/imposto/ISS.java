package br.com.schumaker.lab.orcamento.imposto;

import br.com.schumaker.lab.orcamento.Orcamento;

import java.math.BigDecimal;



public class ISS {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
