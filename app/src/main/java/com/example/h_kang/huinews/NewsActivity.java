package com.example.h_kang.huinews;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.example.h_kang.huinews.R;
import com.example.h_kang.huinews.Util.AndroidBasicUtil;

/**
 * Created by MIKE on 2017/3/21.
 */

public class NewsActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity);
        insertContentFragment();
    }

    //动态插入Fragment
    private void insertContentFragment() {
        NewsContentFragment contentFrg = new NewsContentFragment();
        AndroidBasicUtil.InsertOneFragment(getSupportFragmentManager(), R.id.content_fragment, contentFrg);
    }
}
