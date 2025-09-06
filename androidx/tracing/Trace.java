package androidx.tracing;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.q;
import androidx.webkit.internal.k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Trace {
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;
    public static Method e;

    public static void a(String s, Exception exception0) {
        if(exception0 instanceof InvocationTargetException) {
            Throwable throwable0 = exception0.getCause();
            throw throwable0 instanceof RuntimeException ? ((RuntimeException)throwable0) : new RuntimeException(throwable0);
        }
        Log.v("Trace", "Unable to call " + s + " via reflection", exception0);
    }

    @SuppressLint({"NewApi"})
    public static void beginAsyncSection(@NonNull String s, int v) {
        try {
            if(Trace.c == null) {
                q.a(s, v);
                return;
            }
            goto label_3;
        }
        catch(NoSuchMethodError | NoClassDefFoundError unused_ex) {
            try {
            label_3:
                if(Trace.c == null) {
                    Trace.c = android.os.Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                Trace.c.invoke(null, Trace.a, s, v);
                return;
            }
            catch(Exception exception0) {
            }
            Trace.a("asyncTraceBegin", exception0);
        }
    }

    public static void beginSection(@NonNull String s) {
        android.os.Trace.beginSection(s);
    }

    @SuppressLint({"NewApi"})
    public static void endAsyncSection(@NonNull String s, int v) {
        try {
            if(Trace.d == null) {
                q.c(s, v);
                return;
            }
            goto label_3;
        }
        catch(NoSuchMethodError | NoClassDefFoundError unused_ex) {
            try {
            label_3:
                if(Trace.d == null) {
                    Trace.d = android.os.Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                }
                Trace.d.invoke(null, Trace.a, s, v);
                return;
            }
            catch(Exception exception0) {
            }
            Trace.a("asyncTraceEnd", exception0);
        }
    }

    public static void endSection() {
        android.os.Trace.endSection();
    }

    @SuppressLint({"NewApi"})
    public static boolean isEnabled() {
        try {
            if(Trace.b == null) {
                return k.x();
            }
            goto label_2;
        }
        catch(NoSuchMethodError | NoClassDefFoundError unused_ex) {
            try {
            label_2:
                Class class0 = android.os.Trace.class;
                if(Trace.b == null) {
                    Trace.a = class0.getField("TRACE_TAG_APP").getLong(null);
                    Trace.b = class0.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean)Trace.b.invoke(null, Trace.a)).booleanValue();
            }
            catch(Exception exception0) {
            }
            Trace.a("isTagEnabled", exception0);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void setCounter(@NonNull String s, int v) {
        try {
            if(Trace.e == null) {
                q.f(s, v);
                return;
            }
            goto label_3;
        }
        catch(NoSuchMethodError | NoClassDefFoundError unused_ex) {
            try {
            label_3:
                if(Trace.e == null) {
                    Trace.e = android.os.Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                }
                Trace.e.invoke(null, Trace.a, s, v);
                return;
            }
            catch(Exception exception0) {
            }
            Trace.a("traceCounter", exception0);
        }
    }
}

