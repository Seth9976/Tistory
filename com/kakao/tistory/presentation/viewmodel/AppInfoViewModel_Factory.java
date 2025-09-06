package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.usecase.GetAppInfoUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class AppInfoViewModel_Factory implements Factory {
    public final Provider a;

    public AppInfoViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static AppInfoViewModel_Factory create(Provider provider0) {
        return new AppInfoViewModel_Factory(provider0);
    }

    public AppInfoViewModel get() {
        return AppInfoViewModel_Factory.newInstance(((GetAppInfoUseCase)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static AppInfoViewModel newInstance(GetAppInfoUseCase getAppInfoUseCase0) {
        return new AppInfoViewModel(getAppInfoUseCase0);
    }
}

