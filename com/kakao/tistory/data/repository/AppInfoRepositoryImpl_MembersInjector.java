package com.kakao.tistory.data.repository;

import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class AppInfoRepositoryImpl_MembersInjector implements MembersInjector {
    public final Provider a;

    public AppInfoRepositoryImpl_MembersInjector(Provider provider0) {
        this.a = provider0;
    }

    public static MembersInjector create(Provider provider0) {
        return new AppInfoRepositoryImpl_MembersInjector(provider0);
    }

    public void injectMembers(AppInfoRepositoryImpl appInfoRepositoryImpl0) {
        BaseRepository_MembersInjector.injectThrowableRepository(appInfoRepositoryImpl0, ((ThrowableRepository)this.a.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((AppInfoRepositoryImpl)object0));
    }
}

