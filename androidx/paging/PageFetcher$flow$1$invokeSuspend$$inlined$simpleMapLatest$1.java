package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.g0;
import s4.h0;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001A\u0002H\u0002H\u008A@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "androidx/paging/FlowExtKt$simpleMapLatest$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleMapLatest$1\n+ 2 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1\n*L\n1#1,224:1\n127#2:225\n126#2,8:226\n*E\n"})
public final class PageFetcher.flow.1.invokeSuspend..inlined.simpleMapLatest.1 extends SuspendLambda implements Function3 {
    public int o;
    public FlowCollector p;
    public Object q;
    public final PageFetcher r;
    public final RemoteMediatorAccessor s;

    public PageFetcher.flow.1.invokeSuspend..inlined.simpleMapLatest.1(Continuation continuation0, PageFetcher pageFetcher0, RemoteMediatorAccessor remoteMediatorAccessor0) {
        this.r = pageFetcher0;
        this.s = remoteMediatorAccessor0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.invoke(((FlowCollector)object0), object1, ((Continuation)object2));
    }

    @Nullable
    public final Object invoke(@NotNull FlowCollector flowCollector0, Object object0, @Nullable Continuation continuation0) {
        PageFetcher.flow.1.invokeSuspend..inlined.simpleMapLatest.1 pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$10 = new PageFetcher.flow.1.invokeSuspend..inlined.simpleMapLatest.1(continuation0, this.r, this.s);
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$10.p = flowCollector0;
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$10.q = object0;
        return pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$10.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FlowCollector flowCollector0 = this.p;
                g0 g00 = (g0)this.q;
                PagingData pagingData0 = new PagingData(FlowKt.onEach(PageFetcher.access$injectRemoteEvents(this.r, g00.a, g00.c, this.s), new h0(2, null)), new PagerUiReceiver(this.r, PageFetcher.access$getRetryEvents$p(this.r)), new PagerHintReceiver(this.r, g00.a), null, 8, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
                this.o = 1;
                return flowCollector0.emit(pagingData0, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

