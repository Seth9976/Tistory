package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.usecase.LoginByKakaoUseCase;
import com.kakao.tistory.data.usecase.PushTokenUseCase;
import com.kakao.tistory.domain.usecase.CheckVerifyBlogNameUseCase;
import com.kakao.tistory.domain.usecase.GetInitRecommendedBlogNameUseCase;
import com.kakao.tistory.domain.usecase.PostMemberJoinUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class SignUpViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;

    public SignUpViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
    }

    public static SignUpViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new SignUpViewModel_Factory(provider0, provider1, provider2, provider3, provider4, provider5);
    }

    public SignUpViewModel get() {
        return SignUpViewModel_Factory.newInstance(((GetInitRecommendedBlogNameUseCase)this.a.get()), ((CheckVerifyBlogNameUseCase)this.b.get()), ((PostMemberJoinUseCase)this.c.get()), ((LoginByKakaoUseCase)this.d.get()), ((PushTokenUseCase)this.e.get()), ((DeviceInfoPreference)this.f.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SignUpViewModel newInstance(GetInitRecommendedBlogNameUseCase getInitRecommendedBlogNameUseCase0, CheckVerifyBlogNameUseCase checkVerifyBlogNameUseCase0, PostMemberJoinUseCase postMemberJoinUseCase0, LoginByKakaoUseCase loginByKakaoUseCase0, PushTokenUseCase pushTokenUseCase0, DeviceInfoPreference deviceInfoPreference0) {
        return new SignUpViewModel(getInitRecommendedBlogNameUseCase0, checkVerifyBlogNameUseCase0, postMemberJoinUseCase0, loginByKakaoUseCase0, pushTokenUseCase0, deviceInfoPreference0);
    }
}

