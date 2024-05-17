/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import conexao.Conexao;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
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
class PetShop extends JFrame {
    Conexao con_petshop;
    JLabel rCod,Nome,especie,raca,cor,nasc,sexo,ra;
    JTextField tcodi,tnome,tespcie,traca,tcor,tsexo,tpes;
    JFormattedTextField nasci;
    JButton pri,ant,pro,ult,lim,gra,alt,exc,pes,sa;
    ImageIcon imagens[];
    
    JTable pet; //datagrid
    JScrollPane scp_tabela; //container para o datagrid
    
    public PetShop()
    {
        Container tela = getContentPane();
        tela.setLayout(null);
        setTitle("Tabela - Pet");
        
        rCod = new JLabel("Código:");
        Nome = new JLabel("Nome do Pet:");
        especie = new JLabel("Espécie:");
        raca = new JLabel("Raça:");
        cor = new JLabel("Cor:");
        nasc = new JLabel("Nascimento:");
        sexo = new JLabel("Sexo:");
        sa = new JButton("Sair");
        tcodi = new JTextField(3);
        tnome = new JTextField(60);
        tespcie = new JTextField(35);
        traca = new JTextField(75);
        tcor = new JTextField(45);
        tsexo = new JTextField(25);
        tpes = new JTextField(75);
        ra = new JLabel("Pesquisa pelo nome do Pet: ");
        pes = new JButton("pesquisar");
        
        
        try{
            MaskFormatter mNasci = new MaskFormatter("####/##/##");
            mNasci.setPlaceholderCharacter('_');
            
            
            nasci = new JFormattedTextField(mNasci);
            nasci.setBounds(135, 175, 100, 20);
        }catch (java.text.ParseException e){
            e.printStackTrace();
        }
        
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
        
        
        con_petshop = new Conexao();
        con_petshop.conecta();
        
        setResizable(false);
        
        //configuração da Jtable endereco
        pet = new javax.swing.JTable();
        scp_tabela = new javax.swing.JScrollPane();
        
        rCod.setBounds(50,25,100,20);
        Nome.setBounds(50,55,100,20);
        especie.setBounds(50,85,100,20);
        raca.setBounds(50,115,100,20);
        cor.setBounds(50,145,100,20);
        nasc.setBounds(50,175,100,20);
        sexo.setBounds(50,205,100,20);
        tcodi.setBounds(105,25,50,20);
        tnome.setBounds(125,55,200,20);
        tespcie.setBounds(105,85,200,20);
        traca.setBounds(105,115,200,20);
        tcor.setBounds(105,145,200,20);
        tsexo.setBounds(105,205,200,20);
        tpes.setBounds(199,620,155,20);
        pet.setBounds(50,320,580,250);
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
        
        ImageIcon imagemFundo = new ImageIcon("tabela.jpg"); // Substitua pelo caminho da sua imagem
        Image imagemRedimensionada = imagemFundo.getImage().getScaledInstance(900, 800, Image.SCALE_SMOOTH);
        ImageIcon imagemFundoRedimensionada = new ImageIcon(imagemRedimensionada);

    JLabel labelFundo = new JLabel(imagemFundoRedimensionada);
    labelFundo.setBounds(0, 0, 900, 800);
        
        
        ImageIcon icone= new ImageIcon("icon.jpg");
        setIconImage(icone.getImage());
        
         Color corLabels = new Color(75, 75, 85);
        rCod.setForeground(corLabels);
        Nome.setForeground(corLabels);
        especie.setForeground(corLabels);
        raca.setForeground(corLabels);
        cor.setForeground(corLabels);
        nasc.setForeground(corLabels);
        sexo.setForeground(corLabels);
        ra.setForeground(corLabels);
        
        Font fonteLabels = new Font("Bernard MT Condensed",Font.PLAIN,14);
        rCod.setFont(fonteLabels);
        Nome.setFont(fonteLabels);
        especie.setFont(fonteLabels);
        raca.setFont(fonteLabels);
        cor.setFont(fonteLabels);
        nasc.setFont(fonteLabels);
        sexo.setFont(fonteLabels);
        ra.setFont(fonteLabels);
         
        pro.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
            try {
            if (con_petshop.resultset.isLast()) 
            {
                con_petshop.resultset.first(); 
            } else {
                con_petshop.resultset.next(); 
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
                        con_petshop.resultset.first();
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
            if (con_petshop.resultset.isLast()) 
            {
                con_petshop.resultset.first(); 
            } else {
                con_petshop.resultset.next(); 
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
                        con_petshop.resultset.last();
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
                    tespcie.setText("");
                    traca.setText("");
                    tcor.setText("");
                    nasci.setText("");
                    tsexo.setText("");
                    tcodi.requestFocus();
                    }}});
        
        gra.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   String nome = tnome.getText();
                   String especie = tespcie.getText();
                   String raca = traca.getText();
                   String cor = tcor.getText();
                   String nascimento = nasci.getText();
                   String sexo = tsexo.getText();
                   
