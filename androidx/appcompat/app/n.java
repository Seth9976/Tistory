package androidx.appcompat.app;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class n implements OnContextAvailableListener {
    public final AppCompatActivity a;

    public n(AppCompatActivity appCompatActivity0) {
        this.a = appCompatActivity0;
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        AppCompatDelegate appCompatDelegate0 = this.a.getDelegate();
        appCompatDelegate0.installViewFactory();
        appCompatDelegate0.onCreate(this.a.getSavedStateRegistry().consumeRestoredStateForKey("androidx:appcompat"));
    }
}

