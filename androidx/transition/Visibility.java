package androidx.transition;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class Visibility extends Transition {
    @SuppressLint({"UniqueConstants"})
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public int I;
    public static final String[] J = null;
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;

    static {
        Visibility.J = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    }

    public Visibility() {
        this.I = 3;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.I = 3;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, f0.e);
        int v = TypedArrayUtils.getNamedInt(typedArray0, ((XmlResourceParser)attributeSet0), "transitionVisibilityMode", 0, 0);
        typedArray0.recycle();
        if(v != 0) {
            this.setMode(v);
        }
    }

    @Override  // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        Visibility.l(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        Visibility.l(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        y0 y00 = Visibility.m(transitionValues0, transitionValues1);
        if(y00.a && (y00.e != null || y00.f != null)) {
            return y00.b ? this.onAppear(viewGroup0, transitionValues0, y00.c, transitionValues1, y00.d) : this.onDisappear(viewGroup0, transitionValues0, y00.c, transitionValues1, y00.d);
        }
        return null;
    }

    public int getMode() {
        return this.I;
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return Visibility.J;
    }

    @Override  // androidx.transition.Transition
    public boolean isTransitionRequired(@Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        if(transitionValues0 == null && transitionValues1 == null) {
            return false;
        }
        if(transitionValues0 != null && transitionValues1 != null && transitionValues1.values.containsKey("android:visibility:visibility") != transitionValues0.values.containsKey("android:visibility:visibility")) {
            return false;
        }
        y0 y00 = Visibility.m(transitionValues0, transitionValues1);
        return y00.a && (y00.c == 0 || y00.d == 0);
    }

    public boolean isVisible(TransitionValues transitionValues0) {
        return transitionValues0 == null ? false : ((int)(((Integer)transitionValues0.values.get("android:visibility:visibility")))) == 0 && ((View)transitionValues0.values.get("android:visibility:parent")) != null;
    }

    public static void l(TransitionValues transitionValues0) {
        Integer integer0 = transitionValues0.view.getVisibility();
        transitionValues0.values.put("android:visibility:visibility", integer0);
        ViewParent viewParent0 = transitionValues0.view.getParent();
        transitionValues0.values.put("android:visibility:parent", viewParent0);
        int[] arr_v = new int[2];
        transitionValues0.view.getLocationOnScreen(arr_v);
        transitionValues0.values.put("android:visibility:screenLocation", arr_v);
    }

    public static y0 m(TransitionValues transitionValues0, TransitionValues transitionValues1) {
        y0 y00 = new y0();  // 初始化器: Ljava/lang/Object;-><init>()V
        y00.a = false;
        y00.b = false;
        if(transitionValues0 == null || !transitionValues0.values.containsKey("android:visibility:visibility")) {
            y00.c = -1;
            y00.e = null;
        }
        else {
            y00.c = (int)(((Integer)transitionValues0.values.get("android:visibility:visibility")));
            y00.e = (ViewGroup)transitionValues0.values.get("android:visibility:parent");
        }
        if(transitionValues1 == null || !transitionValues1.values.containsKey("android:visibility:visibility")) {
            y00.d = -1;
            y00.f = null;
        }
        else {
            y00.d = (int)(((Integer)transitionValues1.values.get("android:visibility:visibility")));
            y00.f = (ViewGroup)transitionValues1.values.get("android:visibility:parent");
        }
        if(transitionValues0 == null || transitionValues1 == null) {
            if(transitionValues0 == null && y00.d == 0) {
                y00.b = true;
                y00.a = true;
                return y00;
            }
            if(transitionValues1 == null && y00.c == 0) {
                y00.b = false;
                y00.a = true;
            }
        }
        else {
            int v = y00.c;
            int v1 = y00.d;
            if(v == v1 && y00.e == y00.f) {
                return y00;
            }
            if(v == v1) {
                if(y00.f == null) {
                    y00.b = false;
                    y00.a = true;
                    return y00;
                }
                if(y00.e == null) {
                    y00.b = true;
                    y00.a = true;
                    return y00;
                }
            }
            else {
                if(v == 0) {
                    y00.b = false;
                    y00.a = true;
                    return y00;
                }
                if(v1 == 0) {
                    y00.b = true;
                    y00.a = true;
                    return y00;
                }
            }
        }
        return y00;
    }

    @Nullable
    public Animator onAppear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return null;
    }

    @Nullable
    public Animator onAppear(ViewGroup viewGroup0, TransitionValues transitionValues0, int v, TransitionValues transitionValues1, int v1) {
        if((this.I & 1) == 1 && transitionValues1 != null) {
            if(transitionValues0 == null) {
                View view0 = (View)transitionValues1.view.getParent();
                return Visibility.m(this.g(view0, false), this.getTransitionValues(view0, false)).a ? null : this.onAppear(viewGroup0, transitionValues1.view, null, transitionValues1);
            }
            return this.onAppear(viewGroup0, transitionValues1.view, transitionValues0, transitionValues1);
        }
        return null;
    }

    @Nullable
    public Animator onDisappear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return null;
    }

    @Nullable
    public Animator onDisappear(ViewGroup viewGroup0, TransitionValues transitionValues0, int v, TransitionValues transitionValues1, int v1) {
        int v8;
        ViewGroup viewGroup1;
        Bitmap bitmap0;
        boolean z2;
        int v6;
        View view5;
        boolean z1;
        View view4;
        View view0 = null;
        if((this.I & 2) != 2) {
            return null;
        }
        if(transitionValues0 == null) {
            return null;
        }
        View view1 = transitionValues0.view;
        View view2 = transitionValues1 == null ? null : transitionValues1.view;
        View view3 = (View)view1.getTag(id.save_overlay_view);
        boolean z = true;
        if(view3 == null) {
            if(view2 == null || view2.getParent() == null) {
                if(view2 == null) {
                    view2 = null;
                    view4 = null;
                    z1 = true;
                }
                else {
                    view4 = null;
                    z1 = false;
                }
            }
            else if(v1 == 4 || view1 == view2) {
                view4 = view2;
                z1 = false;
                view2 = null;
            }
            else {
                view2 = null;
                view4 = null;
                z1 = true;
            }
            if(!z1) {
                view5 = view4;
                view3 = view2;
            }
            else if(view1.getParent() == null) {
                view5 = view4;
                view3 = view1;
            }
            else if(view1.getParent() instanceof View) {
                View view6 = (View)view1.getParent();
                if(Visibility.m(this.getTransitionValues(view6, true), this.g(view6, true)).a) {
                    view5 = view4;
                    int v13 = view6.getId();
                    view3 = view6.getParent() != null || v13 == -1 || viewGroup0.findViewById(v13) == null || !this.v ? view2 : view1;
                }
                else {
                    Matrix matrix0 = new Matrix();
                    matrix0.setTranslate(((float)(-view6.getScrollX())), ((float)(-view6.getScrollY())));
                    r0.a.f(view1, matrix0);
                    r0.a.g(viewGroup0, matrix0);
                    RectF rectF0 = new RectF(0.0f, 0.0f, ((float)view1.getWidth()), ((float)view1.getHeight()));
                    matrix0.mapRect(rectF0);
                    int v2 = Math.round(rectF0.left);
                    int v3 = Math.round(rectF0.top);
                    int v4 = Math.round(rectF0.right);
                    int v5 = Math.round(rectF0.bottom);
                    ImageView imageView0 = new ImageView(view1.getContext());
                    imageView0.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    if(n0.a) {
                        v6 = !view1.isAttachedToWindow();
                        z2 = viewGroup0 == null ? false : viewGroup0.isAttachedToWindow();
                    }
                    else {
                        v6 = 0;
                        z2 = false;
                    }
                    boolean z3 = n0.b;
                    if(!z3 || v6 == 0) {
                        view5 = view4;
                        v8 = 0;
                        viewGroup1 = null;
                    label_67:
                        int v9 = Math.round(rectF0.width());
                        int v10 = Math.round(rectF0.height());
                        if(v9 <= 0 || v10 <= 0) {
                            bitmap0 = null;
                        }
                        else {
                            float f = Math.min(1.0f, 1048576.0f / ((float)(v9 * v10)));
                            int v11 = Math.round(((float)v9) * f);
                            int v12 = Math.round(((float)v10) * f);
                            matrix0.postTranslate(-rectF0.left, -rectF0.top);
                            matrix0.postScale(f, f);
                            if(n0.c) {
                                Picture picture0 = new Picture();
                                Canvas canvas0 = picture0.beginRecording(v11, v12);
                                canvas0.concat(matrix0);
                                view1.draw(canvas0);
                                picture0.endRecording();
                                bitmap0 = Bitmap.createBitmap(picture0);
                            }
                            else {
                                bitmap0 = Bitmap.createBitmap(v11, v12, Bitmap.Config.ARGB_8888);
                                Canvas canvas1 = new Canvas(bitmap0);
                                canvas1.concat(matrix0);
                                view1.draw(canvas1);
                            }
                        }
                        if(z3 && v6 != 0) {
                            viewGroup0.getOverlay().remove(view1);
                            viewGroup1.addView(view1, v8);
                        }
                    }
                    else if(!z2) {
                        view5 = view4;
                        bitmap0 = null;
                    }
                    else {
                        viewGroup1 = (ViewGroup)view1.getParent();
                        int v7 = viewGroup1.indexOfChild(view1);
                        view5 = view4;
                        viewGroup0.getOverlay().add(view1);
                        v8 = v7;
                        goto label_67;
                    }
                    if(bitmap0 != null) {
                        imageView0.setImageBitmap(bitmap0);
                    }
                    imageView0.measure(View.MeasureSpec.makeMeasureSpec(v4 - v2, 0x40000000), View.MeasureSpec.makeMeasureSpec(v5 - v3, 0x40000000));
                    imageView0.layout(v2, v3, v4, v5);
                    view3 = imageView0;
                }
            }
            else {
                view5 = view4;
                view3 = view2;
            }
            view0 = view5;
            z = false;
        }
        if(view3 != null) {
            if(!z) {
                int[] arr_v = (int[])transitionValues0.values.get("android:visibility:screenLocation");
                int v14 = arr_v[0];
                int v15 = arr_v[1];
                int[] arr_v1 = new int[2];
                viewGroup0.getLocationOnScreen(arr_v1);
                view3.offsetLeftAndRight(v14 - arr_v1[0] - view3.getLeft());
                view3.offsetTopAndBottom(v15 - arr_v1[1] - view3.getTop());
                viewGroup0.getOverlay().add(view3);
            }
            Animator animator0 = this.onDisappear(viewGroup0, view3, transitionValues0, transitionValues1);
            if(!z) {
                if(animator0 == null) {
                    viewGroup0.getOverlay().remove(view3);
                    return null;
                }
                view1.setTag(id.save_overlay_view, view3);
                this.addListener(new w0(this, viewGroup0, view3, view1));
            }
            return animator0;
        }
        if(view0 != null) {
            int v16 = view0.getVisibility();
            r0.c(0, view0);
            Animator animator1 = this.onDisappear(viewGroup0, view0, transitionValues0, transitionValues1);
            if(animator1 != null) {
                x0 x00 = new x0(v1, view0);
                animator1.addListener(x00);
                animator1.addPauseListener(x00);
                this.addListener(x00);
                return animator1;
            }
            r0.c(v16, view0);
            return null;
        }
        return null;
    }

    public void setMode(int v) {
        if((v & -4) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.I = v;
    }
}

