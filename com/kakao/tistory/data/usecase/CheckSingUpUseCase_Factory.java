package com.kakao.tistory.data.usecase;

import com.kakao.tistory.domain.repository.MemberRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class CheckSingUpUseCase_Factory implements Factory {
    public final Provider a;

    public CheckSingUpUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static CheckSingUpUseCase_Factory create(Provider provider0) {
        return new CheckSingUpUseCase_Factory(provider0);
    }

    public CheckSingUpUseCase get() {
        return CheckSingUpUseCase_Factory.newInstance(((MemberRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static CheckSingUpUseCase newInstance(MemberRepository memberRepository0) {
        return new CheckSingUpUseCase(memberRepository0);
    }
}

