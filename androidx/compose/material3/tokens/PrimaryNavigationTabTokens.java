package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00C0\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\r\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0013\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0014\u0010\u0004\u001A\u0004\b\u0015\u0010\u0006R\u001D\u0010\u0019\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0017\u0010\n\u001A\u0004\b\u0018\u0010\fR\u001D\u0010\u001C\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001A\u0010\n\u001A\u0004\b\u001B\u0010\fR\u0017\u0010\"\u001A\u00020\u001D8\u0006\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u0017\u0010%\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010\u0004\u001A\u0004\b$\u0010\u0006R\u0017\u0010(\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010\u0004\u001A\u0004\b\'\u0010\u0006R\u0017\u0010+\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010\u0004\u001A\u0004\b*\u0010\u0006R\u0017\u0010.\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010\u0004\u001A\u0004\b-\u0010\u0006R\u001D\u00101\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b/\u0010\n\u001A\u0004\b0\u0010\fR\u001D\u00104\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b2\u0010\n\u001A\u0004\b3\u0010\fR\u0017\u00107\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u0010\u0004\u001A\u0004\b6\u0010\u0006R\u0017\u0010:\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b8\u0010\u0004\u001A\u0004\b9\u0010\u0006R\u0017\u0010=\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b;\u0010\u0004\u001A\u0004\b<\u0010\u0006R\u0017\u0010@\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b>\u0010\u0004\u001A\u0004\b?\u0010\u0006R\u0017\u0010C\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bA\u0010\u0004\u001A\u0004\bB\u0010\u0006R\u0017\u0010F\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bD\u0010\u0004\u001A\u0004\bE\u0010\u0006R\u0017\u0010I\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bG\u0010\u0004\u001A\u0004\bH\u0010\u0006R\u0017\u0010L\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bJ\u0010\u0004\u001A\u0004\bK\u0010\u0006R\u0017\u0010O\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bM\u0010\u0004\u001A\u0004\bN\u0010\u0006R\u0017\u0010R\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bP\u0010\u0004\u001A\u0004\bQ\u0010\u0006R\u0017\u0010U\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bS\u0010\u0004\u001A\u0004\bT\u0010\u0006R\u0017\u0010X\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bV\u0010\u0004\u001A\u0004\bW\u0010\u0006R\u0017\u0010^\u001A\u00020Y8\u0006\u00A2\u0006\f\n\u0004\bZ\u0010[\u001A\u0004\b\\\u0010]\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006_"}, d2 = {"Landroidx/compose/material3/tokens/PrimaryNavigationTabTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveIndicatorColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getActiveIndicatorHeight-D9Ej5fM", "()F", "ActiveIndicatorHeight", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "c", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getActiveIndicatorShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ActiveIndicatorShape", "d", "getContainerColor", "ContainerColor", "e", "getContainerElevation-D9Ej5fM", "ContainerElevation", "f", "getContainerHeight-D9Ej5fM", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "g", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "h", "getActiveFocusIconColor", "ActiveFocusIconColor", "i", "getActiveHoverIconColor", "ActiveHoverIconColor", "j", "getActiveIconColor", "ActiveIconColor", "k", "getActivePressedIconColor", "ActivePressedIconColor", "l", "getIconAndLabelTextContainerHeight-D9Ej5fM", "IconAndLabelTextContainerHeight", "m", "getIconSize-D9Ej5fM", "IconSize", "n", "getInactiveFocusIconColor", "InactiveFocusIconColor", "o", "getInactiveHoverIconColor", "InactiveHoverIconColor", "p", "getInactiveIconColor", "InactiveIconColor", "q", "getInactivePressedIconColor", "InactivePressedIconColor", "r", "getActiveFocusLabelTextColor", "ActiveFocusLabelTextColor", "s", "getActiveHoverLabelTextColor", "ActiveHoverLabelTextColor", "t", "getActiveLabelTextColor", "ActiveLabelTextColor", "u", "getActivePressedLabelTextColor", "ActivePressedLabelTextColor", "v", "getInactiveFocusLabelTextColor", "InactiveFocusLabelTextColor", "w", "getInactiveHoverLabelTextColor", "InactiveHoverLabelTextColor", "x", "getInactiveLabelTextColor", "InactiveLabelTextColor", "y", "getInactivePressedLabelTextColor", "InactivePressedLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "z", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPrimaryNavigationTabTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryNavigationTabTokens.kt\nandroidx/compose/material3/tokens/PrimaryNavigationTabTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,53:1\n158#2:54\n158#2:55\n158#2:56\n158#2:57\n158#2:58\n*S KotlinDebug\n*F\n+ 1 PrimaryNavigationTabTokens.kt\nandroidx/compose/material3/tokens/PrimaryNavigationTabTokens\n*L\n27#1:54\n28#1:55\n31#1:56\n37#1:57\n38#1:58\n*E\n"})
public final class PrimaryNavigationTabTokens {
    public static final int $stable;
    @NotNull
    public static final PrimaryNavigationTabTokens INSTANCE;
    public static final ColorSchemeKeyTokens a;
    public static final float b;
    public static final RoundedCornerShape c;
    public static final ColorSchemeKeyTokens d;
    public static final float e;
    public static final float f;
    public static final ShapeKeyTokens g;
    public static final ColorSchemeKeyTokens h;
    public static final ColorSchemeKeyTokens i;
    public static final ColorSchemeKeyTokens j;
    public static final ColorSchemeKeyTokens k;
    public static final float l;
    public static final float m;
    public static final ColorSchemeKeyTokens n;
    public static final ColorSchemeKeyTokens o;
    public static final ColorSchemeKeyTokens p;
    public static final ColorSchemeKeyTokens q;
    public static final ColorSchemeKeyTokens r;
    public static final ColorSchemeKeyTokens s;
    public static final ColorSchemeKeyTokens t;
    public static final ColorSchemeKeyTokens u;
    public static final ColorSchemeKeyTokens v;
    public static final ColorSchemeKeyTokens w;
    public static final ColorSchemeKeyTokens x;
    public static final ColorSchemeKeyTokens y;
    public static final TypographyKeyTokens z;

    static {
        PrimaryNavigationTabTokens.INSTANCE = new PrimaryNavigationTabTokens();  // 初始化器: Ljava/lang/Object;-><init>()V
        PrimaryNavigationTabTokens.a = ColorSchemeKeyTokens.Primary;
        PrimaryNavigationTabTokens.b = 3.0f;
        PrimaryNavigationTabTokens.c = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(3.0f);
        PrimaryNavigationTabTokens.d = ColorSchemeKeyTokens.Surface;
        PrimaryNavigationTabTokens.e = 0.0f;
        PrimaryNavigationTabTokens.f = 48.0f;
        PrimaryNavigationTabTokens.g = ShapeKeyTokens.CornerNone;
        PrimaryNavigationTabTokens.h = ColorSchemeKeyTokens.Primary;
        PrimaryNavigationTabTokens.i = ColorSchemeKeyTokens.Primary;
        PrimaryNavigationTabTokens.j = ColorSchemeKeyTokens.Primary;
        PrimaryNavigationTabTokens.k = ColorSchemeKeyTokens.Primary;
        PrimaryNavigationTabTokens.l = 64.0f;
        PrimaryNavigationTabTokens.m = 24.0f;
        PrimaryNavigationTabTokens.n = ColorSchemeKeyTokens.OnSurface;
        PrimaryNavigationTabTokens.o = ColorSchemeKeyTokens.OnSurface;
        PrimaryNavigationTabTokens.p = ColorSchemeKeyTokens.OnSurfaceVariant;
        PrimaryNavigationTabTokens.q = ColorSchemeKeyTokens.OnSurface;
        PrimaryNavigationTabTokens.r = ColorSchemeKeyTokens.Primary;
        PrimaryNavigationTabTokens.s = ColorSchemeKeyTokens.Primary;
        PrimaryNavigationTabTokens.t = ColorSchemeKeyTokens.Primary;
        PrimaryNavigationTabTokens.u = ColorSchemeKeyTokens.Primary;
        PrimaryNavigationTabTokens.v = ColorSchemeKeyTokens.OnSurface;
        PrimaryNavigationTabTokens.w = ColorSchemeKeyTokens.OnSurface;
        PrimaryNavigationTabTokens.x = ColorSchemeKeyTokens.OnSurfaceVariant;
        PrimaryNavigationTabTokens.y = ColorSchemeKeyTokens.OnSurface;
        PrimaryNavigationTabTokens.z = TypographyKeyTokens.TitleSmall;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveFocusIconColor() {
        return PrimaryNavigationTabTokens.h;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveFocusLabelTextColor() {
        return PrimaryNavigationTabTokens.r;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveHoverIconColor() {
        return PrimaryNavigationTabTokens.i;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveHoverLabelTextColor() {
        return PrimaryNavigationTabTokens.s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveIconColor() {
        return PrimaryNavigationTabTokens.j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return PrimaryNavigationTabTokens.a;
    }

    public final float getActiveIndicatorHeight-D9Ej5fM() [...] // 潜在的解密器

    @NotNull
    public final RoundedCornerShape getActiveIndicatorShape() {
        return PrimaryNavigationTabTokens.c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return PrimaryNavigationTabTokens.t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActivePressedIconColor() {
        return PrimaryNavigationTabTokens.k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActivePressedLabelTextColor() {
        return PrimaryNavigationTabTokens.u;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return PrimaryNavigationTabTokens.d;
    }

    public final float getContainerElevation-D9Ej5fM() {
        return PrimaryNavigationTabTokens.e;
    }

    public final float getContainerHeight-D9Ej5fM() [...] // 潜在的解密器

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return PrimaryNavigationTabTokens.g;
    }

    public final float getIconAndLabelTextContainerHeight-D9Ej5fM() {
        return PrimaryNavigationTabTokens.l;
    }

    public final float getIconSize-D9Ej5fM() {
        return PrimaryNavigationTabTokens.m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveFocusIconColor() {
        return PrimaryNavigationTabTokens.n;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveFocusLabelTextColor() {
        return PrimaryNavigationTabTokens.v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveHoverIconColor() {
        return PrimaryNavigationTabTokens.o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveHoverLabelTextColor() {
        return PrimaryNavigationTabTokens.w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return PrimaryNavigationTabTokens.p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return PrimaryNavigationTabTokens.x;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactivePressedIconColor() {
        return PrimaryNavigationTabTokens.q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactivePressedLabelTextColor() {
        return PrimaryNavigationTabTokens.y;
    }

    @NotNull
    public final TypographyKeyTokens getLabelTextFont() {
        return PrimaryNavigationTabTokens.z;
    }
}

