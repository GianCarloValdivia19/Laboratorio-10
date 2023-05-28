package Pantallas;

import Entidades.Celular;
import Entidades.Navegador;
import Entidades.SmartTv; 
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author GIAN
 */
public class ListaDeNavegadores extends javax.swing.JFrame {

    List<Celular> celulares = new ArrayList<>();
    List<SmartTv> televisores = new ArrayList<>(); //Tiene que tener el mismo nombre de tu clase
    List<Navegador> navegadores = new ArrayList<>();
    DefaultListModel modeloLista = new DefaultListModel();
    
    public ListaDeNavegadores() {
        initComponents();
        lstNavegador.setModel(modeloLista);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstNavegador = new javax.swing.JList<>();
        txt_Buscar = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        btn_AgregarCelular = new javax.swing.JButton();
        btn_AgregarSmartTv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstNavegador);

        txt_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarKeyReleased(evt);
            }
        });

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        btn_AgregarCelular.setText("Agregar Celular");
        btn_AgregarCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarCelularActionPerformed(evt);
            }
        });

        btn_AgregarSmartTv.setText("Agregar SmartTv");
        btn_AgregarSmartTv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarSmartTvActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Navegadores ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_AgregarSmartTv)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_AgregarCelular))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_Buscar))
                        .addComponent(jScrollPane1)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AgregarCelular)
                    .addComponent(btn_AgregarSmartTv))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarSmartTvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarSmartTvActionPerformed
        EditarSmartTv Editar = new EditarSmartTv(this);
        Editar.setLocationRelativeTo(null);
        Editar.setVisible(true);
        this.setVisible(false);       
    }//GEN-LAST:event_btn_AgregarSmartTvActionPerformed

    private void btn_AgregarCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarCelularActionPerformed
        EditarCelular Editar = new EditarCelular(this);
        Editar.setLocationRelativeTo(null);
        Editar.setVisible(true);
        this.setVisible(false);       
    }//GEN-LAST:event_btn_AgregarCelularActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        Buscar();       
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void Buscar() {
        modeloLista.removeAllElements();
        for(Navegador nav: navegadores){
            if (nav.getNombre().toLowerCase().contains(txt_Buscar.getText())){
                modeloLista.addElement(nav.getNombre());
            }
        }
    }

    private void txt_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarKeyReleased
        Buscar(); 
    }//GEN-LAST:event_txt_BuscarKeyReleased

    void actualizarList(){ 
        modeloLista.removeAllElements();
        for(Navegador nav: navegadores){
            modeloLista.addElement(nav.getNombre());             
        }     
    }
    
    void setCelular(Celular celular) {
        celulares.add(celular);
        navegadores.add(celular);
        actualizarList();
    }
    
    void setSmartTv(SmartTv televisor) {
        televisores.add(televisor);
        navegadores.add(televisor);
        actualizarList();
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
            java.util.logging.Logger.getLogger(ListaDeNavegadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeNavegadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeNavegadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeNavegadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeNavegadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarCelular;
    private javax.swing.JButton btn_AgregarSmartTv;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstNavegador;
    private javax.swing.JTextField txt_Buscar;
    // End of variables declaration//GEN-END:variables

    
}
