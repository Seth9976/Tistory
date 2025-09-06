package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001A\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/material3/internal/BasicTooltipDefaults;", "", "Landroidx/compose/foundation/MutatorMutex;", "a", "Landroidx/compose/foundation/MutatorMutex;", "getGlobalMutatorMutex", "()Landroidx/compose/foundation/MutatorMutex;", "GlobalMutatorMutex", "", "TooltipDuration", "J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BasicTooltipDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final BasicTooltipDefaults INSTANCE = null;
    public static final long TooltipDuration = 1500L;
    public static final MutatorMutex a;

    static {
        BasicTooltipDefaults.INSTANCE = new BasicTooltipDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        BasicTooltipDefaults.a = new MutatorMutex();
    }

    @NotNull
    public final MutatorMutex getGlobalMutatorMutex() {
        return BasicTooltipDefaults.a;
    }
}

