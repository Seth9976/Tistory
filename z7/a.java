package z7;

import android.view.View.MeasureSpec;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import com.google.android.material.navigation.NavigationBarItemView;

public final class a extends NavigationBarItemView {
    @Override  // com.google.android.material.navigation.NavigationBarItemView
    public final int getItemDefaultMarginResId() {
        return dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override  // com.google.android.material.navigation.NavigationBarItemView
    public final int getItemLayoutResId() {
        return layout.mtrl_navigation_rail_item;
    }

    @Override  // android.widget.FrameLayout
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(View.MeasureSpec.getMode(v1) == 0) {
            int v2 = View.MeasureSpec.getSize(v1);
            int v3 = Math.max(this.getMeasuredHeight(), v2);
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), v3);
        }
    }
}

