package Ex04;

//B
public class Administrativo extends Assistente {
    private String turno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.imprimeDados() + " Turno=" + turno;
    }

}