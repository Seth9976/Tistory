package com.bumptech.glide.load.model;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import java.util.List;

public final class ResourceUriLoader implements ModelLoader {
    public final Context a;
    public final ModelLoader b;

    public ResourceUriLoader(Context context0, ModelLoader modelLoader0) {
        this.a = context0.getApplicationContext();
        this.b = modelLoader0;
    }

    @Nullable
    public LoadData buildLoadData(@NonNull Uri uri0, int v, int v1, @NonNull Options options0) {
        List list0 = uri0.getPathSegments();
        ModelLoader modelLoader0 = this.b;
        if(list0.size() == 1) {
            try {
                int v2 = Integer.parseInt(((String)uri0.getPathSegments().get(0)));
                if(v2 != 0) {
                    return modelLoader0.buildLoadData(v2, v, v1, options0);
                }
                if(Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri0);
                    return null;
                }
                return null;
            }
            catch(NumberFormatException numberFormatException0) {
            }
            if(Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri0, numberFormatException0);
            }
            return null;
        }
        if(list0.size() == 2) {
            List list1 = uri0.getPathSegments();
            String s = (String)list1.get(0);
            String s1 = (String)list1.get(1);
            int v3 = this.a.getResources().getIdentifier(s1, s, "net.daum.android.tistoryapp");
            if(v3 == 0) {
                if(Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri0);
                    return null;
                }
                return null;
            }
            return modelLoader0.buildLoadData(v3, v, v1, options0);
        }
        if(Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri0);
        }
        return null;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    @Nullable
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((Uri)object0), v, v1, options0);
    }

    // 去混淆评级： 低(20)
    public boolean handles(@NonNull Uri uri0) {
        return "android.resource".equals(uri0.getScheme()) && "net.daum.android.tistoryapp".equals(uri0.getAuthority());
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((Uri)object0));
    }

    public static ModelLoaderFactory newAssetFileDescriptorFactory(Context context0) {
        return new y(context0, 0);
    }

    public static ModelLoaderFactory newStreamFactory(Context context0) {
        return new y(context0, 1);
    }
}

