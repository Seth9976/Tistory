package androidx.paging;

import androidx.annotation.CheckResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.e0;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A6\u0010\u0000\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0006H\u0007\u001AB\u0010\u0000\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0000¨\u0006\t"}, d2 = {"cachedIn", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "T", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "tracker", "Landroidx/paging/ActiveFlowTracker;", "paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCachedPagingData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPagingData.kt\nandroidx/paging/CachedPagingDataKt\n+ 2 FlowExt.kt\nandroidx/paging/FlowExtKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,134:1\n105#2:135\n53#3:136\n55#3:140\n50#4:137\n55#4:139\n107#5:138\n*S KotlinDebug\n*F\n+ 1 CachedPagingData.kt\nandroidx/paging/CachedPagingDataKt\n*L\n97#1:135\n106#1:136\n106#1:140\n106#1:137\n106#1:139\n106#1:138\n*E\n"})
public final class CachedPagingDataKt {
    @CheckResult
    @NotNull
    public static final Flow cachedIn(@NotNull Flow flow0, @NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        return CachedPagingDataKt.cachedIn(flow0, coroutineScope0, null);
    }

    @NotNull
    public static final Flow cachedIn(@NotNull Flow flow0, @NotNull CoroutineScope coroutineScope0, @Nullable ActiveFlowTracker activeFlowTracker0) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        return FlowKt.shareIn(FlowKt.onCompletion(FlowKt.onStart(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                androidx.paging.CachedPagingDataKt.cachedIn..inlined.map.1.2 cachedPagingDataKt$cachedIn$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        androidx.paging.CachedPagingDataKt.cachedIn..inlined.map.1.2.1 cachedPagingDataKt$cachedIn$$inlined$map$1$2$10;
                        if(continuation0 instanceof androidx.paging.CachedPagingDataKt.cachedIn..inlined.map.1.2.1) {
                            cachedPagingDataKt$cachedIn$$inlined$map$1$2$10 = (androidx.paging.CachedPagingDataKt.cachedIn..inlined.map.1.2.1)continuation0;
                            int v = cachedPagingDataKt$cachedIn$$inlined$map$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                cachedPagingDataKt$cachedIn$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object o;
                                    public int p;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.o = object0;
                                        this.p |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                cachedPagingDataKt$cachedIn$$inlined$map$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            cachedPagingDataKt$cachedIn$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object o;
                                public int p;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.o = object0;
                                    this.p |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = cachedPagingDataKt$cachedIn$$inlined$map$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(cachedPagingDataKt$cachedIn$$inlined$map$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                ((e0)object0).getClass();
                                PagingData pagingData0 = new PagingData(FlowKt.onCompletion(FlowKt.onStart(((e0)object0).d.getDownstreamFlow(), new x(((e0)object0), null)), new y(((e0)object0), null)), ((e0)object0).b.getUiReceiver$paging_common_release(), ((e0)object0).b.getHintReceiver$paging_common_release(), new z(((e0)object0)));
                                cachedPagingDataKt$cachedIn$$inlined$map$1$2$10.p = 1;
                                return this.a.emit(pagingData0, cachedPagingDataKt$cachedIn$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = FlowExtKt.simpleRunningReduce(FlowExtKt.simpleTransformLatest(flow0, new androidx.paging.CachedPagingDataKt.cachedIn..inlined.simpleMapLatest.1(null, coroutineScope0, activeFlowTracker0)), new p0.z(3, null)).collect(cachedPagingDataKt$cachedIn$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, new g(activeFlowTracker0, null)), new h(activeFlowTracker0, null)), coroutineScope0, SharingStarted.Companion.getLazily(), 1);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001A\u0002H\u0002H\u008A@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "androidx/paging/FlowExtKt$simpleMapLatest$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleMapLatest$1\n+ 2 CachedPagingData.kt\nandroidx/paging/CachedPagingDataKt\n*L\n1#1,224:1\n98#2,4:225\n*E\n"})
        public final class androidx.paging.CachedPagingDataKt.cachedIn..inlined.simpleMapLatest.1 extends SuspendLambda implements Function3 {
            public int o;
            public FlowCollector p;
            public Object q;
            public final CoroutineScope r;
            public final ActiveFlowTracker s;

            public androidx.paging.CachedPagingDataKt.cachedIn..inlined.simpleMapLatest.1(Continuation continuation0, CoroutineScope coroutineScope0, ActiveFlowTracker activeFlowTracker0) {
                this.r = coroutineScope0;
                this.s = activeFlowTracker0;
                super(3, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((FlowCollector)object0), object1, ((Continuation)object2));
            }

            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector0, Object object0, @Nullable Continuation continuation0) {
                androidx.paging.CachedPagingDataKt.cachedIn..inlined.simpleMapLatest.1 cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$10 = new androidx.paging.CachedPagingDataKt.cachedIn..inlined.simpleMapLatest.1(continuation0, this.r, this.s);
                cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$10.p = flowCollector0;
                cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$10.q = object0;
                return cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$10.invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(this.o) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        FlowCollector flowCollector0 = this.p;
                        e0 e00 = new e0(this.r, ((PagingData)this.q), this.s);
                        this.o = 1;
                        return flowCollector0.emit(e00, this) == object1 ? object1 : Unit.INSTANCE;
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

    }

    public static Flow cachedIn$default(Flow flow0, CoroutineScope coroutineScope0, ActiveFlowTracker activeFlowTracker0, int v, Object object0) {
        if((v & 2) != 0) {
            activeFlowTracker0 = null;
        }
        return CachedPagingDataKt.cachedIn(flow0, coroutineScope0, activeFlowTracker0);
    }
}

