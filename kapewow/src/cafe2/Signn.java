package cafe2;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import model.Admin;
import model.AdminSean;

public class Signn extends javax.swing.JFrame {

    private int xx, xy;

    public Signn() {
        initComponents();
        jLabelHide.setVisible(false); // hide the hide icon at start
        jPasswordField.setEchoChar('•');
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jTextUsername = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelShow = new javax.swing.JLabel();
        jLabelHide = new javax.swing.JLabel();
        jLabelSec = new javax.swing.JLabel();
        jComboBoxQuestion = new javax.swing.JComboBox<>();
        jLabelAnswer = new javax.swing.JLabel();
        jTextAnswer = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(75, 56, 50));
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

        jLabelTitle.setFont(new java.awt.Font("Times New Roman", 1, 28));
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Sign Up");

        jLabelClose.setFont(new java.awt.Font("Segoe UI", 1, 30));
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setText("X");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dispose();
            }
        });

        jLabelUsername.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabelUsername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsername.setText("Username:");

        jTextUsername.setFont(new java.awt.Font("Times New Roman", 0, 16));

        jLabelPassword.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Password:");

        jPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 16));

        jLabelShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visible.png")));
        jLabelShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassword();
            }
        });

        jLabelHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png")));
        jLabelHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidePassword();
            }
        });

        jLabelSec.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabelSec.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSec.setText("Security Question:");

        jComboBoxQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "What is your favorite color?",
            "What is your pet's name?",
            "What is your mother's maiden name?",
            "What city were you born in?"
        }));
        jComboBoxQuestion.setSelectedIndex(-1);

        jLabelAnswer.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabelAnswer.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAnswer.setText("Answer:");

        jTextAnswer.setFont(new java.awt.Font("Times New Roman", 0, 16));

        jButtonSave.setBackground(new java.awt.Color(237, 226, 219));
        jButtonSave.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(evt -> jButtonSaveActionPerformed(evt));

        jButtonBack.setBackground(new java.awt.Color(237, 226, 219));
        jButtonBack.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(evt -> jButtonBackActionPerformed(evt));

        // ------------------------------
        // Layout (KEEP YOUR EXISTING ONE)
        // ------------------------------

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelTitle)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelUsername)
                        .addComponent(jLabelPassword)
                        .addComponent(jLabelSec)
                        .addComponent(jLabelAnswer))
                    .addGap(20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextUsername)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelShow)
                            .addComponent(jLabelHide))
                        .addComponent(jComboBoxQuestion, 0, 220, Short.MAX_VALUE)
                        .addComponent(jTextAnswer))
                    .addContainerGap(40, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(100)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(100))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelClose)
                        .addComponent(jLabelTitle))
                    .addGap(20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelUsername)
                        .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabelPassword)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelShow)
                        .addComponent(jLabelHide))
                    .addGap(20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSec)
                        .addComponent(jComboBoxQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAnswer)
                        .addComponent(jTextAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        pack();
        setLocationRelativeTo(null);
    }

    // ===========================================================
    // PASSWORD SHOW / HIDE
    // ===========================================================
    private void showPassword() {
        jPasswordField.setEchoChar((char) 0);
        jLabelShow.setVisible(false);
        jLabelHide.setVisible(true);
    }

    private void hidePassword() {
        jPasswordField.setEchoChar('•');
        jLabelShow.setVisible(true);
        jLabelHide.setVisible(false);
    }

    // ===========================================================
    // SAVE BUTTON
    // ===========================================================
    private void jButtonSaveActionPerformed(ActionEvent evt) {

        if (isEmpty()) return;

        String username = jTextUsername.getText().trim();
        String password = String.valueOf(jPasswordField.getPassword());
        String question = jComboBoxQuestion.getSelectedItem().toString();
        String answer = jTextAnswer.getText().trim();

        AdminSean db = new AdminSean();

        if (db.isAdminNameExist(username)) {
            JOptionPane.showMessageDialog(this,
                "Username already exists!",
                "Warning", 2);
            return;
        }

        Admin newAdmin = new Admin(0, username, password, question, answer);

        if (db.insert(newAdmin)) {
            JOptionPane.showMessageDialog(this, "Account Created Successfully!", "Success", 1);
            new LoginFrame().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to create account!", "Error", 0);
        }
    }

    // ===========================================================
    // BACK BUTTON
    // ===========================================================
    private void jButtonBackActionPerformed(ActionEvent evt) {
        new LoginFrame().setVisible(true);
        this.dispose();
    }

    // ===========================================================
    // VALIDATION
    // ===========================================================
    public boolean isEmpty() {

        if (jTextUsername.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is required!", "Warning", 2);
            return true;
        }
        if (String.valueOf(jPasswordField.getPassword()).trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is required!", "Warning", 2);
            return true;
        }
        if (jComboBoxQuestion.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a security question!", "Warning", 2);
            return true;
        }
        if (jTextAnswer.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide an answer!", "Warning", 2);
            return true;
        }
        return false;
    }

    // ===========================================================
    // DRAG WINDOW
    // ===========================================================
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {
        xx = evt.getX();
        xy = evt.getY();
    }

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Signn().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxQuestion;
    private javax.swing.JLabel jLabelAnswer;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelHide;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelSec;
    private javax.swing.JLabel jLabelShow;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextAnswer;
    private javax.swing.JTextField jTextUsername;
}
