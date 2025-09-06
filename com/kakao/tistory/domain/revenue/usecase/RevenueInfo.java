package com.kakao.tistory.domain.revenue.usecase;

import androidx.paging.Pager;
import com.kakao.tistory.domain.revenue.entity.RevenueGraphDetailInfo;
import com.kakao.tistory.domain.revenue.entity.RevenueSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001C\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001A\u00020\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001B\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\rR#\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u000FR\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0011¨\u0006&"}, d2 = {"Lcom/kakao/tistory/domain/revenue/usecase/RevenueInfo;", "", "Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;", "revenueSummary", "Landroidx/paging/Pager;", "", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "revenueTrendGraph", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "revenueGraphDetailInfo", "<init>", "(Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;Landroidx/paging/Pager;Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;)V", "component1", "()Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;", "component2", "()Landroidx/paging/Pager;", "component3", "()Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "copy", "(Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;Landroidx/paging/Pager;Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;)Lcom/kakao/tistory/domain/revenue/usecase/RevenueInfo;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;", "getRevenueSummary", "b", "Landroidx/paging/Pager;", "getRevenueTrendGraph", "c", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "getRevenueGraphDetailInfo", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RevenueInfo {
    public final RevenueSummary a;
    public final Pager b;
    public final RevenueGraphDetailInfo c;

    public RevenueInfo(@NotNull RevenueSummary revenueSummary0, @NotNull Pager pager0, @NotNull RevenueGraphDetailInfo revenueGraphDetailInfo0) {
        Intrinsics.checkNotNullParameter(revenueSummary0, "revenueSummary");
        Intrinsics.checkNotNullParameter(pager0, "revenueTrendGraph");
        Intrinsics.checkNotNullParameter(revenueGraphDetailInfo0, "revenueGraphDetailInfo");
        super();
        this.a = revenueSummary0;
        this.b = pager0;
        this.c = revenueGraphDetailInfo0;
    }

    @NotNull
    public final RevenueSummary component1() {
        return this.a;
    }

    @NotNull
    public final Pager component2() {
        return this.b;
    }

    @NotNull
    public final RevenueGraphDetailInfo component3() {
        return this.c;
    }

    @NotNull
    public final RevenueInfo copy(@NotNull RevenueSummary revenueSummary0, @NotNull Pager pager0, @NotNull RevenueGraphDetailInfo revenueGraphDetailInfo0) {
        Intrinsics.checkNotNullParameter(revenueSummary0, "revenueSummary");
        Intrinsics.checkNotNullParameter(pager0, "revenueTrendGraph");
        Intrinsics.checkNotNullParameter(revenueGraphDetailInfo0, "revenueGraphDetailInfo");
        return new RevenueInfo(revenueSummary0, pager0, revenueGraphDetailInfo0);
    }

    public static RevenueInfo copy$default(RevenueInfo revenueInfo0, RevenueSummary revenueSummary0, Pager pager0, RevenueGraphDetailInfo revenueGraphDetailInfo0, int v, Object object0) {
        if((v & 1) != 0) {
            revenueSummary0 = revenueInfo0.a;
        }
        if((v & 2) != 0) {
            pager0 = revenueInfo0.b;
        }
        if((v & 4) != 0) {
            revenueGraphDetailInfo0 = revenueInfo0.c;
        }
        return revenueInfo0.copy(revenueSummary0, pager0, revenueGraphDetailInfo0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RevenueInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((RevenueInfo)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((RevenueInfo)object0).b) ? Intrinsics.areEqual(this.c, ((RevenueInfo)object0).c) : false;
    }

    @NotNull
    public final RevenueGraphDetailInfo getRevenueGraphDetailInfo() {
        return this.c;
    }

    @NotNull
    public final RevenueSummary getRevenueSummary() {
        return this.a;
    }

    @NotNull
    public final Pager getRevenueTrendGraph() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "RevenueInfo(revenueSummary=" + this.a + ", revenueTrendGraph=" + this.b + ", revenueGraphDetailInfo=" + this.c + ")";
    }
}

