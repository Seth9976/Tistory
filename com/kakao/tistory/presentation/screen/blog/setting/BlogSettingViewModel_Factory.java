package com.kakao.tistory.presentation.screen.blog.setting;

import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.AppInfoRepository;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import com.kakao.tistory.domain.usecase.CheckVerifyBlogNicknameUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class BlogSettingViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;

    public BlogSettingViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    public static BlogSettingViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        return new BlogSettingViewModel_Factory(provider0, provider1, provider2, provider3);
    }

    public BlogSettingViewModel get() {
        return BlogSettingViewModel_Factory.newInstance(((AppInfoRepository)this.a.get()), ((OldBlogRepository)this.b.get()), ((AccountRepository)this.c.get()), ((CheckVerifyBlogNicknameUseCase)this.d.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static BlogSettingViewModel newInstance(AppInfoRepository appInfoRepository0, OldBlogRepository oldBlogRepository0, AccountRepository accountRepository0, CheckVerifyBlogNicknameUseCase checkVerifyBlogNicknameUseCase0) {
        return new BlogSettingViewModel(appInfoRepository0, oldBlogRepository0, accountRepository0, checkVerifyBlogNicknameUseCase0);
    }
}

