import java.util.prefs.Preferences;
/*
 * frmSettings.java
 *
 * Created on June 26, 2006, 1:53 PM
 */

/**
 *
 * @author  Jason
 */
public class frmSettings extends javax.swing.JFrame {
   
    private final static int DEFAULTWIDTH = 6;
    private final static int DEFAULTHEIGHT = 6;
    private final static int DEFAULTCONNECTIONLENGHT = 4;
    
    private Preferences prefs = Preferences.userNodeForPackage(this.getClass());

    /** Creates new form frmSettings */
    public frmSettings() {
        initComponents();
        loadPrefs();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
  // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
  private void initComponents() {
    buttonGroup1 = new javax.swing.ButtonGroup();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    txtBoardHeigth = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    txtBoardWidth = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    txtConnectionLength = new javax.swing.JTextField();
    btnExit = new javax.swing.JButton();
    btnSave = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    txtNetworkName = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    txtHostingPort = new javax.swing.JTextField();
    jPanel4 = new javax.swing.JPanel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Board area")));
    jLabel1.setText("Height");

    txtBoardHeigth.setText("6");

    jLabel2.setText("Width");

    txtBoardWidth.setText("6");

    org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel1Layout.createSequentialGroup()
        .add(jLabel1)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(txtBoardHeigth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(46, 46, 46)
        .add(jLabel2)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(txtBoardWidth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
        .add(jLabel1)
        .add(txtBoardHeigth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(jLabel2)
        .add(txtBoardWidth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Other")));
    jLabel3.setText("Winning connection length");

    txtConnectionLength.setText("4");

    org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel2Layout.createSequentialGroup()
        .add(jLabel3)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(txtConnectionLength, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
        .add(jLabel3)
        .add(txtConnectionLength, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
    );

    btnExit.setText("Exit");
    btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnExitMouseClicked(evt);
      }
    });

    btnSave.setText("Save");
    btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnSaveMouseClicked(evt);
      }
    });

    btnSave.getAccessibleContext().setAccessibleDescription("cats");

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Network"));
    jLabel4.setText("Network name");

    jLabel5.setText("Hosting port");
    jLabel5.setToolTipText("");

    org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(jPanel3Layout.createSequentialGroup()
            .add(jLabel4)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(txtNetworkName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
          .add(jPanel3Layout.createSequentialGroup()
            .add(jLabel5)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 24, Short.MAX_VALUE)
            .add(txtHostingPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 224, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel3Layout.createSequentialGroup()
        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jLabel4)
          .add(txtNetworkName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 7, Short.MAX_VALUE)
        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jLabel5)
          .add(txtHostingPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Preset games"));
    buttonGroup1.add(jRadioButton1);
    jRadioButton1.setText("Tic-tac-toe");
    jRadioButton1.setToolTipText("<html>Tic-tac-toe is a game for two players, O and X, who take turns to mark the spaces in a 3\u00d73 grid.<br>The player who succeeds in placing three of their own marks<br>in a horizontal, vertical or diagonal row wins the game.</html>");
    jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
    jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tttPresetChosen(evt);
      }
    });

    buttonGroup1.add(jRadioButton2);
    jRadioButton2.setText("Gomoku");
    jRadioButton2.setToolTipText("<html>Gomoku (\"five points\") - Is traditionally played with black and white stones on a  19x19 intersectioned board.<br>The winner is the first player to get an unbroken row of five stones horizontally, vertically, or diagonally. </html>");
    jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
    jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        GomokuClicked(evt);
      }
    });

    org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(jRadioButton1)
          .add(jRadioButton2))
        .addContainerGap(250, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel4Layout.createSequentialGroup()
        .add(jRadioButton1)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(jRadioButton2)
        .add(31, 31, 31))
    );

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
            .add(btnSave)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(btnExit)))
        .addContainerGap())
    );

    layout.linkSize(new java.awt.Component[] {btnExit, btnSave}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(btnExit)
          .add(btnSave))
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void GomokuClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GomokuClicked
      this.txtBoardHeigth.setText("18");
      this.txtBoardWidth.setText("18");
      this.txtConnectionLength.setText("5");
  }//GEN-LAST:event_GomokuClicked

  private void tttPresetChosen(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tttPresetChosen
      this.txtBoardHeigth.setText("3");
      this.txtBoardWidth.setText("3");
      this.txtConnectionLength.setText("3");
  }//GEN-LAST:event_tttPresetChosen

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        prefs.put("BOARD_WIDTH",this.txtBoardWidth.getText());
        prefs.put("BOARD_HEIGHT",this.txtBoardHeigth.getText());
        prefs.put("CONNECTIN_LENGTH",this.txtConnectionLength.getText());
        prefs.put("CONNECTIN_LENGTH",this.txtConnectionLength.getText());
        prefs.put("PLAYER_NAME",this.txtNetworkName.getText());
        prefs.put("HOSTING_PORT",this.txtHostingPort.getText());
    }//GEN-LAST:event_btnSaveMouseClicked
    
    public String getHostingPort(){
        return prefs.get("HOSTING_PORT","");
    }
    
    public String getNetworkName(){
        return prefs.get("PLAYER_NAME", "");
    }
    
    public int getBoardWidth(){
        try{
            return Integer.parseInt(prefs.get("BOARD_WIDTH", ""));
        }catch (NumberFormatException ex){
            return DEFAULTWIDTH;
        }
    }
    public int getBoardHeight(){
        try{
            return Integer.parseInt(prefs.get("BOARD_HEIGHT", ""));
        }catch (NumberFormatException ex){
            return DEFAULTHEIGHT;
        }
    }
    public int getBoardConnectionLength(){
        try{
            return Integer.parseInt(prefs.get("CONNECTIN_LENGTH", ""));
        }catch (NumberFormatException ex){
            return DEFAULTCONNECTIONLENGHT;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSettings().setVisible(true);
            }
        });
    }

    private void loadPrefs() {
        this.txtBoardWidth.setText(this.getBoardWidth() + "");
        this.txtBoardHeigth.setText(this.getBoardHeight() + "");
        this.txtConnectionLength.setText(this.getBoardConnectionLength() + "");
        this.txtNetworkName.setText(this.getNetworkName() + "");
        this.txtHostingPort.setText(this.getHostingPort());
    }
    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnExit;
  private javax.swing.JButton btnSave;
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JRadioButton jRadioButton2;
  private javax.swing.JTextField txtBoardHeigth;
  private javax.swing.JTextField txtBoardWidth;
  private javax.swing.JTextField txtConnectionLength;
  private javax.swing.JTextField txtHostingPort;
  private javax.swing.JTextField txtNetworkName;
  // End of variables declaration//GEN-END:variables
    
}