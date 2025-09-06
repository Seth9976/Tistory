package androidx.room;

import android.os.SystemClock;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class h implements Runnable {
    public final int a;
    public final AutoCloser b;

    public h(AutoCloser autoCloser0, int v) {
        this.a = v;
        this.b = autoCloser0;
        super();
    }

    @Override
    public final void run() {
        Unit unit0;
        if(this.a != 0) {
            AutoCloser autoCloser0 = this.b;
            Intrinsics.checkNotNullParameter(autoCloser0, "this$0");
            synchronized(autoCloser0.c) {
                if(SystemClock.uptimeMillis() - autoCloser0.g < autoCloser0.d) {
                    return;
                }
                goto label_8;
            }
            return;
        label_8:
            if(autoCloser0.f != 0) {
                return;
            }
            Runnable runnable0 = autoCloser0.b;
            if(runnable0 == null) {
                unit0 = null;
            }
            else {
                runnable0.run();
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
            SupportSQLiteDatabase supportSQLiteDatabase0 = autoCloser0.h;
            if(supportSQLiteDatabase0 != null && supportSQLiteDatabase0.isOpen()) {
                supportSQLiteDatabase0.close();
            }
            autoCloser0.h = null;
            return;
        }
        Intrinsics.checkNotNullParameter(this.b, "this$0");
        this.b.e.execute(this.b.k);
    }
}

