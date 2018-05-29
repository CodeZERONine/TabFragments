package org.akshanshgusain.tabfragments;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

 private SectionPagerAdapter mSectionPagerAdapter;
 private ViewPager mViewPager;
 private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSectionPagerAdapter=new SectionPagerAdapter(getSupportFragmentManager());
        mViewPager=(ViewPager)findViewById(R.id.container);

        setUpViewPager(mViewPager);

        tabLayout = (TabLayout)findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(mViewPager);
        }

    private void setUpViewPager(ViewPager mViewPager) {
        SectionPagerAdapter adapter=new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new tab1Fragment(),"TAB 1");
        adapter.addFragment(new tab2Fragment(),"TAB 2");
        adapter.addFragment(new tab3Fragment(),"TAB 3");
        mViewPager.setAdapter(adapter);
    }
}
