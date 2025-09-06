package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.InvocationTargetException;

public class FragmentFactory {
    public static final SimpleArrayMap a;

    static {
        FragmentFactory.a = new SimpleArrayMap();
    }

    public static Class a(ClassLoader classLoader0, String s) {
        SimpleArrayMap simpleArrayMap0 = FragmentFactory.a;
        SimpleArrayMap simpleArrayMap1 = (SimpleArrayMap)simpleArrayMap0.get(classLoader0);
        if(simpleArrayMap1 == null) {
            simpleArrayMap1 = new SimpleArrayMap();
            simpleArrayMap0.put(classLoader0, simpleArrayMap1);
        }
        Class class0 = (Class)simpleArrayMap1.get(s);
        if(class0 == null) {
            class0 = Class.forName(s, false, classLoader0);
            simpleArrayMap1.put(s, class0);
        }
        return class0;
    }

    @NonNull
    public Fragment instantiate(@NonNull ClassLoader classLoader0, @NonNull String s) {
        try {
            return (Fragment)FragmentFactory.loadFragmentClass(classLoader0, s).getConstructor(null).newInstance(null);
        }
        catch(InstantiationException instantiationException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", illegalAccessException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": could not find Fragment constructor", noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": calling Fragment constructor caused an exception", invocationTargetException0);
        }
    }

    @NonNull
    public static Class loadFragmentClass(@NonNull ClassLoader classLoader0, @NonNull String s) {
        try {
            return FragmentFactory.a(classLoader0, s);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists", classNotFoundException0);
        }
        catch(ClassCastException classCastException0) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + s + ": make sure class is a valid subclass of Fragment", classCastException0);
        }
    }
}

