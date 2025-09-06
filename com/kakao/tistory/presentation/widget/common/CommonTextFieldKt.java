package com.kakao.tistory.presentation.widget.common;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.TextUnitKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001AÙ\u0001\u0010\u001F\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0015\u001A\u00020\u00142\n\b\u0003\u0010\u0016\u001A\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0017\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001A\u001A\u00020\u00182\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001C\u001A\u00020\u00182\u000E\b\u0002\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00030\u001DH\u0007¢\u0006\u0004\b\u001F\u0010 ¨\u0006%²\u0006\f\u0010!\u001A\u00020\u00188\nX\u008A\u0084\u0002²\u0006\f\u0010#\u001A\u00020\"8\nX\u008A\u0084\u0002²\u0006\f\u0010$\u001A\u00020\"8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Lkotlin/Function1;", "", "onValueChange", "", "label", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "source", "", "maxLines", "maxCount", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "endIconResId", "iconDescriptionId", "", "setVerifyingAnimation", "isError", "statusMessage", "fixIndicatorColor", "Lkotlin/Function0;", "onClickEndIcon", "CommonTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;IILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/input/VisualTransformation;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "isFocused", "", "animationFloat", "rotation", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommonTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonTextField.kt\ncom/kakao/tistory/presentation/widget/common/CommonTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,240:1\n77#2:241\n77#2:248\n1223#3,6:242\n1223#3,6:249\n1223#3,6:256\n1223#3,6:264\n1#4:255\n148#5:262\n148#5:263\n148#5:272\n95#6,2:270\n81#7:273\n81#7:274\n*S KotlinDebug\n*F\n+ 1 CommonTextField.kt\ncom/kakao/tistory/presentation/widget/common/CommonTextFieldKt\n*L\n51#1:241\n70#1:248\n52#1:242,6\n186#1:249,6\n199#1:256,6\n216#1:264,6\n200#1:262\n201#1:263\n232#1:272\n224#1:270,2\n66#1:273\n177#1:274\n*E\n"})
public final class CommonTextFieldKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommonTextField(@NotNull TextFieldValue textFieldValue0, @NotNull Function1 function10, @Nullable String s, @Nullable Modifier modifier0, @Nullable TextStyle textStyle0, @Nullable MutableInteractionSource mutableInteractionSource0, int v, int v1, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActions keyboardActions0, @Nullable VisualTransformation visualTransformation0, @DrawableRes @Nullable Integer integer0, @StringRes @Nullable Integer integer1, boolean z, boolean z1, @Nullable String s1, boolean z2, @Nullable Function0 function00, @Nullable Composer composer0, int v2, int v3, int v4) {
        KeyboardOptions keyboardOptions1;
        Function0 function01;
        boolean z5;
        String s3;
        boolean z4;
        boolean z3;
        Integer integer3;
        Integer integer2;
        VisualTransformation visualTransformation1;
        KeyboardActions keyboardActions1;
        int v11;
        int v10;
        MutableInteractionSource mutableInteractionSource1;
        TextStyle textStyle1;
        Modifier modifier1;
        String s2;
        Function0 function02;
        boolean z8;
        String s4;
        boolean z7;
        boolean z6;
        Integer integer5;
        Integer integer4;
        VisualTransformation visualTransformation2;
        KeyboardActions keyboardActions2;
        KeyboardOptions keyboardOptions2;
        int v13;
        int v12;
        MutableInteractionSource mutableInteractionSource2;
        TextStyle textStyle2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource4;
        int v14;
        TextStyle textStyle3;
        int v8;
        int v5;
        Intrinsics.checkNotNullParameter(textFieldValue0, "value");
        Intrinsics.checkNotNullParameter(function10, "onValueChange");
        Composer composer1 = composer0.startRestartGroup(0xA08830FE);
        if((v4 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.changed(textFieldValue0) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v5 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        int v6 = 0x400;
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        int v7 = 0x2000;
        if((v2 & 0xE000) == 0) {
            v5 |= ((v4 & 16) != 0 || !composer1.changed(textStyle0) ? 0x2000 : 0x4000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v5 |= (composer1.changed(mutableInteractionSource0) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v5 |= (composer1.changed(v) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.changed(v1) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v5 |= (composer1.changed(keyboardOptions0) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v2 & 0x70000000) == 0) {
            v5 |= (composer1.changed(keyboardActions0) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) == 0) {
            v8 = (v3 & 14) == 0 ? v3 | (composer1.changed(visualTransformation0) ? 4 : 2) : v3;
        }
        else {
            v8 = v3 | 6;
        }
        if((v4 & 0x800) != 0) {
            v8 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v8 |= (composer1.changed(integer0) ? 0x20 : 16);
        }
        int v9 = v8;
        if((v4 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v9 |= (composer1.changed(integer1) ? 0x100 : 0x80);
        }
        if((v4 & 0x2000) != 0) {
            v9 |= 0xC00;
        }
        else if((v3 & 0x1C00) == 0) {
            if(composer1.changed(z)) {
                v6 = 0x800;
            }
            v9 |= v6;
        }
        if((v4 & 0x4000) != 0) {
            v9 |= 0x6000;
        }
        else if((v3 & 0xE000) == 0) {
            if(composer1.changed(z1)) {
                v7 = 0x4000;
            }
            v9 |= v7;
        }
        if((v4 & 0x8000) != 0) {
            v9 |= 0x30000;
        }
        else if((v3 & 0x70000) == 0) {
            v9 |= (composer1.changed(s1) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x10000) != 0) {
            v9 |= 0x180000;
        }
        else if((v3 & 0x380000) == 0) {
            v9 |= (composer1.changed(z2) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x20000) != 0) {
            v9 |= 0xC00000;
        }
        else if((v3 & 0x1C00000) == 0) {
            v9 |= (composer1.changedInstance(function00) ? 0x800000 : 0x400000);
        }
        if((v5 & 0x5B6DB6DB) != 306783378 || (0x16DB6DB & v9) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                String s5 = (v4 & 4) == 0 ? s : null;
                Modifier modifier3 = (v4 & 8) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 16) == 0) {
                    textStyle3 = textStyle0;
                }
                else {
                    textStyle3 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x20) == 0) {
                    v14 = v5;
                    mutableInteractionSource4 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceGroup(0xB98528E2);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    v14 = v5;
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    composer1.endReplaceGroup();
                }
                int v15 = (v4 & 0x40) == 0 ? v : 0x7FFFFFFF;
                int v16 = (v4 & 0x80) == 0 ? v1 : 0x7FFFFFFF;
                KeyboardOptions keyboardOptions3 = (v4 & 0x100) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                KeyboardActions keyboardActions3 = (v4 & 0x200) == 0 ? keyboardActions0 : KeyboardActions.Companion.getDefault();
                VisualTransformation visualTransformation3 = (v4 & 0x400) == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
                Integer integer6 = (v4 & 0x800) == 0 ? integer0 : null;
                Integer integer7 = (v4 & 0x1000) == 0 ? integer1 : null;
                boolean z9 = (v4 & 0x2000) == 0 ? z : false;
                boolean z10 = (v4 & 0x4000) == 0 ? z1 : false;
                String s6 = (v4 & 0x8000) == 0 ? s1 : null;
                boolean z11 = (v4 & 0x10000) == 0 ? z2 : false;
                if((v4 & 0x20000) == 0) {
                    function02 = function00;
                    keyboardOptions2 = keyboardOptions3;
                    keyboardActions2 = keyboardActions3;
                    visualTransformation2 = visualTransformation3;
                    s2 = s5;
                    integer4 = integer6;
                    v13 = v16;
                    integer5 = integer7;
                    textStyle2 = textStyle3;
                    z6 = z9;
                    z7 = z10;
                    v12 = v15;
                    modifier2 = modifier3;
                    s4 = s6;
                    z8 = z11;
                }
                else {
                    keyboardOptions2 = keyboardOptions3;
                    keyboardActions2 = keyboardActions3;
                    visualTransformation2 = visualTransformation3;
                    s2 = s5;
                    integer4 = integer6;
                    v13 = v16;
                    integer5 = integer7;
                    textStyle2 = textStyle3;
                    z6 = z9;
                    z7 = z10;
                    v12 = v15;
                    modifier2 = modifier3;
                    s4 = s6;
                    z8 = z11;
                    function02 = c0.a;
                }
                mutableInteractionSource2 = mutableInteractionSource4;
                v5 = v14;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                s2 = s;
                modifier2 = modifier0;
                textStyle2 = textStyle0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v12 = v;
                v13 = v1;
                keyboardOptions2 = keyboardOptions0;
                keyboardActions2 = keyboardActions0;
                visualTransformation2 = visualTransformation0;
                integer4 = integer0;
                integer5 = integer1;
                z6 = z;
                z7 = z1;
                s4 = s1;
                z8 = z2;
                function02 = function00;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA08830FE, v5, v9, "com.kakao.tistory.presentation.widget.common.CommonTextField (CommonTextField.kt:64)");
            }
            State state0 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource2, composer1, v5 >> 15 & 14);
            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(new TextSelectionColors(ColorResources_androidKt.colorResource(color.gray1, composer1, 0), ((TextSelectionColors)composer1.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor-0d7_KjU(), null)), ComposableLambdaKt.rememberComposableLambda(0xF9FFF5BE, true, new e0(modifier2, v12, textFieldValue0, function10, textStyle2, keyboardOptions2, keyboardActions2, visualTransformation2, mutableInteractionSource2, s2, z7, z8, state0, integer4, integer5, z6, function02, s4, v13), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            modifier1 = modifier2;
            textStyle1 = textStyle2;
            v10 = v12;
            v11 = v13;
            keyboardOptions1 = keyboardOptions2;
            keyboardActions1 = keyboardActions2;
            visualTransformation1 = visualTransformation2;
            integer2 = integer4;
            integer3 = integer5;
            z3 = z6;
            z4 = z7;
            s3 = s4;
            z5 = z8;
            function01 = function02;
        }
        else {
            composer1.skipToGroupEnd();
            s2 = s;
            modifier1 = modifier0;
            textStyle1 = textStyle0;
            mutableInteractionSource1 = mutableInteractionSource0;
            v10 = v;
            v11 = v1;
            keyboardActions1 = keyboardActions0;
            visualTransformation1 = visualTransformation0;
            integer2 = integer0;
            integer3 = integer1;
            z3 = z;
            z4 = z1;
            s3 = s1;
            z5 = z2;
            function01 = function00;
            keyboardOptions1 = keyboardOptions0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f0(textFieldValue0, function10, s2, modifier1, textStyle1, mutableInteractionSource1, v10, v11, keyboardOptions1, keyboardActions1, visualTransformation1, integer2, integer3, z3, z4, s3, z5, function01, v2, v3, v4));
        }
    }

