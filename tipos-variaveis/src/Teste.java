public class Teste {
    public static void main(String[] args) {
        int numeroNormal = 10000; // Um número do tipo int
        short numeroCurto = 5000; // Um número do tipo short

        // Casting explícito de int para short
        short numeroCurto2 = (short) numeroNormal;

        System.out.println("Número int: " + numeroNormal);
        System.out.println("Número short sem casting: " + numeroCurto);
        System.out.println("Número short com casting: " + numeroCurto2);
    }
}

// Em Java, quando você atribui um valor de um tipo maior para um tipo menor (por exemplo, de int para short),
 //é necessário fazer uma conversão explícita para evitar a perda de dados. Isso é conhecido como casting. O 
 //casting informa ao compilador que você está ciente da possível perda de precisão e que a operação é intencional.
