package com.kakao.tistory.presentation.view.setting.notice;

import com.kakao.tistory.domain.blog.usecase.GetEntryListUseCase;
import com.kakao.tistory.domain.repository.EntryRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class SettingNoticeListViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public SettingNoticeListViewModel_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static SettingNoticeListViewModel_Factory create(Provider provider0, Provider provider1) {
        return new SettingNoticeListViewModel_Factory(provider0, provider1);
    }

    public SettingNoticeListViewModel get() {
        return SettingNoticeListViewModel_Factory.newInstance(((GetEntryListUseCase)this.a.get()), ((EntryRepository)this.b.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SettingNoticeListViewModel newInstance(GetEntryListUseCase getEntryListUseCase0, EntryRepository entryRepository0) {
        return new SettingNoticeListViewModel(getEntryListUseCase0, entryRepository0);
    }
}

