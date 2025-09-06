package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001Jb\u0010\u000E\u001A\u00020\u000B2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001A\u00020\u000F8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/NavigationDrawerItemDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "selectedContainerColor", "unselectedContainerColor", "selectedIconColor", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedBadgeColor", "unselectedBadgeColor", "Landroidx/compose/material3/NavigationDrawerItemColors;", "colors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationDrawerItemColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ItemPadding", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1161:1\n148#2:1162\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n*L\n1039#1:1162\n*E\n"})
public final class NavigationDrawerItemDefaults {
    public static final int $stable;
    @NotNull
    public static final NavigationDrawerItemDefaults INSTANCE;
    public static final PaddingValues a;

    static {
        NavigationDrawerItemDefaults.INSTANCE = new NavigationDrawerItemDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        NavigationDrawerItemDefaults.a = PaddingKt.PaddingValues-YgX7TsA$default(12.0f, 0.0f, 2, null);
    }

    @Composable
    @NotNull
    public final NavigationDrawerItemColors colors-oq7We08(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, @Nullable Composer composer0, int v8, int v9) {
        long v10 = (v9 & 1) == 0 ? v : ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIndicatorColor(), composer0, 6);
        long v11 = (v9 & 4) == 0 ? v2 : ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIconColor(), composer0, 6);
        long v12 = (v9 & 8) == 0 ? v3 : ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getInactiveIconColor(), composer0, 6);
        long v13 = (v9 & 16) == 0 ? v4 : ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveLabelTextColor(), composer0, 6);
        long v14 = (v9 & 0x20) == 0 ? v5 : ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getInactiveLabelTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA21FA94C, v8, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:1023)");
        }
        NavigationDrawerItemColors navigationDrawerItemColors0 = new t8(v11, v12, v13, v14, v10, ((v9 & 2) == 0 ? v1 : 0L), ((v9 & 0x40) == 0 ? v6 : v13), ((v9 & 0x80) == 0 ? v7 : v14));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationDrawerItemColors0;
    }

    @NotNull
    public final PaddingValues getItemPadding() {
        return NavigationDrawerItemDefaults.a;
    }
}

