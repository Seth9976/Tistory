package kotlinx.coroutines.channels;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import qd.a;
import uf.u;
import uf.v;

public abstract class e {
    public static final Object a(BroadcastChannel broadcastChannel0, Function1 function10, Continuation continuation0) {
        Object object2;
        ReceiveChannel receiveChannel3;
        v v2;
        Throwable throwable1;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator0;
        ReceiveChannel receiveChannel1;
        v v0;
        if(continuation0 instanceof v) {
            v0 = (v)continuation0;
            int v1 = v0.s;
            if((v1 & 0x80000000) == 0) {
                v0 = new v(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                v0.s = v1 ^ 0x80000000;
            }
        }
        else {
            v0 = new v(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = v0.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(v0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ReceiveChannel receiveChannel0 = broadcastChannel0.openSubscription();
                try {
                    receiveChannel1 = receiveChannel0;
                    channelIterator0 = receiveChannel0.iterator();
                    goto label_41;
                }
                catch(Throwable throwable0) {
                    receiveChannel2 = receiveChannel0;
                    throwable1 = throwable0;
                    DefaultImpls.cancel$default(receiveChannel2, null, 1, null);
                    throw throwable1;
                }
            }
            case 1: {
                try {
                    channelIterator0 = v0.q;
                    receiveChannel2 = v0.p;
                    Function1 function11 = v0.o;
                    ResultKt.throwOnFailure(object0);
                    v2 = v0;
                    receiveChannel3 = receiveChannel2;
                    function10 = function11;
                    break;
                }
                catch(Throwable throwable1) {
                }
                DefaultImpls.cancel$default(receiveChannel2, null, 1, null);
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            try {
                if(!((Boolean)object0).booleanValue()) {
                    break;
                }
                function10.invoke(channelIterator0.next());
                receiveChannel1 = receiveChannel3;
                v0 = v2;
            }
            catch(Throwable throwable1) {
                receiveChannel2 = receiveChannel3;
                DefaultImpls.cancel$default(receiveChannel2, null, 1, null);
                throw throwable1;
            }
            try {
            label_41:
                v0.o = function10;
                v0.p = receiveChannel1;
                v0.q = channelIterator0;
                v0.s = 1;
                object2 = channelIterator0.hasNext(v0);
            }
            catch(Throwable throwable1) {
                receiveChannel2 = receiveChannel1;
                DefaultImpls.cancel$default(receiveChannel2, null, 1, null);
                throw throwable1;
            }
            if(object2 == object1) {
                return object1;
            }
            v2 = v0;
            receiveChannel3 = receiveChannel1;
            object0 = object2;
        }
        DefaultImpls.cancel$default(receiveChannel3, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final Object b(ReceiveChannel receiveChannel0, Function1 function10, Continuation continuation0) {
        Throwable throwable1;
        Function1 function11;
        ChannelIterator channelIterator0;
        ReceiveChannel receiveChannel1;
        u u0;
        if(continuation0 instanceof u) {
            u0 = (u)continuation0;
            int v = u0.s;
            if((v & 0x80000000) == 0) {
                u0 = new u(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                u0.s = v ^ 0x80000000;
            }
        }
        else {
            u0 = new u(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = u0.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(u0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    receiveChannel1 = receiveChannel0;
                    channelIterator0 = receiveChannel0.iterator();
                    function11 = function10;
                    goto label_28;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                try {
                    channelIterator0 = u0.q;
                    receiveChannel1 = u0.p;
                    Function1 function12 = u0.o;
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_43;
                        }
                        function12.invoke(channelIterator0.next());
                        function11 = function12;
                    label_28:
                        u0.o = function11;
                        u0.p = receiveChannel1;
                        u0.q = channelIterator0;
                        u0.s = 1;
                        Object object2 = channelIterator0.hasNext(u0);
                        if(object2 == object1) {
                            return object1;
                        }
                        function12 = function11;
                        object0 = object2;
                    }
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
            throw throwable2;
        }
    label_43:
        ChannelsKt.cancelConsumed(receiveChannel1, null);
        return Unit.INSTANCE;
    }
}

