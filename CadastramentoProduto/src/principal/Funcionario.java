/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author TuRaN
 */
public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;
    
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
