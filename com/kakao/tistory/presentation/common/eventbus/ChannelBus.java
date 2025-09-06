package com.kakao.tistory.presentation.common.eventbus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\n\u001A\u00020\u0004\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00022\u0014\b\u0004\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\bH\u0086H¢\u0006\u0004\b\n\u0010\u000BJH\u0010\n\u001A\u00020\u00042\"\u0010\u000E\u001A\u0012\u0012\u000E\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\r0\f\"\n\u0012\u0006\b\u0001\u0012\u00020\u00020\r2\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\bH\u0086@¢\u0006\u0004\b\n\u0010\u000FR\u001D\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/common/eventbus/ChannelBus;", "", "Lcom/kakao/tistory/presentation/common/eventbus/TistoryEventBus;", "brunchEventBus", "", "send", "(Lcom/kakao/tistory/presentation/common/eventbus/TistoryEventBus;)V", "T", "Lkotlin/Function1;", "function", "subscribe", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Ljava/lang/Class;", "clazz", "([Ljava/lang/Class;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/SharedFlow;", "b", "Lkotlinx/coroutines/flow/SharedFlow;", "getSharedFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "sharedFlow", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChannelBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelBus.kt\ncom/kakao/tistory/presentation/common/eventbus/ChannelBus\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,39:1\n36#2:40\n21#2:41\n23#2:45\n21#2:46\n23#2:50\n50#3:42\n55#3:44\n50#3:47\n55#3:49\n107#4:43\n107#4:48\n*S KotlinDebug\n*F\n+ 1 ChannelBus.kt\ncom/kakao/tistory/presentation/common/eventbus/ChannelBus\n*L\n26#1:40\n26#1:41\n26#1:45\n35#1:46\n35#1:50\n26#1:42\n26#1:44\n35#1:47\n35#1:49\n26#1:43\n35#1:48\n*E\n"})
public final class ChannelBus {
    public static final int $stable;
    @NotNull
    public static final ChannelBus INSTANCE;
    public static final MutableSharedFlow a;
    public static final SharedFlow b;

    static {
        ChannelBus.INSTANCE = new ChannelBus();
        MutableSharedFlow mutableSharedFlow0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        ChannelBus.a = mutableSharedFlow0;
        ChannelBus.b = FlowKt.asSharedFlow(mutableSharedFlow0);
        ChannelBus.$stable = 8;
    }

    @NotNull
    public final SharedFlow getSharedFlow() {
        return ChannelBus.b;
    }

    public final void send(@NotNull TistoryEventBus tistoryEventBus0) {
        Intrinsics.checkNotNullParameter(tistoryEventBus0, "brunchEventBus");
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new a(tistoryEventBus0, null), 3, null);
    }

    public final Object subscribe(Function1 function10, Continuation continuation0) {
        Intrinsics.needClassReification();
        new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                Intrinsics.needClassReification();
                com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filterIsInstance.1.2 channelBus$subscribe$$inlined$filterIsInstance$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filterIsInstance.1.2.1 channelBus$subscribe$$inlined$filterIsInstance$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filterIsInstance.1.2.1) {
                            channelBus$subscribe$$inlined$filterIsInstance$1$2$10 = (com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filterIsInstance.1.2.1)continuation0;
                            int v = channelBus$subscribe$$inlined$filterIsInstance$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                channelBus$subscribe$$inlined$filterIsInstance$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object a;
                                    public int b;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.a = object0;
                                        this.b |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                channelBus$subscribe$$inlined$filterIsInstance$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            channelBus$subscribe$$inlined$filterIsInstance$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object a;
                                public int b;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.a = object0;
                                    this.b |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = channelBus$subscribe$$inlined$filterIsInstance$1$2$10.a;
                        Object object2 = qd.a.getCOROUTINE_SUSPENDED();
                        switch(channelBus$subscribe$$inlined$filterIsInstance$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                FlowCollector flowCollector0 = this.a;
                                Intrinsics.reifiedOperationMarker(3, "T");
                                if(object0 != null) {
                                    channelBus$subscribe$$inlined$filterIsInstance$1$2$10.b = 1;
                                    if(flowCollector0.emit(object0, channelBus$subscribe$$inlined$filterIsInstance$1$2$10) == object2) {
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

                    @Nullable
                    public final Object emit$$forInline(Object object0, @NotNull Continuation continuation0) {
                        new com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filterIsInstance.1.2.1(this, continuation0);
                        FlowCollector flowCollector0 = this.a;
                        Intrinsics.reifiedOperationMarker(3, "T");
                        if(object0 != null) {
                            flowCollector0.emit(object0, continuation0);
                        }
                        return Unit.INSTANCE;
                    }
                };
                Object object0 = this.a.collect(channelBus$subscribe$$inlined$filterIsInstance$1$20, continuation0);
                return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 0xB0)
                @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
                public final class com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filterIsInstance.1.1 extends ContinuationImpl {
                    public Object a;

                    public com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filterIsInstance.1.1(com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filterIsInstance.1 channelBus$subscribe$$inlined$filterIsInstance$10, Continuation continuation0) {
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        this.a = object0;
                        return this.b.collect(null, this);
                    }
                }

            }

            @Nullable
            public Object collect$$forInline(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                new com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filterIsInstance.1.1(this, continuation0);
                Intrinsics.needClassReification();
                com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filterIsInstance.1.2 channelBus$subscribe$$inlined$filterIsInstance$1$20 = new com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filterIsInstance.1.2(flowCollector0);
                this.a.collect(channelBus$subscribe$$inlined$filterIsInstance$1$20, continuation0);
                return Unit.INSTANCE;
            }
        }.collect(new FlowCollector() {
            @Nullable
            public final Object emit(@NotNull TistoryEventBus tistoryEventBus0, @NotNull Continuation continuation0) {
                this.a.invoke(tistoryEventBus0);
                return Unit.INSTANCE;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 0xB0)
                @SourceDebugExtension({"SMAP\nChannelBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelBus.kt\ncom/kakao/tistory/presentation/common/eventbus/ChannelBus$subscribe$2$emit$1\n*L\n1#1,39:1\n*E\n"})
                public final class com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe.2.emit.1 extends ContinuationImpl {
                    public Object a;

                    public com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe.2.emit.1(com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe.2 channelBus$subscribe$20, Continuation continuation0) {
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        this.a = object0;
                        return this.b.emit(null, this);
                    }
                }

            }

            @Override  // kotlinx.coroutines.flow.FlowCollector
            public Object emit(Object object0, Continuation continuation0) {
                return this.emit(((TistoryEventBus)object0), continuation0);
            }

            @Nullable
            public final Object emit$$forInline(@NotNull TistoryEventBus tistoryEventBus0, @NotNull Continuation continuation0) {
                new com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe.2.emit.1(this, continuation0);
                this.a.invoke(tistoryEventBus0);
                return Unit.INSTANCE;
            }
        }, continuation0);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object subscribe(@NotNull Class[] arr_class, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        Object object0 = new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filter.1.2 channelBus$subscribe$$inlined$filter$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filter.1.2.1 channelBus$subscribe$$inlined$filter$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filter.1.2.1) {
                            channelBus$subscribe$$inlined$filter$1$2$10 = (com.kakao.tistory.presentation.common.eventbus.ChannelBus.subscribe..inlined.filter.1.2.1)continuation0;
                            int v = channelBus$subscribe$$inlined$filter$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                channelBus$subscribe$$inlined$filter$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object a;
                                    public int b;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.a = object0;
                                        this.b |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                channelBus$subscribe$$inlined$filter$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            channelBus$subscribe$$inlined$filter$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object a;
                                public int b;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.a = object0;
                                    this.b |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = channelBus$subscribe$$inlined$filter$1$2$10.a;
                        Object object2 = qd.a.getCOROUTINE_SUSPENDED();
                        switch(channelBus$subscribe$$inlined$filter$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                FlowCollector flowCollector0 = this.b;
                                Class class0 = ((TistoryEventBus)object0).getClass();
                                if(ArraysKt___ArraysKt.contains(this.b, class0)) {
                                    channelBus$subscribe$$inlined$filter$1$2$10.b = 1;
                                    if(flowCollector0.emit(object0, channelBus$subscribe$$inlined$filter$1$2$10) == object2) {
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
                Object object0 = arr_class.collect(channelBus$subscribe$$inlined$filter$1$20, continuation0);
                return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }.collect(new b(function10), continuation0);
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

