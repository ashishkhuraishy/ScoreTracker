package com.example.android.scoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0, temp = 0, wickets = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void updateScore(int number, int number2) {
        TextView updatedText = (TextView) findViewById(R.id.score);
        updatedText.setText(number + "/" + number2);
    }

    private void updateTeam(String message1, String message2) {
        TextView teamName = (TextView) findViewById(R.id.team_name);
        TextView toWin = (TextView) findViewById(R.id.toWin);
        teamName.setText(message1);
        toWin.setText(message2);
    }

    public void six(View view) {
        score = score + 6;
        updateScore(score, wickets);
    }

    public void four(View view) {
        score = score + 4;
        updateScore(score, wickets);
    }

    public void two(View view) {
        score = score + 2;
        updateScore(score, wickets);
    }

    public void one(View view) {
        score = score + 1;
        updateScore(score, wickets);
    }

    public void out(View view) {
        wickets = wickets + 1;
        updateScore(score, wickets);
    }

    public void teamB(View view) {
        temp = score + 1;
        score = 0;
        wickets = 0;
        String teamName = "Team B", message = "To win : " + temp;
        updateTeam(teamName, message);
        updateScore(score, wickets);
    }


    public void reset(View view) {
        score = 0;
        temp = 0;
        wickets = 0;
        String teamName = "Team A", message = "First Batting";
        updateTeam(teamName, message);
        updateScore(score, wickets);
    }

}
