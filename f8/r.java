package f8;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import g.b;

public final class r extends LinearLayout {
    public final TextInputLayout a;
    public final AppCompatTextView b;
    public CharSequence c;
    public final CheckableImageButton d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public int g;
    public ImageView.ScaleType h;
    public View.OnLongClickListener i;
    public boolean j;

    public r(TextInputLayout textInputLayout0, TintTypedArray tintTypedArray0) {
        super(textInputLayout0.getContext());
        this.a = textInputLayout0;
        this.setVisibility(8);
        this.setOrientation(0);
        this.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 0x800003));
        CheckableImageButton checkableImageButton0 = (CheckableImageButton)LayoutInflater.from(this.getContext()).inflate(layout.design_text_input_start_icon, this, false);
        this.d = checkableImageButton0;
        AppCompatTextView appCompatTextView0 = new AppCompatTextView(this.getContext());
        this.b = appCompatTextView0;
        if(MaterialResources.isFontScaleAtLeast1_3(this.getContext())) {
            MarginLayoutParamsCompat.setMarginEnd(((ViewGroup.MarginLayoutParams)checkableImageButton0.getLayoutParams()), 0);
        }
        View.OnLongClickListener view$OnLongClickListener0 = this.i;
        CharSequence charSequence0 = null;
        checkableImageButton0.setOnClickListener(null);
        b.E(checkableImageButton0, view$OnLongClickListener0);
        this.i = null;
        checkableImageButton0.setOnLongClickListener(null);
        b.E(checkableImageButton0, null);
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_startIconTint)) {
            this.e = MaterialResources.getColorStateList(this.getContext(), tintTypedArray0, styleable.TextInputLayout_startIconTint);
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_startIconTintMode)) {
            this.f = ViewUtils.parseTintMode(tintTypedArray0.getInt(styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_startIconDrawable)) {
            this.b(tintTypedArray0.getDrawable(styleable.TextInputLayout_startIconDrawable));
            if(tintTypedArray0.hasValue(styleable.TextInputLayout_startIconContentDescription)) {
                CharSequence charSequence1 = tintTypedArray0.getText(styleable.TextInputLayout_startIconContentDescription);
                if(checkableImageButton0.getContentDescription() != charSequence1) {
                    checkableImageButton0.setContentDescription(charSequence1);
                }
            }
            checkableImageButton0.setCheckable(tintTypedArray0.getBoolean(styleable.TextInputLayout_startIconCheckable, true));
        }
        int v = tintTypedArray0.getDimensionPixelSize(styleable.TextInputLayout_startIconMinSize, this.getResources().getDimensionPixelSize(dimen.mtrl_min_touch_target_size));
        if(v < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if(v != this.g) {
            this.g = v;
            checkableImageButton0.setMinimumWidth(v);
            checkableImageButton0.setMinimumHeight(v);
        }
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_startIconScaleType)) {
            ImageView.ScaleType imageView$ScaleType0 = b.h(tintTypedArray0.getInt(styleable.TextInputLayout_startIconScaleType, -1));
            this.h = imageView$ScaleType0;
            checkableImageButton0.setScaleType(imageView$ScaleType0);
        }
        appCompatTextView0.setVisibility(8);
        appCompatTextView0.setId(id.textinput_prefix_text);
        appCompatTextView0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.setAccessibilityLiveRegion(appCompatTextView0, 1);
        TextViewCompat.setTextAppearance(appCompatTextView0, tintTypedArray0.getResourceId(styleable.TextInputLayout_prefixTextAppearance, 0));
        if(tintTypedArray0.hasValue(styleable.TextInputLayout_prefixTextColor)) {
            appCompatTextView0.setTextColor(tintTypedArray0.getColorStateList(styleable.TextInputLayout_prefixTextColor));
        }
        CharSequence charSequence2 = tintTypedArray0.getText(styleable.TextInputLayout_prefixText);
        if(!TextUtils.isEmpty(charSequence2)) {
            charSequence0 = charSequence2;
        }
        this.c = charSequence0;
        appCompatTextView0.setText(charSequence2);
        this.e();
        this.addView(checkableImageButton0);
        this.addView(appCompatTextView0);
    }

    public final int a() {
        int v1;
        CheckableImageButton checkableImageButton0 = this.d;
        if(checkableImageButton0.getVisibility() == 0) {
            int v = checkableImageButton0.getMeasuredWidth();
            v1 = MarginLayoutParamsCompat.getMarginEnd(((ViewGroup.MarginLayoutParams)checkableImageButton0.getLayoutParams())) + v;
        }
        else {
            v1 = 0;
        }
        int v2 = ViewCompat.getPaddingStart(this);
        return ViewCompat.getPaddingStart(this.b) + v2 + v1;
    }

    public final void b(Drawable drawable0) {
        CheckableImageButton checkableImageButton0 = this.d;
        checkableImageButton0.setImageDrawable(drawable0);
        if(drawable0 != null) {
            b.a(this.a, checkableImageButton0, this.e, this.f);
            this.c(true);
            b.z(this.a, checkableImageButton0, this.e);
            return;
        }
        this.c(false);
        View.OnLongClickListener view$OnLongClickListener0 = this.i;
        checkableImageButton0.setOnClickListener(null);
        b.E(checkableImageButton0, view$OnLongClickListener0);
        this.i = null;
        checkableImageButton0.setOnLongClickListener(null);
        b.E(checkableImageButton0, null);
        if(checkableImageButton0.getContentDescription() != null) {
            checkableImageButton0.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton0 = this.d;
        int v = 0;
        if(checkableImageButton0.getVisibility() == 0 != z) {
            if(!z) {
                v = 8;
            }
            checkableImageButton0.setVisibility(v);
            this.d();
            this.e();
        }
    }

    public final void d() {
        EditText editText0 = this.a.h;
        if(editText0 == null) {
            return;
        }
        int v = this.d.getVisibility() == 0 ? 0 : ViewCompat.getPaddingStart(editText0);
        int v1 = editText0.getCompoundPaddingTop();
        int v2 = this.getContext().getResources().getDimensionPixelSize(dimen.material_input_text_to_prefix_suffix_padding);
        int v3 = editText0.getCompoundPaddingBottom();
        ViewCompat.setPaddingRelative(this.b, v, v1, v2, v3);
    }

    public final void e() {
        int v = 8;
        int v1 = this.c == null || this.j ? 8 : 0;
        if(this.d.getVisibility() == 0 || v1 == 0) {
            v = 0;
        }
        this.setVisibility(v);
        this.b.setVisibility(v1);
        this.a.q();
    }

    @Override  // android.widget.LinearLayout
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        this.d();
    }
}

