package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001B\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0002\u001A\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0xB0)
@SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n*L\n1#1,118:1\n*E\n"})
public final class FlowKt__CollectKt.collect.3 implements FlowCollector {
    public final Function2 a;

    public FlowKt__CollectKt.collect.3(Function2 function20) {
        this.a = function20;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Object object0, @NotNull Continuation continuation0) {
        Object object1 = this.a.invoke(object0, continuation0);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1\n*L\n1#1,118:1\n*E\n"})
        public final class kotlinx.coroutines.flow.FlowKt__CollectKt.collect.3.emit.1 extends ContinuationImpl {
            public Object o;

            public kotlinx.coroutines.flow.FlowKt__CollectKt.collect.3.emit.1(FlowKt__CollectKt.collect.3 flowKt__CollectKt$collect$30, Continuation continuation0) {
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                this.o = object0;
                return this.p.emit(null, this);
            }
        }

    }

    @Nullable
    public Object emit$$forInline(Object object0, @NotNull Continuation continuation0) {
        new kotlinx.coroutines.flow.FlowKt__CollectKt.collect.3.emit.1(this, continuation0);
        this.a.invoke(object0, continuation0);
        return Unit.INSTANCE;
    }
}

