package androidx.compose.material.pullrefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material3.gc;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import j.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import t0.d;
import t0.e;
import t0.f;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001AJ\u0010\r\u001A\u00020\n2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0011²\u0006\f\u0010\u000E\u001A\u00020\u00008\nX\u008A\u0084\u0002²\u0006\f\u0010\u0010\u001A\u00020\u000F8\nX\u008A\u0084\u0002"}, d2 = {"", "refreshing", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "scale", "", "PullRefreshIndicator-jB83MbM", "(ZLandroidx/compose/material/pullrefresh/PullRefreshState;Landroidx/compose/ui/Modifier;JJZLandroidx/compose/runtime/Composer;II)V", "PullRefreshIndicator", "showElevation", "", "targetAlpha", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,250:1\n50#2:251\n49#2:252\n456#2,8:278\n464#2,3:292\n467#2,3:296\n25#2:301\n36#2:309\n1116#3,6:253\n1116#3,3:302\n1119#3,3:306\n1116#3,6:310\n74#4:259\n154#5:260\n154#5:334\n164#5:335\n164#5:336\n154#5:337\n154#5:338\n154#5:339\n68#6,6:261\n74#6:295\n78#6:300\n79#7,11:267\n92#7:299\n3737#8,6:286\n1#9:305\n137#10,5:316\n262#10,11:321\n81#11:332\n81#11:333\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n*L\n83#1:251\n83#1:252\n94#1:278,8\n94#1:292,3\n94#1:296,3\n135#1:301\n137#1:309\n83#1:253,6\n135#1:302,3\n135#1:306,3\n137#1:310,6\n90#1:259\n98#1:260\n238#1:334\n240#1:335\n241#1:336\n242#1:337\n243#1:338\n244#1:339\n94#1:261,6\n94#1:295\n94#1:300\n94#1:267,11\n94#1:299\n94#1:286,6\n230#1:316,5\n230#1:321,11\n83#1:332\n137#1:333\n*E\n"})
public final class PullRefreshIndicatorKt {
    public static final float a;
    public static final RoundedCornerShape b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final TweenSpec h;

