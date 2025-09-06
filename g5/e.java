package g5;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener;

public final class e implements OnChildAttachStateChangeListener {
    @Override  // androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(recyclerView$LayoutParams0.width != -1 || recyclerView$LayoutParams0.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view0) {
    }
}

