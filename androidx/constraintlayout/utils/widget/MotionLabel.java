package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R.attr;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.constraintlayout.widget.R.styleable;

public class MotionLabel extends View implements FloatLayout {
    public float A;
    public float B;
    public Drawable C;
    public Matrix D;
    public Bitmap E;
    public BitmapShader F;
    public Matrix G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final Paint L;
    public int M;
    public Rect N;
    public Paint O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public final TextPaint a;
    public Path b;
    public int c;
    public int d;
    public boolean e;
    public float f;
    public float g;
    public ViewOutlineProvider h;
    public RectF i;
    public float j;
    public float k;
    public int l;
    public int m;
    public float n;
    public String o;
    public boolean p;
    public final Rect q;
    public int r;
    public int s;
    public int t;
    public int u;
    public String v;
    public int w;
    public int x;
    public boolean y;
    public float z;

    public MotionLabel(Context context0) {
        super(context0);
        this.a = new TextPaint();
        this.b = new Path();
        this.c = 0xFFFF;
        this.d = 0xFFFF;
        this.e = false;
        this.f = 0.0f;
        this.g = NaNf;
        this.j = 48.0f;
        this.k = NaNf;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = true;
        this.q = new Rect();
        this.r = 1;
        this.s = 1;
        this.t = 1;
        this.u = 1;
        this.w = 0x800033;
        this.x = 0;
        this.y = false;
        this.H = NaNf;
        this.I = NaNf;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = new Paint();
        this.M = 0;
        this.Q = NaNf;
        this.R = NaNf;
        this.S = NaNf;
        this.T = NaNf;
        this.b(context0, null);
    }

    public MotionLabel(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new TextPaint();
        this.b = new Path();
        this.c = 0xFFFF;
        this.d = 0xFFFF;
        this.e = false;
        this.f = 0.0f;
        this.g = NaNf;
        this.j = 48.0f;
        this.k = NaNf;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = true;
        this.q = new Rect();
        this.r = 1;
        this.s = 1;
        this.t = 1;
        this.u = 1;
        this.w = 0x800033;
        this.x = 0;
        this.y = false;
        this.H = NaNf;
        this.I = NaNf;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = new Paint();
        this.M = 0;
        this.Q = NaNf;
        this.R = NaNf;
        this.S = NaNf;
        this.T = NaNf;
        this.b(context0, attributeSet0);
    }

    public MotionLabel(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new TextPaint();
        this.b = new Path();
        this.c = 0xFFFF;
        this.d = 0xFFFF;
        this.e = false;
        this.f = 0.0f;
        this.g = NaNf;
        this.j = 48.0f;
        this.k = NaNf;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = true;
        this.q = new Rect();
        this.r = 1;
        this.s = 1;
        this.t = 1;
        this.u = 1;
        this.w = 0x800033;
        this.x = 0;
        this.y = false;
        this.H = NaNf;
        this.I = NaNf;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = new Paint();
        this.M = 0;
        this.Q = NaNf;
        this.R = NaNf;
        this.S = NaNf;
        this.T = NaNf;
        this.b(context0, attributeSet0);
    }

    public final void a(float f) {
        if(!this.e && f == 1.0f) {
            return;
        }
        this.b.reset();
        String s = this.o;
        int v = s.length();
        Rect rect0 = this.q;
        this.a.getTextBounds(s, 0, v, rect0);
        this.a.getTextPath(s, 0, v, 0.0f, 0.0f, this.b);
        if(f != 1.0f) {
            Log.v("MotionLabel", ".(null:-1) a() scale " + f);
            Matrix matrix0 = new Matrix();
            matrix0.postScale(f, f);
            this.b.transform(matrix0);
        }
        --rect0.right;
        ++rect0.left;
        ++rect0.bottom;
        --rect0.top;
        RectF rectF0 = new RectF();
        rectF0.bottom = (float)this.getHeight();
        rectF0.right = (float)this.getWidth();
        this.p = false;
    }

