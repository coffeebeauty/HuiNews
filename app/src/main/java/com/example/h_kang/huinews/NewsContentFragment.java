package com.example.h_kang.huinews;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Toast;

/**
 * Created by h_kang on 2017/3/13.
 */

public class NewsContentFragment extends Fragment {
    String TAG = "YokiContentFrag";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach: " + getClass().getSimpleName());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: " + getClass().getSimpleName());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_content, container, false);
        Log.d(TAG, "onCreateView: " + getClass().getSimpleName());
//        final ScrollView scrollView = (ScrollView)view.findViewById(R.id.content_scroll);
//        scrollView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                switch (event.getAction()) {
//                    //手指抬起
//                    case MotionEvent.ACTION_UP:
//                        break;
//                    //手指落下
//                    case MotionEvent.ACTION_DOWN:
//                        break;
//                    //手指滑动
//                    case MotionEvent.ACTION_MOVE:
//                        /**
//                         * 1、getScorollY()——滚动条滑动的距离
//                         * 2、getMeasuredHeight()——内容的整体高度，包括隐藏部分
//                         * 3、getHeight()——显示高度。内容未布满屏幕，2=3；内容大于屏幕，3=屏幕高度，2>3。
//                         */
//                        //顶部状态
//                        if (scrollView.getScrollY() <= 0) {
//                            Log.e(">>>>>>>>>>>>>>", "顶部");
//                            Toast.makeText(getActivity(), "顶部", Toast.LENGTH_SHORT).show();
//                        }
//
//                        //顶部状态
//                        //TextView的总高度<=一屏幕的高度+滚动条的滚动距离(getChildAt(0):第0个子控件)
//                        if (scrollView.getChildAt(0).getMeasuredHeight() <= scrollView.getScrollY() + scrollView.getHeight()) {
//                            Log.e(">>>>>>>>>>>>>>", "底部");
//                            Toast.makeText(getActivity(), "底部", Toast.LENGTH_SHORT).show();
//                        }
//                        break;
//                }
//                return false;
//            }
//        });
        return view;
    }

    @Override
    public void onStart() {
        Log.d(TAG, "onStart: " + getClass().getSimpleName());
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: " + getClass().getSimpleName());
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated: " + getClass().getSimpleName());
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: " + getClass().getSimpleName());
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: " + getClass().getSimpleName());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + getClass().getSimpleName());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView: " + getClass().getSimpleName());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach: " + getClass().getSimpleName());
    }
}
