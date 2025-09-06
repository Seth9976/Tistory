package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\n\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001A\u00020\u000B8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0014\u001A\u00020\u00118G¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001A\u00020\u00118G¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material/AppBarDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getTopAppBarElevation-D9Ej5fM", "()F", "TopAppBarElevation", "b", "getBottomAppBarElevation-D9Ej5fM", "BottomAppBarElevation", "Landroidx/compose/foundation/layout/PaddingValues;", "c", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "Landroidx/compose/foundation/layout/WindowInsets;", "getTopAppBarWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "topAppBarWindowInsets", "getBottomAppBarWindowInsets", "bottomAppBarWindowInsets", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,758:1\n154#2:759\n154#2:760\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n*L\n438#1:759\n443#1:760\n*E\n"})
public final class AppBarDefaults {
    public static final int $stable;
    @NotNull
    public static final AppBarDefaults INSTANCE;
    public static final float a;
    public static final float b;
    public static final PaddingValues c;

    static {
        AppBarDefaults.INSTANCE = new AppBarDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        AppBarDefaults.a = 4.0f;
        AppBarDefaults.b = 8.0f;
        AppBarDefaults.c = PaddingKt.PaddingValues-a9UjIt4$default(4.0f, 0.0f, 4.0f, 0.0f, 10, null);
    }

    public final float getBottomAppBarElevation-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getBottomAppBarWindowInsets")
    @NotNull
    public final WindowInsets getBottomAppBarWindowInsets(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x579BEEDF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x579BEEDF, v, -1, "androidx.compose.material.AppBarDefaults.<get-bottomAppBarWindowInsets> (AppBar.kt:465)");
        }
        WindowInsets windowInsets0 = WindowInsetsKt.only-bOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer0, 8), 0x2F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return windowInsets0;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return AppBarDefaults.c;
    }

    public final float getTopAppBarElevation-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getTopAppBarWindowInsets")
    @NotNull
    public final WindowInsets getTopAppBarWindowInsets(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0xE689CC87);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE689CC87, v, -1, "androidx.compose.material.AppBarDefaults.<get-topAppBarWindowInsets> (AppBar.kt:457)");
        }
        WindowInsets windowInsets0 = WindowInsetsKt.only-bOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer0, 8), 0x1F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return windowInsets0;
    }
}

