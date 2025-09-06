package com.kakao.tistory.data.preference;

import androidx.datastore.core.DataStore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
public final class HomePreference_Factory implements Factory {
    public final Provider a;

    public HomePreference_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static HomePreference_Factory create(Provider provider0) {
        return new HomePreference_Factory(provider0);
    }

    public HomePreference get() {
        return HomePreference_Factory.newInstance(((DataStore)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static HomePreference newInstance(DataStore dataStore0) {
        return new HomePreference(dataStore0);
    }
}

