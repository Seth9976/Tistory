package com.google.accompanist.swiperefresh;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p6.c;
import p6.d;
import p6.f;
import p6.g;
import p6.h;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A\u0089\u0001\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u00062\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\n2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u00062\b\b\u0002\u0010\u0011\u001A\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/google/accompanist/swiperefresh/SwipeRefreshState;", "state", "Landroidx/compose/ui/unit/Dp;", "refreshTriggerDistance", "Landroidx/compose/ui/Modifier;", "modifier", "", "fade", "scale", "arrowEnabled", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/graphics/Shape;", "shape", "refreshingOffset", "largeIndication", "elevation", "", "SwipeRefreshIndicator-_UAkqwU", "(Lcom/google/accompanist/swiperefresh/SwipeRefreshState;FLandroidx/compose/ui/Modifier;ZZZJJLandroidx/compose/ui/graphics/Shape;FZFLandroidx/compose/runtime/Composer;III)V", "SwipeRefreshIndicator", "swiperefresh_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwipeRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeRefreshIndicator.kt\ncom/google/accompanist/swiperefresh/SwipeRefreshIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,237:1\n154#2:238\n154#2:239\n154#2:260\n154#2:273\n164#2:274\n164#2:275\n154#2:276\n154#2:277\n154#2:278\n154#2:279\n154#2:280\n154#2:281\n154#2:282\n76#3:240\n76#3:242\n76#3:243\n1#4:241\n25#5:244\n83#5,3:251\n83#5,3:261\n1114#6,6:245\n1114#6,6:254\n1114#6,6:264\n76#7:270\n102#7,2:271\n*S KotlinDebug\n*F\n+ 1 SwipeRefreshIndicator.kt\ncom/google/accompanist/swiperefresh/SwipeRefreshIndicatorKt\n*L\n123#1:238\n125#1:239\n163#1:260\n73#1:273\n74#1:274\n75#1:275\n76#1:276\n77#1:277\n84#1:278\n85#1:279\n86#1:280\n87#1:281\n88#1:282\n129#1:240\n131#1:242\n132#1:243\n140#1:244\n147#1:251,3\n169#1:261,3\n140#1:245,6\n147#1:254,6\n169#1:264,6\n140#1:270\n140#1:271,2\n*E\n"})
public final class SwipeRefreshIndicatorKt {
    public static final h a;
    public static final h b;

