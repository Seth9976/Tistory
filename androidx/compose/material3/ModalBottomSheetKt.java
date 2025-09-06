package androidx.compose.material3;

import aa.o;
import aa.r;
import androidx.activity.g0;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u00C4\u0001\u0010\u001C\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u00072\b\b\u0002\u0010\u000F\u001A\u00020\u000B2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0013\u001A\r\u0012\u0004\u0012\u00020\u00120\u0000\u00A2\u0006\u0002\b\u00102\b\b\u0002\u0010\u0015\u001A\u00020\u00142\u001C\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016\u00A2\u0006\u0002\b\u0010\u00A2\u0006\u0002\b\u0018H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001A\u00F3\u0001\u0010+\u001A\u00020\u0001*\u00020\u001D2\u0012\u0010!\u001A\u000E\u0012\u0004\u0012\u00020\u001F\u0012\u0004\u0012\u00020 0\u001E2\u0006\u0010#\u001A\u00020\"2\f\u0010$\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002!\u0010(\u001A\u001D\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u00072\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0013\u001A\r\u0012\u0004\u0012\u00020\u00120\u0000\u00A2\u0006\u0002\b\u00102\u001C\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016\u00A2\u0006\u0002\b\u0010\u00A2\u0006\u0002\b\u0018H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010*\u001A/\u00100\u001A\u00020\u00052\b\b\u0002\u0010-\u001A\u00020,2\u0014\b\u0002\u0010/\u001A\u000E\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020,0\u0016H\u0007\u00A2\u0006\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00063\u00B2\u0006\f\u00102\u001A\u00020\u001F8\nX\u008A\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/ui/unit/Dp;", "sheetMaxWidth", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "tonalElevation", "scrimColor", "Landroidx/compose/runtime/Composable;", "dragHandle", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Landroidx/compose/material3/ModalBottomSheetProperties;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "ModalBottomSheet-dYc4hso", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ModalBottomSheet", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "predictiveBackProgress", "Lkotlinx/coroutines/CoroutineScope;", "scope", "animateToDismiss", "Lkotlin/ParameterName;", "name", "velocity", "settleToDismiss", "ModalBottomSheetContent-IQkwcL4", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ModalBottomSheetContent", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "rememberModalBottomSheetState", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,445:1\n148#2:446\n148#2:544\n148#2:545\n488#3:447\n487#3,4:448\n491#3,2:455\n495#3:461\n1223#4,3:452\n1226#4,3:458\n1223#4,6:462\n1223#4,6:468\n1223#4,6:474\n1223#4,6:480\n1223#4,6:486\n1223#4,6:493\n1223#4,6:499\n1223#4,6:505\n1223#4,6:511\n1223#4,6:517\n1223#4,6:525\n1223#4,6:531\n1223#4,6:537\n487#5:457\n177#6:492\n240#6:524\n696#7:523\n81#8:543\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt\n*L\n127#1:446\n442#1:544\n443#1:545\n134#1:447\n134#1:448,4\n134#1:455,2\n134#1:461\n134#1:452,3\n134#1:458,3\n135#1:462,6\n146#1:468,6\n152#1:474,6\n156#1:480,6\n194#1:486,6\n225#1:493,6\n233#1:499,6\n268#1:505,6\n270#1:511,6\n274#1:517,6\n415#1:525,6\n416#1:531,6\n427#1:537,6\n134#1:457\n216#1:492\n412#1:524\n409#1:523\n411#1:543\n*E\n"})
public final class ModalBottomSheetKt {
    public static final float a;
    public static final float b;
    public static final long c;

