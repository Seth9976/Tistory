package androidx.appcompat.widget;

import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.View;

public final class r2 implements View.OnKeyListener {
    public final SearchView a;

    public r2(SearchView searchView0) {
        this.a = searchView0;
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        SearchView searchView0 = this.a;
        if(searchView0.f0 == null) {
            return false;
        }
        SearchAutoComplete searchView$SearchAutoComplete0 = searchView0.p;
        if(searchView$SearchAutoComplete0.isPopupShowing() && searchView$SearchAutoComplete0.getListSelection() != -1) {
            if(searchView0.f0 != null && searchView0.R != null && keyEvent0.getAction() == 0 && keyEvent0.hasNoModifiers()) {
                switch(v) {
                    case 19: {
                        searchView$SearchAutoComplete0.getListSelection();
                        return false;
                    }
                    case 21: 
                    case 22: {
                        searchView$SearchAutoComplete0.setSelection((v == 21 ? 0 : searchView$SearchAutoComplete0.length()));
                        searchView$SearchAutoComplete0.setListSelection(0);
                        searchView$SearchAutoComplete0.clearListSelection();
                        searchView$SearchAutoComplete0.a();
                        return true;
                    }
                    case 61: 
                    case 66: 
                    case 84: {
                        return searchView0.g(searchView$SearchAutoComplete0.getListSelection());
                    }
                    default: {
                        return false;
                    }
                }
            }
            return false;
        }
        if(TextUtils.getTrimmedLength(searchView$SearchAutoComplete0.getText()) != 0 && keyEvent0.hasNoModifiers() && keyEvent0.getAction() == 1 && v == 66) {
            view0.cancelLongPress();
            Intent intent0 = searchView0.c(null, "android.intent.action.SEARCH", null, searchView$SearchAutoComplete0.getText().toString());
            searchView0.getContext().startActivity(intent0);
            return true;
        }
        return false;
    }
}

