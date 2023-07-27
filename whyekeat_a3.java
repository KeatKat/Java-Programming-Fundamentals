//Name: Foo Whye Keat
//FT
//Tutorial: T02F
//Student no.: 7432628
//Declaration: This work is done by me and no one else

import java.sql.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Country
{
    private String name,player;
    private int age;

    public Country()
    {

    }

    //other constructor
    public Country(String name, String player, int age)
    {
        this.name = name;
        this.player = player;
        this.age = age;
    }

    //Accessor methods
    public String getName()
    {
        return name;
    }
    public String getPlayer()
    {
        return player;
    }

    public int getAge()
    {
        return age;
    }

    //Mutator method
    public void setInfo(String name, String player, int age)
    {
        this.name = name;
        this.player = player;
        this.age = age;
    }
}

class Diving
{   //constant judge size of 7
    private static int SIZE = 7;
    private Country name;
    private double[] score;
    private double difficulty;
    private double cf;
    private double fs;

    public Diving()
    {

    }

    public Diving(Country name, double[]score,double difficulty, double cf)
    {
        this.name = name;
        this.score = score;
        this.difficulty = difficulty;
        this.cf = cf;
        getSortedList();
    }

    //Accessor methods
    public Country getCountry()
    {
        return name;
    }

    public double getDifficulty()
    {
        return difficulty;
    }

    public double[] getScores(){return score;}

    public double getCarriedForward()
    {
        return cf;
    }

    public double getFinalScore()
    {
        return fs;
    }

    //mutator methods
    public void setDifficulty(double difficulty)

    {
        this.difficulty = difficulty;
    }
    public void setScores(double[]score){this.score = score;}

    //other methods
    //adding all the scores from the judges into an array list
    public ArrayList<Double> getSortedList()
    {
        ArrayList<Double> sortedScore = new ArrayList();


        for(int index = 0; index < SIZE; index++)
        {
            sortedScore.add(index,score[index]); //adding the randomized scores from scores into the sorted score array list

        }
        //sort the scores in ascending order
        Collections.sort(sortedScore);
        return sortedScore;
    }

    public double highest()
    {
        return getSortedList().get(6);
    }

    public double secondHighest()
    {
        return getSortedList().get(5);
    }

    public double lowest()
    {
        return getSortedList().get(0);
    }

    public double secondLowest()
    {
        return getSortedList().get(1);
    }

    public double finalScore()
    {   //final score will be the scores minus the outliers added together. was actually no need to the highest,second highest...methods
        double fscore = ((getSortedList().get(2) + getSortedList().get(3) + getSortedList().get(4)))*getDifficulty();
        return fscore;
    }

    public double getTotalScore()
    {
        return finalScore() + getCarriedForward();
    }

    public void displayInfo()
    {   //displaying the country object elements with get difficulty got the gameinfo method
        System.out.printf("%-10s %15s %5s %15s%n", name.getName(), name.getPlayer(), name.getAge(), getDifficulty());
    }


}

class whyekeat_a3
{   //String of fixed countries
    static final String[] Countries = {"America","China","Japan","Singapore","Korea","Brazil","Russia","Malaysia","India","Austria"};

    public static void getScore(double[]score)
    {

        //an array of the possible scores totals to 21 elements
        double[] range = {0.0,0.5,1.0,1.5,2.0,2.5,3.0,3.5,4.0,4.5,5.0,5.5,
                6.0,6.5,7.0,7.5,8.0,8.5,9.0,9.5,10.0};

        //randomizing 7 scores for the judges then putting the range score into the score array
        for(int i =0; i<7;i++)
        {
        int a =(int)(Math.random()*21);
        score[i] = range[a];
        }
    }


    public static void displaySortedList(ArrayList<Diving> alist)
    {
        //Descending sort of the element final score using a comparator
        //comparator allows me to specifically compare an element in an object which allows me to sort it accoring to that
        Collections.sort(alist, new Comparator<Diving>() {
            @Override
            public int compare(Diving o1, Diving o2) {
                return Double.valueOf(o2.getTotalScore()).compareTo(o1.getTotalScore()); //sorting by getTotalScore
            }
        });

        System.out.println("\nThe results is");
        //displaying sorted scores
        int k =0;
        for(int i =0;i<10;i++)
        {   k = ++k;
            System.out.printf("%-5d %-10s %10.2f%n",k,alist.get(i).getCountry().getName(), alist.get(i).getTotalScore());
        }




    }


    public static double getDifficulty()
    {   //decimal format allows me to choose what decimal point i want my double to be rounded to.
        DecimalFormat df = new DecimalFormat("0.0");
        double a = Math.random()*4+2.0;
        String format = df.format(a);
        //i have to use a parse as the format changes it into a string
        double b = Double.parseDouble(format);
        return b;

    }

    public static int getAge()
    {
        return (int)(Math.random()*16 + 15);
    }

    public static void displayGameinfo(ArrayList<Diving>alist)
    {   //print out the header or the game info
        System.out.printf("%-10s %15s %5s %15s%n","Country", "Diver","Age", "Difficulty");
        //for every object, display the info
       for (int i=0; i<10;i++)
       {
           alist.get(i).displayInfo();
       }

    }

    public static void displayResultInfo(ArrayList<Diving>alist)
    {
        System.out.printf("%-10s %10s %5s %5s %5s %5s %5s %5s %12s %6s %10s %7s%n", "Countries", "J1", "J2","J3","J4","J5","J6","J7","Difficulty","c/f", "Current", "Total" );
        //using outer for loop to display country name
        for(int i=0; i<10; i++)
        {
            System.out.printf("%-10s",alist.get(i).getCountry().getName());
            //using inner for loop to display the scores associated with the country name
            for(int j= 0; j<=i; j++)
            {   if(j==i)
            {
                //taking out the score array so that i can access each element individually
                double[] storage = alist.get(i).getScores();
                //displaying each countries results
                System.out.printf("%12s %5s %5s %5s %5s %5s %5s %11s %8.2f %7.2f %9.2f%n",storage[0],storage[1],storage[2],storage[3],storage[4],storage[5],storage[6],alist.get(i).getDifficulty(),alist.get(i).getCarriedForward(),alist.get(i).finalScore(),alist.get(i).getTotalScore());
            }


            }
        }
    }

    public static void CFArray(ArrayList<Diving> alist, double[]cfArray)
    {   //adding in all the updated scores into cfArray using a for loop
        for(int i =0; i<10;i++)
        {
            cfArray[i] += alist.get(i).finalScore();

        }

    }



    public static void main(String[]args)
    {  //Creating new arraylist game
       ArrayList<Diving> game = new ArrayList();
       double[] cf = new double[10];
       // int k for counting the names
        int k =0;
        String[] name = {"Name 1","Name 2","Name 3","Name 4","Name 5","Name 6","Name 7","Name 8","Name 9","Name 10"};

        for(int i=1; i<6; i++) {
            //generating and displaying the countries, divers, age and difficulty, for loop for 10 repetitions
            System.out.println("Round: " + i);
            System.out.println("Starting position\n");
            for (int x = 0; x < 10; x++) {
                double[] score = new double[7];
                getScore(score);
                k = ++k;
                int age = getAge();

                //creating new country object
                Country obj1 = new Country(Countries[x], name[x], age);
                Diving obj2 = new Diving(obj1, score, getDifficulty(), cf[x]);
                //adding all the information in the diving object in the arraylist
                game.add(x, obj2);

            }
            CFArray(game, cf);


            displayGameinfo(game);
            System.out.println();
            displayResultInfo(game);
            displaySortedList(game);
            System.out.println();
        }













    }
}