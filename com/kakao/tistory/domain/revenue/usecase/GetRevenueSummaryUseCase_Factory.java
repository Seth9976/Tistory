package com.kakao.tistory.domain.revenue.usecase;

import com.kakao.tistory.domain.revenue.repository.RevenueVendorRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetRevenueSummaryUseCase_Factory implements Factory {
    public final Provider a;

    public GetRevenueSummaryUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetRevenueSummaryUseCase_Factory create(Provider provider0) {
        return new GetRevenueSummaryUseCase_Factory(provider0);
    }

    public GetRevenueSummaryUseCase get() {
        return GetRevenueSummaryUseCase_Factory.newInstance(((RevenueVendorRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetRevenueSummaryUseCase newInstance(RevenueVendorRepository revenueVendorRepository0) {
        return new GetRevenueSummaryUseCase(revenueVendorRepository0);
    }
}

