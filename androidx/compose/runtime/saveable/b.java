package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class b implements SaveableStateRegistry {
    public final Function1 a;
    public final Map b;
    public final LinkedHashMap c;

    public b(Map map0, Function1 function10) {
        Map map1;
        this.a = function10;
        if(map0 == null) {
            map1 = new LinkedHashMap();
        }
        else {
            map1 = x.toMutableMap(map0);
            if(map1 == null) {
                map1 = new LinkedHashMap();
            }
        }
        this.b = map1;
        this.c = new LinkedHashMap();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(Object object0) {
        return ((Boolean)this.a.invoke(object0)).booleanValue();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object consumeRestored(String s) {
        Map map0 = this.b;
        List list0 = (List)map0.remove(s);
        if(list0 != null && !list0.isEmpty()) {
            if(list0.size() > 1) {
                map0.put(s, list0.subList(1, list0.size()));
            }
            return list0.get(0);
        }
        return null;
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map performSave() {
        Map map0 = x.toMutableMap(this.b);
        for(Object object0: this.c.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            List list0 = (List)((Map.Entry)object0).getValue();
            if(list0.size() == 1) {
                Object object1 = ((Function0)list0.get(0)).invoke();
                if(object1 == null) {
                    continue;
                }
                if(!this.canBeSaved(object1)) {
                    throw new IllegalStateException((object1 + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().").toString());
                }
                map0.put(s, CollectionsKt__CollectionsKt.arrayListOf(new Object[]{object1}));
            }
            else {
                int v1 = list0.size();
                ArrayList arrayList0 = new ArrayList(v1);
                for(int v = 0; v < v1; ++v) {
                    Object object2 = ((Function0)list0.get(v)).invoke();
                    if(object2 != null && !this.canBeSaved(object2)) {
                        throw new IllegalStateException((object2 + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().").toString());
                    }
                    arrayList0.add(object2);
                }
                map0.put(s, arrayList0);
            }
        }
        return map0;
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Entry registerProvider(String s, Function0 function00) {
        if(SaveableStateRegistryKt.access$fastIsBlank(s)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        LinkedHashMap linkedHashMap0 = this.c;
        ArrayList arrayList0 = linkedHashMap0.get(s);
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            linkedHashMap0.put(s, arrayList0);
        }
        arrayList0.add(function00);
        return new SaveableStateRegistryImpl.registerProvider.3(this, s, function00);
    }
}

