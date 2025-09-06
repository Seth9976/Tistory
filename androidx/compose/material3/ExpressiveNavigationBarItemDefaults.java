package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\b\u001A\u00020\u0002*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/material3/ExpressiveNavigationBarItemDefaults;", "", "Landroidx/compose/material3/NavigationItemColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultExpressiveNavigationBarItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationItemColors;", "defaultExpressiveNavigationBarItemColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExpressiveNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/ExpressiveNavigationBarItemDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,459:1\n1#2:460\n*E\n"})
public final class ExpressiveNavigationBarItemDefaults {
    public static final int $stable;
    @NotNull
    public static final ExpressiveNavigationBarItemDefaults INSTANCE;

    static {
        ExpressiveNavigationBarItemDefaults.INSTANCE = new ExpressiveNavigationBarItemDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final NavigationItemColors colors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x74CD640F, v, -1, "androidx.compose.material3.ExpressiveNavigationBarItemDefaults.colors (ExpressiveNavigationBar.kt:272)");
        }
        NavigationItemColors navigationItemColors0 = this.getDefaultExpressiveNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationItemColors0;
    }

    @NotNull
    public final NavigationItemColors getDefaultExpressiveNavigationBarItemColors$material3_release(@NotNull ColorScheme colorScheme0) {
        NavigationItemColors navigationItemColors0 = colorScheme0.getDefaultExpressiveNavigationBarItemColorsCached$material3_release();
        if(navigationItemColors0 == null) {
            navigationItemColors0 = new NavigationItemColors(ColorSchemeKt.fromToken(colorScheme0, ExpressiveNavigationBarKt.access$getActiveIconColor$p()), ColorSchemeKt.fromToken(colorScheme0, ExpressiveNavigationBarKt.access$getActiveLabelTextColor$p()), ColorSchemeKt.fromToken(colorScheme0, ExpressiveNavigationBarKt.access$getActiveIndicatorColor$p()), ColorSchemeKt.fromToken(colorScheme0, ExpressiveNavigationBarKt.access$getInactiveIconColor$p()), ColorSchemeKt.fromToken(colorScheme0, ExpressiveNavigationBarKt.access$getInactiveLabelTextColor$p()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, ExpressiveNavigationBarKt.access$getInactiveIconColor$p()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, ExpressiveNavigationBarKt.access$getInactiveLabelTextColor$p()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultExpressiveNavigationBarItemColorsCached$material3_release(navigationItemColors0);
        }
        return navigationItemColors0;
    }
}

