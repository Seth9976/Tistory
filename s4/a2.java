package s4;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class a2 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public int p;
    public Object q;
    public final FlowCollector r;
    public final Function2 s;

    public a2(FlowCollector flowCollector0, Function2 function20, Continuation continuation0) {
        this.r = flowCollector0;
        this.s = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a2(this.r, this.s, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Job job1;
        ChannelIterator channelIterator1;
        ChannelIterator channelIterator0;
        Job job0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.q;
                Channel channel0 = ChannelKt.Channel$default(0, null, null, 6, null);
                job0 = BuildersKt.launch$default(coroutineScope0, null, null, new z1(channel0, this.s, null), 3, null);
                channelIterator0 = channel0.iterator();
                goto label_18;
            }
            case 1: {
                channelIterator1 = this.o;
                job1 = (Job)this.q;
                ResultKt.throwOnFailure(object0);
                goto label_27;
            }
            case 2: {
                channelIterator1 = this.o;
                job1 = (Job)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            channelIterator0 = channelIterator1;
            job0 = job1;
        label_18:
            this.q = job0;
            this.o = channelIterator0;
            this.p = 1;
            Object object2 = channelIterator0.hasNext(this);
            if(object2 == object1) {
                return object1;
            }
            channelIterator1 = channelIterator0;
            object0 = object2;
            job1 = job0;
        label_27:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            Object object3 = channelIterator1.next();
            this.q = job1;
            this.o = channelIterator1;
            this.p = 2;
            if(this.r.emit(object3, this) != object1) {
                continue;
            }
            return object1;
        }
        DefaultImpls.cancel$default(job1, null, 1, null);
        return Unit.INSTANCE;
    }
}

