package com.ned.mycamera2;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by NedHuang on 2016/10/13.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().replace(R.id.container, Camera2Fragment.newInstance()).commit();
        }
    }
}
