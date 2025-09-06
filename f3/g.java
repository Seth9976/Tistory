package f3;

import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;

public final class g extends RoundedBitmapDrawable {
    @Override  // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public final void a(int v, int v1, int v2, Rect rect0, Rect rect1) {
        Gravity.apply(v, v1, v2, rect0, rect1, 0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline0) {
        this.b();
        outline0.setRoundRect(this.h, this.getCornerRadius());
    }

    @Override  // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public final boolean hasMipMap() {
        return this.a != null && this.a.hasMipMap();
    }

    @Override  // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public final void setMipMap(boolean z) {
        Bitmap bitmap0 = this.a;
        if(bitmap0 != null) {
            bitmap0.setHasMipMap(z);
            this.invalidateSelf();
        }
    }
}

