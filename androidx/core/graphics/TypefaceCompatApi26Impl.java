package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface.Builder;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

@RequiresApi(26)
@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class TypefaceCompatApi26Impl extends l {
    protected final Method mAbortCreation;
    protected final Method mAddFontFromAssetManager;
    protected final Method mAddFontFromBuffer;
    protected final Method mCreateFromFamiliesWithDefault;
    protected final Class mFontFamily;
    protected final Constructor mFontFamilyCtor;
    protected final Method mFreeze;

    public TypefaceCompatApi26Impl() {
        Method method4;
        Method method3;
        Method method2;
        Method method1;
        Method method0;
        Constructor constructor0;
        Class class0;
        try {
            class0 = this.obtainFontFamily();
            constructor0 = this.obtainFontFamilyCtor(class0);
            method0 = this.obtainAddFontFromAssetManagerMethod(class0);
            method1 = this.obtainAddFontFromBufferMethod(class0);
            method2 = this.obtainFreezeMethod(class0);
            method3 = this.obtainAbortCreationMethod(class0);
            method4 = this.obtainCreateFromFamiliesWithDefaultMethod(class0);
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + classNotFoundException0.getClass().getName(), classNotFoundException0);
            class0 = null;
            constructor0 = null;
            method0 = null;
            method1 = null;
            method2 = null;
            method3 = null;
            method4 = null;
        }
        this.mFontFamily = class0;
        this.mFontFamilyCtor = constructor0;
        this.mAddFontFromAssetManager = method0;
        this.mAddFontFromBuffer = method1;
        this.mFreeze = method2;
        this.mAbortCreation = method3;
        this.mCreateFromFamiliesWithDefault = method4;
    }

    @Override  // androidx.core.graphics.l
    public Typeface a(Context context0, Typeface typeface0, int v, boolean z) {
        Typeface typeface1 = null;
        try {
            typeface1 = p.a(typeface0, v, z);
        }
        catch(RuntimeException unused_ex) {
        }
        return typeface1 == null ? super.a(context0, typeface0, v, z) : typeface1;
    }

    @Nullable
    public Typeface createFromFamiliesWithDefault(Object object0) {
        try {
            Object object1 = Array.newInstance(this.mFontFamily, 1);
            Array.set(object1, 0, object0);
            return (Typeface)this.mCreateFromFamiliesWithDefault.invoke(null, object1, -1, -1);
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    @Override  // androidx.core.graphics.l
    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context0, FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry0, Resources resources0, int v) {
        if(!this.h()) {
            return super.createFromFontFamilyFilesResourceEntry(context0, fontResourcesParserCompat$FontFamilyFilesResourceEntry0, resources0, v);
        }
        Object object0 = this.i();
        if(object0 == null) {
            return null;
        }
        FontFileResourceEntry[] arr_fontResourcesParserCompat$FontFileResourceEntry = fontResourcesParserCompat$FontFamilyFilesResourceEntry0.getEntries();
        for(int v1 = 0; v1 < arr_fontResourcesParserCompat$FontFileResourceEntry.length; ++v1) {
            FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry0 = arr_fontResourcesParserCompat$FontFileResourceEntry[v1];
            if(!this.f(context0, object0, fontResourcesParserCompat$FontFileResourceEntry0.getFileName(), fontResourcesParserCompat$FontFileResourceEntry0.getTtcIndex(), fontResourcesParserCompat$FontFileResourceEntry0.getWeight(), ((int)fontResourcesParserCompat$FontFileResourceEntry0.isItalic()), FontVariationAxis.fromFontVariationSettings(fontResourcesParserCompat$FontFileResourceEntry0.getVariationSettings()))) {
                this.e(object0);
                return null;
            }
        }
        return this.g(object0) ? this.createFromFamiliesWithDefault(object0) : null;
    }

    @Override  // androidx.core.graphics.m
    @Nullable
    public Typeface createFromFontInfo(Context context0, @Nullable CancellationSignal cancellationSignal0, @NonNull FontInfo[] arr_fontsContractCompat$FontInfo, int v) {
        boolean z1;
        if(arr_fontsContractCompat$FontInfo.length < 1) {
            return null;
        }
        if(!this.h()) {
            FontInfo fontsContractCompat$FontInfo0 = this.findBestInfo(arr_fontsContractCompat$FontInfo, v);
            ContentResolver contentResolver0 = context0.getContentResolver();
            try(ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(fontsContractCompat$FontInfo0.getUri(), "r", cancellationSignal0)) {
                if(parcelFileDescriptor0 != null) {
                    return new Typeface.Builder(parcelFileDescriptor0.getFileDescriptor()).setWeight(fontsContractCompat$FontInfo0.getWeight()).setItalic(fontsContractCompat$FontInfo0.isItalic()).build();
                }
            }
            catch(IOException unused_ex) {
            }
            return null;
        }
        Map map0 = TypefaceCompatUtil.readFontInfoIntoByteBuffer(context0, arr_fontsContractCompat$FontInfo, cancellationSignal0);
        Object object0 = this.i();
        if(object0 == null) {
            return null;
        }
        boolean z = false;
        for(int v1 = 0; v1 < arr_fontsContractCompat$FontInfo.length; ++v1) {
            FontInfo fontsContractCompat$FontInfo1 = arr_fontsContractCompat$FontInfo[v1];
            ByteBuffer byteBuffer0 = (ByteBuffer)map0.get(fontsContractCompat$FontInfo1.getUri());
            if(byteBuffer0 != null) {
                try {
                    z1 = ((Boolean)this.mAddFontFromBuffer.invoke(object0, byteBuffer0, fontsContractCompat$FontInfo1.getTtcIndex(), 0, fontsContractCompat$FontInfo1.getWeight(), ((int)fontsContractCompat$FontInfo1.isItalic()))).booleanValue();
                }
                catch(IllegalAccessException | InvocationTargetException unused_ex) {
                    z1 = false;
                }
                if(!z1) {
                    this.e(object0);
                    return null;
                }
                z = true;
            }
        }
        if(!z) {
            this.e(object0);
            return null;
        }
        if(!this.g(object0)) {
            return null;
        }
        Typeface typeface0 = this.createFromFamiliesWithDefault(object0);
        return typeface0 == null ? null : Typeface.create(typeface0, v);
    }

    @Override  // androidx.core.graphics.m
    @Nullable
    public Typeface createFromResourcesFontFile(Context context0, Resources resources0, int v, String s, int v1) {
        if(!this.h()) {
            return super.createFromResourcesFontFile(context0, resources0, v, s, v1);
        }
        Object object0 = this.i();
        if(object0 == null) {
            return null;
        }
        if(!this.f(context0, object0, s, 0, -1, -1, null)) {
            this.e(object0);
            return null;
        }
        return this.g(object0) ? this.createFromFamiliesWithDefault(object0) : null;
    }

    public final void e(Object object0) {
        try {
            this.mAbortCreation.invoke(object0, null);
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
        }
    }

    public final boolean f(Context context0, Object object0, String s, int v, int v1, int v2, FontVariationAxis[] arr_fontVariationAxis) {
        try {
            Object[] arr_object = {context0.getAssets(), s, 0, Boolean.FALSE, v, v1, v2, arr_fontVariationAxis};
            return ((Boolean)this.mAddFontFromAssetManager.invoke(object0, arr_object)).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    public final boolean g(Object object0) {
        try {
            return ((Boolean)this.mFreeze.invoke(object0, null)).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    public final boolean h() {
        if(this.mAddFontFromAssetManager == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.mAddFontFromAssetManager != null;
    }

    public final Object i() {
        try {
            return this.mFontFamilyCtor.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    public Method obtainAbortCreationMethod(Class class0) throws NoSuchMethodException {
        return class0.getMethod("abortCreation", null);
    }

    public Method obtainAddFontFromAssetManagerMethod(Class class0) throws NoSuchMethodException {
        return class0.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
    }

    public Method obtainAddFontFromBufferMethod(Class class0) throws NoSuchMethodException {
        return class0.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
    }

    public Method obtainCreateFromFamiliesWithDefaultMethod(Class class0) throws NoSuchMethodException {
        Class[] arr_class = {Array.newInstance(class0, 1).getClass(), Integer.TYPE, Integer.TYPE};
        Method method0 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", arr_class);
        method0.setAccessible(true);
        return method0;
    }

    public Class obtainFontFamily() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor obtainFontFamilyCtor(Class class0) throws NoSuchMethodException {
        return class0.getConstructor(null);
    }

    public Method obtainFreezeMethod(Class class0) throws NoSuchMethodException {
        return class0.getMethod("freeze", null);
    }
}

