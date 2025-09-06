package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004JX\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJD\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010R\u0018\u0010\u0014\u001A\u00020\u0002*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/NavigationRailItemDefaults;", "", "Landroidx/compose/material3/NavigationRailItemColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationRailItemColors;", "Landroidx/compose/ui/graphics/Color;", "selectedIconColor", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultNavigationRailItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationRailItemColors;", "defaultNavigationRailItemColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailItemDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,749:1\n1#2:750\n*E\n"})
public final class NavigationRailItemDefaults {
    public static final int $stable;
    @NotNull
    public static final NavigationRailItemDefaults INSTANCE;

    static {
        NavigationRailItemDefaults.INSTANCE = new NavigationRailItemDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final NavigationRailItemColors colors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x87EFBA9B, v, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:308)");
        }
        NavigationRailItemColors navigationRailItemColors0 = this.getDefaultNavigationRailItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationRailItemColors0;
    }

    @Composable
    @NotNull
    public final NavigationRailItemColors colors-69fazGs(long v, long v1, long v2, long v3, long v4, long v5, long v6, @Nullable Composer composer0, int v7, int v8) {
        long v9 = (v8 & 1) == 0 ? v : ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIconColor(), composer0, 6);
        long v10 = (v8 & 2) == 0 ? v1 : ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), composer0, 6);
        long v11 = (v8 & 4) == 0 ? v2 : ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), composer0, 6);
        long v12 = (v8 & 8) == 0 ? v3 : ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveIconColor(), composer0, 6);
        long v13 = (v8 & 16) == 0 ? v4 : ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), composer0, 6);
        long v14 = (v8 & 0x20) == 0 ? v5 : Color.copy-wmQWz5c$default(v12, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long v15 = (v8 & 0x40) == 0 ? v6 : Color.copy-wmQWz5c$default(v13, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2104358508, v7, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:333)");
        }
        NavigationRailItemColors navigationRailItemColors0 = this.getDefaultNavigationRailItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-4JmcsL4(v9, v10, v11, v12, v13, v14, v15);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationRailItemColors0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    public final NavigationRailItemColors colors-zjMxDiM(long v, long v1, long v2, long v3, long v4, Composer composer0, int v5, int v6) {
        long v7 = (v6 & 1) == 0 ? v : ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIconColor(), composer0, 6);
        long v8 = (v6 & 2) == 0 ? v1 : ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), composer0, 6);
        long v9 = (v6 & 4) == 0 ? v2 : ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), composer0, 6);
        long v10 = (v6 & 8) == 0 ? v3 : ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveIconColor(), composer0, 6);
        long v11 = (v6 & 16) == 0 ? v4 : ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x60A7AD26, v5, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:376)");
        }
        NavigationRailItemColors navigationRailItemColors0 = new NavigationRailItemColors(v7, v8, v9, v10, v11, Color.copy-wmQWz5c$default(v10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(v11, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationRailItemColors0;
    }

    @NotNull
    public final NavigationRailItemColors getDefaultNavigationRailItemColors$material3_release(@NotNull ColorScheme colorScheme0) {
        NavigationRailItemColors navigationRailItemColors0 = colorScheme0.getDefaultNavigationRailItemColorsCached$material3_release();
        if(navigationRailItemColors0 == null) {
            navigationRailItemColors0 = new NavigationRailItemColors(ColorSchemeKt.fromToken(colorScheme0, NavigationRailTokens.INSTANCE.getActiveIconColor()), ColorSchemeKt.fromToken(colorScheme0, NavigationRailTokens.INSTANCE.getActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, NavigationRailTokens.INSTANCE.getActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme0, NavigationRailTokens.INSTANCE.getInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme0, NavigationRailTokens.INSTANCE.getInactiveLabelTextColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, NavigationRailTokens.INSTANCE.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, NavigationRailTokens.INSTANCE.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultNavigationRailItemColorsCached$material3_release(navigationRailItemColors0);
        }
        return navigationRailItemColors0;
    }
}

