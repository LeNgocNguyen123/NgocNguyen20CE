package com.example.lnnguyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRoll = findViewById(R.id.roll_button);
        mRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll();
            }
        });
    }
    private void roll()  {
        int rollNumber = (int) (Math.random() * 6 + 1);
        TextView mResultText = findViewById(R.id.results_text);
        ImageView diceImage = findViewById(R.id.dice_image);

        switch(rollNumber){
            case 1:
                mResultText.setText("1");
                diceImage.setImageResource(R.drawable.dice_1);
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                mResultText.setText("2");
                diceImage.setImageResource(R.drawable.dice_2);
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                mResultText.setText("3");
                diceImage.setImageResource(R.drawable.dice_3);
                Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                mResultText.setText("4");
                diceImage.setImageResource(R.drawable.dice_4);
                Toast.makeText(this, "4", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                mResultText.setText("5");
                diceImage.setImageResource(R.drawable.dice_5);
                Toast.makeText(this, "5", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                mResultText.setText("6");
                diceImage.setImageResource(R.drawable.dice_6);
                Toast.makeText(this, "6", Toast.LENGTH_SHORT).show();
                break;
            default:
                mResultText.setText("Empty dice");
                diceImage.setImageResource(R.drawable.empty_dice);
                Toast.makeText(this, "EmptyDice", Toast.LENGTH_SHORT).show();

        }
    }
}