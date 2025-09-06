package com.kakao.tistory.presentation.screen.revenue.item;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.annotation.concurrent.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Immutable
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\u001A\b\u0002\u0010\b\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004\u0012\b\b\u0002\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\"\u0010\u000F\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u001A\b\u0002\u0010\b\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\b\b\u0002\u0010\n\u001A\u00020\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000ER)\u0010\b\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0010R\u0017\u0010\n\u001A\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0012¨\u0006("}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueInfoUiState;", "", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;", "revenueSummary", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kakao/tistory/presentation/common/graph/BarGraphItem;", "Lcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;", "revenueTrendGraph", "Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "revenueGraphDetailInfo", "<init>", "(Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;Lkotlinx/coroutines/flow/Flow;Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;", "component2", "()Lkotlinx/coroutines/flow/Flow;", "component3", "()Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "copy", "(Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;Lkotlinx/coroutines/flow/Flow;Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;)Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueInfoUiState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;", "getRevenueSummary", "b", "Lkotlinx/coroutines/flow/Flow;", "getRevenueTrendGraph", "c", "Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "getRevenueGraphDetailInfo", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RevenueInfoUiState {
    public static final int $stable = 8;
    public final RevenueSummaryUiState a;
    public final Flow b;
    public final GraphDetailInfoUiState c;

    public RevenueInfoUiState() {
        this(null, null, null, 7, null);
    }

    public RevenueInfoUiState(@NotNull RevenueSummaryUiState revenueSummaryUiState0, @NotNull Flow flow0, @NotNull GraphDetailInfoUiState graphDetailInfoUiState0) {
        Intrinsics.checkNotNullParameter(revenueSummaryUiState0, "revenueSummary");
        Intrinsics.checkNotNullParameter(flow0, "revenueTrendGraph");
        Intrinsics.checkNotNullParameter(graphDetailInfoUiState0, "revenueGraphDetailInfo");
        super();
        this.a = revenueSummaryUiState0;
        this.b = flow0;
        this.c = graphDetailInfoUiState0;
    }

    public RevenueInfoUiState(RevenueSummaryUiState revenueSummaryUiState0, Flow flow0, GraphDetailInfoUiState graphDetailInfoUiState0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            revenueSummaryUiState0 = new RevenueSummaryUiState(null, null, null, null, null, null, null, 0x7F, null);
        }
        if((v & 2) != 0) {
            flow0 = FlowKt.emptyFlow();
        }
        if((v & 4) != 0) {
            graphDetailInfoUiState0 = new GraphDetailInfoUiState(null, null, 3, null);
        }
        this(revenueSummaryUiState0, flow0, graphDetailInfoUiState0);
    }

    @NotNull
    public final RevenueSummaryUiState component1() {
        return this.a;
    }

    @NotNull
    public final Flow component2() {
        return this.b;
    }

    @NotNull
    public final GraphDetailInfoUiState component3() {
        return this.c;
    }

    @NotNull
    public final RevenueInfoUiState copy(@NotNull RevenueSummaryUiState revenueSummaryUiState0, @NotNull Flow flow0, @NotNull GraphDetailInfoUiState graphDetailInfoUiState0) {
        Intrinsics.checkNotNullParameter(revenueSummaryUiState0, "revenueSummary");
        Intrinsics.checkNotNullParameter(flow0, "revenueTrendGraph");
        Intrinsics.checkNotNullParameter(graphDetailInfoUiState0, "revenueGraphDetailInfo");
        return new RevenueInfoUiState(revenueSummaryUiState0, flow0, graphDetailInfoUiState0);
    }

    public static RevenueInfoUiState copy$default(RevenueInfoUiState revenueInfoUiState0, RevenueSummaryUiState revenueSummaryUiState0, Flow flow0, GraphDetailInfoUiState graphDetailInfoUiState0, int v, Object object0) {
        if((v & 1) != 0) {
            revenueSummaryUiState0 = revenueInfoUiState0.a;
        }
        if((v & 2) != 0) {
            flow0 = revenueInfoUiState0.b;
        }
        if((v & 4) != 0) {
            graphDetailInfoUiState0 = revenueInfoUiState0.c;
        }
        return revenueInfoUiState0.copy(revenueSummaryUiState0, flow0, graphDetailInfoUiState0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RevenueInfoUiState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((RevenueInfoUiState)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((RevenueInfoUiState)object0).b) ? Intrinsics.areEqual(this.c, ((RevenueInfoUiState)object0).c) : false;
    }

    @NotNull
    public final GraphDetailInfoUiState getRevenueGraphDetailInfo() {
        return this.c;
    }

    @NotNull
    public final RevenueSummaryUiState getRevenueSummary() {
        return this.a;
    }

    @NotNull
    public final Flow getRevenueTrendGraph() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "RevenueInfoUiState(revenueSummary=" + this.a + ", revenueTrendGraph=" + this.b + ", revenueGraphDetailInfo=" + this.c + ")";
    }
}

