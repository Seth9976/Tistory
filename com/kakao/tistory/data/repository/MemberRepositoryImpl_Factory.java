package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.MemberService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class MemberRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public MemberRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static MemberRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new MemberRepositoryImpl_Factory(provider0, provider1);
    }

    public MemberRepositoryImpl get() {
        MemberRepositoryImpl memberRepositoryImpl0 = MemberRepositoryImpl_Factory.newInstance(((MemberService)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(memberRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return memberRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static MemberRepositoryImpl newInstance(MemberService memberService0) {
        return new MemberRepositoryImpl(memberService0);
    }
}

