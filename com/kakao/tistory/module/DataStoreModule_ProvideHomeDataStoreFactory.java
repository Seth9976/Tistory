package com.kakao.tistory.module;

import android.content.Context;
import androidx.datastore.core.DataStore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"javax.inject.Named", "dagger.hilt.android.qualifiers.ApplicationContext"})
@ScopeMetadata("javax.inject.Singleton")
public final class DataStoreModule_ProvideHomeDataStoreFactory implements Factory {
    public final DataStoreModule a;
    public final Provider b;

    public DataStoreModule_ProvideHomeDataStoreFactory(DataStoreModule dataStoreModule0, Provider provider0) {
        this.a = dataStoreModule0;
        this.b = provider0;
    }

    public static DataStoreModule_ProvideHomeDataStoreFactory create(DataStoreModule dataStoreModule0, Provider provider0) {
        return new DataStoreModule_ProvideHomeDataStoreFactory(dataStoreModule0, provider0);
    }

    public DataStore get() {
        Context context0 = (Context)this.b.get();
        return DataStoreModule_ProvideHomeDataStoreFactory.provideHomeDataStore(this.a, context0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static DataStore provideHomeDataStore(DataStoreModule dataStoreModule0, Context context0) {
        return (DataStore)Preconditions.checkNotNullFromProvides(dataStoreModule0.provideHomeDataStore(context0));
    }
}

