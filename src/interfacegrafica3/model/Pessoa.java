/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.model;

/**
 *
 * @author joser
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    
    //metodo construtor
    public Pessoa(String nome, String endereco, String telefone, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    public Pessoa(){
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
     public String getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
     public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
     public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" + "Endereco: " + this.endereco + "\n" +
                "Telefone: " + this.telefone + "\n" + "E-mail: " + this.email;
                
    }
    
    
}
