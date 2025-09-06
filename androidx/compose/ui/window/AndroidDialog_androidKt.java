package androidx.compose.ui.window;

import android.view.View;
import androidx.activity.g0;
import androidx.compose.foundation.text.selection.t;
import androidx.compose.material3.sf;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v2.a;
import v2.c;
import v2.d;
import v2.f;
import v2.o;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A:\u0010\u0007\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u0011\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\u0017\u0010\t\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00058\nX\u008A\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/DialogProperties;", "properties", "Landroidx/compose/runtime/Composable;", "content", "Dialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,478:1\n77#2:479\n77#2:480\n77#2:481\n1223#3,6:482\n1223#3,6:488\n1223#3,6:494\n78#4,6:500\n85#4,4:515\n89#4,2:525\n93#4:530\n368#5,9:506\n377#5,3:527\n4032#6,6:519\n81#7:531\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n*L\n168#1:479\n169#1:480\n170#1:481\n174#1:482,6\n195#1:488,6\n204#1:494,6\n466#1:500,6\n466#1:515,4\n466#1:525,2\n466#1:530\n466#1:506,9\n466#1:527,3\n466#1:519,6\n172#1:531\n*E\n"})
public final class AndroidDialog_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Dialog(@NotNull Function0 function00, @Nullable DialogProperties dialogProperties0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        DialogProperties dialogProperties1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-2032877254);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(dialogProperties0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            DialogProperties dialogProperties2 = (v1 & 2) == 0 ? dialogProperties0 : new DialogProperties(false, false, false, 7, null);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2032877254, v2, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:166)");
            }
            View view0 = (View)composer1.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            Object object1 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext compositionContext0 = ComposablesKt.rememberCompositionContext(composer1, 0);
            State state0 = SnapshotStateKt.rememberUpdatedState(function20, composer1, v2 >> 6 & 14);
            Object object2 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, d.x, composer1, 0xC00, 6);
            boolean z = composer1.changed(view0);
            boolean z1 = composer1.changed(((Density)object0));
            o o0 = composer1.rememberedValue();
            if(z || z1 || o0 == Composer.Companion.getEmpty()) {
                o o1 = new o(function00, dialogProperties2, view0, ((LayoutDirection)object1), ((Density)object0), ((UUID)object2));
                ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x1D1A4619, true, new c(state0));
                o1.g.setParentCompositionContext(compositionContext0);
                o1.g.F.setValue(composableLambda0);
                o1.g.H = true;
                o1.g.createComposition();
                composer1.updateRememberedValue(o1);
                o0 = o1;
            }
            boolean z2 = composer1.changedInstance(o0);
            a a0 = composer1.rememberedValue();
            if(z2 || a0 == Composer.Companion.getEmpty()) {
                a0 = new a(o0, 0);
                composer1.updateRememberedValue(a0);
            }
            EffectsKt.DisposableEffect(o0, a0, composer1, 0);
            boolean z3 = composer1.changedInstance(o0);
            boolean z4 = composer1.changed(((LayoutDirection)object1));
            g0 g00 = composer1.rememberedValue();
            if((z3 | (v2 & 14) == 4 | ((v2 & 0x70) == 0x20 ? 1 : 0) | z4) != 0 || g00 == Composer.Companion.getEmpty()) {
                g00 = new g0(9, o0, function00, dialogProperties2, ((LayoutDirection)object1));
                composer1.updateRememberedValue(g00);
            }
            EffectsKt.SideEffect(g00, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            dialogProperties1 = dialogProperties2;
        }
        else {
            composer1.skipToGroupEnd();
            dialogProperties1 = dialogProperties0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(function00, dialogProperties1, function20, v, v1, 19));
        }
    }

    public static final Function2 access$Dialog$lambda$0(State state0) {
        return (Function2)state0.getValue();
    }

    public static final void access$DialogLayout(Modifier modifier0, Function2 function20, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xB9CB0778);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v2 & 19) != 18 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB9CB0778, v2, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:464)");
            }
            f f0 = f.a;
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Updater.set-impl(composer1, f0, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Function2 function21 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                androidx.room.a.t(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(((v2 >> 3 & 14 | 0x180 | v2 << 3 & 0x70) << 6 & 0x380 | 6) >> 6 & 14)));
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t(modifier0, function20, v, v1, 2));
        }
    }
}

