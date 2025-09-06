package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;

public class a {
    public static RectF a(TabLayout tabLayout0, View view0) {
        if(view0 == null) {
            return new RectF();
        }
        if(!tabLayout0.isTabIndicatorFullWidth() && view0 instanceof TabView) {
            int v = ((TabView)view0).getContentWidth();
            int v1 = ((TabView)view0).getContentHeight();
            int v2 = (int)ViewUtils.dpToPx(((TabView)view0).getContext(), 24);
            if(v < v2) {
                v = v2;
            }
            int v3 = ((TabView)view0).getLeft();
            int v4 = (((TabView)view0).getRight() + v3) / 2;
            int v5 = ((TabView)view0).getTop();
            int v6 = (((TabView)view0).getBottom() + v5) / 2;
            return new RectF(((float)(v4 - v / 2)), ((float)(v6 - v1 / 2)), ((float)(v / 2 + v4)), ((float)(v4 / 2 + v6)));
        }
        return new RectF(((float)view0.getLeft()), ((float)view0.getTop()), ((float)view0.getRight()), ((float)view0.getBottom()));
    }

    public void b(TabLayout tabLayout0, View view0, View view1, float f, Drawable drawable0) {
        RectF rectF0 = a.a(tabLayout0, view0);
        RectF rectF1 = a.a(tabLayout0, view1);
        drawable0.setBounds(AnimationUtils.lerp(((int)rectF0.left), ((int)rectF1.left), f), drawable0.getBounds().top, AnimationUtils.lerp(((int)rectF0.right), ((int)rectF1.right), f), drawable0.getBounds().bottom);
    }
}

