package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.provider.FontsContractCompat.FontInfo;
import androidx.core.provider.FontsContractCompat.FontRequestCallback;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;

public class TypefaceCompat {
    @RestrictTo({Scope.LIBRARY})
    public static class ResourcesCallbackAdapter extends FontRequestCallback {
        public final FontCallback a;

        public ResourcesCallbackAdapter(@Nullable FontCallback resourcesCompat$FontCallback0) {
            this.a = resourcesCompat$FontCallback0;
        }

        @Override  // androidx.core.provider.FontsContractCompat$FontRequestCallback
        public void onTypefaceRequestFailed(int v) {
            FontCallback resourcesCompat$FontCallback0 = this.a;
            if(resourcesCompat$FontCallback0 != null) {
                resourcesCompat$FontCallback0.onFontRetrievalFailed(v);
            }
        }

        @Override  // androidx.core.provider.FontsContractCompat$FontRequestCallback
        public void onTypefaceRetrieved(@NonNull Typeface typeface0) {
            FontCallback resourcesCompat$FontCallback0 = this.a;
            if(resourcesCompat$FontCallback0 != null) {
                resourcesCompat$FontCallback0.onFontRetrieved(typeface0);
            }
        }
    }

    public static final m a;
    public static final LruCache b;

    static {
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            TypefaceCompat.a = new TypefaceCompatApi29Impl();
        }
        else if(v >= 28) {
            TypefaceCompat.a = new TypefaceCompatApi28Impl();
        }
        else {
            TypefaceCompat.a = new TypefaceCompatApi26Impl();
        }
        TypefaceCompat.b = new LruCache(16);
    }

    public static String a(Resources resources0, int v, String s, int v1, int v2) {
        return resources0.getResourcePackageName(v) + '-' + s + '-' + v1 + '-' + v + '-' + v2;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @VisibleForTesting
    public static void clearCache() {
        TypefaceCompat.b.evictAll();
    }

    @NonNull
    public static Typeface create(@NonNull Context context0, @Nullable Typeface typeface0, int v) {
        if(context0 == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        return Typeface.create(typeface0, v);
    }

    @NonNull
    public static Typeface create(@NonNull Context context0, @Nullable Typeface typeface0, @IntRange(from = 1L, to = 1000L) int v, boolean z) {
        if(context0 == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        Preconditions.checkArgumentInRange(v, 1, 1000, "weight");
        if(typeface0 == null) {
            typeface0 = Typeface.DEFAULT;
        }
        return TypefaceCompat.a.a(context0, typeface0, v, z);
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface createFromFontInfo(@NonNull Context context0, @Nullable CancellationSignal cancellationSignal0, @NonNull FontInfo[] arr_fontsContractCompat$FontInfo, int v) {
        return TypefaceCompat.a.createFromFontInfo(context0, cancellationSignal0, arr_fontsContractCompat$FontInfo, v);
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface createFromResourcesFamilyXml(@NonNull Context context0, @NonNull FamilyResourceEntry fontResourcesParserCompat$FamilyResourceEntry0, @NonNull Resources resources0, int v, int v1, @Nullable FontCallback resourcesCompat$FontCallback0, @Nullable Handler handler0, boolean z) {
        return TypefaceCompat.createFromResourcesFamilyXml(context0, fontResourcesParserCompat$FamilyResourceEntry0, resources0, v, null, 0, v1, resourcesCompat$FontCallback0, handler0, z);
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public static Typeface createFromResourcesFamilyXml(@NonNull Context context0, @NonNull FamilyResourceEntry fontResourcesParserCompat$FamilyResourceEntry0, @NonNull Resources resources0, int v, @Nullable String s, int v1, int v2, @Nullable FontCallback resourcesCompat$FontCallback0, @Nullable Handler handler0, boolean z) {
        Typeface typeface2;
        boolean z1;
        if(fontResourcesParserCompat$FamilyResourceEntry0 instanceof ProviderResourceEntry) {
            String s1 = ((ProviderResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0).getSystemFontFamilyName();
            Typeface typeface0 = null;
            if(s1 != null && !s1.isEmpty()) {
                Typeface typeface1 = Typeface.create(s1, 0);
                if(typeface1 != null && !typeface1.equals(Typeface.create(Typeface.DEFAULT, 0))) {
                    typeface0 = typeface1;
                }
            }
            if(typeface0 != null) {
                if(resourcesCompat$FontCallback0 != null) {
                    resourcesCompat$FontCallback0.callbackSuccessAsync(typeface0, handler0);
                }
                return typeface0;
            }
            if(!z) {
                z1 = resourcesCompat$FontCallback0 == null;
            }
            else if(((ProviderResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0).getFetchStrategy() == 0) {
                z1 = true;
            }
            else {
                z1 = false;
            }
            typeface2 = FontsContractCompat.requestFont(context0, ((ProviderResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0).getRequest(), v2, z1, (z ? ((ProviderResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0).getTimeout() : -1), FontCallback.getHandler(handler0), new ResourcesCallbackAdapter(resourcesCompat$FontCallback0));
        }
        else {
            typeface2 = TypefaceCompat.a.createFromFontFamilyFilesResourceEntry(context0, ((FontFamilyFilesResourceEntry)fontResourcesParserCompat$FamilyResourceEntry0), resources0, v2);
            if(resourcesCompat$FontCallback0 != null) {
                if(typeface2 == null) {
                    resourcesCompat$FontCallback0.callbackFailAsync(-3, handler0);
                }
                else {
                    resourcesCompat$FontCallback0.callbackSuccessAsync(typeface2, handler0);
                }
            }
        }
        if(typeface2 != null) {
            String s2 = TypefaceCompat.a(resources0, v, s, v1, v2);
            TypefaceCompat.b.put(s2, typeface2);
        }
        return typeface2;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface createFromResourcesFontFile(@NonNull Context context0, @NonNull Resources resources0, int v, String s, int v1) {
        return TypefaceCompat.createFromResourcesFontFile(context0, resources0, v, s, 0, v1);
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public static Typeface createFromResourcesFontFile(@NonNull Context context0, @NonNull Resources resources0, int v, String s, int v1, int v2) {
        Typeface typeface0 = TypefaceCompat.a.createFromResourcesFontFile(context0, resources0, v, s, v2);
        if(typeface0 != null) {
            String s1 = TypefaceCompat.a(resources0, v, s, v1, v2);
            TypefaceCompat.b.put(s1, typeface0);
        }
        return typeface0;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface findFromCache(@NonNull Resources resources0, int v, int v1) {
        return TypefaceCompat.findFromCache(resources0, v, null, 0, v1);
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public static Typeface findFromCache(@NonNull Resources resources0, int v, @Nullable String s, int v1, int v2) {
        String s1 = TypefaceCompat.a(resources0, v, s, v1, v2);
        return (Typeface)TypefaceCompat.b.get(s1);
    }
}

