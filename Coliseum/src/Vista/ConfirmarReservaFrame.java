package Vista;

import Controlador.CanchaBuilder;
import Controlador.GestorReservas;
import Controlador.ReservaBuilder;
import Modelo.Horario;
import Modelo.ListaReservas;
import java.awt.Color;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Sebas
 */
public class ConfirmarReservaFrame extends javax.swing.JFrame {

    public int sw = 0;
    public int Horas = 0;
    
    Calendar cal = Calendar.getInstance();
    Date maxDate;
    Date minDate;
    ReservaBuilder rb = ReservaBuilder.getInstance();
    CanchaBuilder cb = CanchaBuilder.getInstance();
    ListaReservas reservas = ListaReservas.getInstance();
    GestorReservas gr = GestorReservas.getInstance(reservas, this);
    

    /**
     * Creates new form ConfirmarReserva
     */
    public ConfirmarReservaFrame() {
        initComponents();

        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, 1);
        minDate = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, 6);
        maxDate = cal.getTime();
        jdc.setMinSelectableDate(minDate);
        jdc.setMaxSelectableDate(maxDate);
        pnlSelector.setVisible(false);
        lblAvisoHorario.setVisible(false);
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
        Close = new javax.swing.JLabel();
        lblAvisoHorario = new javax.swing.JLabel();
        jdc = new com.toedter.calendar.JDateChooser();
        lblFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblNombre = new javax.swing.JTextField();
        lblElegir = new javax.swing.JLabel();
        lblElegido = new javax.swing.JLabel();
        pnlSelector = new javax.swing.JPanel();
        optPrimeraHora = new javax.swing.JLabel();
        optSegundaHora = new javax.swing.JLabel();
        optTerceraH = new javax.swing.JLabel();
        optCuartaH = new javax.swing.JLabel();
        optQuintaH = new javax.swing.JLabel();
        optDoceH = new javax.swing.JLabel();
        optSextaH = new javax.swing.JLabel();
        optAllDay = new javax.swing.JLabel();
        lblbg = new javax.swing.JLabel();
        labelHorasC = new javax.swing.JLabel();
        jcbConos = new javax.swing.JCheckBox();
        jcbCauchos = new javax.swing.JCheckBox();
        jcbPesas = new javax.swing.JCheckBox();
        jcbBotiquin = new javax.swing.JCheckBox();
        jcbMedico = new javax.swing.JCheckBox();
        jcbEntrenador = new javax.swing.JCheckBox();
        btnConfirmar = new javax.swing.JLabel();
        jcbHora = new javax.swing.JComboBox<>();
        lblMinutos = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        jPanel1.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 20, 60, 60));

        lblAvisoHorario.setForeground(new java.awt.Color(255, 0, 0));
        lblAvisoHorario.setText("Horario no disponible");
        jPanel1.add(lblAvisoHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 250, -1));

        jdc.setBackground(new java.awt.Color(15, 19, 25));
        jdc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jdc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jdcFocusGained(evt);
            }
        });
        jPanel1.add(jdc, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 432, 440, 50));

        lblFecha.setBackground(new java.awt.Color(22, 27, 34));
        lblFecha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(204, 204, 204));
        lblFecha.setText("DD/MM/AAAA");
        lblFecha.setBorder(null);
        lblFecha.setSelectionColor(new java.awt.Color(0, 240, 181));
        lblFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFechaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFechaMouseExited(evt);
            }
        });
        lblFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblFechaActionPerformed(evt);
            }
        });
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 430, 50));

        jScrollPane1.setBackground(new java.awt.Color(13, 17, 23));

        jTable1.setBackground(new java.awt.Color(13, 17, 23));
        jTable1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setSelectionBackground(new java.awt.Color(0, 240, 181));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 310, 680, 600));

        lblNombre.setBackground(new java.awt.Color(22, 27, 34));
        lblNombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(204, 204, 204));
        lblNombre.setText("Ingrese su nombre de usuario");
        lblNombre.setBorder(null);
        lblNombre.setSelectionColor(new java.awt.Color(0, 240, 181));
        lblNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNombreMouseExited(evt);
            }
        });
        lblNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNombreActionPerformed(evt);
            }
        });
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 740, 40));

        lblElegir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblElegir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblElegirMouseClicked(evt);
            }
        });
        jPanel1.add(lblElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 50, 50));

        lblElegido.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblElegido.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblElegido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 690, 50));

        pnlSelector.setBackground(new java.awt.Color(0, 0, 0));
        pnlSelector.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optPrimeraHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optPrimeraHoraMouseClicked(evt);
            }
        });
        pnlSelector.add(optPrimeraHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 754, 43));

        optSegundaHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optSegundaHoraMouseClicked(evt);
            }
        });
        pnlSelector.add(optSegundaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 104, 754, 43));

        optTerceraH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optTerceraHMouseClicked(evt);
            }
        });
        pnlSelector.add(optTerceraH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 148, 754, 39));

        optCuartaH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optCuartaHMouseClicked(evt);
            }
        });
        pnlSelector.add(optCuartaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 189, 754, 42));

        optQuintaH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optQuintaHMouseClicked(evt);
            }
        });
        pnlSelector.add(optQuintaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 231, 754, 37));

        optDoceH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optDoceHMouseClicked(evt);
            }
        });
        pnlSelector.add(optDoceH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 315, 754, 34));

        optSextaH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optSextaHMouseClicked(evt);
            }
        });
        pnlSelector.add(optSextaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 271, 754, 41));

        optAllDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optAllDayMouseClicked(evt);
            }
        });
        pnlSelector.add(optAllDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 352, 754, 41));

        lblbg.setBackground(new java.awt.Color(0, 0, 0));
        lblbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Seleccionar/ElegirClick.png"))); // NOI18N
        pnlSelector.add(lblbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 430));

        jPanel1.add(pnlSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 760, 430));

        labelHorasC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1x/CantidadDeHoras.png"))); // NOI18N
        jPanel1.add(labelHorasC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 760, 70));

        jcbConos.setBackground(new java.awt.Color(13, 17, 23));
        jcbConos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jcbConos.setForeground(new java.awt.Color(255, 255, 255));
        jcbConos.setText("Conos");
        jcbConos.setToolTipText("");
        jcbConos.setBorder(null);
        jPanel1.add(jcbConos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 790, 140, 30));

        jcbCauchos.setBackground(new java.awt.Color(13, 17, 23));
        jcbCauchos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jcbCauchos.setForeground(new java.awt.Color(255, 255, 255));
        jcbCauchos.setText("Cauchos");
        jcbCauchos.setToolTipText("");
        jcbCauchos.setBorder(null);
        jPanel1.add(jcbCauchos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 750, 140, 30));

        jcbPesas.setBackground(new java.awt.Color(13, 17, 23));
        jcbPesas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jcbPesas.setForeground(new java.awt.Color(255, 255, 255));
        jcbPesas.setText("Pesas");
        jcbPesas.setToolTipText("");
        jcbPesas.setBorder(null);
        jPanel1.add(jcbPesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 710, 140, 30));

        jcbBotiquin.setBackground(new java.awt.Color(13, 17, 23));
        jcbBotiquin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jcbBotiquin.setForeground(new java.awt.Color(255, 255, 255));
        jcbBotiquin.setText("Botiquín");
        jcbBotiquin.setBorder(null);
        jPanel1.add(jcbBotiquin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 790, 140, 30));

        jcbMedico.setBackground(new java.awt.Color(13, 17, 23));
        jcbMedico.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jcbMedico.setForeground(new java.awt.Color(255, 255, 255));
        jcbMedico.setText("médico");
        jcbMedico.setBorder(null);
        jPanel1.add(jcbMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 750, 140, 30));

        jcbEntrenador.setBackground(new java.awt.Color(13, 17, 23));
        jcbEntrenador.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jcbEntrenador.setForeground(new java.awt.Color(255, 255, 255));
        jcbEntrenador.setText("Entrenador");
        jcbEntrenador.setBorder(null);
        jPanel1.add(jcbEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, 140, 30));

        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 980, 330, 50));

        jcbHora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));
        jcbHora.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jcbHora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbHoraFocusGained(evt);
            }
        });
        jPanel1.add(jcbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 80, 50));

        lblMinutos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMinutos.setForeground(new java.awt.Color(255, 255, 255));
        lblMinutos.setText("00");
        jPanel1.add(lblMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 60, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ConfirmarReserva.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void lblNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseClicked
        lblNombre.setText("");
        lblNombre.setForeground(Color.decode("#f3e8ee"));
    }//GEN-LAST:event_lblNombreMouseClicked

    private void lblNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNombreMouseExited

    private void lblNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNombreActionPerformed

    private void lblFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFechaMouseClicked
        lblFecha.setText("");
        lblNombre.setForeground(Color.decode("#f3e8ee"));

    }//GEN-LAST:event_lblFechaMouseClicked

    private void lblFechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFechaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFechaMouseExited

    private void lblFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFechaActionPerformed

    private void lblElegirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElegirMouseClicked
        if (sw == 0) {
            pnlSelector.setVisible(true);
            sw = 1;
            //ImageIcon icono = new ImageIcon("img/Seleccionar/ElegirClick.png");
            //lblbg.setIcon(new ImageIcon(icono.getImage().getScaledInstance(760, 430, Image.SCALE_DEFAULT)));
        } else {
            pnlSelector.setVisible(false);
            sw = 0;
        }
        //lblElegido.setText(Validaciones.Elegir(Horas));

    }//GEN-LAST:event_lblElegirMouseClicked

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked
        if (validarHora()) {
            rb.setHorario(definirHorario());
            agregarAdicionales();
            rb.setCancha(cb.getCancha());
            gr.crearReservacion(rb.getReserva());
            VentaCorrectaFrame v = new VentaCorrectaFrame();
            v.setVisible(true);
        } else {
            lblAvisoHorario.setVisible(true);
        }
    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void optAllDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optAllDayMouseClicked
        //icono = new ImageIcon("img/Seleccionar/24 horas.png");
        //lblbg.setIcon(new ImageIcon(icono.getImage().getScaledInstance(760, 430, Image.SCALE_DEFAULT)));
        lblElegido.setText("Todo el día");
        pnlSelector.setVisible(false);
        sw = 0;
        Horas = 24;
    }//GEN-LAST:event_optAllDayMouseClicked

    private void optSextaHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optSextaHMouseClicked
        //icono = new ImageIcon("img/Seleccionar/6 horas.png");
        //lblbg.setIcon(new ImageIcon(icono.getImage().getScaledInstance(760, 430, Image.SCALE_DEFAULT)));
        lblElegido.setText("6 Horas");
        pnlSelector.setVisible(false);
        sw = 0;
        Horas = 6;
    }//GEN-LAST:event_optSextaHMouseClicked

    private void optDoceHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optDoceHMouseClicked
        //icono = new ImageIcon("img/Seleccionar/12 horas.png");
        //lblbg.setIcon(new ImageIcon(icono.getImage().getScaledInstance(760, 430, Image.SCALE_DEFAULT)));
        lblElegido.setText("12 Horas");
        pnlSelector.setVisible(false);
        sw = 0;
        Horas = 12;
    }//GEN-LAST:event_optDoceHMouseClicked

    private void optQuintaHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optQuintaHMouseClicked
        //icono = new ImageIcon("img/Seleccionar/5 horas.png");
        lblElegido.setText("5 Horas");
        pnlSelector.setVisible(false);
        sw = 0;
        Horas = 5;
        //lblbg.setIcon(new ImageIcon(icono.getImage().getScaledInstance(760, 430, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_optQuintaHMouseClicked

    private void optCuartaHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optCuartaHMouseClicked
        //icono = new ImageIcon("img/Seleccionar/4 horas.png");
        lblElegido.setText("4 Horas");
        pnlSelector.setVisible(false);
        sw = 0;
        Horas = 4;
        //lblbg.setIcon(new ImageIcon(icono.getImage().getScaledInstance(760, 430, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_optCuartaHMouseClicked

    private void optTerceraHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optTerceraHMouseClicked
        //icono = new ImageIcon("img/Seleccionar/3 horas.png");
        //lblbg.setIcon(new ImageIcon(icono.getImage().getScaledInstance(760, 430, Image.SCALE_DEFAULT)));
        lblElegido.setText("3 Horas");
        pnlSelector.setVisible(false);
        sw = 0;
        Horas = 3;
    }//GEN-LAST:event_optTerceraHMouseClicked

    private void optSegundaHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optSegundaHoraMouseClicked
        //icono = new ImageIcon("img/Seleccionar/2 horas.png");
        lblElegido.setText("2 Horas");
        pnlSelector.setVisible(false);
        sw = 0;
        Horas = 2;
        //lblbg.setIcon(new ImageIcon(icono.getImage().getScaledInstance(760, 430, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_optSegundaHoraMouseClicked

    private void optPrimeraHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optPrimeraHoraMouseClicked
        //icono = new ImageIcon("img/Seleccionar/1hora.png");
        //lblbg.setIcon(new ImageIcon(icono.getImage().getScaledInstance(760, 430, Image.SCALE_DEFAULT)));
        lblElegido.setText("1 Hora");
        pnlSelector.setVisible(false);
        sw = 0;
        Horas = 1;
    }//GEN-LAST:event_optPrimeraHoraMouseClicked

    private void jdcFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jdcFocusGained
        // TODO add your handling code here:
        lblAvisoHorario.setVisible(false);
    }//GEN-LAST:event_jdcFocusGained

    private void jcbHoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbHoraFocusGained
        // TODO add your handling code here:
        lblAvisoHorario.setVisible(false);
    }//GEN-LAST:event_jcbHoraFocusGained

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
            java.util.logging.Logger.getLogger(ConfirmarReservaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmarReservaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmarReservaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmarReservaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConfirmarReservaFrame().setVisible(true);
            }
        });
    }

    private boolean validarHora() {
        Date fecha = jdc.getDate();
        if (fecha == null) {
            return false;
        }
        if (Horas == 0) {
            return false;
        }
        Time inicio = Time.valueOf(jcbHora.getSelectedItem().toString() + ":00:00");
        int horaFin = Horas + Integer.parseInt((String) jcbHora.getSelectedItem());
        Time fin = Time.valueOf(String.valueOf(horaFin) + ":00:00");
        if (horaFin > 17) {
            return false;
        }
        return true;
    }

    private Horario definirHorario() {
        if (!validarHora()) {
            return null;
        }
        Date fecha = jdc.getDate();
        Time inicio = Time.valueOf(jcbHora.getSelectedItem().toString() + ":00:00");
        int horaFin = Horas + Integer.parseInt((String) jcbHora.getSelectedItem());
        Time fin = Time.valueOf(String.valueOf(horaFin) + ":00:00");
        return new Horario(fecha, inicio, fin);
    }
    
    private void agregarAdicionales(){
        if (jcbBotiquin.isSelected()) {
            cb.setBotiquin(true);
        }
        if (jcbCauchos.isSelected()) {
            cb.setCauchos(true);
        }
        if (jcbConos.isSelected()) {
            cb.setConos(true);
        }
        if (jcbEntrenador.isSelected()) {
            cb.setEntrenador(true);
        }
        if (jcbMedico.isSelected()) {
            cb.setMedico(true);
        }
        if (jcbPesas.isSelected()) {
            cb.setPesas(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel btnConfirmar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox jcbBotiquin;
    private javax.swing.JCheckBox jcbCauchos;
    private javax.swing.JCheckBox jcbConos;
    private javax.swing.JCheckBox jcbEntrenador;
    private javax.swing.JComboBox<String> jcbHora;
    private javax.swing.JCheckBox jcbMedico;
    private javax.swing.JCheckBox jcbPesas;
    private com.toedter.calendar.JDateChooser jdc;
    private javax.swing.JLabel labelHorasC;
    private javax.swing.JLabel lblAvisoHorario;
    private javax.swing.JLabel lblElegido;
    private javax.swing.JLabel lblElegir;
    private javax.swing.JTextField lblFecha;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JTextField lblNombre;
    private javax.swing.JLabel lblbg;
    private javax.swing.JLabel optAllDay;
    private javax.swing.JLabel optCuartaH;
    private javax.swing.JLabel optDoceH;
    private javax.swing.JLabel optPrimeraHora;
    private javax.swing.JLabel optQuintaH;
    private javax.swing.JLabel optSegundaHora;
    private javax.swing.JLabel optSextaH;
    private javax.swing.JLabel optTerceraH;
    private javax.swing.JPanel pnlSelector;
    // End of variables declaration//GEN-END:variables
}
