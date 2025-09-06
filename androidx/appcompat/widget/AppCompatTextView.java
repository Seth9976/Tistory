package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.text.PrecomputedTextCompat.Params;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import g.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements EmojiCompatConfigurationView, TintableBackgroundView, AutoSizeableTextView, TintableCompoundDrawablesView {
    interface SuperCaller {
        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        TextClassifier getTextClassifier();

        void setAutoSizeTextTypeUniformWithConfiguration(int arg1, int arg2, int arg3, int arg4);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] arg1, int arg2);

        void setAutoSizeTextTypeWithDefaults(int arg1);

        void setFirstBaselineToTopHeight(@Px int arg1);

        void setLastBaselineToBottomHeight(@Px int arg1);

        void setTextClassifier(@Nullable TextClassifier arg1);
    }

    public final y a;
    public final b1 b;
    public final u0 c;
    public e0 d;
    public boolean e;
    public c1 f;
    public Future g;

    public AppCompatTextView(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x1010084);
    }

    public AppCompatTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.wrap(context0), attributeSet0, v);
        this.e = false;
        this.f = null;
        ThemeUtils.checkAppCompatTheme(this, this.getContext());
        y y0 = new y(this);
        this.a = y0;
        y0.d(attributeSet0, v);
        b1 b10 = new b1(this);
        this.b = b10;
        b10.f(attributeSet0, v);
        b10.b();
        this.c = new u0(this);
        this.getEmojiTextViewHelper().a(attributeSet0, v);
    }

    @Override  // android.widget.TextView
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y y0 = this.a;
        if(y0 != null) {
            y0.a();
        }
        b1 b10 = this.b;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if(ViewUtils.b) {
            return this.getSuperCaller().getAutoSizeMaxTextSize();
        }
        return this.b == null ? -1 : Math.round(this.b.i.e);
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if(ViewUtils.b) {
            return this.getSuperCaller().getAutoSizeMinTextSize();
        }
        return this.b == null ? -1 : Math.round(this.b.i.d);
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if(ViewUtils.b) {
            return this.getSuperCaller().getAutoSizeStepGranularity();
        }
        return this.b == null ? -1 : Math.round(this.b.i.c);
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if(ViewUtils.b) {
            return this.getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        return this.b == null ? new int[0] : this.b.i.f;
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if(ViewUtils.b) {
            return this.getSuperCaller().getAutoSizeTextType() == 1 ? 1 : 0;
        }
        return this.b == null ? 0 : this.b.i.a;
    }

    @Override  // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @NonNull
    private e0 getEmojiTextViewHelper() {
        if(this.d == null) {
            this.d = new e0(this);
        }
        return this.d;
    }

    @Override  // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.getFirstBaselineToTopHeight(this);
    }

    @Override  // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.getLastBaselineToBottomHeight(this);
    }

    @RequiresApi(api = 26)
    @UiThread
    public SuperCaller getSuperCaller() {
        if(this.f == null) {
            if(Build.VERSION.SDK_INT >= 28) {
                this.f = new d1(this);
                return this.f;
            }
            this.f = new c1(this);
        }
        return this.f;
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

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override  // android.widget.TextView
    public CharSequence getText() {
        this.m();
        return super.getText();
    }

    @Override  // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        if(Build.VERSION.SDK_INT < 28) {
            u0 u00 = this.c;
            if(u00 != null) {
                return u00.b == null ? t0.a(u00.a) : u00.b;
            }
        }
        return this.getSuperCaller().getTextClassifier();
    }

    @NonNull
    public Params getTextMetricsParamsCompat() {
        return TextViewCompat.getTextMetricsParams(this);
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return this.getEmojiTextViewHelper().b.isEnabled();
    }

    public final void m() {
        Future future0 = this.g;
        if(future0 != null) {
            try {
                this.g = null;
                TextViewCompat.setPrecomputedText(this, ((PrecomputedTextCompat)future0.get()));
            }
            catch(InterruptedException | ExecutionException unused_ex) {
            }
        }
    }

    @Override  // android.widget.TextView
    public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        this.b.getClass();
        if(Build.VERSION.SDK_INT < 30 && inputConnection0 != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo0, this.getText());
        }
        b.v(inputConnection0, editorInfo0, this);
        return inputConnection0;
    }

    @Override  // android.widget.TextView
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        b1 b10 = this.b;
        if(b10 != null && !ViewUtils.b) {
            b10.i.a();
        }
    }

    @Override  // android.widget.TextView
    public void onMeasure(int v, int v1) {
        this.m();
        super.onMeasure(v, v1);
    }

    @Override  // android.widget.TextView
    public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        super.onTextChanged(charSequence0, v, v1, v2);
        b1 b10 = this.b;
        if(b10 != null && !ViewUtils.b) {
            k1 k10 = b10.i;
            if(k10.f()) {
                k10.a();
            }
        }
    }

    @Override  // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.getEmojiTextViewHelper().b(z);
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int v, int v1, int v2, int v3) throws IllegalArgumentException {
        if(ViewUtils.b) {
            this.getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
            return;
        }
        b1 b10 = this.b;
        if(b10 != null) {
            b10.h(v, v1, v2, v3);
        }
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] arr_v, int v) throws IllegalArgumentException {
        if(ViewUtils.b) {
            this.getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
            return;
        }
        b1 b10 = this.b;
        if(b10 != null) {
            b10.i(arr_v, v);
        }
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int v) {
        if(ViewUtils.b) {
            this.getSuperCaller().setAutoSizeTextTypeWithDefaults(v);
            return;
        }
        b1 b10 = this.b;
        if(b10 != null) {
            b10.j(v);
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

    @Override  // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        b1 b10 = this.b;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        b1 b10 = this.b;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        Context context0 = this.getContext();
        Drawable drawable0 = null;
        Drawable drawable1 = v == 0 ? null : AppCompatResources.getDrawable(context0, v);
        Drawable drawable2 = v1 == 0 ? null : AppCompatResources.getDrawable(context0, v1);
        Drawable drawable3 = v2 == 0 ? null : AppCompatResources.getDrawable(context0, v2);
        if(v3 != 0) {
            drawable0 = AppCompatResources.getDrawable(context0, v3);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable1, drawable2, drawable3, drawable0);
        b1 b10 = this.b;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
        b1 b10 = this.b;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        Context context0 = this.getContext();
        Drawable drawable0 = null;
        Drawable drawable1 = v == 0 ? null : AppCompatResources.getDrawable(context0, v);
        Drawable drawable2 = v1 == 0 ? null : AppCompatResources.getDrawable(context0, v1);
        Drawable drawable3 = v2 == 0 ? null : AppCompatResources.getDrawable(context0, v2);
        if(v3 != 0) {
            drawable0 = AppCompatResources.getDrawable(context0, v3);
        }
        this.setCompoundDrawablesWithIntrinsicBounds(drawable1, drawable2, drawable3, drawable0);
        b1 b10 = this.b;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
        b1 b10 = this.b;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, actionMode$Callback0));
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().c(z);
    }

    @Override  // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] arr_inputFilter) {
        super.setFilters(this.getEmojiTextViewHelper().b.getFilters(arr_inputFilter));
    }

    @Override  // android.widget.TextView
    public void setFirstBaselineToTopHeight(@IntRange(from = 0L) @Px int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.getSuperCaller().setFirstBaselineToTopHeight(v);
            return;
        }
        TextViewCompat.setFirstBaselineToTopHeight(this, v);
    }

    @Override  // android.widget.TextView
    public void setLastBaselineToBottomHeight(@IntRange(from = 0L) @Px int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.getSuperCaller().setLastBaselineToBottomHeight(v);
            return;
        }
        TextViewCompat.setLastBaselineToBottomHeight(this, v);
    }

    @Override  // android.widget.TextView
    public void setLineHeight(@IntRange(from = 0L) @Px int v) {
        TextViewCompat.setLineHeight(this, v);
    }

    public void setPrecomputedText(@NonNull PrecomputedTextCompat precomputedTextCompat0) {
        TextViewCompat.setPrecomputedText(this, precomputedTextCompat0);
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

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList0) {
        this.b.k(colorStateList0);
        this.b.b();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.b.l(porterDuff$Mode0);
        this.b.b();
    }

    @Override  // android.widget.TextView
    public void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        b1 b10 = this.b;
        if(b10 != null) {
            b10.g(context0, v);
        }
    }

    @Override  // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier0) {
        if(Build.VERSION.SDK_INT < 28) {
            u0 u00 = this.c;
            if(u00 != null) {
                u00.b = textClassifier0;
                return;
            }
        }
        this.getSuperCaller().setTextClassifier(textClassifier0);
    }

    public void setTextFuture(@Nullable Future future0) {
        this.g = future0;
        if(future0 != null) {
            this.requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull Params precomputedTextCompat$Params0) {
        TextViewCompat.setTextMetricsParams(this, precomputedTextCompat$Params0);
    }

    @Override  // android.widget.TextView
    public void setTextSize(int v, float f) {
        if(ViewUtils.b) {
            super.setTextSize(v, f);
            return;
        }
        b1 b10 = this.b;
        if(b10 != null) {
            k1 k10 = b10.i;
            if(!k10.f()) {
                k10.g(f, v);
            }
        }
    }

    @Override  // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface0, int v) {
        if(this.e) {
            return;
        }
        Typeface typeface1 = typeface0 == null || v <= 0 ? null : TypefaceCompat.create(this.getContext(), typeface0, v);
        this.e = true;
        if(typeface1 != null) {
            typeface0 = typeface1;
        }
        try {
            super.setTypeface(typeface0, v);
            this.e = false;
        }
        catch(Throwable throwable0) {
            this.e = false;
            throw throwable0;
        }
    }
}

