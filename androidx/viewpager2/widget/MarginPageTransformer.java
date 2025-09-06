package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.RecyclerView;

public final class MarginPageTransformer implements PageTransformer {
    public final int a;

    public MarginPageTransformer(@Px int v) {
        Preconditions.checkArgumentNonnegative(v, "Margin must be non-negative");
        this.a = v;
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$PageTransformer
    public void transformPage(@NonNull View view0, float f) {
        ViewParent viewParent0 = view0.getParent();
        ViewParent viewParent1 = viewParent0.getParent();
        if(!(viewParent0 instanceof RecyclerView) || !(viewParent1 instanceof ViewPager2)) {
            throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
        }
        float f1 = ((float)this.a) * f;
        if(((ViewPager2)viewParent1).getOrientation() == 0) {
            if(((ViewPager2)viewParent1).g.getLayoutDirection() == 1) {
                f1 = -f1;
            }
            view0.setTranslationX(f1);
            return;
        }
        view0.setTranslationY(f1);
    }
}

