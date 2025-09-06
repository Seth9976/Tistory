package com.kakao.tistory.domain.revenue.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetRevenueInfoUseCase_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public GetRevenueInfoUseCase_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static GetRevenueInfoUseCase_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new GetRevenueInfoUseCase_Factory(provider0, provider1, provider2);
    }

    public GetRevenueInfoUseCase get() {
        return GetRevenueInfoUseCase_Factory.newInstance(((GetRevenueSummaryUseCase)this.a.get()), ((GetRevenueGraphUseCase)this.b.get()), ((GetRevenueGraphDetailInfoUseCase)this.c.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetRevenueInfoUseCase newInstance(GetRevenueSummaryUseCase getRevenueSummaryUseCase0, GetRevenueGraphUseCase getRevenueGraphUseCase0, GetRevenueGraphDetailInfoUseCase getRevenueGraphDetailInfoUseCase0) {
        return new GetRevenueInfoUseCase(getRevenueSummaryUseCase0, getRevenueGraphUseCase0, getRevenueGraphDetailInfoUseCase0);
    }
}

