package com.josecuentas.android_assert;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testAssert();
    }

    private void testAssert() {
        List<String> nameList = new ArrayList<>();

        String name = null;
        for (int i = 0; i < 15; i++) {
            if (i == 4) name = null;
            else name = "name " + (i + 1);
            assert name != null;
            nameList.add(name);
        }

        String result = "";
        for (String s : nameList) {
            result += s + "\n";
        }
        ((TextView)findViewById(R.id.tviMessage)).setText(result);
    }
}

/*
* http://es.stackoverflow.com/a/6171
* http://stackoverflow.com/a/6176529
* Conclusion:
* assert no es una buena forma de validar cosas que no deberian pasar,
* es preferible manejarlo con una funcion que nos indique que debe hacer,
* si pasa algo que queremos evitar
* */
