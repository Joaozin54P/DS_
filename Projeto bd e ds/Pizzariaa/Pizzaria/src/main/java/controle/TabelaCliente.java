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
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import java.sql.*;


/**
 *
 * @author User
 */
class TabelaCliente extends JFrame {
    Conexao con_pizzaria;
    JLabel rCod,rNome,rEndereco,rTel,rcpf,ra;
    JTextField tcodi,tnome,tendereco,tpes;
    JFormattedTextField tel,ccpf;
    MaskFormatter mTel,mCcpf;
    JButton pri,ant,pro,ult,lim,gra,alt,exc,pes,sa;
    ImageIcon imagens[];
    
    JTable cliente; //datagrid
    JScrollPane scp_tabela; //container para o datagrid
    
    public TabelaCliente()
    {
        Container tela = getContentPane();
        tela.setLayout(null);
        setTitle("Tabela 1 - cliente");
        
        rCod = new JLabel("Código:");
        rNome = new JLabel("Nome:");
        ra = new JLabel("Pesquisa por nome do cliente: ");
        rEndereco = new JLabel("Endereço:");
        rTel = new JLabel("Telefone:");
        rcpf = new JLabel("CPF:");
        tcodi = new JTextField(3);
        tnome = new JTextField(60);
        tendereco = new JTextField(75);
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
        cliente = new javax.swing.JTable();
        scp_tabela = new javax.swing.JScrollPane();
        
        rNome.setBounds(50,55,100,20);
        rCod.setBounds(50,25,100,20);
        rTel.setBounds(50,85,100,20);
        rcpf.setBounds(50,115,100,20);
        rEndereco.setBounds(50,145,100,20);
        tcodi.setBounds(105,25,50,20);
        tnome.setBounds(105,55,200,20);
        tendereco.setBounds(105,145,200,20);
        tpes.setBounds(199,620,155,20);
        cliente.setBounds(50,320,580,250);
        scp_tabela.setBounds(50,350,580,250);
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
        
        ImageIcon imagemFundo = new ImageIcon("cliente.jpg"); // Substitua pelo caminho da sua imagem
        Image imagemRedimensionada = imagemFundo.getImage().getScaledInstance(900, 800, Image.SCALE_SMOOTH);
        ImageIcon imagemFundoRedimensionada = new ImageIcon(imagemRedimensionada);

    JLabel labelFundo = new JLabel(imagemFundoRedimensionada);
    labelFundo.setBounds(0, 0, 900, 800);
        
        try {
    mTel = new MaskFormatter("(##)#####-####");
    mCcpf = new MaskFormatter("###.###.###-##");
    mTel.setPlaceholderCharacter('_');
    mCcpf.setPlaceholderCharacter('_');
} catch(ParseException excp) {}

tel = new JFormattedTextField(mTel); 
ccpf = new JFormattedTextField(mCcpf); 
tel.setBounds(105, 85, 100, 20);
ccpf.setBounds(105, 115, 100, 20);
        
        ImageIcon icone= new ImageIcon("R.jfif");
        setIconImage(icone.getImage());
        
         rCod.setForeground(new Color(209, 49, 61));
         rNome.setForeground(new Color(209, 49, 61));
         rTel.setForeground(new Color(209, 49, 61));
         rcpf.setForeground(new Color(209, 49, 61));
         rEndereco.setForeground(new Color(209, 49, 61));
         ra.setForeground(new Color(209, 49, 61));
         tcodi.setForeground(new Color(209, 49, 61));
         tnome.setForeground(new Color(209, 49, 61));
         tendereco.setForeground(new Color(209, 49, 61));
         tpes.setForeground(new Color(209, 49, 61));
         tel.setForeground(new Color(209, 49, 61));
         ccpf.setForeground(new Color(209, 49, 61));
         
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
                    tnome.setText("");
                    tendereco.setText("");
                    ccpf.setText("");
                    tel.setText("");
                    tcodi.requestFocus();
                    }}});
        
        gra.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   String nome = tnome.getText();
                   String endereco = tendereco.getText();
                   String cpf = ccpf.getText();
                   String telefone = tel.getText();
                   
                   try{
                       String insert_sql = "insert into cliente(Nome_Cliente,Endereco,CPF,Telefone) values ('" + nome + "','" + endereco + "','" + cpf + "','" + telefone + "')";
                       con_pizzaria.statement.executeUpdate(insert_sql);
                       JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                       
                       con_pizzaria.executaSQL("select * from cliente order by Cod_Cliente");
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
                   String endereco = tendereco.getText();
                   String telefone = tel.getText();
                   String cpf = ccpf.getText();
                   String sql;
                   String msg = "";
                   
                   try{
                       if(tcodi.getText().equals("")){
                           sql = "insert into cliente(Nome_Cliente,Endereco,CPF,Telefone) values ('" + nome + "','" + endereco + "','" + cpf + "','" + telefone + "')";
                           msg = "Gravação de um novo registro";
                       }else{
                           sql="update cliente set Nome_Cliente='"  + nome + "', Endereco='" + endereco + "', CPF='" + cpf + "', Telefone='" + telefone + "'where Cod_Cliente=" + tcodi.getText();
                           msg="Alteração de Registro";
                       }
                       
                       con_pizzaria.statement.executeUpdate(sql);
                       JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                       
                       con_pizzaria.executaSQL("select * from cliente order by Cod_Cliente");
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
                         sql = "delete from cliente where Cod_Cliente = " +tcodi.getText();
                     
                    int excluir = con_pizzaria.statement.executeUpdate(sql);
                    if(excluir==1){
                        JOptionPane.showMessageDialog(null,"Exclusao realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                        con_pizzaria.executaSQL("select * from cliente order by Cod_Cliente");
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
                      String pesquisa = "select * from cliente where Nome_Cliente like '" + tpes.getText() + "%'";                       
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
        tela.add(rEndereco);
        tela.add(rTel);
        tela.add(rcpf);
        tela.add(tcodi);
        tela.add(tnome);
        tela.add(tendereco);
        tela.add(tpes);
        tela.add(tel);
        tela.add(ccpf);
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
        tela.add(cliente);
        tela.add(scp_tabela);
        tela.add(labelFundo);
       
        cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        
        cliente.setFont(new java.awt.Font("Arial", 1,12));
        
        cliente.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null,null,null,null,null},
            {null,null,null,null,null},
            {null,null,null,null,null},
            {null,null,null,null,null}
        },
         new String [] {"Código","Nome","Endereço","CPF","Telefone"})
        {
            boolean[] canEdit = new boolean [] {
                false,false,false,false,false};
            
            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];}
            });
        scp_tabela.setViewportView(cliente);
        
        cliente.setAutoCreateRowSorter(true); //ativa a classificação ordenada a tabela
        
        //fim da cofiguração da jtable
        
        
        setSize(900,800);
        setVisible(true);
        setLocationRelativeTo(null);
        
        con_pizzaria.executaSQL("select * from cliente order by Cod_Cliente");
        preencherTabela();
        posicionarRegistro();
        
    }

    public void preencherTabela()
    {
        cliente.getColumnModel().getColumn(0).setPreferredWidth(4);
        cliente.getColumnModel().getColumn(1).setPreferredWidth(80);
        cliente.getColumnModel().getColumn(2).setPreferredWidth(90);
        cliente.getColumnModel().getColumn(3).setPreferredWidth(60);
        cliente.getColumnModel().getColumn(4).setPreferredWidth(70);
        
        DefaultTableModel modelo = (DefaultTableModel) cliente.getModel();
        modelo.setNumRows(0);
        
        try{
            con_pizzaria.resultset.beforeFirst();
            while(con_pizzaria.resultset.next()){
                modelo.addRow(new Object[]{
                con_pizzaria.resultset.getString("Cod_Cliente"),con_pizzaria.resultset.getString("Nome_Cliente"),con_pizzaria.resultset.getString("Endereco"),con_pizzaria.resultset.getString("CPF"),con_pizzaria.resultset.getString("Telefone")
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
          tcodi.setText(con_pizzaria.resultset.getString("Cod_Cliente")); //Associar a caixa de texto ao campo cod
          tnome.setText(con_pizzaria.resultset.getString("Nome_Cliente")); //Associar a caixa de texto ao campo nome
          ccpf.setText(con_pizzaria.resultset.getString("CPF"));//Associar a caixa de texto ao campo data de nascimento
          tel.setText(con_pizzaria.resultset.getString("Telefone"));//Associar a caixa de texto ao campo telefone
          tendereco.setText(con_pizzaria.resultset.getString("Endereco"));//Associar a caixa de texto ao campo email
      }catch(SQLException erro){
          JOptionPane.showMessageDialog(null, "Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      }
    }
  public static void main(String args[])
        {
            TabelaCliente app = new TabelaCliente();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
