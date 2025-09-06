package f8;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable;

public abstract class g extends MaterialShapeDrawable {
    public e y;
    public static final int z;

    public final void i(float f, float f1, float f2, float f3) {
        RectF rectF0 = this.y.v;
        if(f != rectF0.left || f1 != rectF0.top || f2 != rectF0.right || f3 != rectF0.bottom) {
            rectF0.set(f, f1, f2, f3);
            this.invalidateSelf();
        }
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public final Drawable mutate() {
        this.y = new e(this.y);
        return this;
    }
}

