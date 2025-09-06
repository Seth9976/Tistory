package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.util.List;

public class ResourceDrawableDecoder implements ResourceDecoder {
    public static final Option THEME;
    public final Context a;

    static {
        ResourceDrawableDecoder.THEME = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    }

    public ResourceDrawableDecoder(Context context0) {
        this.a = context0.getApplicationContext();
    }

    @Nullable
    public Resource decode(@NonNull Uri uri0, int v, int v1, @NonNull Options options0) {
        int v2;
        Context context1;
        String s = uri0.getAuthority();
        if(TextUtils.isEmpty(s)) {
            throw new IllegalStateException("Package name for " + uri0 + " is null or empty");
        }
        Context context0 = this.a;
        if(s.equals("net.daum.android.tistoryapp")) {
            context1 = context0;
        }
        else {
            try {
                context1 = context0.createPackageContext(s, 0);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                if(!s.contains("net.daum.android.tistoryapp")) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri0, packageManager$NameNotFoundException0);
                }
                context1 = context0;
            }
        }
        List list0 = uri0.getPathSegments();
        if(list0.size() == 2) {
            List list1 = uri0.getPathSegments();
            String s1 = uri0.getAuthority();
            String s2 = (String)list1.get(0);
            String s3 = (String)list1.get(1);
            v2 = context1.getResources().getIdentifier(s3, s2, s1);
            if(v2 == 0) {
                v2 = Resources.getSystem().getIdentifier(s3, s2, "android");
            }
            if(v2 == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri0);
            }
        }
        else {
            if(list0.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri0);
            }
            List list2 = uri0.getPathSegments();
            try {
                v2 = Integer.parseInt(((String)list2.get(0)));
            }
            catch(NumberFormatException numberFormatException0) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri0, numberFormatException0);
            }
        }
        Resources.Theme resources$Theme0 = ((String)Preconditions.checkNotNull(s)).equals("net.daum.android.tistoryapp") ? ((Resources.Theme)options0.get(ResourceDrawableDecoder.THEME)) : null;
        Drawable drawable0 = resources$Theme0 == null ? DrawableDecoderCompat.getDrawable(context0, context1, v2) : DrawableDecoderCompat.getDrawable(context0, v2, resources$Theme0);
        return drawable0 != null ? new d(drawable0) : null;  // 初始化器: Lcom/bumptech/glide/load/resource/drawable/DrawableResource;-><init>(Landroid/graphics/drawable/Drawable;)V
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((Uri)object0), v, v1, options0);
    }

    public boolean handles(@NonNull Uri uri0, @NonNull Options options0) {
        String s = uri0.getScheme();
        return s != null && s.equals("android.resource");
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((Uri)object0), options0);
    }
}

