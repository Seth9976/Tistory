package com.google.android.material.search;

import android.view.View.OnClickListener;
import android.view.View;

public final class i implements View.OnClickListener {
    public final int a;
    public final SearchView b;

    public i(SearchView searchView0, int v) {
        this.a = v;
        this.b = searchView0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SearchView searchView0 = this.b;
        switch(this.a) {
            case 0: {
                searchView0.hide();
                return;
            }
            case 1: {
                searchView0.clearText();
                if(searchView0.x) {
                    searchView0.requestFocusAndShowKeyboard();
                }
                return;
            }
            default: {
                searchView0.show();
            }
        }
    }
}

