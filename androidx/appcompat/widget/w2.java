package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;

public final class w2 implements Runnable {
    public final SearchAutoComplete a;

    public w2(SearchAutoComplete searchView$SearchAutoComplete0) {
        this.a = searchView$SearchAutoComplete0;
    }

    @Override
    public final void run() {
        SearchAutoComplete searchView$SearchAutoComplete0 = this.a;
        if(searchView$SearchAutoComplete0.g) {
            ((InputMethodManager)searchView$SearchAutoComplete0.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete0, 0);
            searchView$SearchAutoComplete0.g = false;
        }
    }
}

