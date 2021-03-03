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
public class Cliente extends Pessoa {
    private Double limite;
    private String codCliente;
    private String mesNascimento;
    private String primeiraCompra;
    public void cadastrarCliente(){
        super.cadastrar();
        this.limite = Double.parseDouble(JOptionPane.showInputDialog("Entre com o limite: "));
        this.codCliente = JOptionPane.showInputDialog("Entre com o codigo do cliente: ");
        this.mesNascimento = JOptionPane.showInputDialog("Entre com o mes de nascimento: ");
        this.primeiraCompra = JOptionPane.showInputDialog("Entre com a data da primeira compra: ");
    }
    
    public void exibirCliente(){
        super.exibir();
        JOptionPane.showMessageDialog(null, "Limite do cliente: " + this.limite +
                "\nCodigo do cliente: " + this.codCliente +
                "\nMes de nasicmento: " + this.mesNascimento +
                "\nPrimeira compra: " + this.primeiraCompra);
    }
}
