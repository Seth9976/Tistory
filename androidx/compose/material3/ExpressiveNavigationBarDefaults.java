package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0005\u001A\u00020\u00028Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0007\u001A\u00020\u00028Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0004R\u0017\u0010\u000B\u001A\u00020\b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0011\u0010\u000F\u001A\u00020\f8G¢\u0006\u0006\u001A\u0004\b\r\u0010\u000E\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/ExpressiveNavigationBarDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "getContentColor", "contentColor", "Landroidx/compose/material3/NavigationBarArrangement;", "getArrangement-Ebr7WPU", "()I", "arrangement", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ExpressiveNavigationBarDefaults {
    public static final int $stable;
    @NotNull
    public static final ExpressiveNavigationBarDefaults INSTANCE;

    static {
        ExpressiveNavigationBarDefaults.INSTANCE = new ExpressiveNavigationBarDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    // 去混淆评级： 低(20)
    public final int getArrangement-Ebr7WPU() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x635457CF, v, -1, "androidx.compose.material3.ExpressiveNavigationBarDefaults.<get-containerColor> (ExpressiveNavigationBar.kt:244)");
        }
        long v1 = ColorSchemeKt.getValue(ColorSchemeKeyTokens.SurfaceContainer, composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getContentColor")
    public final long getContentColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB5B144F, v, -1, "androidx.compose.material3.ExpressiveNavigationBarDefaults.<get-contentColor> (ExpressiveNavigationBar.kt:249)");
        }
        long v1 = ColorSchemeKt.getValue(ColorSchemeKeyTokens.OnSurfaceVariant, composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1317880490, v, -1, "androidx.compose.material3.ExpressiveNavigationBarDefaults.<get-windowInsets> (ExpressiveNavigationBar.kt:259)");
        }
        WindowInsets windowInsets0 = WindowInsetsKt.only-bOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer0, 6), 0x2F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }
}

