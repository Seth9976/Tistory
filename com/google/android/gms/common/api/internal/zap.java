package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final zaq a;
    protected volatile boolean zaa;
    protected final AtomicReference zab;
    protected final GoogleApiAvailability zac;

    public zap(LifecycleFragment lifecycleFragment0, GoogleApiAvailability googleApiAvailability0) {
        super(lifecycleFragment0);
        this.zab = new AtomicReference(null);
        this.a = new zaq(Looper.getMainLooper());
        this.zac = googleApiAvailability0;
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int v, int v1, Intent intent0) {
        int v2 = 13;
        j0 j00 = (j0)this.zab.get();
    alab1:
        switch(v) {
            case 1: {
                switch(v1) {
                    case -1: {
                        this.zab.set(null);
                        this.zac();
                        return;
                    }
                    case 0: {
                        if(j00 == null) {
                            return;
                        }
                        if(intent0 != null) {
                            v2 = intent0.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                        }
                        ConnectionResult connectionResult0 = new ConnectionResult(v2, null, j00.b.toString());
                        this.zab.set(null);
                        this.zab(connectionResult0, j00.a);
                        return;
                    }
                    default: {
                        break alab1;
                    }
                }
            }
            case 2: {
                Activity activity0 = this.getActivity();
                int v3 = this.zac.isGooglePlayServicesAvailable(activity0);
                if(v3 == 0) {
                    this.zab.set(null);
                    this.zac();
                    return;
                }
                if(j00 == null) {
                    return;
                }
                if(j00.b.getErrorCode() == 18 && v3 == 18) {
                    return;
                }
            }
        }
        if(j00 != null) {
            this.zab.set(null);
            this.zab(j00.b, j00.a);
        }
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        ConnectionResult connectionResult0 = new ConnectionResult(13, null);
        j0 j00 = (j0)this.zab.get();
        this.zab.set(null);
        this.zab(connectionResult0, (j00 == null ? -1 : j00.a));
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 != null) {
            j0 j00 = bundle0.getBoolean("resolving_error", false) ? new j0(new ConnectionResult(bundle0.getInt("failed_status"), ((PendingIntent)bundle0.getParcelable("failed_resolution"))), bundle0.getInt("failed_client_id", -1)) : null;
            this.zab.set(j00);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        j0 j00 = (j0)this.zab.get();
        if(j00 == null) {
            return;
        }
        bundle0.putBoolean("resolving_error", true);
        bundle0.putInt("failed_client_id", j00.a);
        bundle0.putInt("failed_status", j00.b.getErrorCode());
        bundle0.putParcelable("failed_resolution", j00.b.getResolution());
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.zaa = true;
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.zaa = false;
    }

    public abstract void zab(ConnectionResult arg1, int arg2);

    public abstract void zac();

    public final void zah(ConnectionResult connectionResult0, int v) {
        j0 j00 = new j0(connectionResult0, v);
        AtomicReference atomicReference0 = this.zab;
        do {
            if(atomicReference0.compareAndSet(null, j00)) {
                l0 l00 = new l0(0, this, j00);
                this.a.post(l00);
                return;
            }
        }
        while(atomicReference0.get() == null);
    }
}

