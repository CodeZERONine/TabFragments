package org.akshanshgusain.tabfragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList=new ArrayList<>();
    private final List<String> mFragmenTitleList=new ArrayList<>();

    public SectionPagerAdapter(FragmentManager fm) {

        super(fm);
    }


    public void addFragment(Fragment fragment,String title){
        mFragmentList.add(fragment);
        mFragmenTitleList.add(title);

    }



    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        //return Fragment Title
        return mFragmenTitleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        //Return the actual fragment
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
