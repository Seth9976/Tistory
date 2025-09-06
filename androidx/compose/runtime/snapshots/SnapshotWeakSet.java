package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001A\u00020\u000B2\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\tH\u0086\b¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u0010\u001A\u00020\u0006H\u0001¢\u0006\u0004\b\u000E\u0010\u000FR\"\u0010\u0018\u001A\u00020\u00118\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001A\u00020\u00198\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR0\u0010)\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"0!8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", "T", "<init>", "()V", "value", "", "add", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "block", "", "removeIf", "(Lkotlin/jvm/functions/Function1;)V", "isValid$runtime_release", "()Z", "isValid", "", "a", "I", "getSize$runtime_release", "()I", "setSize$runtime_release", "(I)V", "size", "", "b", "[I", "getHashes$runtime_release", "()[I", "setHashes$runtime_release", "([I)V", "hashes", "", "Landroidx/compose/runtime/WeakReference;", "c", "[Landroidx/compose/runtime/WeakReference;", "getValues$runtime_release", "()[Landroidx/compose/runtime/WeakReference;", "setValues$runtime_release", "([Landroidx/compose/runtime/WeakReference;)V", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SnapshotWeakSet {
    public static final int $stable = 8;
    public int a;
    public int[] b;
    public WeakReference[] c;

    public SnapshotWeakSet() {
        this.b = new int[16];
        this.c = new WeakReference[16];
    }

    public final boolean add(@NotNull Object object0) {
        int v = this.a;
        int v1 = ActualJvm_jvmKt.identityHashCode(object0);
        int v2 = -1;
        if(v > 0) {
            int v3 = this.a - 1;
            int v4 = 0;
            while(v4 <= v3) {
                int v5 = v4 + v3 >>> 1;
                int v6 = this.b[v5];
                if(v6 < v1) {
                    v4 = v5 + 1;
                    continue;
                }
                if(v6 > v1) {
                    v3 = v5 - 1;
                    continue;
                }
                WeakReference weakReference0 = this.c[v5];
                if(object0 == (weakReference0 == null ? null : weakReference0.get())) {
                    v2 = v5;
                }
                else {
                    int v7 = v5 - 1;
                alab1:
                    while(true) {
                        if(-1 >= v7 || this.b[v7] != v1) {
                            int v8 = this.a;
                            for(v7 = v5 + 1; v7 < v8; ++v7) {
                                if(this.b[v7] != v1) {
                                    v7 = -(v7 + 1);
                                    break alab1;
                                }
                                WeakReference weakReference2 = this.c[v7];
                                if((weakReference2 == null ? null : weakReference2.get()) == object0) {
                                    break alab1;
                                }
                            }
                            v7 = -(this.a + 1);
                            break;
                        }
                        WeakReference weakReference1 = this.c[v7];
                        if((weakReference1 == null ? null : weakReference1.get()) == object0) {
                            break;
                        }
                        --v7;
                    }
                    v2 = v7;
                }
                goto label_40;
            }
            v2 = -(v4 + 1);
        label_40:
            if(v2 >= 0) {
                return false;
            }
        }
        WeakReference[] arr_weakReference = this.c;
        if(v == arr_weakReference.length) {
            WeakReference[] arr_weakReference1 = new WeakReference[arr_weakReference.length * 2];
            int[] arr_v = new int[arr_weakReference.length * 2];
            ArraysKt___ArraysJvmKt.copyInto(arr_weakReference, arr_weakReference1, -v2, -(v2 + 1), v);
            ArraysKt___ArraysJvmKt.copyInto$default(this.c, arr_weakReference1, 0, 0, -(v2 + 1), 6, null);
            ArraysKt___ArraysJvmKt.copyInto(this.b, arr_v, -v2, -(v2 + 1), v);
            ArraysKt___ArraysJvmKt.copyInto$default(this.b, arr_v, 0, 0, -(v2 + 1), 6, null);
            this.c = arr_weakReference1;
            this.b = arr_v;
        }
        else {
            ArraysKt___ArraysJvmKt.copyInto(arr_weakReference, arr_weakReference, -v2, -(v2 + 1), v);
            ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, -v2, -(v2 + 1), v);
        }
        WeakReference[] arr_weakReference2 = this.c;
        arr_weakReference2[-(v2 + 1)] = new WeakReference(object0);
        this.b[-(v2 + 1)] = v1;
        ++this.a;
        return true;
    }

    @NotNull
    public final int[] getHashes$runtime_release() {
        return this.b;
    }

    public final int getSize$runtime_release() {
        return this.a;
    }

    @NotNull
    public final WeakReference[] getValues$runtime_release() {
        return this.c;
    }

    @TestOnly
    public final boolean isValid$runtime_release() {
        int v = this.a;
        WeakReference[] arr_weakReference = this.c;
        int[] arr_v = this.b;
        if(v > arr_weakReference.length) {
            return false;
        }
        int v2 = 0;
        for(int v1 = 0x80000000; v2 < v; v1 = v3) {
            int v3 = arr_v[v2];
            if(v3 < v1) {
                return false;
            }
            WeakReference weakReference0 = arr_weakReference[v2];
            if(weakReference0 == null) {
                return false;
            }
            Object object0 = weakReference0.get();
            if(object0 != null && v3 != ActualJvm_jvmKt.identityHashCode(object0)) {
                return false;
            }
            ++v2;
        }
        while(v < arr_weakReference.length) {
            if(arr_v[v] != 0) {
                return false;
            }
            if(arr_weakReference[v] != null) {
                return false;
            }
            ++v;
        }
        return true;
    }

    public final void removeIf(@NotNull Function1 function10) {
        int v = this.getSize$runtime_release();
        int v2 = 0;
        for(int v1 = 0; true; ++v1) {
            Object object0 = null;
            if(v1 >= v) {
                break;
            }
            WeakReference weakReference0 = this.getValues$runtime_release()[v1];
            if(weakReference0 != null) {
                object0 = weakReference0.get();
            }
            if(object0 != null && !((Boolean)function10.invoke(object0)).booleanValue()) {
                if(v2 != v1) {
                    this.getValues$runtime_release()[v2] = weakReference0;
                    this.getHashes$runtime_release()[v2] = this.getHashes$runtime_release()[v1];
                }
                ++v2;
            }
        }
        for(int v3 = v2; v3 < v; ++v3) {
            this.getValues$runtime_release()[v3] = null;
            this.getHashes$runtime_release()[v3] = 0;
        }
        if(v2 != v) {
            this.setSize$runtime_release(v2);
        }
    }

    public final void setHashes$runtime_release(@NotNull int[] arr_v) {
        this.b = arr_v;
    }

    public final void setSize$runtime_release(int v) {
        this.a = v;
    }

    public final void setValues$runtime_release(@NotNull WeakReference[] arr_weakReference) {
        this.c = arr_weakReference;
    }
}

