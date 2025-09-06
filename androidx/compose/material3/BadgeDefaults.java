package androidx.compose.material3;

import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0005\u001A\u00020\u00028Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/BadgeDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BadgeDefaults {
    public static final int $stable;
    @NotNull
    public static final BadgeDefaults INSTANCE;

    static {
        BadgeDefaults.INSTANCE = new BadgeDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCC4468B7, v, -1, "androidx.compose.material3.BadgeDefaults.<get-containerColor> (Badge.kt:222)");
        }
        long v1 = ColorSchemeKt.getValue(BadgeTokens.INSTANCE.getColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }
}

