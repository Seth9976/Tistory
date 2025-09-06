package androidx.compose.material3;

import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J:\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ\u001C\u0010\u0011\u001A\u00020\u000E2\b\b\u0002\u0010\r\u001A\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u001C\u0010\u0013\u001A\u00020\u000E2\b\b\u0002\u0010\r\u001A\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u001D\u0010\u0019\u001A\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001D\u001A\u00020\u001A8G¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u0017\u0010 \u001A\u00020\u00058Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010\"\u001A\u00020\u00058Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b!\u0010\u001FR\u0011\u0010$\u001A\u00020\u001A8G¢\u0006\u0006\u001A\u0004\b#\u0010\u001CR\u0018\u0010(\u001A\u00020\u0002*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b&\u0010\'\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/material3/TooltipDefaults;", "", "Landroidx/compose/material3/RichTooltipColors;", "richTooltipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/RichTooltipColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "titleContentColor", "actionContentColor", "richTooltipColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/RichTooltipColors;", "Landroidx/compose/ui/unit/Dp;", "spacingBetweenTooltipAndAnchor", "Landroidx/compose/ui/window/PopupPositionProvider;", "rememberPlainTooltipPositionProvider-kHDZbjc", "(FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/window/PopupPositionProvider;", "rememberPlainTooltipPositionProvider", "rememberRichTooltipPositionProvider-kHDZbjc", "rememberRichTooltipPositionProvider", "Landroidx/compose/ui/unit/DpSize;", "a", "J", "getCaretSize-MYxV2XQ", "()J", "caretSize", "Landroidx/compose/ui/graphics/Shape;", "getPlainTooltipContainerShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "plainTooltipContainerShape", "getPlainTooltipContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "plainTooltipContainerColor", "getPlainTooltipContentColor", "plainTooltipContentColor", "getRichTooltipContainerShape", "richTooltipContainerShape", "Landroidx/compose/material3/ColorScheme;", "getDefaultRichTooltipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/RichTooltipColors;", "defaultRichTooltipColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n1#2:646\n77#3:647\n77#3:654\n1223#4,6:648\n1223#4,6:655\n148#5:661\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults\n*L\n305#1:647\n338#1:654\n306#1:648,6\n339#1:655,6\n256#1:661\n*E\n"})
public final class TooltipDefaults {
    public static final int $stable;
    @NotNull
    public static final TooltipDefaults INSTANCE;
    public static final long a;

    static {
        TooltipDefaults.INSTANCE = new TooltipDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        TooltipDefaults.a = DpKt.DpSize-YgX7TsA(16.0f, 8.0f);
    }

    public final long getCaretSize-MYxV2XQ() {
        return TooltipDefaults.a;
    }

    @NotNull
    public final RichTooltipColors getDefaultRichTooltipColors$material3_release(@NotNull ColorScheme colorScheme0) {
        RichTooltipColors richTooltipColors0 = colorScheme0.getDefaultRichTooltipColorsCached$material3_release();
        if(richTooltipColors0 == null) {
            richTooltipColors0 = new RichTooltipColors(ColorSchemeKt.fromToken(colorScheme0, RichTooltipTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, RichTooltipTokens.INSTANCE.getSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme0, RichTooltipTokens.INSTANCE.getSubheadColor()), ColorSchemeKt.fromToken(colorScheme0, RichTooltipTokens.INSTANCE.getActionLabelTextColor()), null);
            colorScheme0.setDefaultRichTooltipColorsCached$material3_release(richTooltipColors0);
        }
        return richTooltipColors0;
    }

    @Composable
    @JvmName(name = "getPlainTooltipContainerColor")
    public final long getPlainTooltipContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x61F0517, v, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:244)");
        }
        long v1 = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getPlainTooltipContainerShape")
    @NotNull
    public final Shape getPlainTooltipContainerShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2F46215, v, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:240)");
        }
        Shape shape0 = ShapesKt.getValue(PlainTooltipTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @JvmName(name = "getPlainTooltipContentColor")
    public final long getPlainTooltipContentColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x89CEE7D7, v, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:248)");
        }
        long v1 = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getRichTooltipContainerShape")
    @NotNull
    public final Shape getRichTooltipContainerShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x43DF5517, v, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:252)");
        }
        Shape shape0 = ShapesKt.getValue(RichTooltipTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @NotNull
    public final PopupPositionProvider rememberPlainTooltipPositionProvider-kHDZbjc(float f, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = 4.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1047866909, v, -1, "androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider (Tooltip.kt:302)");
        }
        int v2 = ((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())).roundToPx-0680j_4(f);
        boolean z = composer0.changed(v2);
        androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider.1.1 tooltipDefaults$rememberPlainTooltipPositionProvider$1$10 = composer0.rememberedValue();
        if(z || tooltipDefaults$rememberPlainTooltipPositionProvider$1$10 == Composer.Companion.getEmpty()) {
            tooltipDefaults$rememberPlainTooltipPositionProvider$1$10 = new PopupPositionProvider() {
                public final int a;

                {
                    this.a = v;
                }

                @Override  // androidx.compose.ui.window.PopupPositionProvider
                public long calculatePosition-llwVHH4(@NotNull IntRect intRect0, long v, @NotNull LayoutDirection layoutDirection0, long v1) {
                    return IntOffsetKt.IntOffset((intRect0.getWidth() - IntSize.getWidth-impl(v1)) / 2 + intRect0.getLeft(), (intRect0.getTop() - IntSize.getHeight-impl(v1) - this.a >= 0 ? intRect0.getTop() - IntSize.getHeight-impl(v1) - this.a : intRect0.getBottom() + this.a));
                }
            };
            composer0.updateRememberedValue(tooltipDefaults$rememberPlainTooltipPositionProvider$1$10);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipDefaults$rememberPlainTooltipPositionProvider$1$10;
    }

    @Composable
    @NotNull
    public final PopupPositionProvider rememberRichTooltipPositionProvider-kHDZbjc(float f, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = 4.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA447ABF5, v, -1, "androidx.compose.material3.TooltipDefaults.rememberRichTooltipPositionProvider (Tooltip.kt:335)");
        }
        int v2 = ((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())).roundToPx-0680j_4(f);
        boolean z = composer0.changed(v2);
        androidx.compose.material3.TooltipDefaults.rememberRichTooltipPositionProvider.1.1 tooltipDefaults$rememberRichTooltipPositionProvider$1$10 = composer0.rememberedValue();
        if(z || tooltipDefaults$rememberRichTooltipPositionProvider$1$10 == Composer.Companion.getEmpty()) {
            tooltipDefaults$rememberRichTooltipPositionProvider$1$10 = new PopupPositionProvider() {
                public final int a;

                {
                    this.a = v;
                }

                @Override  // androidx.compose.ui.window.PopupPositionProvider
                public long calculatePosition-llwVHH4(@NotNull IntRect intRect0, long v, @NotNull LayoutDirection layoutDirection0, long v1) {
                    int v2 = intRect0.getLeft();
                    if(IntSize.getWidth-impl(v1) + v2 > IntSize.getWidth-impl(v)) {
                        v2 = intRect0.getRight() - IntSize.getWidth-impl(v1);
                        if(v2 < 0) {
                            v2 = (intRect0.getWidth() - IntSize.getWidth-impl(v1)) / 2 + intRect0.getLeft();
                        }
                    }
                    return IntOffsetKt.IntOffset(v2, (intRect0.getTop() - IntSize.getHeight-impl(v1) - this.a >= 0 ? intRect0.getTop() - IntSize.getHeight-impl(v1) - this.a : intRect0.getBottom() + this.a));
                }
            };
            composer0.updateRememberedValue(tooltipDefaults$rememberRichTooltipPositionProvider$1$10);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipDefaults$rememberRichTooltipPositionProvider$1$10;
    }

    @Composable
    @NotNull
    public final RichTooltipColors richTooltipColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9F4D7B33, v, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:261)");
        }
        RichTooltipColors richTooltipColors0 = this.getDefaultRichTooltipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return richTooltipColors0;
    }

    @Composable
    @NotNull
    public final RichTooltipColors richTooltipColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1498555081, v4, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:274)");
        }
        RichTooltipColors richTooltipColors0 = this.getDefaultRichTooltipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-jRlVdoo(((v5 & 1) == 0 ? v : 0L), ((v5 & 2) == 0 ? v1 : 0L), ((v5 & 4) == 0 ? v2 : 0L), ((v5 & 8) == 0 ? v3 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return richTooltipColors0;
    }
}

