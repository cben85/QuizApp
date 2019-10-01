package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.android.quizapp.R.id.edittext_answer_6;

public class MainActivity extends AppCompatActivity {

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * if the correct answered is chosen, a brief explanation will be displayed
     */

    public void answer_1_correct(View view) {
        Toast.makeText(this, R.string.answer1_correct, Toast.LENGTH_LONG).show();

    }

    /**
     * if the answer is not correct, a message is displayed
     */
    public void answer_1_wrong(View view) {
        Toast.makeText(this, R.string.answer1_wrong, Toast.LENGTH_LONG).show();
    }


    /**
     * if the correct answered is chosen a brief explanation will be displayed
     */

    public void answer_2_correct(View view) {

        Toast.makeText(this, R.string.answer2_correct, Toast.LENGTH_LONG).show();
    }

    /**
     * if the answer is not correct a message is displayed
     */
    public void answer_2_wrong(View view) {

        Toast.makeText(this, R.string.answer2_wrong, Toast.LENGTH_LONG).show();
    }

    /**
     * if the correct answered is chosen a brief explanation will be displayed
     */

    public void answer_3_correct(View view) {
        Toast.makeText(this, R.string.answer3_correct, Toast.LENGTH_LONG).show();
    }

    /**
     * if the answer is not correct a message is displayed
     *
     * @param view
     */
    public void answer_3_wrong(View view) {

        Toast.makeText(this, R.string.answer3_wrong, Toast.LENGTH_LONG).show();
    }

    /**
     * if the correct answered is chosena brief explanation will be displayed
     */
    public void answer_4_correct(View view) {
        Toast.makeText(this, R.string.answer4_correct, Toast.LENGTH_LONG).show();
    }

    /**
     * if the answer is not correct a message is displayed
     */
    public void answer_4_wrong(View view) {

        Toast.makeText(this, R.string.answer4_wrong, Toast.LENGTH_LONG).show();
    }

    /**
     * if the correct answered is chosen a brief explanation will be displayed
     */


    public void answer_5_correct_I(View view) {

                 Toast.makeText(this, R.string.answer5_correct_I, Toast.LENGTH_LONG).show();
        }


    /**
     * if the answer is not correct, the score is not increased and a message is displayed
     *
     * @param view
     */
    public void answer_5_wrong_I(View view) {
       Toast.makeText(this, R.string.answer5_wrong_I, Toast.LENGTH_LONG).show();
        }


    /**
     * if the correct answered is chosen, the score will increase by 100 points and a brief explanation will be displayed
     */
    public void answer_5_correct_II(View view) {
            Toast.makeText(this, R.string.answer5_correct_II, Toast.LENGTH_LONG).show();
        }

    //***
    // hier weiter machen - es werden noch 100 Punkte angezeigt ist, falsch
    // mss ich es anpassen, wenn man nachträglich die Punkte doch anders setzt?


    /**
     * if the answer is not correct, the score is not increased and a message is displayed
     */
    public void answer_5_wrong_II(View view) {
            Toast.makeText(this, R.string.answer5_wrong_II, Toast.LENGTH_LONG).show();
        }

    /**
     * this method get the text that the user types in.
     *
     * @return the user input as a string
     */
    public String answer_6() {
        EditText answer_6_input = (EditText) findViewById(edittext_answer_6);
        String answer_6string = answer_6_input.getText().toString();
        return answer_6string;
    }

    /**
     * this method checks if the user input is correct
     */
    public void checkAnswer6(View view) {
        String answer_6string = answer_6();


        //   if (answer_6string.equals("If you’ll pardon my French"))
        if (answer_6string.equals(getString(R.string.answer6_sentence))) {
            score = score + 100;
            Toast.makeText(this, R.string.answer_6_correct, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, R.string.answer_6_wrong, Toast.LENGTH_LONG).show();
        }
    }




    public int calculateScore() {
        /**
         * The Radiobutton logic is handled with if statements
         */
        RadioButton answer1Correct = (RadioButton) findViewById(R.id.textfield_answer_a_C);
        RadioButton answer2Correct = (RadioButton) findViewById(R.id.textfield_answer_2_b_C);
        RadioButton answer3Correct = (RadioButton) findViewById(R.id.textfield_answer_3_c_C);
        RadioButton answer4Correct = (RadioButton) findViewById(R.id.textfield_answer_4_b_C);

        boolean radioButtonQ1 = answer1Correct.isChecked();
        boolean radioButtonQ2 = answer2Correct.isChecked();
        boolean radioButtonQ3 = answer3Correct.isChecked();
        boolean radioButtonQ4 = answer4Correct.isChecked();

        if (radioButtonQ1 == true) {
            score = score + 100;
        }

        if (radioButtonQ2) {
            score = score + 100;
        }

        if (radioButtonQ3) {
            score = score + 100;
        }

        if (radioButtonQ4) {
            score = score + 100;
        }

        /**
         * The CheckBox logic is handled with if statement
         */
        CheckBox isCheckedBox1_correct = (CheckBox) findViewById(R.id.checkbox_1_correct);
        CheckBox isCheckedBox2_wrong = (CheckBox) findViewById(R.id.checkbox_2_wrong);
        CheckBox isCheckedBox3_correct = (CheckBox) findViewById(R.id.checkbox_3_correct);
        CheckBox isCheckedBox4_wrong = (CheckBox) findViewById(R.id.checkbox_4_wrong);

        boolean checkBoxQ1Correct = isCheckedBox1_correct.isChecked();
        boolean checkBoxQ1Wrong = isCheckedBox2_wrong.isChecked();
        boolean checkBoxQ2Correct = isCheckedBox3_correct.isChecked();
        boolean checkBoxQ2Wrong = isCheckedBox4_wrong.isChecked();

        if (checkBoxQ1Correct == true && checkBoxQ1Wrong != true) {
            score = score + 100;
        }

        if (checkBoxQ2Correct == true && checkBoxQ2Wrong != true) {
            score = score + 100;

        }

        return score;

    }




    /**
     * The message that is displayed will be constructed depending on the achieved score
     */
    private String message() {

        int myScore = calculateScore();


      //  String message = "mein Punktestand" + myScore;

       String message = "";


        if (myScore < 500) {
            message = "Try again " +
                    "\nThis is your score: " + myScore;
            return message;
        }


        if (myScore == 500) {
            message = "Good Job: 5 out of 7 " +
                    "\nThis is your score: " + myScore;
            return message;
        }

        if (myScore == 700) {
            message = "Fantastic: 7 out of 7 " +
                    "\nThis is your score: " + myScore;
            return message;
        }
        return message;
    }


    /**
     * This message shows the result the quiz
     */
    public void showResult(View view) {
        String message = message();
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
