package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;

public class AppCompatImageButton extends ImageButton implements TintableBackgroundView, TintableImageSourceView {
    public final y a;
    public final AppCompatImageHelper b;
    public boolean c;

    public AppCompatImageButton(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatImageButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.imageButtonStyle);
    }

    public AppCompatImageButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.wrap(context0), attributeSet0, v);
        this.c = false;
        ThemeUtils.checkAppCompatTheme(this, this.getContext());
        y y0 = new y(this);
        this.a = y0;
        y0.d(attributeSet0, v);
        AppCompatImageHelper appCompatImageHelper0 = new AppCompatImageHelper(this);
        this.b = appCompatImageHelper0;
        appCompatImageHelper0.loadFromAttributes(attributeSet0, v);
    }

    @Override  // android.widget.ImageView
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y y0 = this.a;
        if(y0 != null) {
            y0.a();
        }
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.a();
        }
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

    @Override  // androidx.core.widget.TintableImageSourceView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null) {
            return appCompatImageHelper0.b == null ? null : appCompatImageHelper0.b.mTintList;
        }
        return null;
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null) {
            return appCompatImageHelper0.b == null ? null : appCompatImageHelper0.b.mTintMode;
        }
        return null;
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.ImageView
    public boolean hasOverlappingRendering() {
        return !(this.b.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
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

    @Override  // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap0) {
        super.setImageBitmap(bitmap0);
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.a();
        }
    }

    @Override  // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable0) {
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null && drawable0 != null && !this.c) {
            appCompatImageHelper0.c = drawable0.getLevel();
        }
        super.setImageDrawable(drawable0);
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.a();
            if(!this.c) {
                ImageView imageView0 = appCompatImageHelper0.a;
                if(imageView0.getDrawable() != null) {
                    imageView0.getDrawable().setLevel(appCompatImageHelper0.c);
                }
            }
        }
    }

    @Override  // android.widget.ImageView
    public void setImageLevel(int v) {
        super.setImageLevel(v);
        this.c = true;
    }

    @Override  // android.widget.ImageView
    public void setImageResource(@DrawableRes int v) {
        this.b.setImageResource(v);
    }

    @Override  // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri0) {
        super.setImageURI(uri0);
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.a();
        }
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

    @Override  // androidx.core.widget.TintableImageSourceView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList0) {
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null) {
            if(appCompatImageHelper0.b == null) {
                appCompatImageHelper0.b = new TintInfo();
            }
            appCompatImageHelper0.b.mTintList = colorStateList0;
            appCompatImageHelper0.b.mHasTintList = true;
            appCompatImageHelper0.a();
        }
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null) {
            if(appCompatImageHelper0.b == null) {
                appCompatImageHelper0.b = new TintInfo();
            }
            appCompatImageHelper0.b.mTintMode = porterDuff$Mode0;
            appCompatImageHelper0.b.mHasTintMode = true;
            appCompatImageHelper0.a();
        }
    }
}

