package androidx.compose.material3;

import androidx.appcompat.app.w0;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallCenteredTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
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

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u00C7\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004JD\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\r\u0010\u0004JD\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\fJ\u000F\u0010\u000F\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u000F\u0010\u0004JD\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\fJ\u000F\u0010\u0011\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0011\u0010\u0004JD\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\fJ)\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u0014\u001A\u00020\u00132\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001AJM\u0010 \u001A\u00020\u00182\b\b\u0002\u0010\u0014\u001A\u00020\u00132\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u00152\u0010\b\u0002\u0010\u001D\u001A\n\u0012\u0004\u0012\u00020\u001C\u0018\u00010\u001B2\u0010\b\u0002\u0010\u001F\u001A\n\u0012\u0004\u0012\u00020\u001C\u0018\u00010\u001EH\u0007\u00A2\u0006\u0004\b \u0010!JM\u0010\"\u001A\u00020\u00182\b\b\u0002\u0010\u0014\u001A\u00020\u00132\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u00152\u0010\b\u0002\u0010\u001D\u001A\n\u0012\u0004\u0012\u00020\u001C\u0018\u00010\u001B2\u0010\b\u0002\u0010\u001F\u001A\n\u0012\u0004\u0012\u00020\u001C\u0018\u00010\u001EH\u0007\u00A2\u0006\u0004\b\"\u0010!R\u001D\u0010(\u001A\u00020#8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u001D\u0010+\u001A\u00020#8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b)\u0010%\u001A\u0004\b*\u0010\'R\u001D\u0010.\u001A\u00020#8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b,\u0010%\u001A\u0004\b-\u0010\'R\u001D\u00101\u001A\u00020#8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b/\u0010%\u001A\u0004\b0\u0010\'R\u001D\u00104\u001A\u00020#8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b2\u0010%\u001A\u0004\b3\u0010\'R\u0018\u00108\u001A\u00020\u0002*\u0002058@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b6\u00107R\u0011\u0010<\u001A\u0002098G\u00A2\u0006\u0006\u001A\u0004\b:\u0010;R\u0018\u0010>\u001A\u00020\u0002*\u0002058@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b=\u00107R\u0018\u0010@\u001A\u00020\u0002*\u0002058@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b?\u00107R\u0018\u0010B\u001A\u00020\u0002*\u0002058@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bA\u00107\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006C"}, d2 = {"Landroidx/compose/material3/TopAppBarDefaults;", "", "Landroidx/compose/material3/TopAppBarColors;", "topAppBarColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "topAppBarColors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarColors;", "centerAlignedTopAppBarColors", "centerAlignedTopAppBarColors-zjMxDiM", "mediumTopAppBarColors", "mediumTopAppBarColors-zjMxDiM", "largeTopAppBarColors", "largeTopAppBarColors-zjMxDiM", "Landroidx/compose/material3/TopAppBarState;", "state", "Lkotlin/Function0;", "", "canScroll", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "pinnedScrollBehavior", "(Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingAnimationSpec", "enterAlwaysScrollBehavior", "(Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "exitUntilCollapsedScrollBehavior", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getTopAppBarExpandedHeight-D9Ej5fM", "()F", "TopAppBarExpandedHeight", "b", "getMediumAppBarCollapsedHeight-D9Ej5fM", "MediumAppBarCollapsedHeight", "c", "getMediumAppBarExpandedHeight-D9Ej5fM", "MediumAppBarExpandedHeight", "d", "getLargeAppBarCollapsedHeight-D9Ej5fM", "LargeAppBarCollapsedHeight", "e", "getLargeAppBarExpandedHeight-D9Ej5fM", "LargeAppBarExpandedHeight", "Landroidx/compose/material3/ColorScheme;", "getDefaultTopAppBarColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/TopAppBarColors;", "defaultTopAppBarColors", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "getDefaultCenterAlignedTopAppBarColors$material3_release", "defaultCenterAlignedTopAppBarColors", "getDefaultMediumTopAppBarColors$material3_release", "defaultMediumTopAppBarColors", "getDefaultLargeTopAppBarColors$material3_release", "defaultLargeTopAppBarColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2543:1\n1#2:2544\n*E\n"})
public final class TopAppBarDefaults {
    public static final int $stable;
    @NotNull
    public static final TopAppBarDefaults INSTANCE;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        TopAppBarDefaults.INSTANCE = new TopAppBarDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        TopAppBarDefaults.a = 0.0f;
        TopAppBarDefaults.b = 0.0f;
        TopAppBarDefaults.c = 0.0f;
        TopAppBarDefaults.d = 0.0f;
        TopAppBarDefaults.e = 0.0f;
    }

    @Composable
    @NotNull
    public final TopAppBarColors centerAlignedTopAppBarColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(513940029, v, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1035)");
        }
        TopAppBarColors topAppBarColors0 = this.getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColors0;
    }

    // 去混淆评级： 低(20)
    @Composable
    @NotNull
    public final TopAppBarColors centerAlignedTopAppBarColors-zjMxDiM(long v, long v1, long v2, long v3, long v4, @Nullable Composer composer0, int v5, int v6) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7102EF78, v5, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1056)");
        }
        TopAppBarColors topAppBarColors0 = this.getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-t635Npw(((v6 & 1) == 0 ? v : 0L), ((v6 & 2) == 0 ? v1 : 0L), ((v6 & 4) == 0 ? v2 : 0L), ((v6 & 8) == 0 ? v3 : 0L), ((v6 & 16) == 0 ? v4 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColors0;
    }

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public final TopAppBarScrollBehavior enterAlwaysScrollBehavior(@Nullable TopAppBarState topAppBarState0, @Nullable Function0 function00, @Nullable AnimationSpec animationSpec0, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            topAppBarState0 = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer0, 0, 7);
        }
        if((v1 & 2) != 0) {
            function00 = kr.w;
        }
        if((v1 & 4) != 0) {
            animationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if((v1 & 8) != 0) {
            decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x392A8052, v, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:1219)");
        }
        TopAppBarScrollBehavior topAppBarScrollBehavior0 = new e9(topAppBarState0, animationSpec0, decayAnimationSpec0, function00, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarScrollBehavior0;
    }

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public final TopAppBarScrollBehavior exitUntilCollapsedScrollBehavior(@Nullable TopAppBarState topAppBarState0, @Nullable Function0 function00, @Nullable AnimationSpec animationSpec0, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            topAppBarState0 = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer0, 0, 7);
        }
        if((v1 & 2) != 0) {
            function00 = lr.w;
        }
        if((v1 & 4) != 0) {
            animationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if((v1 & 8) != 0) {
            decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9745F3FE, v, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1252)");
        }
        TopAppBarScrollBehavior topAppBarScrollBehavior0 = new e9(topAppBarState0, animationSpec0, decayAnimationSpec0, function00, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarScrollBehavior0;
    }

    @NotNull
    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColors$material3_release(@NotNull ColorScheme colorScheme0) {
        TopAppBarColors topAppBarColors0 = colorScheme0.getDefaultCenterAlignedTopAppBarColorsCached$material3_release();
        if(topAppBarColors0 == null) {
            topAppBarColors0 = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme0, TopAppBarSmallCenteredTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarSmallCenteredTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarSmallCenteredTokens.INSTANCE.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarSmallCenteredTokens.INSTANCE.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarSmallCenteredTokens.INSTANCE.getTrailingIconColor()), null);
            colorScheme0.setDefaultCenterAlignedTopAppBarColorsCached$material3_release(topAppBarColors0);
        }
        return topAppBarColors0;
    }

    @NotNull
    public final TopAppBarColors getDefaultLargeTopAppBarColors$material3_release(@NotNull ColorScheme colorScheme0) {
        TopAppBarColors topAppBarColors0 = colorScheme0.getDefaultLargeTopAppBarColorsCached$material3_release();
        if(topAppBarColors0 == null) {
            topAppBarColors0 = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme0, TopAppBarLargeTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarLargeTokens.INSTANCE.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarLargeTokens.INSTANCE.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarLargeTokens.INSTANCE.getTrailingIconColor()), null);
            colorScheme0.setDefaultLargeTopAppBarColorsCached$material3_release(topAppBarColors0);
        }
        return topAppBarColors0;
    }

    @NotNull
    public final TopAppBarColors getDefaultMediumTopAppBarColors$material3_release(@NotNull ColorScheme colorScheme0) {
        TopAppBarColors topAppBarColors0 = colorScheme0.getDefaultMediumTopAppBarColorsCached$material3_release();
        if(topAppBarColors0 == null) {
            topAppBarColors0 = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme0, TopAppBarMediumTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarMediumTokens.INSTANCE.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarMediumTokens.INSTANCE.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarMediumTokens.INSTANCE.getTrailingIconColor()), null);
            colorScheme0.setDefaultMediumTopAppBarColorsCached$material3_release(topAppBarColors0);
        }
        return topAppBarColors0;
    }

    @NotNull
    public final TopAppBarColors getDefaultTopAppBarColors$material3_release(@NotNull ColorScheme colorScheme0) {
        TopAppBarColors topAppBarColors0 = colorScheme0.getDefaultTopAppBarColorsCached$material3_release();
        if(topAppBarColors0 == null) {
            topAppBarColors0 = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme0, TopAppBarSmallTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarSmallTokens.INSTANCE.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarSmallTokens.INSTANCE.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme0, TopAppBarSmallTokens.INSTANCE.getTrailingIconColor()), null);
            colorScheme0.setDefaultTopAppBarColorsCached$material3_release(topAppBarColors0);
        }
        return topAppBarColors0;
    }

    public final float getLargeAppBarCollapsedHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getLargeAppBarExpandedHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getMediumAppBarCollapsedHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getMediumAppBarExpandedHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getTopAppBarExpandedHeight-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7FBE5FFF, v, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1025)");
        }
        WindowInsets windowInsets0 = WindowInsetsKt.only-bOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer0, 6), 0x1F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @Composable
    @NotNull
    public final TopAppBarColors largeTopAppBarColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x68018E29, v, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1135)");
        }
        TopAppBarColors topAppBarColors0 = this.getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColors0;
    }

    // 去混淆评级： 低(20)
    @Composable
    @NotNull
    public final TopAppBarColors largeTopAppBarColors-zjMxDiM(long v, long v1, long v2, long v3, long v4, @Nullable Composer composer0, int v5, int v6) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1471507700, v5, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1157)");
        }
        TopAppBarColors topAppBarColors0 = this.getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-t635Npw(((v6 & 1) == 0 ? v : 0L), ((v6 & 2) == 0 ? v1 : 0L), ((v6 & 4) == 0 ? v2 : 0L), ((v6 & 8) == 0 ? v3 : 0L), ((v6 & 16) == 0 ? v4 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColors0;
    }

    @Composable
    @NotNull
    public final TopAppBarColors mediumTopAppBarColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4BA1ABBF, v, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1085)");
        }
        TopAppBarColors topAppBarColors0 = this.getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColors0;
    }

    // 去混淆评级： 低(20)
    @Composable
    @NotNull
    public final TopAppBarColors mediumTopAppBarColors-zjMxDiM(long v, long v1, long v2, long v3, long v4, @Nullable Composer composer0, int v5, int v6) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDD482536, v5, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1107)");
        }
        TopAppBarColors topAppBarColors0 = this.getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-t635Npw(((v6 & 1) == 0 ? v : 0L), ((v6 & 2) == 0 ? v1 : 0L), ((v6 & 4) == 0 ? v2 : 0L), ((v6 & 8) == 0 ? v3 : 0L), ((v6 & 16) == 0 ? v4 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColors0;
    }

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public final TopAppBarScrollBehavior pinnedScrollBehavior(@Nullable TopAppBarState topAppBarState0, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            topAppBarState0 = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer0, 0, 7);
        }
        if((v1 & 2) != 0) {
            function00 = mr.w;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(286497075, v, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:1194)");
        }
        TopAppBarScrollBehavior topAppBarScrollBehavior0 = new w0(topAppBarState0, function00);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarScrollBehavior0;
    }

    @Composable
    @NotNull
    public final TopAppBarColors topAppBarColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388520854, v, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:977)");
        }
        TopAppBarColors topAppBarColors0 = this.getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColors0;
    }

    // 去混淆评级： 低(20)
    @Composable
    @NotNull
    public final TopAppBarColors topAppBarColors-zjMxDiM(long v, long v1, long v2, long v3, long v4, @Nullable Composer composer0, int v5, int v6) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7FBA5A6B, v5, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:998)");
        }
        TopAppBarColors topAppBarColors0 = this.getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-t635Npw(((v6 & 1) == 0 ? v : 0L), ((v6 & 2) == 0 ? v1 : 0L), ((v6 & 4) == 0 ? v2 : 0L), ((v6 & 8) == 0 ? v3 : 0L), ((v6 & 16) == 0 ? v4 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarColors0;
    }
}

