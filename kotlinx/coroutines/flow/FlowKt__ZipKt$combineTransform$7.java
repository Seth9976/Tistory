package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001A\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008A@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$7\n*L\n1#1,332:1\n*E\n"})
public final class FlowKt__ZipKt.combineTransform.7 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Flow[] q;
    public final Function3 r;

    public FlowKt__ZipKt.combineTransform.7(Flow[] arr_flow, Function3 function30, Continuation continuation0) {
        this.q = arr_flow;
        this.r = function30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
        Continuation continuation1 = new FlowKt__ZipKt.combineTransform.7(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((FlowCollector)object0), ((Continuation)object1));
    }

    @Nullable
    public final Object invoke(@NotNull FlowCollector flowCollector0, @Nullable Continuation continuation0) {
        return ((FlowKt__ZipKt.combineTransform.7)this.create(flowCollector0, continuation0)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FlowCollector flowCollector0 = (FlowCollector)this.p;
                Intrinsics.needClassReification();
                kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform.7.1 flowKt__ZipKt$combineTransform$7$10 = new Function0() {
                    public final Flow[] w;

                    {
                        this.w = arr_flow;
                        super(0);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        return this.invoke();
                    }

                    @Nullable
                    public final Object[] invoke() {
                        Intrinsics.reifiedOperationMarker(0, "T?");
                        return new Object[this.w.length];
                    }
                };
                Intrinsics.needClassReification();
                kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform.7.2 flowKt__ZipKt$combineTransform$7$20 = new Function3(null) {
                    public int o;
                    public FlowCollector p;
                    public Object[] q;
                    public final Function3 r;

                    {
                        this.r = function30;
                        super(3, continuation0);
                    }

                    @Override  // kotlin.jvm.functions.Function3
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.invoke(((FlowCollector)object0), ((Object[])object1), ((Continuation)object2));
                    }

                    @Nullable
                    public final Object invoke(@NotNull FlowCollector flowCollector0, @NotNull Object[] arr_object, @Nullable Continuation continuation0) {
                        Intrinsics.needClassReification();
                        kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform.7.2 flowKt__ZipKt$combineTransform$7$20 = new kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform.7.2(this.r, continuation0);
                        flowKt__ZipKt$combineTransform$7$20.p = flowCollector0;
                        flowKt__ZipKt$combineTransform$7$20.q = arr_object;
                        return flowKt__ZipKt$combineTransform$7$20.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object0) {
                        Object object1 = a.getCOROUTINE_SUSPENDED();
                        switch(this.o) {
                            case 0: {
                                ResultKt.throwOnFailure(object0);
                                FlowCollector flowCollector0 = this.p;
                                this.p = null;
                                this.o = 1;
                                return this.r.invoke(flowCollector0, this.q, this) == object1 ? object1 : Unit.INSTANCE;
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
                        this.r.invoke(this.p, this.q, this);
                        return Unit.INSTANCE;
                    }
                };
                this.o = 1;
                return CombineKt.combineInternal(flowCollector0, this.q, flowKt__ZipKt$combineTransform$7$10, flowKt__ZipKt$combineTransform$7$20, this) == object1 ? object1 : Unit.INSTANCE;
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
        FlowCollector flowCollector0 = (FlowCollector)this.p;
        Intrinsics.needClassReification();
        kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform.7.1 flowKt__ZipKt$combineTransform$7$10 = new kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform.7.1(this.q);
        Intrinsics.needClassReification();
        kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform.7.2 flowKt__ZipKt$combineTransform$7$20 = new kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform.7.2(this.r, null);
        CombineKt.combineInternal(flowCollector0, this.q, flowKt__ZipKt$combineTransform$7$10, flowKt__ZipKt$combineTransform$7$20, this);
        return Unit.INSTANCE;
    }
}

