package com.kakao.tiara;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.track.App;

public final class c implements InstallReferrerStateListener {
    public TiaraTracker a;
    public InstallReferrerClient b;
    public int c;

    @Override  // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
        a.c(5, "c", "Install referrer service is disconnected.", new Object[0]);
        if(this.c >= 3) {
            a.a("c", "failed to connect to install referrer service.", new Object[0]);
            this.b.endConnection();
        }
        a.c(5, "c", "retry to connect to install referrer service.", new Object[0]);
        ++this.c;
        this.b.startConnection(this);
    }

    @Override  // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int v) {
        switch(v) {
            case 0: {
                a.c(4, "c", "Install referrer service: OK", new Object[0]);
                try {
                    ReferrerDetails referrerDetails0 = this.b.getInstallReferrer();
                    String s = referrerDetails0.getInstallReferrer();
                    long v1 = referrerDetails0.getReferrerClickTimestampSeconds();
                    String s1 = String.valueOf(referrerDetails0.getInstallBeginTimestampSeconds());
                    f.a.d(s, String.valueOf(v1), s1);
                }
                catch(RemoteException unused_ex) {
                    a.a("c", "failed to get InstallReferrer", new Object[0]);
                    break;
                }
                new App(this.a, "앱설치", this.a.getSettings().getAppAdTrackId()).actionKind(ActionKind.AppInstall).track().flush();
                break;
            }
            case 1: {
                a.c(4, "c", "Install referrer service: SERVICE_UNAVAILABLE", new Object[0]);
                break;
            }
            case 2: {
                a.c(4, "c", "Install referrer service: FEATURE_NOT_SUPPORTED", new Object[0]);
            }
        }
        this.b.endConnection();
    }
}

