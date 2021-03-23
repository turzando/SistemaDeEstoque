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
public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;
    private FolhaPagamento fp;
    
    public Funcionario(){
        fp = new FolhaPagamento();
    }
    
    public String CalcularFolhaPagamento(){
        String folhaPg;
        fp.setSalarioBruto(this.salario);
        folhaPg = "Folha de pagamento" +
                "\nNome: " + super.getNome() +
                "\n----------------------------" +
                "\nSalário bruto: " + this.salario +
                "\nDescontos --------------------" +
                "\nINSS: " + fp.getInss() +
                "\nIRRF: " + fp.getIrrf() +
                "\n------------------------------" +
                "\n Salário líquido: " + fp.getSalarioLiquido();
        return folhaPg;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    public void cadastrarFuncionario(){
        super.cadastrar();
        this.matricula = Integer.parseInt(JOptionPane.showInputDialog("Entre com a matricula: "));
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com o salario: "));
    }
    public void exibirFuncionario(){
        super.exibir();
        JOptionPane.showMessageDialog(null, "Matricula do funcionário: " + this.matricula +
                "\nSalario do funcionário: " + this.salario
                );
    }
}
