package com.example.fitzoneadmin;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class UserList extends AppCompatActivity {
    //*********************************
    // RecyclerView
    RecyclerView user_list ;
    RecyclerView.Adapter adaptor;
    MyAdapter adapter;
    ArrayList<ListItem> list;
    DatabaseReference databaseReference;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(UserList.this,AdminHomePage.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        user_list = findViewById(R.id.user_recyclerView);
//        user_list.setHasFixedSize(true);
//        user_list.setLayoutManager(new LinearLayoutManager(this));

        databaseReference= FirebaseDatabase.getInstance().getReference("users");
        list =new ArrayList<>();
        user_list.setLayoutManager(new LinearLayoutManager(this));
        adapter=new MyAdapter(this,list);
        user_list.setAdapter(adapter);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot: snapshot.getChildren()){
                    ListItem listItem=dataSnapshot.getValue(ListItem.class);
                    list.add(listItem);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

//        List<ListItem> userArrayList = new ArrayList<>();
//        userArrayList.add(new ListItem("dharmik", "kacha", R.drawable.my));
//        userArrayList.add(new ListItem("dharmik", "kacha", R.drawable.my));

        // Add more items as needed

//        adapter = new MyAdapter(this, userArrayList);
//        user_list.setAdapter(adapter);


    }

}