package calculadora.visual;
    import javax.swing.*;
    import java.awt.*;
public class Objects extends JFrame{
    private JFrame frame_Tela = new JFrame();
    
    private JPanel panel_Operacoes = new JPanel();
    
    private JLabel txt_ShowResult = new JLabel("null");
    
    private JButton bttn_Num1 = new JButton("1");
    private JButton bttn_Num2 = new JButton("2");
    private JButton bttn_Num3 = new JButton("3");
    private JButton bttn_Num4 = new JButton("4");
    private JButton bttn_Num5 = new JButton("5");
    private JButton bttn_Num6 = new JButton("6");
    private JButton bttn_Num7 = new JButton("7");
    private JButton bttn_Num8 = new JButton("8");
    private JButton bttn_Num9 = new JButton("9");
    private JButton bttn_Num0 = new JButton("0");
    
    private JButton bttn_Adicao = new JButton("+");
    private JButton bttn_Subtracao = new JButton("-");
    private JButton bttn_Multi = new JButton("x");
    private JButton bttn_Divi = new JButton("÷");
    
    private JButton bttn_Apagar = new JButton("⌫");
    private JButton bttn_ClearAll = new JButton("C");
    private JButton bttn_Result = new JButton("=");
    private JButton bttn_Dot = new JButton(".");
    private JButton bttn_Porcent = new JButton("%");
    private JButton bttn_ChangeMode = new JButton("☾");
    
    //Arrays
    
    private JButton[] operacoes = new JButton[]{bttn_Adicao, bttn_Subtracao, bttn_Multi, bttn_Divi};
    private JButton[] numbers = new JButton[]{bttn_Num1, bttn_Num2, bttn_Num3, bttn_Num4, bttn_Num5, bttn_Num6, bttn_Num7, bttn_Num8, bttn_Num9, bttn_Num0};
    private JButton[] functions = new JButton[]{bttn_Apagar, bttn_ClearAll, bttn_Result, bttn_Dot, bttn_Porcent, bttn_ChangeMode};
    
    //getters

    public JFrame getFrame_Tela() {
        return frame_Tela;
    }

    public JPanel getPanel_Operacoes() {
        return panel_Operacoes;
    }

    public JLabel getTxt_ShowResult() {
        return txt_ShowResult;
    }

    public JButton getBttn_Num1() {
        return bttn_Num1;
    }

    public JButton getBttn_Num2() {
        return bttn_Num2;
    }

    public JButton getBttn_Num3() {
        return bttn_Num3;
    }

    public JButton getBttn_Num4() {
        return bttn_Num4;
    }

    public JButton getBttn_Num5() {
        return bttn_Num5;
    }

    public JButton getBttn_Num6() {
        return bttn_Num6;
    }

    public JButton getBttn_Num7() {
        return bttn_Num7;
    }

    public JButton getBttn_Num8() {
        return bttn_Num8;
    }

    public JButton getBttn_Num9() {
        return bttn_Num9;
    }

    public JButton getBttn_Num0() {
        return bttn_Num0;
    }

    public JButton getBttn_Adicao() {
        return bttn_Adicao;
    }

    public JButton getBttn_Subtracao() {
        return bttn_Subtracao;
    }

    public JButton getBttn_Multi() {
        return bttn_Multi;
    }

    public JButton getBttn_Divi() {
        return bttn_Divi;
    }

    public JButton getBttn_Apagar() {
        return bttn_Apagar;
    }

    public JButton getBttn_ClearAll() {
        return bttn_ClearAll;
    }

    public JButton getBttn_Result() {
        return bttn_Result;
    }

    public JButton[] getOperacoes() {
        return operacoes;
    }

    public JButton[] getNumbers() {
        return numbers;
    }

    public JButton[] getFunctions() {
        return functions;
    }
    
}
