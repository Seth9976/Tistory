package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class n extends SuspendLambda implements Function2 {
    public Channel o;
    public byte[] p;
    public int q;
    public int r;
    public int s;
    public Object t;
    public final Flow[] u;
    public final Function0 v;
    public final Function3 w;
    public final FlowCollector x;

    public n(FlowCollector flowCollector0, Flow[] arr_flow, Function0 function00, Function3 function30, Continuation continuation0) {
        this.u = arr_flow;
        this.v = function00;
        this.w = function30;
        this.x = flowCollector0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new n(this.x, this.u, this.v, this.w, continuation0);
        continuation1.t = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        int v4;
        Object object2;
        Object[] arr_object1;
        Channel channel1;
        int v2;
        byte[] arr_b;
        int v;
        Object[] arr_object;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.t;
                if(this.u.length == 0) {
                    return Unit.INSTANCE;
                }
                arr_object = new Object[this.u.length];
                ArraysKt___ArraysJvmKt.fill$default(arr_object, NullSurrogateKt.UNINITIALIZED, 0, 0, 6, null);
                Channel channel0 = ChannelKt.Channel$default(this.u.length, null, null, 6, null);
                AtomicInteger atomicInteger0 = new AtomicInteger(this.u.length);
                v = 0;
                for(int v1 = 0; v1 < this.u.length; ++v1) {
                    BuildersKt.launch$default(coroutineScope0, null, null, new m(this.u, v1, atomicInteger0, channel0, null), 3, null);
                }
                arr_b = new byte[this.u.length];
                v2 = this.u.length;
                channel1 = channel0;
                goto label_53;
            }
            case 1: {
                int v3 = this.r;
                v2 = this.q;
                byte[] arr_b1 = this.p;
                Channel channel2 = this.o;
                arr_object1 = (Object[])this.t;
                ResultKt.throwOnFailure(object0);
                object2 = ((ChannelResult)object0).unbox-impl();
                v4 = v3;
                arr_b = arr_b1;
                channel1 = channel2;
                goto label_64;
            }
            case 2: {
                int v5 = this.r;
                v2 = this.q;
                byte[] arr_b2 = this.p;
                Channel channel3 = this.o;
                arr_object1 = (Object[])this.t;
                ResultKt.throwOnFailure(object0);
                v = v5;
                arr_b = arr_b2;
                channel1 = channel3;
                arr_object = arr_object1;
                goto label_53;
            }
            case 3: {
                int v6 = this.r;
                v2 = this.q;
                byte[] arr_b3 = this.p;
                Channel channel4 = this.o;
                Object[] arr_object2 = (Object[])this.t;
                ResultKt.throwOnFailure(object0);
                arr_object = arr_object2;
                v4 = v6;
                arr_b = arr_b3;
                channel1 = channel4;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            v = v4;
        label_53:
            v4 = (byte)(v + 1);
            this.t = arr_object;
            this.o = channel1;
            this.p = arr_b;
            this.q = v2;
            this.r = v4;
            this.s = 1;
            object2 = channel1.receiveCatching-JP2dKIU(this);
            if(object2 == object1) {
                return object1;
            }
            arr_object1 = arr_object;
        label_64:
            IndexedValue indexedValue0 = (IndexedValue)ChannelResult.getOrNull-impl(object2);
            if(indexedValue0 == null) {
                return Unit.INSTANCE;
            }
            while(true) {
                int v7 = indexedValue0.getIndex();
                Object object3 = arr_object1[v7];
                arr_object1[v7] = indexedValue0.getValue();
                if(object3 == NullSurrogateKt.UNINITIALIZED) {
                    --v2;
                }
                if(arr_b[v7] == v4) {
                    break;
                }
                arr_b[v7] = (byte)v4;
                IndexedValue indexedValue1 = (IndexedValue)ChannelResult.getOrNull-impl(channel1.tryReceive-PtdJZtk());
                if(indexedValue1 == null) {
                    break;
                }
                indexedValue0 = indexedValue1;
            }
            if(v2 == 0) {
                Object[] arr_object3 = (Object[])this.v.invoke();
                FlowCollector flowCollector0 = this.x;
                Function3 function30 = this.w;
                if(arr_object3 == null) {
                    this.t = arr_object1;
                    this.o = channel1;
                    this.p = arr_b;
                    this.q = 0;
                    this.r = v4;
                    this.s = 2;
                    if(function30.invoke(flowCollector0, arr_object1, this) == object1) {
                        return object1;
                    }
                    v = v4;
                }
                else {
                    ArraysKt___ArraysJvmKt.copyInto$default(arr_object1, arr_object3, 0, 0, 0, 14, null);
                    this.t = arr_object1;
                    this.o = channel1;
                    this.p = arr_b;
                    this.q = 0;
                    this.r = v4;
                    this.s = 3;
                    if(function30.invoke(flowCollector0, arr_object3, this) == object1) {
                        return object1;
                    }
                    arr_object = arr_object1;
                    continue;
                }
            }
            else {
                v = v4;
            }
            break;
        }
        arr_object = arr_object1;
        goto label_53;
    }
}

