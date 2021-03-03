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
public class Atendente extends Funcionario{
    private String cargo;
    private String setor;
    
    public void cadastrarAtendente(){
        super.cadastrarFuncionario();
        this.cargo = "Atendente";
        this.setor = JOptionPane.showInputDialog("Entre com o setor do atendente: ");
    }
    public void exibirAtendente(){
        super.exibirFuncionario();
        JOptionPane.showMessageDialog(null, "Cargo do funcionario: " + this.cargo +
                "\nSetor do funcionario: " + this.setor
                );
    }
}
