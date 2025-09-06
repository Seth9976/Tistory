package com.kakao.tistory.module;

import android.content.Context;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.domain.repository.NotificationRepository;
import com.kakao.tistory.presentation.common.push.PushChannelBuilder;
import com.kakao.tistory.presentation.common.push.PushMessageBuilder;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Module
@InstallIn({SingletonComponent.class})
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0007J\u001A\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/module/PushBuilderModule;", "", "()V", "providePushChannelBuilder", "Lcom/kakao/tistory/presentation/common/push/PushChannelBuilder;", "context", "Landroid/content/Context;", "deviceInfoPreference", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "providePushMessageBuilder", "Lcom/kakao/tistory/presentation/common/push/PushMessageBuilder;", "notificationRepository", "Lcom/kakao/tistory/domain/repository/NotificationRepository;", "tistory-3.0.8(3080)_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PushBuilderModule {
    @Provides
    @Nullable
    public final PushChannelBuilder providePushChannelBuilder(@ApplicationContext @NotNull Context context0, @NotNull DeviceInfoPreference deviceInfoPreference0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        return new PushChannelBuilder(context0, deviceInfoPreference0);
    }

    @Provides
    @NotNull
    public final PushMessageBuilder providePushMessageBuilder(@NotNull NotificationRepository notificationRepository0, @ApplicationContext @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(notificationRepository0, "notificationRepository");
        Intrinsics.checkNotNullParameter(context0, "context");
        return new PushMessageBuilder(notificationRepository0, context0);
    }
}

