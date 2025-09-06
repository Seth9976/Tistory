package com.kakao.tistory.domain.home.usecase;

import com.kakao.tistory.domain.home.repository.HomeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetCategorySlotListUseCase_Factory implements Factory {
    public final Provider a;

    public GetCategorySlotListUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetCategorySlotListUseCase_Factory create(Provider provider0) {
        return new GetCategorySlotListUseCase_Factory(provider0);
    }

    public GetCategorySlotListUseCase get() {
        return GetCategorySlotListUseCase_Factory.newInstance(((HomeRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetCategorySlotListUseCase newInstance(HomeRepository homeRepository0) {
        return new GetCategorySlotListUseCase(homeRepository0);
    }
}

