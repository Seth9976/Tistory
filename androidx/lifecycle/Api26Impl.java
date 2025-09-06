package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(26)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/Api26Impl;", "", "Ljava/time/Duration;", "timeout", "", "toMillis", "(Ljava/time/Duration;)J", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Api26Impl {
    @NotNull
    public static final Api26Impl INSTANCE;

    static {
        Api26Impl.INSTANCE = new Api26Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final long toMillis(@NotNull Duration duration0) {
        Intrinsics.checkNotNullParameter(duration0, "timeout");
        return duration0.toMillis();
    }
}

