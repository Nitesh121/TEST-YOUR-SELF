package com.example.niteshkumar.onlineprepration;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Lesson1_Activity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    String lessonVideoPracticeSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        lessonVideoPracticeSelection = bundle.getString("free");

        toolbar = (Toolbar) findViewById(R.id.toolbar1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager1);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs1);
        tabLayout.setupWithViewPager(viewPager);


    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        if(lessonVideoPracticeSelection.equals("Lesson")){
            adapter.addFragment( new Free_Fragement(), "Free");

        }else if(lessonVideoPracticeSelection.equals("Video")){
            adapter.addFragment( new VideoFree1(), "Free");

        }else if(lessonVideoPracticeSelection.equals("Practice")){
            adapter.addFragment( new PracticsTest(), "Free");

        }else{
            adapter.addFragment( new SectionTest(), "Free");

        }
        if (lessonVideoPracticeSelection.equals("Lesson"))
        {
            adapter.addFragment( new Quant_Fragement(), "Quant");
        }else if (lessonVideoPracticeSelection.equals("Video")){
            adapter.addFragment( new VideoQuantam(), "Quant");

        }else if(lessonVideoPracticeSelection.equals("Practice")){
            adapter.addFragment( new PracticeQuant(), "Quant");

        }else{
            adapter.addFragment( new SelectionQuant() , "Quant");}



        if (lessonVideoPracticeSelection.equals("Lesson")) {
            adapter.addFragment(new Reasoning_Fragement(), "Reasoning");
        }else if (lessonVideoPracticeSelection.equals("Video")){
            adapter.addFragment( new VideoReasoning(), "Reasoning");

        } else if(lessonVideoPracticeSelection.equals("Practice")){
        adapter.addFragment( new PracticsReasoning(), "Reasoning");

    }else{
        adapter.addFragment( new SectionReasoning() , "Reasoning");}



        if (lessonVideoPracticeSelection.equals("Lesson")) {
            adapter.addFragment(new English_Fragement(), "EnglishLanguage");
        }else if (lessonVideoPracticeSelection.equals("Video")) {
            adapter.addFragment(new VideoEnglish(), "EnglishLanguage");

    } else if(lessonVideoPracticeSelection.equals("Practice")){
        adapter.addFragment( new PracticsEnglish(), "English");

    }else{
        adapter.addFragment( new SectionEnglish() , "English");}



        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}

