package f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function3 {
    public final Canvas a;
    public final float b;

    public e(Canvas canvas0, float f) {
        this.a = canvas0;
        this.b = f;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((Bitmap)object0), "bitmap");
        RectF rectF0 = new RectF(0.0f, ((Number)object1).floatValue(), this.b, ((Number)object2).floatValue());
        this.a.drawBitmap(((Bitmap)object0), null, rectF0, null);
        return Unit.INSTANCE;
    }
}

