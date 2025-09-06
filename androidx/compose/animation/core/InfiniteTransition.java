package androidx.compose.animation.core;

import androidx.compose.material3.gd;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.m;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000B\u001A\u00020\b2\u0012\u0010\u0007\u001A\u000E\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001A\u00020\b2\u0012\u0010\u0007\u001A\u000E\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\nJ\u000F\u0010\u0010\u001A\u00020\bH\u0001¢\u0006\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R#\u0010\u0018\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u00000\u00158F¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u001A"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "", "label", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "animation", "", "addAnimation$animation_core_release", "(Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;)V", "addAnimation", "removeAnimation$animation_core_release", "removeAnimation", "run$animation_core_release", "(Landroidx/compose/runtime/Composer;I)V", "run", "a", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "", "getAnimations", "()Ljava/util/List;", "animations", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n1208#2:365\n1187#2,2:366\n81#3:368\n107#3,2:369\n81#3:371\n107#3,2:372\n1223#4,6:374\n1223#4,6:380\n460#5,11:386\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n150#1:365\n150#1:366,2\n151#1:368\n151#1:369,2\n153#1:371\n153#1:372,2\n173#1:374,6\n177#1:380,6\n217#1:386,11\n*E\n"})
public final class InfiniteTransition {
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001A\u00028\u0000\u0012\u0006\u0010\u0006\u001A\u00028\u0000\u0012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJ-\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0006\u001A\u00028\u00002\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u0014\u001A\u00020\u0013H\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u001A\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001C\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b\u001B\u0010\u0019R\"\u0010\u0005\u001A\u00028\u00008\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0006\u001A\u00028\u00008\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b#\u0010\u001E\u001A\u0004\b$\u0010 \"\u0004\b%\u0010\"R#\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u0017\u0010\f\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R+\u00103\u001A\u00028\u00002\u0006\u0010.\u001A\u00028\u00008V@PX\u0096\u008E\u0002\u00A2\u0006\u0012\n\u0004\b/\u00100\u001A\u0004\b1\u0010 \"\u0004\b2\u0010\"R0\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010.\u001A\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107RB\u0010?\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001082\u0012\u0010.\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001088\u0006@@X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001A\u00020@8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010B\u001A\u0004\bC\u0010D\"\u0004\bE\u0010F\u00A8\u0006H"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "initialValue", "targetValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "", "label", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;)V", "", "updateValues$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;)V", "updateValues", "", "playTimeNanos", "onPlayTimeChanged$animation_core_release", "(J)V", "onPlayTimeChanged", "skipToEnd$animation_core_release", "()V", "skipToEnd", "reset$animation_core_release", "reset", "a", "Ljava/lang/Object;", "getInitialValue$animation_core_release", "()Ljava/lang/Object;", "setInitialValue$animation_core_release", "(Ljava/lang/Object;)V", "b", "getTargetValue$animation_core_release", "setTargetValue$animation_core_release", "c", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "d", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "getValue", "setValue$animation_core_release", "value", "f", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/TargetBasedAnimation;", "g", "Landroidx/compose/animation/core/TargetBasedAnimation;", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation$animation_core_release", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation", "", "h", "Z", "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n81#2:365\n107#2,2:366\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n76#1:365\n76#1:366,2\n*E\n"})
    public final class TransitionAnimationState implements State {
        public Object a;
        public Object b;
        public final TwoWayConverter c;
        public final String d;
        public final MutableState e;
        public AnimationSpec f;
        public TargetBasedAnimation g;
        public boolean h;
        public boolean i;
        public long j;
        public final InfiniteTransition k;

        public TransitionAnimationState(Object object0, Object object1, @NotNull TwoWayConverter twoWayConverter0, @NotNull AnimationSpec animationSpec0, @NotNull String s) {
            this.a = object0;
            this.b = object1;
            this.c = twoWayConverter0;
            this.d = s;
            this.e = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            this.f = animationSpec0;
            this.g = new TargetBasedAnimation(animationSpec0, twoWayConverter0, this.a, this.b, null, 16, null);
        }

        @NotNull
        public final TargetBasedAnimation getAnimation() {
            return this.g;
        }

        @NotNull
        public final AnimationSpec getAnimationSpec() {
            return this.f;
        }

        public final Object getInitialValue$animation_core_release() {
            return this.a;
        }

        @NotNull
        public final String getLabel() {
            return this.d;
        }

        public final Object getTargetValue$animation_core_release() {
            return this.b;
        }

        @NotNull
        public final TwoWayConverter getTypeConverter() {
            return this.c;
        }

