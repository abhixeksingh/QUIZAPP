package App;


import Banckend.Add_Question;
import Start.StartFrame;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Quiz_Login extends Details {

    /**
     * Creates new form Quiz_Login
     */
    public Quiz_Login() {
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

        addQuesBtn = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        pwdLabel = new javax.swing.JLabel();
        p1 = new javax.swing.JPasswordField();
        btnPanel = new javax.swing.JPanel();
        loginBtn = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        optionPanel = new javax.swing.JPanel();
        signUpPrompt = new javax.swing.JLabel();
        r2signUpBtn = new javax.swing.JLabel();
        footerPanel = new javax.swing.JPanel();
        Disclaimer = new javax.swing.JLabel();

        addQuesBtn.setBackground(new java.awt.Color(60, 63, 66));
        addQuesBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addQuesBtn.setForeground(new java.awt.Color(153, 255, 204));
        addQuesBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addQuesBtn.setText("Add Questions");
        addQuesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addQuesBtnMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setBounds(new java.awt.Rectangle(450, 200, 0, 0));
        setResizable(false);

        bodyPanel.setBackground(new java.awt.Color(34, 43, 53));
        bodyPanel.setForeground(new java.awt.Color(242, 242, 242));

        titlePanel.setBackground(new java.awt.Color(34, 43, 53));
        titlePanel.setForeground(new java.awt.Color(242, 242, 242));

        titleLabel.setBackground(new java.awt.Color(60, 63, 66));
        titleLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(242, 242, 242));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("QuizApp");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        inputPanel.setBackground(new java.awt.Color(34, 43, 53));
        inputPanel.setForeground(new java.awt.Color(242, 242, 242));

        jPanel4.setBackground(new java.awt.Color(34, 43, 53));
        jPanel4.setForeground(new java.awt.Color(242, 242, 242));

        idLabel.setBackground(new java.awt.Color(60, 63, 66));
        idLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        idLabel.setForeground(new java.awt.Color(242, 242, 242));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLabel.setText("Username");

        t1.setBackground(new java.awt.Color(72, 75, 80));
        t1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        t1.setForeground(new java.awt.Color(242, 242, 242));
        t1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        pwdLabel.setBackground(new java.awt.Color(60, 63, 66));
        pwdLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pwdLabel.setForeground(new java.awt.Color(242, 242, 242));
        pwdLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pwdLabel.setText("Password");

        p1.setBackground(new java.awt.Color(72, 75, 80));
        p1.setForeground(new java.awt.Color(242, 242, 242));
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        inputPanel.add(jPanel4);

        btnPanel.setBackground(new java.awt.Color(34, 43, 53));
        btnPanel.setForeground(new java.awt.Color(242, 242, 242));

        loginBtn.setBackground(new java.awt.Color(60, 63, 66));
        loginBtn.setForeground(new java.awt.Color(242, 242, 242));
        loginBtn.setMaximumSize(new java.awt.Dimension(155, 30));
        loginBtn.setMinimumSize(new java.awt.Dimension(155, 30));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginBtnMouseReleased(evt);
            }
        });

        loginLabel.setBackground(new java.awt.Color(242, 242, 242));
        loginLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(242, 242, 242));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Login");

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnPanel.add(loginBtn);

        optionPanel.setBackground(new java.awt.Color(34, 43, 53));
        optionPanel.setForeground(new java.awt.Color(242, 242, 242));

        signUpPrompt.setBackground(new java.awt.Color(60, 63, 66));
        signUpPrompt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        signUpPrompt.setForeground(new java.awt.Color(242, 242, 242));
        signUpPrompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpPrompt.setText("Don't have an account yet?");
        signUpPrompt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpPromptMouseClicked(evt);
            }
        });
        optionPanel.add(signUpPrompt);

        r2signUpBtn.setBackground(new java.awt.Color(60, 63, 66));
        r2signUpBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        r2signUpBtn.setForeground(new java.awt.Color(104, 181, 248));
        r2signUpBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r2signUpBtn.setText("Sign Up");
        r2signUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r2signUpBtnMouseClicked(evt);
            }
        });
        optionPanel.add(r2signUpBtn);

        footerPanel.setBackground(new java.awt.Color(34, 43, 53));
        footerPanel.setForeground(new java.awt.Color(242, 242, 242));

        Disclaimer.setBackground(new java.awt.Color(60, 63, 66));
        Disclaimer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Disclaimer.setForeground(new java.awt.Color(242, 242, 242));
        Disclaimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Disclaimer.setText("Abhishek Singh @ 21MIS1096");
        footerPanel.add(Disclaimer);

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addComponent(btnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(optionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        String id=t1.getText();
        String pw=String.valueOf(p1.getPassword());
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from login");
            int f=0;
            while(rs.next())
            {
                String id1=rs.getString(8);
                String pw1=rs.getString(9);
                if(id.equals(id1) && pw.equals(pw1))
                {
                    f=1;
                    usernameGlobal=rs.getString(1);
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null,"Login successful..");
                    Quiz_Menu pg=new Quiz_Menu();
                    pg.setVisible(true);
                    this.dispose();
                    break;
                }
            }
            if(f==0)
                JOptionPane.showMessageDialog(null,"Login fail.");
            con.close();
            st.close();
            rs.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        loginBtn.setBackground(new java.awt.Color(26, 28, 29));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        loginBtn.setBackground(new java.awt.Color(60, 63, 66));
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMousePressed
        loginBtn.setBackground(new java.awt.Color(17, 18, 19));
    }//GEN-LAST:event_loginBtnMousePressed

    private void loginBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseReleased
        loginBtn.setBackground(new java.awt.Color(60, 63, 66));
    }//GEN-LAST:event_loginBtnMouseReleased

    private void r2signUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2signUpBtnMouseClicked
        Quiz_Reg_Form ob=new Quiz_Reg_Form();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_r2signUpBtnMouseClicked

    private void signUpPromptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpPromptMouseClicked
        Quiz_Reg_Form ob=new Quiz_Reg_Form();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signUpPromptMouseClicked

    private void addQuesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addQuesBtnMouseClicked
        Add_Question ob = new Add_Question();
        ob.setVisible(true);
    }//GEN-LAST:event_addQuesBtnMouseClicked

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quiz_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Disclaimer;
    private javax.swing.JLabel addQuesBtn;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel optionPanel;
    public javax.swing.JPasswordField p1;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JLabel r2signUpBtn;
    private javax.swing.JLabel signUpPrompt;
    public javax.swing.JTextField t1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
