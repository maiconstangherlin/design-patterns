package builder;

import java.time.LocalDate;

public class app {

    public static void main(String[] args) {

        Pearson pearson = new Pearson.Builder()
                .name("Maicon")
                .birthDate(LocalDate.of(1993,6,15))
                .addNameParents("Father", "Mother", "Sister")
                .addDocument("Passaport", "12345")
                .addDocument("CPF", "000111")
                .build();

        System.out.println(pearson.toString());
    }

}
