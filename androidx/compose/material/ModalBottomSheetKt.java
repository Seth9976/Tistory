package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.de;
import androidx.compose.material3.ee;
import androidx.compose.material3.ge;
import androidx.compose.material3.y3;
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
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.room.a;
import j0.t1;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.q5;
import p0.r3;
import p0.r5;
import p0.r;
import p0.s5;
import p0.t5;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001AO\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\f\u0010\r\u001AG\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\f\u0010\u000E\u001AG\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000F\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001AC\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000F\u001A\u00020\b2\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0013\u001A;\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0014\u001A\u0093\u0001\u0010*\u001A\u00020\u00162\u001C\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0007\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u00182\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u000B2\b\b\u0002\u0010\u001D\u001A\u00020\b2\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 2\b\b\u0002\u0010#\u001A\u00020\"2\b\b\u0002\u0010$\u001A\u00020\"2\b\b\u0002\u0010%\u001A\u00020\"2\u0011\u0010\'\u001A\r\u0012\u0004\u0012\u00020\u00160&\u00A2\u0006\u0002\b\u0017H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006,\u00B2\u0006\f\u0010+\u001A\u00020\u00058\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "initialValue", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "isSkipHalfExpanded", "Landroidx/compose/material/ModalBottomSheetState;", "ModalBottomSheetState", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/material/ModalBottomSheetState;", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/material/ModalBottomSheetState;", "skipHalfExpanded", "rememberModalBottomSheetState", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "confirmStateChange", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "sheetState", "sheetGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "scrimColor", "Lkotlin/Function0;", "content", "ModalBottomSheetLayout-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalBottomSheetLayout", "alpha", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,817:1\n74#2:818\n74#2:819\n487#3,4:820\n491#3,2:828\n495#3:834\n25#4:824\n1116#5,3:825\n1119#5,3:831\n1116#5,6:836\n1116#5,6:842\n1116#5,6:848\n487#6:830\n646#7:835\n81#8:854\n154#9:855\n154#9:856\n154#9:857\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n*L\n434#1:818\n567#1:819\n571#1:820,4\n571#1:828,2\n571#1:834\n571#1:824\n571#1:825,3\n571#1:831,3\n722#1:836,6\n723#1:842,6\n735#1:848,6\n571#1:830\n714#1:835\n715#1:854\n814#1:855\n815#1:856\n816#1:857\n*E\n"})
public final class ModalBottomSheetKt {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        ModalBottomSheetKt.a = 56.0f;
        ModalBottomSheetKt.b = 125.0f;
        ModalBottomSheetKt.c = 640.0f;
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ModalBottomSheetLayout-Gs3lGvM(@NotNull Function3 function30, @Nullable Modifier modifier0, @Nullable ModalBottomSheetState modalBottomSheetState0, boolean z, @Nullable Shape shape0, float f, long v, long v1, long v2, @NotNull Function2 function20, @Nullable Composer composer0, int v3, int v4) {
        long v8;
        float f1;
        Shape shape1;
        boolean z2;
        long v7;
        Modifier modifier1;
        long v6;
        ModalBottomSheetState modalBottomSheetState1;
        long v10;
        ModalBottomSheetState modalBottomSheetState2;
        Shape shape2;
        Modifier modifier2;
        int v9;
        float f2;
        boolean z1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xFA7562D0);
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
        if((v4 & 8) == 0) {
            z1 = z;
            if((v3 & 0x1C00) == 0) {
                v5 |= (composer1.changed(z1) ? 0x800 : 0x400);
            }
        }
        else {
            v5 |= 0xC00;
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
                    v9 = v5;
                    modalBottomSheetState2 = modalBottomSheetState0;
                }
                else {
                    modalBottomSheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, false, composer1, 6, 14);
                    v9 = v5 & -897;
                }
                if((v4 & 8) != 0) {
                    z1 = true;
                }
                if((v4 & 16) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getLarge();
                    v9 &= 0xFFFF1FFF;
                }
                f2 = (v4 & 0x20) == 0 ? f : 16.0f;
                if((v4 & 0x40) == 0) {
                    v10 = v;
                }
                else {
                    v10 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                    v9 &= 0xFFC7FFFF;
                }
                if((v4 & 0x80) == 0) {
                    v8 = v1;
                }
                else {
                    v8 = ColorsKt.contentColorFor-ek8zF_U(v10, composer1, v9 >> 18 & 14);
                    v9 &= 0xFE3FFFFF;
                }
                if((v4 & 0x100) == 0) {
                    v7 = v2;
                }
                else {
                    v9 &= 0xF1FFFFFF;
                    v7 = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composer1, 6);
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
                f2 = f;
                v9 = v5;
                modifier2 = modifier0;
                v7 = v2;
                shape2 = shape0;
                modalBottomSheetState2 = modalBottomSheetState0;
                v10 = v;
                v8 = v1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFA7562D0, v9, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:564)");
            }
            EffectsKt.SideEffect(new t1(27, modalBottomSheetState2, ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity()))), composer1, 0);
            composer1.startReplaceableGroup(0x2E20B340);
            composer1.startReplaceableGroup(0xE2A708A4);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer1, 0x98C467BA, true, new q5(z1, modalBottomSheetState2, Orientation.Vertical, shape2, v10, v8, f2, function20, v7, compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), function30)), composer1, v9 >> 3 & 14 | 0xC00, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            v6 = v10;
            z2 = z1;
            f1 = f2;
            shape1 = shape2;
            modalBottomSheetState1 = modalBottomSheetState2;
        }
        else {
            composer1.skipToGroupEnd();
            modalBottomSheetState1 = modalBottomSheetState0;
            v6 = v;
            modifier1 = modifier0;
            v7 = v2;
            z2 = z1;
            shape1 = shape0;
            f1 = f;
            v8 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r3(function30, modifier1, modalBottomSheetState1, z2, shape1, f1, v6, v8, v7, function20, v3, v4, 2));
        }
    }

    @ExperimentalMaterialApi
    @Deprecated(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @ReplaceWith(expression = "\n            ModalBottomSheetState(\n                initialValue = initialValue,\n                density =,\n                animationSpec = animationSpec,\n                isSkipHalfExpanded = isSkipHalfExpanded,\n                confirmStateChange = confirmValueChange\n            )\n            ", imports = {}))
    @NotNull
    public static final ModalBottomSheetState ModalBottomSheetState(@NotNull ModalBottomSheetValue modalBottomSheetValue0, @NotNull AnimationSpec animationSpec0, @NotNull Function1 function10, boolean z) {
        return new ModalBottomSheetState(modalBottomSheetValue0, animationSpec0, z, function10);
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState ModalBottomSheetState(@NotNull ModalBottomSheetValue modalBottomSheetValue0, @NotNull Density density0, @NotNull AnimationSpec animationSpec0, @NotNull Function1 function10, boolean z) {
        ModalBottomSheetState modalBottomSheetState0 = new ModalBottomSheetState(modalBottomSheetValue0, animationSpec0, z, function10);
        modalBottomSheetState0.setDensity$material_release(density0);
        return modalBottomSheetState0;
    }

    public static ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue0, AnimationSpec animationSpec0, Function1 function10, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            animationSpec0 = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if((v & 4) != 0) {
            function10 = r.J;
        }
        if((v & 8) != 0) {
            z = false;
        }
        return ModalBottomSheetKt.ModalBottomSheetState(modalBottomSheetValue0, animationSpec0, function10, z);
    }

    public static ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue0, Density density0, AnimationSpec animationSpec0, Function1 function10, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            animationSpec0 = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if((v & 8) != 0) {
            function10 = r.I;
        }
        if((v & 16) != 0) {
            z = false;
        }
        return ModalBottomSheetKt.ModalBottomSheetState(modalBottomSheetValue0, density0, animationSpec0, function10, z);
    }

    public static final NestedScrollConnection access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState anchoredDraggableState0, Orientation orientation0) {
        return new ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1(anchoredDraggableState0, orientation0);
    }

    public static final void access$Scrim-3J-VO9M(long v, Function0 function00, boolean z, Composer composer0, int v1) {
        Modifier modifier1;
        Composer composer1 = composer0.startRestartGroup(0xE09DBFC4);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE09DBFC4, v2, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:712)");
            }
            if(v != 0L) {
                State state0 = AnimateAsStateKt.animateFloatAsState((z ? 1.0f : 0.0f), new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composer1, 0x30, 28);
                String s = Strings_androidKt.getString-4foXLRw(2, composer1, 6);
                if(z) {
                    Companion modifier$Companion0 = Modifier.Companion;
                    composer1.startReplaceableGroup(0xAE00D029);
                    boolean z1 = composer1.changedInstance(function00);
                    r5 r50 = composer1.rememberedValue();
                    if(z1 || r50 == Composer.Companion.getEmpty()) {
                        r50 = new r5(function00, null);
                        composer1.updateRememberedValue(r50);
                    }
                    composer1.endReplaceableGroup();
                    Modifier modifier0 = SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, function00, r50);
                    composer1.startReplaceableGroup(0xAE00D083);
                    boolean z2 = composer1.changed(s);
                    boolean z3 = composer1.changedInstance(function00);
                    ge ge0 = composer1.rememberedValue();
                    if(z2 || z3 || ge0 == Composer.Companion.getEmpty()) {
                        ge0 = new ge(s, function00, 5);
                        composer1.updateRememberedValue(ge0);
                    }
                    composer1.endReplaceableGroup();
                    modifier1 = SemanticsModifierKt.semantics(modifier0, true, ge0);
                }
                else {
                    modifier1 = Modifier.Companion;
                }
                Modifier modifier2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier1);
                composer1.startReplaceableGroup(0xAE00D1A3);
                boolean z4 = composer1.changed(v);
                boolean z5 = composer1.changed(state0);
                de de0 = composer1.rememberedValue();
                if(z4 || z5 || de0 == Composer.Companion.getEmpty()) {
                    de0 = new de(v, state0, 3);
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
            scopeUpdateScope0.updateScope(new ee(v, function00, z, v1, 3));
        }
    }

    public static final float access$Scrim_3J_VO9M$lambda$1(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$getMaxModalBottomSheetWidth$p() [...] // 潜在的解密器

    public static final float access$getModalBottomSheetPositionalThreshold$p() [...] // 潜在的解密器

    public static final float access$getModalBottomSheetVelocityThreshold$p() [...] // 潜在的解密器

    public static final Modifier access$modalBottomSheetAnchors(Modifier modifier0, ModalBottomSheetState modalBottomSheetState0, float f) {
        return OnRemeasuredModifierKt.onSizeChanged(modifier0, new y3(modalBottomSheetState0, f, 4));
    }

    @ExperimentalMaterialApi
    @Composable
    @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmValueChange = confirmStateChange)", imports = {}))
    @NotNull
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull ModalBottomSheetValue modalBottomSheetValue0, @Nullable AnimationSpec animationSpec0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x8D0C5E84);
        if((v1 & 2) != 0) {
            animationSpec0 = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8D0C5E84, v, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:514)");
        }
        ModalBottomSheetState modalBottomSheetState0 = ModalBottomSheetKt.rememberModalBottomSheetState(modalBottomSheetValue0, animationSpec0, function10, false, composer0, v & 14 | 0xC40 | v & 0x380, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return modalBottomSheetState0;
    }

    @ExperimentalMaterialApi
    @Composable
    @NotNull
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull ModalBottomSheetValue modalBottomSheetValue0, @Nullable AnimationSpec animationSpec0, @Nullable Function1 function10, boolean z, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(-126412120);
        AnimationSpec animationSpec1 = (v1 & 2) == 0 ? animationSpec0 : AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        Function1 function11 = (v1 & 4) == 0 ? function10 : s5.w;
        boolean z1 = (v1 & 8) == 0 ? z : false;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, v, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:432)");
        }
        Object object0 = composer0.consume(CompositionLocalsKt.getLocalDensity());
        composer0.startMovableGroup(170051256, modalBottomSheetValue0);
        Saver saver0 = ModalBottomSheetState.Companion.Saver(animationSpec1, function11, z1, ((Density)object0));
        t5 t50 = new t5(modalBottomSheetValue0, ((Density)object0), animationSpec1, function11, z1);
        ModalBottomSheetState modalBottomSheetState0 = (ModalBottomSheetState)RememberSaveableKt.rememberSaveable(new Object[]{modalBottomSheetValue0, animationSpec1, Boolean.valueOf(z1), function11, ((Density)object0)}, saver0, null, t50, composer0, 72, 4);
        composer0.endMovableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return modalBottomSheetState0;
    }

    @ExperimentalMaterialApi
    @Composable
    @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    @NotNull
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull ModalBottomSheetValue modalBottomSheetValue0, @Nullable AnimationSpec animationSpec0, boolean z, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0xE79AC0A8);
        if((v1 & 2) != 0) {
            animationSpec0 = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE79AC0A8, v, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:486)");
        }
        ModalBottomSheetState modalBottomSheetState0 = ModalBottomSheetKt.rememberModalBottomSheetState(modalBottomSheetValue0, animationSpec0, function10, z, composer0, v & 14 | 0x40 | v >> 3 & 0x380 | v << 3 & 0x1C00, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return modalBottomSheetState0;
    }
}

