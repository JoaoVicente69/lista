package Computador;

public class PlacaMae {
	
	protected HD hd;
	protected memoria Memoria;
	protected processador Processador;
	
	private String marca;
	private String modelo;
	
	public PlacaMae() {
		hd=new HD();
		Memoria= new memoria();
		Processador = new processador();
		
	}

	public HD getHd() {
		return hd;
	}

	public void setHd(HD hd) {
		this.hd = hd;
	}

	public memoria getMemoria() {
		return Memoria;
	}

	public void setMemoria(memoria memoria) {
		Memoria = memoria;
	}

	public processador getProcessador() {
		return Processador;
	}

	public void setProcessador(processador processador) {
		Processador = processador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlacaMae [hd=");
		builder.append(hd);
		builder.append(", Memoria=");
		builder.append(Memoria);
		builder.append(", Processador=");
		builder.append(Processador);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append("]");
		return builder.toString();
	}
	
	

}
