package com.google.android.material.appbar;

import android.view.View;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

public final class h implements OnOffsetChangedListener {
    public final CollapsingToolbarLayout a;

    public h(CollapsingToolbarLayout collapsingToolbarLayout0) {
        this.a = collapsingToolbarLayout0;
    }

    @Override  // com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout0, int v) {
        CollapsingToolbarLayout collapsingToolbarLayout0 = this.a;
        collapsingToolbarLayout0.y = v;
        int v1 = collapsingToolbarLayout0.A == null ? 0 : collapsingToolbarLayout0.A.getSystemWindowInsetTop();
        int v2 = collapsingToolbarLayout0.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            View view0 = collapsingToolbarLayout0.getChildAt(v3);
            LayoutParams collapsingToolbarLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            j j0 = CollapsingToolbarLayout.b(view0);
            switch(collapsingToolbarLayout$LayoutParams0.a) {
                case 1: {
                    j j1 = CollapsingToolbarLayout.b(view0);
                    LayoutParams collapsingToolbarLayout$LayoutParams1 = (LayoutParams)view0.getLayoutParams();
                    j0.b(MathUtils.clamp(-v, 0, collapsingToolbarLayout0.getHeight() - j1.b - view0.getHeight() - collapsingToolbarLayout$LayoutParams1.bottomMargin));
                    break;
                }
                case 2: {
                    j0.b(Math.round(((float)(-v)) * collapsingToolbarLayout$LayoutParams0.b));
                }
            }
        }
        collapsingToolbarLayout0.d();
        if(collapsingToolbarLayout0.p != null && v1 > 0) {
            ViewCompat.postInvalidateOnAnimation(collapsingToolbarLayout0);
        }
        int v4 = collapsingToolbarLayout0.getHeight();
        int v5 = v4 - ViewCompat.getMinimumHeight(collapsingToolbarLayout0) - v1;
        float f = Math.min(1.0f, ((float)(v4 - collapsingToolbarLayout0.getScrimVisibleHeightTrigger())) / ((float)v5));
        collapsingToolbarLayout0.k.setFadeModeStartFraction(f);
        collapsingToolbarLayout0.k.setCurrentOffsetY(collapsingToolbarLayout0.y + v5);
        collapsingToolbarLayout0.k.setExpansionFraction(((float)Math.abs(v)) / ((float)v5));
    }
}

