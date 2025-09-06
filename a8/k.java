package a8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.a;

public abstract class k {
    public final BaseProgressIndicatorSpec a;
    public a b;

    public k(BaseProgressIndicatorSpec baseProgressIndicatorSpec0) {
        this.a = baseProgressIndicatorSpec0;
    }

    public abstract void a(Canvas arg1, Rect arg2, float arg3);

    public abstract void b(Canvas arg1, Paint arg2, float arg3, float arg4, int arg5);

    public abstract void c(Canvas arg1, Paint arg2);

    public abstract int d();

    public abstract int e();
}

