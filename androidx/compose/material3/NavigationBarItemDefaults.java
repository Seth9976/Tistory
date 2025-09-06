package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004JX\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJD\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010R\u0018\u0010\u0014\u001A\u00020\u0002*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/NavigationBarItemDefaults;", "", "Landroidx/compose/material3/NavigationBarItemColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationBarItemColors;", "Landroidx/compose/ui/graphics/Color;", "selectedIconColor", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultNavigationBarItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationBarItemColors;", "defaultNavigationBarItemColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarItemDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
public final class NavigationBarItemDefaults {
    public static final int $stable;
    @NotNull
    public static final NavigationBarItemDefaults INSTANCE;

    static {
        NavigationBarItemDefaults.INSTANCE = new NavigationBarItemDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final NavigationBarItemColors colors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3CBAEF72, v, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:311)");
        }
        NavigationBarItemColors navigationBarItemColors0 = this.getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColors0;
    }

    // 去混淆评级： 低(26)
    @Composable
    @NotNull
    public final NavigationBarItemColors colors-69fazGs(long v, long v1, long v2, long v3, long v4, long v5, long v6, @Nullable Composer composer0, int v7, int v8) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9F86AB19, v7, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:336)");
        }
        NavigationBarItemColors navigationBarItemColors0 = this.getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-4JmcsL4(((v8 & 1) == 0 ? v : 0L), ((v8 & 2) == 0 ? v1 : 0L), ((v8 & 4) == 0 ? v2 : 0L), ((v8 & 8) == 0 ? v3 : 0L), ((v8 & 16) == 0 ? v4 : 0L), ((v8 & 0x20) == 0 ? v5 : 0L), ((v8 & 0x40) == 0 ? v6 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColors0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    public final NavigationBarItemColors colors-zjMxDiM(long v, long v1, long v2, long v3, long v4, Composer composer0, int v5, int v6) {
        long v7 = (v6 & 1) == 0 ? v : ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIconColor(), composer0, 6);
        long v8 = (v6 & 2) == 0 ? v1 : ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveLabelTextColor(), composer0, 6);
        long v9 = (v6 & 4) == 0 ? v2 : ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIndicatorColor(), composer0, 6);
        long v10 = (v6 & 8) == 0 ? v3 : ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveIconColor(), composer0, 6);
        long v11 = (v6 & 16) == 0 ? v4 : ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveLabelTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF34400C7, v5, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:378)");
        }
        NavigationBarItemColors navigationBarItemColors0 = new NavigationBarItemColors(v7, v8, v9, v10, v11, Color.copy-wmQWz5c$default(v10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(v11, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColors0;
    }

    @NotNull
    public final NavigationBarItemColors getDefaultNavigationBarItemColors$material3_release(@NotNull ColorScheme colorScheme0) {
        NavigationBarItemColors navigationBarItemColors0 = colorScheme0.getDefaultNavigationBarItemColorsCached$material3_release();
        if(navigationBarItemColors0 == null) {
            navigationBarItemColors0 = new NavigationBarItemColors(ColorSchemeKt.fromToken(colorScheme0, NavigationBarTokens.INSTANCE.getActiveIconColor()), ColorSchemeKt.fromToken(colorScheme0, NavigationBarTokens.INSTANCE.getActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, NavigationBarTokens.INSTANCE.getActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme0, NavigationBarTokens.INSTANCE.getInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme0, NavigationBarTokens.INSTANCE.getInactiveLabelTextColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, NavigationBarTokens.INSTANCE.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, NavigationBarTokens.INSTANCE.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultNavigationBarItemColorsCached$material3_release(navigationBarItemColors0);
        }
        return navigationBarItemColors0;
    }
}

