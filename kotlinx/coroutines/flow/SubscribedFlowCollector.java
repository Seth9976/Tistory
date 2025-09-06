package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import xf.x2;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\t\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ\u001B\u0010\r\u001A\u00020\u00062\u0006\u0010\f\u001A\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u0013\u0010\u000F\u001A\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function2;)V", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSubscription", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,426:1\n329#2:427\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n417#1:427\n*E\n"})
public final class SubscribedFlowCollector implements FlowCollector {
    public final FlowCollector a;
    public final Function2 b;

    public SubscribedFlowCollector(@NotNull FlowCollector flowCollector0, @NotNull Function2 function20) {
        this.a = flowCollector0;
        this.b = function20;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Object object0, @NotNull Continuation continuation0) {
        return this.a.emit(object0, continuation0);
    }

    @Nullable
    public final Object onSubscription(@NotNull Continuation continuation0) {
        SubscribedFlowCollector subscribedFlowCollector0;
        SafeCollector safeCollector0;
        x2 x20;
        if(continuation0 instanceof x2) {
            x20 = (x2)continuation0;
            int v = x20.s;
            if((v & 0x80000000) == 0) {
                x20 = new x2(this, continuation0);
            }
            else {
                x20.s = v ^ 0x80000000;
            }
        }
        else {
            x20 = new x2(this, continuation0);
        }
        Object object0 = x20.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(x20.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineContext coroutineContext0 = x20.getContext();
                safeCollector0 = new SafeCollector(this.a, coroutineContext0);
                try {
                    x20.o = this;
                    x20.p = safeCollector0;
                    x20.s = 1;
                    if(this.b.invoke(safeCollector0, x20) == object1) {
                        return object1;
                    }
                    subscribedFlowCollector0 = this;
                    break;
                label_25:
                    safeCollector0 = x20.p;
                    subscribedFlowCollector0 = x20.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                safeCollector0.releaseIntercepted();
                throw throwable0;
            }
            case 1: {
                goto label_25;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        safeCollector0.releaseIntercepted();
        FlowCollector flowCollector0 = subscribedFlowCollector0.a;
        if(flowCollector0 instanceof SubscribedFlowCollector) {
            x20.o = null;
            x20.p = null;
            x20.s = 2;
            return ((SubscribedFlowCollector)flowCollector0).onSubscription(x20) == object1 ? object1 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}

