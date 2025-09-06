package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.y;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.text.selection.w0;
import androidx.compose.material.icons.Icons.Filled;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00C7\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J\u008A\u0001\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\u00052\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u00052\b\b\u0002\u0010\u0010\u001A\u00020\u00052\b\b\u0002\u0010\u0011\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u00142\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001D\u001A\u00020\u001CH\u0007\u00A2\u0006\u0004\b\u001D\u0010\u001EJC\u0010%\u001A\u00020\u001C2\u0006\u0010 \u001A\u00020\u001F2\u0013\b\u0002\u0010#\u001A\r\u0012\u0004\u0012\u00020\u001C0!\u00A2\u0006\u0002\b\"2\u0015\b\u0002\u0010$\u001A\u000F\u0012\u0004\u0012\u00020\u001C\u0018\u00010!\u00A2\u0006\u0002\b\"H\u0007\u00A2\u0006\u0004\b%\u0010&J\"\u0010-\u001A\u00020*2\u0006\u0010\'\u001A\u00020\u00052\b\b\u0002\u0010)\u001A\u00020(\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010,R\u001D\u00102\u001A\u00020(8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R\u001D\u00105\u001A\u00020(8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b3\u0010/\u001A\u0004\b4\u00101R\u0018\u00109\u001A\u00020\u0002*\u0002068@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b7\u00108R\u0011\u0010\u0018\u001A\u00020\u00178G\u00A2\u0006\u0006\u001A\u0004\b:\u0010;\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006<"}, d2 = {"Landroidx/compose/material3/SegmentedButtonDefaults;", "", "Landroidx/compose/material3/SegmentedButtonColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SegmentedButtonColors;", "Landroidx/compose/ui/graphics/Color;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "colors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SegmentedButtonColors;", "", "index", "count", "Landroidx/compose/foundation/shape/CornerBasedShape;", "baseShape", "Landroidx/compose/ui/graphics/Shape;", "itemShape", "(IILandroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/Shape;", "", "ActiveIcon", "(Landroidx/compose/runtime/Composer;I)V", "", "active", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "activeContent", "inactiveContent", "Icon", "(ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "color", "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/foundation/BorderStroke;", "borderStroke-l07J4OM", "(JF)Landroidx/compose/foundation/BorderStroke;", "borderStroke", "a", "F", "getBorderWidth-D9Ej5fM", "()F", "BorderWidth", "b", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/material3/ColorScheme;", "getDefaultSegmentedButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SegmentedButtonColors;", "defaultSegmentedButtonColors", "getBaseShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/shape/CornerBasedShape;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,774:1\n1#2:775\n*E\n"})
public final class SegmentedButtonDefaults {
    public static final int $stable;
    @NotNull
    public static final SegmentedButtonDefaults INSTANCE;
    public static final float a;
    public static final float b;