    static {
        SwipeRefreshIndicatorKt.a = new h(40.0f, 7.5f, 2.5f, 10.0f, 5.0f);
        SwipeRefreshIndicatorKt.b = new h(56.0f, 11.0f, 3.0f, 12.0f, 6.0f);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "\n     accompanist/swiperefresh is deprecated.\n     The androidx.compose equivalent of SwipeRefreshIndicator() is PullRefreshIndicator().\n     For more migration information, please visit https://google.github.io/accompanist/swiperefresh/#migration\n    ")
    public static final void SwipeRefreshIndicator-_UAkqwU(@NotNull SwipeRefreshState swipeRefreshState0, float f, @Nullable Modifier modifier0, boolean z, boolean z1, boolean z2, long v, long v1, @Nullable Shape shape0, float f1, boolean z3, float f2, @Nullable Composer composer0, int v2, int v3, int v4) {
        float f4;
        boolean z7;
        float f3;
        Shape shape1;
        long v8;
        long v7;
        boolean z6;
        boolean z5;
        Modifier modifier1;
        int v13;
        Shape shape3;
        boolean z10;
        int v11;
        float f6;
        boolean z9;
        float f5;
        Shape shape2;
        long v10;
        long v9;
        boolean z8;
        Modifier modifier2;
        boolean z12;
        Modifier modifier4;
        int v6;
        boolean z4;
        int v5;
        Intrinsics.checkNotNullParameter(swipeRefreshState0, "state");
        Composer composer1 = composer0.startRestartGroup(0x16427F25);
        if((v4 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.changed(swipeRefreshState0) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            z4 = z;
        }
        else if((v2 & 0x1C00) == 0) {
            z4 = z;
            v5 |= (composer1.changed(z4) ? 0x800 : 0x400);
        }
        else {
            z4 = z;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v5 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v5 |= (composer1.changed(z2) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x380000) == 0) {
            v5 |= ((v4 & 0x40) != 0 || !composer1.changed(v) ? 0x80000 : 0x100000);
        }
        if((v2 & 0x1C00000) == 0) {
            v5 |= ((v4 & 0x80) != 0 || !composer1.changed(v1) ? 0x400000 : 0x800000);
        }
        if((v2 & 0xE000000) == 0) {
            v5 |= ((v4 & 0x100) != 0 || !composer1.changed(shape0) ? 0x2000000 : 0x4000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v2 & 0x70000000) == 0) {
            v5 |= (composer1.changed(f1) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) == 0) {
            v6 = (v3 & 14) == 0 ? v3 | (composer1.changed(z3) ? 4 : 2) : v3;
        }
        else {
            v6 = v3 | 6;
        }
        if((v4 & 0x800) != 0) {
            v6 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v6 |= (composer1.changed(f2) ? 0x20 : 16);
        }
        if((v5 & 0x5B6DB6DB) != 306783378 || (v6 & 91) != 18 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v4 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 8) != 0) {
                    z4 = true;
                }
                boolean z11 = (v4 & 16) == 0 ? z1 : false;
                z8 = (v4 & 0x20) == 0 ? z2 : true;
                if((v4 & 0x40) == 0) {
                    modifier4 = modifier3;
                    z12 = z11;
                    v9 = v;
                }
                else {
                    v5 &= 0xFFC7FFFF;
                    modifier4 = modifier3;
                    z12 = z11;
                    v9 = MaterialTheme.INSTANCE.getColors(composer1, MaterialTheme.$stable).getSurface-0d7_KjU();
                }
                if((v4 & 0x80) == 0) {
                    v10 = v1;
                }
                else {
                    v10 = ColorsKt.contentColorFor-ek8zF_U(v9, composer1, v5 >> 18 & 14);
                    v5 &= 0xFE3FFFFF;
                }
                if((v4 & 0x100) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = MaterialTheme.INSTANCE.getShapes(composer1, MaterialTheme.$stable).getSmall().copy(CornerSizeKt.CornerSize(50));
                    v5 &= 0xF1FFFFFF;
                }
                float f7 = (v4 & 0x200) == 0 ? f1 : 16.0f;
                z9 = (v4 & 0x400) == 0 ? z3 : false;
                if((v4 & 0x800) == 0) {
                    f6 = f2;
                    f5 = f7;
                    v11 = v5;
                    modifier2 = modifier4;
                    z10 = z12;
                }
                else {
                    v11 = v5;
                    f6 = 6.0f;
                    z10 = z12;
                    f5 = f7;
                    modifier2 = modifier4;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 0x40) != 0) {
                    v5 &= 0xFFC7FFFF;
                }
                if((v4 & 0x80) != 0) {
                    v5 &= 0xFE3FFFFF;
                }
                if((v4 & 0x100) != 0) {
                    v5 &= 0xF1FFFFFF;
                }
                modifier2 = modifier0;
                z8 = z2;
                v9 = v;
                v10 = v1;
                shape2 = shape0;
                f5 = f1;
                z9 = z3;
                f6 = f2;
                v11 = v5;
                z10 = z1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x16427F25, v11, v6, "com.google.accompanist.swiperefresh.SwipeRefreshIndicator (SwipeRefreshIndicator.kt:112)");
            }
            h h0 = z9 ? SwipeRefreshIndicatorKt.b : SwipeRefreshIndicatorKt.a;
            float f8 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f);
            int v12 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).roundToPx-0680j_4(h0.a);
            float f9 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f5);
            f3 = f5;
            Slingshot slingshot0 = SlingshotKt.rememberUpdatedSlingshot(swipeRefreshState0.getIndicatorOffset(), f8, v12, composer1, 0);
            composer1.startReplaceableGroup(0xE2A708A4);
            MutableState mutableState0 = composer1.rememberedValue();
            if(mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(1303400910);
            if(swipeRefreshState0.isSwipeInProgress()) {
                mutableState0.setValue(((float)slingshot0.getOffset()));
                shape3 = shape2;
                v13 = v11;
            }
            else {
                Boolean boolean0 = Boolean.valueOf(swipeRefreshState0.isRefreshing());
                shape3 = shape2;
                Object[] arr_object = {mutableState0, swipeRefreshState0, v12, f9};
                composer1.startReplaceableGroup(0xDE219177);
                v13 = v11;
                boolean z13 = false;
                for(int v14 = 0; v14 < 4; ++v14) {
                    z13 |= composer1.changed(arr_object[v14]);
                }
                c c0 = composer1.rememberedValue();
                if(z13 || c0 == Composer.Companion.getEmpty()) {
                    c0 = new c(swipeRefreshState0, v12, f9, mutableState0, null);
                    composer1.updateRememberedValue(c0);
                }
                composer1.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolean0, c0, composer1, 0x40);
            }
            composer1.endReplaceableGroup();
            float f10 = !swipeRefreshState0.isRefreshing() && ((Number)mutableState0.getValue()).floatValue() <= 0.5f ? 0.0f : f6;
            Modifier modifier5 = SizeKt.size-3ABfNKs(modifier2, h0.a);
            Object[] arr_object1 = {mutableState0, v12, Boolean.valueOf(z10), swipeRefreshState0, f8};
            composer1.startReplaceableGroup(0xDE219177);
            boolean z14 = false;
            for(int v15 = 0; v15 < 5; ++v15) {
                z14 |= composer1.changed(arr_object1[v15]);
            }
            d d0 = composer1.rememberedValue();
            if(z14 || d0 == Composer.Companion.getEmpty()) {
                d0 = new d(v12, z10, swipeRefreshState0, f8, mutableState0);
                composer1.updateRememberedValue(d0);
            }
            composer1.endReplaceableGroup();
            SurfaceKt.Surface-F-jzlyU(GraphicsLayerModifierKt.graphicsLayer(modifier5, d0), shape3, v9, 0L, null, f10, ComposableLambdaKt.composableLambda(composer1, 0x71720669, true, new f(h0, z8, swipeRefreshState0, v10, z4, f8, slingshot0, v13)), composer1, v13 >> 21 & 0x70 | 0x180000 | v13 >> 12 & 0x380, 24);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z10;
            z6 = z8;
            shape1 = shape3;
            f4 = f6;
            z7 = z9;
            v8 = v10;
            v7 = v9;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z5 = z1;
            z6 = z2;
            v7 = v;
            v8 = v1;
            shape1 = shape0;
            f3 = f1;
            z7 = z3;
            f4 = f2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(swipeRefreshState0, f, modifier1, z4, z5, z6, v7, v8, shape1, f3, z7, f4, v2, v3, v4));
        }
    }

    public static final float access$SwipeRefreshIndicator__UAkqwU$lambda$4(MutableState mutableState0) {
        return ((Number)mutableState0.getValue()).floatValue();
    }

    public static final void access$SwipeRefreshIndicator__UAkqwU$lambda$5(MutableState mutableState0, float f) {
        mutableState0.setValue(f);
    }
}

