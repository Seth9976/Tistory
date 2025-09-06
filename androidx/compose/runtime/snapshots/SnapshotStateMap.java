package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0010\'\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0010\u001F\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001RB\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0019\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u00020\u00102\u0006\u0010\b\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u001A\u0010\u0014\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000F\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u0006J!\u0010\u001C\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010\b\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ%\u0010\u001F\u001A\u00020\t2\u0014\u0010\u001E\u001A\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u0019\u0010!\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b!\u0010\u0015J\u0017\u0010#\u001A\u00020\u00102\u0006\u0010\b\u001A\u00028\u0001H\u0000\u00A2\u0006\u0004\b\"\u0010\u0012J0\u0010)\u001A\u00020\u00102\u001E\u0010&\u001A\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%\u0012\u0004\u0012\u00020\u00100$H\u0080\b\u00A2\u0006\u0004\b\'\u0010(J0\u0010,\u001A\u00020\u00102\u001E\u0010&\u001A\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\u0012\u0004\u0012\u00020\u00100$H\u0080\b\u00A2\u0006\u0004\b+\u0010(J0\u0010.\u001A\u00020\u00102\u001E\u0010&\u001A\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\u0012\u0004\u0012\u00020\u00100$H\u0080\b\u00A2\u0006\u0004\b-\u0010(R$\u00104\u001A\u00020\u00072\u0006\u0010/\u001A\u00020\u00078\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R,\u0010:\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R \u0010=\u001A\b\u0012\u0004\u0012\u00028\u0000058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b;\u00107\u001A\u0004\b<\u00109R \u0010C\u001A\b\u0012\u0004\u0012\u00028\u00010>8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010BR\u0014\u0010G\u001A\u00020D8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bE\u0010FR\u0014\u0010I\u001A\u00020D8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bH\u0010FR&\u0010N\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J8@X\u0080\u0004\u00A2\u0006\f\u0012\u0004\bM\u0010\u0006\u001A\u0004\bK\u0010LR&\u0010Q\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f8AX\u0080\u0004\u00A2\u0006\f\u0012\u0004\bP\u0010\u0006\u001A\u0004\bO\u0010\u000E\u00A8\u0006S"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", "V", "Landroidx/compose/runtime/snapshots/StateObject;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "", "toMap", "()Ljava/util/Map;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "from", "putAll", "(Ljava/util/Map;)V", "remove", "removeValue$runtime_release", "removeValue", "Lkotlin/Function1;", "", "predicate", "removeIf$runtime_release", "(Lkotlin/jvm/functions/Function1;)Z", "removeIf", "", "any$runtime_release", "any", "all$runtime_release", "all", "<set-?>", "a", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "", "b", "Ljava/util/Set;", "getEntries", "()Ljava/util/Set;", "entries", "c", "getKeys", "keys", "", "d", "Ljava/util/Collection;", "getValues", "()Ljava/util/Collection;", "values", "", "getSize", "()I", "size", "getModification$runtime_release", "modification", "Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime_release$annotations", "readable", "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "StateMapStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n166#1:374\n133#1:375\n167#1,2:377\n137#1:379\n169#1,3:386\n174#1:392\n140#1,5:393\n145#1:399\n133#1:400\n146#1,7:402\n137#1:409\n153#1,6:415\n161#1,3:424\n140#1,5:427\n145#1:433\n133#1:434\n146#1,7:436\n137#1:443\n153#1,6:449\n161#1,3:458\n140#1,5:461\n145#1:467\n133#1:468\n146#1,7:470\n137#1:477\n153#1,6:483\n161#1,3:492\n140#1,5:498\n145#1:504\n133#1:505\n146#1,7:507\n137#1:514\n153#1,6:520\n161#1,3:529\n133#1:532\n133#1:545\n137#1:547\n133#1:558\n137#1:560\n2420#2:373\n2420#2:376\n2313#2,2:380\n1843#2:382\n2315#2,2:384\n2317#2,3:389\n2420#2:401\n2313#2,2:410\n1843#2:412\n2315#2,2:413\n2317#2,3:421\n2420#2:435\n2313#2,2:444\n1843#2:446\n2315#2,2:447\n2317#2,3:455\n2420#2:469\n2313#2,2:478\n1843#2:480\n2315#2,2:481\n2317#2,3:489\n2420#2:506\n2313#2,2:515\n1843#2:517\n2315#2,2:518\n2317#2,3:526\n2420#2:533\n2420#2:534\n2313#2,2:535\n1843#2:537\n2315#2,5:539\n2420#2:546\n2313#2,2:548\n1843#2:550\n2315#2,2:552\n2317#2,3:555\n2420#2:559\n2313#2,2:561\n1843#2:563\n2315#2,2:565\n2317#2,3:568\n89#3:383\n89#3:398\n89#3:432\n89#3:466\n89#3:503\n89#3:538\n89#3:544\n89#3:551\n89#3:554\n89#3:564\n89#3:567\n288#4,2:495\n1#5:497\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n81#1:374\n81#1:375\n81#1:377,2\n81#1:379\n81#1:386,3\n81#1:392\n82#1:393,5\n82#1:399\n82#1:400\n82#1:402,7\n82#1:409\n82#1:415,6\n82#1:424,3\n83#1:427,5\n83#1:433\n83#1:434\n83#1:436,7\n83#1:443\n83#1:449,6\n83#1:458,3\n84#1:461,5\n84#1:467\n84#1:468\n84#1:470,7\n84#1:477\n84#1:483,6\n84#1:492,3\n97#1:498,5\n97#1:504\n97#1:505\n97#1:507,7\n97#1:514\n97#1:520,6\n97#1:529,3\n129#1:532\n145#1:545\n152#1:547\n166#1:558\n168#1:560\n77#1:373\n81#1:376\n81#1:380,2\n81#1:382\n81#1:384,2\n81#1:389,3\n82#1:401\n82#1:410,2\n82#1:412\n82#1:413,2\n82#1:421,3\n83#1:435\n83#1:444,2\n83#1:446\n83#1:447,2\n83#1:455,3\n84#1:469\n84#1:478,2\n84#1:480\n84#1:481,2\n84#1:489,3\n97#1:506\n97#1:515,2\n97#1:517\n97#1:518,2\n97#1:526,3\n129#1:533\n133#1:534\n137#1:535,2\n137#1:537\n137#1:539,5\n145#1:546\n152#1:548,2\n152#1:550\n152#1:552,2\n152#1:555,3\n166#1:559\n168#1:561,2\n168#1:563\n168#1:565,2\n168#1:568,3\n81#1:383\n82#1:398\n83#1:432\n84#1:466\n97#1:503\n137#1:538\n144#1:544\n152#1:551\n153#1:554\n168#1:564\n169#1:567\n89#1:495,2\n*E\n"})
public final class SnapshotStateMap implements StateObject, Map, KMutableMap {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001D\b\u0000\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR.\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0007R\"\u0010\u001A\u001A\u00020\u00138\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", "V", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "value", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "c", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "getMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setMap$runtime_release", "", "d", "I", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "modification", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,372:1\n89#2:373\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n186#1:373\n*E\n"})
    public static final class StateMapStateRecord extends StateRecord {
        public static final int $stable = 8;
        public PersistentMap c;
        public int d;

