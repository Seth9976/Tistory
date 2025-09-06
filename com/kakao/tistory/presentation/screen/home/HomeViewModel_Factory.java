package com.kakao.tistory.presentation.screen.home;

import com.kakao.tistory.domain.home.usecase.GetCategorySlotListUseCase;
import com.kakao.tistory.domain.home.usecase.GetHomeSlotListUseCase;
import com.kakao.tistory.domain.home.usecase.SetCategoryPreferenceUseCase;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.usecase.FollowBlogUseCase;
import com.kakao.tistory.domain.usecase.UnFollowBlogUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class HomeViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;

    public HomeViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
    }

    public static HomeViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new HomeViewModel_Factory(provider0, provider1, provider2, provider3, provider4, provider5);
    }

    public HomeViewModel get() {
        return HomeViewModel_Factory.newInstance(((AccountRepository)this.a.get()), ((GetHomeSlotListUseCase)this.b.get()), ((GetCategorySlotListUseCase)this.c.get()), ((SetCategoryPreferenceUseCase)this.d.get()), ((FollowBlogUseCase)this.e.get()), ((UnFollowBlogUseCase)this.f.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static HomeViewModel newInstance(AccountRepository accountRepository0, GetHomeSlotListUseCase getHomeSlotListUseCase0, GetCategorySlotListUseCase getCategorySlotListUseCase0, SetCategoryPreferenceUseCase setCategoryPreferenceUseCase0, FollowBlogUseCase followBlogUseCase0, UnFollowBlogUseCase unFollowBlogUseCase0) {
        return new HomeViewModel(accountRepository0, getHomeSlotListUseCase0, getCategorySlotListUseCase0, setCategoryPreferenceUseCase0, followBlogUseCase0, unFollowBlogUseCase0);
    }
}

