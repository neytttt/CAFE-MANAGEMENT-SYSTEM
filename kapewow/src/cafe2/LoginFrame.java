package cafe2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.AdminSean;

public class LoginFrame extends javax.swing.JFrame {

    AdminSean sea = new AdminSean();
    int xx, xy;

    public LoginFrame() {
        initComponents();
        jLabel8.setVisible(false); // hide "hide" icon initially
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        // ================= PANEL ===================
        jPanel1.setBackground(new java.awt.Color(75, 56, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        // ================= CLOSE BUTTON ===================
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 35));
        jLabel4.setForeground(java.awt.Color.WHITE);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.exit(0);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 6, 31, -1));

        // ================= TITLE ===================
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28));
        jLabel1.setForeground(java.awt.Color.WHITE);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hambol Cafe");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 230, -1));

        // ================= LABELS ===================
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabel2.setForeground(java.awt.Color.WHITE);
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 107, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabel5.setForeground(java.awt.Color.WHITE);
        jLabel5.setText("Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        // ================= LOGIN BUTTON ===================
        jButton5.setBackground(new java.awt.Color(237, 226, 219));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton5.setText("Login");
        jButton5.addActionListener(evt -> login());
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 110, 33));

        // ================= CANCEL BUTTON ===================
        jButton4.setBackground(new java.awt.Color(237, 226, 219));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton4.setText("Cancel");
        jButton4.addActionListener(evt -> System.exit(0));
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 109, 33));

        // ================= PASSWORD FIELD ===================
        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 16));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 294, 32));

        // ================= HIDE PASSWORD ICON ===================
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png")));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidePassword();
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 30, 32));

        // ================= SHOW PASSWORD ICON ===================
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visible.png")));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassword();
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 30, 32));

        // ================= USERNAME ICON ===================
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png")));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        // ================= USERNAME FIELD ===================
        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 16));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 294, 30));

        // ================= SIGN UP TEXT ===================
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel3.setForeground(java.awt.Color.WHITE);
        jLabel3.setText("Don't have an account?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 140, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel6.setForeground(java.awt.Color.WHITE);
        jLabel6.setText("Sign UP");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new Signn().setVisible(true);
                setVisible(false);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 70, -1));

        // ================= FORGOT PASSWORD ===================
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel7.setForeground(java.awt.Color.WHITE);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Forgot Password");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
           
            
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        getContentPane().add(jPanel1);
        pack();
        setLocationRelativeTo(null);
    }

    // =====================================================
    // LOGIN FUNCTION
    // =====================================================
    private void login() {
        if (isEmpty()) return;

        String username = jTextField5.getText().trim();
        String password = String.valueOf(jPasswordField1.getPassword()).trim();

        if (sea.getMaxRowAdminTable() > 0) {

            if (sea.login(username, password)) {

                JOptionPane.showMessageDialog(this, "Login Success!!");

                new HomeFrame().setVisible(true);
                this.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(this,
                        "Incorrect username or password.",
                        "Login Failed",
                        JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this,
                    "No admin in the admin table!\nYou need to sign up first.",
                    "Login Failed",
                    JOptionPane.WARNING_MESSAGE);

            new Signn().setVisible(true);
            this.setVisible(false);
        }
    }

    // =====================================================
    // SHOW / HIDE PASSWORD
    // =====================================================
    private void showPassword() {
        jPasswordField1.setEchoChar((char) 0);
        jLabel9.setVisible(false);
        jLabel8.setVisible(true);
    }

    private void hidePassword() {
        jPasswordField1.setEchoChar('*');
        jLabel9.setVisible(true);
        jLabel8.setVisible(false);
    }

    // =====================================================
    // VALIDATION
    // =====================================================
    public boolean isEmpty() {
        if (jTextField5.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is required", "Warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is required", "Warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    // =====================================================
    // DRAG WINDOW
    // =====================================================
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {
        xx = evt.getX();
        xy = evt.getY();
    }

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }

    // =====================================================
    // MAIN
    // =====================================================
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }

    // =====================================================
    // VARIABLES DECLARATION
    // =====================================================
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField5;
}
