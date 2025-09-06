package com.kakao.tistory.data.repository;

import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class BaseRepository_MembersInjector implements MembersInjector {
    public final Provider a;

    public BaseRepository_MembersInjector(Provider provider0) {
        this.a = provider0;
    }

    public static MembersInjector create(Provider provider0) {
        return new BaseRepository_MembersInjector(provider0);
    }

    public void injectMembers(BaseRepository baseRepository0) {
        BaseRepository_MembersInjector.injectThrowableRepository(baseRepository0, ((ThrowableRepository)this.a.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((BaseRepository)object0));
    }

    @InjectedFieldSignature("com.kakao.tistory.data.repository.BaseRepository.throwableRepository")
    public static void injectThrowableRepository(BaseRepository baseRepository0, ThrowableRepository throwableRepository0) {
        baseRepository0.throwableRepository = throwableRepository0;
    }
}

