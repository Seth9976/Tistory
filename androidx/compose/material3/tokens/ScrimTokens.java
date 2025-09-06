package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001A\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/material3/tokens/ScrimTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "", "ContainerOpacity", "F", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ScrimTokens {
    public static final int $stable = 0;
    public static final float ContainerOpacity = 0.32f;
    @NotNull
    public static final ScrimTokens INSTANCE;
    public static final ColorSchemeKeyTokens a;

    static {
        ScrimTokens.INSTANCE = new ScrimTokens();  // 初始化器: Ljava/lang/Object;-><init>()V
        ScrimTokens.a = ColorSchemeKeyTokens.Scrim;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ScrimTokens.a;
    }
}

