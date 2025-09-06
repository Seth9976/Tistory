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
public final class GetRevenueCurrentUseCase_Factory implements Factory {
    public final Provider a;

    public GetRevenueCurrentUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetRevenueCurrentUseCase_Factory create(Provider provider0) {
        return new GetRevenueCurrentUseCase_Factory(provider0);
    }

    public GetRevenueCurrentUseCase get() {
        return GetRevenueCurrentUseCase_Factory.newInstance(((RevenueVendorRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetRevenueCurrentUseCase newInstance(RevenueVendorRepository revenueVendorRepository0) {
        return new GetRevenueCurrentUseCase(revenueVendorRepository0);
    }
}

