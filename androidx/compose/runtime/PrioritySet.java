package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\rJ\r\u0010\u000F\u001A\u00020\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001A\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "", "", "list", "<init>", "(Ljava/util/List;)V", "value", "", "add", "(I)V", "", "isEmpty", "()Z", "isNotEmpty", "peek", "()I", "takeMax", "validateHeap", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,4151:1\n4551#2,7:4152\n61#3,7:4159\n61#3,7:4166\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n4092#1:4152,7\n4140#1:4159,7\n4141#1:4166,7\n*E\n"})
public final class PrioritySet {
    public static final int $stable = 8;
    public final List a;

    public PrioritySet() {
        this(null, 1, null);
    }

    public PrioritySet(@NotNull List list0) {
        this.a = list0;
    }

    public PrioritySet(List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            list0 = new ArrayList();
        }
        this(list0);
    }

    public final void add(int v) {
        List list0 = this.a;
        if(!list0.isEmpty() && (((Number)list0.get(0)).intValue() == v || ((Number)list0.get(list0.size() - 1)).intValue() == v)) {
            return;
        }
        int v1 = list0.size();
        list0.add(v);
        while(v1 > 0) {
            int v2 = (v1 + 1 >>> 1) - 1;
            int v3 = ((Number)list0.get(v2)).intValue();
            if(v <= v3) {
                break;
            }
            list0.set(v1, v3);
            v1 = v2;
        }
        list0.set(v1, v);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.a.isEmpty();
    }

    public final int peek() {
        return ((Number)CollectionsKt___CollectionsKt.first(this.a)).intValue();
    }

    public final int takeMax() {
        List list0 = this.a;
        if(list0.size() <= 0) {
            ComposerKt.composeImmediateRuntimeError("Set is empty");
        }
        int v = ((Number)list0.get(0)).intValue();
    label_4:
        while(!list0.isEmpty() && ((Number)list0.get(0)).intValue() == v) {
            list0.set(0, CollectionsKt___CollectionsKt.last(list0));
            list0.remove(list0.size() - 1);
            int v1 = list0.size();
            int v2 = list0.size();
            int v3 = 0;
            while(v3 < v2 >>> 1) {
                int v4 = ((Number)list0.get(v3)).intValue();
                int v5 = (v3 + 1) * 2;
                int v6 = v5 - 1;
                int v7 = ((Number)list0.get(v6)).intValue();
                if(v5 < v1) {
                    int v8 = ((Number)list0.get(v5)).intValue();
                    if(v8 > v7) {
                        if(v8 <= v4) {
                            continue label_4;
                        }
                        list0.set(v3, v8);
                        list0.set(v5, v4);
                        v3 = v5;
                        continue;
                    }
                }
                if(v7 > v4) {
                    list0.set(v3, v7);
                    list0.set(v6, v4);
                    v3 = v6;
                    continue;
                }
                continue label_4;
            }
        }
        return v;
    }

    public final void validateHeap() {
        List list0 = this.a;
        int v = list0.size();
        for(int v1 = 0; v1 < v / 2; ++v1) {
            int v2 = (v1 + 1) * 2;
            if(((Number)list0.get(v1)).intValue() < ((Number)list0.get(v2 - 1)).intValue()) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            if(v2 < v && ((Number)list0.get(v1)).intValue() < ((Number)list0.get(v2)).intValue()) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
        }
    }
}

