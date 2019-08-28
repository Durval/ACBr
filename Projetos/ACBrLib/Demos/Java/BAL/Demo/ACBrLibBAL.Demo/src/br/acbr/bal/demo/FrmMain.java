package br.acbr.bal.demo;

import com.acbr.ACBrSessao;
import com.acbr.NivelLog;
import com.acbr.bal.ACBrBAL;
import com.acbr.bal.BALModelo;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FrmMain extends javax.swing.JFrame {
    private ACBrBAL acbrBAL;

    public FrmMain() {
        initComponents();
        try {
            acbrBAL = new ACBrBAL();
        } catch (Exception ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void doLogException(Exception e) {
        Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, e);
    }
    
    private void loadConfig() {
        try {
            acbrBAL.configLer();
            
            //BAL
            String ret = acbrBAL.configLerValor(ACBrSessao.BAL, "Porta");
            cmbPorta.getModel().setSelectedItem(ret);
            
            ret = acbrBAL.configLerValor(ACBrSessao.BAL, "Modelo");
            cmbModelo.setSelectedIndex(Integer.parseInt(ret));
            
            ret = acbrBAL.configLerValor(ACBrSessao.BAL, "Intervalo");
            spnTimeout.setValue(Integer.parseInt(ret));
            
            ret = acbrBAL.configLerValor(ACBrSessao.BAL_Device, "Baud");
            cmbBaud.getModel().setSelectedItem(ret);
            
            ret = acbrBAL.configLerValor(ACBrSessao.BAL_Device, "Data");
            cmbData.getModel().setSelectedItem(ret);
            
            ret = acbrBAL.configLerValor(ACBrSessao.BAL_Device, "Parity");
            cmbParity.getModel().setSelectedItem(ret);
            
            ret = acbrBAL.configLerValor(ACBrSessao.BAL_Device, "Stop");
            cmbStop.getModel().setSelectedItem(ret);
            
            ret = acbrBAL.configLerValor(ACBrSessao.BAL_Device, "MaxBandwidth");
            spnMaxBand.setValue(Integer.parseInt(ret));
            
            ret = acbrBAL.configLerValor(ACBrSessao.BAL_Device, "SendBytesCount");
            spnBytesCount.setValue(Integer.parseInt(ret));
            
            ret = acbrBAL.configLerValor(ACBrSessao.BAL_Device, "SendBytesInterval");
            spnBytesInterval.setValue(Integer.parseInt(ret));
            
            ret = acbrBAL.configLerValor(ACBrSessao.BAL_Device, "HandShake");
            cmbHandshake.setSelectedIndex(Integer.parseInt(ret));
            
            ret = acbrBAL.configLerValor(ACBrSessao.BAL_Device, "SoftFlow");
            chkSoftFlow.setSelected(ret.equals("1"));
            
            ret = acbrBAL.configLerValor(ACBrSessao.BAL_Device, "HardFlow");
            chkHardFlow.setSelected(ret.equals("1"));
        } catch (Exception ex) {
            doLogException(ex);
        }
    }
    
    private void saveConfig() {
        try {
            acbrBAL.configGravarValor(ACBrSessao.BAL, "Porta", cmbPorta.getSelectedItem());
            acbrBAL.configGravarValor(ACBrSessao.BAL, "Modelo", cmbModelo.getSelectedIndex());
            acbrBAL.configGravarValor(ACBrSessao.BAL, "Intervalo", spnTimeout.getValue().toString());
            acbrBAL.configGravarValor(ACBrSessao.BAL_Device, "Baud", cmbBaud.getSelectedItem());
            acbrBAL.configGravarValor(ACBrSessao.BAL_Device, "Data", cmbData.getSelectedItem());
            acbrBAL.configGravarValor(ACBrSessao.BAL_Device, "Parity", cmbParity.getSelectedItem());
            acbrBAL.configGravarValor(ACBrSessao.BAL_Device, "Stop", cmbStop.getSelectedItem());
            acbrBAL.configGravarValor(ACBrSessao.BAL_Device, "MaxBandwidth", spnMaxBand.getValue().toString());
            acbrBAL.configGravarValor(ACBrSessao.BAL_Device, "SendBytesCount", spnBytesCount.getValue().toString());
            acbrBAL.configGravarValor(ACBrSessao.BAL_Device, "SendBytesInterval", spnBytesInterval.getValue().toString());
            acbrBAL.configGravarValor(ACBrSessao.BAL_Device, "HandShake", cmbHandshake.getSelectedIndex());
            acbrBAL.configGravarValor(ACBrSessao.BAL_Device, "SoftFlow", chkSoftFlow.isSelected() ? "1" : "0");
            acbrBAL.configGravarValor(ACBrSessao.BAL_Device, "HardFlow", chkHardFlow.isSelected() ? "1" : "0");
            acbrBAL.configGravar();
            
            JOptionPane.showMessageDialog(null, "Configurações Gravadas com Sucesso!");
        } catch (Exception e) {
            doLogException(e);
        }
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
        cmbModelo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbPorta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbBaud = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbData = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbParity = new javax.swing.JComboBox<>();
        cmbStop = new javax.swing.JComboBox<>();
        spnMaxBand = new javax.swing.JSpinner();
        spnBytesCount = new javax.swing.JSpinner();
        spnBytesInterval = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbHandshake = new javax.swing.JComboBox<>();
        chkSoftFlow = new javax.swing.JCheckBox();
        chkHardFlow = new javax.swing.JCheckBox();
        btnSalvarConfig = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        spnTimeout = new javax.swing.JSpinner();
        btnLerPeso = new javax.swing.JButton();
        btnSolicitarPeso = new javax.swing.JButton();
        btnUltimoPeso = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPesoLido = new javax.swing.JTextField();
        btnAtivarDesativar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACBrLibBAL - Demo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuração"));

        cmbModelo.setModel(new DefaultComboBoxModel<>(BALModelo.values()));

        jLabel1.setText("Modelo");

        cmbPorta.setEditable(true);
        cmbPorta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COM1", "COM2", "LPT1", "LPT2", "\\\\localhost\\Epson", "c:\\temp\\ecf.txt", "TCP:192.168.0.31:9100" }));

        jLabel2.setText("Porta");

        cmbBaud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "110", "300", "600", "1200", "2400", "4800", "9600", "14400", "19200", "38400", "56000", "57600" }));

        jLabel3.setText("Baud");

        cmbData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8" }));
        cmbData.setSelectedIndex(3);

        jLabel4.setText("Data");

        jLabel5.setText("Paridade");

        jLabel6.setText("Stop Byte");

        cmbParity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "odd", "even", "mark", "space" }));

        cmbStop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "odd", "even", "mark", "space" }));

        jLabel7.setText("Max. Band");

        jLabel8.setText("Bytes Count");

        jLabel9.setText("Intervalo");

        jLabel10.setText("HandShake");

        cmbHandshake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "XON/XOFF", "RTS/CTS", "DTR/DSR" }));

        chkSoftFlow.setText("SoftFlow");

        chkHardFlow.setText("HardFlow");

        btnSalvarConfig.setText("Salvar Configurações");
        btnSalvarConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarConfigActionPerformed(evt);
            }
        });

        jLabel12.setText("Timeout");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cmbParity, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cmbStop, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnMaxBand, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spnBytesCount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(spnBytesInterval, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSalvarConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbHandshake, 0, 143, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkHardFlow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkSoftFlow))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbPorta, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBaud, javax.swing.GroupLayout.Alignment.LEADING, 0, 143, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(cmbData, 0, 143, Short.MAX_VALUE)
                            .addComponent(spnTimeout))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBaud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbParity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbStop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnMaxBand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnBytesCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnBytesInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbHandshake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSoftFlow)
                    .addComponent(chkHardFlow))
                .addGap(20, 20, 20)
                .addComponent(btnSalvarConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLerPeso.setText("Ler Peso");
        btnLerPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLerPesoActionPerformed(evt);
            }
        });

        btnSolicitarPeso.setText("Solicitar Peso");
        btnSolicitarPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarPesoActionPerformed(evt);
            }
        });

        btnUltimoPeso.setText("Ultimo Peso Lido");
        btnUltimoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoPesoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setText("Peso Lido");

        txtPesoLido.setEditable(false);
        txtPesoLido.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtPesoLido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPesoLido.setText("0,00");

        btnAtivarDesativar.setText("Ativar");
        btnAtivarDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarDesativarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLerPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSolicitarPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUltimoPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesoLido)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAtivarDesativar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtivarDesativar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnLerPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSolicitarPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUltimoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesoLido, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarConfigActionPerformed
        try {
            saveConfig();
        } catch (Exception e) {
            doLogException(e);
        }
    }//GEN-LAST:event_btnSalvarConfigActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Path path = Paths.get(System.getProperty("user.dir"), "Logs");
            if ( !Files.isDirectory(path) ) {
                path.toFile().mkdirs();
            }
            
            acbrBAL.configGravarValor(ACBrSessao.Principal, "LogNivel", NivelLog.logParanoico);
            acbrBAL.configGravarValor(ACBrSessao.Principal, "LogPath", path);
            acbrBAL.configGravar();
            
            loadConfig();            
        } catch (Exception e) {
            doLogException(e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAtivarDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarDesativarActionPerformed
        try {
            if ( btnAtivarDesativar.getText().equals("Ativar") ) {
                acbrBAL.ativar();
                btnAtivarDesativar.setText("Desativar");
            } else {
                acbrBAL.desativar();
                btnAtivarDesativar.setText("Ativar");
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao " + btnAtivarDesativar.getText() + " balança: \n"+e.getMessage() );
            doLogException(e);
        }
    }//GEN-LAST:event_btnAtivarDesativarActionPerformed

    private void btnLerPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLerPesoActionPerformed
        try {
            double peso = acbrBAL.lePeso(Integer.parseInt(spnTimeout.getValue().toString()));
            mostraPeso(peso);
        } catch (Exception e) {
            doLogException(e);
        }
    }//GEN-LAST:event_btnLerPesoActionPerformed

    private void btnSolicitarPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarPesoActionPerformed
        try {
            acbrBAL.SolicitarPeso();
            JOptionPane.showMessageDialog(null, "Peso solicitado...!");
        } catch (Exception e) {
            doLogException(e);
        }
    }//GEN-LAST:event_btnSolicitarPesoActionPerformed

    private void mostraPeso(double peso) {
        txtPesoLido.setText(String.format("%.3f", peso));
    }
    
    private void btnUltimoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoPesoActionPerformed
        try {
            double peso = acbrBAL.ultimoPesoLido();
            mostraPeso(peso);
        } catch (Exception e) {
            doLogException(e);
        }
    }//GEN-LAST:event_btnUltimoPesoActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAtivarDesativar;
    private javax.swing.JButton btnLerPeso;
    private javax.swing.JButton btnSalvarConfig;
    private javax.swing.JButton btnSolicitarPeso;
    private javax.swing.JButton btnUltimoPeso;
    private javax.swing.JCheckBox chkHardFlow;
    private javax.swing.JCheckBox chkSoftFlow;
    private javax.swing.JComboBox<String> cmbBaud;
    private javax.swing.JComboBox<String> cmbData;
    private javax.swing.JComboBox<String> cmbHandshake;
    private javax.swing.JComboBox<BALModelo> cmbModelo;
    private javax.swing.JComboBox<String> cmbParity;
    private javax.swing.JComboBox<String> cmbPorta;
    private javax.swing.JComboBox<String> cmbStop;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spnBytesCount;
    private javax.swing.JSpinner spnBytesInterval;
    private javax.swing.JSpinner spnMaxBand;
    private javax.swing.JSpinner spnTimeout;
    private javax.swing.JTextField txtPesoLido;
    // End of variables declaration//GEN-END:variables
}
