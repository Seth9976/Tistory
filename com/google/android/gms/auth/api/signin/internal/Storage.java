package com.google.android.gms.auth.api.signin.internal;

import a5.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

@KeepForSdk
public class Storage {
    public final ReentrantLock a;
    public final SharedPreferences b;
    public static final ReentrantLock c;
    public static Storage d;

    static {
        Storage.c = new ReentrantLock();
    }

    public Storage(Context context0) {
        this.a = new ReentrantLock();
        this.b = context0.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static final String a(String s, String s1) {
        return b.q(new StringBuilder(s.length() + 1 + String.valueOf(s1).length()), s, ":", s1);
    }

    @KeepForSdk
    public void clear() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
        }
        finally {
            this.a.unlock();
        }
    }

    @NonNull
    @KeepForSdk
    public static Storage getInstance(@NonNull Context context0) {
        Preconditions.checkNotNull(context0);
        ReentrantLock reentrantLock0 = Storage.c;
        reentrantLock0.lock();
        try {
            if(Storage.d == null) {
                Storage.d = new Storage(context0.getApplicationContext());
            }
            return Storage.d;
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Nullable
    @KeepForSdk
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String s = this.zaa("defaultGoogleSignInAccount");
        if(!TextUtils.isEmpty(s)) {
            String s1 = this.zaa(Storage.a("googleSignInAccount", s));
            if(s1 != null) {
                try {
                    return GoogleSignInAccount.zab(s1);
                }
                catch(JSONException unused_ex) {
                }
            }
        }
        return null;
    }

    @Nullable
    @KeepForSdk
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String s = this.zaa("defaultGoogleSignInAccount");
        if(!TextUtils.isEmpty(s)) {
            String s1 = this.zaa(Storage.a("googleSignInOptions", s));
            if(s1 != null) {
                try {
                    return GoogleSignInOptions.zab(s1);
                }
                catch(JSONException unused_ex) {
                }
            }
        }
        return null;
    }

    @Nullable
    @KeepForSdk
    public String getSavedRefreshToken() {
        return this.zaa("refreshToken");
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(@NonNull GoogleSignInAccount googleSignInAccount0, @NonNull GoogleSignInOptions googleSignInOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0);
        Preconditions.checkNotNull(googleSignInOptions0);
        this.zad("defaultGoogleSignInAccount", googleSignInAccount0.zac());
        Preconditions.checkNotNull(googleSignInAccount0);
        Preconditions.checkNotNull(googleSignInOptions0);
        String s = googleSignInAccount0.zac();
        this.zad(Storage.a("googleSignInAccount", s), googleSignInAccount0.zad());
        this.zad(Storage.a("googleSignInOptions", s), googleSignInOptions0.zaf());
    }

    @Nullable
    public final String zaa(@NonNull String s) {
        this.a.lock();
        try {
            return this.b.getString(s, null);
        }
        finally {
            this.a.unlock();
        }
    }

    public final void zab(@NonNull String s) {
        this.a.lock();
        try {
            this.b.edit().remove(s).apply();
        }
        finally {
            this.a.unlock();
        }
    }

    public final void zac() {
        String s = this.zaa("defaultGoogleSignInAccount");
        this.zab("defaultGoogleSignInAccount");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.zab(Storage.a("googleSignInAccount", s));
        this.zab(Storage.a("googleSignInOptions", s));
    }

    public final void zad(@NonNull String s, @NonNull String s1) {
        this.a.lock();
        try {
            this.b.edit().putString(s, s1).apply();
        }
        finally {
            this.a.unlock();
        }
    }
}

