package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class UyeOlView extends JFrame {
    Container mainFrame;
    JLabel adLbl;
    JLabel soyadLbl;
    JLabel telefonLbl;
    JLabel emailLbl;
    JLabel usernameLbl;
    JLabel passwordLbl;

    JTextField adTxtField;
    JTextField soyadTxtField;
    JTextField telefonTxtField;
    JTextField emailTxtField;
    JTextField usernameTxtField;
    JTextField passwordTxtField;
    JButton kaydetBtn;

    UyeOlView() {
        super("Uyelik Formu");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame = this.getContentPane();
        mainFrame.setLayout(new FlowLayout(FlowLayout.LEADING, 126, 15));

        adLbl = new JLabel("Ad");
        soyadLbl = new JLabel("Soyad");
        telefonLbl = new JLabel("Telefon no");
        emailLbl = new JLabel("E-mail ");
        adLbl.setHorizontalAlignment(JLabel.CENTER);
        soyadLbl.setHorizontalAlignment(JLabel.CENTER);
        telefonLbl.setHorizontalAlignment(JLabel.CENTER);
        emailLbl.setHorizontalAlignment(JLabel.CENTER);
        adLbl.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        soyadLbl.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        telefonLbl.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        emailLbl.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        usernameLbl = new JLabel("Kullanici adi");
        usernameLbl.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        usernameLbl.setHorizontalAlignment(JLabel.CENTER);
        passwordLbl = new JLabel("Sifre");
        passwordLbl.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        passwordLbl.setHorizontalAlignment(JLabel.CENTER);

        adTxtField = new JTextField(15);
        adTxtField.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        soyadTxtField = new JTextField(15);
        soyadTxtField.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        telefonTxtField = new JTextField(15);
        telefonTxtField.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        emailTxtField = new JTextField(15);
        emailTxtField.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));

        usernameTxtField = new JTextField(15);
        usernameTxtField.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        passwordTxtField = new JTextField(15);
        passwordTxtField.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        kaydetBtn = new JButton("Kaydet");
        kaydetBtn.setPreferredSize(new Dimension(180,50));
        kaydetBtn.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));

        mainFrame.add(adLbl);
        mainFrame.add(adTxtField);
        mainFrame.add(soyadLbl);
        mainFrame.add(soyadTxtField);
        mainFrame.add(telefonLbl);
        mainFrame.add(telefonTxtField);
        mainFrame.add(emailLbl);
        mainFrame.add(emailTxtField);
        mainFrame.add(usernameLbl);
        mainFrame.add(usernameTxtField);
        mainFrame.add(passwordLbl);
        mainFrame.add(passwordTxtField);
        mainFrame.add(kaydetBtn);

        this.setSize(480, 630);
        this.setLocationRelativeTo(null);


    }
    public void kaydetBtnListenerEkle(ActionListener e)
    {
        kaydetBtn.addActionListener(e);
    }

}
