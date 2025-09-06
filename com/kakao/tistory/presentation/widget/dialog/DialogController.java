package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/widget/dialog/DialogController;", "Lcom/kakao/tistory/presentation/widget/dialog/DialogEvent;", "T", "", "<init>", "()V", "event", "", "sendDialogEvent", "(Lcom/kakao/tistory/presentation/widget/dialog/DialogEvent;)V", "Lkotlinx/coroutines/flow/Flow;", "getEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryComposeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryComposeDialog.kt\ncom/kakao/tistory/presentation/widget/dialog/DialogController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,320:1\n53#2:321\n55#2:325\n50#3:322\n55#3:324\n107#4:323\n*S KotlinDebug\n*F\n+ 1 TistoryComposeDialog.kt\ncom/kakao/tistory/presentation/widget/dialog/DialogController\n*L\n38#1:321\n38#1:325\n38#1:322\n38#1:324\n38#1:323\n*E\n"})
public final class DialogController {
    public static final int $stable = 8;
    public final MutableStateFlow a;

    public DialogController() {
        this.a = StateFlowKt.MutableStateFlow(null);
    }

    @NotNull
    public final Flow getEventFlow() {
        return FlowKt.filterNotNull(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.tistory.presentation.widget.dialog.DialogController.getEventFlow..inlined.map.1.2 dialogController$getEventFlow$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.presentation.widget.dialog.DialogController.getEventFlow..inlined.map.1.2.1 dialogController$getEventFlow$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.presentation.widget.dialog.DialogController.getEventFlow..inlined.map.1.2.1) {
                            dialogController$getEventFlow$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.widget.dialog.DialogController.getEventFlow..inlined.map.1.2.1)continuation0;
                            int v = dialogController$getEventFlow$$inlined$map$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                dialogController$getEventFlow$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                dialogController$getEventFlow$$inlined$map$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            dialogController$getEventFlow$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = dialogController$getEventFlow$$inlined$map$1$2$10.a;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(dialogController$getEventFlow$$inlined$map$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                DialogEvent dialogEvent0 = ((Event)object0) == null || !((Event)object0).getContentIfNotHandled() ? null : ((DialogEvent)((Event)object0).getContent());
                                dialogController$getEventFlow$$inlined$map$1$2$10.b = 1;
                                return this.a.emit(dialogEvent0, dialogController$getEventFlow$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                Object object0 = this.a.collect(dialogController$getEventFlow$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        });
    }

    public final void sendDialogEvent(@NotNull DialogEvent dialogEvent0) {
        Intrinsics.checkNotNullParameter(dialogEvent0, "event");
        Event event0 = new Event(dialogEvent0);
        this.a.tryEmit(event0);
    }
}

