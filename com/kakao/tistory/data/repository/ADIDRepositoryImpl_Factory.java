package com.kakao.tistory.data.repository;

import android.content.Context;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
@ScopeMetadata
public final class ADIDRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public ADIDRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static ADIDRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new ADIDRepositoryImpl_Factory(provider0, provider1);
    }

    public ADIDRepositoryImpl get() {
        ADIDRepositoryImpl aDIDRepositoryImpl0 = ADIDRepositoryImpl_Factory.newInstance(((Context)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(aDIDRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return aDIDRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static ADIDRepositoryImpl newInstance(Context context0) {
        return new ADIDRepositoryImpl(context0);
    }
}

