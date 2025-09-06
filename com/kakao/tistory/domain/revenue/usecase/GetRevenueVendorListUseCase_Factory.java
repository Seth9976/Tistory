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
public final class GetRevenueVendorListUseCase_Factory implements Factory {
    public final Provider a;

    public GetRevenueVendorListUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetRevenueVendorListUseCase_Factory create(Provider provider0) {
        return new GetRevenueVendorListUseCase_Factory(provider0);
    }

    public GetRevenueVendorListUseCase get() {
        return GetRevenueVendorListUseCase_Factory.newInstance(((RevenueVendorRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetRevenueVendorListUseCase newInstance(RevenueVendorRepository revenueVendorRepository0) {
        return new GetRevenueVendorListUseCase(revenueVendorRepository0);
    }
}

