package androidx.core.os;

import android.os.Trace;
import androidx.annotation.DoNotInline;

public abstract class s {
    @DoNotInline
    public static void a(String s, int v) {
        Trace.beginAsyncSection(s, v);
    }

    @DoNotInline
    public static void b(String s, int v) {
        Trace.endAsyncSection(s, v);
    }

    @DoNotInline
    public static boolean c() {
        return Trace.isEnabled();
    }

    @DoNotInline
    public static void d(String s, long v) {
        Trace.setCounter(s, v);
    }
}

