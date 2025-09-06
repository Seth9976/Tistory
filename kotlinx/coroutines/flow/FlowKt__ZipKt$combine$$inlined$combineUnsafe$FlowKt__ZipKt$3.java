package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import xf.i2;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,113:1\n262#2,2:114\n*E\n"})
public final class FlowKt__ZipKt.combine..inlined.combineUnsafe.FlowKt__ZipKt.3 implements Flow {
    public final Flow[] a;
    public final Function6 b;

    public FlowKt__ZipKt.combine..inlined.combineUnsafe.FlowKt__ZipKt.3(Flow[] arr_flow, Function6 function60) {
        this.a = arr_flow;
        this.b = function60;
        super();
    }

    @Override  // kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        kotlinx.coroutines.flow.FlowKt__ZipKt.combine..inlined.combineUnsafe.FlowKt__ZipKt.3.2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$20 = new Function3(this.b) {
            public int o;
            public FlowCollector p;
            public Object[] q;
            public final Function6 r;

            {
                this.r = function60;
                super(3, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((FlowCollector)object0), ((Object[])object1), ((Continuation)object2));
            }

            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector0, @NotNull Object[] arr_object, @Nullable Continuation continuation0) {
                kotlinx.coroutines.flow.FlowKt__ZipKt.combine..inlined.combineUnsafe.FlowKt__ZipKt.3.2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$20 = new kotlinx.coroutines.flow.FlowKt__ZipKt.combine..inlined.combineUnsafe.FlowKt__ZipKt.3.2(continuation0, this.r);
                flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$20.p = flowCollector0;
                flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$20.q = arr_object;
                return flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$20.invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                FlowCollector flowCollector0;
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(this.o) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        flowCollector0 = this.p;
                        this.p = flowCollector0;
                        this.o = 1;
                        object0 = this.r.invoke(this.q[0], this.q[1], this.q[2], this.q[3], this.q[4], this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        flowCollector0 = this.p;
                        ResultKt.throwOnFailure(object0);
                        break;
                    }
                    case 2: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                this.p = null;
                this.o = 2;
                return flowCollector0.emit(object0, this) == object1 ? object1 : Unit.INSTANCE;
            }
        };
        Object object0 = CombineKt.combineInternal(flowCollector0, this.a, i2.w, flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$20, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

