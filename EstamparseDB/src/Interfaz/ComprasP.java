package Interfaz;

import codigo.*;
import java.awt.*;
import java.awt.image.*;
import java.sql.Blob;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class ComprasP extends javax.swing.JFrame {

    DatosEstampa d1 = new DatosEstampa();
    DatosRegistro m1 = new DatosRegistro();
    ArrayList<BufferedImage> imagenGaleriaTemp = new ArrayList<>();
    ArrayList<Blob> archivoGaleria = new ArrayList<>();
    ArrayList<String> infoGaleriaTemp = new ArrayList<>();
    ArrayList<String> categoriaTemp = new ArrayList<>();
    ArrayList<String> tallaTemp = new ArrayList<>();
    ArrayList<String> tipoTemp = new ArrayList<>();
    ArrayList<String> colorTemp = new ArrayList<>();
    ArrayList<Integer> precioTemp = new ArrayList<>();
    Blob imagen = null;
    static int recorrido = 0;
    static int PrecioEstampa = 0;
    static boolean SiSelecciono = false;
    Compra c2 = new Compra();
    String infoTotal = "";

    public ComprasP() {
        d1.ObtenerEstampa();
        m1.obtenerTallas();
        archivoGaleria = DatosEstampa.datosEstampa;
        imagenGaleriaTemp = DatosEstampa.imagenGaleria;
        infoGaleriaTemp = DatosEstampa.GaleriaTemp;
        categoriaTemp = DatosEstampa.CategoriasTemp;
        tallaTemp = DatosRegistro.TallaLista;
        colorTemp = DatosRegistro.ColorLista;
        tipoTemp = DatosRegistro.TipoLista;
        precioTemp = DatosEstampa.precioTemp;
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("COMPRA CAMISETAS");
        for (String categoriaTemp1 : categoriaTemp) {
            FiltroCat.addItem(categoriaTemp1);
        }
        for (String tallaTemp1 : tallaTemp) {
            TallaBox_2.addItem(tallaTemp1);
        }
        for (String colorTemp1 : colorTemp) {
            colorBox.addItem(colorTemp1);
        }
        for (String tipoTemp1 : tipoTemp) {
            TipoCamisetaBox.addItem(tipoTemp1);
        }
        if (recorrido == 0 && imagenGaleriaTemp.isEmpty()) {
            PrevBoton.setVisible(false);
            NextBoton.setVisible(false);
            ImagenLabel.setVisible(false);
            EstampaText.setVisible(false);
            TodoTxt.setVisible(false);
            SeleccionarBoton.setVisible(false);
            FiltroCat.setVisible(false);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cuelloV = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TallaBox_2 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        colorBox = new javax.swing.JComboBox();
        EstampaText = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        botonAñadirCarrito = new javax.swing.JButton();
        botonComprar = new javax.swing.JButton();
        txtPosicionEstampa = new javax.swing.JLabel();
        PosicionBox = new javax.swing.JComboBox();
        txtCantidad = new javax.swing.JLabel();
        cajonCantidad = new javax.swing.JTextField();
        PrevBoton = new javax.swing.JButton();
        NextBoton = new javax.swing.JButton();
        txtNumeroCuenta = new javax.swing.JLabel();
        cajonNumeroCuenta = new javax.swing.JPasswordField();
        txtDireccionEnvio = new javax.swing.JLabel();
        cajonDireccionEnvio = new javax.swing.JTextField();
        ContadorTxt = new javax.swing.JLabel();
        ImagenLabel = new javax.swing.JLabel();
        comboTipoPago = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        SeleccionarBoton = new javax.swing.JButton();
        TodoTxt = new javax.swing.JTextArea();
        FiltroCat = new javax.swing.JComboBox();
        TipoCamisetaBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        cuelloV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/cuello v.jpg"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/cuello v m.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("HOMBRE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MUJER");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo de camiseta");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tallas");

        TallaBox_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Colores");

        colorBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        EstampaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EstampaText.setText("Flitro de Estampas");

        botonRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        botonAñadirCarrito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonAñadirCarrito.setText("Añadir al carrito");
        botonAñadirCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirCarritoActionPerformed(evt);
            }
        });

        botonComprar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonComprar.setText("Comprar");
        botonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarActionPerformed(evt);
            }
        });

        txtPosicionEstampa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPosicionEstampa.setText("Posición");

        PosicionBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PosicionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arriba", "Abajo", "Izquierda", "Derecha", "Centro", "Arriba derecha", "Arriba izquierda", "Abajo derecha", "Abajo izquierda", "Centro derecha", "Centro izquierda" }));

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidad.setText("Cantidad");

        PrevBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrevBoton.setText("<");
        PrevBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevBotonActionPerformed(evt);
            }
        });

        NextBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NextBoton.setText(">");
        NextBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBotonActionPerformed(evt);
            }
        });

        txtNumeroCuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumeroCuenta.setText("Numero de cuenta");

        txtDireccionEnvio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDireccionEnvio.setText("Direccion de envio");

        ImagenLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comboTipoPago.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboTipoPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Debito", "Credito" }));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Tipo de tarjeta");

        SeleccionarBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SeleccionarBoton.setText("Seleccionar Estampa");
        SeleccionarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarBotonActionPerformed(evt);
            }
        });

        TodoTxt.setEditable(false);
        TodoTxt.setBackground(new java.awt.Color(214, 217, 223));
        TodoTxt.setColumns(20);
        TodoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TodoTxt.setRows(5);
        TodoTxt.setAutoscrolls(false);
        TodoTxt.setBorder(null);
        TodoTxt.setCaretColor(new java.awt.Color(240, 240, 240));
        TodoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TodoTxt.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        TodoTxt.setFocusable(false);
        TodoTxt.setRequestFocusEnabled(false);
        TodoTxt.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        TodoTxt.setSelectionColor(new java.awt.Color(240, 240, 240));
        TodoTxt.setVerifyInputWhenFocusTarget(false);

        FiltroCat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TODAS" }));
        FiltroCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroCatActionPerformed(evt);
            }
        });

        TipoCamisetaBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txtCantidad)
                            .addComponent(EstampaText)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PrevBoton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ImagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SeleccionarBoton)
                                        .addGap(9, 9, 9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NextBoton))
                            .addComponent(TodoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TipoCamisetaBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FiltroCat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cajonCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(colorBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 208, Short.MAX_VALUE)
                                .addComponent(TallaBox_2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PosicionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonRegresar)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajonDireccionEnvio)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNumeroCuenta)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cajonNumeroCuenta))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cuelloV, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPosicionEstampa)
                                        .addGap(57, 57, 57)
                                        .addComponent(ContadorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDireccionEnvio)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonAñadirCarrito)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonComprar))
                                    .addComponent(comboTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(35, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuelloV, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPosicionEstampa)
                            .addComponent(ContadorTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PosicionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRegresar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajonNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionEnvio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajonDireccionEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAñadirCarrito)
                            .addComponent(botonComprar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoCamisetaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TallaBox_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajonCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(EstampaText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrevBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NextBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TodoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeleccionarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        MenuClienteP p1 = new MenuClienteP();
        imagenGaleriaTemp.clear();
        archivoGaleria.clear();
        infoGaleriaTemp.clear();
        categoriaTemp.clear();
        tallaTemp.clear();
        tipoTemp.clear();
        colorTemp.clear();
        precioTemp.clear();
        p1.setVisible(true);
        dispose();

    }//GEN-LAST:event_botonRegresarActionPerformed

    private void PrevBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevBotonActionPerformed
        if (recorrido < imagenGaleriaTemp.size() && recorrido >= 0) {
            imagen = archivoGaleria.get(recorrido);
            ImageIcon imagen2 = new ImageIcon(imagenGaleriaTemp.get(recorrido));
            Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(ImagenLabel.getWidth(), ImagenLabel.getHeight(), Image.SCALE_DEFAULT));
            ImagenLabel.setIcon(icono);
            TodoTxt.setText(infoGaleriaTemp.get(recorrido));
            PrecioEstampa = precioTemp.get(recorrido);
            recorrido--;
        }
        if (recorrido == -1) {
            recorrido++;
            PrevBoton.setEnabled(false);
        }
        if (recorrido < imagenGaleriaTemp.size()) {
            NextBoton.setEnabled(true);
        }

    }//GEN-LAST:event_PrevBotonActionPerformed

    private void NextBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBotonActionPerformed

        if (recorrido < imagenGaleriaTemp.size()) {
            imagen = archivoGaleria.get(recorrido);
            ImageIcon imagen2 = new ImageIcon(imagenGaleriaTemp.get(recorrido));
            Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(ImagenLabel.getWidth(), ImagenLabel.getHeight(), Image.SCALE_DEFAULT));
            ImagenLabel.setIcon(icono);
            TodoTxt.setText(infoGaleriaTemp.get(recorrido));

            PrecioEstampa = precioTemp.get(recorrido);
            recorrido++;
        }
        if (recorrido == imagenGaleriaTemp.size()) {
            recorrido--;
            NextBoton.setEnabled(false);
        }
        if (recorrido >= 0) {
            PrevBoton.setEnabled(true);
        }

    }//GEN-LAST:event_NextBotonActionPerformed
    Calendar calendario = GregorianCalendar.getInstance();
    Date fecha = calendario.getTime();
    SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd / MM / yyyy hh:mm");

    private void botonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarActionPerformed
        String numCuenta = new String(cajonNumeroCuenta.getPassword());
        String direccionEnvio = cajonDireccionEnvio.getText();
        String talla = TallaBox_2.getSelectedItem().toString();
        String tipoCompra = comboTipoPago.getSelectedItem().toString();
        try {
            int cantidadCamisetas = Integer.parseInt(cajonCantidad.getText());
            if (SiSelecciono == true) {
                if (cantidadCamisetas > 0 && cantidadCamisetas <= 1000) {
                    double compras = c2.calcularDatos(talla, tipoCompra, PrecioEstampa, cantidadCamisetas);
                    d1.AlmacenarCompra(Ingreso.usuarioActivo, imagen, infoTotal, (int) compras,cantidadCamisetas);
                    int confirmacionCompra = JOptionPane.showConfirmDialog(NextBoton, "El precio de la camiseta/s es: $" + compras + "\nDesea continuar con la compra?", "Confirmacion de compra", 1);
                    if (confirmacionCompra == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(NextBoton, "Su pedido se hizo el: "
                                + formatoDeFecha.format(fecha)
                                + "\nSu camiseta le llegara en 5 dias");
                    }
                    PrecioEstampa = 0;
                    SiSelecciono = false;
                    infoTotal = "";
                } else {
                    JOptionPane.showMessageDialog(NextBoton, "La cantidad de camisetas debe ser de 1 a 1000");
                    cajonCantidad.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(NextBoton, "Debe subir la estampa para comprar...");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(NextBoton, "Digite un número para ingresar las compras, no letras");
        }


    }//GEN-LAST:event_botonComprarActionPerformed

    private void SeleccionarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarBotonActionPerformed
        if (PrecioEstampa > 0 && imagen != null) {
            SiSelecciono = true;
            infoTotal = TodoTxt.getText()
                    + "\n\nTalla: " + TallaBox_2.getSelectedItem()
                    + "\n\nPosición Estampa: " + PosicionBox.getSelectedItem()
                    + "\n\nTipo Camiseta: " + TipoCamisetaBox.getSelectedItem()
                    + "\n\nColor Camiseta: " + colorBox.getSelectedItem();
            JOptionPane.showMessageDialog(NextBoton, "La estampa ya fue seleccionada");
        } else {
            JOptionPane.showMessageDialog(NextBoton, "No has seleccionado una estampa valida");
        }
    }//GEN-LAST:event_SeleccionarBotonActionPerformed

    private void FiltroCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroCatActionPerformed
        imagenGaleriaTemp.clear();
        infoGaleriaTemp.clear();
        archivoGaleria.clear();
        if (!"TODAS".equals(FiltroCat.getSelectedItem().toString())) {
            ImagenLabel.setIcon(null);
            d1.ObtenerEstampaFiltro(FiltroCat.getSelectedItem().toString());
            imagenGaleriaTemp = DatosEstampa.imagenGaleria;
            infoGaleriaTemp = DatosEstampa.GaleriaTemp;
            archivoGaleria= DatosEstampa.datosEstampa;
            recorrido = 0;
        } else {
            ImagenLabel.setIcon(null);
            d1.ObtenerEstampa();
            imagenGaleriaTemp = DatosEstampa.imagenGaleria;
            infoGaleriaTemp = DatosEstampa.GaleriaTemp;
            archivoGaleria= DatosEstampa.datosEstampa;
            recorrido = 0;
        }
    }//GEN-LAST:event_FiltroCatActionPerformed

    private void botonAñadirCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirCarritoActionPerformed
        String talla = "";
        String tipoCompra = "";
        if (SiSelecciono == true) {
            talla = TallaBox_2.getSelectedItem().toString();
            tipoCompra = comboTipoPago.getSelectedItem().toString();
            int confirmacionCompra = JOptionPane.showConfirmDialog(NextBoton, "¿Desea añadir al carrito la camisa?");
            if (confirmacionCompra == JOptionPane.YES_OPTION) {
                double compras = c2.calcularDatos(talla, tipoCompra, PrecioEstampa, 0);
                PrecioEstampa = 0;
                d1.AlmacenarCarrito(Ingreso.usuarioActivo, imagen, infoTotal, (int) compras);
                JOptionPane.showMessageDialog(NextBoton, "ya se añadio al carrito de compras: "
                        + (int) compras + " " + talla
                        + " " + TipoCamisetaBox.getSelectedItem()
                        + " " + colorBox.getSelectedItem()
                        + " " + PosicionBox.getSelectedItem());
                SiSelecciono = false;
            }
        } else {
            JOptionPane.showMessageDialog(NextBoton, "Debe subir una estampa para añadir al carrito,"
                    + " no interesa si no digita cantidad");
        }

    }//GEN-LAST:event_botonAñadirCarritoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContadorTxt;
    private javax.swing.JLabel EstampaText;
    private javax.swing.JComboBox FiltroCat;
    private javax.swing.JLabel ImagenLabel;
    private javax.swing.JButton NextBoton;
    private javax.swing.JComboBox PosicionBox;
    private javax.swing.JButton PrevBoton;
    private javax.swing.JButton SeleccionarBoton;
    private javax.swing.JComboBox TallaBox_2;
    private javax.swing.JComboBox TipoCamisetaBox;
    private javax.swing.JTextArea TodoTxt;
    private javax.swing.JButton botonAñadirCarrito;
    private javax.swing.JButton botonComprar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JTextField cajonCantidad;
    private javax.swing.JTextField cajonDireccionEnvio;
    private javax.swing.JPasswordField cajonNumeroCuenta;
    private javax.swing.JComboBox colorBox;
    private javax.swing.JComboBox comboTipoPago;
    private javax.swing.JLabel cuelloV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtDireccionEnvio;
    private javax.swing.JLabel txtNumeroCuenta;
    private javax.swing.JLabel txtPosicionEstampa;
    // End of variables declaration//GEN-END:variables
}
