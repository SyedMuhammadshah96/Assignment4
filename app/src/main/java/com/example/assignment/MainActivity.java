package com.example.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    //initialize variables

    private ArrayList<String> mNames= new ArrayList<>();
    private ArrayList<String> mImagesUrls= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImagesBitmaps();
    }

    private void initImagesBitmaps(){
        Log.d(TAG, "initImagesBitmaps: preparing bitmaps.");
        mImagesUrls.add("https://www.google.com/search?q=test+automation&source=lnms&tbm=isch&sa=X&ved=0ahUKEwipvLfQuJniAhWRlxQKHcPvCiQQ_AUIDigB&biw=1350&bih=591#imgrc=IqRq8V2Db-17OM:");
        mNames.add("Test Automation");
        mImagesUrls.add("https://www.google.com/search?q=data+structure&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjUpaO2upniAhWZD2MBHYMrDR0Q_AUIDigB&biw=1350&bih=591#imgrc=nsC81Vsw4K2YiM:");
        mImagesUrls.add("https://www.google.com/search?q=computer+programming&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiQ3_eau5niAhX76OAKHXMZCWwQ_AUIDigB&biw=1350&bih=591#imgrc=rJVSc6DpBRFaHM:");
        mNames.add("Computer Programming");
        mImagesUrls.add("https://banner2.kisspng.com/20180425/zke/kisspng-artificial-intelligence-deep-learning-machine-lear-5ae0d5475822e1.095237781524684103361.jpg");
        mNames.add("Artificial Intelligence");
        mImagesUrls.add("https://qph.fs.quoracdn.net/main-qimg-5523292a06d3b65e497cad78cc9be38b");
        mNames.add("Principles Of Management");
        mImagesUrls.add("https://www.simpalm.com/wp-content/uploads/2016/05/mobil-app-development-florida.png");
        mNames.add("Mobile Application & Development");
        mImagesUrls.add("https://betanews.com/wp-content/uploads/2016/08/operating-system.jpg");
        mNames.add("Operating System");
        mImagesUrls.add("https://www.ucsc-extension.edu/sites/default/files/images/certificates/istock-485633375_softwarequality_hero_2560x1084.jpg");
        mNames.add("Software Engineering");
        mImagesUrls.add("https://study.com/cimages/videopreview/videopreview-full/pseudocode-definition-and-examples_117066.jpg");
        mNames.add("Compiler Construction");

        initRecylcerView();

    }

    private  void initRecylcerView()
    {
        Log.d(TAG, "initRecylcerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImagesUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
