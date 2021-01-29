package com.example.recycleviewactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Film> filmlist;
    RecyclerView.LayoutManager LinearLayoutManager, gridLayoutManager;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        
        filmlist = new ArrayList<>();
        filmlist.add(new Film("Limitless","fantasy","1.42 min","https://i.pinimg.com/236x/e8/48/4e/e8484e2bcac24d7625a6e70e852b8860--limitless--limitless-movie.jpg"));
        filmlist.add(new Film("Knives out","detective","2.12 min","https://upload.wikimedia.org/wikipedia/en/1/1f/Knives_Out_poster.jpeg"));
        filmlist.add(new Film("Soul","cartoon","2.03 min","https://lumiere-a.akamaihd.net/v1/images/p_disney_soul_20263_eac955fc.jpeg"));
        filmlist.add(new Film("Harry Potter","fantasy","2.25 min","https://resizer.mail.ru/p/b0fbae3d-3b50-5378-b7e6-4d259b6001ab/AAAC9XM85tz7jpO7mbfQM5anx42Eov3E5DwkcUR036LmPXdrvteZ9OPOabgoPqBsUwEiP1LMJl_P0aRGQSMvYgM0TiQ.jpg"));
        filmlist.add(new Film("Nerve","phsyhology","1.56 min","https://cdn-irec.r-99.com/sites/default/files/imagecache/300o/product-images/627073/Qpzn1eJaDZ2tWERKd04rFA.jpg"));
        filmlist.add(new Film("five feet apart","drama","1.48 min","https://fhsnewsflashes.com/wp-content/uploads/2019/04/80052-poster-xlarge.jpg"));

        LinearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this,1);

        recyclerView.setLayoutManager(LinearLayoutManager);
        recyclerView.setHasFixedSize(true);

        recyclerViewAdapter = new RecyclerViewAdapter(this,filmlist);
        recyclerView.setAdapter(recyclerViewAdapter);




    }
}