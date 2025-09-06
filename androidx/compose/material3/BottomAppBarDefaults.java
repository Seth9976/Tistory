package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.FabSecondaryTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001JM\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000ER\u001D\u0010\u0014\u001A\u00020\u000F8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001A\u001A\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001E\u001A\u00020\u001B8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u001DR\u0011\u0010\"\u001A\u00020\u001F8G¢\u0006\u0006\u001A\u0004\b \u0010!R\u0017\u0010$\u001A\u00020\u001B8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b#\u0010\u001D\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/BottomAppBarDefaults;", "", "Landroidx/compose/material3/BottomAppBarState;", "state", "Lkotlin/Function0;", "", "canScroll", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingAnimationSpec", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "exitAlwaysScrollBehavior", "(Landroidx/compose/material3/BottomAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomAppBarScrollBehavior;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "Landroidx/compose/foundation/layout/PaddingValues;", "b", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "getBottomAppBarFabColor", "bottomAppBarFabColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/BottomAppBarDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2543:1\n148#2:2544\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/BottomAppBarDefaults\n*L\n1538#1:2544\n*E\n"})
public final class BottomAppBarDefaults {
    public static final int $stable;
    @NotNull
    public static final BottomAppBarDefaults INSTANCE;
    public static final float a;
    public static final PaddingValues b;

    static {
        BottomAppBarDefaults.INSTANCE = new BottomAppBarDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        BottomAppBarDefaults.a = 0.0f;
        BottomAppBarDefaults.b = PaddingKt.PaddingValues-a9UjIt4$default(4.0f, 4.0f, 4.0f, 0.0f, 8, null);
    }

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public final BottomAppBarScrollBehavior exitAlwaysScrollBehavior(@Nullable BottomAppBarState bottomAppBarState0, @Nullable Function0 function00, @Nullable AnimationSpec animationSpec0, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            bottomAppBarState0 = AppBarKt.rememberBottomAppBarState(0.0f, 0.0f, 0.0f, composer0, 0, 7);
        }
        if((v1 & 2) != 0) {
            function00 = k1.w;
        }
        if((v1 & 4) != 0) {
            animationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if((v1 & 8) != 0) {
            decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1B3F76E2, v, -1, "androidx.compose.material3.BottomAppBarDefaults.exitAlwaysScrollBehavior (AppBar.kt:1586)");
        }
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior0 = new e9(bottomAppBarState0, animationSpec0, decayAnimationSpec0, function00);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomAppBarScrollBehavior0;
    }

    @Composable
    @JvmName(name = "getBottomAppBarFabColor")
    public final long getBottomAppBarFabColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA8B490B2, v, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-bottomAppBarFabColor> (AppBar.kt:1561)");
        }
        long v1 = ColorSchemeKt.getValue(FabSecondaryTokens.INSTANCE.getContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-368340078, v, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:1534)");
        }
        long v1 = ColorSchemeKt.getValue(BottomAppBarTokens.INSTANCE.getContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public final float getContainerElevation-D9Ej5fM() [...] // 潜在的解密器

    @NotNull
    public final PaddingValues getContentPadding() {
        return BottomAppBarDefaults.b;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x290FB999, v, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:1553)");
        }
        WindowInsets windowInsets0 = WindowInsetsKt.only-bOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer0, 6), 0x2F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }
}