        @Override  // androidx.compose.runtime.State
        public Object getValue() {
            return this.e.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return this.h;
        }

        public final void onPlayTimeChanged$animation_core_release(long v) {
            InfiniteTransition.access$setRefreshChildNeeded(InfiniteTransition.this, false);
            if(this.i) {
                this.i = false;
                this.j = v;
            }
            long v1 = v - this.j;
            this.setValue$animation_core_release(this.g.getValueFromNanos(v1));
            this.h = this.g.isFinishedFromNanos(v1);
        }

        public final void reset$animation_core_release() {
            this.i = true;
        }

        public final void setAnimation$animation_core_release(@NotNull TargetBasedAnimation targetBasedAnimation0) {
            this.g = targetBasedAnimation0;
        }

        public final void setFinished$animation_core_release(boolean z) {
            this.h = z;
        }

        public final void setInitialValue$animation_core_release(Object object0) {
            this.a = object0;
        }

        public final void setTargetValue$animation_core_release(Object object0) {
            this.b = object0;
        }

        public void setValue$animation_core_release(Object object0) {
            this.e.setValue(object0);
        }

        public final void skipToEnd$animation_core_release() {
            this.setValue$animation_core_release(this.g.getTargetValue());
            this.i = true;
        }

        public final void updateValues$animation_core_release(Object object0, Object object1, @NotNull AnimationSpec animationSpec0) {
            this.a = object0;
            this.b = object1;
            this.f = animationSpec0;
            this.g = new TargetBasedAnimation(animationSpec0, this.c, object0, object1, null, 16, null);
            InfiniteTransition.access$setRefreshChildNeeded(InfiniteTransition.this, true);
            this.h = false;
            this.i = true;
        }
    }

    public static final int $stable = 8;
    public final String a;
    public final MutableVector b;
    public final MutableState c;
    public long d;
    public final MutableState e;

    public InfiniteTransition(@NotNull String s) {
        this.a = s;
        this.b = new MutableVector(new TransitionAnimationState[16], 0);
        this.c = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.d = 0x8000000000000000L;
        this.e = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final void access$onFrame(InfiniteTransition infiniteTransition0, long v) {
        int v2;
        MutableVector mutableVector0 = infiniteTransition0.b;
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            v2 = 1;
            int v3 = 0;
            do {
                TransitionAnimationState infiniteTransition$TransitionAnimationState0 = (TransitionAnimationState)arr_object[v3];
                if(!infiniteTransition$TransitionAnimationState0.isFinished$animation_core_release()) {
                    infiniteTransition$TransitionAnimationState0.onPlayTimeChanged$animation_core_release(v);
                }
                if(!infiniteTransition$TransitionAnimationState0.isFinished$animation_core_release()) {
                    v2 = 0;
                }
                ++v3;
            }
            while(v3 < v1);
        }
        else {
            v2 = 1;
        }
        infiniteTransition0.e.setValue(Boolean.valueOf(((boolean)(v2 ^ 1))));
    }

    public static final void access$setRefreshChildNeeded(InfiniteTransition infiniteTransition0, boolean z) {
        infiniteTransition0.c.setValue(Boolean.valueOf(z));
    }

    public final void addAnimation$animation_core_release(@NotNull TransitionAnimationState infiniteTransition$TransitionAnimationState0) {
        this.b.add(infiniteTransition$TransitionAnimationState0);
        this.c.setValue(Boolean.TRUE);
    }

    @NotNull
    public final List getAnimations() {
        return this.b.asMutableList();
    }

    @NotNull
    public final String getLabel() {
        return this.a;
    }

    public final void removeAnimation$animation_core_release(@NotNull TransitionAnimationState infiniteTransition$TransitionAnimationState0) {
        this.b.remove(infiniteTransition$TransitionAnimationState0);
    }

    @Composable
    public final void run$animation_core_release(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xED0B0967);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(this) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xED0B0967, v1, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            if(((Boolean)this.e.getValue()).booleanValue() || ((Boolean)this.c.getValue()).booleanValue()) {
                composer1.startReplaceGroup(0x6683D52A);
                boolean z = composer1.changedInstance(this);
                m m0 = composer1.rememberedValue();
                if(z || m0 == composer$Companion0.getEmpty()) {
                    m0 = new m(mutableState0, this, null);
                    composer1.updateRememberedValue(m0);
                }
                EffectsKt.LaunchedEffect(this, m0, composer1, v1 & 14);
            }
            else {
                composer1.startReplaceGroup(0x669B07D8);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(this, v, 14));
        }
    }
}

