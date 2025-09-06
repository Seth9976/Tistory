package com.kakao.tistory.presentation.viewmodel.base;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004B\u000F\u0012\u0006\u0010\u0005\u001A\u00028\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00028\u0000¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\t2\u0006\u0010\b\u001A\u00028\u0001H\u0004¢\u0006\u0004\b\u000B\u0010\u0007J \u0010\r\u001A\u00028\u00022\u0006\u0010\f\u001A\u00028\u00022\u0006\u0010\b\u001A\u00028\u0000H¦@¢\u0006\u0004\b\r\u0010\u000ER\u001D\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00020\u000F8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u001D\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/base/BaseMviViewModel;", "INTENT", "EVENT", "MODEL", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "init", "<init>", "(Ljava/lang/Object;)V", "intent", "", "sendIntent", "sendEvent", "current", "handleIntent", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/StateFlow;", "h", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/SharedFlow;", "j", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "event", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BaseMviViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final MutableSharedFlow g;
    public final StateFlow h;
    public final MutableSharedFlow i;
    public final MutableSharedFlow j;

    public BaseMviViewModel(Object object0) {
        MutableSharedFlow mutableSharedFlow0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.g = mutableSharedFlow0;
        this.h = FlowKt.stateIn(FlowKt.runningFold(mutableSharedFlow0, object0, new c(this)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), object0);
        MutableSharedFlow mutableSharedFlow1 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.i = mutableSharedFlow1;
        this.j = mutableSharedFlow1;
    }

    @NotNull
    public final SharedFlow getEvent() {
        return this.j;
    }

    @NotNull
    public final StateFlow getUiState() {
        return this.h;
    }

    @Nullable
    public abstract Object handleIntent(Object arg1, Object arg2, @NotNull Continuation arg3);

    public final void sendEvent(Object object0) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(this, object0, null), 3, null);
    }

    public final void sendIntent(Object object0) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b(this, object0, null), 3, null);
    }
}

