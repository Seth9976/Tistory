package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a7;
import p0.b7;
import p0.c7;
import p0.d7;
import p0.o2;
import p0.y6;
import p0.z6;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A#\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006\u001A\u00A7\u0002\u0010*\u001A\u00020\r2\u0006\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\u00042\u0013\b\u0002\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0002\b\u000E2\u0013\b\u0002\u0010\u0010\u001A\r\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0002\b\u000E2\u0019\b\u0002\u0010\u0012\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0011\u00A2\u0006\u0002\b\u000E2\u0013\b\u0002\u0010\u0013\u001A\r\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0002\b\u000E2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162 \b\u0002\u0010\u001A\u001A\u001A\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u00A2\u0006\u0002\b\u000E\u00A2\u0006\u0002\b\u00192\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 2\b\b\u0002\u0010\"\u001A\u00020 2\b\b\u0002\u0010#\u001A\u00020 2\b\b\u0002\u0010$\u001A\u00020 2\b\b\u0002\u0010%\u001A\u00020 2\u0017\u0010\'\u001A\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0\u0011\u00A2\u0006\u0002\b\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)\u001A\u009F\u0002\u0010*\u001A\u00020\r2\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\u00042\u0013\b\u0002\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0002\b\u000E2\u0013\b\u0002\u0010\u0010\u001A\r\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0002\b\u000E2\u0019\b\u0002\u0010\u0012\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0011\u00A2\u0006\u0002\b\u000E2\u0013\b\u0002\u0010\u0013\u001A\r\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0002\b\u000E2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162 \b\u0002\u0010\u001A\u001A\u001A\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u00A2\u0006\u0002\b\u000E\u00A2\u0006\u0002\b\u00192\b\b\u0002\u0010\u001B\u001A\u00020\u00162\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 2\b\b\u0002\u0010\"\u001A\u00020 2\b\b\u0002\u0010#\u001A\u00020 2\b\b\u0002\u0010$\u001A\u00020 2\b\b\u0002\u0010%\u001A\u00020 2\u0017\u0010\'\u001A\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0\u0011\u00A2\u0006\u0002\b\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010,\"1\u00106\u001A\u00020\u00162\u0006\u0010-\u001A\u00020\u00168G@GX\u0087\u008E\u0002\u00A2\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u00105\u001A\u0004\b0\u00101\"\u0004\b2\u00103\"\"\u0010=\u001A\n\u0012\u0006\u0012\u0004\u0018\u000108078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006>"}, d2 = {"Landroidx/compose/material/DrawerState;", "drawerState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/ScaffoldState;", "rememberScaffoldState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerContent", "drawerGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-u4IkXBM", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getScaffoldSubcomposeInMeasureFix", "()Z", "setScaffoldSubcomposeInMeasureFix", "(Z)V", "getScaffoldSubcomposeInMeasureFix$annotations", "()V", "ScaffoldSubcomposeInMeasureFix", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "b", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalFabPlacement", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,818:1\n25#2:819\n25#2:826\n36#2:833\n1116#3,6:820\n1116#3,6:827\n1116#3,6:834\n1116#3,6:844\n1116#3,6:850\n154#4:840\n154#4:856\n81#5:841\n107#5,2:842\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n*L\n76#1:819\n77#1:826\n206#1:833\n76#1:820,6\n77#1:827,6\n206#1:834,6\n451#1:844,6\n629#1:850,6\n335#1:840\n815#1:856\n383#1:841\n383#1:842,2\n*E\n"})
public final class ScaffoldKt {
    public static final MutableState a;
    public static final ProvidableCompositionLocal b;
    public static final float c;

