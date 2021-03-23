package br.com.schumaker.lab.orcamento.imposto;

import br.com.schumaker.lab.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
