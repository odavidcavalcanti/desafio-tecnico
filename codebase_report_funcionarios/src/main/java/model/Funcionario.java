package model;

public class Funcionario {

    private Long id;
    private String nomeCompleto;
    private String status;
    private String cargo;

    public Funcionario(String nomeCompleto, String status, String cargo) {
        this.nomeCompleto = nomeCompleto;
        this.status = status;
        this.cargo = cargo;
    }

    public Funcionario() {

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario {" +
                "id=" + id +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", status='" + status + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
