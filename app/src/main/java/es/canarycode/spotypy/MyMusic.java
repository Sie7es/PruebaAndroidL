package es.canarycode.spotypy;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import es.canarycode.spotypy.fragments.AmigosFragment;
import es.canarycode.spotypy.fragments.DestacadosFragment;
import es.canarycode.spotypy.fragments.ProfileFragment;


public class MyMusic extends Activity implements ActionBar.TabListener{
    private ActionBar actionBar;
    private Fragment fragments[]  = new Fragment[] {
        new DestacadosFragment(),
        new AmigosFragment(),
        new ProfileFragment()
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        setTabs();

        FragmentManager manager =getFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        //Los asignamos y ocultamos fragmentos
        for (Fragment fragment : fragments) {
            fragmentTransaction.add(R.id.main_music, fragment).hide(fragment);
        }

        //Mostramos el primer fragmento
        fragmentTransaction.show(fragments[0]).commit();


    }


    private void hideFragments() {

    }


    private void setTabs() {
        //Obtenemos el ActionBar y le decimos que nuestra navegación será por tabs
        actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("Destacados").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Amigos").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Perfil").setTabListener(this));

    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
       for (Fragment fragment : fragments) {
           ft.hide(fragment);
       }
        ft.show(fragments[tab.getPosition()]);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
