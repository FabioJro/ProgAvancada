package Atv18;

import java.math.BigDecimal;
import java.util.Date;

public class PagamentoNfe {
	
	private BigDecimal valor;
	private Date dataPagamento;
	private Pedido pedido;
	private NotaFiscalEletronica notaFiscalEletronica;

	
	
	public void efetuarPagamento() {
		System.out.println("Pagamento efetuado");
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public NotaFiscalEletronica getNotaFiscalEletronica() {
		return notaFiscalEletronica;
	}

	public void setNotaFiscalEletronica(NotaFiscalEletronica notaFiscalEletronica) {
		this.notaFiscalEletronica = notaFiscalEletronica;
	}
	

}
