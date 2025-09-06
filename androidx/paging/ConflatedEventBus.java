package androidx.paging;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00028\u0000¢\u0006\u0004\b\b\u0010\u0005R\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Landroidx/paging/ConflatedEventBus;", "", "T", "initialValue", "<init>", "(Ljava/lang/Object;)V", "data", "", "send", "Lkotlinx/coroutines/flow/Flow;", "b", "Lkotlinx/coroutines/flow/Flow;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", "flow", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConflatedEventBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedEventBus.kt\nandroidx/paging/ConflatedEventBus\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,36:1\n60#2:37\n63#2:41\n50#3:38\n55#3:40\n107#4:39\n*S KotlinDebug\n*F\n+ 1 ConflatedEventBus.kt\nandroidx/paging/ConflatedEventBus\n*L\n30#1:37\n30#1:41\n30#1:38\n30#1:40\n30#1:39\n*E\n"})
public final class ConflatedEventBus {
    public final MutableStateFlow a;
    public final androidx.paging.ConflatedEventBus.special..inlined.mapNotNull.1 b;

    public ConflatedEventBus() {
        this(null, 1, null);
    }

    public ConflatedEventBus(@Nullable Object object0) {
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(new Pair(0x80000000, object0));
        this.a = mutableStateFlow0;
        this.b = new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                androidx.paging.ConflatedEventBus.special..inlined.mapNotNull.1.2 conflatedEventBus$special$$inlined$mapNotNull$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        androidx.paging.ConflatedEventBus.special..inlined.mapNotNull.1.2.1 conflatedEventBus$special$$inlined$mapNotNull$1$2$10;
                        if(continuation0 instanceof androidx.paging.ConflatedEventBus.special..inlined.mapNotNull.1.2.1) {
                            conflatedEventBus$special$$inlined$mapNotNull$1$2$10 = (androidx.paging.ConflatedEventBus.special..inlined.mapNotNull.1.2.1)continuation0;
                            int v = conflatedEventBus$special$$inlined$mapNotNull$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                conflatedEventBus$special$$inlined$mapNotNull$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                conflatedEventBus$special$$inlined$mapNotNull$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            conflatedEventBus$special$$inlined$mapNotNull$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = conflatedEventBus$special$$inlined$mapNotNull$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(conflatedEventBus$special$$inlined$mapNotNull$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                Object object3 = ((Pair)object0).getSecond();
                                if(object3 != null) {
                                    conflatedEventBus$special$$inlined$mapNotNull$1$2$10.p = 1;
                                    if(this.a.emit(object3, conflatedEventBus$special$$inlined$mapNotNull$1$2$10) == object2) {
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
                Object object0 = this.a.collect(conflatedEventBus$special$$inlined$mapNotNull$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        };
    }

    public ConflatedEventBus(Object object0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            object0 = null;
        }
        this(object0);
    }

    @NotNull
    public final Flow getFlow() {
        return this.b;
    }

    public final void send(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "data");
        Pair pair0 = new Pair(((int)(((Number)((Pair)this.a.getValue()).getFirst()).intValue() + 1)), object0);
        this.a.setValue(pair0);
    }
}

