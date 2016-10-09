package com.example.teo.exercises;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by teo on 22.09.2016.
 */
public class AdultExercises extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adult_exercises_main);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);


    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Selecteaza cuvantul auzit");
        listDataHeader.add("Propozitie scurta inregistrata");
        listDataHeader.add("Propozitie cu final deschis");
        listDataHeader.add("Exersearea ascultarii");
        listDataHeader.add("Pozitii spatiale");
        listDataHeader.add("Identifica dupa descriere");
        listDataHeader.add("Completeaza propozitia");
        listDataHeader.add("Propozitii cauza-efect");
        listDataHeader.add("Raspunde la intrebare");
        listDataHeader.add("Intrebari din text");

        // Adding child data
        List<String> category1 = new ArrayList<String>();
        category1.add("Exercitiul 1");
        category1.add("Exercitiul 2");
        category1.add("Exercitiul 3");


        List<String> category2 = new ArrayList<String>();
        category2.add("Exercitiul 1");
        category2.add("Exercitiul 2");
        category2.add("Exercitiul 3");

        List<String> category3 = new ArrayList<String>();
        category3.add("Exercitiul 1");
        category3.add("Exercitiul 2");
        category3.add("Exercitiul 3");


        List<String> category4 = new ArrayList<String>();
        category4.add("Exercitiul 1");
        category4.add("Exercitiul 2");
        category4.add("Exercitiul 3");

        List<String> category5 = new ArrayList<String>();
        category5.add("Exercitiul 1");
        category5.add("Exercitiul 2");
        category5.add("Exercitiul 3");

        List<String> category6 = new ArrayList<String>();
        category6.add("Exercitiul 1");
        category6.add("Exercitiul 2");
        category6.add("Exercitiul 3");


        List<String> category7 = new ArrayList<String>();
        category7.add("Exercitiul 1");
        category7.add("Exercitiul 2");
        category7.add("Exercitiul 3");

        List<String> category8 = new ArrayList<String>();
        category8.add("Exercitiul 1");
        category8.add("Exercitiul 2");
        category8.add("Exercitiul 3");


        List<String> category9 = new ArrayList<String>();
        category9.add("Exercitiul 1");
        category9.add("Exercitiul 2");
        category9.add("Exercitiul 3");

        List<String> category10 = new ArrayList<String>();
        category10.add("Exercitiul 1");
        category10.add("Exercitiul 2");
        category10.add("Exercitiul 3");



        listDataChild.put(listDataHeader.get(0), category1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), category2);
        listDataChild.put(listDataHeader.get(2), category3);
        listDataChild.put(listDataHeader.get(3), category4);
        listDataChild.put(listDataHeader.get(4), category5);
        listDataChild.put(listDataHeader.get(5), category6);
        listDataChild.put(listDataHeader.get(6), category7);
        listDataChild.put(listDataHeader.get(7), category8);
        listDataChild.put(listDataHeader.get(8), category9);
        listDataChild.put(listDataHeader.get(9), category10);

    }
}
