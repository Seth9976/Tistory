package l8;

import com.google.firebase.FirebaseApp.BackgroundStateChangeListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;

public final class a implements BackgroundStateChangeListener {
    public final FirebaseApp a;

    public a(FirebaseApp firebaseApp0) {
        this.a = firebaseApp0;
    }

    @Override  // com.google.firebase.FirebaseApp$BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        FirebaseApp firebaseApp0 = this.a;
        if(!z) {
            ((DefaultHeartBeatController)firebaseApp0.h.get()).registerHeartBeat();
            return;
        }
        firebaseApp0.getClass();
    }
}

