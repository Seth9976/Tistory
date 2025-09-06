package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u0017\u0010\u0013\u001A\u00020\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001A\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u001D\u0010\u001F\u001A\u00020\u001A8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0017\u0010\"\u001A\u00020\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001A\u0004\b!\u0010\u0018R\u001D\u0010%\u001A\u00020\u001A8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u001C\u001A\u0004\b$\u0010\u001E\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/material3/tokens/BadgeTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Color", "b", "getLargeColor", "LargeColor", "c", "getLargeLabelTextColor", "LargeLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "d", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLargeLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LargeLabelTextFont", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "e", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getLargeShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "LargeShape", "Landroidx/compose/ui/unit/Dp;", "f", "F", "getLargeSize-D9Ej5fM", "()F", "LargeSize", "g", "getShape", "Shape", "h", "getSize-D9Ej5fM", "Size", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBadgeTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeTokens.kt\nandroidx/compose/material3/tokens/BadgeTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,33:1\n158#2:34\n158#2:35\n*S KotlinDebug\n*F\n+ 1 BadgeTokens.kt\nandroidx/compose/material3/tokens/BadgeTokens\n*L\n29#1:34\n31#1:35\n*E\n"})
public final class BadgeTokens {
    public static final int $stable;
    @NotNull
    public static final BadgeTokens INSTANCE;
    public static final ColorSchemeKeyTokens a;
    public static final ColorSchemeKeyTokens b;
    public static final ColorSchemeKeyTokens c;
    public static final TypographyKeyTokens d;
    public static final ShapeKeyTokens e;
    public static final float f;
    public static final ShapeKeyTokens g;
    public static final float h;

    static {
        BadgeTokens.INSTANCE = new BadgeTokens();  // 初始化器: Ljava/lang/Object;-><init>()V
        BadgeTokens.a = ColorSchemeKeyTokens.Error;
        BadgeTokens.b = ColorSchemeKeyTokens.Error;
        BadgeTokens.c = ColorSchemeKeyTokens.OnError;
        BadgeTokens.d = TypographyKeyTokens.LabelSmall;
        BadgeTokens.e = ShapeKeyTokens.CornerFull;
        BadgeTokens.f = 16.0f;
        BadgeTokens.g = ShapeKeyTokens.CornerFull;
        BadgeTokens.h = 6.0f;
    }

    @NotNull
    public final ColorSchemeKeyTokens getColor() {
        return BadgeTokens.a;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLargeColor() {
        return BadgeTokens.b;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLargeLabelTextColor() {
        return BadgeTokens.c;
    }

    @NotNull
    public final TypographyKeyTokens getLargeLabelTextFont() {
        return BadgeTokens.d;
    }

    @NotNull
    public final ShapeKeyTokens getLargeShape() {
        return BadgeTokens.e;
    }

    public final float getLargeSize-D9Ej5fM() [...] // 潜在的解密器

    @NotNull
    public final ShapeKeyTokens getShape() {
        return BadgeTokens.g;
    }

    public final float getSize-D9Ej5fM() [...] // 潜在的解密器
}