    static {
        ScaffoldKt.a = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        ScaffoldKt.b = CompositionLocalKt.staticCompositionLocalOf(o2.C);
        ScaffoldKt.c = 16.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Scaffold-27mzLpw(@Nullable Modifier modifier0, @Nullable ScaffoldState scaffoldState0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function3 function30, @Nullable Function2 function22, int v, boolean z, @Nullable Function3 function31, boolean z1, @Nullable Shape shape0, float f, long v1, long v2, long v3, long v4, long v5, @NotNull Function3 function32, @Nullable Composer composer0, int v6, int v7, int v8) {
        float f1;
        Shape shape1;
        Function2 function25;
        boolean z3;
        int v18;
        long v17;
        long v16;
        long v15;
        long v14;
        long v13;
        boolean z2;
        Function3 function34;
        Function2 function24;
        Function3 function33;
        Function2 function23;
        ScaffoldState scaffoldState1;
        Modifier modifier1;
        Function3 function36;
        int v27;
        float f2;
        Function2 function28;
        boolean z5;
        int v26;
        int v25;
        long v24;
        long v23;
        long v22;
        long v21;
        long v20;
        boolean z4;
        Function3 function35;
        Function2 function27;
        Function2 function26;
        long v33;
        long v32;
        long v31;
        long v30;
        boolean z7;
        long v29;
        int v28;
        Function3 function38;
        ScaffoldState scaffoldState2;
        Modifier modifier3;
        int v9;
        Composer composer1 = composer0.startRestartGroup(1037492569);
        if((v8 & 1) == 0) {
            v9 = (v6 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v6 : v6;
        }
        else {
            v9 = v6 | 6;
        }
        if((v6 & 0x70) == 0) {
            v9 |= ((v8 & 2) != 0 || !composer1.changed(scaffoldState0) ? 16 : 0x20);
        }
        if((v8 & 4) != 0) {
            v9 |= 0x180;
        }
        else if((v6 & 0x380) == 0) {
            v9 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        int v10 = 0x800;
        if((v8 & 8) != 0) {
            v9 |= 0xC00;
        }
        else if((v6 & 0x1C00) == 0) {
            v9 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        int v11 = 0x2000;
        if((v8 & 16) != 0) {
            v9 |= 0x6000;
        }
        else if((v6 & 0xE000) == 0) {
            v9 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((v8 & 0x20) != 0) {
            v9 |= 0x30000;
        }
        else if((v6 & 0x70000) == 0) {
            v9 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        if((v8 & 0x40) != 0) {
            v9 |= 0x180000;
        }
        else if((v6 & 0x380000) == 0) {
            v9 |= (composer1.changed(v) ? 0x100000 : 0x80000);
        }
        if((v8 & 0x80) != 0) {
            v9 |= 0xC00000;
        }
        else if((v6 & 0x1C00000) == 0) {
            v9 |= (composer1.changed(z) ? 0x800000 : 0x400000);
        }
        if((v8 & 0x100) != 0) {
            v9 |= 0x6000000;
        }
        else if((v6 & 0xE000000) == 0) {
            v9 |= (composer1.changedInstance(function31) ? 0x4000000 : 0x2000000);
        }
        if((v8 & 0x200) != 0) {
            v9 |= 0x30000000;
        }
        else if((v6 & 0x70000000) == 0) {
            v9 |= (composer1.changed(z1) ? 0x20000000 : 0x10000000);
        }
        int v12 = (v7 & 14) == 0 ? v7 | ((v8 & 0x400) != 0 || !composer1.changed(shape0) ? 2 : 4) : v7;
        if((v8 & 0x800) != 0) {
            v12 |= 0x30;
        }
        else if((v7 & 0x70) == 0) {
            v12 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v7 & 0x380) == 0) {
            v12 |= ((v8 & 0x1000) != 0 || !composer1.changed(v1) ? 0x80 : 0x100);
        }
        if((v7 & 0x1C00) == 0) {
            if((v8 & 0x2000) != 0 || !composer1.changed(v2)) {
                v10 = 0x400;
            }
            v12 |= v10;
        }
        if((v7 & 0xE000) == 0) {
            if((v8 & 0x4000) == 0 && composer1.changed(v3)) {
                v11 = 0x4000;
            }
            v12 |= v11;
        }
        if((v7 & 0x70000) == 0) {
            v12 |= ((v8 & 0x8000) != 0 || !composer1.changed(v4) ? 0x10000 : 0x20000);
        }
        if((v7 & 0x380000) == 0) {
            v12 |= ((v8 & 0x10000) != 0 || !composer1.changed(v5) ? 0x80000 : 0x100000);
        }
        if((v8 & 0x20000) != 0) {
            v12 |= 0xC00000;
        }
        else if((v7 & 0x1C00000) == 0) {
            v12 |= (composer1.changedInstance(function32) ? 0x800000 : 0x400000);
        }
        if((v9 & 0x5B6DB6DB) != 306783378 || (v12 & 0x16DB6DB) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v6 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier2 = (v8 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v8 & 2) == 0) {
                    modifier3 = modifier2;
                    scaffoldState2 = scaffoldState0;
                }
                else {
                    modifier3 = modifier2;
                    scaffoldState2 = ScaffoldKt.rememberScaffoldState(null, null, composer1, 0, 3);
                    v9 &= 0xFFFFFF8F;
                }
                function28 = (v8 & 4) == 0 ? function20 : ComposableSingletons.ScaffoldKt.INSTANCE.getLambda-5$material_release();
                function26 = (v8 & 8) == 0 ? function21 : ComposableSingletons.ScaffoldKt.INSTANCE.getLambda-6$material_release();
                function36 = (v8 & 16) == 0 ? function30 : ComposableSingletons.ScaffoldKt.INSTANCE.getLambda-7$material_release();
                function27 = (v8 & 0x20) == 0 ? function22 : ComposableSingletons.ScaffoldKt.INSTANCE.getLambda-8$material_release();
                v27 = (v8 & 0x40) == 0 ? v : 2;
                z5 = (v8 & 0x80) == 0 ? z : false;
                Function3 function37 = (v8 & 0x100) == 0 ? function31 : null;
                boolean z6 = (v8 & 0x200) == 0 ? z1 : true;
                if((v8 & 0x400) == 0) {
                    shape1 = shape0;
                }
                else {
                    shape1 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getLarge();
                    v12 &= -15;
                }
                if((v8 & 0x1000) == 0) {
                    function38 = function37;
                    z7 = z6;
                    v28 = v12;
                    v29 = v1;
                }
                else {
                    function38 = function37;
                    v28 = v12 & -897;
                    v29 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                    z7 = z6;
                }
                if((v8 & 0x2000) == 0) {
                    v30 = v2;
                }
                else {
                    v30 = ColorsKt.contentColorFor-ek8zF_U(v29, composer1, v28 >> 6 & 14);
                    v28 &= 0xFFFFE3FF;
                }
                if((v8 & 0x4000) == 0) {
                    v31 = v29;
                    v32 = v3;
                }
                else {
                    v31 = v29;
                    v32 = DrawerDefaults.INSTANCE.getScrimColor(composer1, 6);
                    v28 &= 0xFFFF1FFF;
                }
                if((0x8000 & v8) == 0) {
                    v33 = v4;
                }
                else {
                    v33 = MaterialTheme.INSTANCE.getColors(composer1, 6).getBackground-0d7_KjU();
                    v28 &= 0xFFF8FFFF;
                }
                if((v8 & 0x10000) == 0) {
                    z4 = z7;
                    v24 = v5;
                    v23 = v33;
                    v25 = v28;
                    v26 = v9;
                    v21 = v30;
                    v20 = v31;
                    v22 = v32;
                }
                else {
                    z4 = z7;
                    v23 = v33;
                    v25 = v28 & 0xFFC7FFFF;
                    v26 = v9;
                    v21 = v30;
                    v20 = v31;
                    v22 = v32;
                    v24 = ColorsKt.contentColorFor-ek8zF_U(v33, composer1, v28 >> 15 & 14);
                }
                modifier1 = modifier3;
                scaffoldState1 = scaffoldState2;
                function35 = function38;
                f2 = (v8 & 0x800) == 0 ? f : 16.0f;
            }
            else {
                composer1.skipToGroupEnd();
                if((v8 & 2) != 0) {
                    v9 &= 0xFFFFFF8F;
                }
                if((v8 & 0x400) != 0) {
                    v12 &= -15;
                }
                int v19 = (v8 & 0x1000) == 0 ? v12 : v12 & -897;
                if((v8 & 0x2000) != 0) {
                    v19 &= 0xFFFFE3FF;
                }
                if((v8 & 0x4000) != 0) {
                    v19 &= 0xFFFF1FFF;
                }
                if((0x8000 & v8) != 0) {
                    v19 &= 0xFFF8FFFF;
                }
                if((v8 & 0x10000) != 0) {
                    v19 &= 0xFFC7FFFF;
                }
                scaffoldState1 = scaffoldState0;
                function26 = function21;
                function27 = function22;
                function35 = function31;
                z4 = z1;
                v20 = v1;
                v21 = v2;
                v22 = v3;
                v23 = v4;
                v24 = v5;
                v25 = v19;
                v26 = v9;
                z5 = z;
                function28 = function20;
                modifier1 = modifier0;
                shape1 = shape0;
                f2 = f;
                v27 = v;
                function36 = function30;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1037492569, v26, v25, "androidx.compose.material.Scaffold (Scaffold.kt:332)");
            }
            ScaffoldKt.Scaffold-u4IkXBM(WindowInsetsKt.WindowInsets-a9UjIt4$default(0.0f, 0.0f, 0.0f, 0.0f, 14, null), modifier1, scaffoldState1, function28, function26, function36, function27, v27, z5, function35, z4, shape1, f2, v20, v21, v22, v23, v24, function32, composer1, v26 << 3 & 0x7FFFFFF0, v26 >> 27 & 14 | v25 << 3 & 0x70 | v25 << 3 & 0x380 | v25 << 3 & 0x1C00 | v25 << 3 & 0xE000 | v25 << 3 & 0x70000 | v25 << 3 & 0x380000 | v25 << 3 & 0x1C00000 | v25 << 3 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v13 = v20;
            v14 = v21;
            v15 = v22;
            v16 = v23;
            v17 = v24;
            function34 = function35;
            function25 = function28;
            function24 = function27;
            z2 = z4;
            function23 = function26;
            v18 = v27;
            f1 = f2;
            function33 = function36;
            z3 = z5;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            scaffoldState1 = scaffoldState0;
            function23 = function21;
            function33 = function30;
            function24 = function22;
            function34 = function31;
            z2 = z1;
            v13 = v1;
            v14 = v2;
            v15 = v3;
            v16 = v4;
            v17 = v5;
            v18 = v;
            z3 = z;
            function25 = function20;
            shape1 = shape0;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c7(modifier1, scaffoldState1, function25, function23, function33, function24, v18, z3, function34, z2, shape1, f1, v13, v14, v15, v16, v17, function32, v6, v7, v8));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Scaffold-u4IkXBM(@NotNull WindowInsets windowInsets0, @Nullable Modifier modifier0, @Nullable ScaffoldState scaffoldState0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function3 function30, @Nullable Function2 function22, int v, boolean z, @Nullable Function3 function31, boolean z1, @Nullable Shape shape0, float f, long v1, long v2, long v3, long v4, long v5, @NotNull Function3 function32, @Nullable Composer composer0, int v6, int v7, int v8) {
        Shape shape1;
        int v20;
        long v19;
        long v18;
        long v17;
        long v16;
        long v15;
        float f1;
        boolean z3;
        Function3 function34;
        boolean z2;
        Function2 function25;
        Function3 function33;
        Function2 function24;
        Function2 function23;
        ScaffoldState scaffoldState1;
        Modifier modifier1;
        boolean z11;
        boolean z5;
        int v25;
        int v24;
        int v23;
        long v22;
        long v21;
        float f2;
        Shape shape2;
        boolean z4;
        Function2 function28;
        Function2 function27;
        Function2 function26;
        Modifier modifier2;
        long v29;
        int v28;
        long v27;
        boolean z9;
        int v26;
        boolean z8;
        Modifier modifier4;
        int v13;
        int v9;
        Composer composer1 = composer0.startRestartGroup(0xB3310EDB);
        if((v8 & 1) == 0) {
            v9 = (v6 & 14) == 0 ? (composer1.changed(windowInsets0) ? 4 : 2) | v6 : v6;
        }
        else {
            v9 = v6 | 6;
        }
        if((v8 & 2) != 0) {
            v9 |= 0x30;
        }
        else if((v6 & 0x70) == 0) {
            v9 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v6 & 0x380) == 0) {
            v9 |= ((v8 & 4) != 0 || !composer1.changed(scaffoldState0) ? 0x80 : 0x100);
        }
        int v10 = 0x400;
        if((v8 & 8) != 0) {
            v9 |= 0xC00;
        }
        else if((v6 & 0x1C00) == 0) {
            v9 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        int v11 = 0x4000;
        if((v8 & 16) != 0) {
            v9 |= 0x6000;
        }
        else if((v6 & 0xE000) == 0) {
            v9 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((v8 & 0x20) != 0) {
            v9 |= 0x30000;
        }
        else if((v6 & 0x70000) == 0) {
            v9 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        int v12 = 0x80000;
        if((v8 & 0x40) != 0) {
            v9 |= 0x180000;
        }
        else if((v6 & 0x380000) == 0) {
            v9 |= (composer1.changedInstance(function22) ? 0x100000 : 0x80000);
        }
        if((v8 & 0x80) != 0) {
            v9 |= 0xC00000;
        }
        else if((v6 & 0x1C00000) == 0) {
            v9 |= (composer1.changed(v) ? 0x800000 : 0x400000);
        }
        if((v8 & 0x100) != 0) {
            v9 |= 0x6000000;
        }
        else if((v6 & 0xE000000) == 0) {
            v9 |= (composer1.changed(z) ? 0x4000000 : 0x2000000);
        }
        if((v8 & 0x200) != 0) {
            v9 |= 0x30000000;
        }
        else if((v6 & 0x70000000) == 0) {
            v9 |= (composer1.changedInstance(function31) ? 0x20000000 : 0x10000000);
        }
        if((v8 & 0x400) == 0) {
            v13 = (v7 & 14) == 0 ? v7 | (composer1.changed(z1) ? 4 : 2) : v7;
        }
        else {
            v13 = v7 | 6;
        }
        if((v7 & 0x70) == 0) {
            v13 |= ((v8 & 0x800) != 0 || !composer1.changed(shape0) ? 16 : 0x20);
        }
        int v14 = v13;
        if((v8 & 0x1000) != 0) {
            v14 |= 0x180;
        }
        else if((v7 & 0x380) == 0) {
            v14 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v7 & 0x1C00) == 0) {
            if((v8 & 0x2000) == 0 && composer1.changed(v1)) {
                v10 = 0x800;
            }
            v14 |= v10;
        }
        if((v7 & 0xE000) == 0) {
            if((v8 & 0x4000) != 0 || !composer1.changed(v2)) {
                v11 = 0x2000;
            }
            v14 |= v11;
        }
        if((v7 & 0x70000) == 0) {
            v14 |= ((v8 & 0x8000) != 0 || !composer1.changed(v3) ? 0x10000 : 0x20000);
        }
        if((v7 & 0x380000) == 0) {
            if((v8 & 0x10000) == 0 && composer1.changed(v4)) {
                v12 = 0x100000;
            }
            v14 |= v12;
        }
        if((v7 & 0x1C00000) == 0) {
            v14 |= ((v8 & 0x20000) != 0 || !composer1.changed(v5) ? 0x400000 : 0x800000);
        }
        if((v8 & 0x40000) != 0) {
            v14 |= 0x6000000;
        }
        else if((v7 & 0xE000000) == 0) {
            v14 |= (composer1.changedInstance(function32) ? 0x4000000 : 0x2000000);
        }
        if((v9 & 0x5B6DB6DB) != 306783378 || (0xB6DB6DB & v14) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v6 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v8 & 2) == 0 ? modifier0 : Modifier.Companion;
                function34 = null;
                if((v8 & 4) == 0) {
                    modifier4 = modifier3;
                    scaffoldState1 = scaffoldState0;
                }
                else {
                    modifier4 = modifier3;
                    scaffoldState1 = ScaffoldKt.rememberScaffoldState(null, null, composer1, 0, 3);
                    v9 &= -897;
                }
                function26 = (v8 & 8) == 0 ? function20 : ComposableSingletons.ScaffoldKt.INSTANCE.getLambda-1$material_release();
                function27 = (v8 & 16) == 0 ? function21 : ComposableSingletons.ScaffoldKt.INSTANCE.getLambda-2$material_release();
                function33 = (v8 & 0x20) == 0 ? function30 : ComposableSingletons.ScaffoldKt.INSTANCE.getLambda-3$material_release();
                function28 = (v8 & 0x40) == 0 ? function22 : ComposableSingletons.ScaffoldKt.INSTANCE.getLambda-4$material_release();
                v23 = (v8 & 0x80) == 0 ? v : 2;
                boolean z6 = (v8 & 0x100) == 0 ? z : false;
                if((v8 & 0x200) == 0) {
                    function34 = function31;
                }
                boolean z7 = (v8 & 0x400) == 0 ? z1 : true;
                if((v8 & 0x800) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getLarge();
                    v14 &= 0xFFFFFF8F;
                }
                f2 = (v8 & 0x1000) == 0 ? f : 16.0f;
                if((v8 & 0x2000) == 0) {
                    z8 = z6;
                    v26 = v9;
                    z9 = z7;
                    v27 = v1;
                }
                else {
                    z8 = z6;
                    v14 &= 0xFFFFE3FF;
                    v26 = v9;
                    z9 = z7;
                    v27 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                }
                if((v8 & 0x4000) == 0) {
                    v16 = v2;
                }
                else {
                    v16 = ColorsKt.contentColorFor-ek8zF_U(v27, composer1, v14 >> 9 & 14);
                    v14 &= 0xFFFF1FFF;
                }
                if((v8 & 0x8000) == 0) {
                    v28 = v26;
                    v21 = v3;
                }
                else {
                    v28 = v26;
                    v21 = DrawerDefaults.INSTANCE.getScrimColor(composer1, 6);
                    v14 &= 0xFFF8FFFF;
                }
                if((v8 & 0x10000) == 0) {
                    v15 = v27;
                    v29 = v4;
                }
                else {
                    v14 &= 0xFFC7FFFF;
                    v29 = MaterialTheme.INSTANCE.getColors(composer1, 6).getBackground-0d7_KjU();
                    v15 = v27;
                }
                if((v8 & 0x20000) == 0) {
                    modifier2 = modifier4;
                    v22 = v5;
                    v18 = v29;
                    v24 = v14;
                    z5 = z8;
                    z4 = z9;
                    v25 = v28;
                }
                else {
                    modifier2 = modifier4;
                    v24 = v14 & 0xFE3FFFFF;
                    v22 = ColorsKt.contentColorFor-ek8zF_U(v29, composer1, v14 >> 18 & 14);
                    v25 = v28;
                    v18 = v29;
                    z5 = z8;
                    z4 = z9;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v8 & 4) != 0) {
                    v9 &= -897;
                }
                if((v8 & 0x800) != 0) {
                    v14 &= 0xFFFFFF8F;
                }
                if((v8 & 0x2000) != 0) {
                    v14 &= 0xFFFFE3FF;
                }
                if((v8 & 0x4000) != 0) {
                    v14 &= 0xFFFF1FFF;
                }
                if((v8 & 0x8000) != 0) {
                    v14 &= 0xFFF8FFFF;
                }
                if((v8 & 0x10000) != 0) {
                    v14 &= 0xFFC7FFFF;
                }
                if((v8 & 0x20000) != 0) {
                    v14 &= 0xFE3FFFFF;
                }
                modifier2 = modifier0;
                scaffoldState1 = scaffoldState0;
                function26 = function20;
                function27 = function21;
                function33 = function30;
                function28 = function22;
                function34 = function31;
                z4 = z1;
                shape2 = shape0;
                f2 = f;
                v15 = v1;
                v16 = v2;
                v21 = v3;
                v18 = v4;
                v22 = v5;
                v23 = v;
                v24 = v14;
                v25 = v9;
                z5 = z;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB3310EDB, v25, v24, "androidx.compose.material.Scaffold (Scaffold.kt:204)");
            }
            composer1.startReplaceableGroup(0x44FAF204);
            boolean z10 = composer1.changed(windowInsets0);
            MutableWindowInsets mutableWindowInsets0 = composer1.rememberedValue();
            if(z10 || mutableWindowInsets0 == Composer.Companion.getEmpty()) {
                mutableWindowInsets0 = new MutableWindowInsets(windowInsets0);
                composer1.updateRememberedValue(mutableWindowInsets0);
            }
            composer1.endReplaceableGroup();
            ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(composer1, 0xF2E59CA8, true, new d7(mutableWindowInsets0, windowInsets0, v18, v22, z5, v23, function26, function32, function28, function27, function33, scaffoldState1));
            if(function34 == null) {
                z11 = z5;
                composer1.startReplaceableGroup(0xC391F0D2);
                composableLambda0.invoke(modifier2, composer1, ((int)(v25 >> 3 & 14 | 0x30)));
            }
            else {
                composer1.startReplaceableGroup(-1013846315);
                z11 = z5;
                DrawerKt.ModalDrawer-Gs3lGvM(function34, modifier2, scaffoldState1.getDrawerState(), z4, shape2, f2, v15, v16, v21, ComposableLambdaKt.composableLambda(composer1, 0xAC015E60, true, new a7(composableLambda0)), composer1, v25 >> 27 & 14 | 0x30000000 | v25 & 0x70 | v24 << 9 & 0x1C00 | v24 << 9 & 0xE000 | v24 << 9 & 0x70000 | v24 << 9 & 0x380000 | v24 << 9 & 0x1C00000 | v24 << 9 & 0xE000000, 0);
            }
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            shape1 = shape2;
            f1 = f2;
            v20 = v23;
            function24 = function27;
            function25 = function28;
            v17 = v21;
            v19 = v22;
            z3 = z4;
            function23 = function26;
            z2 = z11;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            scaffoldState1 = scaffoldState0;
            function23 = function20;
            function24 = function21;
            function33 = function30;
            function25 = function22;
            z2 = z;
            function34 = function31;
            z3 = z1;
            f1 = f;
            v15 = v1;
            v16 = v2;
            v17 = v3;
            v18 = v4;
            v19 = v5;
            v20 = v;
            shape1 = shape0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b7(windowInsets0, modifier1, scaffoldState1, function23, function24, function33, function25, v20, z2, function34, z3, shape1, f1, v15, v16, v17, v18, v19, function32, v6, v7, v8));
        }
    }

