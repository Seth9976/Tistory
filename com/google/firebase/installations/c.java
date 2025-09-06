package com.google.firebase.installations;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import java.io.IOException;

public final class c implements Runnable {
    public final int a;
    public final Object b;
    public final boolean c;

    public c(Object object0, boolean z, int v) {
        this.a = v;
        this.b = object0;
        this.c = z;
        super();
    }

    @Override
    public final void run() {
        PersistedInstallationEntry persistedInstallationEntry1;
        switch(this.a) {
            case 0: {
                ((FirebaseInstallations)this.b).a(this.c);
                return;
            }
            case 1: {
                FirebaseInstallations firebaseInstallations0 = (FirebaseInstallations)this.b;
                boolean z = this.c;
                PersistedInstallationEntry persistedInstallationEntry0 = firebaseInstallations0.c();
                try {
                    if(persistedInstallationEntry0.isErrored() || persistedInstallationEntry0.isUnregistered()) {
                        persistedInstallationEntry1 = firebaseInstallations0.f(persistedInstallationEntry0);
                    }
                    else {
                        if(z || firebaseInstallations0.d.isAuthTokenExpired(persistedInstallationEntry0)) {
                            persistedInstallationEntry1 = firebaseInstallations0.b(persistedInstallationEntry0);
                            goto label_17;
                        }
                        return;
                    }
                }
                catch(FirebaseInstallationsException firebaseInstallationsException0) {
                    firebaseInstallations0.g(firebaseInstallationsException0);
                    return;
                }
            label_17:
                firebaseInstallations0.d(persistedInstallationEntry1);
                synchronized(firebaseInstallations0) {
                    if(firebaseInstallations0.k.size() != 0 && !TextUtils.equals(persistedInstallationEntry0.getFirebaseInstallationId(), persistedInstallationEntry1.getFirebaseInstallationId())) {
                        for(Object object0: firebaseInstallations0.k) {
                            ((FidListener)object0).onFidChanged(persistedInstallationEntry1.getFirebaseInstallationId());
                        }
                    }
                }
                if(persistedInstallationEntry1.isRegistered()) {
                    synchronized(firebaseInstallations0) {
                        firebaseInstallations0.j = persistedInstallationEntry1.getFirebaseInstallationId();
                    }
                }
                if(persistedInstallationEntry1.isErrored()) {
                    firebaseInstallations0.g(new FirebaseInstallationsException(Status.BAD_CONFIG));
                    return;
                }
                if(persistedInstallationEntry1.isNotGenerated()) {
                    firebaseInstallations0.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    return;
                }
                firebaseInstallations0.h(persistedInstallationEntry1);
                return;
            }
            default: {
                ViewUtils.showKeyboard(((View)this.b), this.c);
            }
        }
    }
}

