/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jairo.gest.gui;


import com.jairo.gest.registro.Registrador;
import java.awt.Color;

/**
 *
 * @author Jairo
 */
public class Registro extends javax.swing.JFrame {

    private Registrador registrador;
    private int mouseX, mouseY;
    public Registro() {
        initComponents();
        mensajeLbl.setVisible(false);
        registrador = new Registrador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bg2 = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userTextBox = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        contLabel = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        separator2 = new javax.swing.JSeparator();
        contTextBox = new javax.swing.JPasswordField();
        ojoPanel = new javax.swing.JPanel();
        ojo = new javax.swing.JLabel();
        mensajeLbl = new javax.swing.JLabel();
        ojoPanel1 = new javax.swing.JPanel();
        ojo1 = new javax.swing.JLabel();
        repContLbl = new javax.swing.JLabel();
        separator3 = new javax.swing.JSeparator();
        repContTextBox = new javax.swing.JPasswordField();
        botonReg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bar = new javax.swing.JPanel();
        exitB = new javax.swing.JPanel();
        exitLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(203, 182, 184));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.setPreferredSize(new java.awt.Dimension(737, 467));

        bg2.setBackground(new java.awt.Color(31, 31, 31));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Registro de usuario");

        userTextBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        userTextBox.setForeground(new java.awt.Color(204, 204, 204));
        userTextBox.setText("Usuario");
        userTextBox.setBorder(null);
        userTextBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userTextBoxFocusGained(evt);
            }
        });
        userTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTextBoxMouseClicked(evt);
            }
        });
        userTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextBoxActionPerformed(evt);
            }
        });
        userTextBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userTextBoxKeyTyped(evt);
            }
        });

        userLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        userLabel.setText("Usuario");

        contLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        contLabel.setText("Contrase??a maestra");

        separator1.setForeground(new java.awt.Color(0, 0, 0));

        separator2.setForeground(new java.awt.Color(0, 0, 0));

        contTextBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        contTextBox.setForeground(new java.awt.Color(204, 204, 204));
        contTextBox.setText("Contrase??a maestra");
        contTextBox.setBorder(null);
        contTextBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contTextBoxFocusGained(evt);
            }
        });
        contTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contTextBoxMouseClicked(evt);
            }
        });
        contTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contTextBoxActionPerformed(evt);
            }
        });
        contTextBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contTextBoxKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contTextBoxKeyTyped(evt);
            }
        });

        ojoPanel.setBackground(new java.awt.Color(255, 255, 255));

        ojo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ojito.png"))); // NOI18N
        ojo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ojoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ojoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout ojoPanelLayout = new javax.swing.GroupLayout(ojoPanel);
        ojoPanel.setLayout(ojoPanelLayout);
        ojoPanelLayout.setHorizontalGroup(
            ojoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ojo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );
        ojoPanelLayout.setVerticalGroup(
            ojoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ojo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        mensajeLbl.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        mensajeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeLbl.setText("Mensaje");

        ojoPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ojo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ojo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ojito.png"))); // NOI18N
        ojo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ojo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ojo1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ojo1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout ojoPanel1Layout = new javax.swing.GroupLayout(ojoPanel1);
        ojoPanel1.setLayout(ojoPanel1Layout);
        ojoPanel1Layout.setHorizontalGroup(
            ojoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ojo1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );
        ojoPanel1Layout.setVerticalGroup(
            ojoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ojo1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        repContLbl.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        repContLbl.setText("Repetir contrase??a maestra");

        separator3.setForeground(new java.awt.Color(0, 0, 0));

        repContTextBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        repContTextBox.setBorder(null);
        repContTextBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                repContTextBoxFocusGained(evt);
            }
        });
        repContTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repContTextBoxMouseClicked(evt);
            }
        });
        repContTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repContTextBoxActionPerformed(evt);
            }
        });
        repContTextBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                repContTextBoxKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                repContTextBoxKeyTyped(evt);
            }
        });

        botonReg.setBackground(new java.awt.Color(203, 182, 184));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrarse");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout botonRegLayout = new javax.swing.GroupLayout(botonReg);
        botonReg.setLayout(botonRegLayout);
        botonRegLayout.setHorizontalGroup(
            botonRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        botonRegLayout.setVerticalGroup(
            botonRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGap(0, 60, Short.MAX_VALUE)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(repContLbl)
                                .addComponent(separator3)
                                .addGroup(loginPanelLayout.createSequentialGroup()
                                    .addComponent(repContTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ojoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(contLabel)
                                .addComponent(userLabel)
                                .addComponent(userTextBox)
                                .addComponent(separator1)
                                .addComponent(separator2)
                                .addGroup(loginPanelLayout.createSequentialGroup()
                                    .addComponent(contTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ojoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57))))
            .addComponent(mensajeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensajeLbl)
                .addGap(17, 17, 17)
                .addComponent(userLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(contLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ojoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repContLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(repContTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ojoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        bar.setBackground(new java.awt.Color(203, 182, 184));
        bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barMouseDragged(evt);
            }
        });
        bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barMousePressed(evt);
            }
        });

        exitB.setBackground(new java.awt.Color(203, 182, 184));
        exitB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBMouseExited(evt);
            }
        });

        exitLbl.setBackground(new java.awt.Color(203, 182, 184));
        exitLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        exitLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLbl.setText("X");
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBLayout = new javax.swing.GroupLayout(exitB);
        exitB.setLayout(exitBLayout);
        exitBLayout.setHorizontalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
        exitBLayout.setVerticalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextBoxActionPerformed

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barMousePressed

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX , y - mouseY );
    }//GEN-LAST:event_barMouseDragged

    private void exitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitLblMouseClicked

    private void exitLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseEntered
        exitB.setBackground(new Color(210, 51, 105));
    }//GEN-LAST:event_exitLblMouseEntered

    private void exitBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseExited
        exitB.setBackground(new Color(203, 182, 184));
    }//GEN-LAST:event_exitBMouseExited

    private void exitBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseEntered
        exitB.setBackground(new Color(210, 51, 105));
    }//GEN-LAST:event_exitBMouseEntered

    private void exitLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseExited
        exitB.setBackground(new Color(203, 182, 184));
    }//GEN-LAST:event_exitLblMouseExited

    private void userTextBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTextBoxFocusGained
        
        if(userTextBox.getText().equals("Usuario")){
            userTextBox.setText("");
        }
        
        userTextBox.setForeground(Color.BLACK);
        if(String.valueOf(contTextBox.getPassword()).equals("Contrase??a maestra")||String.valueOf(contTextBox.getPassword()).equals("")){
           contTextBox.setText("Contrase??a maestra");
           contTextBox.setForeground(Color.gray);
        }
        
        mensajeLbl.setVisible(false);
        
    }//GEN-LAST:event_userTextBoxFocusGained

    private void contTextBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contTextBoxFocusGained
        
        if(String.valueOf(contTextBox.getPassword()).equals("Contrase??a maestra")){
            contTextBox.setText("");
        }
        contTextBox.setForeground(Color.BLACK);
        if(String.valueOf(userTextBox.getText()).equals("Usuario")||String.valueOf(userTextBox.getText()).equals("")){
           userTextBox.setText("Usuario");
           userTextBox.setForeground(Color.gray);
        }
        mensajeLbl.setVisible(false);
        
    }//GEN-LAST:event_contTextBoxFocusGained

    private void contTextBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contTextBoxKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_contTextBoxKeyPressed

    private void userTextBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTextBoxKeyTyped
        mensajeLbl.setVisible(false);
    }//GEN-LAST:event_userTextBoxKeyTyped

    private void contTextBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contTextBoxKeyTyped
        mensajeLbl.setVisible(false);
    }//GEN-LAST:event_contTextBoxKeyTyped

    private void ojoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojoMouseReleased
        contTextBox.setEchoChar('*');
    }//GEN-LAST:event_ojoMouseReleased

    private void ojoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojoMousePressed
        contTextBox.setEchoChar((char)0);
    }//GEN-LAST:event_ojoMousePressed

    private void ojo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojo1MousePressed
        repContTextBox.setEchoChar((char)0);
    }//GEN-LAST:event_ojo1MousePressed

    private void ojo1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojo1MouseReleased
        repContTextBox.setEchoChar('*');
    }//GEN-LAST:event_ojo1MouseReleased

    private void repContTextBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_repContTextBoxFocusGained
        mensajeLbl.setVisible(false);
    }//GEN-LAST:event_repContTextBoxFocusGained

    private void repContTextBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repContTextBoxKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_repContTextBoxKeyPressed

    private void repContTextBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repContTextBoxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_repContTextBoxKeyTyped

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        botonReg.setBackground(new Color(223, 202, 204));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        botonReg.setBackground(new Color(203, 182, 184));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String mensaje;
        
        mensaje = registrador.registrarUsuario(userTextBox.getText(), String.valueOf(contTextBox.getPassword()), String.valueOf(repContTextBox.getPassword()));
        
        mensajeLbl.setText(mensaje);
        mensajeLbl.setVisible(true);
        
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void repContTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repContTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repContTextBoxActionPerformed

    private void userTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextBoxMouseClicked
        mensajeLbl.setVisible(false);
    }//GEN-LAST:event_userTextBoxMouseClicked

    private void contTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contTextBoxActionPerformed

    private void contTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contTextBoxMouseClicked
        mensajeLbl.setVisible(false);
    }//GEN-LAST:event_contTextBoxMouseClicked

    private void repContTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repContTextBoxMouseClicked
        mensajeLbl.setVisible(false);
    }//GEN-LAST:event_repContTextBoxMouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel botonReg;
    private javax.swing.JLabel contLabel;
    private javax.swing.JPasswordField contTextBox;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel mensajeLbl;
    private javax.swing.JLabel ojo;
    private javax.swing.JLabel ojo1;
    private javax.swing.JPanel ojoPanel;
    private javax.swing.JPanel ojoPanel1;
    private javax.swing.JLabel repContLbl;
    private javax.swing.JPasswordField repContTextBox;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JSeparator separator3;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTextBox;
    // End of variables declaration//GEN-END:variables
}
