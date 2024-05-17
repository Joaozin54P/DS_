/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.awt.*;
import java.text.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author dti
 */
public class FrmTelaCad extends JFrame
{
    Conexao con_cliente;
    JLabel rCodigo,rNome,rEmail,rTel,rData,ra;
    JTextField tcodigo,tnome,temail,tpes;
    JFormattedTextField tel,data;
    MaskFormatter mTel,mData;
    JButton pri,ant,pro,ult,lim,gra,alt,exc,nr,pes,sa;
    
    JTable tblClientes; //datagrid
    JScrollPane scp_tabela; //container para o datagrid
    
    public FrmTelaCad()
    {
        Container tela = getContentPane();
        tela.setLayout(null);
        
        pri = new JButton("Primeiro");
        ant = new JButton("Anterior");
        pro = new JButton("Próximo");
        ult = new JButton("Último");
        lim = new JButton("Limpar");
        gra = new JButton("Gravar");
        alt = new JButton("Alterar");
        sa = new JButton("Sair");
        exc = new JButton("Excluir");
        pes = new JButton("Pesquisar");
        nr = new JButton("Novo Registro");
        rCodigo = new JLabel("Código:");
        rNome = new JLabel("Nome:");
        ra = new JLabel("Pesquisa por nome do cliente: ");
        rEmail = new JLabel("Email:");
        rTel = new JLabel("Telefone:");
        rData = new JLabel("Data:");
        tcodigo = new JTextField(3);
        tnome = new JTextField(60);
        temail = new JTextField(75);
        tpes = new JTextField(75);
        
        con_cliente = new Conexao();
        con_cliente.conecta();
        
        setTitle("Conexão Java com MySql");
        setResizable(false);
        
        //configuração da Jtable
        tblClientes = new javax.swing.JTable();
        scp_tabela = new javax.swing.JScrollPane();
        
        rNome.setBounds(50,55,100,20);
        rCodigo.setBounds(50,25,100,20);
        rTel.setBounds(50,85,100,20);
        rData.setBounds(50,115,100,20);
        rEmail.setBounds(50,145,100,20);
        tcodigo.setBounds(105,25,50,20);
        tnome.setBounds(105,55,200,20);
        temail.setBounds(105,145,200,20);
        tpes.setBounds(199,620,155,20);
        tblClientes.setBounds(50,320,580,250);
        scp_tabela.setBounds(50,320,580,250);
        pri.setBounds(375,210,95,20);
        pro.setBounds(45,210,95,20);
        ant.setBounds(145,210,95,20);
        ult.setBounds(245,210,95,20);
        lim.setBounds(468,240,95,20);
        gra.setBounds(555,240,95,20);
        alt.setBounds(466,210,95,20);
        exc.setBounds(555,210,95,20);
        nr.setBounds(650,210,140,20);
        pes.setBounds(350,620,95,20);
        ra.setBounds(20,620,180,20);
        sa.setBounds(660,620,95,20);
        
        try {
    mTel = new MaskFormatter("(##)#####-####");
    mData = new MaskFormatter("##/##/####");
    mTel.setPlaceholderCharacter('_');
    mData.setPlaceholderCharacter('_');
} catch(ParseException excp) {}

tel = new JFormattedTextField(); 
data = new JFormattedTextField(mData); 
tel.setBounds(105, 85, 100, 20);
data.setBounds(105, 115, 100, 20);
        
        tela.setBackground(new Color(88, 104, 117));
        ImageIcon icone= new ImageIcon("R.jpg");
        setIconImage(icone.getImage());
        
         rCodigo.setForeground(new Color(165, 200, 202));
         rNome.setForeground(new Color(165, 200, 202));
         rTel.setForeground(new Color(165, 200, 202));
         rData.setForeground(new Color(165, 200, 202));
         rEmail.setForeground(new Color(165, 200, 202));
         ra.setForeground(new Color(165, 200, 202));
         tcodigo.setForeground(new Color(88, 104, 117));
         tnome.setForeground(new Color(88, 104, 117));
         temail.setForeground(new Color(88, 104, 117));
         tpes.setForeground(new Color(88, 104, 117));
         tel.setForeground(new Color(88, 104, 117));
         data.setForeground(new Color(88, 104, 117));
         
        pro.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
            try {
            if (con_cliente.resultset.isLast()) 
            {
                con_cliente.resultset.first(); 
            } else {
                con_cliente.resultset.next(); 
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
                        con_cliente.resultset.first();
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
            if (con_cliente.resultset.isLast()) 
            {
                con_cliente.resultset.first(); 
            } else {
                con_cliente.resultset.next(); 
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
                        con_cliente.resultset.last();
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
                    tcodigo.setText("");
                    tnome.setText("");
                    temail.setText("");
                    data.setText("");
                    tel.setText("");
                    tcodigo.requestFocus();
                    }}});
        
        gra.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   String nome = tnome.getText();
                   String data_nasc = data.getText();
                   String telefone = tel.getText();
                   String email = temail.getText();
                   
