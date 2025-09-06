package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.domain.revenue.usecase.GetRevenueGraphDetailInfoUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueInfoUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueSupportUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueVendorListUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class RevenueViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;

    public RevenueViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    public static RevenueViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        return new RevenueViewModel_Factory(provider0, provider1, provider2, provider3);
    }

    public RevenueViewModel get() {
        return RevenueViewModel_Factory.newInstance(((GetRevenueVendorListUseCase)this.a.get()), ((GetRevenueInfoUseCase)this.b.get()), ((GetRevenueGraphDetailInfoUseCase)this.c.get()), ((GetRevenueSupportUseCase)this.d.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static RevenueViewModel newInstance(GetRevenueVendorListUseCase getRevenueVendorListUseCase0, GetRevenueInfoUseCase getRevenueInfoUseCase0, GetRevenueGraphDetailInfoUseCase getRevenueGraphDetailInfoUseCase0, GetRevenueSupportUseCase getRevenueSupportUseCase0) {
        return new RevenueViewModel(getRevenueVendorListUseCase0, getRevenueInfoUseCase0, getRevenueGraphDetailInfoUseCase0, getRevenueSupportUseCase0);
    }
}

