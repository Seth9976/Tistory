package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.TintableBackgroundView;

public class AppCompatSpinner extends Spinner implements TintableBackgroundView {
    @VisibleForTesting
    interface SpinnerPopup {
        void dismiss();

        Drawable getBackground();

        CharSequence getHintText();

        int getHorizontalOffset();

        int getHorizontalOriginalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(ListAdapter arg1);

        void setBackgroundDrawable(Drawable arg1);

        void setHorizontalOffset(int arg1);

        void setHorizontalOriginalOffset(int arg1);

        void setPromptText(CharSequence arg1);

        void setVerticalOffset(int arg1);

        void show(int arg1, int arg2);
    }

    public final y a;
    public final Context b;
    public final i0 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final SpinnerPopup f;
    public int g;
    public final Rect h;
    public static final int[] i;

    static {
        AppCompatSpinner.i = new int[]{0x10102F1};
    }

    public AppCompatSpinner(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatSpinner(@NonNull Context context0, int v) {
        this(context0, null, attr.spinnerStyle, v);
    }

    public AppCompatSpinner(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.spinnerStyle);
    }

    public AppCompatSpinner(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, -1);
    }

    public AppCompatSpinner(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        this(context0, attributeSet0, v, v1, null);
    }

    public AppCompatSpinner(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1, Resources.Theme resources$Theme0) {
        super(context0, attributeSet0, v);
        TypedArray typedArray1;
        this.h = new Rect();
        ThemeUtils.checkAppCompatTheme(this, this.getContext());
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, attributeSet0, styleable.Spinner, v, 0);
        this.a = new y(this);
        if(resources$Theme0 == null) {
            int v2 = tintTypedArray0.getResourceId(styleable.Spinner_popupTheme, 0);
            this.b = v2 == 0 ? context0 : new ContextThemeWrapper(context0, v2);
        }
        else {
            this.b = new ContextThemeWrapper(context0, resources$Theme0);
        }
        TypedArray typedArray0 = null;
        if(v1 == -1) {
            try {
                typedArray1 = null;
                typedArray1 = context0.obtainStyledAttributes(attributeSet0, AppCompatSpinner.i, v, 0);
                goto label_20;
            }
            catch(Exception exception0) {
                goto label_24;
            }
            catch(Throwable throwable0) {
            }
            goto label_29;
            try {
                try {
                label_20:
                    if(typedArray1.hasValue(0)) {
                        v1 = typedArray1.getInt(0, 0);
                        goto label_32;
                    }
                    else {
                        goto label_34;
                    }
                }
                catch(Exception exception0) {
                label_24:
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", exception0);
                    if(typedArray1 != null) {
                        goto label_32;
                    }
                }
                goto label_35;
            }
            catch(Throwable throwable0) {
                typedArray0 = typedArray1;
            }
        label_29:
            if(typedArray0 != null) {
                typedArray0.recycle();
            }
            throw throwable0;
        label_32:
            typedArray1.recycle();
            goto label_35;
        label_34:
            typedArray1.recycle();
        }
    label_35:
        switch(v1) {
            case 0: {
                n0 n00 = new n0(this);
                this.f = n00;
                n00.c = tintTypedArray0.getString(styleable.Spinner_android_prompt);
                break;
            }
            case 1: {
                r0 r00 = new r0(this, this.b, attributeSet0, v);
                TintTypedArray tintTypedArray1 = TintTypedArray.obtainStyledAttributes(this.b, attributeSet0, styleable.Spinner, v, 0);
                this.g = tintTypedArray1.getLayoutDimension(styleable.Spinner_android_dropDownWidth, -2);
                r00.setBackgroundDrawable(tintTypedArray1.getDrawable(styleable.Spinner_android_popupBackground));
                r00.I = tintTypedArray0.getString(styleable.Spinner_android_prompt);
                tintTypedArray1.recycle();
                this.f = r00;
                this.c = new i0(this, this, r00);
            }
        }
        CharSequence[] arr_charSequence = tintTypedArray0.getTextArray(styleable.Spinner_android_entries);
        if(arr_charSequence != null) {
            ArrayAdapter arrayAdapter0 = new ArrayAdapter(context0, 0x1090008, arr_charSequence);
            arrayAdapter0.setDropDownViewResource(layout.support_simple_spinner_dropdown_item);
            this.setAdapter(arrayAdapter0);
        }
        tintTypedArray0.recycle();
        this.e = true;
        SpinnerAdapter spinnerAdapter0 = this.d;
        if(spinnerAdapter0 != null) {
            this.setAdapter(spinnerAdapter0);
            this.d = null;
        }
        this.a.d(attributeSet0, v);
    }

    public final int a(SpinnerAdapter spinnerAdapter0, Drawable drawable0) {
        int v = 0;
        if(spinnerAdapter0 == null) {
            return 0;
        }
        int v1 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
        int v2 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
        int v3 = Math.max(0, this.getSelectedItemPosition());
        int v4 = Math.min(spinnerAdapter0.getCount(), v3 + 15);
        int v5 = Math.max(0, v4 - 15);
        View view0 = null;
        int v6 = 0;
        while(v5 < v4) {
            int v7 = spinnerAdapter0.getItemViewType(v5);
            if(v7 != v) {
                view0 = null;
                v = v7;
            }
            view0 = spinnerAdapter0.getView(v5, view0, this);
            if(view0.getLayoutParams() == null) {
                view0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view0.measure(v1, v2);
            v6 = Math.max(v6, view0.getMeasuredWidth());
            ++v5;
        }
        if(drawable0 != null) {
            drawable0.getPadding(this.h);
            return v6 + (this.h.left + this.h.right);
        }
        return v6;
    }

    @Override  // android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y y0 = this.a;
        if(y0 != null) {
            y0.a();
        }
    }

    @Override  // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        return this.f == null ? super.getDropDownHorizontalOffset() : this.f.getHorizontalOffset();
    }

    @Override  // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        return this.f == null ? super.getDropDownVerticalOffset() : this.f.getVerticalOffset();
    }

    @Override  // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f == null ? super.getDropDownWidth() : this.g;
    }

    @VisibleForTesting
    public final SpinnerPopup getInternalPopup() {
        return this.f;
    }

    @Override  // android.widget.Spinner
    public Drawable getPopupBackground() {
        return this.f == null ? super.getPopupBackground() : this.f.getBackground();
    }

    @Override  // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override  // android.widget.Spinner
    public CharSequence getPrompt() {
        return this.f == null ? super.getPrompt() : this.f.getHintText();
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        return this.a == null ? null : this.a.b();
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.a == null ? null : this.a.c();
    }

    @Override  // android.widget.Spinner
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        if(appCompatSpinner$SpinnerPopup0 != null && appCompatSpinner$SpinnerPopup0.isShowing()) {
            appCompatSpinner$SpinnerPopup0.dismiss();
        }
    }

    @Override  // android.widget.Spinner
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.f != null && View.MeasureSpec.getMode(v) == 0x80000000) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), View.MeasureSpec.getSize(v)), this.getMeasuredHeight());
        }
    }

    @Override  // android.widget.Spinner
    public void onRestoreInstanceState(Parcelable parcelable0) {
        super.onRestoreInstanceState(((s0)parcelable0).getSuperState());
        if(((s0)parcelable0).a) {
            ViewTreeObserver viewTreeObserver0 = this.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                viewTreeObserver0.addOnGlobalLayoutListener(new j0(this));
            }
        }
    }

    @Override  // android.widget.Spinner
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new s0(super.onSaveInstanceState());  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.a = this.f != null && this.f.isShowing();
        return parcelable0;
    }

    @Override  // android.widget.Spinner
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return this.c == null || !this.c.onTouch(this, motionEvent0) ? super.onTouchEvent(motionEvent0) : true;
    }

    @Override  // android.widget.Spinner
    public boolean performClick() {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        if(appCompatSpinner$SpinnerPopup0 != null) {
            if(!appCompatSpinner$SpinnerPopup0.isShowing()) {
                int v = l0.b(this);
                int v1 = l0.a(this);
                this.f.show(v, v1);
            }
            return true;
        }
        return super.performClick();
    }

    @Override  // android.widget.Spinner
    public void setAdapter(Adapter adapter0) {
        this.setAdapter(((SpinnerAdapter)adapter0));
    }

    @Override  // android.widget.Spinner
    public void setAdapter(SpinnerAdapter spinnerAdapter0) {
        if(!this.e) {
            this.d = spinnerAdapter0;
            return;
        }
        super.setAdapter(spinnerAdapter0);
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        if(appCompatSpinner$SpinnerPopup0 != null) {
            Resources.Theme resources$Theme0 = (this.b == null ? this.getContext() : this.b).getTheme();
            o0 o00 = new o0();  // 初始化器: Ljava/lang/Object;-><init>()V
            o00.a = spinnerAdapter0;
            if(spinnerAdapter0 instanceof ListAdapter) {
                o00.b = (ListAdapter)spinnerAdapter0;
            }
            if(resources$Theme0 != null) {
                if(spinnerAdapter0 instanceof ThemedSpinnerAdapter) {
                    m0.a(((ThemedSpinnerAdapter)spinnerAdapter0), resources$Theme0);
                }
                else if(spinnerAdapter0 instanceof androidx.appcompat.widget.ThemedSpinnerAdapter && ((androidx.appcompat.widget.ThemedSpinnerAdapter)spinnerAdapter0).getDropDownViewTheme() == null) {
                    ((androidx.appcompat.widget.ThemedSpinnerAdapter)spinnerAdapter0).setDropDownViewTheme(resources$Theme0);
                }
            }
            appCompatSpinner$SpinnerPopup0.setAdapter(o00);
        }
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        y y0 = this.a;
        if(y0 != null) {
            y0.e();
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(@DrawableRes int v) {
        super.setBackgroundResource(v);
        y y0 = this.a;
        if(y0 != null) {
            y0.f(v);
        }
    }

    @Override  // android.widget.Spinner
    public void setDropDownHorizontalOffset(int v) {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        if(appCompatSpinner$SpinnerPopup0 != null) {
            appCompatSpinner$SpinnerPopup0.setHorizontalOriginalOffset(v);
            appCompatSpinner$SpinnerPopup0.setHorizontalOffset(v);
            return;
        }
        super.setDropDownHorizontalOffset(v);
    }

    @Override  // android.widget.Spinner
    public void setDropDownVerticalOffset(int v) {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        if(appCompatSpinner$SpinnerPopup0 != null) {
            appCompatSpinner$SpinnerPopup0.setVerticalOffset(v);
            return;
        }
        super.setDropDownVerticalOffset(v);
    }

    @Override  // android.widget.Spinner
    public void setDropDownWidth(int v) {
        if(this.f != null) {
            this.g = v;
            return;
        }
        super.setDropDownWidth(v);
    }

    @Override  // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable0) {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        if(appCompatSpinner$SpinnerPopup0 != null) {
            appCompatSpinner$SpinnerPopup0.setBackgroundDrawable(drawable0);
            return;
        }
        super.setPopupBackgroundDrawable(drawable0);
    }

    @Override  // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int v) {
        this.setPopupBackgroundDrawable(AppCompatResources.getDrawable(this.getPopupContext(), v));
    }

    @Override  // android.widget.Spinner
    public void setPrompt(CharSequence charSequence0) {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        if(appCompatSpinner$SpinnerPopup0 != null) {
            appCompatSpinner$SpinnerPopup0.setPromptText(charSequence0);
            return;
        }
        super.setPrompt(charSequence0);
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        y y0 = this.a;
        if(y0 != null) {
            y0.h(colorStateList0);
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        y y0 = this.a;
        if(y0 != null) {
            y0.i(porterDuff$Mode0);
        }
    }
}

