package Aula16.exercicios.ex03.conta;

public class SaldoInsuficienteException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 6082678020286644379L;
    public static final String MESSAGE = "O saldo é insuficente para a operação de saque!";

    public SaldoInsuficienteException() {
    }

    public SaldoInsuficienteException(String message) {
        super(MESSAGE);
    }

    public SaldoInsuficienteException(Throwable cause) {
        super(MESSAGE + " " + cause);
    }

    public SaldoInsuficienteException(String message, Throwable cause) {
        super(MESSAGE, cause);
    }

    public SaldoInsuficienteException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(MESSAGE + " " + message, cause, enableSuppression, writableStackTrace);
    }
    
    
}