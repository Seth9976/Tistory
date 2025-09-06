package androidx.cursoradapter.widget;

import android.database.DataSetObserver;

public final class b extends DataSetObserver {
    public final CursorAdapter a;

    public b(CursorAdapter cursorAdapter0) {
        this.a = cursorAdapter0;
        super();
    }

    @Override  // android.database.DataSetObserver
    public final void onChanged() {
        this.a.mDataValid = true;
        this.a.notifyDataSetChanged();
    }

    @Override  // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.mDataValid = false;
        this.a.notifyDataSetInvalidated();
    }
}

