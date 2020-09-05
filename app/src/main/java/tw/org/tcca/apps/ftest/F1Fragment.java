package tw.org.tcca.apps.ftest;

import android.os.Bundle;

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
        tv.setText("" + (int)(Math.random()*49+1));
    }
}