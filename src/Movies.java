import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class Movies {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<>();
        List<String> suggList = Arrays.asList("Bad Boys 2", "Pineapple Express", "Aladdin", "The Matrix");
        ArrayList<String> suggestions = new ArrayList<>();
        suggestions.addAll(suggList);

        String list = "";

        do {
            String sugg = suggestions.get((int) (Math.random() * suggestions.size()));
            System.out.println("Please Enter your favorite movies. They will be added to a list. Once your done, type \"q\".");
            System.out.println("I suggest you watch " + sugg + ". It's a great movie!");
            list = scanner.nextLine();

            for(int i = 0; i < list.length(); i++){
                list = list.toLowerCase();
            }


            movies.add(list);

            if(list.equalsIgnoreCase("q")){
                movies.remove("q");
                Collections.sort(movies);
                System.out.println(movies);
            }else{
                Collections.sort(movies);
                System.out.println(movies);
            }

        }while(!list.equalsIgnoreCase("q"));
    }
}
