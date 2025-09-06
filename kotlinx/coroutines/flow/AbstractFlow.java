package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xf.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001F\u0010\u0005\u001A\u00020\u00062\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001F\u0010\n\u001A\u00020\u00062\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000B"}, d2 = {"Lkotlinx/coroutines/flow/AbstractFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "()V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectSafely", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@ExperimentalCoroutinesApi
public abstract class AbstractFlow implements CancellableFlow, Flow {
    @Override  // kotlinx.coroutines.flow.Flow
    @Nullable
    public final Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        SafeCollector safeCollector1;
        Throwable throwable1;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.r;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.r = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, continuation0);
        }
        Object object0 = a0.p;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SafeCollector safeCollector0 = new SafeCollector(flowCollector0, a0.getContext());
                try {
                    a0.o = safeCollector0;
                    a0.r = 1;
                    if(this.collectSafely(safeCollector0, a0) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    safeCollector1 = safeCollector0;
                    safeCollector1.releaseIntercepted();
                    throw throwable1;
                }
                safeCollector1 = safeCollector0;
                break;
            }
            case 1: {
                try {
                    safeCollector1 = a0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
                safeCollector1.releaseIntercepted();
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        safeCollector1.releaseIntercepted();
        return Unit.INSTANCE;
    }

    @Nullable
    public abstract Object collectSafely(@NotNull FlowCollector arg1, @NotNull Continuation arg2);
}

