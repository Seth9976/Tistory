package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.material3.gf;
import androidx.compose.material3.z5;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;
import te.a;
import u2.b;
import v2.d;
import v2.g;
import v2.h;
import v2.i;
import v2.k;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001AU\u0010\r\u001A\u00020\u00052\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\u0011\u0010\n\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u001AF\u0010\r\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\u000E2\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\u0011\u0010\n\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\r\u0010\u0010\u001A*\u0010\u0013\u001A\u00020\u00052\u0006\u0010\u0012\u001A\u00020\u00112\u0011\u0010\n\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001A\u0013\u0010\u0017\u001A\u00020\u0016*\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001A#\u0010\u001B\u001A\u00020\u00162\u0006\u0010\u0019\u001A\u00020\u00152\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001B\u0010\u001C\" \u0010\"\u001A\b\u0012\u0004\u0012\u00020\u00110\u001D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006$²\u0006\u0017\u0010#\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\t8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/unit/IntOffset;", "offset", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/PopupProperties;", "properties", "Landroidx/compose/runtime/Composable;", "content", "Popup-K5zGePQ", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Popup", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "tag", "PopupTestTag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/View;", "", "isFlagSecureEnabled", "(Landroid/view/View;)Z", "view", "testTag", "isPopupLayout", "(Landroid/view/View;Ljava/lang/String;)Z", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPopupTestTag", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,980:1\n1223#2,6:981\n1223#2,6:991\n1223#2,6:997\n1223#2,6:1003\n1223#2,6:1009\n1223#2,6:1015\n1223#2,6:1021\n1223#2,6:1027\n77#3:987\n77#3:988\n77#3:989\n77#3:990\n78#4,6:1033\n85#4,4:1048\n89#4,2:1058\n93#4:1063\n78#4,6:1064\n85#4,4:1079\n89#4,2:1089\n93#4:1094\n368#5,9:1039\n377#5,3:1060\n368#5,9:1070\n377#5,3:1091\n4032#6,6:1052\n4032#6,6:1083\n81#7:1095\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n270#1:981,6\n311#1:991,6\n339#1:997,6\n354#1:1003,6\n363#1:1009,6\n375#1:1015,6\n388#1:1021,6\n396#1:1027,6\n304#1:987\n305#1:988\n306#1:989\n307#1:990\n385#1:1033,6\n385#1:1048,4\n385#1:1058,2\n385#1:1063\n438#1:1064,6\n438#1:1079,4\n438#1:1089,2\n438#1:1094\n385#1:1039,9\n385#1:1060,3\n438#1:1070,9\n438#1:1091,3\n385#1:1052,6\n438#1:1083,6\n309#1:1095\n*E\n"})
public final class AndroidPopup_androidKt {
    public static final ProvidableCompositionLocal a;

