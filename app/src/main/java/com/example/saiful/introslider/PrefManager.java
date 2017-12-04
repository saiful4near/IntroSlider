package com.example.saiful.introslider;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Saiful on 11/28/2017.
 */

public class PrefManager {

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared Preferences file name
    private static final String PREF_NAME = "saiful-welcome";

    private  static final String IS_FIRSRT_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRSRT_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRSRT_TIME_LAUNCH, true);

    }

}
