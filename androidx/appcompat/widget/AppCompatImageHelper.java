package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class AppCompatImageHelper {
    public final ImageView a;
    public TintInfo b;
    public int c;

    public AppCompatImageHelper(@NonNull ImageView imageView0) {
        this.c = 0;
        this.a = imageView0;
    }

    public final void a() {
        ImageView imageView0 = this.a;
        Drawable drawable0 = imageView0.getDrawable();
        if(drawable0 != null) {
            DrawableUtils.a(drawable0);
        }
        if(drawable0 != null) {
            TintInfo tintInfo0 = this.b;
            if(tintInfo0 != null) {
                AppCompatDrawableManager.a(drawable0, tintInfo0, imageView0.getDrawableState());
            }
        }
    }

    public void loadFromAttributes(AttributeSet attributeSet0, int v) {
        ImageView imageView0 = this.a;
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(imageView0.getContext(), attributeSet0, styleable.AppCompatImageView, v, 0);
        Context context0 = this.a.getContext();
        ViewCompat.saveAttributeDataForStyleable(this.a, context0, styleable.AppCompatImageView, attributeSet0, tintTypedArray0.getWrappedTypeArray(), v, 0);
        try {
            Drawable drawable0 = imageView0.getDrawable();
            if(drawable0 == null) {
                int v2 = tintTypedArray0.getResourceId(styleable.AppCompatImageView_srcCompat, -1);
                if(v2 != -1) {
                    drawable0 = AppCompatResources.getDrawable(imageView0.getContext(), v2);
                    if(drawable0 != null) {
                        imageView0.setImageDrawable(drawable0);
                    }
                }
            }
            if(drawable0 != null) {
                DrawableUtils.a(drawable0);
            }
            if(tintTypedArray0.hasValue(styleable.AppCompatImageView_tint)) {
                ImageViewCompat.setImageTintList(imageView0, tintTypedArray0.getColorStateList(styleable.AppCompatImageView_tint));
            }
            if(tintTypedArray0.hasValue(styleable.AppCompatImageView_tintMode)) {
                ImageViewCompat.setImageTintMode(imageView0, DrawableUtils.parseTintMode(tintTypedArray0.getInt(styleable.AppCompatImageView_tintMode, -1), null));
            }
        }
        finally {
            tintTypedArray0.recycle();
        }
    }

    public void setImageResource(int v) {
        ImageView imageView0 = this.a;
        if(v == 0) {
            imageView0.setImageDrawable(null);
        }
        else {
            Drawable drawable0 = AppCompatResources.getDrawable(imageView0.getContext(), v);
            if(drawable0 != null) {
                DrawableUtils.a(drawable0);
            }
            imageView0.setImageDrawable(drawable0);
        }
        this.a();
    }
}

