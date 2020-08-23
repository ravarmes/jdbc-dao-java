package jdbc.exemplos.java.model;

/**
 *
 * @author Rafael Vargas Mesquita
 */
public class Cliente {
    private Integer id;
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente() {
    }
    
    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public Cliente(Integer id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone;
    }
        
}
