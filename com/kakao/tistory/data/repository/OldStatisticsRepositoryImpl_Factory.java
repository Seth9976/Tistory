package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.OldBlogStatisticsService;
import com.kakao.tistory.data.service.OldEntryStatisticsService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class OldStatisticsRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public OldStatisticsRepositoryImpl_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static OldStatisticsRepositoryImpl_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new OldStatisticsRepositoryImpl_Factory(provider0, provider1, provider2);
    }

    public OldStatisticsRepositoryImpl get() {
        OldStatisticsRepositoryImpl oldStatisticsRepositoryImpl0 = OldStatisticsRepositoryImpl_Factory.newInstance(((OldBlogStatisticsService)this.a.get()), ((OldEntryStatisticsService)this.b.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(oldStatisticsRepositoryImpl0, ((ThrowableRepository)this.c.get()));
        return oldStatisticsRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static OldStatisticsRepositoryImpl newInstance(OldBlogStatisticsService oldBlogStatisticsService0, OldEntryStatisticsService oldEntryStatisticsService0) {
        return new OldStatisticsRepositoryImpl(oldBlogStatisticsService0, oldEntryStatisticsService0);
    }
}

