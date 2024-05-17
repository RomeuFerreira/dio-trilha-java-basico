public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        int numero = 1;
        numero = 99;
        final double VALOR_DE_PI = 3.14; 
        // o final transfoma o valor imutável
        String meuNome= "Romeu";


        System.out.println(meuNome);
    }
}