    public static final void a(boolean z, int v, Function2 function20, Function3 function30, Function2 function21, Function2 function22, WindowInsets windowInsets0, Function2 function23, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(141059468);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((0xE000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v1) == 0) {
            v2 |= (composer1.changed(windowInsets0) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function23) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v2) != 4793490 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(141059468, v2, -1, "androidx.compose.material.LegacyScaffoldLayout (Scaffold.kt:627)");
            }
            composer1.startReplaceableGroup(0xD2D8A78C);
            boolean z1 = composer1.changedInstance(function20);
            boolean z2 = composer1.changedInstance(function21);
            boolean z3 = composer1.changed(windowInsets0);
            boolean z4 = composer1.changedInstance(function22);
            boolean z5 = composer1.changed(v);
            boolean z6 = composer1.changed(z);
            boolean z7 = composer1.changedInstance(function23);
            boolean z8 = composer1.changedInstance(function30);
            y6 y60 = composer1.rememberedValue();
            if((z1 | z2 | z3 | z4 | z5 | z6 | z7 | z8) != 0 || y60 == Composer.Companion.getEmpty()) {
                y6 y61 = new y6(function20, function21, function22, v, z, windowInsets0, function23, function30);
                composer1.updateRememberedValue(y61);
                y60 = y61;
            }
            composer1.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, y60, composer1, 0, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z6(z, v, function20, function30, function21, function22, windowInsets0, function23, v1, 0));
        }
    }

    public static final void access$ScaffoldLayout-i1QSOvI(boolean z, int v, Function2 function20, Function3 function30, Function2 function21, Function2 function22, WindowInsets windowInsets0, Function2 function23, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xE4146755);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((0xE000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v1) == 0) {
            v2 |= (composer1.changed(windowInsets0) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function23) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v2) != 4793490 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE4146755, v2, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:409)");
            }
            if(ScaffoldKt.getScaffoldSubcomposeInMeasureFix()) {
                composer1.startReplaceableGroup(-2103098080);
                ScaffoldKt.b(z, v, function20, function30, function21, function22, windowInsets0, function23, composer1, v2 & 0x1FFFFFE);
            }
            else {
                composer1.startReplaceableGroup(-2103097736);
                ScaffoldKt.a(z, v, function20, function30, function21, function22, windowInsets0, function23, composer1, v2 & 0x1FFFFFE);
            }
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
            scopeUpdateScope0.updateScope(new z6(z, v, function20, function30, function21, function22, windowInsets0, function23, v1, 1));
        }
    }

    public static final float access$getFabSpacing$p() [...] // 潜在的解密器

    public static final void b(boolean z, int v, Function2 function20, Function3 function30, Function2 function21, Function2 function22, WindowInsets windowInsets0, Function2 function23, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(1285900760);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((0xE000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v1) == 0) {
            v2 |= (composer1.changed(windowInsets0) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function23) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v2) != 4793490 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1285900760, v2, -1, "androidx.compose.material.ScaffoldLayoutWithMeasureFix (Scaffold.kt:449)");
            }
            composer1.startReplaceableGroup(-757560492);
            boolean z1 = composer1.changedInstance(function20);
            boolean z2 = composer1.changedInstance(function21);
            boolean z3 = composer1.changed(windowInsets0);
            boolean z4 = composer1.changedInstance(function22);
            boolean z5 = composer1.changed(v);
            boolean z6 = composer1.changed(z);
            boolean z7 = composer1.changedInstance(function23);
            boolean z8 = composer1.changedInstance(function30);
            z z9 = composer1.rememberedValue();
            if((z1 | z2 | z3 | z4 | z5 | z6 | z7 | z8) != 0 || z9 == Composer.Companion.getEmpty()) {
                z z10 = new z(function20, function21, function22, v, z, windowInsets0, function23, function30);
                composer1.updateRememberedValue(z10);
                z9 = z10;
            }
            composer1.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, z9, composer1, 0, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z6(z, v, function20, function30, function21, function22, windowInsets0, function23, v1, 2));
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalFabPlacement() {
        return ScaffoldKt.b;
    }

    @ExperimentalMaterialApi
    public static final boolean getScaffoldSubcomposeInMeasureFix() {
        return ((Boolean)ScaffoldKt.a.getValue()).booleanValue();
    }

    @ExperimentalMaterialApi
    public static void getScaffoldSubcomposeInMeasureFix$annotations() {
    }

    @Composable
    @NotNull
    public static final ScaffoldState rememberScaffoldState(@Nullable DrawerState drawerState0, @Nullable SnackbarHostState snackbarHostState0, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x5D8ED5C5);
        if((v1 & 1) != 0) {
            drawerState0 = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer0, 6, 2);
        }
        if((v1 & 2) != 0) {
            composer0.startReplaceableGroup(0xE2A708A4);
            SnackbarHostState snackbarHostState1 = composer0.rememberedValue();
            if(snackbarHostState1 == Composer.Companion.getEmpty()) {
                snackbarHostState1 = new SnackbarHostState();
                composer0.updateRememberedValue(snackbarHostState1);
            }
            composer0.endReplaceableGroup();
            snackbarHostState0 = snackbarHostState1;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5D8ED5C5, v, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:76)");
        }
        composer0.startReplaceableGroup(0xE2A708A4);
        ScaffoldState scaffoldState0 = composer0.rememberedValue();
        if(scaffoldState0 == Composer.Companion.getEmpty()) {
            scaffoldState0 = new ScaffoldState(drawerState0, snackbarHostState0);
            composer0.updateRememberedValue(scaffoldState0);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return scaffoldState0;
    }

    @ExperimentalMaterialApi
    public static final void setScaffoldSubcomposeInMeasureFix(boolean z) {
        ScaffoldKt.a.setValue(Boolean.valueOf(z));
    }
}

