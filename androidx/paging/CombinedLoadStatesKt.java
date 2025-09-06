package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001F\u0010\u0000\u001A\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0086@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"awaitNotLoading", "Landroidx/paging/CombinedLoadStates;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCombinedLoadStates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStatesKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,161:1\n21#2:162\n23#2:166\n50#3:163\n55#3:165\n107#4:164\n*S KotlinDebug\n*F\n+ 1 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStatesKt\n*L\n157#1:162\n157#1:166\n157#1:163\n157#1:165\n157#1:164\n*E\n"})
public final class CombinedLoadStatesKt {
    @Nullable
    public static final Object awaitNotLoading(@NotNull Flow flow0, @NotNull Continuation continuation0) {
        return FlowKt.firstOrNull(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                androidx.paging.CombinedLoadStatesKt.awaitNotLoading..inlined.filter.1.2 combinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        androidx.paging.CombinedLoadStatesKt.awaitNotLoading..inlined.filter.1.2.1 combinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$10;
                        if(continuation0 instanceof androidx.paging.CombinedLoadStatesKt.awaitNotLoading..inlined.filter.1.2.1) {
                            combinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$10 = (androidx.paging.CombinedLoadStatesKt.awaitNotLoading..inlined.filter.1.2.1)continuation0;
                            int v = combinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                combinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                combinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            combinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = combinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(combinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                if(((CombinedLoadStates)object0).isIdle() || ((CombinedLoadStates)object0).hasError()) {
                                    combinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$10.p = 1;
                                    if(this.a.emit(object0, combinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$10) == object2) {
                                        return object2;
                                    }
                                }
                                return Unit.INSTANCE;
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
                Object object0 = FlowKt.debounce(flow0, 1L).collect(combinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, continuation0);
    }
}

