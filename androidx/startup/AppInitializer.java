package androidx.startup;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class AppInitializer {
    public final HashMap a;
    public final HashSet b;
    public final Context c;
    public static volatile AppInitializer d;
    public static final Object e;

    static {
        AppInitializer.e = new Object();
    }

    public AppInitializer(Context context0) {
        this.c = context0.getApplicationContext();
        this.b = new HashSet();
        this.a = new HashMap();
    }

    public final void a(Bundle bundle0) {
        String s = this.c.getString(string.androidx_startup);
        if(bundle0 == null) {
            return;
        }
        else {
            try {
                HashSet hashSet0 = new HashSet();
                Iterator iterator0 = bundle0.keySet().iterator();
                while(true) {
                    boolean z = iterator0.hasNext();
                    HashSet hashSet1 = this.b;
                    if(!z) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    String s1 = (String)object0;
                    if(s.equals(bundle0.getString(s1, null))) {
                        Class class0 = Class.forName(s1);
                        if(Initializer.class.isAssignableFrom(class0)) {
                            hashSet1.add(class0);
                        }
                    }
                }
                for(Object object1: hashSet1) {
                    this.b(((Class)object1), hashSet0);
                }
                return;
            }
            catch(ClassNotFoundException classNotFoundException0) {
            }
        }
        throw new StartupException(classNotFoundException0);
    }

    public final Object b(Class class0, HashSet hashSet0) {
        Object object1;
        boolean z = !Trace.isEnabled();
        try {
            if(!z) {
                Trace.beginSection(class0.getSimpleName());
            }
            if(!hashSet0.contains(class0)) {
                HashMap hashMap0 = this.a;
                if(hashMap0.containsKey(class0)) {
                    object1 = hashMap0.get(class0);
                }
                else {
                    hashSet0.add(class0);
                    try {
                        Initializer initializer0 = (Initializer)class0.getDeclaredConstructor(null).newInstance(null);
                        List list0 = initializer0.dependencies();
                        if(!list0.isEmpty()) {
                            for(Object object0: list0) {
                                Class class1 = (Class)object0;
                                if(!hashMap0.containsKey(class1)) {
                                    this.b(class1, hashSet0);
                                }
                            }
                        }
                        object1 = initializer0.create(this.c);
                        hashSet0.remove(class0);
                        hashMap0.put(class0, object1);
                        return object1;
                    }
                    catch(Throwable throwable0) {
                    }
                    throw new StartupException(throwable0);
                }
                return object1;
            }
        }
        finally {
            Trace.endSection();
        }
        throw new IllegalStateException("Cannot initialize " + class0.getName() + ". Cycle detected.");
    }

    @NonNull
    public static AppInitializer getInstance(@NonNull Context context0) {
        if(AppInitializer.d == null) {
            Object object0 = AppInitializer.e;
            synchronized(object0) {
                if(AppInitializer.d == null) {
                    AppInitializer.d = new AppInitializer(context0);
                }
            }
        }
        return AppInitializer.d;
    }

    @NonNull
    public Object initializeComponent(@NonNull Class class0) {
        synchronized(AppInitializer.e) {
            Object object1 = this.a.get(class0);
            if(object1 == null) {
                object1 = this.b(class0, new HashSet());
            }
            return object1;
        }
    }

    public boolean isEagerlyInitialized(@NonNull Class class0) {
        return this.b.contains(class0);
    }
}

