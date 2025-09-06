package com.kakao.tistory.module;

import android.content.Context;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
@ScopeMetadata("javax.inject.Singleton")
public final class PreferenceModule_ProvideDeviceInfoPreferenceFactory implements Factory {
    public final PreferenceModule a;
    public final Provider b;

    public PreferenceModule_ProvideDeviceInfoPreferenceFactory(PreferenceModule preferenceModule0, Provider provider0) {
        this.a = preferenceModule0;
        this.b = provider0;
    }

    public static PreferenceModule_ProvideDeviceInfoPreferenceFactory create(PreferenceModule preferenceModule0, Provider provider0) {
        return new PreferenceModule_ProvideDeviceInfoPreferenceFactory(preferenceModule0, provider0);
    }

    public DeviceInfoPreference get() {
        Context context0 = (Context)this.b.get();
        return PreferenceModule_ProvideDeviceInfoPreferenceFactory.provideDeviceInfoPreference(this.a, context0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static DeviceInfoPreference provideDeviceInfoPreference(PreferenceModule preferenceModule0, Context context0) {
        return (DeviceInfoPreference)Preconditions.checkNotNullFromProvides(preferenceModule0.provideDeviceInfoPreference(context0));
    }
}

