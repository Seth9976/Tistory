package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.t5;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import oa.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x0.d;
import x0.e;
import x0.f;
import x0.g;

@Metadata(d1 = {"\u0000R\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A\u0081\u0001\u0010\u0011\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\u001E\b\u0002\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000B¢\u0006\u0002\b\r¢\u0006\u0002\b\u000E2\u001C\u0010\u0010\u001A\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000B¢\u0006\u0002\b\r¢\u0006\u0002\b\u000EH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001AN\u0010\u001C\u001A\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0019\u001A\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001B\u001AH\u0010 \u001A\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00132\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001F\u001A\u000F\u0010!\u001A\u00020\u0007H\u0007¢\u0006\u0004\b!\u0010\"\u001A\u000F\u0010#\u001A\u00020\u0007H\u0007¢\u0006\u0004\b#\u0010$\"\u001A\u0010)\u001A\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(\"\u001A\u0010,\u001A\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010&\u001A\u0004\b+\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006/²\u0006\f\u0010.\u001A\u00020-8\nX\u008A\u0084\u0002"}, d2 = {"", "isRefreshing", "Lkotlin/Function0;", "", "onRefresh", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "indicator", "content", "PullToRefreshBox", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "threshold", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "elevation", "pullToRefreshIndicator-wUdLESc", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLandroidx/compose/ui/graphics/Shape;JF)Landroidx/compose/ui/Modifier;", "pullToRefreshIndicator", "enabled", "pullToRefresh-Z4HSEVQ", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "pullToRefresh", "rememberPullToRefreshState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "PullToRefreshState", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "c", "F", "getSpinnerSize", "()F", "SpinnerSize", "d", "getSpinnerContainerSize", "SpinnerContainerSize", "", "targetAlpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,678:1\n71#2:679\n69#2,5:680\n74#2:713\n78#2:717\n78#3,6:685\n85#3,4:700\n89#3,2:710\n93#3:716\n368#4,9:691\n377#4:712\n378#4,2:714\n4032#5,6:704\n1223#6,3:718\n1226#6,3:722\n1223#6,6:725\n1223#6,6:731\n1223#6,6:737\n1#7:721\n147#8,5:743\n272#8,14:748\n81#9:762\n158#10:763\n158#10:764\n148#10:765\n148#10:766\n148#10:767\n148#10:768\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n*L\n136#1:679\n136#1:680,5\n136#1:713\n136#1:717\n136#1:685,6\n136#1:700,4\n136#1:710,2\n136#1:716\n136#1:691,9\n136#1:712\n136#1:714,2\n136#1:704,6\n563#1:718,3\n563#1:722,3\n565#1:725,6\n568#1:731,6\n572#1:737,6\n650#1:743,5\n650#1:748,14\n565#1:762\n659#1:763\n660#1:764\n661#1:765\n662#1:766\n663#1:767\n664#1:768\n*E\n"})
public final class PullToRefreshKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final TweenSpec g;

    static {
        PullToRefreshKt.a = 2.5f;
        PullToRefreshKt.b = 5.5f;
        PullToRefreshKt.c = 16.0f;
        PullToRefreshKt.d = 40.0f;
        PullToRefreshKt.e = 10.0f;
        PullToRefreshKt.f = 5.0f;
        PullToRefreshKt.g = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void PullToRefreshBox(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable PullToRefreshState pullToRefreshState0, @Nullable Alignment alignment0, @Nullable Function3 function30, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        Function3 function32;
        Alignment alignment2;
        Modifier modifier2;
        Function3 function33;
        Alignment alignment3;
        PullToRefreshState pullToRefreshState2;
        int v4;
        PullToRefreshState pullToRefreshState3;
        Alignment alignment1;
        int v3;
        PullToRefreshState pullToRefreshState1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x716CCFB3);
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
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                pullToRefreshState1 = pullToRefreshState0;
                v3 = composer1.changed(pullToRefreshState1) ? 0x800 : 0x400;
            }
            else {
                pullToRefreshState1 = pullToRefreshState0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            pullToRefreshState1 = pullToRefreshState0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            alignment1 = alignment0;
        }
        else if((v & 0x6000) == 0) {
            alignment1 = alignment0;
            v2 |= (composer1.changed(alignment1) ? 0x4000 : 0x2000);
        }
        else {
            alignment1 = alignment0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function31) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier1 : Modifier.Companion;
                if((v1 & 8) == 0) {
                    pullToRefreshState3 = pullToRefreshState1;
                }
                else {
                    pullToRefreshState3 = PullToRefreshKt.rememberPullToRefreshState(composer1, 0);
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    alignment1 = Alignment.Companion.getTopStart();
                }
                if((v1 & 0x20) == 0) {
                    v4 = v2;
                    pullToRefreshState2 = pullToRefreshState3;
                    alignment3 = alignment1;
                    function33 = function30;
                    modifier2 = modifier3;
                }
                else {
                    v4 = v2;
                    modifier2 = modifier3;
                    pullToRefreshState2 = pullToRefreshState3;
                    alignment3 = alignment1;
                    function33 = ComposableLambdaKt.rememberComposableLambda(0x76905819, true, new d(pullToRefreshState3, z), composer1, 54);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                v4 = v2;
                pullToRefreshState2 = pullToRefreshState1;
                alignment3 = alignment1;
                function33 = function30;
                modifier2 = modifier1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x716CCFB3, v4, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:134)");
            }
            Modifier modifier4 = PullToRefreshKt.pullToRefresh-Z4HSEVQ$default(modifier2, z, pullToRefreshState2, false, 0.0f, function00, 12, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment3, false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function20);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            function31.invoke(BoxScopeInstance.INSTANCE, composer1, ((int)(v4 >> 15 & 0x70 | 6)));
            function33.invoke(BoxScopeInstance.INSTANCE, composer1, ((int)(v4 >> 12 & 0x70 | 6)));
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function32 = function33;
            alignment2 = alignment3;
            modifier1 = modifier2;
            pullToRefreshState1 = pullToRefreshState2;
        }
        else {
            composer1.skipToGroupEnd();
            alignment2 = alignment1;
            function32 = function30;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t5(z, function00, modifier1, pullToRefreshState1, alignment2, function32, function31, v, v1));
        }
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final PullToRefreshState PullToRefreshState() {
        return new PullToRefreshStateImpl();
    }

    public static final x0.a access$ArrowValues(float f) {
        float f1 = Math.max(Math.min(1.0f, f) - 0.4f, 0.0f) * 5.0f / 3.0f;
        float f2 = c.coerceIn(Math.abs(f) - 1.0f, 0.0f, 2.0f);
        float f3 = (0.4f * f1 - 0.25f + (f2 - ((float)Math.pow(f2, 2.0)) / 4.0f)) * 0.5f;
        return new x0.a(f3, f3 * 360.0f, (0.8f * f1 + f3) * 360.0f, Math.min(1.0f, f1));
    }

    public static final void access$CircularArrowProgressIndicator-RPmYEkk(Function0 function00, long v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xDE0AC7E6);
        int v2 = (v1 & 6) == 0 ? v1 | (composer1.changedInstance(function00) ? 4 : 2) : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDE0AC7E6, v2, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:561)");
            }
            Path path0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(path0 == composer$Companion0.getEmpty()) {
                path0 = AndroidPath_androidKt.Path();
                path0.setFillType-oQ8Xj4U(1);
                composer1.updateRememberedValue(path0);
            }
            State state0 = composer1.rememberedValue();
            if(state0 == composer$Companion0.getEmpty()) {
                state0 = SnapshotStateKt.derivedStateOf(new a4.c(function00, 16));
                composer1.updateRememberedValue(state0);
            }
            State state1 = AnimateAsStateKt.animateFloatAsState(((Number)state0.getValue()).floatValue(), PullToRefreshKt.g, 0.0f, null, null, composer1, 0x30, 28);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            int v3 = 1;
            aa.a a0 = composer1.rememberedValue();
            if((v2 & 14) == 4 || a0 == composer$Companion0.getEmpty()) {
                a0 = new aa.a(function00, 21);
                composer1.updateRememberedValue(a0);
            }
            Modifier modifier0 = SizeKt.size-3ABfNKs(SemanticsModifierKt.semantics(modifier$Companion0, true, a0), PullToRefreshKt.c);
            boolean z = composer1.changed(state1);
            if((v2 & 0x70) != 0x20) {
                v3 = 0;
            }
            boolean z1 = composer1.changedInstance(path0);
            k k0 = composer1.rememberedValue();
            if(((v2 & 14) == 4 | z | v3 | z1) != 0 || k0 == composer$Companion0.getEmpty()) {
                k k1 = new k(function00, state1, v, path0);
                composer1.updateRememberedValue(k1);
                k0 = k1;
            }
            CanvasKt.Canvas(modifier0, k0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new bb.a(v, v1, 3, function00));
        }
    }

    public static final void access$drawArrow-uDrxG_w(DrawScope drawScope0, Path path0, Rect rect0, long v, float f, x0.a a0, float f1) {
        path0.reset();
        path0.moveTo(0.0f, 0.0f);
        float f2 = drawScope0.toPx-0680j_4(PullToRefreshKt.e);
        float f3 = drawScope0.toPx-0680j_4(PullToRefreshKt.f);
        path0.lineTo(f2 * a0.d / 2.0f, f3 * a0.d);
        path0.lineTo(drawScope0.toPx-0680j_4(PullToRefreshKt.e) * a0.d, 0.0f);
        float f4 = drawScope0.toPx-0680j_4(PullToRefreshKt.e);
        float f5 = Offset.getX-impl(rect0.getCenter-F1C5BW0());
        float f6 = Offset.getY-impl(rect0.getCenter-F1C5BW0());
        float f7 = drawScope0.toPx-0680j_4(f1);
        path0.translate-k-4lQ0M(OffsetKt.Offset(f5 + Math.min(rect0.getWidth(), rect0.getHeight()) / 2.0f - f4 * a0.d / 2.0f, f6 - f7));
        float f8 = drawScope0.toPx-0680j_4(f1);
        long v1 = drawScope0.getCenter-F1C5BW0();
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            drawContext0.getTransform().rotate-Uv8p0NA(a0.c - f8, v1);
            DrawScope.drawPath-LG529CI$default(drawScope0, path0, v, f, new Stroke(drawScope0.toPx-0680j_4(f1), 0.0f, 0, 0, null, 30, null), null, 0, 0x30, null);
        }
        finally {
            r0.a.y(drawContext0, v2);
        }
    }

    public static final void access$drawCircularIndicator-KzyDr3Q(DrawScope drawScope0, long v, float f, x0.a a0, Rect rect0, float f1) {
        long v1 = rect0.getSize-NH-jbRc();
        Stroke stroke0 = new Stroke(drawScope0.toPx-0680j_4(f1), 0.0f, 0, 0, null, 26, null);
        DrawScope.drawArc-yD3GUKo$default(drawScope0, v, a0.b, a0.c - a0.b, false, rect0.getTopLeft-F1C5BW0(), v1, f, stroke0, null, 0, 0x300, null);
    }

    public static final float access$getArcRadius$p() [...] // 潜在的解密器

    public static final float access$getStrokeWidth$p() [...] // 潜在的解密器

    public static final float getSpinnerContainerSize() {
        return PullToRefreshKt.d;
    }

    public static final float getSpinnerSize() [...] // 潜在的解密器

    @ExperimentalMaterial3Api
    @NotNull
    public static final Modifier pullToRefresh-Z4HSEVQ(@NotNull Modifier modifier0, boolean z, @NotNull PullToRefreshState pullToRefreshState0, boolean z1, float f, @NotNull Function0 function00) {
        return modifier0.then(new PullToRefreshElement(z, function00, z1, pullToRefreshState0, f, null));
    }

    public static Modifier pullToRefresh-Z4HSEVQ$default(Modifier modifier0, boolean z, PullToRefreshState pullToRefreshState0, boolean z1, float f, Function0 function00, int v, Object object0) {
        if((v & 4) != 0) {
            z1 = true;
        }
        if((v & 8) != 0) {
            f = PullToRefreshDefaults.INSTANCE.getPositionalThreshold-D9Ej5fM();
        }
        return PullToRefreshKt.pullToRefresh-Z4HSEVQ(modifier0, z, pullToRefreshState0, z1, f, function00);
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final Modifier pullToRefreshIndicator-wUdLESc(@NotNull Modifier modifier0, @NotNull PullToRefreshState pullToRefreshState0, boolean z, float f, @NotNull Shape shape0, long v, float f1) {
        return BackgroundKt.background-bw27NRU(GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(SizeKt.size-3ABfNKs(modifier0, PullToRefreshKt.d), e.x), new f(pullToRefreshState0, z, f, f1, shape0)), v, shape0);
    }

    public static Modifier pullToRefreshIndicator-wUdLESc$default(Modifier modifier0, PullToRefreshState pullToRefreshState0, boolean z, float f, Shape shape0, long v, float f1, int v1, Object object0) {
        float f2 = (v1 & 4) == 0 ? f : 80.0f;
        Shape shape1 = (v1 & 8) == 0 ? shape0 : PullToRefreshDefaults.INSTANCE.getShape();
        long v2 = (v1 & 16) == 0 ? v : 0L;
        return (v1 & 0x20) == 0 ? PullToRefreshKt.pullToRefreshIndicator-wUdLESc(modifier0, pullToRefreshState0, z, f2, shape1, v2, f1) : PullToRefreshKt.pullToRefreshIndicator-wUdLESc(modifier0, pullToRefreshState0, z, f2, shape1, v2, 0.0f);
    }

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public static final PullToRefreshState rememberPullToRefreshState(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(318623070, v, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:512)");
        }
        Saver saver0 = PullToRefreshStateImpl.Companion.getSaver();
        PullToRefreshState pullToRefreshState0 = (PullToRefreshStateImpl)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, g.w, composer0, 0xC00, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pullToRefreshState0;
    }
}

