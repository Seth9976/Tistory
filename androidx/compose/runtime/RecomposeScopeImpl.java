package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.RecomposeScopeObserver;
import ca.f1;
import java.util.List;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001SB\u0011\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0001\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\t\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001A\u00020\t2\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0006J\u000F\u0010\u001A\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u001A\u0010\u0018J)\u0010\u001E\u001A\u00020\t2\u0018\u0010\u001D\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\t0\u001BH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0015\u0010!\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u001C\u00A2\u0006\u0004\b!\u0010\"J\r\u0010#\u001A\u00020\t\u00A2\u0006\u0004\b#\u0010\u0018J\u0015\u0010&\u001A\u00020%2\u0006\u0010$\u001A\u00020\u0012\u00A2\u0006\u0004\b&\u0010\'J#\u0010)\u001A\u00020\t2\n\u0010$\u001A\u0006\u0012\u0002\b\u00030(2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010,\u001A\u00020%2\b\u0010+\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\u0004\b,\u0010\'J\r\u0010-\u001A\u00020\t\u00A2\u0006\u0004\b-\u0010\u0018J#\u00100\u001A\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\t\u0018\u00010.2\u0006\u0010 \u001A\u00020\u001C\u00A2\u0006\u0004\b0\u00101R$\u00109\u001A\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b3\u00104\u001A\u0004\b5\u00106\"\u0004\b7\u00108R\u0011\u0010<\u001A\u00020%8F\u00A2\u0006\u0006\u001A\u0004\b:\u0010;R\u0011\u0010>\u001A\u00020%8F\u00A2\u0006\u0006\u001A\u0004\b=\u0010;R$\u0010B\u001A\u00020%2\u0006\u0010\u0013\u001A\u00020%8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b?\u0010;\"\u0004\b@\u0010AR$\u0010E\u001A\u00020%2\u0006\u0010\u0013\u001A\u00020%8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bC\u0010;\"\u0004\bD\u0010AR$\u0010H\u001A\u00020%2\u0006\u0010\u0013\u001A\u00020%8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bF\u0010;\"\u0004\bG\u0010AR$\u0010K\u001A\u00020%2\u0006\u0010\u0013\u001A\u00020%8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bI\u0010;\"\u0004\bJ\u0010AR$\u0010N\u001A\u00020%2\u0006\u0010\u0013\u001A\u00020%8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bL\u0010;\"\u0004\bM\u0010AR$\u0010Q\u001A\u00020%2\u0006\u0010\u0013\u001A\u00020%8@@BX\u0080\u000E\u00A2\u0006\f\u001A\u0004\bO\u0010;\"\u0004\bP\u0010AR\u0011\u0010R\u001A\u00020%8F\u00A2\u0006\u0006\u001A\u0004\bR\u0010;\u00A8\u0006T"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "owner", "<init>", "(Landroidx/compose/runtime/RecomposeScopeOwner;)V", "Landroidx/compose/runtime/Composer;", "composer", "", "compose", "(Landroidx/compose/runtime/Composer;)V", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe$runtime_release", "(Landroidx/compose/runtime/tooling/RecomposeScopeObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe", "", "value", "Landroidx/compose/runtime/InvalidationResult;", "invalidateForResult", "(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "release", "()V", "adoptedBy", "invalidate", "Lkotlin/Function2;", "", "block", "updateScope", "(Lkotlin/jvm/functions/Function2;)V", "token", "start", "(I)V", "scopeSkipped", "instance", "", "recordRead", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/DerivedState;", "recordDerivedStateValue", "(Landroidx/compose/runtime/DerivedState;Ljava/lang/Object;)V", "instances", "isInvalidFor", "rereadTrackedInstances", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "end", "(I)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/Anchor;", "c", "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "anchor", "getValid", "()Z", "valid", "getCanRecompose", "canRecompose", "getUsed", "setUsed", "(Z)V", "used", "getDefaultsInScope", "setDefaultsInScope", "defaultsInScope", "getDefaultsInvalid", "setDefaultsInvalid", "defaultsInvalid", "getRequiresRecompose", "setRequiresRecompose", "requiresRecompose", "getForcedRecompose", "setForcedRecompose", "forcedRecompose", "getSkipped$runtime_release", "setSkipped", "skipped", "isConditional", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,449:1\n89#2:450\n1#3:451\n296#4,2:452\n267#4,4:454\n237#4,7:458\n248#4,3:466\n251#4,2:470\n272#4:472\n298#4,2:473\n273#4:475\n254#4,6:476\n274#4:482\n300#4:483\n1810#5:465\n1672#5:469\n1810#5:494\n1672#5:498\n1810#5:521\n1672#5:525\n401#6,4:484\n373#6,6:488\n383#6,3:495\n386#6,2:499\n406#6,2:501\n389#6,6:503\n408#6:509\n449#6:510\n401#6,4:511\n373#6,6:515\n383#6,3:522\n386#6,2:526\n406#6:528\n450#6,2:529\n407#6:531\n389#6,6:532\n408#6:538\n452#6:539\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n197#1:450\n359#1:452,2\n359#1:454,4\n359#1:458,7\n359#1:466,3\n359#1:470,2\n359#1:472\n359#1:473,2\n359#1:475\n359#1:476,6\n359#1:482\n359#1:483\n359#1:465\n359#1:469\n381#1:494\n381#1:498\n404#1:521\n404#1:525\n381#1:484,4\n381#1:488,6\n381#1:495,3\n381#1:499,2\n381#1:501,2\n381#1:503,6\n381#1:509\n404#1:510\n404#1:511,4\n404#1:515,6\n404#1:522,3\n404#1:526,2\n404#1:528\n404#1:529,2\n404#1:531\n404#1:532,6\n404#1:538\n404#1:539\n*E\n"})
public final class RecomposeScopeImpl implements RecomposeScope, ScopeUpdateScope {
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\f\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000BJ%\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\r2\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl$Companion;", "", "Landroidx/compose/runtime/SlotWriter;", "slots", "", "Landroidx/compose/runtime/Anchor;", "anchors", "Landroidx/compose/runtime/RecomposeScopeOwner;", "newOwner", "", "adoptAnchoredScopes$runtime_release", "(Landroidx/compose/runtime/SlotWriter;Ljava/util/List;Landroidx/compose/runtime/RecomposeScopeOwner;)V", "adoptAnchoredScopes", "Landroidx/compose/runtime/SlotTable;", "", "hasAnchoredRecomposeScopes$runtime_release", "(Landroidx/compose/runtime/SlotTable;Ljava/util/List;)Z", "hasAnchoredRecomposeScopes", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,449:1\n33#2,6:450\n93#2,2:456\n33#2,4:458\n95#2,2:462\n38#2:464\n97#2:465\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n*L\n434#1:450,6\n444#1:456,2\n444#1:458,4\n444#1:462,2\n444#1:464\n444#1:465\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final void adoptAnchoredScopes$runtime_release(@NotNull SlotWriter slotWriter0, @NotNull List list0, @NotNull RecomposeScopeOwner recomposeScopeOwner0) {
            if(!list0.isEmpty()) {
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    Object object0 = slotWriter0.slot(((Anchor)list0.get(v1)), 0);
                    RecomposeScopeImpl recomposeScopeImpl0 = object0 instanceof RecomposeScopeImpl ? ((RecomposeScopeImpl)object0) : null;
                    if(recomposeScopeImpl0 != null) {
                        recomposeScopeImpl0.adoptedBy(recomposeScopeOwner0);
                    }
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime_release(@NotNull SlotTable slotTable0, @NotNull List list0) {
            if(!list0.isEmpty()) {
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    Anchor anchor0 = (Anchor)list0.get(v1);
                    if(slotTable0.ownsAnchor(anchor0) && slotTable0.slot$runtime_release(slotTable0.anchorIndex(anchor0), 0) instanceof RecomposeScopeImpl) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public int a;
    public RecomposeScopeOwner b;
    public Anchor c;
    public Function2 d;
    public RecomposeScopeObserver e;
    public int f;
    public MutableObjectIntMap g;
    public MutableScatterMap h;

    static {
        RecomposeScopeImpl.Companion = new Companion(null);
        RecomposeScopeImpl.$stable = 8;
    }

    public RecomposeScopeImpl(@Nullable RecomposeScopeOwner recomposeScopeOwner0) {
        this.b = recomposeScopeOwner0;
    }

    public static boolean a(DerivedState derivedState0, MutableScatterMap mutableScatterMap0) {
        Intrinsics.checkNotNull(derivedState0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        SnapshotMutationPolicy snapshotMutationPolicy0 = derivedState0.getPolicy();
        if(snapshotMutationPolicy0 == null) {
            snapshotMutationPolicy0 = SnapshotStateKt.structuralEqualityPolicy();
        }
        return !snapshotMutationPolicy0.equivalent(derivedState0.getCurrentRecord().getCurrentValue(), mutableScatterMap0.get(derivedState0));
    }

    public final void adoptedBy(@NotNull RecomposeScopeOwner recomposeScopeOwner0) {
        this.b = recomposeScopeOwner0;
    }

    public final void b(boolean z) {
        if(z) {
            this.a |= 0x20;
            return;
        }
        this.a &= -33;
    }

    public final void compose(@NotNull Composer composer0) {
        Unit unit0;
        Function2 function20 = this.d;
        RecomposeScopeObserver recomposeScopeObserver0 = this.e;
        if(recomposeScopeObserver0 != null && function20 != null) {
            recomposeScopeObserver0.onBeginScopeComposition(this);
            try {
                function20.invoke(composer0, 1);
            }
            finally {
                recomposeScopeObserver0.onEndScopeComposition(this);
            }
            return;
        }
        if(function20 == null) {
            unit0 = null;
        }
        else {
            function20.invoke(composer0, 1);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    @Nullable
    public final Function1 end(int v) {
        MutableObjectIntMap mutableObjectIntMap0 = this.g;
        if(mutableObjectIntMap0 != null && !this.getSkipped$runtime_release()) {
            Object[] arr_object = mutableObjectIntMap0.keys;
            int[] arr_v = mutableObjectIntMap0.values;
            long[] arr_v1 = mutableObjectIntMap0.metadata;
            int v1 = arr_v1.length - 2;
            if(v1 >= 0) {
                int v2 = 0;
                while(true) {
                    long v3 = arr_v1[v2];
                    if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                        for(int v5 = 0; v5 < v4; ++v5) {
                            if((0xFFL & v3) < 0x80L) {
                                int v6 = (v2 << 3) + v5;
                                Object object0 = arr_object[v6];
                                if(arr_v[v6] != v) {
                                    return new f1(this, v, mutableObjectIntMap0, 2);
                                }
                            }
                            v3 >>= 8;
                        }
                        if(v4 == 8) {
                            goto label_22;
                        }
                        break;
                    }
                label_22:
                    if(v2 == v1) {
                        break;
                    }
                    ++v2;
                }
            }
        }
        return null;
    }

    @Nullable
    public final Anchor getAnchor() {
        return this.c;
    }

    public final boolean getCanRecompose() {
        return this.d != null;
    }

    public final boolean getDefaultsInScope() {
        return (this.a & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.a & 4) != 0;
    }

    public final boolean getForcedRecompose() {
        return (this.a & 0x40) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.a & 8) != 0;
    }

    public final boolean getSkipped$runtime_release() {
        return (this.a & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.a & 1) != 0;
    }

    public final boolean getValid() {
        if(this.b != null) {
            return this.c == null ? false : this.c.getValid();
        }
        return false;
    }

    @Override  // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner0 = this.b;
        if(recomposeScopeOwner0 != null) {
            recomposeScopeOwner0.invalidate(this, null);
        }
    }

    @NotNull
    public final InvalidationResult invalidateForResult(@Nullable Object object0) {
        RecomposeScopeOwner recomposeScopeOwner0 = this.b;
        if(recomposeScopeOwner0 != null) {
            InvalidationResult invalidationResult0 = recomposeScopeOwner0.invalidate(this, object0);
            return invalidationResult0 == null ? InvalidationResult.IGNORED : invalidationResult0;
        }
        return InvalidationResult.IGNORED;
    }

    public final boolean isConditional() {
        return this.h != null;
    }

    public final boolean isInvalidFor(@Nullable Object object0) {
        if(object0 == null) {
            return true;
        }
        MutableScatterMap mutableScatterMap0 = this.h;
        if(mutableScatterMap0 == null) {
            return true;
        }
        if(object0 instanceof DerivedState) {
            return RecomposeScopeImpl.a(((DerivedState)object0), mutableScatterMap0);
        }
        if(object0 instanceof ScatterSet) {
            if(((ScatterSet)object0).isNotEmpty()) {
                Object[] arr_object = ((ScatterSet)object0).elements;
                long[] arr_v = ((ScatterSet)object0).metadata;
                int v = arr_v.length - 2;
                if(v >= 0) {
                    int v1 = 0;
                    while(true) {
                        long v2 = arr_v[v1];
                        if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int v3 = 8 - (~(v1 - v) >>> 0x1F);
                            int v4 = 0;
                            while(v4 < v3) {
                                if((0xFFL & v2) < 0x80L) {
                                    Object object1 = arr_object[(v1 << 3) + v4];
                                    if(object1 instanceof DerivedState && !RecomposeScopeImpl.a(((DerivedState)object1), mutableScatterMap0)) {
                                        goto label_22;
                                    }
                                    return true;
                                }
                            label_22:
                                v2 >>= 8;
                                ++v4;
                            }
                            if(v3 == 8) {
                                goto label_26;
                            }
                            break;
                        }
                    label_26:
                        if(v1 == v) {
                            break;
                        }
                        ++v1;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @ExperimentalComposeRuntimeApi
    @NotNull
    public final CompositionObserverHandle observe$runtime_release(@NotNull RecomposeScopeObserver recomposeScopeObserver0) {
        synchronized(RecomposeScopeImplKt.a) {
            this.e = recomposeScopeObserver0;
        }
        return new CompositionObserverHandle() {
            public final RecomposeScopeImpl a;
            public final RecomposeScopeObserver b;

            {
                RecomposeScopeImpl recomposeScopeImpl0 = recomposeScopeObserver0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = recomposeScopeImpl0;
                this.b = recomposeScopeObserver0;
            }

            @Override  // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object object0 = RecomposeScopeImplKt.a;
                RecomposeScopeImpl recomposeScopeImpl0 = this.a;
                synchronized(object0) {
                    if(Intrinsics.areEqual(recomposeScopeImpl0.e, this.b)) {
                        recomposeScopeImpl0.e = null;
                    }
                }
            }
        };
    }

    public final void recordDerivedStateValue(@NotNull DerivedState derivedState0, @Nullable Object object0) {
        MutableScatterMap mutableScatterMap0 = this.h;
        if(mutableScatterMap0 == null) {
            mutableScatterMap0 = new MutableScatterMap(0, 1, null);
            this.h = mutableScatterMap0;
        }
        mutableScatterMap0.set(derivedState0, object0);
    }

    public final boolean recordRead(@NotNull Object object0) {
        if((this.a & 0x20) != 0) {
            return false;
        }
        MutableObjectIntMap mutableObjectIntMap0 = this.g;
        if(mutableObjectIntMap0 == null) {
            mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
            this.g = mutableObjectIntMap0;
        }
        return mutableObjectIntMap0.put(object0, this.f, -1) == this.f;
    }

    public final void release() {
        RecomposeScopeOwner recomposeScopeOwner0 = this.b;
        if(recomposeScopeOwner0 != null) {
            recomposeScopeOwner0.recomposeScopeReleased(this);
        }
        this.b = null;
        this.g = null;
        this.h = null;
        RecomposeScopeObserver recomposeScopeObserver0 = this.e;
        if(recomposeScopeObserver0 != null) {
            recomposeScopeObserver0.onScopeDisposed(this);
        }
    }

    public final void rereadTrackedInstances() {
        RecomposeScopeOwner recomposeScopeOwner0 = this.b;
        if(recomposeScopeOwner0 != null) {
            MutableObjectIntMap mutableObjectIntMap0 = this.g;
            if(mutableObjectIntMap0 != null) {
                this.b(true);
                int v = FIN.finallyOpen$NT();
                Object[] arr_object = mutableObjectIntMap0.keys;
                int[] arr_v = mutableObjectIntMap0.values;
                long[] arr_v1 = mutableObjectIntMap0.metadata;
                int v1 = arr_v1.length - 2;
                if(v1 >= 0) {
                    int v2 = 0;
                    while(true) {
                        long v3 = arr_v1[v2];
                        if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_26;
                        }
                        int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                        for(int v5 = 0; v5 < v4; ++v5) {
                            if((0xFFL & v3) < 0x80L) {
                                int v6 = (v2 << 3) + v5;
                                Object object0 = arr_object[v6];
                                int v7 = arr_v[v6];
                                recomposeScopeOwner0.recordReadOf(object0);
                            }
                            v3 >>= 8;
                        }
                        if(v4 == 8) {
                        label_26:
                            if(v2 != v1) {
                                ++v2;
                                continue;
                            }
                        }
                        goto label_29;
                    }
                }
                else {
                label_29:
                    FIN.finallyCodeBegin$NT(v);
                    this.b(false);
                    FIN.finallyCodeEnd$NT(v);
                }
            }
        }
    }

    public final void scopeSkipped() {
        this.a |= 16;
    }

    public final void setAnchor(@Nullable Anchor anchor0) {
        this.c = anchor0;
    }

    public final void setDefaultsInScope(boolean z) {
        if(z) {
            this.a |= 2;
            return;
        }
        this.a &= -3;
    }

    public final void setDefaultsInvalid(boolean z) {
        if(z) {
            this.a |= 4;
            return;
        }
        this.a &= -5;
    }

    public final void setForcedRecompose(boolean z) {
        if(z) {
            this.a |= 0x40;
            return;
        }
        this.a &= -65;
    }

    public final void setRequiresRecompose(boolean z) {
        if(z) {
            this.a |= 8;
            return;
        }
        this.a &= -9;
    }

    public final void setUsed(boolean z) {
        if(z) {
            this.a |= 1;
            return;
        }
        this.a &= -2;
    }

    public final void start(int v) {
        this.f = v;
        this.a &= -17;
    }

    @Override  // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(@NotNull Function2 function20) {
        this.d = function20;
    }
}

