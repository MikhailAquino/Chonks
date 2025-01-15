/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ppl_lexical;

/**
 *
 * @author Jae
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LexicalPanels = new javax.swing.JTabbedPane();
        Landing = new javax.swing.JPanel();
        StartBtn = new javax.swing.JButton();
        LandingBg = new javax.swing.JLabel();
        LexicalAnalyzer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CodeTxtPane = new javax.swing.JTextPane();
        EditBtn = new javax.swing.JButton();
        AnalyzeBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        LoadBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ChunkList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ChunkListLbl = new javax.swing.JLabel();
        CodeLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ChunkEditor = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ChunkList1 = new javax.swing.JList<>();
        AddChunksBtn = new javax.swing.JButton();
        ChunkListLbl1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ChunkEditTxt = new javax.swing.JTextPane();
        CodeLbl1 = new javax.swing.JLabel();
        SaveChunk = new javax.swing.JButton();
        SaveChunk1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LexicalPanels.setPreferredSize(new java.awt.Dimension(1440, 900));

        Landing.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StartBtn.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        StartBtn.setText("Get Started");
        StartBtn.setBorderPainted(false);
        StartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBtnActionPerformed(evt);
            }
        });
        Landing.add(StartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 240, 80));

        LandingBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Chonks UI.png"))); // NOI18N
        Landing.add(LandingBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 900));

        LexicalPanels.addTab("0", Landing);

        LexicalAnalyzer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(CodeTxtPane);

        LexicalAnalyzer.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 510, 460));

        EditBtn.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        EditBtn.setText("Edit Chunks");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        LexicalAnalyzer.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 750, 200, 60));

        AnalyzeBtn.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        AnalyzeBtn.setText("Analyze");
        AnalyzeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyzeBtnActionPerformed(evt);
            }
        });
        LexicalAnalyzer.add(AnalyzeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 750, 160, 60));

        ClearBtn.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });
        LexicalAnalyzer.add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 750, 150, 60));

        LoadBtn.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        LoadBtn.setText("Load File");
        LoadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadBtnActionPerformed(evt);
            }
        });
        LexicalAnalyzer.add(LoadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 750, 150, 60));

        ChunkList.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        ChunkList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Chunk 1", "Chunk 2", "Chunk 3", "Chunk 4", "Chunk 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ChunkList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ChunkList.setSelectionBackground(new java.awt.Color(153, 153, 0));
        jScrollPane2.setViewportView(ChunkList);

        LexicalAnalyzer.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 200, 460));

        jTable1.setFont(new java.awt.Font("AppleGothic", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Line", "Token", "Attribute"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        LexicalAnalyzer.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, 440, 460));

        ChunkListLbl.setFont(new java.awt.Font("AppleGothic", 1, 36)); // NOI18N
        ChunkListLbl.setText("Chunk List");
        LexicalAnalyzer.add(ChunkListLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        CodeLbl.setBackground(new java.awt.Color(255, 204, 204));
        CodeLbl.setFont(new java.awt.Font("AppleGothic", 1, 36)); // NOI18N
        CodeLbl.setText("Code");
        LexicalAnalyzer.add(CodeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LexicalBG.png"))); // NOI18N
        LexicalAnalyzer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        LexicalPanels.addTab("1", LexicalAnalyzer);

        ChunkEditor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChunkList1.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        ChunkList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Chunk 1", "Chunk 2", "Chunk 3", "Chunk 4", "Chunk 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ChunkList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ChunkList1.setSelectionBackground(new java.awt.Color(153, 153, 0));
        jScrollPane3.setViewportView(ChunkList1);

        ChunkEditor.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 200, 460));

        AddChunksBtn.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        AddChunksBtn.setText("Add Chunk");
        AddChunksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddChunksBtnActionPerformed(evt);
            }
        });
        ChunkEditor.add(AddChunksBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 750, 200, 60));

        ChunkListLbl1.setFont(new java.awt.Font("AppleGothic", 1, 36)); // NOI18N
        ChunkListLbl1.setText("Chunk List");
        ChunkEditor.add(ChunkListLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jScrollPane5.setViewportView(ChunkEditTxt);

        ChunkEditor.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 690, 460));

        CodeLbl1.setBackground(new java.awt.Color(255, 204, 204));
        CodeLbl1.setFont(new java.awt.Font("AppleGothic", 1, 36)); // NOI18N
        CodeLbl1.setText("Code");
        ChunkEditor.add(CodeLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        SaveChunk.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        SaveChunk.setText("Save");
        SaveChunk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveChunkActionPerformed(evt);
            }
        });
        ChunkEditor.add(SaveChunk, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 730, 160, 60));

        SaveChunk1.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        SaveChunk1.setText("Back to Lexical Analyzer");
        SaveChunk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveChunk1ActionPerformed(evt);
            }
        });
        ChunkEditor.add(SaveChunk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 730, 310, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ChunkEditorBg.png"))); // NOI18N
        ChunkEditor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 900));

        LexicalPanels.addTab("2", ChunkEditor);

        getContentPane().add(LexicalPanels, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1920, 1120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBtnActionPerformed
    LexicalPanels.setSelectedIndex(1);       
    }//GEN-LAST:event_StartBtnActionPerformed

    private void AnalyzeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyzeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnalyzeBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
    LexicalPanels.setSelectedIndex(2);   // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void LoadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadBtnActionPerformed

    private void AddChunksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddChunksBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddChunksBtnActionPerformed

    private void SaveChunkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveChunkActionPerformed
    
    }//GEN-LAST:event_SaveChunkActionPerformed

    private void SaveChunk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveChunk1ActionPerformed
    LexicalPanels.setSelectedIndex(1);  
    }//GEN-LAST:event_SaveChunk1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddChunksBtn;
    private javax.swing.JButton AnalyzeBtn;
    private javax.swing.JTextPane ChunkEditTxt;
    private javax.swing.JPanel ChunkEditor;
    private javax.swing.JList<String> ChunkList;
    private javax.swing.JList<String> ChunkList1;
    private javax.swing.JLabel ChunkListLbl;
    private javax.swing.JLabel ChunkListLbl1;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel CodeLbl;
    private javax.swing.JLabel CodeLbl1;
    private javax.swing.JTextPane CodeTxtPane;
    private javax.swing.JButton EditBtn;
    private javax.swing.JPanel Landing;
    private javax.swing.JLabel LandingBg;
    private javax.swing.JPanel LexicalAnalyzer;
    private javax.swing.JTabbedPane LexicalPanels;
    private javax.swing.JButton LoadBtn;
    private javax.swing.JButton SaveChunk;
    private javax.swing.JButton SaveChunk1;
    private javax.swing.JButton StartBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
