package f8;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

public final class e extends MaterialShapeDrawableState {
    public final RectF v;

    public e(ShapeAppearanceModel shapeAppearanceModel0, RectF rectF0) {
        super(shapeAppearanceModel0, null);
        this.v = rectF0;
    }

    public e(e e0) {
        super(e0);
        this.v = e0.v;
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState
    public final Drawable newDrawable() {
        Drawable drawable0 = new f(this);  // 初始化器: Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;)V
        drawable0.y = this;
        ((MaterialShapeDrawable)drawable0).invalidateSelf();
        return drawable0;
    }
}

