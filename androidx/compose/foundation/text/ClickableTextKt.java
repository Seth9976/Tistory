package androidx.compose.foundation.text;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import eb.o;
import j0.a1;
import j0.b1;
import j0.e1;
import j0.f1;
import j0.o0;
import j0.z0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001Av\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\f2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000E0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A\u008C\u0001\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0001\u001A\u00020\u00002\u0014\u0010\u0014\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000E0\f2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\f2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000E0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "onClick", "ClickableText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ClickableText", "onHover", "ClickableText-03UYbkw", "(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nClickableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1223#2,6:204\n1223#2,6:210\n1223#2,6:216\n1223#2,6:222\n1223#2,3:233\n1226#2,3:239\n1223#2,6:243\n1223#2,6:249\n488#3:228\n487#3,4:229\n491#3,2:236\n495#3:242\n487#4:238\n70#5:255\n73#5:256\n1#6:257\n*S KotlinDebug\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n*L\n85#1:204,6\n86#1:210,6\n101#1:216,6\n164#1:222,6\n165#1:233,3\n165#1:239,3\n172#1:243,6\n194#1:249,6\n165#1:228\n165#1:229,4\n165#1:236,2\n165#1:242\n165#1:238\n-1#1:255\n202#1:256\n*E\n"})
public final class ClickableTextKt {
    @ExperimentalFoundationApi
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation")
    public static final void ClickableText-03UYbkw(@NotNull AnnotatedString annotatedString0, @NotNull Function1 function10, @Nullable Modifier modifier0, @Nullable TextStyle textStyle0, boolean z, int v, int v1, @Nullable Function1 function11, @NotNull Function1 function12, @Nullable Composer composer0, int v2, int v3) {
        Function1 function13;
        int v7;
        boolean z1;
        TextStyle textStyle1;
        Modifier modifier2;
        int v6;
        int v5;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(1020774372);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v2 & 0x180) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v4 |= (composer1.changed(textStyle0) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v4 |= (composer1.changed(z) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) == 0) {
            v5 = v;
            if((v2 & 0x30000) == 0) {
                v4 |= (composer1.changed(v5) ? 0x20000 : 0x10000);
            }
        }
        else {
            v4 |= 0x30000;
            v5 = v;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function11) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v2 & 0x6000000) == 0) {
            v4 |= (composer1.changedInstance(function12) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v4) != 0x2492492 || !composer1.getSkipping()) {
            if((v3 & 4) != 0) {
                modifier1 = Modifier.Companion;
            }
            TextStyle textStyle2 = (v3 & 8) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
            boolean z2 = (v3 & 16) == 0 ? z : true;
            if((v3 & 0x20) != 0) {
                v5 = 1;
            }
            int v8 = (v3 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
            Function1 function14 = (v3 & 0x80) == 0 ? function11 : a1.w;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1020774372, v4, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:162)");
            }
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            boolean z3 = composer1.changedInstance(coroutineScope0);
            e1 e10 = composer1.rememberedValue();
            if((z3 | (v4 & 0x70) == 0x20 | ((0xE000000 & v4) == 0x4000000 ? 1 : 0)) != 0 || e10 == composer$Companion0.getEmpty()) {
                e10 = new e1(coroutineScope0, function10, mutableState0, function12, null);
                composer1.updateRememberedValue(e10);
            }
            Modifier modifier3 = modifier1.then(SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, function12, function10, e10));
            o o0 = composer1.rememberedValue();
            if((0x1C00000 & v4) == 0x800000 || o0 == composer$Companion0.getEmpty()) {
                o0 = new o(mutableState0, function14, 8);
                composer1.updateRememberedValue(o0);
            }
            BasicTextKt.BasicText-RWo7tUw(annotatedString0, modifier3, textStyle2, o0, v5, z2, v8, 0, null, null, composer1, v4 & 14 | v4 >> 3 & 0x380 | v4 >> 3 & 0xE000 | 0x70000 & v4 << 3 | v4 & 0x380000, 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle1 = textStyle2;
            z1 = z2;
            v6 = v5;
            modifier2 = modifier1;
            v7 = v8;
            function13 = function14;
        }
        else {
            composer1.skipToGroupEnd();
            v6 = v5;
            modifier2 = modifier1;
            textStyle1 = textStyle0;
            z1 = z;
            v7 = v1;
            function13 = function11;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b1(annotatedString0, function10, modifier2, textStyle1, z1, v6, v7, function13, function12, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation")
    public static final void ClickableText-4YKlhWE(@NotNull AnnotatedString annotatedString0, @Nullable Modifier modifier0, @Nullable TextStyle textStyle0, boolean z, int v, int v1, @Nullable Function1 function10, @NotNull Function1 function11, @Nullable Composer composer0, int v2, int v3) {
        TextStyle textStyle1;
        int v7;
        int v6;
        boolean z1;
        Modifier modifier2;
        Function1 function12;
        int v5;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xF14D09D7);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v2 & 0x30) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v4 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) == 0) {
            v5 = v1;
            if((v2 & 0x30000) == 0) {
                v4 |= (composer1.changed(v5) ? 0x20000 : 0x10000);
            }
        }
        else {
            v4 |= 0x30000;
            v5 = v1;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function11) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v4) != 4793490 || !composer1.getSkipping()) {
            if((v3 & 2) != 0) {
                modifier1 = Modifier.Companion;
            }
            TextStyle textStyle2 = (v3 & 4) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
            boolean z2 = (v3 & 8) == 0 ? z : true;
            int v8 = (v3 & 16) == 0 ? v : 1;
            if((v3 & 0x20) != 0) {
                v5 = 0x7FFFFFFF;
            }
            Function1 function13 = (v3 & 0x40) == 0 ? function10 : z0.w;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF14D09D7, v4, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
            }
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            boolean z3 = false;
            f1 f10 = composer1.rememberedValue();
            if((v4 & 0x1C00000) == 0x800000 || f10 == composer$Companion0.getEmpty()) {
                f10 = new f1(mutableState0, function11, null);
                composer1.updateRememberedValue(f10);
            }
            Modifier modifier3 = modifier1.then(SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, function11, f10));
            if((v4 & 0x380000) == 0x100000) {
                z3 = true;
            }
            o o0 = composer1.rememberedValue();
            if(z3 || o0 == composer$Companion0.getEmpty()) {
                o0 = new o(mutableState0, function13, 7);
                composer1.updateRememberedValue(o0);
            }
            BasicTextKt.BasicText-RWo7tUw(annotatedString0, modifier3, textStyle2, o0, v8, z2, v5, 0, null, null, composer1, 0xE38E & v4 | 0x70000 & v4 << 6 | v4 << 3 & 0x380000, 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z2;
            v6 = v8;
            function12 = function13;
            modifier2 = modifier1;
            v7 = v5;
            textStyle1 = textStyle2;
        }
        else {
            composer1.skipToGroupEnd();
            function12 = function10;
            modifier2 = modifier1;
            z1 = z;
            v6 = v;
            v7 = v5;
            textStyle1 = textStyle0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o0(annotatedString0, modifier2, textStyle1, z1, v6, v7, function12, function11, v2, v3));
        }
    }

    public static final Integer access$ClickableText_03UYbkw$getOffset(MutableState mutableState0, long v) {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)mutableState0.getValue();
        if(textLayoutResult0 != null) {
            MultiParagraph multiParagraph0 = textLayoutResult0.getMultiParagraph();
            if(multiParagraph0 != null) {
                float f = Offset.getX-impl(v);
                float f1 = Offset.getY-impl(v);
                if(f <= 0.0f || f1 < 0.0f || f > multiParagraph0.getWidth() || f1 > multiParagraph0.getHeight()) {
                    multiParagraph0 = null;
                }
                return multiParagraph0 == null ? null : multiParagraph0.getOffsetForPosition-k-4lQ0M(v);
            }
        }
        return null;
    }
}

