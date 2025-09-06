package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP})
public class BottomNavigationMenuView extends NavigationBarMenuView {
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public boolean L;
    public final ArrayList M;

    public BottomNavigationMenuView(@NonNull Context context0) {
        super(context0);
        this.M = new ArrayList();
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 17;
        this.setLayoutParams(frameLayout$LayoutParams0);
        Resources resources0 = this.getResources();
        this.H = resources0.getDimensionPixelSize(dimen.design_bottom_navigation_item_max_width);
        this.I = resources0.getDimensionPixelSize(dimen.design_bottom_navigation_item_min_width);
        this.J = resources0.getDimensionPixelSize(dimen.design_bottom_navigation_active_item_max_width);
        this.K = resources0.getDimensionPixelSize(dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override  // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context0) {
        return new BottomNavigationItemView(context0);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.L;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getChildCount();
        int v5 = v3 - v1;
        int v7 = 0;
        for(int v6 = 0; v6 < v4; ++v6) {
            View view0 = this.getChildAt(v6);
            if(view0.getVisibility() != 8) {
                if(ViewCompat.getLayoutDirection(this) == 1) {
                    int v8 = v2 - v - v7;
                    view0.layout(v8 - view0.getMeasuredWidth(), 0, v8, v5);
                }
                else {
                    view0.layout(v7, 0, view0.getMeasuredWidth() + v7, v5);
                }
                v7 += view0.getMeasuredWidth();
            }
        }
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        int v18;
        int v22;
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = this.getMenu().getVisibleItems().size();
        int v4 = this.getChildCount();
        ArrayList arrayList0 = this.M;
        arrayList0.clear();
        int v5 = View.MeasureSpec.getSize(v1);
        int v6 = View.MeasureSpec.makeMeasureSpec(v5, 0x40000000);
        int v7 = this.J;
        int v9 = 1;
        if(!this.isShifting(this.getLabelVisibilityMode(), v3) || !this.isItemHorizontalTranslationEnabled()) {
            if(v3 != 0) {
                v9 = v3;
            }
            int v19 = Math.min(v2 / v9, v7);
            int v20 = v2 - v3 * v19;
            for(int v21 = 0; v21 < v4; ++v21) {
                if(this.getChildAt(v21).getVisibility() == 8) {
                    v22 = 0;
                }
                else if(v20 > 0) {
                    v22 = v19 + 1;
                    --v20;
                }
                else {
                    v22 = v19;
                }
                arrayList0.add(v22);
            }
        }
        else {
            View view0 = this.getChildAt(this.getSelectedItemPosition());
            int v10 = view0.getVisibility();
            int v11 = this.K;
            if(v10 != 8) {
                view0.measure(View.MeasureSpec.makeMeasureSpec(v7, 0x80000000), v6);
                v11 = Math.max(v11, view0.getMeasuredWidth());
            }
            int v12 = v3 - (view0.getVisibility() == 8 ? 0 : 1);
            int v13 = Math.min(v2 - this.I * v12, Math.min(v11, v7));
            int v14 = v2 - v13;
            if(v12 != 0) {
                v9 = v12;
            }
            int v15 = Math.min(v14 / v9, this.H);
            int v16 = v14 - v12 * v15;
            for(int v17 = 0; v17 < v4; ++v17) {
                if(this.getChildAt(v17).getVisibility() == 8) {
                    v18 = 0;
                }
                else {
                    v18 = v17 == this.getSelectedItemPosition() ? v13 : v15;
                    if(v16 > 0) {
                        ++v18;
                        --v16;
                    }
                }
                arrayList0.add(v18);
            }
        }
        int v23 = 0;
        for(int v8 = 0; v8 < v4; ++v8) {
            View view1 = this.getChildAt(v8);
            if(view1.getVisibility() != 8) {
                view1.measure(View.MeasureSpec.makeMeasureSpec(((int)(((Integer)arrayList0.get(v8)))), 0x40000000), v6);
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
                viewGroup$LayoutParams0.width = view1.getMeasuredWidth();
                v23 = view1.getMeasuredWidth() + v23;
            }
        }
        this.setMeasuredDimension(v23, v5);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.L = z;
    }
}

