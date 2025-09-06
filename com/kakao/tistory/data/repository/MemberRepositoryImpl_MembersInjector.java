package com.kakao.tistory.data.repository;

import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class MemberRepositoryImpl_MembersInjector implements MembersInjector {
    public final Provider a;

    public MemberRepositoryImpl_MembersInjector(Provider provider0) {
        this.a = provider0;
    }

    public static MembersInjector create(Provider provider0) {
        return new MemberRepositoryImpl_MembersInjector(provider0);
    }

    public void injectMembers(MemberRepositoryImpl memberRepositoryImpl0) {
        BaseRepository_MembersInjector.injectThrowableRepository(memberRepositoryImpl0, ((ThrowableRepository)this.a.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((MemberRepositoryImpl)object0));
    }
}

