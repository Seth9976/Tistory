package z3;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences.Key;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public final class c extends SuspendLambda implements Function3 {
    public SharedPreferencesView o;
    public Preferences p;

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        c c0 = new c(3, ((Continuation)object2));  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        c0.o = (SharedPreferencesView)object0;
        c0.p = (Preferences)object1;
        return c0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        SharedPreferencesView sharedPreferencesView0 = this.o;
        Preferences preferences0 = this.p;
        Iterable iterable0 = preferences0.asMap().keySet();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object1: iterable0) {
            arrayList0.add(((Key)object1).getName());
        }
        Map map0 = sharedPreferencesView0.getAll();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object2: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object2;
            if(!arrayList0.contains(((String)map$Entry0.getKey()))) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        MutablePreferences mutablePreferences0 = preferences0.toMutablePreferences();
        for(Object object3: linkedHashMap0.entrySet()) {
            String s = (String)((Map.Entry)object3).getKey();
            Object object4 = ((Map.Entry)object3).getValue();
            if(object4 instanceof Boolean) {
                mutablePreferences0.set(PreferencesKeys.booleanKey(s), object4);
            }
            else if(object4 instanceof Float) {
                mutablePreferences0.set(PreferencesKeys.floatKey(s), object4);
            }
            else if(object4 instanceof Integer) {
                mutablePreferences0.set(PreferencesKeys.intKey(s), object4);
            }
            else if(object4 instanceof Long) {
                mutablePreferences0.set(PreferencesKeys.longKey(s), object4);
            }
            else if(object4 instanceof String) {
                mutablePreferences0.set(PreferencesKeys.stringKey(s), object4);
            }
            else if(object4 instanceof Set) {
                Key preferences$Key0 = PreferencesKeys.stringSetKey(s);
                Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                mutablePreferences0.set(preferences$Key0, ((Set)object4));
            }
        }
        return mutablePreferences0.toPreferences();
    }
}

