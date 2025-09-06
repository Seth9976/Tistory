package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.SecretLabRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetServerHostListUseCase_Factory implements Factory {
    public final Provider a;

    public GetServerHostListUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetServerHostListUseCase_Factory create(Provider provider0) {
        return new GetServerHostListUseCase_Factory(provider0);
    }

    public GetServerHostListUseCase get() {
        return GetServerHostListUseCase_Factory.newInstance(((SecretLabRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetServerHostListUseCase newInstance(SecretLabRepository secretLabRepository0) {
        return new GetServerHostListUseCase(secretLabRepository0);
    }
}

