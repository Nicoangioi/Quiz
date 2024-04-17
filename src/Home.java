
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author nicoa
 */
public class Home extends javax.swing.JFrame {

    int id = 1;

    /**
     * Creates new form Home
     */
    public Home() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_quizstoria = new javax.swing.JButton();
        b_quizgeo = new javax.swing.JButton();
        b_quizsport = new javax.swing.JButton();
        b_quizcinema = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_quizstoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini/history.png"))); // NOI18N
        b_quizstoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_quizstoriaActionPerformed(evt);
            }
        });

        b_quizgeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini/earth.png"))); // NOI18N
        b_quizgeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_quizgeoActionPerformed(evt);
            }
        });

        b_quizsport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini/sport_1.png"))); // NOI18N
        b_quizsport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_quizsportActionPerformed(evt);
            }
        });

        b_quizcinema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immagini/cinema.png"))); // NOI18N
        b_quizcinema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_quizcinemaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Scegli la materia");

        jButton1.setText("Pagina Principale");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gestisci Quiz");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(b_quizstoria)
                .addGap(85, 85, 85)
                .addComponent(b_quizgeo)
                .addGap(104, 104, 104)
                .addComponent(b_quizcinema)
                .addGap(98, 98, 98)
                .addComponent(b_quizsport)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel5))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_quizstoria)
                    .addComponent(b_quizgeo)
                    .addComponent(b_quizsport)
                    .addComponent(b_quizcinema))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void b_quizstoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_quizstoriaActionPerformed

        this.setVisible(false);

        QuizStoria qs = new QuizStoria();
        qs.setVisible(true);

        if (!qs.quiz.isEmpty()) {
            qs.mostraDomandaCorrente();
        } else {
            qs.setVisible(false);
            JOptionPane.showMessageDialog(null, "Nessuna domanda trovata. Prova a inserirne qualcuna.");

            ElencoQuiz eq = new ElencoQuiz();
            eq.setVisible(true);
        }

    }//GEN-LAST:event_b_quizstoriaActionPerformed


    private void b_quizgeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_quizgeoActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);

        QuizGeo qg = new QuizGeo();
        qg.setVisible(true);

        if (!qg.quiz.isEmpty()) {
            qg.mostraDomandaCorrente();
        } else {
            qg.setVisible(false);
            JOptionPane.showMessageDialog(null, "Nessuna domanda trovata. Prova a inserirne qualcuna.");

            ElencoQuiz eq = new ElencoQuiz();
            eq.setVisible(true);
        }
    }//GEN-LAST:event_b_quizgeoActionPerformed


    private void b_quizcinemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_quizcinemaActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);

        QuizCinema qc = new QuizCinema();
        qc.setVisible(true);

        if (!qc.quiz.isEmpty()) {
            qc.mostraDomandaCorrente();
        } else {
            qc.setVisible(false);
            JOptionPane.showMessageDialog(null, "Nessuna domanda trovata. Prova a inserirne qualcuna.");

            ElencoQuiz eq = new ElencoQuiz();
            eq.setVisible(true);
        }

    }//GEN-LAST:event_b_quizcinemaActionPerformed

    private void b_quizsportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_quizsportActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);

        QuizSport qsp = new QuizSport();
        qsp.setVisible(true);

        if (!qsp.quiz.isEmpty()) {
            qsp.mostraDomandaCorrente();
        } else {
            qsp.setVisible(false);
            JOptionPane.showMessageDialog(null, "Nessuna domanda trovata. Prova a inserirne qualcuna.");

            ElencoQuiz eq = new ElencoQuiz();
            eq.setVisible(true);
        }
    }//GEN-LAST:event_b_quizsportActionPerformed

    //Ritorna alla pag iniziale
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PagIniziale pi;
        try {
            pi = new PagIniziale();
            pi.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    //Gestisci i Quiz con l'apposito form
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ElencoQuiz eq = new ElencoQuiz();
        eq.setVisible(true);

        try {
            eq.CaricaDatiTabella();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_quizcinema;
    private javax.swing.JButton b_quizgeo;
    private javax.swing.JButton b_quizsport;
    public javax.swing.JButton b_quizstoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}