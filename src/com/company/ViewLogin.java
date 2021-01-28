package com.company;

import javafx.geometry.HorizontalDirection;

import javax.swing.*;
import javax.xml.stream.Location;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Random;

public class ViewLogin extends JFrame {
    JLabel lblUsername;
    JLabel lblPassword;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JLabel lblInfo1;
    JLabel lblRegistery;
    JButton onayBtn;
    Container mainFrame;
    JLabel guvelikSorusuLbl;
    int x = 0;
    int y = 0;
    static int cevap;
    JTextField guvenlikCevap;
    Random rnd = new Random();

    ViewLogin() {

        super("Giris Penceresi");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame = this.getContentPane();
        mainFrame.setLayout(new BorderLayout());
        lblUsername = new JLabel("Kullanici adi:");
        txtUsername = new JTextField(15);
        lblPassword = new JLabel("Sifre:");
        txtPassword = new JPasswordField(15);

        onayBtn = new JButton("Giris Yap");

        lblUsername.setFont(new Font("TimesNewRoman", Font.BOLD, 18));
        txtUsername.setFont(new Font("TimesNewRoman", Font.BOLD, 18));
        lblPassword.setFont(new Font("TimesNewRoman", Font.BOLD, 18));
        txtPassword.setFont(new Font("TimesNewRoman", Font.BOLD, 18));

        onayBtn.setFont(new Font("TimesNewRoman", Font.BOLD, 18));
        onayBtn.setHorizontalAlignment(JButton.CENTER);
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5, 1));
        lblUsername.setHorizontalAlignment(JLabel.CENTER);
        lblPassword.setHorizontalAlignment(JLabel.CENTER);
        x = rnd.nextInt(37) + 1;
        y = rnd.nextInt(37) + 1;
        cevap = x + y;
        guvenlikCevap = new JTextField(15);
        guvenlikCevap.setFont(new Font("TimesNewRoman", Font.BOLD, 18));
        guvelikSorusuLbl = new JLabel("Guvenlik sorusu :   " + x + " + " + y + "  =  ?");
        guvelikSorusuLbl.setHorizontalAlignment(JLabel.CENTER);
        guvelikSorusuLbl.setFont(new Font("TimesNewRoman", Font.BOLD, 18));
        panel1.add(lblUsername);
        panel1.add(txtUsername);
        panel1.add(lblPassword);
        panel1.add(txtPassword);
        panel1.add(guvelikSorusuLbl);
        panel1.add(guvenlikCevap);

        panel1.add(new JPanel());
        panel1.add(onayBtn);


        JPanel panel2 = new JPanel();

        lblInfo1 = new JLabel("Lutfen kullanici adinizi ve sifrenizi giriniz. Uye degilseniz, uye olmak icin Uye Ol'a tiklayiniz.");
        lblInfo1.setFont(new Font("TimesNewRoman", Font.ITALIC, 15));
        lblRegistery = new JLabel("Uye ol");
        lblRegistery.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        lblRegistery.setForeground(Color.BLUE);
        lblRegistery.setHorizontalAlignment(JLabel.CENTER);
        panel2.setLayout(new GridLayout(3, 1));
        panel2.add(lblInfo1);
        panel2.add(lblRegistery);
        JPanel panel1x2 = new JPanel();
        panel1x2.setLayout(new BorderLayout());
        panel1x2.add(panel1, BorderLayout.NORTH);
        panel1x2.add(panel2, BorderLayout.CENTER);

        mainFrame.add(panel1x2);


        this.pack();
        this.setLocationRelativeTo(null);
    }

    public void onayBtnListenerEkle(ActionListener e) {
        onayBtn.addActionListener(e);
    }

    public void uyeOlMouseListenerEkle(MouseListener e) {
        lblRegistery.addMouseListener(e);
    }
}
