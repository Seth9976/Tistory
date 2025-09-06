package com.kakao.common.util;

import a5.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001A\u00020\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/common/util/StringUtil;", "", "", "size", "", "getFormattedSize", "(J)Ljava/lang/String;", "formatString", "(Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/String;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class StringUtil {
    @NotNull
    public static final StringUtil INSTANCE;

    static {
        StringUtil.INSTANCE = new StringUtil();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final String getFormattedSize(long v) {
        return this.getFormattedSize(v, "%.2f %s");
    }

    @NotNull
    public final String getFormattedSize(@Nullable Long long0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "formatString");
        List list0 = CollectionsKt__CollectionsKt.listOf(new String[]{"bytes", "KB", "MB", "GB", "TB", "PB"});
        float f = long0 == null ? 0.0f : ((float)(((long)long0)));
        int v;
        for(v = 0; f > 1024.0f && v != list0.size() - 1; ++v) {
            f /= 1024.0f;
        }
        return b.f(2, s, "format(...)", new Object[]{f, list0.get(v)});
    }

    public static String getFormattedSize$default(StringUtil stringUtil0, Long long0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            s = "%.2f %s";
        }
        return stringUtil0.getFormattedSize(long0, s);
    }
}

