package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,113:1\n123#2,4:114\n*E\n"})
public final class FlowKt__BuildersKt.flowOf..inlined.unsafeFlow.1 implements Flow {
    public final Object[] a;

    public FlowKt__BuildersKt.flowOf..inlined.unsafeFlow.1(Object[] arr_object) {
        this.a = arr_object;
        super();
    }

    @Override  // kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        int v2;
        FlowCollector flowCollector1;
        FlowKt__BuildersKt.flowOf..inlined.unsafeFlow.1 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$10;
        int v1;
        kotlinx.coroutines.flow.FlowKt__BuildersKt.flowOf..inlined.unsafeFlow.1.1 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt.flowOf..inlined.unsafeFlow.1.1) {
            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10 = (kotlinx.coroutines.flow.FlowKt__BuildersKt.flowOf..inlined.unsafeFlow.1.1)continuation0;
            int v = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.p;
            if((v & 0x80000000) == 0) {
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    public Object o;
                    public int p;
                    public FlowKt__BuildersKt.flowOf..inlined.unsafeFlow.1 r;
                    public FlowCollector s;
                    public int t;
                    public int u;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        this.o = object0;
                        this.p |= 0x80000000;
                        return continuation0.collect(null, this);
                    }
                };
            }
            else {
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.p = v ^ 0x80000000;
            }
        }
        else {
            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                public Object o;
                public int p;
                public FlowKt__BuildersKt.flowOf..inlined.unsafeFlow.1 r;
                public FlowCollector s;
                public int t;
                public int u;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    this.o = object0;
                    this.p |= 0x80000000;
                    return continuation0.collect(null, this);
                }
            };
        }
        Object object0 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                v1 = 0;
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$10 = this;
                flowCollector1 = flowCollector0;
                v2 = this.a.length;
                goto label_26;
            }
            case 1: {
                v2 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.u;
                v1 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.t;
                FlowCollector flowCollector2 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.s;
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$10 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.r;
                ResultKt.throwOnFailure(object0);
                flowCollector1 = flowCollector2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            ++v1;
        label_26:
            if(v1 >= v2) {
                break;
            }
            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.r = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$10;
            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.s = flowCollector1;
            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.t = v1;
            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.u = v2;
            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10.p = 1;
            if(flowCollector1.emit(flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$10.a[v1], flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$10) != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

