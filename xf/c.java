package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import qd.a;

public final class c extends h {
    public final Function2 b;

    public c(Function2 function20, CoroutineContext coroutineContext0, int v, BufferOverflow bufferOverflow0) {
        super(function20, coroutineContext0, v, bufferOverflow0);
        this.b = function20;
    }

    @Override  // xf.h
    public final Object collectTo(ProducerScope producerScope0, Continuation continuation0) {
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v = b0.r;
            if((v & 0x80000000) == 0) {
                b0 = new b(this, continuation0);
            }
            else {
                b0.r = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(this, continuation0);
        }
        Object object0 = b0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                b0.o = producerScope0;
                b0.r = 1;
                if(super.collectTo(producerScope0, b0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                producerScope0 = b0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!producerScope0.isClosedForSend()) {
            throw new IllegalStateException("\'awaitClose { yourCallbackOrListener.cancel() }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        }
        return Unit.INSTANCE;
    }

    @Override  // xf.h
    public final ChannelFlow create(CoroutineContext coroutineContext0, int v, BufferOverflow bufferOverflow0) {
        return new c(this.b, coroutineContext0, v, bufferOverflow0);
    }
}

