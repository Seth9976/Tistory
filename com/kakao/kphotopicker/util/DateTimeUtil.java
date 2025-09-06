package com.kakao.kphotopicker.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/kphotopicker/util/DateTimeUtil;", "", "", "timestamp", "", "getDateTimeWithTimeStamp", "(J)Ljava/lang/String;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DateTimeUtil {
    @NotNull
    public static final DateTimeUtil INSTANCE;

    static {
        DateTimeUtil.INSTANCE = new DateTimeUtil();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final String getDateTimeWithTimeStamp(long v) {
        String s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(v));
        Intrinsics.checkNotNullExpressionValue(s, "format(...)");
        return s;
    }
}

