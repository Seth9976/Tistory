package androidx.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:tint", method = "setImageTintList", type = ImageView.class), @BindingMethod(attribute = "android:tintMode", method = "setImageTintMode", type = ImageView.class)})
public class ImageViewBindingAdapter {
    @BindingAdapter({"android:src"})
    public static void setImageDrawable(ImageView imageView0, Drawable drawable0) {
        imageView0.setImageDrawable(drawable0);
    }

    @BindingAdapter({"android:src"})
    public static void setImageUri(ImageView imageView0, Uri uri0) {
        imageView0.setImageURI(uri0);
    }

    @BindingAdapter({"android:src"})
    public static void setImageUri(ImageView imageView0, String s) {
        if(s == null) {
            imageView0.setImageURI(null);
            return;
        }
        imageView0.setImageURI(Uri.parse(s));
    }
}

