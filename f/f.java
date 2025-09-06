package f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function3 {
    public final Canvas a;
    public final float b;

    public f(Canvas canvas0, float f) {
        this.a = canvas0;
        this.b = f;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((Bitmap)object0), "bitmap");
        float f = (float)this.a.getWidth();
        float f1 = (float)this.a.getWidth();
        RectF rectF0 = new RectF(f - this.b, ((Number)object1).floatValue(), f1, ((Number)object2).floatValue());
        this.a.drawBitmap(((Bitmap)object0), null, rectF0, null);
        return Unit.INSTANCE;
    }
}

