package list;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int codigo;
    private String nome;
    private List<Contato> contatos;

    public Pessoa() {
        contatos = new ArrayList<Contato>();
    }

    public Pessoa(int codigo, String nome) {
        this();
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [codigo=" + codigo + ", nome=" + nome + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    public void addContato(Contato c) {
        this.contatos.add(c);
    }

    public void removeContato(Contato c) {
        this.contatos.remove(c);
    }

    public List<Contato> getContatos() {
        return this.contatos;
    }
}