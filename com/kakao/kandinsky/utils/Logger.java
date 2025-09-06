package com.kakao.kandinsky.utils;

import android.util.Log;
import fb.a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.p;
import md.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001D\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bJ\u0015\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/kandinsky/utils/Logger;", "", "", "msg", "", "log", "(Ljava/lang/String;)V", "tag", "(Ljava/lang/String;Ljava/lang/String;)V", "error", "utils_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Logger {
    @NotNull
    public static final Logger INSTANCE;
    public static final String a;
    public static final Lazy b;

    static {
        Logger.INSTANCE = new Logger();  // 初始化器: Ljava/lang/Object;-><init>()V
        Logger.a = "java.lang.Object";
        Logger.b = c.lazy(a.w);
    }

    public final void error(@NotNull String s) {
        String s3;
        Intrinsics.checkNotNullParameter(s, "msg");
        StackTraceElement[] arr_stackTraceElement = new Exception().getStackTrace();
        StackTraceElement stackTraceElement0 = arr_stackTraceElement[0];
        int v;
        for(v = 0; v < arr_stackTraceElement.length; ++v) {
            stackTraceElement0 = arr_stackTraceElement[v];
            String s1 = stackTraceElement0.getClassName();
            Intrinsics.checkNotNull(s1);
            Intrinsics.checkNotNullExpressionValue("java.lang.Object", "LOG_CLASS");
            if(!p.startsWith$default(s1, "java.lang.Object", false, 2, null)) {
                break;
            }
        }
        while(v < arr_stackTraceElement.length) {
            stackTraceElement0 = arr_stackTraceElement[v];
            String s2 = stackTraceElement0.getClassName();
            Intrinsics.checkNotNull(s2);
            if(!new Regex("^android\\.app\\..+|^android\\.os\\..+|^com\\.android\\..+|^java\\..+|^android\\.view\\.BWebView\\$BWebViewClient").matches(s2)) {
                break;
            }
            ++v;
        }
        while(v >= arr_stackTraceElement.length) {
            --v;
        }
        while(v >= 0) {
            stackTraceElement0 = arr_stackTraceElement[v];
            if(stackTraceElement0.getLineNumber() >= 0) {
                break;
            }
            --v;
        }
        Intrinsics.checkNotNull(stackTraceElement0);
        if(stackTraceElement0 == null) {
            s3 = "";
        }
        else {
            s3 = String.format(Locale.getDefault(), "(%s:%d)", Arrays.copyOf(new Object[]{stackTraceElement0.getFileName(), stackTraceElement0.getLineNumber()}, 2));
            Intrinsics.checkNotNullExpressionValue(s3, "format(...)");
        }
        Log.println(6, s3, s);
    }

    public final void log(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "msg");
    }

    public final void log(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(s1, "msg");
    }
}

