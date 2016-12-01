
public class OperarPostPre {

//    PilaN operador = new PilaN();
//    PilaN operando = new PilaN();

    public boolean VerficarInfija(String infijo) {
        boolean Sies = false;
        int operadores = 0, operandos = 0;
        String[] infijoPila = infijo.replaceAll(" +", " ").trim().split(" ");
        for (String item : infijoPila) {
            if (esOperador(item)) {
                if (!item.equals("(") && !item.equals(")")) {
                    operadores++;
                }
            }
            if (esOperando(item)) {
                operandos++;
            }
        }
        if (operadores == operandos - 1) {
            Sies = true;
        }
        return Sies;
    }

    public boolean esOperando(String elemento) {
        boolean r = true;
        float valor = 0;
        try {
            valor = Float.parseFloat(elemento);
        } catch (Exception e) {
            r = false;
        }
        return r;
    }

    public boolean esOperador(String elemento) {
        boolean r = false;
        switch (elemento) {
            case "+":
            case "-":
            case "*":
            case "/":
            case "^":
            case "(":
            case ")":
                r = true;
                break;
        }
        return r;
    }
    
    public String cambiarAPreB(String infijo) {
        
        infijo = '(' + infijo ;
        int tamaño = infijo.length();
        Pila pilaResultado = new Pila(tamaño);
        Pila pilaAux = new Pila(tamaño);
        
        pilaAux.insertarPila(')');
        
        for (int i = tamaño-1; i > -1; i--) {
            
            char caracter = infijo.charAt(i);
            
            switch (caracter) {
            case ')':
                pilaAux.insertarPila(caracter);
                break;
            case '+':case '-':case '^':case '*':case '/':
                while (jerarquiaOperadores(caracter) > jerarquiaOperadores(pilaAux.nextPop()))
                    pilaResultado.insertarPila(pilaAux.eliminarPila());
                pilaAux.insertarPila(caracter);
                break;
            case '(':
                while (pilaAux.nextPop() != ')')
                    pilaResultado.insertarPila(pilaAux.eliminarPila());
                pilaAux.eliminarPila();
                break;
            default:
                pilaResultado.insertarPila(caracter);
            }
            
        }
        
        String resultado = "";
        //Conversion de la pila a string 
        for (int i = tamaño-1; i > -1; i--) {
            resultado += pilaResultado.eliminarPila();
        }
        return resultado;
    } 
    
    public Pila cambiarAPostB(String infijo) {
        
        infijo += ')';
        int tamaño = infijo.length();
        Pila pilaResultado = new Pila(tamaño);
        Pila pilaAux = new Pila(tamaño);
        
        pilaAux.insertarPila('(');
        
        for (int i = 0; i < tamaño; i++) {
            
            char caracter = infijo.charAt(i);
            
            switch (caracter) {
            case '(':
                pilaAux.insertarPila(caracter);
                break;
            case '+':case '-':case '^':case '*':case '/':
                while (jerarquiaOperadores(caracter) <= jerarquiaOperadores(pilaAux.nextPop()))
                    pilaResultado.insertarPila(pilaAux.eliminarPila());
                pilaAux.insertarPila(caracter);
                break;
            case ')':
                while (pilaAux.nextPop() != '(')
                    pilaResultado.insertarPila(pilaAux.eliminarPila());
                pilaAux.eliminarPila();
                break;
            default:
                pilaResultado.insertarPila(caracter);
            }
            
        }
        
        return pilaResultado;
    }
    
    public String resultadoPostFijo(String infijo){
        Pila p1 = cambiarAPostB(infijo);
        String text = "";
        while (p1.i > 0)
            text = p1.eliminarPila() + text;
        return text;
    }
    
    public static int jerarquiaOperadores(char elemento) {
        int res = 0;
        switch (elemento) {
        case ')':
            res = 5; break;
        case '^':
            res = 4; break;
        case '*': case '/':
            res = 3; break;
        case '+': case '-':
            res = 2; break;
        case '(':
            res = 1; break;
        }
        return res;
    }
}
