package com.kakao.android.base.utils;

import java.text.NumberFormat;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/android/base/utils/StringUtils;", "", "", "number", "", "getNumberFormat", "(J)Ljava/lang/String;", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class StringUtils {
    @NotNull
    public static final StringUtils INSTANCE;

    static {
        StringUtils.INSTANCE = new StringUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final String getNumberFormat(long v) {
        String s = NumberFormat.getInstance().format(v);
        Intrinsics.checkNotNullExpressionValue(s, "format(...)");
        return s;
    }
}

