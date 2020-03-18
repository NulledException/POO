public class FichaInscricao {

	private static final double INVESTIMENTO = 20;

	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private String telefone;
	private String eMail;
	private boolean pago;

	public FichaInscricao() {
	}

	public FichaInscricao(final String nome, final String endereco, final String cidade, final String estado,
			final String telefone, final String eMail) {
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.eMail = eMail;
	}

	public FichaInscricao(final String nome, final String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(final String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(final String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(final String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(final String telefone) {
		this.telefone = telefone;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(final String eMail) {
		this.eMail = eMail;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(final boolean pago) {
		this.pago = pago;
	}

	public static double getInvestimento() {
		return INVESTIMENTO;
	}

	public void mostraInscricao() {
		System.out.println("Nome : " + this.nome);
		System.out.println("Endereco : " + this.endereco + ", " + this.cidade + " - " + this.estado);
		System.out.println("Telefone : " + this.telefone);
		System.out.println("e-mail : " + this.eMail);
		System.out.println("Inscrição paga? " + (this.isPago() ? "Sim" : "Não"));
	}

}
