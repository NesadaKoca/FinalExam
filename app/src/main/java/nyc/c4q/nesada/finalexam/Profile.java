package nyc.c4q.nesada.finalexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

import nyc.c4q.nesada.finalexam.adapter.RecyclerAdapter;

/**
 * Created by NesadaKoca on 2/12/2017.
 */

public class Profile extends AppCompatActivity implements View.OnClickListener{

    private Toolbar mToolbar;
    private RecyclerView recyclerView;
    DrawerLayout drawerLayout;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<String> arrayList = new ArrayList();
    ImageButton mButton1, mButton2, mButton3, mBtnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mToolbar = (Toolbar) findViewById(R.id.toobar);
        setSupportActionBar(mToolbar);
        setTitle("Profile");

        mButton1 = (ImageButton) findViewById(R.id.btn_1);
        mButton2 = (ImageButton) findViewById(R.id.btn_2);
        mButton3 = (ImageButton) findViewById(R.id.btn_3);
        mBtnLogout = (ImageButton) findViewById(R.id.btn_logout);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        recyclerView.setHasFixedSize(true);

        String[] items = getResources().getStringArray(R.array.topics);

        for (String Item : items) {

            arrayList.add(Item);
        }

        int[] imgList = {R.drawable.heart, R.drawable.sms, R.drawable.contact, R.drawable.logout};

        adapter = new RecyclerAdapter(arrayList, imgList);
        recyclerView.setAdapter(adapter);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mBtnLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btn_1:
                Toast.makeText(view.getContext(), "Selected Heart Activity", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_2:
                Toast.makeText(view.getContext(), "Selected Message Activity", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_3:
                Intent settings = new Intent(view.getContext(), Settings.class);
                view.getContext().startActivity(settings);
                break;
            case R.id.btn_logout:
                Toast.makeText(view.getContext(), "Selected Logout Activity", Toast.LENGTH_SHORT).show();
                this.finishAffinity();
                break;

        }



    }
}
