package pessoa;

public class motor {
	private String modelo;
	private float potenci;
	private  int cilindros;
	private String combustivel;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPotenci() {
		return potenci;
	}
	public void setPotenci(float potenci) {
		this.potenci = potenci;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("motor [modelo=");
		builder.append(modelo);
		builder.append(", potenci=");
		builder.append(potenci);
		builder.append(", cilindros=");
		builder.append(cilindros);
		builder.append(", combustivel=");
		builder.append(combustivel);
		builder.append("]");
		return builder.toString();
	}
	
	


}
