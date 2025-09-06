package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.e0;
import androidx.compose.material3.i3;
import androidx.compose.material3.ki;
import androidx.compose.material3.pi;
import androidx.compose.material3.t5;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.c;
import s.o;
import s.r;
import s.s;
import s.u;
import s.v;

@Metadata(d1 = {"\u0000d\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A]\u0010\u0010\u001A\u00020\f2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001Aa\u0010\u0010\u001A\u00020\f*\u00020\u00122\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0013\u001Aa\u0010\u0010\u001A\u00020\f*\u00020\u00142\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0015\u001Ac\u0010\u0010\u001A\u00020\f2\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0018\u001Ag\u0010\u0010\u001A\u00020\f*\u00020\u00122\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0019\u001Ag\u0010\u0010\u001A\u00020\f*\u00020\u00142\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u001A\u001Ao\u0010\u0010\u001A\u00020\f\"\u0004\b\u0000\u0010\u001B*\b\u0012\u0004\u0012\u00028\u00000\u001C2\u0012\u0010\u0001\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u001D\u001Am\u0010\u001F\u001A\u00020\f\"\u0004\b\u0000\u0010\u001B2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001C2\u0012\u0010\u0001\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\b\u000EH\u0001\u00A2\u0006\u0004\b\u001F\u0010 \u001A\u0093\u0001\u0010&\u001A\u00020\f\"\u0004\b\u0000\u0010\u001B2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001C2\u0012\u0010\u0001\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0018\u0010#\u001A\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00000!2\n\b\u0002\u0010%\u001A\u0004\u0018\u00010$2\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n\u00A2\u0006\u0002\b\r\u00A2\u0006\u0002\b\u000EH\u0001\u00A2\u0006\u0004\b&\u0010\'\u00A8\u0006*\u00B2\u0006$\u0010(\u001A\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00000!\"\u0004\b\u0000\u0010\u001B8\nX\u008A\u0084\u0002\u00B2\u0006\u0012\u0010)\u001A\u00020\u0000\"\u0004\b\u0000\u0010\u001B8\nX\u008A\u0084\u0002"}, d2 = {"", "visible", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", "exit", "", "label", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "AnimatedVisibility", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/MutableTransitionState;", "visibleState", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "T", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "transition", "AnimatedVisibilityImpl", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "Landroidx/compose/animation/EnterExitState;", "shouldDisposeBlock", "Landroidx/compose/animation/OnLookaheadMeasured;", "onLookaheadMeasured", "AnimatedEnterExitImpl", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/OnLookaheadMeasured;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,885:1\n1223#2,6:886\n1223#2,6:894\n1223#2,6:903\n1223#2,6:909\n1223#2,6:915\n1223#2,6:921\n1223#2,6:958\n1811#3,2:892\n1813#3,3:900\n78#4,6:927\n85#4,4:942\n89#4,2:952\n93#4:957\n368#5,9:933\n377#5,3:954\n4032#6,6:946\n81#7:964\n81#7:965\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n*L\n698#1:886,6\n742#1:894,6\n753#1:903,6\n769#1:909,6\n776#1:915,6\n795#1:921,6\n869#1:958,6\n742#1:892,2\n742#1:900,3\n770#1:927,6\n770#1:942,4\n770#1:952,2\n770#1:957\n770#1:933,9\n770#1:954,3\n770#1:946,6\n746#1:964\n748#1:965\n*E\n"})
public final class AnimatedVisibilityKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void AnimatedEnterExitImpl(@NotNull Transition transition0, @NotNull Function1 function10, @NotNull Modifier modifier0, @NotNull EnterTransition enterTransition0, @NotNull ExitTransition exitTransition0, @NotNull Function2 function20, @Nullable OnLookaheadMeasured onLookaheadMeasured0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        OnLookaheadMeasured onLookaheadMeasured1;
        OnLookaheadMeasured onLookaheadMeasured3;
        Modifier modifier2;
        int v4;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xCAD5A942);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(transition0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(enterTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(exitTransition0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (((v & 0x200000) == 0 ? composer1.changed(onLookaheadMeasured0) : composer1.changedInstance(onLookaheadMeasured0)) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v2) != 4793490 || !composer1.getSkipping()) {
            OnLookaheadMeasured onLookaheadMeasured2 = (v1 & 0x40) == 0 ? onLookaheadMeasured0 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCAD5A942, v2, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)");
            }
            if(((Boolean)function10.invoke(transition0.getTargetState())).booleanValue() || ((Boolean)function10.invoke(transition0.getCurrentState())).booleanValue() || transition0.isSeeking() || transition0.getHasInitialValueAnimations()) {
                composer1.startReplaceGroup(0x6A9260D1);
                int v3 = v2 & 14 | 0x30;
                boolean z = true;
                boolean z1 = (v3 & 14 ^ 6) > 4 && composer1.changed(transition0) || (v3 & 6) == 4;
                Object object0 = composer1.rememberedValue();
                if(z1 || object0 == Composer.Companion.getEmpty()) {
                    object0 = transition0.getCurrentState();
                    composer1.updateRememberedValue(object0);
                }
                if(transition0.isSeeking()) {
                    object0 = transition0.getCurrentState();
                }
                composer1.startReplaceGroup(0xE42FFE03);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xE42FFE03, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                }
                EnterExitState enterExitState0 = AnimatedVisibilityKt.a(transition0, function10, object0, composer1, v2 & 0x7E);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer1.endReplaceGroup();
                Object object1 = transition0.getTargetState();
                composer1.startReplaceGroup(0xE42FFE03);
                if(ComposerKt.isTraceInProgress()) {
                    v4 = v2;
                    ComposerKt.traceEventStart(0xE42FFE03, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                }
                else {
                    v4 = v2;
                }
                EnterExitState enterExitState1 = AnimatedVisibilityKt.a(transition0, function10, object1, composer1, v2 & 0x7E);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer1.endReplaceGroup();
                Transition transition1 = TransitionKt.createChildTransitionInternal(transition0, enterExitState0, enterExitState1, "EnterExitTransition", composer1, v3 & 14 | 0xC00);
                State state0 = SnapshotStateKt.rememberUpdatedState(function20, composer1, v4 >> 15 & 14);
                Object object2 = function20.invoke(transition1.getCurrentState(), transition1.getTargetState());
                boolean z2 = composer1.changed(transition1);
                boolean z3 = composer1.changed(state0);
                r r0 = composer1.rememberedValue();
                if(z2 || z3 || r0 == Composer.Companion.getEmpty()) {
                    r0 = new r(transition1, state0, null);
                    composer1.updateRememberedValue(r0);
                }
                State state1 = SnapshotStateKt.produceState(object2, r0, composer1, 0);
                if(transition1.getCurrentState() != EnterExitState.PostExit || transition1.getTargetState() != EnterExitState.PostExit || !((Boolean)state1.getValue()).booleanValue()) {
                    composer1.startReplaceGroup(0x6A9FFBB7);
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl0 = composer1.rememberedValue();
                    if((v2 & 14) == 4 || animatedVisibilityScopeImpl0 == Composer.Companion.getEmpty()) {
                        animatedVisibilityScopeImpl0 = new AnimatedVisibilityScopeImpl(transition1);
                        composer1.updateRememberedValue(animatedVisibilityScopeImpl0);
                    }
                    onLookaheadMeasured3 = onLookaheadMeasured2;
                    Modifier modifier1 = EnterExitTransitionKt.createModifier(transition1, enterTransition0, exitTransition0, null, "Built-in", composer1, v4 >> 6 & 0x70 | 0x6000 | v4 >> 6 & 0x380, 4);
                    if(onLookaheadMeasured3 == null) {
                        composer1.startReplaceGroup(0x5E47D710);
                        composer1.endReplaceGroup();
                        modifier2 = Modifier.Companion;
                    }
                    else {
                        composer1.startReplaceGroup(0x6AA57161);
                        Companion modifier$Companion0 = Modifier.Companion;
                        if((v4 & 0x380000) != 0x100000 && ((v4 & 0x200000) == 0 || !composer1.changedInstance(onLookaheadMeasured3))) {
                            z = false;
                        }
                        e0 e00 = composer1.rememberedValue();
                        if(z || e00 == Composer.Companion.getEmpty()) {
                            e00 = new e0(onLookaheadMeasured3, 11);
                            composer1.updateRememberedValue(e00);
                        }
                        modifier2 = LayoutModifierKt.layout(modifier$Companion0, e00);
                        composer1.endReplaceGroup();
                    }
                    Modifier modifier3 = modifier0.then(modifier1.then(modifier2));
                    o o0 = composer1.rememberedValue();
                    if(o0 == Composer.Companion.getEmpty()) {
                        o0 = new o(animatedVisibilityScopeImpl0);
                        composer1.updateRememberedValue(o0);
                    }
                    int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                    CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
                    Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
                    androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
                    Updater.set-impl(composer1, o0, composeUiNode$Companion0.getSetMeasurePolicy());
                    Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
                    Function2 function21 = composeUiNode$Companion0.getSetCompositeKeyHash();
                    if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                        a.t(v5, composer1, v5, function21);
                    }
                    Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
                    function30.invoke(animatedVisibilityScopeImpl0, composer1, ((int)(v4 >> 18 & 0x70)));
                    composer1.endNode();
                    composer1.endReplaceGroup();
                }
                else {
                    composer1.startReplaceGroup(1790256282);
                    composer1.endReplaceGroup();
                    onLookaheadMeasured3 = onLookaheadMeasured2;
                }
                composer1.endReplaceGroup();
            }
            else {
                composer1.startReplaceGroup(1790262234);
                composer1.endReplaceGroup();
                onLookaheadMeasured3 = onLookaheadMeasured2;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onLookaheadMeasured1 = onLookaheadMeasured3;
        }
        else {
            composer1.skipToGroupEnd();
            onLookaheadMeasured1 = onLookaheadMeasured0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o4.o(transition0, function10, modifier0, enterTransition0, exitTransition0, function20, onLookaheadMeasured1, function30, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(@NotNull MutableTransitionState mutableTransitionState0, @Nullable Modifier modifier0, @Nullable EnterTransition enterTransition0, @Nullable ExitTransition exitTransition0, @Nullable String s, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        String s1;
        EnterTransition enterTransition1;
        Modifier modifier1;
        ExitTransition exitTransition1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xF2B6D706);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(mutableTransitionState0) : composer1.changedInstance(mutableTransitionState0)) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changed(enterTransition0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            exitTransition1 = exitTransition0;
        }
        else if((v & 0xC00) == 0) {
            exitTransition1 = exitTransition0;
            v2 |= (composer1.changed(exitTransition1) ? 0x800 : 0x400);
        }
        else {
            exitTransition1 = exitTransition0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(s) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) != 74898 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            ExitTransition exitTransition2 = (v1 & 8) == 0 ? exitTransition1 : EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
            String s2 = (v1 & 16) == 0 ? s : "AnimatedVisibility";
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF2B6D706, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
            }
            AnimatedVisibilityKt.AnimatedVisibilityImpl(TransitionKt.rememberTransition(mutableTransitionState0, s2, composer1, MutableTransitionState.$stable | v2 & 14 | v2 >> 9 & 0x70, 0), s.B, modifier1, enterTransition2, exitTransition2, function30, composer1, v2 << 3 & 0xE000 | (v2 << 3 & 0x380 | 0x30 | v2 << 3 & 0x1C00) | v2 & 0x70000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            exitTransition1 = exitTransition2;
            s1 = s2;
            enterTransition1 = enterTransition2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            enterTransition1 = enterTransition0;
            s1 = s;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pi(mutableTransitionState0, modifier1, enterTransition1, exitTransition1, s1, function30, v, v1, 6));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(@NotNull Transition transition0, @NotNull Function1 function10, @Nullable Modifier modifier0, @Nullable EnterTransition enterTransition0, @Nullable ExitTransition exitTransition0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        ExitTransition exitTransition1;
        Modifier modifier1;
        EnterTransition enterTransition1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1031950689);
        if((v1 & 0x80000000) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(transition0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 1) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
            enterTransition1 = enterTransition0;
        }
        else if((v & 0xC00) == 0) {
            enterTransition1 = enterTransition0;
            v2 |= (composer1.changed(enterTransition1) ? 0x800 : 0x400);
        }
        else {
            enterTransition1 = enterTransition0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(exitTransition0) ? 0x4000 : 0x2000);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) != 74898 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition1 : EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            ExitTransition exitTransition2 = (v1 & 8) == 0 ? exitTransition0 : EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1031950689, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:609)");
            }
            AnimatedVisibilityKt.AnimatedVisibilityImpl(transition0, function10, modifier2, enterTransition2, exitTransition2, function30, composer1, 0x7FFFE & v2);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            exitTransition1 = exitTransition2;
            enterTransition1 = enterTransition2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            exitTransition1 = exitTransition0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pi(transition0, function10, modifier1, enterTransition1, exitTransition1, function30, v, v1, 5));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(@NotNull ColumnScope columnScope0, @NotNull MutableTransitionState mutableTransitionState0, @Nullable Modifier modifier0, @Nullable EnterTransition enterTransition0, @Nullable ExitTransition exitTransition0, @Nullable String s, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        String s1;
        ExitTransition exitTransition1;
        EnterTransition enterTransition1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xCD4C0296);
        if((v1 & 1) == 0) {
            v2 = (v & 0x30) == 0 ? (((v & 0x40) == 0 ? composer1.changed(mutableTransitionState0) : composer1.changedInstance(mutableTransitionState0)) ? 0x20 : 16) | v : v;
        }
        else {
            v2 = v | 0x30;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(enterTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(exitTransition0) ? 0x4000 : 0x2000);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(s) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((0x92491 & v2) != 0x92490 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            exitTransition1 = (v1 & 8) == 0 ? exitTransition0 : EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            String s2 = (v1 & 16) == 0 ? s : "AnimatedVisibility";
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCD4C0296, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:535)");
            }
            AnimatedVisibilityKt.AnimatedVisibilityImpl(TransitionKt.rememberTransition(mutableTransitionState0, s2, composer1, MutableTransitionState.$stable | v2 >> 3 & 14 | v2 >> 12 & 0x70, 0), s.x, modifier2, enterTransition2, exitTransition1, function30, composer1, v2 & 0xE000 | (v2 & 0x380 | 0x30 | v2 & 0x1C00) | v2 >> 3 & 0x70000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            enterTransition1 = enterTransition2;
            s1 = s2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            enterTransition1 = enterTransition0;
            exitTransition1 = exitTransition0;
            s1 = s;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(columnScope0, mutableTransitionState0, modifier1, enterTransition1, exitTransition1, s1, function30, v, v1, 2));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(@NotNull ColumnScope columnScope0, boolean z, @Nullable Modifier modifier0, @Nullable EnterTransition enterTransition0, @Nullable ExitTransition exitTransition0, @Nullable String s, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        String s1;
        ExitTransition exitTransition1;
        EnterTransition enterTransition1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1766503102);
        if((v1 & 1) == 0) {
            v2 = (v & 0x30) == 0 ? (composer1.changed(z) ? 0x20 : 16) | v : v;
        }
        else {
            v2 = v | 0x30;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(enterTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(exitTransition0) ? 0x4000 : 0x2000);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(s) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((0x92491 & v2) != 0x92490 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
            exitTransition1 = (v1 & 8) == 0 ? exitTransition0 : EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
            String s2 = (v1 & 16) == 0 ? s : "AnimatedVisibility";
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1766503102, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
            }
            AnimatedVisibilityKt.AnimatedVisibilityImpl(TransitionKt.updateTransition(Boolean.valueOf(z), s2, composer1, v2 >> 3 & 14 | v2 >> 12 & 0x70, 0), s.A, modifier2, enterTransition2, exitTransition1, function30, composer1, v2 & 0xE000 | (v2 & 0x380 | 0x30 | v2 & 0x1C00) | v2 >> 3 & 0x70000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            enterTransition1 = enterTransition2;
            s1 = s2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            enterTransition1 = enterTransition0;
            exitTransition1 = exitTransition0;
            s1 = s;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t5(columnScope0, z, modifier1, enterTransition1, exitTransition1, s1, function30, v, v1, 6));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(@NotNull RowScope rowScope0, @NotNull MutableTransitionState mutableTransitionState0, @Nullable Modifier modifier0, @Nullable EnterTransition enterTransition0, @Nullable ExitTransition exitTransition0, @Nullable String s, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        String s1;
        ExitTransition exitTransition1;
        EnterTransition enterTransition1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(836509870);
        if((v1 & 1) == 0) {
            v2 = (v & 0x30) == 0 ? (((v & 0x40) == 0 ? composer1.changed(mutableTransitionState0) : composer1.changedInstance(mutableTransitionState0)) ? 0x20 : 16) | v : v;
        }
        else {
            v2 = v | 0x30;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(enterTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(exitTransition0) ? 0x4000 : 0x2000);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(s) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((0x92491 & v2) != 0x92490 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            exitTransition1 = (v1 & 8) == 0 ? exitTransition0 : EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            String s2 = (v1 & 16) == 0 ? s : "AnimatedVisibility";
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(836509870, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:459)");
            }
            AnimatedVisibilityKt.AnimatedVisibilityImpl(TransitionKt.rememberTransition(mutableTransitionState0, s2, composer1, MutableTransitionState.$stable | v2 >> 3 & 14 | v2 >> 12 & 0x70, 0), s.C, modifier2, enterTransition2, exitTransition1, function30, composer1, v2 & 0xE000 | (v2 & 0x380 | 0x30 | v2 & 0x1C00) | v2 >> 3 & 0x70000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            enterTransition1 = enterTransition2;
            s1 = s2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            enterTransition1 = enterTransition0;
            exitTransition1 = exitTransition0;
            s1 = s;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(rowScope0, mutableTransitionState0, modifier1, enterTransition1, exitTransition1, s1, function30, v, v1, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(@NotNull RowScope rowScope0, boolean z, @Nullable Modifier modifier0, @Nullable EnterTransition enterTransition0, @Nullable ExitTransition exitTransition0, @Nullable String s, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        String s1;
        ExitTransition exitTransition1;
        EnterTransition enterTransition1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-1741346906);
        if((v1 & 1) == 0) {
            v2 = (v & 0x30) == 0 ? (composer1.changed(z) ? 0x20 : 16) | v : v;
        }
        else {
            v2 = v | 0x30;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(enterTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(exitTransition0) ? 0x4000 : 0x2000);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(s) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((0x92491 & v2) != 0x92490 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
            exitTransition1 = (v1 & 8) == 0 ? exitTransition0 : EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
            String s2 = (v1 & 16) == 0 ? s : "AnimatedVisibility";
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1741346906, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
            }
            AnimatedVisibilityKt.AnimatedVisibilityImpl(TransitionKt.updateTransition(Boolean.valueOf(z), s2, composer1, v2 >> 3 & 14 | v2 >> 12 & 0x70, 0), s.z, modifier2, enterTransition2, exitTransition1, function30, composer1, v2 & 0xE000 | (v2 & 0x380 | 0x30 | v2 & 0x1C00) | v2 >> 3 & 0x70000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            enterTransition1 = enterTransition2;
            s1 = s2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            enterTransition1 = enterTransition0;
            exitTransition1 = exitTransition0;
            s1 = s;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t5(rowScope0, z, modifier1, enterTransition1, exitTransition1, s1, function30, v, v1, 5));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(boolean z, @Nullable Modifier modifier0, @Nullable EnterTransition enterTransition0, @Nullable ExitTransition exitTransition0, @Nullable String s, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        String s1;
        EnterTransition enterTransition1;
        Modifier modifier1;
        ExitTransition exitTransition1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x7C7F8C4E);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changed(enterTransition0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            exitTransition1 = exitTransition0;
        }
        else if((v & 0xC00) == 0) {
            exitTransition1 = exitTransition0;
            v2 |= (composer1.changed(exitTransition1) ? 0x800 : 0x400);
        }
        else {
            exitTransition1 = exitTransition0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(s) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) != 74898 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            ExitTransition exitTransition2 = (v1 & 8) == 0 ? exitTransition1 : EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            String s2 = (v1 & 16) == 0 ? s : "AnimatedVisibility";
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7C7F8C4E, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
            }
            AnimatedVisibilityKt.AnimatedVisibilityImpl(TransitionKt.updateTransition(Boolean.valueOf(z), s2, composer1, v2 & 14 | v2 >> 9 & 0x70, 0), s.y, modifier1, enterTransition2, exitTransition2, function30, composer1, v2 << 3 & 0xE000 | (v2 << 3 & 0x380 | 0x30 | v2 << 3 & 0x1C00) | v2 & 0x70000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            exitTransition1 = exitTransition2;
            s1 = s2;
            enterTransition1 = enterTransition2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            enterTransition1 = enterTransition0;
            s1 = s;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i3(z, modifier1, enterTransition1, exitTransition1, s1, function30, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibilityImpl(@NotNull Transition transition0, @NotNull Function1 function10, @NotNull Modifier modifier0, @NotNull EnterTransition enterTransition0, @NotNull ExitTransition exitTransition0, @NotNull Function3 function30, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x19A0F3EB);
        int v1 = (v & 6) == 0 ? (composer1.changed(transition0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changed(enterTransition0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changed(exitTransition0) ? 0x4000 : 0x2000);
        }
        if((v & 0x30000) == 0) {
            v1 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x19A0F3EB, v1, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)");
            }
            u u0 = composer1.rememberedValue();
            if((((v1 & 0x70) == 0x20 ? 1 : 0) | ((v1 & 14) == 4 ? 1 : 0)) != 0 || u0 == Composer.Companion.getEmpty()) {
                u0 = new u(function10, transition0);
                composer1.updateRememberedValue(u0);
            }
            AnimatedVisibilityKt.AnimatedEnterExitImpl(transition0, function10, LayoutModifierKt.layout(modifier0, u0), enterTransition0, exitTransition0, v.x, null, function30, composer1, v1 & 0x70 | (0x30000 | v1 & 14) | v1 & 0x1C00 | 0xE000 & v1 | v1 << 6 & 0x1C00000, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ki(transition0, function10, modifier0, enterTransition0, exitTransition0, function30, v));
        }
    }

    public static final EnterExitState a(Transition transition0, Function1 function10, Object object0, Composer composer0, int v) {
        EnterExitState enterExitState0;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x158D233E, v, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)");
        }
        composer0.startMovableGroup(-902048200, transition0);
        if(transition0.isSeeking()) {
            composer0.startReplaceGroup(0x7D3F3E2B);
            composer0.endReplaceGroup();
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                enterExitState0 = EnterExitState.Visible;
            }
            else if(((Boolean)function10.invoke(transition0.getCurrentState())).booleanValue()) {
                enterExitState0 = EnterExitState.PostExit;
            }
            else {
                enterExitState0 = EnterExitState.PreEnter;
            }
        }
        else {
            composer0.startReplaceGroup(2101530516);
            MutableState mutableState0 = composer0.rememberedValue();
            if(mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer0.updateRememberedValue(mutableState0);
            }
            if(((Boolean)function10.invoke(transition0.getCurrentState())).booleanValue()) {
                mutableState0.setValue(Boolean.TRUE);
            }
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                enterExitState0 = EnterExitState.Visible;
            }
            else {
                enterExitState0 = ((Boolean)mutableState0.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            }
            composer0.endReplaceGroup();
        }
        composer0.endMovableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterExitState0;
    }

    public static final Function2 access$AnimatedEnterExitImpl$lambda$2(State state0) {
        return (Function2)state0.getValue();
    }

    public static final boolean access$getExitFinished(Transition transition0) {
        return transition0.getCurrentState() == EnterExitState.PostExit && transition0.getTargetState() == EnterExitState.PostExit;
    }
}

