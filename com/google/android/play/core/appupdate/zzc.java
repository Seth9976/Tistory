package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.appupdate.internal.zzl;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.InstallState;

public final class zzc extends zzl {
    public zzc(Context context0) {
        super(new zzm("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context0);
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzl
    public final void zza(Context context0, Intent intent0) {
        if(!"net.daum.android.tistoryapp".equals(intent0.getStringExtra("package.name"))) {
            Object[] arr_object = {intent0.getStringExtra("package.name")};
            this.zza.zza("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", arr_object);
            return;
        }
        this.zza.zza("List of extras in received intent:", new Object[0]);
        for(Object object0: intent0.getExtras().keySet()) {
            Object[] arr_object1 = {((String)object0), intent0.getExtras().get(((String)object0))};
            this.zza.zza("Key: %s; value: %s", arr_object1);
        }
        InstallState installState0 = InstallState.zzb(intent0, this.zza);
        this.zza.zza("ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{installState0});
        this.zzd(installState0);
    }
}

