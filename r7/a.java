package r7;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils.RelativePadding;
import com.google.android.material.internal.ViewUtils;

public final class a implements OnApplyWindowInsetsListener {
    public final boolean a;
    public final BottomSheetBehavior b;

    public a(BottomSheetBehavior bottomSheetBehavior0, boolean z) {
        this.b = bottomSheetBehavior0;
        this.a = z;
    }

    @Override  // com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0, RelativePadding viewUtils$RelativePadding0) {
        int v5;
        Insets insets0 = windowInsetsCompat0.getInsets(7);
        Insets insets1 = windowInsetsCompat0.getInsets(0x20);
        BottomSheetBehavior bottomSheetBehavior0 = this.b;
        bottomSheetBehavior0.L = insets0.top;
        boolean z = ViewUtils.isLayoutRtl(view0);
        int v = view0.getPaddingBottom();
        int v1 = view0.getPaddingLeft();
        int v2 = view0.getPaddingRight();
        if(bottomSheetBehavior0.D) {
            bottomSheetBehavior0.K = windowInsetsCompat0.getSystemWindowInsetBottom();
            v = viewUtils$RelativePadding0.bottom + bottomSheetBehavior0.K;
        }
        if(bottomSheetBehavior0.E) {
            v1 = (z ? viewUtils$RelativePadding0.end : viewUtils$RelativePadding0.start) + insets0.left;
        }
        if(bottomSheetBehavior0.F) {
            v2 = (z ? viewUtils$RelativePadding0.start : viewUtils$RelativePadding0.end) + insets0.right;
        }
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v3 = 1;
        if(bottomSheetBehavior0.H) {
            int v4 = insets0.left;
            if(viewGroup$MarginLayoutParams0.leftMargin == v4) {
                v5 = 0;
            }
            else {
                viewGroup$MarginLayoutParams0.leftMargin = v4;
                v5 = 1;
            }
        }
        else {
            v5 = 0;
        }
        if(bottomSheetBehavior0.I) {
            int v6 = insets0.right;
            if(viewGroup$MarginLayoutParams0.rightMargin != v6) {
                viewGroup$MarginLayoutParams0.rightMargin = v6;
                v5 = 1;
            }
        }
        if(bottomSheetBehavior0.J) {
            int v7 = insets0.top;
            if(viewGroup$MarginLayoutParams0.topMargin == v7) {
                v3 = v5;
            }
            else {
                viewGroup$MarginLayoutParams0.topMargin = v7;
            }
        }
        else {
            v3 = v5;
        }
        if(v3 != 0) {
            view0.setLayoutParams(viewGroup$MarginLayoutParams0);
        }
        view0.setPadding(v1, view0.getPaddingTop(), v2, v);
        boolean z1 = this.a;
        if(z1) {
            bottomSheetBehavior0.B = insets1.bottom;
        }
        if(bottomSheetBehavior0.D || z1) {
            bottomSheetBehavior0.s(false);
        }
        return windowInsetsCompat0;
    }
}

