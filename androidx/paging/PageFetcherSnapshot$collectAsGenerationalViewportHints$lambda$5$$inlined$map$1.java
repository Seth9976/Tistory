package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
public final class PageFetcherSnapshot.collectAsGenerationalViewportHints.lambda.5..inlined.map.1 implements Flow {
    public final Flow a;
    public final int b;

    public PageFetcherSnapshot.collectAsGenerationalViewportHints.lambda.5..inlined.map.1(Flow flow0, int v) {
        this.a = flow0;
        this.b = v;
        super();
    }

    @Override  // kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        androidx.paging.PageFetcherSnapshot.collectAsGenerationalViewportHints.lambda.5..inlined.map.1.2 pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$20 = new FlowCollector() {
            @Override  // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(Object object0, @NotNull Continuation continuation0) {
                androidx.paging.PageFetcherSnapshot.collectAsGenerationalViewportHints.lambda.5..inlined.map.1.2.1 pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$10;
                if(continuation0 instanceof androidx.paging.PageFetcherSnapshot.collectAsGenerationalViewportHints.lambda.5..inlined.map.1.2.1) {
                    pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$10 = (androidx.paging.PageFetcherSnapshot.collectAsGenerationalViewportHints.lambda.5..inlined.map.1.2.1)continuation0;
                    int v = pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$10.p;
                    if((v & 0x80000000) == 0) {
                        pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$10.p = v ^ 0x80000000;
                    }
                }
                else {
                    pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                Object object1 = pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$10.o;
                Object object2 = a.getCOROUTINE_SUSPENDED();
                switch(pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$10.p) {
                    case 0: {
                        ResultKt.throwOnFailure(object1);
                        GenerationalViewportHint generationalViewportHint0 = new GenerationalViewportHint(this.b, ((ViewportHint)object0));
                        pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$10.p = 1;
                        return this.b.emit(generationalViewportHint0, pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
        Object object0 = this.a.collect(pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$20, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

