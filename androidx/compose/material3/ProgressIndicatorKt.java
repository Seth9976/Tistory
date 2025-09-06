package androidx.compose.material3;

import a4.c;
import aa.a;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import ce.e;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b%\u001AH\u0010\r\u001A\u00020\n2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\f\u001Am\u0010\r\u001A\u00020\n2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u0019\b\u0002\u0010\u0013\u001A\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0010\u00A2\u0006\u0002\b\u0012H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015\u001A:\u0010\r\u001A\u00020\n2\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001AD\u0010\r\u001A\u00020\n2\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000F\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001AB\u0010\r\u001A\u00020\n2\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\u001A\u001A8\u0010\r\u001A\u00020\n2\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001A0\u0010\r\u001A\u00020\n2\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001AR\u0010\"\u001A\u00020\n2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u001F\u001A\u00020\u000E2\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!\u001A\\\u0010\"\u001A\u00020\n2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u001F\u001A\u00020\u000E2\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000F\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$\u001AD\u0010\"\u001A\u00020\n2\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u001F\u001A\u00020\u000E2\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&\u001AL\u0010\"\u001A\u00020\n2\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u001F\u001A\u00020\u000E2\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010\'\u001A8\u0010\"\u001A\u00020\n2\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u001F\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)\u001A0\u0010\"\u001A\u00020\n2\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u001F\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+\"\u001A\u00100\u001A\u00020\u000E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/\"\u001A\u00103\u001A\u00020\u000E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b1\u0010-\u001A\u0004\b2\u0010/\"\u001A\u00106\u001A\u00020\u000E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b4\u0010-\u001A\u0004\b5\u0010/\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00067"}, d2 = {"Lkotlin/Function0;", "", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "trackColor", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "", "LinearProgressIndicator-_5eSR-E", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "Landroidx/compose/ui/unit/Dp;", "gapSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "drawStopIndicator", "LinearProgressIndicator-GJbTh5U", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJIFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-rIrjwxo", "(Landroidx/compose/ui/Modifier;JJIFLandroidx/compose/runtime/Composer;II)V", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "strokeWidth", "CircularProgressIndicator-DUhRLBM", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator", "CircularProgressIndicator-IyT6zlY", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "c", "F", "getLinearIndicatorWidth", "()F", "LinearIndicatorWidth", "d", "getLinearIndicatorHeight", "LinearIndicatorHeight", "e", "getCircularIndicatorDiameter", "CircularIndicatorDiameter", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1024:1\n1223#2,6:1025\n1223#2,6:1031\n1223#2,6:1037\n1223#2,6:1043\n1223#2,6:1049\n1223#2,6:1055\n1223#2,6:1061\n1223#2,6:1069\n1223#2,6:1075\n1223#2,6:1082\n1223#2,6:1088\n77#3:1067\n77#3:1081\n1#4:1068\n71#5,7:1094\n86#5:1103\n56#5:1104\n148#6:1101\n148#6:1102\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n*L\n145#1:1025,6\n154#1:1031,6\n158#1:1037,6\n162#1:1043,6\n316#1:1049,6\n391#1:1055,6\n582#1:1061,6\n586#1:1069,6\n590#1:1075,6\n692#1:1082,6\n737#1:1088,6\n583#1:1067\n639#1:1081\n824#1:1094,7\n970#1:1103\n970#1:1104\n469#1:1101\n961#1:1102\n*E\n"})
public final class ProgressIndicatorKt {
    public static final float a;
    public static final Modifier b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final CubicBezierEasing f;
    public static final CubicBezierEasing g;
    public static final CubicBezierEasing h;
    public static final CubicBezierEasing i;
    public static final CubicBezierEasing j;

