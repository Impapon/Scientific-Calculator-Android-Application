package com.example.android_scientific_calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtbtn;
    float mValueOne , mValueTwo ;
    double a;
    double ans = 0;
    boolean mAddition, mSubtract, mMultiplication, mDivision, mReminder, mNoPower,
            istpower2ndno,mSin,mArithmetic,mCos,mTan, piecheck = false;
    Button  about, clearbutton, dividebutton, multiplybutton, deletebutton, button7, button8, button9, minusbutton, button4,
            button5, button6, plusbutton, button1, button2, button3, button0, pointbutton, equalbutton, xfactorialbutton,
            sinbutton, cosbutton, tanbutton, piebutton, squarerootbutton, modulosbutton,
            epowerbtn, stpower2nd, ansbuttton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scientific_operation();
    }
    public void scientific_operation(){
        about=(Button)findViewById(R.id.aboutId);
        txtbtn=(TextView) findViewById(R.id.txt);
        clearbutton=(Button) findViewById(R.id.clearrbtn);
        dividebutton=(Button) findViewById(R.id.dividebtn);
        multiplybutton=(Button) findViewById(R.id.multiplybtn);
        deletebutton=(Button) findViewById(R.id.deletebtn);
        button7=(Button) findViewById(R.id.sevenbtn);
        button8=(Button) findViewById(R.id.eightbtn);
        button9=(Button) findViewById(R.id.ninebtn);
        minusbutton=(Button) findViewById(R.id.minusbtn);
        button4=(Button) findViewById(R.id.fourbtn);
        button5=(Button) findViewById(R.id.fivebtn);
        button6=(Button) findViewById(R.id.sixbtn);
        plusbutton=(Button) findViewById(R.id.plusbtn);
        button1=(Button) findViewById(R.id.onebtn);
        button2=(Button) findViewById(R.id.twobtn);
        button3=(Button) findViewById(R.id.threebtn);
        button0=(Button) findViewById(R.id.zerobtn);
        pointbutton=(Button) findViewById(R.id.pointbtn);
        equalbutton=(Button) findViewById(R.id.equalbtn);
        squarerootbutton=(Button) findViewById(R.id.squarerootbtn);
        xfactorialbutton=(Button) findViewById(R.id.xfactorialbtn);
        sinbutton=(Button) findViewById(R.id.sinbtn);
        cosbutton=(Button) findViewById(R.id.cosbtn);
        tanbutton=(Button)findViewById(R.id.tanbtn);
        ansbuttton=(Button) findViewById(R.id.ansbtn);
        piebutton=(Button) findViewById(R.id.piebtn);
        deletebutton=(Button) findViewById(R.id.deletebtn);
        modulosbutton=(Button)findViewById(R.id.modulousbtn);
        epowerbtn=(Button) findViewById(R.id.epowerbtn);
        stpower2nd=(Button) findViewById(R.id.istpower2nd);

        stpower2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
                    istpower2ndno = true;
                    txtbtn.setText(null);
                }
                catch (Exception e) {
                    Toast t = Toast.makeText(MainActivity.this, "Syntax ERROR", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER, 0, 0);
                    t.show();
                }
            }
        });
        epowerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Double n = Double.parseDouble(txtbtn.getText().toString());
                    Double exp = (Double) Math.pow(2.718281828, n);
                    txtbtn.setText(exp+"");
                }
                catch (Exception e){
                    Toast t = Toast.makeText(MainActivity.this, "Syntax ERROR", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER, 0, 0);
                    t.show();
                }
            }
        });
        modulosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
                    mReminder = true;
                    txtbtn.setText(null);

