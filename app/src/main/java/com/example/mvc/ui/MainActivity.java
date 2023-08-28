package com.example.mvc.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvc.R;
import com.example.mvc.pojo.MoviesModel;


public class MainActivity extends AppCompatActivity {

    Button button;
    TextView movieName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        movieName = findViewById(R.id.textView);

        button.setOnClickListener(this::takeAction);

    }

    protected MoviesModel getMovieFromDataBase() {
        return new MoviesModel("Titanic", 1990);
    }

    protected void getMovieName() {
        movieName.setText(getMovieFromDataBase().getTile());
    }

    protected void takeAction(View view) {
        if (view.getId() == R.id.button) {
            getMovieName();
        }
    }

}