package l8;

import com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener;
import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class b implements BackgroundStateChangeListener {
    public static final AtomicReference a;

    static {
        b.a = new AtomicReference();
    }

    @Override  // com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        synchronized(FirebaseApp.k) {
            for(Object object1: new ArrayList(FirebaseApp.m.values())) {
                FirebaseApp firebaseApp0 = (FirebaseApp)object1;
                if(firebaseApp0.e.get()) {
                    firebaseApp0.d(z);
                }
            }
        }
    }
}

