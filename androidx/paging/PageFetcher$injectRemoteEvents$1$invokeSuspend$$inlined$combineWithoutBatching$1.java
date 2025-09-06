package androidx.paging;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.SendChannel.DefaultImpls;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.l0;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008A@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Landroidx/paging/SimpleProducerScope;", "androidx/paging/FlowExtKt$combineWithoutBatching$2"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", i = {}, l = {0xA1}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,224:1\n13644#2,3:225\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2\n*L\n144#1:225,3\n*E\n"})
public final class PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Flow q;
    public final Flow r;
    public final MutableLoadStateCollection s;

    public PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1(Flow flow0, Flow flow1, Continuation continuation0, MutableLoadStateCollection mutableLoadStateCollection0) {
        this.q = flow0;
        this.r = flow1;
        this.s = mutableLoadStateCollection0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
        Continuation continuation1 = new PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1(this.q, this.r, continuation0, this.s);
        continuation1.p = object0;
        return continuation1;
    }

    @Nullable
    public final Object invoke(@NotNull SimpleProducerScope simpleProducerScope0, @Nullable Continuation continuation0) {
        return ((PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1)this.create(simpleProducerScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((SimpleProducerScope)object0), ((Continuation)object1));
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object object0) {
        int v = 0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SimpleProducerScope simpleProducerScope0 = (SimpleProducerScope)this.p;
                AtomicInteger atomicInteger0 = new AtomicInteger(2);
                UnbatchedFlowCombiner unbatchedFlowCombiner0 = new UnbatchedFlowCombiner(new Function4(null, this.s) {
                    public int o;
                    public Object p;
                    public Object q;
                    public CombineSource r;
                    public final SimpleProducerScope s;
                    public final MutableLoadStateCollection t;

                    {
                        this.t = mutableLoadStateCollection0;
                        this.s = simpleProducerScope0;
                        super(4, continuation0);
                    }

                    @Nullable
                    public final Object invoke(Object object0, Object object1, @NotNull CombineSource combineSource0, @Nullable Continuation continuation0) {
                        androidx.paging.PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1.1 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$10 = new androidx.paging.PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1.1(this.s, continuation0, this.t);
                        pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$10.p = object0;
                        pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$10.q = object1;
                        pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$10.r = combineSource0;
                        return pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$10.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override  // kotlin.jvm.functions.Function4
                    public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                        return this.invoke(object0, object1, ((CombineSource)object2), ((Continuation)object3));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        Object object1 = a.getCOROUTINE_SUSPENDED();
                        switch(this.o) {
                            case 0: {
                                ResultKt.throwOnFailure(object0);
                                Object object2 = this.p;
                                CombineSource combineSource0 = this.r;
                                PageEvent pageEvent0 = (PageEvent)this.q;
                                MutableLoadStateCollection mutableLoadStateCollection0 = this.t;
                                if(combineSource0 == CombineSource.RECEIVER) {
                                    pageEvent0 = new LoadStateUpdate(mutableLoadStateCollection0.snapshot(), ((LoadStates)object2));
                                }
                                else if(pageEvent0 instanceof Insert) {
                                    mutableLoadStateCollection0.set(((Insert)pageEvent0).getSourceLoadStates());
                                    pageEvent0 = Insert.copy$default(((Insert)pageEvent0), null, null, 0, 0, ((Insert)pageEvent0).getSourceLoadStates(), ((LoadStates)object2), 15, null);
                                }
                                else if(pageEvent0 instanceof Drop) {
                                    mutableLoadStateCollection0.set(((Drop)pageEvent0).getLoadType(), NotLoading.Companion.getIncomplete$paging_common_release());
                                }
                                else {
                                    if(pageEvent0 instanceof LoadStateUpdate) {
                                        mutableLoadStateCollection0.set(((LoadStateUpdate)pageEvent0).getSource());
                                        pageEvent0 = new LoadStateUpdate(((LoadStateUpdate)pageEvent0).getSource(), ((LoadStates)object2));
                                        goto label_24;
                                    }
                                    if(pageEvent0 instanceof StaticList) {
                                        throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            label_24:
                                this.o = 1;
                                return this.s.send(pageEvent0, this) == object1 ? object1 : Unit.INSTANCE;
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
                });
                CompletableJob completableJob0 = JobKt.Job$default(null, 1, null);
                Flow[] arr_flow = {this.q, this.r};
                for(int v1 = 0; v < 2; ++v1) {
                    BuildersKt.launch$default(simpleProducerScope0, completableJob0, null, new Function2(atomicInteger0, simpleProducerScope0, unbatchedFlowCombiner0, v1, null) {
                        public int o;
                        public final SimpleProducerScope p;
                        public final Flow q;
                        public final AtomicInteger r;
                        public final UnbatchedFlowCombiner s;
                        public final int t;

                        {
                            this.q = flow0;
                            this.r = atomicInteger0;
                            this.s = unbatchedFlowCombiner0;
                            this.t = v;
                            this.p = simpleProducerScope0;
                            super(2, continuation0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                            return new androidx.paging.PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1.2(this.q, this.r, this.p, this.s, this.t, continuation0);
                        }

                        @Override  // kotlin.jvm.functions.Function2
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                        }

                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                            return ((androidx.paging.PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1.2)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object object0) {
                            Object object1 = a.getCOROUTINE_SUSPENDED();
                            SimpleProducerScope simpleProducerScope0 = this.p;
                            AtomicInteger atomicInteger0 = this.r;
                            switch(this.o) {
                                case 0: {
                                    ResultKt.throwOnFailure(object0);
                                    try {
                                        androidx.paging.PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1.2.1 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$10 = new FlowCollector() {
                                            @Override  // kotlinx.coroutines.flow.FlowCollector
                                            @Nullable
                                            public final Object emit(@Nullable Object object0, @NotNull Continuation continuation0) {
                                                l0 l00;
                                                if(continuation0 instanceof l0) {
                                                    l00 = (l0)continuation0;
                                                    int v = l00.p;
                                                    if((v & 0x80000000) == 0) {
                                                        l00 = new l0(this, continuation0);
                                                    }
                                                    else {
                                                        l00.p = v ^ 0x80000000;
                                                    }
                                                }
                                                else {
                                                    l00 = new l0(this, continuation0);
                                                }
                                                Object object1 = l00.o;
                                                Object object2 = a.getCOROUTINE_SUSPENDED();
                                                switch(l00.p) {
                                                    case 0: {
                                                        ResultKt.throwOnFailure(object1);
                                                        l00.p = 1;
                                                        if(this.t.onNext(this.b, object0, l00) == object2) {
                                                            return object2;
                                                        }
                                                        break;
                                                    }
                                                    case 1: {
                                                        ResultKt.throwOnFailure(object1);
                                                        break;
                                                    }
                                                    case 2: {
                                                        ResultKt.throwOnFailure(object1);
                                                        return Unit.INSTANCE;
                                                    }
                                                    default: {
                                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                    }
                                                }
                                                l00.p = 2;
                                                return YieldKt.yield(l00) == object2 ? object2 : Unit.INSTANCE;
                                            }
                                        };
                                        this.o = 1;
                                        if(this.q.collect(pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$10, this) == object1) {
                                            return object1;
                                        label_10:
                                            ResultKt.throwOnFailure(object0);
                                        }
                                        break;
                                    }
                                    catch(Throwable throwable0) {
                                        goto label_13;
                                    }
                                }
                                case 1: {
                                    goto label_10;
                                label_13:
                                    if(atomicInteger0.decrementAndGet() == 0) {
                                        DefaultImpls.close$default(simpleProducerScope0, null, 1, null);
                                    }
                                    throw throwable0;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                            if(atomicInteger0.decrementAndGet() == 0) {
                                DefaultImpls.close$default(simpleProducerScope0, null, 1, null);
                            }
                            return Unit.INSTANCE;
                        }
                    }, 2, null);
                    ++v;
                }
                androidx.paging.PageFetcher.injectRemoteEvents.1.invokeSuspend..inlined.combineWithoutBatching.1.3 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$30 = new Function0() {
                    public final CompletableJob w;

                    {
                        this.w = completableJob0;
                        super(0);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(this.w, null, 1, null);
                    }
                };
                this.o = 1;
                return simpleProducerScope0.awaitClose(pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$30, this) == object1 ? object1 : Unit.INSTANCE;
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

