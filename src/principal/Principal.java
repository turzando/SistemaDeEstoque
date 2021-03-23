/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import model.Gerente;
import model.Atendente;
import model.Vendedor;
import model.Produto;
import model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.FolhaPagamento;

/**
 *
 * @author TuRaN
 * 
 */
public class Principal {
    public static void main(String[] args) {
        

//        List<Produto> listaProdutos = new ArrayList<>();
//        List<Gerente> listaGerentes = new ArrayList<>();
//        List<Atendente> listaAtendentes = new ArrayList<>();
//        List<Vendedor> listaVendedores = new ArrayList<>();
//        List<Cliente> listaClientes = new ArrayList<>();
//        
//        int i = 0;
//        while(i==0){
//            Object[] options = { "Cadastrar", "Exibir", "Sair"};
//            int menu = JOptionPane.showOptionDialog(null, "Escolha um:",
//                    "O que deseja?", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, 
//                    null, options, options[0]);
//            
//            switch(menu){
//                case 0:
//                {
//                    Object[] opcoesAcao = {"Produto", "Funcionario", "Cliente"};
//                    int cadastrar = JOptionPane.showOptionDialog(null, "Escolha um:",
//                    "Qual deseja cadastrar?", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, 
//                    null, opcoesAcao, opcoesAcao[0]);
//
//                    switch(cadastrar){
//                        case 0:
//                        {   
//                            Produto produto = new Produto();
//                            produto.cadastrarProduto();
//                            listaProdutos.add(produto);
//                            break;
//                        }
//
//                        case 1:
//                        {
//                            Object[] opcoesCargo = {"Gerente", "Atendente", "Vendedor"};
//                            int cargo = JOptionPane.showOptionDialog(null, "Escolha um:",
//                            "Qual deseja cadastrar?", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, 
//                            null, opcoesCargo, opcoesCargo[0]);
//                            switch(cargo){
//                                case 0:
//                                {
//                                    Gerente gerente = new Gerente();
//                                    gerente.cadastrarGerente();
//                                    listaGerentes.add(gerente);
//                                    break;
//                                }
//                                case 1:
//                                {
//                                    Atendente atendente = new Atendente();
//                                    atendente.cadastrarAtendente();
//                                    listaAtendentes.add(atendente);
//                                    break;
//                                }
//                                case 2:
//                                {
//                                    Vendedor vendedor = new Vendedor();
//                                    vendedor.cadastrarVendedor();
//                                    listaVendedores.add(vendedor);
//                                    break;
//                                }
//                            }
//                            break;
//                        }
//
//                        case 2:
//                        {
//                            Cliente cliente = new Cliente();
//                            cliente.cadastrarCliente();
//                            listaClientes.add(cliente);
//                            break;
//                        }
//
//                    }
//
//                    break;
//                }
//                case 1:
//                {
//                    Object[] opcoesAcao = {"Produto", "Funcionario", "Cliente"};
//                    int exibir = JOptionPane.showOptionDialog(null, "Escolha um:",
//                    "Qual deseja exibir?", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, 
//                    null, opcoesAcao, opcoesAcao[0]);
//                    switch(exibir){
//                        case 0:
//                        {
//                            for(Produto p: listaProdutos){
//                                p.exibirProduto();
//                            }
//                        break;
//                        }
//                        
//                        case 1:
//                        {
//                            Object[] opcoesCargo = {"Gerente", "Atendente", "Vendedor"};
//                            int exibirCargo = JOptionPane.showOptionDialog(null, "Escolha um:",
//                            "Qual deseja exibir?", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, 
//                            null, opcoesCargo, opcoesCargo[0]);
//                            switch(exibirCargo){
//                                case 0:
//                                {
//                                    for(Gerente g: listaGerentes){
//                                        g.exibirGerente();
//                                    }
//                                break;
//                                }
//                                
//                                case 1:
//                                {
//                                    for(Atendente a: listaAtendentes){
//                                        a.exibirAtendente();
//                                    }
//                                break;
//                                }
//                                
//                                case 2:
//                                {
//                                    for(Vendedor v: listaVendedores){
//                                        v.exibirVendedor();
//                                    }
//                                break;
//                                }
//                            }
//                        break;
//                        }
//                        
//                        case 2:
//                        {
////                            for(Cliente c: listaClientes){
////                                c.exibirCliente();
////                            }
//                        break;
//                        }
//                        
//                    }
//
//
//                    break;
//                }
//                case 2:
//                {
//                    JOptionPane.showMessageDialog(null, "Volte sempre!");
//                    i++;
//                    break;
//                }
//            }
//        }

        FolhaPagamento fp = new FolhaPagamento();
        fp.setSalarioBruto(2130);
        System.out.println(fp.getInss());
        System.out.println(fp.getIrrf());
        System.out.println(fp.getSalarioLiquido());
    }    
}
