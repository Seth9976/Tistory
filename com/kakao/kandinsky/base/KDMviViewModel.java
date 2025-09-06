package com.kakao.kandinsky.base;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kakao.kandinsky.base.contract.DialogUiState;
import com.kakao.kandinsky.base.contract.KDEvent.ShowDialog;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import p9.e;
import p9.f;
import p9.g;
import p9.h;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004B\u000F\u0012\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\n\u001A\u00028\u00002\u0006\u0010\b\u001A\u00028\u00002\u0006\u0010\t\u001A\u00028\u0001H$¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00028\u0001¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u000F\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00028\u0002H\u0004¢\u0006\u0004\b\u000F\u0010\u0007J7\u0010\u0015\u001A\u00020\f\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0011*\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\u00120\u00002\u0006\u0010\u0014\u001A\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001D\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00020\u001D8\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/kakao/kandinsky/base/KDMviViewModel;", "UiState", "Intent", "Event", "Landroidx/lifecycle/ViewModel;", "init", "<init>", "(Ljava/lang/Object;)V", "current", "intent", "handleIntent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "sendIntent", "event", "sendEvent", "U", "I", "Lcom/kakao/kandinsky/base/contract/KDEvent;", "", "changed", "cancel", "(Lcom/kakao/kandinsky/base/KDMviViewModel;Z)V", "Lkotlinx/coroutines/flow/StateFlow;", "I0", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/SharedFlow;", "K0", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class KDMviViewModel extends ViewModel {
    public static final int $stable = 8;
    public final MutableSharedFlow H0;
    public final StateFlow I0;
    public final MutableSharedFlow J0;
    public final SharedFlow K0;

    public KDMviViewModel(Object object0) {
        MutableSharedFlow mutableSharedFlow0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.H0 = mutableSharedFlow0;
        this.I0 = FlowKt.stateIn(FlowKt.runningFold(mutableSharedFlow0, object0, new h(3, this, KDMviViewModel.class, "handleIntent", "handleIntent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 4)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), object0);  // 初始化器: Lkotlin/jvm/internal/AdaptedFunctionReference;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        MutableSharedFlow mutableSharedFlow1 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.J0 = mutableSharedFlow1;
        this.K0 = FlowKt.asSharedFlow(mutableSharedFlow1);
    }

    public static final Object access$uiState$handleIntent(KDMviViewModel kDMviViewModel0, Object object0, Object object1, Continuation continuation0) {
        return kDMviViewModel0.handleIntent(object0, object1);
    }

    public final void cancel(@NotNull KDMviViewModel kDMviViewModel0, boolean z) {
        Intrinsics.checkNotNullParameter(kDMviViewModel0, "<this>");
        e e0 = new e(kDMviViewModel0);
        if(z) {
            kDMviViewModel0.sendEvent(new ShowDialog(new DialogUiState(0, 0, e0, 3, null)));
            return;
        }
        e0.invoke();
    }

    @NotNull
    public final SharedFlow getEvent() {
        return this.K0;
    }

    @NotNull
    public final StateFlow getUiState() {
        return this.I0;
    }

    public abstract Object handleIntent(Object arg1, Object arg2);

    public final void sendEvent(Object object0) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f(this, object0, null), 3, null);
    }

    public final void sendIntent(Object object0) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g(this, object0, null), 3, null);
    }
}

