package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001A\u0002H\u0002H\u008A@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
@SourceDebugExtension({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$2\n*L\n1#1,172:1\n*E\n"})
public final class FlowKt__ReduceKt.fold.2 implements FlowCollector {
    public final ObjectRef a;
    public final Function3 b;

    public FlowKt__ReduceKt.fold.2(ObjectRef ref$ObjectRef0, Function3 function30) {
        this.a = ref$ObjectRef0;
        this.b = function30;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public final Object emit(Object object0, @NotNull Continuation continuation0) {
        ObjectRef ref$ObjectRef1;
        kotlinx.coroutines.flow.FlowKt__ReduceKt.fold.2.emit.1 flowKt__ReduceKt$fold$2$emit$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.fold.2.emit.1) {
            flowKt__ReduceKt$fold$2$emit$10 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.fold.2.emit.1)continuation0;
            int v = flowKt__ReduceKt$fold$2$emit$10.r;
            if((v & 0x80000000) == 0) {
                flowKt__ReduceKt$fold$2$emit$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    public ObjectRef o;
                    public Object p;
                    public int r;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        this.p = object0;
                        this.r |= 0x80000000;
                        return continuation0.emit(null, this);
                    }
                };
            }
            else {
                flowKt__ReduceKt$fold$2$emit$10.r = v ^ 0x80000000;
            }
        }
        else {
            flowKt__ReduceKt$fold$2$emit$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                public ObjectRef o;
                public Object p;
                public int r;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    this.p = object0;
                    this.r |= 0x80000000;
                    return continuation0.emit(null, this);
                }
            };
        }
        Object object1 = flowKt__ReduceKt$fold$2$emit$10.p;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(flowKt__ReduceKt$fold$2$emit$10.r) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                ObjectRef ref$ObjectRef0 = this.a;
                flowKt__ReduceKt$fold$2$emit$10.o = ref$ObjectRef0;
                flowKt__ReduceKt$fold$2$emit$10.r = 1;
                Object object3 = this.b.invoke(ref$ObjectRef0.element, object0, flowKt__ReduceKt$fold$2$emit$10);
                if(object3 == object2) {
                    return object2;
                }
                object1 = object3;
                ref$ObjectRef1 = ref$ObjectRef0;
                break;
            }
            case 1: {
                ref$ObjectRef1 = flowKt__ReduceKt$fold$2$emit$10.o;
                ResultKt.throwOnFailure(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ref$ObjectRef1.element = object1;
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object emit$$forInline(Object object0, @NotNull Continuation continuation0) {
        new kotlinx.coroutines.flow.FlowKt__ReduceKt.fold.2.emit.1(this, continuation0);
        this.a.element = this.b.invoke(this.a.element, object0, continuation0);
        return Unit.INSTANCE;
    }
}

