package androidx.core.os;

import android.os.Build.VERSION;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

@Deprecated
public final class TraceCompat {
    public static final long a;
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static final Method e;

    static {
        Class class0 = String.class;
        Class class1 = Trace.class;
        if(Build.VERSION.SDK_INT < 29) {
            try {
                TraceCompat.a = class1.getField("TRACE_TAG_APP").getLong(null);
                Class class2 = Long.TYPE;
                TraceCompat.b = class1.getMethod("isTagEnabled", class2);
                Class class3 = Integer.TYPE;
                TraceCompat.c = class1.getMethod("asyncTraceBegin", class2, class0, class3);
                TraceCompat.d = class1.getMethod("asyncTraceEnd", class2, class0, class3);
                TraceCompat.e = class1.getMethod("traceCounter", class2, class0, class3);
            }
            catch(Exception exception0) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", exception0);
            }
        }
    }

    public static void beginAsyncSection(@NonNull String s, int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            s.a(s, v);
            return;
        }
        try {
            TraceCompat.c.invoke(null, TraceCompat.a, s, v);
        }
        catch(Exception unused_ex) {
            Log.v("TraceCompat", "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    public static void beginSection(@NonNull String s) {
        Trace.beginSection(s);
    }

    public static void endAsyncSection(@NonNull String s, int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            s.b(s, v);
            return;
        }
        try {
            TraceCompat.d.invoke(null, TraceCompat.a, s, v);
        }
        catch(Exception unused_ex) {
            Log.v("TraceCompat", "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    public static void endSection() {
        Trace.endSection();
    }

    public static boolean isEnabled() {
        if(Build.VERSION.SDK_INT >= 29) {
            return s.c();
        }
        try {
            return ((Boolean)TraceCompat.b.invoke(null, TraceCompat.a)).booleanValue();
        }
        catch(Exception unused_ex) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void setCounter(@NonNull String s, int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            s.d(s, ((long)v));
            return;
        }
        try {
            TraceCompat.e.invoke(null, TraceCompat.a, s, v);
        }
        catch(Exception unused_ex) {
            Log.v("TraceCompat", "Unable to invoke traceCounter() via reflection.");
        }
    }
}

