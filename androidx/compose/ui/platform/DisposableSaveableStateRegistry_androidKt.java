package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.activity.c;
import androidx.compose.material3.jf;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.ui.R.id;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000B"}, d2 = {"Landroid/view/View;", "view", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "DisposableSaveableStateRegistry", "(Landroid/view/View;Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "", "id", "savedStateRegistryOwner", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDisposableSaveableStateRegistry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,190:1\n1855#2,2:191\n215#3,2:193\n*S KotlinDebug\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n*L\n172#1:191,2\n181#1:193,2\n*E\n"})
public final class DisposableSaveableStateRegistry_androidKt {
    public static final Class[] a;

    static {
        DisposableSaveableStateRegistry_androidKt.a = new Class[]{Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    }

    @NotNull
    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(@NotNull View view0, @NotNull SavedStateRegistryOwner savedStateRegistryOwner0) {
        ViewParent viewParent0 = view0.getParent();
        Intrinsics.checkNotNull(viewParent0, "null cannot be cast to non-null type android.view.View");
        Object object0 = ((View)viewParent0).getTag(id.compose_view_saveable_id_tag);
        String s = object0 instanceof String ? ((String)object0) : null;
        if(s == null) {
            s = String.valueOf(((View)viewParent0).getId());
        }
        return DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(s, savedStateRegistryOwner0);
    }

    @NotNull
    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(@NotNull String s, @NotNull SavedStateRegistryOwner savedStateRegistryOwner0) {
        LinkedHashMap linkedHashMap0;
        SavedStateRegistry savedStateRegistry0 = savedStateRegistryOwner0.getSavedStateRegistry();
        Bundle bundle0 = savedStateRegistry0.consumeRestoredStateForKey("SaveableStateRegistry:" + s);
        if(bundle0 == null) {
            linkedHashMap0 = null;
        }
        else {
            linkedHashMap0 = new LinkedHashMap();
            for(Object object0: bundle0.keySet()) {
                ArrayList arrayList0 = bundle0.getParcelableArrayList(((String)object0));
                Intrinsics.checkNotNull(arrayList0, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                linkedHashMap0.put(((String)object0), arrayList0);
            }
        }
        SaveableStateRegistry saveableStateRegistry0 = SaveableStateRegistryKt.SaveableStateRegistry(linkedHashMap0, f.G);
        try {
            savedStateRegistry0.registerSavedStateProvider("SaveableStateRegistry:" + s, new c(saveableStateRegistry0, 1));
            return new DisposableSaveableStateRegistry(saveableStateRegistry0, new jf(true, savedStateRegistry0, "SaveableStateRegistry:" + s, 1));
        }
        catch(IllegalArgumentException unused_ex) {
            return new DisposableSaveableStateRegistry(saveableStateRegistry0, new jf(false, savedStateRegistry0, "SaveableStateRegistry:" + s, 1));
        }
    }

    public static final boolean a(Object object0) {
        if(object0 instanceof SnapshotMutableState) {
            if(((SnapshotMutableState)object0).getPolicy() != SnapshotStateKt.neverEqualPolicy() && ((SnapshotMutableState)object0).getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && ((SnapshotMutableState)object0).getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                return false;
            }
            Object object1 = ((SnapshotMutableState)object0).getValue();
            return object1 == null ? true : DisposableSaveableStateRegistry_androidKt.a(object1);
        }
        if(object0 instanceof Function && object0 instanceof Serializable) {
            return false;
        }
        Class[] arr_class = DisposableSaveableStateRegistry_androidKt.a;
        for(int v = 0; v < 7; ++v) {
            if(arr_class[v].isInstance(object0)) {
                return true;
            }
        }
        return false;
    }
}

