import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        int buritoNums = 0;
        ArrayList<String> result =  new ArrayList<String>();


        List<String> riceList = Arrays.asList("White Rice","Brown Rice","none","All Rice ");
        ArrayList<String> rice = new ArrayList<String>();
        rice.addAll(riceList);
        List<String> meatList = Arrays.asList("chicken","steak", "carnidas","chorizo","sofritas","veggies","none","all meats");
        ArrayList<String> meat = new ArrayList<String>();
        meat.addAll(meatList);
        List<String> beanList = Arrays.asList("pinto" , "black", "none");
        ArrayList<String> bean = new ArrayList<String>();
        bean.addAll(beanList);
        List<String> salsaList = Arrays.asList("mild salsa","medium salsa", "hot salsa","none","all salsas");
        ArrayList<String> salsa = new ArrayList<String>();
        salsa.addAll(riceList);
        List<String> veggiesList = Arrays.asList("lettuce","fajita veggies","none","all veggies");
        ArrayList<String> veggie = new ArrayList<String>();
        veggie.addAll(veggiesList);
        List<String> YNList = Arrays.asList("yes","no");
        ArrayList<String> cheese = new ArrayList<String>();
        cheese.addAll(YNList);
        ArrayList<String> Guac = new ArrayList<String>();
        Guac.addAll(YNList);
        ArrayList<String> queso = new ArrayList<String>();
        queso.addAll(YNList);
        ArrayList<String> sourCream = new ArrayList<String>();
        sourCream.addAll(YNList);
        List<String>[] arrayOfList = new List[9];
        ArrayList<ArrayList<String>> aList = new ArrayList<>();
        aList.add(rice);
        aList.add(meat);
        aList.add(bean);
        aList.add(salsa);
        aList.add(veggie);
        aList.add(cheese);
        aList.add(Guac);
        aList.add(queso);
        aList.add(sourCream);



        while (buritoNums<25) {
            double price = 3.00;
            result.clear();
            int randNum10 = rand.nextInt(10);


               int randNum1 = rand.nextInt(rice.size());
                if (rice.get(randNum1).equalsIgnoreCase("none")) {
                    result.add("No Rice");
                } else {
                    result.add(rice.get(randNum1));
                    price = price + 0.5;
                }
                  int randNum2 = rand.nextInt(meat.size());
                 if (meat.get(randNum2).equalsIgnoreCase("none")) {
                    result.add("No Meat");
                     } else {
                    result.add(meat.get(randNum2));
                    price = price + 0.5;
                }
               int randNum3 = rand.nextInt(bean.size());
                    if (bean.get(randNum3).equalsIgnoreCase("none")) {
                    result.add("No bean");
                      } else {
                    result.add(bean.get(randNum3));
                    price = price + 0.5;
                }
                 int randNum4 = rand.nextInt(bean.size());
                  if (salsa.get(randNum4).equalsIgnoreCase("none")) {
                    result.add("No salsa");
                  } else {
                    result.add(salsa.get(randNum4));
                    price = price + 0.5;
                }
                 int randNum5 = rand.nextInt(veggie.size());
                  if (veggie.get(randNum5).equalsIgnoreCase("none")) {
                    result.add("No veggies");
                 } else {
                    result.add(veggie.get(randNum5));
                    price = price + 0.5;
                }
                 int randNum6 = rand.nextInt(cheese.size());
                    if (cheese.get(randNum6).equalsIgnoreCase("yes")) {
                    result.add("cheese");
                    price = price + 0.5;
                }
                int randNum7 = rand.nextInt(Guac.size());
                 if (Guac.get(randNum7).equalsIgnoreCase("yes")) {
                    result.add("Guac");
                    price = price + 0.5;
                }
                  int randNum8 = rand.nextInt(queso.size());
                if (queso.get(randNum8).equalsIgnoreCase("yes")) {
                    result.add("queso");
                    price = price + 0.5;
                }
                 int randNum9 = rand.nextInt(sourCream.size());
                if (sourCream.get(randNum9).equalsIgnoreCase("yes")) {
                    result.add("sour cream");
                    price = price + 0.5;
                }
                System.out.println("Burrito " + buritoNums + result + " " + price);
                buritoNums++;
            }
        }

    }


