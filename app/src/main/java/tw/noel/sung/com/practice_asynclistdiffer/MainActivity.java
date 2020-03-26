package tw.noel.sung.com.practice_asynclistdiffer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;


import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import tw.noel.sung.com.practice_asynclistdiffer.adapter.TestAdapterAsyncListDiffer;
import tw.noel.sung.com.practice_asynclistdiffer.databinding.ActivityMainBinding;
import tw.noel.sung.com.practice_asynclistdiffer.model.TestModel;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private TestAdapterAsyncListDiffer testAdapter;
    private ArrayList<TestModel.DatasBean> testModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        testAdapter = new TestAdapterAsyncListDiffer();
        activityMainBinding.recyclerView.setAdapter(testAdapter);
        activityMainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));


        testModels = new Gson().fromJson(getParseString("test"), TestModel.class).getDatas();
        testAdapter.setData(testModels);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (testModels.size() > 0) {
                    int random =  (int)(Math.random()*(testModels.size()-1));
                    testModels.remove(testModels.get(random));
                    testAdapter.setData(testModels);
                    new Handler().postDelayed(this, 2000);
                }
            }
        }, 2000);
    }

    //-------------

    private String getParseString(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open(fileName), "UTF-8"));

            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
