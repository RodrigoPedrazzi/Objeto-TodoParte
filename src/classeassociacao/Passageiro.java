package classeassociacao;
//objeto-parte
public class Passageiro {
    private String cpf;
    private String nome;

    public Passageiro() {
    }

    public Passageiro(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "CPF='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}


