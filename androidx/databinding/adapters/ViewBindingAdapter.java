package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.library.baseAdapters.R.id;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:backgroundTint", method = "setBackgroundTintList", type = View.class), @BindingMethod(attribute = "android:fadeScrollbars", method = "setScrollbarFadingEnabled", type = View.class), @BindingMethod(attribute = "android:getOutline", method = "setOutlineProvider", type = View.class), @BindingMethod(attribute = "android:nextFocusForward", method = "setNextFocusForwardId", type = View.class), @BindingMethod(attribute = "android:nextFocusLeft", method = "setNextFocusLeftId", type = View.class), @BindingMethod(attribute = "android:nextFocusRight", method = "setNextFocusRightId", type = View.class), @BindingMethod(attribute = "android:nextFocusUp", method = "setNextFocusUpId", type = View.class), @BindingMethod(attribute = "android:nextFocusDown", method = "setNextFocusDownId", type = View.class), @BindingMethod(attribute = "android:requiresFadingEdge", method = "setVerticalFadingEdgeEnabled", type = View.class), @BindingMethod(attribute = "android:scrollbarDefaultDelayBeforeFade", method = "setScrollBarDefaultDelayBeforeFade", type = View.class), @BindingMethod(attribute = "android:scrollbarFadeDuration", method = "setScrollBarFadeDuration", type = View.class), @BindingMethod(attribute = "android:scrollbarSize", method = "setScrollBarSize", type = View.class), @BindingMethod(attribute = "android:scrollbarStyle", method = "setScrollBarStyle", type = View.class), @BindingMethod(attribute = "android:transformPivotX", method = "setPivotX", type = View.class), @BindingMethod(attribute = "android:transformPivotY", method = "setPivotY", type = View.class), @BindingMethod(attribute = "android:onDrag", method = "setOnDragListener", type = View.class), @BindingMethod(attribute = "android:onClick", method = "setOnClickListener", type = View.class), @BindingMethod(attribute = "android:onApplyWindowInsets", method = "setOnApplyWindowInsetsListener", type = View.class), @BindingMethod(attribute = "android:onCreateContextMenu", method = "setOnCreateContextMenuListener", type = View.class), @BindingMethod(attribute = "android:onFocusChange", method = "setOnFocusChangeListener", type = View.class), @BindingMethod(attribute = "android:onGenericMotion", method = "setOnGenericMotionListener", type = View.class), @BindingMethod(attribute = "android:onHover", method = "setOnHoverListener", type = View.class), @BindingMethod(attribute = "android:onKey", method = "setOnKeyListener", type = View.class), @BindingMethod(attribute = "android:onLongClick", method = "setOnLongClickListener", type = View.class), @BindingMethod(attribute = "android:onSystemUiVisibilityChange", method = "setOnSystemUiVisibilityChangeListener", type = View.class), @BindingMethod(attribute = "android:onTouch", method = "setOnTouchListener", type = View.class)})
public class ViewBindingAdapter {
    @TargetApi(12)
    public interface OnViewAttachedToWindow {
        void onViewAttachedToWindow(View arg1);
    }

    @TargetApi(12)
    public interface OnViewDetachedFromWindow {
        void onViewDetachedFromWindow(View arg1);
    }

    public static final int FADING_EDGE_HORIZONTAL = 1;
    public static final int FADING_EDGE_NONE = 0;
    public static final int FADING_EDGE_VERTICAL = 2;

    public static int a(float f) {
        if(((int)(f + 0.5f)) != 0) {
            return (int)(f + 0.5f);
        }
        int v = Float.compare(f, 0.0f);
        if(v == 0) {
            return 0;
        }
        return v <= 0 ? -1 : 1;
    }

    @BindingAdapter({"android:background"})
    public static void setBackground(View view0, Drawable drawable0) {
        view0.setBackground(drawable0);
    }

    @BindingAdapter({"android:onClickListener", "android:clickable"})
    public static void setClickListener(View view0, View.OnClickListener view$OnClickListener0, boolean z) {
        view0.setOnClickListener(view$OnClickListener0);
        view0.setClickable(z);
    }