                   try{
                       String insert_sql = "insert into tbclientes(nome,telefone,email,dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
                       con_cliente.statement.executeUpdate(insert_sql);
                       JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                       
                       con_cliente.executaSQL("select * from tbclientes order by cod");
                       preencherTabela();
                   }catch(SQLException errosql){
                       JOptionPane.showMessageDialog(null, "\n Erro na gravação:\n "+errosql,"Mensagem doPrograma",JOptionPane.INFORMATION_MESSAGE);
                   }
                    }});
        
        alt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   String nome = tnome.getText();
                   String data_nasc = data.getText();
                   String telefone = tel.getText();
                   String email = temail.getText();
                   String sql;
                   String msg = "";
                   
                   try{
                       if(tcodigo.getText().equals("")){
                           sql = "insert into tbclientes(nome,telefone,email,dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
                           msg = "Gravação de um novo registro";
                       }else{
                           sql="update tbclientes set nome='"  + nome + "', telefone='" + telefone + "', email='" + email + "', dt_nasc='" + data_nasc + "'where cod=" + tcodigo.getText();
                           msg="Alteração de Registro";
                       }
                       
                       con_cliente.statement.executeUpdate(sql);
                       JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                       
                       con_cliente.executaSQL("select * from tbclientes order by cod");
                       preencherTabela();
                   }catch(SQLException errosql){
                       JOptionPane.showMessageDialog(null, "\n Erro na gravação:\n "+errosql,"Mensagem doPrograma",JOptionPane.INFORMATION_MESSAGE);
                   }
                    }});
        
         exc.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   String sql;
                 try{
                     int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confimar Exclusão", JOptionPane.YES_NO_OPTION,3);
                     if (resposta==0){
                         sql = "delete from tbclientes where cod = " +tcodigo.getText();
                     
                    int excluir = con_cliente.statement.executeUpdate(sql);
                    if(excluir==1){
                        JOptionPane.showMessageDialog(null,"Exclusao realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                        con_cliente.executaSQL("select * from tbclientes order by cod");
                        con_cliente.resultset.first();
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
                      String pesquisa = "select * from tbclientes where nome like '" + tpes.getText() + "%'";                       
                       con_cliente.executaSQL(pesquisa);
                       
                       if(con_cliente.resultset.first()){
                           preencherTabela();
                       }
                       else{
                           JOptionPane.showMessageDialog(null, "\n Não existe dados com esse paramêtro!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                       }
                   }catch(SQLException errosql){
                       JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!! :\n "+errosql,"Mensagem doPrograma",JOptionPane.INFORMATION_MESSAGE);
                   }
                    }}); 
         
         sa.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int opcao;
                    Object[] botoes = {"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja sair?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    
                    if (opcao==JOptionPane.YES_OPTION)
                    System.exit(0);}});
        
        tela.add(rCodigo);
        tela.add(rNome);
        tela.add(rEmail);
        tela.add(rTel);
        tela.add(rData);
        tela.add(tcodigo);
        tela.add(tnome);
        tela.add(temail);
        tela.add(tpes);
        tela.add(tel);
        tela.add(data);
        tela.add(pri);
        tela.add(pro);
        tela.add(ant);
        tela.add(ult);
        tela.add(lim);
        tela.add(gra);
        tela.add(alt);
        tela.add(exc);
        tela.add(nr);
        tela.add(sa);
        tela.add(pes);
        tela.add(ra);
        tela.add(tblClientes);
        tela.add(scp_tabela);
        
        tblClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        
        tblClientes.setFont(new java.awt.Font("Arial", 1,12));
        
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null,null,null,null,null},
            {null,null,null,null,null},
            {null,null,null,null,null},
            {null,null,null,null,null}
        },
         new String [] {"Código","Nome","Data Nascimento","Telefone","Email"})
        {
            boolean[] canEdit = new boolean [] {
                false,false,false,false,false};
            
            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];}
            });
        scp_tabela.setViewportView(tblClientes);
        
        tblClientes.setAutoCreateRowSorter(true); //ativa a classificação ordenada a tabela
        
        //fim da cofiguração da jtable
        
        
        setSize(900,800);
        setVisible(true);
        setLocationRelativeTo(null);
        
        con_cliente.executaSQL("select * from tbclientes order by cod");
        preencherTabela();
        posicionarRegistro();
        
    }
    public void preencherTabela()
    {
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(11);
        tblClientes.getColumnModel().getColumn(3).setPreferredWidth(14);
        tblClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        
        try{
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                con_cliente.resultset.getString("cod"),con_cliente.resultset.getString("nome"),con_cliente.resultset.getString("dt_nasc"),con_cliente.resultset.getString("telefone"),con_cliente.resultset.getString("email")
            });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "\n Erro ao listar dados da tabela!!:\n" +erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
  public void posicionarRegistro()
  {
      try{
          con_cliente.resultset.first(); //posiciona no 1° registro da tabela
          mostrar_Dados(); //chama o método que irá bustar o dado da tabela
      }catch(SQLException erro){
          JOptionPane.showMessageDialog(null, "Não foi possível posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      }
  }
  public void mostrar_Dados()
  {
      try{
          tcodigo.setText(con_cliente.resultset.getString("cod")); //Associar a caixa de texto ao campo cod
          tnome.setText(con_cliente.resultset.getString("nome")); //Associar a caixa de texto ao campo nome
          data.setText(con_cliente.resultset.getString("dt_nasc"));//Associar a caixa de texto ao campo data de nascimento
          tel.setText(con_cliente.resultset.getString("telefone"));//Associar a caixa de texto ao campo telefone
          temail.setText(con_cliente.resultset.getString("email"));//Associar a caixa de texto ao campo email
      }catch(SQLException erro){
          JOptionPane.showMessageDialog(null, "Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      }
  }
  public static void main(String args[])
        {
            FrmTelaCad app = new FrmTelaCad();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}