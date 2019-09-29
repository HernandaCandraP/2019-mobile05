package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HanstandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupsFragment;

public class PraktikumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum);
    }

    public void hadlePushups(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        PushupsFragment pushupsFragment = (PushupsFragment) getSupportFragmentManager().findFragmentByTag("PUSHUPS_FRAGMENT");
        if(pushupsFragment != null && pushupsFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.praktikumlayout, new PushupsFragment(), "PUSHUPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void hadleHandstand(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        HanstandFragment hanstandFragment = (HanstandFragment) getSupportFragmentManager().findFragmentByTag("HANSTAND_FRAGMENT");
        if(hanstandFragment != null && hanstandFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.praktikumlayout, new HanstandFragment(), "HANSTAND_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void hadleDips(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        DipsFragment dipsFragment = (DipsFragment) getSupportFragmentManager().findFragmentByTag("DIPS_FRAGMENT");
        if(dipsFragment != null && dipsFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.praktikumlayout, new DipsFragment(), "DIPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
