package com.kakao.tistory.presentation.common.push;

import com.kakao.tistory.data.preference.DeviceInfoPreference;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class PushMessagingService_MembersInjector implements MembersInjector {
    public final Provider a;
    public final Provider b;

    public PushMessagingService_MembersInjector(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static MembersInjector create(Provider provider0, Provider provider1) {
        return new PushMessagingService_MembersInjector(provider0, provider1);
    }

    @InjectedFieldSignature("com.kakao.tistory.presentation.common.push.PushMessagingService.deviceInfoPreference")
    public static void injectDeviceInfoPreference(PushMessagingService pushMessagingService0, DeviceInfoPreference deviceInfoPreference0) {
        pushMessagingService0.deviceInfoPreference = deviceInfoPreference0;
    }

    public void injectMembers(PushMessagingService pushMessagingService0) {
        PushMessagingService_MembersInjector.injectPushMessageBuilder(pushMessagingService0, ((PushMessageBuilder)this.a.get()));
        PushMessagingService_MembersInjector.injectDeviceInfoPreference(pushMessagingService0, ((DeviceInfoPreference)this.b.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((PushMessagingService)object0));
    }

    @InjectedFieldSignature("com.kakao.tistory.presentation.common.push.PushMessagingService.pushMessageBuilder")
    public static void injectPushMessageBuilder(PushMessagingService pushMessagingService0, PushMessageBuilder pushMessageBuilder0) {
        pushMessagingService0.pushMessageBuilder = pushMessageBuilder0;
    }
}

