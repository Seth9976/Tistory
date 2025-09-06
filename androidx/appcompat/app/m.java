package androidx.appcompat.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;

public final class m implements SavedStateProvider {
    public final AppCompatActivity a;

    public m(AppCompatActivity appCompatActivity0) {
        this.a = appCompatActivity0;
    }

    @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle saveState() {
        Bundle bundle0 = new Bundle();
        this.a.getDelegate().onSaveInstanceState(bundle0);
        return bundle0;
    }
}

