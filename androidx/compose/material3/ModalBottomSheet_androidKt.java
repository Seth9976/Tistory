package androidx.compose.material3;

import aa.g;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import androidx.activity.g0;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.room.a;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A¹\u0001\u0010\u001C\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u00072\b\b\u0002\u0010\u000F\u001A\u00020\u000B2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0015\u001A\u00020\u00142\u001C\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001B\u001AL\u0010!\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0015\u001A\u00020\u00142\u0012\u0010 \u001A\u000E\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u001F0\u001D2\u0011\u0010\u0019\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0004\b!\u0010\"\u001A\u0013\u0010%\u001A\u00020$*\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006(²\u0006\u0017\u0010\'\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00108\nX\u008A\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/ui/unit/Dp;", "sheetMaxWidth", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "tonalElevation", "scrimColor", "Landroidx/compose/runtime/Composable;", "dragHandle", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/material3/ModalBottomSheetProperties;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "ModalBottomSheet-dYc4hso", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ModalBottomSheet", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "predictiveBackProgress", "ModalBottomSheetDialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ModalBottomSheetProperties;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/View;", "", "isFlagSecureEnabled", "(Landroid/view/View;)Z", "currentContent", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,640:1\n148#2:641\n77#3:642\n77#3:643\n77#3:644\n488#4:645\n487#4,4:646\n491#4,2:653\n495#4:659\n1223#5,3:650\n1226#5,3:656\n1223#5,6:660\n1223#5,6:666\n1223#5,6:672\n487#6:655\n81#7:678\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n*L\n241#1:641\n274#1:642\n275#1:643\n276#1:644\n280#1:645\n280#1:646,4\n280#1:653,2\n280#1:659\n280#1:650,3\n280#1:656,3\n283#1:660,6\n306#1:666,6\n315#1:672,6\n280#1:655\n278#1:678\n*E\n"})
public final class ModalBottomSheet_androidKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[SecureFlagPolicy.values().length];
            try {
                arr_v[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SecureFlagPolicy.Inherit.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use constructor with contentWindowInsets parameter.", replaceWith = @ReplaceWith(expression = "ModalBottomSheet(onDismissRequest,modifier,sheetState,sheetMaxWidth,shape,containerColor,contentColor,tonalElevation,scrimColor,dragHandle,{ windowInsets },properties,content,)", imports = {}))
    public static final void ModalBottomSheet-dYc4hso(Function0 function00, Modifier modifier0, SheetState sheetState0, float f, Shape shape0, long v, long v1, float f1, long v2, Function2 function20, WindowInsets windowInsets0, ModalBottomSheetProperties modalBottomSheetProperties0, Function3 function30, Composer composer0, int v3, int v4, int v5) {
        long v12;
        float f3;
        long v11;
        SheetState sheetState1;
        Modifier modifier2;
        ModalBottomSheetProperties modalBottomSheetProperties1;
        WindowInsets windowInsets1;
        Function2 function21;
        long v10;
        Shape shape1;
        float f2;
        Function2 function24;
        Function2 function22;
        long v16;
        float f5;
        SheetState sheetState2;
        int v15;
        int v14;
        ModalBottomSheetProperties modalBottomSheetProperties2;
        WindowInsets windowInsets2;
        long v13;
        float f4;
        Shape shape2;
        WindowInsets windowInsets3;
        int v20;
        int v19;
        long v18;
        float f7;
        int v17;
        Modifier modifier4;
        long v7;
        Modifier modifier1;
        int v6;
        Composer composer1 = composer0.startRestartGroup(0x385187DE);
        if((v5 & 1) == 0) {
            v6 = (v3 & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v3 : v3;
        }
        else {
            v6 = v3 | 6;
        }
        if((v5 & 2) != 0) {
            v6 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v3 & 0x30) == 0) {
            modifier1 = modifier0;
            v6 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 0x180) == 0) {
            v6 |= ((v5 & 4) != 0 || !composer1.changed(sheetState0) ? 0x80 : 0x100);
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
            v7 = v1;
            v6 |= ((v5 & 0x40) != 0 || !composer1.changed(v7) ? 0x80000 : 0x100000);
        }
        else {
            v7 = v1;
        }
        if((v5 & 0x80) != 0) {
            v6 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v6 |= (composer1.changed(f1) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x6000000) == 0) {
            v6 |= ((v5 & 0x100) != 0 || !composer1.changed(v2) ? 0x2000000 : 0x4000000);
        }
        if((v5 & 0x200) != 0) {
            v6 |= 0x30000000;
        }
        else if((0x30000000 & v3) == 0) {
            v6 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        int v8 = (v4 & 6) == 0 ? v4 | ((v5 & 0x400) != 0 || !composer1.changed(windowInsets0) ? 2 : 4) : v4;
        if((v5 & 0x800) != 0) {
            v8 |= 0x30;
        }
        else if((v4 & 0x30) == 0) {
            v8 |= (composer1.changed(modalBottomSheetProperties0) ? 0x20 : 16);
        }
        int v9 = v8;
        if((v5 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v4 & 0x180) == 0) {
            v9 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((306783379 & v6) != 306783378 || (v9 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v5 & 2) == 0 ? modifier1 : Modifier.Companion;
                if((v5 & 4) == 0) {
                    sheetState2 = sheetState0;
                }
                else {
                    sheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composer1, 0, 3);
                    v6 &= -897;
                }
                f5 = (v5 & 8) == 0 ? f : 0.0f;
                if((v5 & 16) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape(composer1, 6);
                    v6 &= 0xFFFF1FFF;
                }
                if((v5 & 0x20) == 0) {
                    modifier4 = modifier3;
                    v17 = v6;
                    v16 = v;
                }
                else {
                    modifier4 = modifier3;
                    v17 = v6 & 0xFFF8FFFF;
                    v16 = BottomSheetDefaults.INSTANCE.getContainerColor(composer1, 6);
                }
                if((v5 & 0x40) != 0) {
                    v7 = ColorSchemeKt.contentColorFor-ek8zF_U(v16, composer1, v17 >> 15 & 14);
                    v17 &= 0xFFC7FFFF;
                }
                float f6 = (v5 & 0x80) == 0 ? f1 : 0.0f;
                if((v5 & 0x100) == 0) {
                    f7 = f6;
                    v18 = v2;
                    v19 = v17;
                }
                else {
                    f7 = f6;
                    v18 = BottomSheetDefaults.INSTANCE.getScrimColor(composer1, 6);
                    v19 = v17 & 0xF1FFFFFF;
                }
                Function2 function23 = (v5 & 0x200) == 0 ? function20 : ComposableSingletons.ModalBottomSheet_androidKt.INSTANCE.getLambda-1$material3_release();
                if((v5 & 0x400) == 0) {
                    v20 = v19;
                    windowInsets3 = windowInsets0;
                }
                else {
                    v20 = v19;
                    windowInsets3 = BottomSheetDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    v9 &= -15;
                }
                if((v5 & 0x800) == 0) {
                    v15 = v20;
                    modalBottomSheetProperties2 = modalBottomSheetProperties0;
                    windowInsets2 = windowInsets3;
                }
                else {
                    v15 = v20;
                    windowInsets2 = windowInsets3;
                    modalBottomSheetProperties2 = ModalBottomSheetDefaults.INSTANCE.getProperties();
                }
                v14 = v9;
                modifier1 = modifier4;
                f4 = f7;
                function22 = function23;
                v13 = v18;
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
                    v9 &= -15;
                }
                shape2 = shape0;
                f4 = f1;
                v13 = v2;
                windowInsets2 = windowInsets0;
                modalBottomSheetProperties2 = modalBottomSheetProperties0;
                v14 = v9;
                v15 = v6;
                sheetState2 = sheetState0;
                f5 = f;
                v16 = v;
                function22 = function20;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                function24 = function22;
                ComposerKt.traceEventStart(0x385187DE, v15, v14, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:247)");
            }
            else {
                function24 = function22;
            }
            ModalBottomSheetKt.ModalBottomSheet-dYc4hso(function00, modifier1, sheetState2, f5, shape2, v16, v7, f4, v13, function24, new b1(windowInsets2, 4), modalBottomSheetProperties2, function30, composer1, v15 & 0x7FFFFFFE, v14 & 0x3F0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = f5;
            windowInsets1 = windowInsets2;
            modalBottomSheetProperties1 = modalBottomSheetProperties2;
            function21 = function24;
            f3 = f4;
            sheetState1 = sheetState2;
            v10 = v16;
            shape1 = shape2;
            modifier2 = modifier1;
            v11 = v7;
            v12 = v13;
        }
        else {
            composer1.skipToGroupEnd();
            f2 = f;
            shape1 = shape0;
            v10 = v;
            function21 = function20;
            windowInsets1 = windowInsets0;
            modalBottomSheetProperties1 = modalBottomSheetProperties0;
            modifier2 = modifier1;
            sheetState1 = sheetState0;
            v11 = v7;
            f3 = f1;
            v12 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new qd(function00, modifier2, sheetState1, f2, shape1, v10, v11, f3, v12, function21, windowInsets1, modalBottomSheetProperties1, function30, v3, v4, v5, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ModalBottomSheetDialog(@NotNull Function0 function00, @NotNull ModalBottomSheetProperties modalBottomSheetProperties0, @NotNull Animatable animatable0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x4ACD0B82);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(modalBottomSheetProperties0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (((v & 0x200) == 0 ? composer1.changed(animatable0) : composer1.changedInstance(animatable0)) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4ACD0B82, v1, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:272)");
            }
            View view0 = (View)composer1.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            Object object1 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext compositionContext0 = ComposablesKt.rememberCompositionContext(composer1, 0);
            State state0 = SnapshotStateKt.rememberUpdatedState(function20, composer1, v1 >> 9 & 14);
            Object object2 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, m4.K, composer1, 0xC00, 6);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            boolean z = DarkThemeKt.isSystemInDarkTheme(composer1, 0);
            boolean z1 = composer1.changed(view0);
            boolean z2 = composer1.changed(((Density)object0));
            jd jd0 = composer1.rememberedValue();
            if(z1 || z2 || jd0 == composer$Companion0.getEmpty()) {
                v2 = 1;
                jd jd1 = new jd(function00, modalBottomSheetProperties0, view0, ((LayoutDirection)object1), ((Density)object0), ((UUID)object2), animatable0, coroutineScope0, z);
                ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(-1560960657, true, new ie(state0));
                jd1.g.setParentCompositionContext(compositionContext0);
                jd1.g.J.setValue(composableLambda0);
                jd1.g.L = true;
                jd1.g.createComposition();
                composer1.updateRememberedValue(jd1);
                jd0 = jd1;
            }
            else {
                v2 = 1;
            }
            boolean z3 = composer1.changedInstance(jd0);
            id id0 = composer1.rememberedValue();
            if(z3 || id0 == composer$Companion0.getEmpty()) {
                id0 = new id(jd0, 1);
                composer1.updateRememberedValue(id0);
            }
            EffectsKt.DisposableEffect(jd0, id0, composer1, 0);
            boolean z4 = composer1.changedInstance(jd0);
            if((v1 & 0x70) != 0x20) {
                v2 = 0;
            }
            boolean z5 = composer1.changed(((LayoutDirection)object1));
            g0 g00 = composer1.rememberedValue();
            if((z4 | (v1 & 14) == 4 | v2 | z5) != 0 || g00 == composer$Companion0.getEmpty()) {
                g00 = new g0(3, jd0, function00, modalBottomSheetProperties0, ((LayoutDirection)object1));
                composer1.updateRememberedValue(g00);
            }
            EffectsKt.SideEffect(g00, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(v, 1, function00, modalBottomSheetProperties0, animatable0, function20));
        }
    }

    public static final Function2 access$ModalBottomSheetDialog$lambda$0(State state0) {
        return (Function2)state0.getValue();
    }

    public static final boolean access$shouldApplySecureFlag(SecureFlagPolicy secureFlagPolicy0, boolean z) {
        switch(WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy0.ordinal()]) {
            case 1: {
                return false;
            }
            case 2: {
                return true;
            }
            case 3: {
                return z;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final boolean isFlagSecureEnabled(@NotNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getRootView().getLayoutParams();
        WindowManager.LayoutParams windowManager$LayoutParams0 = viewGroup$LayoutParams0 instanceof WindowManager.LayoutParams ? ((WindowManager.LayoutParams)viewGroup$LayoutParams0) : null;
        return windowManager$LayoutParams0 != null && (windowManager$LayoutParams0.flags & 0x2000) != 0;
    }
}

