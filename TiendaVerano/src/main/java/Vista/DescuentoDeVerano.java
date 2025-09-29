
package Vista;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class DescuentoDeVerano extends javax.swing.JFrame {
    public DescuentoDeVerano() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new javax.swing.JPanel();
        lblDescuentoVerano = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCantCamisetasVerano = new javax.swing.JTextField();
        lblDesGeneral2 = new javax.swing.JLabel();
        lblTotalDes2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblImporte2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblDesVerano = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCalularDes1 = new javax.swing.JButton();
        btnLimpiarDes1 = new javax.swing.JButton();
        btnSalirDes1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDescuentoVerano.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescuentoVerano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescuentoVerano.setText("Descuento de Verano en Camisetas");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Total a pagar: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad de camisetas:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Descuento General:");

        txtCantCamisetasVerano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantCamisetasVeranoActionPerformed(evt);
            }
        });
        txtCantCamisetasVerano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantCamisetasVeranoKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Importe:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Descuento de Verano:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblImporte2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantCamisetasVerano, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotalDes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDesVerano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblDesGeneral2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel4)
                    .addContainerGap(168, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtCantCamisetasVerano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImporte2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDesGeneral2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblDesVerano, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblTotalDes2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel4)
                    .addContainerGap(216, Short.MAX_VALUE)))
        );

        btnCalularDes1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalularDes1.setText("Calcular");
        btnCalularDes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalularDes1ActionPerformed(evt);
            }
        });

        btnLimpiarDes1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiarDes1.setText("Limpiar");
        btnLimpiarDes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDes1ActionPerformed(evt);
            }
        });

        btnSalirDes1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalirDes1.setText("Salir");
        btnSalirDes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnCalularDes1)
                .addGap(72, 72, 72)
                .addComponent(btnLimpiarDes1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btnSalirDes1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalularDes1)
                    .addComponent(btnLimpiarDes1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirDes1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER 17\\Documents\\NetBeansProjects\\tiendaRopa.png")); // NOI18N

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDescuentoVerano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(lblDescuentoVerano, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantCamisetasVeranoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantCamisetasVeranoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantCamisetasVeranoActionPerformed

    private void txtCantCamisetasVeranoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantCamisetasVeranoKeyPressed
        if(evt.getKeyCode()== java.awt.event.KeyEvent.VK_ENTER){
            String text=txtCantCamisetasVerano.getText();

            if(text.matches("\\d+")){

                short cantidad;
                float precio = 20;
                cantidad = Short.parseShort(txtCantCamisetasVerano.getText().trim());
                if(cantidad > 0){
                    float importe = precio * cantidad;
                    float descuento = importe * 7/100;
                    float desVerano = (importe * 93/100 * 7/100);
                    float totalPagar = (importe * 93/100* 93/100);

                    //Devolver iformacion
                    DecimalFormat e = new DecimalFormat("0.00");
                    lblImporte2.setText("s/." + e.format(importe) );
                    lblDesGeneral2.setText("S/" + e.format(descuento));
                    lblDesVerano.setText("s/." + e.format(desVerano));
                    lblTotalDes2.setText("s/." + e.format(totalPagar));
                    txtCantCamisetasVerano.requestFocus();

                }else{
                    JOptionPane.showMessageDialog(this, "Solo se aceptan numeros entero ");
                }
            }else{
                JOptionPane.showMessageDialog(this, "El numero no purde ser cero ");
            }
        }
    }//GEN-LAST:event_txtCantCamisetasVeranoKeyPressed

    private void btnCalularDes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalularDes1ActionPerformed
        String text=txtCantCamisetasVerano.getText();

        if(text.matches("\\d+")){

            short cantidad;
            float precio = 20;
            cantidad = Short.parseShort(txtCantCamisetasVerano.getText().trim());
            if(cantidad > 0){
                float importe = precio * cantidad;
                float descuento = importe * 7/100;
                float desVerano = (importe * 93/100 * 7/100);
                float totalPagar = (importe * 93/100* 93/100);

                //Devolver iformacion
                DecimalFormat e = new DecimalFormat("0.00");
                lblImporte2.setText("s/." + e.format(importe) );
                lblDesGeneral2.setText("S/" + e.format(descuento));
                lblDesVerano.setText("s/." + e.format(desVerano));
                lblTotalDes2.setText("s/." + e.format(totalPagar));
                txtCantCamisetasVerano.requestFocus();

            }else{
                JOptionPane.showMessageDialog(this, "Solo se aceptan numeros entero ");
            }
        }else{
            JOptionPane.showMessageDialog(this, "El numero no purde ser cero ");
        }

    }//GEN-LAST:event_btnCalularDes1ActionPerformed

    private void btnLimpiarDes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDes1ActionPerformed
        txtCantCamisetasVerano.setText("");
        lblImporte2.setText("s/."  );
        lblDesGeneral2.setText("S/" );
        lblDesVerano.setText("s/." );
        lblTotalDes2.setText("s/." );
    }//GEN-LAST:event_btnLimpiarDes1ActionPerformed

    private void btnSalirDes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDes1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirDes1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalularDes1;
    private javax.swing.JButton btnLimpiarDes1;
    private javax.swing.JButton btnSalirDes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDesGeneral2;
    private javax.swing.JLabel lblDesVerano;
    private javax.swing.JLabel lblDescuentoVerano;
    private javax.swing.JLabel lblImporte2;
    private javax.swing.JLabel lblTotalDes2;
    private javax.swing.JPanel panel3;
    private javax.swing.JTextField txtCantCamisetasVerano;
    // End of variables declaration//GEN-END:variables
}
