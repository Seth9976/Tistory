package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@KeepForSdk
@VisibleForTesting
public final class ClientSettings {
    @KeepForSdk
    public static final class Builder {
        public Account a;
        public ArraySet b;
        public String c;
        public String d;
        public final SignInOptions e;

        public Builder() {
            this.e = SignInOptions.zaa;
        }

        @NonNull
        @KeepForSdk
        public ClientSettings build() {
            return new ClientSettings(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }

        @NonNull
        @KeepForSdk
        public Builder setRealClientPackageName(@NonNull String s) {
            this.c = s;
            return this;
        }

        @NonNull
        public final Builder zaa(@NonNull Collection collection0) {
            if(this.b == null) {
                this.b = new ArraySet();
            }
            this.b.addAll(collection0);
            return this;
        }

        @NonNull
        public final Builder zab(@Nullable Account account0) {
            this.a = account0;
            return this;
        }

        @NonNull
        public final Builder zac(@NonNull String s) {
            this.d = s;
            return this;
        }
    }

    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final int e;
    public final View f;
    public final String g;
    public final String h;
    public final SignInOptions i;
    public Integer j;

    @KeepForSdk
    public ClientSettings(@NonNull Account account0, @NonNull Set set0, @NonNull Map map0, int v, @Nullable View view0, @NonNull String s, @NonNull String s1, @Nullable SignInOptions signInOptions0) {
        this(account0, set0, map0, v, view0, s, s1, signInOptions0, false);
    }

    public ClientSettings(@Nullable Account account0, @NonNull Set set0, @NonNull Map map0, int v, @Nullable View view0, @NonNull String s, @NonNull String s1, @Nullable SignInOptions signInOptions0, boolean z) {
        this.a = account0;
        Set set1 = set0 == null ? Collections.emptySet() : Collections.unmodifiableSet(set0);
        this.b = set1;
        if(map0 == null) {
            map0 = Collections.emptyMap();
        }
        this.d = map0;
        this.f = view0;
        this.e = v;
        this.g = s;
        this.h = s1;
        if(signInOptions0 == null) {
            signInOptions0 = SignInOptions.zaa;
        }
        this.i = signInOptions0;
        HashSet hashSet0 = new HashSet(set1);
        for(Object object0: map0.values()) {
            hashSet0.addAll(((zab)object0).zaa);
        }
        this.c = Collections.unmodifiableSet(hashSet0);
    }

    @NonNull
    @KeepForSdk
    public static ClientSettings createDefault(@NonNull Context context0) {
        return new com.google.android.gms.common.api.GoogleApiClient.Builder(context0).zaa();
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    public Account getAccount() {
        return this.a;
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    @Deprecated
    public String getAccountName() {
        return this.a == null ? null : this.a.name;
    }

    @NonNull
    @KeepForSdk
    public Account getAccountOrDefault() {
        return this.a == null ? new Account("<<default account>>", "com.google") : this.a;
    }

    @NonNull
    @KeepForSdk
    public Set getAllRequestedScopes() {
        return this.c;
    }

    @NonNull
    @KeepForSdk
    public Set getApplicableScopes(@NonNull Api api0) {
        zab zab0 = (zab)this.d.get(api0);
        Set set0 = this.b;
        if(zab0 != null && !zab0.zaa.isEmpty()) {
            Set set1 = new HashSet(set0);
            set1.addAll(zab0.zaa);
            return set1;
        }
        return set0;
    }

    @KeepForSdk
    public int getGravityForPopups() {
        return this.e;
    }

    @NonNull
    @KeepForSdk
    public String getRealClientPackageName() {
        return this.g;
    }

    @NonNull
    @KeepForSdk
    public Set getRequiredScopes() {
        return this.b;
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    public View getViewForPopups() {
        return this.f;
    }

    @NonNull
    public final SignInOptions zaa() {
        return this.i;
    }

    @androidx.annotation.Nullable
    public final Integer zab() {
        return this.j;
    }

    @androidx.annotation.Nullable
    public final String zac() {
        return this.h;
    }

    @NonNull
    public final Map zad() {
        return this.d;
    }

    public final void zae(@NonNull Integer integer0) {
        this.j = integer0;
    }
}

