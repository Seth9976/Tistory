package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.AppInfoRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetAppInfoUseCase_Factory implements Factory {
    public final Provider a;

    public GetAppInfoUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetAppInfoUseCase_Factory create(Provider provider0) {
        return new GetAppInfoUseCase_Factory(provider0);
    }

    public GetAppInfoUseCase get() {
        return GetAppInfoUseCase_Factory.newInstance(((AppInfoRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetAppInfoUseCase newInstance(AppInfoRepository appInfoRepository0) {
        return new GetAppInfoUseCase(appInfoRepository0);
    }
}

