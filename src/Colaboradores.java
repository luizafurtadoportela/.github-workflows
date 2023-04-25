import java.util.Date;
public class Colaboradores {
    public String nome;
    public String CPF;
    public int telefone;
    public int dataNascimento;
    public int dataAgendamento;
    public String periodo;

    public Colaboradores() {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataAgendamento = dataAgendamento;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Colaboradores{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", telefone=" + telefone +
                ", dataNascimento=" + dataNascimento +
                ", dataAgendamento=" + dataAgendamento +
                ", periodo='" + periodo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
    public int getTelefone() {
        return telefone;
    }
    public int getDataNascimento() {
        return dataNascimento;
    }
    public int getDataAgendamento() {
        return dataAgendamento;
    }
    public String getPeriodo() {
        return periodo;
    }
}
