package tw.org.tcca.apps.ftest;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class F2Fragment extends Fragment {
    private MainActivity activity;
    private View mainView;
    private TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v("bradlog", "OK2");
        mainView = inflater.inflate(R.layout.fragment_f2, container, false);
        tv = mainView.findViewById(R.id.f2tv);

        return mainView;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (MainActivity)context;
        Log.v("bradlog", "onAttachF2");
    }
}