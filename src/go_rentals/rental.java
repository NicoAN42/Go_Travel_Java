/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package go_rentals;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER-ACER-PC
 */
public class rental extends javax.swing.JFrame {

    /**
     * Creates new form rental
     */
    public rental() {
        initComponents();
         selectData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btng1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        del = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pesan = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        struk = new javax.swing.JTextField();
        pol = new javax.swing.JTextField();
        vixion = new javax.swing.JRadioButton();
        vario = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        view = new javax.swing.JButton();
        hasil = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        durasi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpesan = new javax.swing.JTable();
        print = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\X\\Music\\pbo\\Go Rentals logo.JPG")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 280, 180));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("PEMESANAN"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("DaunPenh", 1, 18)); // NOI18N
        jLabel2.setText("No.Struk");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("DaunPenh", 1, 18)); // NOI18N
        jLabel4.setText("Nama");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        del.setForeground(new java.awt.Color(102, 102, 102));
        del.setText("DEL");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jPanel2.add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 70, 30));

        jLabel10.setFont(new java.awt.Font("DaunPenh", 1, 18)); // NOI18N
        jLabel10.setText("Durasi (Jam) ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("DaunPenh", 1, 18)); // NOI18N
        jLabel11.setText("No.Pol");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        pesan.setForeground(new java.awt.Color(102, 102, 102));
        pesan.setText("SAVE");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });
        jPanel2.add(pesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 70, 30));
        jPanel2.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 130, -1));
        jPanel2.add(struk, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 130, -1));

        pol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polActionPerformed(evt);
            }
        });
        jPanel2.add(pol, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 130, -1));

        btng1.add(vixion);
        vixion.setText("Vixion");
        vixion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vixionActionPerformed(evt);
            }
        });
        jPanel2.add(vixion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 130, -1));

        btng1.add(vario);
        vario.setText("Vario");
        jPanel2.add(vario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 130, -1));

        jLabel14.setFont(new java.awt.Font("DaunPenh", 1, 18)); // NOI18N
        jLabel14.setText("Motor");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        view.setForeground(new java.awt.Color(102, 102, 102));
        view.setText("VIEW");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel2.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 70, 30));
        jPanel2.add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel3.setText("Total Harga :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jPanel2.add(durasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 130, -1));

        jLabel12.setText("Rp.");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 320));

        jLabel5.setText("Terima Rental Motor , ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel6.setText("Jl.Danau Buatan, Kota Malang");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel7.setText("085 908 890 098");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel9.setText("\"Jangan malu, jangan risau ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel8.setText("kami selalu ada disini :)\"");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        tpesan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nama", "Struk", "Pol", "Motor", "Durasi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tpesan);
        if (tpesan.getColumnModel().getColumnCount() > 0) {
            tpesan.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 540, 90));

        print.setForeground(new java.awt.Color(102, 102, 102));
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 270, -1));

        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
    int baris = tpesan.getSelectedRow();
    if (baris != -1){
    String id = tpesan.getValueAt(baris, 0).toString();
    String SQL = "DELETE FROM tb_rental WHERE id='"+id+"'";
    int status = KoneksiDB.execute(SQL);
    if (status==1) {
        JOptionPane.showMessageDialog(this, "Data Berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        
    }else {
        JOptionPane.showMessageDialog(this, "Data Gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
    }
    }else {
    JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu","Error",JOptionPane.WARNING_MESSAGE);// TODO add your handling code here:
                                          
    }        // TODO add your handling code here:
    }//GEN-LAST:event_delActionPerformed

    private void vixionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vixionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vixionActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
MessageFormat header = new MessageFormat("Biodata SIswa SMK Telkom Malan");
    MessageFormat footer = new MessageFormat("Page {0,number,integer} ");
   try{
       tpesan.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
       
   }
   catch(java.awt.print.PrinterException e){
       System.err.format("Cannot print %a%n", e.getMessage());
   }        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      new home().show();
dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed

          
      String a = durasi.getText();
      Integer d = Integer.parseInt(String.valueOf(a));
      Integer e = d * 20000 ;
      hasil.setText(String.valueOf(e));
     
      

        String JK = "";
    if(vario.isSelected())
{ JK = "Vario";  
}
  
    if (vixion.isSelected())
    JK = "Vixion";
        if ("".equals(nama.getText()) || "".equals(struk.getText())|| "".equals(pol.getText())|| "".equals(durasi.getText())){
JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);



}else{
    String SQL = "INSERT INTO tb_rental (user,nstruk,npol,motor,durasi)"+
            "VALUES('"+nama.getText()+"','"+struk.getText()+"','"+pol.getText()+"','"+JK+"','"+durasi.getText()+"')";
int status = KoneksiDB.execute(SQL);
if(status == 1){
    JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan","Sukses", JOptionPane.INFORMATION_MESSAGE);
    selectData();
}else{
    JOptionPane.showMessageDialog(this,"Data gagal ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
}

}       // TODO add your handling code here:
    }//GEN-LAST:event_pesanActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
selectData();}
        public void selectData(){
            String JK = "";
    if(vario.isSelected())
{   
}
    else  {
    JK = "Vario";
}      
    if (vixion.isSelected())
    JK = "Vixion";
        String kolom[] = {"id","Nama","Struk","Pol","Motor","Durasi"};
        DefaultTableModel dtm = new DefaultTableModel(null,kolom);        //To change body of generated methods, choose Tools | Templates.
        String SQL = "SELECT * FROM tb_rental";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        
  
        try {
            while(rs.next()) 
            {
                String id = rs.getString(1);
                String Nama= rs.getString(2);
                String Struk = rs.getString(3);
                String Pol= rs.getString(4);
                String Motor = rs.getString(5);
                String Durasi = rs.getString(6);
                
              
               Object data[] = {id,Nama,Struk,Pol,Motor,Durasi};
                
                dtm.addRow(data);
            }
        }catch (SQLException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        }tpesan.setModel(dtm);
    
        // TODO add your handling code here:
              // TODO add your handling code here:
    }//GEN-LAST:event_viewActionPerformed

    private void polActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_polActionPerformed

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
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btng1;
    private javax.swing.JButton del;
    private javax.swing.JTextField durasi;
    private javax.swing.JButton exit;
    private javax.swing.JLabel hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nama;
    private javax.swing.JButton pesan;
    private javax.swing.JTextField pol;
    private javax.swing.JButton print;
    private javax.swing.JTextField struk;
    private javax.swing.JTable tpesan;
    private javax.swing.JRadioButton vario;
    private javax.swing.JButton view;
    private javax.swing.JRadioButton vixion;
    // End of variables declaration//GEN-END:variables
}
