package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public final class c {
    public final HashMap a;
    public final HashMap b;

    public c(HashMap hashMap0) {
        this.b = hashMap0;
        this.a = new HashMap();
        for(Object object0: hashMap0.entrySet()) {
            Event lifecycle$Event0 = (Event)((Map.Entry)object0).getValue();
            List list0 = (List)this.a.get(lifecycle$Event0);
            if(list0 == null) {
                list0 = new ArrayList();
                this.a.put(lifecycle$Event0, list0);
            }
            list0.add(((d)((Map.Entry)object0).getKey()));
        }
    }

    public static void a(List list0, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0, Object object0) {
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                d d0 = (d)list0.get(v);
                d0.getClass();
                try {
                    int v1 = d0.a;
                    Method method0 = d0.b;
                    switch(v1) {
                        case 0: {
                            method0.invoke(object0, null);
                            continue;
                        }
                        case 1: {
                            method0.invoke(object0, lifecycleOwner0);
                            continue;
                        }
                        default: {
                            if(v1 == 2) {
                                method0.invoke(object0, lifecycleOwner0, lifecycle$Event0);
                            }
                            continue;
                        }
                    }
                }
                catch(InvocationTargetException invocationTargetException0) {
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new RuntimeException(illegalAccessException0);
                }
                throw new RuntimeException("Failed to call observer method", invocationTargetException0.getCause());
            }
        }
    }
}

