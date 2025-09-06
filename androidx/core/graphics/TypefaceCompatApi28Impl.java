package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(28)
@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class TypefaceCompatApi28Impl extends TypefaceCompatApi26Impl {
    @Override  // androidx.core.graphics.TypefaceCompatApi26Impl
    public final Typeface a(Context context0, Typeface typeface0, int v, boolean z) {
        return Typeface.create(typeface0, v, z);
    }

    @Override  // androidx.core.graphics.TypefaceCompatApi26Impl
    public Typeface createFromFamiliesWithDefault(Object object0) {
        try {
            Object object1 = Array.newInstance(this.mFontFamily, 1);
            Array.set(object1, 0, object0);
            return (Typeface)this.mCreateFromFamiliesWithDefault.invoke(null, object1, "sans-serif", -1, -1);
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }

    @Override  // androidx.core.graphics.TypefaceCompatApi26Impl
    public Method obtainCreateFromFamiliesWithDefaultMethod(Class class0) throws NoSuchMethodException {
        Class[] arr_class = {Array.newInstance(class0, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE};
        Method method0 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", arr_class);
        method0.setAccessible(true);
        return method0;
    }
}

