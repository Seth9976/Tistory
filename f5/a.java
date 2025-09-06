package f5;

import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.adapter.FragmentViewHolder;

public final class a implements LifecycleEventObserver {
    public final FragmentViewHolder a;
    public final FragmentStateAdapter b;

    public a(FragmentStateAdapter fragmentStateAdapter0, FragmentViewHolder fragmentViewHolder0) {
        this.b = fragmentStateAdapter0;
        this.a = fragmentViewHolder0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        FragmentStateAdapter fragmentStateAdapter0 = this.b;
        if(fragmentStateAdapter0.h.isStateSaved()) {
            return;
        }
        lifecycleOwner0.getLifecycle().removeObserver(this);
        FragmentViewHolder fragmentViewHolder0 = this.a;
        if(ViewCompat.isAttachedToWindow(((FrameLayout)fragmentViewHolder0.itemView))) {
            fragmentStateAdapter0.d(fragmentViewHolder0);
        }
    }
}

