package teste;

import java.awt.*;
public class herança extends Frame {
    herança() {
        setSize(300, 300);
        setTitle("Exemplo de GUI/AWT com herança");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        herança f = new herança();
        Label l1, l2,title;

        title =new Label("2-Desenvolvimento Sistemas");
        l1 = new Label("Henry Franz Ramos Arcaya");
        l2 = new Label("Gabrielly Hidani Namie");

        title.setBounds(10, 50, 300, 10);
        l1.setBounds(10, 70, 300, 10);
        l2.setBounds(10, 90, 300, 10);

        f.add(title);
        f.add(l1);
        f.add(l2);
    }
}