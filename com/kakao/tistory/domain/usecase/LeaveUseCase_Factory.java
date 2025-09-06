package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.AutoSaveRepository;
import com.kakao.tistory.domain.repository.SearchRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class LeaveUseCase_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;

    public LeaveUseCase_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
    }

    public static LeaveUseCase_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        return new LeaveUseCase_Factory(provider0, provider1, provider2, provider3, provider4);
    }

    public LeaveUseCase get() {
        return LeaveUseCase_Factory.newInstance(((DeletePushTokenUseCase)this.a.get()), ((GetCurrentBlogNameUseCase)this.b.get()), ((AccountRepository)this.c.get()), ((AutoSaveRepository)this.d.get()), ((SearchRepository)this.e.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static LeaveUseCase newInstance(DeletePushTokenUseCase deletePushTokenUseCase0, GetCurrentBlogNameUseCase getCurrentBlogNameUseCase0, AccountRepository accountRepository0, AutoSaveRepository autoSaveRepository0, SearchRepository searchRepository0) {
        return new LeaveUseCase(deletePushTokenUseCase0, getCurrentBlogNameUseCase0, accountRepository0, autoSaveRepository0, searchRepository0);
    }
}

