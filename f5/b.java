package f5;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public final class b extends FragmentLifecycleCallbacks {
    public final Fragment a;
    public final FrameLayout b;
    public final FragmentStateAdapter c;

    public b(FragmentStateAdapter fragmentStateAdapter0, Fragment fragment0, FrameLayout frameLayout0) {
        this.c = fragmentStateAdapter0;
        this.a = fragment0;
        this.b = frameLayout0;
        super();
    }

    @Override  // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void onFragmentViewCreated(FragmentManager fragmentManager0, Fragment fragment0, View view0, Bundle bundle0) {
        if(fragment0 == this.a) {
            fragmentManager0.unregisterFragmentLifecycleCallbacks(this);
            this.c.getClass();
            FragmentStateAdapter.a(view0, this.b);
        }
    }
}

