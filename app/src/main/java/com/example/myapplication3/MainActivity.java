package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name;
    TextView Fname;
    TextView Sname;
    TextView Tname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editText);
        Fname=findViewById(R.id.Fnames);
        Sname=findViewById(R.id.Snames);
        Tname=findViewById(R.id.Tnames);
    }

    public void Process(View view) {
        String procText= String.valueOf(name.getText());
        class Splitter{
            String[] split(String text){
                return text.split("\\s+");
            }
        }
        Splitter splitter=new Splitter();
        String[] nameList = splitter.split(procText);
        Fname.append(" "+nameList[0]);
        Sname.append(" "+nameList[1]);
        Tname.append(" "+nameList[2]);
    }
}