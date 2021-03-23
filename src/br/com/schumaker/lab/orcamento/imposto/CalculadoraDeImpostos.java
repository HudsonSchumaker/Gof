package br.com.schumaker.lab.orcamento.imposto;

import br.com.schumaker.lab.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
