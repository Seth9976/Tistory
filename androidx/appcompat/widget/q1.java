package androidx.appcompat.widget;

import android.graphics.Canvas;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;

public final class q1 extends DrawableWrapperCompat {
    public boolean b;

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public final void draw(Canvas canvas0) {
        if(this.b) {
            super.draw(canvas0);
        }
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public final void setHotspot(float f, float f1) {
        if(this.b) {
            super.setHotspot(f, f1);
        }
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public final void setHotspotBounds(int v, int v1, int v2, int v3) {
        if(this.b) {
            super.setHotspotBounds(v, v1, v2, v3);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public final boolean setState(int[] arr_v) {
        return this.b ? super.setState(arr_v) : false;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public final boolean setVisible(boolean z, boolean z1) {
        return this.b ? super.setVisible(z, z1) : false;
    }
}

