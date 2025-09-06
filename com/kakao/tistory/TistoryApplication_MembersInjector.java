package com.kakao.tistory;

import com.kakao.tistory.domain.usecase.GetCurrentBlogTitleUseCase;
import com.kakao.tistory.presentation.common.push.PushChannelBuilder;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class TistoryApplication_MembersInjector implements MembersInjector {
    public final Provider a;
    public final Provider b;

    public TistoryApplication_MembersInjector(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static MembersInjector create(Provider provider0, Provider provider1) {
        return new TistoryApplication_MembersInjector(provider0, provider1);
    }

    public void injectMembers(TistoryApplication tistoryApplication0) {
        TistoryApplication_MembersInjector.injectSetPushChannelBuilder(tistoryApplication0, ((PushChannelBuilder)this.a.get()));
        TistoryApplication_MembersInjector.injectSetGetCurrentBlogTitleUseCase(tistoryApplication0, ((GetCurrentBlogTitleUseCase)this.b.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((TistoryApplication)object0));
    }

    public static void injectSetGetCurrentBlogTitleUseCase(TistoryApplication tistoryApplication0, GetCurrentBlogTitleUseCase getCurrentBlogTitleUseCase0) {
        tistoryApplication0.setGetCurrentBlogTitleUseCase(getCurrentBlogTitleUseCase0);
    }

    public static void injectSetPushChannelBuilder(TistoryApplication tistoryApplication0, PushChannelBuilder pushChannelBuilder0) {
        tistoryApplication0.setPushChannelBuilder(pushChannelBuilder0);
    }
}

