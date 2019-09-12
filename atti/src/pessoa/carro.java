package pessoa;

public class carro {
	
	protected pessoa dono;
	protected motor Motor;
	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	
	public carro() {
		dono=new pessoa();
		Motor=new motor();
	}

	public motor getMotor() {
		return Motor;
	}

	public void setMotor(motor motor) {
		Motor = motor;
	}

	public pessoa getDono() {
		return dono;
	}

	public void setDono(pessoa dono) {
		this.dono = dono;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("carro [dono=");
		builder.append(dono);
		builder.append(", Motor=");
		builder.append(Motor);
		builder.append(", fabricante=");
		builder.append(fabricante);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", ano=");
		builder.append(ano);
		builder.append("]");
		return builder.toString();
	}
	
}
