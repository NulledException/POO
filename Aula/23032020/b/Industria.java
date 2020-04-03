package b;

public class Industria extends PessoaJuridica{

    private String ramoAtividade;

    public String getRamoAtividade() {
        return ramoAtividade;
    }

    public void setRamoAtividade(String ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }

	@Override
	public String toString() {
		return "Industria [ramoAtividade=" + ramoAtividade + "]";
	}
}