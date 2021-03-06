/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ugyvitelalk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author macsk
 */
public class Ugyvitel extends javax.swing.JFrame {

    /** Creates new form Ugyvitel */
    public Ugyvitel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        chcbTortenet = new javax.swing.JCheckBox();
        txtVegosszeg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        slidTamogatas = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTamogatas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        chcbFoto = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmoVezeteshsz = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spinSzemély = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rbtnT34 = new javax.swing.JRadioButton();
        rbtnTiger = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rbtnSherman = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaOszzegzes = new javax.swing.JTextArea();
        btnFizetes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mentesMas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        chcbTortenet.setText("A Harckocsi tőrténete.");
        chcbTortenet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcbExtrak(evt);
            }
        });

        txtVegosszeg.setText("0 FT");
        txtVegosszeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVegosszegActionPerformed(evt);
            }
        });

        jLabel1.setText("Ősszeg:");

        slidTamogatas.setMaximum(100000);
        slidTamogatas.setValue(0);
        slidTamogatas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slidTamogatasStateChanged(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\macsk\\Downloads\\SzTiger.jpg")); // NOI18N
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel6.setText("A Szabó harckocsi élmény vezetés támogatása.");

        txtTamogatas.setText("0 Ft");
        txtTamogatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamogatasActionPerformed(evt);
            }
        });

        jLabel7.setText("Támogatás ősszege:");

        chcbFoto.setText("Fotó készitése a harckocsival.");
        chcbFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcbExtrak(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Élményvezetés hossza");

        cmoVezeteshsz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 óra", "2 óra", "3 óra", "4 óra" }));
        cmoVezeteshsz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmoVezeteshszActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmoVezeteshsz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmoVezeteshsz, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Személyek száma(max 5)");

        spinSzemély.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        spinSzemély.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinSzemélyStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(spinSzemély, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinSzemély, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel8.setText(" Extrák:");

        jLabel9.setText("Részletes Ősszegzés:");

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        buttonGroup1.add(rbtnT34);
        rbtnT34.setText("T34-85");
        rbtnT34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtntank(evt);
            }
        });

        buttonGroup1.add(rbtnTiger);
        rbtnTiger.setText("Tiger H1");
        rbtnTiger.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbtnTiger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtntank(evt);
            }
        });

        jLabel5.setText("Válaszható harckocsik:");

        buttonGroup1.add(rbtnSherman);
        rbtnSherman.setText("Sherman M4A3");
        rbtnSherman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtntank(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rbtnTiger)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(rbtnSherman))
                .addGap(31, 31, 31)
                .addComponent(rbtnT34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnTiger)
                    .addComponent(rbtnSherman)
                    .addComponent(rbtnT34))
                .addContainerGap())
        );

        txtaOszzegzes.setColumns(20);
        txtaOszzegzes.setRows(5);
        txtaOszzegzes.setText("Élményvezetés hossza:\nSzemélyek száma:\nHarckocsi:\nExtrák:\nTámogatás:");
        jScrollPane1.setViewportView(txtaOszzegzes);

        btnFizetes.setText("Fizetés");
        btnFizetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFizetesActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD2, 0));
        jMenuItem1.setText("Mentés");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mentesMas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD1, 0));
        mentesMas.setText("Mentés Másként...");
        mentesMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentesMasActionPerformed(evt);
            }
        });
        jMenu1.add(mentesMas);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(slidTamogatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chcbTortenet)
                            .addComponent(jLabel8)
                            .addComponent(chcbFoto))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVegosszeg, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnFizetes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtTamogatas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(chcbTortenet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chcbFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(slidTamogatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTamogatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtVegosszeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnFizetes))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int tankAr = 0;
    int vezHszAr = 2000;
    int vezHsz = 1;
    int osszAr = 0;
    int db= 1;
    int extraAr = 0;
    String tankNev = "";
    String foglalasSzov = "";
    String extranev = "";
    private void mentesMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentesMasActionPerformed
     if(jFileChooser1.showOpenDialog(this)== JFileChooser.APPROVE_OPTION){
            setTitle("Megnyitás: " + jFileChooser1.getSelectedFile().getName());        // TODO add your handling code here:
    }//GEN-LAST:event_mentesMasActionPerformed
    }
    private void rbtntank(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtntank
     if(evt.getActionCommand() == "Tiger H1"){
        tankAr = 5000;
        tankNev = "Tiger H1";
        
    
    }else if(evt.getActionCommand() == "Sherman M4A3"){
        tankAr = 7000;
        tankNev = "Sherman M4A3";
        
    }else if(evt.getActionCommand() == "T34-85"){
        tankAr = 9000;
        tankNev = "T34-85";
    }
     arFrissites();
    }//GEN-LAST:event_rbtntank

    private void txtVegosszegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVegosszegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVegosszegActionPerformed

    private void txtTamogatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamogatasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamogatasActionPerformed

    private void btnFizetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFizetesActionPerformed
        if((!rbtnTiger.isSelected()&&!rbtnT34.isSelected()&&!rbtnSherman.isSelected())){
        String hiba = " Válasz ki egy Harckocsit!";
        JOptionPane.showMessageDialog(this, hiba, "Hibás rendelés", JOptionPane.INFORMATION_MESSAGE);
    
    }
        else{
        String foglalas = String.format("Élményvezetés hossza: %d óra Ára : %d Ft\nSzemélyek Száma: %d fő Ára : %d Ft\nHarckocsi: %s Ára : %d Ft \nExtrák: %s Ára : %d Ft\nTámogatás: %d Ft",vezHsz,vezHszAr,db,vezHszAr*db,tankNev,tankAr,extranev,extraAr,slidTamogatas.getValue());
        foglalasSzov = foglalas;
        
        JOptionPane.showMessageDialog(this,foglalasSzov ,"Összesitő" ,JOptionPane.INFORMATION_MESSAGE);
        try {
            String fajbeiras = foglalasSzov ;
            Files.write(Paths.get("rendeles.txt"), fajbeiras.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(Ugyvitel.class.getName()).log(Level.SEVERE, null, ex);
        }}

    }//GEN-LAST:event_btnFizetesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    if(JOptionPane.showConfirmDialog(this, "Biztosan Kilép?", "Kilépés", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void cmoVezeteshszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmoVezeteshszActionPerformed
    if(cmoVezeteshsz.getSelectedIndex() == 0 ){
        vezHszAr = 2000;
        vezHsz = 1;
    }else if(cmoVezeteshsz.getSelectedIndex() == 1 ){
        vezHszAr = 4000;
        vezHsz = 2;
        
    }else if(cmoVezeteshsz.getSelectedIndex() == 2 ){
        vezHszAr = 6000;
        vezHsz = 3;
    }
    else if(cmoVezeteshsz.getSelectedIndex() == 3 ){
        vezHszAr = 8000;
        vezHsz = 4;
    }
    arFrissites();
    }//GEN-LAST:event_cmoVezeteshszActionPerformed

    private void chcbExtrak(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcbExtrak
        int[] arak = {2000, 1000,};
        String[] nevek = {"A Harckocsi tőrténete, ","Fotó Készitése a Harckocsival,"};
    
        JCheckBox[] extrak = {chcbTortenet, chcbFoto};
        int extraOsszAr = 0;
        String extraossznev = "";
        for(int i = 0; i < extrak.length; i++){
            if(extrak[i].isSelected()){
            extraOsszAr += arak[i];
            extraossznev += nevek[i];
 
        }
    }//GEN-LAST:event_chcbExtrak
    extraAr = extraOsszAr ;
    extranev = extraossznev;
    arFrissites();
    }
    private void slidTamogatasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slidTamogatasStateChanged
        txtTamogatas.setText( slidTamogatas.getValue() + "Ft");
        arFrissites();
    }//GEN-LAST:event_slidTamogatasStateChanged

    private void spinSzemélyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinSzemélyStateChanged
        db = (int)spinSzemély.getValue();
        arFrissites();
    }//GEN-LAST:event_spinSzemélyStateChanged

    private void arFrissites(){
        
        String ar = String.format("Élményvezetés hossza: %d óra Ára : %d Ft\nSzemélyek száma: %d fő Ára : %d Ft\nHarckocsi: %s Ára : %d Ft \nExtrák: %s Ára : %d Ft\nTámogatás: %d Ft",vezHsz,vezHszAr,db,vezHszAr*db,tankNev,tankAr,extranev,extraAr,slidTamogatas.getValue());
        osszAr =vezHszAr+(vezHszAr*db)+tankAr+extraAr+slidTamogatas.getValue();
        String vegOszzeg = String.format("%s Ft ",osszAr);
        txtaOszzegzes.setText(ar);
        txtVegosszeg.setText(vegOszzeg);
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
            java.util.logging.Logger.getLogger(Ugyvitel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ugyvitel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ugyvitel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ugyvitel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ugyvitel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFizetes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chcbFoto;
    private javax.swing.JCheckBox chcbTortenet;
    private javax.swing.JComboBox<String> cmoVezeteshsz;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mentesMas;
    private javax.swing.JRadioButton rbtnSherman;
    private javax.swing.JRadioButton rbtnT34;
    private javax.swing.JRadioButton rbtnTiger;
    private javax.swing.JSlider slidTamogatas;
    private javax.swing.JSpinner spinSzemély;
    private javax.swing.JTextField txtTamogatas;
    private javax.swing.JTextField txtVegosszeg;
    private javax.swing.JTextArea txtaOszzegzes;
    // End of variables declaration//GEN-END:variables

}