        public StateMapStateRecord(@NotNull PersistentMap persistentMap0) {
            this.c = persistentMap0;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord stateRecord0) {
            Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            synchronized(SnapshotStateMapKt.a) {
                this.c = ((StateMapStateRecord)stateRecord0).c;
                this.d = ((StateMapStateRecord)stateRecord0).d;
            }
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateMapStateRecord(this.c);
        }

        @NotNull
        public final PersistentMap getMap$runtime_release() {
            return this.c;
        }

        public final int getModification$runtime_release() {
            return this.d;
        }

        public final void setMap$runtime_release(@NotNull PersistentMap persistentMap0) {
            this.c = persistentMap0;
        }

        public final void setModification$runtime_release(int v) {
            this.d = v;
        }
    }

    public static final int $stable;
    public StateMapStateRecord a;
    public final a b;
    public final b c;
    public final c d;

    public SnapshotStateMap() {
        PersistentMap persistentMap0 = ExtensionsKt.persistentHashMapOf();
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = new StateMapStateRecord(persistentMap0);
        if(Snapshot.Companion.isInSnapshot()) {
            StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = new StateMapStateRecord(persistentMap0);
            snapshotStateMap$StateMapStateRecord1.setSnapshotId$runtime_release(1);
            snapshotStateMap$StateMapStateRecord0.setNext$runtime_release(snapshotStateMap$StateMapStateRecord1);
        }
        this.a = snapshotStateMap$StateMapStateRecord0;
        this.b = new a(this);  // 初始化器: Li1/e;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V
        this.c = new b(this);  // 初始化器: Li1/e;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V
        this.d = new c(this);  // 初始化器: Li1/e;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V
    }