    static {
        SegmentedButtonDefaults.INSTANCE = new SegmentedButtonDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        SegmentedButtonDefaults.a = 0.0f;
        SegmentedButtonDefaults.b = 0.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void ActiveIcon(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1273041460);
        int v1 = (v & 6) == 0 ? (composer1.changed(this) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1273041460, v1, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:545)");
            }
            IconKt.Icon-ww6aTOc(CheckKt.getCheck(Filled.INSTANCE), null, SizeKt.size-3ABfNKs(Modifier.Companion, SegmentedButtonDefaults.b), 0L, composer1, 0x30, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(this, v, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public final void Icon(boolean z, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Composer composer0, int v, int v1) {
        Function2 function23;
        Function2 function22;
        Function2 function25;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x28BDA570);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            function22 = (v1 & 2) == 0 ? function20 : ComposableSingletons.SegmentedButtonKt.INSTANCE.getLambda-1$material3_release();
            Function2 function24 = (v1 & 4) == 0 ? function21 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x28BDA570, v2, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon (SegmentedButton.kt:566)");
            }
            if(function24 == null) {
                composer1.startReplaceGroup(1631306250);
                ExitTransition exitTransition0 = ExitTransition.Companion.getNone();
                function25 = null;
                AnimatedVisibilityKt.AnimatedVisibility(z, null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(350, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.scaleIn-L8ZKh-E(AnimationSpecKt.tween$default(350, 0, null, 6, null), 0.0f, 0x3F800000L)), exitTransition0, null, ComposableLambdaKt.rememberComposableLambda(-750750819, true, new cg(function22, 1), composer1, 54), composer1, v2 & 14 | 0x30000, 18);
            }
            else {
                function25 = function24;
                composer1.startReplaceGroup(0x6143EF44);
                CrossfadeKt.Crossfade(Boolean.valueOf(z), null, null, null, ComposableLambdaKt.rememberComposableLambda(0xAEA5AE6D, true, new w0(1, function22, function25), composer1, 54), composer1, v2 & 14 | 0x6000, 14);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function23 = function25;
        }
        else {
            composer1.skipToGroupEnd();
            function22 = function20;
            function23 = function21;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(this, z, function22, function23, v, v1));
        }
    }

    @NotNull
    public final BorderStroke borderStroke-l07J4OM(long v, float f) {
        return BorderStrokeKt.BorderStroke-cXLIe8U(f, v);
    }

    public static BorderStroke borderStroke-l07J4OM$default(SegmentedButtonDefaults segmentedButtonDefaults0, long v, float f, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f = SegmentedButtonDefaults.a;
        }
        return segmentedButtonDefaults0.borderStroke-l07J4OM(v, f);
    }

    @Composable
    @NotNull
    public final SegmentedButtonColors colors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x287FB229, v, -1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:431)");
        }
        SegmentedButtonColors segmentedButtonColors0 = this.getDefaultSegmentedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return segmentedButtonColors0;
    }

    // 去混淆评级： 低(43)
    @Composable
    @NotNull
    public final SegmentedButtonColors colors-XqyqHi0(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, @Nullable Composer composer0, int v12, int v13, int v14) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7E6307D, v12, v13, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:467)");
        }
        SegmentedButtonColors segmentedButtonColors0 = this.getDefaultSegmentedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-2qZNXz8(((v14 & 1) == 0 ? v : 0L), ((v14 & 2) == 0 ? v1 : 0L), ((v14 & 4) == 0 ? v2 : 0L), ((v14 & 8) == 0 ? v3 : 0L), ((v14 & 16) == 0 ? v4 : 0L), ((v14 & 0x20) == 0 ? v5 : 0L), ((v14 & 0x40) == 0 ? v6 : 0L), ((v14 & 0x80) == 0 ? v7 : 0L), ((v14 & 0x100) == 0 ? v8 : 0L), ((v14 & 0x200) == 0 ? v9 : 0L), ((v14 & 0x400) == 0 ? v10 : 0L), ((v14 & 0x800) == 0 ? v11 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return segmentedButtonColors0;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getBaseShape")
    @NotNull
    public final CornerBasedShape getBaseShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4B5AC6FD, v, -1, "androidx.compose.material3.SegmentedButtonDefaults.<get-baseShape> (SegmentedButton.kt:512)");
        }
        Shape shape0 = ShapesKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getShape(), composer0, 6);
        Intrinsics.checkNotNull(shape0, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return (CornerBasedShape)shape0;
    }

    public final float getBorderWidth-D9Ej5fM() [...] // 潜在的解密器

    @NotNull
    public final SegmentedButtonColors getDefaultSegmentedButtonColors$material3_release(@NotNull ColorScheme colorScheme0) {
        SegmentedButtonColors segmentedButtonColors0 = colorScheme0.getDefaultSegmentedButtonColorsCached$material3_release();
        if(segmentedButtonColors0 == null) {
            segmentedButtonColors0 = new SegmentedButtonColors(ColorSchemeKt.fromToken(colorScheme0, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), colorScheme0.getSurface-0d7_KjU(), ColorSchemeKt.fromToken(colorScheme0, OutlinedSegmentedButtonTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedContainerColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme0.getSurface-0d7_KjU(), ColorSchemeKt.fromToken(colorScheme0, OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), null);
            colorScheme0.setDefaultSegmentedButtonColorsCached$material3_release(segmentedButtonColors0);
        }
        return segmentedButtonColors0;
    }

    public final float getIconSize-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @ReadOnlyComposable
    @NotNull
    public final Shape itemShape(int v, int v1, @Nullable CornerBasedShape cornerBasedShape0, @Nullable Composer composer0, int v2, int v3) {
        Shape shape0;
        if((v3 & 4) != 0) {
            cornerBasedShape0 = this.getBaseShape(composer0, v2 >> 9 & 14);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC7D91F01, v2, -1, "androidx.compose.material3.SegmentedButtonDefaults.itemShape (SegmentedButton.kt:528)");
        }
        if(v1 == 1) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return cornerBasedShape0;
        }
        if(v == 0) {
            shape0 = ShapesKt.start(cornerBasedShape0);
        }
        else if(v == v1 - 1) {
            shape0 = ShapesKt.end(cornerBasedShape0);
        }
        else {
            shape0 = RectangleShapeKt.getRectangleShape();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }
}

