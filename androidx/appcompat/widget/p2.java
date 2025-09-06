package androidx.appcompat.widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.R.dimen;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.tooltip.TooltipDrawable;

public final class p2 implements View.OnLayoutChangeListener {
    public final int a;
    public final Object b;

    public p2(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        int v8 = 0;
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                View view1 = ((SearchView)object0).x;
                if(view1.getWidth() > 1) {
                    Resources resources0 = ((SearchView)object0).getContext().getResources();
                    int v9 = ((SearchView)object0).r.getPaddingLeft();
                    Rect rect0 = new Rect();
                    boolean z = ViewUtils.isLayoutRtl(((SearchView)object0));
                    if(((SearchView)object0).P) {
                        v8 = resources0.getDimensionPixelSize(dimen.abc_dropdownitem_icon_width) + resources0.getDimensionPixelSize(dimen.abc_dropdownitem_text_padding_left);
                    }
                    ((SearchView)object0).p.getDropDownBackground().getPadding(rect0);
                    ((SearchView)object0).p.setDropDownHorizontalOffset((z ? -rect0.left : v9 - (rect0.left + v8)));
                    ((SearchView)object0).p.setDropDownWidth(view1.getWidth() + rect0.left + rect0.right + v8 - v9);
                }
                return;
            }
            case 1: {
                ((TooltipDrawable)object0).getClass();
                int[] arr_v = new int[2];
                view0.getLocationOnScreen(arr_v);
                ((TooltipDrawable)object0).J = arr_v[0];
                view0.getWindowVisibleDisplayFrame(((TooltipDrawable)object0).D);
                return;
            }
            default: {
                if(((NavigationBarItemView)object0).n.getVisibility() == 0) {
                    BadgeDrawable badgeDrawable0 = ((NavigationBarItemView)object0).F;
                    if(badgeDrawable0 != null) {
                        FrameLayout frameLayout0 = BadgeUtils.USE_COMPAT_PARENT ? ((FrameLayout)((NavigationBarItemView)object0).n.getParent()) : null;
                        BadgeUtils.setBadgeDrawableBounds(badgeDrawable0, ((NavigationBarItemView)object0).n, frameLayout0);
                    }
                }
            }
        }
    }
}

