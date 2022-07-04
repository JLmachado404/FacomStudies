package com.example.facomquiz.ui.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.facomquiz.R;
import com.example.facomquiz.chaptertopics.TopicActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment  implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    CardView heading1,heading2,heading3,heading4,heading5;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        heading1 = view.findViewById(R.id.heading1);
        heading2 = view.findViewById(R.id.heading2);
        heading3 = view.findViewById(R.id.heading3);
        heading4 = view.findViewById(R.id.heading4);
        heading5 = view.findViewById(R.id.heading5);

        heading1.setOnClickListener(this);
        heading2.setOnClickListener(this);
        heading3.setOnClickListener(this);
        heading4.setOnClickListener(this);
        heading5.setOnClickListener(this);



//        heading1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext(), TopicActivity.class);
//                startActivity(intent);
//            }
//        });
        return view;
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getContext(),TopicActivity.class);

        switch (view.getId()){
            case R.id.heading1:
                intent.putExtra("chapterName","heading1");
                startActivity(intent);
                break;
            case R.id.heading2:
                intent.putExtra("chapterName","heading2");
                startActivity(intent);
                break;
            case R.id.heading3:
                intent.putExtra("chapterName","heading3");
                startActivity(intent);
                break;
            case R.id.heading4:
                intent.putExtra("chapterName","heading4");
                startActivity(intent);
                break;
            case R.id.heading5:
                intent.putExtra("chapterName","heading5");
                startActivity(intent);
                break;
        }

    }
}