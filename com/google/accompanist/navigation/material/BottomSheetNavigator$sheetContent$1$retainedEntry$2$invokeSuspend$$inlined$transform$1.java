package com.google.accompanist.navigation.material;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008A@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@DebugMetadata(c = "com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1", f = "BottomSheetNavigator.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,222:1\n*E\n"})
public final class BottomSheetNavigator.sheetContent.1.retainedEntry.2.invokeSuspend..inlined.transform.1 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Flow q;
    public final BottomSheetNavigator r;

    public BottomSheetNavigator.sheetContent.1.retainedEntry.2.invokeSuspend..inlined.transform.1(Flow flow0, Continuation continuation0, BottomSheetNavigator bottomSheetNavigator0) {
        this.q = flow0;
        this.r = bottomSheetNavigator0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
        Continuation continuation1 = new BottomSheetNavigator.sheetContent.1.retainedEntry.2.invokeSuspend..inlined.transform.1(this.q, continuation0, this.r);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((FlowCollector)object0), ((Continuation)object1));
    }

    @Nullable
    public final Object invoke(@NotNull FlowCollector flowCollector0, @Nullable Continuation continuation0) {
        return ((BottomSheetNavigator.sheetContent.1.retainedEntry.2.invokeSuspend..inlined.transform.1)this.create(flowCollector0, continuation0)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                com.google.accompanist.navigation.material.BottomSheetNavigator.sheetContent.1.retainedEntry.2.invokeSuspend..inlined.transform.1.1 bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$10 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        Throwable throwable0;
                        FlowCollector flowCollector1;
                        List list0;
                        FlowCollector flowCollector0;
                        com.google.accompanist.navigation.material.BottomSheetNavigator.sheetContent.1.retainedEntry.2.invokeSuspend..inlined.transform.1.1.1 bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10;
                        if(continuation0 instanceof com.google.accompanist.navigation.material.BottomSheetNavigator.sheetContent.1.retainedEntry.2.invokeSuspend..inlined.transform.1.1.1) {
                            bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10 = (com.google.accompanist.navigation.material.BottomSheetNavigator.sheetContent.1.retainedEntry.2.invokeSuspend..inlined.transform.1.1.1)continuation0;
                            int v = bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.p;
                            if((v & 0x80000000) == 0) {
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object o;
                                    public int p;
                                    public Object r;
                                    public FlowCollector s;

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
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object o;
                                public int p;
                                public Object r;
                                public FlowCollector s;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.o = object0;
                                    this.p |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                flowCollector1 = this.r;
                                list0 = (List)object0;
                                try {
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.r = list0;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.s = flowCollector1;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.p = 1;
                                    if(this.b.getSheetState$navigation_material_release().hide(bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10) != object2) {
                                        goto label_50;
                                    }
                                    return object2;
                                }
                                catch(CancellationException unused_ex) {
                                    flowCollector0 = flowCollector1;
                                label_35:
                                    Object object3 = CollectionsKt___CollectionsKt.lastOrNull(list0);
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.r = null;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.s = null;
                                    bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.p = 3;
                                    if(flowCollector0.emit(object3, bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10) == object2) {
                                        return object2;
                                    }
                                    break;
                                }
                                catch(Throwable throwable0) {
                                }
                            label_42:
                                Object object4 = CollectionsKt___CollectionsKt.lastOrNull(list0);
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.r = throwable0;
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.s = null;
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.p = 4;
                                if(flowCollector1.emit(object4, bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10) != object2) {
                                    throw throwable0;
                                }
                                return object2;
                            label_50:
                                flowCollector0 = flowCollector1;
                            label_51:
                                Object object5 = CollectionsKt___CollectionsKt.lastOrNull(list0);
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.r = null;
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.s = null;
                                bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.p = 2;
                                if(flowCollector0.emit(object5, bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10) == object2) {
                                    return object2;
                                }
                                break;
                            }
                            case 1: {
                                flowCollector0 = bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.s;
                                list0 = (List)bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.r;
                                try {
                                    ResultKt.throwOnFailure(object1);
                                    goto label_51;
                                }
                                catch(CancellationException throwable1) {
                                }
                                catch(Throwable unused_ex) {
                                    goto label_35;
                                }
                                flowCollector1 = flowCollector0;
                                throwable0 = throwable1;
                                goto label_42;
                            }
                            case 2: 
                            case 3: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            case 4: {
                                throwable0 = (Throwable)bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1$10.r;
                                ResultKt.throwOnFailure(object1);
                                throw throwable0;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.o = 1;
                return this.q.collect(bottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$10, this) == object1 ? object1 : Unit.INSTANCE;
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

