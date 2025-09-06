package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.ResourcesCompat;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class VectorEnabledTintResources extends h2 {
    public static final int MAX_SDK_WHERE_REQUIRED = 20;
    public final WeakReference b;
    public static boolean c = false;

    public VectorEnabledTintResources(@NonNull Context context0, @NonNull Resources resources0) {
        super(resources0);
        this.b = new WeakReference(context0);
    }

    @Override  // androidx.appcompat.widget.h2
    public XmlResourceParser getAnimation(int v) throws Resources.NotFoundException {
        return this.a.getAnimation(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public boolean getBoolean(int v) throws Resources.NotFoundException {
        return this.a.getBoolean(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public int getColor(int v) throws Resources.NotFoundException {
        return this.a.getColor(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public ColorStateList getColorStateList(int v) throws Resources.NotFoundException {
        return this.a.getColorStateList(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public Configuration getConfiguration() {
        return this.a.getConfiguration();
    }

    @Override  // androidx.appcompat.widget.h2
    public float getDimension(int v) throws Resources.NotFoundException {
        return this.a.getDimension(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public int getDimensionPixelOffset(int v) throws Resources.NotFoundException {
        return this.a.getDimensionPixelOffset(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public int getDimensionPixelSize(int v) throws Resources.NotFoundException {
        return this.a.getDimensionPixelSize(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public DisplayMetrics getDisplayMetrics() {
        return this.a.getDisplayMetrics();
    }

    @Override  // android.content.res.Resources
    public Drawable getDrawable(int v) throws Resources.NotFoundException {
        Context context0 = (Context)this.b.get();
        if(context0 != null) {
            ResourceManagerInternal resourceManagerInternal0 = ResourceManagerInternal.get();
            synchronized(resourceManagerInternal0) {
                Drawable drawable0 = this.a(v);
                return drawable0 != null ? resourceManagerInternal0.e(context0, v, false, drawable0) : null;
            }
        }
        return this.a(v);
    }

    @Override  // androidx.appcompat.widget.h2
    @RequiresApi(21)
    public Drawable getDrawable(int v, Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        return ResourcesCompat.getDrawable(this.a, v, resources$Theme0);
    }

    @Override  // androidx.appcompat.widget.h2
    @RequiresApi(15)
    public Drawable getDrawableForDensity(int v, int v1) throws Resources.NotFoundException {
        return super.getDrawableForDensity(v, v1);
    }

    @Override  // androidx.appcompat.widget.h2
    @RequiresApi(21)
    public Drawable getDrawableForDensity(int v, int v1, Resources.Theme resources$Theme0) {
        return ResourcesCompat.getDrawableForDensity(this.a, v, v1, resources$Theme0);
    }

    @Override  // androidx.appcompat.widget.h2
    public float getFraction(int v, int v1, int v2) {
        return this.a.getFraction(v, v1, v2);
    }

    @Override  // androidx.appcompat.widget.h2
    public int getIdentifier(String s, String s1, String s2) {
        return this.a.getIdentifier(s, s1, s2);
    }

    @Override  // androidx.appcompat.widget.h2
    public int[] getIntArray(int v) throws Resources.NotFoundException {
        return this.a.getIntArray(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public int getInteger(int v) throws Resources.NotFoundException {
        return this.a.getInteger(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public XmlResourceParser getLayout(int v) throws Resources.NotFoundException {
        return this.a.getLayout(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public Movie getMovie(int v) throws Resources.NotFoundException {
        return this.a.getMovie(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public String getQuantityString(int v, int v1) throws Resources.NotFoundException {
        return this.a.getQuantityString(v, v1);
    }

    @Override  // androidx.appcompat.widget.h2
    public String getQuantityString(int v, int v1, Object[] arr_object) throws Resources.NotFoundException {
        return this.a.getQuantityString(v, v1, arr_object);
    }

    @Override  // androidx.appcompat.widget.h2
    public CharSequence getQuantityText(int v, int v1) throws Resources.NotFoundException {
        return this.a.getQuantityText(v, v1);
    }

    @Override  // androidx.appcompat.widget.h2
    public String getResourceEntryName(int v) throws Resources.NotFoundException {
        return this.a.getResourceEntryName(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public String getResourceName(int v) throws Resources.NotFoundException {
        return this.a.getResourceName(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public String getResourcePackageName(int v) throws Resources.NotFoundException {
        return this.a.getResourcePackageName(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public String getResourceTypeName(int v) throws Resources.NotFoundException {
        return this.a.getResourceTypeName(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public String getString(int v) throws Resources.NotFoundException {
        return this.a.getString(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public String getString(int v, Object[] arr_object) throws Resources.NotFoundException {
        return this.a.getString(v, arr_object);
    }

    @Override  // androidx.appcompat.widget.h2
    public String[] getStringArray(int v) throws Resources.NotFoundException {
        return this.a.getStringArray(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public CharSequence getText(int v) throws Resources.NotFoundException {
        return this.a.getText(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public CharSequence getText(int v, CharSequence charSequence0) {
        return this.a.getText(v, charSequence0);
    }

    @Override  // androidx.appcompat.widget.h2
    public CharSequence[] getTextArray(int v) throws Resources.NotFoundException {
        return this.a.getTextArray(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public void getValue(int v, TypedValue typedValue0, boolean z) throws Resources.NotFoundException {
        super.getValue(v, typedValue0, z);
    }

    @Override  // androidx.appcompat.widget.h2
    public void getValue(String s, TypedValue typedValue0, boolean z) throws Resources.NotFoundException {
        super.getValue(s, typedValue0, z);
    }

    @Override  // androidx.appcompat.widget.h2
    @RequiresApi(15)
    public void getValueForDensity(int v, int v1, TypedValue typedValue0, boolean z) throws Resources.NotFoundException {
        super.getValueForDensity(v, v1, typedValue0, z);
    }

    @Override  // androidx.appcompat.widget.h2
    public XmlResourceParser getXml(int v) throws Resources.NotFoundException {
        return this.a.getXml(v);
    }

    public static boolean isCompatVectorFromResourcesEnabled() [...] // 潜在的解密器

    @Override  // androidx.appcompat.widget.h2
    public TypedArray obtainAttributes(AttributeSet attributeSet0, int[] arr_v) {
        return this.a.obtainAttributes(attributeSet0, arr_v);
    }

    @Override  // androidx.appcompat.widget.h2
    public TypedArray obtainTypedArray(int v) throws Resources.NotFoundException {
        return this.a.obtainTypedArray(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public InputStream openRawResource(int v) throws Resources.NotFoundException {
        return this.a.openRawResource(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public InputStream openRawResource(int v, TypedValue typedValue0) throws Resources.NotFoundException {
        return this.a.openRawResource(v, typedValue0);
    }

    @Override  // androidx.appcompat.widget.h2
    public AssetFileDescriptor openRawResourceFd(int v) throws Resources.NotFoundException {
        return this.a.openRawResourceFd(v);
    }

    @Override  // androidx.appcompat.widget.h2
    public void parseBundleExtra(String s, AttributeSet attributeSet0, Bundle bundle0) throws XmlPullParserException {
        super.parseBundleExtra(s, attributeSet0, bundle0);
    }

    @Override  // androidx.appcompat.widget.h2
    public void parseBundleExtras(XmlResourceParser xmlResourceParser0, Bundle bundle0) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser0, bundle0);
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        VectorEnabledTintResources.c = z;
    }

    public static boolean shouldBeUsed() [...] // 潜在的解密器

    @Override  // androidx.appcompat.widget.h2
    public void updateConfiguration(Configuration configuration0, DisplayMetrics displayMetrics0) {
        super.updateConfiguration(configuration0, displayMetrics0);
    }
}

