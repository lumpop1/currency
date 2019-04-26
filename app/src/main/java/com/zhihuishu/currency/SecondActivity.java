package com.zhihuishu.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    // function of SGD to CNY.
    void convertSgdToCny()
    {  EditText sgd= findViewById(R.id.sgd);
        sgd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  cny= findViewById(R.id.cny);
        cny.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(sgd.getText().toString());
        double result=a*4.9561;
        cny.setText(String.valueOf(result));
    }
    // function of SGD to USD.
    void convertSgdToUsd()
    {  EditText sgd= findViewById(R.id.sgd);
        sgd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  usd= findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(sgd.getText().toString());
        double result=a*0.7231;
        usd.setText(String.valueOf(result));
    }
    // function of SGD to HKD.
    void convertSgdToHkd()
    {  EditText sgd= findViewById(R.id.sgd);
        sgd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  hkd= findViewById(R.id.hkd);
        hkd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(sgd.getText().toString());
        double result=a*5.7812;
        hkd.setText(String.valueOf(result));
    }

    // function of SGD to GBP.
    void convertSgdToGbp()
    {  EditText sgd= findViewById(R.id.sgd);
        sgd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  gbp= findViewById(R.id.gbp);
        gbp.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(sgd.getText().toString());
        double result=a*0.5521;
        gbp.setText(String.valueOf(result));
    }

    // function of CNY to SGD.

    void convertCnyToSgd()
    {  EditText sgd= findViewById(R.id.sgd);
        sgd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  cny= findViewById(R.id.cny);
        cny.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(cny.getText().toString());
        double result=a*0.2022;
        sgd.setText(String.valueOf(result));
    }
    // function of CNY to USD.

    void convertCnyToUsd()
    {  EditText usd= findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  cny= findViewById(R.id.cny);
        cny.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(cny.getText().toString());
        double result=a*0.1491;
        usd.setText(String.valueOf(result));
    }

    // function of CNY to HKD.

    void convertCnyToHkd()
    {  EditText hkd= findViewById(R.id.hkd);
        hkd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  cny= findViewById(R.id.cny);
        cny.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(cny.getText().toString());
        double result=a*1.1714;
        hkd.setText(String.valueOf(result));
    }

    // function of CNY to GBP.

    void convertCnyToGbp()
    {  EditText gbp= findViewById(R.id.gbp);
        gbp.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  cny= findViewById(R.id.cny);
        cny.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(cny.getText().toString());
        double result=a*0.1147;
        gbp.setText(String.valueOf(result));
    }

    // function of USD to SGD.

    void convertUsdToSgd()
    {  EditText sgd= findViewById(R.id.sgd);
        sgd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  usd= findViewById(R.id.usd);
        sgd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(usd.getText().toString());
        double result=a*1.3563;
        sgd.setText(String.valueOf(result));
    }

    // function of USD to HKD.

    void convertUsdToHkd()
    {  EditText hkd= findViewById(R.id.hkd);
        hkd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  usd= findViewById(R.id.usd);
        hkd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(usd.getText().toString());
        double result=a*7.8532;
        hkd.setText(String.valueOf(result));
    }

    // function of USD to GBP.

    void convertUsdToGbp()
    {  EditText gbp= findViewById(R.id.gbp);
        gbp.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  usd= findViewById(R.id.usd);
        gbp.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(usd.getText().toString());
        double result=a*0.7536;
        gbp.setText(String.valueOf(result));
    }

    // function of USD to CNY.

    void convertUsdToCny()
    {  EditText cny= findViewById(R.id.cny);
        cny.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  usd= findViewById(R.id.usd);
        cny.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(usd.getText().toString());
        double result=a*6.7088;
        cny.setText(String.valueOf(result));
    }

    void convertHkdToSgd()
    {  EditText sgd= findViewById(R.id.sgd);
        sgd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  hkd= findViewById(R.id.hkd);
        sgd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(hkd.getText().toString());
        double result=a*0.1738;
        sgd.setText(String.valueOf(result));
    }

    void convertHkdToCny()
    {  EditText cny= findViewById(R.id.cny);
        cny.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  hkd= findViewById(R.id.hkd);
        cny.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(hkd.getText().toString());
        double result=a*0.8511;
        cny.setText(String.valueOf(result));
    }

    void convertHkdToUsd()
    {  EditText usd= findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  hkd= findViewById(R.id.hkd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(hkd.getText().toString());
        double result=a*0.1223;
        usd.setText(String.valueOf(result));
    }

    void convertHkdToGbp()
    {  EditText gbp= findViewById(R.id.gbp);
        gbp.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  hkd= findViewById(R.id.hkd);
        gbp.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(hkd.getText().toString());
        double result=a*0.0912;
        gbp.setText(String.valueOf(result));
    }

    void convertGbpToSgd()
    {  EditText sgd= findViewById(R.id.sgd);
        sgd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  gbp= findViewById(R.id.gbp);
        sgd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(gbp.getText().toString());
        double result=a*1.7621;
        sgd.setText(String.valueOf(result));
    }

    void convertGbpToCny()
    {  EditText cny= findViewById(R.id.cny);
        cny.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  gbp= findViewById(R.id.gbp);
        cny.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(gbp.getText().toString());
        double result=a*8.7121;
        cny.setText(String.valueOf(result));
    }

    void convertGbpToUsd()
    {  EditText usd= findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  gbp= findViewById(R.id.gbp);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(gbp.getText().toString());
        double result=a*1.2925;
        usd.setText(String.valueOf(result));
    }

    void convertGbpToHkd()
    {  EditText hkd= findViewById(R.id.hkd);
        hkd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  gbp= findViewById(R.id.gbp);
        hkd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(gbp.getText().toString());
        double result=a*10.1918;
        hkd.setText(String.valueOf(result));
    }


    // the event when click button 1.

    public void click(View view)
    {
        convertSgdToCny();
        convertSgdToUsd();
        convertSgdToHkd();
        convertSgdToGbp();
        Button b2= findViewById(R.id.submit2);
        Button b3= findViewById(R.id.submit3);
        Button b4= findViewById(R.id.submit4);
        Button b5= findViewById(R.id.submit5);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
    }
    // the event when click reset.

    public void reset(View view)
    {
        Button b1= findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2= findViewById(R.id.submit2);
        b2.setEnabled(true);
        Button b3= findViewById(R.id.submit3);
        b3.setEnabled(true);
        Button b4= findViewById(R.id.submit4);
        b4.setEnabled(true);
        Button b5= findViewById(R.id.submit5);
        b5.setEnabled(true);
        EditText sgd= findViewById(R.id.sgd);
        EditText cny= findViewById(R.id.cny);
        EditText usd= findViewById(R.id.usd);
        EditText hkd= findViewById(R.id.hkd);
        EditText gbp= findViewById(R.id.gbp);
        sgd.setText("");
        cny.setText("");
        usd.setText("");
        hkd.setText("");
        gbp.setText("");

    }
    // the event when click button 2.

    public void click2(View view)
    {
        Button b1= findViewById(R.id.submit);
        b1.setEnabled(false);
        Button b3= findViewById(R.id.submit3);
        b3.setEnabled(false);
        Button b4= findViewById(R.id.submit4);
        b4.setEnabled(false);
        Button b5= findViewById(R.id.submit5);
        b5.setEnabled(false);
        convertCnyToSgd();
        convertCnyToUsd();
        convertCnyToHkd();
        convertCnyToGbp();
    }
    // the event when click button 3.

    public void click3(View view)
    {
        Button b1= findViewById(R.id.submit);
        b1.setEnabled(false);
        Button b2= findViewById(R.id.submit2);
        b2.setEnabled(false);
        Button b4= findViewById(R.id.submit4);
        b4.setEnabled(false);
        Button b5= findViewById(R.id.submit5);
        b5.setEnabled(false);
        convertUsdToGbp();
        convertUsdToSgd();
        convertUsdToCny();
        convertUsdToHkd();
    }

    public void click4(View view)
    {
        Button b1= findViewById(R.id.submit);
        b1.setEnabled(false);
        Button b2= findViewById(R.id.submit2);
        b2.setEnabled(false);
        Button b3= findViewById(R.id.submit3);
        b3.setEnabled(false);
        Button b5= findViewById(R.id.submit5);
        b5.setEnabled(false);
        convertHkdToSgd();
        convertHkdToCny();
        convertHkdToGbp();
        convertHkdToUsd();
    }

    public void click5(View view)
    {
        Button b1= findViewById(R.id.submit);
        b1.setEnabled(false);
        Button b2= findViewById(R.id.submit2);
        b2.setEnabled(false);
        Button b4= findViewById(R.id.submit4);
        b4.setEnabled(false);
        Button b3= findViewById(R.id.submit3);
        b3.setEnabled(false);
        convertGbpToSgd();
        convertGbpToCny();
        convertGbpToUsd();
        convertGbpToHkd();
    }
}