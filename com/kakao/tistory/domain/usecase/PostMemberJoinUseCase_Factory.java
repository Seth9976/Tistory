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
public final class PostMemberJoinUseCase_Factory implements Factory {
    public final Provider a;

    public PostMemberJoinUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static PostMemberJoinUseCase_Factory create(Provider provider0) {
        return new PostMemberJoinUseCase_Factory(provider0);
    }

    public PostMemberJoinUseCase get() {
        return PostMemberJoinUseCase_Factory.newInstance(((MemberRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PostMemberJoinUseCase newInstance(MemberRepository memberRepository0) {
        return new PostMemberJoinUseCase(memberRepository0);
    }
}

