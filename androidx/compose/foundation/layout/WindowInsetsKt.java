package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A8\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A.\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\t2\b\b\u0002\u0010\u0004\u001A\u00020\t2\b\b\u0002\u0010\u0005\u001A\u00020\t2\b\b\u0002\u0010\u0006\u001A\u00020\t\u001A\u0012\u0010\n\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u000B\u001A\u00020\u0001\u001A\f\u0010\f\u001A\u00020\u0001*\u00020\rH\u0000\u001A\u0011\u0010\u000E\u001A\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000F\u001A\u0012\u0010\u000E\u001A\u00020\r*\u00020\u00012\u0006\u0010\u0010\u001A\u00020\u0011\u001A\u0012\u0010\u0012\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u000B\u001A\u00020\u0001\u001A\u001C\u0010\u0013\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001A\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001A\u0012\u0010\u0018\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u000B\u001A\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0019"}, d2 = {"WindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "left", "Landroidx/compose/ui/unit/Dp;", "top", "right", "bottom", "WindowInsets-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/WindowInsets;", "", "add", "insets", "asInsets", "Landroidx/compose/foundation/layout/PaddingValues;", "asPaddingValues", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/PaddingValues;", "density", "Landroidx/compose/ui/unit/Density;", "exclude", "only", "sides", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "only-bOOhFvg", "(Landroidx/compose/foundation/layout/WindowInsets;I)Landroidx/compose/foundation/layout/WindowInsets;", "union", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,748:1\n77#2:749\n148#3:750\n148#3:751\n148#3:752\n148#3:753\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n*L\n245#1:749\n278#1:750\n279#1:751\n280#1:752\n281#1:753\n*E\n"})
public final class WindowInsetsKt {
    @NotNull
    public static final WindowInsets WindowInsets(int v, int v1, int v2, int v3) {
        return new j1(v, v1, v2, v3);
    }

    public static WindowInsets WindowInsets$default(int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = 0;
        }
        if((v4 & 2) != 0) {
            v1 = 0;
        }
        if((v4 & 4) != 0) {
            v2 = 0;
        }
        if((v4 & 8) != 0) {
            v3 = 0;
        }
        return WindowInsetsKt.WindowInsets(v, v1, v2, v3);
    }

    @NotNull
    public static final WindowInsets WindowInsets-a9UjIt4(float f, float f1, float f2, float f3) {
        return new i1(f, f1, f2, f3);
    }

    public static WindowInsets WindowInsets-a9UjIt4$default(float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        return WindowInsetsKt.WindowInsets-a9UjIt4(f, f1, f2, f3);
    }

    @NotNull
    public static final WindowInsets add(@NotNull WindowInsets windowInsets0, @NotNull WindowInsets windowInsets1) {
        return new a(windowInsets0, windowInsets1);
    }

    @NotNull
    public static final WindowInsets asInsets(@NotNull PaddingValues paddingValues0) {
        return new p3(paddingValues0);
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final PaddingValues asPaddingValues(@NotNull WindowInsets windowInsets0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485016250, v, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:244)");
        }
        PaddingValues paddingValues0 = new z2(windowInsets0, ((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return paddingValues0;
    }

    @NotNull
    public static final PaddingValues asPaddingValues(@NotNull WindowInsets windowInsets0, @NotNull Density density0) {
        return new z2(windowInsets0, density0);
    }

    @NotNull
    public static final WindowInsets exclude(@NotNull WindowInsets windowInsets0, @NotNull WindowInsets windowInsets1) {
        return new f1(windowInsets0, windowInsets1);
    }

    @NotNull
    public static final WindowInsets only-bOOhFvg(@NotNull WindowInsets windowInsets0, int v) {
        return new e3(windowInsets0, v);
    }

    @NotNull
    public static final WindowInsets union(@NotNull WindowInsets windowInsets0, @NotNull WindowInsets windowInsets1) {
        return new x3(windowInsets0, windowInsets1);
    }
}

