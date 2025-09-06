package androidx.appcompat.widget;

import androidx.cursoradapter.widget.CursorAdapter;

public final class n2 implements Runnable {
    public final int a;
    public final SearchView b;

    public n2(SearchView searchView0, int v) {
        this.a = v;
        this.b = searchView0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            CursorAdapter cursorAdapter0 = this.b.R;
            if(cursorAdapter0 instanceof b3) {
                cursorAdapter0.changeCursor(null);
            }
            return;
        }
        this.b.k();
    }
}

