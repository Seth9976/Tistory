package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.R.id;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.graphics.Insets;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0018\u0010P\u001A\u00020Q2\u0006\u0010R\u001A\u00020S2\u0006\u0010T\u001A\u00020UH\u0000\u001A\f\u0010V\u001A\u00020W*\u00020SH\u0000\"\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u001E\u0010\u0007\u001A\u00020\u0001*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006\"\u001E\u0010\n\u001A\u00020\u0001*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006\"\u0015\u0010\r\u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010\"\u001E\u0010\u0011\u001A\u00020\u000E*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0012\u0010\u0004\u001A\u0004\b\u0013\u0010\u0010\"(\u0010\u0015\u001A\u00020\u0001*\u00020\u00162\u0006\u0010\u0014\u001A\u00020\u00018F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001A\".\u0010\u0015\u001A\u00020\u0001*\u00020\u001B2\u0006\u0010\u0014\u001A\u00020\u00018F@FX\u0087\u000E\u00A2\u0006\u0012\u0012\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u0017\u0010\u001E\"\u0004\b\u0019\u0010\u001F\"\u0015\u0010 \u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b!\u0010\u0010\"\u0015\u0010\"\u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b#\u0010\u0010\"\u001E\u0010$\u001A\u00020\u000E*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b%\u0010\u0004\u001A\u0004\b&\u0010\u0010\"\u001E\u0010\'\u001A\u00020\u000E*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b(\u0010\u0004\u001A\u0004\b)\u0010\u0010\"\u001E\u0010*\u001A\u00020\u0001*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b+\u0010\u0004\u001A\u0004\b*\u0010\u0006\"\u001E\u0010,\u001A\u00020\u0001*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b-\u0010\u0004\u001A\u0004\b,\u0010\u0006\"\u001E\u0010.\u001A\u00020\u0001*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b/\u0010\u0004\u001A\u0004\b.\u0010\u0006\"\u0015\u00100\u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b1\u0010\u0010\"\u0015\u00102\u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b3\u0010\u0010\"\u001E\u00104\u001A\u00020\u000E*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b5\u0010\u0004\u001A\u0004\b6\u0010\u0010\"\u0015\u00107\u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b8\u0010\u0010\"\u0015\u00109\u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b:\u0010\u0010\"\u0015\u0010;\u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b<\u0010\u0010\"\u0015\u0010=\u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b>\u0010\u0010\"\u001E\u0010?\u001A\u00020\u000E*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b@\u0010\u0004\u001A\u0004\bA\u0010\u0010\"\u0015\u0010B\u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\bC\u0010\u0010\"\u001E\u0010D\u001A\u00020\u000E*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bE\u0010\u0004\u001A\u0004\bF\u0010\u0010\"\u0015\u0010G\u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\bH\u0010\u0010\"\u0015\u0010I\u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\bJ\u0010\u0010\"\u001E\u0010K\u001A\u00020\u000E*\u00020\u00028GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bL\u0010\u0004\u001A\u0004\bM\u0010\u0010\"\u0015\u0010N\u001A\u00020\u000E*\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\bO\u0010\u0010\u00A8\u0006X"}, d2 = {"areNavigationBarsVisible", "", "Landroidx/compose/foundation/layout/WindowInsets$Companion;", "getAreNavigationBarsVisible$annotations", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;)V", "getAreNavigationBarsVisible", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Z", "areStatusBarsVisible", "getAreStatusBarsVisible$annotations", "getAreStatusBarsVisible", "areSystemBarsVisible", "getAreSystemBarsVisible$annotations", "getAreSystemBarsVisible", "captionBar", "Landroidx/compose/foundation/layout/WindowInsets;", "getCaptionBar", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "captionBarIgnoringVisibility", "getCaptionBarIgnoringVisibility$annotations", "getCaptionBarIgnoringVisibility", "value", "consumeWindowInsets", "Landroidx/compose/ui/platform/AbstractComposeView;", "getConsumeWindowInsets", "(Landroidx/compose/ui/platform/AbstractComposeView;)Z", "setConsumeWindowInsets", "(Landroidx/compose/ui/platform/AbstractComposeView;Z)V", "Landroidx/compose/ui/platform/ComposeView;", "getConsumeWindowInsets$annotations", "(Landroidx/compose/ui/platform/ComposeView;)V", "(Landroidx/compose/ui/platform/ComposeView;)Z", "(Landroidx/compose/ui/platform/ComposeView;Z)V", "displayCutout", "getDisplayCutout", "ime", "getIme", "imeAnimationSource", "getImeAnimationSource$annotations", "getImeAnimationSource", "imeAnimationTarget", "getImeAnimationTarget$annotations", "getImeAnimationTarget", "isCaptionBarVisible", "isCaptionBarVisible$annotations", "isImeVisible", "isImeVisible$annotations", "isTappableElementVisible", "isTappableElementVisible$annotations", "mandatorySystemGestures", "getMandatorySystemGestures", "navigationBars", "getNavigationBars", "navigationBarsIgnoringVisibility", "getNavigationBarsIgnoringVisibility$annotations", "getNavigationBarsIgnoringVisibility", "safeContent", "getSafeContent", "safeDrawing", "getSafeDrawing", "safeGestures", "getSafeGestures", "statusBars", "getStatusBars", "statusBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility$annotations", "getStatusBarsIgnoringVisibility", "systemBars", "getSystemBars", "systemBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility$annotations", "getSystemBarsIgnoringVisibility", "systemGestures", "getSystemGestures", "tappableElement", "getTappableElement", "tappableElementIgnoringVisibility", "getTappableElementIgnoringVisibility$annotations", "getTappableElementIgnoringVisibility", "waterfall", "getWaterfall", "ValueInsets", "Landroidx/compose/foundation/layout/ValueInsets;", "insets", "Landroidx/core/graphics/Insets;", "name", "", "toInsetsValues", "Landroidx/compose/foundation/layout/InsetsValues;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class WindowInsets_androidKt {
    @NotNull
    public static final ValueInsets ValueInsets(@NotNull Insets insets0, @NotNull String s) {
        return new ValueInsets(WindowInsets_androidKt.toInsetsValues(insets0), s);
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "getAreNavigationBarsVisible")
    public static final boolean getAreNavigationBarsVisible(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(710310464, v, -1, "androidx.compose.foundation.layout.<get-areNavigationBarsVisible> (WindowInsets.android.kt:366)");
        }
        boolean z = WindowInsetsHolder.Companion.current(composer0, 6).getNavigationBars().isVisible();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z;
    }

    @ExperimentalLayoutApi
    public static void getAreNavigationBarsVisible$annotations(Companion windowInsets$Companion0) {
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "getAreStatusBarsVisible")
    public static final boolean getAreStatusBarsVisible(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6028C080, v, -1, "androidx.compose.foundation.layout.<get-areStatusBarsVisible> (WindowInsets.android.kt:354)");
        }
        boolean z = WindowInsetsHolder.Companion.current(composer0, 6).getStatusBars().isVisible();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z;
    }

    @ExperimentalLayoutApi
    public static void getAreStatusBarsVisible$annotations(Companion windowInsets$Companion0) {
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "getAreSystemBarsVisible")
    public static final boolean getAreSystemBarsVisible(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x76582F20, v, -1, "androidx.compose.foundation.layout.<get-areSystemBarsVisible> (WindowInsets.android.kt:378)");
        }
        boolean z = WindowInsetsHolder.Companion.current(composer0, 6).getSystemBars().isVisible();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z;
    }

    @ExperimentalLayoutApi
    public static void getAreSystemBarsVisible$annotations(Companion windowInsets$Companion0) {
    }

    @Composable
    @JvmName(name = "getCaptionBar")
    @NotNull
    public static final WindowInsets getCaptionBar(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1832025528, v, -1, "androidx.compose.foundation.layout.<get-captionBar> (WindowInsets.android.kt:142)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getCaptionBar();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "getCaptionBarIgnoringVisibility")
    @NotNull
    public static final WindowInsets getCaptionBarIgnoringVisibility(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x98CF328A, v, -1, "androidx.compose.foundation.layout.<get-captionBarIgnoringVisibility> (WindowInsets.android.kt:266)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getCaptionBarIgnoringVisibility();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void getCaptionBarIgnoringVisibility$annotations(Companion windowInsets$Companion0) {
    }

    public static final boolean getConsumeWindowInsets(@NotNull AbstractComposeView abstractComposeView0) {
        Object object0 = abstractComposeView0.getTag(id.consume_window_insets_tag);
        Boolean boolean0 = object0 instanceof Boolean ? ((Boolean)object0) : null;
        return boolean0 == null ? true : boolean0.booleanValue();
    }

    public static final boolean getConsumeWindowInsets(ComposeView composeView0) {
        Object object0 = composeView0.getTag(id.consume_window_insets_tag);
        Boolean boolean0 = object0 instanceof Boolean ? ((Boolean)object0) : null;
        return boolean0 == null ? true : boolean0.booleanValue();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use AbstractComposeView.consumeWindowInsets")
    public static void getConsumeWindowInsets$annotations(ComposeView composeView0) {
    }

    @Composable
    @JvmName(name = "getDisplayCutout")
    @NotNull
    public static final WindowInsets getDisplayCutout(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4EF71D3C, v, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:151)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getDisplayCutout();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @Composable
    @JvmName(name = "getIme")
    @NotNull
    public static final WindowInsets getIme(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA8909C1C, v, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:165)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getIme();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "getImeAnimationSource")
    @NotNull
    public static final WindowInsets getImeAnimationSource(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1126064918, v, -1, "androidx.compose.foundation.layout.<get-imeAnimationSource> (WindowInsets.android.kt:404)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getImeAnimationSource();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void getImeAnimationSource$annotations(Companion windowInsets$Companion0) {
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "getImeAnimationTarget")
    @NotNull
    public static final WindowInsets getImeAnimationTarget(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE4348656, v, -1, "androidx.compose.foundation.layout.<get-imeAnimationTarget> (WindowInsets.android.kt:419)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getImeAnimationTarget();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void getImeAnimationTarget$annotations(Companion windowInsets$Companion0) {
    }

    @Composable
    @JvmName(name = "getMandatorySystemGestures")
    @NotNull
    public static final WindowInsets getMandatorySystemGestures(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x51A0CDFC, v, -1, "androidx.compose.foundation.layout.<get-mandatorySystemGestures> (WindowInsets.android.kt:174)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getMandatorySystemGestures();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @Composable
    @JvmName(name = "getNavigationBars")
    @NotNull
    public static final WindowInsets getNavigationBars(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5F23B556, v, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:184)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getNavigationBars();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "getNavigationBarsIgnoringVisibility")
    @NotNull
    public static final WindowInsets getNavigationBarsIgnoringVisibility(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1990981160, v, -1, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:280)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getNavigationBarsIgnoringVisibility();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void getNavigationBarsIgnoringVisibility$annotations(Companion windowInsets$Companion0) {
    }

    @Composable
    @JvmName(name = "getSafeContent")
    @NotNull
    public static final WindowInsets getSafeContent(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8733903C, v, -1, "androidx.compose.foundation.layout.<get-safeContent> (WindowInsets.android.kt:254)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getSafeContent();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @Composable
    @JvmName(name = "getSafeDrawing")
    @NotNull
    public static final WindowInsets getSafeDrawing(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFD0D961C, v, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:234)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getSafeDrawing();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @Composable
    @JvmName(name = "getSafeGestures")
    @NotNull
    public static final WindowInsets getSafeGestures(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA0F9B59C, v, -1, "androidx.compose.foundation.layout.<get-safeGestures> (WindowInsets.android.kt:245)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getSafeGestures();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @Composable
    @JvmName(name = "getStatusBars")
    @NotNull
    public static final WindowInsets getStatusBars(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-675090670, v, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:192)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getStatusBars();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "getStatusBarsIgnoringVisibility")
    @NotNull
    public static final WindowInsets getStatusBarsIgnoringVisibility(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(594020756, v, -1, "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:292)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getStatusBarsIgnoringVisibility();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void getStatusBarsIgnoringVisibility$annotations(Companion windowInsets$Companion0) {
    }

    @Composable
    @JvmName(name = "getSystemBars")
    @NotNull
    public static final WindowInsets getSystemBars(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEF22BA4C, v, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getSystemBars();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "getSystemBarsIgnoringVisibility")
    @NotNull
    public static final WindowInsets getSystemBarsIgnoringVisibility(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5D41650E, v, -1, "androidx.compose.foundation.layout.<get-systemBarsIgnoringVisibility> (WindowInsets.android.kt:305)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getSystemBarsIgnoringVisibility();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void getSystemBarsIgnoringVisibility$annotations(Companion windowInsets$Companion0) {
    }

    @Composable
    @JvmName(name = "getSystemGestures")
    @NotNull
    public static final WindowInsets getSystemGestures(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3AF63DE0, v, -1, "androidx.compose.foundation.layout.<get-systemGestures> (WindowInsets.android.kt:208)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getSystemGestures();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @Composable
    @JvmName(name = "getTappableElement")
    @NotNull
    public static final WindowInsets getTappableElement(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994205284, v, -1, "androidx.compose.foundation.layout.<get-tappableElement> (WindowInsets.android.kt:216)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getTappableElement();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "getTappableElementIgnoringVisibility")
    @NotNull
    public static final WindowInsets getTappableElementIgnoringVisibility(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA742E4BC, v, -1, "androidx.compose.foundation.layout.<get-tappableElementIgnoringVisibility> (WindowInsets.android.kt:318)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getTappableElementIgnoringVisibility();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    public static void getTappableElementIgnoringVisibility$annotations(Companion windowInsets$Companion0) {
    }

    @Composable
    @JvmName(name = "getWaterfall")
    @NotNull
    public static final WindowInsets getWaterfall(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1943241020, v, -1, "androidx.compose.foundation.layout.<get-waterfall> (WindowInsets.android.kt:224)");
        }
        WindowInsets windowInsets0 = WindowInsetsHolder.Companion.current(composer0, 6).getWaterfall();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "isCaptionBarVisible")
    public static final boolean isCaptionBarVisible(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-501076620, v, -1, "androidx.compose.foundation.layout.<get-isCaptionBarVisible> (WindowInsets.android.kt:330)");
        }
        boolean z = WindowInsetsHolder.Companion.current(composer0, 6).getCaptionBar().isVisible();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z;
    }

    @ExperimentalLayoutApi
    public static void isCaptionBarVisible$annotations(Companion windowInsets$Companion0) {
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "isImeVisible")
    public static final boolean isImeVisible(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x905391A0, v, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:342)");
        }
        boolean z = WindowInsetsHolder.Companion.current(composer0, 6).getIme().isVisible();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z;
    }

    @ExperimentalLayoutApi
    public static void isImeVisible$annotations(Companion windowInsets$Companion0) {
    }

    @ExperimentalLayoutApi
    @Composable
    @JvmName(name = "isTappableElementVisible")
    public static final boolean isTappableElementVisible(@NotNull Companion windowInsets$Companion0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1737201120, v, -1, "androidx.compose.foundation.layout.<get-isTappableElementVisible> (WindowInsets.android.kt:389)");
        }
        boolean z = WindowInsetsHolder.Companion.current(composer0, 6).getTappableElement().isVisible();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z;
    }

    @ExperimentalLayoutApi
    public static void isTappableElementVisible$annotations(Companion windowInsets$Companion0) {
    }

    public static final void setConsumeWindowInsets(@NotNull AbstractComposeView abstractComposeView0, boolean z) {
        abstractComposeView0.setTag(id.consume_window_insets_tag, Boolean.valueOf(z));
    }

    public static final void setConsumeWindowInsets(ComposeView composeView0, boolean z) {
        composeView0.setTag(id.consume_window_insets_tag, Boolean.valueOf(z));
    }

    @NotNull
    public static final InsetsValues toInsetsValues(@NotNull Insets insets0) {
        return new InsetsValues(insets0.left, insets0.top, insets0.right, insets0.bottom);
    }
}

