package View;

import DTO.HeladoAlmacenDTO;
import DTO.IngredientesAlmacenDTO;
import java.awt.event.ActionListener;
import java.util.Collection;
import javax.swing.table.DefaultTableModel;

public class InicioView extends javax.swing.JFrame {
    public InicioView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevoIngrediente = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnNuevoHelado = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnHeladosPorProducir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableIngrediente = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableHelados = new javax.swing.JTable();
        txtIngrediente = new javax.swing.JTextField();
        btnSinStockIngrediente = new javax.swing.JButton();
        btnBuscarIngrediente = new javax.swing.JButton();
        txtHelado = new javax.swing.JTextField();
        btnBuscarHelado = new javax.swing.JButton();
        btnSinStockHelado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnReiniciarIngrediente = new javax.swing.JButton();
        btnReiniciarHelado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setBackground(new java.awt.Color(0, 153, 255));
        jToolBar1.setRollover(true);

        btnNuevoIngrediente.setBackground(new java.awt.Color(51, 102, 255));
        btnNuevoIngrediente.setFont(new java.awt.Font("Jokerman", 0, 14)); // NOI18N
        btnNuevoIngrediente.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoIngrediente.setText("NUEVO INGREDIENTE");
        btnNuevoIngrediente.setFocusable(false);
        btnNuevoIngrediente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoIngrediente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevoIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoIngredienteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevoIngrediente);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jSeparator2);

        btnNuevoHelado.setBackground(new java.awt.Color(0, 102, 255));
        btnNuevoHelado.setFont(new java.awt.Font("Jokerman", 0, 14)); // NOI18N
        btnNuevoHelado.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoHelado.setText("NUEVO HELADO");
        btnNuevoHelado.setActionCommand("Ingredientes");
        btnNuevoHelado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoHelado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNuevoHelado);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jSeparator1);

        btnHeladosPorProducir.setBackground(new java.awt.Color(0, 102, 255));
        btnHeladosPorProducir.setFont(new java.awt.Font("Jokerman", 0, 14)); // NOI18N
        btnHeladosPorProducir.setForeground(new java.awt.Color(255, 255, 255));
        btnHeladosPorProducir.setText("HELADOS POR PRODUCIR");
        btnHeladosPorProducir.setActionCommand("Ingredientes");
        btnHeladosPorProducir.setFocusable(false);
        btnHeladosPorProducir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHeladosPorProducir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHeladosPorProducir);

        jLabel1.setFont(new java.awt.Font("Jokerman", 0, 18)); // NOI18N
        jLabel1.setText("Inventario de Productos");

        jLabel2.setFont(new java.awt.Font("Jokerman", 0, 18)); // NOI18N
        jLabel2.setText("Inventario de Ingredientes");

        TableIngrediente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableIngrediente);

        TableHelados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TableHelados);

        txtIngrediente.setFont(new java.awt.Font("Jokerman", 0, 14)); // NOI18N

        btnSinStockIngrediente.setBackground(new java.awt.Color(255, 102, 102));
        btnSinStockIngrediente.setFont(new java.awt.Font("Jokerman", 0, 14)); // NOI18N
        btnSinStockIngrediente.setForeground(new java.awt.Color(255, 255, 255));
        btnSinStockIngrediente.setText("Sin Stock");

        btnBuscarIngrediente.setBackground(new java.awt.Color(51, 153, 255));
        btnBuscarIngrediente.setFont(new java.awt.Font("Jokerman", 0, 14)); // NOI18N
        btnBuscarIngrediente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarIngrediente.setText("Buscar");

        txtHelado.setFont(new java.awt.Font("Jokerman", 0, 14)); // NOI18N

        btnBuscarHelado.setBackground(new java.awt.Color(51, 153, 255));
        btnBuscarHelado.setFont(new java.awt.Font("Jokerman", 0, 14)); // NOI18N
        btnBuscarHelado.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarHelado.setText("Buscar");

        btnSinStockHelado.setBackground(new java.awt.Color(255, 102, 102));
        btnSinStockHelado.setFont(new java.awt.Font("Jokerman", 0, 14)); // NOI18N
        btnSinStockHelado.setForeground(new java.awt.Color(255, 255, 255));
        btnSinStockHelado.setText("Sin Stock");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icono.jpg"))); // NOI18N

        btnReiniciarIngrediente.setBackground(new java.awt.Color(51, 204, 0));
        btnReiniciarIngrediente.setFont(new java.awt.Font("Jokerman", 0, 14)); // NOI18N
        btnReiniciarIngrediente.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciarIngrediente.setText("Reiniciar");

        btnReiniciarHelado.setBackground(new java.awt.Color(51, 204, 0));
        btnReiniciarHelado.setFont(new java.awt.Font("Jokerman", 0, 14)); // NOI18N
        btnReiniciarHelado.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciarHelado.setText("Reiniciar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarIngrediente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReiniciarIngrediente)
                                    .addComponent(btnSinStockIngrediente))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscarHelado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReiniciarHelado))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtHelado, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSinStockHelado))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSinStockIngrediente)
                            .addComponent(txtHelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSinStockHelado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarIngrediente)
                            .addComponent(btnBuscarHelado)
                            .addComponent(btnReiniciarIngrediente)
                            .addComponent(btnReiniciarHelado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoIngredienteActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableHelados;
    private javax.swing.JTable TableIngrediente;
    private javax.swing.JButton btnBuscarHelado;
    private javax.swing.JButton btnBuscarIngrediente;
    private javax.swing.JButton btnHeladosPorProducir;
    private javax.swing.JButton btnNuevoHelado;
    private javax.swing.JButton btnNuevoIngrediente;
    private javax.swing.JButton btnReiniciarHelado;
    private javax.swing.JButton btnReiniciarIngrediente;
    private javax.swing.JButton btnSinStockHelado;
    private javax.swing.JButton btnSinStockIngrediente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtHelado;
    private javax.swing.JTextField txtIngrediente;
    // End of variables declaration//GEN-END:variables

    //ACCIONES ->
    public void mostrarPaginaNuevoHelado(ActionListener actionListener) {
        btnNuevoHelado.addActionListener(actionListener);
    }
    
    public void mostrarPaginaNuevoIngrediente(ActionListener actionListener) {
        btnNuevoIngrediente.addActionListener(actionListener);
    }
    
    public void mostrarPaginaHeladosPorProducirView(ActionListener actionListener) {
        btnHeladosPorProducir.addActionListener(actionListener);
    }
    
    public void resetearTablaIngrediente(ActionListener actionListener) {
        btnBuscarIngrediente.addActionListener(actionListener);
    }
    
    public void resetearTablaHelado(ActionListener actionListener) {
        btnBuscarHelado.addActionListener(actionListener);
    }
    
    public void ingredienteSinStock(ActionListener actionListener) {
        btnSinStockIngrediente.addActionListener(actionListener);
    }
    
    public void heladoSinStock(ActionListener actionListener) {
        btnSinStockHelado.addActionListener(actionListener);
    }
    
    public void reiniciarListaIngrediente(ActionListener actionListener) {
        btnReiniciarIngrediente.addActionListener(actionListener);
    }
    
    public void reiniciarListaHelados(ActionListener actionListener) {
        btnReiniciarHelado.addActionListener(actionListener);
    }
    
    //CUANDO CARGA LA APLICACION
    public void llenarTablaIngredientes(Collection<IngredientesAlmacenDTO> ListaIngredientes) {
        DefaultTableModel modelo = new DefaultTableModel();
        TableIngrediente.setModel(modelo);
        
        modelIngrediente(modelo, ListaIngredientes);
    }
    
    public void llenarTablaHelados(Collection<HeladoAlmacenDTO> ListaHelados) {
        DefaultTableModel modelo = new DefaultTableModel();
        TableHelados.setModel(modelo);
        
        modelHelado(modelo, ListaHelados);
    }
    
    //ACTUALIZAR TABLAS POR NOMBRES
    public void llenarTablaIngredientesAgain(Collection<IngredientesAlmacenDTO> ListaIngrediente) {
        DefaultTableModel modelo = (DefaultTableModel) TableIngrediente.getModel();
        modelo.setRowCount(0);
        
        modelIngrediente(modelo, ListaIngrediente);
    }
    
    public void llenarTablaHeladosAgain(Collection<HeladoAlmacenDTO> ListaHelados) {
        DefaultTableModel modelo = (DefaultTableModel) TableHelados.getModel();
        modelo.setRowCount(0);
        
        modelHelado(modelo, ListaHelados);
    }
    
    //ACTUALIZAR TABLAS
    private void modelIngrediente(
            DefaultTableModel modelo, 
            Collection<IngredientesAlmacenDTO> ListaIngredientes
    ) {
        if(modelo.getColumnCount() == 0) {
            modelo.addColumn("Almacen");
            modelo.addColumn("Nombre Ingrediente");
            modelo.addColumn("Stock");
            modelo.addColumn("Precio Unitario");
            modelo.addColumn("Precio Toatl");
            modelo.addColumn("Descripción");
        }
        
        for(IngredientesAlmacenDTO Ingrediente: ListaIngredientes) {
            Object[] fila = new Object[6];
            fila[0] = Ingrediente.getNomAlmacen();
            fila[1] = Ingrediente.getNomIngrediente();
            fila[2] = Ingrediente.getStockIngrediente();
            fila[3] = Ingrediente.getPrecioIngrediente();
            fila[4] = Ingrediente.getPreciototal();
            fila[5] = Ingrediente.getDesIngrediente();
            modelo.addRow(fila);
        }
    }
    
    private void modelHelado(
            DefaultTableModel modelo,
            Collection<HeladoAlmacenDTO> ListaHelados
    ) {
        if(modelo.getColumnCount() == 0) {
            modelo.addColumn("Almacen");
            modelo.addColumn("Nombre Helado");
            modelo.addColumn("Stock");
            modelo.addColumn("Precio Unitario");
            modelo.addColumn("Precio Toatl");
            modelo.addColumn("Descripción");   
        }
        
        for(HeladoAlmacenDTO Helado: ListaHelados) {
            Object[] fila = new Object[6];
            fila[0] = Helado.getNomAlmacen();
            fila[1] = Helado.getNomHelados();
            fila[2] = Helado.getStockHelado();
            fila[3] = Helado.getPrecioHelado();
            fila[4] = Helado.getPrecioTotal();
            fila[5] = Helado.getDesHelados();
            modelo.addRow(fila);
        }
    }
    
    //OBTENER TEXTOS
    public String obtenerNombreIngrediente() {
        return txtIngrediente.getText();
    }
    
    public String obtenerNombreHelado() {
        return txtHelado.getText();
    }
}
