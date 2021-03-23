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
public class Produto {
    private int codigo;
    private String nome;
    private double custo;
    private Familia familia = new Familia();
    private Fornecedor fornecedor = new Fornecedor();;
    private String unidade;
    private String marca;
    private Categoria categoria = new Categoria();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    public void cadastrarProduto(){
        this.nome = JOptionPane.showInputDialog("Entre com o nome do produto: ");
        this.custo = Double.parseDouble(JOptionPane.showInputDialog("Entre com o custo do produto em R$: "));
        this.unidade = JOptionPane.showInputDialog("Entre com a unidade do produto: ");
        this.marca = JOptionPane.showInputDialog("Entre com a marca do produto: ");
        fornecedor.cadastrarFornecedor("Atacadao", "Rua sei la", "79 99229922", "Joselito");
        familia.cadastrarFamilia();
        categoria.cadastrarCategoria();
    }
    public void exibirProduto(){
        JOptionPane.showMessageDialog(null, "Nome:" + this.nome +
                "\nCusto: " + this.custo +
                "\nUnidade: " + this.unidade +
                "\nMarca: " + this.marca);
       fornecedor.exibirFornecedor();
       familia.exibirFamilia();
       categoria.exibirCategoria();
    }
    
}
