package com.example.instajobsv;
//test
import android.os.Bundle;
import android.widget.TabHost;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.view.Menu;
import android.widget.TabHost.OnTabChangeListener;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
         Resources res = getResources();
         TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();
        
    TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
    spec.setContent(R.id.tab1);
    spec.setIndicator("TAB1",res.getDrawable(android.R.drawable.ic_btn_speak_now));
    tabs.addTab(spec);
        
    spec=tabs.newTabSpec("mitab2");
    spec.setContent(R.id.tab2);
    spec.setIndicator("TAB2",res.getDrawable(android.R.drawable.ic_dialog_map));
    tabs.addTab(spec);
    
    spec=tabs.newTabSpec("mitab3");
    spec.setContent(R.id.tab3);
    spec.setIndicator("TAB3",res.getDrawable(android.R.drawable.ic_dialog_map));
    tabs.addTab(spec);
        
    spec=tabs.newTabSpec("mitab4");
    spec.setContent(R.id.tab4);
    spec.setIndicator("TAB4",res.getDrawable(android.R.drawable.ic_dialog_map));
    tabs.addTab(spec);
    
    tabs.setCurrentTab(0);
        
        
    tabs.setOnTabChangedListener(new OnTabChangeListener() {
               public void onTabChanged(String tabId) {
               Log.i("AndroidTabsDemo", "Pulsada pestaña: " + tabId);
               }
             });
           }
    
       
             
}
