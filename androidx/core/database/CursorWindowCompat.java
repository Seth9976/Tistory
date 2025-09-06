package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import d3.a;

public final class CursorWindowCompat {
    @NonNull
    public static CursorWindow create(@Nullable String s, long v) {
        return Build.VERSION.SDK_INT < 28 ? new CursorWindow(s) : a.a(s, v);
    }
}

