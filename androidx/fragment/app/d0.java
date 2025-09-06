package androidx.fragment.app;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.core.util.Consumer;

public final class d0 implements Consumer {
    public final int a;
    public final FragmentActivity b;

    public d0(FragmentActivity fragmentActivity0, int v) {
        this.a = v;
        this.b = fragmentActivity0;
        super();
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        if(this.a != 0) {
            Intent intent0 = (Intent)object0;
            this.b.mFragments.noteStateNotSaved();
            return;
        }
        Configuration configuration0 = (Configuration)object0;
        this.b.mFragments.noteStateNotSaved();
    }
}

