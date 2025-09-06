package androidx.activity;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class d implements OnContextAvailableListener {
    public final ComponentActivity a;

    public d(ComponentActivity componentActivity0) {
        this.a = componentActivity0;
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        ComponentActivity.a(this.a, context0);
    }
}

