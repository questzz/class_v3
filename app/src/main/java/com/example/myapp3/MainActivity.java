package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 1 ~ 9
    TextView one;
    TextView two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_01);

        // 변수에 식별자 -> 주소를 초기화 (값을 넣다)
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);

        // 이벤트 리스너
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "1번 버튼을 눌렀습니다.");
            }
        });

        // 람다 표현식 <----
        one.setOnClickListener(v -> {
            Log.d("TAG", "람다 표현식으로 변경 함 !!!");
        });

        //
        two.setOnClickListener(v -> Log.d("TAG", "2 버튼 클릭 !!" ));


    }
}