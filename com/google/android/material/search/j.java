package com.google.android.material.search;

import android.widget.EditText;
import com.google.android.material.internal.ViewUtils;

public final class j implements Runnable {
    public final int a;
    public final SearchView b;

    public j(SearchView searchView0, int v) {
        this.a = v;
        this.b = searchView0;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                SearchView searchView1 = this.b;
                EditText editText0 = searchView1.j;
                editText0.clearFocus();
                SearchBar searchBar0 = searchView1.t;
                if(searchBar0 != null) {
                    searchBar0.requestFocus();
                }
                ViewUtils.hideKeyboard(editText0, searchView1.z);
                return;
            }
            case 1: {
                SearchView searchView2 = this.b;
                EditText editText1 = searchView2.j;
                if(editText1.requestFocus()) {
                    editText1.sendAccessibilityEvent(8);
                }
                ViewUtils.showKeyboard(editText1, searchView2.z);
                return;
            }
            case 2: {
                this.b.show();
                return;
            }
            default: {
                SearchView searchView0 = this.b;
                if(searchView0.x) {
                    searchView0.requestFocusAndShowKeyboard();
                }
            }
        }
    }
}

