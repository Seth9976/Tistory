package io.reactivex.exceptions;

import bd.a;
import g.b;
import io.reactivex.annotations.NonNull;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public final class CompositeException extends RuntimeException {
    public final List a;
    public final String b;
    public a c;

    public CompositeException(@NonNull Iterable iterable0) {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        ArrayList arrayList0 = new ArrayList();
        if(iterable0 == null) {
            linkedHashSet0.add(new NullPointerException("errors was null"));
        }
        else {
            for(Object object0: iterable0) {
                Throwable throwable0 = (Throwable)object0;
                if(throwable0 instanceof CompositeException) {
                    linkedHashSet0.addAll(((CompositeException)throwable0).getExceptions());
                }
                else if(throwable0 == null) {
                    linkedHashSet0.add(new NullPointerException("Throwable was null!"));
                }
                else {
                    linkedHashSet0.add(throwable0);
                }
            }
        }
        if(linkedHashSet0.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList0.addAll(linkedHashSet0);
        List list0 = Collections.unmodifiableList(arrayList0);
        this.a = list0;
        this.b = list0.size() + " exceptions occurred. ";
    }

    public CompositeException(@NonNull Throwable[] arr_throwable) {
        this((arr_throwable == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(arr_throwable)));
    }

    public static void a(StringBuilder stringBuilder0, Throwable throwable0, String s) {
        stringBuilder0.append(s);
        stringBuilder0.append(throwable0);
        stringBuilder0.append('\n');
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
            stringBuilder0.append("\t\tat ");
            stringBuilder0.append(stackTraceElement0);
            stringBuilder0.append('\n');
        }
        if(throwable0.getCause() != null) {
            stringBuilder0.append("\tCaused by: ");
            CompositeException.a(stringBuilder0, throwable0.getCause(), "");
        }
    }

    public final void b(b b0) {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append(this);
        stringBuilder0.append('\n');
        StackTraceElement[] arr_stackTraceElement = this.getStackTrace();
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
            stringBuilder0.append("\tat ");
            stringBuilder0.append(stackTraceElement0);
            stringBuilder0.append('\n');
        }
        int v1 = 1;
        for(Object object0: this.a) {
            stringBuilder0.append("  ComposedException ");
            stringBuilder0.append(v1);
            stringBuilder0.append(" :\n");
            CompositeException.a(stringBuilder0, ((Throwable)object0), "\t");
            ++v1;
        }
        b0.w(stringBuilder0.toString());
    }

    @Override
    @NonNull
    public Throwable getCause() {
        synchronized(this) {
            if(this.c == null) {
                a a0 = new a();
                HashSet hashSet0 = new HashSet();
                Throwable throwable0 = a0;
                for(Object object0: this.a) {
                    Throwable throwable1 = (Throwable)object0;
                    if(hashSet0.contains(throwable1)) {
                        continue;
                    }
                    hashSet0.add(throwable1);
                    ArrayList arrayList0 = new ArrayList();
                    Throwable throwable2 = throwable1.getCause();
                    if(throwable2 != null && throwable2 != throwable1) {
                        while(true) {
                            arrayList0.add(throwable2);
                            Throwable throwable3 = throwable2.getCause();
                            if(throwable3 == null || throwable3 == throwable2) {
                                break;
                            }
                            throwable2 = throwable3;
                        }
                    }
                    for(Object object1: arrayList0) {
                        Throwable throwable4 = (Throwable)object1;
                        if(hashSet0.contains(throwable4)) {
                            throwable1 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        }
                        else {
                            hashSet0.add(throwable4);
                        }
                    }
                    try {
                        throwable0.initCause(throwable1);
                    }
                    catch(Throwable unused_ex) {
                    }
                    Throwable throwable5 = throwable0.getCause();
                    if(throwable5 == null || throwable0 == throwable5) {
                        continue;
                        while(true) {
                        label_32:
                            Throwable throwable6 = throwable5.getCause();
                            if(throwable6 == null || throwable6 == throwable5) {
                                break;
                            }
                            throwable5 = throwable6;
                        }
                        throwable0 = throwable5;
                        continue;
                    }
                    else {
                        goto label_32;
                    }
                    return this.c;
                }
                this.c = a0;
            }
            return this.c;
        }
    }

    @NonNull
    public List getExceptions() {
        return this.a;
    }

    @Override
    @NonNull
    public String getMessage() {
        return this.b;
    }

    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }

    @Override
    public void printStackTrace(PrintStream printStream0) {
        this.b(new bd.b(printStream0, 0));
    }

    @Override
    public void printStackTrace(PrintWriter printWriter0) {
        this.b(new bd.b(printWriter0, 1));
    }

    public int size() {
        return this.a.size();
    }
}

