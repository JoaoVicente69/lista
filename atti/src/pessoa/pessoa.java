package pessoa;

public class pessoa {
	private String Pessoa;
	private String  endereco;
	
	public String getPessoa() {
		return Pessoa;
	}
	public void setPessoa(String pessoa) {
		if(pessoa.length()>0)
		Pessoa = pessoa;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if(endereco.length()>0)
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoa [Pessoa=");
		builder.append(Pessoa);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
	
}
