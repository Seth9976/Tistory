package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.zae;

@KeepForSdk
public class SignInClientImpl extends GmsClient implements zae {
    public final boolean F;
    public final ClientSettings G;
    public final Bundle H;
    public final Integer I;
    public static final int zaa;

    public SignInClientImpl(@NonNull Context context0, @NonNull Looper looper0, boolean z, @NonNull ClientSettings clientSettings0, @NonNull Bundle bundle0, @NonNull ConnectionCallbacks googleApiClient$ConnectionCallbacks0, @NonNull OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 44, clientSettings0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        this.F = true;
        this.G = clientSettings0;
        this.H = bundle0;
        this.I = clientSettings0.zab();
    }

    @NonNull
    @KeepForSdk
    public static Bundle createBundleFromClientSettings(@NonNull ClientSettings clientSettings0) {
        Integer integer0 = clientSettings0.zab();
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings0.getAccount());
        if(integer0 != null) {
            bundle0.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", ((int)integer0));
        }
        bundle0.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle0.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle0.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle0.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle0.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle0.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle0.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle0.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public final IInterface createServiceInterface(@NonNull IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterface0 instanceof zaf ? ((zaf)iInterface0) : new zaf(iBinder0, "com.google.android.gms.signin.internal.ISignInService");  // 初始化器: Lcom/google/android/gms/internal/base/zaa;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        ClientSettings clientSettings0 = this.G;
        Bundle bundle0 = this.H;
        if(!"net.daum.android.tistoryapp".equals(clientSettings0.getRealClientPackageName())) {
            bundle0.putString("com.google.android.gms.signin.internal.realClientPackageName", clientSettings0.getRealClientPackageName());
        }
        return bundle0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public final boolean requiresSignIn() {
        return this.F;
    }

    @Override  // com.google.android.gms.signin.zae
    public final void zaa() {
        try {
            ((zaf)this.getService()).zae(((int)(((Integer)Preconditions.checkNotNull(this.I)))));
        }
        catch(RemoteException unused_ex) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override  // com.google.android.gms.signin.zae
    public final void zab() {
        this.connect(new LegacyClientCallbackAdapter(this));
    }

    @Override  // com.google.android.gms.signin.zae
    public final void zac(@NonNull IAccountAccessor iAccountAccessor0, boolean z) {
        try {
            ((zaf)this.getService()).zaf(iAccountAccessor0, ((int)(((Integer)Preconditions.checkNotNull(this.I)))), z);
        }
        catch(RemoteException unused_ex) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override  // com.google.android.gms.signin.zae
    public final void zad(com.google.android.gms.signin.internal.zae zae0) {
        Preconditions.checkNotNull(zae0, "Expecting a valid ISignInCallbacks");
        try {
            Account account0 = this.G.getAccountOrDefault();
            GoogleSignInAccount googleSignInAccount0 = "<<default account>>".equals(account0.name) ? Storage.getInstance(this.getContext()).getSavedDefaultGoogleSignInAccount() : null;
            zat zat0 = new zat(account0, ((int)(((Integer)Preconditions.checkNotNull(this.I)))), googleSignInAccount0);
            ((zaf)this.getService()).zag(new zai(1, zat0), zae0);
            return;
        }
        catch(RemoteException remoteException0) {
        }
        Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
        try {
            zae0.zab(new zak(1, new ConnectionResult(8, null), null));
        }
        catch(RemoteException unused_ex) {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", remoteException0);
        }
    }
}

