package nyc.c4q.nesada.finalexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import nyc.c4q.nesada.finalexam.adapter.SettingsAdapter;

/**
 * Created by NesadaKoca on 2/12/2017.
 */

public class Settings extends AppCompatActivity {
    private Toolbar mToolbar;
    RecyclerView mRecyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Integer> arrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        mToolbar = (Toolbar) findViewById(R.id.toobar);
        setSupportActionBar(mToolbar);
        setTitle("Settings");

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_settings);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_settings);
        layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

// I left the array length = 10000, because it will crash the app, out of memory
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }

        adapter = new SettingsAdapter(arrayList);
        mRecyclerView.setAdapter(adapter);
    }

}
