package com.kakao.tistory.domain.revenue.usecase;

import com.kakao.tistory.domain.revenue.repository.RevenueVendorRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000E\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f0\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueGraphUseCase;", "", "Lcom/kakao/tistory/domain/revenue/repository/RevenueVendorRepository;", "revenueVendorRepository", "<init>", "(Lcom/kakao/tistory/domain/revenue/repository/RevenueVendorRepository;)V", "", "blogName", "vendor", "granularity", "endDate", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/Pager;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetRevenueGraphUseCase {
    public final RevenueVendorRepository a;

    @Inject
    public GetRevenueGraphUseCase(@NotNull RevenueVendorRepository revenueVendorRepository0) {
        Intrinsics.checkNotNullParameter(revenueVendorRepository0, "revenueVendorRepository");
        super();
        this.a = revenueVendorRepository0;
    }

    @NotNull
    public final Flow invoke(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "vendor");
        Intrinsics.checkNotNullParameter(s2, "granularity");
        Intrinsics.checkNotNullParameter(s3, "endDate");
        return this.a.getRevenueGraph(s, s1, s2, s3);
    }
}