    static {
        AndroidPopup_androidKt.a = CompositionLocalKt.compositionLocalOf$default(null, d.y, 1, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Popup(@NotNull PopupPositionProvider popupPositionProvider0, @Nullable Function0 function00, @Nullable PopupProperties popupProperties0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        PopupProperties popupProperties1;
        Function0 function01;
        int v3;
        String s1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-830247068);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(popupPositionProvider0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(popupProperties0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            Function0 function02 = (v1 & 2) == 0 ? function00 : null;
            PopupProperties popupProperties2 = (v1 & 4) == 0 ? popupProperties0 : new PopupProperties(false, false, false, false, 15, null);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-830247068, v2, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)");
            }
            Object object0 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Object object1 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            String s = (String)composer1.consume(AndroidPopup_androidKt.a);
            Object object2 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext compositionContext0 = ComposablesKt.rememberCompositionContext(composer1, 0);
            State state0 = SnapshotStateKt.rememberUpdatedState(function20, composer1, v2 >> 9 & 14);
            Object object3 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, d.z, composer1, 0xC00, 6);
            PopupLayout popupLayout0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(popupLayout0 == composer$Companion0.getEmpty()) {
                s1 = s;
                v3 = v2;
                popupLayout0 = new PopupLayout(function02, popupProperties2, s, ((View)object0), ((Density)object1), popupPositionProvider0, ((UUID)object3), null, 0x80, null);
                popupLayout0.setContent(compositionContext0, ComposableLambdaKt.composableLambdaInstance(0x4DA88F2F, true, new k(popupLayout0, state0)));
                composer1.updateRememberedValue(popupLayout0);
            }
            else {
                s1 = s;
                v3 = v2;
            }
            boolean z = composer1.changedInstance(popupLayout0);
            boolean z1 = composer1.changed(s1);
            boolean z2 = composer1.changed(((LayoutDirection)object2));
            z5 z50 = composer1.rememberedValue();
            if((z | (v3 & 0x70) == 0x20 | ((v3 & 0x380) == 0x100 ? 1 : 0) | z1 | z2) != 0 || z50 == composer$Companion0.getEmpty()) {
                z50 = new z5(popupLayout0, function02, popupProperties2, s1, ((LayoutDirection)object2), 3);
                composer1.updateRememberedValue(z50);
            }
            EffectsKt.DisposableEffect(popupLayout0, z50, composer1, 0);
            boolean z3 = composer1.changedInstance(popupLayout0);
            boolean z4 = composer1.changed(s1);
            boolean z5 = composer1.changed(((LayoutDirection)object2));
            a a0 = composer1.rememberedValue();
            if(((v3 & 0x70) == 0x20 | z3 | ((v3 & 0x380) == 0x100 ? 1 : 0) | z4 | z5) != 0 || a0 == composer$Companion0.getEmpty()) {
                a0 = new a(popupLayout0, function02, popupProperties2, s1, ((LayoutDirection)object2), 1);
                composer1.updateRememberedValue(a0);
            }
            EffectsKt.SideEffect(a0, composer1, 0);
            boolean z6 = composer1.changedInstance(popupLayout0);
            b b0 = composer1.rememberedValue();
            if(z6 || (v3 & 14) == 4 || b0 == composer$Companion0.getEmpty()) {
                b0 = new b(3, popupLayout0, popupPositionProvider0);
                composer1.updateRememberedValue(b0);
            }
            EffectsKt.DisposableEffect(popupPositionProvider0, b0, composer1, v3 & 14);
            boolean z7 = composer1.changedInstance(popupLayout0);
            h h0 = composer1.rememberedValue();
            if(z7 || h0 == composer$Companion0.getEmpty()) {
                h0 = new h(popupLayout0, null);
                composer1.updateRememberedValue(h0);
            }
            EffectsKt.LaunchedEffect(popupLayout0, h0, composer1, 0);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            boolean z8 = composer1.changedInstance(popupLayout0);
            i i0 = composer1.rememberedValue();
            if(z8 || i0 == composer$Companion0.getEmpty()) {
                i0 = new i(popupLayout0, 0);
                composer1.updateRememberedValue(i0);
            }
            Modifier modifier0 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier$Companion0, i0);
            boolean z9 = composer1.changedInstance(popupLayout0);
            boolean z10 = composer1.changed(((LayoutDirection)object2));
            gf gf0 = composer1.rememberedValue();
            if(z9 || z10 || gf0 == composer$Companion0.getEmpty()) {
                gf0 = new gf(3, popupLayout0, ((LayoutDirection)object2));
                composer1.updateRememberedValue(gf0);
            }
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = androidx.room.a.r(composeUiNode$Companion0, composer1, gf0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                androidx.room.a.t(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
            popupProperties1 = popupProperties2;
        }
        else {
            composer1.skipToGroupEnd();
            function01 = function00;
            popupProperties1 = popupProperties0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(popupPositionProvider0, function01, popupProperties1, function20, v, v1, 9));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Popup-K5zGePQ(@Nullable Alignment alignment0, long v, @Nullable Function0 function00, @Nullable PopupProperties popupProperties0, @NotNull Function2 function20, @Nullable Composer composer0, int v1, int v2) {
        PopupProperties popupProperties1;
        Function0 function01;
        Alignment alignment1;
        long v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x119A1011);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(alignment0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            v4 = v;
        }
        else if((v1 & 0x30) == 0) {
            v4 = v;
            v3 |= (composer1.changed(v4) ? 0x20 : 16);
        }
        else {
            v4 = v;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v3 |= (composer1.changed(popupProperties0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((v3 & 9363) != 9362 || !composer1.getSkipping()) {
            alignment1 = (v2 & 1) == 0 ? alignment0 : Alignment.Companion.getTopStart();
            int v5 = 0;
            if((v2 & 2) != 0) {
                v4 = 0L;
            }
            Function0 function02 = (v2 & 4) == 0 ? function00 : null;
            PopupProperties popupProperties2 = (v2 & 8) == 0 ? popupProperties0 : new PopupProperties(false, false, false, false, 15, null);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x119A1011, v3, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
            }
            if((v3 & 0x70) == 0x20) {
                v5 = 1;
            }
            AlignmentOffsetPositionProvider alignmentOffsetPositionProvider0 = composer1.rememberedValue();
            if((((v3 & 14) == 4 ? 1 : 0) | v5) != 0 || alignmentOffsetPositionProvider0 == Composer.Companion.getEmpty()) {
                alignmentOffsetPositionProvider0 = new AlignmentOffsetPositionProvider(alignment1, v4, null);
                composer1.updateRememberedValue(alignmentOffsetPositionProvider0);
            }
            AndroidPopup_androidKt.Popup(alignmentOffsetPositionProvider0, function02, popupProperties2, function20, composer1, v3 >> 3 & 0x1FF0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
            popupProperties1 = popupProperties2;
        }
        else {
            composer1.skipToGroupEnd();
            alignment1 = alignment0;
            function01 = function00;
            popupProperties1 = popupProperties0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(alignment1, v4, function01, popupProperties1, function20, v1, v2));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void PopupTestTag(@NotNull String s, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-498879600);
        int v1 = (v & 6) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498879600, v1, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:428)");
            }
            CompositionLocalKt.CompositionLocalProvider(AndroidPopup_androidKt.a.provides(s), function20, composer1, v1 & 0x70 | ProvidedValue.$stable);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new aa.d(s, function20, v, 23));
        }
    }

    public static final Function2 access$Popup$lambda$1(State state0) {
        return (Function2)state0.getValue();
    }

    public static final int access$createFlags(boolean z, SecureFlagPolicy secureFlagPolicy0, boolean z1) {
        int v = z ? 0x40000 : 0x40008;
        if(secureFlagPolicy0 == SecureFlagPolicy.SecureOn) {
            v |= 0x2000;
        }
        return z1 ? v : v | 0x200;
    }

    public static final int access$flagsWithSecureFlagInherited(PopupProperties popupProperties0, boolean z) {
        if(popupProperties0.getInheritSecurePolicy$ui_release() && z) {
            return popupProperties0.getFlags$ui_release() | 0x2000;
        }
        return !popupProperties0.getInheritSecurePolicy$ui_release() || z ? popupProperties0.getFlags$ui_release() : popupProperties0.getFlags$ui_release() & 0xFFFFDFFF;
    }

    public static final IntRect access$toIntBounds(Rect rect0) {
        return new IntRect(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalPopupTestTag() {
        return AndroidPopup_androidKt.a;
    }

    public static final boolean isFlagSecureEnabled(@NotNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getRootView().getLayoutParams();
        WindowManager.LayoutParams windowManager$LayoutParams0 = viewGroup$LayoutParams0 instanceof WindowManager.LayoutParams ? ((WindowManager.LayoutParams)viewGroup$LayoutParams0) : null;
        return windowManager$LayoutParams0 != null && (windowManager$LayoutParams0.flags & 0x2000) != 0;
    }

    // 去混淆评级： 低(30)
    @TestOnly
    public static final boolean isPopupLayout(@NotNull View view0, @Nullable String s) {
        return view0 instanceof PopupLayout && (s == null || Intrinsics.areEqual(s, ((PopupLayout)view0).getTestTag()));
    }

    public static boolean isPopupLayout$default(View view0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            s = null;
        }
        return AndroidPopup_androidKt.isPopupLayout(view0, s);
    }
}

