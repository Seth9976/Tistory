package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.domain.usecase.GetServerHostListUseCase;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fR#\u0010\u0014\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E0\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u001D\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u0017\u0010 \u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F¨\u0006\""}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SecretLabViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "deviceInfoPreference", "Lcom/kakao/tistory/domain/usecase/GetServerHostListUseCase;", "getServerHostListUseCase", "<init>", "(Lcom/kakao/tistory/data/preference/DeviceInfoPreference;Lcom/kakao/tistory/domain/usecase/GetServerHostListUseCase;)V", "", "serverHost", "", "onClickServerHost", "(Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/kakao/tistory/domain/entity/ServerHost;", "j", "Lkotlinx/coroutines/flow/StateFlow;", "getServerHostList", "()Lkotlinx/coroutines/flow/StateFlow;", "serverHostList", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/kakao/tistory/presentation/viewmodel/SecretLabViewModel$SecretLabEvent;", "l", "Lkotlinx/coroutines/flow/SharedFlow;", "getSecretLabEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "secretLabEvent", "m", "Ljava/lang/String;", "getCurrentSeverHost", "()Ljava/lang/String;", "currentSeverHost", "SecretLabEvent", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SecretLabViewModel extends TistoryViewModel {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SecretLabViewModel$SecretLabEvent;", "", "CloseApp", "Lcom/kakao/tistory/presentation/viewmodel/SecretLabViewModel$SecretLabEvent$CloseApp;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class SecretLabEvent {
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SecretLabViewModel$SecretLabEvent$CloseApp;", "Lcom/kakao/tistory/presentation/viewmodel/SecretLabViewModel$SecretLabEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class CloseApp extends SecretLabEvent {
            public static final int $stable;
            @NotNull
            public static final CloseApp INSTANCE;

            static {
                CloseApp.INSTANCE = new CloseApp();
            }

            public CloseApp() {
                super(null);
            }

            // 去混淆评级： 低(20)
            @Override
            public boolean equals(@Nullable Object object0) {
                return this == object0 ? true : object0 instanceof CloseApp;
            }

            @Override
            public int hashCode() {
                return 1211204779;
            }

            @Override
            @NotNull
            public String toString() {
                return "CloseApp";
            }
        }

        public static final int $stable;

        public SecretLabEvent(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 8;
    public final DeviceInfoPreference g;
    public final GetServerHostListUseCase h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public final MutableSharedFlow k;
    public final SharedFlow l;
    public final String m;

    @Inject
    public SecretLabViewModel(@NotNull DeviceInfoPreference deviceInfoPreference0, @NotNull GetServerHostListUseCase getServerHostListUseCase0) {
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        Intrinsics.checkNotNullParameter(getServerHostListUseCase0, "getServerHostListUseCase");
        super();
        this.g = deviceInfoPreference0;
        this.h = getServerHostListUseCase0;
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.i = mutableStateFlow0;
        this.j = FlowKt.asStateFlow(mutableStateFlow0);
        MutableSharedFlow mutableSharedFlow0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.k = mutableSharedFlow0;
        this.l = FlowKt.asSharedFlow(mutableSharedFlow0);
        String s = deviceInfoPreference0.getDeveloperServerHost();
        if(s == null) {
            s = "https://api.tistory.com";
        }
        this.m = s;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new m4(this, null), 3, null);
    }

    @NotNull
    public final String getCurrentSeverHost() {
        return this.m;
    }

    @NotNull
    public final SharedFlow getSecretLabEvent() {
        return this.l;
    }

    @NotNull
    public final StateFlow getServerHostList() {
        return this.j;
    }

    public final void onClickServerHost(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "serverHost");
        this.g.setDeveloperServerHost(s);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new n4(this, null), 3, null);
    }
}

