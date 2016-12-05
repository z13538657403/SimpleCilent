package com.test.zhangtao.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Constructor;


/**
 * Created by zhangtao on 16/12/2.
 */

public class MainActivity extends Activity
{
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        showPerson();
    }

    private void showPerson()
    {
        try
        {
            GenericTest.showGeneric();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
