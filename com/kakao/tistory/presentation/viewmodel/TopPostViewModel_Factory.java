package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.statistics.usecase.GetTopEntriesUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class TopPostViewModel_Factory implements Factory {
    public final Provider a;

    public TopPostViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static TopPostViewModel_Factory create(Provider provider0) {
        return new TopPostViewModel_Factory(provider0);
    }

    public TopPostViewModel get() {
        return TopPostViewModel_Factory.newInstance(((GetTopEntriesUseCase)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static TopPostViewModel newInstance(GetTopEntriesUseCase getTopEntriesUseCase0) {
        return new TopPostViewModel(getTopEntriesUseCase0);
    }
}

