/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import notesElevesProfesseurs.CSV_Loader;
import notesElevesProfesseurs.Date;
import notesElevesProfesseurs.Eleve;
import notesElevesProfesseurs.Promotion;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

/**
 * @author franc
 */
public class ModifEleve extends javax.swing.JFrame {


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ajouterEleveB;
    public javax.swing.JButton ouvrirGenEvalsB;
    public javax.swing.JTextField promoTF;
    private javax.swing.JTextField dateTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nomTF;
    private javax.swing.JTextField prenomTF;

    /**
     * Constructeur de la fenêtre graphique de modification d'un élève
     *
     * @param elev
     */
    public ModifEleve(Eleve elev) {

        Globals.eleveSelectionne = elev;
        setTitle(Globals.eleveSelectionne.getNom() + " " + Globals.eleveSelectionne.getPrenom());
        initComponents();

        // on charge directement les données de l'élève dans les zones de texte
        nomTF.setText(Globals.eleveSelectionne.getNom());
        prenomTF.setText(Globals.eleveSelectionne.getPrenom());
        dateTF.setText(Globals.eleveSelectionne.getDateNaissance().toString());
        promoTF.setText(Globals.eleveSelectionne.getPromotion().getNom());
        DocumentListener listener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent ev) {
                verifActivationBoutonsEleve();
            }

            @Override
            public void removeUpdate(DocumentEvent ev) {
                verifActivationBoutonsEleve();
            }

            @Override
            public void changedUpdate(DocumentEvent ev) {
                verifActivationBoutonsEleve();
            }
        };
        nomTF.getDocument().addDocumentListener(listener);
        prenomTF.getDocument().addDocumentListener(listener);
        promoTF.getDocument().addDocumentListener(listener);
        dateTF.getDocument().addDocumentListener(listener);

        ouvrirGenEvalsB.setText("Ajouter des évaluations ( Nombre actuel : " + Globals.eleveSelectionne.getEvaluations().size() + ") ");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(ModifEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //new updateEleve().setVisible(true);
        });
    }

    /**
     * On vérifie si les champs ne sont pas vides afin de pouvoir activer les boutons d'ajout d'un élève et de gestionnaire des évaluations
     */
    public void verifActivationBoutonsEleve() {
        if (!nomTF.getText().isEmpty() && !prenomTF.getText().isEmpty() && !promoTF.getText().isEmpty() && !dateTF.getText().isEmpty()) {
            ouvrirGenEvalsB.setEnabled(true);
            ajouterEleveB.setEnabled(true);
        } else {
            ouvrirGenEvalsB.setEnabled(false);
            ajouterEleveB.setEnabled(false);
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

        nomTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        prenomTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        promoTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ouvrirGenEvalsB = new javax.swing.JButton();
        ajouterEleveB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nomTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTFActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom");

        jLabel2.setText("Prénom");

        prenomTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomTFActionPerformed(evt);
            }
        });

        jLabel3.setText("Date de Naissance");

        dateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTFActionPerformed(evt);
            }
        });

        promoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promoTFActionPerformed(evt);
            }
        });

        jLabel5.setText("Promotion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Modification d'un élève");

        ouvrirGenEvalsB.setText("Ajouter des évaluations ( Nombre actuel : 0) ");
        ouvrirGenEvalsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouvrirGenEvalsBActionPerformed(evt);
            }
        });

        ajouterEleveB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ajouterEleveB.setText("Modifier");
        ajouterEleveB.setEnabled(false);
        ajouterEleveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majEleveBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ouvrirGenEvalsB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(dateTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(prenomTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(nomTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(promoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel6))
                                .addContainerGap(244, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ajouterEleveB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nomTF, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(prenomTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(promoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(ouvrirGenEvalsB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(ajouterEleveB, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTFActionPerformed

    private void prenomTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomTFActionPerformed

    private void dateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTFActionPerformed

    private void promoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promoTFActionPerformed

    /*
     * Met à jour la variable eleveEnCreation en récupérant ce qu'il y'a pour l'instant dans les zones de texte de création de l'élève
     */
    private void majEleveRapide() {
        Globals.eleveSelectionne.setNom(nomTF.getText());
        Globals.eleveSelectionne.setPrenom(prenomTF.getText());
        Promotion p = Promotion.trouverPromotion(promoTF.getText());
        if (p == null) {
            // Si la promotion est introuvable, on la créee et on l'ajoute à notre liste des promotions
            p = new Promotion(promoTF.getText());
            Promotion.getListePromos().add(p);
        }
        Globals.eleveSelectionne.setPromotion(p);
        try {
            String[] dateParts = dateTF.getText().split("/");
            int jour = Integer.parseInt(dateParts[0]);
            int mois = Integer.parseInt(dateParts[1]);
            int annee = Integer.parseInt(dateParts[2]);
            Globals.eleveSelectionne.setDateNaissance(new Date(annee, mois, jour));
        } catch (NumberFormatException ex) {
            System.out.println(ex);
            System.out.println("Erreur enregistrement date de naissance, vérifiez le format");
        }
    }

    // Ouvre le générateur/gestionnaire d'évaluations pour l'élève en cours de création
    private void ouvrirGenEvalsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouvrirGenEvalsBActionPerformed
        GenerateurEvaluations gen = new GenerateurEvaluations();
        majEleveRapide();
        gen.init(Globals.eleveSelectionne);
        ajouterEleveB.setEnabled(true);
        gen.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_ouvrirGenEvalsBActionPerformed

    /**
     * Gestion du code lorsque l'on clique sur le bouton de mise à jour d'un élève
     *
     * @param evt
     */
    private void majEleveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterEleveBActionPerformed
        // TODO add your handling code here:

        if (dateTF.getText().matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{4}$")) {
            majEleveRapide();
            Promotion promo = Promotion.trouverPromotion(Globals.eleveSelectionne.getPromotion().getNom());
            if (!promo.getEleves().contains(Globals.eleveSelectionne)) promo.ajouterEleve(Globals.eleveSelectionne);
            CSV_Loader.majEleve(Globals.eleveSelectionne, CSV_Loader.ELEVES_PATH);
            GestionnairePromos gestionnairePromo = new GestionnairePromos();
            gestionnairePromo.setVisible(true);
            dispose();
        } else {
            dateTF.setBorder(new LineBorder(Color.red, 1));
            JOptionPane.showMessageDialog(null, "Format de la date de naissance incorrecte\nLe format demandé est jj/mm/aaaa");
        }


    }//GEN-LAST:event_ajouterEleveBActionPerformed
    // End of variables declaration//GEN-END:variables
}
