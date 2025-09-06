package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;

public final class o0 implements AdapterView.OnItemSelectedListener {
    public final OnNavigationListener a;

    public o0(OnNavigationListener actionBar$OnNavigationListener0) {
        this.a = actionBar$OnNavigationListener0;
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        OnNavigationListener actionBar$OnNavigationListener0 = this.a;
        if(actionBar$OnNavigationListener0 != null) {
            actionBar$OnNavigationListener0.onNavigationItemSelected(v, v1);
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}

