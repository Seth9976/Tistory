package androidx.paging;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.BooleanRef;
import qd.a;
import s4.a1;

public final class e1 extends SuspendLambda implements Function1 {
    public f1 o;
    public BooleanRef p;
    public int q;
    public final f1 r;
    public final BooleanRef s;

    public e1(f1 f10, BooleanRef ref$BooleanRef0, Continuation continuation0) {
        this.r = f10;
        this.s = ref$BooleanRef0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new e1(this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((e1)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        boolean z;
        BooleanRef ref$BooleanRef1;
        f1 f10;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                f10 = this.r;
                PagingState pagingState0 = (PagingState)f10.c.a(a1.D);
                if(pagingState0 != null) {
                    this.o = f10;
                    BooleanRef ref$BooleanRef0 = this.s;
                    this.p = ref$BooleanRef0;
                    this.q = 1;
                    object0 = f10.b.load(LoadType.REFRESH, pagingState0, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    ref$BooleanRef1 = ref$BooleanRef0;
                    break;
                }
                return Unit.INSTANCE;
            }
            case 1: {
                ref$BooleanRef1 = this.p;
                f10 = this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((MediatorResult)object0) instanceof Success) {
            c1 c10 = new c1(((Success)(((MediatorResult)object0))));
            z = ((Boolean)f10.c.a(c10)).booleanValue();
        }
        else if(((MediatorResult)object0) instanceof Error) {
            d1 d10 = new d1(((Error)(((MediatorResult)object0))));
            z = ((Boolean)f10.c.a(d10)).booleanValue();
        }
        else {
            throw new NoWhenBranchMatchedException();
        }
        ref$BooleanRef1.element = z;
        return Unit.INSTANCE;
    }
}

