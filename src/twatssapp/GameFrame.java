/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twatssapp;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.WHITE;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class GameFrame extends JFrame {

    TAModel workingModel;

    public GameFrame(TAModel m) {
        workingModel = m;
        createWindow();
    }

    class MyButtons extends JButton {

        public MyButtons(String name, int fSize) {
            super(name);
            this.setFont(new Font("Tahoma", Font.PLAIN, fSize));
            this.setPreferredSize(new Dimension(40, 40));
            this.setBackground(BLUE);
            this.setForeground(Color.WHITE);
        }
    }

    class MyLabels extends JLabel {

        public MyLabels(String name, int fsize) {
            super(name, SwingConstants.CENTER);
            this.setFont(new Font("Tahoma", Font.BOLD, fsize));
        }
    }

    class MyPanel extends JPanel {

        public MyPanel() {
            super();
            this.setBackground(WHITE);
        }
    }

    private void createWindow() {

        MyPanel mainPanel = new MyPanel();
        mainPanel.setPreferredSize(new Dimension(300, 300));
        mainPanel.setLayout(new BorderLayout());
        this.add(mainPanel);

        MyLabels title = new MyLabels("TW@SS", 30);
        mainPanel.add(title, BorderLayout.NORTH);

        final MyTableModel scoreModel = new MyTableModel(workingModel.currentUserGroup);
        final JTable hScoreTable = new JTable(scoreModel);
        hScoreTable.setRowHeight(50);
        hScoreTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        hScoreTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        hScoreTable.setFont(new Font("Tahoma", Font.PLAIN, 30));
        //DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        //rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        //hScoreTable.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        //hScoreTable.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        mainPanel.add(hScoreTable, BorderLayout.CENTER);

        MyButtons scoreButton = new MyButtons("Score", 20);
        mainPanel.add(scoreButton, BorderLayout.SOUTH);
        
        scoreButton.addActionListener((ActionEvent e) -> {
            workingModel.currentUser.scorePoint();
            scoreModel.scoreAdded(workingModel.currentUser);
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
