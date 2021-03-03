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
public class Vendedor extends Funcionario {
    private String cargo;
    private String setor;
    
    public void cadastrarVendedor(){
        super.cadastrarFuncionario();
        this.cargo = "Vendedor";
        this.setor = JOptionPane.showInputDialog("Entre com o setor do Vendedor: ");
    }
    public void exibirVendedor(){
        super.exibirFuncionario();
        JOptionPane.showMessageDialog(null, "Cargo do funcionario: " + this.cargo +
                "\nSetor do funcionario: " + this.setor
                );
    }
}
