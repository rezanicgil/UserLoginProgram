package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UyeOlControl {
    UyeOlView view = new UyeOlView();

    UyeOlControl(UyeOlView view) {
        this.view = view;
        this.view.kaydetBtnListenerEkle(new kaydetBtnListener());
    }

    class kaydetBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showConfirmDialog(null, "Kaydi onayliyor musunuz?", "Onay Kutusu", JOptionPane.YES_NO_CANCEL_OPTION);

        }
    }
}
