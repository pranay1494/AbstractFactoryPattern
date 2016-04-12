package com.example.root.abstractfactorypattern;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button submit;
    Context context = this;
    EditText editText;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog =  new Dialog(context);
                dialog.setContentView(R.layout.dialog);
                dialog.setTitle(" Enter Sweep Or Gun");
                editText = (EditText) dialog.findViewById(R.id.editText);
                submit = (Button) dialog.findViewById(R.id.submit);
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AbstractFactory abstractFactory = FactoryProducer.getFactory("Music");
                        if(!editText.getText().toString().isEmpty())
                        {
                            Music music = abstractFactory.getMusic(editText.getText().toString());
                            if(music!=null)
                            {
                                music.getC(context);
                                music.play();
                            }
                            Toast.makeText(MainActivity.this,"clicked",Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        }
                    }
                });
                dialog.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog =  new Dialog(context);
                    dialog.setContentView(R.layout.dialog);
                dialog.setTitle("Enter Audi or Ferrari");
                editText = (EditText) dialog.findViewById(R.id.editText);
                submit = (Button) dialog.findViewById(R.id.submit);
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AbstractFactory abstractFactory = FactoryProducer.getFactory("Car");
                        if(!editText.getText().toString().isEmpty())
                        {
                            Car car = abstractFactory.getCar(editText.getText().toString());
                            if(car!=null)
                            {
                                car.getC(context);
                                car.type();
                            }
                            Toast.makeText(MainActivity.this,"clicked",Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        }
                    }
                });
                dialog.show();
            }
        });
    }
}
