/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.model;

/**
 *
 * @author joser
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private String nomeFantasia;

    public PessoaJuridica(String cnpj, String inscricaoEstadual, String nomeFantasia, String nome,
            String endereco, String telefone, String email, int id) {
        super(nome, endereco, telefone, email, id);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + 
                "Nome = "               + super.getNome()       +
                ", email = "            + super.getEmail()      +
                ", telefone "           + super.getTelefone()   +
                ", cnpj="               + cnpj                  + 
                ", inscricaoEstadual="  + inscricaoEstadual     + 
                ", nomeFantasia="       + nomeFantasia          + '}';
    }
    
    
}