    @BindingAdapter(requireAll = false, value = {"android:onViewDetachedFromWindow", "android:onViewAttachedToWindow"})
    public static void setOnAttachStateChangeListener(View view0, OnViewDetachedFromWindow viewBindingAdapter$OnViewDetachedFromWindow0, OnViewAttachedToWindow viewBindingAdapter$OnViewAttachedToWindow0) {
        g g0 = viewBindingAdapter$OnViewDetachedFromWindow0 != null || viewBindingAdapter$OnViewAttachedToWindow0 != null ? new g(viewBindingAdapter$OnViewAttachedToWindow0, viewBindingAdapter$OnViewDetachedFromWindow0) : null;
        View.OnAttachStateChangeListener view$OnAttachStateChangeListener0 = (View.OnAttachStateChangeListener)ListenerUtil.trackListener(view0, g0, id.onAttachStateChangeListener);
        if(view$OnAttachStateChangeListener0 != null) {
            view0.removeOnAttachStateChangeListener(view$OnAttachStateChangeListener0);
        }
        if(g0 != null) {
            view0.addOnAttachStateChangeListener(g0);
        }
    }

    @BindingAdapter({"android:onClick", "android:clickable"})
    public static void setOnClick(View view0, View.OnClickListener view$OnClickListener0, boolean z) {
        view0.setOnClickListener(view$OnClickListener0);
        view0.setClickable(z);
    }

    @BindingAdapter({"android:onLayoutChange"})
    public static void setOnLayoutChangeListener(View view0, View.OnLayoutChangeListener view$OnLayoutChangeListener0, View.OnLayoutChangeListener view$OnLayoutChangeListener1) {
        if(view$OnLayoutChangeListener0 != null) {
            view0.removeOnLayoutChangeListener(view$OnLayoutChangeListener0);
        }
        if(view$OnLayoutChangeListener1 != null) {
            view0.addOnLayoutChangeListener(view$OnLayoutChangeListener1);
        }
    }

    @BindingAdapter({"android:onLongClick", "android:longClickable"})
    public static void setOnLongClick(View view0, View.OnLongClickListener view$OnLongClickListener0, boolean z) {
        view0.setOnLongClickListener(view$OnLongClickListener0);
        view0.setLongClickable(z);
    }

    @BindingAdapter({"android:onLongClickListener", "android:longClickable"})
    public static void setOnLongClickListener(View view0, View.OnLongClickListener view$OnLongClickListener0, boolean z) {
        view0.setOnLongClickListener(view$OnLongClickListener0);
        view0.setLongClickable(z);
    }

    @BindingAdapter({"android:padding"})
    public static void setPadding(View view0, float f) {
        int v = ViewBindingAdapter.a(f);
        view0.setPadding(v, v, v, v);
    }

    @BindingAdapter({"android:paddingBottom"})
    public static void setPaddingBottom(View view0, float f) {
        view0.setPadding(view0.getPaddingLeft(), view0.getPaddingTop(), view0.getPaddingRight(), ViewBindingAdapter.a(f));
    }

    @BindingAdapter({"android:paddingEnd"})
    public static void setPaddingEnd(View view0, float f) {
        view0.setPaddingRelative(view0.getPaddingStart(), view0.getPaddingTop(), ViewBindingAdapter.a(f), view0.getPaddingBottom());
    }

    @BindingAdapter({"android:paddingLeft"})
    public static void setPaddingLeft(View view0, float f) {
        view0.setPadding(ViewBindingAdapter.a(f), view0.getPaddingTop(), view0.getPaddingRight(), view0.getPaddingBottom());
    }

    @BindingAdapter({"android:paddingRight"})
    public static void setPaddingRight(View view0, float f) {
        view0.setPadding(view0.getPaddingLeft(), view0.getPaddingTop(), ViewBindingAdapter.a(f), view0.getPaddingBottom());
    }

    @BindingAdapter({"android:paddingStart"})
    public static void setPaddingStart(View view0, float f) {
        view0.setPaddingRelative(ViewBindingAdapter.a(f), view0.getPaddingTop(), view0.getPaddingEnd(), view0.getPaddingBottom());
    }

    @BindingAdapter({"android:paddingTop"})
    public static void setPaddingTop(View view0, float f) {
        view0.setPadding(view0.getPaddingLeft(), ViewBindingAdapter.a(f), view0.getPaddingRight(), view0.getPaddingBottom());
    }

    @BindingAdapter({"android:requiresFadingEdge"})
    public static void setRequiresFadingEdge(View view0, int v) {
        view0.setVerticalFadingEdgeEnabled((v & 2) != 0);
        view0.setHorizontalFadingEdgeEnabled((v & 1) != 0);
    }
}

