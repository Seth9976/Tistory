package com.kakao.kandinsky.textedit.ui;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.material3.wd;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.key.SoftwareKeyboardInterceptionModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import eb.k;
import eb.l;
import eb.m;
import eb.n;
import eb.o;
import eb.p;
import eb.q;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0094\u0001\u0010\u0017\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000B0\n2\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000B0\n2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000B0\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000B0\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D²\u0006\f\u0010\u0018\u001A\u00020\b8\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u001A\u001A\u00020\u00198\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u001C\u001A\u00020\u001B8\n@\nX\u008A\u008E\u0002"}, d2 = {"", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "Landroidx/compose/ui/geometry/Size;", "padding", "", "singleLine", "Lkotlin/Function1;", "", "onTextChange", "onSizeChange", "Lkotlin/Function0;", "onBackKeyEvent", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "onKeyboardVisibleChanged", "TextInput-ca1Bfew", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JJZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "TextInput", "isFocused", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/geometry/Rect;", "textBounds", "textedit_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInput.kt\ncom/kakao/kandinsky/textedit/ui/TextInputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,138:1\n1223#2,6:139\n1223#2,6:145\n1223#2,6:151\n1223#2,6:157\n1223#2,6:163\n1223#2,6:170\n1223#2,6:176\n1223#2,6:182\n1223#2,6:188\n148#3:169\n1#4:194\n81#5:195\n81#5:196\n107#5,2:197\n81#5:199\n107#5,2:200\n*S KotlinDebug\n*F\n+ 1 TextInput.kt\ncom/kakao/kandinsky/textedit/ui/TextInputKt\n*L\n50#1:139,6\n53#1:145,6\n62#1:151,6\n63#1:157,6\n71#1:163,6\n84#1:170,6\n76#1:176,6\n97#1:182,6\n118#1:188,6\n72#1:169\n51#1:195\n62#1:196\n62#1:197,2\n71#1:199\n71#1:200,2\n*E\n"})
public final class TextInputKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TextInput-ca1Bfew(@NotNull String s, @NotNull TextStyle textStyle0, long v, long v1, boolean z, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function0 function00, @NotNull FocusRequester focusRequester0, @NotNull FocusManager focusManager0, @NotNull Function1 function12, @Nullable Composer composer0, int v2, int v3) {
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(textStyle0, "style");
        Intrinsics.checkNotNullParameter(function10, "onTextChange");
        Intrinsics.checkNotNullParameter(function11, "onSizeChange");
        Intrinsics.checkNotNullParameter(function00, "onBackKeyEvent");
        Intrinsics.checkNotNullParameter(focusRequester0, "focusRequester");
        Intrinsics.checkNotNullParameter(focusManager0, "focusManager");
        Intrinsics.checkNotNullParameter(function12, "onKeyboardVisibleChanged");
        Composer composer1 = composer0.startRestartGroup(763969850);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(763969850, v2, v3, "com.kakao.kandinsky.textedit.ui.TextInput (TextInput.kt:48)");
        }
        composer1.startReplaceGroup(0x5D2F0429);
        MutableInteractionSource mutableInteractionSource0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableInteractionSource0 == composer$Companion0.getEmpty()) {
            mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
            composer1.updateRememberedValue(mutableInteractionSource0);
        }
        composer1.endReplaceGroup();
        State state0 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource0, composer1, 6);
        composer1.startReplaceGroup(0x5D2F04C0);
        boolean z1 = composer1.changed(state0);
        boolean z2 = false;
        boolean z3 = (v3 & 14 ^ 6) > 4 && composer1.changed(function12) || (v3 & 6) == 4;
        l l0 = composer1.rememberedValue();
        if(z3 || z1 || l0 == composer$Companion0.getEmpty()) {
            l0 = new l(state0, function12, null);
            composer1.updateRememberedValue(l0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(mutableInteractionSource0, l0, composer1, 70);
        composer1.startReplaceGroup(0x5D2F0591);
        MutableState mutableState0 = composer1.rememberedValue();
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(null, 0L, null, 7, null), null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x5D2F05DF);
        boolean z4 = (v2 & 14 ^ 6) > 4 && composer1.changed(s) || (v2 & 6) == 4;
        m m0 = composer1.rememberedValue();
        if(z4 || m0 == composer$Companion0.getEmpty()) {
            m0 = new m(s, mutableState0, null);
            composer1.updateRememberedValue(m0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(s, m0, composer1, v2 & 14 | 0x40);
        composer1.startReplaceGroup(0x5D2F06C2);
        MutableState mutableState1 = composer1.rememberedValue();
        if(mutableState1 == composer$Companion0.getEmpty()) {
            mutableState1 = SnapshotStateKt.mutableStateOf$default(Rect.Companion.getZero(), null, 2, null);
            composer1.updateRememberedValue(mutableState1);
        }
        composer1.endReplaceGroup();
        TextFieldValue textFieldValue0 = (TextFieldValue)mutableState0.getValue();
        Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester0), 0.0f, 1, null), 20.0f, 0.0f, 2, null);
        composer1.startReplaceGroup(0x5D2F0864);
        boolean z5 = (0x1C00000 & v2 ^ 0xC00000) > 0x800000 && composer1.changed(function00) || (v2 & 0xC00000) == 0x800000;
        n n0 = composer1.rememberedValue();
        if(z5 || n0 == composer$Companion0.getEmpty()) {
            n0 = new n(function00);
            composer1.updateRememberedValue(n0);
        }
        composer1.endReplaceGroup();
        Modifier modifier1 = SoftwareKeyboardInterceptionModifierKt.onInterceptKeyBeforeSoftKeyboard(modifier0, n0);
        KeyboardActions keyboardActions0 = new KeyboardActions(new g1(focusManager0, 24), null, null, null, null, null, 62, null);
        SolidColor solidColor0 = new SolidColor(textStyle0.getColor-0d7_KjU(), null);
        composer1.startReplaceGroup(0x5D2F0753);
        boolean z6 = (0x70000 & v2 ^ 0x30000) > 0x20000 && composer1.changed(function10) || (v2 & 0x30000) == 0x20000;
        o o0 = composer1.rememberedValue();
        if(z6 || o0 == composer$Companion0.getEmpty()) {
            o0 = new o(function10, mutableState0, 0);
            composer1.updateRememberedValue(o0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x5D2F0A26);
        if((0x380000 & v2 ^ 0x180000) > 0x100000 && composer1.changed(function11) || (0x180000 & v2) == 0x100000) {
            z2 = true;
        }
        o o1 = composer1.rememberedValue();
        if(z2 || o1 == composer$Companion0.getEmpty()) {
            o1 = new o(function11, mutableState1, 1);
            composer1.updateRememberedValue(o1);
        }
        composer1.endReplaceGroup();
        BasicTextFieldKt.BasicTextField(textFieldValue0, o0, modifier1, false, false, textStyle0, null, keyboardActions0, z, 0, 0, null, o1, mutableInteractionSource0, solidColor0, ComposableLambdaKt.rememberComposableLambda(-372629008, true, new p(v, v1, 20.0f, mutableState1), composer1, 54), composer1, v2 << 12 & 0xE070000, 0x30C00, 0xE58);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(s, textStyle0, v, v1, z, function10, function11, function00, focusRequester0, focusManager0, function12, v2, v3));
        }
    }

    public static final void access$DrawBackground-cq6XJ1M(long v, Rect rect0, float f, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xDE3F0C6B);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(rect0) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDE3F0C6B, v2, -1, "com.kakao.kandinsky.textedit.ui.DrawBackground (TextInput.kt:116)");
            }
            int v3 = 1;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            composer1.startReplaceGroup(0x152CECD1);
            if((v2 & 14) != 4) {
                v3 = 0;
            }
            wd wd0 = composer1.rememberedValue();
            if((((v2 & 0x380) == 0x100 ? 1 : 0) | ((v2 & 0x70) == 0x20 ? 1 : 0) | v3) != 0 || wd0 == Composer.Companion.getEmpty()) {
                wd0 = new wd(f, rect0, v, 1);
                composer1.updateRememberedValue(wd0);
            }
            composer1.endReplaceGroup();
            CanvasKt.Canvas(modifier0, wd0, composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(v, rect0, f, v1));
        }
    }

    public static final boolean access$TextInput_ca1Bfew$lambda$1(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final TextFieldValue access$TextInput_ca1Bfew$lambda$4(MutableState mutableState0) {
        return (TextFieldValue)mutableState0.getValue();
    }

    public static final void access$TextInput_ca1Bfew$lambda$5(MutableState mutableState0, TextFieldValue textFieldValue0) {
        mutableState0.setValue(textFieldValue0);
    }

    public static final Rect access$TextInput_ca1Bfew$lambda$8(MutableState mutableState0) {
        return (Rect)mutableState0.getValue();
    }

    public static final void access$TextInput_ca1Bfew$lambda$9(MutableState mutableState0, Rect rect0) {
        mutableState0.setValue(rect0);
    }

    public static final Rect access$getTextBounds(TextLayoutResult textLayoutResult0) {
        Iterator iterator0 = c.until(0, textLayoutResult0.getLineCount()).iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        float f;
        for(f = textLayoutResult0.getLineLeft(((IntIterator)iterator0).nextInt()); iterator0.hasNext(); f = Math.min(f, textLayoutResult0.getLineLeft(((IntIterator)iterator0).nextInt()))) {
        }
        Iterator iterator1 = c.until(0, textLayoutResult0.getLineCount()).iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        float f1;
        for(f1 = textLayoutResult0.getLineRight(((IntIterator)iterator1).nextInt()); iterator1.hasNext(); f1 = Math.max(f1, textLayoutResult0.getLineRight(((IntIterator)iterator1).nextInt()))) {
        }
        return new Rect(f, textLayoutResult0.getLineTop(0), f1, textLayoutResult0.getLineBottom(textLayoutResult0.getLineCount() - 1));
    }
}

