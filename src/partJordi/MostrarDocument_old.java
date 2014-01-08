/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package partJordi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import partXicu.InterficieTONTA;

/**
 *
 * @author Win7
 */
public class MostrarDocument_old extends javax.swing.JFrame {

    /**
     * Creates new form MostrarDocument
     */
    public MostrarDocument_old() {
        initComponents();
    }
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileReader fr = null;
        BufferedReader br = null;
        //creem un filtre dels documents per definir quins arxius veu el JFileChooser
        javax.swing.filechooser.FileNameExtensionFilter filterCsv = new javax.swing.filechooser.FileNameExtensionFilter("Documentos MS Excel", "csv");
        //
        final JFileChooser triarArxiu = new JFileChooser();

        //agregem el filtre al filechooser
        triarArxiu.setFileFilter(filterCsv);
        int returnVal = triarArxiu.showOpenDialog(null);

        //definim el comportament de la finestra
        triarArxiu.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File fileCsv = null;
            fileCsv = triarArxiu.getSelectedFile();
            File arxiu = triarArxiu.getSelectedFile();
            jTextField1.setText(String.valueOf(arxiu));//Path del document
            String mossstra = String.valueOf(arxiu);
             try {
                 //Llegir fitxer
                 fr = new FileReader (arxiu);
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(MostrarDocument_old.class.getName()).log(Level.SEVERE, null, ex);
             }
         br = new BufferedReader(fr);
         String linia;
         String a = "";
         //Files.toString(fileCsv, charset);
        String str = (arxiu.getAbsolutePath().toString());
        //"C:\\Users\\DAM\\Desktop\\fitxer_dades.csv"
        //System.out.println(" __"+str);
         // Lectura del fitxer
           try {
                 while((linia = br.readLine())!=null){
                      a += linia + "\n";
                     jTextArea1.setText(a);
                     System.out.println(linia);
                 }} catch (IOException ex) {
                jTextArea1.append ("No s'ha trobat el document...");
             }
        }
        //( (DefaultListModel) jList1.getModel() ).addElement( jTextField1.getText() ); 
        DefaultListModel model1 = new DefaultListModel();
        //InterficieTONTA.entregaLlista("C:\\Users\\DAM\\Desktop\\fitxer_dades.csv").size()
        System.out.println("     >>>"+InterficieTONTA.entregaLlista("C:\\Users\\DAM\\Desktop\\fitxer_dades.csv"));
        HashMap lista = new HashMap();
        for(int i =0; i< InterficieTONTA.entregaLlista("C:\\Users\\DAM\\Desktop\\fitxer_dades.csv").size() ; i++)
        {
            lista.put(i,InterficieTONTA.entregaLlista("C:\\Users\\DAM\\Desktop\\fitxer_dades.csv").get(i).getCurs());
        }
        for(int i =0; i< lista.size(); i++)
        {
           // model1.addElement(i + " Aliual");
           model1.addElement(lista.get(i));
            
            //InterficieTONTA.entregaLlista(fr.toString());
          // System.out.println( (InterficieTONTA.entregaLlista(fr.toString()).get(i).getNom()));
           
        }
        jList1.setModel(model1);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarDocument_old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarDocument_old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarDocument_old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarDocument_old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarDocument_old().setVisible(true);
            }
        });
    }
//hola
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
