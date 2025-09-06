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
public final class GetRevenueSupportUseCase_Factory implements Factory {
    public final Provider a;

    public GetRevenueSupportUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetRevenueSupportUseCase_Factory create(Provider provider0) {
        return new GetRevenueSupportUseCase_Factory(provider0);
    }

    public GetRevenueSupportUseCase get() {
        return GetRevenueSupportUseCase_Factory.newInstance(((RevenueVendorRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetRevenueSupportUseCase newInstance(RevenueVendorRepository revenueVendorRepository0) {
        return new GetRevenueSupportUseCase(revenueVendorRepository0);
    }
}

