package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeListAcitivity extends SingleFragmentActivity {
    @Override
    protected Fragment createdFragment() {
        return new CrimeListFragment();
    }
}
