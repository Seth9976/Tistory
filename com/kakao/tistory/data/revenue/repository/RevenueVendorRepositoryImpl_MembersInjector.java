package com.kakao.tistory.data.revenue.repository;

import com.kakao.tistory.data.repository.BaseRepository_MembersInjector;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class RevenueVendorRepositoryImpl_MembersInjector implements MembersInjector {
    public final Provider a;

    public RevenueVendorRepositoryImpl_MembersInjector(Provider provider0) {
        this.a = provider0;
    }

    public static MembersInjector create(Provider provider0) {
        return new RevenueVendorRepositoryImpl_MembersInjector(provider0);
    }

    public void injectMembers(RevenueVendorRepositoryImpl revenueVendorRepositoryImpl0) {
        BaseRepository_MembersInjector.injectThrowableRepository(revenueVendorRepositoryImpl0, ((ThrowableRepository)this.a.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((RevenueVendorRepositoryImpl)object0));
    }
}

