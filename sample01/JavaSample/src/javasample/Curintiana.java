/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample;

/**
 *
 * @author gabriell
 */
public class Curintiana extends Pessoa{
    
    public Curintiana(String nome) {
        super(nome);
    }
    
    @Override
    public void responderOla(Pessoa outraPessoa){
        System.out.println(this.getNome() + ": Olá, "+outraPessoa.getNome()+". Vai Corinthians!");
    }
}
