package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.repository.SessionRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class CommonWebViewModel_Factory implements Factory {
    public final Provider a;

    public CommonWebViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static CommonWebViewModel_Factory create(Provider provider0) {
        return new CommonWebViewModel_Factory(provider0);
    }

    public CommonWebViewModel get() {
        return CommonWebViewModel_Factory.newInstance(((SessionRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static CommonWebViewModel newInstance(SessionRepository sessionRepository0) {
        return new CommonWebViewModel(sessionRepository0);
    }
}

