package com.kakao.tistory.module;

import android.content.Context;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.presentation.common.push.PushChannelBuilder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.jetbrains.annotations.Nullable;

@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
@ScopeMetadata
public final class PushBuilderModule_ProvidePushChannelBuilderFactory implements Factory {
    public final PushBuilderModule a;
    public final Provider b;
    public final Provider c;

    public PushBuilderModule_ProvidePushChannelBuilderFactory(PushBuilderModule pushBuilderModule0, Provider provider0, Provider provider1) {
        this.a = pushBuilderModule0;
        this.b = provider0;
        this.c = provider1;
    }

    public static PushBuilderModule_ProvidePushChannelBuilderFactory create(PushBuilderModule pushBuilderModule0, Provider provider0, Provider provider1) {
        return new PushBuilderModule_ProvidePushChannelBuilderFactory(pushBuilderModule0, provider0, provider1);
    }

    @Nullable
    public PushChannelBuilder get() {
        Context context0 = (Context)this.b.get();
        DeviceInfoPreference deviceInfoPreference0 = (DeviceInfoPreference)this.c.get();
        return PushBuilderModule_ProvidePushChannelBuilderFactory.providePushChannelBuilder(this.a, context0, deviceInfoPreference0);
    }

    @Override  // javax.inject.Provider
    @Nullable
    public Object get() {
        return this.get();
    }

    @Nullable
    public static PushChannelBuilder providePushChannelBuilder(PushBuilderModule pushBuilderModule0, Context context0, DeviceInfoPreference deviceInfoPreference0) {
        return pushBuilderModule0.providePushChannelBuilder(context0, deviceInfoPreference0);
    }
}

