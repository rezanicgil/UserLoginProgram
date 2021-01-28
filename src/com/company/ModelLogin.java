package com.company;

import javax.swing.text.View;

public class ModelLogin {

    ViewLogin view = new ViewLogin();
    boolean x;
    public boolean getGuvenlikSonucu()
    {
        int a =  view.x;
        int b = view.y;
        int toplam = view.x + view.y;

        x = (boolean) (toplam == view.cevap);

        return x;
    }


}
