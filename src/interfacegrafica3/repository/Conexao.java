/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.repository;

/**
 *
 * @author joser
 */
public class Conexao {
    private String endereco;
    private String user;
    private String password;
    private int porta;
    private String nomeBanco;
    
     public Conexao(String endereco, String user, String password, int porta, String nomeBanco) {
        this.endereco = endereco;
        this.user = user;
        this.password = password;
        this.porta = porta;
        this.nomeBanco = nomeBanco;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public int getPorta() {
        return porta;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

   
    
    
}
