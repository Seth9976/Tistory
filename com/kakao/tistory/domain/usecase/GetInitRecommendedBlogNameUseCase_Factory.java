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
public final class GetInitRecommendedBlogNameUseCase_Factory implements Factory {
    public final Provider a;

    public GetInitRecommendedBlogNameUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetInitRecommendedBlogNameUseCase_Factory create(Provider provider0) {
        return new GetInitRecommendedBlogNameUseCase_Factory(provider0);
    }

    public GetInitRecommendedBlogNameUseCase get() {
        return GetInitRecommendedBlogNameUseCase_Factory.newInstance(((MemberRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetInitRecommendedBlogNameUseCase newInstance(MemberRepository memberRepository0) {
        return new GetInitRecommendedBlogNameUseCase(memberRepository0);
    }
}

