package com.google.android.material.tabs;

import android.view.View.OnLayoutChangeListener;
import android.view.View;

public final class b implements View.OnLayoutChangeListener {
    public final View a;
    public final TabView b;

    public b(TabView tabLayout$TabView0, View view0) {
        this.b = tabLayout$TabView0;
        this.a = view0;
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        View view1 = this.a;
        if(view1.getVisibility() == 0) {
            this.b.f(view1);
        }
    }
}

