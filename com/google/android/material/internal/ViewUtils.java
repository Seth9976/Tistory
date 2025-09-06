package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.f;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.R.styleable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.firebase.installations.c;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ViewUtils {
    public interface OnApplyWindowInsetsListener {
        WindowInsetsCompat onApplyWindowInsets(View arg1, WindowInsetsCompat arg2, RelativePadding arg3);
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int v, int v1, int v2, int v3) {
            this.start = v;
            this.top = v1;
            this.end = v2;
            this.bottom = v3;
        }

        public RelativePadding(@NonNull RelativePadding viewUtils$RelativePadding0) {
            this.start = viewUtils$RelativePadding0.start;
            this.top = viewUtils$RelativePadding0.top;
            this.end = viewUtils$RelativePadding0.end;
            this.bottom = viewUtils$RelativePadding0.bottom;
        }

        public void applyToView(View view0) {
            ViewCompat.setPaddingRelative(view0, this.start, this.top, this.end, this.bottom);
        }
    }

    @RequiresApi(16)
    public static final int EDGE_TO_EDGE_FLAGS = 0x300;

    public static void addOnGlobalLayoutListener(@Nullable View view0, @NonNull ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        if(view0 != null) {
            view0.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
        }
    }

    @NonNull
    public static Rect calculateOffsetRectFromBounds(@NonNull View view0, @NonNull View view1) {
        int[] arr_v = new int[2];
        view1.getLocationOnScreen(arr_v);
        int v = arr_v[0];
        int v1 = arr_v[1];
        int[] arr_v1 = new int[2];
        view0.getLocationOnScreen(arr_v1);
        int v2 = v - arr_v1[0];
        int v3 = v1 - arr_v1[1];
        return new Rect(v2, v3, view1.getWidth() + v2, view1.getHeight() + v3);
    }

    @NonNull
    public static Rect calculateRectFromBounds(@NonNull View view0) {
        return ViewUtils.calculateRectFromBounds(view0, 0);
    }

    @NonNull
    public static Rect calculateRectFromBounds(@NonNull View view0, int v) {
        return new Rect(view0.getLeft(), view0.getTop() + v, view0.getRight(), view0.getBottom() + v);
    }

    public static void doOnApplyWindowInsets(@NonNull View view0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        ViewUtils.doOnApplyWindowInsets(view0, attributeSet0, v, v1, null);
    }

    public static void doOnApplyWindowInsets(@NonNull View view0, @Nullable AttributeSet attributeSet0, int v, int v1, @Nullable OnApplyWindowInsetsListener viewUtils$OnApplyWindowInsetsListener0) {
        TypedArray typedArray0 = view0.getContext().obtainStyledAttributes(attributeSet0, styleable.Insets, v, v1);
        boolean z = typedArray0.getBoolean(styleable.Insets_paddingBottomSystemWindowInsets, false);
        boolean z1 = typedArray0.getBoolean(styleable.Insets_paddingLeftSystemWindowInsets, false);
        boolean z2 = typedArray0.getBoolean(styleable.Insets_paddingRightSystemWindowInsets, false);
        typedArray0.recycle();
        ViewUtils.doOnApplyWindowInsets(view0, new x(z, z1, z2, viewUtils$OnApplyWindowInsetsListener0));
    }

    public static void doOnApplyWindowInsets(@NonNull View view0, @NonNull OnApplyWindowInsetsListener viewUtils$OnApplyWindowInsetsListener0) {
        ViewCompat.setOnApplyWindowInsetsListener(view0, new y(viewUtils$OnApplyWindowInsetsListener0, new RelativePadding(ViewCompat.getPaddingStart(view0), view0.getPaddingTop(), ViewCompat.getPaddingEnd(view0), view0.getPaddingBottom())));
        ViewUtils.requestApplyInsetsWhenAttached(view0);
    }

    public static float dpToPx(@NonNull Context context0, @Dimension(unit = 0) int v) {
        return TypedValue.applyDimension(1, ((float)v), context0.getResources().getDisplayMetrics());
    }

    @Nullable
    public static Integer getBackgroundColor(@NonNull View view0) {
        ColorStateList colorStateList0 = DrawableUtils.getColorStateListOrNull(view0.getBackground());
        return colorStateList0 == null ? null : colorStateList0.getDefaultColor();
    }

    @NonNull
    public static List getChildren(@Nullable View view0) {
        List list0 = new ArrayList();
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                ((ArrayList)list0).add(((ViewGroup)view0).getChildAt(v));
            }
        }
        return list0;
    }

    @Nullable
    public static ViewGroup getContentView(@Nullable View view0) {
        if(view0 == null) {
            return null;
        }
        View view1 = view0.getRootView();
        ViewGroup viewGroup0 = (ViewGroup)view1.findViewById(0x1020002);
        if(viewGroup0 != null) {
            return viewGroup0;
        }
        return view1 == view0 || !(view1 instanceof ViewGroup) ? null : ((ViewGroup)view1);
    }

    @Nullable
    public static ViewOverlayImpl getContentViewOverlay(@NonNull View view0) {
        return ViewUtils.getOverlay(ViewUtils.getContentView(view0));
    }

    @Nullable
    public static ViewOverlayImpl getOverlay(@Nullable View view0) {
        return view0 == null ? null : new f(view0);
    }

    public static float getParentAbsoluteElevation(@NonNull View view0) {
        ViewParent viewParent0 = view0.getParent();
        float f = 0.0f;
        while(viewParent0 instanceof View) {
            f += ViewCompat.getElevation(((View)viewParent0));
            viewParent0 = viewParent0.getParent();
        }
        return f;
    }

    public static void hideKeyboard(@NonNull View view0) {
        ViewUtils.hideKeyboard(view0, true);
    }

    public static void hideKeyboard(@NonNull View view0, boolean z) {
        if(z) {
            WindowInsetsControllerCompat windowInsetsControllerCompat0 = ViewCompat.getWindowInsetsController(view0);
            if(windowInsetsControllerCompat0 != null) {
                windowInsetsControllerCompat0.hide(8);
                return;
            }
        }
        InputMethodManager inputMethodManager0 = (InputMethodManager)ContextCompat.getSystemService(view0.getContext(), InputMethodManager.class);
        if(inputMethodManager0 != null) {
            inputMethodManager0.hideSoftInputFromWindow(view0.getWindowToken(), 0);
        }
    }

    public static boolean isLayoutRtl(View view0) {
        return ViewCompat.getLayoutDirection(view0) == 1;
    }

    public static PorterDuff.Mode parseTintMode(int v, PorterDuff.Mode porterDuff$Mode0) {
        switch(v) {
            case 3: {
                return PorterDuff.Mode.SRC_OVER;
            }
            case 5: {
                return PorterDuff.Mode.SRC_IN;
            }
            case 9: {
                return PorterDuff.Mode.SRC_ATOP;
            }
            case 14: {
                return PorterDuff.Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff.Mode.SCREEN;
            }
            case 16: {
                return PorterDuff.Mode.ADD;
            }
            default: {
                return porterDuff$Mode0;
            }
        }
    }

    public static void removeOnGlobalLayoutListener(@Nullable View view0, @NonNull ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        if(view0 != null) {
            ViewUtils.removeOnGlobalLayoutListener(view0.getViewTreeObserver(), viewTreeObserver$OnGlobalLayoutListener0);
        }
    }

    public static void removeOnGlobalLayoutListener(@NonNull ViewTreeObserver viewTreeObserver0, @NonNull ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        viewTreeObserver0.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
    }

    public static void requestApplyInsetsWhenAttached(@NonNull View view0) {
        if(ViewCompat.isAttachedToWindow(view0)) {
            ViewCompat.requestApplyInsets(view0);
            return;
        }
        view0.addOnAttachStateChangeListener(new z());  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static void requestFocusAndShowKeyboard(@NonNull View view0) {
        ViewUtils.requestFocusAndShowKeyboard(view0, true);
    }

    public static void requestFocusAndShowKeyboard(@NonNull View view0, boolean z) {
        view0.requestFocus();
        view0.post(new c(view0, z, 2));
    }

    public static void setBoundsFromRect(@NonNull View view0, @NonNull Rect rect0) {
        view0.setLeft(rect0.left);
        view0.setTop(rect0.top);
        view0.setRight(rect0.right);
        view0.setBottom(rect0.bottom);
    }

    public static void showKeyboard(@NonNull View view0) {
        ViewUtils.showKeyboard(view0, true);
    }

    public static void showKeyboard(@NonNull View view0, boolean z) {
        if(z) {
            WindowInsetsControllerCompat windowInsetsControllerCompat0 = ViewCompat.getWindowInsetsController(view0);
            if(windowInsetsControllerCompat0 != null) {
                windowInsetsControllerCompat0.show(8);
                return;
            }
        }
        ((InputMethodManager)ContextCompat.getSystemService(view0.getContext(), InputMethodManager.class)).showSoftInput(view0, 1);
    }
}

