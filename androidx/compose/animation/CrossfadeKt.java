package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.material3.v2;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import s.a0;
import s.x;
import s.y;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001AN\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u0002H\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00052\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001A\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000BH\u0007¢\u0006\u0002\u0010\f\u001AX\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u0002H\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00052\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\r\u001A\u00020\u000E2\u0017\u0010\t\u001A\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000BH\u0007¢\u0006\u0002\u0010\u000F\u001A\u0086\u0001\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\b\b\u0002\u0010\u0004\u001A\u00020\u00052\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u00072%\b\u0002\u0010\u0011\u001A\u001F\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00140\n2&\u0010\t\u001A\"\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000BH\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\u0010\u0010\u0017\u001A\u00020\b\"\u0004\b\u0000\u0010\u0002X\u008A\u0084\u0002"}, d2 = {"Crossfade", "", "T", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "contentKey", "Lkotlin/ParameterName;", "name", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,146:1\n1223#2,3:147\n1226#2,3:151\n1223#2,6:154\n1223#2,6:160\n1#3:150\n350#4,7:166\n33#5,6:173\n33#5,6:214\n68#6,6:179\n74#6:213\n78#6:224\n78#7,11:185\n91#7:223\n456#8,8:196\n464#8,3:210\n467#8,3:220\n3737#9,6:204\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n*L\n105#1:147,3\n105#1:151,3\n106#1:154,6\n111#1:160,6\n117#1:166,7\n126#1:173,6\n139#1:214,6\n138#1:179,6\n138#1:213\n138#1:224\n138#1:185,11\n138#1:223\n138#1:196,8\n138#1:210,3\n138#1:220,3\n138#1:204,6\n*E\n"})
public final class CrossfadeKt {
    @ExperimentalAnimationApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Crossfade(@NotNull Transition transition0, @Nullable Modifier modifier0, @Nullable FiniteAnimationSpec finiteAnimationSpec0, @Nullable Function1 function10, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Function1 function11;
        FiniteAnimationSpec finiteAnimationSpec1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(679005231);
        if((v1 & 0x80000000) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(transition0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 1) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(finiteAnimationSpec0) ? 0x100 : 0x80);
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier1 = Modifier.Companion;
            }
            FiniteAnimationSpec finiteAnimationSpec2 = (v1 & 2) == 0 ? finiteAnimationSpec0 : AnimationSpecKt.tween$default(0, 0, null, 7, null);
            Function1 function12 = (v1 & 4) == 0 ? function10 : x.w;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(679005231, v2, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
            }
            SnapshotStateList snapshotStateList0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(snapshotStateList0 == composer$Companion0.getEmpty()) {
                snapshotStateList0 = SnapshotStateKt.mutableStateListOf();
                snapshotStateList0.add(transition0.getCurrentState());
                composer1.updateRememberedValue(snapshotStateList0);
            }
            MutableScatterMap mutableScatterMap0 = composer1.rememberedValue();
            if(mutableScatterMap0 == composer$Companion0.getEmpty()) {
                mutableScatterMap0 = ScatterMapKt.mutableScatterMapOf();
                composer1.updateRememberedValue(mutableScatterMap0);
            }
            if(Intrinsics.areEqual(transition0.getCurrentState(), transition0.getTargetState())) {
                composer1.startReplaceGroup(860660313);
                if(snapshotStateList0.size() != 1 || !Intrinsics.areEqual(snapshotStateList0.get(0), transition0.getTargetState())) {
                    composer1.startReplaceGroup(0x334EAF2B);
                    y y0 = composer1.rememberedValue();
                    if((v2 & 14) == 4 || y0 == composer$Companion0.getEmpty()) {
                        y0 = new y(transition0, 0);
                        composer1.updateRememberedValue(y0);
                    }
                    o.removeAll(snapshotStateList0, y0);
                    mutableScatterMap0.clear();
                }
                else {
                    composer1.startReplaceGroup(860984945);
                }
                composer1.endReplaceGroup();
            }
            else {
                composer1.startReplaceGroup(860990897);
            }
            composer1.endReplaceGroup();
            if(mutableScatterMap0.contains(transition0.getTargetState())) {
                composer1.startReplaceGroup(0x335E3631);
            }
            else {
                composer1.startReplaceGroup(861052122);
                int v3 = 0;
                Iterator iterator0 = snapshotStateList0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        v3 = -1;
                        break;
                    }
                    Object object0 = iterator0.next();
                    if(Intrinsics.areEqual(function12.invoke(object0), function12.invoke(transition0.getTargetState()))) {
                        break;
                    }
                    ++v3;
                }
                if(v3 == -1) {
                    snapshotStateList0.add(transition0.getTargetState());
                }
                else {
                    snapshotStateList0.set(v3, transition0.getTargetState());
                }
                mutableScatterMap0.clear();
                int v4 = snapshotStateList0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    Object object1 = snapshotStateList0.get(v5);
                    mutableScatterMap0.set(object1, ComposableLambdaKt.rememberComposableLambda(0xAAFA89D8, true, new a0(transition0, finiteAnimationSpec2, object1, function30), composer1, 54));
                }
            }
            composer1.endReplaceGroup();
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer1, 0, -1323940314);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.modifierMaterializerOf(modifier1);
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
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                androidx.room.a.t(v6, composer1, v6, function20);
            }
            a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            composer1.startReplaceGroup(0xF4D33EC0);
            int v7 = snapshotStateList0.size();
            for(int v8 = 0; v8 < v7; ++v8) {
                Object object2 = snapshotStateList0.get(v8);
                composer1.startMovableGroup(0xBF83EBDB, function12.invoke(object2));
                Function2 function21 = (Function2)mutableScatterMap0.get(object2);
                if(function21 == null) {
                    composer1.startReplaceGroup(0x30FA588A);
                }
                else {
                    composer1.startReplaceGroup(0xBF83F257);
                    function21.invoke(composer1, 0);
                }
                composer1.endReplaceGroup();
                composer1.endMovableGroup();
            }
            composer1.endReplaceGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            finiteAnimationSpec1 = finiteAnimationSpec2;
            function11 = function12;
        }
        else {
            composer1.skipToGroupEnd();
            finiteAnimationSpec1 = finiteAnimationSpec0;
            function11 = function10;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v2(transition0, modifier1, finiteAnimationSpec1, function11, function30, v, v1, 4));
        }
    }

    @Composable
    public static final void Crossfade(Object object0, @Nullable Modifier modifier0, @Nullable FiniteAnimationSpec finiteAnimationSpec0, @Nullable String s, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        FiniteAnimationSpec finiteAnimationSpec1;
        Modifier modifier1;
        String s1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xED7B4BE0);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(object0) : composer1.changedInstance(object0)) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changedInstance(finiteAnimationSpec0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            s1 = s;
        }
        else if((v & 0xC00) == 0) {
            s1 = s;
            v2 |= (composer1.changed(s1) ? 0x800 : 0x400);
        }
        else {
            s1 = s;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            FiniteAnimationSpec finiteAnimationSpec2 = (v1 & 4) == 0 ? finiteAnimationSpec0 : AnimationSpecKt.tween$default(0, 0, null, 7, null);
            String s2 = (v1 & 8) == 0 ? s1 : "Crossfade";
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xED7B4BE0, v2, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
            }
            CrossfadeKt.Crossfade(TransitionKt.updateTransition(object0, s2, composer1, v2 & 14 | v2 >> 6 & 0x70, 0), modifier1, finiteAnimationSpec2, null, function30, composer1, v2 & 0xE3F0, 4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            s1 = s2;
            finiteAnimationSpec1 = finiteAnimationSpec2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            finiteAnimationSpec1 = finiteAnimationSpec0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v2(object0, modifier1, finiteAnimationSpec1, s1, function30, v, v1, 3));
        }
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    public static final void Crossfade(Object object0, Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, Function3 function30, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(523603005);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(object0) : composer1.changedInstance(object0)) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changedInstance(finiteAnimationSpec0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                modifier0 = Modifier.Companion;
            }
            if((v1 & 4) != 0) {
                finiteAnimationSpec0 = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523603005, v2, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:71)");
            }
            CrossfadeKt.Crossfade(TransitionKt.updateTransition(object0, null, composer1, v2 & 14, 2), modifier0, finiteAnimationSpec0, null, function30, composer1, v2 & 0x3F0 | v2 << 3 & 0xE000, 4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(object0, modifier0, finiteAnimationSpec0, function30, v, v1, 8));
        }
    }
}

