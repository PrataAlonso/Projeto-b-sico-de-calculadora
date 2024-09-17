package calculadora.visual;
    import javax.swing.*;
    import java.awt.*;
    import calculadora.actions.Actions;
public class Attributes extends Actions{
    Font fonte = new Font("fonte", Font.BOLD, 18);
    
    public Attributes(){
        tela();
        numbers();
        operacoes();
        functions();
        showResult();
        panel();
    }
    
    private void tela(){
        getFrame_Tela().add(getTxt_ShowResult());
        getFrame_Tela().add(getPanel_Operacoes());
        
    }
    
    private void panel(){
        getPanel_Operacoes().setBounds(0, 130, 500, 350);
        getPanel_Operacoes().setBackground(getFrame_Tela().getBackground());
        getPanel_Operacoes().setLayout(null);
        
        for (int i = 0; i < getOperacoes().length; i++) {
            getPanel_Operacoes().add(getOperacoes()[i]);
        }
        for (int i = 0; i < getNumbers().length; i++) {
            getPanel_Operacoes().add(getNumbers()[i]);
        }
        for (int i = 0; i < getFunctions().length; i++) {
            getPanel_Operacoes().add(getFunctions()[i]);
        }
    }
    
    private void numbers(){
        getNumbers()[0].setBounds(10,60,60,40);
        getNumbers()[1].setBounds(80,60,60,40);
        getNumbers()[2].setBounds(150,60,60,40);
        getNumbers()[3].setBounds(10,110,60,40);
        getNumbers()[4].setBounds(80,110,60,40);
        getNumbers()[5].setBounds(150,110,60,40);
        getNumbers()[6].setBounds(10,160,60,40);
        getNumbers()[7].setBounds(80,160,60,40);
        getNumbers()[8].setBounds(150,160,60,40);
        getNumbers()[9].setBounds(80,210,60,40);
        
        for (int i = 0; i < getNumbers().length; i++) {
            getNumbers()[i].setFont(fonte);
            getNumbers()[i].setBorder(BorderFactory.createEmptyBorder());
        }
    }
    
    private void operacoes(){
        getOperacoes()[0].setBounds(220,160,60,40);
        getOperacoes()[1].setBounds(220,110,60,40);
        getOperacoes()[2].setBounds(220,60,60,40);
        getOperacoes()[3].setBounds(220,10,60,40);
        
        for (int i = 0; i < getOperacoes().length; i++) {
            getOperacoes()[i].setFont(fonte);
            getOperacoes()[i].setBorder(BorderFactory.createEmptyBorder());
        }
    }
    
    private void functions(){
        getFunctions()[0].setBounds(80,10,60,40);
        getFunctions()[1].setBounds(10,10,60,40);
        getFunctions()[2].setBounds(220,210,60,40);
        getFunctions()[3].setBounds(150,210,60,40);
        getFunctions()[4].setBounds(150,10,60,40);
        getFunctions()[5].setBounds(10,210,60,40);
        
        for (int i = 0; i < getFunctions().length; i++) {
            getFunctions()[i].setFont(fonte);
            getFunctions()[i].setBorder(BorderFactory.createEmptyBorder());
        }
    }
    
    private void showResult(){
        getTxt_ShowResult().setBounds(5, 55, 280, 70);
        getTxt_ShowResult().setHorizontalAlignment(SwingConstants.RIGHT);
        getTxt_ShowResult().setBorder(BorderFactory.createLineBorder(Color.black));
        getTxt_ShowResult().setFont(new Font("fonte", Font.BOLD, 50));
    }
    
}
