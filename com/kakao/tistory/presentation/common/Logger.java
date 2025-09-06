package com.kakao.tistory.presentation.common;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001D\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bJ\u0015\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/common/Logger;", "", "", "msg", "", "log", "(Ljava/lang/String;)V", "tag", "(Ljava/lang/String;Ljava/lang/String;)V", "error", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Logger {
    public static final int $stable = 0;
    @NotNull
    public static final Logger INSTANCE = null;
    public static final String a = "com.kakao.tistory.presentation.common.Logger";

    static {
        Logger.INSTANCE = new Logger();
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
            Intrinsics.checkNotNullExpressionValue("com.kakao.tistory.presentation.common.Logger", "LOG_CLASS");
            if(!p.startsWith$default(s1, "com.kakao.tistory.presentation.common.Logger", false, 2, null)) {
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

