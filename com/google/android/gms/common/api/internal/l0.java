package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

public final class l0 implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public l0(int v, Object object0, Object object1) {
        this.a = v;
        this.c = object0;
        this.b = object1;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                if(((zap)this.c).zaa) {
                    ConnectionResult connectionResult0 = ((j0)this.b).b;
                    if(connectionResult0.hasResolution()) {
                        Intent intent0 = GoogleApiActivity.zaa(((zap)this.c).getActivity(), ((PendingIntent)Preconditions.checkNotNull(connectionResult0.getResolution())), ((j0)this.b).a, false);
                        ((zap)this.c).mLifecycleFragment.startActivityForResult(intent0, 1);
                        return;
                    }
                    Activity activity0 = ((zap)this.c).getActivity();
                    if(((zap)this.c).zac.getErrorResolutionIntent(activity0, connectionResult0.getErrorCode(), null) != null) {
                        Activity activity1 = ((zap)this.c).getActivity();
                        ((zap)this.c).zac.zag(activity1, ((zap)this.c).mLifecycleFragment, connectionResult0.getErrorCode(), 2, ((zap)this.c));
                        return;
                    }
                    if(connectionResult0.getErrorCode() == 18) {
                        Activity activity2 = ((zap)this.c).getActivity();
                        Dialog dialog0 = ((zap)this.c).zac.zab(activity2, ((zap)this.c));
                        Context context0 = ((zap)this.c).getActivity().getApplicationContext();
                        k0 k00 = new k0(this, dialog0);
                        ((zap)this.c).zac.zac(context0, k00);
                        return;
                    }
                    ((zap)this.c).zab.set(null);
                    ((zap)this.c).zab(connectionResult0, ((j0)this.b).a);
                }
                return;
            }
            case 1: {
                zak zak0 = (zak)this.b;
                ConnectionResult connectionResult1 = zak0.zaa();
                boolean z = connectionResult1.isSuccess();
                zact zact0 = (zact)this.c;
                if(z) {
                    zav zav0 = (zav)Preconditions.checkNotNull(zak0.zab());
                    ConnectionResult connectionResult2 = zav0.zaa();
                    if(!connectionResult2.isSuccess()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: " + connectionResult2, new Exception());
                        zact0.g.zae(connectionResult2);
                        zact0.f.disconnect();
                        return;
                    }
                    zact0.g.zaf(zav0.zab(), zact0.d);
                }
                else {
                    zact0.g.zae(connectionResult1);
                }
                zact0.f.disconnect();
                return;
            }
            default: {
                Result result0 = (Result)this.b;
                zada zada0 = (zada)this.c;
                try {
                    try {
                        BasePendingResult.n.set(Boolean.TRUE);
                        PendingResult pendingResult0 = ((ResultTransform)Preconditions.checkNotNull(zada0.a)).onSuccess(result0);
                        Message message0 = zada0.h.obtainMessage(0, pendingResult0);
                        zada0.h.sendMessage(message0);
                        goto label_23;
                    }
                    catch(RuntimeException runtimeException0) {
                    }
                    Message message1 = zada0.h.obtainMessage(1, runtimeException0);
                    zada0.h.sendMessage(message1);
                }
                catch(Throwable throwable0) {
                    goto label_17;
                }
                BasePendingResult.n.set(Boolean.FALSE);
                zada.d(result0);
                GoogleApiClient googleApiClient0 = (GoogleApiClient)zada0.g.get();
                if(googleApiClient0 != null) {
                    googleApiClient0.zap(zada0);
                    return;
                }
                return;
            label_17:
                BasePendingResult.n.set(Boolean.FALSE);
                zada.d(result0);
                GoogleApiClient googleApiClient1 = (GoogleApiClient)zada0.g.get();
                if(googleApiClient1 != null) {
                    googleApiClient1.zap(zada0);
                }
                throw throwable0;
            label_23:
                BasePendingResult.n.set(Boolean.FALSE);
                zada.d(result0);
                googleApiClient0 = (GoogleApiClient)zada0.g.get();
                if(googleApiClient0 != null) {
                    googleApiClient0.zap(zada0);
                }
            }
        }
    }
}

