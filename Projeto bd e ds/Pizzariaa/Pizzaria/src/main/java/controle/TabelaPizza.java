/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import conexao.Conexao;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author dti
 */
public class TabelaPizza extends JFrame {
    Conexao con_pizzaria;
    JLabel rCod,rNome,ra;
    JTextField tcodi,tsabo,tpes;
    JButton pri,ant,pro,ult,lim,gra,alt,exc,pes,sa;
    ImageIcon imagens[];
    
    JTable pizza; //datagrid
    JScrollPane scp_tabela; //container para o datagrid
    
    public TabelaPizza()
    {
        Container tela = getContentPane();
        tela.setLayout(null);
        setTitle("Tabela 2 - Pizza");
        
        rCod = new JLabel("Código:");
        rNome = new JLabel("sabor:");
        ra = new JLabel("Pesquisa por nome da pizza: ");
        tcodi = new JTextField(3);
        tsabo = new JTextField(60);
        tpes = new JTextField(75);
        pes = new JButton("pesquisar");
        sa = new JButton("Sair");
        
        String icones[] = {"ima/primeiro.png", "ima/anterior.png",
    "ima/proximo.png", "ima/ultimo.png",
    "ima/limpar.png", "ima/salvar.png", "ima/alterar.png", "ima/excluir.png"};

        
         ImageIcon[] imagensRedimensionadas = new ImageIcon[9];
        for (int i = 0; i < 8; i++) {
            ImageIcon imagemOriginal = new ImageIcon(icones[i]);
            Image imagemRedimensionada = imagemOriginal.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH); // Ajuste o tamanho conforme necessário
            imagensRedimensionadas[i] = new ImageIcon(imagemRedimensionada);
        }

        // Criar botões com imagens redimensionadas
        pri = new JButton(imagensRedimensionadas[0]);
        ant = new JButton(imagensRedimensionadas[1]);
        pro = new JButton(imagensRedimensionadas[2]);
        ult = new JButton(imagensRedimensionadas[3]);
        lim = new JButton(imagensRedimensionadas[4]);
        gra = new JButton(imagensRedimensionadas[5]);
        alt = new JButton(imagensRedimensionadas[6]);
        exc = new JButton(imagensRedimensionadas[7]);
        
        con_pizzaria = new Conexao();
        con_pizzaria.conecta();
        
        setResizable(false);
        
        //configuração da Jtable
        pizza = new javax.swing.JTable();
        scp_tabela = new javax.swing.JScrollPane();
        
        rNome.setBounds(50,55,100,20);
        rCod.setBounds(50,25,100,20);
        tcodi.setBounds(105,25,50,20);
        tsabo.setBounds(105,55,200,20);
        tpes.setBounds(199,620,155,20);
        pizza.setBounds(50,320,580,250);
        scp_tabela.setBounds(50,320,580,250);
        pri.setBounds(375,250,95,20);
        pro.setBounds(45,250,95,20);
        ant.setBounds(145,250,95,20);
        ult.setBounds(245,250,95,20);
        lim.setBounds(475,250,95,20);
        gra.setBounds(475,280,95,20);
        alt.setBounds(375,280,95,20);
        exc.setBounds(575,250,95,20);
        pes.setBounds(350,620,95,20);
        ra.setBounds(20,620,180,20);
        sa.setBounds(660,620,95,20);
        
        pri.setToolTipText("Primeiro");
        ant.setToolTipText("Anterior");
        pro.setToolTipText("Próximo");
        ult.setToolTipText("Último");
        lim.setToolTipText("Limpar");
        gra.setToolTipText("Gravar");
        alt.setToolTipText("Alterar");
        exc.setToolTipText("Excluir");
        pes.setToolTipText("Pesquisar");
        sa.setToolTipText("Sair");
        
        ImageIcon imagemFundo = new ImageIcon("pizza.jpg"); // Substitua pelo caminho da sua imagem
        Image imagemRedimensionada = imagemFundo.getImage().getScaledInstance(900, 800, Image.SCALE_SMOOTH);
        ImageIcon imagemFundoRedimensionada = new ImageIcon(imagemRedimensionada);

    JLabel labelFundo = new JLabel(imagemFundoRedimensionada);
    labelFundo.setBounds(0, 0, 900, 800);
       
        
        ImageIcon icone= new ImageIcon("R.jfif");
        setIconImage(icone.getImage());
        
         rCod.setForeground(new Color(209, 49, 61));
         rNome.setForeground(new Color(209, 49, 61));
         ra.setForeground(new Color(209, 49, 61));
         tcodi.setForeground(new Color(209, 49, 61));
         tsabo.setForeground(new Color(209, 49, 61));
         tpes.setForeground(new Color(209, 49, 61));
         
