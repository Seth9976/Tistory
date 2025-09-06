package f3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

public abstract class c {
    public static IconCompat a(Icon icon0) {
        Preconditions.checkNotNull(icon0);
        switch(c.d(icon0)) {
            case 2: {
                return IconCompat.createWithResource(null, c.c(icon0), c.b(icon0));
            }
            case 4: {
                return IconCompat.createWithContentUri(c.e(icon0));
            }
            case 6: {
                return IconCompat.createWithAdaptiveBitmapContentUri(c.e(icon0));
            }
            default: {
                IconCompat iconCompat0 = new IconCompat(-1);
                iconCompat0.a = icon0;
                return iconCompat0;
            }
        }
    }

    public static int b(Object object0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return e.a(object0);
        }
        try {
            return (int)(((Integer)object0.getClass().getMethod("getResId", null).invoke(object0, null)));
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("IconCompat", "Unable to get icon resource", illegalAccessException0);
            return 0;
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.e("IconCompat", "Unable to get icon resource", invocationTargetException0);
            return 0;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.e("IconCompat", "Unable to get icon resource", noSuchMethodException0);
            return 0;
        }
    }

    public static String c(Object object0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return e.b(object0);
        }
        try {
            return (String)object0.getClass().getMethod("getResPackage", null).invoke(object0, null);
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("IconCompat", "Unable to get icon package", illegalAccessException0);
            return null;
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.e("IconCompat", "Unable to get icon package", invocationTargetException0);
            return null;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.e("IconCompat", "Unable to get icon package", noSuchMethodException0);
            return null;
        }
    }

    public static int d(Object object0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return e.c(object0);
        }
        try {
            return (int)(((Integer)object0.getClass().getMethod("getType", null).invoke(object0, null)));
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("IconCompat", "Unable to get icon type " + object0, illegalAccessException0);
            return -1;
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.e("IconCompat", "Unable to get icon type " + object0, invocationTargetException0);
            return -1;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.e("IconCompat", "Unable to get icon type " + object0, noSuchMethodException0);
            return -1;
        }
    }

    @DoNotInline
    @Nullable
    public static Uri e(@NonNull Object object0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return e.d(object0);
        }
        try {
            return (Uri)object0.getClass().getMethod("getUri", null).invoke(object0, null);
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("IconCompat", "Unable to get icon uri", illegalAccessException0);
            return null;
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.e("IconCompat", "Unable to get icon uri", invocationTargetException0);
            return null;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.e("IconCompat", "Unable to get icon uri", noSuchMethodException0);
            return null;
        }
    }

    @DoNotInline
    public static Drawable f(Icon icon0, Context context0) {
        return icon0.loadDrawable(context0);
    }

    @DoNotInline
    public static Icon g(IconCompat iconCompat0, Context context0) {
        Icon icon0;
        switch(iconCompat0.mType) {
            case -1: {
                return (Icon)iconCompat0.a;
            }
            case 1: {
                icon0 = Icon.createWithBitmap(((Bitmap)iconCompat0.a));
                goto label_20;
            }
            case 2: {
                icon0 = Icon.createWithResource(iconCompat0.getResPackage(), iconCompat0.mInt1);
                goto label_20;
            }
            case 3: {
                icon0 = Icon.createWithData(((byte[])iconCompat0.a), iconCompat0.mInt1, iconCompat0.mInt2);
                goto label_20;
            }
            case 4: {
                icon0 = Icon.createWithContentUri(((String)iconCompat0.a));
                goto label_20;
            }
            case 5: {
                icon0 = d.b(((Bitmap)iconCompat0.a));
                goto label_20;
            }
            case 6: {
                if(Build.VERSION.SDK_INT >= 30) {
                    icon0 = f.a(iconCompat0.getUri());
                }
                else {
                    if(context0 == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat0.getUri());
                    }
                    InputStream inputStream0 = iconCompat0.getUriInputStream(context0);
                    if(inputStream0 == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat0.getUri());
                    }
                    icon0 = d.b(BitmapFactory.decodeStream(inputStream0));
                }
            label_20:
                ColorStateList colorStateList0 = iconCompat0.mTintList;
                if(colorStateList0 != null) {
                    icon0.setTintList(colorStateList0);
                }
                PorterDuff.Mode porterDuff$Mode0 = iconCompat0.b;
                if(porterDuff$Mode0 != IconCompat.c) {
                    icon0.setTintMode(porterDuff$Mode0);
                }
                return icon0;
            }
            default: {
                throw new IllegalArgumentException("Unknown type");
            }
        }
    }
}

