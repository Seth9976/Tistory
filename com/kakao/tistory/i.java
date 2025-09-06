package com.kakao.tistory;

import android.content.Context;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.domain.repository.NotificationRepository;
import com.kakao.tistory.module.PushBuilderModule_ProvidePushMessageBuilderFactory;
import com.kakao.tistory.presentation.common.push.PushMessagingService;
import com.kakao.tistory.presentation.common.push.PushMessagingService_MembersInjector;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;

public final class i extends ServiceC {
    public final k a;

    public i(k k0) {
        this.a = k0;
    }

    @Override  // com.kakao.tistory.presentation.common.push.PushMessagingService_GeneratedInjector
    public final void injectPushMessagingService(PushMessagingService pushMessagingService0) {
        NotificationRepository notificationRepository0 = (NotificationRepository)this.a.e0.get();
        Context context0 = ApplicationContextModule_ProvideContextFactory.provideContext(this.a.a);
        PushMessagingService_MembersInjector.injectPushMessageBuilder(pushMessagingService0, PushBuilderModule_ProvidePushMessageBuilderFactory.providePushMessageBuilder(this.a.c, notificationRepository0, context0));
        PushMessagingService_MembersInjector.injectDeviceInfoPreference(pushMessagingService0, ((DeviceInfoPreference)this.a.j.get()));
    }
}

