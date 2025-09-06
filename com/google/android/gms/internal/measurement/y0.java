package com.google.android.gms.internal.measurement;

import a5.b;
import androidx.room.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class y0 {
    public static final Logger a;
    public static final String b;

    static {
        y0.a = Logger.getLogger("com.google.android.gms.internal.measurement.zzjm");
        y0.b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
    }

    public static zzjr a() {
        Class class0 = y0.class;
        ClassLoader classLoader0 = class0.getClassLoader();
        Class class1 = zzjr.class;
        if(!class1.equals(class1)) {
            if(!class1.getPackage().equals(class0.getPackage())) {
                throw new IllegalArgumentException(class1.getName());
            }
            a.z(class1.getPackage().getName(), ".BlazeGeneratedzzjrLoader");
        }
        try {
            Class class2 = Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader0);
            try {
                b.z(class2.getConstructor(null).newInstance(null));
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                throw new IllegalStateException(noSuchMethodException0);
            }
            catch(InstantiationException instantiationException0) {
                throw new IllegalStateException(instantiationException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new IllegalStateException(illegalAccessException0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new IllegalStateException(invocationTargetException0);
            }
        }
        catch(ClassNotFoundException unused_ex) {
            Iterator iterator0 = ServiceLoader.load(class0, classLoader0).iterator();
            ArrayList arrayList0 = new ArrayList();
            while(true) {
                if(!iterator0.hasNext()) {
                    switch(arrayList0.size()) {
                        case 0: {
                            return null;
                        }
                        case 1: {
                            return (zzjr)arrayList0.get(0);
                        }
                        default: {
                            try {
                                return (zzjr)class1.getMethod("combine", Collection.class).invoke(null, arrayList0);
                            }
                            catch(NoSuchMethodException noSuchMethodException1) {
                                throw new IllegalStateException(noSuchMethodException1);
                            }
                            catch(IllegalAccessException illegalAccessException1) {
                                throw new IllegalStateException(illegalAccessException1);
                            }
                            catch(InvocationTargetException invocationTargetException1) {
                                throw new IllegalStateException(invocationTargetException1);
                            }
                        }
                    }
                }
                try {
                    Object object0 = iterator0.next();
                    if(object0 != null) {
                        throw new ClassCastException();
                    }
                    break;
                }
                catch(ServiceConfigurationError serviceConfigurationError0) {
                    y0.a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load zzjr", serviceConfigurationError0);
                }
            }
            throw null;
        }
        throw null;
    }
}

