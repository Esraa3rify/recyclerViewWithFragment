package com.example.recyclerviewwithfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link recFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class recFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recView;
    ArrayList<Model>dataHolder;

    public recFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment recFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static recFragment newInstance(String param1, String param2) {
        recFragment fragment = new recFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view= inflater.inflate(R.layout.fragment_rec, container, false);
      recView=view.findViewById(R.id.recyclerViewxml);
      recView.setLayoutManager(new LinearLayoutManager(getContext()));
      dataHolder=new ArrayList<>();

      Model obj=new Model(R.drawable.avatarimaje,"Alex","10:15AM","What is your age?");
      dataHolder.add(obj);
      Model obj2=new Model(R.drawable.avatarimaje,"Alex","10:15AM","What is your age?");
      dataHolder.add(obj2);
      Model obj3=new Model(R.drawable.avatarimaje,"Alex","10:15AM","What is your age?");
      dataHolder.add(obj3);
      Model obj4=new Model(R.drawable.avatarimaje,"Alex","10:15AM","What is your age?");
      dataHolder.add(obj4);
      Model obj5=new Model(R.drawable.avatarimaje,"Alex","10:15AM","What is your age?");
      dataHolder.add(obj5);
      Model obj6=new Model(R.drawable.avatarimaje,"Alex","10:15AM","What is your age?");
      dataHolder.add(obj6);
      Model obj7=new Model(R.drawable.avatarimaje,"Alex","10:15AM","What is your age?");
      dataHolder.add(obj7);
      Model obj8=new Model(R.drawable.avatarimaje,"Alex","10:15AM","What is your age?");
      dataHolder.add(obj8);

      recView.setAdapter(new adapter(dataHolder));

      return view;


    }
}