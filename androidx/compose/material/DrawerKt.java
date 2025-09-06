package androidx.compose.material;

import aa.b;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.de;
import androidx.compose.material3.ee;
import androidx.compose.material3.ge;
import androidx.compose.material3.td;
import androidx.compose.material3.tf;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.room.a;
import j0.t1;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a4;
import p0.b4;
import p0.c4;
import p0.r3;
import p0.r;
import p0.s3;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A5\u0010\b\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00A2\u0006\u0004\b\b\u0010\t\u001A-\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\n2\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00A2\u0006\u0004\b\f\u0010\r\u001A-\u0010\u000E\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001A\u0093\u0001\u0010%\u001A\u00020\u00112\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0004\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0017\u001A\u00020\u000B2\b\b\u0002\u0010\u0018\u001A\u00020\u00052\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010\u001F\u001A\u00020\u001D2\b\b\u0002\u0010 \u001A\u00020\u001D2\u0011\u0010\"\u001A\r\u0012\u0004\u0012\u00020\u00110!\u00A2\u0006\u0002\b\u0012H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$\u001A\u0093\u0001\u0010(\u001A\u00020\u00112\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0004\u00A2\u0006\u0002\b\u0012\u00A2\u0006\u0002\b\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0017\u001A\u00020\u00072\b\b\u0002\u0010\u0018\u001A\u00020\u00052\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010\u001F\u001A\u00020\u001D2\b\b\u0002\u0010 \u001A\u00020\u001D2\u0011\u0010\"\u001A\r\u0012\u0004\u0012\u00020\u00110!\u00A2\u0006\u0002\b\u0012H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010\'\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006+\u00B2\u0006\f\u0010*\u001A\u00020)8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/material/BottomDrawerValue;", "initialValue", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/BottomDrawerState;", "BottomDrawerState", "(Landroidx/compose/material/BottomDrawerValue;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/material/DrawerValue;", "Landroidx/compose/material/DrawerState;", "rememberDrawerState", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "rememberBottomDrawerState", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "scrimColor", "Lkotlin/Function0;", "content", "ModalDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalDrawer", "BottomDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BottomDrawer", "", "alpha", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,915:1\n1116#2,6:916\n1116#2,6:923\n1116#2,3:934\n1119#2,3:940\n1116#2,3:950\n1119#2,3:956\n1116#2,6:961\n1116#2,6:967\n1116#2,6:973\n1116#2,6:979\n1116#2,6:985\n1116#2,6:991\n74#3:922\n74#3:944\n487#4,4:929\n491#4,2:937\n495#4:943\n487#4,4:945\n491#4,2:953\n495#4:959\n25#5:933\n25#5:949\n487#6:939\n487#6:955\n646#7:960\n81#8:997\n154#9:998\n154#9:999\n154#9:1000\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n*L\n450#1:916,6\n468#1:923,6\n516#1:934,3\n516#1:940,3\n655#1:950,3\n655#1:956,3\n801#1:961,6\n804#1:967,6\n816#1:973,6\n832#1:979,6\n833#1:985,6\n845#1:991,6\n467#1:922\n651#1:944\n516#1:929,4\n516#1:937,2\n516#1:943\n655#1:945,4\n655#1:953,2\n655#1:959\n516#1:933\n655#1:949\n516#1:939\n655#1:955\n793#1:960\n794#1:997\n850#1:998\n851#1:999\n852#1:1000\n*E\n"})
public final class DrawerKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final TweenSpec d;

    static {
        DrawerKt.a = 56.0f;
        DrawerKt.b = 56.0f;
        DrawerKt.c = 400.0f;
        DrawerKt.d = new TweenSpec(0x100, 0, null, 6, null);
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BottomDrawer-Gs3lGvM(@NotNull Function3 function30, @Nullable Modifier modifier0, @Nullable BottomDrawerState bottomDrawerState0, boolean z, @Nullable Shape shape0, float f, long v, long v1, long v2, @NotNull Function2 function20, @Nullable Composer composer0, int v3, int v4) {
        long v8;
        long v7;
        long v6;
        float f1;
        Shape shape1;
        boolean z2;
        Modifier modifier1;
        BottomDrawerState bottomDrawerState1;
        long v12;
        long v11;
        BottomDrawerState bottomDrawerState2;
        float f2;
        Shape shape2;
        Modifier modifier2;
        int v10;
        long v9;
        long v13;
        boolean z1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x254AA686);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v3 : v3;
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
        if((v4 & 4) != 0) {
            v5 |= 0x80;
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            z1 = z;
        }
        else if((v3 & 0x1C00) == 0) {
            z1 = z;
            v5 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((0xE000 & v3) == 0) {
            v5 |= ((v4 & 16) != 0 || !composer1.changed(shape0) ? 0x2000 : 0x4000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((0x70000 & v3) == 0) {
            v5 |= (composer1.changed(f) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x380000) == 0) {
            v5 |= ((v4 & 0x40) != 0 || !composer1.changed(v) ? 0x80000 : 0x100000);
        }
        if((v3 & 0x1C00000) == 0) {
            v5 |= ((v4 & 0x80) != 0 || !composer1.changed(v1) ? 0x400000 : 0x800000);
        }
        if((0xE000000 & v3) == 0) {
            v5 |= ((v4 & 0x100) != 0 || !composer1.changed(v2) ? 0x2000000 : 0x4000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((0x70000000 & v3) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 4) != 4 || (0x5B6DB6DB & v5) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) == 0) {
                    bottomDrawerState2 = bottomDrawerState0;
                }
                else {
                    bottomDrawerState2 = DrawerKt.rememberBottomDrawerState(BottomDrawerValue.Closed, null, composer1, 6, 2);
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    z1 = true;
                }
                if((v4 & 16) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getLarge();
                    v5 &= 0xFFFF1FFF;
                }
                f2 = (v4 & 0x20) == 0 ? f : 16.0f;
                if((v4 & 0x40) == 0) {
                    v11 = v;
                }
                else {
                    v11 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                    v5 &= 0xFFC7FFFF;
                }
                if((v4 & 0x80) == 0) {
                    v13 = v1;
                }
                else {
                    v13 = ColorsKt.contentColorFor-ek8zF_U(v11, composer1, v5 >> 18 & 14);
                    v5 &= 0xFE3FFFFF;
                }
                if((v4 & 0x100) == 0) {
                    v9 = v2;
                    v10 = v5;
                    v12 = v13;
                }
                else {
                    v10 = v5 & 0xF1FFFFFF;
                    v12 = v13;
                    v9 = DrawerDefaults.INSTANCE.getScrimColor(composer1, 6);
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
                if((v4 & 0x40) != 0) {
                    v5 &= 0xFFC7FFFF;
                }
                if((v4 & 0x80) != 0) {
                    v5 &= 0xFE3FFFFF;
                }
                if((v4 & 0x100) != 0) {
                    v5 &= 0xF1FFFFFF;
                }
                v9 = v2;
                v10 = v5;
                modifier2 = modifier0;
                shape2 = shape0;
                f2 = f;
                bottomDrawerState2 = bottomDrawerState0;
                v11 = v;
                v12 = v1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x254AA686, v10, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:648)");
            }
            EffectsKt.SideEffect(new t1(23, bottomDrawerState2, ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity()))), composer1, 0);
            composer1.startReplaceableGroup(0x2E20B340);
            composer1.startReplaceableGroup(0xE2A708A4);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer1, 1220102512, true, new p(z1, bottomDrawerState2, function20, v9, shape2, v11, v12, f2, compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), function30)), composer1, 0xC00, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            bottomDrawerState1 = bottomDrawerState2;
            z2 = z1;
            v7 = v12;
            f1 = f2;
            v6 = v11;
            v8 = v9;
            shape1 = shape2;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            bottomDrawerState1 = bottomDrawerState0;
            modifier1 = modifier0;
            z2 = z1;
            shape1 = shape0;
            f1 = f;
            v6 = v;
            v7 = v1;
            v8 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r3(function30, modifier1, bottomDrawerState1, z2, shape1, f1, v6, v7, v8, function20, v3, v4, 0));
        }
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final BottomDrawerState BottomDrawerState(@NotNull BottomDrawerValue bottomDrawerValue0, @NotNull Density density0, @NotNull Function1 function10) {
        BottomDrawerState bottomDrawerState0 = new BottomDrawerState(bottomDrawerValue0, function10);
        bottomDrawerState0.setDensity$material_release(density0);
        return bottomDrawerState0;
    }

    public static BottomDrawerState BottomDrawerState$default(BottomDrawerValue bottomDrawerValue0, Density density0, Function1 function10, int v, Object object0) {
        if((v & 4) != 0) {
            function10 = r.E;
        }
        return DrawerKt.BottomDrawerState(bottomDrawerValue0, density0, function10);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ModalDrawer-Gs3lGvM(@NotNull Function3 function30, @Nullable Modifier modifier0, @Nullable DrawerState drawerState0, boolean z, @Nullable Shape shape0, float f, long v, long v1, long v2, @NotNull Function2 function20, @Nullable Composer composer0, int v3, int v4) {
        long v11;
        long v10;
        long v9;
        float f1;
        Shape shape1;
        boolean z2;
        DrawerState drawerState1;
        Modifier modifier1;
        long v15;
        long v14;
        int v13;
        float f2;
        Shape shape2;
        DrawerState drawerState2;
        Modifier modifier2;
        long v12;
        long v16;
        int v8;
        int v7;
        int v6;
        boolean z1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(1305806945);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v3 : v3;
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
            v5 |= ((v4 & 4) != 0 || !composer1.changed(drawerState0) ? 0x80 : 0x100);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            z1 = z;
        }
        else if((v3 & 0x1C00) == 0) {
            z1 = z;
            v5 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((0xE000 & v3) == 0) {
            v5 |= ((v4 & 16) != 0 || !composer1.changed(shape0) ? 0x2000 : 0x4000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((0x70000 & v3) == 0) {
            v5 |= (composer1.changed(f) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v3) == 0) {
            if((v4 & 0x40) == 0) {
                v6 = v5;
                v7 = composer1.changed(v) ? 0x100000 : 0x80000;
            }
            else {
                v6 = v5;
                v7 = 0x80000;
            }
            v8 = v6 | v7;
        }
        else {
            v8 = v5;
        }
        if((v3 & 0x1C00000) == 0) {
            v8 |= ((v4 & 0x80) != 0 || !composer1.changed(v1) ? 0x400000 : 0x800000);
        }
        if((0xE000000 & v3) == 0) {
            v8 |= ((v4 & 0x100) != 0 || !composer1.changed(v2) ? 0x2000000 : 0x4000000);
        }
        if((v4 & 0x200) != 0) {
            v8 |= 0x30000000;
        }
        else if((0x70000000 & v3) == 0) {
            v8 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        if((0x5B6DB6DB & v8) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) == 0) {
                    drawerState2 = drawerState0;
                }
                else {
                    drawerState2 = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer1, 6, 2);
                    v8 &= -897;
                }
                if((v4 & 8) != 0) {
                    z1 = true;
                }
                if((v4 & 16) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getLarge();
                    v8 &= 0xFFFF1FFF;
                }
                f2 = (v4 & 0x20) == 0 ? f : 16.0f;
                if((v4 & 0x40) == 0) {
                    v14 = v;
                }
                else {
                    v14 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                    v8 &= 0xFFC7FFFF;
                }
                if((v4 & 0x80) == 0) {
                    v16 = v1;
                }
                else {
                    v16 = ColorsKt.contentColorFor-ek8zF_U(v14, composer1, v8 >> 18 & 14);
                    v8 &= 0xFE3FFFFF;
                }
                if((v4 & 0x100) == 0) {
                    v12 = v2;
                    v13 = v8;
                    v15 = v16;
                }
                else {
                    v13 = v8 & 0xF1FFFFFF;
                    v15 = v16;
                    v12 = DrawerDefaults.INSTANCE.getScrimColor(composer1, 6);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v8 &= -897;
                }
                if((v4 & 16) != 0) {
                    v8 &= 0xFFFF1FFF;
                }
                if((v4 & 0x40) != 0) {
                    v8 &= 0xFFC7FFFF;
                }
                if((v4 & 0x80) != 0) {
                    v8 &= 0xFE3FFFFF;
                }
                if((v4 & 0x100) != 0) {
                    v8 &= 0xF1FFFFFF;
                }
                v12 = v2;
                modifier2 = modifier0;
                drawerState2 = drawerState0;
                shape2 = shape0;
                f2 = f;
                v13 = v8;
                v14 = v;
                v15 = v1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1305806945, v13, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:514)");
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = q.h(0x2E20B340, composer1, 0xE2A708A4);
            if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer1, 0x30AD78B7, true, new androidx.compose.material.q(drawerState2, z1, v12, shape2, v14, v15, f2, function20, compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), function30)), composer1, 0xC00, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            drawerState1 = drawerState2;
            f1 = f2;
            z2 = z1;
            v9 = v14;
            v10 = v15;
            v11 = v12;
            shape1 = shape2;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            drawerState1 = drawerState0;
            z2 = z1;
            shape1 = shape0;
            f1 = f;
            v9 = v;
            v10 = v1;
            v11 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r3(function30, modifier1, drawerState1, z2, shape1, f1, v9, v10, v11, function20, v3, v4, 1));
        }
    }

    public static final void access$BottomDrawerScrim-3J-VO9M(long v, Function0 function00, boolean z, Composer composer0, int v1) {
        Modifier modifier1;
        Composer composer1 = composer0.startRestartGroup(0xE16B36FE);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE16B36FE, v2, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:791)");
            }
            if(v != 0L) {
                State state0 = AnimateAsStateKt.animateFloatAsState((z ? 1.0f : 0.0f), new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composer1, 0x30, 28);
                String s = Strings_androidKt.getString-4foXLRw(1, composer1, 6);
                if(z) {
                    Companion modifier$Companion0 = Modifier.Companion;
                    composer1.startReplaceableGroup(0x1BA09FFC);
                    boolean z1 = composer1.changedInstance(function00);
                    s3 s30 = composer1.rememberedValue();
                    if(z1 || s30 == Composer.Companion.getEmpty()) {
                        s30 = new s3(function00, null);
                        composer1.updateRememberedValue(s30);
                    }
                    composer1.endReplaceableGroup();
                    Modifier modifier0 = SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, function00, s30);
                    composer1.startReplaceableGroup(0x1BA0A07A);
                    boolean z2 = composer1.changed(s);
                    boolean z3 = composer1.changedInstance(function00);
                    ge ge0 = composer1.rememberedValue();
                    if(z2 || z3 || ge0 == Composer.Companion.getEmpty()) {
                        ge0 = new ge(s, function00, 2);
                        composer1.updateRememberedValue(ge0);
                    }
                    composer1.endReplaceableGroup();
                    modifier1 = SemanticsModifierKt.semantics(modifier0, true, ge0);
                }
                else {
                    modifier1 = Modifier.Companion;
                }
                Modifier modifier2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier1);
                composer1.startReplaceableGroup(0x1BA0A19B);
                boolean z4 = composer1.changed(v);
                boolean z5 = composer1.changed(state0);
                de de0 = composer1.rememberedValue();
                if(z4 || z5 || de0 == Composer.Companion.getEmpty()) {
                    de0 = new de(v, state0, 2);
                    composer1.updateRememberedValue(de0);
                }
                composer1.endReplaceableGroup();
                CanvasKt.Canvas(modifier2, de0, composer1, 0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ee(v, function00, z, v1, 2));
        }
    }

    public static final float access$BottomDrawerScrim_3J_VO9M$lambda$3(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final NestedScrollConnection access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState anchoredDraggableState0) {
        return new DrawerKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1(anchoredDraggableState0);
    }

    public static final void access$Scrim-Bx497Mc(boolean z, Function0 function00, Function0 function01, long v, Composer composer0, int v1) {
        Modifier modifier1;
        Composer composer1 = composer0.startRestartGroup(1983403750);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983403750, v2, -1, "androidx.compose.material.Scrim (Drawer.kt:827)");
            }
            String s = Strings_androidKt.getString-4foXLRw(1, composer1, 6);
            if(z) {
                Companion modifier$Companion0 = Modifier.Companion;
                composer1.startReplaceableGroup(0x1BA0A2EB);
                boolean z1 = composer1.changedInstance(function00);
                a4 a40 = composer1.rememberedValue();
                if(z1 || a40 == Composer.Companion.getEmpty()) {
                    a40 = new a4(function00, null);
                    composer1.updateRememberedValue(a40);
                }
                composer1.endReplaceableGroup();
                Modifier modifier0 = SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, function00, a40);
                composer1.startReplaceableGroup(0x1BA0A33F);
                boolean z2 = composer1.changed(s);
                boolean z3 = composer1.changedInstance(function00);
                ge ge0 = composer1.rememberedValue();
                if(z2 || z3 || ge0 == Composer.Companion.getEmpty()) {
                    ge0 = new ge(s, function00, 3);
                    composer1.updateRememberedValue(ge0);
                }
                composer1.endReplaceableGroup();
                modifier1 = SemanticsModifierKt.semantics(modifier0, true, ge0);
            }
            else {
                modifier1 = Modifier.Companion;
            }
            Modifier modifier2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier1);
            composer1.startReplaceableGroup(0x1BA0A430);
            boolean z4 = composer1.changed(v);
            boolean z5 = composer1.changedInstance(function01);
            b b0 = composer1.rememberedValue();
            if(z4 || z5 || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(v, function01, 2);
                composer1.updateRememberedValue(b0);
            }
            composer1.endReplaceableGroup();
            CanvasKt.Canvas(modifier2, b0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new tf(z, function00, function01, v, v1, 1));
        }
    }

    public static final float access$calculateFraction(float f, float f1, float f2) {
        return c.coerceIn((f2 - f) / (f1 - f), 0.0f, 1.0f);
    }

    public static final float access$getDrawerPositionalThreshold$p() [...] // 潜在的解密器

    public static final float access$getDrawerVelocityThreshold$p() [...] // 潜在的解密器

    public static final float access$getEndDrawerPadding$p() [...] // 潜在的解密器

    @ExperimentalMaterialApi
    @Composable
    @NotNull
    public static final BottomDrawerState rememberBottomDrawerState(@NotNull BottomDrawerValue bottomDrawerValue0, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0xDC597CAC);
        if((v1 & 2) != 0) {
            function10 = b4.w;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDC597CAC, v, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:465)");
        }
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        Object[] arr_object = {density0};
        Saver saver0 = BottomDrawerState.Companion.Saver(density0, function10);
        composer0.startReplaceableGroup(0x1BA06940);
        boolean z = composer0.changed(bottomDrawerValue0);
        boolean z1 = composer0.changed(density0);
        boolean z2 = composer0.changedInstance(function10);
        td td0 = composer0.rememberedValue();
        if((z | z1 | z2) != 0 || td0 == Composer.Companion.getEmpty()) {
            td0 = new td(bottomDrawerValue0, density0, 11, function10);
            composer0.updateRememberedValue(td0);
        }
        composer0.endReplaceableGroup();
        BottomDrawerState bottomDrawerState0 = (BottomDrawerState)RememberSaveableKt.rememberSaveable(arr_object, saver0, null, td0, composer0, 72, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return bottomDrawerState0;
    }

    @Composable
    @NotNull
    public static final DrawerState rememberDrawerState(@NotNull DrawerValue drawerValue0, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0xAA6A4C4B);
        if((v1 & 2) != 0) {
            function10 = c4.w;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAA6A4C4B, v, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:448)");
        }
        Saver saver0 = DrawerState.Companion.Saver(function10);
        composer0.startReplaceableGroup(0x1BA066DF);
        boolean z = composer0.changed(drawerValue0);
        boolean z1 = composer0.changedInstance(function10);
        t1 t10 = composer0.rememberedValue();
        if(z || z1 || t10 == Composer.Companion.getEmpty()) {
            t10 = new t1(26, drawerValue0, function10);
            composer0.updateRememberedValue(t10);
        }
        composer0.endReplaceableGroup();
        DrawerState drawerState0 = (DrawerState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, t10, composer0, 72, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return drawerState0;
    }
}

