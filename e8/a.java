package e8;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.tabs.TabLayout;

public final class a extends com.google.android.material.tabs.a {
    public final int a;

    public a(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout0, View view0, View view1, float f, Drawable drawable0) {
        float f3;
        float f2;
        if(this.a != 0) {
            int v = Float.compare(f, 0.5f);
            if(v >= 0) {
                view0 = view1;
            }
            RectF rectF0 = com.google.android.material.tabs.a.a(tabLayout0, view0);
            drawable0.setBounds(((int)rectF0.left), drawable0.getBounds().top, ((int)rectF0.right), drawable0.getBounds().bottom);
            drawable0.setAlpha(((int)((v >= 0 ? AnimationUtils.lerp(0.0f, 1.0f, 0.5f, 1.0f, f) : AnimationUtils.lerp(1.0f, 0.0f, 0.0f, 0.5f, f)) * 255.0f)));
            return;
        }
        RectF rectF1 = com.google.android.material.tabs.a.a(tabLayout0, view0);
        RectF rectF2 = com.google.android.material.tabs.a.a(tabLayout0, view1);
        if(Float.compare(rectF1.left, rectF2.left) < 0) {
            double f1 = ((double)f) * 3.141593 / 2.0;
            f2 = (float)(1.0 - Math.cos(f1));
            f3 = (float)Math.sin(f1);
        }
        else {
            double f4 = ((double)f) * 3.141593 / 2.0;
            f3 = (float)(1.0 - Math.cos(f4));
            f2 = (float)Math.sin(f4);
        }
        drawable0.setBounds(AnimationUtils.lerp(((int)rectF1.left), ((int)rectF2.left), f2), drawable0.getBounds().top, AnimationUtils.lerp(((int)rectF1.right), ((int)rectF2.right), f3), drawable0.getBounds().bottom);
    }
}

