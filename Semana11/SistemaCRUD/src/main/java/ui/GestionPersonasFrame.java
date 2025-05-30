package ui;

import java.sql.Connection;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import data.Repositorio;
import data.RepositorioPersonas;
import fabrica.FabricaDePersona;
import fabrica.FabricaPersona;
import modelo.Persona;
import ui.util.Render;
import utils.adaptadores.AdaptadorPersona;
import utils.adaptadores.DatosPersona;
import utils.validadores.TipoValidador;
import utils.validadores.ValidadorPersona;

public class GestionPersonasFrame extends javax.swing.JInternalFrame {
    private DefaultTableModel model;
    private AdaptadorPersona adaptador;
    private Repositorio repositorio;
    private FabricaPersona fabrica;
    
    public GestionPersonasFrame(Connection conexion) {
        adaptador = new AdaptadorPersona();
        repositorio = new RepositorioPersonas(conexion, adaptador);
        fabrica = new FabricaDePersona();
        
        initComponents();
        this.setSize(1100, 410);
        
        model = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Fecha Nac.");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("");
        model.addColumn("");
        
        actualizarTabla();
        
        tablapersonas.setModel(model);
        tablapersonas.setRowHeight(40);
        tablapersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablapersonas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtnacimiento = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion de Personas");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        tablapersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "fecha nac.", "direccion", "telefono", "acciones"
            }
        ));
        jScrollPane1.setViewportView(tablapersonas);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de Nacim.");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Direccion");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Telefono");

        registrar.setBackground(new java.awt.Color(153, 255, 153));
        registrar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        txtnombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        txtapellido.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        txtdireccion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        txtnacimiento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        txttelefono.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("ID");

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(txtid))
                                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(txtnacimiento)
                                    .addComponent(txttelefono)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(registrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(registrar)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarTabla() {
        model.setRowCount(0);
        tablapersonas.setDefaultRenderer(Object.class, new Render());
        List <Persona> personas = repositorio.listar();
        
        
        for (Persona p : personas) {
            JButton btnactualizar = new JButton("Modificar");
            JButton btneliminar = new JButton("Eliminar");
            
            model.addRow(new Object[] {
                p.getId(),
                p.getNombre(),
                p.getApellido(),
                p.getFechaNacimiento(),
                p.getDireccion(),
                p.getTelefono(),
                btnactualizar,
                btneliminar
            });
        }
    }
    
    private void limpiartxtLabel() {
        txtid.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtnacimiento.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
    }
    
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        TipoValidador validarPersona;
        String id= txtid.getText();
        String nombre = txtnombre.getText();
        String apellido = txtapellido.getText();
        String fechanacimiento = txtnacimiento.getText();
        String direccion = txtdireccion.getText();
        String telefono = txttelefono.getText();
        
        DatosPersona datos = new DatosPersona(nombre, apellido, fechanacimiento, direccion, telefono);
        validarPersona = new ValidadorPersona(datos);
        
        try {
            validarPersona.iniciarCadenaDeResponsabilidad();
        } catch (Exception ex) {
            System.err.println("Validación fallida: " + ex.getMessage());
            return;
        }
        
        Persona p = fabrica.fabricar(datos);
        if(id.equals("")) {
            //TO DO REGISTRAR
            repositorio.agregar(p);
        }   else {
            //TO DO ACTUALIZAR
            repositorio.actualizar(Integer.parseInt(id), p);
            registrar.setText("Registrar");
            JOptionPane.showMessageDialog(null, "Actualización exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
        
        actualizarTabla();
        limpiartxtLabel();
    }//GEN-LAST:event_registrarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        int column = tablapersonas.columnAtPoint(evt.getPoint());
        int row = tablapersonas.rowAtPoint(evt.getPoint());

        if (row >= 0 && column >= 0) {
            Object value = tablapersonas.getValueAt(row, column);

            if (value instanceof JButton) {
                JButton boton = (JButton) value;
                String texto = boton.getText();
                int id = (int) tablapersonas.getValueAt(row, 0);

                if ("Eliminar".equals(texto)) {
                    int confirmacion = JOptionPane.showConfirmDialog(
                        null,
                        "¿Estás seguro de eliminar esta persona?",
                        "Confirmación",
                        JOptionPane.YES_NO_OPTION
                    );

                    if (confirmacion == JOptionPane.YES_OPTION) {
                        repositorio.eliminar(id);
                        System.out.println("Persona eliminada correctamente");
                        actualizarTabla();
                    } else {
                        System.out.println("Eliminación cancelada");
                    }
                } else if ("Modificar".equals(texto)) {
                    Persona p = (Persona) repositorio.obtener(id);
                    txtid.setText(String.valueOf(id));
                    txtnombre.setText(p.getNombre());
                    txtapellido.setText(p.getApellido());
                    txtnacimiento.setText(String.valueOf(p.getFechaNacimiento()));
                    txtdireccion.setText(p.getDireccion());
                    txttelefono.setText(String.valueOf(p.getTelefono()));
                    registrar.setText("Actualizar");
                }
            }
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tablapersonas;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnacimiento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
