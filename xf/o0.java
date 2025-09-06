package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.ThrowingCollector;
import md.b;
import qd.a;

public abstract class o0 {
    public static final Object a(ThrowingCollector throwingCollector0, Function3 function30, Throwable throwable0, ContinuationImpl continuationImpl0) {
        l0 l00;
        if(continuationImpl0 instanceof l0) {
            l00 = (l0)continuationImpl0;
            int v = l00.q;
            if((v & 0x80000000) == 0) {
                l00 = new l0(continuationImpl0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                l00.q = v ^ 0x80000000;
            }
        }
        else {
            l00 = new l0(continuationImpl0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = l00.p;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(l00.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    l00.o = throwable0;
                    l00.q = 1;
                    return function30.invoke(throwingCollector0, throwable0, l00) != unit0 ? Unit.INSTANCE : unit0;
                label_19:
                    throwable0 = l00.o;
                    ResultKt.throwOnFailure(object0);
                    return Unit.INSTANCE;
                }
                catch(Throwable throwable1) {
                    goto label_23;
                }
            }
            case 1: {
                goto label_19;
            label_23:
                if(throwable0 != null && throwable0 != throwable1) {
                    b.addSuppressed(throwable1, throwable0);
                }
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

