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

    TextView txtview;
    float ValueOne , ValueTwo ;
    double a, ans = 0;
    boolean Addition, Subtract, Multiplication, Division, Reminder, NoPower,
            istpower, Sin, Arithmetic, Cos, Tan;

    Button  about, clearbutton, dividebutton, multiplybutton, deletebutton, button7, button8, button9, minusbutton, button4,
            button5, button6, plusbutton, button1, button2, button3, button0, pointbutton, equalbutton, xfactorialbutton,
            sinbutton, cosbutton, tanbutton, piebutton, squarerootbutton, modulosbutton,
            epowerbtn, stpower2nd, ansbuttton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        scientific_operation();
//    }
//    public void scientific_operation(){
        about=(Button)findViewById(R.id.aboutId);
        txtview=(TextView) findViewById(R.id.txt);
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
                    ValueOne = Float.parseFloat(txtview.getText() + "");
                    istpower = true;
                    txtview.setText(null);
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
                    Double n = Double.parseDouble(txtview.getText().toString());
                    Double exp = (Double) Math.pow(2.718281828, n);
                    txtview.setText(exp+"");
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
                    ValueOne = Float.parseFloat(txtview.getText() + "");
                    Reminder = true;
                    txtview.setText(null);

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
                    str = txtview.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    txtview.setText(str);
                }
                catch (Exception e){}
            }
        });
        piebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                 txtbtn.setText(Math.PI + " ");
                txtview.setText(Double.parseDouble(String.valueOf(Math.PI)) + " ");
            }
        });
        sinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Double.parseDouble(txtview.getText().toString());
                    Double result = (Double) Math.sin(Math.toRadians(a));
                    txtview.setText(result + "");
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
                    a = Double.parseDouble(txtview.getText().toString());
                    Double result = (Double) Math.cos(Math.toRadians(a));
                    txtview.setText(result + "");
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
                    a = Double.parseDouble(txtview.getText().toString());
                    Double result = (Double) Math.tan(Math.toRadians(a));
                    txtview.setText(result + "");
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
                    a = Double.parseDouble(txtview.getText().toString());
                    int er = 0; double i, s = 1;
                    if (a< 0) {
                        er = 20;
                    }
                    else {
                        for (i = 2; i <= a; i += 1.0)
                            s *= i;
                    }
                    txtview.setText("");
                    txtview.setText(txtview.getText().toString() + s);
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
                    a = Math.sqrt(Double.parseDouble(txtview.getText().toString()));
                    txtview.setText("");
                    txtview.setText(txtview.getText().toString() + a);
                }
                catch(Exception e){}
            }
        });
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText("");
            }
        });
        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(null);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText(txtview.getText()+"1");
                Arithmetic=true;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText(txtview.getText()+"2");
                Arithmetic=true;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText(txtview.getText()+"3");
                Arithmetic=true;
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText(txtview.getText()+"4");
                Arithmetic=true;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText(txtview.getText()+"5");
                Arithmetic=true;
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText(txtview.getText()+"6");
                Arithmetic=true;
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText(txtview.getText()+"7");
                Arithmetic=true;
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText(txtview.getText()+"8");
                Arithmetic=true;
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText(txtview.getText()+"9");
                Arithmetic=true;
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText(txtview.getText()+"0");
                Arithmetic=true;
            }
        });
        plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ValueOne = Float.parseFloat(txtview.getText() + "");
                    Addition = true;
                    txtview.setText(null);
                }
                catch (Exception e) {}
            }
        });
        minusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ValueOne = Float.parseFloat(txtview.getText() + "");
                    Subtract = true;
                    txtview.setText(null);
                }
                catch (Exception e) {}
            }
        });
        multiplybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ValueOne = Float.parseFloat(txtview.getText() + "");
                    Multiplication = true;
                    txtview.setText(null);
                }
                catch (Exception e) {}
            }
        });
        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ValueOne = Float.parseFloat(txtview.getText() + "");
                    Division = true;
                    txtview.setText(null);
                }
                catch (Exception e) {}
            }
        });
        equalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (Sin == true) {
                        if (Arithmetic == true) {
                            String str;
                            str = txtview.getText().toString();
                            str = str.substring(3);
                            a = Math.sin(Double.parseDouble(str));
                            txtview.setText(a + "");
                            Arithmetic = false;
                            Sin = false;
                        }

                    }
                    if (Cos == true) {
                        if (Arithmetic == true) {
                            String str;
                            str = txtview.getText().toString();
                            str = str.substring(3);
                            a = Math.cos(Double.parseDouble(str));
                            txtview.setText(a + "");
                            Arithmetic = false;
                            Cos = false;
                        }
                    }
                    if (Tan == true) {
                        if (Arithmetic == true) {
                            String str;
                            str = txtview.getText().toString();
                            str = str.substring(3);
                            a = Math.sin(Double.parseDouble(str));
                            txtview.setText(a + "");
                            Arithmetic = false;
                            Tan = false;
                        }
                    }
                    if (istpower == true) {
                        ValueTwo = Float.parseFloat(txtview.getText() + "");
                        int exp = (int) Math.pow(ValueOne, ValueTwo);
                        txtview.setText(exp + "");
                        istpower = false;
                    }
                    if (Addition == true) {
                        ValueTwo = Float.parseFloat(txtview.getText() + "");
                        txtview.setText(ValueOne + ValueTwo + "");
                        Addition = false;
                    }
                    if (Reminder == true) {
                        ValueTwo = Float.parseFloat(txtview.getText() + "");
                        txtview.setText(ValueOne % ValueTwo + "");
                        Reminder = false;
                    }
                    if (NoPower == true) {
                        ValueTwo = Float.parseFloat(txtview.getText() + "");
                        int exp = (int) Math.pow(ValueOne, ValueTwo);
                        txtview.setText(exp + "");
                        NoPower = false;
                    }

                    if (Subtract == true) {
                        ValueTwo = Float.parseFloat(txtview.getText() + "");
                        txtview.setText(ValueOne - ValueTwo + "");
                        Subtract = false;
                    }

                    if (Multiplication == true) {
                        ValueTwo = Float.parseFloat(txtview.getText() + "");
                        txtview.setText(ValueOne * ValueTwo + "");
                        Multiplication = false;
                    }

                    if (Division == true) {
                        ValueTwo = Float.parseFloat(txtview.getText() + "");
                        txtview.setText(ValueOne / ValueTwo + "");
                        Division = false;
                    }
                    ans = Double.parseDouble(txtview.getText().toString());
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
                txtview.setText(null);
            }
        });
        pointbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText(txtview.getText()+".");
            }
        });
        ansbuttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(ans+"");
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
