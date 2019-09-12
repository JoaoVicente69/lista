package Computador;

public class memoria {
	private String marca;
	private String modelo;
	private float capacidade;
	private float velocida;
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
	public float getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
	}
	public float getVelocida() {
		return velocida;
	}
	public void setVelocida(int velocida) {
		this.velocida = velocida;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("memoria [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", capacidade=");
		builder.append(capacidade);
		builder.append(", velocida=");
		builder.append(velocida);
		builder.append("]");
		return builder.toString();
	}
	

}
