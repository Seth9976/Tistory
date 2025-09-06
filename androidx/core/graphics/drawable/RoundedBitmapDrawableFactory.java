package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import f3.g;
import java.io.InputStream;

public final class RoundedBitmapDrawableFactory {
    @NonNull
    public static RoundedBitmapDrawable create(@NonNull Resources resources0, @Nullable Bitmap bitmap0) {
        return new g(resources0, bitmap0);  // 初始化器: Landroidx/core/graphics/drawable/RoundedBitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    }

    @NonNull
    public static RoundedBitmapDrawable create(@NonNull Resources resources0, @NonNull InputStream inputStream0) {
        RoundedBitmapDrawable roundedBitmapDrawable0 = RoundedBitmapDrawableFactory.create(resources0, BitmapFactory.decodeStream(inputStream0));
        if(roundedBitmapDrawable0.getBitmap() == null) {
            Log.w("RoundedBitmapDrawableFa", "RoundedBitmapDrawable cannot decode " + inputStream0);
        }
        return roundedBitmapDrawable0;
    }

    @NonNull
    public static RoundedBitmapDrawable create(@NonNull Resources resources0, @NonNull String s) {
        RoundedBitmapDrawable roundedBitmapDrawable0 = RoundedBitmapDrawableFactory.create(resources0, BitmapFactory.decodeFile(s));
        if(roundedBitmapDrawable0.getBitmap() == null) {
            Log.w("RoundedBitmapDrawableFa", "RoundedBitmapDrawable cannot decode " + s);
        }
        return roundedBitmapDrawable0;
    }
}

