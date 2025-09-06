package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService.Stub;

public final class a implements ServiceConnection {
    public final InstallReferrerStateListener a;
    public final b b;

    public a(b b0, InstallReferrerStateListener installReferrerStateListener0) {
        this.b = b0;
        if(installReferrerStateListener0 == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.a = installReferrerStateListener0;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        this.b.c = Stub.a(iBinder0);
        this.b.a = 2;
        this.a.onInstallReferrerSetupFinished(0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        this.b.c = null;
        this.b.a = 0;
        this.a.onInstallReferrerServiceDisconnected();
    }
}

