package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException extends Exception {
    public final List a;
    public Key b;
    public DataSource c;
    public Class d;
    public final String e;
    public Exception f;
    public static final StackTraceElement[] g;

    static {
        GlideException.g = new StackTraceElement[0];
    }

    public GlideException(String s) {
        this(s, Collections.emptyList());
    }

    public GlideException(String s, Throwable throwable0) {
        this(s, Collections.singletonList(throwable0));
    }

    public GlideException(String s, List list0) {
        this.e = s;
        this.setStackTrace(GlideException.g);
        this.a = list0;
    }

    public static void a(Throwable throwable0, ArrayList arrayList0) {
        if(throwable0 instanceof GlideException) {
            for(Object object0: ((GlideException)throwable0).getCauses()) {
                GlideException.a(((Throwable)object0), arrayList0);
            }
            return;
        }
        arrayList0.add(throwable0);
    }

    public static void b(List list0, a0 a00) {
        try {
            GlideException.c(list0, a00);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    public static void c(List list0, a0 a00) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            a00.append("Cause (");
            a00.append(String.valueOf(v1 + 1));
            a00.append(" of ");
            a00.append(String.valueOf(v));
            a00.append("): ");
            Throwable throwable0 = (Throwable)list0.get(v1);
            if(throwable0 instanceof GlideException) {
                ((GlideException)throwable0).getClass();
                GlideException.d(((GlideException)throwable0), a00);
                GlideException.b(((GlideException)throwable0).getCauses(), new a0(a00));
            }
            else {
                GlideException.d(throwable0, a00);
            }
        }
    }

    public static void d(Throwable throwable0, Appendable appendable0) {
        try {
            appendable0.append(throwable0.getClass().toString()).append(": ").append(throwable0.getMessage()).append('\n');
        }
        catch(IOException unused_ex) {
            throw new RuntimeException(throwable0);
        }
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

    public List getCauses() {
        return this.a;
    }

    @Override
    public String getMessage() {
        StringBuilder stringBuilder0 = new StringBuilder(71);
        stringBuilder0.append(this.e);
        String s = "";
        stringBuilder0.append((this.d == null ? "" : ", " + this.d));
        stringBuilder0.append((this.c == null ? "" : ", " + this.c));
        if(this.b != null) {
            s = ", " + this.b;
        }
        stringBuilder0.append(s);
        List list0 = this.getRootCauses();
        if(list0.isEmpty()) {
            return stringBuilder0.toString();
        }
        if(list0.size() == 1) {
            stringBuilder0.append("\nThere was 1 root cause:");
        }
        else {
            stringBuilder0.append("\nThere were ");
            stringBuilder0.append(list0.size());
            stringBuilder0.append(" root causes:");
        }
        for(Object object0: list0) {
            stringBuilder0.append('\n');
            stringBuilder0.append(((Throwable)object0).getClass().getName());
            stringBuilder0.append('(');
            stringBuilder0.append(((Throwable)object0).getMessage());
            stringBuilder0.append(')');
        }
        stringBuilder0.append("\n call GlideException#logRootCauses(String) for more detail");
        return stringBuilder0.toString();
    }

    @Nullable
    public Exception getOrigin() {
        return this.f;
    }

    public List getRootCauses() {
        List list0 = new ArrayList();
        GlideException.a(this, ((ArrayList)list0));
        return list0;
    }

    public void logRootCauses(String s) {
        List list0 = this.getRootCauses();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Log.i(s, "Root cause (" + (v1 + 1) + " of " + v + ")", ((Throwable)list0.get(v1)));
        }
    }

    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }

    @Override
    public void printStackTrace(PrintStream printStream0) {
        GlideException.d(this, printStream0);
        GlideException.b(this.getCauses(), new a0(printStream0));
    }

    @Override
    public void printStackTrace(PrintWriter printWriter0) {
        GlideException.d(this, printWriter0);
        GlideException.b(this.getCauses(), new a0(printWriter0));
    }

    public void setOrigin(@Nullable Exception exception0) {
        this.f = exception0;
    }
}

