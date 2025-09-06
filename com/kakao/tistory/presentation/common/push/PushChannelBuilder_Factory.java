package com.kakao.tistory.presentation.common.push;

import android.content.Context;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class PushChannelBuilder_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public PushChannelBuilder_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static PushChannelBuilder_Factory create(Provider provider0, Provider provider1) {
        return new PushChannelBuilder_Factory(provider0, provider1);
    }

    public PushChannelBuilder get() {
        return PushChannelBuilder_Factory.newInstance(((Context)this.a.get()), ((DeviceInfoPreference)this.b.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PushChannelBuilder newInstance(Context context0, DeviceInfoPreference deviceInfoPreference0) {
        return new PushChannelBuilder(context0, deviceInfoPreference0);
    }
}

