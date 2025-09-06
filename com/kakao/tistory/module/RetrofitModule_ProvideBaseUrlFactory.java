package com.kakao.tistory.module;

import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.domain.entity.BuildType;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
public final class RetrofitModule_ProvideBaseUrlFactory implements Factory {
    public final RetrofitModule a;
    public final Provider b;
    public final Provider c;

    public RetrofitModule_ProvideBaseUrlFactory(RetrofitModule retrofitModule0, Provider provider0, Provider provider1) {
        this.a = retrofitModule0;
        this.b = provider0;
        this.c = provider1;
    }

    public static RetrofitModule_ProvideBaseUrlFactory create(RetrofitModule retrofitModule0, Provider provider0, Provider provider1) {
        return new RetrofitModule_ProvideBaseUrlFactory(retrofitModule0, provider0, provider1);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public String get() {
        DeviceInfoPreference deviceInfoPreference0 = (DeviceInfoPreference)this.b.get();
        BuildType buildType0 = (BuildType)this.c.get();
        return RetrofitModule_ProvideBaseUrlFactory.provideBaseUrl(this.a, deviceInfoPreference0, buildType0);
    }

    public static String provideBaseUrl(RetrofitModule retrofitModule0, DeviceInfoPreference deviceInfoPreference0, BuildType buildType0) {
        return (String)Preconditions.checkNotNullFromProvides(retrofitModule0.provideBaseUrl(deviceInfoPreference0, buildType0));
    }
}

