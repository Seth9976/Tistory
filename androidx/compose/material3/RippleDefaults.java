package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/material3/RippleDefaults;", "", "Landroidx/compose/material/ripple/RippleAlpha;", "a", "Landroidx/compose/material/ripple/RippleAlpha;", "getRippleAlpha", "()Landroidx/compose/material/ripple/RippleAlpha;", "RippleAlpha", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RippleDefaults {
    public static final int $stable;
    @NotNull
    public static final RippleDefaults INSTANCE;
    public static final RippleAlpha a;

    static {
        RippleDefaults.INSTANCE = new RippleDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        RippleDefaults.a = new RippleAlpha(0.16f, 0.1f, 0.08f, 0.1f);
    }

    @NotNull
    public final RippleAlpha getRippleAlpha() {
        return RippleDefaults.a;
    }
}

