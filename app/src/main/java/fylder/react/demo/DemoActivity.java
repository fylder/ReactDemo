package fylder.react.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        init();
    }

    void init() {
        findViewById(R.id.btn_react).setOnClickListener(v -> {
            Intent intent = new Intent(DemoActivity.this, ReactDemoActivity.class);
            startActivity(intent);
        });
    }
}
