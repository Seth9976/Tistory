package androidx.compose.material;

import androidx.activity.g0;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.o5;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.room.a;
import j0.b2;
import j0.t1;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.r1;
import p0.r;
import p0.s1;
import p0.v1;
import p0.w1;
import p0.x1;
import p0.y1;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000E\u001A;\u0010\t\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00A2\u0006\u0004\b\t\u0010\n\u001AE\u0010\u000E\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u000B2\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001A=\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001A#\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0012\u001A\u00020\b2\b\b\u0002\u0010\u0014\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\'\u0010\t\u001A\u00020\u00152\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0012\u001A\u00020\b2\u0006\u0010\u0014\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\b\t\u0010\u001A\u001A-\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u0012\u001A\u00020\b2\b\b\u0002\u0010\u0014\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u001B\u001A\u0080\u0002\u00109\u001A\u00020\u001D2\u001C\u0010 \u001A\u0018\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u001D0\u0005\u00A2\u0006\u0002\b\u001E\u00A2\u0006\u0002\b\u001F2\b\b\u0002\u0010\"\u001A\u00020!2\b\b\u0002\u0010#\u001A\u00020\u00152\u0015\b\u0002\u0010%\u001A\u000F\u0012\u0004\u0012\u00020\u001D\u0018\u00010$\u00A2\u0006\u0002\b\u001E2\u0019\b\u0002\u0010&\u001A\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001D0\u0005\u00A2\u0006\u0002\b\u001E2\u0015\b\u0002\u0010\'\u001A\u000F\u0012\u0004\u0012\u00020\u001D\u0018\u00010$\u00A2\u0006\u0002\b\u001E2\b\b\u0002\u0010)\u001A\u00020(2\b\b\u0002\u0010*\u001A\u00020\u00062\b\b\u0002\u0010,\u001A\u00020+2\b\b\u0002\u0010.\u001A\u00020-2\b\b\u0002\u00100\u001A\u00020/2\b\b\u0002\u00101\u001A\u00020/2\b\b\u0002\u00102\u001A\u00020-2\b\b\u0002\u00103\u001A\u00020/2\b\b\u0002\u00104\u001A\u00020/2\u0017\u00106\u001A\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u001D0\u0005\u00A2\u0006\u0002\b\u001EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u00108\u001A\u00DE\u0002\u00109\u001A\u00020\u001D2\u001C\u0010 \u001A\u0018\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u001D0\u0005\u00A2\u0006\u0002\b\u001E\u00A2\u0006\u0002\b\u001F2\b\b\u0002\u0010\"\u001A\u00020!2\b\b\u0002\u0010#\u001A\u00020\u00152\u0015\b\u0002\u0010%\u001A\u000F\u0012\u0004\u0012\u00020\u001D\u0018\u00010$\u00A2\u0006\u0002\b\u001E2\u0019\b\u0002\u0010&\u001A\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001D0\u0005\u00A2\u0006\u0002\b\u001E2\u0015\b\u0002\u0010\'\u001A\u000F\u0012\u0004\u0012\u00020\u001D\u0018\u00010$\u00A2\u0006\u0002\b\u001E2\b\b\u0002\u0010)\u001A\u00020(2\b\b\u0002\u0010*\u001A\u00020\u00062\b\b\u0002\u0010,\u001A\u00020+2\b\b\u0002\u0010.\u001A\u00020-2\b\b\u0002\u00100\u001A\u00020/2\b\b\u0002\u00101\u001A\u00020/2\b\b\u0002\u00102\u001A\u00020-2 \b\u0002\u0010:\u001A\u001A\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u001D\u0018\u00010\u0005\u00A2\u0006\u0002\b\u001E\u00A2\u0006\u0002\b\u001F2\b\b\u0002\u0010;\u001A\u00020\u00062\b\b\u0002\u0010<\u001A\u00020+2\b\b\u0002\u0010=\u001A\u00020-2\b\b\u0002\u0010>\u001A\u00020/2\b\b\u0002\u0010?\u001A\u00020/2\b\b\u0002\u0010@\u001A\u00020/2\b\b\u0002\u00103\u001A\u00020/2\b\b\u0002\u00104\u001A\u00020/2\u0017\u00106\u001A\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u001D0\u0005\u00A2\u0006\u0002\b\u001EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bA\u0010B\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006C"}, d2 = {"Landroidx/compose/material/BottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/BottomSheetState;", "BottomSheetScaffoldState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material/BottomSheetState;", "Landroidx/compose/ui/unit/Density;", "density", "confirmValueChange", "BottomSheetState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material/BottomSheetState;", "rememberBottomSheetState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "bottomSheetState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "Landroidx/compose/material/DrawerState;", "drawerState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;)Landroidx/compose/material/BottomSheetScaffoldState;", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "topBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "sheetGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "sheetPeekHeight", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "BottomSheetScaffold-HnlDQGw", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffold", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "BottomSheetScaffold-bGncdBI", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,812:1\n74#2:813\n74#2:836\n74#2:843\n25#3:814\n50#3:821\n49#3:822\n25#3:829\n25#3:849\n1116#4,6:815\n1116#4,6:823\n1116#4,6:830\n1116#4,6:837\n1116#4,3:850\n1119#4,3:856\n1116#4,6:860\n1116#4,6:866\n1#5:844\n487#6,4:845\n491#6,2:853\n495#6:859\n487#7:855\n154#8:872\n154#8:873\n154#8:874\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n*L\n307#1:813\n455#1:836\n460#1:843\n348#1:814\n350#1:821\n350#1:822\n388#1:829\n613#1:849\n348#1:815,6\n350#1:823,6\n388#1:830,6\n456#1:837,6\n613#1:850,3\n613#1:856,3\n621#1:860,6\n688#1:866,6\n613#1:845,4\n613#1:853,2\n613#1:859\n613#1:855\n806#1:872\n807#1:873\n808#1:874\n*E\n"})
public final class BottomSheetScaffoldKt {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        BottomSheetScaffoldKt.a = 16.0f;
        BottomSheetScaffoldKt.b = 56.0f;
        BottomSheetScaffoldKt.c = 125.0f;
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_]]")
    public static final void BottomSheetScaffold-HnlDQGw(@NotNull Function3 function30, @Nullable Modifier modifier0, @Nullable BottomSheetScaffoldState bottomSheetScaffoldState0, @Nullable Function2 function20, @Nullable Function3 function31, @Nullable Function2 function21, int v, boolean z, @Nullable Shape shape0, float f, long v1, long v2, float f1, long v3, long v4, @NotNull Function3 function32, @Nullable Composer composer0, int v5, int v6, int v7) {
        long v19;
        float f3;
        Shape shape1;
        boolean z2;
        BottomSheetScaffoldState bottomSheetScaffoldState2;
        Modifier modifier2;
        long v18;
        long v17;
        float f2;
        long v16;
        int v15;
        Function2 function23;
        Function3 function33;
        Function2 function22;
        long v29;
        long v26;
        float f5;
        int v25;
        int v24;
        long v23;
        float f4;
        long v22;
        long v21;
        Shape shape2;
        int v20;
        Function2 function25;
        Function3 function34;
        Function2 function24;
        long v28;
        int v27;
        float f7;
        boolean z1;
        int v9;
        BottomSheetScaffoldState bottomSheetScaffoldState1;
        Modifier modifier1;
        int v8;
        Composer composer1 = composer0.startRestartGroup(0xE6C7ADF0);
        if((v7 & 1) == 0) {
            v8 = (v5 & 14) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v5 : v5;
        }
        else {
            v8 = v5 | 6;
        }
        if((v7 & 2) != 0) {
            v8 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v5 & 0x70) == 0) {
            modifier1 = modifier0;
            v8 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v5 & 0x380) == 0) {
            if((v7 & 4) == 0) {
                bottomSheetScaffoldState1 = bottomSheetScaffoldState0;
                v9 = composer1.changed(bottomSheetScaffoldState1) ? 0x100 : 0x80;
            }
            else {
                bottomSheetScaffoldState1 = bottomSheetScaffoldState0;
                v9 = 0x80;
            }
            v8 |= v9;
        }
        else {
            bottomSheetScaffoldState1 = bottomSheetScaffoldState0;
        }
        int v10 = 0x400;
        if((v7 & 8) != 0) {
            v8 |= 0xC00;
        }
        else if((v5 & 0x1C00) == 0) {
            v8 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        int v11 = 0x2000;
        if((v7 & 16) != 0) {
            v8 |= 0x6000;
        }
        else if((v5 & 0xE000) == 0) {
            v8 |= (composer1.changedInstance(function31) ? 0x4000 : 0x2000);
        }
        int v12 = 0x20000;
        if((v7 & 0x20) != 0) {
            v8 |= 0x30000;
        }
        else if((v5 & 0x70000) == 0) {
            v8 |= (composer1.changedInstance(function21) ? 0x20000 : 0x10000);
        }
        if((v7 & 0x40) != 0) {
            v8 |= 0x180000;
        }
        else if((v5 & 0x380000) == 0) {
            v8 |= (composer1.changed(v) ? 0x100000 : 0x80000);
        }
        if((v7 & 0x80) == 0) {
            z1 = z;
            if((v5 & 0x1C00000) == 0) {
                v8 |= (composer1.changed(z1) ? 0x800000 : 0x400000);
            }
        }
        else {
            v8 |= 0xC00000;
            z1 = z;
        }
        if((v5 & 0xE000000) == 0) {
            v8 |= ((v7 & 0x100) != 0 || !composer1.changed(shape0) ? 0x2000000 : 0x4000000);
        }
        if((v7 & 0x200) != 0) {
            v8 |= 0x30000000;
        }
        else if((v5 & 0x70000000) == 0) {
            v8 |= (composer1.changed(f) ? 0x20000000 : 0x10000000);
        }
        int v13 = (v6 & 14) == 0 ? v6 | ((v7 & 0x400) != 0 || !composer1.changed(v1) ? 2 : 4) : v6;
        if((v6 & 0x70) == 0) {
            v13 |= ((v7 & 0x800) != 0 || !composer1.changed(v2) ? 16 : 0x20);
        }
        int v14 = v13;
        if((v7 & 0x1000) != 0) {
            v14 |= 0x180;
        }
        else if((v6 & 0x380) == 0) {
            v14 |= (composer1.changed(f1) ? 0x100 : 0x80);
        }
        if((v6 & 0x1C00) == 0) {
            if((v7 & 0x2000) == 0 && composer1.changed(v3)) {
                v10 = 0x800;
            }
            v14 |= v10;
        }
        if((v6 & 0xE000) == 0) {
            if((v7 & 0x4000) == 0 && composer1.changed(v4)) {
                v11 = 0x4000;
            }
            v14 |= v11;
        }
        if((0x8000 & v7) != 0) {
            v14 |= 0x30000;
        }
        else if((v6 & 0x70000) == 0) {
            if(!composer1.changedInstance(function32)) {
                v12 = 0x10000;
            }
            v14 |= v12;
        }
        if((v8 & 0x5B6DB6DB) != 306783378 || (0x5B6DB & v14) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v5 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v7 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v7 & 4) != 0) {
                    v8 &= -897;
                    bottomSheetScaffoldState1 = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, composer1, 0, 3);
                }
                function34 = (v7 & 16) == 0 ? function31 : ComposableSingletons.BottomSheetScaffoldKt.INSTANCE.getLambda-1$material_release();
                function25 = (v7 & 0x20) == 0 ? function21 : null;
                v20 = (v7 & 0x40) == 0 ? v : 2;
                if((v7 & 0x80) != 0) {
                    z1 = true;
                }
                if((v7 & 0x100) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getLarge();
                    v8 &= 0xF1FFFFFF;
                }
                if((v7 & 0x400) == 0) {
                    v21 = v1;
                }
                else {
                    v14 &= -15;
                    v21 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                }
                if((v7 & 0x800) == 0) {
                    v22 = v2;
                }
                else {
                    v22 = ColorsKt.contentColorFor-ek8zF_U(v21, composer1, v14 & 14);
                    v14 &= 0xFFFFFF8F;
                }
                float f6 = (v7 & 0x1000) == 0 ? f1 : 56.0f;
                if((v7 & 0x2000) == 0) {
                    f7 = f6;
                    v27 = v14;
                    v28 = v3;
                }
                else {
                    f7 = f6;
                    v27 = v14 & 0xFFFFE3FF;
                    v28 = MaterialTheme.INSTANCE.getColors(composer1, 6).getBackground-0d7_KjU();
                }
                if((v7 & 0x4000) == 0) {
                    v23 = v4;
                }
                else {
                    v23 = ColorsKt.contentColorFor-ek8zF_U(v28, composer1, v27 >> 9 & 14);
                    v27 &= 0xFFFF1FFF;
                }
                v24 = v27;
                v25 = v8;
                function24 = (v7 & 8) == 0 ? function20 : null;
                v26 = v28;
                f5 = (v7 & 0x200) == 0 ? f : 8.0f;
                f4 = f7;
            }
            else {
                composer1.skipToGroupEnd();
                if((v7 & 4) != 0) {
                    v8 &= -897;
                }
                if((v7 & 0x100) != 0) {
                    v8 &= 0xF1FFFFFF;
                }
                if((v7 & 0x400) != 0) {
                    v14 &= -15;
                }
                if((v7 & 0x800) != 0) {
                    v14 &= 0xFFFFFF8F;
                }
                if((v7 & 0x2000) != 0) {
                    v14 &= 0xFFFFE3FF;
                }
                if((v7 & 0x4000) != 0) {
                    v14 &= 0xFFFF1FFF;
                }
                function24 = function20;
                function34 = function31;
                function25 = function21;
                v20 = v;
                shape2 = shape0;
                v21 = v1;
                v22 = v2;
                f4 = f1;
                v23 = v4;
                v24 = v14;
                v25 = v8;
                f5 = f;
                v26 = v3;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                v29 = v26;
                ComposerKt.traceEventStart(0xE6C7ADF0, v25, v24, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:452)");
            }
            else {
                v29 = v26;
            }
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            composer1.startReplaceableGroup(1938007797);
            boolean z3 = composer1.changed(bottomSheetScaffoldState1);
            boolean z4 = composer1.changed(density0);
            t1 t10 = composer1.rememberedValue();
            if(z3 || z4 || t10 == Composer.Companion.getEmpty()) {
                t10 = new t1(22, bottomSheetScaffoldState1, density0);
                composer1.updateRememberedValue(t10);
            }
            composer1.endReplaceableGroup();
            EffectsKt.SideEffect(t10, composer1, 0);
            float f8 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f4);
            SurfaceKt.Surface-F-jzlyU(SizeKt.fillMaxSize$default(modifier1, 0.0f, 1, null), null, v29, v23, null, 0.0f, ComposableLambdaKt.composableLambda(composer1, 0xF82FA134, true, new v1(bottomSheetScaffoldState1, function24, function32, function25, f4, v20, z1, f8, shape2, f5, v21, v22, function30, function34)), composer1, v24 >> 3 & 0x1C00 | (v24 >> 3 & 0x380 | 0x180000), 50);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = function24;
            f2 = f4;
            function33 = function34;
            bottomSheetScaffoldState2 = bottomSheetScaffoldState1;
            function23 = function25;
            v16 = v22;
            v18 = v23;
            f3 = f5;
            modifier2 = modifier1;
            shape1 = shape2;
            z2 = z1;
            v19 = v21;
            v15 = v20;
            v17 = v29;
        }
        else {
            composer1.skipToGroupEnd();
            function22 = function20;
            function33 = function31;
            function23 = function21;
            v15 = v;
            v16 = v2;
            f2 = f1;
            v17 = v3;
            v18 = v4;
            modifier2 = modifier1;
            bottomSheetScaffoldState2 = bottomSheetScaffoldState1;
            z2 = z1;
            shape1 = shape0;
            f3 = f;
            v19 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w1(function30, modifier2, bottomSheetScaffoldState2, function22, function33, function23, v15, z2, shape1, f3, v19, v16, f2, v17, v18, function32, v5, v6, v7));
        }
    }

    @ExperimentalMaterialApi
    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "BottomSheetScaffold with a drawer has been deprecated. To achieve the same functionality, wrap your BottomSheetScaffold in aModalDrawer. See BottomSheetScaffoldWithDrawerSample for more details.")
    public static final void BottomSheetScaffold-bGncdBI(@NotNull Function3 function30, @Nullable Modifier modifier0, @Nullable BottomSheetScaffoldState bottomSheetScaffoldState0, @Nullable Function2 function20, @Nullable Function3 function31, @Nullable Function2 function21, int v, boolean z, @Nullable Shape shape0, float f, long v1, long v2, float f1, @Nullable Function3 function32, boolean z1, @Nullable Shape shape1, float f2, long v3, long v4, long v5, long v6, long v7, @NotNull Function3 function33, @Nullable Composer composer0, int v8, int v9, int v10, int v11) {
        int v15;
        long v18;
        long v17;
        int v16;
        int v13;
        long v12;
        Composer composer1 = composer0.startRestartGroup(0x2C45AE3);
        if((v9 & 14) == 0) {
            v12 = v1;
            v13 = v9 | ((v11 & 0x400) != 0 || !composer1.changed(v12) ? 2 : 4);
        }
        else {
            v12 = v1;
            v13 = v9;
        }
        if((v9 & 0x1C00000) == 0) {
            v13 |= ((v11 & 0x20000) != 0 || !composer1.changed(v3) ? 0x400000 : 0x800000);
        }
        int v14 = (v10 & 14) == 0 ? v10 | ((v11 & 0x100000) != 0 || !composer1.changed(v6) ? 2 : 4) : v10;
        if((v8 & 1) == 0 && (v13 & 0x140000B) == 0x400002 && (v14 & 11) == 2 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new x1(function30, modifier0, bottomSheetScaffoldState0, function20, function31, function21, v, z, shape0, f, v1, v2, f1, function32, z1, shape1, f2, v3, v4, v5, v6, v7, function33, v8, v9, v10, v11));
            }
            return;
        }
        composer1.startDefaults();
        if((v8 & 1) == 0 || composer1.getDefaultsInvalid()) {
            if((v11 & 4) == 0) {
                v16 = v8;
            }
            else {
                BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, composer1, 0, 3);
                v16 = v8 & -897;
            }
            if((v11 & 0x100) != 0) {
                MaterialTheme.INSTANCE.getShapes(composer1, 6).getLarge();
                v16 &= 0xF1FFFFFF;
            }
            if((v11 & 0x400) != 0) {
                v12 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                v13 &= -15;
            }
            if((v11 & 0x800) != 0) {
                ColorsKt.contentColorFor-ek8zF_U(v12, composer1, v13 & 14);
                v13 &= 0xFFFFFF8F;
            }
            if((v11 & 0x8000) != 0) {
                MaterialTheme.INSTANCE.getShapes(composer1, 6).getLarge();
                v13 &= 0xFFF8FFFF;
            }
            if((v11 & 0x20000) == 0) {
                v17 = v3;
            }
            else {
                v17 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                v13 &= 0xFE3FFFFF;
            }
            if((v11 & 0x40000) != 0) {
                ColorsKt.contentColorFor-ek8zF_U(v17, composer1, v13 >> 21 & 14);
                v13 &= 0xF1FFFFFF;
            }
            if((0x80000 & v11) != 0) {
                DrawerDefaults.INSTANCE.getScrimColor(composer1, 6);
                v13 &= 0x8FFFFFFF;
            }
            if((0x100000 & v11) == 0) {
                v18 = v6;
            }
            else {
                v18 = MaterialTheme.INSTANCE.getColors(composer1, 6).getBackground-0d7_KjU();
                v14 &= -15;
            }
            if((0x200000 & v11) != 0) {
                ColorsKt.contentColorFor-ek8zF_U(v18, composer1, v14 & 14);
            }
            v15 = v16;
        }
        else {
            composer1.skipToGroupEnd();
            v15 = (4 & v11) == 0 ? v8 : v8 & -897;
            if((v11 & 0x100) != 0) {
                v15 &= 0xF1FFFFFF;
            }
            if((v11 & 0x400) != 0) {
                v13 &= -15;
            }
            if((v11 & 0x800) != 0) {
                v13 &= 0xFFFFFF8F;
            }
            if((v11 & 0x8000) != 0) {
                v13 &= 0xFFF8FFFF;
            }
            if((0x20000 & v11) != 0) {
                v13 &= 0xFE3FFFFF;
            }
            if((0x40000 & v11) != 0) {
                v13 &= 0xF1FFFFFF;
            }
            if((0x80000 & v11) != 0) {
                v13 &= 0x8FFFFFFF;
            }
        }
        composer1.endDefaults();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2C45AE3, v15, v13, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:595)");
        }
        throw new IllegalStateException("BottomSheetScaffold with a drawer has been deprecated. To achieve the same functionality, wrap your BottomSheetScaffold in aModalDrawer. See BottomSheetScaffoldWithDrawerSample for more details.");
    }

    @ExperimentalMaterialApi
    @Deprecated(level = DeprecationLevel.ERROR, message = "BottomSheetScaffold with a drawer has been deprecated. To achieve the same functionality, wrap your BottomSheetScaffold in aModalDrawer. See BottomSheetScaffoldWithDrawerSample for more details.")
    @NotNull
    public static final BottomSheetScaffoldState BottomSheetScaffoldState(@NotNull DrawerState drawerState0, @NotNull BottomSheetState bottomSheetState0, @NotNull SnackbarHostState snackbarHostState0) {
        throw new IllegalStateException("BottomSheetScaffold with a drawer has been deprecated. To achieve the same functionality, wrap your BottomSheetScaffold in aModalDrawer. See BottomSheetScaffoldWithDrawerSample for more details.");
    }

    @ExperimentalMaterialApi
    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "BottomSheetScaffoldState(initialValue, animationSpec, confirmStateChange)", imports = {}))
    @NotNull
    public static final BottomSheetState BottomSheetScaffoldState(@NotNull BottomSheetValue bottomSheetValue0, @NotNull AnimationSpec animationSpec0, @NotNull Function1 function10) {
        return new BottomSheetState(bottomSheetValue0, animationSpec0, function10);
    }

    public static BottomSheetState BottomSheetScaffoldState$default(BottomSheetValue bottomSheetValue0, AnimationSpec animationSpec0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            animationSpec0 = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        return BottomSheetScaffoldKt.BottomSheetScaffoldState(bottomSheetValue0, animationSpec0, function10);
    }

    @ExperimentalMaterialApi
    @Stable
    @NotNull
    public static final BottomSheetState BottomSheetState(@NotNull BottomSheetValue bottomSheetValue0, @NotNull Density density0, @NotNull AnimationSpec animationSpec0, @NotNull Function1 function10) {
        BottomSheetState bottomSheetState0 = new BottomSheetState(bottomSheetValue0, animationSpec0, function10);
        bottomSheetState0.setDensity$material_release(density0);
        return bottomSheetState0;
    }

    public static BottomSheetState BottomSheetState$default(BottomSheetValue bottomSheetValue0, Density density0, AnimationSpec animationSpec0, Function1 function10, int v, Object object0) {
        if((v & 4) != 0) {
            animationSpec0 = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if((v & 8) != 0) {
            function10 = r.B;
        }
        return BottomSheetScaffoldKt.BottomSheetState(bottomSheetValue0, density0, animationSpec0, function10);
    }

    public static final void access$BottomSheet-0cLKjW4(BottomSheetState bottomSheetState0, boolean z, Function1 function10, Shape shape0, float f, long v, long v1, Modifier modifier0, Function3 function30, Composer composer0, int v2, int v3) {
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(1407045933);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(bottomSheetState0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(shape0) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v4 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.changed(v) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((0x380000 & v2) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((0xE000000 & v2) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x4000000 : 0x2000000);
        }
        if((0xB6DB6DB & v4) != 0x2492492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 0x80) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1407045933, v4, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:611)");
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = q.h(0x2E20B340, composer1, 0xE2A708A4);
            Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            composer1.endReplaceableGroup();
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            composer1.endReplaceableGroup();
            Modifier modifier3 = AnchoredDraggableKt.anchoredDraggable$default(modifier2, bottomSheetState0.getAnchoredDraggableState$material_release(), Orientation.Vertical, z, false, null, false, 56, null);
            composer1.startReplaceableGroup(1938016202);
            boolean z1 = composer1.changedInstance(function10);
            boolean z2 = composer1.changed(bottomSheetState0);
            b2 b20 = composer1.rememberedValue();
            if(z1 || z2 || b20 == composer$Companion0.getEmpty()) {
                b20 = new b2(10, function10, bottomSheetState0);
                composer1.updateRememberedValue(b20);
            }
            composer1.endReplaceableGroup();
            SurfaceKt.Surface-F-jzlyU(SemanticsModifierKt.semantics$default(OnRemeasuredModifierKt.onSizeChanged(modifier3, b20), false, new b2(11, bottomSheetState0, coroutineScope0), 1, null), shape0, v, v1, null, f, ComposableLambdaKt.composableLambda(composer1, 0x73EE4169, true, new r1(function30)), composer1, v4 >> 6 & 0x70 | 0x180000 | v4 >> 9 & 0x380 | v4 >> 9 & 0x1C00 | v4 << 3 & 0x70000, 16);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s1(bottomSheetState0, z, function10, shape0, f, v, v1, modifier1, function30, v2, v3));
        }
    }

    public static final void access$BottomSheetScaffoldLayout-KCBPh4w(Function2 function20, Function3 function30, Function3 function31, Function2 function21, Function2 function22, float f, int v, Function0 function00, BottomSheetState bottomSheetState0, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x60A97DCB);
        int v2 = (v1 & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function31) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        if((0xE000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v1) == 0) {
            v2 |= (composer1.changed(f) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v1) == 0) {
            v2 |= (composer1.changed(v) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x800000 : 0x400000);
        }
        if((0xE000000 & v1) == 0) {
            v2 |= (composer1.changed(bottomSheetState0) ? 0x4000000 : 0x2000000);
        }
        if((0xB6DB6DB & v2) != 0x2492492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x60A97DCB, v2, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:686)");
            }
            composer1.startReplaceableGroup(1938018646);
            boolean z = composer1.changedInstance(function31);
            boolean z1 = composer1.changedInstance(function20);
            boolean z2 = composer1.changedInstance(function30);
            boolean z3 = composer1.changed(f);
            boolean z4 = composer1.changedInstance(function21);
            boolean z5 = composer1.changedInstance(function22);
            boolean z6 = composer1.changedInstance(function00);
            boolean z7 = composer1.changed(v);
            boolean z8 = composer1.changed(bottomSheetState0);
            o5 o50 = composer1.rememberedValue();
            if((z | z1 | z2 | z3 | z4 | z5 | z6 | z7 | z8) != 0 || o50 == Composer.Companion.getEmpty()) {
                o5 o51 = new o5(function20, function21, function22, function31, function30, f, function00, v, bottomSheetState0);
                composer1.updateRememberedValue(o51);
                o50 = o51;
            }
            composer1.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, o50, composer1, 0, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y1(function20, function30, function31, function21, function22, f, v, function00, bottomSheetState0, v1));
        }
    }

    public static final NestedScrollConnection access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState anchoredDraggableState0, Orientation orientation0) {
        return new BottomSheetScaffoldKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1(anchoredDraggableState0, orientation0);
    }

    public static final float access$getBottomSheetScaffoldPositionalThreshold$p() [...] // 潜在的解密器

    public static final float access$getBottomSheetScaffoldVelocityThreshold$p() [...] // 潜在的解密器

    public static final float access$getFabSpacing$p() [...] // 潜在的解密器

    @ExperimentalMaterialApi
    @Composable
    @NotNull
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable BottomSheetState bottomSheetState0, @Nullable SnackbarHostState snackbarHostState0, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(-1022285988);
        if((v1 & 1) != 0) {
            bottomSheetState0 = BottomSheetScaffoldKt.rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer0, 6, 6);
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
            ComposerKt.traceEventStart(-1022285988, v, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:348)");
        }
        composer0.startReplaceableGroup(0x1E7B2B64);
        boolean z = composer0.changed(bottomSheetState0);
        boolean z1 = composer0.changed(snackbarHostState0);
        BottomSheetScaffoldState bottomSheetScaffoldState0 = composer0.rememberedValue();
        if(z || z1 || bottomSheetScaffoldState0 == Composer.Companion.getEmpty()) {
            bottomSheetScaffoldState0 = new BottomSheetScaffoldState(bottomSheetState0, snackbarHostState0);
            composer0.updateRememberedValue(bottomSheetScaffoldState0);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return bottomSheetScaffoldState0;
    }

    @ExperimentalMaterialApi
    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "BottomSheetScaffold with a drawer has been deprecated. To achieve the same functionality, wrap your BottomSheetScaffold in aModalDrawer. See BottomSheetScaffoldWithDrawerSample for more details.")
    @NotNull
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable DrawerState drawerState0, @Nullable BottomSheetState bottomSheetState0, @Nullable SnackbarHostState snackbarHostState0, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0xAF5AB5B0);
        if((v1 & 1) != 0) {
            DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer0, 6, 2);
        }
        if((v1 & 2) != 0) {
            BottomSheetScaffoldKt.rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer0, 6, 6);
        }
        if((v1 & 4) != 0) {
            composer0.startReplaceableGroup(0xE2A708A4);
            if(composer0.rememberedValue() == Composer.Companion.getEmpty()) {
                composer0.updateRememberedValue(new SnackbarHostState());
            }
            composer0.endReplaceableGroup();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAF5AB5B0, v, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:388)");
        }
        throw new IllegalStateException("BottomSheetScaffold with a drawer has been deprecated. To achieve the same functionality, wrap your BottomSheetScaffold in aModalDrawer. See BottomSheetScaffoldWithDrawerSample for more details.");
    }

    @ExperimentalMaterialApi
    @Composable
    @NotNull
    public static final BottomSheetState rememberBottomSheetState(@NotNull BottomSheetValue bottomSheetValue0, @Nullable AnimationSpec animationSpec0, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x6BC63B00);
        AnimationSpec animationSpec1 = (v1 & 2) == 0 ? animationSpec0 : AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        Function1 function11 = (v1 & 4) == 0 ? function10 : p0.b2.w;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6BC63B00, v, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:305)");
        }
        Object object0 = composer0.consume(CompositionLocalsKt.getLocalDensity());
        Saver saver0 = BottomSheetState.Companion.Saver(animationSpec1, function11, ((Density)object0));
        g0 g00 = new g0(7, bottomSheetValue0, ((Density)object0), animationSpec1, function11);
        BottomSheetState bottomSheetState0 = (BottomSheetState)RememberSaveableKt.rememberSaveable(new Object[]{animationSpec1}, saver0, null, g00, composer0, 72, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return bottomSheetState0;
    }
}

