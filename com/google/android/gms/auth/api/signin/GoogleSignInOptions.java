package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.c;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends AbstractSafeParcelable implements Optional, ReflectedParcelable {
    public static final class Builder {
        public final HashSet a;
        public boolean b;
        public boolean c;
        public boolean d;
        public String e;
        public Account f;
        public String g;
        public final HashMap h;
        public String i;

        public Builder() {
            this.a = new HashSet();
            this.h = new HashMap();
        }

        public Builder(@NonNull GoogleSignInOptions googleSignInOptions0) {
            this.a = new HashSet();
            this.h = new HashMap();
            Preconditions.checkNotNull(googleSignInOptions0);
            this.a = new HashSet(googleSignInOptions0.b);
            this.b = googleSignInOptions0.e;
            this.c = googleSignInOptions0.f;
            this.d = googleSignInOptions0.d;
            this.e = googleSignInOptions0.g;
            this.f = googleSignInOptions0.c;
            this.g = googleSignInOptions0.h;
            this.h = GoogleSignInOptions.a(googleSignInOptions0.i);
            this.i = googleSignInOptions0.j;
        }

        @NonNull
        public Builder addExtension(@NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension0) {
            Integer integer0 = googleSignInOptionsExtension0.getExtensionType();
            HashMap hashMap0 = this.h;
            if(hashMap0.containsKey(integer0)) {
                throw new IllegalStateException("Only one extension per type may be added");
            }
            List list0 = googleSignInOptionsExtension0.getImpliedScopes();
            if(list0 != null) {
                this.a.addAll(list0);
            }
            hashMap0.put(googleSignInOptionsExtension0.getExtensionType(), new GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension0));
            return this;
        }

        @NonNull
        public GoogleSignInOptions build() {
            HashSet hashSet0 = this.a;
            if(hashSet0.contains(GoogleSignInOptions.zae)) {
                Scope scope0 = GoogleSignInOptions.zad;
                if(hashSet0.contains(scope0)) {
                    hashSet0.remove(scope0);
                }
            }
            if(this.d && (this.f == null || !hashSet0.isEmpty())) {
                this.requestId();
            }
            return new GoogleSignInOptions(3, new ArrayList(hashSet0), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i);
        }

        @NonNull
        public Builder requestEmail() {
            this.a.add(GoogleSignInOptions.zab);
            return this;
        }

        @NonNull
        public Builder requestId() {
            this.a.add(GoogleSignInOptions.zac);
            return this;
        }

        @NonNull
        public Builder requestIdToken(@NonNull String s) {
            boolean z = true;
            this.d = true;
            Preconditions.checkNotEmpty(s);
            if(this.e != null && !this.e.equals(s)) {
                z = false;
            }
            Preconditions.checkArgument(z, "two different server client ids provided");
            this.e = s;
            return this;
        }

        @NonNull
        public Builder requestProfile() {
            this.a.add(GoogleSignInOptions.zaa);
            return this;
        }

        @NonNull
        public Builder requestScopes(@NonNull Scope scope0, @NonNull Scope[] arr_scope) {
            this.a.add(scope0);
            List list0 = Arrays.asList(arr_scope);
            this.a.addAll(list0);
            return this;
        }

        @NonNull
        public Builder requestServerAuthCode(@NonNull String s) {
            this.requestServerAuthCode(s, false);
            return this;
        }

        @NonNull
        public Builder requestServerAuthCode(@NonNull String s, boolean z) {
            boolean z1 = true;
            this.b = true;
            Preconditions.checkNotEmpty(s);
            if(this.e != null && !this.e.equals(s)) {
                z1 = false;
            }
            Preconditions.checkArgument(z1, "two different server client ids provided");
            this.e = s;
            this.c = z;
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String s) {
            this.f = new Account(Preconditions.checkNotEmpty(s), "com.google");
            return this;
        }

        @NonNull
        public Builder setHostedDomain(@NonNull String s) {
            this.g = Preconditions.checkNotEmpty(s);
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setLogSessionId(@NonNull String s) {
            this.i = s;
            return this;
        }
    }

    @NonNull
    public static final Parcelable.Creator CREATOR;
    @NonNull
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    @NonNull
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    public final int a;
    public final ArrayList b;
    public final Account c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final ArrayList i;
    public final String j;
    public static final c k;
    @NonNull
    @VisibleForTesting
    public static final Scope zaa;
    @NonNull
    @VisibleForTesting
    public static final Scope zab;
    @NonNull
    @VisibleForTesting
    public static final Scope zac;
    @NonNull
    @VisibleForTesting
    public static final Scope zad;
    @NonNull
    @VisibleForTesting
    public static final Scope zae;

    static {
        GoogleSignInOptions.zaa = new Scope("profile");
        GoogleSignInOptions.zab = new Scope("email");
        GoogleSignInOptions.zac = new Scope("openid");
        Scope scope0 = new Scope("https://www.googleapis.com/auth/games_lite");
        GoogleSignInOptions.zad = scope0;
        GoogleSignInOptions.zae = new Scope("https://www.googleapis.com/auth/games");
        Builder googleSignInOptions$Builder0 = new Builder();
        googleSignInOptions$Builder0.requestId();
        googleSignInOptions$Builder0.requestProfile();
        GoogleSignInOptions.DEFAULT_SIGN_IN = googleSignInOptions$Builder0.build();
        Builder googleSignInOptions$Builder1 = new Builder();
        googleSignInOptions$Builder1.requestScopes(scope0, new Scope[0]);
        GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN = googleSignInOptions$Builder1.build();
        GoogleSignInOptions.CREATOR = new zae();
        GoogleSignInOptions.k = new c(13);
    }

    public GoogleSignInOptions(int v, ArrayList arrayList0, Account account0, boolean z, boolean z1, boolean z2, String s, String s1, HashMap hashMap0, String s2) {
        this.a = v;
        this.b = arrayList0;
        this.c = account0;
        this.d = z;
        this.e = z1;
        this.f = z2;
        this.g = s;
        this.h = s1;
        this.i = new ArrayList(hashMap0.values());
        this.j = s2;
    }

    public static HashMap a(ArrayList arrayList0) {
        HashMap hashMap0 = new HashMap();
        if(arrayList0 == null) {
            return hashMap0;
        }
        for(Object object0: arrayList0) {
            hashMap0.put(((GoogleSignInOptionsExtensionParcelable)object0).getType(), ((GoogleSignInOptionsExtensionParcelable)object0));
        }
        return hashMap0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        String s = this.g;
        ArrayList arrayList0 = this.b;
        if(object0 == null) {
            return false;
        }
        try {
            if(this.i.size() <= 0 && ((GoogleSignInOptions)object0).i.size() <= 0 && arrayList0.size() == ((GoogleSignInOptions)object0).getScopes().size() && arrayList0.containsAll(((GoogleSignInOptions)object0).getScopes())) {
                Account account0 = this.c;
                if(account0 != null) {
                    if(account0.equals(((GoogleSignInOptions)object0).getAccount())) {
                    label_10:
                        if(!TextUtils.isEmpty(s)) {
                            if(s.equals(((GoogleSignInOptions)object0).getServerClientId())) {
                            label_14:
                                boolean z = ((GoogleSignInOptions)object0).isForceCodeForRefreshToken();
                                if(this.f == z) {
                                    boolean z1 = ((GoogleSignInOptions)object0).isIdTokenRequested();
                                    if(this.d == z1) {
                                        boolean z2 = ((GoogleSignInOptions)object0).isServerAuthCodeRequested();
                                        if(this.e == z2) {
                                            String s1 = ((GoogleSignInOptions)object0).getLogSessionId();
                                            return TextUtils.equals(this.j, s1);
                                        }
                                    }
                                }
                            }
                        }
                        else if(TextUtils.isEmpty(((GoogleSignInOptions)object0).getServerClientId())) {
                            goto label_14;
                        }
                    }
                }
                else if(((GoogleSignInOptions)object0).getAccount() == null) {
                    goto label_10;
                }
            }
        }
        catch(ClassCastException unused_ex) {
        }
        return false;
    }

    @Nullable
    @KeepForSdk
    public Account getAccount() {
        return this.c;
    }

    @NonNull
    @KeepForSdk
    public ArrayList getExtensions() {
        return this.i;
    }

    @Nullable
    @KeepForSdk
    public String getLogSessionId() {
        return this.j;
    }

    @NonNull
    public Scope[] getScopeArray() {
        return (Scope[])this.b.toArray(new Scope[this.b.size()]);
    }

    @NonNull
    @KeepForSdk
    public ArrayList getScopes() {
        return new ArrayList(this.b);
    }

    @Nullable
    @KeepForSdk
    public String getServerClientId() {
        return this.g;
    }

    @Override
    public int hashCode() {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = this.b;
        int v = arrayList1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(((Scope)arrayList1.get(v1)).getScopeUri());
        }
        Collections.sort(arrayList0);
        HashAccumulator hashAccumulator0 = new HashAccumulator();
        hashAccumulator0.addObject(arrayList0);
        hashAccumulator0.addObject(this.c);
        hashAccumulator0.addObject(this.g);
        hashAccumulator0.zaa(this.f);
        hashAccumulator0.zaa(this.d);
        hashAccumulator0.zaa(this.e);
        hashAccumulator0.addObject(this.j);
        return hashAccumulator0.hash();
    }

    @KeepForSdk
    public boolean isForceCodeForRefreshToken() {
        return this.f;
    }

    @KeepForSdk
    public boolean isIdTokenRequested() {
        return this.d;
    }

    @KeepForSdk
    public boolean isServerAuthCodeRequested() {
        return this.e;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeTypedList(parcel0, 2, this.getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.getAccount(), v, false);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.isIdTokenRequested());
        SafeParcelWriter.writeBoolean(parcel0, 5, this.isServerAuthCodeRequested());
        SafeParcelWriter.writeBoolean(parcel0, 6, this.isForceCodeForRefreshToken());
        SafeParcelWriter.writeString(parcel0, 7, this.getServerClientId(), false);
        SafeParcelWriter.writeString(parcel0, 8, this.h, false);
        SafeParcelWriter.writeTypedList(parcel0, 9, this.getExtensions(), false);
        SafeParcelWriter.writeString(parcel0, 10, this.getLogSessionId(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Nullable
    public static GoogleSignInOptions zab(@Nullable String s) throws JSONException {
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        JSONObject jSONObject0 = new JSONObject(s);
        HashSet hashSet0 = new HashSet();
        JSONArray jSONArray0 = jSONObject0.getJSONArray("scopes");
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            hashSet0.add(new Scope(jSONArray0.getString(v1)));
        }
        String s2 = jSONObject0.has("accountName") ? jSONObject0.optString("accountName") : null;
        Account account0 = TextUtils.isEmpty(s2) ? null : new Account(s2, "com.google");
        ArrayList arrayList0 = new ArrayList(hashSet0);
        boolean z = jSONObject0.getBoolean("idTokenRequested");
        boolean z1 = jSONObject0.getBoolean("serverAuthRequested");
        boolean z2 = jSONObject0.getBoolean("forceCodeForRefreshToken");
        String s3 = jSONObject0.has("serverClientId") ? jSONObject0.optString("serverClientId") : null;
        if(jSONObject0.has("hostedDomain")) {
            s1 = jSONObject0.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList0, account0, z, z1, z2, s3, s1, new HashMap(), null);
    }

    @NonNull
    public final String zaf() {
        String s = this.h;
        String s1 = this.g;
        JSONObject jSONObject0 = new JSONObject();
        try {
            JSONArray jSONArray0 = new JSONArray();
            Collections.sort(this.b, GoogleSignInOptions.k);
            for(Object object0: this.b) {
                jSONArray0.put(((Scope)object0).getScopeUri());
            }
            jSONObject0.put("scopes", jSONArray0);
            Account account0 = this.c;
            if(account0 != null) {
                jSONObject0.put("accountName", account0.name);
            }
            jSONObject0.put("idTokenRequested", this.d);
            jSONObject0.put("forceCodeForRefreshToken", this.f);
            jSONObject0.put("serverAuthRequested", this.e);
            if(!TextUtils.isEmpty(s1)) {
                jSONObject0.put("serverClientId", s1);
            }
            if(!TextUtils.isEmpty(s)) {
                jSONObject0.put("hostedDomain", s);
            }
            return jSONObject0.toString();
        }
        catch(JSONException jSONException0) {
        }
        throw new RuntimeException(jSONException0);
    }
}

