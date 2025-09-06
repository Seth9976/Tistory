package androidx.compose.material;

import androidx.annotation.FloatRange;
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
import androidx.compose.material3.kh;
import androidx.compose.material3.lh;
import androidx.compose.material3.nh;
import androidx.compose.material3.oh;
import androidx.compose.material3.sh;
import androidx.compose.material3.th;
import androidx.compose.material3.x8;
import androidx.compose.material3.yh;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import ca.r1;
import ce.e;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.l6;
import p0.m6;
import p0.n6;
import p0.o6;
import p0.p6;
import p0.q6;
import p0.r6;
import p0.r;
import p0.s6;
import p0.t6;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0005\u001A\u0013\u0010\u0001\u001A\u00020\u0000*\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u0001\u0010\u0002\u001AD\u0010\u000E\u001A\u00020\u000B2\b\b\u0001\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\r\u001A:\u0010\u000E\u001A\u00020\u000B2\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010\u001A8\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A0\u0010\u000E\u001A\u00020\u000B2\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014\u001AN\u0010\u0019\u001A\u00020\u000B2\b\b\u0001\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001AD\u0010\u0019\u001A\u00020\u000B2\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001A8\u0010\u0019\u001A\u00020\u000B2\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u0016\u001A\u00020\u0015H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001A0\u0010\u0019\u001A\u00020\u000B2\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u0016\u001A\u00020\u0015H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001F\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006)\u00B2\u0006\f\u0010 \u001A\u00020\u00038\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010!\u001A\u00020\u00038\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010\"\u001A\u00020\u00038\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010#\u001A\u00020\u00038\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010%\u001A\u00020$8\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010&\u001A\u00020\u00038\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010\'\u001A\u00020\u00038\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010(\u001A\u00020\u00038\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "increaseSemanticsBounds", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "progress", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "backgroundColor", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "strokeWidth", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "", "currentRotation", "baseRotation", "endAngle", "startAngle", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,619:1\n154#2:620\n154#2:650\n154#2:651\n1116#3,6:621\n1116#3,6:627\n74#4:633\n74#4:634\n75#5,7:635\n81#6:642\n81#6:643\n81#6:644\n81#6:645\n81#6:646\n81#6:647\n81#6:648\n81#6:649\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n*L\n57#1:620\n562#1:650\n566#1:651\n117#1:621,6\n197#1:627,6\n328#1:633\n366#1:634\n544#1:635,7\n148#1:642\n159#1:643\n170#1:644\n181#1:645\n372#1:646\n384#1:647\n395#1:648\n407#1:649\n*E\n"})
public final class ProgressIndicatorKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final CubicBezierEasing d;
    public static final CubicBezierEasing e;
    public static final CubicBezierEasing f;
    public static final CubicBezierEasing g;
    public static final CubicBezierEasing h;

    static {
        ProgressIndicatorKt.a = 4.0f;
        ProgressIndicatorKt.b = 240.0f;
        ProgressIndicatorKt.c = 40.0f;
        ProgressIndicatorKt.d = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        ProgressIndicatorKt.e = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        ProgressIndicatorKt.f = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        ProgressIndicatorKt.g = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        ProgressIndicatorKt.h = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CircularProgressIndicator-DUhRLBM(@FloatRange(from = 0.0, to = 1.0) float f, @Nullable Modifier modifier0, long v, float f1, long v1, int v2, @Nullable Composer composer0, int v3, int v4) {
        long v12;
        long v11;
        long v13;
        int v10;
        int v9;
        long v8;
        float f2;
        int v7;
        long v6;
        Modifier modifier1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x681B4850);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v3 & 0x70) == 0) {
            modifier1 = modifier0;
            v5 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 0x380) == 0) {
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
        else if((v3 & 0x1C00) == 0) {
            f2 = f1;
            v5 |= (composer1.changed(f2) ? 0x800 : 0x400);
        }
        else {
            f2 = f1;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
            v8 = v1;
        }
        else if((0xE000 & v3) == 0) {
            v8 = v1;
            v5 |= (composer1.changed(v8) ? 0x4000 : 0x2000);
        }
        else {
            v8 = v1;
        }
        if((0x70000 & v3) == 0) {
            if((v4 & 0x20) == 0) {
                v9 = v2;
                v10 = composer1.changed(v9) ? 0x20000 : 0x10000;
            }
            else {
                v9 = v2;
                v10 = 0x10000;
            }
            v5 |= v10;
        }
        else {
            v9 = v2;
        }
        if((0x5B6DB & v5) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v4 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v4 & 4) != 0) {
                    v6 = MaterialTheme.INSTANCE.getColors(composer1, 6).getPrimary-0d7_KjU();
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    f2 = 4.0f;
                }
                v13 = (v4 & 16) == 0 ? v8 : 0L;
                if((v4 & 0x20) != 0) {
                    v5 &= 0xFFF8FFFF;
                    v9 = 0;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 0x20) != 0) {
                    v5 &= 0xFFF8FFFF;
                }
                v13 = v8;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x681B4850, v5, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:325)");
            }
            float f3 = c.coerceIn(f, 0.0f, 1.0f);
            Stroke stroke0 = new Stroke(((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f2), 0.0f, v9, 0, null, 26, null);
            CanvasKt.Canvas(SizeKt.size-3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier1, f3, null, 0, 6, null), ProgressIndicatorKt.c), new l6(f3, v13, stroke0, v6), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v11 = v6;
            v12 = v13;
        }
        else {
            composer1.skipToGroupEnd();
            v11 = v6;
            v12 = v8;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new nh(f, modifier1, v11, f2, v12, v9, v3, v4, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CircularProgressIndicator-LxG7B9w(@Nullable Modifier modifier0, long v, float f, long v1, int v2, @Nullable Composer composer0, int v3, int v4) {
        int v11;
        long v10;
        long v9;
        Modifier modifier2;
        long v14;
        float f2;
        int v13;
        int v12;
        long v8;
        float f1;
        int v7;
        long v6;
        Modifier modifier1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xBD4B9920);
        if((v4 & 1) != 0) {
            v5 = v3 | 6;
            modifier1 = modifier0;
        }
        else if((v3 & 14) == 0) {
            modifier1 = modifier0;
            v5 = (composer1.changed(modifier1) ? 4 : 2) | v3;
        }
        else {
            modifier1 = modifier0;
            v5 = v3;
        }
        if((v3 & 0x70) == 0) {
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
        if((v4 & 4) != 0) {
            v5 |= 0x180;
            f1 = f;
        }
        else if((v3 & 0x380) == 0) {
            f1 = f;
            v5 |= (composer1.changed(f1) ? 0x100 : 0x80);
        }
        else {
            f1 = f;
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            v8 = v1;
        }
        else if((v3 & 0x1C00) == 0) {
            v8 = v1;
            v5 |= (composer1.changed(v8) ? 0x800 : 0x400);
        }
        else {
            v8 = v1;
        }
        if((0xE000 & v3) == 0) {
            v5 |= ((v4 & 16) != 0 || !composer1.changed(v2) ? 0x2000 : 0x4000);
        }
        if((0xB6DB & v5) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 1) == 0 ? modifier1 : Modifier.Companion;
                if((v4 & 2) != 0) {
                    v5 &= 0xFFFFFF8F;
                    v6 = MaterialTheme.INSTANCE.getColors(composer1, 6).getPrimary-0d7_KjU();
                }
                if((v4 & 4) != 0) {
                    f1 = 4.0f;
                }
                if((v4 & 8) != 0) {
                    v8 = 0L;
                }
                if((v4 & 16) == 0) {
                label_76:
                    v13 = v5;
                    f2 = f1;
                    v14 = v8;
                    v12 = v2;
                }
                else {
                    v12 = 2;
                    v13 = v5 & 0xFFFF1FFF;
                    f2 = f1;
                    v14 = v8;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 2) != 0) {
                    v5 &= 0xFFFFFF8F;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                modifier2 = modifier1;
                goto label_76;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBD4B9920, v13, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:364)");
            }
            Stroke stroke0 = new Stroke(((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f2), 0.0f, v12, 0, null, 26, null);
            InfiniteTransition infiniteTransition0 = InfiniteTransitionKt.rememberInfiniteTransition(null, composer1, 0, 1);
            InfiniteRepeatableSpec infiniteRepeatableSpec0 = AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
            State state0 = InfiniteTransitionKt.animateValue(infiniteTransition0, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), infiniteRepeatableSpec0, null, composer1, InfiniteTransition.$stable | 0x11B0 | InfiniteRepeatableSpec.$stable << 12, 16);
            State state1 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 286.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.tween$default(0x534, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            State state2 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 290.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(m6.w), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            State state3 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 290.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(n6.w), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            CanvasKt.Canvas(SizeKt.size-3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier2), ProgressIndicatorKt.c), new kh(v14, stroke0, f2, v6, state0, state2, state3, state1), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            v9 = v6;
            v11 = v12;
            f1 = f2;
            v10 = v14;
        }
        else {
            composer1.skipToGroupEnd();
            v9 = v6;
            v10 = v8;
            v11 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new lh(modifier1, v9, f1, v10, v11, v3, v4, 3));
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
        Composer composer1 = composer0.startRestartGroup(-409649739);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
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
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changed(f1) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 4) != 0) {
                    v4 = MaterialTheme.INSTANCE.getColors(composer1, 6).getPrimary-0d7_KjU();
                    v3 &= -897;
                }
                if((v2 & 8) == 0) {
                    v6 = v4;
                    f2 = f1;
                }
                else {
                    f2 = 4.0f;
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
                ComposerKt.traceEventStart(-409649739, v3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:442)");
            }
            ProgressIndicatorKt.CircularProgressIndicator-DUhRLBM(f, modifier1, v6, f2, 0L, 0, composer1, v3 & 14 | 0x6000 | v3 & 0x70 | v3 & 0x380 | v3 & 0x1C00, 0);
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
            scopeUpdateScope0.updateScope(new oh(f, modifier1, v6, f2, v1, v2, 2));
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
        Composer composer1 = composer0.startRestartGroup(-392089979);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v1 & 0x70) == 0) {
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
        else if((v1 & 0x380) == 0) {
            f1 = f;
            v3 |= (composer1.changed(f1) ? 0x100 : 0x80);
        }
        else {
            f1 = f;
        }
        if((v3 & 731) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 2) != 0) {
                    v4 = MaterialTheme.INSTANCE.getColors(composer1, 6).getPrimary-0d7_KjU();
                    v3 &= 0xFFFFFF8F;
                }
                f2 = (v2 & 4) == 0 ? f1 : 4.0f;
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
                ComposerKt.traceEventStart(-392089979, v3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:457)");
            }
            ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(modifier1, v6, f2, 0L, 2, composer1, v3 & 14 | 0xC00 | v3 & 0x70 | v3 & 0x380, 0);
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
            scopeUpdateScope0.updateScope(new x8(modifier1, v6, f1, v1, v2, 4));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LinearProgressIndicator-2cYBFYY(@Nullable Modifier modifier0, long v, long v1, int v2, @Nullable Composer composer0, int v3, int v4) {
        int v12;
        long v11;
        long v10;
        Modifier modifier5;
        Modifier modifier4;
        int v13;
        Modifier modifier2;
        int v9;
        long v8;
        int v7;
        long v6;
        Modifier modifier1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(1501635280);
        if((v4 & 1) != 0) {
            v5 = v3 | 6;
            modifier1 = modifier0;
        }
        else if((v3 & 14) == 0) {
            modifier1 = modifier0;
            v5 = (composer1.changed(modifier1) ? 4 : 2) | v3;
        }
        else {
            modifier1 = modifier0;
            v5 = v3;
        }
        if((v3 & 0x70) == 0) {
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
        if((v3 & 0x380) == 0) {
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
        if((v3 & 0x1C00) == 0) {
            v5 |= ((v4 & 8) != 0 || !composer1.changed(v2) ? 0x400 : 0x800);
        }
        if((v5 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 1) == 0 ? modifier1 : Modifier.Companion;
                if((v4 & 2) != 0) {
                    v6 = MaterialTheme.INSTANCE.getColors(composer1, 6).getPrimary-0d7_KjU();
                    v5 &= 0xFFFFFF8F;
                }
                if((v4 & 4) != 0) {
                    v8 = Color.copy-wmQWz5c$default(v6, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    v5 &= -897;
                }
                if((v4 & 8) == 0) {
                    v13 = v2;
                }
                else {
                    v5 &= 0xFFFFE3FF;
                    v13 = 0;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 2) != 0) {
                    v5 &= 0xFFFFFF8F;
                }
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                modifier2 = modifier1;
                v13 = v2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501635280, v5, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:142)");
            }
            InfiniteTransition infiniteTransition0 = InfiniteTransitionKt.rememberInfiniteTransition(null, composer1, 0, 1);
            State state0 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 1.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(q6.w), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            State state1 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 1.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(r6.w), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            State state2 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 1.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(s6.w), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            State state3 = InfiniteTransitionKt.animateFloat(infiniteTransition0, 0.0f, 1.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(t6.w), null, 0L, 6, null), null, composer1, InfiniteTransition.$stable | 0x1B0 | InfiniteRepeatableSpec.$stable << 9, 8);
            Modifier modifier3 = SizeKt.size-VpY3zN4(ProgressSemanticsKt.progressSemantics(ProgressIndicatorKt.increaseSemanticsBounds(modifier2)), ProgressIndicatorKt.b, ProgressIndicatorKt.a);
            composer1.startReplaceableGroup(0xEA06E67F);
            boolean z = composer1.changed(v8);
            boolean z1 = composer1.changed(v13);
            boolean z2 = composer1.changed(state0);
            boolean z3 = composer1.changed(state1);
            boolean z4 = composer1.changed(v6);
            boolean z5 = composer1.changed(state2);
            boolean z6 = composer1.changed(state3);
            p6 p60 = composer1.rememberedValue();
            if((z | z1 | z2 | z3 | z4 | z5 | z6) != 0 || p60 == Composer.Companion.getEmpty()) {
                modifier4 = modifier2;
                v10 = v6;
                modifier5 = modifier3;
                p6 p61 = new p6(v8, v13, v6, state0, state1, state2, state3);
                composer1.updateRememberedValue(p61);
                p60 = p61;
            }
            else {
                modifier4 = modifier2;
                v10 = v6;
                modifier5 = modifier3;
            }
            composer1.endReplaceableGroup();
            CanvasKt.Canvas(modifier5, p60, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v11 = v8;
            v12 = v13;
            modifier1 = modifier4;
        }
        else {
            composer1.skipToGroupEnd();
            v10 = v6;
            v11 = v8;
            v12 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new yh(modifier1, v10, v11, v12, v3, v4, 1));
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
        Composer composer1 = composer0.startRestartGroup(0xCF28FE3E);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v2 & 0x70) == 0) {
            v5 = v;
            v4 |= ((v3 & 2) != 0 || !composer1.changed(v5) ? 16 : 0x20);
        }
        else {
            v5 = v;
        }
        if((v2 & 0x380) == 0) {
            v6 = v1;
            v4 |= ((v3 & 4) != 0 || !composer1.changed(v6) ? 0x80 : 0x100);
        }
        else {
            v6 = v1;
        }
        if((v4 & 731) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v5 = MaterialTheme.INSTANCE.getColors(composer1, 6).getPrimary-0d7_KjU();
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v6 = Color.copy-wmQWz5c$default(v5, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
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
                ComposerKt.traceEventStart(0xCF28FE3E, v4, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:241)");
            }
            ProgressIndicatorKt.LinearProgressIndicator-2cYBFYY(modifier1, v7, v6, 0, composer1, v4 & 0x3FE, 0);
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
            scopeUpdateScope0.updateScope(new th(modifier1, v7, v6, v2, v3, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LinearProgressIndicator-_5eSR-E(@FloatRange(from = 0.0, to = 1.0) float f, @Nullable Modifier modifier0, long v, long v1, int v2, @Nullable Composer composer0, int v3, int v4) {
        Modifier modifier1;
        int v11;
        int v10;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xE04A8E20);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x380) == 0) {
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
        if((v3 & 0x1C00) == 0) {
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
        if((0xE000 & v3) == 0) {
            if((v4 & 16) == 0) {
                v10 = v2;
                v11 = composer1.changed(v10) ? 0x4000 : 0x2000;
            }
            else {
                v10 = v2;
                v11 = 0x2000;
            }
            v5 |= v11;
        }
        else {
            v10 = v2;
        }
        if((0xB6DB & v5) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) != 0) {
                    v5 &= -897;
                    v6 = MaterialTheme.INSTANCE.getColors(composer1, 6).getPrimary-0d7_KjU();
                }
                if((v4 & 8) != 0) {
                    v8 = Color.copy-wmQWz5c$default(v6, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                    v10 = 0;
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
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                modifier1 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE04A8E20, v5, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:109)");
            }
            float f1 = c.coerceIn(f, 0.0f, 1.0f);
            Modifier modifier2 = SizeKt.size-VpY3zN4(ProgressSemanticsKt.progressSemantics$default(ProgressIndicatorKt.increaseSemanticsBounds(modifier1), f1, null, 0, 6, null), ProgressIndicatorKt.b, ProgressIndicatorKt.a);
            composer1.startReplaceableGroup(0xEA06DA20);
            boolean z = composer1.changed(v8);
            boolean z1 = composer1.changed(v10);
            boolean z2 = composer1.changed(f1);
            boolean z3 = composer1.changed(v6);
            o6 o60 = composer1.rememberedValue();
            if((z | z1 | z2 | z3) != 0 || o60 == Composer.Companion.getEmpty()) {
                o60 = new o6(v8, v10, f1, v6);
                composer1.updateRememberedValue(o60);
            }
            composer1.endReplaceableGroup();
            CanvasKt.Canvas(modifier2, o60, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new lh(f, modifier1, v6, v8, v10, v3, v4, 4));
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
        Composer composer1 = composer0.startRestartGroup(-850309746);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v4 |= ((v3 & 4) != 0 || !composer1.changed(v) ? 0x80 : 0x100);
        }
        if((v2 & 0x1C00) == 0) {
            v4 |= ((v3 & 8) != 0 || !composer1.changed(v1) ? 0x400 : 0x800);
        }
        if((v4 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 4) == 0) {
                    v9 = v;
                }
                else {
                    v9 = MaterialTheme.INSTANCE.getColors(composer1, 6).getPrimary-0d7_KjU();
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
                    v8 = Color.copy-wmQWz5c$default(v9, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
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
                ComposerKt.traceEventStart(-850309746, v4, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:227)");
            }
            ProgressIndicatorKt.LinearProgressIndicator-_5eSR-E(f, modifier2, v7, v8, 0, composer1, v4 & 0x1FFE, 0);
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
            scopeUpdateScope0.updateScope(new sh(f, v2, v3, 1, v5, v6, modifier1));
        }
    }

    public static final void a(DrawScope drawScope0, float f, float f1, long v, Stroke stroke0) {
        float f2 = stroke0.getWidth() / 2.0f;
        float f3 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc()) - 2.0f * f2;
        DrawScope.drawArc-yD3GUKo$default(drawScope0, v, f, f1, false, OffsetKt.Offset(f2, f2), androidx.compose.ui.geometry.SizeKt.Size(f3, f3), 0.0f, stroke0, null, 0, 0x340, null);
    }

    public static final float access$CircularProgressIndicator_LxG7B9w$lambda$10(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$CircularProgressIndicator_LxG7B9w$lambda$11(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final int access$CircularProgressIndicator_LxG7B9w$lambda$8(State state0) {
        return ((Number)state0.getValue()).intValue();
    }

    public static final float access$CircularProgressIndicator_LxG7B9w$lambda$9(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$LinearProgressIndicator_2cYBFYY$lambda$1(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$LinearProgressIndicator_2cYBFYY$lambda$2(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$LinearProgressIndicator_2cYBFYY$lambda$3(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$LinearProgressIndicator_2cYBFYY$lambda$4(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final void access$drawCircularIndicatorBackground-bw27NRU(DrawScope drawScope0, long v, Stroke stroke0) {
        ProgressIndicatorKt.a(drawScope0, 0.0f, 360.0f, v, stroke0);
    }

    public static final void access$drawDeterminateCircularIndicator-42QJj7c(DrawScope drawScope0, float f, float f1, long v, Stroke stroke0) {
        ProgressIndicatorKt.a(drawScope0, f, f1, v, stroke0);
    }

    // 去混淆评级： 低(20)
    public static final void access$drawIndeterminateCircularIndicator-hrjfTZI(DrawScope drawScope0, float f, float f1, float f2, long v, Stroke stroke0) {
        ProgressIndicatorKt.a(drawScope0, f + (StrokeCap.equals-impl0(stroke0.getCap-KaPHkGw(), 0) ? 0.0f : f1 / (ProgressIndicatorKt.c / 2.0f) * 57.29578f / 2.0f), Math.max(f2, 0.1f), v, stroke0);
    }

    public static final void access$drawLinearIndicatorBackground-AZGd3zU(DrawScope drawScope0, long v, float f, int v1) {
        ProgressIndicatorKt.b(drawScope0, 0.0f, 1.0f, v, f, v1);
    }

    public static final void b(DrawScope drawScope0, float f, float f1, long v, float f2, int v1) {
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
            float f7 = ((Number)c.coerceIn(f5, closedFloatingPointRange0)).floatValue();
            float f8 = ((Number)c.coerceIn(f6, closedFloatingPointRange0)).floatValue();
            if(Math.abs(f1 - f) > 0.0f) {
                DrawScope.drawLine-NGM6Ib0$default(drawScope0, v, OffsetKt.Offset(f7, f4 / 2.0f), OffsetKt.Offset(f8, f4 / 2.0f), f2, v1, null, 0.0f, null, 0, 480, null);
            }
        }
    }

    @NotNull
    public static final Modifier increaseSemanticsBounds(@NotNull Modifier modifier0) {
        return PaddingKt.padding-VpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(modifier0, new r1(10.0f, 2)), true, r.M), 0.0f, 10.0f, 1, null);
    }
}

