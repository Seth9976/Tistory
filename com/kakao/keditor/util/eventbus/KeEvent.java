package com.kakao.keditor.util.eventbus;

import com.kakao.keditor.request.KeditorRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
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
import qd.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000E\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fJ\u0017\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\u000F0\u000E\"\u0006\b\u0000\u0010\u000F\u0018\u0001H\u0086\bR\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/kakao/keditor/util/eventbus/KeEvent;", "", "()V", "events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "mutableEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getMutableEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "postInScope", "", "event", "Lcom/kakao/keditor/request/KeditorRequest;", "subscribe", "Lkotlinx/coroutines/flow/Flow;", "T", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeEvent.kt\ncom/kakao/keditor/util/eventbus/KeEvent\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,30:1\n21#2:31\n23#2:35\n53#2,3:36\n50#3:32\n55#3:34\n106#4:33\n*S KotlinDebug\n*F\n+ 1 KeEvent.kt\ncom/kakao/keditor/util/eventbus/KeEvent\n*L\n28#1:31\n28#1:35\n28#1:36,3\n28#1:32\n28#1:34\n28#1:33\n*E\n"})
public final class KeEvent {
    @NotNull
    public static final KeEvent INSTANCE;
    @NotNull
    private static final MutableSharedFlow events;
    @NotNull
    private static final SharedFlow mutableEvents;

    static {
        KeEvent.INSTANCE = new KeEvent();
        MutableSharedFlow mutableSharedFlow0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        KeEvent.events = mutableSharedFlow0;
        KeEvent.mutableEvents = FlowKt.asSharedFlow(mutableSharedFlow0);
    }

    @NotNull
    public final SharedFlow getMutableEvents() {
        return KeEvent.mutableEvents;
    }

    public final void postInScope(@NotNull KeditorRequest keditorRequest0) {
        Intrinsics.checkNotNullParameter(keditorRequest0, "event");
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new Function2(null) {
            final KeditorRequest $event;
            int label;

            {
                this.$event = keditorRequest0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                return new com.kakao.keditor.util.eventbus.KeEvent.postInScope.1(this.$event, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                return ((com.kakao.keditor.util.eventbus.KeEvent.postInScope.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        this.label = 1;
                        return KeEvent.events.emit(this.$event, this) == object1 ? object1 : Unit.INSTANCE;
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
        }, 3, null);
    }

    public final Flow subscribe() {
        Intrinsics.needClassReification();
        com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1 keEvent$subscribe$$inlined$filter$10 = new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                Intrinsics.needClassReification();
                com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1.2 keEvent$subscribe$$inlined$filter$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1.2.1 keEvent$subscribe$$inlined$filter$1$2$10;
                        if(continuation0 instanceof com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1.2.1) {
                            keEvent$subscribe$$inlined$filter$1$2$10 = (com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1.2.1)continuation0;
                            int v = keEvent$subscribe$$inlined$filter$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                keEvent$subscribe$$inlined$filter$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    Object L$0;
                                    Object L$1;
                                    int label;
                                    Object result;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.result = object0;
                                        this.label |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                keEvent$subscribe$$inlined$filter$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            keEvent$subscribe$$inlined$filter$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                Object L$0;
                                Object L$1;
                                int label;
                                Object result;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.result = object0;
                                    this.label |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = keEvent$subscribe$$inlined$filter$1$2$10.result;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(keEvent$subscribe$$inlined$filter$1$2$10.label) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                FlowCollector flowCollector0 = this.$this_unsafeFlow;
                                Intrinsics.reifiedOperationMarker(3, "T");
                                if(object0 != null) {
                                    keEvent$subscribe$$inlined$filter$1$2$10.label = 1;
                                    if(flowCollector0.emit(object0, keEvent$subscribe$$inlined$filter$1$2$10) == object2) {
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
                        new com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1.2.1(this, continuation0);
                        FlowCollector flowCollector0 = this.$this_unsafeFlow;
                        Intrinsics.reifiedOperationMarker(3, "T");
                        if(object0 != null) {
                            flowCollector0.emit(object0, continuation0);
                        }
                        return Unit.INSTANCE;
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(keEvent$subscribe$$inlined$filter$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 0xB0)
                @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
                public final class com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1.1 extends ContinuationImpl {
                    int label;
                    Object result;

                    public com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1.1(com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1 keEvent$subscribe$$inlined$filter$10, Continuation continuation0) {
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1.this.collect(null, this);
                    }
                }

            }

            @Nullable
            public Object collect$$forInline(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                new com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1.1(this, continuation0);
                Intrinsics.needClassReification();
                com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1.2 keEvent$subscribe$$inlined$filter$1$20 = new com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.filter.1.2(flowCollector0);
                this.$this_unsafeTransform$inlined.collect(keEvent$subscribe$$inlined$filter$1$20, continuation0);
                return Unit.INSTANCE;
            }
        };
        Intrinsics.needClassReification();
        return new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                Intrinsics.needClassReification();
                com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.map.1.2 keEvent$subscribe$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.map.1.2.1 keEvent$subscribe$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.map.1.2.1) {
                            keEvent$subscribe$$inlined$map$1$2$10 = (com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.map.1.2.1)continuation0;
                            int v = keEvent$subscribe$$inlined$map$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                keEvent$subscribe$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    Object L$0;
                                    int label;
                                    Object result;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.result = object0;
                                        this.label |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                keEvent$subscribe$$inlined$map$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            keEvent$subscribe$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                Object L$0;
                                int label;
                                Object result;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.result = object0;
                                    this.label |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = keEvent$subscribe$$inlined$map$1$2$10.result;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(keEvent$subscribe$$inlined$map$1$2$10.label) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                Intrinsics.reifiedOperationMarker(1, "T");
                                keEvent$subscribe$$inlined$map$1$2$10.label = 1;
                                return this.$this_unsafeFlow.emit(object0, keEvent$subscribe$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                        new com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.map.1.2.1(this, continuation0);
                        Intrinsics.reifiedOperationMarker(1, "T");
                        this.$this_unsafeFlow.emit(object0, continuation0);
                        return Unit.INSTANCE;
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(keEvent$subscribe$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 0xB0)
                @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
                public final class com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.map.1.1 extends ContinuationImpl {
                    int label;
                    Object result;

                    public com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.map.1.1(com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.map.1 keEvent$subscribe$$inlined$map$10, Continuation continuation0) {
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.map.1.this.collect(null, this);
                    }
                }

            }

            @Nullable
            public Object collect$$forInline(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                new com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.map.1.1(this, continuation0);
                Intrinsics.needClassReification();
                com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.map.1.2 keEvent$subscribe$$inlined$map$1$20 = new com.kakao.keditor.util.eventbus.KeEvent.subscribe..inlined.map.1.2(flowCollector0);
                this.$this_unsafeTransform$inlined.collect(keEvent$subscribe$$inlined$map$1$20, continuation0);
                return Unit.INSTANCE;
            }
        };
    }
}

