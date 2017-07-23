
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class GUI extends javax.swing.JDialog
{
    /**
     * Creates new form GUI
     */
    public GUI(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        setTitle("MIDI splitter!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton1 = new javax.swing.JButton();
        inputFilePath = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        outputDir = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        rebaseCheck = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        transposeText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        onlyDrums = new javax.swing.JCheckBox();
        chordCheck = new javax.swing.JCheckBox();
        chordDurCheck = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputField = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        speedFactorText = new javax.swing.JTextField();
        notesOnlyCheck = new javax.swing.JCheckBox();
        jButtonReverseNotes = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jButton1.setText("Select File");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        inputFilePath.setBackground(new java.awt.Color(255, 255, 51));
        inputFilePath.setText("no file selected");

        jButton2.setText("Output Dir");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        outputDir.setBackground(new java.awt.Color(153, 204, 255));
        outputDir.setText("C:\\");

            jButton3.setText("Do It!");
            jButton3.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    jButton3ActionPerformed(evt);
                }
            });

            rebaseCheck.setSelected(true);
            rebaseCheck.setText("Rebase");

            jLabel1.setText("Tranpose");

            transposeText.setText("0");

            jLabel2.setText("Octaves");

            onlyDrums.setText("Only Drums");

            chordCheck.setText("ChordMoll");
            chordCheck.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    chordCheckActionPerformed(evt);
                }
            });

            chordDurCheck.setText("ChordDur");
            chordDurCheck.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    chordDurCheckActionPerformed(evt);
                }
            });

            outputField.setEditable(false);
            outputField.setColumns(20);
            outputField.setLineWrap(true);
            outputField.setRows(5);
            outputField.setWrapStyleWord(true);
            jScrollPane1.setViewportView(outputField);

            jLabel3.setText("SpeedFactor");

            speedFactorText.setText("1.0");

            notesOnlyCheck.setSelected(true);
            notesOnlyCheck.setText("Notes Only");

            jButtonReverseNotes.setText("Rev Track");
            jButtonReverseNotes.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    jButtonReverseNotesActionPerformed(evt);
                }
            });

            jButton4.setText("Rev Octave");
            jButton4.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    jButton4ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addComponent(inputFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(outputDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(onlyDrums)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chordCheck)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rebaseCheck)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(speedFactorText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(transposeText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(chordDurCheck)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(notesOnlyCheck)))
                            .addGap(0, 147, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButtonReverseNotes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3)))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(rebaseCheck)
                        .addComponent(jLabel1)
                        .addComponent(transposeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(speedFactorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(onlyDrums)
                        .addComponent(chordCheck)
                        .addComponent(chordDurCheck)
                        .addComponent(notesOnlyCheck))
                    .addGap(26, 26, 26)
                    .addComponent(inputFilePath)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(outputDir)
                    .addGap(2, 2, 2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButtonReverseNotes)
                        .addComponent(jButton4))
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        final JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Midi files", 
            "mid", "midi");
        fc.setFileFilter(filter);
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) 
        {
            File file = fc.getSelectedFile();
            inputFilePath.setText (file.getAbsolutePath());
            MidiFileInfo fi = new MidiFileInfo (outputField);
            try
            {
                fi.doIt(inputFilePath.getText());
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        } 
        else 
        {
            System.out.println("Open command cancelled by user.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode (JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) 
        {
            File file = fc.getSelectedFile();
            outputDir.setText (file.getAbsolutePath());
            //This is where a real application would open the file.
            System.out.println("Opening: " + file.getName());
        } 
        else 
        {
            System.out.println("Open command cancelled by user.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        SplitterConfig cfg = new SplitterConfig
                (
                        rebaseCheck.isSelected(),
                        Double.parseDouble(speedFactorText.getText().trim()),
                        Integer.parseInt(transposeText.getText().trim()),
                        onlyDrums.isSelected(),
                        inputFilePath.getText(),
                        outputDir.getText(),
                        chordCheck.isSelected(),
                        chordDurCheck.isSelected()
                );
        MidiMaker mid = new MidiMaker(cfg);
        try
        {
            mid.perform(notesOnlyCheck.isSelected());
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void chordCheckActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chordCheckActionPerformed
    {//GEN-HEADEREND:event_chordCheckActionPerformed
        chordDurCheck.setSelected(false);
    }//GEN-LAST:event_chordCheckActionPerformed

    private void chordDurCheckActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chordDurCheckActionPerformed
    {//GEN-HEADEREND:event_chordDurCheckActionPerformed
        chordCheck.setSelected(false);
    }//GEN-LAST:event_chordDurCheckActionPerformed

    private void jButtonReverseNotesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonReverseNotesActionPerformed
    {//GEN-HEADEREND:event_jButtonReverseNotesActionPerformed
        try
        {
            new NoteReverser (inputFilePath.getText(),outputDir.getText(), NoteReverser.Modus.REV_TRACK);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonReverseNotesActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        try
        {
            new NoteReverser (inputFilePath.getText(),outputDir.getText(), NoteReverser.Modus.REV_OCTAVE);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() ->
        {
            GUI dialog = new GUI(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter()
            {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e)
                {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chordCheck;
    private javax.swing.JCheckBox chordDurCheck;
    private javax.swing.JLabel inputFilePath;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonReverseNotes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox notesOnlyCheck;
    private javax.swing.JCheckBox onlyDrums;
    private javax.swing.JLabel outputDir;
    private javax.swing.JTextArea outputField;
    private javax.swing.JCheckBox rebaseCheck;
    private javax.swing.JTextField speedFactorText;
    private javax.swing.JTextField transposeText;
    // End of variables declaration//GEN-END:variables
}
