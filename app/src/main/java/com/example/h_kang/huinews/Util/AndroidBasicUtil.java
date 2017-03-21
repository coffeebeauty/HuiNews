package com.example.h_kang.huinews.Util;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by MIKE on 2017/3/20.
 */

public class AndroidBasicUtil {
    //默认添加fragment到回退栈里
    public static void InsertOneFragment(FragmentManager manager, int replacedID, Fragment inserFragment){
        InsertOneFragment(manager, replacedID, inserFragment, false);
    }

    public static void InsertOneFragment(FragmentManager manager, int replacedID, Fragment insertFragment, boolean ifAddToBckStack){
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(replacedID, insertFragment);
        if(ifAddToBckStack){
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }

}
