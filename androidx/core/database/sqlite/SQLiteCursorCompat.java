package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import e3.a;

public final class SQLiteCursorCompat {
    public static void setFillWindowForwardOnly(@NonNull SQLiteCursor sQLiteCursor0, boolean z) {
        if(Build.VERSION.SDK_INT >= 28) {
            a.a(sQLiteCursor0, z);
        }
    }
}

