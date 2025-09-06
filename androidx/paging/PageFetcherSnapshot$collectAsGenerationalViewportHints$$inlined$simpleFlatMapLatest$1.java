package androidx.paging;

import jeb.synthetic.FIN;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001A\u0002H\u0002H\u008A@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "androidx/paging/FlowExtKt$simpleFlatMapLatest$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {0xE8, 98}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv", "generationId"}, s = {"L$1", "L$2", "I$0"})
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleFlatMapLatest$1\n+ 2 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n+ 3 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,224:1\n254#2:225\n258#2,2:236\n260#2,9:239\n390#3:226\n391#3:235\n120#4,8:227\n129#4:238\n53#5:248\n55#5:252\n50#6:249\n55#6:251\n107#7:250\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n*L\n254#1:226\n254#1:235\n254#1:227,8\n254#1:238\n268#1:248\n268#1:252\n268#1:249\n268#1:251\n268#1:250\n*E\n"})
public final class PageFetcherSnapshot.collectAsGenerationalViewportHints..inlined.simpleFlatMapLatest.1 extends SuspendLambda implements Function3 {
    public int o;
    public FlowCollector p;
    public Object q;
    public final PageFetcherSnapshot r;
    public final LoadType s;
    public Mutex t;
    public int u;

    public PageFetcherSnapshot.collectAsGenerationalViewportHints..inlined.simpleFlatMapLatest.1(Continuation continuation0, PageFetcherSnapshot pageFetcherSnapshot0, LoadType loadType0) {
        this.r = pageFetcherSnapshot0;
        this.s = loadType0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.invoke(((FlowCollector)object0), object1, ((Continuation)object2));
    }

    @Nullable
    public final Object invoke(@NotNull FlowCollector flowCollector0, Object object0, @Nullable Continuation continuation0) {
        PageFetcherSnapshot.collectAsGenerationalViewportHints..inlined.simpleFlatMapLatest.1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$10 = new PageFetcherSnapshot.collectAsGenerationalViewportHints..inlined.simpleFlatMapLatest.1(continuation0, this.r, this.s);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$10.p = flowCollector0;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$10.q = object0;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$10.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object object0) {
        Flow flow0;
        Mutex mutex0;
        Holder pageFetcherSnapshotState$Holder0;
        int v1;
        FlowCollector flowCollector0;
        LoadType loadType0 = this.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        PageFetcherSnapshot pageFetcherSnapshot0 = this.r;
        int v = 1;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector0 = this.p;
                v1 = ((Number)this.q).intValue();
                pageFetcherSnapshotState$Holder0 = PageFetcherSnapshot.access$getStateHolder$p(pageFetcherSnapshot0);
                mutex0 = Holder.access$getLock$p(pageFetcherSnapshotState$Holder0);
                this.p = flowCollector0;
                this.q = pageFetcherSnapshotState$Holder0;
                this.t = mutex0;
                this.u = v1;
                this.o = 1;
                if(mutex0.lock(null, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                v1 = this.u;
                mutex0 = this.t;
                pageFetcherSnapshotState$Holder0 = (Holder)this.q;
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
        int v2 = FIN.finallyOpen$NT();
        PageFetcherSnapshotState pageFetcherSnapshotState0 = Holder.access$getState$p(pageFetcherSnapshotState$Holder0);
        LoadState loadState0 = pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().get(loadType0);
        Companion loadState$NotLoading$Companion0 = NotLoading.Companion;
        if(Intrinsics.areEqual(loadState0, loadState$NotLoading$Companion0.getComplete$paging_common_release())) {
            flow0 = FlowKt.flowOf(new GenerationalViewportHint[0]);
            FIN.finallyExec$NT(v2);
        }
        else {
            if(!(pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().get(loadType0) instanceof Error)) {
                pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().set(loadType0, loadState$NotLoading$Companion0.getIncomplete$paging_common_release());
            }
            FIN.finallyCodeBegin$NT(v2);
            mutex0.unlock(null);
            FIN.finallyCodeEnd$NT(v2);
            Flow flow1 = PageFetcherSnapshot.access$getHintHandler$p(pageFetcherSnapshot0).hintFor(loadType0);
            if(v1 == 0) {
                v = 0;
            }
            flow0 = new PageFetcherSnapshot.collectAsGenerationalViewportHints.lambda.5..inlined.map.1(FlowKt.drop(flow1, v), v1);
        }
        this.p = null;
        this.q = null;
        this.t = null;
        this.o = 2;
        return FlowKt.emitAll(flowCollector0, flow0, this) == object1 ? object1 : Unit.INSTANCE;
    }
}

