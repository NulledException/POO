/**
 * Calculos
 */
public class Calculos {

    private float salMinimo;
    private float salFuncionario;
    private float qntdSalMin;

    public void setSalMinimo(float salMinimo) {
        this.salMinimo = salMinimo;        
    }
    public void setSalFuncionario(float salFuncionario) {
        this.salFuncionario = salFuncionario;        
    }
    public float getSalMinimo() {
        return this.salMinimo;
    }
    public float getSalFuncionario() {
        return this.salFuncionario;
    }
    private int calcQntdSalMin() {
        this.qntdSalMin = (this.salFuncionario) / (this.salMinimo);
        return (int)qntdSalMin;        
    }
    public int getQntdSalMin() {
        return calcQntdSalMin();
    }

}