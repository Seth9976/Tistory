package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueGraphDetailInfoUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueInfoUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueSupportUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueVendorListUseCase;
import com.kakao.tistory.presentation.common.TistoryMVIViewmodel;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.ChangeBlogInfo;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.ChangedGraphPeriodType;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.ChangedVendor;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadRevenue;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadRevenueFailed;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadVendorList;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadedGraphDetailInfo;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadedRevenue;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadedRevenueSupport;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.LoadedVendorList;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent.SelectedGraphItem;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueIntent;
import com.kakao.tistory.presentation.screen.revenue.contract.RevenueUiState;
import com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodType;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J \u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/RevenueViewModel;", "Lcom/kakao/tistory/presentation/common/TistoryMVIViewmodel;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueEvent;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueUiState;", "Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueVendorListUseCase;", "getRevenueVendorListUseCase", "Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueInfoUseCase;", "getRevenueInfoUseCase", "Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueGraphDetailInfoUseCase;", "getRevenueGraphDetailInfoUseCase", "Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueSupportUseCase;", "getRevenueSupportUseCase", "<init>", "(Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueVendorListUseCase;Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueInfoUseCase;Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueGraphDetailInfoUseCase;Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueSupportUseCase;)V", "createInitState", "()Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueUiState;", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueUiState;Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RevenueViewModel extends TistoryMVIViewmodel {
    public static final int $stable = 8;
    public final GetRevenueVendorListUseCase f;
    public final GetRevenueInfoUseCase g;
    public final GetRevenueGraphDetailInfoUseCase h;
    public final GetRevenueSupportUseCase i;

    @Inject
    public RevenueViewModel(@NotNull GetRevenueVendorListUseCase getRevenueVendorListUseCase0, @NotNull GetRevenueInfoUseCase getRevenueInfoUseCase0, @NotNull GetRevenueGraphDetailInfoUseCase getRevenueGraphDetailInfoUseCase0, @NotNull GetRevenueSupportUseCase getRevenueSupportUseCase0) {
        Intrinsics.checkNotNullParameter(getRevenueVendorListUseCase0, "getRevenueVendorListUseCase");
        Intrinsics.checkNotNullParameter(getRevenueInfoUseCase0, "getRevenueInfoUseCase");
        Intrinsics.checkNotNullParameter(getRevenueGraphDetailInfoUseCase0, "getRevenueGraphDetailInfoUseCase");
        Intrinsics.checkNotNullParameter(getRevenueSupportUseCase0, "getRevenueSupportUseCase");
        super();
        this.f = getRevenueVendorListUseCase0;
        this.g = getRevenueInfoUseCase0;
        this.h = getRevenueGraphDetailInfoUseCase0;
        this.i = getRevenueSupportUseCase0;
    }

    @NotNull
    public RevenueUiState createInitState() {
        return new RevenueUiState(false, null, null, null, null, 0, null, null, null, null, null, null, new d0(this), new e0(this), new f0(this), new g0(this), new h0(this), 0xFFF, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object createInitState() {
        return this.createInitState();
    }

    @Nullable
    public Object handleIntent(@NotNull RevenueUiState revenueUiState0, @NotNull RevenueIntent revenueIntent0, @NotNull Continuation continuation0) {
        String s = null;
        if(revenueIntent0 instanceof ChangeBlogInfo) {
            BlogInfo blogInfo0 = ((ChangeBlogInfo)revenueIntent0).getBlog();
            if(blogInfo0 != null) {
                s = blogInfo0.getName();
            }
            if(s == null) {
                s = "";
            }
            this.sendIntent(new LoadVendorList(s));
            return RevenueUiState.copy$default(revenueUiState0, false, null, s, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFB, null);
        }
        if(revenueIntent0 instanceof LoadVendorList) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new i0(this, revenueIntent0, null), 3, null);
            return RevenueUiState.copy$default(revenueUiState0, true, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFE, null);
        }
        if(revenueIntent0 instanceof LoadedVendorList) {
            Vendor vendor0 = revenueUiState0.getSelectedVendor();
            if(vendor0 == null) {
                vendor0 = (Vendor)CollectionsKt___CollectionsKt.firstOrNull(((LoadedVendorList)revenueIntent0).getVendorList());
                if(vendor0 == null) {
                    return revenueUiState0;
                }
            }
            this.sendIntent(new LoadRevenue(vendor0, revenueUiState0.getGranularity()));
            return RevenueUiState.copy$default(revenueUiState0, false, null, null, ((LoadedVendorList)revenueIntent0).getVendorList(), vendor0, 0, null, null, null, null, null, null, null, null, null, null, null, 0x1FFE7, null);
        }
        if(revenueIntent0 instanceof LoadRevenue) {
            Vendor vendor1 = ((LoadRevenue)revenueIntent0).getSelectedVendor();
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new k0(vendor1, this, revenueUiState0, revenueIntent0, null), 3, null);
            return RevenueUiState.copy$default(revenueUiState0, true, null, null, null, ((LoadRevenue)revenueIntent0).getSelectedVendor(), 0, null, null, null, null, null, null, null, null, null, null, null, 0x1FFEE, null);
        }
        if(revenueIntent0 instanceof LoadedRevenue) {
            return RevenueUiState.copy$default(revenueUiState0, false, null, null, null, ((LoadedRevenue)revenueIntent0).getSelectedVendor(), 0, "", ((LoadedRevenue)revenueIntent0).getRevenueInfo().getRevenueSummary(), ((LoadedRevenue)revenueIntent0).getRevenueInfo().getRevenueTrendGraph(), ((LoadedRevenue)revenueIntent0).getRevenueInfo().getRevenueGraphDetailInfo(), null, ((LoadedRevenue)revenueIntent0).getPeriodType(), null, null, null, null, null, 0x1F40C, null);
        }
        if(revenueIntent0 instanceof LoadedRevenueSupport) {
            return RevenueUiState.copy$default(revenueUiState0, false, null, null, null, ((LoadedRevenueSupport)revenueIntent0).getSelectedVendor(), 0, "", null, null, null, ((LoadedRevenueSupport)revenueIntent0).getRevenueSupport(), GraphPeriodType.DAY, null, null, null, null, null, 0x1F38C, null);
        }
        if(revenueIntent0 instanceof LoadRevenueFailed) {
            return RevenueUiState.copy$default(revenueUiState0, false, ((LoadRevenueFailed)revenueIntent0).getRevenueFailState(), null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFC, null);
        }
        if(revenueIntent0 instanceof ChangedGraphPeriodType) {
            Vendor vendor2 = revenueUiState0.getSelectedVendor();
            if(vendor2 == null) {
                return revenueUiState0;
            }
            this.sendIntent(new LoadRevenue(vendor2, ((ChangedGraphPeriodType)revenueIntent0).getType()));
            return revenueUiState0;
        }
        if(revenueIntent0 instanceof ChangedVendor) {
            this.sendIntent(new LoadRevenue(((ChangedVendor)revenueIntent0).getVendor(), revenueUiState0.getGranularity()));
            return revenueUiState0;
        }
        if(revenueIntent0 instanceof SelectedGraphItem) {
            Vendor vendor3 = revenueUiState0.getSelectedVendor();
            if(vendor3 != null) {
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new m0(this, revenueUiState0, vendor3, revenueIntent0, null), 3, null);
            }
            return RevenueUiState.copy$default(revenueUiState0, false, null, null, null, null, ((SelectedGraphItem)revenueIntent0).getSelectedGraphPosition(), null, null, null, null, null, null, null, null, null, null, null, 0x1FFDF, null);
        }
        if(!(revenueIntent0 instanceof LoadedGraphDetailInfo)) {
            throw new NoWhenBranchMatchedException();
        }
        return RevenueUiState.copy$default(revenueUiState0, false, null, null, null, null, 0, null, null, null, ((LoadedGraphDetailInfo)revenueIntent0).getRevenueGraphDetailInfo(), null, null, null, null, null, null, null, 0x1FDFF, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((RevenueUiState)object0), ((RevenueIntent)object1), continuation0);
    }
}

