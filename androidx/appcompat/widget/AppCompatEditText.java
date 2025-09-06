package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode.Callback;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.appcompat.R.attr;
import androidx.core.view.ContentInfoCompat.Builder;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TextViewOnReceiveContentListener;
import androidx.core.widget.TintableCompoundDrawablesView;
import g.b;

public class AppCompatEditText extends EditText implements EmojiCompatConfigurationView, OnReceiveContentViewBehavior, TintableBackgroundView, TintableCompoundDrawablesView {
    @NonNull
    private final d0 mAppCompatEmojiEditTextHelper;
    private final y mBackgroundTintHelper;
    private final TextViewOnReceiveContentListener mDefaultOnReceiveContentListener;
    @Nullable
    private c0 mSuperCaller;
    private final u0 mTextClassifierHelper;
    private final b1 mTextHelper;

    public AppCompatEditText(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatEditText(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.editTextStyle);
    }

    public AppCompatEditText(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.wrap(context0), attributeSet0, v);
        ThemeUtils.checkAppCompatTheme(this, this.getContext());
        y y0 = new y(this);
        this.mBackgroundTintHelper = y0;
        y0.d(attributeSet0, v);
        b1 b10 = new b1(this);
        this.mTextHelper = b10;
        b10.f(attributeSet0, v);
        b10.b();
        this.mTextClassifierHelper = new u0(this);
        this.mDefaultOnReceiveContentListener = new TextViewOnReceiveContentListener();
        d0 d00 = new d0(this);
        this.mAppCompatEmojiEditTextHelper = d00;
        d00.b(attributeSet0, v);
        this.initEmojiKeyListener(d00);
    }

    @Override  // android.widget.TextView
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y y0 = this.mBackgroundTintHelper;
        if(y0 != null) {
            y0.a();
        }
        b1 b10 = this.mTextHelper;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @NonNull
    @RequiresApi(26)
    @UiThread
    private c0 getSuperCaller() {
        if(this.mSuperCaller == null) {
            this.mSuperCaller = new c0(this);
        }
        return this.mSuperCaller;
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        return this.mBackgroundTintHelper == null ? null : this.mBackgroundTintHelper.b();
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.mBackgroundTintHelper == null ? null : this.mBackgroundTintHelper.c();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override  // android.widget.EditText
    @Nullable
    public Editable getText() {
        return Build.VERSION.SDK_INT < 28 ? super.getEditableText() : super.getText();
    }

    @Override  // android.widget.EditText
    @Nullable
    public CharSequence getText() {
        return this.getText();
    }

    @Override  // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        if(Build.VERSION.SDK_INT < 28) {
            u0 u00 = this.mTextClassifierHelper;
            if(u00 != null) {
                return u00.b == null ? t0.a(u00.a) : u00.b;
            }
        }
        return this.getSuperCaller().a.super.getTextClassifier();
    }

    public void initEmojiKeyListener(d0 d00) {
        KeyListener keyListener0 = this.getKeyListener();
        d00.getClass();
        if(!(keyListener0 instanceof NumberKeyListener)) {
            boolean z = super.isFocusable();
            boolean z1 = super.isClickable();
            boolean z2 = super.isLongClickable();
            int v = super.getInputType();
            KeyListener keyListener1 = d00.a(keyListener0);
            if(keyListener1 == keyListener0) {
                return;
            }
            super.setKeyListener(keyListener1);
            super.setRawInputType(v);
            super.setFocusable(z);
            super.setClickable(z1);
            super.setLongClickable(z2);
        }
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.b.isEnabled();
    }

    @Override  // android.widget.TextView
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        this.mTextHelper.getClass();
        int v = Build.VERSION.SDK_INT;
        if(v < 30 && inputConnection0 != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo0, this.getText());
        }
        b.v(inputConnection0, editorInfo0, this);
        if(inputConnection0 != null && v <= 30) {
            String[] arr_s = ViewCompat.getOnReceiveContentMimeTypes(this);
            if(arr_s != null) {
                EditorInfoCompat.setContentMimeTypes(editorInfo0, arr_s);
                inputConnection0 = InputConnectionCompat.createWrapper(this, inputConnection0, editorInfo0);
            }
        }
        return this.mAppCompatEmojiEditTextHelper.b.onCreateInputConnection(inputConnection0, editorInfo0);
    }

    @Override  // android.widget.TextView
    public boolean onDragEvent(DragEvent dragEvent0) {
        Activity activity0;
        boolean z = false;
        if(Build.VERSION.SDK_INT < 0x1F && dragEvent0.getLocalState() == null && ViewCompat.getOnReceiveContentMimeTypes(this) != null) {
            for(Context context0 = this.getContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
                activity0 = null;
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                if(context0 instanceof Activity) {
                    activity0 = (Activity)context0;
                    break;
                }
            }
            if(activity0 == null) {
                Log.i("ReceiveContent", "Can\'t handle drop: no activity: view=" + this);
                return super.onDragEvent(dragEvent0);
            }
            if(dragEvent0.getAction() != 1 && dragEvent0.getAction() == 3) {
                z = g0.a(dragEvent0, this, activity0);
            }
        }
        return z ? true : super.onDragEvent(dragEvent0);
    }

    @Override  // androidx.core.view.OnReceiveContentViewBehavior
    @Nullable
    public ContentInfoCompat onReceiveContent(@NonNull ContentInfoCompat contentInfoCompat0) {
        return this.mDefaultOnReceiveContentListener.onReceiveContent(this, contentInfoCompat0);
    }

    @Override  // android.widget.EditText
    public boolean onTextContextMenuItem(int v) {
        if(Build.VERSION.SDK_INT < 0x1F && ViewCompat.getOnReceiveContentMimeTypes(this) != null && (v == 0x1020022 || v == 0x1020031)) {
            ClipboardManager clipboardManager0 = (ClipboardManager)this.getContext().getSystemService("clipboard");
            ClipData clipData0 = clipboardManager0 == null ? null : clipboardManager0.getPrimaryClip();
            if(clipData0 != null && clipData0.getItemCount() > 0) {
                ViewCompat.performReceiveContent(this, new Builder(clipData0, 1).setFlags((v == 0x1020022 ? 0 : 1)).build());
            }
            return true;
        }
        return super.onTextContextMenuItem(v);
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        y y0 = this.mBackgroundTintHelper;
        if(y0 != null) {
            y0.e();
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(@DrawableRes int v) {
        super.setBackgroundResource(v);
        y y0 = this.mBackgroundTintHelper;
        if(y0 != null) {
            y0.f(v);
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        b1 b10 = this.mTextHelper;
        if(b10 != null) {
            b10.b();
        }
    }

    @Override  // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        b1 b10 = this.mTextHelper;
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
        this.mAppCompatEmojiEditTextHelper.b.setEnabled(z);
    }

    @Override  // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener0) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener0));
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        y y0 = this.mBackgroundTintHelper;
        if(y0 != null) {
            y0.h(colorStateList0);
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        y y0 = this.mBackgroundTintHelper;
        if(y0 != null) {
            y0.i(porterDuff$Mode0);
        }
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList0) {
        this.mTextHelper.k(colorStateList0);
        this.mTextHelper.b();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.mTextHelper.l(porterDuff$Mode0);
        this.mTextHelper.b();
    }

    @Override  // android.widget.TextView
    public void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        b1 b10 = this.mTextHelper;
        if(b10 != null) {
            b10.g(context0, v);
        }
    }

    @Override  // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier0) {
        if(Build.VERSION.SDK_INT < 28) {
            u0 u00 = this.mTextClassifierHelper;
            if(u00 != null) {
                u00.b = textClassifier0;
                return;
            }
        }
        this.getSuperCaller().a.super.setTextClassifier(textClassifier0);
    }
}

