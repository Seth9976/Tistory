package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,141:1\n86#2,5:142\n*E\n"})
public final class FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1 implements FlowCollector {
    public final Function2 a;
    public final FlowCollector b;

    public FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1(Function2 function20, FlowCollector flowCollector0) {
        this.a = function20;
        this.b = flowCollector0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Object object0, @NotNull Continuation continuation0) {
        FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$10;
        Object object5;
        Object object4;
        kotlinx.coroutines.flow.FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1.1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1.1) {
            flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10 = (kotlinx.coroutines.flow.FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1.1)continuation0;
            int v = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.q;
            if((v & 0x80000000) == 0) {
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    public FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1 o;
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
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.q = v ^ 0x80000000;
            }
        }
        else {
            flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                public FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1 o;
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
        Object object1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.p;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        boolean z = true;
        switch(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.o = this;
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.s = object0;
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.q = 1;
                Object object3 = this.a.invoke(object0, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10);
                if(object3 == object2) {
                    return object2;
                }
                object4 = object3;
                object5 = object0;
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$10 = this;
                goto label_31;
            }
            case 1: {
                Object object6 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.s;
                FlowKt__LimitKt.takeWhile.lambda.6..inlined.collectWhile.1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$11 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.o;
                ResultKt.throwOnFailure(object1);
                object5 = object6;
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$10 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$11;
                object4 = object1;
            label_31:
                if(((Boolean)object4).booleanValue()) {
                    flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.o = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$10;
                    flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.s = null;
                    flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.q = 2;
                    if(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$10.b.emit(object5, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10) == object2) {
                        return object2;
                    }
                }
                else {
                    z = false;
                }
                break;
            }
            case 2: {
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$10 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$10.o;
                ResultKt.throwOnFailure(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!z) {
            throw new AbortFlowException(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$10);
        }
        return Unit.INSTANCE;
    }
}

