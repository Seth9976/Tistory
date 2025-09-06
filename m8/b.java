package m8;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

public final class b implements Callable {
    public final int a;
    public final FirebaseAnalytics b;

    public b(FirebaseAnalytics firebaseAnalytics0, int v) {
        this.a = v;
        this.b = firebaseAnalytics0;
        super();
    }

    @Override
    public final Object call() {
        return this.a != 0 ? this.b.a.zzh() : this.b.a.zzl();
    }
}

