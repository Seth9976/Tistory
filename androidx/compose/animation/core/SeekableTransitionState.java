package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex.DefaultImpls;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s.h1;
import t.q;
import t.r;
import t.s;
import t.u;
import t.v;
import t.w;
import t.x;
import zd.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001A\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002IJB\u000F\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00028\u0000H\u0086@\u00A2\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001A\u00020\u00072\b\b\u0001\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\u0006\u001A\u00028\u0000H\u0086@\u00A2\u0006\u0004\b\f\u0010\rJ,\u0010\u0010\u001A\u00020\u00072\b\b\u0002\u0010\u0006\u001A\u00028\u00002\u0010\b\u0002\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000EH\u0086@\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0016\u001A\u00020\u00072\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0010\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0019\u001A\u00020\u0007H\u0010\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001B\u001A\u00020\u0007H\u0000\u00A2\u0006\u0004\b\u001A\u0010\u0018J\u000F\u0010\u001D\u001A\u00020\u0007H\u0000\u00A2\u0006\u0004\b\u001C\u0010\u0018R+\u0010\u0006\u001A\u00028\u00002\u0006\u0010\u001E\u001A\u00028\u00008V@PX\u0096\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010\u0005R+\u0010\'\u001A\u00028\u00002\u0006\u0010\u001E\u001A\u00028\u00008V@PX\u0096\u008E\u0002\u00A2\u0006\u0012\n\u0004\b$\u0010 \u001A\u0004\b%\u0010\"\"\u0004\b&\u0010\u0005R\"\u0010,\u001A\u00028\u00008\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\"\"\u0004\b+\u0010\u0005R\"\u00104\u001A\u00020-8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u00101\"\u0004\b2\u00103R+\u0010\u000B\u001A\u00020\n2\u0006\u0010\u001E\u001A\u00020\n8G@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b5\u00106\u001A\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010B\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010;8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001A\u0010H\u001A\u00020C8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010G\u00A8\u0006K"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "initialState", "<init>", "(Ljava/lang/Object;)V", "targetState", "", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fraction", "seekTo", "(FLjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Transition;", "transition", "transitionConfigured$animation_core_release", "(Landroidx/compose/animation/core/Transition;)V", "transitionConfigured", "transitionRemoved$animation_core_release", "()V", "transitionRemoved", "observeTotalDuration$animation_core_release", "observeTotalDuration", "onTotalDurationChanged$animation_core_release", "onTotalDurationChanged", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getTargetState", "()Ljava/lang/Object;", "setTargetState$animation_core_release", "c", "getCurrentState", "setCurrentState$animation_core_release", "currentState", "d", "Ljava/lang/Object;", "getComposedTargetState$animation_core_release", "setComposedTargetState$animation_core_release", "composedTargetState", "", "f", "J", "getTotalDurationNanos$animation_core_release", "()J", "setTotalDurationNanos$animation_core_release", "(J)V", "totalDurationNanos", "h", "Landroidx/compose/runtime/MutableFloatState;", "getFraction", "()F", "setFraction", "(F)V", "Lkotlinx/coroutines/CancellableContinuation;", "i", "Lkotlinx/coroutines/CancellableContinuation;", "getCompositionContinuation$animation_core_release", "()Lkotlinx/coroutines/CancellableContinuation;", "setCompositionContinuation$animation_core_release", "(Lkotlinx/coroutines/CancellableContinuation;)V", "compositionContinuation", "Lkotlinx/coroutines/sync/Mutex;", "j", "Lkotlinx/coroutines/sync/Mutex;", "getCompositionContinuationMutex$animation_core_release", "()Lkotlinx/coroutines/sync/Mutex;", "compositionContinuationMutex", "t/q", "SeekingAnimationState", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 6 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,2183:1\n81#2:2184\n107#2,2:2185\n81#2:2187\n107#2,2:2188\n76#3:2190\n109#3,2:2191\n33#4,7:2193\n54#4,7:2224\n314#5,11:2200\n314#5,11:2211\n948#6,2:2222\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n*L\n225#1:2184\n225#1:2185,2\n227#1:2187\n227#1:2188,2\n256#1:2190\n256#1:2191,2\n501#1:2193,7\n699#1:2224,7\n544#1:2200,11\n565#1:2211,11\n595#1:2222,2\n*E\n"})
public final class SeekableTransitionState extends TransitionState {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u001B\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000E\u001A\u00020\u00078\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR*\u0010\u0017\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000F8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001B\u001A\u00020\u00188\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\"\u0010&\u001A\u00020\u001F8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001A\u00020\u00108\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00101\u001A\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b.\u0010(\u001A\u0004\b/\u0010*\"\u0004\b0\u0010,R\"\u00105\u001A\u00020\u00078\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b2\u0010\t\u001A\u0004\b3\u0010\u000B\"\u0004\b4\u0010\rR\"\u00109\u001A\u00020\u00078\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b6\u0010\t\u001A\u0004\b7\u0010\u000B\"\u0004\b8\u0010\r¨\u0006:"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "a", "J", "getProgressNanos", "()J", "setProgressNanos", "(J)V", "progressNanos", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "b", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;)V", "animationSpec", "", "c", "Z", "isComplete", "()Z", "setComplete", "(Z)V", "", "d", "F", "getValue", "()F", "setValue", "(F)V", "value", "e", "Landroidx/compose/animation/core/AnimationVector1D;", "getStart", "()Landroidx/compose/animation/core/AnimationVector1D;", "setStart", "(Landroidx/compose/animation/core/AnimationVector1D;)V", "start", "f", "getInitialVelocity", "setInitialVelocity", "initialVelocity", "g", "getDurationNanos", "setDurationNanos", "durationNanos", "h", "getAnimationSpecDuration", "setAnimationSpecDuration", "animationSpecDuration", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class SeekingAnimationState {
        public static final int $stable = 8;
        public long a;
        public VectorizedAnimationSpec b;
        public boolean c;
        public float d;
        public AnimationVector1D e;
        public AnimationVector1D f;
        public long g;
        public long h;

        public SeekingAnimationState() {
            this.e = new AnimationVector1D(0.0f);
        }

        @Nullable
        public final VectorizedAnimationSpec getAnimationSpec() {
            return this.b;
        }

        public final long getAnimationSpecDuration() {
            return this.h;
        }

        public final long getDurationNanos() {
            return this.g;
        }

        @Nullable
        public final AnimationVector1D getInitialVelocity() {
            return this.f;
        }

        public final long getProgressNanos() {
            return this.a;
        }

        @NotNull
        public final AnimationVector1D getStart() {
            return this.e;
        }

        public final float getValue() {
            return this.d;
        }

        public final boolean isComplete() {
            return this.c;
        }

        public final void setAnimationSpec(@Nullable VectorizedAnimationSpec vectorizedAnimationSpec0) {
            this.b = vectorizedAnimationSpec0;
        }

        public final void setAnimationSpecDuration(long v) {
            this.h = v;
        }

        public final void setComplete(boolean z) {
            this.c = z;
        }

        public final void setDurationNanos(long v) {
            this.g = v;
        }

        public final void setInitialVelocity(@Nullable AnimationVector1D animationVector1D0) {
            this.f = animationVector1D0;
        }

        public final void setProgressNanos(long v) {
            this.a = v;
        }

        public final void setStart(@NotNull AnimationVector1D animationVector1D0) {
            this.e = animationVector1D0;
        }

        public final void setValue(float f) {
            this.d = f;
        }

        @Override
        @NotNull
        public String toString() {
            return "progress nanos: " + this.a + ", animationSpec: " + this.b + ", isComplete: " + this.c + ", value: " + this.d + ", start: " + this.e + ", initialVelocity: " + this.f + ", durationNanos: " + this.g + ", animationSpecDuration: " + this.h;
        }
    }

    public static final int $stable = 8;
    public final MutableState b;
    public final MutableState c;
    public Object d;
    public Transition e;
    public long f;
    public final e g;
    public final MutableFloatState h;
    public CancellableContinuation i;
    public final Mutex j;
    public final MutatorMutex k;
    public long l;
    public final MutableObjectList m;
    public SeekingAnimationState n;
    public final h1 o;
    public float p;
    public final d q;
    public static final q r;
    public static final AnimationVector1D s;
    public static final AnimationVector1D t;

    static {
        SeekableTransitionState.r = new q();  // 初始化器: Ljava/lang/Object;-><init>()V
        SeekableTransitionState.s = new AnimationVector1D(0.0f);
        SeekableTransitionState.t = new AnimationVector1D(1.0f);
    }

    public SeekableTransitionState(Object object0) {
        super(null);
        this.b = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
        this.c = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
        this.d = object0;
        this.g = new e(this, 22);
        this.h = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.j = MutexKt.Mutex$default(false, 1, null);
        this.k = new MutatorMutex();
        this.l = 0x8000000000000000L;
        this.m = new MutableObjectList(0, 1, null);
        this.o = new h1(this, 6);
        this.q = new d(this);
    }

    public final Object a(Continuation continuation0) {
        float f = SuspendAnimationKt.getDurationScale(continuation0.getContext());
        if(f <= 0.0f) {
            this.b();
            return Unit.INSTANCE;
        }
        this.p = f;
        Object object0 = MonotonicFrameClockKt.withFrameNanos(this.q, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static final Object access$animateOneFrame(SeekableTransitionState seekableTransitionState0, Continuation continuation0) {
        return seekableTransitionState0.a(continuation0);
    }

    public static final Object access$doOneFrame(SeekableTransitionState seekableTransitionState0, Continuation continuation0) {
        Unit unit0;
        if(seekableTransitionState0.l == 0x8000000000000000L) {
            unit0 = MonotonicFrameClockKt.withFrameNanos(seekableTransitionState0.o, continuation0);
            return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
        }
        unit0 = seekableTransitionState0.a(continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final void access$moveAnimationToInitialState(SeekableTransitionState seekableTransitionState0) {
        Transition transition0 = seekableTransitionState0.e;
        if(transition0 != null) {
            SeekingAnimationState seekableTransitionState$SeekingAnimationState0 = seekableTransitionState0.n;
            if(seekableTransitionState$SeekingAnimationState0 == null) {
                if(seekableTransitionState0.f <= 0L || seekableTransitionState0.getFraction() == 1.0f || Intrinsics.areEqual(seekableTransitionState0.getCurrentState(), seekableTransitionState0.getTargetState())) {
                    seekableTransitionState$SeekingAnimationState0 = null;
                }
                else {
                    seekableTransitionState$SeekingAnimationState0 = new SeekingAnimationState();
                    seekableTransitionState$SeekingAnimationState0.setValue(seekableTransitionState0.getFraction());
                    long v = seekableTransitionState0.f;
                    seekableTransitionState$SeekingAnimationState0.setDurationNanos(v);
                    seekableTransitionState$SeekingAnimationState0.setAnimationSpecDuration(c.roundToLong((1.0 - ((double)seekableTransitionState0.getFraction())) * ((double)v)));
                    seekableTransitionState$SeekingAnimationState0.getStart().set$animation_core_release(0, seekableTransitionState0.getFraction());
                }
            }
            if(seekableTransitionState$SeekingAnimationState0 != null) {
                seekableTransitionState$SeekingAnimationState0.setDurationNanos(seekableTransitionState0.f);
                seekableTransitionState0.m.add(seekableTransitionState$SeekingAnimationState0);
                transition0.setInitialAnimations$animation_core_release(seekableTransitionState$SeekingAnimationState0);
            }
            seekableTransitionState0.n = null;
        }
    }

    public static final void access$recalculateAnimationValue(SeekableTransitionState seekableTransitionState0, SeekingAnimationState seekableTransitionState$SeekingAnimationState0, long v) {
        seekableTransitionState0.getClass();
        long v1 = seekableTransitionState$SeekingAnimationState0.getProgressNanos() + v;
        seekableTransitionState$SeekingAnimationState0.setProgressNanos(v1);
        long v2 = seekableTransitionState$SeekingAnimationState0.getAnimationSpecDuration();
        if(Long.compare(v1, v2) >= 0) {
            seekableTransitionState$SeekingAnimationState0.setValue(1.0f);
            return;
        }
        VectorizedAnimationSpec vectorizedAnimationSpec0 = seekableTransitionState$SeekingAnimationState0.getAnimationSpec();
        if(vectorizedAnimationSpec0 != null) {
            seekableTransitionState$SeekingAnimationState0.setValue(kotlin.ranges.c.coerceIn(((AnimationVector1D)vectorizedAnimationSpec0.getValueFromNanos(v1, seekableTransitionState$SeekingAnimationState0.getStart(), SeekableTransitionState.t, (seekableTransitionState$SeekingAnimationState0.getInitialVelocity() == null ? SeekableTransitionState.s : seekableTransitionState$SeekingAnimationState0.getInitialVelocity()))).get$animation_core_release(0), 0.0f, 1.0f));
            return;
        }
        seekableTransitionState$SeekingAnimationState0.setValue(VectorConvertersKt.lerp(seekableTransitionState$SeekingAnimationState0.getStart().get$animation_core_release(0), 1.0f, ((float)v1) / ((float)v2)));
    }

    public static final Object access$runAnimations(SeekableTransitionState seekableTransitionState0, Continuation continuation0) {
        s s0;
        seekableTransitionState0.getClass();
        if(continuation0 instanceof s) {
            s0 = (s)continuation0;
            int v = s0.r;
            if((v & 0x80000000) == 0) {
                s0 = new s(seekableTransitionState0, continuation0);
            }
            else {
                s0.r = v ^ 0x80000000;
            }
        }
        else {
            s0 = new s(seekableTransitionState0, continuation0);
        }
        Object object0 = s0.p;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(s0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(seekableTransitionState0.m.isEmpty() && seekableTransitionState0.n == null) {
                    return Unit.INSTANCE;
                }
                if(SuspendAnimationKt.getDurationScale(s0.getContext()) == 0.0f) {
                    seekableTransitionState0.b();
                    seekableTransitionState0.l = 0x8000000000000000L;
                    return Unit.INSTANCE;
                }
                if(seekableTransitionState0.l == 0x8000000000000000L) {
                    s0.o = seekableTransitionState0;
                    s0.r = 1;
                    if(MonotonicFrameClockKt.withFrameNanos(seekableTransitionState0.o, s0) != unit0) {
                        goto label_28;
                    }
                }
                else {
                    goto label_28;
                }
                break;
            }
            case 1: 
            case 2: {
                seekableTransitionState0 = s0.o;
                ResultKt.throwOnFailure(object0);
                while(true) {
                label_28:
                    if(!seekableTransitionState0.m.isNotEmpty() && seekableTransitionState0.n == null) {
                        seekableTransitionState0.l = 0x8000000000000000L;
                        return Unit.INSTANCE;
                    }
                    s0.o = seekableTransitionState0;
                    s0.r = 2;
                    if(seekableTransitionState0.a(s0) != unit0) {
                        continue;
                    }
                    break alab1;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return unit0;
    }

    public static final void access$setFraction(SeekableTransitionState seekableTransitionState0, float f) {
        seekableTransitionState0.h.setFloatValue(f);
    }

    public static final Object access$waitForComposition(SeekableTransitionState seekableTransitionState0, Continuation continuation0) {
        Object object4;
        SeekableTransitionState seekableTransitionState2;
        Object object1;
        w w0;
        seekableTransitionState0.getClass();
        if(continuation0 instanceof w) {
            w0 = (w)continuation0;
            int v = w0.s;
            if((v & 0x80000000) == 0) {
                w0 = new w(seekableTransitionState0, continuation0);
            }
            else {
                w0.s = v ^ 0x80000000;
            }
        }
        else {
            w0 = new w(seekableTransitionState0, continuation0);
        }
        Object object0 = w0.q;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(w0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                object1 = seekableTransitionState0.getTargetState();
                w0.o = seekableTransitionState0;
                w0.p = object1;
                w0.s = 1;
                if(DefaultImpls.lock$default(seekableTransitionState0.j, null, w0, 1, null) != unit0) {
                    goto label_26;
                }
                return unit0;
            }
            case 1: {
                Object object2 = w0.p;
                SeekableTransitionState seekableTransitionState1 = w0.o;
                ResultKt.throwOnFailure(object0);
                object1 = object2;
                seekableTransitionState0 = seekableTransitionState1;
            label_26:
                w0.o = seekableTransitionState0;
                w0.p = object1;
                w0.s = 2;
                CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(w0), 1);
                cancellableContinuationImpl0.initCancellability();
                seekableTransitionState0.setCompositionContinuation$animation_core_release(cancellableContinuationImpl0);
                DefaultImpls.unlock$default(seekableTransitionState0.getCompositionContinuationMutex$animation_core_release(), null, 1, null);
                Object object3 = cancellableContinuationImpl0.getResult();
                if(object3 == a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(w0);
                }
                if(object3 != unit0) {
                    seekableTransitionState2 = seekableTransitionState0;
                    object4 = object1;
                    object0 = object3;
                    break;
                }
                return unit0;
            }
            case 2: {
                object4 = w0.p;
                seekableTransitionState2 = w0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(Intrinsics.areEqual(object0, object4)) {
            return Unit.INSTANCE;
        }
        seekableTransitionState2.l = 0x8000000000000000L;
        throw new CancellationException("targetState while waiting for composition");
    }

    public static final Object access$waitForCompositionAfterTargetStateChange(SeekableTransitionState seekableTransitionState0, Continuation continuation0) {
        SeekableTransitionState seekableTransitionState2;
        Object object2;
        SeekableTransitionState seekableTransitionState1;
        x x0;
        seekableTransitionState0.getClass();
        if(continuation0 instanceof x) {
            x0 = (x)continuation0;
            int v = x0.s;
            if((v & 0x80000000) == 0) {
                x0 = new x(seekableTransitionState0, continuation0);
            }
            else {
                x0.s = v ^ 0x80000000;
            }
        }
        else {
            x0 = new x(seekableTransitionState0, continuation0);
        }
        Object object0 = x0.q;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(x0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Object object1 = seekableTransitionState0.getTargetState();
                x0.o = seekableTransitionState0;
                x0.p = object1;
                x0.s = 1;
                if(DefaultImpls.lock$default(seekableTransitionState0.j, null, x0, 1, null) != unit0) {
                    seekableTransitionState1 = seekableTransitionState0;
                    object2 = object1;
                    goto label_26;
                }
                return unit0;
            }
            case 1: {
                object2 = x0.p;
                seekableTransitionState1 = x0.o;
                ResultKt.throwOnFailure(object0);
            label_26:
                if(Intrinsics.areEqual(object2, seekableTransitionState1.d)) {
                    DefaultImpls.unlock$default(seekableTransitionState1.j, null, 1, null);
                    return Unit.INSTANCE;
                }
                x0.o = seekableTransitionState1;
                x0.p = object2;
                x0.s = 2;
                CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(x0), 1);
                cancellableContinuationImpl0.initCancellability();
                seekableTransitionState1.setCompositionContinuation$animation_core_release(cancellableContinuationImpl0);
                DefaultImpls.unlock$default(seekableTransitionState1.getCompositionContinuationMutex$animation_core_release(), null, 1, null);
                object0 = cancellableContinuationImpl0.getResult();
                if(object0 == a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(x0);
                }
                if(object0 != unit0) {
                    seekableTransitionState2 = seekableTransitionState1;
                    break;
                }
                return unit0;
            }
            case 2: {
                object2 = x0.p;
                seekableTransitionState2 = x0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(Intrinsics.areEqual(object0, object2)) {
            return Unit.INSTANCE;
        }
        seekableTransitionState2.l = 0x8000000000000000L;
        throw new CancellationException("snapTo() was canceled because state was changed to " + object0 + " instead of " + object2);
    }

    @Nullable
    public final Object animateTo(Object object0, @Nullable FiniteAnimationSpec finiteAnimationSpec0, @NotNull Continuation continuation0) {
        Transition transition0 = this.e;
        if(transition0 == null) {
            return Unit.INSTANCE;
        }
        r r0 = new r(finiteAnimationSpec0, this, transition0, object0, null);
        Object object1 = MutatorMutex.mutate$default(this.k, null, r0, continuation0, 1, null);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    public static Object animateTo$default(SeekableTransitionState seekableTransitionState0, Object object0, FiniteAnimationSpec finiteAnimationSpec0, Continuation continuation0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = seekableTransitionState0.getTargetState();
        }
        if((v & 2) != 0) {
            finiteAnimationSpec0 = null;
        }
        return seekableTransitionState0.animateTo(object0, finiteAnimationSpec0, continuation0);
    }

    public final void b() {
        Transition transition0 = this.e;
        if(transition0 != null) {
            transition0.clearInitialAnimations$animation_core_release();
        }
        this.m.clear();
        if(this.n != null) {
            this.n = null;
            this.h.setFloatValue(1.0f);
            this.c();
        }
    }

    public final void c() {
        Transition transition0 = this.e;
        if(transition0 == null) {
            return;
        }
        transition0.seekAnimations$animation_core_release(c.roundToLong(((double)this.getFraction()) * ((double)transition0.getTotalDurationNanos())));
    }

    public final Object getComposedTargetState$animation_core_release() {
        return this.d;
    }

    @Nullable
    public final CancellableContinuation getCompositionContinuation$animation_core_release() {
        return this.i;
    }

    @NotNull
    public final Mutex getCompositionContinuationMutex$animation_core_release() {
        return this.j;
    }

    @Override  // androidx.compose.animation.core.TransitionState
    public Object getCurrentState() {
        return this.c.getValue();
    }

    @FloatRange(from = 0.0, to = 1.0)
    public final float getFraction() {
        return this.h.getFloatValue();
    }

    @Override  // androidx.compose.animation.core.TransitionState
    public Object getTargetState() {
        return this.b.getValue();
    }

    public final long getTotalDurationNanos$animation_core_release() {
        return this.f;
    }

    public final void observeTotalDuration$animation_core_release() {
        TransitionKt.getSeekableStateObserver().observeReads(this, TransitionKt.a, this.g);
    }

    public final void onTotalDurationChanged$animation_core_release() {
        long v = this.f;
        this.observeTotalDuration$animation_core_release();
        long v1 = this.f;
        if(v != v1) {
            SeekingAnimationState seekableTransitionState$SeekingAnimationState0 = this.n;
            if(seekableTransitionState$SeekingAnimationState0 == null) {
                this.c();
            }
            else {
                seekableTransitionState$SeekingAnimationState0.setDurationNanos(v1);
                if(seekableTransitionState$SeekingAnimationState0.getAnimationSpec() == null) {
                    seekableTransitionState$SeekingAnimationState0.setAnimationSpecDuration(c.roundToLong((1.0 - ((double)seekableTransitionState$SeekingAnimationState0.getStart().get$animation_core_release(0))) * ((double)this.f)));
                }
            }
        }
    }

    @Nullable
    public final Object seekTo(@FloatRange(from = 0.0, to = 1.0) float f, Object object0, @NotNull Continuation continuation0) {
        if(Float.compare(0.0f, f) > 0 || f > 1.0f) {
            PreconditionsKt.throwIllegalArgumentException(("Expecting fraction between 0 and 1. Got " + f));
        }
        Transition transition0 = this.e;
        if(transition0 == null) {
            return Unit.INSTANCE;
        }
        u u0 = new u(object0, this.getTargetState(), this, transition0, f, null);
        Object object1 = MutatorMutex.mutate$default(this.k, null, u0, continuation0, 1, null);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    public static Object seekTo$default(SeekableTransitionState seekableTransitionState0, float f, Object object0, Continuation continuation0, int v, Object object1) {
        if((v & 2) != 0) {
            object0 = seekableTransitionState0.getTargetState();
        }
        return seekableTransitionState0.seekTo(f, object0, continuation0);
    }

    public final void setComposedTargetState$animation_core_release(Object object0) {
        this.d = object0;
    }

    public final void setCompositionContinuation$animation_core_release(@Nullable CancellableContinuation cancellableContinuation0) {
        this.i = cancellableContinuation0;
    }

    @Override  // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core_release(Object object0) {
        this.c.setValue(object0);
    }

    @Override  // androidx.compose.animation.core.TransitionState
    public void setTargetState$animation_core_release(Object object0) {
        this.b.setValue(object0);
    }

    public final void setTotalDurationNanos$animation_core_release(long v) {
        this.f = v;
    }

    @Nullable
    public final Object snapTo(Object object0, @NotNull Continuation continuation0) {
        Transition transition0 = this.e;
        if(transition0 == null) {
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(this.getCurrentState(), object0) && Intrinsics.areEqual(this.getTargetState(), object0)) {
            return Unit.INSTANCE;
        }
        v v0 = new v(this, object0, transition0, null);
        Object object1 = MutatorMutex.mutate$default(this.k, null, v0, continuation0, 1, null);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(@NotNull Transition transition0) {
        if(this.e != null && !Intrinsics.areEqual(transition0, this.e)) {
            PreconditionsKt.throwIllegalStateException(("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + transition0));
        }
        this.e = transition0;
    }

    @Override  // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core_release() {
        this.e = null;
        TransitionKt.getSeekableStateObserver().clear(this);
    }
}

