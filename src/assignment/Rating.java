package assignment;


import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] movies = new String[4];
        double[] rating = new double[4];
        boolean found = false;
        System.out.println("enter the movie name");
        for (int i = 0; i < movies.length; i++) {
            movies[i] = sc.nextLine();
        }
        System.out.println("enter the rating");
        for (int i = 0; i < rating.length; i++) {
            rating[i] = sc.nextDouble();
        }
        double temp = rating[0];
        for (int i = 0; i < 4; i++) {

                if (rating[i] >= temp) {
                    temp = rating[i];
                    if (temp >= 4.0 && temp < 5.0) {
                        System.out.println("the movie" + " " + movies[i] + " which has highest rating" + " " + temp);

                    }

                }
            }
        }
    }
