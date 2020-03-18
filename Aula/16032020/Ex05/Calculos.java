/**
 * Calculos
 */
public class Calculos {

    private float areaLosango;
    private float diagonalMaior;
    private float diagonalMenor;

    public void setDiagonalMaior( float diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }
    public void setDiagonalMenor( float diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    public float getDiagonalMaior() {
        return this.diagonalMaior;        
    }
    public float getDiagonalMenor() {
        return this.diagonalMenor;        
    }
    public float calcAreaLosango(){
        this.areaLosango = ((this.diagonalMaior)*(this.diagonalMenor)/2);
        return this.areaLosango;
    }
    public float getAreaLosango() {
        return calcAreaLosango();        
    }
}