package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import androidx.core.view.z0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public final class h {
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final LinkedHashSet c;
    public AnimatorSet d;
    public AnimatorSet e;
    public boolean f;
    public boolean g;
    public boolean h;
    public AnimatorSet i;

    public h() {
        this.a = new LinkedHashSet();
        this.b = new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.h = true;
        this.i = null;
    }

    public static ExpandCollapseAnimationHelper a(SearchBar searchBar0, View view0, AppBarLayout appBarLayout0) {
        ExpandCollapseAnimationHelper expandCollapseAnimationHelper0 = new ExpandCollapseAnimationHelper(searchBar0, view0);
        MaterialShapeDrawable materialShapeDrawable0 = MaterialShapeDrawable.createWithElevationOverlay(view0.getContext());
        materialShapeDrawable0.setCornerSize(searchBar0.getCornerSize());
        materialShapeDrawable0.setElevation(ViewCompat.getElevation(searchBar0));
        ExpandCollapseAnimationHelper expandCollapseAnimationHelper1 = expandCollapseAnimationHelper0.setAdditionalUpdateListener(new z0(3, materialShapeDrawable0, view0)).setCollapsedViewOffsetY((appBarLayout0 == null ? 0 : appBarLayout0.getTop()));
        boolean z = ViewUtils.isLayoutRtl(view0);
        ArrayList arrayList0 = new ArrayList();
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                View view1 = ((ViewGroup)view0).getChildAt(v);
                if(!z && view1 instanceof ActionMenuView || z && !(view1 instanceof ActionMenuView)) {
                    arrayList0.add(view1);
                }
            }
        }
        return expandCollapseAnimationHelper1.addEndAnchoredViews(arrayList0);
    }
}

