package com.kakao.tistory.module;

import android.content.Context;
import com.kakao.tistory.data.preference.AppSessionPreference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
@ScopeMetadata("javax.inject.Singleton")
public final class PreferenceModule_ProvideAppSessionPreferenceFactory implements Factory {
    public final PreferenceModule a;
    public final Provider b;

    public PreferenceModule_ProvideAppSessionPreferenceFactory(PreferenceModule preferenceModule0, Provider provider0) {
        this.a = preferenceModule0;
        this.b = provider0;
    }

    public static PreferenceModule_ProvideAppSessionPreferenceFactory create(PreferenceModule preferenceModule0, Provider provider0) {
        return new PreferenceModule_ProvideAppSessionPreferenceFactory(preferenceModule0, provider0);
    }

    public AppSessionPreference get() {
        Context context0 = (Context)this.b.get();
        return PreferenceModule_ProvideAppSessionPreferenceFactory.provideAppSessionPreference(this.a, context0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static AppSessionPreference provideAppSessionPreference(PreferenceModule preferenceModule0, Context context0) {
        return (AppSessionPreference)Preconditions.checkNotNullFromProvides(preferenceModule0.provideAppSessionPreference(context0));
    }
}

