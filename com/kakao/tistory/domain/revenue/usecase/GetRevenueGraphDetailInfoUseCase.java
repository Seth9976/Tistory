package com.kakao.tistory.domain.revenue.usecase;

import com.kakao.tistory.domain.revenue.repository.RevenueVendorRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JH\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r0\f2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00062\b\u0010\n\u001A\u0004\u0018\u00010\u00062\b\u0010\u000B\u001A\u0004\u0018\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/revenue/usecase/GetRevenueGraphDetailInfoUseCase;", "", "Lcom/kakao/tistory/domain/revenue/repository/RevenueVendorRepository;", "revenueVendorRepository", "<init>", "(Lcom/kakao/tistory/domain/revenue/repository/RevenueVendorRepository;)V", "", "blogName", "vendor", "granularity", "startDate", "endDate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetRevenueGraphDetailInfoUseCase {
    public final RevenueVendorRepository a;

    @Inject
    public GetRevenueGraphDetailInfoUseCase(@NotNull RevenueVendorRepository revenueVendorRepository0) {
        Intrinsics.checkNotNullParameter(revenueVendorRepository0, "revenueVendorRepository");
        super();
        this.a = revenueVendorRepository0;
    }

    @NotNull
    public final Flow invoke(@NotNull String s, @NotNull String s1, @NotNull String s2, @Nullable String s3, @Nullable String s4) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "vendor");
        Intrinsics.checkNotNullParameter(s2, "granularity");
        return this.a.getRevenueGraphDetailInfo(s, s1, s2, s3, s4);
    }
}

