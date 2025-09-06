package com.kakao.android.base;

import android.content.Context;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\t\"(\u0010\u0001\u001A\u00020\u00008\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"*\u0010\u0011\u001A\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000E¢\u0006\u0018\n\u0004\b\n\u0010\u000B\u0012\u0004\b\u0010\u0010\b\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000F¨\u0006\u0012"}, d2 = {"Landroid/content/Context;", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "getAppContext$annotations", "()V", "", "a", "Ljava/lang/String;", "getCurrentClassName", "()Ljava/lang/String;", "setCurrentClassName", "(Ljava/lang/String;)V", "getCurrentClassName$annotations", "currentClassName", "base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BaseKt {
    public static String a;
    public static Context appContext;

    @NotNull
    public static final Context getAppContext() [...] // Inlined contents

    @Deprecated(message = "don\'t use")
    public static void getAppContext$annotations() {
    }

    @Nullable
    public static final String getCurrentClassName() {
        return BaseKt.a;
    }

    @Deprecated(message = "don\'t use")
    public static void getCurrentClassName$annotations() {
    }

    public static final void setAppContext(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "<set-?>");
        BaseKt.appContext = context0;
    }

    public static final void setCurrentClassName(@Nullable String s) {
        BaseKt.a = s;
    }
}

