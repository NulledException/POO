package Ex05;

public class Tecnico extends Assistente{
    private double bonusSalarial;

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public String toString() {
        return super.imprimeDados() + " Bonus Salarial=" + bonusSalarial;
    }

}