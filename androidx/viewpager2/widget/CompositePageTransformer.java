package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;

public final class CompositePageTransformer implements PageTransformer {
    public final ArrayList a;

    public CompositePageTransformer() {
        this.a = new ArrayList();
    }

    public void addTransformer(@NonNull PageTransformer viewPager2$PageTransformer0) {
        this.a.add(viewPager2$PageTransformer0);
    }

    public void removeTransformer(@NonNull PageTransformer viewPager2$PageTransformer0) {
        this.a.remove(viewPager2$PageTransformer0);
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$PageTransformer
    public void transformPage(@NonNull View view0, float f) {
        for(Object object0: this.a) {
            ((PageTransformer)object0).transformPage(view0, f);
        }
    }
}