                   try{
                       String insert_sql = "insert into pet(nome_pet,especie,raca,cor,nascimento,sexo) values ('" + nome + "','" + especie + "','" + raca + "','" + cor + "','" + nascimento + "','" + sexo + "')";
                       con_petshop.statement.executeUpdate(insert_sql);
                       JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                       
                       con_petshop.executaSQL("select * from pet order by num_registro");
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
                   String especie = tespcie.getText();
                   String raca = traca.getText();
                   String cor = tcor.getText();
                   String nascimento = nasci.getText();
                   String sexo = tsexo.getText();
                   String sql;
                   String msg = "";
                   
                   try{
                       if(tcodi.getText().equals("")){
                           sql = "insert into pet(nome_pet,especie,raca,cor,nascimento,sexo) values ('" + nome + "','" + especie + "','" + raca + "','" + cor + "','" + nascimento + "','" + sexo + "')";
                           msg = "Gravação de um novo registro";
                       }else{
                           sql="update pet set nome_pet='"  + nome + "', especie='" + especie + "', raca='" + raca + "', cor='" + cor + "', nascimento='"+ nascimento + "', sexo='" + sexo + "'where num_registro=" + tcodi.getText();
                           msg="Alteração de Registro";
                       }
                       
                       con_petshop.statement.executeUpdate(sql);
                       JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                       
                       con_petshop.executaSQL("select * from pet order by num_registro");
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
                         sql = "delete from pet where num_registro = " +tcodi.getText();
                     
                    int excluir = con_petshop.statement.executeUpdate(sql);
                    if(excluir==1){
                        JOptionPane.showMessageDialog(null,"Exclusao realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                        con_petshop.executaSQL("select * from pet order by num_registro");
                        con_petshop.resultset.first();
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
                      String pesquisa = "select * from pet where nome_pet like '" + tpes.getText() + "%' or especie like '%" + tpes.getText() + "%'";                       
                       con_petshop.executaSQL(pesquisa);
                       
                       if(con_petshop.resultset.first()){
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
            TelaInicial telaAnterior = new TelaInicial();
            telaAnterior.setVisible(true);
            dispose();
        }
    }
});

        
        tela.add(rCod);
        tela.add(Nome);
        tela.add(especie);
        tela.add(raca);
        tela.add(cor);
        tela.add(nasc);
        tela.add(sexo);
        tela.add(tcodi);
        tela.add(tnome);
        tela.add(tespcie);
        tela.add(traca);
        tela.add(tcor);
        tela.add(nasci);
        tela.add(tsexo);
        tela.add(tpes);
        tela.add(ra);
        tela.add(pes);
        tela.add(pri);
        tela.add(ant);
        tela.add(pro);
        tela.add(ult);
        tela.add(lim);
        tela.add(gra);
        tela.add(alt);
        tela.add(sa);
        tela.add(exc);
        tela.add(pet);
        tela.add(scp_tabela);
        tela.add(labelFundo);
       
        pet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        
        pet.setFont(new java.awt.Font("Arial", 1,12));
        
        pet.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null}
        },
         new String [] {"Código","Nome do pet","Especie","Raca","Cor","Nascimento","Sexo"})
        {
            boolean[] canEdit = new boolean [] {
                false,false,false,false,false,false,false};
            
            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];}
            });
        scp_tabela.setViewportView(pet);
        
        pet.setAutoCreateRowSorter(true); //ativa a classificação ordenada a tabela
        
        //fim da cofiguração da jtable
        
        
        setSize(900,800);
        setVisible(true);
        setLocationRelativeTo(null);
        
        con_petshop.executaSQL("select * from pet order by num_registro");
        preencherTabela();
        posicionarRegistro();
        
    }

    public void preencherTabela()
    {
        pet.getColumnModel().getColumn(0).setPreferredWidth(4);
        pet.getColumnModel().getColumn(1).setPreferredWidth(65);
        pet.getColumnModel().getColumn(2).setPreferredWidth(25);
        pet.getColumnModel().getColumn(3).setPreferredWidth(80);
        pet.getColumnModel().getColumn(4).setPreferredWidth(40);
        pet.getColumnModel().getColumn(5).setPreferredWidth(35);
        pet.getColumnModel().getColumn(6).setPreferredWidth(15);
        
        DefaultTableModel modelo = (DefaultTableModel) pet.getModel();
        modelo.setNumRows(0);
        
        try{
            con_petshop.resultset.beforeFirst();
            while(con_petshop.resultset.next()){
                modelo.addRow(new Object[]{
                con_petshop.resultset.getString("num_registro"),con_petshop.resultset.getString("nome_pet"),con_petshop.resultset.getString("especie"),con_petshop.resultset.getString("raca"),con_petshop.resultset.getString("cor"),con_petshop.resultset.getString("nascimento"),con_petshop.resultset.getString("sexo")
            });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "\n Erro ao listar dados da tabela!!:\n" +erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
  public void posicionarRegistro()
  {
      try{
          con_petshop.resultset.first(); //posiciona no 1° registro da tabela
          mostrar_Dados(); //chama o método que irá bustar o dado da tabela
      }catch(SQLException erro){
          JOptionPane.showMessageDialog(null, "Não foi possível posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      }
  }
  public void mostrar_Dados()
  {
      try{
          tcodi.setText(con_petshop.resultset.getString("num_registro")); //Associar a caixa de texto ao campo cod
          tnome.setText(con_petshop.resultset.getString("nome_pet")); //Associar a caixa de texto ao campo nome
          tespcie.setText(con_petshop.resultset.getString("especie"));//Associar a caixa de texto ao campo data de nascimento
          traca.setText(con_petshop.resultset.getString("raca"));//Associar a caixa de texto ao campo telefone
          tcor.setText(con_petshop.resultset.getString("cor"));//Associar a caixa de texto ao campo email
          nasci.setText(con_petshop.resultset.getString("nascimento"));//Associar a caixa de texto ao campo email
          tsexo.setText(con_petshop.resultset.getString("sexo"));//Associar a caixa de texto ao campo email
      }catch(SQLException erro){
          JOptionPane.showMessageDialog(null, "Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      }
    }
  public static void main(String args[])
        {
            PetShop app = new PetShop();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
