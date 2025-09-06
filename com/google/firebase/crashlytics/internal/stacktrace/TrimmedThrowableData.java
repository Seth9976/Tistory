package com.google.firebase.crashlytics.internal.stacktrace;

public class TrimmedThrowableData {
    public final TrimmedThrowableData cause;
    public final String className;
    public final String localizedMessage;
    public final StackTraceElement[] stacktrace;

    public TrimmedThrowableData(Throwable throwable0, StackTraceTrimmingStrategy stackTraceTrimmingStrategy0) {
        this.localizedMessage = throwable0.getLocalizedMessage();
        this.className = throwable0.getClass().getName();
        this.stacktrace = stackTraceTrimmingStrategy0.getTrimmedStackTrace(throwable0.getStackTrace());
        Throwable throwable1 = throwable0.getCause();
        this.cause = throwable1 == null ? null : new TrimmedThrowableData(throwable1, stackTraceTrimmingStrategy0);
    }
}

