package fylder.react.demo;

import android.os.Bundle;

import com.facebook.react.ReactActivity;

import javax.annotation.Nullable;

public class ReactDemoActivity extends ReactActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_react);
//    }

    @Nullable
    @Override
    protected String getMainComponentName() {
        return "fylder";
    }
}
