package nb;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import kotlin.jvm.internal.Intrinsics;

public final class e implements Runnable {
    public final View a;
    public final float b;
    public final View c;

    public e(View view0, View view1, float f) {
        this.a = view0;
        this.b = f;
        this.c = view1;
    }

    @Override
    public final void run() {
        Intrinsics.checkNotNullParameter(this.a, "$parentView");
        Intrinsics.checkNotNullParameter(this.c, "$this_setWidthHeightByParent");
        float f = (float)this.a.getWidth();
        float f1 = ((float)this.a.getHeight()) * this.b;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.c.getLayoutParams();
        viewGroup$LayoutParams0.width = (int)(f * this.b);
        viewGroup$LayoutParams0.height = (int)f1;
        this.c.requestLayout();
    }
}

