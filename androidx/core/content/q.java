package androidx.core.content;

import android.content.LocusId;
import android.os.Handler;
import android.os.Trace;

public abstract class q {
    public static void a(String s, int v) {
        Trace.beginAsyncSection(s, v);
    }

    public static LocusId b(String s) {
        return new LocusId(s);
    }

    public static void c(String s, int v) {
        Trace.endAsyncSection(s, v);
    }

    public static String d(LocusId locusId0) {
        return locusId0.getId();
    }

    public static boolean e(Handler handler0, Runnable runnable0) {
        return handler0.hasCallbacks(runnable0);
    }

    public static void f(String s, int v) {
        Trace.setCounter(s, ((long)v));
    }
}

