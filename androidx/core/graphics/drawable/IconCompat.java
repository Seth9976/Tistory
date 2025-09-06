package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent.ShortcutIconResource;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.CustomVersionedParcelable;
import f3.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
    public Object a;
    public PorterDuff.Mode b;
    public static final PorterDuff.Mode c;
    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public byte[] mData;
    @RestrictTo({Scope.LIBRARY})
    public int mInt1;
    @RestrictTo({Scope.LIBRARY})
    public int mInt2;
    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public Parcelable mParcelable;
    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public String mString1;
    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public ColorStateList mTintList;
    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public String mTintModeStr;
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int mType;

    static {
        IconCompat.c = PorterDuff.Mode.SRC_IN;
    }

    @RestrictTo({Scope.LIBRARY})
    public IconCompat() {
        this.mType = -1;
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.b = IconCompat.c;
        this.mTintModeStr = null;
    }

    public IconCompat(int v) {
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.b = IconCompat.c;
        this.mTintModeStr = null;
        this.mType = v;
    }

    public static Bitmap a(Bitmap bitmap0, boolean z) {
        int v = (int)(((float)Math.min(bitmap0.getWidth(), bitmap0.getHeight())) * 0.666667f);
        Bitmap bitmap1 = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap1);
        Paint paint0 = new Paint(3);
        float f = 0.5f * ((float)v);
        if(z) {
            paint0.setColor(0);
            paint0.setShadowLayer(0.010417f * ((float)v), 0.0f, ((float)v) * 0.020833f, 0x3D000000);
            canvas0.drawCircle(f, f, 0.916667f * f, paint0);
            paint0.setShadowLayer(0.010417f * ((float)v), 0.0f, 0.0f, 0x1E000000);
            canvas0.drawCircle(f, f, 0.916667f * f, paint0);
            paint0.clearShadowLayer();
        }
        paint0.setColor(0xFF000000);
        BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix0 = new Matrix();
        matrix0.setTranslate(((float)(-(bitmap0.getWidth() - v))) / 2.0f, ((float)(-(bitmap0.getHeight() - v))) / 2.0f);
        bitmapShader0.setLocalMatrix(matrix0);
        paint0.setShader(bitmapShader0);
        canvas0.drawCircle(f, f, 0.916667f * f, paint0);
        canvas0.setBitmap(null);
        return bitmap1;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void addToShortcutIntent(@NonNull Intent intent0, @Nullable Drawable drawable0, @NonNull Context context0) {
        Bitmap bitmap0;
        this.checkResource(context0);
        switch(this.mType) {
            case 1: {
                bitmap0 = (Bitmap)this.a;
                if(drawable0 != null) {
                    bitmap0 = bitmap0.copy(bitmap0.getConfig(), true);
                }
                break;
            }
            case 2: {
                try {
                    Context context1 = context0.createPackageContext(this.getResPackage(), 0);
                    if(drawable0 == null) {
                        intent0.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context1, this.mInt1));
                        return;
                    }
                    Drawable drawable1 = ContextCompat.getDrawable(context1, this.mInt1);
                    if(drawable1.getIntrinsicWidth() <= 0 || drawable1.getIntrinsicHeight() <= 0) {
                        int v = ((ActivityManager)context1.getSystemService("activity")).getLauncherLargeIconSize();
                        bitmap0 = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
                    }
                    else {
                        bitmap0 = Bitmap.createBitmap(drawable1.getIntrinsicWidth(), drawable1.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    }
                    drawable1.setBounds(0, 0, bitmap0.getWidth(), bitmap0.getHeight());
                    drawable1.draw(new Canvas(bitmap0));
                    break;
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                }
                throw new IllegalArgumentException("Can\'t find package " + this.a, packageManager$NameNotFoundException0);
            }
            case 5: {
                bitmap0 = IconCompat.a(((Bitmap)this.a), true);
                break;
            }
            default: {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
        }
        if(drawable0 != null) {
            int v1 = bitmap0.getWidth();
            int v2 = bitmap0.getHeight();
            drawable0.setBounds(v1 / 2, v2 / 2, v1, v2);
            drawable0.draw(new Canvas(bitmap0));
        }
        intent0.putExtra("android.intent.extra.shortcut.ICON", bitmap0);
    }

    public static Resources b(Context context0, String s) {
        if("android".equals(s)) {
            return Resources.getSystem();
        }
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo(s, 0x2000);
            return applicationInfo0 == null ? null : packageManager0.getResourcesForApplication(applicationInfo0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.e("IconCompat", "Unable to find pkg=" + s + " for icon", packageManager$NameNotFoundException0);
            return null;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void checkResource(@NonNull Context context0) {
        if(this.mType == 2) {
            Object object0 = this.a;
            if(object0 == null || !((String)object0).contains(":")) {
                return;
            }
            String s = ((String)object0).split(":", -1)[1];
            String s1 = s.split("/", -1)[0];
            String s2 = s.split("/", -1)[1];
            String s3 = ((String)object0).split(":", -1)[0];
            if("0_resource_name_obfuscated".equals(s2)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String s4 = this.getResPackage();
            int v = IconCompat.b(context0, s4).getIdentifier(s2, s1, s3);
            if(this.mInt1 != v) {
                Log.i("IconCompat", "Id has changed for " + s4 + " " + ((String)object0));
                this.mInt1 = v;
            }
        }
    }

    @Nullable
    public static IconCompat createFromBundle(@NonNull Bundle bundle0) {
        int v = bundle0.getInt("type");
        IconCompat iconCompat0 = new IconCompat(v);
        iconCompat0.mInt1 = bundle0.getInt("int1");
        iconCompat0.mInt2 = bundle0.getInt("int2");
        iconCompat0.mString1 = bundle0.getString("string1");
        if(bundle0.containsKey("tint_list")) {
            iconCompat0.mTintList = (ColorStateList)bundle0.getParcelable("tint_list");
        }
        if(bundle0.containsKey("tint_mode")) {
            iconCompat0.b = PorterDuff.Mode.valueOf(bundle0.getString("tint_mode"));
        }
        switch(v) {
            case 3: {
                iconCompat0.a = bundle0.getByteArray("obj");
                return iconCompat0;
            }
            case -1: 
            case 1: 
            case 5: {
                iconCompat0.a = bundle0.getParcelable("obj");
                return iconCompat0;
            }
            case 2: 
            case 4: 
            case 6: {
                iconCompat0.a = bundle0.getString("obj");
                return iconCompat0;
            }
            default: {
                Log.w("IconCompat", "Unknown type " + v);
                return null;
            }
        }
    }

    @Nullable
    @RequiresApi(23)
    public static IconCompat createFromIcon(@NonNull Context context0, @NonNull Icon icon0) {
        Preconditions.checkNotNull(icon0);
        switch(c.d(icon0)) {
            case 2: {
                String s = c.c(icon0);
                try {
                    return IconCompat.createWithResource(IconCompat.b(context0, s), s, c.b(icon0));
                }
                catch(Resources.NotFoundException unused_ex) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
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

    @Nullable
    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat createFromIcon(@NonNull Icon icon0) {
        return c.a(icon0);
    }

    @Nullable
    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat createFromIconOrNullIfZeroResId(@NonNull Icon icon0) {
        return c.d(icon0) != 2 || c.b(icon0) != 0 ? c.a(icon0) : null;
    }

    @NonNull
    public static IconCompat createWithAdaptiveBitmap(@NonNull Bitmap bitmap0) {
        ObjectsCompat.requireNonNull(bitmap0);
        IconCompat iconCompat0 = new IconCompat(5);
        iconCompat0.a = bitmap0;
        return iconCompat0;
    }

    @NonNull
    public static IconCompat createWithAdaptiveBitmapContentUri(@NonNull Uri uri0) {
        ObjectsCompat.requireNonNull(uri0);
        return IconCompat.createWithAdaptiveBitmapContentUri(uri0.toString());
    }

    @NonNull
    public static IconCompat createWithAdaptiveBitmapContentUri(@NonNull String s) {
        ObjectsCompat.requireNonNull(s);
        IconCompat iconCompat0 = new IconCompat(6);
        iconCompat0.a = s;
        return iconCompat0;
    }

    @NonNull
    public static IconCompat createWithBitmap(@NonNull Bitmap bitmap0) {
        ObjectsCompat.requireNonNull(bitmap0);
        IconCompat iconCompat0 = new IconCompat(1);
        iconCompat0.a = bitmap0;
        return iconCompat0;
    }

    @NonNull
    public static IconCompat createWithContentUri(@NonNull Uri uri0) {
        ObjectsCompat.requireNonNull(uri0);
        return IconCompat.createWithContentUri(uri0.toString());
    }

    @NonNull
    public static IconCompat createWithContentUri(@NonNull String s) {
        ObjectsCompat.requireNonNull(s);
        IconCompat iconCompat0 = new IconCompat(4);
        iconCompat0.a = s;
        return iconCompat0;
    }

    @NonNull
    public static IconCompat createWithData(@NonNull byte[] arr_b, int v, int v1) {
        ObjectsCompat.requireNonNull(arr_b);
        IconCompat iconCompat0 = new IconCompat(3);
        iconCompat0.a = arr_b;
        iconCompat0.mInt1 = v;
        iconCompat0.mInt2 = v1;
        return iconCompat0;
    }

    @NonNull
    public static IconCompat createWithResource(@NonNull Context context0, @DrawableRes int v) {
        ObjectsCompat.requireNonNull(context0);
        return IconCompat.createWithResource(context0.getResources(), "net.daum.android.tistoryapp", v);
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat createWithResource(@Nullable Resources resources0, @NonNull String s, @DrawableRes int v) {
        ObjectsCompat.requireNonNull(s);
        if(v == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat0 = new IconCompat(2);
        iconCompat0.mInt1 = v;
        if(resources0 == null) {
            iconCompat0.a = s;
        }
        else {
            try {
                iconCompat0.a = resources0.getResourceName(v);
            }
            catch(Resources.NotFoundException unused_ex) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }
        iconCompat0.mString1 = s;
        return iconCompat0;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public Bitmap getBitmap() {
        int v = this.mType;
        if(v == -1) {
            return this.a instanceof Bitmap ? ((Bitmap)this.a) : null;
        }
        switch(v) {
            case 1: {
                return (Bitmap)this.a;
            }
            case 5: {
                return IconCompat.a(((Bitmap)this.a), true);
            }
            default: {
                throw new IllegalStateException("called getBitmap() on " + this);
            }
        }
    }

    @DrawableRes
    public int getResId() {
        int v = this.mType;
        if(v == -1) {
            return c.b(this.a);
        }
        if(v != 2) {
            throw new IllegalStateException("called getResId() on " + this);
        }
        return this.mInt1;
    }

    @NonNull
    public String getResPackage() {
        int v = this.mType;
        if(v == -1) {
            return c.c(this.a);
        }
        if(v != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return this.mString1 == null || TextUtils.isEmpty(this.mString1) ? ((String)this.a).split(":", -1)[0] : this.mString1;
    }

    public int getType() {
        return this.mType == -1 ? c.d(this.a) : this.mType;
    }

    @NonNull
    public Uri getUri() {
        int v = this.mType;
        if(v == -1) {
            return c.e(this.a);
        }
        if(v != 4 && v != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse(((String)this.a));
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public InputStream getUriInputStream(@NonNull Context context0) {
        Uri uri0 = this.getUri();
        String s = uri0.getScheme();
        if(!"content".equals(s) && !"file".equals(s)) {
            try {
                return new FileInputStream(new File(((String)this.a)));
            }
            catch(FileNotFoundException fileNotFoundException0) {
                Log.w("IconCompat", "Unable to load image from path: " + uri0, fileNotFoundException0);
                return null;
            }
        }
        try {
            return context0.getContentResolver().openInputStream(uri0);
        }
        catch(Exception exception0) {
            Log.w("IconCompat", "Unable to load image from URI: " + uri0, exception0);
            return null;
        }
    }

    @Nullable
    public Drawable loadDrawable(@NonNull Context context0) {
        this.checkResource(context0);
        return c.f(this.toIcon(context0), context0);
    }

    @Override  // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.b = PorterDuff.Mode.valueOf(this.mTintModeStr);
        switch(this.mType) {
            case -1: {
                Parcelable parcelable0 = this.mParcelable;
                if(parcelable0 == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.a = parcelable0;
                return;
            }
            case 3: {
                this.a = this.mData;
                return;
            }
            case 1: 
            case 5: {
                Parcelable parcelable1 = this.mParcelable;
                if(parcelable1 != null) {
                    this.a = parcelable1;
                    return;
                }
                this.a = this.mData;
                this.mType = 3;
                this.mInt1 = 0;
                this.mInt2 = this.mData.length;
                return;
            }
            case 2: 
            case 4: 
            case 6: {
                String s = new String(this.mData, Charset.forName("UTF-16"));
                this.a = s;
                if(this.mType == 2 && this.mString1 == null) {
                    this.mString1 = s.split(":", -1)[0];
                }
            }
        }
    }

    @Override  // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z) {
        this.mTintModeStr = this.b.name();
        switch(this.mType) {
            case -1: {
                if(z) {
                    throw new IllegalArgumentException("Can\'t serialize Icon created with IconCompat#createFromIcon");
                }
                this.mParcelable = (Parcelable)this.a;
                return;
            }
            case 2: {
                this.mData = ((String)this.a).getBytes(Charset.forName("UTF-16"));
                return;
            }
            case 3: {
                this.mData = (byte[])this.a;
                return;
            }
            case 1: 
            case 5: {
                if(z) {
                    Bitmap bitmap0 = (Bitmap)this.a;
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    bitmap0.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream0);
                    this.mData = byteArrayOutputStream0.toByteArray();
                    return;
                }
                this.mParcelable = (Parcelable)this.a;
                return;
            }
            case 4: 
            case 6: {
                this.mData = this.a.toString().getBytes(Charset.forName("UTF-16"));
            }
        }
    }

    @NonNull
    public IconCompat setTint(@ColorInt int v) {
        return this.setTintList(ColorStateList.valueOf(v));
    }

    @NonNull
    public IconCompat setTintList(@Nullable ColorStateList colorStateList0) {
        this.mTintList = colorStateList0;
        return this;
    }

    @NonNull
    public IconCompat setTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.b = porterDuff$Mode0;
        return this;
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle0 = new Bundle();
        switch(this.mType) {
            case -1: {
                bundle0.putParcelable("obj", ((Parcelable)this.a));
                break;
            }
            case 3: {
                bundle0.putByteArray("obj", ((byte[])this.a));
                break;
            }
            case 1: 
            case 5: {
                bundle0.putParcelable("obj", ((Bitmap)this.a));
                break;
            }
            case 2: 
            case 4: 
            case 6: {
                bundle0.putString("obj", ((String)this.a));
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        bundle0.putInt("type", this.mType);
        bundle0.putInt("int1", this.mInt1);
        bundle0.putInt("int2", this.mInt2);
        bundle0.putString("string1", this.mString1);
        ColorStateList colorStateList0 = this.mTintList;
        if(colorStateList0 != null) {
            bundle0.putParcelable("tint_list", colorStateList0);
        }
        PorterDuff.Mode porterDuff$Mode0 = this.b;
        if(porterDuff$Mode0 != IconCompat.c) {
            bundle0.putString("tint_mode", porterDuff$Mode0.name());
        }
        return bundle0;
    }

    @NonNull
    @RequiresApi(23)
    @Deprecated
    public Icon toIcon() {
        return this.toIcon(null);
    }

    @NonNull
    @RequiresApi(23)
    public Icon toIcon(@Nullable Context context0) {
        return c.g(this, context0);
    }

    @Override
    @NonNull
    public String toString() {
        String s;
        if(this.mType == -1) {
            return String.valueOf(this.a);
        }
        StringBuilder stringBuilder0 = new StringBuilder("Icon(typ=");
        switch(this.mType) {
            case 1: {
                s = "BITMAP";
                break;
            }
            case 2: {
                s = "RESOURCE";
                break;
            }
            case 3: {
                s = "DATA";
                break;
            }
            case 4: {
                s = "URI";
                break;
            }
            case 5: {
                s = "BITMAP_MASKABLE";
                break;
            }
            case 6: {
                s = "URI_MASKABLE";
                break;
            }
            default: {
                s = "UNKNOWN";
            }
        }
        stringBuilder0.append(s);
        switch(this.mType) {
            case 2: {
                stringBuilder0.append(" pkg=");
                stringBuilder0.append(this.mString1);
                stringBuilder0.append(" id=");
                stringBuilder0.append(String.format("0x%08x", this.getResId()));
                break;
            }
            case 3: {
                stringBuilder0.append(" len=");
                stringBuilder0.append(this.mInt1);
                if(this.mInt2 != 0) {
                    stringBuilder0.append(" off=");
                    stringBuilder0.append(this.mInt2);
                }
                break;
            }
            case 1: 
            case 5: {
                stringBuilder0.append(" size=");
                stringBuilder0.append(((Bitmap)this.a).getWidth());
                stringBuilder0.append("x");
                stringBuilder0.append(((Bitmap)this.a).getHeight());
                break;
            }
            case 4: 
            case 6: {
                stringBuilder0.append(" uri=");
                stringBuilder0.append(this.a);
            }
        }
        if(this.mTintList != null) {
            stringBuilder0.append(" tint=");
            stringBuilder0.append(this.mTintList);
        }
        if(this.b != IconCompat.c) {
            stringBuilder0.append(" mode=");
            stringBuilder0.append(this.b);
        }
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

