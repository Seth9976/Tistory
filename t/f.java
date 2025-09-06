package t;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelResult;
import qd.a;

public final class f extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public int p;
    public Object q;
    public final Channel r;
    public final Animatable s;
    public final State t;
    public final State u;

    public f(Channel channel0, Animatable animatable0, State state0, State state1, Continuation continuation0) {
        this.r = channel0;
        this.s = animatable0;
        this.t = state0;
        this.u = state1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f(this.r, this.s, this.t, this.u, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object2;
        ChannelIterator channelIterator0;
        CoroutineScope coroutineScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Channel channel0 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                coroutineScope0 = (CoroutineScope)this.q;
                channelIterator0 = channel0.iterator();
                goto label_16;
            }
            case 1: {
                channelIterator0 = this.o;
                coroutineScope0 = (CoroutineScope)this.q;
                ResultKt.throwOnFailure(object0);
                object2 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(((Boolean)object2).booleanValue()) {
            Object object3 = channelIterator0.next();
            Object object4 = ChannelResult.getOrNull-impl(channel0.tryReceive-PtdJZtk());
            BuildersKt.launch$default(coroutineScope0, null, null, new e((object4 == null ? object3 : object4), this.s, this.t, this.u, null), 3, null);
        label_16:
            this.q = coroutineScope0;
            this.o = channelIterator0;
            this.p = 1;
            object2 = channelIterator0.hasNext(this);
            if(object2 != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

