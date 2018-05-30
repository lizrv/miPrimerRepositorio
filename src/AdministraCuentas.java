
import com.sun.glass.events.KeyEvent;
import java.awt.KeyboardFocusManager;
import javax.swing.JOptionPane;


public class AdministraCuentas extends javax.swing.JFrame {
    AdministraLista al;
  
    public AdministraCuentas() {
        initComponents();
        Principal ventanaFrmPrincipal= new Principal();
        al=ventanaFrmPrincipal.alj;
        btnEliminar.setEnabled(false);
    }
    int cont=0;
    public void validaCampos()
    {
        if(tfNombre.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"¡No puede dejar el espacio de nombre vacio!","ADEVERTENCIA",JOptionPane.WARNING_MESSAGE);
            tfNombre.requestFocus();
            cont++;
        }
        if(tfApellido.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"¡No puede dejar el espacio de apellido vacio!","ADEVERTENCIA",JOptionPane.WARNING_MESSAGE);
            tfApellido.requestFocus();
            cont++;
        }
        if(tfSaldo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"¡No puede dejar el espacio de saldo vacio!","ADEVERTENCIA",JOptionPane.WARNING_MESSAGE);
            tfSaldo.requestFocus();
            cont++;
        }
        if(!rbtFemenino.isSelected()&&!rbtMasculino.isSelected())
        {
            JOptionPane.showMessageDialog(null,"¡No puede dejar el espacio de genero vacio","ADEVERTENCIA",JOptionPane.WARNING_MESSAGE);
            cont++;
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        botonGrupo2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFemenino = new javax.swing.JRadioButton();
        tfNumCliente = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfSaldo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Num. Cliente:");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Género", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 2, 12))); // NOI18N

        botonGrupo2.add(rbtMasculino);
        rbtMasculino.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        rbtMasculino.setText("Masculino");
        rbtMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMasculinoActionPerformed(evt);
            }
        });
        rbtMasculino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbtMasculinoKeyPressed(evt);
            }
        });

        botonGrupo2.add(rbtFemenino);
        rbtFemenino.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        rbtFemenino.setText("Femenino");
        rbtFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFemeninoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtMasculino)
                    .addComponent(rbtFemenino))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbtMasculino)
                .addGap(18, 18, 18)
                .addComponent(rbtFemenino))
        );

        tfNumCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNumCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumClienteActionPerformed(evt);
            }
        });
        tfNumCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNumClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumClienteKeyTyped(evt);
            }
        });

        tfNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });

        tfApellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setText("Saldo:");

        tfSaldo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSaldoActionPerformed(evt);
            }
        });
        tfSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSaldoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSaldoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSaldo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNumCliente))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(tfApellido))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       cont=0;
       validaCampos();
       if(cont==0)
       {
       int nc=Integer.parseInt(tfNumCliente.getText());
       int posicion=al.buscaPersona(nc);
       if(posicion!=-1)
       {
           JOptionPane.showMessageDialog(null,"ESTE REGISTRO YA EXISTE");
           tfNumCliente.setText("");
           tfNombre.setText("");
           tfApellido.setText("");
           tfSaldo.setText("");
           if(rbtMasculino.isSelected())
           {
               rbtMasculino.setSelected(false);
               botonGrupo2.clearSelection();
           }
           if(rbtFemenino.isSelected())
           {
               rbtFemenino.setSelected(false);
               botonGrupo2.clearSelection();
           }
           tfNumCliente.requestFocus();
       }
       else
       {
           
            String genero="";
           if(rbtMasculino.isSelected())
           {
               genero="Masculino";
           }
           if(rbtFemenino.isSelected())
           {
               genero="Femenino";
           }
           String nombre=tfNombre.getText();
           String apellido=tfApellido.getText();
           double saldo=Double.parseDouble(tfSaldo.getText());
           Jugador cliente=new Jugador(nombre,apellido,genero,nc,saldo);
           al.agregaPersona(cliente);
           JOptionPane.showMessageDialog(null,"EL REGISTRO HA SIDO GUARDADO");
            System.out.println(nc);
           tfNumCliente.setText("");
           tfNombre.setText("");
           tfApellido.setText("");
           tfSaldo.setText("");
           if(rbtMasculino.isSelected())
           {
               rbtMasculino.setSelected(false);
               botonGrupo2.clearSelection();
           }
           if(rbtFemenino.isSelected())
           {
               rbtFemenino.setSelected(false);
               botonGrupo2.clearSelection();
           }
           tfNumCliente.requestFocus();
           btnAgregar.setEnabled(false);
       }
       }
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int nc=Integer.parseInt(tfNumCliente.getText());
        int encontroPersona= al.buscaPersona(nc);
        if(encontroPersona!=-1)
        {   
            int op=JOptionPane.showConfirmDialog(null,"¿ESTA SEGURO DE ELIMINAR EL REGISTRO?");
            if(op==0)
            {
            //al.eliminaPersona(encontroPersona);
            al.eliminaPersona(encontroPersona);
            JOptionPane.showMessageDialog(null,"EL REGISTRO HA SIDO ELIMINADO");
            tfNumCliente.setText("");
            tfNombre.setText("");
            tfApellido.setText("");
            tfSaldo.setText("");
            tfNumCliente.requestFocus();
            if(rbtMasculino.isSelected())
            {
                rbtMasculino.setSelected(false);
                botonGrupo2.clearSelection();
            }
            if(rbtFemenino.isSelected())
            {
                rbtFemenino.setSelected(false);
                botonGrupo2.clearSelection();
            }
            btnEliminar.setEnabled(false);
            }
            else
            {
                tfNumCliente.requestFocus();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tfNumClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumClienteActionPerformed

    private void tfNumClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumClienteKeyPressed
         tfNumCliente.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,java.util.Collections.EMPTY_SET);
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         {
        int nc=Integer.parseInt(tfNumCliente.getText());
        int encontro= al.buscaPersona(nc);
        if(encontro!=-1)
        {
            Jugador datos= (Jugador)al.regresaPersona(encontro);
            tfNombre.setText(String.valueOf(datos.getNombre()));
            tfApellido.setText(String.valueOf(datos.getApellido()));
            
            String genero=datos.getGenero();
            System.out.println("genero:  "+genero);
            if(genero.equals("Masculino"))
            {
                rbtMasculino.setSelected(true);
            }
             if(genero.equals("Femenino"))
            {
                rbtFemenino.setSelected(true);
            }
            tfSaldo.setText(String.valueOf(datos.getSaldo()));
            btnEliminar.setEnabled(true);
        }
        else
        {
            tfNombre.setText("");
            tfNombre.requestFocus();
            tfApellido.setText("");
            tfSaldo.setText("");
            if(rbtMasculino.isSelected())
            {
                rbtMasculino.setSelected(false);
                botonGrupo2.clearSelection();
            }
            if(rbtFemenino.isSelected())
            {
                rbtFemenino.setSelected(false);
                botonGrupo2.clearSelection();
            }
            btnAgregar.setEnabled(true);
            btnEliminar.setEnabled(false);
        }
         }
    }//GEN-LAST:event_tfNumClienteKeyPressed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyPressed
        tfNombre.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,java.util.Collections.EMPTY_SET);
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         {
           tfApellido.requestFocus();
         }
    }//GEN-LAST:event_tfNombreKeyPressed

    private void tfApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoKeyPressed
         tfApellido.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,java.util.Collections.EMPTY_SET);
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         {
           rbtMasculino.requestFocus();
         }
    }//GEN-LAST:event_tfApellidoKeyPressed

    private void rbtMasculinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtMasculinoKeyPressed
      rbtMasculino.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,java.util.Collections.EMPTY_SET);
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         {
           rbtFemenino.requestFocus();
         }
    }//GEN-LAST:event_rbtMasculinoKeyPressed

    private void rbtMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMasculinoActionPerformed
        if(rbtMasculino.isSelected())
        {
            tfSaldo.requestFocus();
        }
    }//GEN-LAST:event_rbtMasculinoActionPerformed

    private void rbtFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFemeninoActionPerformed
        if(rbtFemenino.isSelected())
        {
            tfSaldo.requestFocus();
        }
    }//GEN-LAST:event_rbtFemeninoActionPerformed

    private void tfSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaldoActionPerformed

    private void tfSaldoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSaldoKeyPressed
     
    }//GEN-LAST:event_tfSaldoKeyPressed

    private void tfSaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSaldoKeyTyped
        char c=evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_tfSaldoKeyTyped

    private void tfNumClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumClienteKeyTyped
      char c=evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_tfNumClienteKeyTyped

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
      char c=evt.getKeyChar();
      if(c<'a'||c>'z')evt.consume();
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoKeyTyped
        char c=evt.getKeyChar();
      if(c<'a'||c>'z')evt.consume();
    }//GEN-LAST:event_tfApellidoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministraCuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botonGrupo2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumCliente;
    private javax.swing.JTextField tfSaldo;
    // End of variables declaration//GEN-END:variables
}
