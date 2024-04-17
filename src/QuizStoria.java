/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nicoa
 */
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class QuizStoria extends javax.swing.JFrame {

    int punteggio; //variabile che determina il punteggio dei quiz
    private ArrayList<String> domandaCorrente;  

    ArrayList<ArrayList<String>> quiz; // ArrayList di ArrayList per contenere le domande del quiz
    int IndiceCorrente; // Indice per tenere traccia della posizione attuale nel quiz

    /**
     * Creates new form QuizStoria
     */
    public QuizStoria() {
        initComponents();
        this.setLocationRelativeTo(null);

        quiz = new ArrayList<>(); // Inizializza l'ArrayList del quiz
        IndiceCorrente = 0; // Inizializza l'indice a 0

        try {
            CollezionaDatiStoria(); // Riempi l'ArrayList con i dati del quiz


        } catch (SQLException ex) {
            Logger.getLogger(QuizStoria.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuizStoria.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        b_succ = new javax.swing.JButton();
        b_prec = new javax.swing.JButton();
        Home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Storia");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        b_succ.setText("Successiva");
        b_succ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_succActionPerformed(evt);
            }
        });

        b_prec.setText("Precedente");
        b_prec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_precActionPerformed(evt);
            }
        });

        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_prec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_succ))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(290, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Home)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_succ)
                    .addComponent(b_prec))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //facciamo in modo che ogni volta che il tasto successivo venga passato alla domanda successiva tenendo conto del punteggio
    private void b_succActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_succActionPerformed

        
        String rispostaSelezionata = null;

        if (jRadioButton1.isSelected()) {
            rispostaSelezionata = jRadioButton1.getText();

        } else if (jRadioButton2.isSelected()) {
            rispostaSelezionata = jRadioButton2.getText();

        } else if (jRadioButton3.isSelected()) {
            rispostaSelezionata = jRadioButton3.getText();
            //System.out.println(bottone3);
        } else if (jRadioButton4.isSelected()) {
            rispostaSelezionata = jRadioButton4.getText();

        }

        if (IndiceCorrente < quiz.size()) {
            System.out.print(IndiceCorrente);
            ArrayList<String> risCorr = quiz.get(IndiceCorrente);
            if (rispostaSelezionata != null && rispostaSelezionata.equals(risCorr.get(1))) {
                punteggio = punteggio + 1;
                //System.out.println(punteggio);
            }
        }

        passaDomandaSuccessiva();

        // Deseleziona tutti i pulsanti radio
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);


    }//GEN-LAST:event_b_succActionPerformed
    
    //facciamo in modo che si vada indietro di una domanda ogni volta che viene premuto il tasto precedente
    private void b_precActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_precActionPerformed


        passaDomandaPrecedente();


    }//GEN-LAST:event_b_precActionPerformed
    
    //facciamo in modo che quando il tasto Home viene premuto questo ci riporta alla schermata home
    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed


        this.setVisible(false);
        Home ho = new Home();
        ho.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    //facciamo in modo che non possano esssere selzionati più di un radiobutton alla volta
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        if (jRadioButton1.isSelected()) {
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed


        if (jRadioButton2.isSelected()) {
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:

        if (jRadioButton3.isSelected()) {
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton4.setSelected(false);
        }

    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed


        if (jRadioButton4.isSelected()) {
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(QuizStoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizStoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizStoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizStoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizStoria().setVisible(true);
            }
        });
    }

    //Collezioniamo i dati dei quiz relativi alla storia
    public void CollezionaDatiStoria() throws SQLException, ClassNotFoundException {

        String domanda;
        String rispostaCorretta;
        String r1_sbagliata;
        String r2_sbagliata;
        String r3_sbagliata;

        Connection c = (Connection) DriverManager.getConnection(connessione.Jdbc);

        String q = "SELECT * FROM quiz_storia";
        PreparedStatement ps = c.prepareStatement(q);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            ArrayList<String> quizItem = new ArrayList<>();
            quizItem.add(rs.getString("domanda"));
            quizItem.add(rs.getString("risposta_corretta"));
            quizItem.add(rs.getString("risposta_sbagliata1"));
            quizItem.add(rs.getString("risposta_sbagliata2"));
            quizItem.add(rs.getString("risposta_sbagliata3"));

            quiz.add(quizItem);

        }

        rs.close();
        ps.close();
        c.close();

    }

// Metodo per mostrare la domanda corrente e mescolare le risposte
void mostraDomandaCorrente() {
    if (!quiz.isEmpty() && IndiceCorrente < quiz.size()) {
        domandaCorrente = quiz.get(IndiceCorrente);
        String domanda = domandaCorrente.get(0);
        jTextArea1.setText(""+ (IndiceCorrente+1) + ". " + domanda); 

        // Crea una lista di numeri da 1 a 4
        List<Integer> numeriCasuali = Arrays.asList(1, 2, 3, 4);
        
        // Mescola la lista in modo casuale
        Collections.shuffle(numeriCasuali);

       
        jRadioButton1.setText(domandaCorrente.get(numeriCasuali.get(0)));
        jRadioButton2.setText(domandaCorrente.get(numeriCasuali.get(1)));
        jRadioButton3.setText(domandaCorrente.get(numeriCasuali.get(2)));
        jRadioButton4.setText(domandaCorrente.get(numeriCasuali.get(3)));
    } 
}

// Metodo per passare alla domanda successiva
    private void passaDomandaSuccessiva() {
        IndiceCorrente++; // Incrementa l'indice per passare alla prossima domanda
        if (IndiceCorrente < quiz.size()) {
            mostraDomandaCorrente(); 
        } else {


            JOptionPane.showMessageDialog(null, "Quiz Completato! il tuo punteggio è " + punteggio);
            punteggio = 0;
        }
    }

// Metodo per passare alla domanda precedente
    private void passaDomandaPrecedente() {
        
        //se l'indice è > 0 allora decrementiamo
        if (IndiceCorrente > 0) {
            IndiceCorrente--;
        }
        
        //se il punteggio è > 0 decrementiamo il punteggio in modo tale da non avere negativi
        if (punteggio > 0) {
            punteggio--;
        }

        
        if (IndiceCorrente < quiz.size() && IndiceCorrente != 0) {
            mostraDomandaCorrente(); 
        } else {
            JOptionPane.showMessageDialog(null,"Non si può andare più indietro di così");

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JButton b_prec;
    private javax.swing.JButton b_succ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}