package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u008B\u0001\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001A\u00020\u00132\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001Ax\u0010\u001A\u001A\u00020\u00012\u0006\u0010\u001B\u001A\u00020\u000F2\u0012\u0010\u0002\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0006\u001A\u00020\u001C2\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001A\u00020\u00132\u0011\u0010\u0014\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u001D¨\u0006\u001E²\u0006\n\u0010\u001F\u001A\u00020\u000FX\u008A\u008E\u0002²\u0006\n\u0010\u001F\u001A\u00020\u000FX\u008A\u008E\u0002"}, d2 = {"RoundButton", "", "onClick", "Lkotlin/Function0;", "onClickLabel", "", "colors", "Lcom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$ButtonColors;", "modifier", "Landroidx/compose/ui/Modifier;", "border", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$ButtonColors;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/graphics/Shape;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "RoundToggleButton", "checked", "Lcom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$CheckedButtonColors;", "(ZLkotlin/jvm/functions/Function1;Lcom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$CheckedButtonColors;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease", "clickEnabled"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRoundButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundButton.kt\ncom/kakao/tistory/presentation/widget/common/RoundButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,204:1\n148#2:205\n148#2:206\n148#2:222\n148#2:223\n488#3:207\n487#3,4:208\n491#3,2:215\n495#3:221\n488#3:224\n487#3,4:225\n491#3,2:232\n495#3:238\n1223#4,3:212\n1226#4,3:218\n1223#4,3:229\n1226#4,3:235\n487#5:217\n487#5:234\n81#6:239\n107#6,2:240\n81#6:242\n107#6,2:243\n*S KotlinDebug\n*F\n+ 1 RoundButton.kt\ncom/kakao/tistory/presentation/widget/common/RoundButtonKt\n*L\n36#1:205\n40#1:206\n96#1:222\n98#1:223\n45#1:207\n45#1:208,4\n45#1:215,2\n45#1:221\n104#1:224\n104#1:225,4\n104#1:232,2\n104#1:238\n45#1:212,3\n45#1:218,3\n104#1:229,3\n104#1:235,3\n45#1:217\n104#1:234\n43#1:239\n43#1:240,2\n102#1:242\n102#1:243,2\n*E\n"})
public final class RoundButtonKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void RoundButton(@NotNull Function0 function00, @Nullable String s, @NotNull ButtonColors roundButtonDefaults$ButtonColors0, @Nullable Modifier modifier0, @Nullable BorderStroke borderStroke0, @Nullable Shape shape0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable PaddingValues paddingValues0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        Shape shape1;
        PaddingValues paddingValues1;
        boolean z1;
        BorderStroke borderStroke1;
        Modifier modifier1;
        String s1;
        Shape shape2;
        PaddingValues paddingValues2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z2;
        BorderStroke borderStroke2;
        Modifier modifier2;
        String s2;
        Shape shape3;
        int v2;
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Intrinsics.checkNotNullParameter(roundButtonDefaults$ButtonColors0, "colors");
        Intrinsics.checkNotNullParameter(function30, "content");
        Composer composer1 = composer0.startRestartGroup(0x325873F9);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(roundButtonDefaults$ButtonColors0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(borderStroke0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(shape0) ? 0x10000 : 0x20000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changed(z) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((0x70000000 & v) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000000 : 0x10000000);
        }
        if((0x5B6DB6DB & v2) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                String s3 = (v1 & 2) == 0 ? s : null;
                Modifier modifier3 = (v1 & 8) == 0 ? modifier0 : Modifier.Companion;
                BorderStroke borderStroke3 = (v1 & 16) == 0 ? borderStroke0 : BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, 0L);
                if((v1 & 0x20) == 0) {
                    shape3 = shape0;
                }
                else {
                    shape3 = RoundedCornerShapeKt.RoundedCornerShape(100);
                    v2 &= 0xFFF8FFFF;
                }
                MutableInteractionSource mutableInteractionSource3 = (v1 & 0x80) == 0 ? mutableInteractionSource0 : null;
                if((v1 & 0x100) == 0) {
                    paddingValues2 = paddingValues0;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    s2 = s3;
                }
                else {
                    mutableInteractionSource2 = mutableInteractionSource3;
                    s2 = s3;
                    paddingValues2 = PaddingKt.PaddingValues-0680j_4(0.0f);
                }
                modifier2 = modifier3;
                borderStroke2 = borderStroke3;
                shape2 = shape3;
                z2 = (v1 & 0x40) == 0 ? z : true;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                s2 = s;
                modifier2 = modifier0;
                borderStroke2 = borderStroke0;
                z2 = z;
                mutableInteractionSource2 = mutableInteractionSource0;
                paddingValues2 = paddingValues0;
                shape2 = shape0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x325873F9, v2, -1, "com.kakao.tistory.presentation.widget.common.RoundButton (RoundButton.kt:41)");
            }
            Object object0 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, q2.a, composer1, 3080, 6);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            Boolean boolean0 = (Boolean)((MutableState)object0).getValue();
            boolean0.getClass();
            EffectsKt.LaunchedEffect(boolean0, new l2(compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), ((MutableState)object0), null), composer1, 0x40);
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(roundButtonDefaults$ButtonColors0.contentColor-vNxB06k(z2))), ComposableLambdaKt.rememberComposableLambda(0xCA1C739, true, new o2(modifier2, shape2, roundButtonDefaults$ButtonColors0, z2, borderStroke2, mutableInteractionSource2, s2, ((MutableState)object0), function00, paddingValues2, function30), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z2;
            s1 = s2;
            modifier1 = modifier2;
            borderStroke1 = borderStroke2;
            shape1 = shape2;
            mutableInteractionSource1 = mutableInteractionSource2;
            paddingValues1 = paddingValues2;
        }
        else {
            composer1.skipToGroupEnd();
            s1 = s;
            modifier1 = modifier0;
            borderStroke1 = borderStroke0;
            z1 = z;
            paddingValues1 = paddingValues0;
            shape1 = shape0;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p2(function00, s1, roundButtonDefaults$ButtonColors0, modifier1, borderStroke1, shape1, z1, mutableInteractionSource1, paddingValues1, function30, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void RoundToggleButton(boolean z, @NotNull Function1 function10, @NotNull CheckedButtonColors roundButtonDefaults$CheckedButtonColors0, @Nullable Modifier modifier0, @Nullable Shape shape0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable PaddingValues paddingValues0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        PaddingValues paddingValues1;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape1;
        Modifier modifier1;
        PaddingValues paddingValues2;
        BorderStroke borderStroke2;
        Shape shape2;
        Modifier modifier2;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource1;
        BorderStroke borderStroke1;
        int v2;
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Intrinsics.checkNotNullParameter(roundButtonDefaults$CheckedButtonColors0, "colors");
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(0x85DA4B81);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(roundButtonDefaults$CheckedButtonColors0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changed(shape0) ? 0x2000 : 0x4000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            borderStroke1 = borderStroke0;
        }
        else if((0x70000 & v) == 0) {
            borderStroke1 = borderStroke0;
            v2 |= (composer1.changed(borderStroke1) ? 0x20000 : 0x10000);
        }
        else {
            borderStroke1 = borderStroke0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((0x380000 & v) == 0) {
            mutableInteractionSource1 = mutableInteractionSource0;
            v2 |= (composer1.changed(mutableInteractionSource1) ? 0x100000 : 0x80000);
        }
        else {
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((0xE000000 & v) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x4000000 : 0x2000000);
        }
        if((0xB6DB6DB & v2) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 8) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 16) == 0) {
                    shape3 = shape0;
                }
                else {
                    shape3 = RoundedCornerShapeKt.RoundedCornerShape(100);
                    v2 &= 0xFFFF1FFF;
                }
                BorderStroke borderStroke3 = (v1 & 0x20) == 0 ? borderStroke0 : BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, 0L);
                if((v1 & 0x40) != 0) {
                    mutableInteractionSource1 = null;
                }
                paddingValues2 = (v1 & 0x80) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
                modifier2 = modifier3;
                shape2 = shape3;
                borderStroke2 = borderStroke3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                shape2 = shape0;
                borderStroke2 = borderStroke0;
                paddingValues2 = paddingValues0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x85DA4B81, v2, -1, "com.kakao.tistory.presentation.widget.common.RoundToggleButton (RoundButton.kt:99)");
            }
            Object object0 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, x2.a, composer1, 3080, 6);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            Boolean boolean0 = (Boolean)((MutableState)object0).getValue();
            boolean0.getClass();
            EffectsKt.LaunchedEffect(boolean0, new s2(compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), ((MutableState)object0), null), composer1, 0x40);
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(roundButtonDefaults$CheckedButtonColors0.contentColor-vNxB06k(z))), ComposableLambdaKt.rememberComposableLambda(-1540870463, true, new v2(modifier2, shape2, roundButtonDefaults$CheckedButtonColors0, z, borderStroke2, mutableInteractionSource1, ((MutableState)object0), function10, paddingValues2, function20), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            shape1 = shape2;
            borderStroke1 = borderStroke2;
            mutableInteractionSource2 = mutableInteractionSource1;
            paddingValues1 = paddingValues2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            shape1 = shape0;
            mutableInteractionSource2 = mutableInteractionSource1;
            paddingValues1 = paddingValues0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w2(z, function10, roundButtonDefaults$CheckedButtonColors0, modifier1, shape1, borderStroke1, mutableInteractionSource2, paddingValues1, function20, v, v1));
        }
    }

    public static final boolean access$RoundButton$lambda$0(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$RoundButton$lambda$1(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final boolean access$RoundToggleButton$lambda$2(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$RoundToggleButton$lambda$3(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }
}

