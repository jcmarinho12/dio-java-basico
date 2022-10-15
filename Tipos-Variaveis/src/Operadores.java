public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        int numero = 5;
        //X repeticao
        numero++;
        //numero = numero + 1;
        
        System.out.println(numero);

    }

    public static void main(String[] args) {
        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);
    }

    public static void main(String[] args) {

    int a, b;

    a = 6;
    b = 6;
    String resultado = a==b ?"verdadeiro" : "falso";
  

        System.out.println(resultado);

    }

    public static void main(String[] args) {

        String nomeUm = "JOAOCARLOS";
        String nomeDois = new String("JOAOCARLOS");

        System.out.println(nomeUm.equals(nomeDois));



        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior numeroDois? " + simNao);
    }


    public static void main(String[] args) {

        boolean condicao1 = true;

        boolean condicao2 = true;

        if(condicao1 && 7 > 4 ) {
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeiras");
        }

        System.out.println("fim");

    }

}
