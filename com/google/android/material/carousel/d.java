package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R.dimen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d extends ItemDecoration {
    public final Paint m;
    public List n;

    public d() {
        Paint paint0 = new Paint();
        this.m = paint0;
        this.n = Collections.unmodifiableList(new ArrayList());
        paint0.setStrokeWidth(5.0f);
        paint0.setColor(0xFFFF00FF);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public final void onDrawOver(Canvas canvas0, RecyclerView recyclerView0, State recyclerView$State0) {
        super.onDrawOver(canvas0, recyclerView0, recyclerView$State0);
        Paint paint0 = this.m;
        paint0.setStrokeWidth(recyclerView0.getResources().getDimension(dimen.m3_carousel_debug_keyline_width));
        for(Object object0: this.n) {
            k k0 = (k)object0;
            paint0.setColor(ColorUtils.blendARGB(0xFFFF00FF, 0xFF0000FF, k0.c));
            if(((CarouselLayoutManager)recyclerView0.getLayoutManager()).isHorizontal()) {
                float f = (float)((CarouselLayoutManager)recyclerView0.getLayoutManager()).k.i();
                float f1 = (float)((CarouselLayoutManager)recyclerView0.getLayoutManager()).k.d();
                canvas0.drawLine(k0.b, f, k0.b, f1, paint0);
            }
            else {
                float f2 = (float)((CarouselLayoutManager)recyclerView0.getLayoutManager()).k.f();
                float f3 = (float)((CarouselLayoutManager)recyclerView0.getLayoutManager()).k.g();
                canvas0.drawLine(f2, k0.b, f3, k0.b, paint0);
            }
        }
    }
}

