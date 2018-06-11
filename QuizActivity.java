package com.example.kushagrasrivastava.quizapp;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Kushagra Srivastava on 6/3/2018.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {


    /*Global variables declaration
    * DONE button for the submission of the answers
    * Score variable to calculate the regular updated value increment of the user's score*/
    Button DONE;
    int Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        /*
        * DONE button initialisation through type casting
        * On clicking the DONE button the doneOnClickListener will perform the functionality of showing the results to the user */
        DONE = (Button) findViewById(R.id.btnDoneButton);
        DONE.setOnClickListener(doneOnClickListener);
    }
    /*
    * Answer evaluation of Question 1
    * for this the options are in three checkboxes which have been respectively defined and declared
    * Their are also is...check variables defined in boolean to check which one has been chosen by the user as his final answer
    * in the if-else logic we are checking the condition that the if this particular checkbox has only been clicked then only
    * the score will be updated by one else not */

    private void checkingQuestionOne(){
        CheckBox questionOneBatarang = (CheckBox) findViewById(R.id.checkboxQuest1AnswerBatarang);
        CheckBox questionOneWaterBreather = (CheckBox) findViewById(R.id.checkboxQuest1AnswerWaterBreather);
        CheckBox questionOneGun = (CheckBox) findViewById(R.id.checkboxQuest1AnswerGun);
        boolean isBatarangChecked = questionOneBatarang.isChecked();
        boolean isWaterBreatherChecked = questionOneWaterBreather.isChecked();
        boolean isGunChecked = questionOneGun.isChecked();

        if (isBatarangChecked && isGunChecked && !isWaterBreatherChecked){
            Score += 1;
        }
    }
    /*
        * Answer evaluation of Question 2
        * for this the options are in three radiobuttons which have been respectively defined and declared
        * Their are also is...check variables defined in boolean to check if the correct
         * one has been chosen by the user as his final answer or not
        * in the if-else logic we are checking the condition that the if this particular radiobutton
         * has only been clicked then only
        * the score will be updated by one else not */
    private void checkingQuestionTwo(){
        RadioButton questionTwoBatman = (RadioButton) findViewById(R.id.rdbtnBatman);
        RadioButton questionTwoSelinaKyle = (RadioButton) findViewById(R.id.rdbtnSelinaKyle);
        RadioButton questionTwoRachelDawson = (RadioButton) findViewById(R.id.rdbtnRachelDawson);
        boolean isRachelDawsonChecked = questionTwoRachelDawson.isChecked();
        if (isRachelDawsonChecked){
            Score += 1;
        }
    }
    /*
           * Answer evaluation of Question 3
           * Here we're using an edittext
            * which has been defined and declared
            * and whose value is been stored ina string variable name
            * This method defines the edittext and returns its value in name variable*/
    private String getQuestionThreeStringFilled() {
        EditText editText = (EditText) findViewById(R.id.edtBlankAnswer);
        editText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.setFocusable(true);
                v.setFocusableInTouchMode(true);
                return false;
            }
        });
        String name = editText.getText().toString().trim();
        return name;
    }
    /*
               * Answer evaluation of Question 3
               * Here we're using a method
                * to check if the string obtained from the previous method actually has been filled with the desired
                * correct answer or not
                * then in the if-else logic, without considering thhe case of the string filled by the user
                * we are checking if he has filled the desired answer or not
                * and henceforth updating the score depending upon that*/
    private void checkingQuestionThree(){
        String name = getQuestionThreeStringFilled();
        if (name.equalsIgnoreCase("Villian")){
            Score += 1;
        }
    }
    /*
            * Answer evaluation of Question 4
            * for this the three options are  defined in three radiobuttons which have been respectively defined and declared
            * Their are also is...check variables defined in boolean to check if the correct
             * one has been chosen by the user as his final answer or not
            * in the if-else logic we are checking the condition that the if this particular radiobutton
             * has only been clicked then only
            * the score will be updated by one else not */
    private void checkingQuestionFour(){
        RadioButton radioButtonLeftSide = (RadioButton) findViewById(R.id.rdbtnLeftSide);
        RadioButton radioButtonRightSide = (RadioButton) findViewById(R.id.rdbtnRightSide);
        RadioButton radioButtonRightDownTheMiddle = (RadioButton) findViewById(R.id.rdbtnRightDownTheMiddle);
        boolean isLeftSideChecked = radioButtonLeftSide.isChecked();
        if (isLeftSideChecked){
            Score += 1;
        }
    }
    /*
        * Answer evaluation of Question 5
        * for this the options are in three checkboxes which have been respectively defined and declared
        * Their are also is...check variables defined in boolean to check which one has been chosen by the user as his final answer
        * in the if-else logic we are checking the condition that the if this particular checkbox has only been clicked then only
        * the score will be updated by one else not */
    private void checkingQuestionFive(){
        CheckBox questionFiveHarveyDent = (CheckBox) findViewById(R.id.checkboxQuest5HarveyDent);
        CheckBox questionFiveLuciusFox = (CheckBox) findViewById(R.id.checkboxQuest5LuciusFox);
        CheckBox questionFiveJimGorden = (CheckBox) findViewById(R.id.checkboxQuest5JimGorden);
        boolean isHarveyDentChecked = questionFiveHarveyDent.isChecked();
        boolean isLuciusFoxChecked = questionFiveLuciusFox.isChecked();
        boolean isJimGordenChecked = questionFiveJimGorden.isChecked();

        if (isHarveyDentChecked && !isLuciusFoxChecked && !isJimGordenChecked){
            Score += 1;}
        /*else if((isHarveyDentChecked && isLuciusFoxChecked) || (isJimGordenChecked && isHarveyDentChecked))
        {
            Score +=0;
                }
        else if(( isLuciusFoxChecked) && (isJimGordenChecked ) && (isHarveyDentChecked) )
        {
            Score +=0;
        }
        else if((isHarveyDentChecked && isLuciusFoxChecked) || (isJimGordenChecked && isHarveyDentChecked) || ( isLuciusFoxChecked) && (isJimGordenChecked) )
        {
            Score +=0;
        }*/

    }
    /*running all the methods in the checkAllQuestions method so that when finally gives all the answers the evaluation begins*/
    private void checkAllQuestions(){
        checkingQuestionOne();
        checkingQuestionTwo();
        checkingQuestionThree();
        checkingQuestionFour();
        checkingQuestionFive();
    }
    /*After the game is over and user gets his/her score being displayed , this methos will be invoked to
     * reset all the scores to zero so that whenever a new user opens a quiz he/she should begin form a new
      * approach to the game*/
    private void resetTheScoreToZero(){
        Score = 0;
    }
/*
* Functionality defined for the DONE button
* First of all the checkALL questions method will be called
* returning us the final value of Score variable*/
    final View.OnClickListener doneOnClickListener = new View.OnClickListener() {
        public void onClick(final View v){
            checkAllQuestions();
            /*
            * After the final value of Score has been obtained
            * we'll be displayed a message showing our final scores
            * This is done through Toast and its makeText() method provided
            *
            * We want the message to be displayed for a slightly longer period of time so we have chosen the LENGTH_LONG constant
             * also .show() is their to finally display the Toast mesaage as desired by us*/
            Toast.makeText(QuizActivity.this, "Correct Answers: " + Score + "/5",
                    Toast.LENGTH_LONG).show();
            /*
            * calling the resetTHeScoreToZero method for the purpose as defined above*/
            resetTheScoreToZero();
        }
    };
}