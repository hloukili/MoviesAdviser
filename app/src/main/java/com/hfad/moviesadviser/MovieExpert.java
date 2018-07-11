package com.hfad.moviesadviser;

import java.util.ArrayList;
import java.util.List;

public class MovieExpert {
    List<String> getMovie(String spinner) {
        List<String> movie_result = new ArrayList<>();

         switch (spinner) {
            case "Horror":

                movie_result.add("Friday 13th");
                movie_result.add("Halloween");
                movie_result.add("Sinister");
                movie_result.add("Chucky");
                break;


            case "Thriller":

                movie_result.add("Inception");
                movie_result.add("Seven");
                movie_result.add("Gone Girl");
                movie_result.add("Shutter Island");
                break;


            case "S-F":

                movie_result.add("Interstellar");
                movie_result.add("Star Wars");
                movie_result.add("Matrix");
                movie_result.add("2001");
            break;


            case "Action":

                movie_result.add("Men In black");
                movie_result.add("Rocky");
                movie_result.add("La course aux jouets");
                movie_result.add("Commando");
                break;

        }

        return movie_result;
    }

}