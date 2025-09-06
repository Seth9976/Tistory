package com.kakao.tistory.presentation.screen.revenue.vendorswitch;

import com.kakao.tistory.domain.revenue.usecase.GetRevenueVendorListUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class VendorSwitchViewModel_Factory implements Factory {
    public final Provider a;

    public VendorSwitchViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static VendorSwitchViewModel_Factory create(Provider provider0) {
        return new VendorSwitchViewModel_Factory(provider0);
    }

    public VendorSwitchViewModel get() {
        return VendorSwitchViewModel_Factory.newInstance(((GetRevenueVendorListUseCase)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static VendorSwitchViewModel newInstance(GetRevenueVendorListUseCase getRevenueVendorListUseCase0) {
        return new VendorSwitchViewModel(getRevenueVendorListUseCase0);
    }
}

