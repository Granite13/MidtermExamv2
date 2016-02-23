package com.aguilar.midtermexamv2;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity {


    //temporary for listActivity

    private static String url = "http://joseniandroid.herokuapp.com/api/books/";

    private static final String TAG_ID = "id";
    private static final String TAG_TITLE = "name";
    private static final String TAG_GENRE = "genre";
    private static final String TAG_AUTHOR = "author";
    private static final String TAG_ISREAD = "status";


    JSONArray contacts = null;

    // Hashmap for ListView
    ArrayList<HashMap<String, String>> booklist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
