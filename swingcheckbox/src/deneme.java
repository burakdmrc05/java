
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kubra
 */
public class deneme extends javax.swing.JFrame {

    /**
     * Creates new form deneme
     */
    Set<String> diller=new LinkedHashSet<String>();
    public deneme() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        check_java = new javax.swing.JCheckBox();
        check_c = new javax.swing.JCheckBox();
        chk_pyhton = new javax.swing.JCheckBox();
        btnSec = new javax.swing.JButton();
        secilenler = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        check_java.setText("Java");

        check_c.setText("C#");

        chk_pyhton.setText("Pyhton");

        btnSec.setText("Seçiniz");
        btnSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecActionPerformed(evt);
            }
        });

        secilenler.setText("Şu diller seçildi:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_pyhton)
                            .addComponent(check_c)
                            .addComponent(check_java)
                            .addComponent(btnSec, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(secilenler)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(check_java)
                .addGap(18, 18, 18)
                .addComponent(check_c)
                .addGap(18, 18, 18)
                .addComponent(chk_pyhton)
                .addGap(18, 18, 18)
                .addComponent(btnSec)
                .addGap(30, 30, 30)
                .addComponent(secilenler)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecActionPerformed
        // TODO add your handling code here:
        if(check_java.isSelected()){
            diller.add("Java");
        }
        else{
            diller.remove("Java");
        }
        if(check_c.isSelected()){
            diller.add("C#");
        }
        else{
            diller.remove("C#");
        }
        if(chk_pyhton.isSelected()){
            diller.add("Pyhton");
        }
        else{
            diller.remove("Pyhton");
        }
        labelGuncelle();
        
    }//GEN-LAST:event_btnSecActionPerformed
public void labelGuncelle(){
    String sonuc="Şu diller seçildi: ";
    for(String dil:diller){
        sonuc+=dil+" ";
    }
    secilenler.setText(sonuc+" ");
   
}
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
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deneme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSec;
    private javax.swing.JCheckBox check_c;
    private javax.swing.JCheckBox check_java;
    private javax.swing.JCheckBox chk_pyhton;
    private javax.swing.JLabel secilenler;
    // End of variables declaration//GEN-END:variables
}