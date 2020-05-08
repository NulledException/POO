import java.text.DecimalFormat;

public class Relogio {

    private int hora, minuto, segundo;

    public Relogio(int h, int m, int s) {
        acertaHora(h, m, s);
    }

    public Relogio(int h, int m) {
        acertaHora(h, m);
    }

    public Relogio(int h) {
        acertaHora(h);
    }

    public void incrementa() {
        if (++segundo > 59) {
            segundo = 0;
            if (++minuto > 59) {
                minuto = 0;
                if (++hora > 23)
                    hora = 0;
            }
        }
    }

    public void decrementa() {
        if (--segundo < 0) {
            segundo = 59;
            if (--minuto < 0) {
                minuto = 59;
                if (--hora < 0)
                    hora = 23;
            }
        }
    }

    public void acertaHora(int h) {
        if (h >= 0 && h <= 23)
            hora = h;
        else
            hora = 0;

        minuto = 1;

        segundo = 1;
    }

    public void acertaHora(int h, int m) {
        if (h >= 0 && h <= 23)
            hora = h;
        else
            hora = 0;
        if (m >= 0 && m <= 59)
            minuto = m;
        else
            minuto = 0;

        segundo = 1;
    }

    public void acertaHora(int h, int m, int s) {
        if (h >= 0 && h <= 23)
            hora = h;
        else
            hora = 0;
        if (m >= 0 && m <= 59)
            minuto = m;
        else
            minuto = 0;
        if (s >= 0 && s <= 59)
            segundo = s;
        else
            segundo = 0;
    }

    DecimalFormat numInt = new DecimalFormat("00");

    public String toString() {
        String str = "Hora atual: " + numInt.format(hora) + ":" + numInt.format(minuto) + ":" + numInt.format(segundo);
        return str;
    }
}