//                    a = Double.parseDouble(txtbtn.getText().toString());
//                    Double result = (Double) Math.cos(Math.toRadians(a));
//                    txtbtn.setText(result + "");
                }
                catch (Exception e) {
                    Toast t = Toast.makeText(MainActivity.this, "Syntax ERROR", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER, 0, 0);
                    t.show();
                }
            }
        });
        deletebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String str;
                    str = txtbtn.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    txtbtn.setText(str);
                }
                catch (Exception e){}
            }
        });
        piebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                 txtbtn.setText(Math.PI + " ");
                 txtbtn.setText(Double.parseDouble(String.valueOf(Math.PI)) + " ");
            }
        });
        sinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Double.parseDouble(txtbtn.getText().toString());
                    Double result = (Double) Math.sin(Math.toRadians(a));
                    txtbtn.setText(result + "");
                }
                catch(Exception e){
                    Toast t = Toast.makeText(MainActivity.this, "Syntax ERROR", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER, 0, 0);
                    t.show();
                }
            }
        });
        cosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Double.parseDouble(txtbtn.getText().toString());
                    Double result = (Double) Math.cos(Math.toRadians(a));
                    txtbtn.setText(result + "");
                }
                catch(Exception e){
                    Toast t = Toast.makeText(MainActivity.this, "Syntax ERROR", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER, 0, 0);
                    t.show();
                }
            }
        });
        tanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Double.parseDouble(txtbtn.getText().toString());
                    Double result = (Double) Math.tan(Math.toRadians(a));
                    txtbtn.setText(result + "");
                }
                catch(Exception e){
                    Toast t = Toast.makeText(MainActivity.this, "Syntax ERROR", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER, 0, 0);
                    t.show();
                }
            }
        });
        xfactorialbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Double.parseDouble(txtbtn.getText().toString());
                    int er = 0; double i, s = 1;
                    if (a< 0) {
                        er = 20;
                    }
                    else {
                        for (i = 2; i <= a; i += 1.0)
                            s *= i;
                    }
                    txtbtn.setText("");
                    txtbtn.setText(txtbtn.getText().toString() + s);
                }
                catch(Exception e){
                    Toast t = Toast.makeText(MainActivity.this, "Syntax ERROR", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER, 0, 0);
                    t.show();
                }
            }
        });
        squarerootbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.sqrt(Double.parseDouble(txtbtn.getText().toString()));
                    txtbtn.setText("");
                    txtbtn.setText(txtbtn.getText().toString() + a);
                }
                catch(Exception e){}
            }
        });
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtbtn.setText("");
            }
        });
        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtbtn.setText(null);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"1");
                mArithmetic=true;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"2");
                mArithmetic=true;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"3");
                mArithmetic=true;
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"4");
                mArithmetic=true;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"5");
                mArithmetic=true;
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"6");
                mArithmetic=true;
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"7");
                mArithmetic=true;
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"8");
                mArithmetic=true;
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"9");
                mArithmetic=true;
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"0");
                mArithmetic=true;
            }
        });
        plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
                    mAddition = true;
                    txtbtn.setText(null);
                }
                catch (Exception e) {}
            }
        });
        minusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
                    mSubtract = true;
                    txtbtn.setText(null);
                }
                catch (Exception e) {}
            }
        });
        multiplybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
                    mMultiplication = true;
                    txtbtn.setText(null);
                }
                catch (Exception e) {}
            }
        });
        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
                    mDivision = true;
                    txtbtn.setText(null);
                }
                catch (Exception e) {}
            }
        });
        equalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (mSin == true) {
                        if (mArithmetic == true) {
                            String str;
                            str = txtbtn.getText().toString();
                            str = str.substring(3);
                            a = Math.sin(Double.parseDouble(str));
                            txtbtn.setText(a + "");
                            mArithmetic = false;
                            mSin = false;
                        }

                    }
                    if (mCos == true) {
                        if (mArithmetic == true) {
                            String str;
                            str = txtbtn.getText().toString();
                            str = str.substring(3);
                            a = Math.cos(Double.parseDouble(str));
                            txtbtn.setText(a + "");
                            mArithmetic = false;
                            mCos = false;
                        }
                    }
                    if (mTan == true) {
                        if (mArithmetic == true) {
                            String str;
                            str = txtbtn.getText().toString();
                            str = str.substring(3);
                            a = Math.sin(Double.parseDouble(str));
                            txtbtn.setText(a + "");
                            mArithmetic = false;
                            mTan = false;
                        }
                    }
                    if (istpower2ndno == true) {
                        mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                        int exp = (int) Math.pow(mValueOne, mValueTwo);
                        txtbtn.setText(exp + "");
                        istpower2ndno = false;
                    }
                    if (mAddition == true) {
                        mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                        txtbtn.setText(mValueOne + mValueTwo + "");
                        mAddition = false;
                    }
                    if (mReminder == true) {
                        mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                        txtbtn.setText(mValueOne % mValueTwo + "");
                        mReminder = false;
                    }
                    if (mNoPower == true) {
                        mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                        int exp = (int) Math.pow(mValueOne, mValueTwo);
                        txtbtn.setText(exp + "");
                        mNoPower = false;
                    }

                    if (mSubtract == true) {
                        mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                        txtbtn.setText(mValueOne - mValueTwo + "");
                        mSubtract = false;
                    }

                    if (mMultiplication == true) {
                        mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                        txtbtn.setText(mValueOne * mValueTwo + "");
                        mMultiplication = false;
                    }

                    if (mDivision == true) {
                        mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                        txtbtn.setText(mValueOne / mValueTwo + "");
                        mDivision = false;
                    }
                    ans = Double.parseDouble(txtbtn.getText().toString());
                }catch(Exception e){
                    Toast t = Toast.makeText(MainActivity.this, "Syntax ERROR", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER, 0, 0);
                    t.show();
                }
            }
        });
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(null);
            }
        });
        pointbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+".");
            }
        });
        ansbuttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtbtn.setText(ans+"");
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abt = new Intent(MainActivity.this, About.class);
                startActivity(abt);
            }
        });
    }
}
