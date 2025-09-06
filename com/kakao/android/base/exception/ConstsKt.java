package com.kakao.android.base.exception;

import com.kakao.android.base.BaseKt;
import com.kakao.android.base.R.string;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\t\"\u001A\u0010\u0001\u001A\u00020\u00008\u0006X\u0087T¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0003\u0010\u0004\"\u001A\u0010\u0006\u001A\u00020\u00058\u0006X\u0087T¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\u0004\" \u0010\r\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0007\u0012\u0004\b\f\u0010\u0004\u001A\u0004\b\n\u0010\u000B¨\u0006\u000E"}, d2 = {"", "EXCEPTION_UNKNOWN_CODE", "I", "getEXCEPTION_UNKNOWN_CODE$annotations", "()V", "", "EXCEPTION_UNKNOWN_STATUS", "Ljava/lang/String;", "getEXCEPTION_UNKNOWN_STATUS$annotations", "a", "getEXCEPTION_UNKNOWN_TITLE", "()Ljava/lang/String;", "getEXCEPTION_UNKNOWN_TITLE$annotations", "EXCEPTION_UNKNOWN_TITLE", "base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ConstsKt {
    public static final int EXCEPTION_UNKNOWN_CODE = -1;
    @NotNull
    public static final String EXCEPTION_UNKNOWN_STATUS = "EXCEPTION_UNKNOWN_STATUS";
    public static final String a;

    static {
        String s = BaseKt.getAppContext().getString(string.label_exception_unknown_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        ConstsKt.a = s;
    }

    @Deprecated(message = "don\'t use")
    public static void getEXCEPTION_UNKNOWN_CODE$annotations() {
    }

    @Deprecated(message = "don\'t use")
    public static void getEXCEPTION_UNKNOWN_STATUS$annotations() {
    }

    @NotNull
    public static final String getEXCEPTION_UNKNOWN_TITLE() {
        return ConstsKt.a;
    }

    @Deprecated(message = "don\'t use")
    public static void getEXCEPTION_UNKNOWN_TITLE$annotations() {
    }
}

