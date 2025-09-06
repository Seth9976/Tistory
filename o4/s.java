package o4;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.NavHostKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class s extends SuspendLambda implements Function2 {
    public int o;
    public final SeekableTransitionState p;
    public final State q;
    public final MutableFloatState r;

    public s(SeekableTransitionState seekableTransitionState0, State state0, MutableFloatState mutableFloatState0, Continuation continuation0) {
        this.p = seekableTransitionState0;
        this.q = state0;
        this.r = mutableFloatState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new s(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((s)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)NavHostKt.access$NavHost$lambda$6(this.q).get(NavHostKt.access$NavHost$lambda$6(this.q).size() - 2);
                float f = NavHostKt.access$NavHost$lambda$8(this.r);
                this.o = 1;
                return this.p.seekTo(f, navBackStackEntry0, this) == object1 ? object1 : Unit.INSTANCE;
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

