package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.text.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public String g;
    public final long h;
    public final String i;
    public final ArrayList j;
    public final String k;
    public final String l;
    public final HashSet m;
    @NonNull
    @VisibleForTesting
    public static Clock zaa;

    static {
        GoogleSignInAccount.CREATOR = new zab();
        GoogleSignInAccount.zaa = DefaultClock.getInstance();
    }

    public GoogleSignInAccount(int v, String s, String s1, String s2, String s3, Uri uri0, String s4, long v1, String s5, ArrayList arrayList0, String s6, String s7) {
        this.m = new HashSet();
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = uri0;
        this.g = s4;
        this.h = v1;
        this.i = s5;
        this.j = arrayList0;
        this.k = s6;
        this.l = s7;
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignInAccount createDefault() {
        Account account0 = new Account("<<default account>>", "com.google");
        HashSet hashSet0 = new HashSet();
        return GoogleSignInAccount.zaa(null, null, account0.name, null, null, null, null, 0L, account0.name, hashSet0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        return object0 instanceof GoogleSignInAccount ? ((GoogleSignInAccount)object0).i.equals(this.i) && ((GoogleSignInAccount)object0).getRequestedScopes().equals(this.getRequestedScopes()) : false;
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignInAccount fromAccount(@NonNull Account account0) {
        ArraySet arraySet0 = new ArraySet();
        return GoogleSignInAccount.zaa(null, null, account0.name, null, null, null, null, 0L, account0.name, arraySet0);
    }

    @Nullable
    public Account getAccount() {
        return this.d == null ? null : new Account(this.d, "com.google");
    }

    @Nullable
    public String getDisplayName() {
        return this.e;
    }

    @Nullable
    public String getEmail() {
        return this.d;
    }

    @Nullable
    public String getFamilyName() {
        return this.l;
    }

    @Nullable
    public String getGivenName() {
        return this.k;
    }

    @NonNull
    public Set getGrantedScopes() {
        return new HashSet(this.j);
    }

    @Nullable
    public String getId() {
        return this.b;
    }

    @Nullable
    public String getIdToken() {
        return this.c;
    }

    @Nullable
    public Uri getPhotoUrl() {
        return this.f;
    }

    @NonNull
    @KeepForSdk
    public Set getRequestedScopes() {
        Set set0 = new HashSet(this.j);
        set0.addAll(this.m);
        return set0;
    }

    @Nullable
    public String getServerAuthCode() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return this.getRequestedScopes().hashCode() + q.c(0x20F, 0x1F, this.i);
    }

    @KeepForSdk
    public boolean isExpired() {
        return GoogleSignInAccount.zaa.currentTimeMillis() / 1000L >= this.h - 300L;
    }

    @NonNull
    @KeepForSdk
    public GoogleSignInAccount requestExtraScopes(@NonNull Scope[] arr_scope) {
        if(arr_scope != null) {
            Collections.addAll(this.m, arr_scope);
        }
        return this;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeString(parcel0, 2, this.getId(), false);
        SafeParcelWriter.writeString(parcel0, 3, this.getIdToken(), false);
        SafeParcelWriter.writeString(parcel0, 4, this.getEmail(), false);
        SafeParcelWriter.writeString(parcel0, 5, this.getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel0, 6, this.getPhotoUrl(), v, false);
        SafeParcelWriter.writeString(parcel0, 7, this.getServerAuthCode(), false);
        SafeParcelWriter.writeLong(parcel0, 8, this.h);
        SafeParcelWriter.writeString(parcel0, 9, this.i, false);
        SafeParcelWriter.writeTypedList(parcel0, 10, this.j, false);
        SafeParcelWriter.writeString(parcel0, 11, this.getGivenName(), false);
        SafeParcelWriter.writeString(parcel0, 12, this.getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @NonNull
    public static GoogleSignInAccount zaa(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable Uri uri0, @Nullable Long long0, @NonNull String s6, @NonNull Set set0) {
        return new GoogleSignInAccount(3, s, s1, s2, s3, uri0, null, ((long)long0), Preconditions.checkNotEmpty(s6), new ArrayList(((Collection)Preconditions.checkNotNull(set0))), s4, s5);
    }

    @Nullable
    public static GoogleSignInAccount zab(@Nullable String s) throws JSONException {
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        JSONObject jSONObject0 = new JSONObject(s);
        String s2 = jSONObject0.optString("photoUrl");
        Uri uri0 = TextUtils.isEmpty(s2) ? null : Uri.parse(s2);
        long v = Long.parseLong(jSONObject0.getString("expirationTime"));
        HashSet hashSet0 = new HashSet();
        JSONArray jSONArray0 = jSONObject0.getJSONArray("grantedScopes");
        int v1 = jSONArray0.length();
        for(int v2 = 0; v2 < v1; ++v2) {
            hashSet0.add(new Scope(jSONArray0.getString(v2)));
        }
        GoogleSignInAccount googleSignInAccount0 = GoogleSignInAccount.zaa(jSONObject0.optString("id"), (jSONObject0.has("tokenId") ? jSONObject0.optString("tokenId") : null), (jSONObject0.has("email") ? jSONObject0.optString("email") : null), (jSONObject0.has("displayName") ? jSONObject0.optString("displayName") : null), (jSONObject0.has("givenName") ? jSONObject0.optString("givenName") : null), (jSONObject0.has("familyName") ? jSONObject0.optString("familyName") : null), uri0, v, jSONObject0.getString("obfuscatedIdentifier"), hashSet0);
        if(jSONObject0.has("serverAuthCode")) {
            s1 = jSONObject0.optString("serverAuthCode");
        }
        googleSignInAccount0.g = s1;
        return googleSignInAccount0;
    }

    @NonNull
    public final String zac() {
        return this.i;
    }

    @NonNull
    public final String zad() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(this.getId() != null) {
                jSONObject0.put("id", this.getId());
            }
            if(this.getIdToken() != null) {
                jSONObject0.put("tokenId", this.getIdToken());
            }
            if(this.getEmail() != null) {
                jSONObject0.put("email", this.getEmail());
            }
            if(this.getDisplayName() != null) {
                jSONObject0.put("displayName", this.getDisplayName());
            }
            if(this.getGivenName() != null) {
                jSONObject0.put("givenName", this.getGivenName());
            }
            if(this.getFamilyName() != null) {
                jSONObject0.put("familyName", this.getFamilyName());
            }
            Uri uri0 = this.getPhotoUrl();
            if(uri0 != null) {
                jSONObject0.put("photoUrl", uri0.toString());
            }
            if(this.getServerAuthCode() != null) {
                jSONObject0.put("serverAuthCode", this.getServerAuthCode());
            }
            jSONObject0.put("expirationTime", this.h);
            jSONObject0.put("obfuscatedIdentifier", this.i);
            JSONArray jSONArray0 = new JSONArray();
            Scope[] arr_scope = (Scope[])this.j.toArray(new Scope[this.j.size()]);
            Arrays.sort(arr_scope, zaa.zaa);
            for(int v = 0; v < arr_scope.length; ++v) {
                jSONArray0.put(arr_scope[v].getScopeUri());
            }
            jSONObject0.put("grantedScopes", jSONArray0);
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
        jSONObject0.remove("serverAuthCode");
        return jSONObject0.toString();
    }
}

