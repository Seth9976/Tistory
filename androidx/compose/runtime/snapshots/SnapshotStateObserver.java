package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import d0.s;
import fg.c;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001!B0\u0012\'\u0010\b\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJA\u0010\u000F\u001A\u00020\u0004\"\b\b\u0000\u0010\u000B*\u00020\u00012\u0006\u0010\f\u001A\u00028\u00002\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u001D\u0010\u0011\u001A\u00020\u00042\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0017\u001A\u00020\u00042!\u0010\u0016\u001A\u001D\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00150\u0002¢\u0006\u0004\b\u0017\u0010\nJ\r\u0010\u0018\u001A\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001A\u001A\u00020\u0004¢\u0006\u0004\b\u001A\u0010\u0019J%\u0010\u001F\u001A\u00020\u00042\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00010\u001B2\u0006\u0010\u001E\u001A\u00020\u001DH\u0007¢\u0006\u0004\b\u001F\u0010 J\r\u0010\u0013\u001A\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0019¨\u0006\""}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "T", "scope", "onValueChangedForScope", "block", "observeReads", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "withNoObservations", "(Lkotlin/jvm/functions/Function0;)V", "clear", "(Ljava/lang/Object;)V", "", "predicate", "clearIf", "start", "()V", "stop", "", "changes", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "notifyChanges", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V", "androidx/compose/runtime/snapshots/d", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,654:1\n185#1,2:659\n187#1,2:672\n191#1,2:707\n193#1,2:724\n191#1,2:726\n193#1,2:743\n185#1,2:745\n187#1,2:758\n1208#2:655\n1187#2,2:656\n1#3:658\n460#4,11:661\n460#4,11:674\n838#4,15:685\n838#4,15:709\n838#4,15:728\n460#4,11:747\n366#4,12:760\n728#4,2:772\n33#5,7:700\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n69#1:659,2\n69#1:672,2\n292#1:707,2\n292#1:724,2\n303#1:726,2\n303#1:743,2\n336#1:745,2\n336#1:758,2\n177#1:655\n177#1:656,2\n69#1:661,11\n186#1:674,11\n192#1:685,15\n292#1:709,15\n303#1:728,15\n336#1:747,11\n349#1:760,12\n352#1:772,2\n242#1:700,7\n*E\n"})
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    public final Function1 a;
    public final AtomicReference b;
    public boolean c;
    public final b1 d;
    public final c e;
    public final MutableVector f;
    public ObserverHandle g;
    public boolean h;
    public d i;
    public long j;

    public SnapshotStateObserver(@NotNull Function1 function10) {
        this.a = function10;
        this.b = new AtomicReference(null);
        this.d = new b1(this, 10);
        this.e = new c(this, 7);
        this.f = new MutableVector(new d[16], 0);
        this.j = -1L;
    }

    public static final void access$addChanges(SnapshotStateObserver snapshotStateObserver0, Set set0) {
        Collection collection0;
        while(true) {
            AtomicReference atomicReference0 = snapshotStateObserver0.b;
            Object object0 = atomicReference0.get();
            if(object0 == null) {
                collection0 = set0;
            }
            else if(object0 instanceof Set) {
                collection0 = CollectionsKt__CollectionsKt.listOf(new Set[]{object0, set0});
            }
            else {
                if(!(object0 instanceof List)) {
                    break;
                }
                collection0 = CollectionsKt___CollectionsKt.plus(((Collection)object0), k.listOf(set0));
            }
            do {
                if(atomicReference0.compareAndSet(object0, collection0)) {
                    return;
                }
            }
            while(atomicReference0.get() == object0);
        }
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    public static final boolean access$drainChanges(SnapshotStateObserver snapshotStateObserver0) {
        Set set0;
        synchronized(snapshotStateObserver0.f) {
        }
        if(!snapshotStateObserver0.c) {
            boolean z = false;
            while(true) {
                AtomicReference atomicReference0 = snapshotStateObserver0.b;
                Object object0 = atomicReference0.get();
                Object object1 = null;
                if(object0 != null) {
                    if(object0 instanceof Set) {
                        set0 = (Set)object0;
                        goto label_19;
                    }
                    else {
                        if(object0 instanceof List) {
                            Set set1 = (Set)((List)object0).get(0);
                            if(((List)object0).size() == 2) {
                                object1 = ((List)object0).get(1);
                            }
                            else if(((List)object0).size() > 2) {
                                object1 = ((List)object0).subList(1, ((List)object0).size());
                            }
                            set0 = set1;
                            do {
                            label_19:
                                if(atomicReference0.compareAndSet(object0, object1)) {
                                    object1 = set0;
                                    goto label_26;
                                }
                            }
                            while(atomicReference0.get() == object0);
                            continue;
                        }
                        ComposerKt.composeRuntimeError("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                }
            label_26:
                if(object1 == null) {
                    return z;
                }
                synchronized(snapshotStateObserver0.f) {
                    MutableVector mutableVector1 = snapshotStateObserver0.f;
                    int v1 = mutableVector1.getSize();
                    if(v1 > 0) {
                        Object[] arr_object = mutableVector1.getContent();
                        for(int v2 = 0; true; ++v2) {
                            z = ((d)arr_object[v2]).b(((Set)object1)) || z;
                            if(v2 + 1 >= v1) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final void access$sendNotifications(SnapshotStateObserver snapshotStateObserver0) {
        snapshotStateObserver0.getClass();
        s s0 = new s(snapshotStateObserver0, 22);
        snapshotStateObserver0.a.invoke(s0);
    }

    public final void clear() {
        synchronized(this.f) {
            MutableVector mutableVector1 = this.f;
            int v1 = mutableVector1.getSize();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.getContent();
                int v2 = 0;
                while(true) {
                    d d0 = (d)arr_object[v2];
                    d0.e.clear();
                    d0.f.clear();
                    d0.k.clear();
                    d0.l.clear();
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                }
            }
        }
    }

    public final void clear(@NotNull Object object0) {
        int v7;
        synchronized(this.f) {
            MutableVector mutableVector1 = this.f;
            int v1 = mutableVector1.getSize();
            int v2 = 0;
            int v3 = 0;
            while(v2 < v1) {
                d d0 = (d)mutableVector1.getContent()[v2];
                MutableObjectIntMap mutableObjectIntMap0 = (MutableObjectIntMap)d0.f.remove(object0);
                if(mutableObjectIntMap0 == null) {
                    v7 = v2;
                }
                else {
                    Object[] arr_object = mutableObjectIntMap0.keys;
                    int[] arr_v = mutableObjectIntMap0.values;
                    long[] arr_v1 = mutableObjectIntMap0.metadata;
                    int v4 = arr_v1.length - 2;
                    if(v4 >= 0) {
                        int v5 = 0;
                        while(true) {
                            long v6 = arr_v1[v5];
                            v7 = v2;
                            if((~v6 << 7 & v6 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_32;
                            }
                            int v8 = 8 - (~(v5 - v4) >>> 0x1F);
                            for(int v9 = 0; v9 < v8; ++v9) {
                                if((v6 & 0xFFL) < 0x80L) {
                                    int v10 = (v5 << 3) + v9;
                                    Object object1 = arr_object[v10];
                                    int v11 = arr_v[v10];
                                    d0.d(object0, object1);
                                }
                                v6 >>= 8;
                            }
                            if(v8 == 8) {
                            label_32:
                                if(v5 != v4) {
                                    ++v5;
                                    v2 = v7;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                    else {
                        v7 = v2;
                    }
                }
                if(!d0.f.isNotEmpty()) {
                    ++v3;
                }
                else if(v3 > 0) {
                    mutableVector1.getContent()[v7 - v3] = mutableVector1.getContent()[v7];
                }
                v2 = v7 + 1;
            }
            int v12 = v1 - v3;
            ArraysKt___ArraysJvmKt.fill(mutableVector1.getContent(), null, v12, v1);
            mutableVector1.setSize(v12);
        }
    }

    public final void clearIf(@NotNull Function1 function10) {
        synchronized(this.f) {
            MutableVector mutableVector1 = this.f;
            int v1 = mutableVector1.getSize();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                d d0 = (d)mutableVector1.getContent()[v2];
                d0.e(function10);
                if(!d0.f.isNotEmpty()) {
                    ++v3;
                }
                else if(v3 > 0) {
                    mutableVector1.getContent()[v2 - v3] = mutableVector1.getContent()[v2];
                }
            }
            int v4 = v1 - v3;
            ArraysKt___ArraysJvmKt.fill(mutableVector1.getContent(), null, v4, v1);
            mutableVector1.setSize(v4);
        }
    }

    @TestOnly
    public final void notifyChanges(@NotNull Set set0, @NotNull Snapshot snapshot0) {
        this.d.invoke(set0, snapshot0);
    }

    public final void observeReads(@NotNull Object object0, @NotNull Function1 function10, @NotNull Function0 function00) {
        d d0;
        Object object2;
        synchronized(this.f) {
            MutableVector mutableVector1 = this.f;
            int v1 = mutableVector1.getSize();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.getContent();
                int v2 = 0;
                while(true) {
                    Object object1 = arr_object[v2];
                    if(((d)object1).a == function10) {
                        object2 = object1;
                        goto label_15;
                    }
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                }
            }
            object2 = null;
        label_15:
            d0 = (d)object2;
            if(d0 == null) {
                Intrinsics.checkNotNull(function10, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                d0 = new d(((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function10, 1)));
                mutableVector1.add(d0);
            }
        }
        boolean z = this.h;
        d d1 = this.i;
        long v3 = this.j;
        if(v3 != -1L && v3 != 0x47D9L) {
            PreconditionsKt.throwIllegalArgumentException(("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + v3 + "), currentThread={id=" + 0x47D9L + ", name=" + "jeb-dexdec-sb-st-501" + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."));
        }
        try {
            this.h = false;
            this.i = d0;
            this.j = Thread.currentThread().getId();
            d0.a(object0, this.e, function00);
            this.i = d1;
            this.h = z;
            this.j = v3;
        }
        catch(Throwable throwable0) {
            this.i = d1;
            this.h = z;
            this.j = v3;
            throw throwable0;
        }
    }

    public final void start() {
        this.g = Snapshot.Companion.registerApplyObserver(this.d);
    }

    public final void stop() {
        ObserverHandle observerHandle0 = this.g;
        if(observerHandle0 != null) {
            observerHandle0.dispose();
        }
    }

    @Deprecated(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(@NotNull Function0 function00) {
        boolean z;
        try {
            z = this.h;
            this.h = true;
            function00.invoke();
            this.h = z;
        }
        catch(Throwable throwable0) {
            this.h = z;
            throw throwable0;
        }
    }
}

