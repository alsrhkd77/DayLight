package com.example.daylight;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class Right_main_Fragment extends Fragment {

    private  ListAdapter adapter;
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.right_main, container,false);
        //activity_main.xml2이 인플레이트 되고 자바 소스와 연결됨

        adapter = new ListAdapter(getActivity() , createList(20));
        listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        return rootView;
    }

    // 커스텀 리스트 뷰에 들어갈 데이터를 보여줌
    private List<String> createList(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add("D - " + i);
        }

        return list;
    }
}
