package androidx.constraintlayout.compose;

import aa.m;
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
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import java.util.EnumSet;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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
import qd.a;

@Metadata(d1 = {"\u0000\u00C6\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AG\u0010\n\u001A\u00020\u00062\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u001E\b\u0004\u0010\t\u001A\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\bH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\n\u0010\u000B\u001AG\u0010\u0015\u001A\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00140\u00122\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0006\u0010\u0011\u001A\u00020\u0010H\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001Ap\u0010\n\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0019\u001A\u00020\u000E2\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001B0\u001A2\u0010\b\n\u0010\u001D\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00142\u0013\b\b\u0010\t\u001A\r\u0012\u0004\u0012\u00020\u00060\u0014\u00A2\u0006\u0002\b\u0007H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\n\u0010\u001E\u001A5\u0010\u0015\u001A\u00020\u00132\u0006\u0010\u0003\u001A\u00020\u00022\f\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001F0\r2\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0011\u001A\u00020\u0010H\u0001\u00A2\u0006\u0004\b\u0015\u0010!\u001A\u000F\u0010#\u001A\u00020\"H\u0000\u00A2\u0006\u0004\b#\u0010$\u001A\u001F\u0010+\u001A\u00020(*\u00020%2\u0006\u0010\'\u001A\u00020&\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b)\u0010*\u001A\u001F\u0010/\u001A\u00020,*\u00020%2\u0006\u0010\'\u001A\u00020&\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b-\u0010.\u001A!\u00103\u001A\u000200*\u00020,2\u0006\u0010\'\u001A\u00020&H\u0007\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b1\u00102\u001A\u001F\u0010+\u001A\u000200*\u00020,2\u0006\u0010\'\u001A\u00020&\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b)\u00102\u001A\u001F\u0010/\u001A\u000200*\u00020(2\u0006\u0010\'\u001A\u00020&\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b-\u00104\u001A%\u00107\u001A\u00020\u00172\b\b\u0001\u0010\t\u001A\u0002052\n\b\u0003\u00106\u001A\u0004\u0018\u000105H\u0007\u00A2\u0006\u0004\b7\u00108\u001A\u0017\u00107\u001A\u00020\u00172\b\b\u0001\u00109\u001A\u000205\u00A2\u0006\u0004\b7\u0010:\u001A\u001F\u00107\u001A\u00020\u00172\u0006\u0010;\u001A\u00020\u00172\b\b\u0001\u00109\u001A\u000205\u00A2\u0006\u0004\b7\u0010<\u001A&\u00107\u001A\u00020\u00172\u0017\u0010>\u001A\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00060\u0004\u00A2\u0006\u0002\b\b\u00A2\u0006\u0004\b7\u0010?\u001A.\u00107\u001A\u00020\u00172\u0006\u0010;\u001A\u00020\u00172\u0017\u0010>\u001A\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00060\u0004\u00A2\u0006\u0002\b\b\u00A2\u0006\u0004\b7\u0010@\u001A%\u0010F\u001A\u00020\u00062\u0006\u0010B\u001A\u00020A2\f\u0010E\u001A\b\u0012\u0004\u0012\u00020D0CH\u0000\u00A2\u0006\u0004\bF\u0010G\"\u0015\u00103\u001A\u00020(*\u00020%8F\u00A2\u0006\u0006\u001A\u0004\bH\u0010I\"\u0015\u0010L\u001A\u00020,*\u00020%8F\u00A2\u0006\u0006\u001A\u0004\bJ\u0010K\"\u0015\u00103\u001A\u000200*\u00020,8F\u00A2\u0006\u0006\u001A\u0004\bH\u0010M\"\u0015\u0010L\u001A\u000200*\u00020(8F\u00A2\u0006\u0006\u001A\u0004\bJ\u0010N*\f\b\u0000\u0010P\"\u00020O2\u00020O*\f\b\u0000\u0010R\"\u00020Q2\u00020Q*\f\b\u0000\u0010T\"\u00020S2\u00020S*\f\b\u0000\u0010V\"\u00020U2\u00020U\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006W"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "optimizationLevel", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ConstraintLayout", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "scope", "Landroidx/compose/runtime/MutableState;", "", "remeasureRequesterState", "Landroidx/constraintlayout/compose/Measurer;", "measurer", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function0;", "rememberConstraintLayoutMeasurePolicy", "(ILandroidx/constraintlayout/compose/ConstraintLayoutScope;Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSet", "animateChanges", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "finishedAnimationListener", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/Modifier;IZLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "needsUpdate", "(ILandroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "", "createId", "()Ljava/lang/Object;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/compose/ui/unit/Dp;", "dp", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "atLeast-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "atLeast", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "atMost-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "atMost", "Landroidx/constraintlayout/compose/Dimension;", "atLeastWrapContent-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "atLeastWrapContent", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "", "overrideVariables", "ConstraintSet", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/constraintlayout/compose/ConstraintSet;", "jsonContent", "(Ljava/lang/String;)Landroidx/constraintlayout/compose/ConstraintSet;", "extendConstraintSet", "(Landroidx/constraintlayout/compose/ConstraintSet;Ljava/lang/String;)Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "description", "(Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/ConstraintSet;", "(Landroidx/constraintlayout/compose/ConstraintSet;Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "buildMapping", "(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V", "getAtLeastWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "getAtMostWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "atMostWrapContent", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;)Landroidx/constraintlayout/compose/Dimension;", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;)Landroidx/constraintlayout/compose/Dimension;", "Landroidx/constraintlayout/core/state/State$Chain;", "SolverChain", "Landroidx/constraintlayout/core/state/Dimension;", "SolverDimension", "Landroidx/constraintlayout/core/state/State$Direction;", "SolverDirection", "Landroidx/constraintlayout/core/state/State;", "SolverState", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ConstraintLayoutKt {
    @Composable
    public static final void ConstraintLayout(@Nullable Modifier modifier0, int v, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2) {
        Intrinsics.checkNotNullParameter(function30, "content");
        composer0.startReplaceableGroup(0xEFE40B3D);
        if((v2 & 1) != 0) {
            modifier0 = Modifier.Companion;
        }
        if((v2 & 2) != 0) {
            v = 0x101;
        }
        composer0.startReplaceableGroup(0xFFC7BCB7);
        Measurer measurer0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(measurer0 == composer$Companion0.getEmpty()) {
            measurer0 = new Measurer();
            composer0.updateRememberedValue(measurer0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ConstraintLayoutScope constraintLayoutScope0 = composer0.rememberedValue();
        if(constraintLayoutScope0 == composer$Companion0.getEmpty()) {
            constraintLayoutScope0 = new ConstraintLayoutScope();
            composer0.updateRememberedValue(constraintLayoutScope0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xFFC7BCB7);
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        Pair pair0 = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(v, constraintLayoutScope0, mutableState0, measurer0, composer0, v1 >> 3 & 14 | 0x11C0);
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier0, false, new Function1(measurer0) {
            public final Measurer w;

            {
                this.w = measurer0;
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
        }, 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF21685A, true, new Function2(constraintLayoutScope0, function30, v1, ((Function0)pair0.component2())) {
            public final ConstraintLayoutScope w;
            public final Function3 x;
            public final int y;
            public final Function0 z;

            {
                this.w = constraintLayoutScope0;
                this.x = function30;
                this.y = v;
                this.z = function00;
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
                this.w.reset();
                this.x.invoke(this.w, composer0, ((int)(this.y >> 3 & 0x70 | 8)));
                if(this.w.getHelpersHashCode() != this.w.getHelpersHashCode()) {
                    this.z.invoke();
                }
            }
        }), ((MeasurePolicy)pair0.component1()), composer0, 0x30, 0);
        composer0.endReplaceableGroup();
    }

    @Composable
    public static final void ConstraintLayout(@NotNull ConstraintSet constraintSet0, @Nullable Modifier modifier0, int v, boolean z, @Nullable AnimationSpec animationSpec0, @Nullable Function0 function00, @NotNull Function2 function20, @Nullable Composer composer0, int v1, int v2) {
        Measurer measurer1;
        LayoutInformationReceiver layoutInformationReceiver0;
        Intrinsics.checkNotNullParameter(constraintSet0, "constraintSet");
        Intrinsics.checkNotNullParameter(function20, "content");
        composer0.startReplaceableGroup(0xEFE41E57);
        Modifier modifier1 = (v2 & 2) == 0 ? modifier0 : Modifier.Companion;
        AnimationSpec animationSpec1 = (v2 & 16) == 0 ? animationSpec0 : AnimationSpecKt.tween$default(0, 0, null, 7, null);
        if(((v2 & 8) == 0 ? z : false)) {
            MutableState mutableState0 = q.h(0xEFE41FD6, composer0, 0xFFC7BCB7);
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(constraintSet0, null, 2, null);
                composer0.updateRememberedValue(mutableState0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MutableState mutableState1 = composer0.rememberedValue();
            if(mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(constraintSet0, null, 2, null);
                composer0.updateRememberedValue(mutableState1);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            Animatable animatable0 = composer0.rememberedValue();
            if(animatable0 == composer$Companion0.getEmpty()) {
                animatable0 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer0.updateRememberedValue(animatable0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            Channel channel0 = composer0.rememberedValue();
            if(channel0 == composer$Companion0.getEmpty()) {
                channel0 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer0.updateRememberedValue(channel0);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            MutableState mutableState2 = composer0.rememberedValue();
            if(mutableState2 == composer$Companion0.getEmpty()) {
                mutableState2 = SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
                composer0.updateRememberedValue(mutableState2);
            }
            composer0.endReplaceableGroup();
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
            EffectsKt.LaunchedEffect(channel0, new Function2(channel0, mutableState2, animatable0, animationSpec1, ((v2 & 0x20) == 0 ? function00 : null), mutableState0, mutableState1, null) {
                public ChannelIterator o;
                public int p;
                public final Channel q;
                public final MutableState r;
                public final Animatable s;
                public final AnimationSpec t;
                public final Function0 u;
                public final MutableState v;
                public final MutableState w;

                {
                    this.q = channel0;
                    this.r = mutableState0;
                    this.s = animatable0;
                    this.t = animationSpec0;
                    this.u = function00;
                    this.v = mutableState1;
                    this.w = mutableState2;
                    super(2, continuation0);
                }

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                    return new androidx.constraintlayout.compose.ConstraintLayoutKt.ConstraintLayout.4(this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation0);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                }

                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                    return ((androidx.constraintlayout.compose.ConstraintLayoutKt.ConstraintLayout.4)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                }

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    Object object2;
                    ChannelIterator channelIterator0;
                    Object object1 = a.getCOROUTINE_SUSPENDED();
                    Channel channel0 = this.q;
                    MutableState mutableState0 = this.r;
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
                        mutableState0.setValue(Boxing.boxInt((((Number)mutableState0.getValue()).intValue() == 1 ? 0 : 1)));
                        Function0 function00 = this.u;
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
                            int v = ((Number)mutableState0.getValue()).intValue();
                            MutableState mutableState1 = this.w;
                            MutableState mutableState2 = this.v;
                            if(Intrinsics.areEqual(constraintSet0, (v == 1 ? ConstraintLayoutKt.access$ConstraintLayout$lambda-6(mutableState2) : ConstraintLayoutKt.access$ConstraintLayout$lambda-9(mutableState1)))) {
                                continue;
                            }
                            if(((Number)mutableState0.getValue()).intValue() == 1) {
                                ConstraintLayoutKt.access$ConstraintLayout$lambda-10(mutableState1, constraintSet0);
                            }
                            else {
                                ConstraintLayoutKt.access$ConstraintLayout$lambda-7(mutableState2, constraintSet0);
                            }
                            Float float0 = Boxing.boxFloat(((Number)mutableState0.getValue()).intValue());
                            this.o = channelIterator0;
                            this.p = 2;
                            if(Animatable.animateTo$default(this.s, float0, this.t, null, null, this, 12, null) != object1) {
                                break;
                            }
                            return object1;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }, composer0, 8);
            ConstraintSet constraintSet1 = ConstraintLayoutKt.access$ConstraintLayout$lambda-6(mutableState0);
            ConstraintSet constraintSet2 = ConstraintLayoutKt.access$ConstraintLayout$lambda-9(mutableState1);
            float f = ((Number)animatable0.getValue()).floatValue();
            composer0.startReplaceableGroup(0xB0AC7A09);
            MotionLayoutDebugFlags motionLayoutDebugFlags0 = MotionLayoutDebugFlags.NONE;
            EnumSet enumSet0 = EnumSet.of(motionLayoutDebugFlags0);
            Intrinsics.checkNotNullExpressionValue(enumSet0, "of(MotionLayoutDebugFlags.NONE)");
            composer0.startReplaceableGroup(-1330870962);
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
            MutableState mutableState3 = composer0.rememberedValue();
            if(mutableState3 == composer$Companion0.getEmpty()) {
                mutableState3 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
                composer0.updateRememberedValue(mutableState3);
            }
            composer0.endReplaceableGroup();
            mutableState3.setValue(f);
            int v3 = 0x38000 | (0x38000 | (v1 << 12 & 0x70000) << 3 & 0x380000) & 0x380000;
            MeasurePolicy measurePolicy0 = MotionLayoutKt.rememberMotionLayoutMeasurePolicy(0x101, enumSet0, 0L, constraintSet1, constraintSet2, null, mutableState3, motionMeasurer0, composer0, 0x11801C0);
            motionMeasurer0.addLayoutInformationReceiver(null);
            float f1 = motionMeasurer0.getForcedScaleFactor();
            if(!enumSet0.contains(motionLayoutDebugFlags0) || !Float.isNaN(f1)) {
                composer0.startReplaceableGroup(0xAC7B081A);
                if(!Float.isNaN(f1)) {
                    modifier1 = ScaleKt.scale(modifier1, motionMeasurer0.getForcedScaleFactor());
                }
                composer0.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicy1 = r0.a.i(Alignment.Companion, false, composer0, 0, 0x520574F7);
                Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                Function0 function01 = composeUiNode$Companion0.getConstructor();
                Function3 function30 = LayoutKt.materializerOf(Modifier.Companion);
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
                r0.a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
                composer0.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier1, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.3.1(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF21501C, true, new Function2(motionLayoutScope0, v3, function20, v1) {
                    public final Function2 w;
                    public final int x;

                    {
                        this.w = function20;
                        this.x = v1;
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
                        this.w.invoke(composer0, ((int)(this.x >> 18 & 14)));
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
                if(enumSet0.contains(motionLayoutDebugFlags0)) {
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
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier1, false, new androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.4(motionMeasurer0), 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF215E3A, true, new Function2(motionLayoutScope0, v3, function20, v1) {
                    public final Function2 w;
                    public final int x;

                    {
                        this.w = function20;
                        this.x = v1;
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
                        this.w.invoke(composer0, ((int)(this.x >> 18 & 14)));
                    }
                }), measurePolicy0, composer0, 0x30, 0);
            }
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
        }
        else {
            MutableState mutableState4 = q.h(-270260906, composer0, 0xFFC7BCB7);
            Companion composer$Companion1 = Composer.Companion;
            if(mutableState4 == composer$Companion1.getEmpty()) {
                mutableState4 = SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composer0.updateRememberedValue(mutableState4);
            }
            composer0.endReplaceableGroup();
            composer0.startReplaceableGroup(0xFFC7BCB7);
            Measurer measurer0 = composer0.rememberedValue();
            if(measurer0 == composer$Companion1.getEmpty()) {
                measurer0 = new Measurer();
                composer0.updateRememberedValue(measurer0);
            }
            composer0.endReplaceableGroup();
            MeasurePolicy measurePolicy2 = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(((v2 & 4) == 0 ? v : 0x101), mutableState4, constraintSet0, measurer0, composer0, v1 << 6 & 0x380 | (v1 >> 6 & 14 | 0x1030));
            if(constraintSet0 instanceof EditableJSONLayout) {
                ((EditableJSONLayout)constraintSet0).setUpdateFlag(mutableState4);
            }
            if(constraintSet0 instanceof LayoutInformationReceiver) {
                layoutInformationReceiver0 = (LayoutInformationReceiver)constraintSet0;
                measurer1 = measurer0;
            }
            else {
                measurer1 = measurer0;
                layoutInformationReceiver0 = null;
            }
            measurer1.addLayoutInformationReceiver(layoutInformationReceiver0);
            float f2 = measurer1.getForcedScaleFactor();
            if(Float.isNaN(f2)) {
                composer0.startReplaceableGroup(0xEFE42A0A);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier1, false, new Function1(measurer1) {
                    public final Measurer w;

                    {
                        this.w = measurer0;
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
                }, 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF214D3E, true, new Function2(measurer1, function20, v1) {
                    public final Measurer w;
                    public final Function2 x;
                    public final int y;

                    {
                        this.w = measurer0;
                        this.x = function20;
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
                        this.w.createDesignElements(composer0, 8);
                        this.x.invoke(composer0, ((int)(this.y >> 18 & 14)));
                    }
                }), measurePolicy2, composer0, 0x30, 0);
            }
            else {
                composer0.startReplaceableGroup(-270260292);
                Modifier modifier2 = ScaleKt.scale(modifier1, measurer1.getForcedScaleFactor());
                composer0.startReplaceableGroup(-1990474327);
                MeasurePolicy measurePolicy3 = r0.a.i(Alignment.Companion, false, composer0, 0, 0x520574F7);
                Density density1 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
                Function0 function02 = composeUiNode$Companion1.getConstructor();
                Function3 function31 = LayoutKt.materializerOf(Modifier.Companion);
                if(composer0.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer0.startReusableNode();
                if(composer0.getInserting()) {
                    composer0.createNode(function02);
                }
                else {
                    composer0.useNode();
                }
                composer0.disableReusing();
                Updater.set-impl(composer0, measurePolicy3, composeUiNode$Companion1.getSetMeasurePolicy());
                Updater.set-impl(composer0, density1, composeUiNode$Companion1.getSetDensity());
                Updater.set-impl(composer0, layoutDirection1, composeUiNode$Companion1.getSetLayoutDirection());
                composer0.enableReusing();
                r0.a.w(0, function31, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
                composer0.startReplaceableGroup(-1253629305);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new Function1(measurer1) {
                    public final Measurer w;

                    {
                        this.w = measurer0;
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
                }, 1, null), ComposableLambdaKt.composableLambda(composer0, 0xCF214F4A, true, new Function2(measurer1, function20, v1) {
                    public final Measurer w;
                    public final Function2 x;
                    public final int y;

                    {
                        this.w = measurer0;
                        this.x = function20;
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
                        this.w.createDesignElements(composer0, 8);
                        this.x.invoke(composer0, ((int)(this.y >> 18 & 14)));
                    }
                }), measurePolicy2, composer0, 0x30, 0);
                measurer1.drawDebugBounds(BoxScopeInstance.INSTANCE, f2, composer0, 0x206);
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
                composer0.endNode();
                composer0.endReplaceableGroup();
                composer0.endReplaceableGroup();
            }
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
    }

    @NotNull
    public static final ConstraintSet ConstraintSet(@NotNull ConstraintSet constraintSet0, @Language("json5") @NotNull String s) {
        Intrinsics.checkNotNullParameter(constraintSet0, "extendConstraintSet");
        Intrinsics.checkNotNullParameter(s, "jsonContent");
        return new JSONConstraintSet(s, null, constraintSet0, 2, null);
    }

    @NotNull
    public static final ConstraintSet ConstraintSet(@NotNull ConstraintSet constraintSet0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(constraintSet0, "extendConstraintSet");
        Intrinsics.checkNotNullParameter(function10, "description");
        return new DslConstraintSet(function10, constraintSet0);
    }

    @NotNull
    public static final ConstraintSet ConstraintSet(@Language("json5") @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "jsonContent");
        return new JSONConstraintSet(s, null, null, 6, null);
    }

    @SuppressLint({"ComposableNaming"})
    @Composable
    @NotNull
    public static final ConstraintSet ConstraintSet(@Language("json5") @NotNull String s, @Language("json5") @Nullable String s1, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(s, "content");
        composer0.startReplaceableGroup(1704604894);
        if((v1 & 2) != 0) {
            s1 = null;
        }
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z = composer0.changed(s);
        boolean z1 = composer0.changed(s1);
        JSONConstraintSet jSONConstraintSet0 = composer0.rememberedValue();
        if(z || z1 || jSONConstraintSet0 == Composer.Companion.getEmpty()) {
            jSONConstraintSet0 = new JSONConstraintSet(s, s1, null, 4, null);
            composer0.updateRememberedValue(jSONConstraintSet0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return jSONConstraintSet0;
    }

    @NotNull
    public static final ConstraintSet ConstraintSet(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "description");
        return new DslConstraintSet(function10, null, 2, null);
    }

    public static final void access$ConstraintLayout$lambda-10(MutableState mutableState0, ConstraintSet constraintSet0) {
        mutableState0.setValue(constraintSet0);
    }

    public static final ConstraintSet access$ConstraintLayout$lambda-6(MutableState mutableState0) {
        return (ConstraintSet)mutableState0.getValue();
    }

    public static final void access$ConstraintLayout$lambda-7(MutableState mutableState0, ConstraintSet constraintSet0) {
        mutableState0.setValue(constraintSet0);
    }

    public static final ConstraintSet access$ConstraintLayout$lambda-9(MutableState mutableState0) {
        return (ConstraintSet)mutableState0.getValue();
    }

    public static final boolean access$getDEBUG$p() [...] // Inlined contents

    public static final String access$toDebugString(ConstraintWidget constraintWidget0) {
        return constraintWidget0.getDebugName() + " width " + constraintWidget0.getWidth() + " minWidth " + constraintWidget0.getMinWidth() + " maxWidth " + constraintWidget0.getMaxWidth() + " height " + constraintWidget0.getHeight() + " minHeight " + constraintWidget0.getMinHeight() + " maxHeight " + constraintWidget0.getMaxHeight() + " HDB " + constraintWidget0.getHorizontalDimensionBehaviour() + " VDB " + constraintWidget0.getVerticalDimensionBehaviour() + " MCW " + constraintWidget0.mMatchConstraintDefaultWidth + " MCH " + constraintWidget0.mMatchConstraintDefaultHeight + " percentW " + constraintWidget0.mMatchConstraintPercentWidth + " percentH " + constraintWidget0.mMatchConstraintPercentHeight;
    }

    public static final String access$toDebugString(Measure basicMeasure$Measure0) [...] // Inlined contents

    @NotNull
    public static final MaxCoercible atLeast-3ABfNKs(@NotNull Coercible dimension$Coercible0, float f) {
        Intrinsics.checkNotNullParameter(dimension$Coercible0, "$this$atLeast");
        ((DimensionDescription)dimension$Coercible0).setMin-YLDhkOg(Dp.box-impl(f));
        return (DimensionDescription)dimension$Coercible0;
    }

    @NotNull
    public static final Dimension atLeast-3ABfNKs(@NotNull MinCoercible dimension$MinCoercible0, float f) {
        Intrinsics.checkNotNullParameter(dimension$MinCoercible0, "$this$atLeast");
        ((DimensionDescription)dimension$MinCoercible0).setMin-YLDhkOg(Dp.box-impl(f));
        return (DimensionDescription)dimension$MinCoercible0;
    }

    @Deprecated(message = "Unintended method name, use atLeast(dp) instead", replaceWith = @ReplaceWith(expression = "this.atLeast(dp)", imports = {"androidx.constraintlayout.compose.atLeast"}))
    @NotNull
    public static final Dimension atLeastWrapContent-3ABfNKs(@NotNull MinCoercible dimension$MinCoercible0, float f) {
        Intrinsics.checkNotNullParameter(dimension$MinCoercible0, "$this$atLeastWrapContent");
        ((DimensionDescription)dimension$MinCoercible0).setMin-YLDhkOg(Dp.box-impl(f));
        return (DimensionDescription)dimension$MinCoercible0;
    }

    @NotNull
    public static final MinCoercible atMost-3ABfNKs(@NotNull Coercible dimension$Coercible0, float f) {
        Intrinsics.checkNotNullParameter(dimension$Coercible0, "$this$atMost");
        ((DimensionDescription)dimension$Coercible0).setMax-YLDhkOg(Dp.box-impl(f));
        return (DimensionDescription)dimension$Coercible0;
    }

    @NotNull
    public static final Dimension atMost-3ABfNKs(@NotNull MaxCoercible dimension$MaxCoercible0, float f) {
        Intrinsics.checkNotNullParameter(dimension$MaxCoercible0, "$this$atMost");
        ((DimensionDescription)dimension$MaxCoercible0).setMax-YLDhkOg(Dp.box-impl(f));
        return (DimensionDescription)dimension$MaxCoercible0;
    }

    public static final void buildMapping(@NotNull State state0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        Intrinsics.checkNotNullParameter(list0, "measurables");
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Measurable measurable0 = (Measurable)list0.get(v1);
                Object object0 = LayoutIdKt.getLayoutId(measurable0);
                if(object0 == null) {
                    Object object1 = ConstraintLayoutTagKt.getConstraintLayoutId(measurable0);
                    object0 = object1 == null ? ConstraintLayoutKt.createId() : object1;
                }
                state0.map(object0, measurable0);
                Object object2 = ConstraintLayoutTagKt.getConstraintLayoutTag(measurable0);
                if(object2 != null && object2 instanceof String && object0 instanceof String) {
                    state0.setTag(((String)object0), ((String)object2));
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
    }

    @NotNull
    public static final Object createId() {
        return new Object() {  // 初始化器: Ljava/lang/Object;-><init>()V
        };
    }

    @NotNull
    public static final MaxCoercible getAtLeastWrapContent(@NotNull Coercible dimension$Coercible0) {
        Intrinsics.checkNotNullParameter(dimension$Coercible0, "<this>");
        ((DimensionDescription)dimension$Coercible0).setMinSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return (DimensionDescription)dimension$Coercible0;
    }

    @NotNull
    public static final Dimension getAtLeastWrapContent(@NotNull MinCoercible dimension$MinCoercible0) {
        Intrinsics.checkNotNullParameter(dimension$MinCoercible0, "<this>");
        ((DimensionDescription)dimension$MinCoercible0).setMinSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return (DimensionDescription)dimension$MinCoercible0;
    }

    @NotNull
    public static final MinCoercible getAtMostWrapContent(@NotNull Coercible dimension$Coercible0) {
        Intrinsics.checkNotNullParameter(dimension$Coercible0, "<this>");
        ((DimensionDescription)dimension$Coercible0).setMaxSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return (DimensionDescription)dimension$Coercible0;
    }

    @NotNull
    public static final Dimension getAtMostWrapContent(@NotNull MaxCoercible dimension$MaxCoercible0) {
        Intrinsics.checkNotNullParameter(dimension$MaxCoercible0, "<this>");
        ((DimensionDescription)dimension$MaxCoercible0).setMaxSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return (DimensionDescription)dimension$MaxCoercible0;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rememberConstraintLayoutMeasurePolicy(int v, @NotNull MutableState mutableState0, @NotNull ConstraintSet constraintSet0, @NotNull Measurer measurer0, @Nullable Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(mutableState0, "needsUpdate");
        Intrinsics.checkNotNullParameter(constraintSet0, "constraintSet");
        Intrinsics.checkNotNullParameter(measurer0, "measurer");
        composer0.startReplaceableGroup(-441904452);
        Object object0 = mutableState0.getValue();
        composer0.startReplaceableGroup(0xFFC7C131);
        boolean z = composer0.changed(v);
        boolean z1 = composer0.changed(object0);
        boolean z2 = composer0.changed(constraintSet0);
        o o0 = composer0.rememberedValue();
        if((z1 | z | z2) != 0 || o0 == Composer.Companion.getEmpty()) {
            measurer0.parseDesignElements(constraintSet0);
            o0 = new o(measurer0, constraintSet0, v);
            composer0.updateRememberedValue(o0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return o0;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final Pair rememberConstraintLayoutMeasurePolicy(int v, @NotNull ConstraintLayoutScope constraintLayoutScope0, @NotNull MutableState mutableState0, @NotNull Measurer measurer0, @Nullable Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(constraintLayoutScope0, "scope");
        Intrinsics.checkNotNullParameter(mutableState0, "remeasureRequesterState");
        Intrinsics.checkNotNullParameter(measurer0, "measurer");
        composer0.startReplaceableGroup(0xE5A8F639);
        composer0.startReplaceableGroup(0xFFC7BCB7);
        u u0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(u0 == composer$Companion0.getEmpty()) {
            u0 = new u(constraintLayoutScope0);
            composer0.updateRememberedValue(u0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(-3686930);
        boolean z = composer0.changed(v);
        Pair pair0 = composer0.rememberedValue();
        if(z || pair0 == composer$Companion0.getEmpty()) {
            pair0 = TuplesKt.to(new n(measurer0, u0, v, mutableState0), new m(10, mutableState0, u0));
            composer0.updateRememberedValue(pair0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return pair0;
    }
}

