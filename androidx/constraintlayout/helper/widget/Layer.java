package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R.styleable;

public class Layer extends ConstraintHelper {
    public float b;
    public float c;
    public float d;
    public ConstraintLayout e;
    public float f;
    public float g;
    public final boolean h;
    public View[] i;
    public float j;
    public float k;
    public boolean l;
    public boolean m;
    protected float mComputedCenterX;
    protected float mComputedCenterY;
    protected float mComputedMaxX;
    protected float mComputedMaxY;
    protected float mComputedMinX;
    protected float mComputedMinY;

    public Layer(Context context0) {
        super(context0);
        this.b = NaNf;
        this.c = NaNf;
        this.d = NaNf;
        this.f = 1.0f;
        this.g = 1.0f;
        this.mComputedCenterX = NaNf;
        this.mComputedCenterY = NaNf;
        this.mComputedMaxX = NaNf;
        this.mComputedMaxY = NaNf;
        this.mComputedMinX = NaNf;
        this.mComputedMinY = NaNf;
        this.h = true;
        this.i = null;
        this.j = 0.0f;
        this.k = 0.0f;
    }

    public Layer(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = NaNf;
        this.c = NaNf;
        this.d = NaNf;
        this.f = 1.0f;
        this.g = 1.0f;
        this.mComputedCenterX = NaNf;
        this.mComputedCenterY = NaNf;
        this.mComputedMaxX = NaNf;
        this.mComputedMaxY = NaNf;
        this.mComputedMinX = NaNf;
        this.mComputedMinY = NaNf;
        this.h = true;
        this.i = null;
        this.j = 0.0f;
        this.k = 0.0f;
    }

