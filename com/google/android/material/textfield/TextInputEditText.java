package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class TextInputEditText extends AppCompatEditText {
    public final Rect c;
    public boolean d;

    public TextInputEditText(@NonNull Context context0) {
        this(context0, null);
    }

    public TextInputEditText(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.editTextStyle);
    }

    public TextInputEditText(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, 0), attributeSet0, v);
        this.c = new Rect();
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context0, attributeSet0, styleable.TextInputEditText, v, style.Widget_Design_TextInputEditText, new int[0]);
        this.setTextInputLayoutFocusedRectEnabled(typedArray0.getBoolean(styleable.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        typedArray0.recycle();
    }

    @Override  // android.widget.TextView
    public void getFocusedRect(@Nullable Rect rect0) {
        super.getFocusedRect(rect0);
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(textInputLayout0 != null && this.d && rect0 != null) {
            textInputLayout0.getFocusedRect(this.c);
            rect0.bottom = this.c.bottom;
        }
    }

    @Override  // android.view.View
    public boolean getGlobalVisibleRect(@Nullable Rect rect0, @Nullable Point point0) {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(textInputLayout0 != null && this.d) {
            boolean z = textInputLayout0.getGlobalVisibleRect(rect0, point0);
            if(z && point0 != null) {
                point0.offset(-this.getScrollX(), -this.getScrollY());
            }
            return z;
        }
        return super.getGlobalVisibleRect(rect0, point0);
    }

    @Override  // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        return textInputLayout0 == null || !textInputLayout0.isProvidingHint() ? super.getHint() : textInputLayout0.getHint();
    }

    @Nullable
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        return textInputLayout0 == null ? null : textInputLayout0.getHint();
    }

    @Nullable
    private TextInputLayout getTextInputLayout() {
        for(ViewParent viewParent0 = this.getParent(); viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 instanceof TextInputLayout) {
                return (TextInputLayout)viewParent0;
            }
        }
        return null;
    }

    public boolean isTextInputLayoutFocusedRectEnabled() {
        return this.d;
    }

    @Override  // android.widget.TextView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(textInputLayout0 != null && textInputLayout0.isProvidingHint() && super.getHint() == null && ManufacturerUtils.isMeizuDevice()) {
            this.setHint("");
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatEditText
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        if(inputConnection0 != null && editorInfo0.hintText == null) {
            editorInfo0.hintText = this.getHintFromLayout();
        }
        return inputConnection0;
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        this.getTextInputLayout();
    }

    @Override  // android.view.View
    public boolean requestRectangleOnScreen(@Nullable Rect rect0) {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(textInputLayout0 != null && this.d && rect0 != null) {
            int v = textInputLayout0.getHeight();
            int v1 = this.getHeight();
            this.c.set(rect0.left, rect0.top, rect0.right, rect0.bottom + (v - v1));
            return super.requestRectangleOnScreen(this.c);
        }
        return super.requestRectangleOnScreen(rect0);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.d = z;
    }
}

