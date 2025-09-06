package androidx.appcompat.widget;

import android.view.View.OnFocusChangeListener;
import android.view.View;

public final class o2 implements View.OnFocusChangeListener {
    public final SearchView a;

    public o2(SearchView searchView0) {
        this.a = searchView0;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        SearchView searchView0 = this.a;
        View.OnFocusChangeListener view$OnFocusChangeListener0 = searchView0.M;
        if(view$OnFocusChangeListener0 != null) {
            view$OnFocusChangeListener0.onFocusChange(searchView0, z);
        }
    }
}

