package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.material3.n7;
import androidx.compose.material3.sf;
import androidx.compose.material3.v2;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u2.a;
import u2.k;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001AM\u0010\t\u001A\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0014\b\u0002\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001A{\u0010\t\u001A\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0016\b\u0002\u0010\u000B\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\r\"(\u0010\u0013\u001A\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/Modifier;", "modifier", "", "update", "AndroidView", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onReset", "onRelease", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/ExtensionFunctionType;", "a", "Lkotlin/jvm/functions/Function1;", "getNoOpUpdate", "()Lkotlin/jvm/functions/Function1;", "NoOpUpdate", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,407:1\n77#2:408\n77#2:409\n77#2:410\n77#2:411\n77#2:434\n77#2:435\n77#2:436\n289#3,11:412\n254#3,11:423\n1223#4,6:437\n4032#5,6:443\n81#6,9:449\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n215#1:408\n216#1:409\n223#1:410\n224#1:411\n269#1:434\n271#1:435\n272#1:436\n227#1:412,11\n245#1:423,11\n274#1:437,6\n309#1:443,6\n315#1:449,9\n*E\n"})
public final class AndroidView_androidKt {
    public static final a a;

    static {
        AndroidView_androidKt.a = a.z;
    }

    @Composable
    @UiComposable
    public static final void AndroidView(@NotNull Function1 function10, @Nullable Modifier modifier0, @Nullable Function1 function11, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x95ADE287);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function10) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function11) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                modifier0 = Modifier.Companion;
            }
            a a0 = AndroidView_androidKt.a;
            if((v1 & 4) != 0) {
                function11 = a0;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x95ADE287, v2, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:107)");
            }
            AndroidView_androidKt.AndroidView(function10, modifier0, null, a0, function11, composer1, v2 & 14 | 0xC00 | v2 & 0x70 | v2 << 6 & 0xE000, 4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(function10, modifier0, function11, v, v1, 18));
        }
    }

    @Composable
    @UiComposable
    public static final void AndroidView(@NotNull Function1 function10, @Nullable Modifier modifier0, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        Function1 function16;
        Function1 function15;
        Function1 function14;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-180024211);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function10) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function14 = function11;
        }
        else if((v & 0x180) == 0) {
            function14 = function11;
            v2 |= (composer1.changedInstance(function14) ? 0x100 : 0x80);
        }
        else {
            function14 = function11;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function15 = function12;
        }
        else if((v & 0xC00) == 0) {
            function15 = function12;
            v2 |= (composer1.changedInstance(function15) ? 0x800 : 0x400);
        }
        else {
            function15 = function12;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function16 = function13;
        }
        else if((v & 0x6000) == 0) {
            function16 = function13;
            v2 |= (composer1.changedInstance(function16) ? 0x4000 : 0x2000);
        }
        else {
            function16 = function13;
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            if((v1 & 4) != 0) {
                function14 = null;
            }
            a a0 = AndroidView_androidKt.a;
            if((v1 & 8) != 0) {
                function15 = a0;
            }
            if((v1 & 16) != 0) {
                function16 = a0;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-180024211, v2, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:211)");
            }
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, FocusGroupNode_androidKt.focusInteropModifier(modifier1));
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            Object object1 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Object object2 = composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Object object3 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            if(function14 == null) {
                composer1.startReplaceGroup(0x24486EF9);
                Function0 function01 = AndroidView_androidKt.a(function10, composer1, v2 & 14);
                if(!(composer1.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function01);
                }
                else {
                    composer1.useNode();
                }
                AndroidView_androidKt.b(composer1, modifier2, v3, ((Density)object0), ((LifecycleOwner)object2), ((SavedStateRegistryOwner)object3), ((LayoutDirection)object1), compositionLocalMap0);
                Updater.set-impl(composer1, function16, k.A);
                Updater.set-impl(composer1, function15, k.B);
            }
            else {
                composer1.startReplaceGroup(607871394);
                Function0 function00 = AndroidView_androidKt.a(function10, composer1, v2 & 14);
                if(!(composer1.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function00);
                }
                else {
                    composer1.useNode();
                }
                AndroidView_androidKt.b(composer1, modifier2, v3, ((Density)object0), ((LifecycleOwner)object2), ((SavedStateRegistryOwner)object3), ((LayoutDirection)object1), compositionLocalMap0);
                Updater.set-impl(composer1, function14, k.x);
                Updater.set-impl(composer1, function16, k.y);
                Updater.set-impl(composer1, function15, k.z);
            }
            composer1.endNode();
            composer1.endReplaceGroup();
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
            scopeUpdateScope0.updateScope(new v2(function10, modifier1, function14, function15, function16, v, v1, 5));
        }
    }

    public static final Function0 a(Function1 function10, Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030558801, v, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:266)");
        }
        boolean z = false;
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        CompositionContext compositionContext0 = ComposablesKt.rememberCompositionContext(composer0, 0);
        Object object1 = composer0.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        Object object2 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalView());
        boolean z1 = composer0.changedInstance(((Context)object0));
        if((v & 14 ^ 6) > 4 && composer0.changed(function10) || (v & 6) == 4) {
            z = true;
        }
        boolean z2 = composer0.changedInstance(compositionContext0);
        boolean z3 = composer0.changedInstance(((SaveableStateRegistry)object1));
        boolean z4 = composer0.changed(v1);
        boolean z5 = composer0.changedInstance(((View)object2));
        n7 n70 = composer0.rememberedValue();
        if((z1 | z | z2 | z3 | z4 | z5) != 0 || n70 == Composer.Companion.getEmpty()) {
            n70 = new n7(((Context)object0), function10, compositionContext0, ((SaveableStateRegistry)object1), v1, ((View)object2), 2);
            composer0.updateRememberedValue(n70);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return n70;
    }

    public static final ViewFactoryHolder access$requireViewFactoryHolder(LayoutNode layoutNode0) {
        AndroidViewHolder androidViewHolder0 = layoutNode0.getInteropViewFactoryHolder$ui_release();
        if(androidViewHolder0 == null) {
            throw l1.a.b("Required value was null.");
        }
        return (ViewFactoryHolder)androidViewHolder0;
    }

    public static final void b(Composer composer0, Modifier modifier0, int v, Density density0, LifecycleOwner lifecycleOwner0, SavedStateRegistryOwner savedStateRegistryOwner0, LayoutDirection layoutDirection0, CompositionLocalMap compositionLocalMap0) {
        Updater.set-impl(composer0, compositionLocalMap0, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.set-impl(composer0, modifier0, k.C);
        Updater.set-impl(composer0, density0, k.D);
        Updater.set-impl(composer0, lifecycleOwner0, k.E);
        Updater.set-impl(composer0, savedStateRegistryOwner0, k.F);
        Updater.set-impl(composer0, layoutDirection0, k.G);
        Function2 function20 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v)) {
            androidx.room.a.t(v, composer0, v, function20);
        }
    }

    @NotNull
    public static final Function1 getNoOpUpdate() {
        return AndroidView_androidKt.a;
    }
}

