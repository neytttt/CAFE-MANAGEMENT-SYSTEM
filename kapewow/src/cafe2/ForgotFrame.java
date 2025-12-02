package cafe2;

import javax.swing.JOptionPane;

public class ForgotFrame extends javax.swing.JFrame {

    int xx, xy;

    public ForgotFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.setBounds(370, 0, 30, 30);
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.exit(0);
            }
        });
        jPanel1.add(jLabelClose);

        jLabelBack.setText("< Back");
        jLabelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBack.setBounds(10, 10, 60, 30);
        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new LoginFrame().setVisible(true);
                dispose();
            }
        });
        jPanel1.add(jLabelBack);

        jLabelTitle.setText("Forgot Password");
        jLabelTitle.setBounds(130, 120, 200, 40);
        jPanel1.add(jLabelTitle);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 350);

        setSize(400, 350);
        setLocationRelativeTo(null);
    }

    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelTitle;
}
