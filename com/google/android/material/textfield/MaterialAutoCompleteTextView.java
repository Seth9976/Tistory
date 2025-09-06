package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.p0;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import f8.p;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    public final ListPopupWindow e;
    public final AccessibilityManager f;
    public final Rect g;
    public final int h;
    public final float i;
    public ColorStateList j;
    public int k;
    public ColorStateList l;

    public MaterialAutoCompleteTextView(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialAutoCompleteTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, 0), attributeSet0, v);
        this.g = new Rect();
        Context context1 = this.getContext();
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.MaterialAutoCompleteTextView, v, style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if(typedArray0.hasValue(styleable.MaterialAutoCompleteTextView_android_inputType) && typedArray0.getInt(styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            this.setKeyListener(null);
        }
        this.h = typedArray0.getResourceId(styleable.MaterialAutoCompleteTextView_simpleItemLayout, layout.mtrl_auto_complete_simple_item);
        this.i = (float)typedArray0.getDimensionPixelOffset(styleable.MaterialAutoCompleteTextView_android_popupElevation, dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if(typedArray0.hasValue(styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.j = ColorStateList.valueOf(typedArray0.getColor(styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.k = typedArray0.getColor(styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.l = MaterialResources.getColorStateList(context1, typedArray0, styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f = (AccessibilityManager)context1.getSystemService("accessibility");
        ListPopupWindow listPopupWindow0 = new ListPopupWindow(context1);
        this.e = listPopupWindow0;
        listPopupWindow0.setModal(true);
        listPopupWindow0.setAnchorView(this);
        listPopupWindow0.setInputMethodMode(2);
        listPopupWindow0.setAdapter(this.getAdapter());
        listPopupWindow0.setOnItemClickListener(new p0(this, 2));
        if(typedArray0.hasValue(styleable.MaterialAutoCompleteTextView_simpleItems)) {
            this.setSimpleItems(typedArray0.getResourceId(styleable.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        typedArray0.recycle();
    }

    public static void a(MaterialAutoCompleteTextView materialAutoCompleteTextView0, Object object0) {
        materialAutoCompleteTextView0.setText(materialAutoCompleteTextView0.convertSelectionToString(object0), false);
    }

    public final TextInputLayout b() {
        for(ViewParent viewParent0 = this.getParent(); viewParent0 != null; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 instanceof TextInputLayout) {
                return (TextInputLayout)viewParent0;
            }
        }
        return null;
    }

    @Override  // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if(this.f != null && this.f.isTouchExplorationEnabled()) {
            this.e.dismiss();
            return;
        }
        super.dismissDropDown();
    }

    @Nullable
    public ColorStateList getDropDownBackgroundTintList() {
        return this.j;
    }

    @Override  // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayout0 = this.b();
        return textInputLayout0 == null || !textInputLayout0.isProvidingHint() ? super.getHint() : textInputLayout0.getHint();
    }

    public float getPopupElevation() {
        return this.i;
    }

    public int getSimpleItemSelectedColor() {
        return this.k;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.l;
    }

    @Override  // android.widget.AutoCompleteTextView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout0 = this.b();
        if(textInputLayout0 != null && textInputLayout0.isProvidingHint() && super.getHint() == null && ManufacturerUtils.isMeizuDevice()) {
            this.setHint("");
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dismiss();
    }

    @Override  // android.widget.TextView
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(View.MeasureSpec.getMode(v) == 0x80000000) {
            int v2 = this.getMeasuredWidth();
            ListAdapter listAdapter0 = this.getAdapter();
            TextInputLayout textInputLayout0 = this.b();
            int v3 = 0;
            if(listAdapter0 != null && textInputLayout0 != null) {
                int v4 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
                int v5 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow0 = this.e;
                int v6 = Math.max(0, listPopupWindow0.getSelectedItemPosition());
                int v7 = Math.min(listAdapter0.getCount(), v6 + 15);
                int v8 = Math.max(0, v7 - 15);
                View view0 = null;
                int v9 = 0;
                while(v8 < v7) {
                    int v10 = listAdapter0.getItemViewType(v8);
                    if(v10 != v3) {
                        view0 = null;
                        v3 = v10;
                    }
                    view0 = listAdapter0.getView(v8, view0, textInputLayout0);
                    if(view0.getLayoutParams() == null) {
                        view0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view0.measure(v4, v5);
                    v9 = Math.max(v9, view0.getMeasuredWidth());
                    ++v8;
                }
                Drawable drawable0 = listPopupWindow0.getBackground();
                if(drawable0 != null) {
                    drawable0.getPadding(this.g);
                    v9 += this.g.left + this.g.right;
                }
                v3 = textInputLayout0.getEndIconView().getMeasuredWidth() + v9;
            }
            this.setMeasuredDimension(Math.min(Math.max(v2, v3), View.MeasureSpec.getSize(v)), this.getMeasuredHeight());
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public void onWindowFocusChanged(boolean z) {
        if(this.f != null && this.f.isTouchExplorationEnabled()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setAdapter(@Nullable ListAdapter listAdapter0) {
        super.setAdapter(listAdapter0);
        ListAdapter listAdapter1 = this.getAdapter();
        this.e.setAdapter(listAdapter1);
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable0) {
        super.setDropDownBackgroundDrawable(drawable0);
        ListPopupWindow listPopupWindow0 = this.e;
        if(listPopupWindow0 != null) {
            listPopupWindow0.setBackgroundDrawable(drawable0);
        }
    }

    public void setDropDownBackgroundTint(@ColorInt int v) {
        this.setDropDownBackgroundTintList(ColorStateList.valueOf(v));
    }

    public void setDropDownBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        this.j = colorStateList0;
        Drawable drawable0 = this.getDropDownBackground();
        if(drawable0 instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable)drawable0).setFillColor(this.j);
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
        super.setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
        AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener1 = this.getOnItemSelectedListener();
        this.e.setOnItemSelectedListener(adapterView$OnItemSelectedListener1);
    }

    @Override  // android.widget.TextView
    public void setRawInputType(int v) {
        super.setRawInputType(v);
        TextInputLayout textInputLayout0 = this.b();
        if(textInputLayout0 != null) {
            textInputLayout0.s();
        }
    }

    public void setSimpleItemSelectedColor(int v) {
        this.k = v;
        if(this.getAdapter() instanceof p) {
            ((p)this.getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList0) {
        this.l = colorStateList0;
        if(this.getAdapter() instanceof p) {
            ((p)this.getAdapter()).a();
        }
    }

    public void setSimpleItems(@ArrayRes int v) {
        this.setSimpleItems(this.getResources().getStringArray(v));
    }

    public void setSimpleItems(@NonNull String[] arr_s) {
        this.setAdapter(new p(this, this.getContext(), this.h, arr_s));
    }

    @Override  // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if(this.f != null && this.f.isTouchExplorationEnabled()) {
            this.e.show();
            return;
        }
        super.showDropDown();
    }
}

