package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView.ScaleType;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.R.styleable;

public class ImageFilterButton extends AppCompatImageButton {
    public final c d;
    public float e;
    public float f;
    public float g;
    public Path h;
    public ViewOutlineProvider i;
    public RectF j;
    public final Drawable[] k;
    public LayerDrawable l;
    public boolean m;
    public Drawable n;
    public Drawable o;
    public float p;
    public float q;
    public float r;
    public float s;

    public ImageFilterButton(Context context0) {
        super(context0);
        this.d = new c();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = NaNf;
        this.k = new Drawable[2];
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = NaNf;
        this.q = NaNf;
        this.r = NaNf;
        this.s = NaNf;
        this.setPadding(0, 0, 0, 0);
    }

    public ImageFilterButton(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d = new c();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = NaNf;
        this.k = new Drawable[2];
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = NaNf;
        this.q = NaNf;
        this.r = NaNf;
        this.s = NaNf;
        this.a(attributeSet0);
    }

    public ImageFilterButton(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.d = new c();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = NaNf;
        this.k = new Drawable[2];
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = NaNf;
        this.q = NaNf;
        this.r = NaNf;
        this.s = NaNf;
        this.a(attributeSet0);
    }

    public final void a(AttributeSet attributeSet0) {
        this.setPadding(0, 0, 0, 0);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ImageFilterView);
            int v = typedArray0.getIndexCount();
            this.n = typedArray0.getDrawable(styleable.ImageFilterView_altSrc);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.ImageFilterView_crossfade) {
                    this.e = typedArray0.getFloat(v2, 0.0f);
                }
                else if(v2 == styleable.ImageFilterView_warmth) {
                    this.setWarmth(typedArray0.getFloat(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_saturation) {
                    this.setSaturation(typedArray0.getFloat(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_contrast) {
                    this.setContrast(typedArray0.getFloat(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_round) {
                    this.setRound(typedArray0.getDimension(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_roundPercent) {
                    this.setRoundPercent(typedArray0.getFloat(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_overlay) {
                    this.setOverlay(typedArray0.getBoolean(v2, this.m));
                }
                else if(v2 == styleable.ImageFilterView_imagePanX) {
                    this.setImagePanX(typedArray0.getFloat(v2, this.p));
                }
                else if(v2 == styleable.ImageFilterView_imagePanY) {
                    this.setImagePanY(typedArray0.getFloat(v2, this.q));
                }
                else if(v2 == styleable.ImageFilterView_imageRotate) {
                    this.setImageRotate(typedArray0.getFloat(v2, this.s));
                }
                else if(v2 == styleable.ImageFilterView_imageZoom) {
                    this.setImageZoom(typedArray0.getFloat(v2, this.r));
                }
            }
            typedArray0.recycle();
            Drawable drawable0 = this.getDrawable();
            this.o = drawable0;
            Drawable[] arr_drawable = this.k;
            if(this.n != null && drawable0 != null) {
                Drawable drawable1 = this.getDrawable().mutate();
                this.o = drawable1;
                arr_drawable[0] = drawable1;
                arr_drawable[1] = this.n.mutate();
                LayerDrawable layerDrawable0 = new LayerDrawable(arr_drawable);
                this.l = layerDrawable0;
                layerDrawable0.getDrawable(1).setAlpha(((int)(this.e * 255.0f)));
                if(!this.m) {
                    this.l.getDrawable(0).setAlpha(((int)((1.0f - this.e) * 255.0f)));
                }
                super.setImageDrawable(this.l);
                return;
            }
            Drawable drawable2 = this.getDrawable();
            this.o = drawable2;
            if(drawable2 != null) {
                Drawable drawable3 = drawable2.mutate();
                this.o = drawable3;
                arr_drawable[0] = drawable3;
            }
        }
    }

    public final void b() {
        float f = 0.0f;
        if(Float.isNaN(this.p) && Float.isNaN(this.q) && Float.isNaN(this.r) && Float.isNaN(this.s)) {
            return;
        }
        float f1 = Float.isNaN(this.p) ? 0.0f : this.p;
        float f2 = Float.isNaN(this.q) ? 0.0f : this.q;
        float f3 = Float.isNaN(this.r) ? 1.0f : this.r;
        if(!Float.isNaN(this.s)) {
            f = this.s;
        }
        Matrix matrix0 = new Matrix();
        matrix0.reset();
        float f4 = (float)this.getDrawable().getIntrinsicWidth();
        float f5 = (float)this.getDrawable().getIntrinsicHeight();
        float f6 = (float)this.getWidth();
        float f7 = (float)this.getHeight();
        float f8 = f3 * (f4 * f7 < f5 * f6 ? f6 / f4 : f7 / f5);
        matrix0.postScale(f8, f8);
        matrix0.postTranslate(((f6 - f4 * f8) * f1 + f6 - f4 * f8) * 0.5f, ((f7 - f8 * f5) * f2 + f7 - f8 * f5) * 0.5f);
        matrix0.postRotate(f, f6 / 2.0f, f7 / 2.0f);
        this.setImageMatrix(matrix0);
        this.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void c() {
        if(Float.isNaN(this.p) && Float.isNaN(this.q) && Float.isNaN(this.r) && Float.isNaN(this.s)) {
            this.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return;
        }
        this.b();
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        super.draw(canvas0);
    }

    public float getContrast() {
        return this.d.f;
    }

    public float getCrossfade() {
        return this.e;
    }

    public float getImagePanX() {
        return this.p;
    }

    public float getImagePanY() {
        return this.q;
    }

    public float getImageRotate() {
        return this.s;
    }

    public float getImageZoom() {
        return this.r;
    }

    public float getRound() {
        return this.g;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getSaturation() {
        return this.d.e;
    }

    public float getWarmth() {
        return this.d.g;
    }

    @Override  // android.view.View
    public void layout(int v, int v1, int v2, int v3) {
        super.layout(v, v1, v2, v3);
        this.b();
    }

    public void setAltImageResource(int v) {
        Drawable drawable0 = AppCompatResources.getDrawable(this.getContext(), v).mutate();
        this.n = drawable0;
        this.k[0] = this.o;
        this.k[1] = drawable0;
        LayerDrawable layerDrawable0 = new LayerDrawable(this.k);
        this.l = layerDrawable0;
        super.setImageDrawable(layerDrawable0);
        this.setCrossfade(this.e);
    }

    public void setBrightness(float f) {
        this.d.d = f;
        this.d.a(this);
    }

    public void setContrast(float f) {
        this.d.f = f;
        this.d.a(this);
    }

    public void setCrossfade(float f) {
        this.e = f;
        if(this.k != null) {
            if(!this.m) {
                this.l.getDrawable(0).setAlpha(((int)((1.0f - this.e) * 255.0f)));
            }
            this.l.getDrawable(1).setAlpha(((int)(this.e * 255.0f)));
            super.setImageDrawable(this.l);
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatImageButton
    public void setImageDrawable(Drawable drawable0) {
        if(this.n != null && drawable0 != null) {
            Drawable drawable1 = drawable0.mutate();
            this.o = drawable1;
            this.k[0] = drawable1;
            this.k[1] = this.n;
            LayerDrawable layerDrawable0 = new LayerDrawable(this.k);
            this.l = layerDrawable0;
            super.setImageDrawable(layerDrawable0);
            this.setCrossfade(this.e);
            return;
        }
        super.setImageDrawable(drawable0);
    }

    public void setImagePanX(float f) {
        this.p = f;
        this.c();
    }

    public void setImagePanY(float f) {
        this.q = f;
        this.c();
    }

    @Override  // androidx.appcompat.widget.AppCompatImageButton
    public void setImageResource(int v) {
        if(this.n != null) {
            Drawable drawable0 = AppCompatResources.getDrawable(this.getContext(), v).mutate();
            this.o = drawable0;
            this.k[0] = drawable0;
            this.k[1] = this.n;
            LayerDrawable layerDrawable0 = new LayerDrawable(this.k);
            this.l = layerDrawable0;
            super.setImageDrawable(layerDrawable0);
            this.setCrossfade(this.e);
            return;
        }
        super.setImageResource(v);
    }

    public void setImageRotate(float f) {
        this.s = f;
        this.c();
    }

    public void setImageZoom(float f) {
        this.r = f;
        this.c();
    }

    private void setOverlay(boolean z) {
        this.m = z;
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
            if(this.h == null) {
                this.h = new Path();
            }
            if(this.j == null) {
                this.j = new RectF();
            }
            if(this.i == null) {
                a a0 = new a(this, 1);
                this.i = a0;
                this.setOutlineProvider(a0);
            }
            this.setClipToOutline(true);
            int v = this.getWidth();
            int v1 = this.getHeight();
            this.j.set(0.0f, 0.0f, ((float)v), ((float)v1));
            this.h.reset();
            this.h.addRoundRect(this.j, this.g, this.g, Path.Direction.CW);
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
            if(this.h == null) {
                this.h = new Path();
            }
            if(this.j == null) {
                this.j = new RectF();
            }
            if(this.i == null) {
                a a0 = new a(this, 0);
                this.i = a0;
                this.setOutlineProvider(a0);
            }
            this.setClipToOutline(true);
            int v = this.getWidth();
            int v1 = this.getHeight();
            float f1 = ((float)Math.min(v, v1)) * this.f / 2.0f;
            this.j.set(0.0f, 0.0f, ((float)v), ((float)v1));
            this.h.reset();
            this.h.addRoundRect(this.j, f1, f1, Path.Direction.CW);
        }
        if(z) {
            this.invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        this.d.e = f;
        this.d.a(this);
    }

    public void setWarmth(float f) {
        this.d.g = f;
        this.d.a(this);
    }
}

