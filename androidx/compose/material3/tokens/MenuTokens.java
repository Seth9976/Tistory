package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\bÀ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\r\u001A\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0013\u001A\u00020\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001A\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001A\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001C\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0004\u001A\u0004\b\u001B\u0010\u0006R\u0017\u0010\u001F\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u0004\u001A\u0004\b\u001E\u0010\u0006R\u0017\u0010\"\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001A\u0004\b!\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/tokens/MenuTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "d", "getFocusIndicatorColor", "FocusIndicatorColor", "e", "getListItemSelectedContainerColor", "ListItemSelectedContainerColor", "f", "getListItemSelectedLabelTextColor", "ListItemSelectedLabelTextColor", "g", "getListItemSelectedLeadingTrailingIconColor", "ListItemSelectedLeadingTrailingIconColor", "h", "getMenuListItemLeadingIconColor", "MenuListItemLeadingIconColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MenuTokens {
    public static final int $stable;
    @NotNull
    public static final MenuTokens INSTANCE;
    public static final ColorSchemeKeyTokens a;
    public static final float b;
    public static final ShapeKeyTokens c;
    public static final ColorSchemeKeyTokens d;
    public static final ColorSchemeKeyTokens e;
    public static final ColorSchemeKeyTokens f;
    public static final ColorSchemeKeyTokens g;
    public static final ColorSchemeKeyTokens h;

    static {
        MenuTokens.INSTANCE = new MenuTokens();  // 初始化器: Ljava/lang/Object;-><init>()V
        MenuTokens.a = ColorSchemeKeyTokens.SurfaceContainer;
        MenuTokens.b = 0.0f;
        MenuTokens.c = ShapeKeyTokens.CornerExtraSmall;
        MenuTokens.d = ColorSchemeKeyTokens.Secondary;
        MenuTokens.e = ColorSchemeKeyTokens.SecondaryContainer;
        MenuTokens.f = ColorSchemeKeyTokens.OnSecondaryContainer;
        MenuTokens.g = ColorSchemeKeyTokens.OnSecondaryContainer;
        MenuTokens.h = ColorSchemeKeyTokens.OnSecondaryContainer;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return MenuTokens.a;
    }

    public final float getContainerElevation-D9Ej5fM() [...] // 潜在的解密器

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return MenuTokens.c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return MenuTokens.d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemSelectedContainerColor() {
        return MenuTokens.e;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemSelectedLabelTextColor() {
        return MenuTokens.f;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemSelectedLeadingTrailingIconColor() {
        return MenuTokens.g;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuListItemLeadingIconColor() {
        return MenuTokens.h;
    }
}

