package com.kakao.tistory.presentation.common;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00028\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u000E\u001A\u00020\n2\u0006\u0010\r\u001A\u00028\u0001¢\u0006\u0004\b\u000E\u0010\fJ \u0010\u0010\u001A\u00028\u00022\u0006\u0010\u000F\u001A\u00028\u00022\u0006\u0010\t\u001A\u00028\u0000H¦@¢\u0006\u0004\b\u0010\u0010\u0011R\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001D\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/common/TistoryMVIViewmodel;", "Intent", "Event", "UiState", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "createInitState", "()Ljava/lang/Object;", "intent", "", "sendIntent", "(Ljava/lang/Object;)V", "event", "sendEvent", "current", "handleIntent", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "c", "Lkotlinx/coroutines/flow/Flow;", "getEvent", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/StateFlow;", "e", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class TistoryMVIViewmodel extends ViewModel {
    public static final int $stable = 8;
    public final Channel a;
    public final Channel b;
    public final Flow c;
    public final Object d;
    public final StateFlow e;

    public TistoryMVIViewmodel() {
        Channel channel0 = ChannelKt.Channel$default(0, null, null, 7, null);
        this.a = channel0;
        Channel channel1 = ChannelKt.Channel$default(0, null, null, 7, null);
        this.b = channel1;
        this.c = FlowKt.receiveAsFlow(channel1);
        Object object0 = this.createInitState();
        this.d = object0;
        this.e = FlowKt.stateIn(FlowKt.runningFold(FlowKt.receiveAsFlow(channel0), object0, new f(this)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), object0);
    }

    public abstract Object createInitState();

    @NotNull
    public final Flow getEvent() {
        return this.c;
    }

    @NotNull
    public final StateFlow getUiState() {
        return this.e;
    }

    @Nullable
    public abstract Object handleIntent(Object arg1, Object arg2, @NotNull Continuation arg3);

    public final void sendEvent(Object object0) {
        String s = Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName();
        CrashlyticsUtils.INSTANCE.logMessage(s + " sendEvent: " + object0);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new d(this, object0, null), 3, null);
    }

    public final void sendIntent(Object object0) {
        String s = Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName();
        CrashlyticsUtils.INSTANCE.logMessage(s + " sendIntent: " + object0);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e(this, object0, null), 3, null);
    }
}

