package com.kakao.editortracker;

import android.util.Log;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n\"\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000E\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n\"\u00020\u0001¢\u0006\u0004\b\u000E\u0010\rJ1\u0010\u000F\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n\"\u00020\u0001¢\u0006\u0004\b\u000F\u0010\rJ1\u0010\u0010\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n\"\u00020\u0001¢\u0006\u0004\b\u0010\u0010\rJ1\u0010\u0011\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n\"\u00020\u0001¢\u0006\u0004\b\u0011\u0010\rR\"\u0010\u0015\u001A\u00020\u00128\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/kakao/editortracker/Logger;", "", "", "loggingLevel", "", "setLoggingLevel", "(I)V", "", "tag", "format", "", "args", "verbose", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "debug", "info", "warn", "error", "", "a", "Z", "isEnabled", "()Z", "setEnabled", "(Z)V", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/kakao/editortracker/Logger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
public final class Logger {
    @NotNull
    public static final Logger INSTANCE = null;
    public static boolean a = false;
    public static int b = 3;

    static {
        Logger.INSTANCE = new Logger();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static void a(int v, String s, String s1, Object[] arr_object) {
        String s3;
        if(Logger.a && v >= Logger.b) {
            try {
                Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
                String s2 = String.format(s1, Arrays.copyOf(arr_object1, arr_object1.length));
                Intrinsics.checkNotNullExpressionValue(s2, "format(...)");
                s3 = s2;
            }
            catch(Throwable throwable0) {
                s3 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            if(!Result.isFailure-impl(s3)) {
                s1 = s3;
            }
            switch(v) {
                case 2: {
                    Log.v(s, s1);
                    break;
                }
                case 3: {
                    Log.d(s, s1);
                    return;
                }
                case 4: {
                    Log.i(s, s1);
                    return;
                }
                case 5: {
                    Log.w(s, s1);
                    return;
                }
                case 6: {
                    Log.e(s, s1);
                }
            }
        }
    }

    public final void debug(@NotNull String s, @NotNull String s1, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(s1, "format");
        Intrinsics.checkNotNullParameter(arr_object, "args");
        Logger.a(3, s, s1, Arrays.copyOf(arr_object, arr_object.length));
    }

    public final void error(@NotNull String s, @NotNull String s1, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(s1, "format");
        Intrinsics.checkNotNullParameter(arr_object, "args");
        Logger.a(6, s, s1, Arrays.copyOf(arr_object, arr_object.length));
    }

    public final void info(@NotNull String s, @NotNull String s1, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(s1, "format");
        Intrinsics.checkNotNullParameter(arr_object, "args");
        Logger.a(4, s, s1, Arrays.copyOf(arr_object, arr_object.length));
    }

    public final boolean isEnabled() {
        return Logger.a;
    }

    public final void setEnabled(boolean z) {
        Logger.a = z;
    }

    public final void setLoggingLevel(int v) {
        Logger.b = v;
    }

    public final void verbose(@NotNull String s, @NotNull String s1, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(s1, "format");
        Intrinsics.checkNotNullParameter(arr_object, "args");
        Logger.a(2, s, s1, Arrays.copyOf(arr_object, arr_object.length));
    }

    public final void warn(@NotNull String s, @NotNull String s1, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(s1, "format");
        Intrinsics.checkNotNullParameter(arr_object, "args");
        Logger.a(5, s, s1, Arrays.copyOf(arr_object, arr_object.length));
    }
}

