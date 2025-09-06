package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener;

public final class h implements OnSuccessListener, NewTokenListener {
    public final FirebaseMessaging a;

    public h(FirebaseMessaging firebaseMessaging0) {
        this.a = firebaseMessaging0;
        super();
    }

    @Override  // com.google.firebase.iid.internal.FirebaseInstanceIdInternal$NewTokenListener
    public void onNewToken(String s) {
        this.a.f(s);
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object object0) {
        if(this.a.isAutoInitEnabled()) {
            ((v)object0).f();
        }
    }
}

