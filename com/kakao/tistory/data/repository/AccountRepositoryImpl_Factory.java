package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.preference.AppSessionPreference;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.service.AccountService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class AccountRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;

    public AccountRepositoryImpl_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    public static AccountRepositoryImpl_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        return new AccountRepositoryImpl_Factory(provider0, provider1, provider2, provider3);
    }

    public AccountRepositoryImpl get() {
        AccountRepositoryImpl accountRepositoryImpl0 = AccountRepositoryImpl_Factory.newInstance(((AppSessionPreference)this.a.get()), ((DeviceInfoPreference)this.b.get()), ((AccountService)this.c.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(accountRepositoryImpl0, ((ThrowableRepository)this.d.get()));
        return accountRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static AccountRepositoryImpl newInstance(AppSessionPreference appSessionPreference0, DeviceInfoPreference deviceInfoPreference0, AccountService accountService0) {
        return new AccountRepositoryImpl(appSessionPreference0, deviceInfoPreference0, accountService0);
    }
}