    public final boolean all$runtime_release(@NotNull Function1 function10) {
        for(Object object0: ((ImmutableSet)this.getReadable$runtime_release().getMap$runtime_release().entrySet())) {
            if(!((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(@NotNull Function1 function10) {
        for(Object object0: ((ImmutableSet)this.getReadable$runtime_release().getMap$runtime_release().entrySet())) {
            if(((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Snapshot snapshot0;
        StateRecord stateRecord0 = this.getFirstStateRecord();
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)stateRecord0));
        PersistentMap persistentMap0 = ExtensionsKt.persistentHashMapOf();
        if(persistentMap0 != snapshotStateMap$StateMapStateRecord0.getMap$runtime_release()) {
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateMapKt.access$getSync$p()) {
                    snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap0);
                    snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.getReadable$runtime_release().getMap$runtime_release().containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.getReadable$runtime_release().getMap$runtime_release().containsValue(object0);
    }

    @Override
    public final Set entrySet() {
        return this.getEntries();
    }

    @Override
    @Nullable
    public Object get(Object object0) {
        return this.getReadable$runtime_release().getMap$runtime_release().get(object0);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    @NotNull
    public final Map getDebuggerDisplayValue() {
        StateRecord stateRecord0 = this.getFirstStateRecord();
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)stateRecord0))).getMap$runtime_release();
    }

    public static void getDebuggerDisplayValue$annotations() {
    }

    @NotNull
    public Set getEntries() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.a;
    }

    @NotNull
    public Set getKeys() {
        return this.c;
    }

    public final int getModification$runtime_release() {
        return this.getReadable$runtime_release().getModification$runtime_release();
    }

    @NotNull
    public final StateMapStateRecord getReadable$runtime_release() {
        StateRecord stateRecord0 = this.getFirstStateRecord();
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord)SnapshotKt.readable(((StateMapStateRecord)stateRecord0), this);
    }

    public static void getReadable$runtime_release$annotations() {
    }

    public int getSize() {
        return this.getReadable$runtime_release().getMap$runtime_release().size();
    }

    @NotNull
    public Collection getValues() {
        return this.d;
    }

    @Override
    public boolean isEmpty() {
        return this.getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    @Override
    public final Set keySet() {
        return this.getKeys();
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.a = (StateMapStateRecord)stateRecord0;
    }

    @Override
    @Nullable
    public Object put(Object object0, Object object1) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z;
        Object object3;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release();
                int v1 = snapshotStateMap$StateMapStateRecord0.getModification$runtime_release();
            }
            Intrinsics.checkNotNull(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            object3 = persistentMap$Builder0.put(object0, object1);
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(Intrinsics.areEqual(persistentMap1, persistentMap0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateMapKt.a) {
                    if(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() == v1) {
                        snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap1);
                        z = true;
                        snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
                    }
                    else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            if(z) {
                return object3;
            }
        }
        return object3;
    }

    @Override
    public void putAll(@NotNull Map map0) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release();
                int v1 = snapshotStateMap$StateMapStateRecord0.getModification$runtime_release();
            }
            Intrinsics.checkNotNull(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            persistentMap$Builder0.putAll(map0);
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(Intrinsics.areEqual(persistentMap1, persistentMap0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateMapKt.a) {
                    if(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() == v1) {
                        snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap1);
                        z = true;
                        snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
                    }
                    else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            if(z) {
                return;
            }
        }
    }

    @Override
    @Nullable
    public Object remove(Object object0) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z;
        Object object2;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release();
                int v1 = snapshotStateMap$StateMapStateRecord0.getModification$runtime_release();
            }
            Intrinsics.checkNotNull(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            object2 = persistentMap$Builder0.remove(object0);
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(Intrinsics.areEqual(persistentMap1, persistentMap0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateMapKt.a) {
                    if(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() == v1) {
                        snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap1);
                        z = true;
                        snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
                    }
                    else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            if(z) {
                return object2;
            }
        }
        return object2;
    }

    public final boolean removeIf$runtime_release(@NotNull Function1 function10) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z1;
        boolean z = false;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release();
                int v1 = snapshotStateMap$StateMapStateRecord0.getModification$runtime_release();
            }
            Intrinsics.checkNotNull(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            for(Object object1: this.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(((Boolean)function10.invoke(map$Entry0)).booleanValue()) {
                    persistentMap$Builder0.remove(map$Entry0.getKey());
                    z = true;
                }
            }
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(Intrinsics.areEqual(persistentMap1, persistentMap0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateMapKt.a) {
                    if(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() == v1) {
                        snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap1);
                        snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
                        z1 = true;
                    }
                    else {
                        z1 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            if(z1) {
                return z;
            }
        }
        return z;
    }

    public final boolean removeValue$runtime_release(Object object0) {
        Object object1 = null;
        for(Object object2: this.entrySet()) {
            if(Intrinsics.areEqual(((Map.Entry)object2).getValue(), object0)) {
                object1 = object2;
                break;
            }
        }
        if(((Map.Entry)object1) != null) {
            this.remove(((Map.Entry)object1).getKey());
            return true;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @NotNull
    public final Map toMap() {
        return this.getReadable$runtime_release().getMap$runtime_release();
    }

    @Override
    @NotNull
    public String toString() {
        StateRecord stateRecord0 = this.getFirstStateRecord();
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)stateRecord0))).getMap$runtime_release() + ")@" + this.hashCode();
    }

    @Override
    public final Collection values() {
        return this.getValues();
    }
}

