package f8;

import android.graphics.Canvas;

public final class f extends g {
    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public final void drawStrokeShape(Canvas canvas0) {
        if(this.y.v.isEmpty()) {
            super.drawStrokeShape(canvas0);
            return;
        }
        canvas0.save();
        canvas0.clipOutRect(this.y.v);
        super.drawStrokeShape(canvas0);
        canvas0.restore();
    }
}

