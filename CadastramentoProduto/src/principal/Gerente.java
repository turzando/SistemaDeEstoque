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
public class Gerente extends Funcionario {
    private String cargo;
    private String setor;
    
    public void cadastrarGerente(){
        super.cadastrarFuncionario();
        this.cargo = "Gerente";
        this.setor = JOptionPane.showInputDialog("Entre com o setor do gerente: ");
    }
    
    public void exibirGerente(){
        super.exibirFuncionario();
        JOptionPane.showMessageDialog(null, "Cargo do funcionario: " + this.cargo +
                "\nSetor do funcionario: " + this.setor
                );
    }
}
