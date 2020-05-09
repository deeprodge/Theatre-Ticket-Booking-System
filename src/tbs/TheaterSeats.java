/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbs;

import java.sql.*;


/**
 *
 * @author patel
 */
public class TheaterSeats extends javax.swing.JFrame {

    /**
     * Creates new form TheaterSeats
     */
    public TheaterSeats() {
        initComponents();
    }
String a;
int f,t;
long dd3,ad;
    public TheaterSeats(int par1,long par2,String par3,int par4,long par5)
    {
        initComponents();
        dd3=par2;
        a=par3;
        f=par1;
        t=par4;
        ad=par5;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a1 = new javax.swing.JToggleButton();
        a2 = new javax.swing.JToggleButton();
        a3 = new javax.swing.JToggleButton();
        a4 = new javax.swing.JToggleButton();
        a5 = new javax.swing.JToggleButton();
        a6 = new javax.swing.JToggleButton();
        a7 = new javax.swing.JToggleButton();
        a8 = new javax.swing.JToggleButton();
        b1 = new javax.swing.JToggleButton();
        b2 = new javax.swing.JToggleButton();
        b3 = new javax.swing.JToggleButton();
        b4 = new javax.swing.JToggleButton();
        b5 = new javax.swing.JToggleButton();
        b6 = new javax.swing.JToggleButton();
        b7 = new javax.swing.JToggleButton();
        b8 = new javax.swing.JToggleButton();
        c1 = new javax.swing.JToggleButton();
        c2 = new javax.swing.JToggleButton();
        c3 = new javax.swing.JToggleButton();
        c4 = new javax.swing.JToggleButton();
        c5 = new javax.swing.JToggleButton();
        c6 = new javax.swing.JToggleButton();
        c7 = new javax.swing.JToggleButton();
        c8 = new javax.swing.JToggleButton();
        d1 = new javax.swing.JToggleButton();
        d2 = new javax.swing.JToggleButton();
        d3 = new javax.swing.JToggleButton();
        d4 = new javax.swing.JToggleButton();
        d5 = new javax.swing.JToggleButton();
        d6 = new javax.swing.JToggleButton();
        d7 = new javax.swing.JToggleButton();
        d8 = new javax.swing.JToggleButton();
        e1 = new javax.swing.JToggleButton();
        e2 = new javax.swing.JToggleButton();
        e3 = new javax.swing.JToggleButton();
        e4 = new javax.swing.JToggleButton();
        e5 = new javax.swing.JToggleButton();
        e6 = new javax.swing.JToggleButton();
        e7 = new javax.swing.JToggleButton();
        e8 = new javax.swing.JToggleButton();
        f1 = new javax.swing.JToggleButton();
        f2 = new javax.swing.JToggleButton();
        f3 = new javax.swing.JToggleButton();
        f4 = new javax.swing.JToggleButton();
        f5 = new javax.swing.JToggleButton();
        f6 = new javax.swing.JToggleButton();
        f7 = new javax.swing.JToggleButton();
        f8 = new javax.swing.JToggleButton();
        g1 = new javax.swing.JToggleButton();
        g2 = new javax.swing.JToggleButton();
        g3 = new javax.swing.JToggleButton();
        g4 = new javax.swing.JToggleButton();
        g5 = new javax.swing.JToggleButton();
        g6 = new javax.swing.JToggleButton();
        g7 = new javax.swing.JToggleButton();
        g8 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("B");

        C.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C.setText("C");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("A");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("E");

        F.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        F.setText("F");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("D");

        F1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        F1.setText("G");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("B");

        C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C1.setText("C");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("A");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("E");

        F2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        F2.setText("F");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("D");

        F3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        F3.setText("G");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("1");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("2");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("3");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("4");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("5");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("6");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("7");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("8");

        jButton1.setText("Next->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<- Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Select the appropriate seats");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2)
                        .addGap(221, 221, 221)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(F)
                                .addGap(10, 10, 10)
                                .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(F1)
                                .addGap(10, 10, 10)
                                .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(F2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(F3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(10, 10, 10)
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C)
                                .addGap(10, 10, 10)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(C1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addComponent(jLabel17)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C)
                            .addComponent(C1)))
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)))
                    .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)))
                    .addComponent(e8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(F)
                                    .addComponent(F2)))
                            .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(F1)
                                    .addComponent(F3)))
                            .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tbs?useSSL=false", "root", "1234");
            Statement stmt = con.createStatement();
            String qu = "select seats from seat"+f+" where ss"+dd3+t+"='y';";
            ResultSet rs = stmt.executeQuery(qu);
            while (rs.next()) {
                String a = rs.getString(1);
                switch (a.substring(0, 1)) {
                    case "a":
                        switch (a.substring(1)) {
                            case "1":
                                a1.setEnabled(false);
                                break;
                            case "2":
                                a2.setEnabled(false);
                                break;
                            case "3":
                                a3.setEnabled(false);
                                break;
                            case "4":
                                a4.setEnabled(false);
                                break;
                            case "5":
                                a5.setEnabled(false);
                                break;
                            case "6":
                                a6.setEnabled(false);
                                break;
                            case "7":
                                a7.setEnabled(false);
                                break;
                            case "8":
                                a8.setEnabled(false);
                                break;
                        }
                        break;
                    case "b":
                        switch (a.substring(1)) {
                            case "1":
                                b1.setEnabled(false);
                                break;
                            case "2":
                                b2.setEnabled(false);
                                break;
                            case "3":
                                b3.setEnabled(false);
                                break;
                            case "4":
                                b4.setEnabled(false);
                                break;
                            case "5":
                                b5.setEnabled(false);
                                break;
                            case "6":
                                b6.setEnabled(false);
                                break;
                            case "7":
                                b7.setEnabled(false);
                                break;
                            case "8":
                                b8.setEnabled(false);
                                break;
                        }
                        break;
                    case "c":
                        switch (a.substring(1)) {
                            case "1":
                                c1.setEnabled(false);
                                break;
                            case "2":
                                c2.setEnabled(false);
                                break;
                            case "3":
                                c3.setEnabled(false);
                                break;
                            case "4":
                                c4.setEnabled(false);
                                break;
                            case "5":
                                c5.setEnabled(false);
                                break;
                            case "6":
                                c6.setEnabled(false);
                                break;
                            case "7":
                                c7.setEnabled(false);
                                break;
                            case "8":
                                c8.setEnabled(false);
                                break;
                        }
                        break;
                    case "d":
                        switch (a.substring(1)) {
                            case "1":
                                d1.setEnabled(false);
                                break;
                            case "2":
                                d2.setEnabled(false);
                                break;
                            case "3":
                                d3.setEnabled(false);
                                break;
                            case "4":
                                d4.setEnabled(false);
                                break;
                            case "5":
                                d5.setEnabled(false);
                                break;
                            case "6":
                                d6.setEnabled(false);
                                break;
                            case "7":
                                d7.setEnabled(false);
                                break;
                            case "8":
                                d8.setEnabled(false);
                                break;
                        }
                        break;
                    case "e":
                        switch (a.substring(1)) {
                            case "1":
                                e1.setEnabled(false);
                                break;
                            case "2":
                                e2.setEnabled(false);
                                break;
                            case "3":
                                e3.setEnabled(false);
                                break;
                            case "4":
                                e4.setEnabled(false);
                                break;
                            case "5":
                                e5.setEnabled(false);
                                break;
                            case "6":
                                e6.setEnabled(false);
                                break;
                            case "7":
                                e7.setEnabled(false);
                                break;
                            case "8":
                                e8.setEnabled(false);
                                break;
                        }
                        break;
                    case "f":
                        switch (a.substring(1)) {
                            case "1":
                                f1.setEnabled(false);
                                break;
                            case "2":
                                f2.setEnabled(false);
                                break;
                            case "3":
                                f3.setEnabled(false);
                                break;
                            case "4":
                                f4.setEnabled(false);
                                break;
                            case "5":
                                f5.setEnabled(false);
                                break;
                            case "6":
                                f6.setEnabled(false);
                                break;
                            case "7":
                                f7.setEnabled(false);
                                break;
                            case "8":
                                f8.setEnabled(false);
                                break;
                        }
                        break;
                    case "g":
                        switch (a.substring(1)) {
                            case "1":
                                g1.setEnabled(false);
                                break;
                            case "2":
                                g2.setEnabled(false);
                                break;
                            case "3":
                                g3.setEnabled(false);
                                break;
                            case "4":
                                g4.setEnabled(false);
                                break;
                            case "5":
                                g5.setEnabled(false);
                                break;
                            case "6":
                                g6.setEnabled(false);
                                break;
                            case "7":
                                g7.setEnabled(false);
                                break;
                            case "8":
                                g8.setEnabled(false);
                                break;
                        }
                        break;
                }
            }
            rs.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     int f11=0;  
     String[] sebo=new String[56];
     
     f11=-1;
     for(int iji=0;iji<55;iji++)
        { 
            sebo[iji]="n";
        }
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tbs?useSSL=false", "root", "1234");
            Statement stmt = con.createStatement();
            String qua="delete from temp";
            stmt.execute(qua);

        if(a1.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='a1';"); sebo[0]="y";f11++;}
        if(a2.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='a2';"); sebo[1]="y";f11++;}
        if(a3.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='a3';"); sebo[2]="y";f11++;}
        if(a4.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='a4';"); sebo[3]="y";f11++;}
        if(a5.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='a5';"); sebo[4]="y";f11++;}
        if(a6.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='a6';"); sebo[5]="y";f11++;}
        if(a7.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='a7';"); sebo[6]="y";f11++;}
        if(a8.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='a8';"); sebo[7]="y";f11++;}
        
        
        if(b1.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='b1';"); sebo[8]="y";f11++;}
        if(b2.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='b2';"); sebo[9]="y";f11++;}
        if(b3.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='b3';"); sebo[10]="y";f11++;}
        if(b4.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='b4';"); sebo[11]="y";f11++;}
        if(b5.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='b5';"); sebo[12]="y";f11++;}
        if(b6.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='b6';"); sebo[13]="y";f11++;}
        if(b7.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='b7';"); sebo[14]="y";f11++;}
        if(b8.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='b8';"); sebo[15]="y";f11++;}
        
        
        if(c1.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='c1';"); sebo[16]="y";f11++;}
        if(c2.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='c2';"); sebo[17]="y";f11++;}
        if(c3.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='c3';"); sebo[18]="y";f11++;}
        if(c4.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='c4';"); sebo[19]="y";f11++;}
        if(c5.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='c5';"); sebo[20]="y";f11++;}
        if(c6.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='c6';"); sebo[21]="y";f11++;}
        if(c7.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='c7';"); sebo[22]="y";f11++;}
        if(c8.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='c8';"); sebo[23]="y";f11++;}
        
        
        if(d1.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='d1';"); sebo[24]="y";f11++;}
        if(d2.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='d2';"); sebo[25]="y";f11++;}
        if(d3.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='d3';"); sebo[26]="y";f11++;}
        if(d4.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='d4';"); sebo[27]="y";f11++;}
        if(d5.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='d5';"); sebo[28]="y";f11++;}
        if(d6.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='d6';"); sebo[29]="y";f11++;}
        if(d7.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='d7';"); sebo[30]="y";f11++;}
        if(d8.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='d8';"); sebo[31]="y";f11++;}
       
        
        if(e1.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='e1';"); sebo[32]="y";f11++;}
        if(e2.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='e2';"); sebo[33]="y";f11++;}
        if(e3.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='e3';"); sebo[34]="y";f11++;}
        if(e4.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='e4';"); sebo[35]="y";f11++;}
        if(e5.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='e5';"); sebo[36]="y";f11++;}
        if(e6.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='e6';"); sebo[37]="y";f11++;}
        if(e7.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='e7';"); sebo[38]="y";f11++;}
        if(e8.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='e8';"); sebo[39]="y";f11++;}
        
        
        if(f1.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='f1';"); sebo[40]="y";f11++;}
        if(f2.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='f2';"); sebo[41]="y";f11++;}
        if(f3.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='f3';"); sebo[42]="y";f11++;}
        if(f4.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='f4';"); sebo[43]="y";f11++;}
        if(f5.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='f5';"); sebo[44]="y";f11++;}
        if(f6.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='f6';"); sebo[45]="y";f11++;}
        if(f7.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='f7';"); sebo[46]="y";f11++;}
        if(f8.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='f8';"); sebo[47]="y";f11++;}
        
        
        if(g1.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='g1';"); sebo[48]="y";f11++;}
        if(g2.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='g2';"); sebo[49]="y";f11++;}
        if(g3.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='g3';"); sebo[50]="y";f11++;}
        if(g4.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='g4';"); sebo[51]="y";f11++;}
        if(g5.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='g5';"); sebo[52]="y";f11++;}
        if(g6.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='g6';"); sebo[53]="y";f11++;}
        if(g7.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='g7';"); sebo[54]="y";f11++;}
        if(g8.isSelected())
             {stmt.executeUpdate("update seat"+f+" set ss"+dd3+t+"='y' where seats='g8';"); sebo[55]="y";f11++;}
         for(int ii=0;ii<56;ii++)
        {
             
            if(sebo[ii].equals("y"))
            {
                
                int ji=ii+1;
                int ji1=ji/8+1;
                int ji2=ji%8;
                if(ji2==0)
                {
                    ji1=ji1-1;
                    ji2=8;
                }
                char c=(char)(96+ji1);
                String c1=c+""+ji2;
               
               String qua2="insert into temp values('"+c1+"');";
               stmt.execute(qua2);
                System.out.println(c1);
            }
        }
       
        } catch (Exception e) {
            System.out.print(e);
  
        }
        new ConfirmationAndOtherThings(a,ad,t).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new MovieSelect(a).setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(TheaterSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheaterSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheaterSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheaterSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheaterSeats().setVisible(true);
                
            }
        });
    
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel F;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JToggleButton a1;
    private javax.swing.JToggleButton a2;
    private javax.swing.JToggleButton a3;
    private javax.swing.JToggleButton a4;
    private javax.swing.JToggleButton a5;
    private javax.swing.JToggleButton a6;
    private javax.swing.JToggleButton a7;
    private javax.swing.JToggleButton a8;
    private javax.swing.JToggleButton b1;
    private javax.swing.JToggleButton b2;
    private javax.swing.JToggleButton b3;
    private javax.swing.JToggleButton b4;
    private javax.swing.JToggleButton b5;
    private javax.swing.JToggleButton b6;
    private javax.swing.JToggleButton b7;
    private javax.swing.JToggleButton b8;
    private javax.swing.JToggleButton c1;
    private javax.swing.JToggleButton c2;
    private javax.swing.JToggleButton c3;
    private javax.swing.JToggleButton c4;
    private javax.swing.JToggleButton c5;
    private javax.swing.JToggleButton c6;
    private javax.swing.JToggleButton c7;
    private javax.swing.JToggleButton c8;
    private javax.swing.JToggleButton d1;
    private javax.swing.JToggleButton d2;
    private javax.swing.JToggleButton d3;
    private javax.swing.JToggleButton d4;
    private javax.swing.JToggleButton d5;
    private javax.swing.JToggleButton d6;
    private javax.swing.JToggleButton d7;
    private javax.swing.JToggleButton d8;
    private javax.swing.JToggleButton e1;
    private javax.swing.JToggleButton e2;
    private javax.swing.JToggleButton e3;
    private javax.swing.JToggleButton e4;
    private javax.swing.JToggleButton e5;
    private javax.swing.JToggleButton e6;
    private javax.swing.JToggleButton e7;
    private javax.swing.JToggleButton e8;
    private javax.swing.JToggleButton f1;
    private javax.swing.JToggleButton f2;
    private javax.swing.JToggleButton f3;
    private javax.swing.JToggleButton f4;
    private javax.swing.JToggleButton f5;
    private javax.swing.JToggleButton f6;
    private javax.swing.JToggleButton f7;
    private javax.swing.JToggleButton f8;
    private javax.swing.JToggleButton g1;
    private javax.swing.JToggleButton g2;
    private javax.swing.JToggleButton g3;
    private javax.swing.JToggleButton g4;
    private javax.swing.JToggleButton g5;
    private javax.swing.JToggleButton g6;
    private javax.swing.JToggleButton g7;
    private javax.swing.JToggleButton g8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
