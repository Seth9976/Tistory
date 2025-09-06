package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.foundation.text.selection.s;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import j0.i;
import j0.j;
import j0.k;
import j0.l;
import j0.m;
import j0.o;
import j0.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\u001AÊ\u0001\u0010$\u001A\u00020\u00152\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f28\b\u0002\u0010\u0017\u001A2\u0012\u0004\u0012\u00020\u000F\u0012\u001B\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000E¢\u0006\u0002\b\u00162\n\b\u0002\u0010\u0019\u001A\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onKeyboardAction", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "", "Lkotlin/ExtensionFunctionType;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "decorator", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "textObfuscationMode", "", "textObfuscationCharacter", "BasicSecureTextField-Jb9bMDk", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICLandroidx/compose/runtime/Composer;III)V", "BasicSecureTextField", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/BasicSecureTextFieldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,343:1\n1223#2,6:344\n1223#2,6:350\n1223#2,6:356\n1223#2,6:362\n1223#2,6:369\n77#3:368\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/BasicSecureTextFieldKt\n*L\n133#1:344,6\n134#1:350,6\n145#1:356,6\n151#1:362,6\n313#1:369,6\n312#1:368\n*E\n"})
public final class BasicSecureTextFieldKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    public static final void BasicSecureTextField-Jb9bMDk(@NotNull TextFieldState textFieldState0, @Nullable Modifier modifier0, boolean z, @Nullable InputTransformation inputTransformation0, @Nullable TextStyle textStyle0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActionHandler keyboardActionHandler0, @Nullable Function2 function20, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Brush brush0, @Nullable TextFieldDecorator textFieldDecorator0, int v, char c, @Nullable Composer composer0, int v1, int v2, int v3) {
        int v9;
        int v8;
        TextFieldDecorator textFieldDecorator1;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function2 function21;
        KeyboardActionHandler keyboardActionHandler1;
        KeyboardOptions keyboardOptions1;
        TextStyle textStyle1;
        InputTransformation inputTransformation1;
        boolean z1;
        Modifier modifier1;
        CodepointTransformation codepointTransformation1;
        Brush brush2;
        boolean z3;
        int v6;
        int v4;
        Composer composer1 = composer0.startRestartGroup(1399310985);
        if((v3 & 1) == 0) {
            v4 = (v1 & 6) == 0 ? (composer1.changed(textFieldState0) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        int v5 = 0x100;
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v4 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v4 |= (composer1.changed(inputTransformation0) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v4 |= (composer1.changed(textStyle0) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v4 |= (composer1.changed(keyboardOptions0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v4 |= (composer1.changed(keyboardActionHandler0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x30000000) == 0) {
            v4 |= (composer1.changed(brush0) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v6 = (v2 & 6) == 0 ? v2 | (((v2 & 8) == 0 ? composer1.changed(textFieldDecorator0) : composer1.changedInstance(textFieldDecorator0)) ? 4 : 2) : v2;
        }
        else {
            v6 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v6 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v6 |= (composer1.changed(v) ? 0x20 : 16);
        }
        int v7 = v6;
        if((v3 & 0x1000) != 0) {
            v7 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            if(!composer1.changed(c)) {
                v5 = 0x80;
            }
            v7 |= v5;
        }
        if((v4 & 306783379) != 306783378 || (v7 & 0x93) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
            boolean z2 = (v3 & 4) == 0 ? z : true;
            InputTransformation inputTransformation2 = (v3 & 8) == 0 ? inputTransformation0 : null;
            TextStyle textStyle2 = (v3 & 16) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
            KeyboardOptions keyboardOptions2 = (v3 & 0x20) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getSecureTextField$foundation_release();
            keyboardActionHandler1 = (v3 & 0x40) == 0 ? keyboardActionHandler0 : null;
            Function2 function22 = (v3 & 0x80) == 0 ? function20 : null;
            MutableInteractionSource mutableInteractionSource2 = (v3 & 0x100) == 0 ? mutableInteractionSource0 : null;
            if((v3 & 0x200) == 0) {
                z3 = z2;
                brush2 = brush0;
            }
            else {
                z3 = z2;
                brush2 = new SolidColor(0xFF00000000000000L, null);
            }
            TextFieldDecorator textFieldDecorator2 = (v3 & 0x400) == 0 ? textFieldDecorator0 : null;
            int v10 = (v3 & 0x800) == 0 ? v : 1;
            int v11 = (v3 & 0x1000) == 0 ? c : 0x2022;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1399310985, v4, v7, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:130)");
            }
            State state0 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(((char)v11)), composer1, v7 >> 6 & 14);
            SecureTextFieldController secureTextFieldController0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(secureTextFieldController0 == composer$Companion0.getEmpty()) {
                secureTextFieldController0 = new SecureTextFieldController(state0);
                composer1.updateRememberedValue(secureTextFieldController0);
            }
            boolean z4 = composer1.changedInstance(secureTextFieldController0);
            j j0 = composer1.rememberedValue();
            if(z4 || j0 == composer$Companion0.getEmpty()) {
                j0 = new j(secureTextFieldController0, null);
                composer1.updateRememberedValue(j0);
            }
            EffectsKt.LaunchedEffect(secureTextFieldController0, j0, composer1, 0);
            boolean z5 = TextObfuscationMode.equals-impl0(v10, 1);
            Boolean boolean0 = Boolean.valueOf(z5);
            boolean z6 = composer1.changed(z5);
            boolean z7 = composer1.changedInstance(secureTextFieldController0);
            k k0 = composer1.rememberedValue();
            if(z6 || z7 || k0 == composer$Companion0.getEmpty()) {
                k0 = new k(z5, secureTextFieldController0, null);
                composer1.updateRememberedValue(k0);
            }
            boolean z8 = false;
            EffectsKt.LaunchedEffect(boolean0, k0, composer1, 0);
            if((v7 & 0x70) == 0x20) {
                z8 = true;
            }
            CodepointTransformation codepointTransformation0 = composer1.rememberedValue();
            if(z8 || codepointTransformation0 == composer$Companion0.getEmpty()) {
                if(TextObfuscationMode.equals-impl0(v10, 1)) {
                    codepointTransformation1 = secureTextFieldController0.getCodepointTransformation();
                }
                else if(TextObfuscationMode.equals-impl0(v10, 2)) {
                    codepointTransformation1 = new i(state0, 0);
                }
                else {
                    codepointTransformation1 = null;
                }
                composer1.updateRememberedValue(codepointTransformation1);
                codepointTransformation0 = codepointTransformation1;
            }
            Modifier modifier2 = SemanticsModifierKt.semantics(modifier1, true, o.x);
            Modifier modifier3 = z5 ? secureTextFieldController0.getFocusChangeModifier() : Modifier.Companion;
            BasicSecureTextFieldKt.a(composer1, 6, ComposableLambdaKt.rememberComposableLambda(2023988909, true, new l(textFieldState0, modifier2.then(modifier3), z3, z5, inputTransformation2, secureTextFieldController0, textStyle2, keyboardOptions2, keyboardActionHandler1, function22, mutableInteractionSource2, brush2, codepointTransformation0, textFieldDecorator2), composer1, 54));
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v9 = v11;
            v8 = v10;
            function21 = function22;
            mutableInteractionSource1 = mutableInteractionSource2;
            brush1 = brush2;
            textFieldDecorator1 = textFieldDecorator2;
            inputTransformation1 = inputTransformation2;
            textStyle1 = textStyle2;
            keyboardOptions1 = keyboardOptions2;
            z1 = z3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            inputTransformation1 = inputTransformation0;
            textStyle1 = textStyle0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActionHandler1 = keyboardActionHandler0;
            function21 = function20;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            textFieldDecorator1 = textFieldDecorator0;
            v8 = v;
            v9 = c;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(textFieldState0, modifier1, z1, inputTransformation1, textStyle1, keyboardOptions1, keyboardActionHandler1, function21, mutableInteractionSource1, brush1, textFieldDecorator1, v8, ((char)v9), v1, v2, v3));
        }
    }

    public static final void a(Composer composer0, int v, Function2 function20) {
        Composer composer1 = composer0.startRestartGroup(-1085555050);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1085555050, v1, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:310)");
            }
            TextToolbar textToolbar0 = (TextToolbar)composer1.consume(CompositionLocalsKt.getLocalTextToolbar());
            boolean z = composer1.changed(textToolbar0);
            BasicSecureTextFieldKt.DisableCutCopy.copyDisabledToolbar.1.1 basicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$10 = composer1.rememberedValue();
            if(z || basicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$10 == Composer.Companion.getEmpty()) {
                basicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$10 = new BasicSecureTextFieldKt.DisableCutCopy.copyDisabledToolbar.1.1(textToolbar0);
                composer1.updateRememberedValue(basicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$10);
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides(basicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$10), ComposableLambdaKt.rememberComposableLambda(0xA9A4C356, true, new p(function20), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(v, 2, function20));
        }
    }

    public static final void access$DisableCutCopy(Function2 function20, Composer composer0, int v) {
        BasicSecureTextFieldKt.a(composer0, v, function20);
    }

    public static final InputTransformation access$then(InputTransformation inputTransformation0, InputTransformation inputTransformation1) {
        if(inputTransformation0 == null) {
            return inputTransformation1;
        }
        return inputTransformation1 == null ? inputTransformation0 : InputTransformationKt.then(inputTransformation0, inputTransformation1);
    }
}

