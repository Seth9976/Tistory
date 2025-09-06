package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/internal/PredictiveBack;", "", "", "progress", "transform$material3_release", "(F)F", "transform", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PredictiveBack {
    public static final int $stable;
    @NotNull
    public static final PredictiveBack INSTANCE;

    static {
        PredictiveBack.INSTANCE = new PredictiveBack();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final float transform$material3_release(float f) {
        return PredictiveBack_androidKt.access$getPredictiveBackEasing$p().transform(f);
    }
}

