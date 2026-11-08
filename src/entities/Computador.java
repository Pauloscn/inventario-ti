package entities;

import java.time.LocalDateTime;

public class Computador {
	private String name;
	private String processador;
	private int ramGB;
	private int discogb;
	private LocalDateTime dataRegistro;
	
	public Computador(String name, String processador, int ramGB, int discogb, LocalDateTime dataRegistro) {
		super();
		this.name = name;
		this.processador = processador;
		this.ramGB = ramGB;
		this.discogb = discogb;
		this.dataRegistro = dataRegistro;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public int getRamGB() {
		return ramGB;
	}
	public void setRamGB(int ramGB) {
		this.ramGB = ramGB;
	}
	public int getDiscogb() {
		return discogb;
	}
	public void setDiscogb(int discogb) {
		this.discogb = discogb;
	}
	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	@Override
	public String toString() {
		return "Computador [name=" + name + ", processador=" + processador + ", ramGB=" + ramGB + ", discogb=" + discogb
				+ ", dataRegistro=" + dataRegistro + "]";
	}
	

}
