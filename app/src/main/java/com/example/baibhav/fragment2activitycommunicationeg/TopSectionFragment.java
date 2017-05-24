package com.example.baibhav.fragment2activitycommunicationeg;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Baibhav on 5/24/2017.
 */

public class TopSectionFragment extends Fragment {

    //connected the xml et to the java file!
    EditText message_et=(EditText) getView().findViewById(R.id.et_message);

    TopMessageFragment fragment2activity;

    public interface TopMessageFragment{

        public void messagepasser(String msg);


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            fragment2activity=(TopMessageFragment) context;
        }catch (ClassCastException e){

                throw new ClassCastException(getActivity().toString()
                    +"must implement TopMessageFragment");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.top_section_fragment,container,false);
        
        Button send_btn=(Button) getView().findViewById(R.id.btn_send);
        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonpressed(v);        
            }
        });
        
        return view;
    }

    private void buttonpressed(View v) {

        fragment2activity.messagepasser(message_et.getText().toString());


    }
}
