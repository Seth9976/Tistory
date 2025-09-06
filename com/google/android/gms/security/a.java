package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

public final class a extends AsyncTask {
    public final Context a;
    public final ProviderInstallListener b;

    public a(Context context0, ProviderInstallListener providerInstaller$ProviderInstallListener0) {
        this.a = context0;
        this.b = providerInstaller$ProviderInstallListener0;
        super();
    }

    @Override  // android.os.AsyncTask
    public final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        try {
            ProviderInstaller.installIfNeeded(this.a);
            return 0;
        }
        catch(GooglePlayServicesRepairableException googlePlayServicesRepairableException0) {
            return googlePlayServicesRepairableException0.getConnectionStatusCode();
        }
        catch(GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException0) {
            return googlePlayServicesNotAvailableException0.errorCode;
        }
    }

    @Override  // android.os.AsyncTask
    public final void onPostExecute(Object object0) {
        ProviderInstallListener providerInstaller$ProviderInstallListener0 = this.b;
        if(((int)(((Integer)object0))) == 0) {
            providerInstaller$ProviderInstallListener0.onProviderInstalled();
            return;
        }
        providerInstaller$ProviderInstallListener0.onProviderInstallFailed(((int)(((Integer)object0))), ProviderInstaller.a.getErrorResolutionIntent(this.a, ((int)(((Integer)object0))), "pi"));
    }
}

