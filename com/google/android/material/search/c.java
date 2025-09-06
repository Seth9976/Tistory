package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ViewUtils;
import java.util.List;

public final class c implements Runnable {
    public final h a;
    public final SearchBar b;
    public final View c;
    public final AppBarLayout d;
    public final boolean e;

    public c(h h0, SearchBar searchBar0, View view0, AppBarLayout appBarLayout0, boolean z) {
        this.a = h0;
        this.b = searchBar0;
        this.c = view0;
        this.d = appBarLayout0;
        this.e = z;
    }

    @Override
    public final void run() {
        h h0 = this.a;
        h0.getClass();
        AnimatorSet animatorSet0 = new AnimatorSet();
        SearchBar searchBar0 = this.b;
        List list0 = ViewUtils.getChildren(searchBar0);
        if(searchBar0.getCenterView() != null) {
            list0.remove(searchBar0.getCenterView());
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        valueAnimator0.addUpdateListener(MultiViewUpdateListener.alphaListener(list0));
        valueAnimator0.addUpdateListener(new d(0, this.c));
        valueAnimator0.setDuration(75L);
        valueAnimator0.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        animatorSet0.playSequentially(new Animator[]{valueAnimator0, h.a(searchBar0, this.c, this.d).setDuration(300L).addListener(new g(h0, searchBar0, 0)).getExpandAnimator()});
        animatorSet0.addListener(new f(h0, 0));
        for(Object object0: h0.b) {
            animatorSet0.addListener(((AnimatorListenerAdapter)object0));
        }
        if(this.e) {
            animatorSet0.setDuration(0L);
        }
        animatorSet0.start();
        h0.i = animatorSet0;
    }
}

