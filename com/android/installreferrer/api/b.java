package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import java.util.List;

public final class b extends InstallReferrerClient {
    public int a;
    public final Context b;
    public IGetInstallReferrerService c;
    public a d;

    public b(Context context0) {
        this.a = 0;
        this.b = context0.getApplicationContext();
    }

    @Override  // com.android.installreferrer.api.InstallReferrerClient
    public final void endConnection() {
        this.a = 3;
        if(this.d != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.b.unbindService(this.d);
            this.d = null;
        }
        this.c = null;
    }

    @Override  // com.android.installreferrer.api.InstallReferrerClient
    public final ReferrerDetails getInstallReferrer() {
        if(this.isReady()) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("package_name", "net.daum.android.tistoryapp");
            try {
                return new ReferrerDetails(this.c.a(bundle0));
            }
            catch(RemoteException remoteException0) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.a = 0;
                throw remoteException0;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override  // com.android.installreferrer.api.InstallReferrerClient
    public final boolean isReady() {
        return this.a == 2 && this.c != null && this.d != null;
    }

    @Override  // com.android.installreferrer.api.InstallReferrerClient
    public final void startConnection(InstallReferrerStateListener installReferrerStateListener0) {
        if(!this.isReady()) {
            int v = this.a;
            if(v == 1) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
                installReferrerStateListener0.onInstallReferrerSetupFinished(3);
                return;
            }
            if(v != 3) {
                InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
                Intent intent0 = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                intent0.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                Context context0 = this.b;
                List list0 = context0.getPackageManager().queryIntentServices(intent0, 0);
                if(list0 != null && !list0.isEmpty()) {
                    ServiceInfo serviceInfo0 = ((ResolveInfo)list0.get(0)).serviceInfo;
                    if(serviceInfo0 != null) {
                        if("com.android.vending".equals(serviceInfo0.packageName) && serviceInfo0.name != null) {
                            PackageManager packageManager0 = context0.getPackageManager();
                            try {
                                if(packageManager0.getPackageInfo("com.android.vending", 0x80).versionCode >= 80837300) {
                                    goto label_18;
                                }
                            }
                            catch(PackageManager.NameNotFoundException unused_ex) {
                            }
                            InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                            this.a = 0;
                            installReferrerStateListener0.onInstallReferrerSetupFinished(2);
                            return;
                        label_18:
                            Intent intent1 = new Intent(intent0);
                            a a0 = new a(this, installReferrerStateListener0);
                            this.d = a0;
                            if(context0.bindService(intent1, a0, 1)) {
                                InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                                return;
                            }
                            InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                            this.a = 0;
                            installReferrerStateListener0.onInstallReferrerSetupFinished(1);
                            return;
                        }
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                        this.a = 0;
                        installReferrerStateListener0.onInstallReferrerSetupFinished(2);
                        return;
                    }
                }
                this.a = 0;
                InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
                installReferrerStateListener0.onInstallReferrerSetupFinished(2);
                return;
            }
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can\'t be reused. Please create another instance.");
            installReferrerStateListener0.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
        installReferrerStateListener0.onInstallReferrerSetupFinished(0);
    }
}

