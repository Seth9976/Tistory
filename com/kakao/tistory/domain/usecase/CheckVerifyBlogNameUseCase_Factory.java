package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.MemberRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class CheckVerifyBlogNameUseCase_Factory implements Factory {
    public final Provider a;

    public CheckVerifyBlogNameUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static CheckVerifyBlogNameUseCase_Factory create(Provider provider0) {
        return new CheckVerifyBlogNameUseCase_Factory(provider0);
    }

    public CheckVerifyBlogNameUseCase get() {
        return CheckVerifyBlogNameUseCase_Factory.newInstance(((MemberRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static CheckVerifyBlogNameUseCase newInstance(MemberRepository memberRepository0) {
        return new CheckVerifyBlogNameUseCase(memberRepository0);
    }
}

