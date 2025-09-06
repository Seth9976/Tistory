package com.kakao.tistory.module;

import android.content.Context;
import com.kakao.tistory.domain.repository.NotificationRepository;
import com.kakao.tistory.presentation.common.push.PushMessageBuilder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
@ScopeMetadata
public final class PushBuilderModule_ProvidePushMessageBuilderFactory implements Factory {
    public final PushBuilderModule a;
    public final Provider b;
    public final Provider c;

    public PushBuilderModule_ProvidePushMessageBuilderFactory(PushBuilderModule pushBuilderModule0, Provider provider0, Provider provider1) {
        this.a = pushBuilderModule0;
        this.b = provider0;
        this.c = provider1;
    }

    public static PushBuilderModule_ProvidePushMessageBuilderFactory create(PushBuilderModule pushBuilderModule0, Provider provider0, Provider provider1) {
        return new PushBuilderModule_ProvidePushMessageBuilderFactory(pushBuilderModule0, provider0, provider1);
    }

    public PushMessageBuilder get() {
        NotificationRepository notificationRepository0 = (NotificationRepository)this.b.get();
        Context context0 = (Context)this.c.get();
        return PushBuilderModule_ProvidePushMessageBuilderFactory.providePushMessageBuilder(this.a, notificationRepository0, context0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PushMessageBuilder providePushMessageBuilder(PushBuilderModule pushBuilderModule0, NotificationRepository notificationRepository0, Context context0) {
        return (PushMessageBuilder)Preconditions.checkNotNullFromProvides(pushBuilderModule0.providePushMessageBuilder(notificationRepository0, context0));
    }
}

