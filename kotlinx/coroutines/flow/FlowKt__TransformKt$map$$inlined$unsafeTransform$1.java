package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 8, 0}, xi = 0xB0)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
public final class FlowKt__TransformKt.map..inlined.unsafeTransform.1 implements Flow {
    public final Flow a;
    public final Function2 b;

    public FlowKt__TransformKt.map..inlined.unsafeTransform.1(Flow flow0, Function2 function20) {
        this.a = flow0;
        this.b = function20;
        super();
    }

    @Override  // kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        kotlinx.coroutines.flow.FlowKt__TransformKt.map..inlined.unsafeTransform.1.2 flowKt__TransformKt$map$$inlined$unsafeTransform$1$20 = new FlowCollector() {
            @Override  // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(Object object0, @NotNull Continuation continuation0) {
                FlowCollector flowCollector1;
                kotlinx.coroutines.flow.FlowKt__TransformKt.map..inlined.unsafeTransform.1.2.1 flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10;
                if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt.map..inlined.unsafeTransform.1.2.1) {
                    flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10 = (kotlinx.coroutines.flow.FlowKt__TransformKt.map..inlined.unsafeTransform.1.2.1)continuation0;
                    int v = flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10.p;
                    if((v & 0x80000000) == 0) {
                        flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                            public Object o;
                            public int p;
                            public FlowCollector r;

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
                        flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10.p = v ^ 0x80000000;
                    }
                }
                else {
                    flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                        public Object o;
                        public int p;
                        public FlowCollector r;

                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object object0) {
                            this.o = object0;
                            this.p |= 0x80000000;
                            return continuation0.emit(null, this);
                        }
                    };
                }
                Object object1 = flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10.o;
                Object object2 = a.getCOROUTINE_SUSPENDED();
                switch(flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10.p) {
                    case 0: {
                        ResultKt.throwOnFailure(object1);
                        FlowCollector flowCollector0 = this.b;
                        flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10.r = flowCollector0;
                        flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10.p = 1;
                        Object object3 = this.b.invoke(object0, flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10);
                        if(object3 == object2) {
                            return object2;
                        }
                        object1 = object3;
                        flowCollector1 = flowCollector0;
                        break;
                    }
                    case 1: {
                        flowCollector1 = flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10.r;
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
                flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10.r = null;
                flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10.p = 2;
                return flowCollector1.emit(object1, flowKt__TransformKt$map$$inlined$unsafeTransform$1$2$10) == object2 ? object2 : Unit.INSTANCE;
            }

            @Nullable
            public final Object emit$$forInline(Object object0, @NotNull Continuation continuation0) {
                new kotlinx.coroutines.flow.FlowKt__TransformKt.map..inlined.unsafeTransform.1.2.1(this, continuation0);
                Object object1 = this.b.invoke(object0, continuation0);
                this.b.emit(object1, continuation0);
                return Unit.INSTANCE;
            }
        };
        Object object0 = this.a.collect(flowKt__TransformKt$map$$inlined$unsafeTransform$1$20, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public final class kotlinx.coroutines.flow.FlowKt__TransformKt.map..inlined.unsafeTransform.1.1 extends ContinuationImpl {
            public Object o;

            public kotlinx.coroutines.flow.FlowKt__TransformKt.map..inlined.unsafeTransform.1.1(FlowKt__TransformKt.map..inlined.unsafeTransform.1 flowKt__TransformKt$map$$inlined$unsafeTransform$10, Continuation continuation0) {
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                this.o = object0;
                return this.p.collect(null, this);
            }
        }

    }

    @Nullable
    public Object collect$$forInline(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        new kotlinx.coroutines.flow.FlowKt__TransformKt.map..inlined.unsafeTransform.1.1(this, continuation0);
        kotlinx.coroutines.flow.FlowKt__TransformKt.map..inlined.unsafeTransform.1.2 flowKt__TransformKt$map$$inlined$unsafeTransform$1$20 = new kotlinx.coroutines.flow.FlowKt__TransformKt.map..inlined.unsafeTransform.1.2(flowCollector0, this.b);
        this.a.collect(flowKt__TransformKt$map$$inlined$unsafeTransform$1$20, continuation0);
        return Unit.INSTANCE;
    }
}

