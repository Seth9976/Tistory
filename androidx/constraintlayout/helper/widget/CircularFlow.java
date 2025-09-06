package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

public class CircularFlow extends VirtualLayout {
    public ConstraintLayout d;
    public int e;
    public float[] f;
    public int[] g;
    public int h;
    public int i;
    public String j;
    public String k;
    public Float l;
    public Integer m;
    public static int n;
    public static float o;

    public CircularFlow(Context context0) {
        super(context0);
    }

    public CircularFlow(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public CircularFlow(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    public void addViewToCircularFlow(View view0, int v, float f) {
        if(this.containsId(view0.getId())) {
            return;
        }
        this.addView(view0);
        ++this.i;
        float[] arr_f = this.getAngles();
        this.f = arr_f;
        arr_f[this.i - 1] = f;
        ++this.h;
        int[] arr_v = this.getRadius();
        this.g = arr_v;
        int v1 = this.h - 1;
        arr_v[v1] = (int)(((float)v) * this.myContext.getResources().getDisplayMetrics().density);
        this.h();
    }

    public final void f(String s) {
        if(s == null || s.length() == 0 || this.myContext == null) {
            return;
        }
        float[] arr_f = this.f;
        if(arr_f == null) {
            return;
        }
        if(this.i + 1 > arr_f.length) {
            this.f = Arrays.copyOf(arr_f, arr_f.length + 1);
        }
        float[] arr_f1 = this.f;
        int v = this.i;
        arr_f1[v] = (float)Integer.parseInt(s);
        ++this.i;
    }

    public final void g(String s) {
        if(s == null || s.length() == 0 || this.myContext == null) {
            return;
        }
        int[] arr_v = this.g;
        if(arr_v == null) {
            return;
        }
        if(this.h + 1 > arr_v.length) {
            this.g = Arrays.copyOf(arr_v, arr_v.length + 1);
        }
        int[] arr_v1 = this.g;
        int v = this.h;
        arr_v1[v] = (int)(((float)Integer.parseInt(s)) * this.myContext.getResources().getDisplayMetrics().density);
        ++this.h;
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f, this.i);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.g, this.h);
    }

    public final void h() {
        this.d = (ConstraintLayout)this.getParent();
        for(int v = 0; v < this.mCount; ++v) {
            View view0 = this.d.getViewById(this.mIds[v]);
            if(view0 != null) {
                int v1 = CircularFlow.n;
                float f = CircularFlow.o;
                int[] arr_v = this.g;
                if(arr_v != null && v < arr_v.length) {
                    v1 = arr_v[v];
                }
                else if(this.m == null || ((int)this.m) == -1) {
                    Log.e("CircularFlow", "Added radius to view with id: " + ((String)this.mMap.get(view0.getId())));
                }
                else {
                    ++this.h;
                    if(this.g == null) {
                        this.g = new int[1];
                    }
                    int[] arr_v1 = this.getRadius();
                    this.g = arr_v1;
                    arr_v1[this.h - 1] = v1;
                }
                float[] arr_f = this.f;
                if(arr_f != null && v < arr_f.length) {
                    f = arr_f[v];
                }
                else if(this.l == null || ((float)this.l) == -1.0f) {
                    Log.e("CircularFlow", "Added angle to view with id: " + ((String)this.mMap.get(view0.getId())));
                }
                else {
                    ++this.i;
                    if(this.f == null) {
                        this.f = new float[1];
                    }
                    float[] arr_f1 = this.getAngles();
                    this.f = arr_f1;
                    arr_f1[this.i - 1] = f;
                }
                LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                constraintLayout$LayoutParams0.circleAngle = f;
                constraintLayout$LayoutParams0.circleConstraint = this.e;
                constraintLayout$LayoutParams0.circleRadius = v1;
                view0.setLayoutParams(constraintLayout$LayoutParams0);
            }
        }
        this.applyLayoutFeatures();
    }

