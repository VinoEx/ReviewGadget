package com.example.btgadget;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContactFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ContactFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContactFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContactFragment newInstance(String param1, String param2) {
        ContactFragment fragment = new ContactFragment();
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
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        ImageView imageView1 = view.findViewById(R.id.imageView);
        ImageView imageView2 = view.findViewById(R.id.imageView2);
        ImageView imageView3 = view.findViewById(R.id.imageView3);
        ImageView imageView4 = view.findViewById(R.id.imageView4);

        imageView1.setOnClickListener(v -> onImageClick(v, "https://instagram.com/alvintoanggoro?igshid=OGQ5ZDc2ODk2ZA=="));
        imageView2.setOnClickListener(v -> onImageClick(v, "https://instagram.com/fvn_ptr?igshid=M2RkZGJiMzhjOQ=="));
        imageView3.setOnClickListener(v -> onImageClick(v, "https://instagram.com/xyurainhere?igshid=NGVhN2U2NjQ0Yg=="));
        imageView4.setOnClickListener(v -> onImageClick(v, "https://instagram.com/istinm.23?igshid=MzMyNGUyNmU2YQ=="));

        return view;
    }

    public void onImageClick(View view, String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse(url);
        intent.setData(uri);
        startActivity(intent);
    }
}