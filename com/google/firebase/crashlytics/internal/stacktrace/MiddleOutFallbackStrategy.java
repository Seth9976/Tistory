package com.google.firebase.crashlytics.internal.stacktrace;

public class MiddleOutFallbackStrategy implements StackTraceTrimmingStrategy {
    public final int a;
    public final StackTraceTrimmingStrategy[] b;
    public final MiddleOutStrategy c;

    public MiddleOutFallbackStrategy(int v, StackTraceTrimmingStrategy[] arr_stackTraceTrimmingStrategy) {
        this.a = v;
        this.b = arr_stackTraceTrimmingStrategy;
        this.c = new MiddleOutStrategy(v);
    }

    @Override  // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] arr_stackTraceElement) {
        int v = this.a;
        if(arr_stackTraceElement.length <= v) {
            return arr_stackTraceElement;
        }
        StackTraceTrimmingStrategy[] arr_stackTraceTrimmingStrategy = this.b;
        StackTraceElement[] arr_stackTraceElement1 = arr_stackTraceElement;
        for(int v1 = 0; v1 < arr_stackTraceTrimmingStrategy.length; ++v1) {
            StackTraceTrimmingStrategy stackTraceTrimmingStrategy0 = arr_stackTraceTrimmingStrategy[v1];
            if(arr_stackTraceElement1.length <= v) {
                break;
            }
            arr_stackTraceElement1 = stackTraceTrimmingStrategy0.getTrimmedStackTrace(arr_stackTraceElement);
        }
        return arr_stackTraceElement1.length <= v ? arr_stackTraceElement1 : this.c.getTrimmedStackTrace(arr_stackTraceElement1);
    }
}

