package a8;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.transition.e;
import androidx.transition.f0;
import androidx.transition.j;
import androidx.transition.r0;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.a;
import java.util.Arrays;

public final class g extends Property {
    public final int a;

    public g(int v, String s, Class class0) {
        this.a = v;
        super(class0, s);
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        switch(this.a) {
            case 0: {
                return ((h)object0).i;
            }
            case 1: {
                return ((h)object0).j;
            }
            case 2: {
                return ((a)object0).b();
            }
            case 3: {
                return ((n)object0).i;
            }
            case 4: {
                return ((p)object0).j;
            }
            case 5: {
                return ((SwitchCompat)object0).z;
            }
            case 6: {
                e e0 = (e)object0;
                return null;
            }
            case 7: {
                e e1 = (e)object0;
                return null;
            }
            case 8: {
                View view0 = (View)object0;
                return null;
            }
            case 9: {
                View view1 = (View)object0;
                return null;
            }
            case 10: {
                View view2 = (View)object0;
                return null;
            }
            case 11: {
                ImageView imageView0 = (ImageView)object0;
                return null;
            }
            case 12: {
                j j0 = (j)object0;
                return null;
            }
            case 13: {
                j j1 = (j)object0;
                return null;
            }
            case 14: {
                return r0.a.b(((View)object0));
            }
            case 15: {
                return ViewCompat.getClipBounds(((View)object0));
            }
            case 16: {
                return (float)((View)object0).getLayoutParams().width;
            }
            case 17: {
                return (float)((View)object0).getLayoutParams().height;
            }
            case 18: {
                return (float)ViewCompat.getPaddingStart(((View)object0));
            }
            default: {
                return (float)ViewCompat.getPaddingEnd(((View)object0));
            }
        }
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        FastOutSlowInInterpolator fastOutSlowInInterpolator0;
        switch(this.a) {
            case 0: {
                float f = (float)(((Float)object1));
                ((h)object0).i = f;
                float[] arr_f = ((h)object0).b;
                arr_f[0] = -20.0f + f * 1520.0f;
                arr_f[1] = f * 1520.0f;
                for(int v = 0; true; ++v) {
                    fastOutSlowInInterpolator0 = ((h)object0).f;
                    if(v >= 4) {
                        break;
                    }
                    float f1 = ((float)(((int)(5400.0f * f)) - h.l[v])) / 667.0f;
                    float f2 = arr_f[1];
                    arr_f[1] = fastOutSlowInInterpolator0.getInterpolation(f1) * 250.0f + f2;
                    float f3 = ((float)(((int)(5400.0f * f)) - h.m[v])) / 667.0f;
                    float f4 = arr_f[0];
                    arr_f[0] = fastOutSlowInInterpolator0.getInterpolation(f3) * 250.0f + f4;
                }
                float f5 = arr_f[0];
                float f6 = arr_f[1];
                float f7 = (f6 - f5) * ((h)object0).j + f5;
                arr_f[0] = f7;
                arr_f[0] = f7 / 360.0f;
                arr_f[1] = f6 / 360.0f;
                for(int v1 = 0; v1 < 4; ++v1) {
                    float f8 = ((float)(((int)(5400.0f * f)) - h.n[v1])) / 333.0f;
                    if(f8 >= 0.0f && f8 <= 1.0f) {
                        int v2 = v1 + ((h)object0).h;
                        int[] arr_v = ((h)object0).g.indicatorColors;
                        int v3 = v2 % arr_v.length;
                        int v4 = MaterialColors.compositeARGBWithAlpha(arr_v[v3], ((h)object0).a.getAlpha());
                        int v5 = MaterialColors.compositeARGBWithAlpha(((h)object0).g.indicatorColors[(v3 + 1) % arr_v.length], ((h)object0).a.getAlpha());
                        ((h)object0).c[0] = (int)ArgbEvaluatorCompat.getInstance().evaluate(fastOutSlowInInterpolator0.getInterpolation(f8), v4, v5);
                        break;
                    }
                }
                ((h)object0).a.invalidateSelf();
                return;
            }
            case 1: {
                ((h)object0).j = (float)(((Float)object1));
                return;
            }
            case 2: {
                float f9 = (float)(((Float)object1));
                if(((a)object0).h != f9) {
                    ((a)object0).h = f9;
                    ((a)object0).invalidateSelf();
                }
                return;
            }
            case 3: {
                float f10 = (float)(((Float)object1));
                ((n)object0).i = f10;
                ((n)object0).b[0] = 0.0f;
                float f11 = ((float)(((int)(f10 * 333.0f)))) / 667.0f;
                float f12 = ((n)object0).e.getInterpolation(f11);
                ((n)object0).b[2] = f12;
                ((n)object0).b[1] = f12;
                float f13 = ((n)object0).e.getInterpolation(f11 + 0.49925f);
                ((n)object0).b[4] = f13;
                ((n)object0).b[3] = f13;
                ((n)object0).b[5] = 1.0f;
                if(((n)object0).h && f13 < 1.0f) {
                    ((n)object0).c[2] = ((n)object0).c[1];
                    ((n)object0).c[1] = ((n)object0).c[0];
                    ((n)object0).c[0] = MaterialColors.compositeARGBWithAlpha(((n)object0).f.indicatorColors[((n)object0).g], ((n)object0).a.getAlpha());
                    ((n)object0).h = false;
                }
                ((n)object0).a.invalidateSelf();
                return;
            }
            case 4: {
                float f14 = (float)(((Float)object1));
                ((p)object0).j = f14;
                for(int v6 = 0; v6 < 4; ++v6) {
                    ((p)object0).b[v6] = Math.max(0.0f, Math.min(1.0f, ((p)object0).f[v6].getInterpolation(((float)(((int)(f14 * 1800.0f)) - p.m[v6])) / ((float)p.l[v6]))));
                }
                if(((p)object0).i) {
                    int v7 = MaterialColors.compositeARGBWithAlpha(((p)object0).g.indicatorColors[((p)object0).h], ((p)object0).a.getAlpha());
                    Arrays.fill(((p)object0).c, v7);
                    ((p)object0).i = false;
                }
                ((p)object0).a.invalidateSelf();
                return;
            }
            case 5: {
                ((SwitchCompat)object0).setThumbPosition(((float)(((Float)object1))));
                return;
            }
            case 6: {
                ((e)object0).getClass();
                ((e)object0).a = Math.round(((PointF)object1).x);
                int v8 = Math.round(((PointF)object1).y);
                ((e)object0).b = v8;
                int v9 = ((e)object0).f + 1;
                ((e)object0).f = v9;
                if(v9 == ((e)object0).g) {
                    r0.a(((e)object0).e, ((e)object0).a, v8, ((e)object0).c, ((e)object0).d);
                    ((e)object0).f = 0;
                    ((e)object0).g = 0;
                }
                return;
            }
            case 7: {
                ((e)object0).getClass();
                ((e)object0).c = Math.round(((PointF)object1).x);
                int v10 = Math.round(((PointF)object1).y);
                ((e)object0).d = v10;
                int v11 = ((e)object0).g + 1;
                ((e)object0).g = v11;
                if(((e)object0).f == v11) {
                    r0.a(((e)object0).e, ((e)object0).a, ((e)object0).b, ((e)object0).c, v10);
                    ((e)object0).f = 0;
                    ((e)object0).g = 0;
                }
                return;
            }
            case 8: {
                r0.a(((View)object0), ((View)object0).getLeft(), ((View)object0).getTop(), Math.round(((PointF)object1).x), Math.round(((PointF)object1).y));
                return;
            }
            case 9: {
                r0.a(((View)object0), Math.round(((PointF)object1).x), Math.round(((PointF)object1).y), ((View)object0).getRight(), ((View)object0).getBottom());
                return;
            }
            case 10: {
                int v12 = Math.round(((PointF)object1).x);
                int v13 = Math.round(((PointF)object1).y);
                r0.a(((View)object0), v12, v13, ((View)object0).getWidth() + v12, ((View)object0).getHeight() + v13);
                return;
            }
            case 11: {
                ImageView imageView0 = (ImageView)object0;
                Matrix matrix0 = (Matrix)object1;
                if(Build.VERSION.SDK_INT >= 29) {
                    imageView0.animateTransform(matrix0);
                    return;
                }
                if(matrix0 == null) {
                    Drawable drawable0 = imageView0.getDrawable();
                    if(drawable0 != null) {
                        drawable0.setBounds(0, 0, imageView0.getWidth() - imageView0.getPaddingLeft() - imageView0.getPaddingRight(), imageView0.getHeight() - imageView0.getPaddingTop() - imageView0.getPaddingBottom());
                        imageView0.invalidate();
                        return;
                    }
                }
                else if(f0.o) {
                    try {
                        imageView0.animateTransform(matrix0);
                        return;
                    }
                    catch(NoSuchMethodError unused_ex) {
                        f0.o = false;
                    }
                }
                return;
            }
            case 12: {
                ((j)object0).getClass();
                System.arraycopy(((float[])object1), 0, ((j)object0).c, 0, ((float[])object1).length);
                ((j)object0).a();
                return;
            }
            case 13: {
                ((j)object0).getClass();
                ((j)object0).d = ((PointF)object1).x;
                ((j)object0).e = ((PointF)object1).y;
                ((j)object0).a();
                return;
            }
            case 14: {
                r0.b(((View)object0), ((float)(((Float)object1))));
                return;
            }
            case 15: {
                ViewCompat.setClipBounds(((View)object0), ((Rect)object1));
                return;
            }
            case 16: {
                ((View)object0).getLayoutParams().width = ((Float)object1).intValue();
                ((View)object0).requestLayout();
                return;
            }
            case 17: {
                ((View)object0).getLayoutParams().height = ((Float)object1).intValue();
                ((View)object0).requestLayout();
                return;
            }
            case 18: {
                ViewCompat.setPaddingRelative(((View)object0), ((Float)object1).intValue(), ((View)object0).getPaddingTop(), ViewCompat.getPaddingEnd(((View)object0)), ((View)object0).getPaddingBottom());
                return;
            }
            default: {
                ViewCompat.setPaddingRelative(((View)object0), ViewCompat.getPaddingStart(((View)object0)), ((View)object0).getPaddingTop(), ((Float)object1).intValue(), ((View)object0).getPaddingBottom());
            }
        }
    }
}

