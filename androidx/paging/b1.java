package androidx.paging;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import qd.a;

public final class b1 extends SuspendLambda implements Function1 {
    public LoadType o;
    public int p;
    public final f1 q;

    public b1(f1 f10, Continuation continuation0) {
        this.q = f10;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new b1(this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((b1)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        LoadType loadType0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        f1 f10 = this.q;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                goto label_15;
            }
            case 1: {
                loadType0 = this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(((MediatorResult)object0) instanceof Success) {
                z0 z00 = new z0(loadType0, ((Success)(((MediatorResult)object0))));
                f10.c.a(z00);
            }
            else if(((MediatorResult)object0) instanceof Error) {
                a1 a10 = new a1(loadType0, ((Error)(((MediatorResult)object0))));
                f10.c.a(a10);
            }
        label_15:
            Pair pair0 = (Pair)f10.c.a(s4.a1.C);
            if(pair0 == null) {
                return Unit.INSTANCE;
            }
            loadType0 = (LoadType)pair0.component1();
            this.o = loadType0;
            this.p = 1;
            object0 = f10.b.load(loadType0, ((PagingState)pair0.component2()), this);
        }
        while(object0 != object1);
        return object1;
    }
}

