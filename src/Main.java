import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JogoPedraPapelTesoura form = new JogoPedraPapelTesoura();

        form.setContentPane(form.jogoPedraPapel);
        form.setVisible(true);
        form.setSize(400,500);
    }
}
