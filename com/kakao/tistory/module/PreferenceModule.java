package com.kakao.tistory.module;

import android.content.Context;
import com.kakao.tistory.data.preference.AppSessionPreference;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.preference.SearchPreference;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Module
@InstallIn({SingletonComponent.class})
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001A\u00020\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0007J\u0012\u0010\u0007\u001A\u00020\b2\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0007J\u0012\u0010\t\u001A\u00020\n2\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0007¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/module/PreferenceModule;", "", "()V", "provideAppSessionPreference", "Lcom/kakao/tistory/data/preference/AppSessionPreference;", "context", "Landroid/content/Context;", "provideDeviceInfoPreference", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "provideSearchPreference", "Lcom/kakao/tistory/data/preference/SearchPreference;", "tistory-3.0.8(3080)_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PreferenceModule {
    @Provides
    @Singleton
    @NotNull
    public final AppSessionPreference provideAppSessionPreference(@ApplicationContext @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        return new AppSessionPreference(context0);
    }

    @Provides
    @Singleton
    @NotNull
    public final DeviceInfoPreference provideDeviceInfoPreference(@ApplicationContext @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        return new DeviceInfoPreference(context0);
    }

    @Provides
    @Singleton
    @NotNull
    public final SearchPreference provideSearchPreference(@ApplicationContext @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        return new SearchPreference(context0);
    }
}

