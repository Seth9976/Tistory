package androidx.work.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000E\n\u0002\b\u0003\"\u0014\u0010\u0001\u001A\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "WORK_DATABASE_NAME", "Ljava/lang/String;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class WorkDatabasePathHelperKt {
    @NotNull
    public static final String WORK_DATABASE_NAME = "androidx.work.workdb";
    public static final String a;
    public static final String[] b;

    static {
        Intrinsics.checkNotNullExpressionValue("WM-WrkDbPathHelper", "tagWithPrefix(\"WrkDbPathHelper\")");
        WorkDatabasePathHelperKt.a = "WM-WrkDbPathHelper";
        WorkDatabasePathHelperKt.b = new String[]{"-journal", "-shm", "-wal"};
    }

    public static final String[] access$getDATABASE_EXTRA_FILES$p() {
        return WorkDatabasePathHelperKt.b;
    }

    // 去混淆评级： 低(20)
    public static final String access$getTAG$p() [...] // 潜在的解密器
}

