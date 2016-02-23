package com.aguilar.midtermexamv2;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity {

    private ProgressDialog pDialog;


    //temporary for listActivity

    private static String url = "http://joseniandroid.herokuapp.com/api/books/";

    private static final String TAG_ID = "id";
    private static final String TAG_TITLE = "name";
    private static final String TAG_GENRE = "genre";
    private static final String TAG_AUTHOR = "author";
    private static final String TAG_ISREAD = "status";


    JSONArray books = null;

    // Hashmap for ListView
    ArrayList<HashMap<String, String>> booklist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        booklist = new ArrayList<HashMap<String, String>>();
        ListView lv = getListView();

    }

}
