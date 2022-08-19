package com.ifsp.giovanna.cadastro;

public class Formulario {

    private String nomeCompleto;
    private String telefone;
    private String email;
    private String sexo;
    private String ingressarNaLista;
    private String cidade;
    private String uf;

    public Formulario() {

    }

    public Formulario(String nomeCompleto, String telefone, String email, String sexo, String ingressarNaLista, String cidade, String uf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.ingressarNaLista = ingressarNaLista;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIngressarNaLista() {
        return ingressarNaLista;
    }

    public void setIngressarNaLista(String ingressarNaLista) {
        this.ingressarNaLista = ingressarNaLista;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "Nome completo: '" + nomeCompleto + '\'' +
                ", telefone: '" + telefone + '\'' +
                ", email: '" + email + '\'' +
                ", sexo: '" + sexo + '\'' +
                ", ingressar na lista: " + ingressarNaLista +
                ", cidade: '" + cidade + '\'' +
                ", uf: '" + uf + '\'' +
                '}';
    }
}
