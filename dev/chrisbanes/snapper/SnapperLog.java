package dev.chrisbanes.snapper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J+\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u0003\u001A\u00020\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Ldev/chrisbanes/snapper/SnapperLog;", "", "", "tag", "Lkotlin/Function0;", "message", "", "d", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SnapperLog {
    @NotNull
    public static final SnapperLog INSTANCE;

    static {
        SnapperLog.INSTANCE = new SnapperLog();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final void d(@NotNull String s, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(function00, "message");
    }

    public static void d$default(SnapperLog snapperLog0, String s, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            s = "SnapperFlingBehavior";
        }
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(function00, "message");
    }
}

