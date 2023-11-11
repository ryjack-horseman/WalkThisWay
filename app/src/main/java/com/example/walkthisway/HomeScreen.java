package com.example.walkthisway;

import android.support.v4.app.Fragment;

public class HomeScreen extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return HomeFragment.newInstance();
    }
}
