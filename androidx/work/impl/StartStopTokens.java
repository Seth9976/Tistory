package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001B\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\t\u0010\rJ\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0007\u0010\u0013J\u0017\u0010\t\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/StartStopTokens;", "", "<init>", "()V", "Landroidx/work/impl/model/WorkGenerationalId;", "id", "Landroidx/work/impl/StartStopToken;", "tokenFor", "(Landroidx/work/impl/model/WorkGenerationalId;)Landroidx/work/impl/StartStopToken;", "remove", "", "workSpecId", "", "(Ljava/lang/String;)Ljava/util/List;", "", "contains", "(Landroidx/work/impl/model/WorkGenerationalId;)Z", "Landroidx/work/impl/model/WorkSpec;", "spec", "(Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/StartStopToken;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStartStopToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartStopToken.kt\nandroidx/work/impl/StartStopTokens\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n361#2,7:66\n467#2,7:73\n1855#3,2:80\n1#4:82\n*S KotlinDebug\n*F\n+ 1 StartStopToken.kt\nandroidx/work/impl/StartStopTokens\n*L\n40#1:66,7\n52#1:73,7\n53#1:80,2\n*E\n"})
public final class StartStopTokens {
    public final Object a;
    public final LinkedHashMap b;

    public StartStopTokens() {
        this.a = new Object();
        this.b = new LinkedHashMap();
    }

    public final boolean contains(@NotNull WorkGenerationalId workGenerationalId0) {
        Intrinsics.checkNotNullParameter(workGenerationalId0, "id");
        synchronized(this.a) {
            return this.b.containsKey(workGenerationalId0);
        }
    }

    @Nullable
    public final StartStopToken remove(@NotNull WorkGenerationalId workGenerationalId0) {
        Intrinsics.checkNotNullParameter(workGenerationalId0, "id");
        synchronized(this.a) {
            return (StartStopToken)this.b.remove(workGenerationalId0);
        }
    }

    @Nullable
    public final StartStopToken remove(@NotNull WorkSpec workSpec0) {
        Intrinsics.checkNotNullParameter(workSpec0, "spec");
        return this.remove(WorkSpecKt.generationalId(workSpec0));
    }

    @NotNull
    public final List remove(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "workSpecId");
        synchronized(this.a) {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object1: this.b.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(Intrinsics.areEqual(((WorkGenerationalId)map$Entry0.getKey()).getWorkSpecId(), s)) {
                    linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                }
            }
            for(Object object2: linkedHashMap0.keySet()) {
                this.b.remove(((WorkGenerationalId)object2));
            }
            return CollectionsKt___CollectionsKt.toList(linkedHashMap0.values());
        }
    }

    @NotNull
    public final StartStopToken tokenFor(@NotNull WorkGenerationalId workGenerationalId0) {
        Intrinsics.checkNotNullParameter(workGenerationalId0, "id");
        synchronized(this.a) {
            LinkedHashMap linkedHashMap0 = this.b;
            StartStopToken startStopToken0 = linkedHashMap0.get(workGenerationalId0);
            if(startStopToken0 == null) {
                startStopToken0 = new StartStopToken(workGenerationalId0);
                linkedHashMap0.put(workGenerationalId0, startStopToken0);
            }
            return startStopToken0;
        }
    }

    @NotNull
    public final StartStopToken tokenFor(@NotNull WorkSpec workSpec0) {
        Intrinsics.checkNotNullParameter(workSpec0, "spec");
        return this.tokenFor(WorkSpecKt.generationalId(workSpec0));
    }
}

