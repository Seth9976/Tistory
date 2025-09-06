package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\r\u001A\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000E"}, d2 = {"Landroidx/compose/material3/tokens/DividerTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Color", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getThickness-D9Ej5fM", "()F", "Thickness", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDividerTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DividerTokens.kt\nandroidx/compose/material3/tokens/DividerTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,27:1\n158#2:28\n*S KotlinDebug\n*F\n+ 1 DividerTokens.kt\nandroidx/compose/material3/tokens/DividerTokens\n*L\n25#1:28\n*E\n"})
public final class DividerTokens {
    public static final int $stable;
    @NotNull
    public static final DividerTokens INSTANCE;
    public static final ColorSchemeKeyTokens a;
    public static final float b;

    static {
        DividerTokens.INSTANCE = new DividerTokens();  // 初始化器: Ljava/lang/Object;-><init>()V
        DividerTokens.a = ColorSchemeKeyTokens.OutlineVariant;
        DividerTokens.b = 1.0f;
    }

    @NotNull
    public final ColorSchemeKeyTokens getColor() {
        return DividerTokens.a;
    }

    public final float getThickness-D9Ej5fM() {
        return DividerTokens.b;
    }
}

