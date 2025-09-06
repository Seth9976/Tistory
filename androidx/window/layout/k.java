package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.Consumer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class k extends SuspendLambda implements Function2 {
    public Consumer o;
    public ChannelIterator p;
    public int q;
    public Object r;
    public final WindowInfoTrackerImpl s;
    public final Activity t;

    public k(WindowInfoTrackerImpl windowInfoTrackerImpl0, Activity activity0, Continuation continuation0) {
        this.s = windowInfoTrackerImpl0;
        this.t = activity0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new k(this.s, this.t, continuation0);
        continuation1.r = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FlowCollector flowCollector1;
        ChannelIterator channelIterator0;
        Consumer consumer0;
        FlowCollector flowCollector0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        WindowInfoTrackerImpl windowInfoTrackerImpl0 = this.s;
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector0 = (FlowCollector)this.r;
                Channel channel0 = ChannelKt.Channel$default(10, BufferOverflow.DROP_OLDEST, null, 4, null);
                consumer0 = new j(channel0);
                n.a a0 = new n.a(2);
                windowInfoTrackerImpl0.b.registerLayoutChangeCallback(this.t, a0, consumer0);
                try {
                    channelIterator0 = channel0.iterator();
                    goto label_22;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                channelIterator0 = this.p;
                consumer0 = this.o;
                flowCollector1 = (FlowCollector)this.r;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_31;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                channelIterator0 = this.p;
                consumer0 = this.o;
                flowCollector1 = (FlowCollector)this.r;
                try {
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                        flowCollector0 = flowCollector1;
                    label_22:
                        this.r = flowCollector0;
                        this.o = consumer0;
                        this.p = channelIterator0;
                        this.q = 1;
                        Object object2 = channelIterator0.hasNext(this);
                        if(object2 == object1) {
                            return object1;
                        }
                        flowCollector1 = flowCollector0;
                        object0 = object2;
                    label_31:
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_43;
                        }
                        WindowLayoutInfo windowLayoutInfo0 = (WindowLayoutInfo)channelIterator0.next();
                        this.r = flowCollector1;
                        this.o = consumer0;
                        this.p = channelIterator0;
                        this.q = 2;
                        if(flowCollector1.emit(windowLayoutInfo0, this) != object1) {
                            continue;
                        }
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        windowInfoTrackerImpl0.b.unregisterLayoutChangeCallback(consumer0);
        throw throwable0;
    label_43:
        windowInfoTrackerImpl0.b.unregisterLayoutChangeCallback(consumer0);
        return Unit.INSTANCE;
    }
}