    public Layer(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b = NaNf;
        this.c = NaNf;
        this.d = NaNf;
        this.f = 1.0f;
        this.g = 1.0f;
        this.mComputedCenterX = NaNf;
        this.mComputedCenterY = NaNf;
        this.mComputedMaxX = NaNf;
        this.mComputedMaxY = NaNf;
        this.mComputedMinX = NaNf;
        this.mComputedMinY = NaNf;
        this.h = true;
        this.i = null;
        this.j = 0.0f;
        this.k = 0.0f;
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void applyLayoutFeaturesInConstraintSet(ConstraintLayout constraintLayout0) {
        this.applyLayoutFeatures(constraintLayout0);
    }

    public void calcCenters() {
        if(this.e == null) {
            return;
        }
        if(!this.h && !Float.isNaN(this.mComputedCenterX) && !Float.isNaN(this.mComputedCenterY)) {
            return;
        }
        if(!Float.isNaN(this.b) && !Float.isNaN(this.c)) {
            this.mComputedCenterY = this.c;
            this.mComputedCenterX = this.b;
            return;
        }
        View[] arr_view = this.getViews(this.e);
        int v1 = arr_view[0].getLeft();
        int v2 = arr_view[0].getTop();
        int v3 = arr_view[0].getRight();
        int v4 = arr_view[0].getBottom();
        for(int v = 0; v < this.mCount; ++v) {
            View view0 = arr_view[v];
            v1 = Math.min(v1, view0.getLeft());
            v2 = Math.min(v2, view0.getTop());
            v3 = Math.max(v3, view0.getRight());
            v4 = Math.max(v4, view0.getBottom());
        }
        this.mComputedMaxX = (float)v3;
        this.mComputedMaxY = (float)v4;
        this.mComputedMinX = (float)v1;
        this.mComputedMinY = (float)v2;
        this.mComputedCenterX = Float.isNaN(this.b) ? ((float)((v1 + v3) / 2)) : this.b;
        if(Float.isNaN(this.c)) {
            this.mComputedCenterY = (float)((v2 + v4) / 2);
            return;
        }
        this.mComputedCenterY = this.c;
    }

    public final void f() {
        if(this.e == null) {
            return;
        }
        int v = this.mCount;
        if(v == 0) {
            return;
        }
        if(this.i == null || this.i.length != v) {
            this.i = new View[v];
        }
        for(int v1 = 0; v1 < this.mCount; ++v1) {
            View[] arr_view = this.i;
            arr_view[v1] = this.e.getViewById(this.mIds[v1]);
        }
    }

    public final void g() {
        if(this.e == null) {
            return;
        }
        if(this.i == null) {
            this.f();
        }
        this.calcCenters();
        double f = Float.isNaN(this.d) ? 0.0 : Math.toRadians(this.d);
        float f1 = (float)Math.sin(f);
        float f2 = (float)Math.cos(f);
        float f3 = this.f * f2;
        float f4 = -this.g * f1;
        float f5 = this.f * f1;
        float f6 = this.g * f2;
        for(int v = 0; v < this.mCount; ++v) {
            View view0 = this.i[v];
            int v1 = view0.getLeft();
            int v2 = view0.getRight();
            int v3 = view0.getTop();
            int v4 = view0.getBottom();
            float f7 = ((float)((v2 + v1) / 2)) - this.mComputedCenterX;
            float f8 = ((float)((v4 + v3) / 2)) - this.mComputedCenterY;
            float f9 = f6 * f8 + f7 * f5 - f8 + this.k;
            view0.setTranslationX(f4 * f8 + f3 * f7 - f7 + this.j);
            view0.setTranslationY(f9);
            view0.setScaleY(this.g);
            view0.setScaleX(this.f);
            if(!Float.isNaN(this.d)) {
                view0.setRotation(this.d);
            }
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet0) {
        super.init(attributeSet0);
        this.mUseViewMeasure = false;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout);
            int v1 = typedArray0.getIndexCount();
            for(int v = 0; v < v1; ++v) {
                int v2 = typedArray0.getIndex(v);
                if(v2 == styleable.ConstraintLayout_Layout_android_visibility) {
                    this.l = true;
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_elevation) {
                    this.m = true;
                }
            }
            typedArray0.recycle();
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = (ConstraintLayout)this.getParent();
        if(this.l || this.m) {
            int v = this.getVisibility();
            float f = this.getElevation();
            for(int v1 = 0; v1 < this.mCount; ++v1) {
                View view0 = this.e.getViewById(this.mIds[v1]);
                if(view0 != null) {
                    if(this.l) {
                        view0.setVisibility(v);
                    }
                    if(this.m && f > 0.0f) {
                        view0.setTranslationZ(view0.getTranslationZ() + f);
                    }
                }
            }
        }
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        this.applyLayoutFeatures();
    }

    @Override  // android.view.View
    public void setPivotX(float f) {
        this.b = f;
        this.g();
    }

    @Override  // android.view.View
    public void setPivotY(float f) {
        this.c = f;
        this.g();
    }

    @Override  // android.view.View
    public void setRotation(float f) {
        this.d = f;
        this.g();
    }

    @Override  // android.view.View
    public void setScaleX(float f) {
        this.f = f;
        this.g();
    }

    @Override  // android.view.View
    public void setScaleY(float f) {
        this.g = f;
        this.g();
    }

    @Override  // android.view.View
    public void setTranslationX(float f) {
        this.j = f;
        this.g();
    }

    @Override  // android.view.View
    public void setTranslationY(float f) {
        this.k = f;
        this.g();
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        this.applyLayoutFeatures();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(ConstraintLayout constraintLayout0) {
        this.f();
        this.mComputedCenterX = NaNf;
        this.mComputedCenterY = NaNf;
        ConstraintWidget constraintWidget0 = ((LayoutParams)this.getLayoutParams()).getConstraintWidget();
        constraintWidget0.setWidth(0);
        constraintWidget0.setHeight(0);
        this.calcCenters();
        int v = (int)this.mComputedMinX;
        int v1 = this.getPaddingLeft();
        int v2 = (int)this.mComputedMinY;
        int v3 = this.getPaddingTop();
        int v4 = (int)this.mComputedMaxX;
        int v5 = this.getPaddingRight();
        int v6 = (int)this.mComputedMaxY;
        this.layout(v - v1, v2 - v3, v5 + v4, this.getPaddingBottom() + v6);
        this.g();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreDraw(ConstraintLayout constraintLayout0) {
        this.e = constraintLayout0;
        float f = this.getRotation();
        if(f != 0.0f) {
            this.d = f;
        }
        else if(!Float.isNaN(this.d)) {
            this.d = 0.0f;
        }
    }
}

