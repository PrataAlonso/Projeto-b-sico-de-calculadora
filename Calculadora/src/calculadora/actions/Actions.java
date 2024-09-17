package calculadora.actions;
    import calculadora.visual.Objects;
    import java.util.ArrayList;
    import java.util.List;
    import java.text.DecimalFormat;
    import java.awt.event.*;
public class Actions extends Objects{
    private static String tela, num = "";
    private static int number, j = 0, clicks = 0;
    private static boolean check = false;
    private DecimalFormat df = new DecimalFormat();
    
    private List<String> lista = new ArrayList();
    private List<String> listaResult = new ArrayList();
    public Actions(){
        numbers();
        operacoes();
        functions();
    }
    
    private void numbers(){
        getNumbers()[0].addActionListener(e ->{
            number = 1;
            tela = Integer.toString(number);
            setTelaNum(tela);
        });
        
        getNumbers()[1].addActionListener(e ->{
            number = 2;
            tela = Integer.toString(number);
            setTelaNum(tela);
        });
        
        getNumbers()[2].addActionListener(e ->{
            number = 3;
            tela = Integer.toString(number);
            setTelaNum(tela);
        });
        
        getNumbers()[3].addActionListener(e ->{
            number = 4;
            tela = Integer.toString(number);
            setTelaNum(tela);
        });
        
        getNumbers()[4].addActionListener(e ->{
            number = 5;
            tela = Integer.toString(number);
            setTelaNum(tela);
        });
        
        getNumbers()[5].addActionListener(e ->{
            number = 6;
            tela = Integer.toString(number);
            setTelaNum(tela);
        });
        
        getNumbers()[6].addActionListener(e ->{
            number = 7;
            tela = Integer.toString(number);
            setTelaNum(tela);
        });
        
        getNumbers()[7].addActionListener(e ->{
            number = 8;
            tela = Integer.toString(number);
            setTelaNum(tela);
        });
        
        getNumbers()[8].addActionListener(e ->{
            number = 9;
            tela = Integer.toString(number);
            setTelaNum(tela);
        });
        
        getNumbers()[9].addActionListener(e ->{
            number = 0;
            tela = Integer.toString(number);
            setTelaNum(tela);
        });
    }
    
    private void operacoes(){
        getOperacoes()[0].addActionListener(e ->{
            setTelaNum("+");
        });
        
        getOperacoes()[1].addActionListener(e ->{
            setTelaNum("-");
        });
        
        getOperacoes()[2].addActionListener(e ->{
            setTelaNum("x");
        });
        
        getOperacoes()[3].addActionListener(e ->{
            setTelaNum("÷");
        });
        
        getFunctions()[3].addActionListener(e ->{
            setTelaNum(".");
        });
    }
    
    private void functions(){
        getFunctions()[0].addActionListener(e ->{ //apagar
            if (lista.isEmpty()){
                getTxt_ShowResult().setText("null");
                j--;
            }
            else{
                lista.remove(lista.size() - 1);
                for (int i = 0; i < lista.size(); i++) {
                    if (i == 0){
                        getTxt_ShowResult().setText(lista.get(i));
                        j--;
                    }
                    else{
                        getTxt_ShowResult().setText(getTxt_ShowResult().getText() + lista.get(i));
                        j--;
                    }
                }
            }
        });
        
        getFunctions()[1].addActionListener(e ->{ //apagar tudo
            lista.clear();
            getTxt_ShowResult().setText("null");
            j = 0;
            getFunctions()[0].setEnabled(true);
        });
        
        getFunctions()[2].addActionListener(e ->{ //igual
            ArrayList<String> listaEspelho = new ArrayList(lista);
            lista.clear();
            
            for (int i = 0; i < listaEspelho.size(); i++) {
                join(listaEspelho.get(i));
                if (i == listaEspelho.size() - 1){
                    lista.add(num);
                    num = "";
                }
            }
            for (int i = 0; i < lista.size()-1; i++) {
                String split = lista.get(i);
                double plus, minus, by, divi;
                switch (split){
                    case "x":
                        by = Double.parseDouble(lista.get(i-1)) * Double.parseDouble(lista.get(i+1));
                        setOperacoes(i,Double.toString(by));
                        i = 0;
                        break;
                    case "÷":
                        if (lista.get(i-1).equalsIgnoreCase("0") | lista.get(i+1).equalsIgnoreCase("0")){
                            getTxt_ShowResult().setText("ERRO");
                            lista.clear();
                            j = 0;
                            break;
                        }
                        else{
                            divi = Double.parseDouble(lista.get(i-1)) / Double.parseDouble(lista.get(i+1));
                            setOperacoes(i,Double.toString(divi));
                            i = 0;
                            break;
                        }
                    case "+":
                        plus = Double.parseDouble(lista.get(i-1)) + Double.parseDouble(lista.get(i+1));
                        setOperacoes(i,Double.toString(plus));
                        i = 0;
                        break;
                    case "-":
                        minus = Double.parseDouble(lista.get(i-1)) - Double.parseDouble(lista.get(i+1));
                        setOperacoes(i,Double.toString(minus));
                        i = 0;
                        break;
                }
            }
            if (lista.get(lista.size()-1).contains(".0")){
                df.setGroupingUsed(false);
                
                double result = Double.parseDouble(lista.get(lista.size()-1));
                getTxt_ShowResult().setText(df.format(result));
                lista.clear();
                getFunctions()[0].setEnabled(false);
            }
            else{
                getTxt_ShowResult().setText(lista.get(lista.size()-1));
                lista.clear();
                getFunctions()[0].setEnabled(false);
            }
        });
        
        getFunctions()[4].addActionListener(e ->{ //porcent
            setPorcent();
        });
    }
    
    private void setTelaNum(String i){
        if (getTxt_ShowResult().getText().equalsIgnoreCase("null")){
            
            lista.add(i);
            j++;
            getTxt_ShowResult().setText(i);
        } else{
                if (i.equals("+") & lista.get(j-1).equals("+")){
                    check = true;
                }
                else if (i.equals("-") & lista.get(j-1).equals("-")){
                    check = true;
                }
                else if (i.equals("x") & lista.get(j-1).equals("x")){
                    check = true;
                }
                else if (i.equals("÷") & lista.get(j-1).equals("÷")){
                    check = true;
                }
                else if (i.equals(".") & lista.get(j-1).equals(".")){
                    check = true;
                }
                else{
                    lista.add(i);
                    j++;
                    getTxt_ShowResult().setText(getTxt_ShowResult().getText() + i);
                }
                
        }
    }
    
    private void setOperacoes(int index, String n){
        lista.set(index, n);
        lista.remove(index - 1);
        lista.remove(index);
        j -= 2;
    }
    
    private void setPorcent(){
        double num = Double.parseDouble(lista.get(lista.size() - 1)) / 100;
        String newNum = Double.toString(num);
        
        lista.set(lista.size() - 1, newNum);
        
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (i == 0){
                getTxt_ShowResult().setText(lista.get(i));
            }
            else{
                getTxt_ShowResult().setText(getTxt_ShowResult().getText() + lista.get(i));
            }
        } 
    }
    
    private void join(String n){
        if (n.equals("+") | n.equals("-") | n.equals("x") | n.equals("÷")){
            lista.add(num);
            lista.add(n);
            num = "";
        }
        else{
            num += n;
        }
        
    }
}
