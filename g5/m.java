package g5;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public final class m extends RecyclerView {
    public final ViewPager2 a;

    public m(ViewPager2 viewPager20, Context context0) {
        this.a = viewPager20;
        super(context0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public final CharSequence getAccessibilityClassName() {
        this.a.t.getClass();
        return super.getAccessibilityClassName();
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setFromIndex(this.a.d);
        accessibilityEvent0.setToIndex(this.a.d);
        accessibilityEvent0.setSource(this.a.t.d);
        accessibilityEvent0.setClassName("androidx.viewpager.widget.ViewPager");
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        return this.a.isUserInputEnabled() && super.onInterceptTouchEvent(motionEvent0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        return this.a.isUserInputEnabled() && super.onTouchEvent(motionEvent0);
    }
}

