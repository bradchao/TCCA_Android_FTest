package tw.org.tcca.apps.ftest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private F1Fragment f1;
    private F2Fragment f2;
    private F3Fragment f3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fmgr = getSupportFragmentManager();
        f1 = new F1Fragment();
        f2 = new F2Fragment();
        f3 = new F3Fragment();

        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.add(R.id.container, f1);
        transaction.commit();
    }

    public void gotoF1(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f1);
        transaction.commit();
    }
    public void gotoF2(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f2);
        transaction.commit();
    }
    public void gotoF3(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f3);
        transaction.commit();
    }
}