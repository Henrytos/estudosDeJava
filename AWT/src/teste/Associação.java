package teste;
import java.awt.*;

class Associação extends Frame{
    Label title,text1 , text2;
    Associação() {
        title = new Label();
        text1=new Label();
        text2=new Label();

        title.setText("2-Desenvolvimento Sitemas");
        text1.setText("Henry Franz Ramos Arcaya");
        text2.setText("Gabrielly");

        title.setBounds(10,40,300,10);
        text1.setBounds(10, 60, 300, 10);
        text2.setBounds(10, 80, 300, 10);

        add(title);
        add(text1);
        add(text2);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setTitle("Exemplo de GUI/AWT por associação");
    }
    public static void main(String args[]){
        new Associação();
    }
}