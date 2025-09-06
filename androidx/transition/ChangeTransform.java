package androidx.transition;

import a8.g;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {
    public boolean I;
    public boolean J;
    public final Matrix K;
    public static final String[] L;
    public static final g M;
    public static final g N;
    public static final boolean O;

    static {
        ChangeTransform.L = new String[]{"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
        ChangeTransform.M = new g(12, "nonTranslations", float[].class);
        ChangeTransform.N = new g(13, "translations", PointF.class);
        ChangeTransform.O = true;
    }

    public ChangeTransform() {
        this.I = true;
        this.J = true;
        this.K = new Matrix();
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.I = true;
        this.J = true;
        this.K = new Matrix();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, f0.g);
        this.I = TypedArrayUtils.getNamedBoolean(typedArray0, ((XmlPullParser)attributeSet0), "reparentWithOverlay", 1, true);
        this.J = TypedArrayUtils.getNamedBoolean(typedArray0, ((XmlPullParser)attributeSet0), "reparent", 0, true);
        typedArray0.recycle();
    }

    @Override  // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        this.l(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        this.l(transitionValues0);
        if(!ChangeTransform.O) {
            ((ViewGroup)transitionValues0.view.getParent()).startViewTransition(transitionValues0.view);
        }
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        Class class1;
        ArrayList arrayList2;
        boolean z3;
        Integer integer0;
        int v21;
        ObjectAnimator objectAnimator2;
        int v16;
        int v2;
        Animator animator0;
        boolean z2;
        y y0;
        ObjectAnimator objectAnimator0;
        ViewGroup viewGroup2;
        boolean z;
        if(transitionValues0 == null || transitionValues1 == null || !transitionValues0.values.containsKey("android:changeTransform:parent") || !transitionValues1.values.containsKey("android:changeTransform:parent")) {
            return null;
        }
        Object object0 = transitionValues0.values.get("android:changeTransform:parent");
        ViewGroup viewGroup1 = (ViewGroup)transitionValues1.values.get("android:changeTransform:parent");
        if(!this.J) {
            z = false;
        }
        else if(this.i(((ViewGroup)object0)) && this.i(viewGroup1)) {
            TransitionValues transitionValues2 = this.g(((ViewGroup)object0), true);
            z = transitionValues2 != null && viewGroup1 == transitionValues2.view ? false : true;
        }
        else if(((ViewGroup)object0) == viewGroup1) {
            z = false;
        }
        else {
            z = true;
        }
        Matrix matrix0 = (Matrix)transitionValues0.values.get("android:changeTransform:intermediateMatrix");
        if(matrix0 != null) {
            transitionValues0.values.put("android:changeTransform:matrix", matrix0);
        }
        Matrix matrix1 = (Matrix)transitionValues0.values.get("android:changeTransform:intermediateParentMatrix");
        if(matrix1 != null) {
            transitionValues0.values.put("android:changeTransform:parentMatrix", matrix1);
        }
        if(z) {
            Matrix matrix2 = (Matrix)transitionValues1.values.get("android:changeTransform:parentMatrix");
            transitionValues1.view.setTag(id.parent_matrix, matrix2);
            Matrix matrix3 = this.K;
            matrix3.reset();
            matrix2.invert(matrix3);
            Matrix matrix4 = (Matrix)transitionValues0.values.get("android:changeTransform:matrix");
            if(matrix4 == null) {
                matrix4 = new Matrix();
                transitionValues0.values.put("android:changeTransform:matrix", matrix4);
            }
            matrix4.postConcat(((Matrix)transitionValues0.values.get("android:changeTransform:parentMatrix")));
            matrix4.postConcat(matrix3);
        }
        Matrix matrix5 = (Matrix)transitionValues0.values.get("android:changeTransform:matrix");
        Matrix matrix6 = (Matrix)transitionValues1.values.get("android:changeTransform:matrix");
        if(matrix5 == null) {
            matrix5 = a0.a;
        }
        if(matrix6 == null) {
            matrix6 = a0.a;
        }
        if(matrix5.equals(matrix6)) {
            viewGroup2 = (ViewGroup)object0;
            objectAnimator0 = null;
        }
        else {
            Object object1 = transitionValues1.values.get("android:changeTransform:transforms");
            View view0 = transitionValues1.view;
            view0.setTranslationX(0.0f);
            view0.setTranslationY(0.0f);
            ViewCompat.setTranslationZ(view0, 0.0f);
            view0.setScaleX(1.0f);
            view0.setScaleY(1.0f);
            view0.setRotationX(0.0f);
            view0.setRotationY(0.0f);
            view0.setRotation(0.0f);
            float[] arr_f = new float[9];
            matrix5.getValues(arr_f);
            float[] arr_f1 = new float[9];
            matrix6.getValues(arr_f1);
            j j0 = new j(view0, arr_f);
            n n0 = new n(0);
            n0.b = new float[9];
            PropertyValuesHolder propertyValuesHolder0 = PropertyValuesHolder.ofObject(ChangeTransform.M, n0, new float[][]{arr_f, arr_f1});
            Path path0 = this.getPathMotion().getPath(arr_f[2], arr_f[5], arr_f1[2], arr_f1[5]);
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofPropertyValuesHolder(j0, new PropertyValuesHolder[]{propertyValuesHolder0, PropertyValuesHolder.ofObject(ChangeTransform.N, null, path0)});
            viewGroup2 = (ViewGroup)object0;
            h h0 = new h(this, z, matrix6, view0, ((k)object1), j0);
            objectAnimator1.addListener(h0);
            objectAnimator1.addPauseListener(h0);
            objectAnimator0 = objectAnimator1;
        }
        boolean z1 = ChangeTransform.O;
        if(!z || objectAnimator0 == null || !this.I) {
            animator0 = objectAnimator0;
            if(!z1) {
                viewGroup2.endViewTransition(transitionValues0.view);
            }
        }
        else {
            View view1 = transitionValues1.view;
            Matrix matrix7 = new Matrix(((Matrix)transitionValues1.values.get("android:changeTransform:parentMatrix")));
            r0.a.g(viewGroup0, matrix7);
            Class class0 = ViewGroup.class;
            if(Build.VERSION.SDK_INT == 28) {
                if(!w.e) {
                    try {
                        w.a();
                        Method method0 = w.b.getDeclaredMethod("addGhost", View.class, class0, Matrix.class);
                        w.d = method0;
                        method0.setAccessible(true);
                    }
                    catch(NoSuchMethodException noSuchMethodException0) {
                        Log.i("GhostViewApi21", "Failed to retrieve addGhost method", noSuchMethodException0);
                    }
                    w.e = true;
                }
                Method method1 = w.d;
                y0 = null;
                if(method1 != null) {
                    try {
                        y0 = new w(((View)method1.invoke(null, view1, viewGroup0, matrix7)));
                        goto label_92;
                    }
                    catch(IllegalAccessException unused_ex) {
                        goto label_92;
                    }
                    catch(InvocationTargetException invocationTargetException0) {
                    }
                    throw new RuntimeException(invocationTargetException0.getCause());
                }
            label_92:
                z2 = z1;
                animator0 = objectAnimator0;
            }
            else {
                if(!(view1.getParent() instanceof ViewGroup)) {
                    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                }
                v v0 = (v)viewGroup0.getTag(id.ghost_view_holder);
                y y1 = (y)view1.getTag(id.ghost_view);
                if(y1 == null) {
                    y0 = null;
                    v2 = 0;
                }
                else {
                    v v1 = (v)y1.getParent();
                    if(v1 == v0) {
                        y0 = y1;
                        v2 = 0;
                    }
                    else {
                        v2 = y1.d;
                        v1.removeView(y1);
                        y0 = null;
                    }
                }
                if(y0 == null) {
                    y y2 = new y(view1);
                    y2.e = matrix7;
                    if(v0 == null) {
                        v0 = new v(viewGroup0.getContext());  // 初始化器: Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
                        v0.setClipChildren(false);
                        v0.a = viewGroup0;
                        viewGroup0.setTag(id.ghost_view_holder, v0);
                        viewGroup0.getOverlay().add(v0);
                        v0.b = true;
                        goto label_125;
                    }
                    else {
                        if(!v0.b) {
                            throw new IllegalStateException("This GhostViewHolder is detached!");
                        }
                        ViewGroup viewGroup3 = v0.a;
                        viewGroup3.getOverlay().remove(v0);
                        viewGroup3.getOverlay().add(v0);
                    label_125:
                        int v3 = v0.getLeft();
                        int v4 = v0.getTop();
                        int v5 = v0.getLeft();
                        int v6 = viewGroup0.getWidth();
                        int v7 = v0.getTop();
                        r0.a(v0, v3, v4, v6 + v5, viewGroup0.getHeight() + v7);
                        int v8 = y2.getLeft();
                        int v9 = y2.getTop();
                        int v10 = y2.getLeft();
                        int v11 = viewGroup0.getWidth();
                        int v12 = y2.getTop();
                        r0.a(y2, v8, v9, v11 + v10, viewGroup0.getHeight() + v12);
                        ArrayList arrayList0 = new ArrayList();
                        v.a(y2.c, arrayList0);
                        ArrayList arrayList1 = new ArrayList();
                        int v13 = v0.getChildCount() - 1;
                        int v14 = 0;
                        while(v14 <= v13) {
                            int v15 = (v14 + v13) / 2;
                            v.a(((y)v0.getChildAt(v15)).c, arrayList1);
                            if(arrayList0.isEmpty() || arrayList1.isEmpty()) {
                                z3 = z1;
                                arrayList2 = arrayList0;
                                objectAnimator2 = objectAnimator0;
                                class1 = class0;
                                v16 = v13;
                            }
                            else {
                                v16 = v13;
                                objectAnimator2 = objectAnimator0;
                                if(arrayList0.get(0) == arrayList1.get(0)) {
                                    int v17 = Math.min(arrayList0.size(), arrayList1.size());
                                    int v18 = 1;
                                    while(v18 < v17) {
                                        View view2 = (View)arrayList0.get(v18);
                                        arrayList2 = arrayList0;
                                        View view3 = (View)arrayList1.get(v18);
                                        if(view2 != view3) {
                                            ViewGroup viewGroup4 = (ViewGroup)view2.getParent();
                                            int v19 = viewGroup4.getChildCount();
                                            if(view2.getZ() == view3.getZ()) {
                                                int v20 = 0;
                                                while(v20 < v19) {
                                                    z3 = z1;
                                                    if(Build.VERSION.SDK_INT >= 29) {
                                                        v21 = viewGroup4.getChildDrawingOrder(v20);
                                                        class1 = class0;
                                                    }
                                                    else {
                                                        if(!f0.r) {
                                                            try {
                                                                Method method2 = class0.getDeclaredMethod("getChildDrawingOrder", Integer.TYPE, Integer.TYPE);
                                                                f0.q = method2;
                                                                method2.setAccessible(true);
                                                            }
                                                            catch(NoSuchMethodException unused_ex) {
                                                            }
                                                            f0.r = true;
                                                        }
                                                        Method method3 = f0.q;
                                                        if(method3 == null) {
                                                            class1 = class0;
                                                        label_187:
                                                            v21 = v20;
                                                        }
                                                        else {
                                                            try {
                                                                integer0 = viewGroup4.getChildCount();
                                                                class1 = class0;
                                                            }
                                                            catch(IllegalAccessException | InvocationTargetException unused_ex) {
                                                                class1 = class0;
                                                                goto label_187;
                                                            }
                                                            try {
                                                                v21 = (int)(((Integer)method3.invoke(viewGroup4, integer0, v20)));
                                                                goto label_188;
                                                            }
                                                            catch(IllegalAccessException | InvocationTargetException unused_ex) {
                                                            }
                                                            goto label_187;
                                                        }
                                                    }
                                                label_188:
                                                    View view4 = viewGroup4.getChildAt(v21);
                                                    if(view4 != view2) {
                                                        if(view4 == view3) {
                                                            goto label_214;
                                                        }
                                                        ++v20;
                                                        z1 = z3;
                                                        class0 = class1;
                                                        continue;
                                                    }
                                                    v13 = v15 - 1;
                                                    goto label_216;
                                                }
                                            }
                                            else if(view2.getZ() <= view3.getZ()) {
                                                z3 = z1;
                                                class1 = class0;
                                                v13 = v15 - 1;
                                                goto label_216;
                                            }
                                            z3 = z1;
                                            class1 = class0;
                                            goto label_214;
                                        }
                                        ++v18;
                                        arrayList0 = arrayList2;
                                    }
                                    z3 = z1;
                                    arrayList2 = arrayList0;
                                    class1 = class0;
                                    if(arrayList1.size() != v17) {
                                        v13 = v15 - 1;
                                        goto label_216;
                                    }
                                }
                                else {
                                    z3 = z1;
                                    arrayList2 = arrayList0;
                                    class1 = class0;
                                }
                            }
                        label_214:
                            v14 = v15 + 1;
                            v13 = v16;
                        label_216:
                            arrayList1.clear();
                            arrayList0 = arrayList2;
                            objectAnimator0 = objectAnimator2;
                            z1 = z3;
                            class0 = class1;
                        }
                        z2 = z1;
                        animator0 = objectAnimator0;
                        if(v14 < 0 || v14 >= v0.getChildCount()) {
                            v0.addView(y2);
                        }
                        else {
                            v0.addView(y2, v14);
                        }
                        y2.d = v2;
                        y0 = y2;
                    }
                }
                else {
                    z2 = z1;
                    animator0 = objectAnimator0;
                    y0.e = matrix7;
                }
                ++y0.d;
            }
            if(y0 != null) {
                y0.reserveEndViewTransition(((ViewGroup)transitionValues0.values.get("android:changeTransform:parent")), transitionValues0.view);
                ChangeTransform changeTransform0 = this;
                TransitionSet transitionSet0;
                while((transitionSet0 = changeTransform0.r) != null) {
                    changeTransform0 = transitionSet0;
                }
                i i0 = new i();  // 初始化器: Landroidx/transition/TransitionListenerAdapter;-><init>()V
                i0.a = view1;
                i0.b = y0;
                changeTransform0.addListener(i0);
                if(z2) {
                    View view5 = transitionValues0.view;
                    if(view5 != transitionValues1.view) {
                        r0.b(view5, 0.0f);
                    }
                    r0.b(view1, 1.0f);
                    return animator0;
                }
            }
        }
        return animator0;
    }

    public boolean getReparent() {
        return this.J;
    }

    public boolean getReparentWithOverlay() {
        return this.I;
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return ChangeTransform.L;
    }

    public final void l(TransitionValues transitionValues0) {
        View view0 = transitionValues0.view;
        if(view0.getVisibility() == 8) {
            return;
        }
        ViewParent viewParent0 = view0.getParent();
        transitionValues0.values.put("android:changeTransform:parent", viewParent0);
        k k0 = new k(view0);
        transitionValues0.values.put("android:changeTransform:transforms", k0);
        Matrix matrix0 = view0.getMatrix();
        Matrix matrix1 = matrix0 == null || matrix0.isIdentity() ? null : new Matrix(matrix0);
        transitionValues0.values.put("android:changeTransform:matrix", matrix1);
        if(this.J) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
            r0.a.f(viewGroup0, matrix2);
            matrix2.preTranslate(((float)(-viewGroup0.getScrollX())), ((float)(-viewGroup0.getScrollY())));
            transitionValues0.values.put("android:changeTransform:parentMatrix", matrix2);
            Object object0 = view0.getTag(id.transition_transform);
            transitionValues0.values.put("android:changeTransform:intermediateMatrix", object0);
            Object object1 = view0.getTag(id.parent_matrix);
            transitionValues0.values.put("android:changeTransform:intermediateParentMatrix", object1);
        }
    }

    public void setReparent(boolean z) {
        this.J = z;
    }

    public void setReparentWithOverlay(boolean z) {
        this.I = z;
    }
}

