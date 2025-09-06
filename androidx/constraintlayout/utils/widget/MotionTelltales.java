package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R.styleable;

public class MotionTelltales extends MockView {
    public final Paint k;
    public MotionLayout l;
    public final float[] m;
    public final Matrix n;
    public int o;
    public int p;
    public float q;

    public MotionTelltales(Context context0) {
        super(context0);
        this.k = new Paint();
        this.m = new float[2];
        this.n = new Matrix();
        this.o = 0;
        this.p = 0xFFFF00FF;
        this.q = 0.25f;
        this.b(context0, null);
    }

    public MotionTelltales(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.k = new Paint();
        this.m = new float[2];
        this.n = new Matrix();
        this.o = 0;
        this.p = 0xFFFF00FF;
        this.q = 0.25f;
        this.b(context0, attributeSet0);
    }

    public MotionTelltales(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.k = new Paint();
        this.m = new float[2];
        this.n = new Matrix();
        this.o = 0;
        this.p = 0xFFFF00FF;
        this.q = 0.25f;
        this.b(context0, attributeSet0);
    }

    public final void b(Context context0, AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.MotionTelltales);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.MotionTelltales_telltales_tailColor) {
                    this.p = typedArray0.getColor(v2, this.p);
                }
                else if(v2 == styleable.MotionTelltales_telltales_velocityMode) {
                    this.o = typedArray0.getInt(v2, this.o);
                }
                else if(v2 == styleable.MotionTelltales_telltales_tailScale) {
                    this.q = typedArray0.getFloat(v2, this.q);
                }
            }
            typedArray0.recycle();
        }
        this.k.setColor(this.p);
        this.k.setStrokeWidth(5.0f);
    }

    @Override  // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override  // androidx.constraintlayout.utils.widget.MockView
    public void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        Matrix matrix0 = this.getMatrix();
        Matrix matrix1 = this.n;
        matrix0.invert(matrix1);
        if(this.l == null) {
            ViewParent viewParent0 = this.getParent();
            if(viewParent0 instanceof MotionLayout) {
                this.l = (MotionLayout)viewParent0;
            }
            return;
        }
        int v = this.getWidth();
        int v1 = this.getHeight();
        float[] arr_f = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for(int v2 = 0; v2 < 5; ++v2) {
            float f = arr_f[v2];
            for(int v3 = 0; v3 < 5; ++v3) {
                float f1 = arr_f[v3];
                this.l.getViewVelocity(this, f1, f, this.m, this.o);
                matrix1.mapVectors(this.m);
                float f2 = ((float)v) * f1;
                float f3 = ((float)v1) * f;
                float f4 = this.q;
                float f5 = f2 - this.m[0] * f4;
                float f6 = f3 - this.m[1] * f4;
                matrix1.mapVectors(this.m);
                canvas0.drawLine(f2, f3, f5, f6, this.k);
            }
        }
    }

    @Override  // android.view.View
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.postInvalidate();
    }

    public void setText(CharSequence charSequence0) {
        this.mText = charSequence0.toString();
        this.requestLayout();
    }
}

