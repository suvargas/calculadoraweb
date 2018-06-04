package co.edu.icesi.demo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class InfoCuentaDTO implements Serializable{

	private static final long serialVersionUID = 3545128761727230502L;
	private BigDecimal max;
	private BigDecimal min;
	private Double avg;
	private BigDecimal sum;

	public InfoCuentaDTO() {
		super();
	}
	
	public InfoCuentaDTO(BigDecimal max, BigDecimal min, Double avg, BigDecimal sum) {
		super();
		this.max = max;
		this.min = min;
		this.avg = avg;
		this.sum = sum;
	}

	public BigDecimal getMax() {
		return max;
	}
	public void setMax(BigDecimal max) {
		this.max = max;
	}
	public BigDecimal getMin() {
		return min;
	}
	public void setMin(BigDecimal min) {
		this.min = min;
	}
	public Double getAvg() {
		return avg;
	}
	public void setAvg(Double avg) {
		this.avg = avg;
	}
	public BigDecimal getSum() {
		return sum;
	}
	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}
	
	
	
}
