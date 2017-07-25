package com.project.panzk.criminaintent;

import android.support.v4.app.Fragment;

/**
 * Created by panzk on 2017/7/3.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
