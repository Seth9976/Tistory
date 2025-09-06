package androidx.compose.material3;

import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000B\u001A\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\t\u0010\n\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/material3/DividerDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getThickness-D9Ej5fM", "()F", "Thickness", "Landroidx/compose/ui/graphics/Color;", "getColor", "(Landroidx/compose/runtime/Composer;I)J", "color", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DividerDefaults {
    public static final int $stable;
    @NotNull
    public static final DividerDefaults INSTANCE;
    public static final float a;

    static {
        DividerDefaults.INSTANCE = new DividerDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        DividerDefaults.a = DividerTokens.INSTANCE.getThickness-D9Ej5fM();
    }

    @Composable
    @JvmName(name = "getColor")
    public final long getColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x49DF631, v, -1, "androidx.compose.material3.DividerDefaults.<get-color> (Divider.kt:118)");
        }
        long v1 = ColorSchemeKt.getValue(DividerTokens.INSTANCE.getColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public final float getThickness-D9Ej5fM() [...] // 潜在的解密器
}

