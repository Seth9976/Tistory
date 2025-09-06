package androidx.paging;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.SendChannel.DefaultImpls;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.a0;
import s4.c0;
import s4.u;
import s4.x;

@RestrictTo({Scope.LIBRARY})
@Metadata(d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A{\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001A\u00028\u00012F\u0010\u000B\u001AB\b\u0001\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H\u0000\u00A2\u0006\u0004\b\f\u0010\r\u001Am\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022F\u0010\u000B\u001AB\b\u0001\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001Ao\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022B\u0010\u0013\u001A>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004\u00A2\u0006\u0002\b\u0012H\u0000\u00A2\u0006\u0004\b\u0014\u0010\u000F\u001Ag\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000229\b\u0004\u0010\u0013\u001A3\b\u0001\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0015H\u0080\b\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001Aa\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0004\u0010\u0013\u001A-\b\u0001\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0015H\u0080\b\u00A2\u0006\u0004\b\u0018\u0010\u0017\u001A\u0081\u0001\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\b\u0000\u0010\u0019\"\u0004\b\u0001\u0010\u001A\"\u0004\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00010\u00022?\b\u0004\u0010\u0013\u001A9\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001CH\u0080H\u00A2\u0006\u0004\b\u001F\u0010 \u00A8\u0006!"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/Flow;", "initial", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "accumulator", "value", "Lkotlin/coroutines/Continuation;", "", "operation", "simpleScan", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "simpleRunningReduce", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ExtensionFunctionType;", "transform", "simpleTransformLatest", "Lkotlin/Function2;", "simpleFlatMapLatest", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "simpleMapLatest", "T1", "T2", "otherFlow", "Lkotlin/Function4;", "Landroidx/paging/CombineSource;", "updateFrom", "combineWithoutBatching", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FlowExtKt {
    public static final Object a;

    static {
        FlowExtKt.a = new Object();
    }

    @Nullable
    public static final Object combineWithoutBatching(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Function4 function40, @NotNull Continuation continuation0) {
        return SimpleChannelFlowKt.simpleChannelFlow(new Function2(flow0, flow1, function40, null) {
            public int o;
            public Object p;
            public final Flow q;
            public final Flow r;
            public final Function4 s;

            {
                this.q = flow0;
                this.r = flow1;
                this.s = function40;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                Continuation continuation1 = new androidx.paging.FlowExtKt.combineWithoutBatching.2(this.q, this.r, this.s, continuation0);
                continuation1.p = object0;
                return continuation1;
            }

            @Nullable
            public final Object invoke(@NotNull SimpleProducerScope simpleProducerScope0, @Nullable Continuation continuation0) {
                return ((androidx.paging.FlowExtKt.combineWithoutBatching.2)this.create(simpleProducerScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
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
                        UnbatchedFlowCombiner unbatchedFlowCombiner0 = new UnbatchedFlowCombiner(new Function4(this.s, null) {
                            public int o;
                            public Object p;
                            public Object q;
                            public CombineSource r;
                            public final SimpleProducerScope s;
                            public final Function4 t;

                            {
                                this.s = simpleProducerScope0;
                                this.t = function40;
                                super(4, continuation0);
                            }

                            @Nullable
                            public final Object invoke(Object object0, Object object1, @NotNull CombineSource combineSource0, @Nullable Continuation continuation0) {
                                androidx.paging.FlowExtKt.combineWithoutBatching.2.unbatchedFlowCombiner.1 flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$10 = new androidx.paging.FlowExtKt.combineWithoutBatching.2.unbatchedFlowCombiner.1(this.s, this.t, continuation0);
                                flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$10.p = object0;
                                flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$10.q = object1;
                                flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$10.r = combineSource0;
                                return flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$10.invokeSuspend(Unit.INSTANCE);
                            }

                            @Override  // kotlin.jvm.functions.Function4
                            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                                return this.invoke(object0, object1, ((CombineSource)object2), ((Continuation)object3));
                            }

                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object object0) {
                                SimpleProducerScope simpleProducerScope1;
                                Object object1 = a.getCOROUTINE_SUSPENDED();
                                switch(this.o) {
                                    case 0: {
                                        ResultKt.throwOnFailure(object0);
                                        Object object2 = this.p;
                                        Object object3 = this.q;
                                        SimpleProducerScope simpleProducerScope0 = this.s;
                                        this.p = simpleProducerScope0;
                                        this.q = null;
                                        this.o = 1;
                                        object0 = this.t.invoke(object2, object3, this.r, this);
                                        if(object0 == object1) {
                                            return object1;
                                        }
                                        simpleProducerScope1 = simpleProducerScope0;
                                        break;
                                    }
                                    case 1: {
                                        simpleProducerScope1 = (SimpleProducerScope)this.p;
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
                                return simpleProducerScope1.send(object0, this) == object1 ? object1 : Unit.INSTANCE;
                            }

                            @Nullable
                            public final Object invokeSuspend$$forInline(@NotNull Object object0) {
                                Object object1 = this.t.invoke(this.p, this.q, this.r, this);
                                this.s.send(object1, this);
                                return Unit.INSTANCE;
                            }
                        });
                        CompletableJob completableJob0 = JobKt.Job$default(null, 1, null);
                        Flow[] arr_flow = {this.q, this.r};
                        for(int v1 = 0; v < 2; ++v1) {
                            BuildersKt.launch$default(simpleProducerScope0, completableJob0, null, new Function2(atomicInteger0, simpleProducerScope0, unbatchedFlowCombiner0, v1, null) {
                                public int o;
                                public final Flow p;
                                public final AtomicInteger q;
                                public final SimpleProducerScope r;
                                public final UnbatchedFlowCombiner s;
                                public final int t;

                                {
                                    this.p = flow0;
                                    this.q = atomicInteger0;
                                    this.r = simpleProducerScope0;
                                    this.s = unbatchedFlowCombiner0;
                                    this.t = v;
                                    super(2, continuation0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                                    return new androidx.paging.FlowExtKt.combineWithoutBatching.2.1.1(this.p, this.q, this.r, this.s, this.t, continuation0);
                                }

                                @Override  // kotlin.jvm.functions.Function2
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                                }

                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                                    return ((androidx.paging.FlowExtKt.combineWithoutBatching.2.1.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    Object object1 = a.getCOROUTINE_SUSPENDED();
                                    SimpleProducerScope simpleProducerScope0 = this.r;
                                    AtomicInteger atomicInteger0 = this.q;
                                    switch(this.o) {
                                        case 0: {
                                            ResultKt.throwOnFailure(object0);
                                            try {
                                                androidx.paging.FlowExtKt.combineWithoutBatching.2.1.1.1 flowExtKt$combineWithoutBatching$2$1$1$10 = new FlowCollector() {
                                                    @Override  // kotlinx.coroutines.flow.FlowCollector
                                                    @Nullable
                                                    public final Object emit(@Nullable Object object0, @NotNull Continuation continuation0) {
                                                        u u0;
                                                        if(continuation0 instanceof u) {
                                                            u0 = (u)continuation0;
                                                            int v = u0.q;
                                                            if((v & 0x80000000) == 0) {
                                                                u0 = new u(this, continuation0);
                                                            }
                                                            else {
                                                                u0.q = v ^ 0x80000000;
                                                            }
                                                        }
                                                        else {
                                                            u0 = new u(this, continuation0);
                                                        }
                                                        Object object1 = u0.o;
                                                        Object object2 = a.getCOROUTINE_SUSPENDED();
                                                        switch(u0.q) {
                                                            case 0: {
                                                                ResultKt.throwOnFailure(object1);
                                                                u0.q = 1;
                                                                if(this.t.onNext(this.b, object0, u0) == object2) {
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
                                                        u0.q = 2;
                                                        return YieldKt.yield(u0) == object2 ? object2 : Unit.INSTANCE;
                                                    }
                                                };
                                                this.o = 1;
                                                if(this.p.collect(flowExtKt$combineWithoutBatching$2$1$1$10, this) == object1) {
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
                        androidx.paging.FlowExtKt.combineWithoutBatching.2.2 flowExtKt$combineWithoutBatching$2$20 = new Function0() {
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
                        return simpleProducerScope0.awaitClose(flowExtKt$combineWithoutBatching$2$20, this) == object1 ? object1 : Unit.INSTANCE;
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

            @Nullable
            public final Object invokeSuspend$$forInline(@NotNull Object object0) {
                SimpleProducerScope simpleProducerScope0 = (SimpleProducerScope)this.p;
                AtomicInteger atomicInteger0 = new AtomicInteger(2);
                UnbatchedFlowCombiner unbatchedFlowCombiner0 = new UnbatchedFlowCombiner(new androidx.paging.FlowExtKt.combineWithoutBatching.2.unbatchedFlowCombiner.1(simpleProducerScope0, this.s, null));
                CompletableJob completableJob0 = JobKt.Job$default(null, 1, null);
                Flow[] arr_flow = {this.q, this.r};
                int v1 = 0;
                for(int v = 0; v1 < 2; ++v) {
                    BuildersKt.launch$default(simpleProducerScope0, completableJob0, null, new androidx.paging.FlowExtKt.combineWithoutBatching.2.1.1(arr_flow[v1], atomicInteger0, simpleProducerScope0, unbatchedFlowCombiner0, v, null), 2, null);
                    ++v1;
                }
                simpleProducerScope0.awaitClose(new androidx.paging.FlowExtKt.combineWithoutBatching.2.2(completableJob0), this);
                return Unit.INSTANCE;
            }
        });
    }

    @NotNull
    public static final Flow simpleFlatMapLatest(@NotNull Flow flow0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        return FlowExtKt.simpleTransformLatest(flow0, new Function3(function20, null) {
            public int o;
            public FlowCollector p;
            public Object q;
            public final Function2 r;

            {
                this.r = function20;
                super(3, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((FlowCollector)object0), object1, ((Continuation)object2));
            }

            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector0, Object object0, @Nullable Continuation continuation0) {
                androidx.paging.FlowExtKt.simpleFlatMapLatest.1 flowExtKt$simpleFlatMapLatest$10 = new androidx.paging.FlowExtKt.simpleFlatMapLatest.1(this.r, continuation0);
                flowExtKt$simpleFlatMapLatest$10.p = flowCollector0;
                flowExtKt$simpleFlatMapLatest$10.q = object0;
                return flowExtKt$simpleFlatMapLatest$10.invokeSuspend(Unit.INSTANCE);
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
                return FlowKt.emitAll(flowCollector0, ((Flow)object0), this) == object1 ? object1 : Unit.INSTANCE;
            }

            @Nullable
            public final Object invokeSuspend$$forInline(@NotNull Object object0) {
                FlowKt.emitAll(this.p, ((Flow)this.r.invoke(this.q, this)), this);
                return Unit.INSTANCE;
            }
        });
    }

    @NotNull
    public static final Flow simpleMapLatest(@NotNull Flow flow0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        return FlowExtKt.simpleTransformLatest(flow0, new Function3(function20, null) {
            public int o;
            public FlowCollector p;
            public Object q;
            public final Function2 r;

            {
                this.r = function20;
                super(3, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((FlowCollector)object0), object1, ((Continuation)object2));
            }

            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector0, Object object0, @Nullable Continuation continuation0) {
                androidx.paging.FlowExtKt.simpleMapLatest.1 flowExtKt$simpleMapLatest$10 = new androidx.paging.FlowExtKt.simpleMapLatest.1(this.r, continuation0);
                flowExtKt$simpleMapLatest$10.p = flowCollector0;
                flowExtKt$simpleMapLatest$10.q = object0;
                return flowExtKt$simpleMapLatest$10.invokeSuspend(Unit.INSTANCE);
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
        });
    }

    @NotNull
    public static final Flow simpleRunningReduce(@NotNull Flow flow0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        return FlowKt.flow(new x(flow0, function30, null));
    }

    @NotNull
    public static final Flow simpleScan(@NotNull Flow flow0, Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "operation");
        return FlowKt.flow(new a0(flow0, object0, function30, null));
    }

    @NotNull
    public static final Flow simpleTransformLatest(@NotNull Flow flow0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "transform");
        return SimpleChannelFlowKt.simpleChannelFlow(new c0(flow0, function30, null));
    }
}

