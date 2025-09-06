package androidx.work.impl.workers;

import androidx.work.ListenableWorker.Result;
import androidx.work.impl.utils.futures.SettableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000E\n\u0002\b\u0003\"\u0014\u0010\u0001\u001A\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "ARGUMENT_CLASS_NAME", "Ljava/lang/String;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ConstraintTrackingWorkerKt {
    @NotNull
    public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";
    public static final String a;

    // 去混淆评级： 低(20)
    static {
        Intrinsics.checkNotNullExpressionValue("WM-ConstraintTrkngWrkr", "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        ConstraintTrackingWorkerKt.a = "WM-ConstraintTrkngWrkr";
    }

    // 去混淆评级： 低(20)
    public static final String access$getTAG$p() [...] // 潜在的解密器

    public static final boolean access$setFailed(SettableFuture settableFuture0) {
        return settableFuture0.set(Result.failure());
    }

    public static final boolean access$setRetry(SettableFuture settableFuture0) {
        return settableFuture0.set(Result.retry());
    }
}

