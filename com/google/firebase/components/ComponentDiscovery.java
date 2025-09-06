package com.google.firebase.components;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public final class ComponentDiscovery {
    @VisibleForTesting
    interface RegistrarNameRetriever {
        List retrieve(Object arg1);
    }

    public final Context a;
    public final c b;

    public ComponentDiscovery(Context context0, c c0) {
        this.a = context0;
        this.b = c0;
    }

    public static ComponentRegistrar a(String s) {
        try {
            Class class0 = Class.forName(s);
            if(!ComponentRegistrar.class.isAssignableFrom(class0)) {
                throw new InvalidRegistrarException("Class " + s + " is not an instance of com.google.firebase.components.ComponentRegistrar");
            }
            return (ComponentRegistrar)class0.getDeclaredConstructor(null).newInstance(null);
        }
        catch(ClassNotFoundException unused_ex) {
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new InvalidRegistrarException("Could not instantiate " + s + ".", illegalAccessException0);
        }
        catch(InstantiationException instantiationException0) {
            throw new InvalidRegistrarException("Could not instantiate " + s + ".", instantiationException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new InvalidRegistrarException("Could not instantiate " + s, noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new InvalidRegistrarException("Could not instantiate " + s, invocationTargetException0);
        }
        Log.w("ComponentDiscovery", "Class " + s + " is not an found.");
        return null;
    }

    @Deprecated
    public List discover() {
        List list0 = new ArrayList();
        for(Object object0: this.b.retrieve(this.a)) {
            String s = (String)object0;
            try {
                ComponentRegistrar componentRegistrar0 = ComponentDiscovery.a(s);
                if(componentRegistrar0 == null) {
                    continue;
                }
                ((ArrayList)list0).add(componentRegistrar0);
            }
            catch(InvalidRegistrarException invalidRegistrarException0) {
                Log.w("ComponentDiscovery", "Invalid component registrar.", invalidRegistrarException0);
            }
        }
        return list0;
    }

    public List discoverLazy() {
        List list0 = new ArrayList();
        for(Object object0: this.b.retrieve(this.a)) {
            ((ArrayList)list0).add(new b(((String)object0), 0));
        }
        return list0;
    }

    public static ComponentDiscovery forContext(Context context0, Class class0) {
        return new ComponentDiscovery(context0, new c(class0));
    }
}