    public final void b(Context context0, AttributeSet attributeSet0) {
        Typeface typeface0;
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(attr.colorPrimary, typedValue0, true);
        this.c = typedValue0.data;
        TextPaint textPaint0 = this.a;
        textPaint0.setColor(typedValue0.data);
        boolean z = false;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.MotionLabel);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.MotionLabel_android_text) {
                    this.setText(typedArray0.getText(v2));
                }
                else if(v2 == styleable.MotionLabel_android_fontFamily) {
                    this.v = typedArray0.getString(v2);
                }
                else if(v2 == styleable.MotionLabel_scaleFromTextSize) {
                    this.k = (float)typedArray0.getDimensionPixelSize(v2, ((int)this.k));
                }
                else if(v2 == styleable.MotionLabel_android_textSize) {
                    this.j = (float)typedArray0.getDimensionPixelSize(v2, ((int)this.j));
                }
                else if(v2 == styleable.MotionLabel_android_textStyle) {
                    this.l = typedArray0.getInt(v2, this.l);
                }
                else if(v2 == styleable.MotionLabel_android_typeface) {
                    this.m = typedArray0.getInt(v2, this.m);
                }
                else if(v2 == styleable.MotionLabel_android_textColor) {
                    this.c = typedArray0.getColor(v2, this.c);
                }
                else if(v2 == styleable.MotionLabel_borderRound) {
                    float f = typedArray0.getDimension(v2, this.g);
                    this.g = f;
                    this.setRound(f);
                }
                else if(v2 == styleable.MotionLabel_borderRoundPercent) {
                    float f1 = typedArray0.getFloat(v2, this.f);
                    this.f = f1;
                    this.setRoundPercent(f1);
                }
                else if(v2 == styleable.MotionLabel_android_gravity) {
                    this.setGravity(typedArray0.getInt(v2, -1));
                }
                else if(v2 == styleable.MotionLabel_android_autoSizeTextType) {
                    this.x = typedArray0.getInt(v2, 0);
                }
                else if(v2 == styleable.MotionLabel_textOutlineColor) {
                    this.d = typedArray0.getInt(v2, this.d);
                    this.e = true;
                }
                else if(v2 == styleable.MotionLabel_textOutlineThickness) {
                    this.n = typedArray0.getDimension(v2, this.n);
                    this.e = true;
                }
                else if(v2 == styleable.MotionLabel_textBackground) {
                    this.C = typedArray0.getDrawable(v2);
                    this.e = true;
                }
                else if(v2 == styleable.MotionLabel_textBackgroundPanX) {
                    this.Q = typedArray0.getFloat(v2, this.Q);
                }
                else if(v2 == styleable.MotionLabel_textBackgroundPanY) {
                    this.R = typedArray0.getFloat(v2, this.R);
                }
                else if(v2 == styleable.MotionLabel_textPanX) {
                    this.J = typedArray0.getFloat(v2, this.J);
                }
                else if(v2 == styleable.MotionLabel_textPanY) {
                    this.K = typedArray0.getFloat(v2, this.K);
                }
                else if(v2 == styleable.MotionLabel_textBackgroundRotate) {
                    this.T = typedArray0.getFloat(v2, this.T);
                }
                else if(v2 == styleable.MotionLabel_textBackgroundZoom) {
                    this.S = typedArray0.getFloat(v2, this.S);
                }
                else if(v2 == styleable.MotionLabel_textureHeight) {
                    this.H = typedArray0.getDimension(v2, this.H);
                }
                else if(v2 == styleable.MotionLabel_textureWidth) {
                    this.I = typedArray0.getDimension(v2, this.I);
                }
                else if(v2 == styleable.MotionLabel_textureEffect) {
                    this.M = typedArray0.getInt(v2, this.M);
                }
            }
            typedArray0.recycle();
        }
        if(this.C != null) {
            this.G = new Matrix();
            int v3 = this.C.getIntrinsicWidth();
            int v4 = this.C.getIntrinsicHeight();
            if(v3 <= 0) {
                v3 = this.getWidth();
                if(v3 == 0) {
                    v3 = Float.isNaN(this.I) ? 0x80 : ((int)this.I);
                }
            }
            if(v4 <= 0) {
                v4 = this.getHeight();
                if(v4 == 0) {
                    v4 = Float.isNaN(this.H) ? 0x80 : ((int)this.H);
                }
            }
            if(this.M != 0) {
                v3 /= 2;
                v4 /= 2;
            }
            this.E = Bitmap.createBitmap(v3, v4, Bitmap.Config.ARGB_8888);
            Canvas canvas0 = new Canvas(this.E);
            this.C.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
            this.C.setFilterBitmap(true);
            this.C.draw(canvas0);
            if(this.M != 0) {
                Bitmap bitmap0 = this.E;
                int v5 = bitmap0.getWidth() / 2;
                int v6 = bitmap0.getHeight() / 2;
                Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, v5, v6, true);
                for(int v7 = 0; v7 < 4 && v5 >= 0x20 && v6 >= 0x20; ++v7) {
                    v5 /= 2;
                    v6 /= 2;
                    bitmap1 = Bitmap.createScaledBitmap(bitmap1, v5, v6, true);
                }
                this.E = bitmap1;
            }
            this.F = new BitmapShader(this.E, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        }
        this.r = this.getPaddingLeft();
        this.s = this.getPaddingRight();
        this.t = this.getPaddingTop();
        this.u = this.getPaddingBottom();
        String s = this.v;
        int v8 = this.m;
        int v9 = this.l;
        if(s == null) {
            typeface0 = null;
        label_137:
            switch(v8) {
                case 1: {
                    typeface0 = Typeface.SANS_SERIF;
                    break;
                }
                case 2: {
                    typeface0 = Typeface.SERIF;
                    break;
                }
                default: {
                    if(v8 == 3) {
                        typeface0 = Typeface.MONOSPACE;
                    }
                }
            }
            float f2 = 0.0f;
            if(v9 > 0) {
                Typeface typeface1 = typeface0 == null ? Typeface.defaultFromStyle(v9) : Typeface.create(typeface0, v9);
                this.setTypeface(typeface1);
                int v10 = ~(typeface1 == null ? 0 : typeface1.getStyle()) & v9;
                if((v10 & 1) != 0) {
                    z = true;
                }
                textPaint0.setFakeBoldText(z);
                if((v10 & 2) != 0) {
                    f2 = -0.25f;
                }
                textPaint0.setTextSkewX(f2);
            }
            else {
                textPaint0.setFakeBoldText(false);
                textPaint0.setTextSkewX(0.0f);
                this.setTypeface(typeface0);
            }
        }
        else {
            typeface0 = Typeface.create(s, v9);
            if(typeface0 == null) {
                goto label_137;
            }
            else {
                this.setTypeface(typeface0);
            }
        }
        textPaint0.setColor(this.c);
        textPaint0.setStrokeWidth(this.n);
        textPaint0.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint0.setFlags(0x80);
        this.setTextSize(this.j);
        textPaint0.setAntiAlias(true);
    }

    public final void c() {
        float f = 0.0f;
        float f1 = Float.isNaN(this.Q) ? 0.0f : this.Q;
        float f2 = Float.isNaN(this.R) ? 0.0f : this.R;
        float f3 = Float.isNaN(this.S) ? 1.0f : this.S;
        if(!Float.isNaN(this.T)) {
            f = this.T;
        }
        this.G.reset();
        float f4 = (float)this.E.getWidth();
        float f5 = (float)this.E.getHeight();
        float f6 = Float.isNaN(this.I) ? this.A : this.I;
        float f7 = Float.isNaN(this.H) ? this.B : this.H;
        float f8 = f3 * (f4 * f7 < f5 * f6 ? f6 / f4 : f7 / f5);
        this.G.postScale(f8, f8);
        float f9 = f4 * f8;
        float f10 = f6 - f9;
        float f11 = f8 * f5;
        float f12 = Float.isNaN(this.H) ? f7 - f11 : this.H / 2.0f;
        if(!Float.isNaN(this.I)) {
            f10 = this.I / 2.0f;
        }
        this.G.postTranslate((f1 * f10 + f6 - f9) * 0.5f, (f2 * f12 + f7 - f11) * 0.5f);
        this.G.postRotate(f, f6 / 2.0f, f7 / 2.0f);
        this.F.setLocalMatrix(this.G);
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.k) ? 1.0f : this.j / this.k;
        float f1 = this.a.measureText(this.o, 0, this.o.length());
        float f2 = (Float.isNaN(this.A) ? ((float)this.getMeasuredWidth()) : this.A) - ((float)this.getPaddingLeft()) - ((float)this.getPaddingRight()) - f1 * f;
        return (this.J + 1.0f) * f2 / 2.0f;
    }

    public float getRound() {
        return this.g;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getScaleFromTextSize() {
        return this.k;
    }

    public float getTextBackgroundPanX() {
        return this.Q;
    }

    public float getTextBackgroundPanY() {
        return this.R;
    }

    public float getTextBackgroundRotate() {
        return this.T;
    }

    public float getTextBackgroundZoom() {
        return this.S;
    }

    public int getTextOutlineColor() {
        return this.d;
    }

    public float getTextPanX() {
        return this.J;
    }

    public float getTextPanY() {
        return this.K;
    }

    public float getTextureHeight() {
        return this.H;
    }

    public float getTextureWidth() {
        return this.I;
    }

    public Typeface getTypeface() {
        return this.a.getTypeface();
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.k) ? 1.0f : this.j / this.k;
        Paint.FontMetrics paint$FontMetrics0 = this.a.getFontMetrics();
        float f1 = (Float.isNaN(this.B) ? ((float)this.getMeasuredHeight()) : this.B) - ((float)this.getPaddingTop()) - ((float)this.getPaddingBottom());
        return (1.0f - this.K) * (f1 - (paint$FontMetrics0.descent - paint$FontMetrics0.ascent) * f) / 2.0f - f * paint$FontMetrics0.ascent;
    }

    @Override  // androidx.constraintlayout.motion.widget.FloatLayout
    public void layout(float f, float f1, float f2, float f3) {
        this.z = f - ((float)(((int)(f + 0.5f))));
        int v = ((int)(f2 + 0.5f)) - ((int)(f + 0.5f));
        int v1 = ((int)(f3 + 0.5f)) - ((int)(f1 + 0.5f));
        float f4 = f2 - f;
        this.A = f4;
        float f5 = f3 - f1;
        this.B = f5;
        if(this.G != null) {
            this.A = f4;
            this.B = f5;
            this.c();
        }
        if(this.getMeasuredHeight() != v1 || this.getMeasuredWidth() != v) {
            this.measure(View.MeasureSpec.makeMeasureSpec(v, 0x40000000), View.MeasureSpec.makeMeasureSpec(v1, 0x40000000));
        }
        super.layout(((int)(f + 0.5f)), ((int)(f1 + 0.5f)), ((int)(f2 + 0.5f)), ((int)(f3 + 0.5f)));
        if(this.y) {
            TextPaint textPaint0 = this.a;
            if(this.N == null) {
                this.O = new Paint();
                this.N = new Rect();
                this.O.set(textPaint0);
                this.P = this.O.getTextSize();
            }
            this.A = f4;
            this.B = f5;
            this.O.getTextBounds(this.o, 0, this.o.length(), this.N);
            int v2 = this.N.width();
            float f6 = ((float)this.N.height()) * 1.3f;
            float f7 = f4 - ((float)this.s) - ((float)this.r);
            float f8 = f5 - ((float)this.u) - ((float)this.t);
            if(((float)v2) * f8 > f6 * f7) {
                textPaint0.setTextSize(this.P * f7 / ((float)v2));
            }
            else {
                textPaint0.setTextSize(this.P * f8 / f6);
            }
            if(this.e || !Float.isNaN(this.k)) {
                this.a((Float.isNaN(this.k) ? 1.0f : this.j / this.k));
            }
        }
    }

    @Override  // android.view.View
    public void layout(int v, int v1, int v2, int v3) {
        super.layout(v, v1, v2, v3);
        boolean z = Float.isNaN(this.k);
        float f = z ? 1.0f : this.j / this.k;
        this.A = (float)(v2 - v);
        this.B = (float)(v3 - v1);
        if(this.y) {
            TextPaint textPaint0 = this.a;
            if(this.N == null) {
                this.O = new Paint();
                this.N = new Rect();
                this.O.set(textPaint0);
                this.P = this.O.getTextSize();
            }
            this.O.getTextBounds(this.o, 0, this.o.length(), this.N);
            int v4 = this.N.width();
            int v5 = (int)(((float)this.N.height()) * 1.3f);
            float f1 = this.A - ((float)this.s) - ((float)this.r);
            float f2 = this.B - ((float)this.u) - ((float)this.t);
            if(!z) {
                f = ((float)v4) * f2 > ((float)v5) * f1 ? f1 / ((float)v4) : f2 / ((float)v5);
            }
            else if(((float)v4) * f2 > ((float)v5) * f1) {
                textPaint0.setTextSize(this.P * f1 / ((float)v4));
            }
            else {
                textPaint0.setTextSize(this.P * f2 / ((float)v5));
            }
        }
        if(this.e || !z) {
            if(this.G != null) {
                this.A = ((float)v2) - ((float)v);
                this.B = ((float)v3) - ((float)v1);
                this.c();
            }
            this.a(f);
        }
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        float f = Float.isNaN(this.k) ? 1.0f : this.j / this.k;
        super.onDraw(canvas0);
        TextPaint textPaint0 = this.a;
        if(!this.e && f == 1.0f) {
            float f1 = (float)this.r;
            float f2 = this.getHorizontalOffset();
            float f3 = (float)this.t;
            float f4 = this.getVerticalOffset();
            canvas0.drawText(this.o, this.z + (f1 + f2), f3 + f4, textPaint0);
            return;
        }
        if(this.p) {
            this.a(f);
        }
        if(this.D == null) {
            this.D = new Matrix();
        }
        if(this.e) {
            Paint paint0 = this.L;
            paint0.set(textPaint0);
            this.D.reset();
            float f5 = ((float)this.r) + this.getHorizontalOffset();
            float f6 = ((float)this.t) + this.getVerticalOffset();
            this.D.postTranslate(f5, f6);
            this.D.preScale(f, f);
            this.b.transform(this.D);
            if(this.F == null) {
                textPaint0.setColor(this.c);
            }
            else {
                textPaint0.setFilterBitmap(true);
                textPaint0.setShader(this.F);
            }
            textPaint0.setStyle(Paint.Style.FILL);
            textPaint0.setStrokeWidth(this.n);
            canvas0.drawPath(this.b, textPaint0);
            if(this.F != null) {
                textPaint0.setShader(null);
            }
            textPaint0.setColor(this.d);
            textPaint0.setStyle(Paint.Style.STROKE);
            textPaint0.setStrokeWidth(this.n);
            canvas0.drawPath(this.b, textPaint0);
            this.D.reset();
            this.D.postTranslate(-f5, -f6);
            this.b.transform(this.D);
            textPaint0.set(paint0);
            return;
        }
        float f7 = ((float)this.r) + this.getHorizontalOffset();
        float f8 = ((float)this.t) + this.getVerticalOffset();
        this.D.reset();
        this.D.preTranslate(f7, f8);
        this.b.transform(this.D);
        textPaint0.setColor(this.c);
        textPaint0.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint0.setStrokeWidth(this.n);
        canvas0.drawPath(this.b, textPaint0);
        this.D.reset();
        this.D.preTranslate(-f7, -f8);
        this.b.transform(this.D);
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = View.MeasureSpec.getSize(v1);
        this.y = false;
        this.r = this.getPaddingLeft();
        this.s = this.getPaddingRight();
        this.t = this.getPaddingTop();
        this.u = this.getPaddingBottom();
        if(v2 != 0x40000000 || v3 != 0x40000000) {
            TextPaint textPaint0 = this.a;
            Rect rect0 = this.q;
            textPaint0.getTextBounds(this.o, 0, this.o.length(), rect0);
            if(v2 != 0x40000000) {
                v4 = (int)(((float)rect0.width()) + 0.99999f);
            }
            v4 += this.r + this.s;
            if(v3 != 0x40000000) {
                int v6 = (int)(((float)textPaint0.getFontMetricsInt(null)) + 0.99999f);
                if(v3 == 0x80000000) {
                    v6 = Math.min(v5, v6);
                }
                v5 = this.t + this.u + v6;
            }
        }
        else if(this.x != 0) {
            this.y = true;
        }
        this.setMeasuredDimension(v4, v5);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int v) {
        if((v & 0x800007) == 0) {
            v |= 0x800003;
        }
        if((v & 0x70) == 0) {
            v |= 0x30;
        }
        if(v != this.w) {
            this.invalidate();
        }
        this.w = v;
        switch(v & 0x70) {
            case 0x30: {
                this.K = -1.0f;
                break;
            }
            case 80: {
                this.K = 1.0f;
                break;
            }
            default: {
                this.K = 0.0f;
            }
        }
        if((v & 0x800007) != 3) {
            switch(v & 0x800007) {
                case 5: {
                    this.J = 1.0f;
                    return;
                }
                case 0x800003: {
                    break;
                }
                default: {
                    if((v & 0x800007) != 0x800005) {
                        this.J = 0.0f;
                        return;
                    }
                    this.J = 1.0f;
                    return;
                }
            }
        }
        this.J = -1.0f;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if(Float.isNaN(f)) {
            this.g = f;
            float f1 = this.f;
            this.f = -1.0f;
            this.setRoundPercent(f1);
            return;
        }
        boolean z = Float.compare(this.g, f) != 0;
        this.g = f;
        if(f == 0.0f) {
            this.setClipToOutline(false);
        }
        else {
            if(this.b == null) {
                this.b = new Path();
            }
            if(this.i == null) {
                this.i = new RectF();
            }
            if(this.h == null) {
                e e0 = new e(this, 1);
                this.h = e0;
                this.setOutlineProvider(e0);
            }
            this.setClipToOutline(true);
            int v = this.getWidth();
            int v1 = this.getHeight();
            this.i.set(0.0f, 0.0f, ((float)v), ((float)v1));
            this.b.reset();
            this.b.addRoundRect(this.i, this.g, this.g, Path.Direction.CW);
        }
        if(z) {
            this.invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z = Float.compare(this.f, f) != 0;
        this.f = f;
        if(f == 0.0f) {
            this.setClipToOutline(false);
        }
        else {
            if(this.b == null) {
                this.b = new Path();
            }
            if(this.i == null) {
                this.i = new RectF();
            }
            if(this.h == null) {
                e e0 = new e(this, 0);
                this.h = e0;
                this.setOutlineProvider(e0);
            }
            this.setClipToOutline(true);
            int v = this.getWidth();
            int v1 = this.getHeight();
            float f1 = ((float)Math.min(v, v1)) * this.f / 2.0f;
            this.i.set(0.0f, 0.0f, ((float)v), ((float)v1));
            this.b.reset();
            this.b.addRoundRect(this.i, f1, f1, Path.Direction.CW);
        }
        if(z) {
            this.invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.k = f;
    }

    public void setText(CharSequence charSequence0) {
        this.o = charSequence0.toString();
        this.invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.Q = f;
        this.c();
        this.invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.R = f;
        this.c();
        this.invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.T = f;
        this.c();
        this.invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.S = f;
        this.c();
        this.invalidate();
    }

    public void setTextFillColor(int v) {
        this.c = v;
        this.invalidate();
    }

    public void setTextOutlineColor(int v) {
        this.d = v;
        this.e = true;
        this.invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.n = f;
        this.e = true;
        if(Float.isNaN(f)) {
            this.n = 1.0f;
            this.e = false;
        }
        this.invalidate();
    }

    public void setTextPanX(float f) {
        this.J = f;
        this.invalidate();
    }

    public void setTextPanY(float f) {
        this.K = f;
        this.invalidate();
    }

    public void setTextSize(float f) {
        this.j = f;
        Log.v("MotionLabel", ".(null:-1) setTextSize()  " + f + " / " + this.k);
        if(!Float.isNaN(this.k)) {
            f = this.k;
        }
        this.a.setTextSize(f);
        this.a((Float.isNaN(this.k) ? 1.0f : this.j / this.k));
        this.requestLayout();
        this.invalidate();
    }

    public void setTextureHeight(float f) {
        this.H = f;
        this.c();
        this.invalidate();
    }

    public void setTextureWidth(float f) {
        this.I = f;
        this.c();
        this.invalidate();
    }

    public void setTypeface(Typeface typeface0) {
        TextPaint textPaint0 = this.a;
        if(textPaint0.getTypeface() != typeface0) {
            textPaint0.setTypeface(typeface0);
        }
    }
}

