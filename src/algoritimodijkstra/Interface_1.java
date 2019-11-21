/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimodijkstra;


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class Interface_1 extends javax.swing.JFrame {

    /**
     * Creates new form Interface_1
     */
    List<Vertice> menorCaminho = new LinkedList<Vertice>();
    Map<String, JLabel> nomes = new HashMap<>();

    public Map<String, JLabel> inicializarNomes(Map mapa) {
        List<JLabel> labels = new ArrayList<JLabel>();
        labels.add(Capinopolis);
        labels.add(Ituiutaba);
        labels.add(Douradinhos);
        labels.add(Monte_Alegre_de_Minas);
        labels.add(Tapaciguara);
        labels.add(Itumbiara);
        labels.add(Centralina);
        labels.add(Uberlandia);
        labels.add(Araguari);
        labels.add(Cascalho_Rico);
        labels.add(Grupiara);
        labels.add(Estrela_do_Sul);
        labels.add(Romaria);
        labels.add(Sao_Juliana);
        labels.add(Indianopolis);

        nomes.put("Capinópolis", Capinopolis);
        nomes.put("Ituiutaba", Ituiutaba);
        nomes.put("Douradinhos", Douradinhos);
        nomes.put("Monte Alegre de Minas", Monte_Alegre_de_Minas);
        nomes.put("Tapaciguara", Tapaciguara);
        nomes.put("Itumbiara", Itumbiara);
        nomes.put("Centralina", Centralina);
        nomes.put("Uberlândia", Uberlandia);
        nomes.put("Araguari", Araguari);
        nomes.put("Cascalho Rico", Cascalho_Rico);
        nomes.put("Grupiara", Grupiara);
        nomes.put("Estrela do Sul", Estrela_do_Sul);
        nomes.put("Romaria", Romaria);
        nomes.put("São Juliana", Sao_Juliana);
        nomes.put("Indianópolis", Indianopolis);
        return mapa;
    }

    public Grafo inicializargrafo() {
        List<Aresta> aresta = new ArrayList<Aresta>();

        Vertice Capinopolis = new Vertice("Capinópolis");
        Vertice Ituiutaba = new Vertice("Ituiutaba");
        Vertice Douradinhos = new Vertice("Douradinhos");
        Vertice Monte_Alegre_de_Minas = new Vertice("Monte Alegre de Minas");
        Vertice Tapaciguara = new Vertice("Tapaciguara");
        Vertice Itumbiara = new Vertice("Itumbiara");
        Vertice Centralina = new Vertice("Centralina");
        Vertice Uberlandia = new Vertice("Uberlândia");
        Vertice Araguari = new Vertice("Araguari");
        Vertice Cascalho_Rico = new Vertice("Cascalho Rico");
        Vertice Grupiara = new Vertice("Grupiara");
        Vertice Estrela_do_Sul = new Vertice("Estrela do Sul");
        Vertice Romaria = new Vertice("Romaria");
        Vertice Sao_Juliana = new Vertice("São Juliana");
        Vertice Indianopolis = new Vertice("Indianópolis");

        aresta.add(new Aresta(Capinopolis, Centralina, 40));
        aresta.add(new Aresta(Centralina, Itumbiara, 20));
        aresta.add(new Aresta(Itumbiara, Tapaciguara, 55));
        aresta.add(new Aresta(Tapaciguara, Monte_Alegre_de_Minas, 44));
        aresta.add(new Aresta(Monte_Alegre_de_Minas, Centralina, 75));
        aresta.add(new Aresta(Monte_Alegre_de_Minas, Ituiutaba, 85));
        aresta.add(new Aresta(Monte_Alegre_de_Minas, Douradinhos, 28));
        aresta.add(new Aresta(Douradinhos, Ituiutaba, 90));
        aresta.add(new Aresta(Ituiutaba, Capinopolis, 30));
        aresta.add(new Aresta(Uberlandia, Monte_Alegre_de_Minas, 60));
        aresta.add(new Aresta(Uberlandia, Tapaciguara, 60));
        aresta.add(new Aresta(Uberlandia, Douradinhos, 63));
        aresta.add(new Aresta(Uberlandia, Araguari, 30));
        aresta.add(new Aresta(Uberlandia, Indianopolis, 45));
        aresta.add(new Aresta(Uberlandia, Romaria, 78));
        aresta.add(new Aresta(Indianopolis, Sao_Juliana, 40));
        aresta.add(new Aresta(Sao_Juliana, Romaria, 28));
        aresta.add(new Aresta(Romaria, Estrela_do_Sul, 27));
        aresta.add(new Aresta(Estrela_do_Sul, Araguari, 34));
        aresta.add(new Aresta(Estrela_do_Sul, Grupiara, 38));
        aresta.add(new Aresta(Grupiara, Cascalho_Rico, 32));
        aresta.add(new Aresta(Cascalho_Rico, Araguari, 28));

        Grafo grafo = new Grafo();
        grafo.addVertice(Capinopolis);
        grafo.addVertice(Ituiutaba);
        grafo.addVertice(Douradinhos);
        grafo.addVertice(Monte_Alegre_de_Minas);
        grafo.addVertice(Tapaciguara);
        grafo.addVertice(Itumbiara);
        grafo.addVertice(Centralina);
        grafo.addVertice(Uberlandia);
        grafo.addVertice(Araguari);
        grafo.addVertice(Cascalho_Rico);
        grafo.addVertice(Grupiara);
        grafo.addVertice(Estrela_do_Sul);
        grafo.addVertice(Romaria);
        grafo.addVertice(Sao_Juliana);
        grafo.addVertice(Indianopolis);

        return grafo;
    }

    public Interface_1() {
        initComponents();
        inicializargrafo();
        inicializarNomes(nomes);
    }

    public void addAresta(Vertice origem, Vertice destino, Integer tamanho) {
        origem.addAdjacente(destino, tamanho);
        destino.addAdjacente(origem, tamanho);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jcbInicio = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jcbFim = new javax.swing.JComboBox<>();
        Itumbiara = new javax.swing.JLabel();
        Centralina = new javax.swing.JLabel();
        Monte_Alegre_de_Minas = new javax.swing.JLabel();
        Ituiutaba = new javax.swing.JLabel();
        Douradinhos = new javax.swing.JLabel();
        Uberlandia = new javax.swing.JLabel();
        Capinopolis = new javax.swing.JLabel();
        Sao_Juliana = new javax.swing.JLabel();
        Indianopolis = new javax.swing.JLabel();
        Araguari = new javax.swing.JLabel();
        Romaria = new javax.swing.JLabel();
        Cascalho_Rico = new javax.swing.JLabel();
        Grupiara = new javax.swing.JLabel();
        Tapaciguara = new javax.swing.JLabel();
        Estrela_do_Sul = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtDistanciaTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/Cidades.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capinópolis", "Ituiutaba", "Douradinhos", "Monte Alegre de Minas", "Tapaciguara", "Itumbiara", "Centralina", "Uberlândia", "Araguari", "Cascalho Rico", "Grupiara", "Estrela do Sul", "Romaria", "São Juliana", "Indianópolis" }));
        jcbInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbInicioActionPerformed(evt);
            }
        });
        jPanel1.add(jcbInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        jLabel3.setText("Inicio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jLabel4.setText("Fim");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, -1));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 74, -1));

        jcbFim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Capinópolis", "Ituiutaba", "Douradinhos", "Monte Alegre de Minas", "Tapaciguara", "Itumbiara", "Centralina", "Uberlândia", "Araguari", "Cascalho Rico", "Grupiara", "Estrela do Sul", "Romaria", "São Juliana", "Indianópolis" }));
        jcbFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFimActionPerformed(evt);
            }
        });
        jPanel1.add(jcbFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, -1, -1));

        Itumbiara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Itumbiara, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 50, 40));

        Centralina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Centralina, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 50, 40));

        Monte_Alegre_de_Minas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Monte_Alegre_de_Minas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 50, 50));

        Ituiutaba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Ituiutaba, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, 40));

        Douradinhos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Douradinhos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 50, -1));

        Uberlandia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Uberlandia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 50, 50));

        Capinopolis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Capinopolis, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 40));

        Sao_Juliana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Sao_Juliana, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 50, 50));

        Indianopolis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Indianopolis, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 50, 40));

        Araguari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Araguari, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 50, 40));

        Romaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Romaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, -1, -1));

        Cascalho_Rico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Cascalho_Rico, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, -1, 40));

        Grupiara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Grupiara, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 50, 50));

        Tapaciguara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Tapaciguara, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 50, 40));

        Estrela_do_Sul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"))); // NOI18N
        jPanel1.add(Estrela_do_Sul, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, -1, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/imgs/Cidades.png"))); // NOI18N
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        jButton2.setText("Reiniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, -1));

        txtDistanciaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistanciaTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtDistanciaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 110, -1));

        jLabel2.setText("Distancia Total");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFimActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //List<Vertice> menorCaminho = new LinkedList<Vertice>();
        ImageIcon circulo2 = new ImageIcon(getClass().getResource("/main/java/imgs/circulo2-removebg-preview.png"));
        Grafo grafo = inicializargrafo();
        Grafo ngrafo = null;
        Vertice vInicio = null, vFinal = null;
      

        Graphics g = jPanel1.getGraphics();

        for (Vertice v : grafo.getVertices()) {
            if (jcbInicio.getSelectedItem().toString().equals(v.getNome())) {
                vInicio = v;
            }
            if (jcbFim.getSelectedItem().toString().equals(v.getNome())) {
                vFinal = v;
            }
        }

        ngrafo = Dijkstra.menorDistancia(grafo, vInicio);
        List<Vertice> menorCaminhoArray = new ArrayList<>(menorCaminho);
        

        for (Vertice v : ngrafo.getVertices()) {
            if (v.getNome().equals(vFinal.getNome())) {
                menorCaminho = v.getMenorCaminho();
                menorCaminho.add(v);
               
                
            }
        }

        for (Map.Entry<String, JLabel> entry : nomes.entrySet()) {
            for (Vertice v : menorCaminho) {
                if (entry.getKey().equals(v.getNome())) {
                    entry.getValue().setIcon(circulo2);

                }
            }
        }
        
        for(Vertice v : menorCaminho){
            
        }
       /* int i = menorCaminho.size() -1;
        txtDistanciaTotal.setText(menorCaminho.get(i).getDistanciaTotal().toString() + " Km" );
*/

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbInicioActionPerformed

    }//GEN-LAST:event_jcbInicioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ImageIcon circulo1 = new ImageIcon(getClass().getResource("/main/java/imgs/circulo1-removebg-preview.png"));
        for (Map.Entry<String, JLabel> entry : nomes.entrySet()) {
            entry.getValue().setIcon(circulo1);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtDistanciaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistanciaTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistanciaTotalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Araguari;
    private javax.swing.JLabel Capinopolis;
    private javax.swing.JLabel Cascalho_Rico;
    private javax.swing.JLabel Centralina;
    private javax.swing.JLabel Douradinhos;
    private javax.swing.JLabel Estrela_do_Sul;
    private javax.swing.JLabel Grupiara;
    private javax.swing.JLabel Indianopolis;
    private javax.swing.JLabel Ituiutaba;
    private javax.swing.JLabel Itumbiara;
    private javax.swing.JLabel Monte_Alegre_de_Minas;
    private javax.swing.JLabel Romaria;
    private javax.swing.JLabel Sao_Juliana;
    private javax.swing.JLabel Tapaciguara;
    private javax.swing.JLabel Uberlandia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbFim;
    private javax.swing.JComboBox<String> jcbInicio;
    private javax.swing.JTextField txtDistanciaTotal;
    // End of variables declaration//GEN-END:variables
}
