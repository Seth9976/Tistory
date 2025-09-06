package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.LongIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n194#2:114\n195#2,2:116\n197#2:119\n1855#3:115\n1856#3:118\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n194#1:115\n194#1:118\n*E\n"})
public final class FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.10 implements Flow {
    public final LongRange a;

    public FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.10(LongRange longRange0) {
        this.a = longRange0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        Iterator iterator0;
        FlowCollector flowCollector1;
        kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.10.1 flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.10.1) {
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10 = (kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.10.1)continuation0;
            int v = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10.p;
            if((v & 0x80000000) == 0) {
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    public Object o;
                    public int p;
                    public FlowCollector r;
                    public Iterator s;

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
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10.p = v ^ 0x80000000;
            }
        }
        else {
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                public Object o;
                public int p;
                public FlowCollector r;
                public Iterator s;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    this.o = object0;
                    this.p |= 0x80000000;
                    return continuation0.collect(null, this);
                }
            };
        }
        Object object0 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector1 = flowCollector0;
                iterator0 = this.a.iterator();
                break;
            }
            case 1: {
                iterator0 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10.s;
                FlowCollector flowCollector2 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10.r;
                ResultKt.throwOnFailure(object0);
                flowCollector1 = flowCollector2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Long long0 = Boxing.boxLong(((LongIterator)iterator0).nextLong());
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10.r = flowCollector1;
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10.s = iterator0;
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10.p = 1;
            if(flowCollector1.emit(long0, flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$10) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return Unit.INSTANCE;
    }
}

