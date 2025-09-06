package androidx.databinding.adapters;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = ViewGroup.class), @BindingMethod(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = ViewGroup.class), @BindingMethod(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = ViewGroup.class)})
public class ViewGroupBindingAdapter {
    public interface OnAnimationEnd {
        void onAnimationEnd(Animation arg1);
    }

    public interface OnAnimationRepeat {
        void onAnimationRepeat(Animation arg1);
    }

    public interface OnAnimationStart {
        void onAnimationStart(Animation arg1);
    }

    public interface OnChildViewAdded {
        void onChildViewAdded(View arg1, View arg2);
    }

    public interface OnChildViewRemoved {
        void onChildViewRemoved(View arg1, View arg2);
    }

    @TargetApi(11)
    @BindingAdapter({"android:animateLayoutChanges"})
    public static void setAnimateLayoutChanges(ViewGroup viewGroup0, boolean z) {
        if(z) {
            viewGroup0.setLayoutTransition(new LayoutTransition());
            return;
        }
        viewGroup0.setLayoutTransition(null);
    }

    @BindingAdapter(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    public static void setListener(ViewGroup viewGroup0, OnAnimationStart viewGroupBindingAdapter$OnAnimationStart0, OnAnimationEnd viewGroupBindingAdapter$OnAnimationEnd0, OnAnimationRepeat viewGroupBindingAdapter$OnAnimationRepeat0) {
        if(viewGroupBindingAdapter$OnAnimationStart0 == null && viewGroupBindingAdapter$OnAnimationEnd0 == null && viewGroupBindingAdapter$OnAnimationRepeat0 == null) {
            viewGroup0.setLayoutAnimationListener(null);
            return;
        }
        viewGroup0.setLayoutAnimationListener(new i(viewGroupBindingAdapter$OnAnimationStart0, viewGroupBindingAdapter$OnAnimationEnd0, viewGroupBindingAdapter$OnAnimationRepeat0));
    }

    @BindingAdapter(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    public static void setListener(ViewGroup viewGroup0, OnChildViewAdded viewGroupBindingAdapter$OnChildViewAdded0, OnChildViewRemoved viewGroupBindingAdapter$OnChildViewRemoved0) {
        if(viewGroupBindingAdapter$OnChildViewAdded0 == null && viewGroupBindingAdapter$OnChildViewRemoved0 == null) {
            viewGroup0.setOnHierarchyChangeListener(null);
            return;
        }
        viewGroup0.setOnHierarchyChangeListener(new h(viewGroupBindingAdapter$OnChildViewAdded0, viewGroupBindingAdapter$OnChildViewRemoved0));
    }
}

