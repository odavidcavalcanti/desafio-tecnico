package model;

public class Sistema {

    private Long id;
    private String nome;
    private String empresa;
    private String responsavel;

    public Sistema(String nome, String empresa, String responsavel) {
        this.nome = nome;
        this.empresa = empresa;
        this.responsavel = responsavel;
    }

    public Sistema() {

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Sistema {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", empresa='" + empresa + '\'' +
                ", responsavel='" + responsavel + '\'' +
                '}';
    }
}
