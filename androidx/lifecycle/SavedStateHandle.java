package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.activity.c;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.g0;
import kotlin.collections.x;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000B\u0018\u0000 \'2\u00020\u0001:\u0002\'(B\u001F\b\u0016\u0012\u0014\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000EJ#\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000F2\u0006\u0010\u000B\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000F2\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010\u0013\u001A\u00028\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0014J+\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u000F2\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010\u0013\u001A\u00028\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001AJ \u0010\u001B\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000F2\u0006\u0010\u000B\u001A\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u001B\u0010\u001CJ(\u0010\u001F\u001A\u00020\u001E\"\u0004\b\u0000\u0010\u000F2\u0006\u0010\u000B\u001A\u00020\u00032\b\u0010\u001D\u001A\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u001F\u0010 J\u001F\u0010!\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000F2\u0006\u0010\u000B\u001A\u00020\u0003H\u0007¢\u0006\u0004\b!\u0010\u001CJ\u001F\u0010#\u001A\u00020\u001E2\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010\"\u001A\u00020\bH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001A\u00020\u001E2\u0006\u0010\u000B\u001A\u00020\u0003H\u0007¢\u0006\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProvider", "()Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "key", "", "contains", "(Ljava/lang/String;)Z", "T", "Landroidx/lifecycle/MutableLiveData;", "getLiveData", "(Ljava/lang/String;)Landroidx/lifecycle/MutableLiveData;", "initialValue", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "Lkotlinx/coroutines/flow/StateFlow;", "getStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "", "keys", "()Ljava/util/Set;", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "provider", "setSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "clearSavedStateProvider", "(Ljava/lang/String;)V", "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n361#2,3:490\n364#2,4:494\n1#3:493\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n227#1:490,3\n227#1:494,4\n*E\n"})
public final class SavedStateHandle {
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J#\u0010\u0006\u001A\u00020\u00052\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000BR$\u0010\u000E\u001A\u0012\u0012\u000E\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0011\u001A\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001A\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "Landroid/os/Bundle;", "restoredState", "defaultState", "Landroidx/lifecycle/SavedStateHandle;", "createHandle", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandle;", "value", "", "validateValue", "(Ljava/lang/Object;)Z", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        @NotNull
        public final SavedStateHandle createHandle(@Nullable Bundle bundle0, @Nullable Bundle bundle1) {
            if(bundle0 == null) {
                if(bundle1 == null) {
                    return new SavedStateHandle();
                }
                HashMap hashMap0 = new HashMap();
                for(Object object0: bundle1.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(((String)object0), "key");
                    hashMap0.put(((String)object0), bundle1.get(((String)object0)));
                }
                return new SavedStateHandle(hashMap0);
            }
            ClassLoader classLoader0 = SavedStateHandle.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader0);
            bundle0.setClassLoader(classLoader0);
            ArrayList arrayList0 = bundle0.getParcelableArrayList("keys");
            ArrayList arrayList1 = bundle0.getParcelableArrayList("values");
            if(arrayList0 == null || arrayList1 == null || arrayList0.size() != arrayList1.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Object object1 = arrayList0.get(v1);
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap0.put(((String)object1), arrayList1.get(v1));
            }
            return new SavedStateHandle(linkedHashMap0);
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public final boolean validateValue(@Nullable Object object0) {
            if(object0 == null) {
                return true;
            }
            Class[] arr_class = SavedStateHandle.f;
            for(int v = 0; v < arr_class.length; ++v) {
                Class class0 = arr_class[v];
                Intrinsics.checkNotNull(class0);
                if(class0.isInstance(object0)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001B\b\u0016\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "", "key", "value", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "", "setValue", "(Ljava/lang/Object;)V", "detach", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class SavingStateLiveData extends MutableLiveData {
        public final String o;
        public SavedStateHandle p;

        public SavingStateLiveData(@Nullable SavedStateHandle savedStateHandle0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "key");
            super();
            this.o = s;
            this.p = savedStateHandle0;
        }

        public SavingStateLiveData(@Nullable SavedStateHandle savedStateHandle0, @NotNull String s, Object object0) {
            Intrinsics.checkNotNullParameter(s, "key");
            super(object0);
            this.o = s;
            this.p = savedStateHandle0;
        }

        public final void detach() {
            this.p = null;
        }

        @Override  // androidx.lifecycle.MutableLiveData
        public void setValue(Object object0) {
            SavedStateHandle savedStateHandle0 = this.p;
            if(savedStateHandle0 != null) {
                savedStateHandle0.a.put(this.o, object0);
                MutableStateFlow mutableStateFlow0 = (MutableStateFlow)savedStateHandle0.d.get(this.o);
                if(mutableStateFlow0 != null) {
                    mutableStateFlow0.setValue(object0);
                }
            }
            super.setValue(object0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final SavedStateProvider e;
    public static final Class[] f;

    static {
        SavedStateHandle.Companion = new Companion(null);
        SavedStateHandle.f = new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    }

    public SavedStateHandle() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new c(this, 2);
    }

    public SavedStateHandle(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "initialState");
        super();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.a = linkedHashMap0;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new c(this, 2);
        linkedHashMap0.putAll(map0);
    }

    public static Bundle a(SavedStateHandle savedStateHandle0) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "this$0");
        for(Object object0: x.toMap(savedStateHandle0.b).entrySet()) {
            savedStateHandle0.set(((String)((Map.Entry)object0).getKey()), ((SavedStateProvider)((Map.Entry)object0).getValue()).saveState());
        }
        LinkedHashMap linkedHashMap0 = savedStateHandle0.a;
        Set set0 = linkedHashMap0.keySet();
        ArrayList arrayList0 = new ArrayList(set0.size());
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        for(Object object1: set0) {
            arrayList0.add(((String)object1));
            arrayList1.add(linkedHashMap0.get(((String)object1)));
        }
        return BundleKt.bundleOf(new Pair[]{TuplesKt.to("keys", arrayList0), TuplesKt.to("values", arrayList1)});
    }

    public final MutableLiveData b(String s, boolean z, Object object0) {
        MutableLiveData mutableLiveData1;
        LinkedHashMap linkedHashMap0 = this.c;
        Object object1 = linkedHashMap0.get(s);
        MutableLiveData mutableLiveData0 = object1 instanceof MutableLiveData ? ((MutableLiveData)object1) : null;
        if(mutableLiveData0 != null) {
            return mutableLiveData0;
        }
        LinkedHashMap linkedHashMap1 = this.a;
        if(linkedHashMap1.containsKey(s)) {
            mutableLiveData1 = new SavingStateLiveData(this, s, linkedHashMap1.get(s));
        }
        else if(z) {
            linkedHashMap1.put(s, object0);
            mutableLiveData1 = new SavingStateLiveData(this, s, object0);
        }
        else {
            mutableLiveData1 = new SavingStateLiveData(this, s);
        }
        linkedHashMap0.put(s, mutableLiveData1);
        return mutableLiveData1;
    }

    @MainThread
    public final void clearSavedStateProvider(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.b.remove(s);
    }

    @MainThread
    public final boolean contains(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        return this.a.containsKey(s);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmStatic
    @NotNull
    public static final SavedStateHandle createHandle(@Nullable Bundle bundle0, @Nullable Bundle bundle1) {
        return SavedStateHandle.Companion.createHandle(bundle0, bundle1);
    }

    @MainThread
    @Nullable
    public final Object get(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        try {
            return this.a.get(s);
        }
        catch(ClassCastException unused_ex) {
            this.remove(s);
            return null;
        }
    }

    @MainThread
    @NotNull
    public final MutableLiveData getLiveData(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        MutableLiveData mutableLiveData0 = this.b(s, false, null);
        Intrinsics.checkNotNull(mutableLiveData0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return mutableLiveData0;
    }

    @MainThread
    @NotNull
    public final MutableLiveData getLiveData(@NotNull String s, Object object0) {
        Intrinsics.checkNotNullParameter(s, "key");
        return this.b(s, true, object0);
    }

    @MainThread
    @NotNull
    public final StateFlow getStateFlow(@NotNull String s, Object object0) {
        Intrinsics.checkNotNullParameter(s, "key");
        LinkedHashMap linkedHashMap0 = this.d;
        MutableStateFlow mutableStateFlow0 = linkedHashMap0.get(s);
        if(mutableStateFlow0 == null) {
            LinkedHashMap linkedHashMap1 = this.a;
            if(!linkedHashMap1.containsKey(s)) {
                linkedHashMap1.put(s, object0);
            }
            mutableStateFlow0 = StateFlowKt.MutableStateFlow(linkedHashMap1.get(s));
            linkedHashMap0.put(s, mutableStateFlow0);
            linkedHashMap0.put(s, mutableStateFlow0);
        }
        StateFlow stateFlow0 = FlowKt.asStateFlow(mutableStateFlow0);
        Intrinsics.checkNotNull(stateFlow0, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return stateFlow0;
    }

    @MainThread
    @NotNull
    public final Set keys() {
        return g0.plus(g0.plus(this.a.keySet(), this.b.keySet()), this.c.keySet());
    }

    @MainThread
    @Nullable
    public final Object remove(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        Object object0 = this.a.remove(s);
        SavingStateLiveData savedStateHandle$SavingStateLiveData0 = (SavingStateLiveData)this.c.remove(s);
        if(savedStateHandle$SavingStateLiveData0 != null) {
            savedStateHandle$SavingStateLiveData0.detach();
        }
        this.d.remove(s);
        return object0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final SavedStateProvider savedStateProvider() {
        return this.e;
    }

    @MainThread
    public final void set(@NotNull String s, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(s, "key");
        if(SavedStateHandle.Companion.validateValue(object0)) {
            Object object1 = this.c.get(s);
            MutableLiveData mutableLiveData0 = object1 instanceof MutableLiveData ? ((MutableLiveData)object1) : null;
            if(mutableLiveData0 == null) {
                this.a.put(s, object0);
            }
            else {
                mutableLiveData0.setValue(object0);
            }
            MutableStateFlow mutableStateFlow0 = (MutableStateFlow)this.d.get(s);
            if(mutableStateFlow0 != null) {
                mutableStateFlow0.setValue(object0);
            }
            return;
        }
        Intrinsics.checkNotNull(object0);
        throw new IllegalArgumentException("Can\'t put value with type " + object0.getClass() + " into saved state");
    }

    @MainThread
    public final void setSavedStateProvider(@NotNull String s, @NotNull SavedStateProvider savedStateRegistry$SavedStateProvider0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(savedStateRegistry$SavedStateProvider0, "provider");
        this.b.put(s, savedStateRegistry$SavedStateProvider0);
    }
}

