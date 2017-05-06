package main.java.monitor;

import javax.swing.JComboBox;

/**
 *
 * @author dinukshakandasamanage
 */
public class MonitorGUI extends javax.swing.JFrame {

    private WeatherMonitorController monitor;
    /**
     * Creates new form monitorGUI
     */
    public MonitorGUI(WeatherMonitorController monitor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.monitor = monitor;  
    }
    
    /**
     * Adds a new monitor
     * @param test 
     */
    public void addMonitor(SensorMonitorGUI test){
        jPanel1.add(test);
        test.setVisible(true);
    }
    
    /**
     * Sets monitor count
     * @param monitorCount 
     */
    public void setMonitorCount(int monitorCount){
        this.monitorCount.setText(Integer.toString(monitorCount));
    }
    
    /**
     * Set sensor count
     * @param sensorCount 
     */
    public void setSensorCount(int sensorCount){
        this.sensorCount.setText(Integer.toString(sensorCount));
    }
    
    /**
     * Fill combo box with the current locations where sensors are available
     * @param location 
     */
    public void fillLocations(String location){
        this.locations.addItem(location);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        monitorCount = new javax.swing.JLabel();
        sensorCount = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        locations = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1059, 480));
        setMinimumSize(new java.awt.Dimension(1059, 480));
        setPreferredSize(new java.awt.Dimension(1059, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(1059, 480));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new java.awt.GridLayout(0, 4, 10, 10));
        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 1020, 320);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Monitors Connected");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 170, 21);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sensors Connected");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 190, 21);

        monitorCount.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        monitorCount.setForeground(new java.awt.Color(255, 255, 255));
        monitorCount.setText("0");
        getContentPane().add(monitorCount);
        monitorCount.setBounds(240, 30, 30, 21);

        sensorCount.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        sensorCount.setForeground(new java.awt.Color(255, 255, 255));
        sensorCount.setText("0");
        getContentPane().add(sensorCount);
        sensorCount.setBounds(240, 60, 20, 21);

        jButton1.setText("Update Readings");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(868, 20, 164, 29);

        jButton2.setText("Get Reading");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(868, 55, 164, 29);

        getContentPane().add(locations);
        locations.setBounds(669, 56, 181, 27);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Location");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 60, 130, 21);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/monitor/images/blue-futuristic-round-blurry-background.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1080, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        monitor.updateAllReadings();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String location = locations.getSelectedItem().toString();
        monitor.getLatestReadingsByLocation(location);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MonitorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonitorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonitorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonitorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new MonitorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> locations;
    private javax.swing.JLabel monitorCount;
    private javax.swing.JLabel sensorCount;
    // End of variables declaration//GEN-END:variables
}