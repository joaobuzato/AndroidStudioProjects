package com.example.aluno;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Olá Mundo!", Toast.LENGTH_LONG).show();
    }
}
