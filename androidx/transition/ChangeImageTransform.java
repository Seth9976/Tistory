package androidx.transition;

import a8.g;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

public class ChangeImageTransform extends Transition {
    public static final String[] I;
    public static final f J;
    public static final g K;

    static {
        ChangeImageTransform.I = new String[]{"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
        ChangeImageTransform.J = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        ChangeImageTransform.K = new g(11, "animatedTransform", Matrix.class);
    }

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        ChangeImageTransform.l(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        ChangeImageTransform.l(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        if(transitionValues0 != null && transitionValues1 != null) {
            Rect rect0 = (Rect)transitionValues0.values.get("android:changeImageTransform:bounds");
            Rect rect1 = (Rect)transitionValues1.values.get("android:changeImageTransform:bounds");
            if(rect0 != null && rect1 != null) {
                Matrix matrix0 = (Matrix)transitionValues0.values.get("android:changeImageTransform:matrix");
                Matrix matrix1 = (Matrix)transitionValues1.values.get("android:changeImageTransform:matrix");
                boolean z = matrix0 == null && matrix1 == null || matrix0 != null && matrix0.equals(matrix1);
                if(rect0.equals(rect1) && z) {
                    return null;
                }
                ImageView imageView0 = (ImageView)transitionValues1.view;
                Drawable drawable0 = imageView0.getDrawable();
                int v = drawable0.getIntrinsicWidth();
                int v1 = drawable0.getIntrinsicHeight();
                g g0 = ChangeImageTransform.K;
                if(v > 0 && v1 > 0) {
                    if(matrix0 == null) {
                        matrix0 = a0.a;
                    }
                    if(matrix1 == null) {
                        matrix1 = a0.a;
                    }
                    g0.set(imageView0, matrix0);
                    return ObjectAnimator.ofObject(imageView0, g0, new m0(), new Matrix[]{matrix0, matrix1});
                }
                return ObjectAnimator.ofObject(imageView0, g0, ChangeImageTransform.J, new Matrix[]{a0.a, a0.a});
            }
        }
        return null;
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return ChangeImageTransform.I;
    }

    public static void l(TransitionValues transitionValues0) {
        Matrix matrix0;
        View view0 = transitionValues0.view;
        if(!(view0 instanceof ImageView) || view0.getVisibility() != 0 || ((ImageView)view0).getDrawable() == null) {
            return;
        }
        Map map0 = transitionValues0.values;
        map0.put("android:changeImageTransform:bounds", new Rect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom()));
        Drawable drawable0 = ((ImageView)view0).getDrawable();
        if(drawable0.getIntrinsicWidth() <= 0 || drawable0.getIntrinsicHeight() <= 0) {
            matrix0 = new Matrix(((ImageView)view0).getImageMatrix());
        }
        else {
            switch(androidx.transition.g.a[((ImageView)view0).getScaleType().ordinal()]) {
                case 1: {
                    Drawable drawable1 = ((ImageView)view0).getDrawable();
                    Matrix matrix1 = new Matrix();
                    matrix1.postScale(((float)((ImageView)view0).getWidth()) / ((float)drawable1.getIntrinsicWidth()), ((float)((ImageView)view0).getHeight()) / ((float)drawable1.getIntrinsicHeight()));
                    matrix0 = matrix1;
                    break;
                }
                case 2: {
                    Drawable drawable2 = ((ImageView)view0).getDrawable();
                    int v = drawable2.getIntrinsicWidth();
                    float f = (float)((ImageView)view0).getWidth();
                    int v1 = drawable2.getIntrinsicHeight();
                    float f1 = (float)((ImageView)view0).getHeight();
                    float f2 = Math.max(f / ((float)v), f1 / ((float)v1));
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(f2, f2);
                    matrix2.postTranslate(((float)Math.round((f - ((float)v) * f2) / 2.0f)), ((float)Math.round((f1 - ((float)v1) * f2) / 2.0f)));
                    matrix0 = matrix2;
                    break;
                }
                default: {
                    matrix0 = new Matrix(((ImageView)view0).getImageMatrix());
                }
            }
        }
        map0.put("android:changeImageTransform:matrix", matrix0);
    }
}

