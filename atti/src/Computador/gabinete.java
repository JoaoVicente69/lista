package Computador;

public class gabinete {
	protected PlacaMae placaMae;
	private String marca;
	private String modelo;
	private int baias;
	
	public gabinete() {
		placaMae= new PlacaMae();
	}

	public PlacaMae getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(PlacaMae placaMae) {
		this.placaMae = placaMae;
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

	public int getBaias() {
		return baias;
	}

	public void setBaias(int baias) {
		this.baias = baias;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("gabinete [placaMae=");
		builder.append(placaMae);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", baias=");
		builder.append(baias);
		builder.append("]");
		return builder.toString();
	}

}
