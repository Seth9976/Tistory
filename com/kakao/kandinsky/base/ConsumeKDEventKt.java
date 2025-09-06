package com.kakao.kandinsky.base;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.kakao.kandinsky.base.contract.DialogUiState;
import com.kakao.kandinsky.base.contract.KDEvent.ShowDialog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p9.c;
import qd.a;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A=\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000B"}, d2 = {"ConsumeEvent", "", "event", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/kakao/kandinsky/base/contract/KDEvent;", "updateConfirm", "Lkotlin/Function1;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "goHomeState", "Lkotlin/Function0;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConsumeKDEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumeKDEvent.kt\ncom/kakao/kandinsky/base/ConsumeKDEventKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,35:1\n36#2:36\n21#2:37\n23#2:41\n53#2,3:42\n50#3:38\n55#3:40\n107#4:39\n*S KotlinDebug\n*F\n+ 1 ConsumeKDEvent.kt\ncom/kakao/kandinsky/base/ConsumeKDEventKt\n*L\n16#1:36\n16#1:37\n16#1:41\n16#1:42,3\n16#1:38\n16#1:40\n16#1:39\n*E\n"})
public final class ConsumeKDEventKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ConsumeEvent(@NotNull SharedFlow sharedFlow0, @NotNull Function1 function10, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(sharedFlow0, "event");
        Intrinsics.checkNotNullParameter(function10, "updateConfirm");
        Intrinsics.checkNotNullParameter(function00, "goHomeState");
        Composer composer1 = composer0.startRestartGroup(1008792094);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1008792094, v, -1, "com.kakao.kandinsky.base.ConsumeEvent (ConsumeKDEvent.kt:14)");
        }
        ConsumeDialogKt.ConsumeDialog(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent..inlined.map.1.2 consumeKDEventKt$ConsumeEvent$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent..inlined.map.1.2.1 consumeKDEventKt$ConsumeEvent$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent..inlined.map.1.2.1) {
                            consumeKDEventKt$ConsumeEvent$$inlined$map$1$2$10 = (com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent..inlined.map.1.2.1)continuation0;
                            int v = consumeKDEventKt$ConsumeEvent$$inlined$map$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                consumeKDEventKt$ConsumeEvent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                consumeKDEventKt$ConsumeEvent$$inlined$map$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            consumeKDEventKt$ConsumeEvent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = consumeKDEventKt$ConsumeEvent$$inlined$map$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(consumeKDEventKt$ConsumeEvent$$inlined$map$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                DialogUiState dialogUiState0 = ((ShowDialog)object0).getDialog();
                                consumeKDEventKt$ConsumeEvent$$inlined$map$1$2$10.p = 1;
                                return this.a.emit(dialogUiState0, consumeKDEventKt$ConsumeEvent$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                Object object0 = new com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent..inlined.filterIsInstance.1(sharedFlow0).collect(consumeKDEventKt$ConsumeEvent$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, composer1, 8);
        EffectsKt.LaunchedEffect(sharedFlow0, new c(sharedFlow0, function00, function10, null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new androidx.compose.foundation.text.selection.a(v, 15, sharedFlow0, function10, function00));
        }

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
        public final class com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent..inlined.filterIsInstance.1 implements Flow {
            public com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent..inlined.filterIsInstance.1(Flow flow0) {
            }

            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent..inlined.filterIsInstance.1.2 consumeKDEventKt$ConsumeEvent$$inlined$filterIsInstance$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent..inlined.filterIsInstance.1.2.1 consumeKDEventKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10;
                        if(continuation0 instanceof com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent..inlined.filterIsInstance.1.2.1) {
                            consumeKDEventKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10 = (com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent..inlined.filterIsInstance.1.2.1)continuation0;
                            int v = consumeKDEventKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                consumeKDEventKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                consumeKDEventKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            consumeKDEventKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = consumeKDEventKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(consumeKDEventKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                if(object0 instanceof ShowDialog) {
                                    consumeKDEventKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.p = 1;
                                    if(this.a.emit(object0, consumeKDEventKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10) == object2) {
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
                Object object0 = this.a.collect(consumeKDEventKt$ConsumeEvent$$inlined$filterIsInstance$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }

    }
}