    static {
        PullRefreshIndicatorKt.a = 40.0f;
        PullRefreshIndicatorKt.b = RoundedCornerShapeKt.getCircleShape();
        PullRefreshIndicatorKt.c = 7.5f;
        PullRefreshIndicatorKt.d = 2.5f;
        PullRefreshIndicatorKt.e = 10.0f;
        PullRefreshIndicatorKt.f = 5.0f;
        PullRefreshIndicatorKt.g = 6.0f;
        PullRefreshIndicatorKt.h = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void PullRefreshIndicator-jB83MbM(boolean z, @NotNull PullRefreshState pullRefreshState0, @Nullable Modifier modifier0, long v, long v1, boolean z1, @Nullable Composer composer0, int v2, int v3) {
        long v9;
        int v8;
        long v7;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(308716636);
        Modifier modifier1 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
        if((v3 & 8) == 0) {
            v5 = v;
            v4 = v2;
        }
        else {
            v4 = v2 & 0xFFFFE3FF;
            v5 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
        }
        if((v3 & 16) == 0) {
            v7 = v1;
        }
        else {
            long v6 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 9 & 14);
            v4 &= 0xFFFF1FFF;
            v7 = v6;
        }
        boolean z2 = (v3 & 0x20) == 0 ? z1 : false;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(308716636, v4, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
        }
        composer1.startReplaceableGroup(0x1E7B2B64);
        boolean z3 = composer1.changed(Boolean.valueOf(z));
        boolean z4 = composer1.changed(pullRefreshState0);
        State state0 = composer1.rememberedValue();
        if(z3 || z4 || state0 == Composer.Companion.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new b(z, pullRefreshState0, 2));
            composer1.updateRememberedValue(state0);
        }
        composer1.endReplaceableGroup();
        ElevationOverlay elevationOverlay0 = (ElevationOverlay)composer1.consume(ElevationOverlayKt.getLocalElevationOverlay());
        composer1.startReplaceableGroup(0x31CF28C);
        Color color0 = elevationOverlay0 == null ? null : Color.box-impl(elevationOverlay0.apply-7g2Lkgo(v5, PullRefreshIndicatorKt.g, composer1, v4 >> 9 & 14 | 0x30));
        composer1.endReplaceableGroup();
        if(color0 == null) {
            v8 = v4 & 14;
            v9 = v5;
        }
        else {
            v8 = v4 & 14;
            v9 = color0.unbox-impl();
        }
        Modifier modifier2 = BackgroundKt.background-bw27NRU(ShadowKt.shadow-s4CzXII$default(PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform(SizeKt.size-3ABfNKs(modifier1, PullRefreshIndicatorKt.a), pullRefreshState0, z2), (((Boolean)state0.getValue()).booleanValue() ? PullRefreshIndicatorKt.g : 0.0f), PullRefreshIndicatorKt.b, true, 0L, 0L, 24, null), v9, PullRefreshIndicatorKt.b);
        composer1.startReplaceableGroup(0x2BB5B5D7);
        MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer1, 0, -1323940314);
        int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier2);
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function00);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
            androidx.room.a.t(v10, composer1, v10, function20);
        }
        a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
        CrossfadeKt.Crossfade(Boolean.valueOf(z), null, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, ComposableLambdaKt.composableLambda(composer1, 0x6E7DB0F7, true, new e(v7, pullRefreshState0)), composer1, v8 | 0x6180, 10);
        composer1.endReplaceableGroup();
        composer1.endNode();
        composer1.endReplaceableGroup();
        composer1.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(z, pullRefreshState0, modifier1, v5, v7, z2, v2, v3));
        }
    }

    public static final t0.a access$ArrowValues(float f) {
        float f1 = Math.max(Math.min(1.0f, f) - 0.4f, 0.0f) * 5.0f / 3.0f;
        float f2 = c.coerceIn(Math.abs(f) - 1.0f, 0.0f, 2.0f);
        float f3 = (0.4f * f1 - 0.25f + (f2 - ((float)Math.pow(f2, 2.0)) / 4.0f)) * 0.5f;
        return new t0.a(f3, f3 * 360.0f, (0.8f * f1 + f3) * 360.0f, Math.min(1.0f, f1));
    }

    public static final void access$CircularArrowIndicator-iJQMabo(PullRefreshState pullRefreshState0, long v, Modifier modifier0, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xE307F82B);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE307F82B, v1, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:133)");
        }
        composer1.startReplaceableGroup(0xE2A708A4);
        Path path0 = composer1.rememberedValue();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
        if(path0 == composer$Companion0.getEmpty()) {
            path0 = AndroidPath_androidKt.Path();
            path0.setFillType-oQ8Xj4U(1);
            composer1.updateRememberedValue(path0);
        }
        composer1.endReplaceableGroup();
        composer1.startReplaceableGroup(0x44FAF204);
        boolean z = composer1.changed(pullRefreshState0);
        State state0 = composer1.rememberedValue();
        if(z || state0 == composer$Companion0.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new d(pullRefreshState0, 0));
            composer1.updateRememberedValue(state0);
        }
        composer1.endReplaceableGroup();
        State state1 = AnimateAsStateKt.animateFloatAsState(((Number)state0.getValue()).floatValue(), PullRefreshIndicatorKt.h, 0.0f, null, null, composer1, 0x30, 28);
        CanvasKt.Canvas(SemanticsModifierKt.semantics$default(modifier0, false, t0.b.x, 1, null), new t0.c(pullRefreshState0, state1, v, path0), composer1, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gc(pullRefreshState0, v, modifier0, v1));
        }
    }

    public static final void access$drawArrow-Bx497Mc(DrawScope drawScope0, Path path0, Rect rect0, long v, float f, t0.a a0) {
        path0.reset();
        path0.moveTo(0.0f, 0.0f);
        path0.lineTo(drawScope0.toPx-0680j_4(PullRefreshIndicatorKt.e) * a0.d, 0.0f);
        float f1 = drawScope0.toPx-0680j_4(PullRefreshIndicatorKt.e);
        float f2 = drawScope0.toPx-0680j_4(PullRefreshIndicatorKt.f);
        path0.lineTo(f1 * a0.d / 2.0f, f2 * a0.d);
        float f3 = drawScope0.toPx-0680j_4(PullRefreshIndicatorKt.e);
        float f4 = Offset.getX-impl(rect0.getCenter-F1C5BW0());
        float f5 = Offset.getY-impl(rect0.getCenter-F1C5BW0());
        float f6 = drawScope0.toPx-0680j_4(PullRefreshIndicatorKt.d);
        path0.translate-k-4lQ0M(OffsetKt.Offset(f4 + Math.min(rect0.getWidth(), rect0.getHeight()) / 2.0f - f3 * a0.d / 2.0f, f6 / 2.0f + f5));
        path0.close();
        long v1 = drawScope0.getCenter-F1C5BW0();
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().rotate-Uv8p0NA(a0.c, v1);
        DrawScope.drawPath-LG529CI$default(drawScope0, path0, v, f, null, null, 0, 56, null);
        a.y(drawContext0, v2);
    }

    public static final float access$getArcRadius$p() [...] // 潜在的解密器

    public static final float access$getStrokeWidth$p() [...] // 潜在的解密器
}

