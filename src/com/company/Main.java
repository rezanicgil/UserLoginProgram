package com.company;

public class Main {

    public static void main(String[] args) {
        ViewLogin view = new ViewLogin();
        ModelLogin model = new ModelLogin();
        UyeOlView view2 = new UyeOlView();
        UyeOlControl controlUye = new UyeOlControl(view2);
        ControllerLogin control = new ControllerLogin(view, model,view2);
        view.setVisible(true);


    }
}
