package calculadora.visual;
    import javax.swing.*;
    import java.awt.*;
public class Run extends Attributes{
    private void tela(){
        getFrame_Tela().setSize(305,430);
        getFrame_Tela().setLayout(null);
        getFrame_Tela().setBackground(Color.white);
        getFrame_Tela().setLocationRelativeTo(null);
        getFrame_Tela().setDefaultCloseOperation(EXIT_ON_CLOSE);
        getFrame_Tela().setVisible(true);
    }
    public static void main(String[] args) {
        Run teste = new Run();
        teste.tela();
    }
}
