package kotlinx.coroutines.flow;

import androidx.activity.d0;
import androidx.compose.material3.ti;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.BuilderInference;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BroadcastChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.ChannelFlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import kotlinx.coroutines.flow.internal.FusibleFlow.DefaultImpls;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NopCollector;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import md.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s4.w1;
import wb.a;
import xf.b2;
import xf.c1;
import xf.c;
import xf.d1;
import xf.e0;
import xf.f1;
import xf.f;
import xf.g1;
import xf.g;
import xf.h0;
import xf.h1;
import xf.h;
import xf.i1;
import xf.j0;
import xf.j1;
import xf.j2;
import xf.k0;
import xf.k1;
import xf.k2;
import xf.l1;
import xf.l2;
import xf.l;
import xf.n1;
import xf.n;
import xf.o1;
import xf.o;
import xf.p0;
import xf.p1;
import xf.p;
import xf.q1;
import xf.q;
import xf.r0;
import xf.r1;
import xf.r;
import xf.s0;
import xf.t0;
import xf.t1;
import xf.t;
import xf.u1;
import xf.v1;
import xf.x1;
import xf.y;
import xf.z2;
import xf.z;

@Metadata(d1 = {"g/b", "xf/k0", "xf/o0", "xf/d1", "xf/f1", "xf/x1", "kotlinx/coroutines/flow/b"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class FlowKt {
    @NotNull
    public static final String DEFAULT_CONCURRENCY_PROPERTY_NAME = "kotlinx.coroutines.flow.defaultConcurrency";

    @NotNull
    public static final Flow asFlow(@NotNull Iterable iterable0) {
        return new FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.3(iterable0);
    }

    @NotNull
    public static final Flow asFlow(@NotNull Iterator iterator0) {
        return new FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.4(iterator0);
    }

    @NotNull
    public static final Flow asFlow(@NotNull Function0 function00) {
        return new FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.1(function00);
    }

    @NotNull
    public static final Flow asFlow(@NotNull Function1 function10) {
        return new FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.2(function10);
    }

    @NotNull
    public static final Flow asFlow(@NotNull IntRange intRange0) {
        return new FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.9(intRange0);
    }

    @NotNull
    public static final Flow asFlow(@NotNull LongRange longRange0) {
        return new FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.10(longRange0);
    }

    @NotNull
    public static final Flow asFlow(@NotNull Sequence sequence0) {
        return new FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.5(sequence0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\'BroadcastChannel\' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @NotNull
    public static final Flow asFlow(@NotNull BroadcastChannel broadcastChannel0) {
        return new FlowKt__ChannelsKt.asFlow..inlined.unsafeFlow.1(broadcastChannel0);
    }

    @NotNull
    public static final Flow asFlow(@NotNull int[] arr_v) {
        return new FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.7(arr_v);
    }

    @NotNull
    public static final Flow asFlow(@NotNull long[] arr_v) {
        return new FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.8(arr_v);
    }

    @NotNull
    public static final Flow asFlow(@NotNull Object[] arr_object) {
        return new FlowKt__BuildersKt.asFlow..inlined.unsafeFlow.6(arr_object);
    }

    @NotNull
    public static final SharedFlow asSharedFlow(@NotNull MutableSharedFlow mutableSharedFlow0) {
        return new j2(mutableSharedFlow0, null);
    }

    @NotNull
    public static final StateFlow asStateFlow(@NotNull MutableStateFlow mutableStateFlow0) {
        return new k2(mutableStateFlow0, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final Flow buffer(Flow flow0, int v) {
        return FlowKt.buffer$default(flow0, v, null, 2, null);
    }

    @NotNull
    public static final Flow buffer(@NotNull Flow flow0, int v, @NotNull BufferOverflow bufferOverflow0) {
        if(v < 0 && (v != -2 && v != -1)) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + v).toString());
        }
        if(v == -1 && bufferOverflow0 != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if(v == -1) {
            bufferOverflow0 = BufferOverflow.DROP_OLDEST;
            v = 0;
        }
        return flow0 instanceof FusibleFlow ? DefaultImpls.fuse$default(((FusibleFlow)flow0), null, v, bufferOverflow0, 1, null) : new ChannelFlowOperatorImpl(flow0, null, v, bufferOverflow0, 2, null);
    }

    public static Flow buffer$default(Flow flow0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = -2;
        }
        return FlowKt.buffer(flow0, v);
    }

    public static Flow buffer$default(Flow flow0, int v, BufferOverflow bufferOverflow0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = -2;
        }
        if((v1 & 2) != 0) {
            bufferOverflow0 = BufferOverflow.SUSPEND;
        }
        return FlowKt.buffer(flow0, v, bufferOverflow0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'cache()\' is \'shareIn\' with unlimited replay and \'started = SharingStared.Lazily\' argument\'", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @NotNull
    public static final Flow cache(@NotNull Flow flow0) {
        throw a.h();
    }

    @NotNull
    public static final Flow callbackFlow(@BuilderInference @NotNull Function2 function20) {
        return new c(function20, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }

    @NotNull
    public static final Flow cancellable(@NotNull Flow flow0) {
        return !(flow0 instanceof CancellableFlow) ? new f(flow0) : flow0;
    }

    @NotNull
    public static final Flow catch(@NotNull Flow flow0, @NotNull Function3 function30) {
        return new FlowKt__ErrorsKt.catch..inlined.unsafeFlow.1(flow0, function30);
    }

    @Nullable
    public static final Object catchImpl(@NotNull Flow flow0, @NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        ObjectRef ref$ObjectRef0;
        p0 p00;
        if(continuation0 instanceof p0) {
            p00 = (p0)continuation0;
            int v = p00.q;
            if((v & 0x80000000) == 0) {
                p00 = new p0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                p00.q = v ^ 0x80000000;
            }
        }
        else {
            p00 = new p0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = p00.p;
        Throwable throwable0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(p00.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ObjectRef ref$ObjectRef1 = new ObjectRef();
                try {
                    r0 r00 = new r0(flowCollector0, ref$ObjectRef1);
                    p00.o = ref$ObjectRef1;
                    p00.q = 1;
                    return flow0.collect(r00, p00) != throwable0 ? null : throwable0;
                }
                catch(Throwable throwable2) {
                    throwable0 = throwable2;
                    ref$ObjectRef0 = ref$ObjectRef1;
                }
            label_29:
                Throwable throwable3 = (Throwable)ref$ObjectRef0.element;
                if(throwable3 != null && Intrinsics.areEqual(throwable3, throwable0)) {
                    throw throwable0;
                }
                Job job0 = (Job)p00.getContext().get(Job.Key);
                if(job0 != null && job0.isCancelled()) {
                    CancellationException cancellationException0 = job0.getCancellationException();
                    if(cancellationException0 != null && Intrinsics.areEqual(cancellationException0, throwable0)) {
                        throw throwable0;
                    }
                }
                if(throwable3 != null) {
                    if(throwable0 instanceof CancellationException) {
                        b.addSuppressed(throwable3, throwable0);
                        throw throwable3;
                    }
                    b.addSuppressed(throwable0, throwable3);
                    throw throwable0;
                }
                return throwable0;
            }
            case 1: {
                try {
                    ref$ObjectRef0 = p00.o;
                    ResultKt.throwOnFailure(object0);
                    return null;
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    goto label_29;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @NotNull
    public static final Flow channelFlow(@BuilderInference @NotNull Function2 function20) {
        return new h(function20, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }

    @Nullable
    public static final Object collect(@NotNull Flow flow0, @NotNull Continuation continuation0) {
        Unit unit0 = flow0.collect(NopCollector.INSTANCE, continuation0);
        return unit0 == qd.a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final Object collect(Flow flow0, Function2 function20, Continuation continuation0) {
        Unit unit0 = flow0.collect(new FlowKt__CollectKt.collect.3(function20), continuation0);
        return unit0 == qd.a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Nullable
    public static final Object collectIndexed(@NotNull Flow flow0, @NotNull Function3 function30, @NotNull Continuation continuation0) {
        Unit unit0 = flow0.collect(new FlowKt__CollectKt.collectIndexed.2(function30), continuation0);
        return unit0 == qd.a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Nullable
    public static final Object collectLatest(@NotNull Flow flow0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Unit unit0 = FlowKt.collect(FlowKt.buffer$default(FlowKt.mapLatest(flow0, function20), 0, null, 2, null), continuation0);
        return unit0 == qd.a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Nullable
    public static final Object collectWhile(@NotNull Flow flow0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return d1.b(flow0, function20, continuation0);
    }

    public static final Flow combine(Iterable iterable0, Function2 function20) {
        Flow[] arr_flow = (Flow[])CollectionsKt___CollectionsKt.toList(iterable0).toArray(new Flow[0]);
        Intrinsics.needClassReification();
        return new FlowKt__ZipKt.combine..inlined.unsafeFlow.3(arr_flow, function20);
    }

    @NotNull
    public static final Flow combine(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Function3 function30) {
        return FlowKt.flowCombine(flow0, flow1, function30);
    }

    @NotNull
    public static final Flow combine(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Flow flow2, @BuilderInference @NotNull Function4 function40) {
        return new FlowKt__ZipKt.combine..inlined.combineUnsafe.FlowKt__ZipKt.1(new Flow[]{flow0, flow1, flow2}, function40);
    }

    @NotNull
    public static final Flow combine(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Flow flow2, @NotNull Flow flow3, @NotNull Function5 function50) {
        return new FlowKt__ZipKt.combine..inlined.combineUnsafe.FlowKt__ZipKt.2(new Flow[]{flow0, flow1, flow2, flow3}, function50);
    }

    @NotNull
    public static final Flow combine(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Flow flow2, @NotNull Flow flow3, @NotNull Flow flow4, @NotNull Function6 function60) {
        return new FlowKt__ZipKt.combine..inlined.combineUnsafe.FlowKt__ZipKt.3(new Flow[]{flow0, flow1, flow2, flow3, flow4}, function60);
    }

    public static final Flow combine(Flow[] arr_flow, Function2 function20) {
        Intrinsics.needClassReification();
        return new FlowKt__ZipKt.combine..inlined.unsafeFlow.2(arr_flow, function20);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'combineLatest\' is \'combine\'", replaceWith = @ReplaceWith(expression = "this.combine(other, transform)", imports = {}))
    @NotNull
    public static final Flow combineLatest(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Function3 function30) {
        return FlowKt.combine(flow0, flow1, function30);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'combineLatest\' is \'combine\'", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, transform)", imports = {}))
    @NotNull
    public static final Flow combineLatest(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Flow flow2, @NotNull Function4 function40) {
        return FlowKt.combine(flow0, flow1, flow2, function40);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'combineLatest\' is \'combine\'", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final Flow combineLatest(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Flow flow2, @NotNull Flow flow3, @NotNull Function5 function50) {
        return FlowKt.combine(flow0, flow1, flow2, flow3, function50);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'combineLatest\' is \'combine\'", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final Flow combineLatest(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Flow flow2, @NotNull Flow flow3, @NotNull Flow flow4, @NotNull Function6 function60) {
        return FlowKt.combine(flow0, flow1, flow2, flow3, flow4, function60);
    }

    public static final Flow combineTransform(Iterable iterable0, @BuilderInference Function3 function30) {
        Flow[] arr_flow = (Flow[])CollectionsKt___CollectionsKt.toList(iterable0).toArray(new Flow[0]);
        Intrinsics.needClassReification();
        return FlowKt.flow(new FlowKt__ZipKt.combineTransform.7(arr_flow, function30, null));
    }

    @NotNull
    public static final Flow combineTransform(@NotNull Flow flow0, @NotNull Flow flow1, @BuilderInference @NotNull Function4 function40) {
        return FlowKt.flow(new FlowKt__ZipKt.combineTransform..inlined.combineTransformUnsafe.FlowKt__ZipKt.2(new Flow[]{flow0, flow1}, null, function40));
    }

    @NotNull
    public static final Flow combineTransform(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Flow flow2, @BuilderInference @NotNull Function5 function50) {
        return FlowKt.flow(new FlowKt__ZipKt.combineTransform..inlined.combineTransformUnsafe.FlowKt__ZipKt.3(new Flow[]{flow0, flow1, flow2}, null, function50));
    }

    @NotNull
    public static final Flow combineTransform(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Flow flow2, @NotNull Flow flow3, @BuilderInference @NotNull Function6 function60) {
        return FlowKt.flow(new FlowKt__ZipKt.combineTransform..inlined.combineTransformUnsafe.FlowKt__ZipKt.4(new Flow[]{flow0, flow1, flow2, flow3}, null, function60));
    }

    @NotNull
    public static final Flow combineTransform(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Flow flow2, @NotNull Flow flow3, @NotNull Flow flow4, @BuilderInference @NotNull Function7 function70) {
        return FlowKt.flow(new FlowKt__ZipKt.combineTransform..inlined.combineTransformUnsafe.FlowKt__ZipKt.5(new Flow[]{flow0, flow1, flow2, flow3, flow4}, null, function70));
    }

    public static final Flow combineTransform(Flow[] arr_flow, @BuilderInference Function3 function30) {
        Intrinsics.needClassReification();
        return FlowKt.flow(new FlowKt__ZipKt.combineTransform.6(arr_flow, function30, null));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'compose\' is \'let\'", replaceWith = @ReplaceWith(expression = "let(transformer)", imports = {}))
    @NotNull
    public static final Flow compose(@NotNull Flow flow0, @NotNull Function1 function10) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'concatMap\' is \'flatMapConcat\'", replaceWith = @ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final Flow concatMap(@NotNull Flow flow0, @NotNull Function1 function10) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'concatWith\' is \'onCompletion\'. Use \'onCompletion { emit(value) }\'", replaceWith = @ReplaceWith(expression = "onCompletion { emit(value) }", imports = {}))
    @NotNull
    public static final Flow concatWith(@NotNull Flow flow0, Object object0) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'concatWith\' is \'onCompletion\'. Use \'onCompletion { if (it == null) emitAll(other) }\'", replaceWith = @ReplaceWith(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @NotNull
    public static final Flow concatWith(@NotNull Flow flow0, @NotNull Flow flow1) {
        throw a.h();
    }

    @NotNull
    public static final Flow conflate(@NotNull Flow flow0) {
        return FlowKt.buffer$default(flow0, -1, null, 2, null);
    }

    @NotNull
    public static final Flow consumeAsFlow(@NotNull ReceiveChannel receiveChannel0) {
        return new g(receiveChannel0, true);
    }

    @Nullable
    public static final Object count(@NotNull Flow flow0, @NotNull Continuation continuation0) {
        p p0;
        if(continuation0 instanceof p) {
            p0 = (p)continuation0;
            int v = p0.q;
            if((v & 0x80000000) == 0) {
                p0 = new p(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                p0.q = v ^ 0x80000000;
            }
        }
        else {
            p0 = new p(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = p0.p;
        Integer integer0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(p0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                IntRef ref$IntRef0 = new IntRef();
                q q0 = new q(ref$IntRef0);
                p0.o = ref$IntRef0;
                p0.q = 1;
                return flow0.collect(q0, p0) == integer0 ? integer0 : Boxing.boxInt(ref$IntRef0.element);
            }
            case 1: {
                IntRef ref$IntRef1 = p0.o;
                ResultKt.throwOnFailure(object0);
                return Boxing.boxInt(ref$IntRef1.element);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Nullable
    public static final Object count(@NotNull Flow flow0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        r r0;
        if(continuation0 instanceof r) {
            r0 = (r)continuation0;
            int v = r0.q;
            if((v & 0x80000000) == 0) {
                r0 = new r(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                r0.q = v ^ 0x80000000;
            }
        }
        else {
            r0 = new r(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = r0.p;
        Integer integer0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(r0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                IntRef ref$IntRef0 = new IntRef();
                t t0 = new t(function20, ref$IntRef0);
                r0.o = ref$IntRef0;
                r0.q = 1;
                return flow0.collect(t0, r0) == integer0 ? integer0 : Boxing.boxInt(ref$IntRef0.element);
            }
            case 1: {
                IntRef ref$IntRef1 = r0.o;
                ResultKt.throwOnFailure(object0);
                return Boxing.boxInt(ref$IntRef1.element);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @FlowPreview
    @NotNull
    public static final Flow debounce(@NotNull Flow flow0, long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException("Debounce timeout should not be negative");
        }
        return v1 == 0 ? flow0 : FlowCoroutineKt.scopedFlow(new y(new aa.c(v, 2), flow0, null));
    }

    @OverloadResolutionByLambdaReturnType
    @FlowPreview
    @NotNull
    public static final Flow debounce(@NotNull Flow flow0, @NotNull Function1 function10) {
        return FlowCoroutineKt.scopedFlow(new y(function10, flow0, null));
    }

    @FlowPreview
    @NotNull
    public static final Flow debounce-HG0u8IE(@NotNull Flow flow0, long v) {
        return FlowKt.debounce(flow0, DelayKt.toDelayMillis-LRDsOJo(v));
    }

    @OverloadResolutionByLambdaReturnType
    @JvmName(name = "debounceDuration")
    @FlowPreview
    @NotNull
    public static final Flow debounceDuration(@NotNull Flow flow0, @NotNull Function1 function10) {
        return FlowCoroutineKt.scopedFlow(new y(new ti(function10, 19), flow0, null));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use \'onEach { delay(timeMillis) }\'", replaceWith = @ReplaceWith(expression = "onEach { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final Flow delayEach(@NotNull Flow flow0, long v) {
        return FlowKt.onEach(flow0, new g1(v, null));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use \'onStart { delay(timeMillis) }\'", replaceWith = @ReplaceWith(expression = "onStart { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final Flow delayFlow(@NotNull Flow flow0, long v) {
        return FlowKt.onStart(flow0, new h1(v, null));
    }

    @NotNull
    public static final Flow distinctUntilChanged(@NotNull Flow flow0) {
        return !(flow0 instanceof StateFlow) ? k0.a(flow0, k0.a, k0.b) : flow0;
    }

    @NotNull
    public static final Flow distinctUntilChanged(@NotNull Flow flow0, @NotNull Function2 function20) {
        Intrinsics.checkNotNull(function20, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        Function2 function21 = (Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function20, 2);
        return k0.a(flow0, k0.a, function21);
    }

    @NotNull
    public static final Flow distinctUntilChangedBy(@NotNull Flow flow0, @NotNull Function1 function10) {
        return k0.a(flow0, function10, k0.b);
    }

    @NotNull
    public static final Flow drop(@NotNull Flow flow0, int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("Drop count should be non-negative, but had " + v).toString());
        }
        return new FlowKt__LimitKt.drop..inlined.unsafeFlow.1(flow0, v);
    }

    @NotNull
    public static final Flow dropWhile(@NotNull Flow flow0, @NotNull Function2 function20) {
        return new FlowKt__LimitKt.dropWhile..inlined.unsafeFlow.1(flow0, function20);
    }

    @Nullable
    public static final Object emitAll(@NotNull FlowCollector flowCollector0, @NotNull ReceiveChannel receiveChannel0, @NotNull Continuation continuation0) {
        Unit unit0 = g.b.i(flowCollector0, receiveChannel0, true, continuation0);
        return unit0 == qd.a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Nullable
    public static final Object emitAll(@NotNull FlowCollector flowCollector0, @NotNull Flow flow0, @NotNull Continuation continuation0) {
        FlowKt.ensureActive(flowCollector0);
        Unit unit0 = flow0.collect(flowCollector0, continuation0);
        return unit0 == qd.a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @NotNull
    public static final Flow emptyFlow() {
        return l.a;
    }

    public static final void ensureActive(@NotNull FlowCollector flowCollector0) {
        if(flowCollector0 instanceof ThrowingCollector) {
            throw ((ThrowingCollector)flowCollector0).e;
        }
    }

    @NotNull
    public static final Flow filter(@NotNull Flow flow0, @NotNull Function2 function20) {
        return new FlowKt__TransformKt.filter..inlined.unsafeTransform.1(flow0, function20);
    }

    public static final Flow filterIsInstance(Flow flow0) {
        Intrinsics.needClassReification();
        return new FlowKt__TransformKt.filterIsInstance..inlined.filter.1(flow0);
    }

    @NotNull
    public static final Flow filterIsInstance(@NotNull Flow flow0, @NotNull KClass kClass0) {
        return new FlowKt__TransformKt.filterIsInstance..inlined.filter.2(flow0, kClass0);
    }

    @NotNull
    public static final Flow filterNot(@NotNull Flow flow0, @NotNull Function2 function20) {
        return new FlowKt__TransformKt.filterNot..inlined.unsafeTransform.1(flow0, function20);
    }

    @NotNull
    public static final Flow filterNotNull(@NotNull Flow flow0) {
        return new FlowKt__TransformKt.filterNotNull..inlined.unsafeTransform.1(flow0);
    }

    @Nullable
    public static final Object first(@NotNull Flow flow0, @NotNull Continuation continuation0) {
        FlowKt__ReduceKt.first..inlined.collectWhile.1 flowKt__ReduceKt$first$$inlined$collectWhile$11;
        AbortFlowException abortFlowException1;
        ObjectRef ref$ObjectRef1;
        i1 i10;
        if(continuation0 instanceof i1) {
            i10 = (i1)continuation0;
            int v = i10.r;
            if((v & 0x80000000) == 0) {
                i10 = new i1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                i10.r = v ^ 0x80000000;
            }
        }
        else {
            i10 = new i1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = i10.q;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(i10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ref$ObjectRef0.element = NullSurrogateKt.NULL;
                FlowKt__ReduceKt.first..inlined.collectWhile.1 flowKt__ReduceKt$first$$inlined$collectWhile$10 = new FlowKt__ReduceKt.first..inlined.collectWhile.1(ref$ObjectRef0);
                try {
                    i10.o = ref$ObjectRef0;
                    i10.p = flowKt__ReduceKt$first$$inlined$collectWhile$10;
                    i10.r = 1;
                    if(flow0.collect(flowKt__ReduceKt$first$$inlined$collectWhile$10, i10) == object1) {
                        return object1;
                    }
                }
                catch(AbortFlowException abortFlowException0) {
                    ref$ObjectRef1 = ref$ObjectRef0;
                    abortFlowException1 = abortFlowException0;
                    flowKt__ReduceKt$first$$inlined$collectWhile$11 = flowKt__ReduceKt$first$$inlined$collectWhile$10;
                    FlowExceptions_commonKt.checkOwnership(abortFlowException1, flowKt__ReduceKt$first$$inlined$collectWhile$11);
                    break;
                }
                ref$ObjectRef1 = ref$ObjectRef0;
                break;
            }
            case 1: {
                try {
                    flowKt__ReduceKt$first$$inlined$collectWhile$11 = i10.p;
                    ref$ObjectRef1 = i10.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(AbortFlowException abortFlowException1) {
                }
                FlowExceptions_commonKt.checkOwnership(abortFlowException1, flowKt__ReduceKt$first$$inlined$collectWhile$11);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object1 = ref$ObjectRef1.element;
        if(object1 == NullSurrogateKt.NULL) {
            throw new NoSuchElementException("Expected at least one element");
        }
        return object1;
    }

    @Nullable
    public static final Object first(@NotNull Flow flow0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        FlowKt__ReduceKt.first..inlined.collectWhile.2 flowKt__ReduceKt$first$$inlined$collectWhile$21;
        AbortFlowException abortFlowException1;
        ObjectRef ref$ObjectRef1;
        Function2 function21;
        j1 j10;
        if(continuation0 instanceof j1) {
            j10 = (j1)continuation0;
            int v = j10.s;
            if((v & 0x80000000) == 0) {
                j10 = new j1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                j10.s = v ^ 0x80000000;
            }
        }
        else {
            j10 = new j1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = j10.r;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(j10.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ref$ObjectRef0.element = NullSurrogateKt.NULL;
                FlowKt__ReduceKt.first..inlined.collectWhile.2 flowKt__ReduceKt$first$$inlined$collectWhile$20 = new FlowKt__ReduceKt.first..inlined.collectWhile.2(function20, ref$ObjectRef0);
                try {
                    j10.o = function20;
                    j10.p = ref$ObjectRef0;
                    j10.q = flowKt__ReduceKt$first$$inlined$collectWhile$20;
                    j10.s = 1;
                    if(flow0.collect(flowKt__ReduceKt$first$$inlined$collectWhile$20, j10) == object1) {
                        return object1;
                    }
                }
                catch(AbortFlowException abortFlowException0) {
                    function21 = function20;
                    ref$ObjectRef1 = ref$ObjectRef0;
                    abortFlowException1 = abortFlowException0;
                    flowKt__ReduceKt$first$$inlined$collectWhile$21 = flowKt__ReduceKt$first$$inlined$collectWhile$20;
                    FlowExceptions_commonKt.checkOwnership(abortFlowException1, flowKt__ReduceKt$first$$inlined$collectWhile$21);
                    break;
                }
                function21 = function20;
                ref$ObjectRef1 = ref$ObjectRef0;
                break;
            }
            case 1: {
                try {
                    flowKt__ReduceKt$first$$inlined$collectWhile$21 = j10.q;
                    ref$ObjectRef1 = j10.p;
                    function21 = j10.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(AbortFlowException abortFlowException1) {
                }
                FlowExceptions_commonKt.checkOwnership(abortFlowException1, flowKt__ReduceKt$first$$inlined$collectWhile$21);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object1 = ref$ObjectRef1.element;
        if(object1 == NullSurrogateKt.NULL) {
            throw new NoSuchElementException("Expected at least one element matching the predicate " + function21);
        }
        return object1;
    }

    @Nullable
    public static final Object firstOrNull(@NotNull Flow flow0, @NotNull Continuation continuation0) {
        FlowKt__ReduceKt.firstOrNull..inlined.collectWhile.1 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$11;
        AbortFlowException abortFlowException1;
        ObjectRef ref$ObjectRef1;
        k1 k10;
        if(continuation0 instanceof k1) {
            k10 = (k1)continuation0;
            int v = k10.r;
            if((v & 0x80000000) == 0) {
                k10 = new k1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                k10.r = v ^ 0x80000000;
            }
        }
        else {
            k10 = new k1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = k10.q;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(k10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                FlowKt__ReduceKt.firstOrNull..inlined.collectWhile.1 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$10 = new FlowKt__ReduceKt.firstOrNull..inlined.collectWhile.1(ref$ObjectRef0);
                try {
                    k10.o = ref$ObjectRef0;
                    k10.p = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$10;
                    k10.r = 1;
                    return flow0.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$10, k10) != object1 ? ref$ObjectRef0.element : object1;
                }
                catch(AbortFlowException abortFlowException0) {
                    ref$ObjectRef1 = ref$ObjectRef0;
                    abortFlowException1 = abortFlowException0;
                    flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$11 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$10;
                    FlowExceptions_commonKt.checkOwnership(abortFlowException1, flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$11);
                    return ref$ObjectRef1.element;
                }
            }
            case 1: {
                try {
                    flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$11 = k10.p;
                    ref$ObjectRef1 = k10.o;
                    ResultKt.throwOnFailure(object0);
                    return ref$ObjectRef1.element;
                }
                catch(AbortFlowException abortFlowException1) {
                }
                FlowExceptions_commonKt.checkOwnership(abortFlowException1, flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$11);
                return ref$ObjectRef1.element;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Nullable
    public static final Object firstOrNull(@NotNull Flow flow0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        FlowKt__ReduceKt.firstOrNull..inlined.collectWhile.2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$21;
        AbortFlowException abortFlowException1;
        ObjectRef ref$ObjectRef1;
        l1 l10;
        if(continuation0 instanceof l1) {
            l10 = (l1)continuation0;
            int v = l10.r;
            if((v & 0x80000000) == 0) {
                l10 = new l1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                l10.r = v ^ 0x80000000;
            }
        }
        else {
            l10 = new l1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = l10.q;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(l10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                FlowKt__ReduceKt.firstOrNull..inlined.collectWhile.2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$20 = new FlowKt__ReduceKt.firstOrNull..inlined.collectWhile.2(function20, ref$ObjectRef0);
                try {
                    l10.o = ref$ObjectRef0;
                    l10.p = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$20;
                    l10.r = 1;
                    return flow0.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$20, l10) != object1 ? ref$ObjectRef0.element : object1;
                }
                catch(AbortFlowException abortFlowException0) {
                    ref$ObjectRef1 = ref$ObjectRef0;
                    abortFlowException1 = abortFlowException0;
                    flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$21 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$20;
                    FlowExceptions_commonKt.checkOwnership(abortFlowException1, flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$21);
                    return ref$ObjectRef1.element;
                }
            }
            case 1: {
                try {
                    flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$21 = l10.p;
                    ref$ObjectRef1 = l10.o;
                    ResultKt.throwOnFailure(object0);
                    return ref$ObjectRef1.element;
                }
                catch(AbortFlowException abortFlowException1) {
                }
                FlowExceptions_commonKt.checkOwnership(abortFlowException1, flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$21);
                return ref$ObjectRef1.element;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @NotNull
    public static final ReceiveChannel fixedPeriodTicker(@NotNull CoroutineScope coroutineScope0, long v, long v1) {
        if(Long.compare(v, 0L) < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + v + " ms").toString());
        }
        if(v1 < 0L) {
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + v1 + " ms").toString());
        }
        return ProduceKt.produce$default(coroutineScope0, null, 0, new z(v1, v, null), 1, null);
    }

    public static ReceiveChannel fixedPeriodTicker$default(CoroutineScope coroutineScope0, long v, long v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = v;
        }
        return FlowKt.fixedPeriodTicker(coroutineScope0, v, v1);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue is \'flatMapConcat\'", replaceWith = @ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final Flow flatMap(@NotNull Flow flow0, @NotNull Function2 function20) {
        throw a.h();
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final Flow flatMapConcat(@NotNull Flow flow0, @NotNull Function2 function20) {
        return FlowKt.flattenConcat(new FlowKt__MergeKt.flatMapConcat..inlined.map.1(flow0, function20));
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final Flow flatMapLatest(@NotNull Flow flow0, @BuilderInference @NotNull Function2 function20) {
        return FlowKt.transformLatest(flow0, new FlowKt__MergeKt.flatMapLatest.1(function20, null));
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final Flow flatMapMerge(@NotNull Flow flow0, int v, @NotNull Function2 function20) {
        return FlowKt.flattenMerge(new FlowKt__MergeKt.flatMapMerge..inlined.map.1(flow0, function20), v);
    }

    public static Flow flatMapMerge$default(Flow flow0, int v, Function2 function20, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = f1.a;
        }
        return FlowKt.flatMapMerge(flow0, v, function20);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'flatten\' is \'flattenConcat\'", replaceWith = @ReplaceWith(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final Flow flatten(@NotNull Flow flow0) {
        throw a.h();
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final Flow flattenConcat(@NotNull Flow flow0) {
        return new FlowKt__MergeKt.flattenConcat..inlined.unsafeFlow.1(flow0);
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final Flow flattenMerge(@NotNull Flow flow0, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException(("Expected positive concurrency level, but had " + v).toString());
        }
        return v == 1 ? FlowKt.flattenConcat(flow0) : new ChannelFlowMerge(flow0, v, null, 0, null, 28, null);
    }

    public static Flow flattenMerge$default(Flow flow0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = f1.a;
        }
        return FlowKt.flattenMerge(flow0, v);
    }

    @NotNull
    public static final Flow flow(@BuilderInference @NotNull Function2 function20) {
        return new l2(function20);
    }

    @JvmName(name = "flowCombine")
    @NotNull
    public static final Flow flowCombine(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Function3 function30) {
        return new FlowKt__ZipKt.combine..inlined.unsafeFlow.1(flow0, flow1, function30);
    }

    @JvmName(name = "flowCombineTransform")
    @NotNull
    public static final Flow flowCombineTransform(@NotNull Flow flow0, @NotNull Flow flow1, @BuilderInference @NotNull Function4 function40) {
        return FlowKt.flow(new FlowKt__ZipKt.combineTransform..inlined.combineTransformUnsafe.FlowKt__ZipKt.1(new Flow[]{flow0, flow1}, null, function40));
    }

    @NotNull
    public static final Flow flowOf(Object object0) {
        return new FlowKt__BuildersKt.flowOf..inlined.unsafeFlow.2(object0);
    }

    @NotNull
    public static final Flow flowOf(@NotNull Object[] arr_object) {
        return new FlowKt__BuildersKt.flowOf..inlined.unsafeFlow.1(arr_object);
    }

    @NotNull
    public static final Flow flowOn(@NotNull Flow flow0, @NotNull CoroutineContext coroutineContext0) {
        if(coroutineContext0.get(Job.Key) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext0).toString());
        }
        if(!Intrinsics.areEqual(coroutineContext0, EmptyCoroutineContext.INSTANCE)) {
            return flow0 instanceof FusibleFlow ? DefaultImpls.fuse$default(((FusibleFlow)flow0), coroutineContext0, 0, null, 6, null) : new ChannelFlowOperatorImpl(flow0, coroutineContext0, 0, null, 12, null);
        }
        return flow0;
    }

    @Nullable
    public static final Object fold(@NotNull Flow flow0, Object object0, @NotNull Function3 function30, @NotNull Continuation continuation0) {
        return x1.a(flow0, object0, function30, continuation0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'forEach\' is \'collect\'", replaceWith = @ReplaceWith(expression = "collect(action)", imports = {}))
    public static final void forEach(@NotNull Flow flow0, @NotNull Function2 function20) {
        throw a.h();
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return f1.a;
    }

    @FlowPreview
    public static void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
    }

    @Nullable
    public static final Object last(@NotNull Flow flow0, @NotNull Continuation continuation0) {
        ObjectRef ref$ObjectRef1;
        n1 n10;
        if(continuation0 instanceof n1) {
            n10 = (n1)continuation0;
            int v = n10.q;
            if((v & 0x80000000) == 0) {
                n10 = new n1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                n10.q = v ^ 0x80000000;
            }
        }
        else {
            n10 = new n1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = n10.p;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(n10.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ref$ObjectRef0.element = NullSurrogateKt.NULL;
                o1 o10 = new o1(ref$ObjectRef0);
                n10.o = ref$ObjectRef0;
                n10.q = 1;
                if(flow0.collect(o10, n10) == object1) {
                    return object1;
                }
                ref$ObjectRef1 = ref$ObjectRef0;
                break;
            }
            case 1: {
                ref$ObjectRef1 = n10.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object1 = ref$ObjectRef1.element;
        if(object1 == NullSurrogateKt.NULL) {
            throw new NoSuchElementException("Expected at least one element");
        }
        return object1;
    }

    @Nullable
    public static final Object lastOrNull(@NotNull Flow flow0, @NotNull Continuation continuation0) {
        p1 p10;
        if(continuation0 instanceof p1) {
            p10 = (p1)continuation0;
            int v = p10.q;
            if((v & 0x80000000) == 0) {
                p10 = new p1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                p10.q = v ^ 0x80000000;
            }
        }
        else {
            p10 = new p1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = p10.p;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(p10.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                q1 q10 = new q1(ref$ObjectRef0);
                p10.o = ref$ObjectRef0;
                p10.q = 1;
                return flow0.collect(q10, p10) == object1 ? object1 : ref$ObjectRef0.element;
            }
            case 1: {
                ObjectRef ref$ObjectRef1 = p10.o;
                ResultKt.throwOnFailure(object0);
                return ref$ObjectRef1.element;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @NotNull
    public static final Job launchIn(@NotNull Flow flow0, @NotNull CoroutineScope coroutineScope0) {
        return BuildersKt.launch$default(coroutineScope0, null, null, new n(flow0, null), 3, null);
    }

    @NotNull
    public static final Flow map(@NotNull Flow flow0, @NotNull Function2 function20) {
        return new FlowKt__TransformKt.map..inlined.unsafeTransform.1(flow0, function20);
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final Flow mapLatest(@NotNull Flow flow0, @BuilderInference @NotNull Function2 function20) {
        return FlowKt.transformLatest(flow0, new w1(function20, null, 1));
    }

    @NotNull
    public static final Flow mapNotNull(@NotNull Flow flow0, @NotNull Function2 function20) {
        return new FlowKt__TransformKt.mapNotNull..inlined.unsafeTransform.1(flow0, function20);
    }

    @NotNull
    public static final Flow merge(@NotNull Iterable iterable0) {
        return new ChannelLimitedFlowMerge(iterable0, null, 0, null, 14, null);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'merge\' is \'flattenConcat\'", replaceWith = @ReplaceWith(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final Flow merge(@NotNull Flow flow0) {
        throw a.h();
    }

    @NotNull
    public static final Flow merge(@NotNull Flow[] arr_flow) {
        return FlowKt.merge(ArraysKt___ArraysKt.asIterable(arr_flow));
    }

    @NotNull
    public static final Void noImpl() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final Flow observeOn(@NotNull Flow flow0, @NotNull CoroutineContext coroutineContext0) {
        throw a.h();
    }

    @NotNull
    public static final Flow onCompletion(@NotNull Flow flow0, @NotNull Function3 function30) {
        return new FlowKt__EmittersKt.onCompletion..inlined.unsafeFlow.1(flow0, function30);
    }

    @NotNull
    public static final Flow onEach(@NotNull Flow flow0, @NotNull Function2 function20) {
        return new FlowKt__TransformKt.onEach..inlined.unsafeTransform.1(flow0, function20);
    }

    @NotNull
    public static final Flow onEmpty(@NotNull Flow flow0, @NotNull Function2 function20) {
        return new FlowKt__EmittersKt.onEmpty..inlined.unsafeFlow.1(flow0, function20);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { emitAll(fallback) }\'", replaceWith = @ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final Flow onErrorResume(@NotNull Flow flow0, @NotNull Flow flow1) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { emitAll(fallback) }\'", replaceWith = @ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final Flow onErrorResumeNext(@NotNull Flow flow0, @NotNull Flow flow1) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { emit(fallback) }\'", replaceWith = @ReplaceWith(expression = "catch { emit(fallback) }", imports = {}))
    @NotNull
    public static final Flow onErrorReturn(@NotNull Flow flow0, Object object0) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'onErrorXxx\' is \'catch\'. Use \'catch { e -> if (predicate(e)) emit(fallback) else throw e }\'", replaceWith = @ReplaceWith(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @NotNull
    public static final Flow onErrorReturn(@NotNull Flow flow0, Object object0, @NotNull Function1 function10) {
        return FlowKt.catch(flow0, new s4.o1(null, object0, function10));
    }

    public static Flow onErrorReturn$default(Flow flow0, Object object0, Function1 function10, int v, Object object1) {
        if((v & 2) != 0) {
            function10 = j0.y;
        }
        return FlowKt.onErrorReturn(flow0, object0, function10);
    }

    @NotNull
    public static final Flow onStart(@NotNull Flow flow0, @NotNull Function2 function20) {
        return new FlowKt__EmittersKt.onStart..inlined.unsafeFlow.1(function20, flow0);
    }

    @NotNull
    public static final SharedFlow onSubscription(@NotNull SharedFlow sharedFlow0, @NotNull Function2 function20) {
        return new z2(sharedFlow0, function20);
    }

    @NotNull
    public static final ReceiveChannel produceIn(@NotNull Flow flow0, @NotNull CoroutineScope coroutineScope0) {
        return ChannelFlowKt.asChannelFlow(flow0).produceImpl(coroutineScope0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'publish()\' is \'shareIn\'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \npublish().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument.", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final Flow publish(@NotNull Flow flow0) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'publish(bufferSize)\' is \'buffer\' followed by \'shareIn\'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \npublish().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument.", replaceWith = @ReplaceWith(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final Flow publish(@NotNull Flow flow0, int v) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final Flow publishOn(@NotNull Flow flow0, @NotNull CoroutineContext coroutineContext0) {
        throw a.h();
    }

    @NotNull
    public static final Flow receiveAsFlow(@NotNull ReceiveChannel receiveChannel0) {
        return new g(receiveChannel0, false);
    }

    @Nullable
    public static final Object reduce(@NotNull Flow flow0, @NotNull Function3 function30, @NotNull Continuation continuation0) {
        ObjectRef ref$ObjectRef1;
        r1 r10;
        if(continuation0 instanceof r1) {
            r10 = (r1)continuation0;
            int v = r10.q;
            if((v & 0x80000000) == 0) {
                r10 = new r1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                r10.q = v ^ 0x80000000;
            }
        }
        else {
            r10 = new r1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = r10.p;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(r10.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ref$ObjectRef0.element = NullSurrogateKt.NULL;
                t1 t10 = new t1(ref$ObjectRef0, function30);
                r10.o = ref$ObjectRef0;
                r10.q = 1;
                if(flow0.collect(t10, r10) == object1) {
                    return object1;
                }
                ref$ObjectRef1 = ref$ObjectRef0;
                break;
            }
            case 1: {
                ref$ObjectRef1 = r10.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object1 = ref$ObjectRef1.element;
        if(object1 == NullSurrogateKt.NULL) {
            throw new NoSuchElementException("Empty flow can\'t be reduced");
        }
        return object1;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'replay()\' is \'shareIn\' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \nreplay().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument.", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final Flow replay(@NotNull Flow flow0) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'replay(bufferSize)\' is \'shareIn\' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to \'started = SharingStared.Lazily\' argument, \nreplay().refCount() translates to \'started = SharingStared.WhileSubscribed()\' argument.", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @NotNull
    public static final Flow replay(@NotNull Flow flow0, int v) {
        throw a.h();
    }

    @NotNull
    public static final Flow retry(@NotNull Flow flow0, long v, @NotNull Function2 function20) {
        if(v <= 0L) {
            throw new IllegalArgumentException(kotlin.text.q.n(v, "Expected positive amount of retries, but had ").toString());
        }
        return FlowKt.retryWhen(flow0, new t0(v, function20, null));
    }

    public static Flow retry$default(Flow flow0, long v, Function2 function20, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x7FFFFFFFFFFFFFFFL;
        }
        if((v1 & 2) != 0) {
            function20 = new s0(2, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        }
        return FlowKt.retry(flow0, v, function20);
    }

    @NotNull
    public static final Flow retryWhen(@NotNull Flow flow0, @NotNull Function4 function40) {
        return new FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1(flow0, function40);
    }

    @NotNull
    public static final Flow runningFold(@NotNull Flow flow0, Object object0, @BuilderInference @NotNull Function3 function30) {
        return new FlowKt__TransformKt.runningFold..inlined.unsafeFlow.1(object0, flow0, function30);
    }

    @NotNull
    public static final Flow runningReduce(@NotNull Flow flow0, @NotNull Function3 function30) {
        return new FlowKt__TransformKt.runningReduce..inlined.unsafeFlow.1(flow0, function30);
    }

    @FlowPreview
    @NotNull
    public static final Flow sample(@NotNull Flow flow0, long v) {
        if(v <= 0L) {
            throw new IllegalArgumentException("Sample period should be positive");
        }
        return FlowCoroutineKt.scopedFlow(new e0(v, flow0, null));
    }

    @FlowPreview
    @NotNull
    public static final Flow sample-HG0u8IE(@NotNull Flow flow0, long v) {
        return FlowKt.sample(flow0, DelayKt.toDelayMillis-LRDsOJo(v));
    }

    @NotNull
    public static final Flow scan(@NotNull Flow flow0, Object object0, @BuilderInference @NotNull Function3 function30) {
        return FlowKt.runningFold(flow0, object0, function30);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow has less verbose \'scan\' shortcut", replaceWith = @ReplaceWith(expression = "scan(initial, operation)", imports = {}))
    @NotNull
    public static final Flow scanFold(@NotNull Flow flow0, Object object0, @BuilderInference @NotNull Function3 function30) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\'scanReduce\' was renamed to \'runningReduce\' to be consistent with Kotlin standard library", replaceWith = @ReplaceWith(expression = "runningReduce(operation)", imports = {}))
    @NotNull
    public static final Flow scanReduce(@NotNull Flow flow0, @NotNull Function3 function30) {
        return FlowKt.runningReduce(flow0, function30);
    }

    @NotNull
    public static final SharedFlow shareIn(@NotNull Flow flow0, @NotNull CoroutineScope coroutineScope0, @NotNull SharingStarted sharingStarted0, int v) {
        androidx.core.app.y y0 = kotlinx.coroutines.flow.b.a(flow0, v);
        MutableSharedFlow mutableSharedFlow0 = SharedFlowKt.MutableSharedFlow(v, y0.a, ((BufferOverflow)y0.c));
        CoroutineStart coroutineStart0 = Intrinsics.areEqual(sharingStarted0, SharingStarted.Companion.getEagerly()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED;
        kotlinx.coroutines.flow.a a0 = new kotlinx.coroutines.flow.a(sharingStarted0, ((Flow)y0.b), mutableSharedFlow0, SharedFlowKt.NO_VALUE, null);
        return new j2(mutableSharedFlow0, BuildersKt.launch(coroutineScope0, ((CoroutineContext)y0.d), coroutineStart0, a0));
    }

    public static SharedFlow shareIn$default(Flow flow0, CoroutineScope coroutineScope0, SharingStarted sharingStarted0, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        return FlowKt.shareIn(flow0, coroutineScope0, sharingStarted0, v);
    }

    @Nullable
    public static final Object single(@NotNull Flow flow0, @NotNull Continuation continuation0) {
        ObjectRef ref$ObjectRef1;
        u1 u10;
        if(continuation0 instanceof u1) {
            u10 = (u1)continuation0;
            int v = u10.q;
            if((v & 0x80000000) == 0) {
                u10 = new u1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                u10.q = v ^ 0x80000000;
            }
        }
        else {
            u10 = new u1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = u10.p;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(u10.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ref$ObjectRef0.element = NullSurrogateKt.NULL;
                v1 v10 = new v1(ref$ObjectRef0);
                u10.o = ref$ObjectRef0;
                u10.q = 1;
                if(flow0.collect(v10, u10) == object1) {
                    return object1;
                }
                ref$ObjectRef1 = ref$ObjectRef0;
                break;
            }
            case 1: {
                ref$ObjectRef1 = u10.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object1 = ref$ObjectRef1.element;
        if(object1 == NullSurrogateKt.NULL) {
            throw new NoSuchElementException("Flow is empty");
        }
        return object1;
    }

    @Nullable
    public static final Object singleOrNull(@NotNull Flow flow0, @NotNull Continuation continuation0) {
        FlowKt__ReduceKt.singleOrNull..inlined.collectWhile.1 flowKt__ReduceKt$singleOrNull$$inlined$collectWhile$11;
        AbortFlowException abortFlowException1;
        ObjectRef ref$ObjectRef1;
        xf.w1 w10;
        if(continuation0 instanceof xf.w1) {
            w10 = (xf.w1)continuation0;
            int v = w10.r;
            if((v & 0x80000000) == 0) {
                w10 = new xf.w1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                w10.r = v ^ 0x80000000;
            }
        }
        else {
            w10 = new xf.w1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = w10.q;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(w10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ref$ObjectRef0.element = NullSurrogateKt.NULL;
                FlowKt__ReduceKt.singleOrNull..inlined.collectWhile.1 flowKt__ReduceKt$singleOrNull$$inlined$collectWhile$10 = new FlowKt__ReduceKt.singleOrNull..inlined.collectWhile.1(ref$ObjectRef0);
                try {
                    w10.o = ref$ObjectRef0;
                    w10.p = flowKt__ReduceKt$singleOrNull$$inlined$collectWhile$10;
                    w10.r = 1;
                    if(flow0.collect(flowKt__ReduceKt$singleOrNull$$inlined$collectWhile$10, w10) != object1) {
                        return ref$ObjectRef0.element == NullSurrogateKt.NULL ? null : ref$ObjectRef0.element;
                    }
                    return object1;
                }
                catch(AbortFlowException abortFlowException0) {
                    ref$ObjectRef1 = ref$ObjectRef0;
                    abortFlowException1 = abortFlowException0;
                    flowKt__ReduceKt$singleOrNull$$inlined$collectWhile$11 = flowKt__ReduceKt$singleOrNull$$inlined$collectWhile$10;
                    FlowExceptions_commonKt.checkOwnership(abortFlowException1, flowKt__ReduceKt$singleOrNull$$inlined$collectWhile$11);
                    return ref$ObjectRef1.element == NullSurrogateKt.NULL ? null : ref$ObjectRef1.element;
                }
            }
            case 1: {
                try {
                    flowKt__ReduceKt$singleOrNull$$inlined$collectWhile$11 = w10.p;
                    ref$ObjectRef1 = w10.o;
                    ResultKt.throwOnFailure(object0);
                    return ref$ObjectRef1.element == NullSurrogateKt.NULL ? null : ref$ObjectRef1.element;
                }
                catch(AbortFlowException abortFlowException1) {
                }
                FlowExceptions_commonKt.checkOwnership(abortFlowException1, flowKt__ReduceKt$singleOrNull$$inlined$collectWhile$11);
                return ref$ObjectRef1.element == NullSurrogateKt.NULL ? null : ref$ObjectRef1.element;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'skip\' is \'drop\'", replaceWith = @ReplaceWith(expression = "drop(count)", imports = {}))
    @NotNull
    public static final Flow skip(@NotNull Flow flow0, int v) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'startWith\' is \'onStart\'. Use \'onStart { emit(value) }\'", replaceWith = @ReplaceWith(expression = "onStart { emit(value) }", imports = {}))
    @NotNull
    public static final Flow startWith(@NotNull Flow flow0, Object object0) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of \'startWith\' is \'onStart\'. Use \'onStart { emitAll(other) }\'", replaceWith = @ReplaceWith(expression = "onStart { emitAll(other) }", imports = {}))
    @NotNull
    public static final Flow startWith(@NotNull Flow flow0, @NotNull Flow flow1) {
        throw a.h();
    }

    @Nullable
    public static final Object stateIn(@NotNull Flow flow0, @NotNull CoroutineScope coroutineScope0, @NotNull Continuation continuation0) {
        androidx.core.app.y y0 = kotlinx.coroutines.flow.b.a(flow0, 1);
        CompletableDeferred completableDeferred0 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        b2 b20 = new b2(((Flow)y0.b), completableDeferred0, null);
        BuildersKt.launch$default(coroutineScope0, ((CoroutineContext)y0.d), null, b20, 2, null);
        return completableDeferred0.await(continuation0);
    }

    @NotNull
    public static final StateFlow stateIn(@NotNull Flow flow0, @NotNull CoroutineScope coroutineScope0, @NotNull SharingStarted sharingStarted0, Object object0) {
        androidx.core.app.y y0 = kotlinx.coroutines.flow.b.a(flow0, 1);
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(object0);
        CoroutineStart coroutineStart0 = Intrinsics.areEqual(sharingStarted0, SharingStarted.Companion.getEagerly()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED;
        kotlinx.coroutines.flow.a a0 = new kotlinx.coroutines.flow.a(sharingStarted0, ((Flow)y0.b), mutableStateFlow0, object0, null);
        return new k2(mutableStateFlow0, BuildersKt.launch(coroutineScope0, ((CoroutineContext)y0.d), coroutineStart0, a0));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use \'launchIn\' with \'onEach\', \'onCompletion\' and \'catch\' instead")
    public static final void subscribe(@NotNull Flow flow0) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use \'launchIn\' with \'onEach\', \'onCompletion\' and \'catch\' instead")
    public static final void subscribe(@NotNull Flow flow0, @NotNull Function2 function20) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use \'launchIn\' with \'onEach\', \'onCompletion\' and \'catch\' instead")
    public static final void subscribe(@NotNull Flow flow0, @NotNull Function2 function20, @NotNull Function2 function21) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use \'flowOn\' instead")
    @NotNull
    public static final Flow subscribeOn(@NotNull Flow flow0, @NotNull CoroutineContext coroutineContext0) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogues of \'switchMap\' are \'transformLatest\', \'flatMapLatest\' and \'mapLatest\'", replaceWith = @ReplaceWith(expression = "this.flatMapLatest(transform)", imports = {}))
    @NotNull
    public static final Flow switchMap(@NotNull Flow flow0, @NotNull Function2 function20) {
        return FlowKt.transformLatest(flow0, new FlowKt__MigrationKt.switchMap..inlined.flatMapLatest.1(function20, null));
    }

    @NotNull
    public static final Flow take(@NotNull Flow flow0, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " should be positive").toString());
        }
        return new FlowKt__LimitKt.take..inlined.unsafeFlow.1(flow0, v);
    }

    @NotNull
    public static final Flow takeWhile(@NotNull Flow flow0, @NotNull Function2 function20) {
        return new FlowKt__LimitKt.takeWhile..inlined.unsafeFlow.1(flow0, function20);
    }

    @FlowPreview
    @NotNull
    public static final Flow timeout-HG0u8IE(@NotNull Flow flow0, long v) {
        return FlowCoroutineKt.scopedFlow(new h0(v, flow0, null));
    }

    @Nullable
    public static final Object toCollection(@NotNull Flow flow0, @NotNull Collection collection0, @NotNull Continuation continuation0) {
        o o0;
        if(continuation0 instanceof o) {
            o0 = (o)continuation0;
            int v = o0.q;
            if((v & 0x80000000) == 0) {
                o0 = new o(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                o0.q = v ^ 0x80000000;
            }
        }
        else {
            o0 = new o(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = o0.p;
        Collection collection1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(o0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                d0 d00 = new d0(collection0, 14);
                o0.o = collection0;
                o0.q = 1;
                return flow0.collect(d00, o0) == collection1 ? collection1 : collection0;
            }
            case 1: {
                collection0 = o0.o;
                ResultKt.throwOnFailure(object0);
                return collection0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Nullable
    public static final Object toList(@NotNull Flow flow0, @NotNull List list0, @NotNull Continuation continuation0) {
        return FlowKt.toCollection(flow0, list0, continuation0);
    }

    public static Object toList$default(Flow flow0, List list0, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = new ArrayList();
        }
        return FlowKt.toList(flow0, list0, continuation0);
    }

    @Nullable
    public static final Object toSet(@NotNull Flow flow0, @NotNull Set set0, @NotNull Continuation continuation0) {
        return FlowKt.toCollection(flow0, set0, continuation0);
    }

    public static Object toSet$default(Flow flow0, Set set0, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            set0 = new LinkedHashSet();
        }
        return FlowKt.toSet(flow0, set0, continuation0);
    }

    @NotNull
    public static final Flow transform(@NotNull Flow flow0, @BuilderInference @NotNull Function3 function30) {
        return FlowKt.flow(new FlowKt__EmittersKt.transform.1(flow0, function30, null));
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final Flow transformLatest(@NotNull Flow flow0, @BuilderInference @NotNull Function3 function30) {
        return new ChannelFlowTransformLatest(function30, flow0, null, 0, null, 28, null);
    }

    @NotNull
    public static final Flow transformWhile(@NotNull Flow flow0, @BuilderInference @NotNull Function3 function30) {
        return FlowKt.flow(new c1(flow0, function30, null));
    }

    @PublishedApi
    @NotNull
    public static final Flow unsafeTransform(@NotNull Flow flow0, @BuilderInference @NotNull Function3 function30) {
        return new FlowKt__EmittersKt.unsafeTransform..inlined.unsafeFlow.1(flow0, function30);
    }

    @NotNull
    public static final Flow withIndex(@NotNull Flow flow0) {
        return new FlowKt__TransformKt.withIndex..inlined.unsafeFlow.1(flow0);
    }

    @NotNull
    public static final Flow zip(@NotNull Flow flow0, @NotNull Flow flow1, @NotNull Function3 function30) {
        return CombineKt.zipImpl(flow0, flow1, function30);
    }
}

