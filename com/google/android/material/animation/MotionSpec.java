package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

public class MotionSpec {
    public final SimpleArrayMap a;
    public final SimpleArrayMap b;

    public MotionSpec() {
        this.a = new SimpleArrayMap();
        this.b = new SimpleArrayMap();
    }

    public static MotionSpec a(ArrayList arrayList0) {
        MotionSpec motionSpec0 = new MotionSpec();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Animator animator0 = (Animator)arrayList0.get(v1);
            if(!(animator0 instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator0);
            }
            motionSpec0.setPropertyValues(((ObjectAnimator)animator0).getPropertyName(), ((ObjectAnimator)animator0).getValues());
            String s = ((ObjectAnimator)animator0).getPropertyName();
            long v2 = ((ObjectAnimator)animator0).getStartDelay();
            long v3 = ((ObjectAnimator)animator0).getDuration();
            TimeInterpolator timeInterpolator0 = ((ObjectAnimator)animator0).getInterpolator();
            if(timeInterpolator0 instanceof AccelerateDecelerateInterpolator || timeInterpolator0 == null) {
                timeInterpolator0 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
            }
            else if(timeInterpolator0 instanceof AccelerateInterpolator) {
                timeInterpolator0 = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
            }
            else if(timeInterpolator0 instanceof DecelerateInterpolator) {
                timeInterpolator0 = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
            }
            MotionTiming motionTiming0 = new MotionTiming(v2, v3, timeInterpolator0);
            motionTiming0.d = ((ObjectAnimator)animator0).getRepeatCount();
            motionTiming0.e = ((ObjectAnimator)animator0).getRepeatMode();
            motionSpec0.setTiming(s, motionTiming0);
        }
        return motionSpec0;
    }

    @Nullable
    public static MotionSpec createFromAttribute(@NonNull Context context0, @NonNull TypedArray typedArray0, @StyleableRes int v) {
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            return v1 == 0 ? null : MotionSpec.createFromResource(context0, v1);
        }
        return null;
    }

    @Nullable
    public static MotionSpec createFromResource(@NonNull Context context0, @AnimatorRes int v) {
        try {
            Animator animator0 = AnimatorInflater.loadAnimator(context0, v);
            if(animator0 instanceof AnimatorSet) {
                return MotionSpec.a(((AnimatorSet)animator0).getChildAnimations());
            }
            if(animator0 != null) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(animator0);
                return MotionSpec.a(arrayList0);
            }
            return null;
        }
        catch(Exception exception0) {
        }
        Log.w("MotionSpec", "Can\'t load animation resource ID #0x" + Integer.toHexString(v), exception0);
        return null;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof MotionSpec ? this.a.equals(((MotionSpec)object0).a) : false;
    }

    @NonNull
    public ObjectAnimator getAnimator(@NonNull String s, @NonNull Object object0, @NonNull Property property0) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofPropertyValuesHolder(object0, this.getPropertyValues(s));
        objectAnimator0.setProperty(property0);
        this.getTiming(s).apply(objectAnimator0);
        return objectAnimator0;
    }

    @NonNull
    public PropertyValuesHolder[] getPropertyValues(String s) {
        if(!this.hasPropertyValues(s)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] arr_propertyValuesHolder = (PropertyValuesHolder[])this.b.get(s);
        PropertyValuesHolder[] arr_propertyValuesHolder1 = new PropertyValuesHolder[arr_propertyValuesHolder.length];
        for(int v = 0; v < arr_propertyValuesHolder.length; ++v) {
            arr_propertyValuesHolder1[v] = arr_propertyValuesHolder[v].clone();
        }
        return arr_propertyValuesHolder1;
    }

    public MotionTiming getTiming(String s) {
        if(!this.hasTiming(s)) {
            throw new IllegalArgumentException();
        }
        return (MotionTiming)this.a.get(s);
    }

    public long getTotalDuration() {
        SimpleArrayMap simpleArrayMap0 = this.a;
        int v = simpleArrayMap0.size();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            MotionTiming motionTiming0 = (MotionTiming)simpleArrayMap0.valueAt(v2);
            v1 = Math.max(v1, motionTiming0.getDuration() + motionTiming0.getDelay());
        }
        return v1;
    }

    public boolean hasPropertyValues(String s) {
        return this.b.get(s) != null;
    }

    public boolean hasTiming(String s) {
        return this.a.get(s) != null;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public void setPropertyValues(String s, PropertyValuesHolder[] arr_propertyValuesHolder) {
        this.b.put(s, arr_propertyValuesHolder);
    }

    public void setTiming(String s, @Nullable MotionTiming motionTiming0) {
        this.a.put(s, motionTiming0);
    }

    @Override
    @NonNull
    public String toString() {
        return "\n" + this.getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}

