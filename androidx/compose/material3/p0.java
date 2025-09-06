package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class p0 extends SuspendLambda implements Function3 {
    public final int o;
    public int p;
    public float q;
    public final Object r;

    public p0(int v, Object object0, Continuation continuation0) {
        this.o = v;
        this.r = object0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        float f = ((Number)object1).floatValue();
        switch(this.o) {
            case 0: {
                p0 p01 = new p0(0, ((TopAppBarScrollBehavior)this.r), ((Continuation)object2));
                p01.q = f;
                return p01.invokeSuspend(Unit.INSTANCE);
            }
            case 1: {
                p0 p02 = new p0(1, ((TopAppBarScrollBehavior)this.r), ((Continuation)object2));
                p02.q = f;
                return p02.invokeSuspend(Unit.INSTANCE);
            }
            default: {
                p0 p00 = new p0(2, ((BottomAppBarScrollBehavior)this.r), ((Continuation)object2));
                p00.q = f;
                return p00.invokeSuspend(Unit.INSTANCE);
            }
        }
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        switch(this.o) {
            case 0: {
                Unit unit1 = a.getCOROUTINE_SUSPENDED();
                switch(this.p) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        float f1 = this.q;
                        TopAppBarState topAppBarState0 = ((TopAppBarScrollBehavior)this.r).getState();
                        DecayAnimationSpec decayAnimationSpec1 = ((TopAppBarScrollBehavior)this.r).getFlingAnimationSpec();
                        AnimationSpec animationSpec1 = ((TopAppBarScrollBehavior)this.r).getSnapAnimationSpec();
                        this.p = 1;
                        return AppBarKt.access$settleAppBar(topAppBarState0, f1, decayAnimationSpec1, animationSpec1, this) == unit1 ? unit1 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                Unit unit2 = a.getCOROUTINE_SUSPENDED();
                switch(this.p) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        float f2 = this.q;
                        TopAppBarState topAppBarState1 = ((TopAppBarScrollBehavior)this.r).getState();
                        DecayAnimationSpec decayAnimationSpec2 = ((TopAppBarScrollBehavior)this.r).getFlingAnimationSpec();
                        AnimationSpec animationSpec2 = ((TopAppBarScrollBehavior)this.r).getSnapAnimationSpec();
                        this.p = 1;
                        return AppBarKt.access$settleAppBar(topAppBarState1, f2, decayAnimationSpec2, animationSpec2, this) == unit2 ? unit2 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                Unit unit0 = a.getCOROUTINE_SUSPENDED();
                switch(this.p) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        float f = this.q;
                        BottomAppBarState bottomAppBarState0 = ((BottomAppBarScrollBehavior)this.r).getState();
                        DecayAnimationSpec decayAnimationSpec0 = ((BottomAppBarScrollBehavior)this.r).getFlingAnimationSpec();
                        AnimationSpec animationSpec0 = ((BottomAppBarScrollBehavior)this.r).getSnapAnimationSpec();
                        this.p = 1;
                        return AppBarKt.access$settleAppBarBottom(bottomAppBarState0, f, decayAnimationSpec0, animationSpec0, this) == unit0 ? unit0 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }
    }
}

