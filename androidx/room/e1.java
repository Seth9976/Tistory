package androidx.room;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class e1 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final RoomDatabase q;
    public final Function1 r;

    public e1(RoomDatabase roomDatabase0, Function1 function10, Continuation continuation0) {
        this.q = roomDatabase0;
        this.r = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new e1(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Throwable throwable3;
        Object object2;
        Throwable throwable1;
        TransactionElement transactionElement1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        RoomDatabase roomDatabase0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Element coroutineContext$Element0 = ((CoroutineScope)this.p).getCoroutineContext().get(TransactionElement.Key);
                Intrinsics.checkNotNull(coroutineContext$Element0);
                TransactionElement transactionElement0 = (TransactionElement)coroutineContext$Element0;
                transactionElement0.acquire();
                try {
                    roomDatabase0.beginTransaction();
                }
                catch(Throwable throwable0) {
                    transactionElement1 = transactionElement0;
                    throwable1 = throwable0;
                    transactionElement1.release();
                    throw throwable1;
                }
                try {
                    this.p = transactionElement0;
                    this.o = 1;
                    object2 = this.r.invoke(this);
                }
                catch(Throwable throwable2) {
                    transactionElement1 = transactionElement0;
                    throwable3 = throwable2;
                    break;
                }
                if(object2 == object1) {
                    return object1;
                }
                transactionElement1 = transactionElement0;
                object0 = object2;
                goto label_30;
            }
            case 1: {
                transactionElement1 = (TransactionElement)this.p;
                try {
                    ResultKt.throwOnFailure(object0);
                label_30:
                    roomDatabase0.setTransactionSuccessful();
                    goto label_35;
                }
                catch(Throwable throwable3) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            roomDatabase0.endTransaction();
            throw throwable3;
        label_35:
            roomDatabase0.endTransaction();
        }
        catch(Throwable throwable1) {
            transactionElement1.release();
            throw throwable1;
        }
        transactionElement1.release();
        return object0;
    }
}

