package com.example.gridcalc;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5,
            button6,
            button7, button8, button9, buttonAdd, buttonSub,
            buttonDiv,
            buttonMul, buttond, buttonC, buttonEqu,buttonperc;
    EditText cEditText;
    float mValueOne, mValueTwo;
    boolean cAddition, mSubtract, cMultiplication, cDivision,cperc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button15);
        button1 = (Button) findViewById(R.id.button8);
        button2 = (Button) findViewById(R.id.button14);
        button3 = (Button) findViewById(R.id.button18);
        button4 = (Button) findViewById(R.id.button7);
        button5 = (Button) findViewById(R.id.button13);
        button6 = (Button) findViewById(R.id.button16);
        button7 = (Button) findViewById(R.id.button6);
        button8 = (Button) findViewById(R.id.button10);
        button9 = (Button) findViewById(R.id.button11);
        buttond = (Button) findViewById(R.id.button19);
        buttonAdd = (Button) findViewById(R.id.Add);
        buttonSub = (Button) findViewById(R.id.Sub);
        buttonMul = (Button) findViewById(R.id.Mul);
        buttonDiv = (Button) findViewById(R.id.Div);
        buttonC = (Button) findViewById(R.id.button2);
        buttonperc = (Button) findViewById(R.id.button4);
        buttonEqu = (Button) findViewById(R.id.Equ);
        cEditText = (EditText) findViewById(R.id.edt1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText(cEditText.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText(cEditText.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText(cEditText.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText(cEditText.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText(cEditText.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText(cEditText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText(cEditText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText(cEditText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText(cEditText.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText(cEditText.getText() + "0");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cEditText == null) {
                    cEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(cEditText.getText() +
                            "");
                    cAddition = true;
                    cEditText.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(cEditText.getText() +
                        "");
                mSubtract = true;
                cEditText.setText(null);
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(cEditText.getText() +
                        "");
                cMultiplication = true;
                cEditText.setText(null);
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(cEditText.getText() +
                        "");
                cDivision = true;
                cEditText.setText(null);
            }
        });
        buttonperc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(cEditText.getText() +
                        "");
                cperc = true;
                cEditText.setText(null);
            }
        });
        buttonEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(cEditText.getText() +
                        "");
                if (cAddition == true) {
                    cEditText.setText(Float.toString(mValueOne)+" + "+Float.toString(mValueTwo)+" = "+Float.toString(mValueOne + mValueTwo) + "");
                    cAddition = false;
                }
                if (mSubtract == true) {
                    cEditText.setText(Float.toString(mValueOne)+" - "+Float.toString(mValueTwo)+" = "+Float.toString(mValueOne - mValueTwo) + "");
                    mSubtract = false;
                }
                if (cMultiplication == true) {
                    cEditText.setText(Float.toString(mValueOne)+" * "+Float.toString(mValueTwo)+" = "+Float.toString(mValueOne * mValueTwo) + "");
                    cMultiplication = false;
                }
                if (cDivision == true) {
                    cEditText.setText(Float.toString(mValueOne)+" / "+Float.toString(mValueTwo)+" = "+Float.toString(mValueOne / mValueTwo) + "");
                    cDivision = false;
                }
                if (cperc == true) {
                    cEditText.setText((mValueOne / mValueTwo)*100 +
                            "");
                    cperc = false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText("");
            }
        });
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText(cEditText.getText() + ".");
            }
        });
    }
}