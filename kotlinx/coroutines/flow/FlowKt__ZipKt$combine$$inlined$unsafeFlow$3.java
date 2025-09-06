package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0xB0)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,113:1\n289#2,5:114\n*E\n"})
public final class FlowKt__ZipKt.combine..inlined.unsafeFlow.3 implements Flow {
    public final Flow[] a;
    public final Function2 b;

    public FlowKt__ZipKt.combine..inlined.unsafeFlow.3(Flow[] arr_flow, Function2 function20) {
        this.a = arr_flow;
        this.b = function20;
        super();
    }

    @Override  // kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        Intrinsics.needClassReification();
        FlowKt__ZipKt.combine.6.1 flowKt__ZipKt$combine$6$10 = new FlowKt__ZipKt.combine.6.1(this.a);
        Intrinsics.needClassReification();
        FlowKt__ZipKt.combine.6.2 flowKt__ZipKt$combine$6$20 = new FlowKt__ZipKt.combine.6.2(this.b, null);
        Object object0 = CombineKt.combineInternal(flowCollector0, this.a, flowKt__ZipKt$combine$6$10, flowKt__ZipKt$combine$6$20, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public final class kotlinx.coroutines.flow.FlowKt__ZipKt.combine..inlined.unsafeFlow.3.1 extends ContinuationImpl {
            public Object o;

            public kotlinx.coroutines.flow.FlowKt__ZipKt.combine..inlined.unsafeFlow.3.1(FlowKt__ZipKt.combine..inlined.unsafeFlow.3 flowKt__ZipKt$combine$$inlined$unsafeFlow$30, Continuation continuation0) {
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                this.o = object0;
                return this.p.collect(null, this);
            }
        }

    }

    @Nullable
    public Object collect$$forInline(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        new kotlinx.coroutines.flow.FlowKt__ZipKt.combine..inlined.unsafeFlow.3.1(this, continuation0);
        Intrinsics.needClassReification();
        FlowKt__ZipKt.combine.6.1 flowKt__ZipKt$combine$6$10 = new FlowKt__ZipKt.combine.6.1(this.a);
        Intrinsics.needClassReification();
        FlowKt__ZipKt.combine.6.2 flowKt__ZipKt$combine$6$20 = new FlowKt__ZipKt.combine.6.2(this.b, null);
        CombineKt.combineInternal(flowCollector0, this.a, flowKt__ZipKt$combine$6$10, flowKt__ZipKt$combine$6$20, continuation0);
        return Unit.INSTANCE;
    }
}

