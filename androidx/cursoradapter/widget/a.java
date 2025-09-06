package androidx.cursoradapter.widget;

import android.database.ContentObserver;
import android.os.Handler;

public final class a extends ContentObserver {
    public final CursorAdapter a;

    public a(CursorAdapter cursorAdapter0) {
        this.a = cursorAdapter0;
        super(new Handler());
    }

    @Override  // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.onContentChanged();
    }
}