    static {
        ProgressIndicatorKt.a = 10.0f;
        ProgressIndicatorKt.b = PaddingKt.padding-VpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.Companion, o4.H), true, a5.V), 0.0f, 10.0f, 1, null);
        ProgressIndicatorKt.c = 240.0f;
        ProgressIndicatorKt.d = 0.0f;
        ProgressIndicatorKt.e = 0.0f;
        ProgressIndicatorKt.f = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        ProgressIndicatorKt.g = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        ProgressIndicatorKt.h = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        ProgressIndicatorKt.i = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        ProgressIndicatorKt.j = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "Use the overload that takes `progress` as a lambda", replaceWith = @ReplaceWith(expression = "CircularProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\nstrokeWidth = strokeWidth,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    public static final void CircularProgressIndicator-DUhRLBM(float f, @Nullable Modifier modifier0, long v, float f1, long v1, int v2, @Nullable Composer composer0, int v3, int v4) {
        int v11;
        float f3;
        long v10;
        long v14;
        float f4;
        int v13;
        int v12;
        int v9;
        long v8;
        float f2;
        int v7;
        long v6;
        Modifier modifier1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xA83E2731);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(f) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v3 & 0x30) == 0) {
            modifier1 = modifier0;
            v5 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 0x180) == 0) {
            if((v4 & 4) == 0) {
                v6 = v;
                v7 = composer1.changed(v6) ? 0x100 : 0x80;
            }
            else {
                v6 = v;
                v7 = 0x80;
            }
            v5 |= v7;
        }
        else {
            v6 = v;
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            f2 = f1;
        }
        else if((v3 & 0xC00) == 0) {
            f2 = f1;
            v5 |= (composer1.changed(f2) ? 0x800 : 0x400);
        }
        else {
            f2 = f1;
        }
        if((v3 & 0x6000) == 0) {
            if((v4 & 16) == 0) {
                v8 = v1;
                v9 = composer1.changed(v8) ? 0x4000 : 0x2000;
            }
            else {
                v8 = v1;
                v9 = 0x2000;
            }
            v5 |= v9;
        }
        else {
            v8 = v1;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((0x30000 & v3) == 0) {
            v5 |= (composer1.changed(v2) ? 0x20000 : 0x10000);
        }
        if((v5 & 74899) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v4 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v4 & 4) != 0) {
                    v6 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composer1, 6);
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    f2 = 0.0f;
                }
                if((v4 & 16) != 0) {
                    v8 = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composer1, 6);
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x20) == 0) {
                label_84:
                    v13 = v5;
                    f4 = f2;
                    v14 = v8;
                    v12 = v2;
                }
                else {
                    v12 = 0;
                    v13 = v5;
                    f4 = f2;
                    v14 = v8;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                goto label_84;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA83E2731, v13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:735)");
            }
            mh mh0 = composer1.rememberedValue();
            if((v13 & 14) == 4 || mh0 == Composer.Companion.getEmpty()) {
                mh0 = new mh(f, 0);
                composer1.updateRememberedValue(mh0);
            }
            ProgressIndicatorKt.CircularProgressIndicator-IyT6zlY(mh0, modifier1, v6, f4, v14, v12, 0.0f, composer1, v13 & 0x7FFF0, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v8 = v14;
            v10 = v6;
            v11 = v12;
            f3 = f4;
        }
        else {
            composer1.skipToGroupEnd();
            v10 = v6;
            f3 = f2;
            v11 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new nh(f, modifier1, v10, f3, v8, v11, v3, v4, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `gapSize`, see `LegacyCircularProgressIndicatorSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "CircularProgressIndicator(progress, modifier, color, strokeWidth, trackColor, strokeCap, gapSize)", imports = {}))
    public static final void CircularProgressIndicator-DUhRLBM(Function0 function00, Modifier modifier0, long v, float f, long v1, int v2, Composer composer0, int v3, int v4) {
        int v12;
        long v11;
        long v10;
        float f2;
        int v9;
        long v8;
        float f1;
        int v7;
        long v6;
        Modifier modifier1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(-761680467);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v3 & 0x30) == 0) {
            modifier1 = modifier0;
            v5 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 0x180) == 0) {
            if((v4 & 4) == 0) {
                v6 = v;
                v7 = composer1.changed(v6) ? 0x100 : 0x80;
            }
            else {
                v6 = v;
                v7 = 0x80;
            }
            v5 |= v7;
        }
        else {
            v6 = v;
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            f1 = f;
        }
        else if((v3 & 0xC00) == 0) {
            f1 = f;
            v5 |= (composer1.changed(f1) ? 0x800 : 0x400);
        }
        else {
            f1 = f;
        }
        if((v3 & 0x6000) == 0) {
            if((v4 & 16) == 0) {
                v8 = v1;
                v9 = composer1.changed(v8) ? 0x4000 : 0x2000;
            }
            else {
                v8 = v1;
                v9 = 0x2000;
            }
            v5 |= v9;
        }
        else {
            v8 = v1;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((0x30000 & v3) == 0) {
            v5 |= (composer1.changed(v2) ? 0x20000 : 0x10000);
        }
        if((74899 & v5) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v4 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v4 & 4) != 0) {
                    v6 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composer1, 6);
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    f1 = 0.0f;
                }
                if((v4 & 16) != 0) {
                    v8 = ProgressIndicatorDefaults.INSTANCE.getCircularDeterminateTrackColor(composer1, 6);
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x20) == 0) {
                    f2 = f1;
                    v12 = v2;
                }
                else {
                    v12 = 0;
                    f2 = f1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                f2 = f1;
                v12 = v2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-761680467, v5, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:533)");
            }
            ProgressIndicatorKt.CircularProgressIndicator-IyT6zlY(function00, modifier1, v6, f2, v8, v12, 0.0f, composer1, v5 & 14 | 0x180000 | v5 & 0x70 | v5 & 0x380 | v5 & 0x1C00 | 0xE000 & v5 | v5 & 0x70000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
            v10 = v6;
            v11 = v8;
        }
        else {
            composer1.skipToGroupEnd();
            v10 = v6;
            v11 = v8;
            v12 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new hh(function00, modifier1, v10, f1, v11, v12, v3, v4));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CircularProgressIndicator-IyT6zlY(@NotNull Function0 function00, @Nullable Modifier modifier0, long v, float f, long v1, int v2, float f1, @Nullable Composer composer0, int v3, int v4) {
        float f5;
        float f4;
        long v10;
        long v9;
        float f3;
        int v8;
        long v7;
        float f2;
        long v6;
        Modifier modifier1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x94C736F5);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v3 & 0x30) == 0) {
            modifier1 = modifier0;
            v5 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 0x180) == 0) {
            v6 = v;
            v5 |= ((v4 & 4) != 0 || !composer1.changed(v6) ? 0x80 : 0x100);
        }
        else {
            v6 = v;
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            f2 = f;
        }
        else if((v3 & 0xC00) == 0) {
            f2 = f;
            v5 |= (composer1.changed(f2) ? 0x800 : 0x400);
        }
        else {
            f2 = f;
        }
        if((v3 & 0x6000) == 0) {
            v7 = v1;
            v5 |= ((v4 & 16) != 0 || !composer1.changed(v7) ? 0x2000 : 0x4000);
        }
        else {
            v7 = v1;
        }
        if((v4 & 0x20) == 0) {
            v8 = v2;
            if((v3 & 0x30000) == 0) {
                v5 |= (composer1.changed(v8) ? 0x20000 : 0x10000);
            }
        }
        else {
            v5 |= 0x30000;
            v8 = v2;
        }
        if((v4 & 0x40) == 0) {
            f3 = f1;
            if((v3 & 0x180000) == 0) {
                v5 |= (composer1.changed(f3) ? 0x100000 : 0x80000);
            }
        }
        else {
            v5 |= 0x180000;
            f3 = f1;
        }
        if((v5 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v4 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v4 & 4) != 0) {
                    v6 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composer1, 6);
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    f2 = 0.0f;
                }
                if((v4 & 16) == 0) {
                    v9 = v7;
                }
                else {
                    v9 = ProgressIndicatorDefaults.INSTANCE.getCircularDeterminateTrackColor(composer1, 6);
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x20) != 0) {
                    v8 = 0;
                }
                if((v4 & 0x40) != 0) {
                    f3 = 0.0f;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                v9 = v7;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x94C736F5, v5, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:580)");
            }
            c c0 = composer1.rememberedValue();
            if((v5 & 14) == 4 || c0 == Composer.Companion.getEmpty()) {
                c0 = new c(function00, 4);
                composer1.updateRememberedValue(c0);
            }
            Stroke stroke0 = new Stroke(((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f2), 0.0f, v8, 0, null, 26, null);
            boolean z = composer1.changed(c0);
            a a0 = composer1.rememberedValue();
            if(z || a0 == Composer.Companion.getEmpty()) {
                a0 = new a(c0, 8);
                composer1.updateRememberedValue(a0);
            }
            Modifier modifier2 = SizeKt.size-3ABfNKs(SemanticsModifierKt.semantics(modifier1, true, a0), ProgressIndicatorKt.e);
            boolean z1 = composer1.changed(c0);
            int v11 = ((0xE000 & v5 ^ 0x6000) <= 0x4000 || !composer1.changed(v9)) && (v5 & 0x6000) != 0x4000 ? 0 : 1;
            boolean z2 = composer1.changedInstance(stroke0);
            int v12 = ((v5 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(v6)) && (v5 & 0x180) != 0x100 ? 0 : 1;
            ih ih0 = composer1.rememberedValue();
            if(((v5 & 0x70000) == 0x20000 | z1 | ((0x380000 & v5) == 0x100000 ? 1 : 0) | ((v5 & 0x1C00) == 0x800 ? 1 : 0) | v11 | z2 | v12) != 0 || ih0 == Composer.Companion.getEmpty()) {
                ih0 = new ih(c0, v8, f3, f2, v9, stroke0, v6);
                composer1.updateRememberedValue(ih0);
            }
            CanvasKt.Canvas(modifier2, ih0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            v9 = v7;
        }
        v10 = v6;
        f4 = f2;
        f5 = f3;
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new jh(function00, modifier1, v10, f4, v9, v8, f5, v3, v4));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CircularProgressIndicator-LxG7B9w(@Nullable Modifier modifier0, long v, float f, long v1, int v2, @Nullable Composer composer0, int v3, int v4) {
        int v10;
        float f2;
        long v9;
        Stroke stroke1;
        boolean z;
        int v17;
        Modifier modifier4;
        long v14;
        int v13;
        long v12;
        int v11;
        Modifier modifier2;
        long v15;
        int v8;
        long v7;
        float f1;
        long v6;
        Modifier modifier1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xF917F061);
        if((v4 & 1) != 0) {
            v5 = v3 | 6;
            modifier1 = modifier0;
        }
        else if((v3 & 6) == 0) {
            modifier1 = modifier0;
            v5 = (composer1.changed(modifier1) ? 4 : 2) | v3;
        }
        else {
            modifier1 = modifier0;
            v5 = v3;
        }
        if((v3 & 0x30) == 0) {
            v6 = v;
            v5 |= ((v4 & 2) != 0 || !composer1.changed(v6) ? 16 : 0x20);
        }
        else {
            v6 = v;
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
            f1 = f;
        }
        else if((v3 & 0x180) == 0) {
            f1 = f;
            v5 |= (composer1.changed(f1) ? 0x100 : 0x80);
        }
        else {
            f1 = f;
        }
        if((v3 & 0xC00) == 0) {
            if((v4 & 8) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x800 : 0x400;
            }
            else {
                v7 = v1;
                v8 = 0x400;
            }
            v5 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v5 |= (composer1.changed(v2) ? 0x4000 : 0x2000);
        }
        if((v5 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 1) == 0 ? modifier1 : Modifier.Companion;
                if((v4 & 2) != 0) {
                    v6 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composer1, 6);
                    v5 &= 0xFFFFFF8F;
                }
                if((v4 & 4) != 0) {
                    f1 = 0.0f;
                }
                if((v4 & 8) == 0) {
                    v15 = v7;
                }
                else {
                    v15 = ProgressIndicatorDefaults.INSTANCE.getCircularIndeterminateTrackColor(composer1, 6);
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) == 0) {
                    v13 = v5;
                    v14 = v6;
                    f2 = f1;
                    v11 = v2;
                    v12 = v15;
                }
                else {
                    v13 = v5;
                    v12 = v15;
                    f2 = f1;
                    v11 = 0;
                    v14 = v6;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 2) != 0) {
                    v5 &= 0xFFFFFF8F;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                modifier2 = modifier1;
                f2 = f1;
                v11 = v2;
                v12 = v7;
                v13 = v5;
                v14 = v6;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF917F061, v13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
            }
            Stroke stroke0 = new Stroke(((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f2), 0.0f, v11, 0, null, 26, null);
            InfiniteTransition infiniteTransition0 = InfiniteTransitionKt.rememberInfiniteTransition(null, composer1, 0, 1);
            InfiniteRepeatableSpec infiniteRepeatableSpec0 = AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
            int v16 = 1;
            State state0 = InfiniteTransitionKt.animateValue(infiniteTransition0, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), infiniteRepeatableSpec0, null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 12, 16);
            State state1 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 286.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.tween$default(0x534, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            State state2 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 290.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(ph.w), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            State state3 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 290.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(qh.w), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            Modifier modifier3 = SizeKt.size-3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier2), ProgressIndicatorKt.e);
            v7 = v12;
            if((v13 & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(v7)) {
                modifier4 = modifier2;
                v17 = v13;
                if((v17 & 0xC00) == 0x800) {
                    z = true;
                    stroke1 = stroke0;
                }
                else {
                    stroke1 = stroke0;
                    z = false;
                }
            }
            else {
                modifier4 = modifier2;
                v17 = v13;
                z = true;
                stroke1 = stroke0;
            }
            boolean z1 = composer1.changedInstance(stroke1);
            boolean z2 = composer1.changed(state0);
            boolean z3 = composer1.changed(state2);
            boolean z4 = composer1.changed(state3);
            boolean z5 = composer1.changed(state1);
            if(((v17 & 0x70 ^ 0x30) <= 0x20 || !composer1.changed(v14)) && (v17 & 0x30) != 0x20) {
                v16 = 0;
            }
            kh kh0 = composer1.rememberedValue();
            if((z | z1 | z2 | z3 | z4 | z5 | ((v17 & 0x380) == 0x100 ? 1 : 0) | v16) != 0 || kh0 == Composer.Companion.getEmpty()) {
                kh0 = new kh(v7, stroke1, state0, state2, state3, state1, f2, v14);
                composer1.updateRememberedValue(kh0);
            }
            CanvasKt.Canvas(modifier3, kh0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v10 = v11;
            v9 = v14;
            modifier1 = modifier4;
        }
        else {
            composer1.skipToGroupEnd();
            v9 = v6;
            f2 = f1;
            v10 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new lh(modifier1, v9, f2, v7, v10, v3, v4, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public static final void CircularProgressIndicator-MBs18nI(float f, Modifier modifier0, long v, float f1, Composer composer0, int v1, int v2) {
        float f2;
        long v6;
        Modifier modifier1;
        int v5;
        long v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x1802DE6C);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(f) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            if((v2 & 4) == 0) {
                v4 = v;
                v5 = composer1.changed(v4) ? 0x100 : 0x80;
            }
            else {
                v4 = v;
                v5 = 0x80;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v3 |= (composer1.changed(f1) ? 0x800 : 0x400);
        }
        if((v3 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 4) != 0) {
                    v4 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composer1, 6);
                    v3 &= -897;
                }
                if((v2 & 8) == 0) {
                    v6 = v4;
                    f2 = f1;
                }
                else {
                    f2 = 0.0f;
                    v6 = v4;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
                modifier1 = modifier0;
                v6 = v4;
                f2 = f1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1802DE6C, v3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:753)");
            }
            ProgressIndicatorKt.CircularProgressIndicator-DUhRLBM(f, modifier1, v6, f2, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composer1, 6), 0, composer1, v3 & 14 | 0x30000 | v3 & 0x70 | v3 & 0x380 | v3 & 0x1C00, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v6 = v4;
            f2 = f1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new oh(f, modifier1, v6, f2, v1, v2, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public static final void CircularProgressIndicator-aM-cp0Q(Modifier modifier0, long v, float f, Composer composer0, int v1, int v2) {
        long v6;
        Modifier modifier1;
        float f2;
        float f1;
        int v5;
        long v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x3875079C);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v1 & 0x30) == 0) {
            if((v2 & 2) == 0) {
                v4 = v;
                v5 = composer1.changed(v4) ? 0x20 : 16;
            }
            else {
                v4 = v;
                v5 = 16;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            f1 = f;
        }
        else if((v1 & 0x180) == 0) {
            f1 = f;
            v3 |= (composer1.changed(f1) ? 0x100 : 0x80);
        }
        else {
            f1 = f;
        }
        if((v3 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 2) != 0) {
                    v4 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composer1, 6);
                    v3 &= 0xFFFFFF8F;
                }
                f2 = (v2 & 4) == 0 ? f1 : 0.0f;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
                modifier1 = modifier0;
                f2 = f1;
            }
            v6 = v4;
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3875079C, v3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:770)");
            }
            ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(modifier1, v6, f2, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composer1, 6), 0, composer1, v3 & 14 | 0x6000 | v3 & 0x70 | v3 & 0x380, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v6 = v4;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x8(modifier1, v6, f1, v1, v2, 3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `gapSize`, see `LegacyIndeterminateLinearProgressIndicatorSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "LinearProgressIndicator(modifier, color, trackColor, strokeCap, gapSize)", imports = {}))
    public static final void LinearProgressIndicator-2cYBFYY(Modifier modifier0, long v, long v1, int v2, Composer composer0, int v3, int v4) {
        Modifier modifier1;
        int v11;
        int v10;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xE3939CB1);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v3 & 0x30) == 0) {
            if((v4 & 2) == 0) {
                v6 = v;
                v7 = composer1.changed(v6) ? 0x20 : 16;
            }
            else {
                v6 = v;
                v7 = 16;
            }
            v5 |= v7;
        }
        else {
            v6 = v;
        }
        if((v3 & 0x180) == 0) {
            if((v4 & 4) == 0) {
                v8 = v1;
                v9 = composer1.changed(v8) ? 0x100 : 0x80;
            }
            else {
                v8 = v1;
                v9 = 0x80;
            }
            v5 |= v9;
        }
        else {
            v8 = v1;
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            v10 = v2;
        }
        else if((v3 & 0xC00) == 0) {
            v10 = v2;
            v5 |= (composer1.changed(v10) ? 0x800 : 0x400);
        }
        else {
            v10 = v2;
        }
        if((v5 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v4 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 2) != 0) {
                    v6 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composer1, 6);
                    v5 &= 0xFFFFFF8F;
                }
                if((v4 & 4) != 0) {
                    v8 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composer1, 6);
                    v5 &= -897;
                }
                v11 = (v4 & 8) == 0 ? v10 : 0;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 2) != 0) {
                    v5 &= 0xFFFFFF8F;
                }
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                modifier1 = modifier0;
                v11 = v10;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE3939CB1, v5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:217)");
            }
            ProgressIndicatorKt.LinearProgressIndicator-rIrjwxo(modifier1, v6, v8, v11, 0.0f, composer1, v5 & 14 | 0x6000 | v5 & 0x70 | v5 & 0x380 | v5 & 0x1C00, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v10 = v11;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new yh(modifier1, v6, v8, v10, v3, v4, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LinearProgressIndicator-GJbTh5U(@NotNull Function0 function00, @Nullable Modifier modifier0, long v, long v1, int v2, float f, @Nullable Function1 function10, @Nullable Composer composer0, int v3, int v4) {
        Function1 function12;
        long v9;
        int v8;
        Modifier modifier1;
        float f2;
        int v10;
        Function1 function11;
        float f1;
        long v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(-339970038);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v6 = v;
            v5 |= ((v4 & 4) != 0 || !composer1.changed(v6) ? 0x80 : 0x100);
        }
        else {
            v6 = v;
        }
        if((v3 & 0xC00) == 0) {
            v7 = v1;
            v5 |= ((v4 & 8) != 0 || !composer1.changed(v7) ? 0x400 : 0x800);
        }
        else {
            v7 = v1;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v5 |= (composer1.changed(v2) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) == 0) {
            f1 = f;
            if((v3 & 0x30000) == 0) {
                v5 |= (composer1.changed(f1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v5 |= 0x30000;
            f1 = f;
        }
        if((v3 & 0x180000) == 0) {
            function11 = function10;
            v5 |= ((v4 & 0x40) != 0 || !composer1.changedInstance(function11) ? 0x80000 : 0x100000);
        }
        else {
            function11 = function10;
        }
        if((v5 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) != 0) {
                    v6 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composer1, 6);
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v7 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composer1, 6);
                    v5 &= 0xFFFFE3FF;
                }
                v10 = (v4 & 16) == 0 ? v2 : 0;
                if((v4 & 0x20) != 0) {
                    f1 = 0.0f;
                }
                if((v4 & 0x40) != 0) {
                    int v11 = ((v5 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(v6)) && (v5 & 0x180) != 0x100 ? 0 : 1;
                    vh vh0 = composer1.rememberedValue();
                    if((v11 | ((0xE000 & v5) == 0x4000 ? 1 : 0)) != 0 || vh0 == Composer.Companion.getEmpty()) {
                        vh0 = new vh(v6, v10);
                        composer1.updateRememberedValue(vh0);
                    }
                    function11 = vh0;
                    v5 &= 0xFFC7FFFF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 0x40) != 0) {
                    v5 &= 0xFFC7FFFF;
                }
                modifier1 = modifier0;
                v10 = v2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-339970038, v5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:152)");
            }
            c c0 = composer1.rememberedValue();
            if((v5 & 14) == 4 || c0 == Composer.Companion.getEmpty()) {
                c0 = new c(function00, 5);
                composer1.updateRememberedValue(c0);
            }
            Modifier modifier2 = modifier1.then(ProgressIndicatorKt.b);
            boolean z = composer1.changed(c0);
            a a0 = composer1.rememberedValue();
            if(z || a0 == Composer.Companion.getEmpty()) {
                a0 = new a(c0, 9);
                composer1.updateRememberedValue(a0);
            }
            Modifier modifier3 = SizeKt.size-VpY3zN4(SemanticsModifierKt.semantics(modifier2, true, a0), ProgressIndicatorKt.c, ProgressIndicatorKt.d);
            boolean z1 = composer1.changed(c0);
            int v12 = ((v5 & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(v7)) && (v5 & 0xC00) != 0x800 ? 0 : 1;
            int v13 = ((v5 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(v6)) && (v5 & 0x180) != 0x100 ? 0 : 1;
            int v14 = ((0x380000 & v5 ^ 0x180000) <= 0x100000 || !composer1.changed(function11)) && (v5 & 0x180000) != 0x100000 ? 0 : 1;
            wh wh0 = composer1.rememberedValue();
            if((((0x70000 & v5) == 0x20000 ? 1 : 0) | ((0xE000 & v5) == 0x4000 ? 1 : 0) | z1 | v12 | v13 | v14) != 0 || wh0 == Composer.Companion.getEmpty()) {
                wh0 = new wh(v10, f1, c0, v7, v6, function11);
                composer1.updateRememberedValue(wh0);
            }
            CanvasKt.Canvas(modifier3, wh0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function12 = function11;
            f2 = f1;
            v8 = v10;
            v9 = v6;
        }
        else {
            composer1.skipToGroupEnd();
            f2 = f1;
            modifier1 = modifier0;
            v8 = v2;
            v9 = v6;
            function12 = function11;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new xh(function00, modifier1, v9, v7, v8, f2, function12, v3, v4));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public static final void LinearProgressIndicator-RIQooxk(Modifier modifier0, long v, long v1, Composer composer0, int v2, int v3) {
        long v7;
        Modifier modifier1;
        long v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x22E72F03);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v2 & 0x30) == 0) {
            v5 = v;
            v4 |= ((v3 & 2) != 0 || !composer1.changed(v5) ? 16 : 0x20);
        }
        else {
            v5 = v;
        }
        if((v2 & 0x180) == 0) {
            v6 = v1;
            v4 |= ((v3 & 4) != 0 || !composer1.changed(v6) ? 0x80 : 0x100);
        }
        else {
            v6 = v1;
        }
        if((v4 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v5 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composer1, 6);
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v6 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composer1, 6);
                    v4 &= -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                modifier1 = modifier0;
            }
            v7 = v5;
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x22E72F03, v4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:421)");
            }
            ProgressIndicatorKt.LinearProgressIndicator-rIrjwxo(modifier1, v7, v6, 0, 0.0f, composer1, v4 & 14 | 0xC00 | v4 & 0x70 | v4 & 0x380, 16);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v7 = v5;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new th(modifier1, v7, v6, v2, v3, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "Use the overload that takes `progress` as a lambda", replaceWith = @ReplaceWith(expression = "LinearProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    public static final void LinearProgressIndicator-_5eSR-E(float f, @Nullable Modifier modifier0, long v, long v1, int v2, @Nullable Composer composer0, int v3, int v4) {
        int v10;
        long v9;
        long v8;
        long v12;
        int v11;
        long v7;
        long v6;
        Modifier modifier1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x35F79B61);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(f) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v3 & 0x30) == 0) {
            modifier1 = modifier0;
            v5 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 0x180) == 0) {
            v6 = v;
            v5 |= ((v4 & 4) != 0 || !composer1.changed(v6) ? 0x80 : 0x100);
        }
        else {
            v6 = v;
        }
        if((v3 & 0xC00) == 0) {
            v7 = v1;
            v5 |= ((v4 & 8) != 0 || !composer1.changed(v7) ? 0x400 : 0x800);
        }
        else {
            v7 = v1;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v5 |= (composer1.changed(v2) ? 0x4000 : 0x2000);
        }
        if((v5 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v4 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v4 & 4) != 0) {
                    v6 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composer1, 6);
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v7 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composer1, 6);
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) == 0) {
                label_56:
                    v12 = v6;
                    v9 = v7;
                    v11 = v2;
                }
                else {
                    v11 = 0;
                    v12 = v6;
                    v9 = v7;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                goto label_56;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x35F79B61, v5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:389)");
            }
            mh mh0 = composer1.rememberedValue();
            if((v5 & 14) == 4 || mh0 == Composer.Companion.getEmpty()) {
                mh0 = new mh(f, 1);
                composer1.updateRememberedValue(mh0);
            }
            ProgressIndicatorKt.LinearProgressIndicator-GJbTh5U(mh0, modifier1, v12, v9, v11, 0.0f, null, composer1, v5 & 0xFFF0, 0x60);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v10 = v11;
            v8 = v12;
        }
        else {
            composer1.skipToGroupEnd();
            v8 = v6;
            v9 = v7;
            v10 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new lh(f, modifier1, v8, v9, v10, v3, v4, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `gapSize` and `drawStopIndicator`, see `LegacyLinearProgressIndicatorSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "LinearProgressIndicator(progress, modifier, color, trackColor, strokeCap, gapSize, drawStopIndicator)", imports = {}))
    public static final void LinearProgressIndicator-_5eSR-E(Function0 function00, Modifier modifier0, long v, long v1, int v2, Composer composer0, int v3, int v4) {
        Modifier modifier1;
        int v12;
        long v11;
        int v10;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x94E41365);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            if((v4 & 4) == 0) {
                v6 = v;
                v7 = composer1.changed(v6) ? 0x100 : 0x80;
            }
            else {
                v6 = v;
                v7 = 0x80;
            }
            v5 |= v7;
        }
        else {
            v6 = v;
        }
        if((v3 & 0xC00) == 0) {
            if((v4 & 8) == 0) {
                v8 = v1;
                v9 = composer1.changed(v8) ? 0x800 : 0x400;
            }
            else {
                v8 = v1;
                v9 = 0x400;
            }
            v5 |= v9;
        }
        else {
            v8 = v1;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
            v10 = v2;
        }
        else if((v3 & 0x6000) == 0) {
            v10 = v2;
            v5 |= (composer1.changed(v10) ? 0x4000 : 0x2000);
        }
        else {
            v10 = v2;
        }
        if((v5 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) != 0) {
                    v5 &= -897;
                    v6 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composer1, 6);
                }
                if((v4 & 8) != 0) {
                    v8 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composer1, 6);
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) == 0) {
                    v11 = v8;
                    v12 = v10;
                }
                else {
                    v12 = 0;
                    v11 = v8;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                modifier1 = modifier0;
                v11 = v8;
                v12 = v10;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x94E41365, v5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:99)");
            }
            ProgressIndicatorKt.LinearProgressIndicator-GJbTh5U(function00, modifier1, v6, v11, v12, 0.0f, null, composer1, v5 & 14 | 0x30000 | v5 & 0x70 | v5 & 0x380 | v5 & 0x1C00 | v5 & 0xE000, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v10 = v12;
            v8 = v11;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new uh(function00, modifier1, v6, v8, v10, v3, v4));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public static final void LinearProgressIndicator-eaDK9VM(float f, Modifier modifier0, long v, long v1, Composer composer0, int v2, int v3) {
        long v6;
        long v5;
        Modifier modifier1;
        long v8;
        long v7;
        Modifier modifier2;
        long v9;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xE9C8C9B3);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(f) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v4 |= ((v3 & 4) != 0 || !composer1.changed(v) ? 0x80 : 0x100);
        }
        if((v2 & 0xC00) == 0) {
            v4 |= ((v3 & 8) != 0 || !composer1.changed(v1) ? 0x400 : 0x800);
        }
        if((v4 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 4) == 0) {
                    v9 = v;
                }
                else {
                    v9 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composer1, 6);
                    v4 &= -897;
                }
                if((v3 & 8) == 0) {
                    modifier2 = modifier3;
                    v7 = v9;
                    v8 = v1;
                }
                else {
                    v4 &= 0xFFFFE3FF;
                    modifier2 = modifier3;
                    v7 = v9;
                    v8 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composer1, 6);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                modifier2 = modifier0;
                v7 = v;
                v8 = v1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE9C8C9B3, v4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:406)");
            }
            ProgressIndicatorKt.LinearProgressIndicator-_5eSR-E(f, modifier2, v7, v8, 0, composer1, v4 & 14 | 0x6000 | v4 & 0x70 | v4 & 0x380 | v4 & 0x1C00, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            v5 = v7;
            v6 = v8;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v5 = v;
            v6 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sh(f, v2, v3, 0, v5, v6, modifier1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LinearProgressIndicator-rIrjwxo(@Nullable Modifier modifier0, long v, long v1, int v2, float f, @Nullable Composer composer0, int v3, int v4) {
        Modifier modifier1;
        int v11;
        long v10;
        long v9;
        long v15;
        long v14;
        Modifier modifier5;
        Modifier modifier4;
        float f2;
        Modifier modifier2;
        float f1;
        int v8;
        long v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x21D4B971);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v3 & 0x30) == 0) {
            v6 = v;
            v5 |= ((v4 & 2) != 0 || !composer1.changed(v6) ? 16 : 0x20);
        }
        else {
            v6 = v;
        }
        if((v3 & 0x180) == 0) {
            v7 = v1;
            v5 |= ((v4 & 4) != 0 || !composer1.changed(v7) ? 0x80 : 0x100);
        }
        else {
            v7 = v1;
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            v8 = v2;
        }
        else if((v3 & 0xC00) == 0) {
            v8 = v2;
            v5 |= (composer1.changed(v8) ? 0x800 : 0x400);
        }
        else {
            v8 = v2;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
            f1 = f;
        }
        else if((v3 & 0x6000) == 0) {
            f1 = f;
            v5 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        else {
            f1 = f;
        }
        if((v5 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 2) != 0) {
                    v6 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composer1, 6);
                    v5 &= 0xFFFFFF8F;
                }
                if((v4 & 4) != 0) {
                    v7 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composer1, 6);
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v8 = 0;
                }
                f2 = (v4 & 16) == 0 ? f1 : 0.0f;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 2) != 0) {
                    v5 &= 0xFFFFFF8F;
                }
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                modifier2 = modifier0;
                f2 = f1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x21D4B971, v5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:253)");
            }
            InfiniteTransition infiniteTransition0 = InfiniteTransitionKt.rememberInfiniteTransition(null, composer1, 0, 1);
            State state0 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 1.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(ai.w), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            State state1 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 1.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(bi.w), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            State state2 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 1.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(ci.w), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            State state3 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 1.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(di.w), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            Modifier modifier3 = SizeKt.size-VpY3zN4(ProgressSemanticsKt.progressSemantics(modifier2.then(ProgressIndicatorKt.b)), ProgressIndicatorKt.c, ProgressIndicatorKt.d);
            boolean z = composer1.changed(state0);
            int v12 = ((v5 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(v7)) && (v5 & 0x180) != 0x100 ? 0 : 1;
            boolean z1 = composer1.changed(state1);
            int v13 = ((v5 & 0x70 ^ 0x30) <= 0x20 || !composer1.changed(v6)) && (v5 & 0x30) != 0x20 ? 0 : 1;
            boolean z2 = composer1.changed(state2);
            boolean z3 = composer1.changed(state3);
            zh zh0 = composer1.rememberedValue();
            if((((v5 & 0x1C00) == 0x800 ? 1 : 0) | ((0xE000 & v5) == 0x4000 ? 1 : 0) | z | v12 | z1 | v13 | z2 | z3) != 0 || zh0 == Composer.Companion.getEmpty()) {
                modifier4 = modifier2;
                modifier5 = modifier3;
                v14 = v7;
                v15 = v6;
                zh zh1 = new zh(v8, f2, state0, v7, state1, v6, state2, state3);
                composer1.updateRememberedValue(zh1);
                zh0 = zh1;
            }
            else {
                modifier4 = modifier2;
                modifier5 = modifier3;
                v14 = v7;
                v15 = v6;
            }
            CanvasKt.Canvas(modifier5, zh0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v9 = v15;
            modifier1 = modifier4;
            v10 = v14;
            v11 = v8;
            f1 = f2;
        }
        else {
            composer1.skipToGroupEnd();
            v9 = v6;
            v10 = v7;
            v11 = v8;
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new lh(f1, v11, v3, v4, v9, v10, modifier1));
        }
    }

    public static final void a(DrawScope drawScope0, float f, float f1, long v, Stroke stroke0) {
        float f2 = stroke0.getWidth() / 2.0f;
        float f3 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc()) - 2.0f * f2;
        DrawScope.drawArc-yD3GUKo$default(drawScope0, v, f, f1, false, OffsetKt.Offset(f2, f2), androidx.compose.ui.geometry.SizeKt.Size(f3, f3), 0.0f, stroke0, null, 0, 0x340, null);
    }

    public static final void access$drawCircularIndicatorTrack-bw27NRU(DrawScope drawScope0, long v, Stroke stroke0) {
        ProgressIndicatorKt.a(drawScope0, 0.0f, 360.0f, v, stroke0);
    }

    public static final void access$drawDeterminateCircularIndicator-42QJj7c(DrawScope drawScope0, float f, float f1, long v, Stroke stroke0) {
        ProgressIndicatorKt.a(drawScope0, f, f1, v, stroke0);
    }

    // 去混淆评级： 低(20)
    public static final void access$drawIndeterminateCircularIndicator-hrjfTZI(DrawScope drawScope0, float f, float f1, float f2, long v, Stroke stroke0) {
        ProgressIndicatorKt.a(drawScope0, f + (StrokeCap.equals-impl0(stroke0.getCap-KaPHkGw(), 0) ? 0.0f : f1 / (ProgressIndicatorKt.e / 2.0f) * 57.29578f / 2.0f), Math.max(f2, 0.1f), v, stroke0);
    }

    public static final void access$drawLinearIndicator-qYKTg0g(DrawScope drawScope0, float f, float f1, long v, float f2, int v1) {
        float f3 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc());
        float f4 = Size.getHeight-impl(drawScope0.getSize-NH-jbRc());
        boolean z = drawScope0.getLayoutDirection() == LayoutDirection.Ltr;
        float f5 = (z ? f : 1.0f - f1) * f3;
        float f6 = (z ? f1 : 1.0f - f) * f3;
        if(StrokeCap.equals-impl0(v1, 0) || f4 > f3) {
            DrawScope.drawLine-NGM6Ib0$default(drawScope0, v, OffsetKt.Offset(f5, f4 / 2.0f), OffsetKt.Offset(f6, f4 / 2.0f), f2, 0, null, 0.0f, null, 0, 0x1F0, null);
        }
        else {
            ClosedFloatingPointRange closedFloatingPointRange0 = e.rangeTo(f2 / 2.0f, f3 - f2 / 2.0f);
            float f7 = ((Number)kotlin.ranges.c.coerceIn(f5, closedFloatingPointRange0)).floatValue();
            float f8 = ((Number)kotlin.ranges.c.coerceIn(f6, closedFloatingPointRange0)).floatValue();
            if(Math.abs(f1 - f) > 0.0f) {
                DrawScope.drawLine-NGM6Ib0$default(drawScope0, v, OffsetKt.Offset(f7, f4 / 2.0f), OffsetKt.Offset(f8, f4 / 2.0f), f2, v1, null, 0.0f, null, 0, 480, null);
            }
        }
    }

    public static final float access$getSemanticsBoundsPadding$p() [...] // 潜在的解密器

    public static final float getCircularIndicatorDiameter() {
        return ProgressIndicatorKt.e;
    }

    public static final float getLinearIndicatorHeight() {
        return ProgressIndicatorKt.d;
    }

    public static final float getLinearIndicatorWidth() {
        return ProgressIndicatorKt.c;
    }
}

