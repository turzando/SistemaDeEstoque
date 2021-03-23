/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author TuRaN
 */
public class Categoria {
    private String nome;
    private String tipo;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    public void cadastrarCategoria(){
        this.nome = JOptionPane.showInputDialog("Entre com o nome da categoria: ");
        this.nome = JOptionPane.showInputDialog("Entre com o tipo da categoria: ");
        this.descricao = JOptionPane.showInputDialog("Entre com a descrição da categoria: ");
    }
    
    public void exibirCategoria(){
        JOptionPane.showMessageDialog(null, "Nome da categoria:" + this.nome +
                "\nTipo da categoria: " + this.tipo +
                "\nDescrição da categoria: " + this.descricao);
    }
}