    public static final void a(Modifier modifier0, int v, int v1, Composer composer0, int v2, int v3) {
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xC94D94E5);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v4 & 731) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC94D94E5, v4, -1, "com.kakao.tistory.presentation.widget.common.TextCounter (CommonTextField.kt:229)");
            }
            ExcludeFontPaddingTextKt.Text-IbK3jfQ((v + " / " + v1), PaddingKt.padding-qDBjuR0$default(modifier1, 0.0f, 4.0f, 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(color.gray2, composer1, 0), 0x141400000L, null, FontWeight.Companion.getLight(), TypeKt.getTFont(), 0L, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0x1B0C00, 0xC00, 0x3DF90);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m0(modifier1, v, v1, v2, v3));
        }
    }

    public static final boolean access$CommonTextField$lambda$1(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final void access$EndIcon(int v, Integer integer0, boolean z, Function0 function00, Composer composer0, int v1, int v2) {
        boolean z1;
        Modifier modifier1;
        Modifier modifier0;
        int v3;
        Composer composer1 = composer0.startRestartGroup(1716267065);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(integer0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            z1 = (v2 & 4) == 0 ? z : false;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1716267065, v3, -1, "com.kakao.tistory.presentation.widget.common.EndIcon (CommonTextField.kt:173)");
            }
            composer1.startReplaceGroup(0xC757DE60);
            if(z1) {
                State state0 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("", composer1, 6, 0), 0.0f, 360.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.tween$default(1000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), "", composer1, InfiniteTransition.$stable | 25008 | InfiniteRepeatableSpec.$stable << 9, 0);
                Companion modifier$Companion0 = Modifier.Companion;
                composer1.startReplaceGroup(-950528962);
                boolean z2 = composer1.changed(state0);
                j0 j00 = composer1.rememberedValue();
                if(z2 || j00 == Composer.Companion.getEmpty()) {
                    j00 = new j0(state0);
                    composer1.updateRememberedValue(j00);
                }
                composer1.endReplaceGroup();
                modifier0 = GraphicsLayerModifierKt.graphicsLayer(modifier$Companion0, j00);
            }
            else {
                modifier0 = Modifier.Companion;
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(-950524756);
            String s = integer0 == null ? null : StringResources_androidKt.stringResource(integer0.intValue(), composer1, 0);
            composer1.endReplaceGroup();
            Companion modifier$Companion1 = Modifier.Companion;
            composer1.startReplaceGroup(-950519208);
            if(s == null) {
                modifier1 = modifier$Companion1;
            }
            else {
                composer1.startReplaceGroup(0xC758401A);
                boolean z3 = composer1.changed(s);
                g0 g00 = composer1.rememberedValue();
                if(z3 || g00 == Composer.Companion.getEmpty()) {
                    g00 = new g0(s);
                    composer1.updateRememberedValue(g00);
                }
                composer1.endReplaceGroup();
                modifier1 = SemanticsModifierKt.semantics$default(modifier$Companion1, false, g00, 1, null);
            }
            composer1.endReplaceGroup();
            IconButtonKt.IconButton(function00, SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default(modifier1, 8.0f, 0.0f, 0.0f, 0.0f, 14, null), 24.0f), !z1, null, ComposableLambdaKt.rememberComposableLambda(2011611093, true, new h0(v, modifier0), composer1, 54), composer1, v3 >> 9 & 14 | 0x6000, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i0(v, integer0, z1, function00, v1, v2));
        }
    }

    public static final float access$EndIcon$lambda$2(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final void access$StatusMessage(Modifier modifier0, String s, boolean z, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x6DE86042);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6DE86042, v2, -1, "com.kakao.tistory.presentation.widget.common.StatusMessage (CommonTextField.kt:212)");
            }
            String s1 = StringResources_androidKt.stringResource(string.content_desc_common_textfield_state_message, new Object[]{s}, composer1, 0x40);
            composer1.startReplaceGroup(0xA9754752);
            boolean z1 = composer1.changed(s1);
            k0 k00 = composer1.rememberedValue();
            if(z1 || k00 == Composer.Companion.getEmpty()) {
                k00 = new k0(s1);
                composer1.updateRememberedValue(k00);
            }
            composer1.endReplaceGroup();
            Modifier modifier2 = SemanticsModifierKt.semantics$default(modifier1, false, k00, 1, null);
            long v3 = ColorResources_androidKt.colorResource((z ? color.point1 : color.gray5), composer1, 0);
            FontWeight fontWeight0 = FontWeight.Companion.getNormal();
            TextUnitKt.checkArithmetic--R2X_6o(5303949066L);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier2, v3, 0x141400000L, null, fontWeight0, TypeKt.getTFont(), 0x1BC23D70AL, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, v2 >> 3 & 14 | 0x1B0C00, 0xC00, 0x3DF10);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l0(modifier1, s, z, v, v1));
        }
    }
}

