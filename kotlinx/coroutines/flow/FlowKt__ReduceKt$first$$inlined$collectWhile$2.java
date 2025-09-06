package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n107#2,5:142\n*E\n"})
public final class FlowKt__ReduceKt.first..inlined.collectWhile.2 implements FlowCollector {
    public final Function2 a;
    public final ObjectRef b;

    public FlowKt__ReduceKt.first..inlined.collectWhile.2(Function2 function20, ObjectRef ref$ObjectRef0) {
        this.a = function20;
        this.b = ref$ObjectRef0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Object object0, @NotNull Continuation continuation0) {
        FlowKt__ReduceKt.first..inlined.collectWhile.2 flowKt__ReduceKt$first$$inlined$collectWhile$20;
        kotlinx.coroutines.flow.FlowKt__ReduceKt.first..inlined.collectWhile.2.1 flowKt__ReduceKt$first$$inlined$collectWhile$2$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.first..inlined.collectWhile.2.1) {
            flowKt__ReduceKt$first$$inlined$collectWhile$2$10 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.first..inlined.collectWhile.2.1)continuation0;
            int v = flowKt__ReduceKt$first$$inlined$collectWhile$2$10.q;
            if((v & 0x80000000) == 0) {
                flowKt__ReduceKt$first$$inlined$collectWhile$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    public FlowKt__ReduceKt.first..inlined.collectWhile.2 o;
                    public Object p;
                    public int q;
                    public Object s;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        this.p = object0;
                        this.q |= 0x80000000;
                        return continuation0.emit(null, this);
                    }
                };
            }
            else {
                flowKt__ReduceKt$first$$inlined$collectWhile$2$10.q = v ^ 0x80000000;
            }
        }
        else {
            flowKt__ReduceKt$first$$inlined$collectWhile$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                public FlowKt__ReduceKt.first..inlined.collectWhile.2 o;
                public Object p;
                public int q;
                public Object s;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    this.p = object0;
                    this.q |= 0x80000000;
                    return continuation0.emit(null, this);
                }
            };
        }
        Object object1 = flowKt__ReduceKt$first$$inlined$collectWhile$2$10.p;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(flowKt__ReduceKt$first$$inlined$collectWhile$2$10.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                flowKt__ReduceKt$first$$inlined$collectWhile$2$10.o = this;
                flowKt__ReduceKt$first$$inlined$collectWhile$2$10.s = object0;
                flowKt__ReduceKt$first$$inlined$collectWhile$2$10.q = 1;
                object1 = this.a.invoke(object0, flowKt__ReduceKt$first$$inlined$collectWhile$2$10);
                if(object1 == object2) {
                    return object2;
                }
                flowKt__ReduceKt$first$$inlined$collectWhile$20 = this;
                break;
            }
            case 1: {
                object0 = flowKt__ReduceKt$first$$inlined$collectWhile$2$10.s;
                flowKt__ReduceKt$first$$inlined$collectWhile$20 = flowKt__ReduceKt$first$$inlined$collectWhile$2$10.o;
                ResultKt.throwOnFailure(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!((Boolean)object1).booleanValue()) {
            return Unit.INSTANCE;
        }
        flowKt__ReduceKt$first$$inlined$collectWhile$20.b.element = object0;
        throw new AbortFlowException(flowKt__ReduceKt$first$$inlined$collectWhile$20);
    }
}

