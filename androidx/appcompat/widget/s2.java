package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public final class s2 implements TextView.OnEditorActionListener {
    public final SearchView a;

    public s2(SearchView searchView0) {
        this.a = searchView0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        this.a.i();
        return true;
    }
}