    @Override  // androidx.constraintlayout.widget.VirtualLayout
    public void init(AttributeSet attributeSet0) {
        super.init(attributeSet0);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.e = typedArray0.getResourceId(v2, 0);
                }
                else if(v2 == styleable.ConstraintLayout_Layout_circularflow_angles) {
                    String s = typedArray0.getString(v2);
                    this.j = s;
                    this.setAngles(s);
                }
                else if(v2 == styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String s1 = typedArray0.getString(v2);
                    this.k = s1;
                    this.setRadius(s1);
                }
                else if(v2 == styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float float0 = typedArray0.getFloat(v2, CircularFlow.o);
                    this.l = float0;
                    this.setDefaultAngle(((float)float0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer integer0 = typedArray0.getDimensionPixelSize(v2, CircularFlow.n);
                    this.m = integer0;
                    this.setDefaultRadius(((int)integer0));
                }
            }
            typedArray0.recycle();
        }
    }

    public boolean isUpdatable(View view0) {
        return this.containsId(view0.getId()) ? this.indexFromId(view0.getId()) != -1 : false;
    }

    @Override  // androidx.constraintlayout.widget.VirtualLayout
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String s = this.j;
        if(s != null) {
            this.f = new float[1];
            this.setAngles(s);
        }
        String s1 = this.k;
        if(s1 != null) {
            this.g = new int[1];
            this.setRadius(s1);
        }
        Float float0 = this.l;
        if(float0 != null) {
            this.setDefaultAngle(((float)float0));
        }
        Integer integer0 = this.m;
        if(integer0 != null) {
            this.setDefaultRadius(((int)integer0));
        }
        this.h();
    }

    public static float[] removeElementFromArray(float[] arr_f, int v) {
        float[] arr_f1 = new float[arr_f.length - 1];
        int v2 = 0;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            if(v1 != v) {
                arr_f1[v2] = arr_f[v1];
                ++v2;
            }
        }
        return arr_f1;
    }

    public static int[] removeElementFromArray(int[] arr_v, int v) {
        int[] arr_v1 = new int[arr_v.length - 1];
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v1 != v) {
                arr_v1[v2] = arr_v[v1];
                ++v2;
            }
        }
        return arr_v1;
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public int removeView(View view0) {
        int v = super.removeView(view0);
        if(v == -1) {
            return -1;
        }
        ConstraintSet constraintSet0 = new ConstraintSet();
        constraintSet0.clone(this.d);
        constraintSet0.clear(view0.getId(), 8);
        constraintSet0.applyTo(this.d);
        float[] arr_f = this.f;
        if(v < arr_f.length) {
            if(arr_f != null && v >= 0 && v < this.i) {
                arr_f = CircularFlow.removeElementFromArray(arr_f, v);
            }
            this.f = arr_f;
            --this.i;
        }
        int[] arr_v = this.g;
        if(v < arr_v.length) {
            if(arr_v != null && v >= 0 && v < this.h) {
                arr_v = CircularFlow.removeElementFromArray(arr_v, v);
            }
            this.g = arr_v;
            --this.h;
        }
        this.h();
        return v;
    }

    private void setAngles(String s) {
        if(s == null) {
            return;
        }
        int v = 0;
        this.i = 0;
        int v1;
        while((v1 = s.indexOf(44, v)) != -1) {
            this.f(s.substring(v, v1).trim());
            v = v1 + 1;
        }
        this.f(s.substring(v).trim());
    }

    public void setDefaultAngle(float f) {
        CircularFlow.o = f;
    }

    public void setDefaultRadius(int v) {
        CircularFlow.n = v;
    }

    private void setRadius(String s) {
        if(s == null) {
            return;
        }
        int v = 0;
        this.h = 0;
        int v1;
        while((v1 = s.indexOf(44, v)) != -1) {
            this.g(s.substring(v, v1).trim());
            v = v1 + 1;
        }
        this.g(s.substring(v).trim());
    }

    public void updateAngle(View view0, float f) {
        if(!this.isUpdatable(view0)) {
            Log.e("CircularFlow", "It was not possible to update angle to view with id: " + view0.getId());
            return;
        }
        int v = this.indexFromId(view0.getId());
        if(v > this.f.length) {
            return;
        }
        float[] arr_f = this.getAngles();
        this.f = arr_f;
        arr_f[v] = f;
        this.h();
    }

    public void updateRadius(View view0, int v) {
        if(!this.isUpdatable(view0)) {
            Log.e("CircularFlow", "It was not possible to update radius to view with id: " + view0.getId());
            return;
        }
        int v1 = this.indexFromId(view0.getId());
        if(v1 > this.g.length) {
            return;
        }
        int[] arr_v = this.getRadius();
        this.g = arr_v;
        arr_v[v1] = (int)(((float)v) * this.myContext.getResources().getDisplayMetrics().density);
        this.h();
    }

    public void updateReference(View view0, int v, float f) {
        if(!this.isUpdatable(view0)) {
            Log.e("CircularFlow", "It was not possible to update radius and angle to view with id: " + view0.getId());
            return;
        }
        int v1 = this.indexFromId(view0.getId());
        if(this.getAngles().length > v1) {
            float[] arr_f = this.getAngles();
            this.f = arr_f;
            arr_f[v1] = f;
        }
        if(this.getRadius().length > v1) {
            int[] arr_v = this.getRadius();
            this.g = arr_v;
            arr_v[v1] = (int)(((float)v) * this.myContext.getResources().getDisplayMetrics().density);
        }
        this.h();
    }
}

