/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


import clases.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rasda
 */
public class BancoGUI extends javax.swing.JFrame {

    private String tipoRegistro="";
    private String nombre="";
    private String documento="";
    private String telefono="";
    private String direccion="";
    private String correo="";
    private String tipoCuenta="";
    double deposito;
    double retiro;
    double saldo;
    int porcientoAhorro;
    int porcientoInteresMes;
            
    List<Cuentas> listCuentas= new ArrayList<>();
    List<Persona> listPersonas= new ArrayList<>();
    
    private String msj;
    private String fechaCuenta;
    
    private CtaAhorros objCtaAhorros;
    private CtaInversion objCtaInversion;
    private Cliente objCliente;
    

    /**
     * Creates new form BancoGUI
     */
    public BancoGUI() {
        initComponents();
        postInit();
    }

    
    private void postInit(){
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tipoCuenta_jComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tipoRegistro_jComboBox = new javax.swing.JComboBox<>();
        btnDoRegistro = new javax.swing.JButton();
        btnCancelRegistro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        btnDoTransaction = new javax.swing.JButton();
        btnCancelTransaction = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultados_jTextArea = new javax.swing.JTextArea();
        btnListarCuentas = new javax.swing.JButton();
        btnLimpiarResultados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Software De Gestión Bancaria");

        txtNombre.setToolTipText("");

        jLabel3.setText("Nombre");

        txtDocumento.setToolTipText("");

        jLabel4.setText("Documento");

        txtTelefono.setToolTipText("");

        jLabel5.setText("Teléfono");

        txtDireccion.setToolTipText("");

        jLabel6.setText("Dirección");

        txtCorreo.setToolTipText("");

        jLabel7.setText("Correo");

        jLabel8.setText("Tipo Cuenta");

        tipoCuenta_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ahorros", "Inversión" }));

        jLabel9.setText("Tipo Registro");

        tipoRegistro_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cliente", "Empleado", "Casa Inversión" }));

        btnDoRegistro.setText("Crear");
        btnDoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoRegistroActionPerformed(evt);
            }
        });

        btnCancelRegistro.setText("Cancelar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDocumento))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefono))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipoCuenta_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelRegistro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipoRegistro_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoRegistro_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoCuenta_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnDoRegistro)
                    .addComponent(btnCancelRegistro))
                .addGap(4, 4, 4))
        );

        jTabbedPane1.addTab("Registros", jPanel2);

        jLabel10.setText("Transacción");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Depósito", "Retiro", "Consulta" }));

        jTextField8.setToolTipText("Documento");

        jLabel11.setText("Documento");

        jLabel12.setText("ID Cuenta");

        jTextField9.setToolTipText("ID Cuenta");

        jLabel13.setText("Monto $$$");

        jTextField10.setToolTipText("Monto Económico");

        btnDoTransaction.setText("Continuar");

        btnCancelTransaction.setText("Cancelar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnDoTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField9)
                    .addComponent(jTextField8)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoTransaction)
                    .addComponent(btnCancelTransaction))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transacciones", jPanel3);

        resultados_jTextArea.setColumns(20);
        resultados_jTextArea.setRows(5);
        jScrollPane1.setViewportView(resultados_jTextArea);

        btnListarCuentas.setText("Listar");
        btnListarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCuentasActionPerformed(evt);
            }
        });

        btnLimpiarResultados.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListarCuentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiarResultados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnListarCuentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarResultados)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDatos(){
        int tR = this.tipoRegistro_jComboBox.getSelectedIndex();
        tipoRegistro = tipoRegistro_jComboBox.getItemAt(tR);
        nombre= this.txtNombre.getText();
        documento= this.txtDocumento.getText();
        telefono= this.txtTelefono.getText();
        direccion= this.txtDireccion.getText();
        correo= this.txtCorreo.getText();
        int tC= this.tipoCuenta_jComboBox.getSelectedIndex();
        tipoCuenta= this.tipoCuenta_jComboBox.getItemAt(tC);        
    }
    
    private void btnDoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoRegistroActionPerformed
        addDatos();
        if(tipoRegistro.isEmpty()||nombre.isEmpty()||documento.isEmpty()||telefono.isEmpty()||
                  direccion.isEmpty()||correo.isEmpty()||tipoCuenta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos requeridos\ndeben ser diligenciados!");
        }else{
            crearPersona();
            crearCuenta();
            limpiarCampos();
        }
    }//GEN-LAST:event_btnDoRegistroActionPerformed

    private void crearPersona(){
        int tC = tipoCuenta_jComboBox.getSelectedIndex();
        switch (tC) {
            case 0:
                JOptionPane.showMessageDialog(null, "Seleccione el tipo de registro.");
                break;
            case 1:
                System.out.println("CrearCliente");
                objCliente= new Cliente( fechaCuenta, nombre, documento, telefono, direccion, correo);
                System.out.println( "Creado el cliente: "+ objCliente.getNombre()+ ", idCliente: "+ documento);
                this.listPersonas.add(objCliente);
                break;
            case 2:
                System.out.println("crearEmpleado");
                break;
            case 4:
                System.out.println("crearCasaInversora");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    private void limpiarCampos(){
        this.tipoRegistro_jComboBox.setSelectedIndex(0);
        this.txtNombre.setText("");
        this.txtDocumento.setText("");
        this.txtTelefono.setText("");
        this.txtDireccion.setText("");
        this.txtCorreo.setText("");
        this.tipoCuenta_jComboBox.setSelectedIndex(0);
    }
    
    private void crearCuenta(){
        int tR = this.tipoRegistro_jComboBox.getSelectedIndex();
        switch (tR) {
            case 0:
                JOptionPane.showMessageDialog(null, "Seleccione el tipo de cuenta.");
                break;
            case 1:
                System.out.println("Crear cuenta Ahorros.");
                objCtaAhorros= new CtaAhorros( porcientoAhorro, porcientoInteresMes, documento, fechaCuenta, tipoCuenta);
                this.listCuentas.add(objCtaAhorros);
                hacerDeposito();
                JOptionPane.showMessageDialog(null,"FinDeposito:"+ msj);
                break;
            case 2:
                System.out.println("Crear cuenta Inversión.");
                String nombreInversora=nombre;
                objCtaInversion= new CtaInversion( documento, nombreInversora, fechaCuenta, tipoCuenta);
                this.listCuentas.add(objCtaInversion);
                hacerDeposito();
                JOptionPane.showMessageDialog(null,"FinDeposito:"+ msj);
                break;
            default:
                throw new AssertionError();
        }
        JOptionPane.showMessageDialog(null, "Se creó la cuenta "+ tipoCuenta+ " correctamente.");            
    }
    
    private String hacerDeposito(){
        String depositoLetras = JOptionPane.showInputDialog("Monto del Deposito?");
        deposito= Double.valueOf(depositoLetras);
        msj =objCtaAhorros.hacerDeposito(deposito);        
        return msj;
    }
    
    private void hacerRetiro(){
        String retiroLetras = JOptionPane.showInputDialog("Monto del retiro?");
        deposito= Double.valueOf(retiroLetras);
        String estadoRetiro=objCtaAhorros.hacerRetiro(retiro);
        JOptionPane.showMessageDialog(null,"FinRetiro:"+ estadoRetiro);
    }
    
    
    private void btnListarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCuentasActionPerformed
        int cantCuentas = this.listCuentas.size();
        int cantPersonas = this.listPersonas.size();
        
        System.out.println("________________________________________________");
        for( int i=0; i<cantCuentas;i++){
            Cuentas objCuentas= listCuentas.get(i);
            Persona objPersona= listPersonas.get(i);
            this.nombre= objPersona.getNombre();
            this.correo= objPersona.getCorreo();
            this.direccion= objPersona.getDireccion();
            this.telefono= objPersona.getTelefono();
            this.documento= objCuentas.getIdTitular();
            this.saldo= objCuentas.getSaldo();
            this.tipoCuenta= objCuentas.getTipoCuenta();          
            msj= "\n >>>  Cuenta "+i+
                    ": \n\tID: "+ documento+ 
                    "\n\tTitular: "+nombre+ 
                    "\n\tTeléfono: "+ telefono+ 
                    "\n\tCorreo: "+ correo+ 
                    "\n\tDirección: "+ direccion+
                    "\n\tSaldo: "+ saldo+ 
                    "\n\tTipo: "+ tipoCuenta;
            System.out.println( msj+ "\n________________________________________________");
            this.resultados_jTextArea.setText( resultados_jTextArea.getText()+ "\n"+ msj);
        }
    }//GEN-LAST:event_btnListarCuentasActionPerformed

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
            java.util.logging.Logger.getLogger(BancoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelRegistro;
    private javax.swing.JButton btnCancelTransaction;
    private javax.swing.JButton btnDoRegistro;
    private javax.swing.JButton btnDoTransaction;
    private javax.swing.JButton btnLimpiarResultados;
    private javax.swing.JButton btnListarCuentas;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextArea resultados_jTextArea;
    private javax.swing.JComboBox<String> tipoCuenta_jComboBox;
    private javax.swing.JComboBox<String> tipoRegistro_jComboBox;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}