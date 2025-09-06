package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001A\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008A@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {0xEE, 0xEE}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2\n*L\n1#1,332:1\n*E\n"})
public final class FlowKt__ZipKt.combine.5.2 extends SuspendLambda implements Function3 {
    public int o;
    public FlowCollector p;
    public Object[] q;
    public final Function2 r;

    public FlowKt__ZipKt.combine.5.2(Function2 function20, Continuation continuation0) {
        this.r = function20;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.invoke(((FlowCollector)object0), ((Object[])object1), ((Continuation)object2));
    }

    @Nullable
    public final Object invoke(@NotNull FlowCollector flowCollector0, @NotNull Object[] arr_object, @Nullable Continuation continuation0) {
        Intrinsics.needClassReification();
        FlowKt__ZipKt.combine.5.2 flowKt__ZipKt$combine$5$20 = new FlowKt__ZipKt.combine.5.2(this.r, continuation0);
        flowKt__ZipKt$combine$5$20.p = flowCollector0;
        flowKt__ZipKt$combine$5$20.q = arr_object;
        return flowKt__ZipKt$combine$5$20.invokeSuspend(Unit.INSTANCE);
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
                object0 = this.r.invoke(this.q, this);
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

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object object0) {
        this.p.emit(this.r.invoke(this.q, this), this);
        return Unit.INSTANCE;
    }
}