        pro.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
            try {
            if (con_pizzaria.resultset.isLast()) 
            {
                con_pizzaria.resultset.first(); 
            } else {
                con_pizzaria.resultset.next(); 
            }
            mostrar_Dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o próximo registro", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }}});
        
        pri.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    try{
                        con_pizzaria.resultset.first();
                        mostrar_Dados();
                    }catch(SQLException erro){
                        JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro");
                    }
                }});
        
        ant.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
            try {
            if (con_pizzaria.resultset.isLast()) 
            {
                con_pizzaria.resultset.first(); 
            } else {
                con_pizzaria.resultset.next(); 
            }
            mostrar_Dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o próximo registro", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }}});
        
        ult.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    try{
                        con_pizzaria.resultset.last();
                        mostrar_Dados();
                    }catch(SQLException erro){
                        JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro");
                    }
                }});
        
        lim.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int opcao;
                    Object[] botoes = {"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo limpar seus dados?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    
                    if (opcao==JOptionPane.YES_OPTION){
                    tcodi.setText("");
                    tsabo.setText("");
                    tcodi.requestFocus();
                    }}});
        
        gra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sabor = tsabo.getText();

                try {
                    String insert_sql = "insert into pizza(Sabores) values ('" + sabor + "')";
                    con_pizzaria.statement.executeUpdate(insert_sql);
                    JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                    con_pizzaria.executaSQL("select * from pizza order by Cod_Pizza");
                    preencherTabela();
                } catch (SQLException errosql) {
                    JOptionPane.showMessageDialog(null, "\n Erro na gravação:\n " + errosql, "Mensagem doPrograma", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        alt.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String sabor = tsabo.getText();
        String sql;
        String msg = "";

        try {
            if (tcodi.getText().equals("")) {
                sql = "insert into pizza(Sabores) values ('" + sabor + "')";
                msg = "Gravação de um novo registro";
            } else {
                sql = "update pizza set Sabores='" + sabor + "' where Cod_Pizza=" + tcodi.getText();
                msg = "Alteração de Registro";
            }

            con_pizzaria.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

            con_pizzaria.executaSQL("select * from pizza order by Cod_Pizza");
            preencherTabela();
        } catch (SQLException errosql) {
            JOptionPane.showMessageDialog(null, "\n Erro na gravação:\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
});

        
         exc.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   String sql;
                 try{
                     int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confimar Exclusão", JOptionPane.YES_NO_OPTION,3);
                     if (resposta==0){
                         sql = "delete from pizza where Cod_Pizza = " +tcodi.getText();
                     
                    int excluir = con_pizzaria.statement.executeUpdate(sql);
                    if(excluir==1){
                        JOptionPane.showMessageDialog(null,"Exclusao realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                        con_pizzaria.executaSQL("select * from pizza order by Cod_Pizza");
                        con_pizzaria.resultset.first();
                        preencherTabela();
                        posicionarRegistro();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Operações cancelada pelo usuário!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE); 
                    }
                     }
                 }catch(SQLException excecao){
                     JOptionPane.showMessageDialog(null, "Erro na exclusão: "+excecao,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                 }
                    }});
         
         pes.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   try{
                      String pesquisa = "select * from pizza where Sabores like '" + tpes.getText() + "%'";                       
                       con_pizzaria.executaSQL(pesquisa);
                       
                       if(con_pizzaria.resultset.first()){
                           preencherTabela();
                       }
                       else{
                           JOptionPane.showMessageDialog(null, "\n Não existe dados com esse paramêtro!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                       }
                   }catch(SQLException errosql){
                       JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!! :\n "+errosql,"Mensagem doPrograma",JOptionPane.INFORMATION_MESSAGE);
                   }
                    }}); 
         
         sa.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
            int opcao;
            Object[] botoes = {"Sim", "Não"};
            opcao = JOptionPane.showOptionDialog(null, "Deseja sair?", "Fechar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);

            if (opcao == JOptionPane.YES_OPTION) {
            FrmTelaCad telaAnterior = new FrmTelaCad();
            telaAnterior.setVisible(true);
            dispose();
        }
    }
});

        
        tela.add(rCod);
        tela.add(rNome);
        tela.add(tcodi);
        tela.add(tsabo);
        tela.add(tpes);
        tela.add(pri);
        tela.add(pro);
        tela.add(ant);
        tela.add(ult);
        tela.add(lim);
        tela.add(gra);
        tela.add(alt);
        tela.add(exc);
        tela.add(sa);
        tela.add(pes);
        tela.add(ra);
        tela.add(pizza);
        tela.add(scp_tabela);
        tela.add(labelFundo);
       
        pizza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        
        pizza.setFont(new java.awt.Font("Arial", 1,12));
        
        pizza.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null,null},
            {null,null,},
            {null,null},
            {null,null}
        },
         new String [] {"Código","Sabores"})
        {
            boolean[] canEdit = new boolean [] {
                false,false};
            
            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];}
            });
        scp_tabela.setViewportView(pizza);
        
        pizza.setAutoCreateRowSorter(true); //ativa a classificação ordenada a tabela
        
        //fim da cofiguração da jtable
        
        
        setSize(900,800);
        setVisible(true);
    setLocationRelativeTo(null);
        
        con_pizzaria.executaSQL("select * from pizza order by Cod_Pizza");
        preencherTabela();
        posicionarRegistro();
        
    }

    public void preencherTabela()
    {
        pizza.getColumnModel().getColumn(0).setPreferredWidth(4);
        pizza.getColumnModel().getColumn(1).setPreferredWidth(80);
        
        DefaultTableModel modelo = (DefaultTableModel) pizza.getModel();
        modelo.setNumRows(0);
        
        try{
            con_pizzaria.resultset.beforeFirst();
            while(con_pizzaria.resultset.next()){
                modelo.addRow(new Object[]{
                con_pizzaria.resultset.getString("Cod_Pizza"),con_pizzaria.resultset.getString("Sabores")
            });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "\n Erro ao listar dados da tabela!!:\n" +erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
  public void posicionarRegistro()
  {
      try{
          con_pizzaria.resultset.first(); //posiciona no 1° registro da tabela
          mostrar_Dados(); //chama o método que irá bustar o dado da tabela
      }catch(SQLException erro){
          JOptionPane.showMessageDialog(null, "Não foi possível posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      }
  }
  public void mostrar_Dados()
  {
      try{
          tcodi.setText(con_pizzaria.resultset.getString("Cod_Pizza")); //Associar a caixa de texto ao campo cod
          tsabo.setText(con_pizzaria.resultset.getString("Sabores")); //Associar a caixa de texto ao campo nome
      }catch(SQLException erro){
          JOptionPane.showMessageDialog(null, "Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      }
    }
  public static void main(String args[])
        {
            TabelaPizza app = new TabelaPizza();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}