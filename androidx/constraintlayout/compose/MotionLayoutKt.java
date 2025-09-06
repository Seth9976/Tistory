package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A{\u0010\u0014\u001A\u00020\u00102\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\u001E\b\u0004\u0010\u0013\u001A\u0018\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00100\u000E\u00A2\u0006\u0002\b\u0011\u00A2\u0006\u0002\b\u0012H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015\u001Ag\u0010\u0014\u001A\u00020\u00102\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0006\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\u001E\b\u0004\u0010\u0013\u001A\u0018\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00100\u000E\u00A2\u0006\u0002\b\u0011\u00A2\u0006\u0002\b\u0012H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0018\u001A\u008D\u0001\u0010\u0014\u001A\u00020\u00102\u0006\u0010\u0017\u001A\u00020\u00162\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u00192\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00050\u001B2\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\u0010\b\n\u0010\u001E\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001D2\u001E\b\u0004\u0010\u0013\u001A\u0018\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00100\u000E\u00A2\u0006\u0002\b\u0011\u00A2\u0006\u0002\b\u0012H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u001F\u001A\u0087\u0001\u0010\u0014\u001A\u00020\u00102\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010!\u001A\u0004\u0018\u00010 2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\u001E\b\u0004\u0010\u0013\u001A\u0018\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00100\u000E\u00A2\u0006\u0002\b\u0011\u00A2\u0006\u0002\b\u0012H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\"\u001A\u008D\u0001\u0010#\u001A\u00020\u00102\u0006\u0010\u0017\u001A\u00020\u00162\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u00192\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00050\u001B2\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\u0010\b\n\u0010\u001E\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001D2\u001E\b\u0004\u0010\u0013\u001A\u0018\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00100\u000E\u00A2\u0006\u0002\b\u0011\u00A2\u0006\u0002\b\u0012H\u0081\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010\u001F\u001Ag\u0010#\u001A\u00020\u00102\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0006\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\u001E\b\u0004\u0010\u0013\u001A\u0018\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00100\u000E\u00A2\u0006\u0002\b\u0011\u00A2\u0006\u0002\b\u0012H\u0081\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010\u0018\u001A\u0087\u0001\u0010#\u001A\u00020\u00102\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010!\u001A\u0004\u0018\u00010 2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\u001E\b\u0004\u0010\u0013\u001A\u0018\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00100\u000E\u00A2\u0006\u0002\b\u0011\u00A2\u0006\u0002\b\u0012H\u0081\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010\"\u001A\u0019\u0010$\u001A\u00020\u00162\b\b\u0001\u0010\u0013\u001A\u00020\u0019H\u0007\u00A2\u0006\u0004\b$\u0010%\u001A\u001B\u0010&\u001A\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0013\u001A\u00020\u0019H\u0007\u00A2\u0006\u0004\b&\u0010\'\u001A]\u00100\u001A\u00020/2\u0006\u0010\r\u001A\u00020\f2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010)\u001A\u00020(2\u0006\u0010*\u001A\u00020\u00002\u0006\u0010+\u001A\u00020\u00002\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050,2\u0006\u0010.\u001A\u00020-H\u0001\u00A2\u0006\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u00062"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSet;", "start", "end", "Landroidx/constraintlayout/compose/Transition;", "transition", "", "progress", "Ljava/util/EnumSet;", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "debug", "Landroidx/compose/ui/Modifier;", "modifier", "", "optimizationLevel", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "MotionLayout", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLjava/util/EnumSet;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/constraintlayout/compose/MotionScene;", "motionScene", "(Landroidx/constraintlayout/compose/MotionScene;FLjava/util/EnumSet;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "constraintSetName", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function0;", "finishedAnimationListener", "(Landroidx/constraintlayout/compose/MotionScene;Ljava/lang/String;Landroidx/compose/animation/core/AnimationSpec;Ljava/util/EnumSet;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "informationReceiver", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLjava/util/EnumSet;Landroidx/constraintlayout/compose/LayoutInformationReceiver;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MotionLayoutCore", "MotionScene", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/MotionScene;", "Transition", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/Transition;", "", "needsUpdate", "constraintSetStart", "constraintSetEnd", "Landroidx/compose/runtime/MutableState;", "Landroidx/constraintlayout/compose/MotionMeasurer;", "measurer", "Landroidx/compose/ui/layout/MeasurePolicy;", "rememberMotionLayoutMeasurePolicy", "(ILjava/util/EnumSet;JLandroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class MotionLayoutKt {
    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@NotNull ConstraintSet constraintSet0, @NotNull ConstraintSet constraintSet1, @Nullable Transition transition0, float f, @Nullable EnumSet enumSet0, @Nullable Modifier modifier0, int v, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2) {
        EnumSet enumSet2;
        Intrinsics.checkNotNullParameter(constraintSet0, "start");
        Intrinsics.checkNotNullParameter(constraintSet1, "end");
        Intrinsics.checkNotNullParameter(function30, "content");
        composer0.startReplaceableGroup(0xB0AC7A09);
        if((v2 & 16) == 0) {
            enumSet2 = enumSet0;
        }
        else {
            EnumSet enumSet1 = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSet1, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = enumSet1;
        }
        Modifier modifier1 = (v2 & 0x20) == 0 ? modifier0 : Modifier.Companion;
        int v3 = v1 << 3 & 0xE000000 | (v1 & 14 | 0x38000 | v1 & 0x70 | v1 & 0x380 | v1 & 0x1C00 | v1 << 3 & 0x380000 | v1 << 3 & 0x1C00000);
        composer0.startReplaceableGroup(-1330870962);
        int v4 = v3 & 14 | 0x8000 | v3 & 0x70 | v3 & 0x380 | v3 & 0x1C00 | 0x30000 | 0x380000 & v3 | v3 & 0x1C00000 | v3 & 0xE000000;
        MotionMeasurer motionMeasurer0 = q.h(0xAC7B03B4, composer0, 0xFFC7BCB7);
        Companion composer$Companion0 = Composer.Companion;
        if(motionMeasurer0 == composer$Companion0.getEmpty()) {
            motionMeasurer0 = new MotionMeasurer();
            composer0.updateRememberedValue(motionMeasurer0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xFFC7BCB7);
        MotionLayoutScope motionLayoutScope0 = composer0.rememberedValue();
        if(motionLayoutScope0 == composer$Companion0.getEmpty()) {
            motionLayoutScope0 = new MotionLayoutScope(motionMeasurer0);
            composer0.updateRememberedValue(motionLayoutScope0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xFFC7BCB7);
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        mutableState0.setValue(f);
        MeasurePolicy measurePolicy0 = MotionLayoutKt.rememberMotionLayoutMeasurePolicy(((v2 & 0x40) == 0 ? v : 0x101), enumSet2, 0L, constraintSet0, constraintSet1, ((v2 & 4) == 0 ? transition0 : null), mutableState0, motionMeasurer0, composer0, v4 >> 21 & 14 | 0x11801C0 | v4 << 9 & 0x1C00 | 0xE000 & v4 << 9 | v4 << 9 & 0x70000);
        motionMeasurer0.addLayoutInformationReceiver(null);
        float f1 = motionMeasurer0.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags0 = MotionLayoutDebugFlags.NONE;
        if(!enumSet2.contains(motionLayoutDebugFlags0) || !Float.isNaN(f1)) {
            composer0.startReplaceableGroup(0xAC7B081A);
            if(!Float.isNaN(f1)) {
                modifier1 = ScaleKt.scale(modifier1, motionMeasurer0.getForcedScaleFactor());
            }
            composer0.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicy1 = a.i(Alignment.Companion, false, composer0, 0, 0x520574F7);
            Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.materializerOf(Modifier.Companion);
            if(composer0.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer0.startReusableNode();
            if(composer0.getInserting()) {
                composer0.createNode(function00);
            }
            else {
                composer0.useNode();
            }
            composer0.disableReusing();
            Updater.set-impl(composer0, measurePolicy1, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer0, density0, composeUiNode$Companion0.getSetDensity());
            Updater.set-impl(composer0, layoutDirection0, composeUiNode$Companion0.getSetLayoutDirection());
            composer0.enableReusing();
            a.w(0, function31, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
            composer0.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier1, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.1(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF21501C, true, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.2(function30, motionLayoutScope0, v4)), measurePolicy0, composer0, 0x30, 0);
            if(Float.isNaN(f1)) {
                composer0.startReplaceableGroup(0xC8FEAC71);
            }
            else {
                composer0.startReplaceableGroup(0xC8FEAC27);
                motionMeasurer0.drawDebugBounds(boxScopeInstance0, f1, composer0, 0x206);
            }
            composer0.endReplaceableGroup();
            if(enumSet2.contains(motionLayoutDebugFlags0)) {
                composer0.startReplaceableGroup(0xC8FEACE7);
            }
            else {
                composer0.startReplaceableGroup(0xC8FEACB4);
                motionMeasurer0.drawDebug(boxScopeInstance0, composer0, 70);
            }
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            composer0.endNode();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
        }
        else {
            composer0.startReplaceableGroup(0xAC7B0B49);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier1, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.4(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF215E3A, true, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.5(function30, motionLayoutScope0, v4)), measurePolicy0, composer0, 0x30, 0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@NotNull ConstraintSet constraintSet0, @NotNull ConstraintSet constraintSet1, @Nullable Transition transition0, float f, @Nullable EnumSet enumSet0, @Nullable LayoutInformationReceiver layoutInformationReceiver0, @Nullable Modifier modifier0, int v, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2) {
        EnumSet enumSet2;
        Intrinsics.checkNotNullParameter(constraintSet0, "start");
        Intrinsics.checkNotNullParameter(constraintSet1, "end");
        Intrinsics.checkNotNullParameter(function30, "content");
        composer0.startReplaceableGroup(-1330870962);
        if((v2 & 16) == 0) {
            enumSet2 = enumSet0;
        }
        else {
            EnumSet enumSet1 = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSet1, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = enumSet1;
        }
        Modifier modifier1 = (v2 & 0x40) == 0 ? modifier0 : Modifier.Companion;
        int v3 = v1 & 14 | 0x8000 | v1 & 0x70 | v1 & 0x380 | v1 & 0x1C00 | v1 & 0x70000 | 0x380000 & v1 | 0x1C00000 & v1 | v1 & 0xE000000;
        MotionMeasurer motionMeasurer0 = q.h(0xAC7B03B4, composer0, 0xFFC7BCB7);
        Companion composer$Companion0 = Composer.Companion;
        if(motionMeasurer0 == composer$Companion0.getEmpty()) {
            motionMeasurer0 = new MotionMeasurer();
            composer0.updateRememberedValue(motionMeasurer0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xFFC7BCB7);
        MotionLayoutScope motionLayoutScope0 = composer0.rememberedValue();
        if(motionLayoutScope0 == composer$Companion0.getEmpty()) {
            motionLayoutScope0 = new MotionLayoutScope(motionMeasurer0);
            composer0.updateRememberedValue(motionLayoutScope0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xFFC7BCB7);
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        mutableState0.setValue(f);
        MeasurePolicy measurePolicy0 = MotionLayoutKt.rememberMotionLayoutMeasurePolicy(((v2 & 0x80) == 0 ? v : 0x101), enumSet2, 0L, constraintSet0, constraintSet1, ((v2 & 4) == 0 ? transition0 : null), mutableState0, motionMeasurer0, composer0, v3 >> 21 & 14 | 0x11801C0 | v3 << 9 & 0x1C00 | 0xE000 & v3 << 9 | v3 << 9 & 0x70000);
        motionMeasurer0.addLayoutInformationReceiver(((v2 & 0x20) == 0 ? layoutInformationReceiver0 : null));
        float f1 = motionMeasurer0.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags0 = MotionLayoutDebugFlags.NONE;
        if(!enumSet2.contains(motionLayoutDebugFlags0) || !Float.isNaN(f1)) {
            composer0.startReplaceableGroup(0xAC7B081A);
            Modifier modifier2 = Float.isNaN(f1) ? modifier1 : ScaleKt.scale(modifier1, motionMeasurer0.getForcedScaleFactor());
            composer0.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicy1 = a.i(Alignment.Companion, false, composer0, 0, 0x520574F7);
            Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.materializerOf(Modifier.Companion);
            if(composer0.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer0.startReusableNode();
            if(composer0.getInserting()) {
                composer0.createNode(function00);
            }
            else {
                composer0.useNode();
            }
            composer0.disableReusing();
            Updater.set-impl(composer0, measurePolicy1, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer0, density0, composeUiNode$Companion0.getSetDensity());
            Updater.set-impl(composer0, layoutDirection0, composeUiNode$Companion0.getSetLayoutDirection());
            composer0.enableReusing();
            a.w(0, function31, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
            composer0.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.1(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF21501C, true, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.2(function30, motionLayoutScope0, v3)), measurePolicy0, composer0, 0x30, 0);
            if(Float.isNaN(f1)) {
                composer0.startReplaceableGroup(0xC8FEAC71);
            }
            else {
                composer0.startReplaceableGroup(0xC8FEAC27);
                motionMeasurer0.drawDebugBounds(boxScopeInstance0, f1, composer0, 0x206);
            }
            composer0.endReplaceableGroup();
            if(enumSet2.contains(motionLayoutDebugFlags0)) {
                composer0.startReplaceableGroup(0xC8FEACE7);
            }
            else {
                composer0.startReplaceableGroup(0xC8FEACB4);
                motionMeasurer0.drawDebug(boxScopeInstance0, composer0, 70);
            }
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            composer0.endNode();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
        }
        else {
            composer0.startReplaceableGroup(0xAC7B0B49);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier1, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.4(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF215E3A, true, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.5(function30, motionLayoutScope0, v3)), measurePolicy0, composer0, 0x30, 0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@NotNull MotionScene motionScene0, float f, @Nullable EnumSet enumSet0, @Nullable Modifier modifier0, int v, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2) {
        Transition transition0;
        EnumSet enumSet1;
        Intrinsics.checkNotNullParameter(motionScene0, "motionScene");
        Intrinsics.checkNotNullParameter(function30, "content");
        composer0.startReplaceableGroup(0xB0AC7D84);
        if((v2 & 4) == 0) {
            enumSet1 = enumSet0;
        }
        else {
            enumSet1 = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSet1, "of(MotionLayoutDebugFlags.NONE)");
        }
        Modifier modifier1 = (v2 & 8) == 0 ? modifier0 : Modifier.Companion;
        MutableState mutableState0 = q.h(0xAC7AFAF0, composer0, 0xFFC7BCB7);
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        motionScene0.setUpdateFlag(mutableState0);
        if(motionScene0.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSet1 = EnumSet.of(motionScene0.getForcedDrawDebug());
            Intrinsics.checkNotNullExpressionValue(enumSet1, "of(motionScene.getForcedDrawDebug())");
        }
        Object object0 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z = composer0.changed(motionScene0);
        boolean z1 = composer0.changed(object0);
        String s = composer0.rememberedValue();
        if(z1 || z || s == composer$Companion0.getEmpty()) {
            s = motionScene0.getTransition("default");
            composer0.updateRememberedValue(s);
        }
        composer0.endReplaceableGroup();
        if(s == null) {
            composer0.startReplaceableGroup(-488322840);
            composer0.endReplaceableGroup();
            transition0 = null;
        }
        else {
            composer0.startReplaceableGroup(0xAC7AFE39);
            transition0 = MotionLayoutKt.Transition(s, composer0, 0);
            composer0.endReplaceableGroup();
        }
        String s1 = transition0 == null ? "start" : transition0.getStartConstraintSetId();
        String s2 = transition0 == null ? "end" : transition0.getEndConstraintSetId();
        Object object1 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z2 = composer0.changed(motionScene0);
        boolean z3 = composer0.changed(object1);
        String s3 = composer0.rememberedValue();
        if(z2 || z3 || s3 == composer$Companion0.getEmpty()) {
            String s4 = motionScene0.getConstraintSet(s1);
            if(s4 == null) {
                s4 = motionScene0.getConstraintSet(0);
            }
            s3 = s4;
            composer0.updateRememberedValue(s3);
        }
        composer0.endReplaceableGroup();
        Object object2 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z4 = composer0.changed(motionScene0);
        boolean z5 = composer0.changed(object2);
        String s5 = composer0.rememberedValue();
        if(z5 || z4 || s5 == composer$Companion0.getEmpty()) {
            String s6 = motionScene0.getConstraintSet(s2);
            if(s6 == null) {
                s6 = motionScene0.getConstraintSet(1);
            }
            s5 = s6;
            composer0.updateRememberedValue(s5);
        }
        composer0.endReplaceableGroup();
        if(s3 != null && s5 != null) {
            ConstraintSet constraintSet0 = ConstraintLayoutKt.ConstraintSet(s3);
            ConstraintSet constraintSet1 = ConstraintLayoutKt.ConstraintSet(s5);
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MutableState mutableState1 = composer0.rememberedValue();
            if(mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
                composer0.updateRememberedValue(mutableState1);
            }
            composer0.endReplaceableGroup();
            float f1 = motionScene0.getForcedProgress();
            if(Float.isNaN(f1) || MotionLayoutKt.access$MotionLayoutCore$lambda-26(mutableState1) != f) {
                motionScene0.resetForcedProgress();
                f1 = f;
            }
            MotionLayoutKt.access$MotionLayoutCore$lambda-27(mutableState1, f);
            int v3 = (v1 & 0x70000 | (v1 & 14 | 0x200 | v1 & 0x70 | v1 & 0x1C00 | 0xE000 & v1)) << 9;
            int v4 = v3 & 0xE000000 | (0x380000 & v3 | 0x8000 | 0x1C00000 & v3);
            MotionMeasurer motionMeasurer0 = q.h(0xAC7B03B4, composer0, 0xFFC7BCB7);
            if(motionMeasurer0 == composer$Companion0.getEmpty()) {
                motionMeasurer0 = new MotionMeasurer();
                composer0.updateRememberedValue(motionMeasurer0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MotionLayoutScope motionLayoutScope0 = composer0.rememberedValue();
            if(motionLayoutScope0 == composer$Companion0.getEmpty()) {
                motionLayoutScope0 = new MotionLayoutScope(motionMeasurer0);
                composer0.updateRememberedValue(motionLayoutScope0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MutableState mutableState2 = composer0.rememberedValue();
            if(mutableState2 == composer$Companion0.getEmpty()) {
                mutableState2 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
                composer0.updateRememberedValue(mutableState2);
            }
            composer0.endReplaceableGroup();
            mutableState2.setValue(f1);
            MeasurePolicy measurePolicy0 = MotionLayoutKt.rememberMotionLayoutMeasurePolicy(((v2 & 16) == 0 ? v : 0x101), enumSet1, 0L, constraintSet0, constraintSet1, transition0, mutableState2, motionMeasurer0, composer0, v4 >> 21 & 14 | 0x11801C0);
            motionMeasurer0.addLayoutInformationReceiver((motionScene0 instanceof LayoutInformationReceiver ? ((LayoutInformationReceiver)motionScene0) : null));
            float f2 = motionMeasurer0.getForcedScaleFactor();
            MotionLayoutDebugFlags motionLayoutDebugFlags0 = MotionLayoutDebugFlags.NONE;
            if(!enumSet1.contains(motionLayoutDebugFlags0) || !Float.isNaN(f2)) {
                composer0.startReplaceableGroup(0xAC7B081A);
                if(!Float.isNaN(f2)) {
                    modifier1 = ScaleKt.scale(modifier1, motionMeasurer0.getForcedScaleFactor());
                }
                composer0.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicy1 = a.i(Alignment.Companion, false, composer0, 0, 0x520574F7);
                Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                Function0 function00 = composeUiNode$Companion0.getConstructor();
                Function3 function31 = LayoutKt.materializerOf(Modifier.Companion);
                if(composer0.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer0.startReusableNode();
                if(composer0.getInserting()) {
                    composer0.createNode(function00);
                }
                else {
                    composer0.useNode();
                }
                composer0.disableReusing();
                Updater.set-impl(composer0, measurePolicy1, composeUiNode$Companion0.getSetMeasurePolicy());
                Updater.set-impl(composer0, density0, composeUiNode$Companion0.getSetDensity());
                Updater.set-impl(composer0, layoutDirection0, composeUiNode$Companion0.getSetLayoutDirection());
                composer0.enableReusing();
                a.w(0, function31, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
                composer0.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier1, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.1(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF21501C, true, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.2(function30, motionLayoutScope0, v4)), measurePolicy0, composer0, 0x30, 0);
                if(Float.isNaN(f2)) {
                    composer0.startReplaceableGroup(0xC8FEAC71);
                }
                else {
                    composer0.startReplaceableGroup(0xC8FEAC27);
                    motionMeasurer0.drawDebugBounds(boxScopeInstance0, f2, composer0, 0x206);
                }
                composer0.endReplaceableGroup();
                if(enumSet1.contains(motionLayoutDebugFlags0)) {
                    composer0.startReplaceableGroup(0xC8FEACE7);
                }
                else {
                    composer0.startReplaceableGroup(0xC8FEACB4);
                    motionMeasurer0.drawDebug(boxScopeInstance0, composer0, 70);
                }
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
                composer0.endNode();
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
            }
            else {
                composer0.startReplaceableGroup(0xAC7B0B49);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier1, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.4(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF215E3A, true, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.5(function30, motionLayoutScope0, v4)), measurePolicy0, composer0, 0x30, 0);
            }
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMotionApi
    public static final void MotionLayout(@NotNull MotionScene motionScene0, @Nullable String s, @Nullable AnimationSpec animationSpec0, @Nullable EnumSet enumSet0, @Nullable Modifier modifier0, int v, @Nullable Function0 function00, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier2;
        EnumSet enumSet2;
        Transition transition0;
        EnumSet enumSet1;
        Intrinsics.checkNotNullParameter(motionScene0, "motionScene");
        Intrinsics.checkNotNullParameter(function30, "content");
        composer0.startReplaceableGroup(0xB0AC8202);
        String s1 = (v2 & 2) == 0 ? s : null;
        AnimationSpec animationSpec1 = (v2 & 4) == 0 ? animationSpec0 : AnimationSpecKt.tween$default(0, 0, null, 7, null);
        if((v2 & 8) == 0) {
            enumSet1 = enumSet0;
        }
        else {
            enumSet1 = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSet1, "of(MotionLayoutDebugFlags.NONE)");
        }
        Modifier modifier1 = (v2 & 16) == 0 ? modifier0 : Modifier.Companion;
        int v3 = v1 & 14 | 0x1200 | v1 & 0x70 | v1 & 0xE000 | v1 & 0x70000 | v1 & 0x380000 | v1 & 0x1C00000;
        MutableState mutableState0 = q.h(-1401230387, composer0, 0xFFC7BCB7);
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        motionScene0.setUpdateFlag(mutableState0);
        if(motionScene0.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSet1 = EnumSet.of(motionScene0.getForcedDrawDebug());
            Intrinsics.checkNotNullExpressionValue(enumSet1, "of(motionScene.getForcedDrawDebug())");
        }
        Object object0 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z = composer0.changed(motionScene0);
        boolean z1 = composer0.changed(object0);
        String s2 = composer0.rememberedValue();
        if(z1 || z || s2 == composer$Companion0.getEmpty()) {
            s2 = motionScene0.getTransition("default");
            composer0.updateRememberedValue(s2);
        }
        composer0.endReplaceableGroup();
        if(s2 == null) {
            composer0.startReplaceableGroup(0xE2E30442);
            composer0.endReplaceableGroup();
            transition0 = null;
        }
        else {
            composer0.startReplaceableGroup(-1401229409);
            Transition transition1 = MotionLayoutKt.Transition(s2, composer0, 0);
            composer0.endReplaceableGroup();
            transition0 = transition1;
        }
        String s3 = transition0 == null ? "start" : transition0.getStartConstraintSetId();
        String s4 = transition0 == null ? "end" : transition0.getEndConstraintSetId();
        Object object1 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z2 = composer0.changed(motionScene0);
        boolean z3 = composer0.changed(object1);
        String s5 = composer0.rememberedValue();
        if(z2 || z3 || s5 == composer$Companion0.getEmpty()) {
            String s6 = motionScene0.getConstraintSet(s3);
            if(s6 == null) {
                s6 = motionScene0.getConstraintSet(0);
            }
            s5 = s6;
            composer0.updateRememberedValue(s5);
        }
        composer0.endReplaceableGroup();
        Object object2 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z4 = composer0.changed(motionScene0);
        boolean z5 = composer0.changed(object2);
        String s7 = composer0.rememberedValue();
        if(z5 || z4 || s7 == composer$Companion0.getEmpty()) {
            String s8 = motionScene0.getConstraintSet(s4);
            if(s8 == null) {
                s8 = motionScene0.getConstraintSet(1);
            }
            s7 = s8;
            composer0.updateRememberedValue(s7);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z6 = composer0.changed(motionScene0);
        boolean z7 = composer0.changed(s1);
        String s9 = composer0.rememberedValue();
        if(z6 || z7 || s9 == composer$Companion0.getEmpty()) {
            s9 = s1 == null ? null : motionScene0.getConstraintSet(s1);
            composer0.updateRememberedValue(s9);
        }
        composer0.endReplaceableGroup();
        if(s5 != null && s7 != null) {
            composer0.startReplaceableGroup(-3686930);
            boolean z8 = composer0.changed(motionScene0);
            MutableState mutableState1 = composer0.rememberedValue();
            if(z8 || mutableState1 == composer$Companion0.getEmpty()) {
                MutableState mutableState2 = SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(s5), null, 2, null);
                composer0.updateRememberedValue(mutableState2);
                mutableState1 = mutableState2;
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(-3686930);
            boolean z9 = composer0.changed(motionScene0);
            MutableState mutableState3 = composer0.rememberedValue();
            if(z9 || mutableState3 == composer$Companion0.getEmpty()) {
                mutableState3 = SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(s7), null, 2, null);
                composer0.updateRememberedValue(mutableState3);
            }
            composer0.endReplaceableGroup();
            ConstraintSet constraintSet0 = s9 == null ? null : ConstraintLayoutKt.ConstraintSet(s9);
            composer0.startReplaceableGroup(0xFFC7BCB7);
            Animatable animatable0 = composer0.rememberedValue();
            if(animatable0 == composer$Companion0.getEmpty()) {
                animatable0 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer0.updateRememberedValue(animatable0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(-3686930);
            boolean z10 = composer0.changed(motionScene0);
            MutableState mutableState4 = composer0.rememberedValue();
            if(z10 || mutableState4 == composer$Companion0.getEmpty()) {
                mutableState4 = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer0.updateRememberedValue(mutableState4);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            Channel channel0 = composer0.rememberedValue();
            if(channel0 == composer$Companion0.getEmpty()) {
                channel0 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer0.updateRememberedValue(channel0);
            }
            composer0.endReplaceableGroup();
            if(constraintSet0 == null) {
                enumSet2 = enumSet1;
                modifier2 = modifier1;
                composer0.startReplaceableGroup(0xAC7AF7DE);
            }
            else {
                composer0.startReplaceableGroup(0xAC7AF485);
                EffectsKt.SideEffect(new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.1(channel0, constraintSet0), composer0, 0);
                enumSet2 = enumSet1;
                modifier2 = modifier1;
                EffectsKt.LaunchedEffect(motionScene0, channel0, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.2(channel0, animatable0, animationSpec1, ((v2 & 0x40) == 0 ? function00 : null), mutableState4, mutableState1, mutableState3, null), composer0, v3 & 14 | 0x40);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MutableState mutableState5 = composer0.rememberedValue();
            if(mutableState5 == composer$Companion0.getEmpty()) {
                mutableState5 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
                composer0.updateRememberedValue(mutableState5);
            }
            composer0.endReplaceableGroup();
            float f = motionScene0.getForcedProgress();
            if(Float.isNaN(f) || ((Number)mutableState5.getValue()).floatValue() != ((Number)animatable0.getValue()).floatValue()) {
                motionScene0.resetForcedProgress();
                f = ((Number)animatable0.getValue()).floatValue();
            }
            mutableState5.setValue(animatable0.getValue());
            ConstraintSet constraintSet1 = MotionLayoutKt.access$MotionLayoutCore$lambda-8(mutableState1);
            ConstraintSet constraintSet2 = MotionLayoutKt.access$MotionLayoutCore$lambda-11(mutableState3);
            int v4 = v3 << 6 & 0x1C00000 | (v3 << 6 & 0x380000 | 0x8000) | v3 << 3 & 0xE000000;
            composer0.startReplaceableGroup(-1330870962);
            int v5 = v4 & 0x380000 | 0x8000 | v4 & 0x1C00000 | v4 & 0xE000000;
            MotionMeasurer motionMeasurer0 = q.h(0xAC7B03B4, composer0, 0xFFC7BCB7);
            if(motionMeasurer0 == composer$Companion0.getEmpty()) {
                motionMeasurer0 = new MotionMeasurer();
                composer0.updateRememberedValue(motionMeasurer0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MotionLayoutScope motionLayoutScope0 = composer0.rememberedValue();
            if(motionLayoutScope0 == composer$Companion0.getEmpty()) {
                motionLayoutScope0 = new MotionLayoutScope(motionMeasurer0);
                composer0.updateRememberedValue(motionLayoutScope0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MutableState mutableState6 = composer0.rememberedValue();
            if(mutableState6 == composer$Companion0.getEmpty()) {
                mutableState6 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
                composer0.updateRememberedValue(mutableState6);
            }
            composer0.endReplaceableGroup();
            mutableState6.setValue(f);
            MeasurePolicy measurePolicy0 = MotionLayoutKt.rememberMotionLayoutMeasurePolicy(((v2 & 0x20) == 0 ? v : 0x101), enumSet2, 0L, constraintSet1, constraintSet2, transition0, mutableState6, motionMeasurer0, composer0, v5 >> 21 & 14 | 0x11801C0);
            motionMeasurer0.addLayoutInformationReceiver((motionScene0 instanceof JSONMotionScene ? ((JSONMotionScene)motionScene0) : null));
            float f1 = motionMeasurer0.getForcedScaleFactor();
            MotionLayoutDebugFlags motionLayoutDebugFlags0 = MotionLayoutDebugFlags.NONE;
            if(!enumSet2.contains(motionLayoutDebugFlags0) || !Float.isNaN(f1)) {
                composer0.startReplaceableGroup(0xAC7B081A);
                Modifier modifier3 = Float.isNaN(f1) ? modifier2 : ScaleKt.scale(modifier2, motionMeasurer0.getForcedScaleFactor());
                composer0.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicy1 = a.i(Alignment.Companion, false, composer0, 0, 0x520574F7);
                Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                Function0 function01 = composeUiNode$Companion0.getConstructor();
                Function3 function31 = LayoutKt.materializerOf(Modifier.Companion);
                if(composer0.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer0.startReusableNode();
                if(composer0.getInserting()) {
                    composer0.createNode(function01);
                }
                else {
                    composer0.useNode();
                }
                composer0.disableReusing();
                Updater.set-impl(composer0, measurePolicy1, composeUiNode$Companion0.getSetMeasurePolicy());
                Updater.set-impl(composer0, density0, composeUiNode$Companion0.getSetDensity());
                Updater.set-impl(composer0, layoutDirection0, composeUiNode$Companion0.getSetLayoutDirection());
                composer0.enableReusing();
                a.w(0, function31, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
                composer0.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier3, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.1(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF21501C, true, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.2(function30, motionLayoutScope0, v5)), measurePolicy0, composer0, 0x30, 0);
                if(Float.isNaN(f1)) {
                    composer0.startReplaceableGroup(0xC8FEAC71);
                }
                else {
                    composer0.startReplaceableGroup(0xC8FEAC27);
                    motionMeasurer0.drawDebugBounds(boxScopeInstance0, f1, composer0, 0x206);
                }
                composer0.endReplaceableGroup();
                if(enumSet2.contains(motionLayoutDebugFlags0)) {
                    composer0.startReplaceableGroup(0xC8FEACE7);
                }
                else {
                    composer0.startReplaceableGroup(0xC8FEACB4);
                    motionMeasurer0.drawDebug(boxScopeInstance0, composer0, 70);
                }
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
                composer0.endNode();
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
            }
            else {
                composer0.startReplaceableGroup(0xAC7B0B49);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.4(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF215E3A, true, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.5(function30, motionLayoutScope0, v5)), measurePolicy0, composer0, 0x30, 0);
            }
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    @Composable
    @PublishedApi
    public static final void MotionLayoutCore(@NotNull ConstraintSet constraintSet0, @NotNull ConstraintSet constraintSet1, @Nullable Transition transition0, float f, @Nullable EnumSet enumSet0, @Nullable LayoutInformationReceiver layoutInformationReceiver0, @Nullable Modifier modifier0, int v, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2) {
        EnumSet enumSet2;
        Intrinsics.checkNotNullParameter(constraintSet0, "start");
        Intrinsics.checkNotNullParameter(constraintSet1, "end");
        Intrinsics.checkNotNullParameter(function30, "content");
        composer0.startReplaceableGroup(0xAC7B03B4);
        if((v2 & 16) == 0) {
            enumSet2 = enumSet0;
        }
        else {
            EnumSet enumSet1 = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSet1, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = enumSet1;
        }
        Modifier modifier1 = (v2 & 0x40) == 0 ? modifier0 : Modifier.Companion;
        composer0.startReplaceableGroup(0xFFC7BCB7);
        MotionMeasurer motionMeasurer0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(motionMeasurer0 == composer$Companion0.getEmpty()) {
            motionMeasurer0 = new MotionMeasurer();
            composer0.updateRememberedValue(motionMeasurer0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xFFC7BCB7);
        MotionLayoutScope motionLayoutScope0 = composer0.rememberedValue();
        if(motionLayoutScope0 == composer$Companion0.getEmpty()) {
            motionLayoutScope0 = new MotionLayoutScope(motionMeasurer0);
            composer0.updateRememberedValue(motionLayoutScope0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xFFC7BCB7);
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        mutableState0.setValue(f);
        MeasurePolicy measurePolicy0 = MotionLayoutKt.rememberMotionLayoutMeasurePolicy(((v2 & 0x80) == 0 ? v : 0x101), enumSet2, 0L, constraintSet0, constraintSet1, ((v2 & 4) == 0 ? transition0 : null), mutableState0, motionMeasurer0, composer0, v1 >> 21 & 14 | 0x11801C0 | v1 << 9 & 0x1C00 | 0xE000 & v1 << 9 | v1 << 9 & 0x70000);
        motionMeasurer0.addLayoutInformationReceiver(((v2 & 0x20) == 0 ? layoutInformationReceiver0 : null));
        float f1 = motionMeasurer0.getForcedScaleFactor();
        MotionLayoutDebugFlags motionLayoutDebugFlags0 = MotionLayoutDebugFlags.NONE;
        if(!enumSet2.contains(motionLayoutDebugFlags0) || !Float.isNaN(f1)) {
            composer0.startReplaceableGroup(0xAC7B081A);
            Modifier modifier2 = Float.isNaN(f1) ? modifier1 : ScaleKt.scale(modifier1, motionMeasurer0.getForcedScaleFactor());
            composer0.startReplaceableGroup(-1990474327);
            MeasurePolicy measurePolicy1 = a.i(Alignment.Companion, false, composer0, 0, 0x520574F7);
            Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.materializerOf(Modifier.Companion);
            if(composer0.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer0.startReusableNode();
            if(composer0.getInserting()) {
                composer0.createNode(function00);
            }
            else {
                composer0.useNode();
            }
            composer0.disableReusing();
            Updater.set-impl(composer0, measurePolicy1, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer0, density0, composeUiNode$Companion0.getSetDensity());
            Updater.set-impl(composer0, layoutDirection0, composeUiNode$Companion0.getSetLayoutDirection());
            composer0.enableReusing();
            a.w(0, function31, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
            composer0.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new Function1(motionMeasurer0) {
                public final MotionMeasurer w;

                {
                    this.w = motionMeasurer0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((SemanticsPropertyReceiver)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                    Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "$this$semantics");
                    ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver0, this.w);
                }
            }, 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF21501C, true, new Function2(function30, motionLayoutScope0, v1) {
                public final Function3 w;
                public final MotionLayoutScope x;
                public final int y;

                {
                    this.w = function30;
                    this.x = motionLayoutScope0;
                    this.y = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer0, int v) {
                    if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                        composer0.skipToGroupEnd();
                        return;
                    }
                    this.w.invoke(this.x, composer0, ((int)(this.y >> 21 & 0x70 | 8)));
                }
            }), measurePolicy0, composer0, 0x30, 0);
            if(Float.isNaN(f1)) {
                composer0.startReplaceableGroup(0xC8FEAC71);
            }
            else {
                composer0.startReplaceableGroup(0xC8FEAC27);
                motionMeasurer0.drawDebugBounds(boxScopeInstance0, f1, composer0, 0x206);
            }
            composer0.endReplaceableGroup();
            if(enumSet2.contains(motionLayoutDebugFlags0)) {
                composer0.startReplaceableGroup(0xC8FEACE7);
            }
            else {
                composer0.startReplaceableGroup(0xC8FEACB4);
                motionMeasurer0.drawDebug(boxScopeInstance0, composer0, 70);
            }
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            composer0.endNode();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
        }
        else {
            composer0.startReplaceableGroup(0xAC7B0B49);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier1, false, new Function1(motionMeasurer0) {
                public final MotionMeasurer w;

                {
                    this.w = motionMeasurer0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((SemanticsPropertyReceiver)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                    Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "$this$semantics");
                    ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver0, this.w);
                }
            }, 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF215E3A, true, new Function2(function30, motionLayoutScope0, v1) {
                public final Function3 w;
                public final MotionLayoutScope x;
                public final int y;

                {
                    this.w = function30;
                    this.x = motionLayoutScope0;
                    this.y = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer0, int v) {
                    if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                        composer0.skipToGroupEnd();
                        return;
                    }
                    this.w.invoke(this.x, composer0, ((int)(this.y >> 21 & 0x70 | 8)));
                }
            }), measurePolicy0, composer0, 0x30, 0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    @Composable
    @PublishedApi
    public static final void MotionLayoutCore(@NotNull MotionScene motionScene0, float f, @Nullable EnumSet enumSet0, @Nullable Modifier modifier0, int v, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2) {
        Transition transition0;
        EnumSet enumSet1;
        Intrinsics.checkNotNullParameter(motionScene0, "motionScene");
        Intrinsics.checkNotNullParameter(function30, "content");
        composer0.startReplaceableGroup(0xAC7AFAF0);
        if((v2 & 4) == 0) {
            enumSet1 = enumSet0;
        }
        else {
            enumSet1 = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSet1, "of(MotionLayoutDebugFlags.NONE)");
        }
        Modifier modifier1 = (v2 & 8) == 0 ? modifier0 : Modifier.Companion;
        composer0.startReplaceableGroup(0xFFC7BCB7);
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        motionScene0.setUpdateFlag(mutableState0);
        if(motionScene0.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSet1 = EnumSet.of(motionScene0.getForcedDrawDebug());
            Intrinsics.checkNotNullExpressionValue(enumSet1, "of(motionScene.getForcedDrawDebug())");
        }
        Object object0 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z = composer0.changed(motionScene0);
        boolean z1 = composer0.changed(object0);
        String s = composer0.rememberedValue();
        if(z1 || z || s == composer$Companion0.getEmpty()) {
            s = motionScene0.getTransition("default");
            composer0.updateRememberedValue(s);
        }
        composer0.endReplaceableGroup();
        if(s == null) {
            composer0.startReplaceableGroup(-488322840);
            composer0.endReplaceableGroup();
            transition0 = null;
        }
        else {
            composer0.startReplaceableGroup(0xAC7AFE39);
            Transition transition1 = MotionLayoutKt.Transition(s, composer0, 0);
            composer0.endReplaceableGroup();
            transition0 = transition1;
        }
        String s1 = transition0 == null ? "start" : transition0.getStartConstraintSetId();
        String s2 = transition0 == null ? "end" : transition0.getEndConstraintSetId();
        Object object1 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z2 = composer0.changed(motionScene0);
        boolean z3 = composer0.changed(object1);
        String s3 = composer0.rememberedValue();
        if(z2 || z3 || s3 == composer$Companion0.getEmpty()) {
            String s4 = motionScene0.getConstraintSet(s1);
            if(s4 == null) {
                s4 = motionScene0.getConstraintSet(0);
            }
            s3 = s4;
            composer0.updateRememberedValue(s3);
        }
        composer0.endReplaceableGroup();
        Object object2 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z4 = composer0.changed(motionScene0);
        boolean z5 = composer0.changed(object2);
        String s5 = composer0.rememberedValue();
        if(z5 || z4 || s5 == composer$Companion0.getEmpty()) {
            String s6 = motionScene0.getConstraintSet(s2);
            if(s6 == null) {
                s6 = motionScene0.getConstraintSet(1);
            }
            s5 = s6;
            composer0.updateRememberedValue(s5);
        }
        composer0.endReplaceableGroup();
        if(s3 != null && s5 != null) {
            ConstraintSet constraintSet0 = ConstraintLayoutKt.ConstraintSet(s3);
            ConstraintSet constraintSet1 = ConstraintLayoutKt.ConstraintSet(s5);
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MutableState mutableState1 = composer0.rememberedValue();
            if(mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
                composer0.updateRememberedValue(mutableState1);
            }
            composer0.endReplaceableGroup();
            float f1 = motionScene0.getForcedProgress();
            if(Float.isNaN(f1) || MotionLayoutKt.access$MotionLayoutCore$lambda-26(mutableState1) != f) {
                motionScene0.resetForcedProgress();
                f1 = f;
            }
            MotionLayoutKt.access$MotionLayoutCore$lambda-27(mutableState1, f);
            int v3 = v1 << 9 & 0xE000000 | (0x380000 & v1 << 9 | 0x8000 | 0x1C00000 & v1 << 9);
            MotionMeasurer motionMeasurer0 = q.h(0xAC7B03B4, composer0, 0xFFC7BCB7);
            if(motionMeasurer0 == composer$Companion0.getEmpty()) {
                motionMeasurer0 = new MotionMeasurer();
                composer0.updateRememberedValue(motionMeasurer0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MotionLayoutScope motionLayoutScope0 = composer0.rememberedValue();
            if(motionLayoutScope0 == composer$Companion0.getEmpty()) {
                motionLayoutScope0 = new MotionLayoutScope(motionMeasurer0);
                composer0.updateRememberedValue(motionLayoutScope0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MutableState mutableState2 = composer0.rememberedValue();
            if(mutableState2 == composer$Companion0.getEmpty()) {
                mutableState2 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
                composer0.updateRememberedValue(mutableState2);
            }
            composer0.endReplaceableGroup();
            mutableState2.setValue(f1);
            MeasurePolicy measurePolicy0 = MotionLayoutKt.rememberMotionLayoutMeasurePolicy(((v2 & 16) == 0 ? v : 0x101), enumSet1, 0L, constraintSet0, constraintSet1, transition0, mutableState2, motionMeasurer0, composer0, v3 >> 21 & 14 | 0x11801C0);
            motionMeasurer0.addLayoutInformationReceiver((motionScene0 instanceof LayoutInformationReceiver ? ((LayoutInformationReceiver)motionScene0) : null));
            float f2 = motionMeasurer0.getForcedScaleFactor();
            MotionLayoutDebugFlags motionLayoutDebugFlags0 = MotionLayoutDebugFlags.NONE;
            if(!enumSet1.contains(motionLayoutDebugFlags0) || !Float.isNaN(f2)) {
                composer0.startReplaceableGroup(0xAC7B081A);
                if(!Float.isNaN(f2)) {
                    modifier1 = ScaleKt.scale(modifier1, motionMeasurer0.getForcedScaleFactor());
                }
                composer0.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicy1 = a.i(Alignment.Companion, false, composer0, 0, 0x520574F7);
                Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                Function0 function00 = composeUiNode$Companion0.getConstructor();
                Function3 function31 = LayoutKt.materializerOf(Modifier.Companion);
                if(composer0.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer0.startReusableNode();
                if(composer0.getInserting()) {
                    composer0.createNode(function00);
                }
                else {
                    composer0.useNode();
                }
                composer0.disableReusing();
                Updater.set-impl(composer0, measurePolicy1, composeUiNode$Companion0.getSetMeasurePolicy());
                Updater.set-impl(composer0, density0, composeUiNode$Companion0.getSetDensity());
                Updater.set-impl(composer0, layoutDirection0, composeUiNode$Companion0.getSetLayoutDirection());
                composer0.enableReusing();
                a.w(0, function31, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
                composer0.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier1, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.1(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF21501C, true, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.2(function30, motionLayoutScope0, v3)), measurePolicy0, composer0, 0x30, 0);
                if(Float.isNaN(f2)) {
                    composer0.startReplaceableGroup(0xC8FEAC71);
                }
                else {
                    composer0.startReplaceableGroup(0xC8FEAC27);
                    motionMeasurer0.drawDebugBounds(boxScopeInstance0, f2, composer0, 0x206);
                }
                composer0.endReplaceableGroup();
                if(enumSet1.contains(motionLayoutDebugFlags0)) {
                    composer0.startReplaceableGroup(0xC8FEACE7);
                }
                else {
                    composer0.startReplaceableGroup(0xC8FEACB4);
                    motionMeasurer0.drawDebug(boxScopeInstance0, composer0, 70);
                }
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
                composer0.endNode();
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
            }
            else {
                composer0.startReplaceableGroup(0xAC7B0B49);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier1, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.4(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF215E3A, true, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.5(function30, motionLayoutScope0, v3)), measurePolicy0, composer0, 0x30, 0);
            }
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            return;
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    @PublishedApi
    public static final void MotionLayoutCore(@NotNull MotionScene motionScene0, @Nullable String s, @Nullable AnimationSpec animationSpec0, @Nullable EnumSet enumSet0, @Nullable Modifier modifier0, int v, @Nullable Function0 function00, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier2;
        EnumSet enumSet2;
        Transition transition0;
        EnumSet enumSet1;
        Intrinsics.checkNotNullParameter(motionScene0, "motionScene");
        Intrinsics.checkNotNullParameter(function30, "content");
        composer0.startReplaceableGroup(-1401230387);
        String s1 = (v2 & 2) == 0 ? s : null;
        AnimationSpec animationSpec1 = (v2 & 4) == 0 ? animationSpec0 : AnimationSpecKt.tween$default(0, 0, null, 7, null);
        if((v2 & 8) == 0) {
            enumSet1 = enumSet0;
        }
        else {
            enumSet1 = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSet1, "of(MotionLayoutDebugFlags.NONE)");
        }
        Modifier modifier1 = (v2 & 16) == 0 ? modifier0 : Modifier.Companion;
        composer0.startReplaceableGroup(0xFFC7BCB7);
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        motionScene0.setUpdateFlag(mutableState0);
        if(motionScene0.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSet1 = EnumSet.of(motionScene0.getForcedDrawDebug());
            Intrinsics.checkNotNullExpressionValue(enumSet1, "of(motionScene.getForcedDrawDebug())");
        }
        Object object0 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z = composer0.changed(motionScene0);
        boolean z1 = composer0.changed(object0);
        String s2 = composer0.rememberedValue();
        if(z1 || z || s2 == composer$Companion0.getEmpty()) {
            s2 = motionScene0.getTransition("default");
            composer0.updateRememberedValue(s2);
        }
        composer0.endReplaceableGroup();
        if(s2 == null) {
            composer0.startReplaceableGroup(0xE2E30442);
            composer0.endReplaceableGroup();
            transition0 = null;
        }
        else {
            composer0.startReplaceableGroup(-1401229409);
            Transition transition1 = MotionLayoutKt.Transition(s2, composer0, 0);
            composer0.endReplaceableGroup();
            transition0 = transition1;
        }
        String s3 = transition0 == null ? "start" : transition0.getStartConstraintSetId();
        String s4 = transition0 == null ? "end" : transition0.getEndConstraintSetId();
        Object object1 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z2 = composer0.changed(motionScene0);
        boolean z3 = composer0.changed(object1);
        String s5 = composer0.rememberedValue();
        if(z2 || z3 || s5 == composer$Companion0.getEmpty()) {
            String s6 = motionScene0.getConstraintSet(s3);
            if(s6 == null) {
                s6 = motionScene0.getConstraintSet(0);
            }
            s5 = s6;
            composer0.updateRememberedValue(s5);
        }
        composer0.endReplaceableGroup();
        Object object2 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z4 = composer0.changed(motionScene0);
        boolean z5 = composer0.changed(object2);
        String s7 = composer0.rememberedValue();
        if(z5 || z4 || s7 == composer$Companion0.getEmpty()) {
            String s8 = motionScene0.getConstraintSet(s4);
            if(s8 == null) {
                s8 = motionScene0.getConstraintSet(1);
            }
            s7 = s8;
            composer0.updateRememberedValue(s7);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z6 = composer0.changed(motionScene0);
        boolean z7 = composer0.changed(s1);
        String s9 = composer0.rememberedValue();
        if(z6 || z7 || s9 == composer$Companion0.getEmpty()) {
            s9 = s1 == null ? null : motionScene0.getConstraintSet(s1);
            composer0.updateRememberedValue(s9);
        }
        composer0.endReplaceableGroup();
        if(s5 != null && s7 != null) {
            composer0.startReplaceableGroup(-3686930);
            boolean z8 = composer0.changed(motionScene0);
            MutableState mutableState1 = composer0.rememberedValue();
            if(z8 || mutableState1 == composer$Companion0.getEmpty()) {
                MutableState mutableState2 = SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(s5), null, 2, null);
                composer0.updateRememberedValue(mutableState2);
                mutableState1 = mutableState2;
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(-3686930);
            boolean z9 = composer0.changed(motionScene0);
            MutableState mutableState3 = composer0.rememberedValue();
            if(z9 || mutableState3 == composer$Companion0.getEmpty()) {
                mutableState3 = SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(s7), null, 2, null);
                composer0.updateRememberedValue(mutableState3);
            }
            composer0.endReplaceableGroup();
            ConstraintSet constraintSet0 = s9 == null ? null : ConstraintLayoutKt.ConstraintSet(s9);
            composer0.startReplaceableGroup(0xFFC7BCB7);
            Animatable animatable0 = composer0.rememberedValue();
            if(animatable0 == composer$Companion0.getEmpty()) {
                animatable0 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer0.updateRememberedValue(animatable0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(-3686930);
            boolean z10 = composer0.changed(motionScene0);
            MutableState mutableState4 = composer0.rememberedValue();
            if(z10 || mutableState4 == composer$Companion0.getEmpty()) {
                mutableState4 = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer0.updateRememberedValue(mutableState4);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            Channel channel0 = composer0.rememberedValue();
            if(channel0 == composer$Companion0.getEmpty()) {
                channel0 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer0.updateRememberedValue(channel0);
            }
            composer0.endReplaceableGroup();
            if(constraintSet0 == null) {
                enumSet2 = enumSet1;
                modifier2 = modifier1;
                composer0.startReplaceableGroup(0xAC7AF7DE);
            }
            else {
                composer0.startReplaceableGroup(0xAC7AF485);
                EffectsKt.SideEffect(new Function0(channel0, constraintSet0) {
                    public final Channel w;
                    public final ConstraintSet x;

                    {
                        this.w = channel0;
                        this.x = constraintSet0;
                        super(0);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        this.w.trySend-JP2dKIU(this.x);
                    }
                }, composer0, 0);
                enumSet2 = enumSet1;
                modifier2 = modifier1;
                EffectsKt.LaunchedEffect(motionScene0, channel0, new Function2(channel0, animatable0, animationSpec1, ((v2 & 0x40) == 0 ? function00 : null), mutableState4, mutableState1, mutableState3, null) {
                    public ChannelIterator o;
                    public int p;
                    public final Channel q;
                    public final Animatable r;
                    public final AnimationSpec s;
                    public final Function0 t;
                    public final MutableState u;
                    public final MutableState v;
                    public final MutableState w;

                    {
                        this.q = channel0;
                        this.r = animatable0;
                        this.s = animationSpec0;
                        this.t = function00;
                        this.u = mutableState0;
                        this.v = mutableState1;
                        this.w = mutableState2;
                        super(2, continuation0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                        return new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.2(this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation0);
                    }

                    @Override  // kotlin.jvm.functions.Function2
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                    }

                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                        return ((androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.2)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        Object object2;
                        ChannelIterator channelIterator0;
                        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
                        Channel channel0 = this.q;
                        MutableState mutableState0 = this.u;
                        switch(this.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object0);
                                channelIterator0 = channel0.iterator();
                                goto label_18;
                            }
                            case 1: {
                                channelIterator0 = this.o;
                                ResultKt.throwOnFailure(object0);
                                object2 = object0;
                                goto label_23;
                            }
                            case 2: {
                                channelIterator0 = this.o;
                                ResultKt.throwOnFailure(object0);
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    alab1:
                        while(true) {
                            MotionLayoutKt.access$MotionLayoutCore$lambda-17(mutableState0, !MotionLayoutKt.access$MotionLayoutCore$lambda-16(mutableState0));
                            Function0 function00 = this.t;
                            if(function00 != null) {
                                function00.invoke();
                            }
                            while(true) {
                            label_18:
                                this.o = channelIterator0;
                                this.p = 1;
                                object2 = channelIterator0.hasNext(this);
                                if(object2 == object1) {
                                    return object1;
                                }
                            label_23:
                                if(!((Boolean)object2).booleanValue()) {
                                    break alab1;
                                }
                                ConstraintSet constraintSet0 = (ConstraintSet)channelIterator0.next();
                                ConstraintSet constraintSet1 = (ConstraintSet)ChannelResult.getOrNull-impl(channel0.tryReceive-PtdJZtk());
                                if(constraintSet1 != null) {
                                    constraintSet0 = constraintSet1;
                                }
                                float f = MotionLayoutKt.access$MotionLayoutCore$lambda-16(mutableState0) ? 1.0f : 0.0f;
                                boolean z = MotionLayoutKt.access$MotionLayoutCore$lambda-16(mutableState0);
                                MutableState mutableState1 = this.w;
                                MutableState mutableState2 = this.v;
                                if(Intrinsics.areEqual(constraintSet0, (z ? MotionLayoutKt.access$MotionLayoutCore$lambda-8(mutableState2) : MotionLayoutKt.access$MotionLayoutCore$lambda-11(mutableState1)))) {
                                    continue;
                                }
                                if(MotionLayoutKt.access$MotionLayoutCore$lambda-16(mutableState0)) {
                                    MotionLayoutKt.access$MotionLayoutCore$lambda-12(mutableState1, constraintSet0);
                                }
                                else {
                                    MotionLayoutKt.access$MotionLayoutCore$lambda-9(mutableState2, constraintSet0);
                                }
                                this.o = channelIterator0;
                                this.p = 2;
                                if(Animatable.animateTo$default(this.r, Boxing.boxFloat(f), this.s, null, null, this, 12, null) != object1) {
                                    break;
                                }
                                return object1;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }, composer0, v1 & 14 | 0x40);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MutableState mutableState5 = composer0.rememberedValue();
            if(mutableState5 == composer$Companion0.getEmpty()) {
                mutableState5 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
                composer0.updateRememberedValue(mutableState5);
            }
            composer0.endReplaceableGroup();
            float f = motionScene0.getForcedProgress();
            if(Float.isNaN(f) || ((Number)mutableState5.getValue()).floatValue() != ((Number)animatable0.getValue()).floatValue()) {
                motionScene0.resetForcedProgress();
                f = ((Number)animatable0.getValue()).floatValue();
            }
            mutableState5.setValue(animatable0.getValue());
            ConstraintSet constraintSet1 = MotionLayoutKt.access$MotionLayoutCore$lambda-8(mutableState1);
            ConstraintSet constraintSet2 = MotionLayoutKt.access$MotionLayoutCore$lambda-11(mutableState3);
            int v3 = v1 << 6 & 0x1C00000 | (v1 << 6 & 0x380000 | 0x8000) | v1 << 3 & 0xE000000;
            composer0.startReplaceableGroup(-1330870962);
            int v4 = 0x380000 & v3 | 0x8000 | v3 & 0x1C00000 | v3 & 0xE000000;
            MotionMeasurer motionMeasurer0 = q.h(0xAC7B03B4, composer0, 0xFFC7BCB7);
            if(motionMeasurer0 == composer$Companion0.getEmpty()) {
                motionMeasurer0 = new MotionMeasurer();
                composer0.updateRememberedValue(motionMeasurer0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MotionLayoutScope motionLayoutScope0 = composer0.rememberedValue();
            if(motionLayoutScope0 == composer$Companion0.getEmpty()) {
                motionLayoutScope0 = new MotionLayoutScope(motionMeasurer0);
                composer0.updateRememberedValue(motionLayoutScope0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MutableState mutableState6 = composer0.rememberedValue();
            if(mutableState6 == composer$Companion0.getEmpty()) {
                mutableState6 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
                composer0.updateRememberedValue(mutableState6);
            }
            composer0.endReplaceableGroup();
            mutableState6.setValue(f);
            MeasurePolicy measurePolicy0 = MotionLayoutKt.rememberMotionLayoutMeasurePolicy(((v2 & 0x20) == 0 ? v : 0x101), enumSet2, 0L, constraintSet1, constraintSet2, transition0, mutableState6, motionMeasurer0, composer0, v4 >> 21 & 14 | 0x11801C0);
            motionMeasurer0.addLayoutInformationReceiver((motionScene0 instanceof JSONMotionScene ? ((JSONMotionScene)motionScene0) : null));
            float f1 = motionMeasurer0.getForcedScaleFactor();
            MotionLayoutDebugFlags motionLayoutDebugFlags0 = MotionLayoutDebugFlags.NONE;
            if(!enumSet2.contains(motionLayoutDebugFlags0) || !Float.isNaN(f1)) {
                composer0.startReplaceableGroup(0xAC7B081A);
                Modifier modifier3 = Float.isNaN(f1) ? modifier2 : ScaleKt.scale(modifier2, motionMeasurer0.getForcedScaleFactor());
                composer0.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicy1 = a.i(Alignment.Companion, false, composer0, 0, 0x520574F7);
                Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                Function0 function01 = composeUiNode$Companion0.getConstructor();
                Function3 function31 = LayoutKt.materializerOf(Modifier.Companion);
                if(composer0.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer0.startReusableNode();
                if(composer0.getInserting()) {
                    composer0.createNode(function01);
                }
                else {
                    composer0.useNode();
                }
                composer0.disableReusing();
                Updater.set-impl(composer0, measurePolicy1, composeUiNode$Companion0.getSetMeasurePolicy());
                Updater.set-impl(composer0, density0, composeUiNode$Companion0.getSetDensity());
                Updater.set-impl(composer0, layoutDirection0, composeUiNode$Companion0.getSetLayoutDirection());
                composer0.enableReusing();
                a.w(0, function31, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
                composer0.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier3, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.1(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF21501C, true, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.2(function30, motionLayoutScope0, v4)), measurePolicy0, composer0, 0x30, 0);
                if(Float.isNaN(f1)) {
                    composer0.startReplaceableGroup(0xC8FEAC71);
                }
                else {
                    composer0.startReplaceableGroup(0xC8FEAC27);
                    motionMeasurer0.drawDebugBounds(boxScopeInstance0, f1, composer0, 0x206);
                }
                composer0.endReplaceableGroup();
                if(enumSet2.contains(motionLayoutDebugFlags0)) {
                    composer0.startReplaceableGroup(0xC8FEACE7);
                }
                else {
                    composer0.startReplaceableGroup(0xC8FEACB4);
                    motionMeasurer0.drawDebug(boxScopeInstance0, composer0, 70);
                }
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
                composer0.endNode();
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
            }
            else {
                composer0.startReplaceableGroup(0xAC7B0B49);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.4(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF215E3A, true, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.5(function30, motionLayoutScope0, v4)), measurePolicy0, composer0, 0x30, 0);
            }
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            return;
        }
        composer0.endReplaceableGroup();
    }

    @SuppressLint({"ComposableNaming"})
    @Composable
    @NotNull
    public static final MotionScene MotionScene(@Language("json5") @NotNull String s, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "content");
        composer0.startReplaceableGroup(0x53C8C0DF);
        composer0.startReplaceableGroup(-3686930);
        boolean z = composer0.changed(s);
        JSONMotionScene jSONMotionScene0 = composer0.rememberedValue();
        if(z || jSONMotionScene0 == Composer.Companion.getEmpty()) {
            jSONMotionScene0 = new JSONMotionScene(s);
            composer0.updateRememberedValue(jSONMotionScene0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return jSONMotionScene0;
    }

    @SuppressLint({"ComposableNaming"})
    @Composable
    @Nullable
    public static final Transition Transition(@Language("json5") @NotNull String s, @Nullable Composer composer0, int v) {
        CLObject cLObject0;
        Intrinsics.checkNotNullParameter(s, "content");
        composer0.startReplaceableGroup(811760201);
        composer0.startReplaceableGroup(-3686930);
        boolean z = composer0.changed(s);
        MutableState mutableState0 = composer0.rememberedValue();
        if(z || mutableState0 == Composer.Companion.getEmpty()) {
            try {
                cLObject0 = CLParser.parse(s);
            }
            catch(CLParsingException cLParsingException0) {
                System.err.println("Error parsing JSON " + cLParsingException0);
                cLObject0 = null;
            }
            mutableState0 = SnapshotStateKt.mutableStateOf$default((cLObject0 == null ? null : new Transition() {
                public final CLObject a;

                {
                    CLObject cLObject0 = cLObject0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.a = cLObject0;
                }

                @Override  // androidx.constraintlayout.compose.Transition
                public void applyTo(@NotNull androidx.constraintlayout.core.state.Transition transition0, int v) {
                    Intrinsics.checkNotNullParameter(transition0, "transition");
                    try {
                        ConstraintSetParserKt.parseTransition(this.a, transition0);
                    }
                    catch(CLParsingException cLParsingException0) {
                        System.err.println("Error parsing JSON " + cLParsingException0);
                    }
                }

                @Override  // androidx.constraintlayout.compose.Transition
                @NotNull
                public String getEndConstraintSetId() {
                    String s = this.a.getStringOrNull("to");
                    return s == null ? "end" : s;
                }

                @Override  // androidx.constraintlayout.compose.Transition
                @NotNull
                public String getStartConstraintSetId() {
                    String s = this.a.getStringOrNull("from");
                    return s == null ? "start" : s;
                }
            }), null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        Transition transition0 = (androidx.constraintlayout.compose.MotionLayoutKt.Transition.transition.1.1)mutableState0.getValue();
        composer0.endReplaceableGroup();
        return transition0;
    }

    public static final ConstraintSet access$MotionLayoutCore$lambda-11(MutableState mutableState0) {
        return (ConstraintSet)mutableState0.getValue();
    }

    public static final void access$MotionLayoutCore$lambda-12(MutableState mutableState0, ConstraintSet constraintSet0) {
        mutableState0.setValue(constraintSet0);
    }

    public static final boolean access$MotionLayoutCore$lambda-16(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$MotionLayoutCore$lambda-17(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final float access$MotionLayoutCore$lambda-26(MutableState mutableState0) {
        return ((Number)mutableState0.getValue()).floatValue();
    }

    public static final void access$MotionLayoutCore$lambda-27(MutableState mutableState0, float f) {
        mutableState0.setValue(f);
    }

    public static final ConstraintSet access$MotionLayoutCore$lambda-8(MutableState mutableState0) {
        return (ConstraintSet)mutableState0.getValue();
    }

    public static final void access$MotionLayoutCore$lambda-9(MutableState mutableState0, ConstraintSet constraintSet0) {
        mutableState0.setValue(constraintSet0);
    }

    public static final boolean access$getDEBUG$p() [...] // Inlined contents

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rememberMotionLayoutMeasurePolicy(int v, @NotNull EnumSet enumSet0, long v1, @NotNull ConstraintSet constraintSet0, @NotNull ConstraintSet constraintSet1, @Nullable Transition transition0, @NotNull MutableState mutableState0, @NotNull MotionMeasurer motionMeasurer0, @Nullable Composer composer0, int v2) {
        Intrinsics.checkNotNullParameter(enumSet0, "debug");
        Intrinsics.checkNotNullParameter(constraintSet0, "constraintSetStart");
        Intrinsics.checkNotNullParameter(constraintSet1, "constraintSetEnd");
        Intrinsics.checkNotNullParameter(mutableState0, "progress");
        Intrinsics.checkNotNullParameter(motionMeasurer0, "measurer");
        composer0.startReplaceableGroup(0x9034DA80);
        Object[] arr_object = {v, enumSet0, v1, constraintSet0, constraintSet1, transition0};
        composer0.startReplaceableGroup(-3685570);
        boolean z = false;
        int v3 = 0;
        while(v3 < 6) {
            Object object0 = arr_object[v3];
            ++v3;
            z |= composer0.changed(object0);
        }
        e0 e00 = composer0.rememberedValue();
        if(z || e00 == Composer.Companion.getEmpty()) {
            motionMeasurer0.initWith(constraintSet0, constraintSet1, transition0, ((Number)mutableState0.getValue()).floatValue());
            e00 = new e0(motionMeasurer0, constraintSet0, constraintSet1, transition0, v, mutableState0);
            composer0.updateRememberedValue(e00);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return e00;
    }
}

