package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004JN\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001D\u0010\u0013\u001A\u00020\u000E8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001D\u0010\u0016\u001A\u00020\u000E8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001A\u0004\b\u0015\u0010\u0012R\u0017\u0010\u001C\u001A\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u0011\u0010 \u001A\u00020\u001D8G¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010#\u001A\u00020\u00058Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b!\u0010\"R\u0018\u0010\'\u001A\u00020\u0002*\u00020$8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b%\u0010&\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/material3/MenuDefaults;", "", "Landroidx/compose/material3/MenuItemColors;", "itemColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/MenuItemColors;", "Landroidx/compose/ui/graphics/Color;", "textColor", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "itemColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/MenuItemColors;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getTonalElevation-D9Ej5fM", "()F", "TonalElevation", "b", "getShadowElevation-D9Ej5fM", "ShadowElevation", "Landroidx/compose/foundation/layout/PaddingValues;", "c", "Landroidx/compose/foundation/layout/PaddingValues;", "getDropdownMenuItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DropdownMenuItemContentPadding", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "Landroidx/compose/material3/ColorScheme;", "getDefaultMenuItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/MenuItemColors;", "defaultMenuItemColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,560:1\n1#2:561\n148#3:562\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n*L\n261#1:562\n*E\n"})
public final class MenuDefaults {
    public static final int $stable;
    @NotNull
    public static final MenuDefaults INSTANCE;
    public static final float a;
    public static final float b;
    public static final PaddingValues c;

    static {
        MenuDefaults.INSTANCE = new MenuDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        MenuDefaults.a = 0.0f;
        MenuDefaults.b = 0.0f;
        MenuDefaults.c = PaddingKt.PaddingValues-YgX7TsA(12.0f, 0.0f);
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x957603A7, v, -1, "androidx.compose.material3.MenuDefaults.<get-containerColor> (Menu.kt:198)");
        }
        long v1 = ColorSchemeKt.getValue(MenuTokens.INSTANCE.getContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @NotNull
    public final MenuItemColors getDefaultMenuItemColors$material3_release(@NotNull ColorScheme colorScheme0) {
        MenuItemColors menuItemColors0 = colorScheme0.getDefaultMenuItemColorsCached$material3_release();
        if(menuItemColors0 == null) {
            menuItemColors0 = new MenuItemColors(ColorSchemeKt.fromToken(colorScheme0, ListTokens.INSTANCE.getListItemLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, ListTokens.INSTANCE.getListItemLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, ListTokens.INSTANCE.getListItemTrailingIconColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, ListTokens.INSTANCE.getListItemDisabledLabelTextColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, ListTokens.INSTANCE.getListItemDisabledLeadingIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, ListTokens.INSTANCE.getListItemDisabledTrailingIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultMenuItemColorsCached$material3_release(menuItemColors0);
        }
        return menuItemColors0;
    }

    @NotNull
    public final PaddingValues getDropdownMenuItemContentPadding() {
        return MenuDefaults.c;
    }

    public final float getShadowElevation-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD092393, v, -1, "androidx.compose.material3.MenuDefaults.<get-shape> (Menu.kt:194)");
        }
        Shape shape0 = ShapesKt.getValue(MenuTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    public final float getTonalElevation-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @NotNull
    public final MenuItemColors itemColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4F1143BC, v, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:204)");
        }
        MenuItemColors menuItemColors0 = this.getDefaultMenuItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return menuItemColors0;
    }

    // 去混淆评级： 低(23)
    @Composable
    @NotNull
    public final MenuItemColors itemColors-5tl4gsc(long v, long v1, long v2, long v3, long v4, long v5, @Nullable Composer composer0, int v6, int v7) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB3CAF924, v6, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:229)");
        }
        MenuItemColors menuItemColors0 = this.getDefaultMenuItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-tNS2XkQ(((v7 & 1) == 0 ? v : 0L), ((v7 & 2) == 0 ? v1 : 0L), ((v7 & 4) == 0 ? v2 : 0L), ((v7 & 8) == 0 ? v3 : 0L), ((v7 & 16) == 0 ? v4 : 0L), ((v7 & 0x20) == 0 ? v5 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return menuItemColors0;
    }
}