    static {
        ModalBottomSheetKt.a = 48.0f;
        ModalBottomSheetKt.b = 24.0f;
        ModalBottomSheetKt.c = 0x3F00000000000000L;
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ModalBottomSheet-dYc4hso(@NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable SheetState sheetState0, float f, @Nullable Shape shape0, long v, long v1, float f1, long v2, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable ModalBottomSheetProperties modalBottomSheetProperties0, @NotNull Function3 function30, @Nullable Composer composer0, int v3, int v4, int v5) {
        long v13;
        float f3;
        long v12;
        ModalBottomSheetProperties modalBottomSheetProperties1;
        Function2 function23;
        Function2 function22;
        long v11;
        Shape shape1;
        float f2;
        Modifier modifier1;
        float f9;
        long v17;
        float f5;
        int v16;
        int v15;
        ModalBottomSheetProperties modalBottomSheetProperties2;
        Function2 function24;
        float f4;
        long v14;
        Shape shape2;
        Modifier modifier2;
        Function2 function26;
        long v18;
        float f8;
        Shape shape4;
        Shape shape3;
        Modifier modifier4;
        SheetState sheetState2;
        long v8;
        int v7;
        SheetState sheetState1;
        int v6;
        Composer composer1 = composer0.startRestartGroup(0x7F1EB8B9);
        if((v5 & 1) == 0) {
            v6 = (v3 & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v3 : v3;
        }
        else {
            v6 = v3 | 6;
        }
        if((v5 & 2) != 0) {
            v6 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v6 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            if((v5 & 4) == 0) {
                sheetState1 = sheetState0;
                v7 = composer1.changed(sheetState1) ? 0x100 : 0x80;
            }
            else {
                sheetState1 = sheetState0;
                v7 = 0x80;
            }
            v6 |= v7;
        }
        else {
            sheetState1 = sheetState0;
        }
        if((v5 & 8) != 0) {
            v6 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v6 |= (composer1.changed(f) ? 0x800 : 0x400);
        }
        if((v3 & 0x6000) == 0) {
            v6 |= ((v5 & 16) != 0 || !composer1.changed(shape0) ? 0x2000 : 0x4000);
        }
        if((v3 & 0x30000) == 0) {
            v6 |= ((v5 & 0x20) != 0 || !composer1.changed(v) ? 0x10000 : 0x20000);
        }
        if((v3 & 0x180000) == 0) {
            v8 = v1;
            v6 |= ((v5 & 0x40) != 0 || !composer1.changed(v8) ? 0x80000 : 0x100000);
        }
        else {
            v8 = v1;
        }
        if((v5 & 0x80) != 0) {
            v6 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v6 |= (composer1.changed(f1) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v3) == 0) {
            v6 |= ((v5 & 0x100) != 0 || !composer1.changed(v2) ? 0x2000000 : 0x4000000);
        }
        if((v5 & 0x200) != 0) {
            v6 |= 0x30000000;
        }
        else if((0x30000000 & v3) == 0) {
            v6 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        int v9 = (v4 & 6) == 0 ? v4 | ((v5 & 0x400) != 0 || !composer1.changedInstance(function21) ? 2 : 4) : v4;
        if((v5 & 0x800) != 0) {
            v9 |= 0x30;
        }
        else if((v4 & 0x30) == 0) {
            v9 |= (composer1.changed(modalBottomSheetProperties0) ? 0x20 : 16);
        }
        int v10 = v9;
        if((v5 & 0x1000) != 0) {
            v10 |= 0x180;
        }
        else if((v4 & 0x180) == 0) {
            v10 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v6 & 306783379) != 306783378 || (v10 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v5 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v5 & 4) == 0) {
                    sheetState2 = sheetState1;
                }
                else {
                    sheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composer1, 0, 3);
                    v6 &= -897;
                }
                float f6 = (v5 & 8) == 0 ? f : 0.0f;
                if((v5 & 16) == 0) {
                    modifier4 = modifier3;
                    shape3 = shape0;
                }
                else {
                    modifier4 = modifier3;
                    shape3 = BottomSheetDefaults.INSTANCE.getExpandedShape(composer1, 6);
                    v6 &= 0xFFFF1FFF;
                }
                if((v5 & 0x20) == 0) {
                    shape4 = shape3;
                    v14 = v;
                }
                else {
                    v6 &= 0xFFF8FFFF;
                    shape4 = shape3;
                    v14 = BottomSheetDefaults.INSTANCE.getContainerColor(composer1, 6);
                }
                if((v5 & 0x40) != 0) {
                    v8 = ColorSchemeKt.contentColorFor-ek8zF_U(v14, composer1, v6 >> 15 & 14);
                    v6 &= 0xFFC7FFFF;
                }
                float f7 = (v5 & 0x80) == 0 ? f1 : 0.0f;
                if((v5 & 0x100) == 0) {
                    f8 = f7;
                    v18 = v2;
                }
                else {
                    f8 = f7;
                    v18 = BottomSheetDefaults.INSTANCE.getScrimColor(composer1, 6);
                    v6 &= 0xF1FFFFFF;
                }
                Function2 function25 = (v5 & 0x200) == 0 ? function20 : ComposableSingletons.ModalBottomSheetKt.INSTANCE.getLambda-1$material3_release();
                if((v5 & 0x400) == 0) {
                    function26 = function21;
                }
                else {
                    function26 = kd.w;
                    v10 &= -15;
                }
                if((v5 & 0x800) == 0) {
                    f4 = f8;
                    modalBottomSheetProperties2 = modalBottomSheetProperties0;
                    function22 = function25;
                    v15 = v6;
                    function24 = function26;
                    v16 = v10;
                    f5 = f6;
                    v17 = v18;
                    modifier2 = modifier4;
                    sheetState1 = sheetState2;
                    shape2 = shape4;
                }
                else {
                    function22 = function25;
                    v15 = v6;
                    function24 = function26;
                    modalBottomSheetProperties2 = ModalBottomSheetDefaults.INSTANCE.getProperties();
                    v16 = v10;
                    f5 = f6;
                    v17 = v18;
                    modifier2 = modifier4;
                    sheetState1 = sheetState2;
                    shape2 = shape4;
                    f4 = f8;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v5 & 4) != 0) {
                    v6 &= -897;
                }
                if((v5 & 16) != 0) {
                    v6 &= 0xFFFF1FFF;
                }
                if((v5 & 0x20) != 0) {
                    v6 &= 0xFFF8FFFF;
                }
                if((v5 & 0x40) != 0) {
                    v6 &= 0xFFC7FFFF;
                }
                if((v5 & 0x100) != 0) {
                    v6 &= 0xF1FFFFFF;
                }
                if((v5 & 0x400) != 0) {
                    v10 &= -15;
                }
                modifier2 = modifier0;
                shape2 = shape0;
                v14 = v;
                f4 = f1;
                function22 = function20;
                function24 = function21;
                modalBottomSheetProperties2 = modalBottomSheetProperties0;
                v15 = v6;
                v16 = v10;
                f5 = f;
                v17 = v2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                f9 = f4;
                ComposerKt.traceEventStart(0x7F1EB8B9, v15, v16, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:132)");
            }
            else {
                f9 = f4;
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            int v19 = v15 & 0x380 ^ 0x180;
            boolean z = v19 > 0x100 && composer1.changed(sheetState1) || (v15 & 0x180) == 0x100;
            boolean z1 = composer1.changedInstance(coroutineScope0);
            td td0 = composer1.rememberedValue();
            if((((v15 & 14) == 4 ? 1 : 0) | (z | z1)) != 0 || td0 == composer$Companion0.getEmpty()) {
                td0 = new td(sheetState1, coroutineScope0, 0, function00);
                composer1.updateRememberedValue(td0);
            }
            boolean z2 = composer1.changedInstance(coroutineScope0);
            boolean z3 = v19 > 0x100 && composer1.changed(sheetState1) || (v15 & 0x180) == 0x100;
            r r0 = composer1.rememberedValue();
            if((z2 | z3 | ((v15 & 14) == 4 ? 1 : 0)) != 0 || r0 == composer$Companion0.getEmpty()) {
                r0 = new r(coroutineScope0, sheetState1, 3, function00);
                composer1.updateRememberedValue(r0);
            }
            Animatable animatable0 = composer1.rememberedValue();
            if(animatable0 == composer$Companion0.getEmpty()) {
                animatable0 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer1.updateRememberedValue(animatable0);
            }
            boolean z4 = v19 > 0x100 && composer1.changed(sheetState1) || (v15 & 0x180) == 0x100;
            boolean z5 = composer1.changedInstance(coroutineScope0);
            boolean z6 = composer1.changedInstance(animatable0);
            g0 g00 = composer1.rememberedValue();
            if((z4 | z5 | z6 | ((v15 & 14) == 4 ? 1 : 0)) != 0 || g00 == composer$Companion0.getEmpty()) {
                g00 = new g0(2, sheetState1, coroutineScope0, animatable0, function00);
                composer1.updateRememberedValue(g00);
            }
            ModalBottomSheet_androidKt.ModalBottomSheetDialog(g00, modalBottomSheetProperties2, animatable0, ComposableLambdaKt.rememberComposableLambda(-314673510, true, new od(v17, td0, sheetState1, animatable0, coroutineScope0, r0, modifier2, f5, shape2, v14, v8, f9, function22, function24, function30), composer1, 54), composer1, v16 & 0x70 | 0xC00 | Animatable.$stable << 6);
            if(sheetState1.getHasExpandedState()) {
                boolean z7 = v19 > 0x100 && composer1.changed(sheetState1) || (v15 & 0x180) == 0x100;
                pd pd0 = composer1.rememberedValue();
                if(z7 || pd0 == composer$Companion0.getEmpty()) {
                    pd0 = new pd(sheetState1, null);
                    composer1.updateRememberedValue(pd0);
                }
                EffectsKt.LaunchedEffect(sheetState1, pd0, composer1, v15 >> 6 & 14);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f9;
            v12 = v8;
            shape1 = shape2;
            v13 = v17;
            function23 = function24;
            modalBottomSheetProperties1 = modalBottomSheetProperties2;
            v11 = v14;
            f2 = f5;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            f2 = f;
            shape1 = shape0;
            v11 = v;
            function22 = function20;
            function23 = function21;
            modalBottomSheetProperties1 = modalBottomSheetProperties0;
            v12 = v8;
            f3 = f1;
            v13 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new qd(function00, modifier1, sheetState1, f2, shape1, v11, v12, f3, v13, function22, function23, modalBottomSheetProperties1, function30, v3, v4, v5, 0));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ModalBottomSheetContent-IQkwcL4(@NotNull BoxScope boxScope0, @NotNull Animatable animatable0, @NotNull CoroutineScope coroutineScope0, @NotNull Function0 function00, @NotNull Function1 function10, @Nullable Modifier modifier0, @Nullable SheetState sheetState0, float f, @Nullable Shape shape0, long v, long v1, float f1, @Nullable Function2 function20, @Nullable Function2 function21, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3, int v4) {
        long v12;
        Function2 function24;
        Function2 function23;
        float f3;
        long v11;
        float f2;
        SheetState sheetState1;
        Modifier modifier1;
        boolean z1;
        float f9;
        float f8;
        float f5;
        long v16;
        Modifier modifier2;
        Function2 function26;
        int v15;
        int v14;
        Function2 function25;
        long v13;
        float f4;
        SheetState sheetState2;
        long v18;
        float f7;
        int v17;
        SheetState sheetState3;
        Function2 function22;
        int v9;
        int v8;
        Shape shape1;
        int v6;
        Composer composer1 = composer0.startRestartGroup(0x9C0B9CED);
        int v5 = 4;
        if((v4 & 0x80000000) == 0) {
            v6 = (v2 & 6) == 0 ? v2 | (composer1.changed(boxScope0) ? 4 : 2) : v2;
        }
        else {
            v6 = v2 | 6;
        }
        if((v4 & 1) != 0) {
            v6 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v6 |= (((v2 & 0x40) == 0 ? composer1.changed(animatable0) : composer1.changedInstance(animatable0)) ? 0x20 : 16);
        }
        int v7 = v6;
        if((v4 & 2) != 0) {
            v7 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v7 |= (composer1.changedInstance(coroutineScope0) ? 0x100 : 0x80);
        }
        if((v4 & 4) != 0) {
            v7 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v7 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v4 & 8) != 0) {
            v7 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v7 |= (composer1.changedInstance(function10) ? 0x4000 : 0x2000);
        }
        if((v4 & 16) != 0) {
            v7 |= 0x30000;
        }
        else if((0x30000 & v2) == 0) {
            v7 |= (composer1.changed(modifier0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x180000) == 0) {
            v7 |= ((v4 & 0x20) != 0 || !composer1.changed(sheetState0) ? 0x80000 : 0x100000);
        }
        if((v4 & 0x40) != 0) {
            v7 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v7 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x6000000) == 0) {
            if((v4 & 0x80) == 0) {
                shape1 = shape0;
                v8 = composer1.changed(shape1) ? 0x4000000 : 0x2000000;
            }
            else {
                shape1 = shape0;
                v8 = 0x2000000;
            }
            v7 |= v8;
        }
        else {
            shape1 = shape0;
        }
        if((v2 & 0x30000000) == 0) {
            v7 |= ((v4 & 0x100) != 0 || !composer1.changed(v) ? 0x10000000 : 0x20000000);
        }
        if((v3 & 6) == 0) {
            if((v4 & 0x200) != 0 || !composer1.changed(v1)) {
                v5 = 2;
            }
            v9 = v3 | v5;
        }
        else {
            v9 = v3;
        }
        if((v4 & 0x400) != 0) {
            v9 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v9 |= (composer1.changed(f1) ? 0x20 : 16);
        }
        if((v4 & 0x800) != 0) {
            v9 |= 0x180;
            function22 = function20;
        }
        else if((v3 & 0x180) == 0) {
            function22 = function20;
            v9 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        else {
            function22 = function20;
        }
        if((v3 & 0xC00) == 0) {
            v9 |= ((v4 & 0x1000) != 0 || !composer1.changedInstance(function21) ? 0x400 : 0x800);
        }
        int v10 = 0x2000;
        if((v4 & 0x2000) != 0) {
            v9 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            if(composer1.changedInstance(function30)) {
                v10 = 0x4000;
            }
            v9 |= v10;
        }
        if((306783379 & v7) != 306783378 || (v9 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v4 & 16) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 0x20) == 0) {
                    sheetState3 = sheetState0;
                }
                else {
                    sheetState3 = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composer1, 0, 3);
                    v7 &= 0xFFC7FFFF;
                }
                float f6 = (v4 & 0x40) == 0 ? f : 0.0f;
                if((0x80 & v4) != 0) {
                    v7 &= 0xF1FFFFFF;
                    shape1 = BottomSheetDefaults.INSTANCE.getExpandedShape(composer1, 6);
                }
                if((0x100 & v4) == 0) {
                    f7 = f6;
                    v17 = v7;
                    v16 = v;
                }
                else {
                    v17 = 0x8FFFFFFF & v7;
                    f7 = f6;
                    v16 = BottomSheetDefaults.INSTANCE.getContainerColor(composer1, 6);
                }
                if((v4 & 0x200) == 0) {
                    v18 = v1;
                }
                else {
                    v18 = ColorSchemeKt.contentColorFor-ek8zF_U(v16, composer1, v17 >> 27 & 14);
                    v9 &= -15;
                }
                if((v4 & 0x800) != 0) {
                    function22 = ComposableSingletons.ModalBottomSheetKt.INSTANCE.getLambda-2$material3_release();
                }
                if((v4 & 0x1000) == 0) {
                    f4 = f7;
                    function25 = function21;
                    v14 = v9;
                    v15 = v17;
                    v13 = v18;
                    modifier2 = modifier3;
                }
                else {
                    v14 = v9 & 0xFFFFE3FF;
                    function25 = vd.w;
                    v15 = v17;
                    v13 = v18;
                    modifier2 = modifier3;
                    f4 = f7;
                }
                f5 = (v4 & 0x400) == 0 ? f1 : 0.0f;
                sheetState2 = sheetState3;
                function26 = function22;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 0x20) != 0) {
                    v7 &= 0xFFC7FFFF;
                }
                if((0x80 & v4) != 0) {
                    v7 &= 0xF1FFFFFF;
                }
                if((0x100 & v4) != 0) {
                    v7 &= 0x8FFFFFFF;
                }
                if((v4 & 0x200) != 0) {
                    v9 &= -15;
                }
                if((v4 & 0x1000) != 0) {
                    v9 &= 0xFFFFE3FF;
                }
                sheetState2 = sheetState0;
                f4 = f;
                v13 = v1;
                function25 = function21;
                v14 = v9;
                v15 = v7;
                function26 = function22;
                modifier2 = modifier0;
                v16 = v;
                f5 = f1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                f8 = f5;
                ComposerKt.traceEventStart(0x9C0B9CED, v15, v14, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:214)");
            }
            else {
                f8 = f5;
            }
            String s = Strings_androidKt.getString-2EP1pXo(string.m3c_bottom_sheet_pane_title, composer1, 0);
            v11 = v13;
            Modifier modifier4 = SizeKt.fillMaxWidth$default(SizeKt.widthIn-VpY3zN4$default(boxScope0.align(modifier2, Alignment.Companion.getTopCenter()), 0.0f, f4, 1, null), 0.0f, 1, null);
            int v19 = 0x380000 & v15 ^ 0x180000;
            boolean z = v19 > 0x100000 && composer1.changed(sheetState2) || (v15 & 0x180000) == 0x100000;
            NestedScrollConnection nestedScrollConnection0 = composer1.rememberedValue();
            if(z || nestedScrollConnection0 == Composer.Companion.getEmpty()) {
                nestedScrollConnection0 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState2, Orientation.Vertical, function10);
                composer1.updateRememberedValue(nestedScrollConnection0);
            }
            Modifier modifier5 = NestedScrollModifierKt.nestedScroll$default(modifier4, nestedScrollConnection0, null, 2, null);
            AnchoredDraggableState anchoredDraggableState0 = sheetState2.getAnchoredDraggableState$material3_release();
            Orientation orientation0 = Orientation.Vertical;
            if(v19 > 0x100000 && composer1.changed(sheetState2)) {
                f9 = f4;
                z1 = true;
            }
            else {
                f9 = f4;
                z1 = (v15 & 0x180000) == 0x100000;
            }
            b1 b10 = composer1.rememberedValue();
            if(z1 || b10 == Composer.Companion.getEmpty()) {
                b10 = new b1(sheetState2, 3);
                composer1.updateRememberedValue(b10);
            }
            Modifier modifier6 = AnchoredDraggableKt.draggableAnchors(modifier5, anchoredDraggableState0, orientation0, b10);
            DraggableState draggableState0 = sheetState2.getAnchoredDraggableState$material3_release().getDraggableState$material3_release();
            boolean z2 = sheetState2.isVisible();
            boolean z3 = sheetState2.getAnchoredDraggableState$material3_release().isAnimationRunning();
            xd xd0 = composer1.rememberedValue();
            if((0xE000 & v15) == 0x4000 || xd0 == Composer.Companion.getEmpty()) {
                xd0 = new xd(0, function10, null);
                composer1.updateRememberedValue(xd0);
            }
            Modifier modifier7 = DraggableKt.draggable$default(modifier6, draggableState0, orientation0, z2, null, z3, null, xd0, false, 0xA8, null);
            boolean z4 = composer1.changed(s);
            m m0 = composer1.rememberedValue();
            if(z4 || m0 == Composer.Companion.getEmpty()) {
                m0 = new m(s, 3);
                composer1.updateRememberedValue(m0);
            }
            int v20 = 0;
            Modifier modifier8 = SemanticsModifierKt.semantics$default(modifier7, false, m0, 1, null);
            int v21 = (v19 <= 0x100000 || !composer1.changed(sheetState2)) && (v15 & 0x180000) != 0x100000 ? 0 : 1;
            if((v15 & 0x70) == 0x20 || (v15 & 0x40) != 0 && composer1.changedInstance(animatable0)) {
                v20 = 1;
            }
            o o0 = composer1.rememberedValue();
            if((v21 | v20) != 0 || o0 == Composer.Companion.getEmpty()) {
                o0 = new o(7, sheetState2, animatable0);
                composer1.updateRememberedValue(o0);
            }
            SurfaceKt.Surface-T9BRK9s(GraphicsLayerModifierKt.graphicsLayer(modifier8, o0), shape1, v16, v11, f8, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(0xD6B6B608, true, new be(function25, animatable0, function26, sheetState2, function00, coroutineScope0, function30), composer1, 54), composer1, v15 >> 21 & 0x380 | (v15 >> 21 & 0x70 | 0xC00000) | v14 << 9 & 0x1C00 | v14 << 9 & 0xE000, 0x60);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f8;
            modifier1 = modifier2;
            sheetState1 = sheetState2;
            v12 = v16;
            function24 = function26;
            function23 = function25;
            f2 = f9;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            sheetState1 = sheetState0;
            f2 = f;
            v11 = v1;
            f3 = f1;
            function23 = function21;
            function24 = function22;
            v12 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ce(boxScope0, animatable0, coroutineScope0, function00, function10, modifier1, sheetState1, f2, shape1, v12, v11, f3, function24, function23, function30, v2, v3, v4));
        }
    }

    public static final void access$Scrim-3J-VO9M(long v, Function0 function00, boolean z, Composer composer0, int v1) {
        Modifier modifier1;
        Composer composer1 = composer0.startRestartGroup(0x38BC6405);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x38BC6405, v2, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)");
            }
            if(v != 16L) {
                State state0 = AnimateAsStateKt.animateFloatAsState((z ? 1.0f : 0.0f), new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composer1, 0x30, 28);
                String s = Strings_androidKt.getString-2EP1pXo(androidx.compose.ui.R.string.close_sheet, composer1, 0);
                composer1.startReplaceGroup(0x959115B2);
                boolean z1 = true;
                if(z) {
                    androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                    fe fe0 = composer1.rememberedValue();
                    if((v2 & 0x70) == 0x20 || fe0 == Composer.Companion.getEmpty()) {
                        fe0 = new fe(function00, null);
                        composer1.updateRememberedValue(fe0);
                    }
                    Modifier modifier0 = SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, function00, fe0);
                    boolean z2 = composer1.changed(s);
                    ge ge0 = composer1.rememberedValue();
                    if((v2 & 0x70) == 0x20 || z2 || ge0 == Composer.Companion.getEmpty()) {
                        ge0 = new ge(s, function00, 0);
                        composer1.updateRememberedValue(ge0);
                    }
                    modifier1 = SemanticsModifierKt.semantics(modifier0, true, ge0);
                }
                else {
                    modifier1 = Modifier.Companion;
                }
                composer1.endReplaceGroup();
                Modifier modifier2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier1);
                if((v2 & 14) != 4) {
                    z1 = false;
                }
                boolean z3 = composer1.changed(state0);
                de de0 = composer1.rememberedValue();
                if(z3 || z1 || de0 == Composer.Companion.getEmpty()) {
                    de0 = new de(v, state0, 0);
                    composer1.updateRememberedValue(de0);
                }
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
            scopeUpdateScope0.updateScope(new ee(v, function00, z, v1, 0));
        }
    }

    public static final float access$Scrim_3J_VO9M$lambda$10(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope0, float f) {
        float f1 = Size.getWidth-impl(graphicsLayerScope0.getSize-NH-jbRc());
        return Float.isNaN(f1) || f1 == 0.0f ? 1.0f : 1.0f - MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope0.toPx-0680j_4(ModalBottomSheetKt.a), f1), f) / f1;
    }

    public static final float access$calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope0, float f) {
        float f1 = Size.getHeight-impl(graphicsLayerScope0.getSize-NH-jbRc());
        return Float.isNaN(f1) || f1 == 0.0f ? 1.0f : 1.0f - MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope0.toPx-0680j_4(ModalBottomSheetKt.b), f1), f) / f1;
    }

    public static final long access$getPredictiveBackChildTransformOrigin$p() [...] // 潜在的解密器

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public static final SheetState rememberModalBottomSheetState(boolean z, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            z = false;
        }
        if((v1 & 2) != 0) {
            function10 = he.w;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778250030, v, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)");
        }
        SheetState sheetState0 = SheetDefaultsKt.rememberSheetState(z, function10, SheetValue.Hidden, false, composer0, v & 14 | 0x180 | v & 0x70, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetState0;
    }
}

