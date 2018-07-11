package com.hfad.moviesadviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class FindMovieActivity extends Activity {
    private   MovieExpert movieExpert = new MovieExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_movie);

    }

        // Called when the user clicks the button.
        public void onClickFindMovie(View view) {


                  // Get a reference to the TextView
                  TextView movie_result = (TextView) findViewById(R.id.movie);

                 // Get a reference to the Spinner
                 Spinner spinner = (Spinner) findViewById(R.id.spinner);

                // Get the selected item in the Spinner
                 String movieType = String.valueOf(spinner.getSelectedItem());

                 // Get a List of  Movie
                 List<String> list_movie = movieExpert.getMovie(movieType);

                // Build a String using the values in the List
                StringBuilder listFormatted = new StringBuilder();


                 for (String list : list_movie)
                    {
                        listFormatted.append(list).append('\n');
                    }

            // Display results of the selected  from movieType
            movie_result.setText(listFormatted);
        }
    }

