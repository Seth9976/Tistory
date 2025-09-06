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
public final class GetRevenueGraphUseCase_Factory implements Factory {
    public final Provider a;

    public GetRevenueGraphUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetRevenueGraphUseCase_Factory create(Provider provider0) {
        return new GetRevenueGraphUseCase_Factory(provider0);
    }

    public GetRevenueGraphUseCase get() {
        return GetRevenueGraphUseCase_Factory.newInstance(((RevenueVendorRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetRevenueGraphUseCase newInstance(RevenueVendorRepository revenueVendorRepository0) {
        return new GetRevenueGraphUseCase(revenueVendorRepository0);
    }
}

