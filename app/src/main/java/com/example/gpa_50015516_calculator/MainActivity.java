package com.example.gpa_50015516_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.text.TextWatcher;

public class MainActivity extends AppCompatActivity
{

    TextView gpaAvg; //Creating object of GPA avg TextView
    TextView gpa1; //Creating object of GPA EditText
    TextView gpa2;
    TextView gpa3;
    TextView gpa4;
    TextView gpa5;
    Button computeGPA; //Creating object of GPA compute Button

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gpaAvg = (TextView)findViewById(R.id.textView_GPA); //Linking object to GPA average field
        computeGPA = (Button)findViewById(R.id.button_gpa);     //Linking object to GPA compute button

        gpa1 = (TextView)findViewById(R.id.gpa1); //Linking object to course GPA
        gpa1.setFilters(new InputFilter[]{ new com.test.InputFilterMinMax("0", "100")}); //Class InputFilterMinMax used to define GPA range between 0-100

        gpa2 = (TextView)findViewById(R.id.gpa2);
        gpa2.setFilters(new InputFilter[]{ new com.test.InputFilterMinMax("0", "100")});

        gpa3 = (TextView)findViewById(R.id.gpa3);
        gpa3.setFilters(new InputFilter[]{ new com.test.InputFilterMinMax("0", "100")});

        gpa4 = (TextView)findViewById(R.id.gpa4);
        gpa4.setFilters(new InputFilter[]{ new com.test.InputFilterMinMax("0", "100")});

        gpa5 = (TextView)findViewById(R.id.gpa5);
        gpa5.setFilters(new InputFilter[]{ new com.test.InputFilterMinMax("0", "100")});

        final ConstraintLayout bkColor = (ConstraintLayout)findViewById(R.id.bkView);
        final ScrollView bkColor1 = (ScrollView)findViewById(R.id.scrollView);

        //TextWatcher: Looks for text changes and sets "clear" to "compute" when any course gpa field is modified
        gpa1.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            public void afterTextChanged(Editable s)
            {
                computeGPA.setText("Compute");
                bkColor.setBackgroundColor(Color.WHITE);
                bkColor1.setBackgroundColor(Color.WHITE);
                // TODO Auto-generated method stub
            }
        });

        gpa2.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            public void afterTextChanged(Editable s)
            {
                computeGPA.setText("Compute");
                bkColor.setBackgroundColor(Color.WHITE);
                bkColor1.setBackgroundColor(Color.WHITE);
                // TODO Auto-generated method stub
            }
        });

        gpa3.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            public void afterTextChanged(Editable s)
            {
                computeGPA.setText("Compute");
                bkColor.setBackgroundColor(Color.WHITE);
                bkColor1.setBackgroundColor(Color.WHITE);
                // TODO Auto-generated method stub
            }
        });

        gpa4.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            public void afterTextChanged(Editable s)
            {
                computeGPA.setText("Compute");
                bkColor.setBackgroundColor(Color.WHITE);
                bkColor1.setBackgroundColor(Color.WHITE);
                // TODO Auto-generated method stub
            }
        });

        gpa5.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            public void afterTextChanged(Editable s)
            {
                computeGPA.setText("Compute");
                bkColor.setBackgroundColor(Color.WHITE);
                bkColor1.setBackgroundColor(Color.WHITE);
                // TODO Auto-generated method stub
            }
        });

        //Method executed when compute button clicked
        computeGPA.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view) {

                if (computeGPA.getText().toString().contains("Clear"))
                {
                    gpa1.setText("");
                    gpa2.setText("");
                    gpa3.setText("");
                    gpa4.setText("");
                    gpa5.setText("");
                    computeGPA.setText("Compute");
                    gpaAvg.setText("Average GPA:");
                    bkColor.setBackgroundColor(Color.WHITE);
                    bkColor1.setBackgroundColor(Color.WHITE);
                }

                if (gpa1.length() == 0)
                {
                    gpa1.setError("Enter GPA");
                }
                if (gpa2.length() == 0)
                {
                    gpa2.setError("Enter GPA");
                }
                if (gpa3.length() == 0)
                {
                    gpa3.setError("Enter GPA");
                }
                if (gpa4.length() == 0)
                {
                    gpa4.setError("Enter GPA");
                }
                if (gpa5.length() == 0)
                {
                    gpa5.setError("Enter GPA");
                }
                if ((gpa1.length() != 0) && (gpa2.length() != 0) && (gpa3.length() != 0) && (gpa4.length() != 0) && (gpa5.length() != 0))
                {
                    String gpa1String = gpa1.getText().toString();
                    int gpa1Num = Integer.parseInt(gpa1String);
                    String gpa2String = gpa2.getText().toString();
                    int gpa2Num = Integer.parseInt(gpa2String);
                    String gpa3String = gpa3.getText().toString();
                    int gpa3Num = Integer.parseInt(gpa3String);
                    String gpa4String = gpa4.getText().toString();
                    int gpa4Num = Integer.parseInt(gpa4String);
                    String gpa5String = gpa5.getText().toString();
                    int gpa5Num = Integer.parseInt(gpa5String);

                    int gpaAvgCalc = (gpa1Num + gpa2Num + gpa3Num + gpa4Num + gpa5Num)/5;
                    String finalVal = String.valueOf(gpaAvgCalc);
                    gpaAvg.setText("Average GPA: " + finalVal);
                    computeGPA.setText("Clear");

                    if (gpaAvgCalc >= 80)
                    {
                        bkColor.setBackgroundColor(Color.GREEN);
                        bkColor1.setBackgroundColor(Color.GREEN);
                    } else if (gpaAvgCalc >= 60)
                    {
                        bkColor.setBackgroundColor(Color.YELLOW);
                        bkColor1.setBackgroundColor(Color.YELLOW);
                    }
                    else
                    {
                        bkColor.setBackgroundColor(Color.RED);
                        bkColor1.setBackgroundColor(Color.RED);
                    }
                }
            }
        });
    }
}
