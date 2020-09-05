package tw.org.tcca.apps.ftest;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class F1Fragment extends Fragment {
    private Button btn;
    private TextView tv;
    private View mainView;
    private MainActivity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_f1, container, false);
            btn = mainView.findViewById(R.id.f1_btn);
            tv = mainView.findViewById(R.id.lotto);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    createLotto();
                }
            });
        }

        return mainView;
    }

    private void createLotto(){
        String mesg = "" + (int)(Math.random()*49+1);
        tv.setText(mesg);
        activity.changeTV(mesg);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (MainActivity)context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("bradlog", "onDetach");
    }
}