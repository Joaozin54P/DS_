/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menus;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.UIManager;

/**
 *
 * @author Admin
 */
public class Principal extends JFrame
{
    JMenuBar barra;
    JToolBar bara;
    JMenu Operacoes,sobre,sair;
    JMenuItem soma,dividir,multiplicar,subtrair;
    JButton s,d,m,su,sa;
    ImageIcon ima[];
    somar segundajanela;
    subtracao terceirajanela;
    multiplicao quartajanela;
    divi quintajanela;
    sobree sextajanela;
    
    public Principal()
    {
        super("Menu - Calculadora");
        
        Container tela = getContentPane();
        tela.setLayout(null);
        
        barra = new JMenuBar();
        setJMenuBar(barra);
        Operacoes = new JMenu("Operações");
        sobre = new JMenu("Sobre");
        sair = new JMenu("Sair");
        barra.add(Operacoes);
        barra.add(sobre);
        barra.add(sair);
        soma = new JMenuItem("Soma");
        dividir = new JMenuItem("Dividir");
        multiplicar = new JMenuItem("Multiplicar");
        subtrair = new JMenuItem("Subtrair");
        
        String icones[]={"ima/s.png","ima/su.png",
            "ima/m.png","ima/d.png",
            "ima/sa.png"};
        
        ima = new ImageIcon[5];
        
        for(int i=0;i<5;i++)
        {
            ima[i] = new ImageIcon(icones[i]);
        }
        s = new JButton(ima[0]);
        d = new JButton(ima[1]);
        m = new JButton(ima[2]);
        su = new JButton(ima[3]);
        sa = new JButton(ima[4]);
        
        s.setToolTipText("Soma");
        su.setToolTipText("Subtração");
        m.setToolTipText("multiplicação");
        d.setToolTipText("Dividir");
        sa.setToolTipText("Sair");
        bara = new JToolBar("Barra de Ferramentas");
        
        UIManager.put("ToolTip.background",SystemColor.info);
        UIManager.put("ToolTip.foreground",Color.blue);
        
        bara.setRollover(true);
        bara.add(s);
        bara.add(d);
        bara.add(m);
        bara.add(su);
        bara.addSeparator();
        bara.add(sa);
        
        bara.setBounds(1,12,260,50);
         
        tela.setBackground(new Color(206,228,213));
        barra.setBackground(new Color(157,201,172));
        bara.setBackground(new Color(157,201,172));
        ImageIcon icone= new ImageIcon("J.jpg");
        setIconImage(icone.getImage());
        
        Operacoes.setMnemonic(KeyEvent.VK_O);
        sair.setMnemonic(KeyEvent.VK_S);
        sobre.setMnemonic(KeyEvent.VK_F);
        
        Operacoes.add(soma);
        Operacoes.add(subtrair);
        Operacoes.add(dividir);
        Operacoes.add(multiplicar);
        
        soma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                segundajanela = new somar(null, "Segunda Janela", true);
                segundajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                segundajanela.setVisible(true);
            }
        });
        
        subtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                terceirajanela = new subtracao(null, "Terceira Janela", true);
                terceirajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                terceirajanela.setVisible(true);
            }
        });
        
        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quartajanela = new multiplicao(null, "Quarta Janela", true);
                quartajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                quartajanela.setVisible(true);
            }
        });
        
         dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quintajanela = new divi(null, "Quinta Janela", true);
                quintajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                quintajanela.setVisible(true);
            }
        });
         
         sobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sextajanela = new sobree(null, "Sexta Janela", true);
                sextajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                sextajanela.setVisible(true);
            }
        });
        
        sair.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int opcao;
                    Object[] botoes = {"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja sair mesmo?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    
                    if (opcao==JOptionPane.YES_OPTION)
                    System.exit(0);}});
        
        s.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                segundajanela = new somar(null, "Segunda Janela", true);
                segundajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                segundajanela.setVisible(true);
            }
        });
        
        su.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                terceirajanela = new subtracao(null, "Terceira Janela", true);
                terceirajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                terceirajanela.setVisible(true);
            }
        });
        
        m.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quartajanela = new multiplicao(null, "Quarta Janela", true);
                quartajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                quartajanela.setVisible(true);
            }
        });
        
        d.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                quintajanela = new divi(null, "Quinta Janela", true);
                quintajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                quintajanela.setVisible(true);
            }
        });
        
        sa.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int opcao;
                    Object[] botoes = {"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja sair mesmo?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    
                    if (opcao==JOptionPane.YES_OPTION)
                    System.exit(0);}});
        
        tela.add(bara);
        setSize(320,340);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String args[])
        {
            Principal app = new Principal();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
    private class somar extends JDialog {
        JButton sair,voltar,limpar;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;
        JButton somar2n;

        public somar(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela1 = getContentPane();
            tela1.setLayout(null);

            // layout do formulário
            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");
            texto1 = new JTextField(5);
            texto2 = new JTextField(5);
            exibir = new JLabel("");
            somar2n = new JButton("Somar");
            voltar = new JButton("Voltar");
            limpar = new JButton("Limpar");

            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 100, 20);
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            exibir.setBounds(50, 140, 200, 20);
            somar2n.setBounds(150, 100, 80, 20);
            voltar.setBounds(50, 230, 80, 20);
            limpar.setBounds(50, 210, 80, 20);
            
            tela1.setBackground(new Color(225,245,196));
            ImageIcon icone= new ImageIcon("A.jpg");
        setIconImage(icone.getImage());
        
         limpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                 
                    texto1.setText("");
                    texto2.setText("");
                    exibir.setVisible(false);
                }
            });
         
         voltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  segundajanela.dispose();
                }
            });

            somar2n.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1, num2, soma;
                    soma = 0;
                    num1 = Integer.parseInt(texto1.getText());
                    num2 = Integer.parseInt(texto2.getText());
                    soma = num1 + num2;
                    exibir.setVisible(true);
                    exibir.setText("A soma é: " + soma);
                }
            });
            exibir.setVisible(false);

            tela1.add(rotulo1);
            tela1.add(rotulo2);
            tela1.add(texto1);
            tela1.add(texto2);
            tela1.add(exibir);
            tela1.add(somar2n);
            tela1.add(voltar);
            tela1.add(limpar);

            sair = new JButton("Sair");
            sair.setBounds(50, 250, 80, 20);
            TBsair tsair = new TBsair();
            sair.addActionListener(tsair);
            tela1.add(sair);
            setSize(400, 400);
            setLocationRelativeTo(null);
        }
    }
    private class subtracao extends JDialog {
        JButton sair,voltar,limpar;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;
        JButton subt;
        

        public subtracao(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela2 = getContentPane();
            tela2.setLayout(null);

            // layout do formulário
            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");
            texto1 = new JTextField(5);
            texto2 = new JTextField(5);
            exibir = new JLabel("");
            subt = new JButton("Subtrair");
            voltar = new JButton("Voltar");
            limpar = new JButton("Limpar");

            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 100, 20);
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            exibir.setBounds(50, 140, 200, 20);
            subt.setBounds(150, 100, 80, 20);
            voltar.setBounds(50, 230, 80, 20);
            limpar.setBounds(50, 210, 80, 20);
            
            tela2.setBackground(new Color(201,245,196));
            ImageIcon icone= new ImageIcon("B.jpg");
        setIconImage(icone.getImage());
        
        limpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                 
                    texto1.setText("");
                    texto2.setText("");
                    exibir.setVisible(false);
                }
            });
         
         voltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  terceirajanela.dispose();
                }
            });

            subt.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1, num2, subtracao;
                    subtracao = 0;
                    num1 = Integer.parseInt(texto1.getText());
                    num2 = Integer.parseInt(texto2.getText());
                    subtracao = num1 - num2;
                    exibir.setVisible(true);
                    exibir.setText("A subtração é: " + subtracao);
                }
            });
            exibir.setVisible(false);

            tela2.add(rotulo1);
            tela2.add(rotulo2);
            tela2.add(texto1);
            tela2.add(texto2);
            tela2.add(exibir);
            tela2.add(subt);
            tela2.add(voltar);
            tela2.add(limpar);

            sair = new JButton("Sair");
            sair.setBounds(50, 250, 80, 20);
            TBsai tsair = new TBsai();
            sair.addActionListener(tsair);
            tela2.add(sair);
            setSize(400, 400);
            setLocationRelativeTo(null);
        }
    }
    
    private class multiplicao extends JDialog {
        JButton sair,limpar,voltar;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;
        JButton multi;

        public multiplicao(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela3 = getContentPane();
            tela3.setLayout(null);

            // layout do formulário
            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");
            texto1 = new JTextField(5);
            texto2 = new JTextField(5);
            exibir = new JLabel("");
            multi = new JButton("multiplicar");
            voltar = new JButton("Voltar");
            limpar = new JButton("Limpar");

            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 100, 20);
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            exibir.setBounds(50, 140, 200, 20);
            multi.setBounds(150, 100, 110, 20);
            voltar.setBounds(50, 230, 80, 20);
            limpar.setBounds(50, 210, 80, 20);
            
            tela3.setBackground(new Color(233,251,231));
            ImageIcon icone= new ImageIcon("C.jpg");
        setIconImage(icone.getImage());
        
        limpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                 
                    texto1.setText("");
                    texto2.setText("");
                    exibir.setVisible(false);
                }
            });
         
         voltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  quartajanela.dispose();
                }
            });

            multi.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1, num2, mult;
                    mult = 0;
                    num1 = Integer.parseInt(texto1.getText());
                    num2 = Integer.parseInt(texto2.getText());
                    mult = num1 * num2;
                    exibir.setVisible(true);
                    exibir.setText("A mutiplicação é: " + mult);
                }
            });
            exibir.setVisible(false);

            tela3.add(rotulo1);
            tela3.add(rotulo2);
            tela3.add(texto1);
            tela3.add(texto2);
            tela3.add(exibir);
            tela3.add(multi);
            tela3.add(voltar);
            tela3.add(limpar);

            sair = new JButton("Sair");
            sair.setBounds(50, 250, 80, 20);
            TBsa tsair = new TBsa();
            sair.addActionListener(tsair);
            tela3.add(sair);
            setSize(400, 400);
            setLocationRelativeTo(null);
        }
    }
    private class divi extends JDialog {
        JButton sair,voltar,limpar;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;
        JButton divii;

        public divi(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela4 = getContentPane();
            tela4.setLayout(null);

            // layout do formulário
            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");
            texto1 = new JTextField(5);
            texto2 = new JTextField(5);
            exibir = new JLabel("");
            divii = new JButton("Dividir");
            voltar = new JButton("Voltar");
            limpar = new JButton("Limpar");

            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 100, 20);
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            exibir.setBounds(50, 140, 200, 20);
            divii.setBounds(150, 100, 80, 20);
            voltar.setBounds(50, 230, 80, 20);
            limpar.setBounds(50, 210, 80, 20);
            
            tela4.setBackground(new Color(237,251,235));
            ImageIcon icone= new ImageIcon("L.jpg");
        setIconImage(icone.getImage());
            
        limpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                 
                    texto1.setText("");
                    texto2.setText("");
                    exibir.setVisible(false);
                }
            });
         
         voltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  quintajanela.dispose();
                }
            });

            divii.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1, num2, di;
                    di = 0;
                    num1 = Integer.parseInt(texto1.getText());
                    num2 = Integer.parseInt(texto2.getText());
                    di = num1 / num2;
                    exibir.setVisible(true);
                    exibir.setText("A divisão é: " + di);
                }
            });
            exibir.setVisible(false);

            tela4.add(rotulo1);
            tela4.add(rotulo2);
            tela4.add(texto1);
            tela4.add(texto2);
            tela4.add(exibir);
            tela4.add(divii);
            tela4.add(voltar);
            tela4.add(limpar);

            sair = new JButton("Sair");
            sair.setBounds(50, 250, 80, 20);
            TBai tsair = new TBai();
            sair.addActionListener(tsair);
            tela4.add(sair);
            setSize(400, 400);
            setLocationRelativeTo(null);
        }
    }
    
    private class sobree extends JDialog {
        JButton sair,voltar;
        JLabel rotulo1, rotulo2,rotulo3;

        public sobree(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela5 = getContentPane();
            tela5.setLayout(null);

            // layout do formulário
            rotulo1 = new JLabel("Nome: João Pedro Da Silva Machado Felix ");
            rotulo2 = new JLabel("Data de entrega: 26/06/23 ");
            rotulo3 = new JLabel("Sala e curso:2° - Desenvolvimento de Sistema");
            voltar = new JButton("Voltar");

            rotulo1.setBounds(50, 20, 320, 20);
            rotulo2.setBounds(50, 60, 320, 20);
            rotulo3.setBounds(50, 90, 320, 20);
            voltar.setBounds(50, 230, 80, 20);
            
            tela5.setBackground(new Color(225,245,196));
            ImageIcon icone= new ImageIcon("A.jpg");
        setIconImage(icone.getImage());
        
         
         voltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  sextajanela.dispose();
                }
            });

            tela5.add(rotulo1);
            tela5.add(rotulo2);
            tela5.add(rotulo3);
            tela5.add(voltar);

            sair = new JButton("Sair");
            sair.setBounds(50, 250, 80, 20);
            TBsairrr tsair = new TBsairrr();
            sair.addActionListener(tsair);
            tela5.add(sair);
            setSize(400, 400);
            setLocationRelativeTo(null);
        }
    }
    
    private class TBsairrr implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int status = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o programa?", "Mensagem de saída", JOptionPane.YES_NO_OPTION);
            if (status == JOptionPane.YES_NO_OPTION) {
                sextajanela.setVisible(false);
                sextajanela.dispose();
            }
        }
    }
    
    private class TBai implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int status = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o programa?", "Mensagem de saída", JOptionPane.YES_NO_OPTION);
            if (status == JOptionPane.YES_NO_OPTION) {
                quintajanela.setVisible(false);
                quintajanela.dispose();
            }
        }
    }
    
    private class TBsa implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int status = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o programa?", "Mensagem de saída", JOptionPane.YES_NO_OPTION);
            if (status == JOptionPane.YES_NO_OPTION) {
                quartajanela.setVisible(false);
                quartajanela.dispose();
            }
        }
    }

    private class TBsair implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int status = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o programa?", "Mensagem de saída", JOptionPane.YES_NO_OPTION);
            if (status == JOptionPane.YES_NO_OPTION) {
                segundajanela.setVisible(false);
                segundajanela.dispose();
            }
        }
    }
    
    private class TBsai implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int status = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o programa?", "Mensagem de saída", JOptionPane.YES_NO_OPTION);
            if (status == JOptionPane.YES_NO_OPTION) {
                terceirajanela.setVisible(false);
                terceirajanela.dispose();
            }
        }
    }
}
