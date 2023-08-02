package Application;

import entities.Contribuidores;
import entities.Fisica;
import entities.Juridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuidores> list = new ArrayList<Contribuidores>();

        System.out.println("entre com o numero de contribuidores: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println("contribuidor "+ (i+1) + "# :");
            System.out.println("contribuidor fisico ou juridico? (F/J)");
            char ch = sc.next().charAt(0);
            System.out.println("nome: " );
            String nome = sc.nextLine();
            System.out.println("renda anual: " );
            double impostoAnual = sc.nextDouble();
            System.out.println("gastos com saúde: ");
            if (ch == 'f'){

                double gastosSaude = sc.nextDouble();
                list.add(new Fisica(nome,impostoAnual,gastosSaude));
            }
            else{
                int numeroDeEmpregados = sc.nextInt();
                list.add(new Juridica(nome,impostoAnual,numeroDeEmpregados));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Contribuidores c : list) {
            System.out.println(c.getNome() + ": $ " + String.format("%.2f", c.taxa()));
        }

        System.out.println();
        double sum = 0.0;
        for (Contribuidores c : list) {
            sum += c.taxa();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));






        sc.close();
    }
}
