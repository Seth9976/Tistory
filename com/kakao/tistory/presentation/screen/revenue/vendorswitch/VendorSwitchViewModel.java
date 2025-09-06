package com.kakao.tistory.presentation.screen.revenue.vendorswitch;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueVendorListUseCase;
import com.kakao.tistory.presentation.common.TistoryMVIViewmodel;
import com.kakao.tistory.presentation.screen.revenue.vendorswitch.contract.VendorSwitchIntent.Init;
import com.kakao.tistory.presentation.screen.revenue.vendorswitch.contract.VendorSwitchIntent;
import com.kakao.tistory.presentation.screen.revenue.vendorswitch.contract.VendorSwitchUiState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/vendorswitch/VendorSwitchViewModel;", "Lcom/kakao/tistory/presentation/common/TistoryMVIViewmodel;", "Lcom/kakao/tistory/presentation/screen/revenue/vendorswitch/contract/VendorSwitchIntent;", "Lcom/kakao/tistory/presentation/screen/revenue/vendorswitch/contract/VendorSwitchEvent;", "Lcom/kakao/tistory/presentation/screen/revenue/vendorswitch/contract/VendorSwitchUiState;", "Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueVendorListUseCase;", "getRevenueVendorListUseCase", "<init>", "(Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueVendorListUseCase;)V", "createInitState", "()Lcom/kakao/tistory/presentation/screen/revenue/vendorswitch/contract/VendorSwitchUiState;", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/screen/revenue/vendorswitch/contract/VendorSwitchUiState;Lcom/kakao/tistory/presentation/screen/revenue/vendorswitch/contract/VendorSwitchIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class VendorSwitchViewModel extends TistoryMVIViewmodel {
    public static final int $stable = 8;
    public final GetRevenueVendorListUseCase f;

    @Inject
    public VendorSwitchViewModel(@NotNull GetRevenueVendorListUseCase getRevenueVendorListUseCase0) {
        Intrinsics.checkNotNullParameter(getRevenueVendorListUseCase0, "getRevenueVendorListUseCase");
        super();
        this.f = getRevenueVendorListUseCase0;
        this.sendIntent(Init.INSTANCE);
    }

    @NotNull
    public VendorSwitchUiState createInitState() {
        return new VendorSwitchUiState(null, 1, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object createInitState() {
        return this.createInitState();
    }

    @Nullable
    public Object handleIntent(@NotNull VendorSwitchUiState vendorSwitchUiState0, @NotNull VendorSwitchIntent vendorSwitchIntent0, @NotNull Continuation continuation0) {
        if(!Intrinsics.areEqual(vendorSwitchIntent0, Init.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(this, null), 3, null);
        return vendorSwitchUiState0;
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((VendorSwitchUiState)object0), ((VendorSwitchIntent)object1), continuation0);
    }
}

