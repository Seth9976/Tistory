package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008A@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,222:1\n*E\n"})
public final class FlowKt__EmittersKt.transform.1 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Flow q;
    public final Function3 r;

    public FlowKt__EmittersKt.transform.1(Flow flow0, Function3 function30, Continuation continuation0) {
        this.q = flow0;
        this.r = function30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
        Continuation continuation1 = new FlowKt__EmittersKt.transform.1(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((FlowCollector)object0), ((Continuation)object1));
    }

    @Nullable
    public final Object invoke(@NotNull FlowCollector flowCollector0, @Nullable Continuation continuation0) {
        return ((FlowKt__EmittersKt.transform.1)this.create(flowCollector0, continuation0)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                kotlinx.coroutines.flow.FlowKt__EmittersKt.transform.1.1 flowKt__EmittersKt$transform$1$10 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        kotlinx.coroutines.flow.FlowKt__EmittersKt.transform.1.1.emit.1 flowKt__EmittersKt$transform$1$1$emit$10;
                        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt.transform.1.1.emit.1) {
                            flowKt__EmittersKt$transform$1$1$emit$10 = (kotlinx.coroutines.flow.FlowKt__EmittersKt.transform.1.1.emit.1)continuation0;
                            int v = flowKt__EmittersKt$transform$1$1$emit$10.q;
                            if((v & 0x80000000) == 0) {
                                flowKt__EmittersKt$transform$1$1$emit$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object o;
                                    public int q;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.o = object0;
                                        this.q |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                flowKt__EmittersKt$transform$1$1$emit$10.q = v ^ 0x80000000;
                            }
                        }
                        else {
                            flowKt__EmittersKt$transform$1$1$emit$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object o;
                                public int q;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.o = object0;
                                    this.q |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = flowKt__EmittersKt$transform$1$1$emit$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(flowKt__EmittersKt$transform$1$1$emit$10.q) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                flowKt__EmittersKt$transform$1$1$emit$10.q = 1;
                                return ((FlowCollector)this.p).invoke(this.b, object0, flowKt__EmittersKt$transform$1$1$emit$10) == object2 ? object2 : Unit.INSTANCE;
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
                        new kotlinx.coroutines.flow.FlowKt__EmittersKt.transform.1.1.emit.1(this, continuation0);
                        ((FlowCollector)this.p).invoke(this.b, object0, continuation0);
                        return Unit.INSTANCE;
                    }
                };
                this.o = 1;
                return this.q.collect(flowKt__EmittersKt$transform$1$10, this) == object1 ? object1 : Unit.INSTANCE;
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
        kotlinx.coroutines.flow.FlowKt__EmittersKt.transform.1.1 flowKt__EmittersKt$transform$1$10 = new kotlinx.coroutines.flow.FlowKt__EmittersKt.transform.1.1(this.r, ((FlowCollector)this.p));
        this.q.collect(flowKt__EmittersKt$transform$1$10, this);
        return Unit.INSTANCE;
    }
}

