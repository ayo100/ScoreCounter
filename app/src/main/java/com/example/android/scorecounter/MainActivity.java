package com.example.android.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int onTargetTeamA = 0;
    int offTargetTeamA = 0;
    int cornerTeamA = 0;
    int foulTeamA = 0;
    int possessionTeamA = 50;

    int scoreTeamB = 0;
    int onTargetTeamB = 0;
    int offTargetTeamB = 0;
    int cornerTeamB = 0;
    int foulTeamB = 0;
    int possessionTeamB = 50;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*============   Team A Display Declaration     ===============================*/
    private void displayTeamA_score(int number) {
        TextView team_a_score = (TextView) findViewById(R.id.team_a_score);
        team_a_score.setText("" + number);
    }

    private void displayTeamA_onTarget(int number) {
        TextView team_a_onTarget = (TextView) findViewById(R.id.team_a_onTarget);
        team_a_onTarget.setText("" + number);
    }

    private void displayTeamA_offTarget(int number) {
        TextView team_a_offTarget = (TextView) findViewById(R.id.team_a_offTarget);
        team_a_offTarget.setText("" + number);
    }

    private void displayTeamA_corner(int number) {
        TextView team_a_corners = (TextView) findViewById(R.id.team_a_corners);
        team_a_corners.setText("" + number);
    }

    private void displayTeamA_foul(int number) {
        TextView team_a_fouls = (TextView) findViewById(R.id.team_a_fouls);
        team_a_fouls.setText("" + number);
    }

    private void displayTeamA_possession(int number) {
        TextView team_a_possessions = (TextView) findViewById(R.id.team_a_possessions);
        team_a_possessions.setText("" + number);
    }

    /*============   Team B Display Declaration     ===============================*/
    private void displayTeamB_score(int number) {
        TextView team_b_score = (TextView) findViewById(R.id.team_b_score);
        team_b_score.setText("" + number);
    }

    private void displayTeamB_onTarget(int number) {
        TextView team_b_onTarget = (TextView) findViewById(R.id.team_b_onTarget);
        team_b_onTarget.setText("" + number);
    }

    private void displayTeamB_offTarget(int number) {
        TextView team_b_offTarget = (TextView) findViewById(R.id.team_b_offTarget);
        team_b_offTarget.setText("" + number);
    }

    private void displayTeamB_corner(int number) {
        TextView team_b_corners = (TextView) findViewById(R.id.team_b_corners);
        team_b_corners.setText("" + number);
    }

    private void displayTeamB_foul(int number) {
        TextView team_b_fouls = (TextView) findViewById(R.id.team_b_fouls);
        team_b_fouls.setText("" + number);
    }

    private void displayTeamB_possession(int number) {
        TextView team_b_possessions = (TextView) findViewById(R.id.team_b_possessions);
        team_b_possessions.setText("" + number);
    }

    /*=============  ButtonClick for Team A Declaration  ==============================*/
    /* This method is called when the Team A Goal button is clicked */
    public void teamA_goal(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamA_score(scoreTeamA);
    }

    /* This method is called when the Team A onTarget button is clicked */
    public void teamA_onTarget(View view) {
        onTargetTeamA = onTargetTeamA + 1;
        displayTeamA_onTarget(onTargetTeamA);
    }

    /* This method is called when the Team A offTarget button is clicked */
    public void teamA_offTarget(View view) {
        offTargetTeamA = offTargetTeamA + 1;
        displayTeamA_offTarget(offTargetTeamA);
    }

    /* This method is called when the Team A Corner button is clicked */
    public void teamA_corner(View view) {
        cornerTeamA = cornerTeamA + 1;
        displayTeamA_corner(cornerTeamA);
    }

    /* This method is called when the Team A Foul button is clicked */
    public void teamA_foul(View view) {
        foulTeamA = foulTeamA + 1;
        displayTeamA_foul(foulTeamA);
    }

    /* This method is called when the Team A Possession button is clicked */
    public void teamA_possession(View view) {
        possessionTeamA = possessionTeamA + 5;
        possessionTeamB = possessionTeamB - 5;
        displayTeamA_possession(possessionTeamA);
        displayTeamB_possession(possessionTeamB);
    }

    /*=============  ButtonClick for Team B Declaration  ==============================*/
    /* This method is called when the Team B Goal button is clicked */
    public void teamB_goal(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamB_score(scoreTeamB);
    }

    /* This method is called when the Team B onTarget button is clicked */
    public void teamB_onTarget(View view) {
        onTargetTeamB = onTargetTeamB + 1;
        displayTeamB_onTarget(onTargetTeamB);
    }

    /* This method is called when the Team B offTarget button is clicked */
    public void teamB_offTarget(View view) {
        offTargetTeamB = offTargetTeamB + 1;
        displayTeamB_offTarget(offTargetTeamB);
    }

    /* This method is called when the Team B Corner button is clicked */
    public void teamB_corner(View view) {
        cornerTeamB = cornerTeamB + 1;
        displayTeamB_corner(cornerTeamB);
    }

    /* This method is called when the Team B Foul button is clicked */
    public void teamB_foul(View view) {
        foulTeamB = foulTeamB + 1;
        displayTeamB_foul(foulTeamB);
    }

    /* This method is called when the Team B Possession button is clicked */
    public void teamB_possession(View view) {
        possessionTeamB = possessionTeamB + 5;
        possessionTeamA = possessionTeamB - 5;
        displayTeamB_possession(possessionTeamB);
        displayTeamA_possession(possessionTeamA);
    }
}
