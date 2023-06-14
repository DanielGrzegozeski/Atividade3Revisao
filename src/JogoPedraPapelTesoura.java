import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JogoPedraPapelTesoura extends JFrame{
    private JComboBox comboBox1;
    public JPanel jogoPedraPapel;
    private JButton jogarButton;
    private JTextField textField1;
    private JRadioButton pedraRadioButton;
    private JRadioButton papelRadioButton;
    private JRadioButton tesouraRadioButton;





public JogoPedraPapelTesoura() {

    comboBox1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {




    };
});
    jogarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            Random random = new Random();
            int numeroAleatorio = random.nextInt(3);

            if(comboBox1.getSelectedIndex()  == 0){
                if (numeroAleatorio == 0){
                    JOptionPane.showMessageDialog(null,"Empate!");
                    textField1.setText("Pedra");
                }
                else if (numeroAleatorio == 1){
                    JOptionPane.showMessageDialog(null,"Perdeu!");
                    textField1.setText("Papel");
                }else if(numeroAleatorio == 2){
                    JOptionPane.showMessageDialog(null,"Venceu!");
                    textField1.setText("Tesoura");
                }}


                else if(comboBox1.getSelectedIndex()  == 1){
                    if (numeroAleatorio == 1){
                        JOptionPane.showMessageDialog(null,"Empate!");
                        textField1.setText("Papel");
                    }
                    else if (numeroAleatorio == 2){
                        JOptionPane.showMessageDialog(null,"Perdeu!");
                        textField1.setText("Tesoura");
                    }else {
                        JOptionPane.showMessageDialog(null,"Venceu!");
                        textField1.setText("Pedra");
                    }}

                    else if(comboBox1.getSelectedIndex()  == 2){
                    if (numeroAleatorio == 2){
                        JOptionPane.showMessageDialog(null,"Empate!");
                        textField1.setText("Tesoura");
                    }
                    else if (numeroAleatorio == 0){
                        JOptionPane.showMessageDialog(null,"Perdeu!");
                        textField1.setText("Pedra");
                    }else {
                        JOptionPane.showMessageDialog(null,"Venceu!");
                        textField1.setText("Papel");
                    }
            }
        }
    });
}}
