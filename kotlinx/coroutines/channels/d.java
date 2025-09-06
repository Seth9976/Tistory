package kotlinx.coroutines.channels;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class d extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final SendChannel q;
    public final Object r;

    public d(SendChannel sendChannel0, Object object0, Continuation continuation0) {
        this.q = sendChannel0;
        this.r = object0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Unit unit0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                try {
                    this.o = 1;
                    if(this.q.send(this.r, this) == object1) {
                        return object1;
                    label_8:
                        ResultKt.throwOnFailure(object0);
                    }
                    unit0 = Unit.INSTANCE;
                    goto label_13;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            case 1: {
                goto label_8;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        unit0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
    label_13:
        if(Result.isSuccess-impl(unit0)) {
            return ChannelResult.box-impl(ChannelResult.Companion.success-JP2dKIU(Unit.INSTANCE));
        }
        Throwable throwable1 = Result.exceptionOrNull-impl(unit0);
        return ChannelResult.box-impl(ChannelResult.Companion.closed-JP2dKIU(throwable1));
    }
}

