package androidx.compose.material;

import aa.e0;
import aa.g;
import androidx.activity.g0;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.de;
import androidx.compose.material3.ee;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.s0;
import p0.t0;
import p0.u0;
import p0.x0;
import p0.y0;
import p0.z0;
import r0.a;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001AG\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001A\u00020\bH\u0007¢\u0006\u0004\b\u000B\u0010\f\u001Aò\u0001\u0010(\u001A\u00020\u000E2\u0011\u0010\u0010\u001A\r\u0012\u0004\u0012\u00020\u000E0\r¢\u0006\u0002\b\u000F2\u0011\u0010\u0011\u001A\r\u0012\u0004\u0012\u00020\u000E0\r¢\u0006\u0002\b\u000F2\u0011\u0010\u0012\u001A\r\u0012\u0004\u0012\u00020\u000E0\r¢\u0006\u0002\b\u000F2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0015\u001A\u00020\n2\b\b\u0002\u0010\u0016\u001A\u00020\u00062\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0019\u001A\u00020\u00172\b\b\u0002\u0010\u001A\u001A\u00020\u00062\b\b\u0002\u0010\u001B\u001A\u00020\u00062\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\b\b\u0002\u0010\u001E\u001A\u00020\u001C2\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010!\u001A\u00020\u00172\b\b\u0002\u0010\"\u001A\u00020\u001C2\b\b\u0002\u0010#\u001A\u00020\u001C2\b\b\u0002\u0010$\u001A\u00020\u001C2\u0019\b\u0002\u0010%\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000E0\u0005¢\u0006\u0002\b\u000FH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\'\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006+²\u0006\f\u0010)\u001A\u00020\u00038\nX\u008A\u0084\u0002²\u0006\f\u0010*\u001A\u00020\u00038\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/material/BackdropValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/BackdropScaffoldState;", "rememberBackdropScaffoldState", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "appBar", "backLayerContent", "frontLayerContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "gesturesEnabled", "Landroidx/compose/ui/unit/Dp;", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "Landroidx/compose/ui/graphics/Color;", "backLayerBackgroundColor", "backLayerContentColor", "Landroidx/compose/ui/graphics/Shape;", "frontLayerShape", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "snackbarHost", "BackdropScaffold-BZszfkY", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BackdropScaffold", "alpha", "animationProgress", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,524:1\n25#2:525\n456#2,8:573\n464#2,3:587\n456#2,8:608\n464#2,3:622\n467#2,3:626\n456#2,8:648\n464#2,3:662\n467#2,3:666\n467#2,3:671\n1116#3,6:526\n1116#3,6:535\n1116#3,6:542\n1116#3,6:548\n1116#3,6:676\n74#4:532\n74#4:534\n74#4:554\n1#5:533\n646#6:541\n67#7,7:555\n74#7:590\n68#7,6:591\n74#7:625\n78#7:630\n68#7,6:631\n74#7:665\n78#7:670\n78#7:675\n79#8,11:562\n79#8,11:597\n92#8:629\n79#8,11:637\n92#8:669\n92#8:674\n3737#9,6:581\n3737#9,6:616\n3737#9,6:656\n81#10:682\n81#10:683\n154#11:684\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n*L\n174#1:525\n432#1:573,8\n432#1:587,3\n433#1:608,8\n433#1:622,3\n433#1:626,3\n441#1:648,8\n441#1:662,3\n441#1:666,3\n432#1:671,3\n174#1:526,6\n291#1:535,6\n396#1:542,6\n404#1:548,6\n460#1:676,6\n278#1:532\n279#1:534\n427#1:554\n390#1:541\n432#1:555,7\n432#1:590\n433#1:591,6\n433#1:625\n433#1:630\n441#1:631,6\n441#1:665\n441#1:670\n432#1:675\n432#1:562,11\n433#1:597,11\n433#1:629\n441#1:637,11\n441#1:669\n432#1:674\n432#1:581,6\n433#1:616,6\n441#1:656,6\n391#1:682\n424#1:683\n523#1:684\n*E\n"})
public final class BackdropScaffoldKt {
    public static final float a;

    static {
        BackdropScaffoldKt.a = 20.0f;
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BackdropScaffold-BZszfkY(@NotNull Function2 function20, @NotNull Function2 function21, @NotNull Function2 function22, @Nullable Modifier modifier0, @Nullable BackdropScaffoldState backdropScaffoldState0, boolean z, float f, float f1, boolean z1, boolean z2, long v, long v1, @Nullable Shape shape0, float f2, long v2, long v3, long v4, @Nullable Function3 function30, @Nullable Composer composer0, int v5, int v6, int v7) {
        boolean z6;
        boolean z5;
        float f5;
        boolean z4;
        Function3 function31;
        Shape shape1;
        long v24;
        long v23;
        long v22;
        float f4;
        long v21;
        long v20;
        float f3;
        boolean z8;
        float f8;
        int v30;
        Shape shape2;
        int v29;
        Function3 function32;
        long v28;
        long v27;
        float f7;
        long v26;
        boolean z7;
        float f6;
        int v39;
        long v38;
        long v37;
        float f12;
        boolean z10;
        float f11;
        long v35;
        int v34;
        int v33;
        int v32;
        int v31;
        int v18;
        int v15;
        int v14;
        int v13;
        int v12;
        boolean z3;
        BackdropScaffoldState backdropScaffoldState1;
        Modifier modifier1;
        int v8;
        Composer composer1 = composer0.startRestartGroup(0x534AF03D);
        if((v7 & 1) == 0) {
            v8 = (v5 & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v5 : v5;
        }
        else {
            v8 = v5 | 6;
        }
        int v9 = 0x20;
        if((v7 & 2) != 0) {
            v8 |= 0x30;
        }
        else if((v5 & 0x70) == 0) {
            v8 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v7 & 4) != 0) {
            v8 |= 0x180;
        }
        else if((v5 & 0x380) == 0) {
            v8 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        int v10 = 0x800;
        if((v7 & 8) != 0) {
            v8 |= 0xC00;
            modifier1 = modifier0;
        }
        else if((v5 & 0x1C00) == 0) {
            modifier1 = modifier0;
            v8 |= (composer1.changed(modifier1) ? 0x800 : 0x400);
        }
        else {
            modifier1 = modifier0;
        }
        int v11 = 0x2000;
        if((v5 & 0xE000) == 0) {
            backdropScaffoldState1 = backdropScaffoldState0;
            v8 |= ((v7 & 16) != 0 || !composer1.changed(backdropScaffoldState1) ? 0x2000 : 0x4000);
        }
        else {
            backdropScaffoldState1 = backdropScaffoldState0;
        }
        if((v7 & 0x20) == 0) {
            z3 = z;
            if((v5 & 0x70000) == 0) {
                v8 |= (composer1.changed(z3) ? 0x20000 : 0x10000);
            }
        }
        else {
            v8 |= 0x30000;
            z3 = z;
        }
        if((v7 & 0x40) != 0) {
            v8 |= 0x180000;
        }
        else if((v5 & 0x380000) == 0) {
            v8 |= (composer1.changed(f) ? 0x100000 : 0x80000);
        }
        if((v7 & 0x80) != 0) {
            v8 |= 0xC00000;
            v12 = v7 & 0x80;
        }
        else if((v5 & 0x1C00000) == 0) {
            v12 = v7 & 0x80;
            v8 |= (composer1.changed(f1) ? 0x800000 : 0x400000);
        }
        else {
            v12 = v7 & 0x80;
        }
        if((v7 & 0x100) != 0) {
            v8 |= 0x6000000;
            v13 = v7 & 0x100;
        }
        else if((v5 & 0xE000000) == 0) {
            v13 = v7 & 0x100;
            v8 |= (composer1.changed(z1) ? 0x4000000 : 0x2000000);
        }
        else {
            v13 = v7 & 0x100;
        }
        if((v7 & 0x200) == 0) {
            if((v5 & 0x70000000) == 0) {
                v15 = v7 & 0x200;
                v8 |= (composer1.changed(z2) ? 0x20000000 : 0x10000000);
            }
            else {
                v15 = v7 & 0x200;
            }
            v14 = v8;
        }
        else {
            v14 = v8 | 0x30000000;
            v15 = v7 & 0x200;
        }
        int v16 = (v6 & 14) == 0 ? v6 | ((v7 & 0x400) != 0 || !composer1.changed(v) ? 2 : 4) : v6;
        if((v6 & 0x70) == 0) {
            if((v7 & 0x800) != 0 || !composer1.changed(v1)) {
                v9 = 16;
            }
            v16 |= v9;
        }
        if((v6 & 0x380) == 0) {
            v16 |= ((v7 & 0x1000) != 0 || !composer1.changed(shape0) ? 0x80 : 0x100);
        }
        int v17 = v16;
        if((v7 & 0x2000) != 0) {
            v17 |= 0xC00;
        }
        else if((v6 & 0x1C00) == 0) {
            if(!composer1.changed(f2)) {
                v10 = 0x400;
            }
            v17 |= v10;
        }
        if((v6 & 0xE000) == 0) {
            if((v7 & 0x4000) == 0) {
                v18 = v7 & 0x2000;
                if(composer1.changed(v2)) {
                    v11 = 0x4000;
                }
            }
            else {
                v18 = v7 & 0x2000;
            }
            v17 |= v11;
        }
        else {
            v18 = v7 & 0x2000;
        }
        if((v6 & 0x70000) == 0) {
            v17 |= ((v7 & 0x8000) != 0 || !composer1.changed(v3) ? 0x10000 : 0x20000);
        }
        if((v6 & 0x380000) == 0) {
            v17 |= ((v7 & 0x10000) != 0 || !composer1.changed(v4) ? 0x80000 : 0x100000);
        }
        if((v7 & 0x20000) != 0) {
            v17 |= 0xC00000;
        }
        else if((v6 & 0x1C00000) == 0) {
            v17 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        int v19 = v17;
        if((v14 & 0x5B6DB6DB) != 306783378 || (v19 & 0x16DB6DB) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v5 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier2 = (v7 & 8) == 0 ? modifier1 : Modifier.Companion;
                if((v7 & 16) == 0) {
                    v31 = v18;
                    v32 = v12;
                    v33 = v13;
                    v34 = v15;
                }
                else {
                    v31 = v18;
                    v32 = v12;
                    v33 = v13;
                    v34 = v15;
                    v14 &= 0xFFFF1FFF;
                    backdropScaffoldState1 = BackdropScaffoldKt.rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composer1, 6, 14);
                }
                boolean z9 = (v7 & 0x20) == 0 ? z : true;
                float f9 = (v7 & 0x40) == 0 ? f : 56.0f;
                float f10 = v32 == 0 ? f1 : 48.0f;
                z7 = v33 == 0 ? z1 : true;
                z8 = v34 == 0 ? z2 : true;
                if((v7 & 0x400) == 0) {
                    v35 = v;
                }
                else {
                    v19 &= -15;
                    v35 = MaterialTheme.INSTANCE.getColors(composer1, 6).getPrimary-0d7_KjU();
                }
                if((v7 & 0x800) == 0) {
                    v26 = v1;
                }
                else {
                    v26 = ColorsKt.contentColorFor-ek8zF_U(v35, composer1, v19 & 14);
                    v19 &= 0xFFFFFF8F;
                }
                int v36 = v19;
                if((v7 & 0x1000) == 0) {
                    f11 = f10;
                    shape2 = shape0;
                }
                else {
                    f11 = f10;
                    shape2 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composer1, 6);
                    v36 &= -897;
                }
                if((v7 & 0x4000) == 0) {
                    z10 = z9;
                    f12 = f9;
                    v37 = v2;
                }
                else {
                    z10 = z9;
                    v36 &= 0xFFFF1FFF;
                    f12 = f9;
                    v37 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                }
                if((v7 & 0x8000) == 0) {
                    v38 = v3;
                }
                else {
                    v38 = ColorsKt.contentColorFor-ek8zF_U(v37, composer1, v36 >> 12 & 14);
                    v36 &= 0xFFF8FFFF;
                }
                if((v7 & 0x10000) == 0) {
                    v22 = v37;
                    v28 = v4;
                    v39 = v36;
                }
                else {
                    v22 = v37;
                    v28 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composer1, 6);
                    v39 = 0xFFC7FFFF & v36;
                }
                if((v7 & 0x20000) == 0) {
                    f6 = f11;
                    v29 = v39;
                    v27 = v38;
                    modifier1 = modifier2;
                    v30 = v14;
                    f8 = f12;
                    function32 = function30;
                    v20 = v35;
                }
                else {
                    v29 = v39;
                    v27 = v38;
                    modifier1 = modifier2;
                    v30 = v14;
                    f8 = f12;
                    function32 = ComposableSingletons.BackdropScaffoldKt.INSTANCE.getLambda-1$material_release();
                    v20 = v35;
                    f6 = f11;
                }
                f7 = v31 == 0 ? f2 : 1.0f;
                z3 = z10;
            }
            else {
                composer1.skipToGroupEnd();
                if((v7 & 16) != 0) {
                    v14 &= 0xFFFF1FFF;
                }
                if((v7 & 0x400) != 0) {
                    v19 &= -15;
                }
                if((v7 & 0x800) != 0) {
                    v19 &= 0xFFFFFF8F;
                }
                int v25 = (v7 & 0x1000) == 0 ? v19 : v19 & -897;
                if((v7 & 0x4000) != 0) {
                    v25 &= 0xFFFF1FFF;
                }
                if((v7 & 0x8000) != 0) {
                    v25 &= 0xFFF8FFFF;
                }
                if((v7 & 0x10000) != 0) {
                    v25 &= 0xFFC7FFFF;
                }
                f6 = f1;
                z7 = z1;
                v20 = v;
                v26 = v1;
                f7 = f2;
                v22 = v2;
                v27 = v3;
                v28 = v4;
                function32 = function30;
                v29 = v25;
                shape2 = shape0;
                v30 = v14;
                f8 = f;
                z8 = z2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x534AF03D, v30, v29, "androidx.compose.material.BackdropScaffold (BackdropScaffold.kt:276)");
            }
            float f13 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f8);
            float f14 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f6);
            ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(composer1, 0x67FF344B, true, new u0(z7, backdropScaffoldState1, function20, function21));
            composer1.startReplaceableGroup(0x6483CB85);
            boolean z11 = composer1.changed(f14);
            e0 e00 = composer1.rememberedValue();
            if(z11 || e00 == Composer.Companion.getEmpty()) {
                e00 = new e0(f14, 10);
                composer1.updateRememberedValue(e00);
            }
            composer1.endReplaceableGroup();
            SurfaceKt.Surface-F-jzlyU(null, null, v20, v26, null, 0.0f, ComposableLambdaKt.composableLambda(composer1, -1049909631, true, new s0(modifier1, composableLambda0, e00, f14, z8, z3, backdropScaffoldState1, f13, shape2, v22, v27, f7, f6, f8, function22, v28, function32)), composer1, v29 << 6 & 0x1C00 | (v29 << 6 & 0x380 | 0x180000), 51);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f6;
            shape1 = shape2;
            v21 = v26;
            v24 = v28;
            z5 = z7;
            z4 = z3;
            function31 = function32;
            z6 = z8;
            v23 = v27;
            f5 = f8;
            f4 = f7;
        }
        else {
            composer1.skipToGroupEnd();
            f3 = f1;
            v20 = v;
            v21 = v1;
            f4 = f2;
            v22 = v2;
            v23 = v3;
            v24 = v4;
            shape1 = shape0;
            function31 = function30;
            z4 = z3;
            f5 = f;
            z5 = z1;
            z6 = z2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t0(function20, function21, function22, modifier1, backdropScaffoldState1, z4, f5, f3, z5, z6, v20, v21, shape1, f4, v22, v23, v24, function31, v5, v6, v7));
        }
    }

    public static final void access$BackLayerTransition(BackdropValue backdropValue0, Function2 function20, Function2 function21, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-950970976);
        int v1 = (v & 14) == 0 ? (composer1.changed(backdropValue0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-950970976, v1, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:420)");
            }
            State state0 = AnimateAsStateKt.animateFloatAsState((backdropValue0 == BackdropValue.Revealed ? 0.0f : 2.0f), new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composer1, 0x30, 28);
            float f = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(BackdropScaffoldKt.a);
            float f1 = c.coerceIn(((Number)state0.getValue()).floatValue() - 1.0f, 0.0f, 1.0f);
            float f2 = c.coerceIn(1.0f - ((Number)state0.getValue()).floatValue(), 0.0f, 1.0f);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = a.i(alignment$Companion0, false, composer1, 0, -1323940314);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier$Companion0);
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
            Function2 function22 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                androidx.room.a.t(v2, composer1, v2, function22);
            }
            a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            Modifier modifier0 = GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(ZIndexModifierKt.zIndex(modifier$Companion0, f1), 0.0f, 0.0f, f1, 0.0f, (1.0f - f1) * f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFEB, null);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy1 = a.i(alignment$Companion0, false, composer1, 0, -1323940314);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.modifierMaterializerOf(modifier0);
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
            Function2 function23 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                androidx.room.a.t(v3, composer1, v3, function23);
            }
            a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function20.invoke(composer1, ((int)(v1 >> 3 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            Modifier modifier1 = GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(ZIndexModifierKt.zIndex(modifier$Companion0, f2), 0.0f, 0.0f, f2, 0.0f, (1.0f - f2) * -f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFEB, null);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy2 = a.i(alignment$Companion0, false, composer1, 0, -1323940314);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            Function3 function32 = LayoutKt.modifierMaterializerOf(modifier1);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function24 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                androidx.room.a.t(v4, composer1, v4, function24);
            }
            a.w(0, function32, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function21.invoke(composer1, ((int)(v1 >> 6 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new androidx.compose.foundation.text.selection.a(backdropValue0, function20, function21, v, 14));
        }
    }

    public static final void access$BackdropStack(Modifier modifier0, Function2 function20, Function1 function10, Function4 function40, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xB58DD886);
        int v1 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function40) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB58DD886, v1, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:458)");
            }
            composer1.startReplaceableGroup(0x6483E241);
            boolean z = composer1.changedInstance(function20);
            boolean z1 = composer1.changedInstance(function10);
            boolean z2 = composer1.changedInstance(function40);
            x0 x00 = composer1.rememberedValue();
            if((z | z1 | z2) != 0 || x00 == Composer.Companion.getEmpty()) {
                x00 = new x0(function20, function10, function40);
                composer1.updateRememberedValue(x00);
            }
            composer1.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier0, x00, composer1, v1 & 14, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(modifier0, function20, function10, function40, v));
        }
    }

    public static final void access$Scrim-3J-VO9M(long v, Function0 function00, boolean z, Composer composer0, int v1) {
        Modifier modifier0;
        Composer composer1 = composer0.startRestartGroup(0xFA82083F);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFA82083F, v2, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:388)");
            }
            if(v != 0L) {
                State state0 = AnimateAsStateKt.animateFloatAsState((z ? 1.0f : 0.0f), new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composer1, 0x30, 28);
                if(z) {
                    Companion modifier$Companion0 = Modifier.Companion;
                    Unit unit0 = Unit.INSTANCE;
                    composer1.startReplaceableGroup(0x6483DA3D);
                    boolean z1 = composer1.changedInstance(function00);
                    y0 y00 = composer1.rememberedValue();
                    if(z1 || y00 == Composer.Companion.getEmpty()) {
                        y00 = new y0(function00, null);
                        composer1.updateRememberedValue(y00);
                    }
                    composer1.endReplaceableGroup();
                    modifier0 = SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, unit0, y00);
                }
                else {
                    modifier0 = Modifier.Companion;
                }
                Modifier modifier1 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier0);
                composer1.startReplaceableGroup(0x6483DB08);
                boolean z2 = composer1.changed(v);
                boolean z3 = composer1.changed(state0);
                de de0 = composer1.rememberedValue();
                if(z2 || z3 || de0 == Composer.Companion.getEmpty()) {
                    de0 = new de(v, state0, 1);
                    composer1.updateRememberedValue(de0);
                }
                composer1.endReplaceableGroup();
                CanvasKt.Canvas(modifier1, de0, composer1, 0);
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
            scopeUpdateScope0.updateScope(new ee(v, function00, z, v1, 1));
        }
    }

    public static final float access$Scrim_3J_VO9M$lambda$4(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    @ExperimentalMaterialApi
    @Composable
    @NotNull
    public static final BackdropScaffoldState rememberBackdropScaffoldState(@NotNull BackdropValue backdropValue0, @Nullable AnimationSpec animationSpec0, @Nullable Function1 function10, @Nullable SnackbarHostState snackbarHostState0, @Nullable Composer composer0, int v, int v1) {
        SnackbarHostState snackbarHostState2;
        composer0.startReplaceableGroup(0xCC9C31A0);
        AnimationSpec animationSpec1 = (v1 & 2) == 0 ? animationSpec0 : SwipeableDefaults.INSTANCE.getAnimationSpec();
        Function1 function11 = (v1 & 4) == 0 ? function10 : z0.w;
        if((v1 & 8) == 0) {
            snackbarHostState2 = snackbarHostState0;
        }
        else {
            composer0.startReplaceableGroup(0xE2A708A4);
            SnackbarHostState snackbarHostState1 = composer0.rememberedValue();
            if(snackbarHostState1 == Composer.Companion.getEmpty()) {
                snackbarHostState1 = new SnackbarHostState();
                composer0.updateRememberedValue(snackbarHostState1);
            }
            composer0.endReplaceableGroup();
            snackbarHostState2 = snackbarHostState1;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCC9C31A0, v, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:174)");
        }
        Saver saver0 = BackdropScaffoldState.Companion.Saver(animationSpec1, function11, snackbarHostState2);
        g0 g00 = new g0(6, backdropValue0, animationSpec1, function11, snackbarHostState2);
        BackdropScaffoldState backdropScaffoldState0 = (BackdropScaffoldState)RememberSaveableKt.rememberSaveable(new Object[]{animationSpec1, function11, snackbarHostState2}, saver0, null, g00, composer0, 72, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return backdropScaffoldState0;
    }
}

