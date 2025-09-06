package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.material3.pi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.c;
import s.d;
import s.e;
import s.g;
import s.q1;

@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u00B4\u0001\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u0002H\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00052\u001F\b\u0002\u0010\u0006\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\n2\b\b\u0002\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2%\b\u0002\u0010\u000F\u001A\u001F\u0012\u0013\u0012\u0011H\u0002\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001A-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014\u00A2\u0006\u0002\b\u0016\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0002\u0010\u0017\u001AP\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010\u001A\u001A\u00020\u001B2>\b\u0002\u0010\u001C\u001A8\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001D0 0\u0014\u001A\u00AC\u0001\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020!2\b\b\u0002\u0010\u0004\u001A\u00020\u00052\u001F\b\u0002\u0010\u0006\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\n2\b\b\u0002\u0010\u000B\u001A\u00020\f2%\b\u0002\u0010\u000F\u001A\u001F\u0012\u0013\u0012\u0011H\u0002\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001A-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014\u00A2\u0006\u0002\b\u0016\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0002\u0010\"\u001A\u0015\u0010#\u001A\u00020\t*\u00020$2\u0006\u0010%\u001A\u00020&H\u0086\u0004\u001A\u0015\u0010\'\u001A\u00020\t*\u00020$2\u0006\u0010%\u001A\u00020&H\u0087\u0004\u00A8\u0006("}, d2 = {"AnimatedContent", "", "S", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "label", "", "contentKey", "Lkotlin/ParameterName;", "name", "", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "togetherWith", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "with", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,899:1\n77#2:900\n1223#3,6:901\n1223#3,6:907\n1223#3,6:913\n1223#3,6:932\n1223#3,6:938\n350#4,7:919\n33#5,6:926\n33#5,6:972\n78#6,6:944\n85#6,4:959\n89#6,2:969\n93#6:980\n368#7,9:950\n377#7:971\n378#7,2:978\n4032#8,6:963\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n715#1:900\n716#1:901,6\n720#1:907,6\n721#1:913,6\n809#1:932,6\n820#1:938,6\n747#1:919,7\n756#1:926,6\n814#1:972,6\n811#1:944,6\n811#1:959,4\n811#1:969,2\n811#1:980\n811#1:950,9\n811#1:971\n811#1:978,2\n811#1:963,6\n*E\n"})
public final class AnimatedContentKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void AnimatedContent(@NotNull Transition transition0, @Nullable Modifier modifier0, @Nullable Function1 function10, @Nullable Alignment alignment0, @Nullable Function1 function11, @NotNull Function4 function40, @Nullable Composer composer0, int v, int v1) {
        Function1 function15;
        Alignment alignment2;
        Function1 function14;
        Modifier modifier1;
        Function1 function17;
        Function1 function16;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl1;
        SnapshotStateList snapshotStateList1;
        Function1 function13;
        Alignment alignment1;
        Function1 function12;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xF929FA7C);
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
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
            function12 = function10;
        }
        else if((v & 0x180) == 0) {
            function12 = function10;
            v2 |= (composer1.changedInstance(function12) ? 0x100 : 0x80);
        }
        else {
            function12 = function10;
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
            alignment1 = alignment0;
        }
        else if((v & 0xC00) == 0) {
            alignment1 = alignment0;
            v2 |= (composer1.changed(alignment1) ? 0x800 : 0x400);
        }
        else {
            alignment1 = alignment0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
            function13 = function11;
        }
        else if((v & 0x6000) == 0) {
            function13 = function11;
            v2 |= (composer1.changedInstance(function13) ? 0x4000 : 0x2000);
        }
        else {
            function13 = function11;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function40) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) != 74898 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if((v1 & 2) != 0) {
                function12 = d.w;
            }
            if((v1 & 4) != 0) {
                alignment1 = Alignment.Companion.getTopStart();
            }
            if((v1 & 8) != 0) {
                function13 = e.w;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF929FA7C, v2, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:713)");
            }
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0 = composer1.rememberedValue();
            if((v2 & 14) == 4 || animatedContentTransitionScopeImpl0 == Composer.Companion.getEmpty()) {
                animatedContentTransitionScopeImpl0 = new AnimatedContentTransitionScopeImpl(transition0, alignment1, layoutDirection0);
                composer1.updateRememberedValue(animatedContentTransitionScopeImpl0);
            }
            SnapshotStateList snapshotStateList0 = composer1.rememberedValue();
            if((v2 & 14) == 4 || snapshotStateList0 == Composer.Companion.getEmpty()) {
                snapshotStateList0 = SnapshotStateKt.mutableStateListOf(new Object[]{transition0.getCurrentState()});
                composer1.updateRememberedValue(snapshotStateList0);
            }
            MutableScatterMap mutableScatterMap0 = composer1.rememberedValue();
            if((v2 & 14) == 4 || mutableScatterMap0 == Composer.Companion.getEmpty()) {
                mutableScatterMap0 = ScatterMapKt.mutableScatterMapOf();
                composer1.updateRememberedValue(mutableScatterMap0);
            }
            if(!snapshotStateList0.contains(transition0.getCurrentState())) {
                snapshotStateList0.clear();
                snapshotStateList0.add(transition0.getCurrentState());
            }
            if(Intrinsics.areEqual(transition0.getCurrentState(), transition0.getTargetState())) {
                if(snapshotStateList0.size() != 1 || !Intrinsics.areEqual(snapshotStateList0.get(0), transition0.getCurrentState())) {
                    snapshotStateList0.clear();
                    snapshotStateList0.add(transition0.getCurrentState());
                }
                if(mutableScatterMap0.getSize() != 1 || mutableScatterMap0.containsKey(transition0.getCurrentState())) {
                    mutableScatterMap0.clear();
                }
                animatedContentTransitionScopeImpl0.setContentAlignment(alignment1);
                animatedContentTransitionScopeImpl0.setLayoutDirection$animation_release(layoutDirection0);
            }
            if(!Intrinsics.areEqual(transition0.getCurrentState(), transition0.getTargetState()) && !snapshotStateList0.contains(transition0.getTargetState())) {
                int v3 = 0;
                Iterator iterator0 = snapshotStateList0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        v3 = -1;
                        break;
                    }
                    Object object0 = iterator0.next();
                    if(Intrinsics.areEqual(function13.invoke(object0), function13.invoke(transition0.getTargetState()))) {
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
            }
            if(!mutableScatterMap0.containsKey(transition0.getTargetState()) || !mutableScatterMap0.containsKey(transition0.getCurrentState())) {
                composer1.startReplaceGroup(0x366A3A81);
                mutableScatterMap0.clear();
                int v4 = snapshotStateList0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    Object object1 = snapshotStateList0.get(v5);
                    mutableScatterMap0.set(object1, ComposableLambdaKt.rememberComposableLambda(885640742, true, new a(transition0, object1, function12, animatedContentTransitionScopeImpl0, snapshotStateList0, function40), composer1, 54));
                }
                snapshotStateList1 = snapshotStateList0;
                animatedContentTransitionScopeImpl1 = animatedContentTransitionScopeImpl0;
                function16 = function12;
                composer1.endReplaceGroup();
            }
            else {
                composer1.startReplaceGroup(0x3691F797);
                composer1.endReplaceGroup();
                snapshotStateList1 = snapshotStateList0;
                animatedContentTransitionScopeImpl1 = animatedContentTransitionScopeImpl0;
                function16 = function12;
            }
            Segment transition$Segment0 = transition0.getSegment();
            boolean z = composer1.changed(animatedContentTransitionScopeImpl1);
            boolean z1 = composer1.changed(transition$Segment0);
            ContentTransform contentTransform0 = composer1.rememberedValue();
            if(!z1 && !z && contentTransform0 != Composer.Companion.getEmpty()) {
                function17 = function16;
            }
            else {
                function17 = function16;
                contentTransform0 = (ContentTransform)function17.invoke(animatedContentTransitionScopeImpl1);
                composer1.updateRememberedValue(contentTransform0);
            }
            Modifier modifier3 = modifier2.then(animatedContentTransitionScopeImpl1.createSizeAnimationModifier$animation_release(contentTransform0, composer1, 0));
            b b0 = composer1.rememberedValue();
            if(b0 == Composer.Companion.getEmpty()) {
                b0 = new b(animatedContentTransitionScopeImpl1);
                composer1.updateRememberedValue(b0);
            }
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Updater.set-impl(composer1, b0, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                androidx.room.a.t(v6, composer1, v6, function20);
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier4, composer1, -1491001814);
            int v7 = snapshotStateList1.size();
            for(int v8 = 0; v8 < v7; ++v8) {
                Object object2 = snapshotStateList1.get(v8);
                composer1.startMovableGroup(1908315325, function13.invoke(object2));
                Function2 function21 = (Function2)mutableScatterMap0.get(object2);
                if(function21 == null) {
                    composer1.startReplaceGroup(0xC614DA70);
                }
                else {
                    composer1.startReplaceGroup(1908317105);
                    function21.invoke(composer1, 0);
                }
                composer1.endReplaceGroup();
                composer1.endMovableGroup();
            }
            if(androidx.room.a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
            function14 = function17;
            alignment2 = alignment1;
            function15 = function13;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function14 = function12;
            alignment2 = alignment1;
            function15 = function13;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pi(transition0, modifier1, function14, alignment2, function15, function40, v, v1, 4));
        }
    }

    @Composable
    public static final void AnimatedContent(Object object0, @Nullable Modifier modifier0, @Nullable Function1 function10, @Nullable Alignment alignment0, @Nullable String s, @Nullable Function1 function11, @NotNull Function4 function40, @Nullable Composer composer0, int v, int v1) {
        Function1 function13;
        String s1;
        Alignment alignment1;
        Modifier modifier1;
        Function1 function12;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x7F1EBC6D);
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
            function12 = function10;
        }
        else if((v & 0x180) == 0) {
            function12 = function10;
            v2 |= (composer1.changedInstance(function12) ? 0x100 : 0x80);
        }
        else {
            function12 = function10;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(alignment0) ? 0x800 : 0x400);
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
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changedInstance(function11) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function40) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            if((v1 & 4) != 0) {
                function12 = s.a.w;
            }
            alignment1 = (v1 & 8) == 0 ? alignment0 : Alignment.Companion.getTopStart();
            s1 = (v1 & 16) == 0 ? s : "AnimatedContent";
            function13 = (v1 & 0x20) == 0 ? function11 : s.b.w;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7F1EBC6D, v2, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
            }
            AnimatedContentKt.AnimatedContent(TransitionKt.updateTransition(object0, s1, composer1, v2 & 14 | v2 >> 9 & 0x70, 0), modifier2, function12, alignment1, function13, function40, composer1, v2 & 0x1FF0 | 0xE000 & v2 >> 3 | v2 >> 3 & 0x70000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            alignment1 = alignment0;
            s1 = s;
            function13 = function11;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(object0, modifier1, function12, alignment1, s1, function13, function40, v, v1));
        }
    }

    @NotNull
    public static final SizeTransform SizeTransform(boolean z, @NotNull Function2 function20) {
        return new q1(z, function20);
    }

    public static SizeTransform SizeTransform$default(boolean z, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            function20 = g.w;
        }
        return AnimatedContentKt.SizeTransform(z, function20);
    }

    @NotNull
    public static final ContentTransform togetherWith(@NotNull EnterTransition enterTransition0, @NotNull ExitTransition exitTransition0) {
        return new ContentTransform(enterTransition0, exitTransition0, 0.0f, null, 12, null);
    }

    @ExperimentalAnimationApi
    @Deprecated(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @ReplaceWith(expression = "togetherWith(exit)", imports = {}))
    @NotNull
    public static final ContentTransform with(@NotNull EnterTransition enterTransition0, @NotNull ExitTransition exitTransition0) {
        return new ContentTransform(enterTransition0, exitTransition0, 0.0f, null, 12, null);
    }
}

