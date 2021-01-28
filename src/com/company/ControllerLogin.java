package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControllerLogin {
    ViewLogin view1;
    UyeOlView view2;
    ModelLogin model;
    User user = new User();
    boolean sonuc;
    ControllerLogin(ViewLogin view1, ModelLogin model1,UyeOlView view2) {
        this.view1 = view1;
        this.model = model1;
        this.view2 = view2;
        this.view1.onayBtnListenerEkle(new UsernameLoginListener());
        this.view1.uyeOlMouseListenerEkle(new MouseUyeOlListener());
    }

    class UsernameLoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String valueOfTxtPass = String.valueOf(view1.txtPassword.getPassword());
            String valueOfUserPass = String.valueOf(user.getPassword());
           String valueOfGuvenlikTahmin = view1.guvenlikCevap.getText();
           String valueOfGuvenlikCevap = String.valueOf(view1.x + view1.y);
           sonuc = valueOfGuvenlikCevap.equals(valueOfGuvenlikTahmin);
            if (valueOfTxtPass.equals(valueOfUserPass) && view1.txtUsername.getText().equals(user.getUsername()) && sonuc) {
                view1.lblInfo1.setText("Giris basarili!");
                view1.lblInfo1.setForeground(Color.GREEN);
                view1.lblInfo1.setFont(new Font("TimesNewRoman", Font.BOLD, 18));
                view1.lblRegistery.setText("");
                view1.lblInfo1.setHorizontalAlignment(JLabel.CENTER);

            } else {
                if (sonuc) {
                    view1.lblInfo1.setText("Kullanici adi veya sifre hatali!!");
                    view1.lblInfo1.setForeground(Color.red);
                    view1.lblInfo1.setFont(new Font("TimesNewRoman", Font.BOLD, 18));
                    view1.lblInfo1.setHorizontalAlignment(JLabel.CENTER);

                } else {
                    view1.lblInfo1.setText("Guvenlik sorusuna hatali cevap verdiniz. Tekrar deneyiniz.");
                    view1.lblInfo1.setForeground(Color.red);
                    view1.lblInfo1.setFont(new Font("TimesNewRoman", Font.BOLD, 18));
                    view1.lblInfo1.setHorizontalAlignment(JLabel.CENTER);


                }
            }


        }
    }

    class MouseUyeOlListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            view1.lblRegistery.setText("Loading...");
            view1.lblRegistery.setForeground(Color.black);

            view1.setVisible(false);
            view2.setVisible(true);


        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

}
