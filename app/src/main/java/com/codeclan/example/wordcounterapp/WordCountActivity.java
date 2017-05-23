package com.codeclan.example.wordcounterapp;

import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    private EditText inputText;
    private Button getResultsButton;
    private TextView resultsDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        inputText = (EditText)findViewById(R.id.input_text);

        getResultsButton = (Button)findViewById(R.id.get_results_button);

        resultsDisplay = (TextView)findViewById(R.id.results_display);
    }

    public void onGetResultsButtonClicked(View button) {
        String input = inputText.getText().toString();

        WordCounter wordCounter = new WordCounter(input);

        int wordCount = wordCounter.countWords();

        resultsDisplay.setText(wordCount);
    }

}
























