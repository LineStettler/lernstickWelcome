/*
 * AptGetOutputDialog.java
 *
 * Created on 27.10.2009, 13:35:32
 */
package ch.fhnw.lernstickwelcome;

import java.awt.Dialog;

/**
 * a dialog that displays the output of apt-get
 * @author Ronny Standtke <ronny.standtke@fhnw.ch>
 */
public class AptGetOutputDialog extends javax.swing.JDialog {

    /** Creates new form AptGetOutputDialog
     * @param parent the parent dialog
     * @param aptGetOutput the output of apt-get
     */
    public AptGetOutputDialog(Dialog parent, String aptGetOutput) {
        super(parent, true);
        initComponents();
        aptGetOutputTextArea.setText(aptGetOutput);
        setLocationRelativeTo(parent);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aptGetOutputScrollPane = new javax.swing.JScrollPane();
        aptGetOutputTextArea = new javax.swing.JTextArea();
        aptGetOutputCloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ch/fhnw/lernstickwelcome/Bundle"); // NOI18N
        setTitle(bundle.getString("AptGetOutputDialog.title")); // NOI18N

        aptGetOutputTextArea.setColumns(20);
        aptGetOutputTextArea.setRows(5);
        aptGetOutputScrollPane.setViewportView(aptGetOutputTextArea);

        aptGetOutputCloseButton.setText(bundle.getString("Welcome.aptGetOutputCloseButton.text")); // NOI18N
        aptGetOutputCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aptGetOutputCloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aptGetOutputScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(aptGetOutputCloseButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aptGetOutputScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aptGetOutputCloseButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aptGetOutputCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aptGetOutputCloseButtonActionPerformed
        setVisible(false);
        dispose();
}//GEN-LAST:event_aptGetOutputCloseButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aptGetOutputCloseButton;
    private javax.swing.JScrollPane aptGetOutputScrollPane;
    private javax.swing.JTextArea aptGetOutputTextArea;
    // End of variables declaration//GEN-END:variables
}
