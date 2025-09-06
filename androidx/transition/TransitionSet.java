package androidx.transition;

import a5.b;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import java.util.ArrayList;

public class TransitionSet extends Transition {
    public ArrayList I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER;

    public TransitionSet() {
        this.I = new ArrayList();
        this.J = true;
        this.L = false;
        this.M = 0;
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.I = new ArrayList();
        this.J = true;
        this.L = false;
        this.M = 0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, f0.i);
        this.setOrdering(TypedArrayUtils.getNamedInt(typedArray0, ((XmlResourceParser)attributeSet0), "transitionOrdering", 0, 0));
        typedArray0.recycle();
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition addListener(@NonNull TransitionListener transition$TransitionListener0) {
        return this.addListener(transition$TransitionListener0);
    }

    @NonNull
    public TransitionSet addListener(@NonNull TransitionListener transition$TransitionListener0) {
        return (TransitionSet)super.addListener(transition$TransitionListener0);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition addTarget(@IdRes int v) {
        return this.addTarget(v);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition addTarget(@NonNull View view0) {
        return this.addTarget(view0);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition addTarget(@NonNull Class class0) {
        return this.addTarget(class0);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition addTarget(@NonNull String s) {
        return this.addTarget(s);
    }

    @NonNull
    public TransitionSet addTarget(@IdRes int v) {
        for(int v1 = 0; v1 < this.I.size(); ++v1) {
            ((Transition)this.I.get(v1)).addTarget(v);
        }
        return (TransitionSet)super.addTarget(v);
    }

    @NonNull
    public TransitionSet addTarget(@NonNull View view0) {
        for(int v = 0; v < this.I.size(); ++v) {
            ((Transition)this.I.get(v)).addTarget(view0);
        }
        return (TransitionSet)super.addTarget(view0);
    }

    @NonNull
    public TransitionSet addTarget(@NonNull Class class0) {
        for(int v = 0; v < this.I.size(); ++v) {
            ((Transition)this.I.get(v)).addTarget(class0);
        }
        return (TransitionSet)super.addTarget(class0);
    }

    @NonNull
    public TransitionSet addTarget(@NonNull String s) {
        for(int v = 0; v < this.I.size(); ++v) {
            ((Transition)this.I.get(v)).addTarget(s);
        }
        return (TransitionSet)super.addTarget(s);
    }

    @NonNull
    public TransitionSet addTransition(@NonNull Transition transition0) {
        this.I.add(transition0);
        transition0.r = this;
        long v = this.c;
        if(v >= 0L) {
            transition0.setDuration(v);
        }
        if((this.M & 1) != 0) {
            transition0.setInterpolator(this.getInterpolator());
        }
        if((this.M & 2) != 0) {
            transition0.setPropagation(this.getPropagation());
        }
        if((this.M & 4) != 0) {
            transition0.setPathMotion(this.getPathMotion());
        }
        if((this.M & 8) != 0) {
            transition0.setEpicenterCallback(this.getEpicenterCallback());
        }
        return this;
    }

    @Override  // androidx.transition.Transition
    public final void c(TransitionValues transitionValues0) {
        super.c(transitionValues0);
        int v = this.I.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.I.get(v1)).c(transitionValues0);
        }
    }

    @Override  // androidx.transition.Transition
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int v = this.I.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.I.get(v1)).cancel();
        }
    }

    @Override  // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        if(this.i(transitionValues0.view)) {
            for(Object object0: this.I) {
                Transition transition0 = (Transition)object0;
                if(transition0.i(transitionValues0.view)) {
                    transition0.captureEndValues(transitionValues0);
                    transitionValues0.a.add(transition0);
                }
            }
        }
    }

    @Override  // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        if(this.i(transitionValues0.view)) {
            for(Object object0: this.I) {
                Transition transition0 = (Transition)object0;
                if(transition0.i(transitionValues0.view)) {
                    transition0.captureStartValues(transitionValues0);
                    transitionValues0.a.add(transition0);
                }
            }
        }
    }

    @Override  // androidx.transition.Transition
    public Transition clone() {
        TransitionSet transitionSet0 = (TransitionSet)super.clone();
        transitionSet0.I = new ArrayList();
        int v = this.I.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Transition transition0 = ((Transition)this.I.get(v1)).clone();
            transitionSet0.I.add(transition0);
            transition0.r = transitionSet0;
        }
        return transitionSet0;
    }

    @Override  // androidx.transition.Transition
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @Override  // androidx.transition.Transition
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup0, o0 o00, o0 o01, ArrayList arrayList0, ArrayList arrayList1) {
        long v = this.getStartDelay();
        int v1 = this.I.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Transition transition0 = (Transition)this.I.get(v2);
            if(v > 0L && (this.J || v2 == 0)) {
                long v3 = transition0.getStartDelay();
                if(v3 > 0L) {
                    transition0.setStartDelay(v3 + v);
                }
                else {
                    transition0.setStartDelay(v);
                }
            }
            transition0.createAnimators(viewGroup0, o00, o01, arrayList0, arrayList1);
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(int v, boolean z) {
        for(int v1 = 0; v1 < this.I.size(); ++v1) {
            ((Transition)this.I.get(v1)).excludeTarget(v, z);
        }
        return super.excludeTarget(v, z);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull View view0, boolean z) {
        for(int v = 0; v < this.I.size(); ++v) {
            ((Transition)this.I.get(v)).excludeTarget(view0, z);
        }
        return super.excludeTarget(view0, z);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull Class class0, boolean z) {
        for(int v = 0; v < this.I.size(); ++v) {
            ((Transition)this.I.get(v)).excludeTarget(class0, z);
        }
        return super.excludeTarget(class0, z);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull String s, boolean z) {
        for(int v = 0; v < this.I.size(); ++v) {
            ((Transition)this.I.get(v)).excludeTarget(s, z);
        }
        return super.excludeTarget(s, z);
    }

    @Override  // androidx.transition.Transition
    public final void f(ViewGroup viewGroup0) {
        super.f(viewGroup0);
        int v = this.I.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.I.get(v1)).f(viewGroup0);
        }
    }

    public int getOrdering() {
        return !this.J;
    }

    @Nullable
    public Transition getTransitionAt(int v) {
        return v < 0 || v >= this.I.size() ? null : ((Transition)this.I.get(v));
    }

    public int getTransitionCount() {
        return this.I.size();
    }

    @Override  // androidx.transition.Transition
    public final void j() {
        this.v = true;
        int v = this.I.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.I.get(v1)).j();
        }
    }

    @Override  // androidx.transition.Transition
    public final String k(String s) {
        String s1 = super.k(s);
        for(int v = 0; v < this.I.size(); ++v) {
            StringBuilder stringBuilder0 = b.u(s1, "\n");
            stringBuilder0.append(((Transition)this.I.get(v)).k(s + "  "));
            s1 = stringBuilder0.toString();
        }
        return s1;
    }

    @Override  // androidx.transition.Transition
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void pause(View view0) {
        super.pause(view0);
        int v = this.I.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.I.get(v1)).pause(view0);
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition removeListener(@NonNull TransitionListener transition$TransitionListener0) {
        return this.removeListener(transition$TransitionListener0);
    }

    @NonNull
    public TransitionSet removeListener(@NonNull TransitionListener transition$TransitionListener0) {
        return (TransitionSet)super.removeListener(transition$TransitionListener0);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition removeTarget(@IdRes int v) {
        return this.removeTarget(v);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition removeTarget(@NonNull View view0) {
        return this.removeTarget(view0);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition removeTarget(@NonNull Class class0) {
        return this.removeTarget(class0);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition removeTarget(@NonNull String s) {
        return this.removeTarget(s);
    }

    @NonNull
    public TransitionSet removeTarget(@IdRes int v) {
        for(int v1 = 0; v1 < this.I.size(); ++v1) {
            ((Transition)this.I.get(v1)).removeTarget(v);
        }
        return (TransitionSet)super.removeTarget(v);
    }

    @NonNull
    public TransitionSet removeTarget(@NonNull View view0) {
        for(int v = 0; v < this.I.size(); ++v) {
            ((Transition)this.I.get(v)).removeTarget(view0);
        }
        return (TransitionSet)super.removeTarget(view0);
    }

    @NonNull
    public TransitionSet removeTarget(@NonNull Class class0) {
        for(int v = 0; v < this.I.size(); ++v) {
            ((Transition)this.I.get(v)).removeTarget(class0);
        }
        return (TransitionSet)super.removeTarget(class0);
    }

    @NonNull
    public TransitionSet removeTarget(@NonNull String s) {
        for(int v = 0; v < this.I.size(); ++v) {
            ((Transition)this.I.get(v)).removeTarget(s);
        }
        return (TransitionSet)super.removeTarget(s);
    }

    @NonNull
    public TransitionSet removeTransition(@NonNull Transition transition0) {
        this.I.remove(transition0);
        transition0.r = null;
        return this;
    }

    @Override  // androidx.transition.Transition
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view0) {
        super.resume(view0);
        int v = this.I.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.I.get(v1)).resume(view0);
        }
    }

    @Override  // androidx.transition.Transition
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        if(this.I.isEmpty()) {
            this.start();
            this.end();
            return;
        }
        l0 l00 = new l0();  // 初始化器: Landroidx/transition/TransitionListenerAdapter;-><init>()V
        l00.a = this;
        for(Object object0: this.I) {
            ((Transition)object0).addListener(l00);
        }
        this.K = this.I.size();
        if(this.J) {
            for(Object object1: this.I) {
                ((Transition)object1).runAnimators();
            }
        }
        else {
            for(int v = 1; v < this.I.size(); ++v) {
                ((Transition)this.I.get(v - 1)).addListener(new k0(((Transition)this.I.get(v))));
            }
            Transition transition0 = (Transition)this.I.get(0);
            if(transition0 != null) {
                transition0.runAnimators();
            }
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition setDuration(long v) {
        return this.setDuration(v);
    }

    @NonNull
    public TransitionSet setDuration(long v) {
        super.setDuration(v);
        if(this.c >= 0L) {
            ArrayList arrayList0 = this.I;
            if(arrayList0 != null) {
                int v1 = arrayList0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ((Transition)this.I.get(v2)).setDuration(v);
                }
            }
        }
        return this;
    }

    @Override  // androidx.transition.Transition
    public void setEpicenterCallback(EpicenterCallback transition$EpicenterCallback0) {
        super.setEpicenterCallback(transition$EpicenterCallback0);
        this.M |= 8;
        int v = this.I.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.I.get(v1)).setEpicenterCallback(transition$EpicenterCallback0);
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition setInterpolator(@Nullable TimeInterpolator timeInterpolator0) {
        return this.setInterpolator(timeInterpolator0);
    }

    @NonNull
    public TransitionSet setInterpolator(@Nullable TimeInterpolator timeInterpolator0) {
        this.M |= 1;
        ArrayList arrayList0 = this.I;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((Transition)this.I.get(v1)).setInterpolator(timeInterpolator0);
            }
        }
        return (TransitionSet)super.setInterpolator(timeInterpolator0);
    }

    @NonNull
    public TransitionSet setOrdering(int v) {
        switch(v) {
            case 0: {
                this.J = true;
                return this;
            }
            case 1: {
                this.J = false;
                return this;
            }
            default: {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + v);
            }
        }
    }

    @Override  // androidx.transition.Transition
    public void setPathMotion(PathMotion pathMotion0) {
        super.setPathMotion(pathMotion0);
        this.M |= 4;
        if(this.I != null) {
            for(int v = 0; v < this.I.size(); ++v) {
                ((Transition)this.I.get(v)).setPathMotion(pathMotion0);
            }
        }
    }

    @Override  // androidx.transition.Transition
    public void setPropagation(TransitionPropagation transitionPropagation0) {
        super.setPropagation(transitionPropagation0);
        this.M |= 2;
        int v = this.I.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.I.get(v1)).setPropagation(transitionPropagation0);
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition setStartDelay(long v) {
        return this.setStartDelay(v);
    }

    @NonNull
    public TransitionSet setStartDelay(long v) {
        return (TransitionSet)super.setStartDelay(v);
    }
}

