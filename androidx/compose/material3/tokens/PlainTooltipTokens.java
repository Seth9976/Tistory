package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0010\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006R\u0017\u0010\u0016\u001A\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/tokens/PlainTooltipTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "b", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "c", "getSupportingTextColor", "SupportingTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "d", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getSupportingTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "SupportingTextFont", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PlainTooltipTokens {
    public static final int $stable;
    @NotNull
    public static final PlainTooltipTokens INSTANCE;
    public static final ColorSchemeKeyTokens a;
    public static final ShapeKeyTokens b;
    public static final ColorSchemeKeyTokens c;
    public static final TypographyKeyTokens d;

    static {
        PlainTooltipTokens.INSTANCE = new PlainTooltipTokens();  // 初始化器: Ljava/lang/Object;-><init>()V
        PlainTooltipTokens.a = ColorSchemeKeyTokens.InverseSurface;
        PlainTooltipTokens.b = ShapeKeyTokens.CornerExtraSmall;
        PlainTooltipTokens.c = ColorSchemeKeyTokens.InverseOnSurface;
        PlainTooltipTokens.d = TypographyKeyTokens.BodySmall;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return PlainTooltipTokens.a;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return PlainTooltipTokens.b;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSupportingTextColor() {
        return PlainTooltipTokens.c;
    }

    @NotNull
    public final TypographyKeyTokens getSupportingTextFont() {
        return PlainTooltipTokens.d;
    }
}

