package com.kakao.tistory.module;

import ac.a;
import ac.b;
import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Module
@InstallIn({SingletonComponent.class})
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0006\u001A\u00020\u0007H\u0007J\u0018\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0006\u001A\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/module/DataStoreModule;", "", "()V", "provideBlogDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "context", "Landroid/content/Context;", "provideHomeDataStore", "tistory-3.0.8(3080)_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DataStoreModule {
    @Provides
    @Named("Blog")
    @Singleton
    @NotNull
    public final DataStore provideBlogDataStore(@ApplicationContext @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler0 = new ReplaceFileCorruptionHandler(a.x);
        b b0 = new b(context0, 0);
        return PreferenceDataStoreFactory.create$default(PreferenceDataStoreFactory.INSTANCE, replaceFileCorruptionHandler0, null, null, b0, 6, null);
    }

    @Provides
    @Named("home")
    @Singleton
    @NotNull
    public final DataStore provideHomeDataStore(@ApplicationContext @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler0 = new ReplaceFileCorruptionHandler(a.y);
        b b0 = new b(context0, 1);
        return PreferenceDataStoreFactory.create$default(PreferenceDataStoreFactory.INSTANCE, replaceFileCorruptionHandler0, null, null, b0, 6, null);
    }
}

