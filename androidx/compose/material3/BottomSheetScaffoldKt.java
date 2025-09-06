package androidx.compose.material3;

import a2.b;
import aa.o;
import aa.x;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.room.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u008A\u0002\u0010!\u001A\u00020\u00022\u001C\u0010\u0005\u001A\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\n2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\n2\b\b\u0002\u0010\u0013\u001A\u00020\n2\u0015\b\u0002\u0010\u0015\u001A\u000F\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0017\u001A\u00020\u00162\u0015\b\u0002\u0010\u0018\u001A\u000F\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\u0019\b\u0002\u0010\u001A\u001A\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u001B\u001A\u00020\u000F2\b\b\u0002\u0010\u001C\u001A\u00020\u000F2\u0017\u0010\u001E\u001A\u0013\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001F\u0010 \u001A#\u0010%\u001A\u00020\b2\b\b\u0002\u0010#\u001A\u00020\"2\b\b\u0002\u0010$\u001A\u00020\u0019H\u0007¢\u0006\u0004\b%\u0010&\u001A9\u0010+\u001A\u00020\"2\b\b\u0002\u0010(\u001A\u00020\'2\u0014\b\u0002\u0010)\u001A\u000E\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00160\u00002\b\b\u0002\u0010*\u001A\u00020\u0016H\u0007¢\u0006\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006-"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/BottomSheetScaffoldState;", "scaffoldState", "Landroidx/compose/ui/unit/Dp;", "sheetPeekHeight", "sheetMaxWidth", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/graphics/Color;", "sheetContainerColor", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "Lkotlin/Function0;", "sheetDragHandle", "", "sheetSwipeEnabled", "topBar", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHost", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "BottomSheetScaffold-sdMYb0k", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffold", "Landroidx/compose/material3/SheetState;", "bottomSheetState", "snackbarHostState", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "Landroidx/compose/material3/SheetValue;", "initialValue", "confirmValueChange", "skipHiddenState", "rememberStandardBottomSheetState", "(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,410:1\n148#2:411\n1223#3,6:412\n1223#3,6:418\n1223#3,6:424\n1223#3,3:435\n1226#3,3:441\n1223#3,6:447\n1223#3,6:453\n1223#3,6:459\n1223#3,6:473\n488#4:430\n487#4,4:431\n491#4,2:438\n495#4:444\n487#5:440\n77#6:445\n1#7:446\n170#8:465\n168#8,7:466\n78#8,6:479\n85#8,4:494\n89#8,2:504\n93#8:509\n176#8:510\n368#9,9:485\n377#9,3:506\n4032#10,6:498\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n119#1:411\n134#1:412,6\n180#1:418,6\n182#1:424,6\n226#1:435,3\n226#1:441,3\n232#1:447,6\n249#1:453,6\n371#1:459,6\n356#1:473,6\n226#1:430\n226#1:431,4\n226#1:438,2\n226#1:444\n226#1:440\n228#1:445\n356#1:465\n356#1:466,7\n356#1:479,6\n356#1:494,4\n356#1:504,2\n356#1:509\n356#1:510\n356#1:485,9\n356#1:506,3\n356#1:498,6\n*E\n"})
public final class BottomSheetScaffoldKt {
    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BottomSheetScaffold-sdMYb0k(@NotNull Function3 function30, @Nullable Modifier modifier0, @Nullable BottomSheetScaffoldState bottomSheetScaffoldState0, float f, float f1, @Nullable Shape shape0, long v, long v1, float f2, float f3, @Nullable Function2 function20, boolean z, @Nullable Function2 function21, @Nullable Function3 function31, long v2, long v3, @NotNull Function3 function32, @Nullable Composer composer0, int v4, int v5, int v6) {
        long v15;
        long v14;
        Function3 function33;
        Function2 function23;
        boolean z1;
        Function2 function22;
        float f7;
        float f6;
        long v13;
        long v12;
        Shape shape1;
        float f5;
        float f4;
        BottomSheetScaffoldState bottomSheetScaffoldState1;
        Modifier modifier1;
        Modifier modifier5;
        float f10;
        long v21;
        int v20;
        int v19;
        long v18;
        long v17;
        Function3 function34;
        Function2 function25;
        boolean z2;
        Function2 function24;
        long v16;
        Shape shape2;
        float f9;
        float f8;
        BottomSheetScaffoldState bottomSheetScaffoldState2;
        Modifier modifier2;
        long v24;
        Function2 function27;
        float f12;
        int v23;
        int v22;
        Shape shape3;
        BottomSheetScaffoldState bottomSheetScaffoldState3;
        Modifier modifier4;
        int v10;
        int v7;
        Composer composer1 = composer0.startRestartGroup(0xA52AC359);
        if((v6 & 1) == 0) {
            v7 = (v4 & 6) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v4 : v4;
        }
        else {
            v7 = v4 | 6;
        }
        if((v6 & 2) != 0) {
            v7 |= 0x30;
        }
        else if((v4 & 0x30) == 0) {
            v7 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v4 & 0x180) == 0) {
            v7 |= ((v6 & 4) != 0 || !composer1.changed(bottomSheetScaffoldState0) ? 0x80 : 0x100);
        }
        int v8 = 0x400;
        if((v6 & 8) != 0) {
            v7 |= 0xC00;
        }
        else if((v4 & 0xC00) == 0) {
            v7 |= (composer1.changed(f) ? 0x800 : 0x400);
        }
        int v9 = 0x2000;
        if((v6 & 16) != 0) {
            v7 |= 0x6000;
        }
        else if((v4 & 0x6000) == 0) {
            v7 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x30000) == 0) {
            v7 |= ((v6 & 0x20) != 0 || !composer1.changed(shape0) ? 0x10000 : 0x20000);
        }
        if((v4 & 0x180000) == 0) {
            v7 |= ((v6 & 0x40) != 0 || !composer1.changed(v) ? 0x80000 : 0x100000);
        }
        if((v4 & 0xC00000) == 0) {
            v7 |= ((v6 & 0x80) != 0 || !composer1.changed(v1) ? 0x400000 : 0x800000);
        }
        if((v6 & 0x100) != 0) {
            v7 |= 0x6000000;
        }
        else if((v4 & 0x6000000) == 0) {
            v7 |= (composer1.changed(f2) ? 0x4000000 : 0x2000000);
        }
        if((v6 & 0x200) != 0) {
            v7 |= 0x30000000;
        }
        else if((v4 & 0x30000000) == 0) {
            v7 |= (composer1.changed(f3) ? 0x20000000 : 0x10000000);
        }
        if((v6 & 0x400) == 0) {
            v10 = (v5 & 6) == 0 ? v5 | (composer1.changedInstance(function20) ? 4 : 2) : v5;
        }
        else {
            v10 = v5 | 6;
        }
        if((v6 & 0x800) != 0) {
            v10 |= 0x30;
        }
        else if((v5 & 0x30) == 0) {
            v10 |= (composer1.changed(z) ? 0x20 : 16);
        }
        int v11 = v10;
        if((v6 & 0x1000) != 0) {
            v11 |= 0x180;
        }
        else if((v5 & 0x180) == 0) {
            v11 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v6 & 0x2000) != 0) {
            v11 |= 0xC00;
        }
        else if((v5 & 0xC00) == 0) {
            if(composer1.changedInstance(function31)) {
                v8 = 0x800;
            }
            v11 |= v8;
        }
        if((v5 & 0x6000) == 0) {
            if((v6 & 0x4000) == 0 && composer1.changed(v2)) {
                v9 = 0x4000;
            }
            v11 |= v9;
        }
        if((v5 & 0x30000) == 0) {
            v11 |= ((v6 & 0x8000) != 0 || !composer1.changed(v3) ? 0x10000 : 0x20000);
        }
        if((v6 & 0x10000) != 0) {
            v11 |= 0x180000;
        }
        else if((v5 & 0x180000) == 0) {
            v11 |= (composer1.changedInstance(function32) ? 0x100000 : 0x80000);
        }
        if((v7 & 306783379) != 306783378 || (0x92493 & v11) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v4 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v6 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v6 & 4) == 0) {
                    modifier4 = modifier3;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState0;
                }
                else {
                    modifier4 = modifier3;
                    bottomSheetScaffoldState3 = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, composer1, 0, 3);
                    v7 &= -897;
                }
                f8 = (v6 & 8) == 0 ? f : 0.0f;
                f9 = (v6 & 16) == 0 ? f1 : 0.0f;
                if((v6 & 0x20) == 0) {
                    shape3 = shape0;
                }
                else {
                    shape3 = BottomSheetDefaults.INSTANCE.getExpandedShape(composer1, 6);
                    v7 &= 0xFFF8FFFF;
                }
                if((v6 & 0x40) == 0) {
                    v22 = v7;
                    v21 = v;
                }
                else {
                    v22 = v7 & 0xFFC7FFFF;
                    v21 = BottomSheetDefaults.INSTANCE.getContainerColor(composer1, 6);
                }
                if((v6 & 0x80) == 0) {
                    v16 = v1;
                    v23 = v22;
                }
                else {
                    v16 = ColorSchemeKt.contentColorFor-ek8zF_U(v21, composer1, v22 >> 18 & 14);
                    v23 = v22 & 0xFE3FFFFF;
                }
                f6 = (v6 & 0x100) == 0 ? f2 : 0.0f;
                float f11 = (v6 & 0x200) == 0 ? f3 : 0.0f;
                Function2 function26 = (v6 & 0x400) == 0 ? function20 : ComposableSingletons.BottomSheetScaffoldKt.INSTANCE.getLambda-1$material3_release();
                boolean z3 = (v6 & 0x800) == 0 ? z : true;
                function25 = (v6 & 0x1000) == 0 ? function21 : null;
                Function3 function35 = (v6 & 0x2000) == 0 ? function31 : ComposableSingletons.BottomSheetScaffoldKt.INSTANCE.getLambda-2$material3_release();
                if((v6 & 0x4000) == 0) {
                    f12 = f11;
                    function27 = function26;
                    v24 = v2;
                }
                else {
                    f12 = f11;
                    v11 &= 0xFFFF1FFF;
                    function27 = function26;
                    v24 = MaterialTheme.INSTANCE.getColorScheme(composer1, 6).getSurface-0d7_KjU();
                }
                if((v6 & 0x8000) == 0) {
                    v18 = v3;
                    v17 = v24;
                    z2 = z3;
                    v20 = v11;
                    v19 = v23;
                    modifier2 = modifier4;
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState3;
                    shape2 = shape3;
                    f10 = f12;
                    function34 = function35;
                }
                else {
                    z2 = z3;
                    v20 = v11 & 0xFFF8FFFF;
                    v19 = v23;
                    v18 = ColorSchemeKt.contentColorFor-ek8zF_U(v24, composer1, v11 >> 12 & 14);
                    shape2 = shape3;
                    f10 = f12;
                    v17 = v24;
                    function34 = function35;
                    modifier2 = modifier4;
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState3;
                }
                function24 = function27;
            }
            else {
                composer1.skipToGroupEnd();
                if((v6 & 4) != 0) {
                    v7 &= -897;
                }
                if((v6 & 0x20) != 0) {
                    v7 &= 0xFFF8FFFF;
                }
                if((v6 & 0x40) != 0) {
                    v7 &= 0xFFC7FFFF;
                }
                if((v6 & 0x80) != 0) {
                    v7 &= 0xFE3FFFFF;
                }
                if((v6 & 0x4000) != 0) {
                    v11 &= 0xFFFF1FFF;
                }
                if((v6 & 0x8000) != 0) {
                    v11 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                bottomSheetScaffoldState2 = bottomSheetScaffoldState0;
                f8 = f;
                f9 = f1;
                shape2 = shape0;
                v16 = v1;
                f6 = f2;
                function24 = function20;
                z2 = z;
                function25 = function21;
                function34 = function31;
                v17 = v2;
                v18 = v3;
                v19 = v7;
                v20 = v11;
                v21 = v;
                f10 = f3;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                modifier5 = modifier2;
                ComposerKt.traceEventStart(0xA52AC359, v19, v20, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:127)");
            }
            else {
                modifier5 = modifier2;
            }
            SheetState sheetState0 = bottomSheetScaffoldState2.getBottomSheetState();
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xE496C680, true, new q1(f8, function32, 0), composer1, 54);
            boolean z4 = true;
            ComposableLambda composableLambda1 = ComposableLambdaKt.rememberComposableLambda(0x74EFCE1F, true, new r1(bottomSheetScaffoldState2, f8, f9, z2, shape2, v21, v16, f6, f10, function24, function30), composer1, 54);
            ComposableLambda composableLambda2 = ComposableLambdaKt.rememberComposableLambda(88659390, true, new x(3, function34, bottomSheetScaffoldState2), composer1, 54);
            if(((v19 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(bottomSheetScaffoldState2)) && (v19 & 0x180) != 0x100) {
                z4 = false;
            }
            b b0 = composer1.rememberedValue();
            if(z4 || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(bottomSheetScaffoldState2, 4);
                composer1.updateRememberedValue(b0);
            }
            BottomSheetScaffoldKt.a(modifier5, function25, composableLambda0, composableLambda1, composableLambda2, b0, sheetState0, v17, v18, composer1, v19 >> 3 & 14 | 0x6D80 | v20 >> 3 & 0x70 | 0x1C00000 & v20 << 9 | v20 << 9 & 0xE000000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            bottomSheetScaffoldState1 = bottomSheetScaffoldState2;
            f7 = f10;
            function22 = function24;
            z1 = z2;
            f4 = f8;
            f5 = f9;
            v14 = v17;
            function23 = function25;
            v15 = v18;
            shape1 = shape2;
            modifier1 = modifier5;
            v12 = v21;
            function33 = function34;
            v13 = v16;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            bottomSheetScaffoldState1 = bottomSheetScaffoldState0;
            f4 = f;
            f5 = f1;
            shape1 = shape0;
            v12 = v;
            v13 = v1;
            f6 = f2;
            f7 = f3;
            function22 = function20;
            z1 = z;
            function23 = function21;
            function33 = function31;
            v14 = v2;
            v15 = v3;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s1(function30, modifier1, bottomSheetScaffoldState1, f4, f5, shape1, v12, v13, f6, f7, function22, z1, function23, function33, v14, v15, function32, v4, v5, v6));
        }
    }

    public static final void a(Modifier modifier0, Function2 function20, Function2 function21, Function2 function22, Function2 function23, Function0 function00, SheetState sheetState0, long v, long v1, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(0x9D9475D4);
        int v3 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function23) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v2) == 0) {
            v3 |= (composer1.changed(sheetState0) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v2) == 0) {
            v3 |= (composer1.changed(v) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v2) == 0) {
            v3 |= (composer1.changed(v1) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v3) != 0x2492492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9D9475D4, v3, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:354)");
            }
            int v4 = 1;
            List list0 = CollectionsKt__CollectionsKt.listOf(new Function2[]{(function20 == null ? ComposableSingletons.BottomSheetScaffoldKt.INSTANCE.getLambda-3$material3_release() : function20), ComposableLambdaKt.rememberComposableLambda(0x17C7B382, true, new gr(modifier0, v, v1, function21), composer1, 54), function22, function23});
            if((v3 & 0x70000) != 0x20000) {
                v4 = 0;
            }
            u1 u10 = composer1.rememberedValue();
            if((((v3 & 0x380000) == 0x100000 ? 1 : 0) | v4) != 0 || u10 == Composer.Companion.getEmpty()) {
                u10 = new u1(sheetState0, function00);
                composer1.updateRememberedValue(u10);
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Function2 function24 = LayoutKt.combineAsVirtualLayouts(list0);
            boolean z = composer1.changed(u10);
            MeasurePolicy measurePolicy0 = composer1.rememberedValue();
            if(z || measurePolicy0 == Composer.Companion.getEmpty()) {
                measurePolicy0 = MultiContentMeasurePolicyKt.createMeasurePolicy(u10);
                composer1.updateRememberedValue(measurePolicy0);
            }
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function25 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function25);
            }
            if(r0.a.B(function24, composer1, r0.a.l(composeUiNode$Companion0, composer1, modifier1, 0))) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v1(modifier0, function20, function21, function22, function23, function00, sheetState0, v, v1, v2));
        }
    }

    public static final void access$StandardBottomSheet-w7I5h1o(SheetState sheetState0, float f, float f1, boolean z, Shape shape0, long v, long v1, float f2, float f3, Function2 function20, Function3 function30, Composer composer0, int v2, int v3) {
        Modifier modifier0;
        Composer composer1 = composer0.startRestartGroup(0x2B00B886);
        int v4 = (v2 & 6) == 0 ? (composer1.changed(sheetState0) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v4 |= (composer1.changed(f1) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v4 |= (composer1.changed(shape0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v4 |= (composer1.changed(v) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v2) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changed(f2) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x6000000) == 0) {
            v4 |= (composer1.changed(f3) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x30000000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        int v5 = (v3 & 6) == 0 ? v3 | (composer1.changedInstance(function30) ? 4 : 2) : v3;
        if((v4 & 306783379) != 306783378 || (v5 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2B00B886, v4, v5, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:224)");
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            Orientation orientation0 = Orientation.Vertical;
            float f4 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f);
            composer1.startReplaceGroup(0x92D3D384);
            if(z) {
                Companion modifier$Companion0 = Modifier.Companion;
                boolean z1 = composer1.changed(sheetState0.getAnchoredDraggableState$material3_release());
                NestedScrollConnection nestedScrollConnection0 = composer1.rememberedValue();
                if(z1 || nestedScrollConnection0 == composer$Companion0.getEmpty()) {
                    nestedScrollConnection0 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState0, orientation0, new o(4, coroutineScope0, sheetState0));
                    composer1.updateRememberedValue(nestedScrollConnection0);
                }
                modifier0 = NestedScrollModifierKt.nestedScroll$default(modifier$Companion0, nestedScrollConnection0, null, 2, null);
            }
            else {
                modifier0 = Modifier.Companion;
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = SizeKt.requiredHeightIn-VpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.widthIn-VpY3zN4$default(Modifier.Companion, 0.0f, f1, 1, null), 0.0f, 1, null), f, 0.0f, 2, null).then(modifier0);
            AnchoredDraggableState anchoredDraggableState0 = sheetState0.getAnchoredDraggableState$material3_release();
            boolean z2 = composer1.changed(f4);
            x1 x10 = composer1.rememberedValue();
            if((v4 & 14) == 4 || z2 || x10 == composer$Companion0.getEmpty()) {
                x10 = new x1(sheetState0, f4, 0);
                composer1.updateRememberedValue(x10);
            }
            SurfaceKt.Surface-T9BRK9s(AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(modifier1, anchoredDraggableState0, orientation0, x10), sheetState0.getAnchoredDraggableState$material3_release(), orientation0, z, false, null, 24, null), shape0, v, v1, f2, f3, null, ComposableLambdaKt.rememberComposableLambda(390720907, true, new d2(function20, sheetState0, z, coroutineScope0, function30), composer1, 54), composer1, v4 >> 9 & 0x70 | 0xC00000 | v4 >> 9 & 0x380 | v4 >> 9 & 0x1C00 | 0xE000 & v4 >> 9 | v4 >> 9 & 0x70000, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e2(sheetState0, f, f1, z, shape0, v, v1, f2, f3, function20, function30, v2, v3));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable SheetState sheetState0, @Nullable SnackbarHostState snackbarHostState0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            sheetState0 = BottomSheetScaffoldKt.rememberStandardBottomSheetState(null, null, false, composer0, 0, 7);
        }
        if((v1 & 2) != 0) {
            SnackbarHostState snackbarHostState1 = composer0.rememberedValue();
            if(snackbarHostState1 == Composer.Companion.getEmpty()) {
                snackbarHostState1 = new SnackbarHostState();
                composer0.updateRememberedValue(snackbarHostState1);
            }
            snackbarHostState0 = snackbarHostState1;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474606134, v, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:180)");
        }
        int v2 = 0;
        int v3 = ((v & 14 ^ 6) <= 4 || !composer0.changed(sheetState0)) && (v & 6) != 4 ? 0 : 1;
        if((v & 0x70 ^ 0x30) > 0x20 && composer0.changed(snackbarHostState0) || (v & 0x30) == 0x20) {
            v2 = 1;
        }
        BottomSheetScaffoldState bottomSheetScaffoldState0 = composer0.rememberedValue();
        if((v3 | v2) != 0 || bottomSheetScaffoldState0 == Composer.Companion.getEmpty()) {
            bottomSheetScaffoldState0 = new BottomSheetScaffoldState(sheetState0, snackbarHostState0);
            composer0.updateRememberedValue(bottomSheetScaffoldState0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomSheetScaffoldState0;
    }

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public static final SheetState rememberStandardBottomSheetState(@Nullable SheetValue sheetValue0, @Nullable Function1 function10, boolean z, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            sheetValue0 = SheetValue.PartiallyExpanded;
        }
        if((v1 & 2) != 0) {
            function10 = g2.w;
        }
        if((v1 & 4) != 0) {
            z = true;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x287143DD, v, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:204)");
        }
        SheetState sheetState0 = SheetDefaultsKt.rememberSheetState(false, function10, sheetValue0, z, composer0, v & 0x70 | v << 6 & 0x380 | v << 3 & 0x1C00, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetState0;
    }
}

