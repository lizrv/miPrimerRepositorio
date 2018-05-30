
import com.sun.glass.events.KeyEvent;
import java.awt.KeyboardFocusManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {
   static ArrayList<Jugador> listaPersonas= new ArrayList<Jugador>();
   static AdministraLista alj=new AdministraLista(listaPersonas);
   static Archivos archivon=new Archivos("acasino.txt");
  
    public Principal() {
        initComponents();
        btnJugar.setEnabled(false);
        btnIncrementarSaldo.setEnabled(false);
       
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        botonGrupo1 = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFemenino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        tfNumCliente = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        tfSaldo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfCantApostar = new javax.swing.JTextField();
        btnJugar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfDado1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tfDado2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfResultado = new javax.swing.JTextField();
        btnIncrementarSaldo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuClientes = new javax.swing.JMenu();
        smnuAdminClientes = new javax.swing.JMenuItem();
        smnuListado = new javax.swing.JMenuItem();
        smnuSalir = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        smnuAcerca = new javax.swing.JMenuItem();

        jLabel6.setText("jLabel5");

        jButton1.setText("jButton1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("Número Cliente:");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Género", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 2, 14))); // NOI18N

        botonGrupo1.add(rbtMasculino);
        rbtMasculino.setText("Masculino");
        rbtMasculino.setEnabled(false);

        rbtFemenino.setText("Femenino");
        rbtFemenino.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtMasculino)
                    .addComponent(rbtFemenino))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtFemenino)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("Saldo:");

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
        tfNombre.setEnabled(false);
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        tfApellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfApellido.setEnabled(false);

        tfSaldo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfSaldo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNumCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaldo))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tfApellido))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tfNombre))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "JUGADA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad Apostar:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 32, -1, -1));

        tfCantApostar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCantApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCantApostarActionPerformed(evt);
            }
        });
        tfCantApostar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCantApostarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCantApostarKeyTyped(evt);
            }
        });
        jPanel2.add(tfCantApostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 32, 131, -1));

        btnJugar.setBackground(new java.awt.Color(225, 23, 23));
        btnJugar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnJugar.setText("JUGAR");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        jPanel2.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 64, 145, 32));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setText("DADO 1:");

        tfDado1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfDado1.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfDado1)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 119, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setText("DADO 2:");

        tfDado2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfDado2.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfDado2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(7, 7, 7)
                .addComponent(tfDado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 119, -1, 73));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setText("RESULTADO:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 212, -1, -1));

        tfResultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tfResultado.setEnabled(false);
        jPanel2.add(tfResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 210, 159, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 290, 290));

        btnIncrementarSaldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIncrementarSaldo.setText("INCREMENTAR SALDO");
        btnIncrementarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncrementarSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(btnIncrementarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 37));

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 87, 37));

        jLabel10.setFont(new java.awt.Font("Budmo Jigglish", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("\"LAS 6 CARAS DEL DADO\"");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        mnuClientes.setText("CLIENTES");

        smnuAdminClientes.setText("Administrar Cuentas");
        smnuAdminClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuAdminClientesActionPerformed(evt);
            }
        });
        mnuClientes.add(smnuAdminClientes);

        smnuListado.setText("Listado");
        smnuListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuListadoActionPerformed(evt);
            }
        });
        mnuClientes.add(smnuListado);

        smnuSalir.setText("Salir");
        smnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuSalirActionPerformed(evt);
            }
        });
        mnuClientes.add(smnuSalir);

        jMenuBar1.add(mnuClientes);

        mnuAyuda.setText("AYUDA");

        smnuAcerca.setText("Acerca de");
        smnuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuAcercaActionPerformed(evt);
            }
        });
        mnuAyuda.add(smnuAcerca);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuSalirActionPerformed
       String cadena="";
        System.out.println("tamaño lista personas: "+listaPersonas.size());
        for(int i=0;i<listaPersonas.size();i++)
      {
         cadena+=listaPersonas.get(i).getNombre()+"-"+listaPersonas.get(i).getApellido()+"-"+listaPersonas.get(i).getGenero()+"-"+listaPersonas.get(i).getNumJugador()+"-"+listaPersonas.get(i).getSaldo()+"\n";
      }
        archivon.crearArchivo(cadena);
        System.exit(0);
    }//GEN-LAST:event_smnuSalirActionPerformed

    private void smnuListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuListadoActionPerformed
    FrmListaClientes ventana= new FrmListaClientes();
    ventana.setTitle("LISTADO CLIENTES");
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
    }//GEN-LAST:event_smnuListadoActionPerformed

    private void smnuAdminClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuAdminClientesActionPerformed
       AdministraCuentas ventanaclientes=new AdministraCuentas();
       ventanaclientes.setVisible(true);
       ventanaclientes.setLocationRelativeTo(null);
       ventanaclientes.setTitle("ADMINISTRADOR DE CUENTAS");
    }//GEN-LAST:event_smnuAdminClientesActionPerformed

    private void btnIncrementarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncrementarSaldoActionPerformed
   
        if(tfNumCliente.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Capturar número de cliente","Error",JOptionPane.ERROR_MESSAGE);
            tfNumCliente.requestFocus();
        }
        else
        {
          double cantidad=Double.parseDouble(JOptionPane.showInputDialog("¿CANTIDAD A INCREMENTAR?"));
         double incrementar=Double.parseDouble(tfSaldo.getText())+cantidad;
          tfSaldo.setText(String.valueOf(incrementar));
          int bcliente=Integer.parseInt(tfNumCliente.getText());
          int buscaCliente=alj.buscaPersona(bcliente);
          Jugador datos=(Jugador)alj.regresaPersona(buscaCliente);
          datos.setSaldo(incrementar);
        }
        /*
        int nc=Integer.parseInt(tfNumCliente.getText());
        int posicion=alj.buscaPersona(nc);
        Jugador datos=(Jugador)alj.regresaPersona(posicion);
        tfSaldo.setText(String.valueOf(datos.saldo));
        */  
    }//GEN-LAST:event_btnIncrementarSaldoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
     String cadena="";
        for(int i=0;i<listaPersonas.size();i++)
      {
         cadena+=listaPersonas.get(i).getNombre()+"-"+listaPersonas.get(i).getApellido()+"-"+listaPersonas.get(i).getGenero()+"-"+listaPersonas.get(i).getNumJugador()+"-"+listaPersonas.get(i).getSaldo()+"\n";
      }
        archivon.crearArchivo(cadena);
    
     System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        int nc=Integer.parseInt(tfCantApostar.getText());
        if(nc==0)
        {
            JOptionPane.showMessageDialog(null,"NO PUEDE JUGAR CON ESA CANTIDAD");
            tfCantApostar.setText("");
            tfCantApostar.requestFocus();
        }
        if(tfNumCliente.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Es necesario capturar número de cliente","Error",JOptionPane.ERROR_MESSAGE);
            tfNumCliente.requestFocus();
        }  
        
       else
        {
        if(tfCantApostar.getText().isEmpty())
       {
         JOptionPane.showMessageDialog(null,"Es necesario capturar cantidad a apostar","Error",JOptionPane.ERROR_MESSAGE);
         tfCantApostar.requestFocus();
       }
        
        else
        {
             double saldoFinal;
       int op;
       LanzarDados dado1= new LanzarDados();
       LanzarDados dado2= new LanzarDados();
       int d1;
       int d2;
       int r;
        int nj=Integer.parseInt(tfNumCliente.getText());
        Jugador datos =(Jugador) alj.regresaPersona(alj.buscaPersona(nj));
        double saldo=datos.getSaldo();
        double cantApostar=Double.parseDouble(tfCantApostar.getText());
        if(saldo>=cantApostar)
        {
            dado1.lanzamiento();
            tfDado1.setText(String.valueOf(dado1.getDado()));
            dado2.lanzamiento();
            tfDado2.setText(String.valueOf(dado2.getDado()));
             d1=Integer.parseInt(tfDado1.getText());
             d2=Integer.parseInt(tfDado2.getText());
            r=d1+d2;
            tfResultado.setText(String.valueOf(r));
            if(r==7)
            {
                saldoFinal=saldo+cantApostar;
                JOptionPane.showMessageDialog(null,"¡ FELICIDADES HA GANADO LA PARTIDA !\n Su nuevo saldo es de: $"+saldoFinal);
                tfSaldo.setText(String.valueOf(saldoFinal));
                datos.setSaldo(saldoFinal);
                op=JOptionPane.showConfirmDialog(null,"¿Desea segir jugando?");
                if(op==0)
                {
                    tfResultado.setText("");
                    tfDado1.setText("");
                    tfDado2.setText("");
                    tfCantApostar.setText("");
                    tfCantApostar.requestFocus();
                }
                else
                {
                    if(op==1)
                    {
                    String cadena="";
                    System.out.println("tamaño lista personas: "+listaPersonas.size());
                    for(int i=0;i<listaPersonas.size();i++)
                    {
                     cadena+=listaPersonas.get(i).getNombre()+"-"+listaPersonas.get(i).getApellido()+"-"+listaPersonas.get(i).getGenero()+"-"+listaPersonas.get(i).getNumJugador()+"-"+listaPersonas.get(i).getSaldo()+"\n";
                     }
                     archivon.crearArchivo(cadena);
                      System.exit(0);
                    }
                }
                          
                
            }  
            else
            {
                saldoFinal=saldo-cantApostar;
                JOptionPane.showMessageDialog(null,"PARTIDA NO GANADA\n Su nuevo saldo es de: $"+ saldoFinal);
                tfSaldo.setText(String.valueOf(saldoFinal));
                datos.setSaldo(saldoFinal);
                op=JOptionPane.showConfirmDialog(null,"¿Desea seguir jugando?");
                if(op==0)
                {
                    tfResultado.setText("");
                    tfDado1.setText("");
                    tfDado2.setText("");
                    tfCantApostar.setText("");
                    tfCantApostar.requestFocus();
                }
                else
                {
                    if(op==1)
                    {
                    String cadena="";
                    System.out.println("tamaño lista personas: "+listaPersonas.size());
                     for(int i=0;i<listaPersonas.size();i++)
                    {
                      cadena+=listaPersonas.get(i).getNombre()+"-"+listaPersonas.get(i).getApellido()+"-"+listaPersonas.get(i).getGenero()+"-"+listaPersonas.get(i).getNumJugador()+"-"+listaPersonas.get(i).getSaldo()+"\n";
                     }
                     archivon.crearArchivo(cadena);
                    System.exit(0);
                    }
                }
                  
            }
                  
        }
  //de aqui es si el saldo es menor a la cantidad a apostar      
        else
        {
            JOptionPane.showMessageDialog(null,"No es posible jugar ya que no tiene el suficiente saldo","ADEVERTENCIA",JOptionPane.WARNING_MESSAGE);
            op= JOptionPane.showConfirmDialog(null,"¿Desea seguir jugando?");
            if(op==0)
            {
                int opc=JOptionPane.showConfirmDialog(null,"¿Jugar con la cantidad anterior a apostar?");
                if(opc==0)
                {
                   double sal=Double.parseDouble(JOptionPane.showInputDialog("Saldo a incrementar:"));
                   double incrementar=Double.parseDouble(tfSaldo.getText())+sal;
                   JOptionPane.showMessageDialog(null,"Su saldo ahora es de: $"+incrementar);
                   tfSaldo.setText(String.valueOf(incrementar));
                   datos.setSaldo(incrementar);
                   dado1.lanzamiento();
                   dado2.lanzamiento();
                   tfDado1.setText(String.valueOf(dado1.getDado()));
                   tfDado2.setText(String.valueOf(dado2.getDado()));
                   d1=Integer.parseInt(tfDado1.getText());
                   d2=Integer.parseInt(tfDado2.getText());
                   r=d1+d2;
                   tfResultado.setText(String.valueOf(r));
                   if(r==7)
                   {
                        saldoFinal=datos.getSaldo()+cantApostar;
                       JOptionPane.showMessageDialog(null,"¡ FELICIDADES HA GANADO LA PARTIDA !\n Su nuevo saldo es de: $"+saldoFinal);
    
                        tfSaldo.setText(String.valueOf(saldoFinal));
                        datos.setSaldo(saldoFinal);
                        op=JOptionPane.showConfirmDialog(null,"¿Desea segir jugando?");
                        if(op==0)
                        {
                           tfResultado.setText("");
                           tfDado1.setText("");
                           tfDado2.setText("");
                           tfCantApostar.setText("");
                           tfCantApostar.requestFocus();
                        }
                        else
                        {
                            if(op==1)
                            {
                                 String cadena="";
                                  for(int i=0;i<listaPersonas.size();i++)
                                  {
                                    cadena+=listaPersonas.get(i).getNombre()+"-"+listaPersonas.get(i).getApellido()+"-"+listaPersonas.get(i).getGenero()+"-"+listaPersonas.get(i).getNumJugador()+"-"+listaPersonas.get(i).getSaldo()+"\n";
                                     }
                                  archivon.crearArchivo(cadena);
    
                                System.exit(0);
                            }
                         }  
                   }
                   else
                   {
                       double cap=Double.parseDouble(tfCantApostar.getText());
                       saldoFinal=datos.getSaldo()-cap;
                        JOptionPane.showMessageDialog(null,"PARTIDA NO GANADA\n Su nuevo saldo es de: $"+ saldoFinal);
                        tfSaldo.setText(String.valueOf(saldoFinal));
                        datos.setSaldo(saldoFinal);
                        op=JOptionPane.showConfirmDialog(null,"¿Desea segir jugando?");
                        if(op==0)
                        {
                          tfResultado.setText("");
                          tfDado1.setText("");
                          tfDado2.setText("");
                          tfCantApostar.setText("");
                          tfCantApostar.requestFocus();
                        }
                        else
                        {
                            if(op==1)
                            {
                                 String cadena="";
                                for(int i=0;i<listaPersonas.size();i++)
                              {
                                 cadena+=listaPersonas.get(i).getNombre()+"-"+listaPersonas.get(i).getApellido()+"-"+listaPersonas.get(i).getGenero()+"-"+listaPersonas.get(i).getNumJugador()+"-"+listaPersonas.get(i).getSaldo()+"\n";
                              }
                                archivon.crearArchivo(cadena);

                             System.exit(0);
                            }
                        }
                   }
                       
                   
                }
                else
                {
                    tfCantApostar.setText("");
                    tfCantApostar.requestFocus();
                }
            }
            else
            {
                 String cadena="";
                    for(int i=0;i<listaPersonas.size();i++)
                  {
                     cadena+=listaPersonas.get(i).getNombre()+"-"+listaPersonas.get(i).getApellido()+"-"+listaPersonas.get(i).getGenero()+"-"+listaPersonas.get(i).getNumJugador()+"-"+listaPersonas.get(i).getSaldo()+"\n";
                  }
                    archivon.crearArchivo(cadena);

                System.exit(0);
            }
        }
     
        }
        
        
       
        
       

        }
       
        
        
       
    }//GEN-LAST:event_btnJugarActionPerformed

    private void tfNumClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumClienteActionPerformed

    private void tfNumClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumClienteKeyPressed
     tfNumCliente.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,java.util.Collections.EMPTY_SET);
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
     {
          
             if(rbtFemenino.isSelected())
             {
                 botonGrupo1.clearSelection();
                rbtFemenino.setSelected(false);
             }
             if(rbtMasculino.isSelected())
             {
                 botonGrupo1.clearSelection();
                rbtMasculino.setSelected(false);
             }
            
        
        String numc=tfNumCliente.getText();
        int nc=Integer.parseInt(tfNumCliente.getText());
       
        int posicion=alj.buscaPersona(nc);
        if(posicion==-1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCUENTRA REGISTRO");
            tfNumCliente.setText("");
            tfNombre.setText("");
            tfApellido.setText("");
            tfSaldo.setText("");
            if(rbtMasculino.isSelected())
            {
                rbtMasculino.setSelected(false);
                botonGrupo1.clearSelection();
            }
            if(rbtFemenino.isSelected())
            {
                rbtFemenino.setSelected(false);
                botonGrupo1.clearSelection();
            }
            tfNumCliente.requestFocus();
        }
        else
        {
            btnIncrementarSaldo.setEnabled(true);
            Jugador datos= (Jugador)alj.regresaPersona(posicion);
            tfNombre.setText(String.valueOf(datos.getNombre()));
            tfApellido.setText(String.valueOf(datos.getApellido()));
            String genero=datos.getGenero();
            if("Masculino".equals(genero))
            {
                rbtMasculino.setSelected(true);
            }
            else
            {
                if("Femenino".equals(genero))
                {
                    rbtFemenino.setSelected(true);
                }
            }
            tfSaldo.setText(String.valueOf(datos.getSaldo()));
            tfCantApostar.requestFocus();
        }
                
         }
    }//GEN-LAST:event_tfNumClienteKeyPressed

    private void tfCantApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCantApostarActionPerformed
    
    }//GEN-LAST:event_tfCantApostarActionPerformed

    private void tfCantApostarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCantApostarKeyPressed
    
      tfCantApostar.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,java.util.Collections.EMPTY_SET);
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         {
             btnJugar.setEnabled(true);
         }
    }//GEN-LAST:event_tfCantApostarKeyPressed

    private void smnuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuAcercaActionPerformed
       FrmAcerca nueva= new FrmAcerca();
       nueva.setTitle("ACERCA DE...");
       nueva.setVisible(true);
       nueva.setLocationRelativeTo(null);
    }//GEN-LAST:event_smnuAcercaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         String cadena="";
        for(int i=0;i<listaPersonas.size();i++)
      {
         cadena+=listaPersonas.get(i).getNombre()+"-"+listaPersonas.get(i).getApellido()+"-"+listaPersonas.get(i).getGenero()+"-"+listaPersonas.get(i).getNumJugador()+"-"+listaPersonas.get(i).getSaldo()+"\n";
      }
        archivon.crearArchivo(cadena);
    }//GEN-LAST:event_formWindowClosing

    private void tfNumClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumClienteKeyTyped
         char c=evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_tfNumClienteKeyTyped

    private void tfCantApostarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCantApostarKeyTyped
         char c=evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_tfCantApostarKeyTyped

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     //  alj.agregaPersona(new Jugador("Lizeth","Ruiz","Femenino",123,1200));
      // alj.agregaPersona(new Jugador("Daniela","Ruiz","Femenino",12,1000));
        String hayArchivo=archivon.leerArchivo();
       
       String [] separaLineas=hayArchivo.split("\n");
       String[] separaCampos={}; 
       for(int i=0;i<separaLineas.length;i++)
        {
            separaCampos=separaLineas[i].split("-");
            int numc=Integer.parseInt(separaCampos[3]);
            double sal=Double.parseDouble(separaCampos[4]);
            alj.agregaPersona(new Jugador(separaCampos[0],separaCampos[1],separaCampos[2],numc,sal));
        }
        
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botonGrupo1;
    private javax.swing.JButton btnIncrementarSaldo;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuClientes;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JMenuItem smnuAcerca;
    private javax.swing.JMenuItem smnuAdminClientes;
    private javax.swing.JMenuItem smnuListado;
    private javax.swing.JMenuItem smnuSalir;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCantApostar;
    private javax.swing.JTextField tfDado1;
    private javax.swing.JTextField tfDado2;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumCliente;
    private javax.swing.JTextField tfResultado;
    private javax.swing.JTextField tfSaldo;
    // End of variables declaration//GEN-END:variables
}
