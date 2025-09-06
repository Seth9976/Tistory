package com.kakao.tistory.domain.revenue.usecase;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJH\u0010\u0013\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\n2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\n2\u0006\u0010\u000F\u001A\u00020\nH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueInfoUseCase;", "", "Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueSummaryUseCase;", "getRevenueSummaryUseCase", "Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueGraphUseCase;", "getRevenueGraphUseCase", "Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueGraphDetailInfoUseCase;", "getRevenueGraphDetailInfoUseCase", "<init>", "(Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueSummaryUseCase;Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueGraphUseCase;Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueGraphDetailInfoUseCase;)V", "", "blogName", "vendor", "granularity", "startDate", "endDate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/revenue/usecase/RevenueInfo;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetRevenueInfoUseCase {
    public final GetRevenueSummaryUseCase a;
    public final GetRevenueGraphUseCase b;
    public final GetRevenueGraphDetailInfoUseCase c;

    @Inject
    public GetRevenueInfoUseCase(@NotNull GetRevenueSummaryUseCase getRevenueSummaryUseCase0, @NotNull GetRevenueGraphUseCase getRevenueGraphUseCase0, @NotNull GetRevenueGraphDetailInfoUseCase getRevenueGraphDetailInfoUseCase0) {
        Intrinsics.checkNotNullParameter(getRevenueSummaryUseCase0, "getRevenueSummaryUseCase");
        Intrinsics.checkNotNullParameter(getRevenueGraphUseCase0, "getRevenueGraphUseCase");
        Intrinsics.checkNotNullParameter(getRevenueGraphDetailInfoUseCase0, "getRevenueGraphDetailInfoUseCase");
        super();
        this.a = getRevenueSummaryUseCase0;
        this.b = getRevenueGraphUseCase0;
        this.c = getRevenueGraphDetailInfoUseCase0;
    }

    @NotNull
    public final Flow invoke(@NotNull String s, @NotNull String s1, @NotNull String s2, @Nullable String s3, @NotNull String s4) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "vendor");
        Intrinsics.checkNotNullParameter(s2, "granularity");
        Intrinsics.checkNotNullParameter(s4, "endDate");
        Flow flow0 = this.a.invoke(s, s1);
        Flow flow1 = this.b.invoke(s, s1, s2, s4);
        return s3 == null ? FlowKt.combine(flow0, flow1, this.c.invoke(s, s1, s2, null, null), new a(null)) : FlowKt.combine(flow0, flow1, this.c.invoke(s, s1, s2, s3, s4), new a(null));
    }

    public static Flow invoke$default(GetRevenueInfoUseCase getRevenueInfoUseCase0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 8) != 0) {
            s3 = null;
        }
        return getRevenueInfoUseCase0.invoke(s, s1, s2, s3, s4);
    }
}

