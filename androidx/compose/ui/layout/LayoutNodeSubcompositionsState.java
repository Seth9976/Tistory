package androidx.compose.ui.layout;

import a5.b;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot.Companion;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode.LayoutState;
import androidx.compose.ui.node.LayoutNode.NoIntrinsicsMeasurePolicy;
import androidx.compose.ui.node.LayoutNode.UsageByParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.Constraints;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import va.v;
import z1.m;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001:\u0003789B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\nJ\u000F\u0010\f\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ0\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\u0011\u0010\u0011\u001A\r\u0012\u0004\u0012\u00020\b0\u000F¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001A\u00020\b2\u0006\u0010\u0017\u001A\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001A\u001A\u00020\b¢\u0006\u0004\b\u001A\u0010\nJ,\u0010\"\u001A\u00020!2\u001D\u0010 \u001A\u0019\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\u001E0\u001B¢\u0006\u0002\b\u001F¢\u0006\u0004\b\"\u0010#J*\u0010%\u001A\u00020$2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\u0011\u0010\u0011\u001A\r\u0012\u0004\u0012\u00020\b0\u000F¢\u0006\u0002\b\u0010¢\u0006\u0004\b%\u0010&J\r\u0010\'\u001A\u00020\b¢\u0006\u0004\b\'\u0010\nR$\u0010/\u001A\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u0010\u0005\u001A\u00020\u00042\u0006\u00100\u001A\u00020\u00048\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b1\u00102\u001A\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006:"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "", "onReuse", "()V", "onDeactivate", "onRelease", "", "slotId", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "", "startIndex", "disposeOrReuseStartingFromIndex", "(I)V", "makeSureStateIsConsistent", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/ui/layout/MeasurePolicy;", "createMeasurePolicy", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "forceRecomposeChildren", "Landroidx/compose/runtime/CompositionContext;", "b", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext", "()Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "compositionContext", "value", "c", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "getSlotReusePolicy", "()Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "setSlotReusePolicy", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "z1/m", "androidx/compose/ui/layout/d", "androidx/compose/ui/layout/e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 6 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1013:1\n870#1:1051\n870#1:1063\n870#1:1092\n870#1:1097\n1208#2:1014\n1187#2,2:1015\n42#3,7:1017\n53#3,7:1027\n361#4,3:1024\n364#4,4:1034\n361#4,7:1038\n361#4,7:1083\n602#5,6:1045\n609#5:1056\n602#5,6:1057\n609#5:1068\n602#5,8:1069\n1148#6,4:1052\n1148#6,4:1064\n1148#6,2:1077\n1150#6,2:1081\n1148#6,4:1093\n1148#6,4:1098\n1148#6,4:1102\n1855#7,2:1079\n215#8,2:1090\n33#9,6:1106\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n486#1:1051\n556#1:1063\n858#1:1092\n864#1:1097\n400#1:1014\n400#1:1015,2\n429#1:1017,7\n441#1:1027,7\n437#1:1024,3\n437#1:1034,4\n473#1:1038,7\n779#1:1083,7\n485#1:1045,6\n485#1:1056\n543#1:1057,6\n543#1:1068\n583#1:1069,8\n486#1:1052,4\n556#1:1064,4\n607#1:1077,2\n607#1:1081,2\n858#1:1093,4\n864#1:1098,4\n870#1:1102,4\n608#1:1079,2\n847#1:1090,2\n973#1:1106,6\n*E\n"})
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    public static final int $stable = 8;
    public final LayoutNode a;
    public CompositionContext b;
    public SubcomposeSlotReusePolicy c;
    public int d;
    public int e;
    public final HashMap f;
    public final HashMap g;
    public final e h;
    public final d i;
    public final HashMap j;
    public final SlotIdsSet k;
    public final LinkedHashMap l;
    public final MutableVector m;
    public int n;
    public int o;
    public final String p;

    public LayoutNodeSubcompositionsState(@NotNull LayoutNode layoutNode0, @NotNull SubcomposeSlotReusePolicy subcomposeSlotReusePolicy0) {
        this.a = layoutNode0;
        this.c = subcomposeSlotReusePolicy0;
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new e(this);
        this.i = new d(this);
        this.j = new HashMap();
        this.k = new SlotIdsSet(null, 1, null);
        this.l = new LinkedHashMap();
        this.m = new MutableVector(new Object[16], 0);
        this.p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve \'match parent\' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public final void a(boolean z) {
        this.o = 0;
        this.j.clear();
        LayoutNode layoutNode0 = this.a;
        int v1 = layoutNode0.getFoldedChildren$ui_release().size();
        if(this.n != v1) {
            this.n = v1;
            Companion snapshot$Companion0 = Snapshot.Companion;
            Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
            Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
            Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
            try {
                for(int v = 0; v < v1; ++v) {
                    LayoutNode layoutNode1 = (LayoutNode)layoutNode0.getFoldedChildren$ui_release().get(v);
                    m m0 = (m)this.f.get(layoutNode1);
                    if(m0 != null && ((Boolean)m0.f.getValue()).booleanValue()) {
                        UsageByParent layoutNode$UsageByParent0 = UsageByParent.NotUsed;
                        layoutNode1.getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(layoutNode$UsageByParent0);
                        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = layoutNode1.getLookaheadPassDelegate$ui_release();
                        if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
                            layoutNodeLayoutDelegate$LookaheadPassDelegate0.setMeasuredByParent$ui_release(layoutNode$UsageByParent0);
                        }
                        if(z) {
                            ReusableComposition reusableComposition0 = m0.c;
                            if(reusableComposition0 != null) {
                                reusableComposition0.deactivate();
                            }
                            m0.f = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        }
                        else {
                            m0.f.setValue(Boolean.FALSE);
                        }
                        m0.a = SubcomposeLayoutKt.access$getReusedSlotId$p();
                    }
                }
            }
            finally {
                snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
            }
            this.g.clear();
        }
        this.makeSureStateIsConsistent();
    }

    public static final void access$disposeUnusedSlotsInPostLookahead(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0) {
        o.removeAll(layoutNodeSubcompositionsState0.l.entrySet(), new f(layoutNodeSubcompositionsState0));
    }

    public static final List access$postLookaheadSubcompose(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0, Object object0, Function2 function20) {
        MutableVector mutableVector0 = layoutNodeSubcompositionsState0.m;
        if(mutableVector0.getSize() < layoutNodeSubcompositionsState0.e) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        int v = layoutNodeSubcompositionsState0.e;
        if(mutableVector0.getSize() == v) {
            mutableVector0.add(object0);
        }
        else {
            mutableVector0.set(v, object0);
        }
        ++layoutNodeSubcompositionsState0.e;
        HashMap hashMap0 = layoutNodeSubcompositionsState0.j;
        if(!hashMap0.containsKey(object0)) {
            PrecomposedSlotHandle subcomposeLayoutState$PrecomposedSlotHandle0 = layoutNodeSubcompositionsState0.precompose(object0, function20);
            layoutNodeSubcompositionsState0.l.put(object0, subcomposeLayoutState$PrecomposedSlotHandle0);
            LayoutNode layoutNode0 = layoutNodeSubcompositionsState0.a;
            if(layoutNode0.getLayoutState$ui_release() == LayoutState.LayingOut) {
                layoutNode0.requestLookaheadRelayout$ui_release(true);
            }
            else {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeSubcompositionsState0.a, true, false, false, 6, null);
            }
        }
        LayoutNode layoutNode1 = (LayoutNode)hashMap0.get(object0);
        if(layoutNode1 != null) {
            List list0 = layoutNode1.getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((MeasurePassDelegate)list0.get(v2)).markDetachedFromParentLookaheadPass$ui_release();
            }
            return list0;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public final void b(int v, int v1, int v2) {
        LayoutNode.access$setIgnoreRemeasureRequests$p(this.a, true);
        this.a.move$ui_release(v, v1, v2);
        LayoutNode.access$setIgnoreRemeasureRequests$p(this.a, false);
    }

    public final void c(LayoutNode layoutNode0, Object object0, Function2 function20) {
        HashMap hashMap0 = this.f;
        m m0 = hashMap0.get(layoutNode0);
        Function1 function10 = null;
        if(m0 == null) {
            m0 = new m();  // 初始化器: Ljava/lang/Object;-><init>()V
            m0.a = object0;
            m0.b = ComposableSingletons.SubcomposeLayoutKt.INSTANCE.getLambda-1$ui_release();
            m0.c = null;
            m0.f = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            hashMap0.put(layoutNode0, m0);
        }
        boolean z = m0.c == null ? true : m0.c.getHasInvalidations();
        if(m0.b != function20 || z || m0.d) {
            m0.b = function20;
            Companion snapshot$Companion0 = Snapshot.Companion;
            Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
            if(snapshot0 != null) {
                function10 = snapshot0.getReadObserver();
            }
            Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
            try {
                LayoutNode layoutNode1 = this.a;
                LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode1, true);
                Function2 function21 = m0.b;
                ReusableComposition reusableComposition0 = m0.c;
                CompositionContext compositionContext0 = this.b;
                if(compositionContext0 != null) {
                    boolean z1 = m0.e;
                    ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(-1750409193, true, new v(3, m0, function21));
                    if(reusableComposition0 == null || reusableComposition0.isDisposed()) {
                        reusableComposition0 = Wrapper_androidKt.createSubcomposition(layoutNode0, compositionContext0);
                    }
                    if(z1) {
                        reusableComposition0.setContentWithReuse(composableLambda0);
                    }
                    else {
                        reusableComposition0.setContent(composableLambda0);
                    }
                    m0.c = reusableComposition0;
                    m0.e = false;
                    LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode1, false);
                    m0.d = false;
                    return;
                }
            }
            finally {
                snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
            }
            throw new IllegalStateException("parent composition reference not set");
        }
    }

    @NotNull
    public final MeasurePolicy createMeasurePolicy(@NotNull Function2 function20) {
        return new NoIntrinsicsMeasurePolicy(/*ERROR_MISSING_ARG_2/*) {
            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull List list0, long v) {
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = function20;
                layoutNodeSubcompositionsState0.h.a = measureScope0.getLayoutDirection();
                layoutNodeSubcompositionsState0.h.b = measureScope0.getDensity();
                layoutNodeSubcompositionsState0.h.c = measureScope0.getFontScale();
                Function2 function20 = this.p;
                if(!measureScope0.isLookingAhead() && layoutNodeSubcompositionsState0.a.getLookaheadRoot$ui_release() != null) {
                    layoutNodeSubcompositionsState0.e = 0;
                    MeasureResult measureResult0 = (MeasureResult)function20.invoke(layoutNodeSubcompositionsState0.i, Constraints.box-impl(v));
                    return new MeasureResult() {
                        public final MeasureResult a;

                        {
                            MeasureResult measureResult0 = layoutNodeSubcompositionsState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = layoutNodeSubcompositionsState0.e;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                            int v = measureResult0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                            this.a = measureResult0;
                        }

                        @Override  // androidx.compose.ui.layout.MeasureResult
                        @NotNull
                        public Map getAlignmentLines() {
                            return this.a.getAlignmentLines();
                        }

                        @Override  // androidx.compose.ui.layout.MeasureResult
                        public int getHeight() {
                            return this.a.getHeight();
                        }

                        @Override  // androidx.compose.ui.layout.MeasureResult
                        @Nullable
                        public Function1 getRulers() {
                            return this.a.getRulers();
                        }

                        @Override  // androidx.compose.ui.layout.MeasureResult
                        public int getWidth() {
                            return this.a.getWidth();
                        }

                        @Override  // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            layoutNodeSubcompositionsState0.e.e = measureResult0;
                            this.d.placeChildren();
                            LayoutNodeSubcompositionsState.access$disposeUnusedSlotsInPostLookahead(layoutNodeSubcompositionsState0.e);
                        }
                    };
                }
                layoutNodeSubcompositionsState0.d = 0;
                MeasureResult measureResult1 = (MeasureResult)function20.invoke(layoutNodeSubcompositionsState0.h, Constraints.box-impl(v));
                return new MeasureResult() {
                    public final MeasureResult a;

                    {
                        MeasureResult measureResult0 = layoutNodeSubcompositionsState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = layoutNodeSubcompositionsState0.d;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        int v = measureResult1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        this.a = measureResult0;
                    }

                    @Override  // androidx.compose.ui.layout.MeasureResult
                    @NotNull
                    public Map getAlignmentLines() {
                        return this.a.getAlignmentLines();
                    }

                    @Override  // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return this.a.getHeight();
                    }

                    @Override  // androidx.compose.ui.layout.MeasureResult
                    @Nullable
                    public Function1 getRulers() {
                        return this.a.getRulers();
                    }

                    @Override  // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return this.a.getWidth();
                    }

                    @Override  // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState0.d.d = measureResult1;
                        this.d.placeChildren();
                        layoutNodeSubcompositionsState0.d.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState0.d.d);
                    }
                };
            }
        };
    }

    public final LayoutNode d(Object object0) {
        HashMap hashMap0;
        int v4;
        if(this.n == 0) {
            return null;
        }
        LayoutNode layoutNode0 = this.a;
        int v = layoutNode0.getFoldedChildren$ui_release().size() - this.o;
        int v1 = v - this.n;
        int v2 = v - 1;
        int v3;
        for(v3 = v2; true; --v3) {
            v4 = -1;
            hashMap0 = this.f;
            if(v3 < v1) {
                break;
            }
            Object object1 = hashMap0.get(((LayoutNode)layoutNode0.getFoldedChildren$ui_release().get(v3)));
            Intrinsics.checkNotNull(object1);
            if(Intrinsics.areEqual(((m)object1).a, object0)) {
                v4 = v3;
                break;
            }
        }
        if(v4 == -1) {
            while(v2 >= v1) {
                Object object2 = hashMap0.get(((LayoutNode)layoutNode0.getFoldedChildren$ui_release().get(v2)));
                Intrinsics.checkNotNull(object2);
                m m0 = (m)object2;
                if(m0.a != SubcomposeLayoutKt.access$getReusedSlotId$p() && !this.c.areCompatible(object0, m0.a)) {
                    --v2;
                    continue;
                }
                m0.a = object0;
                v3 = v2;
                v4 = v3;
                goto label_31;
            }
            v3 = v2;
        }
    label_31:
        if(v4 != -1) {
            if(v3 != v1) {
                this.b(v3, v1, 1);
            }
            --this.n;
            LayoutNode layoutNode1 = (LayoutNode)layoutNode0.getFoldedChildren$ui_release().get(v1);
            Object object3 = hashMap0.get(layoutNode1);
            Intrinsics.checkNotNull(object3);
            ((m)object3).f = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            ((m)object3).e = true;
            ((m)object3).d = true;
            return layoutNode1;
        }
        return null;
    }

    public final void disposeOrReuseStartingFromIndex(int v) {
        int v1 = 0;
        this.n = 0;
        LayoutNode layoutNode0 = this.a;
        int v2 = layoutNode0.getFoldedChildren$ui_release().size() - this.o - 1;
        if(v <= v2) {
            SlotIdsSet subcomposeSlotReusePolicy$SlotIdsSet0 = this.k;
            subcomposeSlotReusePolicy$SlotIdsSet0.clear();
            HashMap hashMap0 = this.f;
            if(v <= v2) {
                for(int v3 = v; true; ++v3) {
                    Object object0 = hashMap0.get(((LayoutNode)layoutNode0.getFoldedChildren$ui_release().get(v3)));
                    Intrinsics.checkNotNull(object0);
                    subcomposeSlotReusePolicy$SlotIdsSet0.add$ui_release(((m)object0).a);
                    if(v3 == v2) {
                        break;
                    }
                }
            }
            this.c.getSlotsToRetain(subcomposeSlotReusePolicy$SlotIdsSet0);
            Companion snapshot$Companion0 = Snapshot.Companion;
            Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
            Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
            Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
            int v4 = 0;
            try {
                while(v2 >= v) {
                    LayoutNode layoutNode1 = (LayoutNode)layoutNode0.getFoldedChildren$ui_release().get(v2);
                    Object object1 = hashMap0.get(layoutNode1);
                    Intrinsics.checkNotNull(object1);
                    m m0 = (m)object1;
                    Object object2 = m0.a;
                    if(subcomposeSlotReusePolicy$SlotIdsSet0.contains(object2)) {
                        ++this.n;
                        if(((Boolean)m0.f.getValue()).booleanValue()) {
                            UsageByParent layoutNode$UsageByParent0 = UsageByParent.NotUsed;
                            layoutNode1.getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(layoutNode$UsageByParent0);
                            LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = layoutNode1.getLookaheadPassDelegate$ui_release();
                            if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
                                layoutNodeLayoutDelegate$LookaheadPassDelegate0.setMeasuredByParent$ui_release(layoutNode$UsageByParent0);
                            }
                            m0.f.setValue(Boolean.FALSE);
                            v4 = 1;
                        }
                    }
                    else {
                        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode0, true);
                        hashMap0.remove(layoutNode1);
                        ReusableComposition reusableComposition0 = m0.c;
                        if(reusableComposition0 != null) {
                            reusableComposition0.dispose();
                        }
                        layoutNode0.removeAt$ui_release(v2, 1);
                        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode0, false);
                    }
                    this.g.remove(object2);
                    --v2;
                }
            }
            finally {
                snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
            }
            v1 = v4;
        }
        if(v1 != 0) {
            Snapshot.Companion.sendApplyNotifications();
        }
        this.makeSureStateIsConsistent();
    }

    public final void forceRecomposeChildren() {
        LayoutNode layoutNode0 = this.a;
        int v = layoutNode0.getFoldedChildren$ui_release().size();
        if(this.n != v) {
            for(Object object0: this.f.entrySet()) {
                ((m)((Map.Entry)object0).getValue()).d = true;
            }
            if(!layoutNode0.getMeasurePending$ui_release()) {
                LayoutNode.requestRemeasure$ui_release$default(this.a, false, false, false, 7, null);
            }
        }
    }

    @Nullable
    public final CompositionContext getCompositionContext() {
        return this.b;
    }

    @NotNull
    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.c;
    }

    public final void makeSureStateIsConsistent() {
        int v = this.a.getFoldedChildren$ui_release().size();
        HashMap hashMap0 = this.f;
        if(hashMap0.size() != v) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + hashMap0.size() + ") and the children count on the SubcomposeLayout (" + v + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if(v - this.n - this.o >= 0) {
            HashMap hashMap1 = this.j;
            if(hashMap1.size() != this.o) {
                throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.o + ". Map size " + hashMap1.size()).toString());
            }
            return;
        }
        StringBuilder stringBuilder0 = b.s(v, "Incorrect state. Total children ", ". Reusable children ");
        stringBuilder0.append(this.n);
        stringBuilder0.append(". Precomposed children ");
        stringBuilder0.append(this.o);
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.a(true);
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        LayoutNode layoutNode0 = this.a;
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode0, true);
        HashMap hashMap0 = this.f;
        for(Object object0: hashMap0.values()) {
            ReusableComposition reusableComposition0 = ((m)object0).c;
            if(reusableComposition0 != null) {
                reusableComposition0.dispose();
            }
        }
        layoutNode0.removeAll$ui_release();
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode0, false);
        hashMap0.clear();
        this.g.clear();
        this.o = 0;
        this.n = 0;
        this.j.clear();
        this.makeSureStateIsConsistent();
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        this.a(false);
    }

    @NotNull
    public final PrecomposedSlotHandle precompose(@Nullable Object object0, @NotNull Function2 function20) {
        LayoutNode layoutNode0 = this.a;
        if(!layoutNode0.isAttached()) {
            return new androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precompose.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        this.makeSureStateIsConsistent();
        if(!this.g.containsKey(object0)) {
            this.l.remove(object0);
            HashMap hashMap0 = this.j;
            LayoutNode layoutNode1 = hashMap0.get(object0);
            if(layoutNode1 == null) {
                layoutNode1 = this.d(object0);
                if(layoutNode1 == null) {
                    int v = layoutNode0.getFoldedChildren$ui_release().size();
                    LayoutNode layoutNode2 = new LayoutNode(true, 0, 2, null);
                    LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode0, true);
                    layoutNode0.insertAt$ui_release(v, layoutNode2);
                    LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode0, false);
                    ++this.o;
                    layoutNode1 = layoutNode2;
                }
                else {
                    this.b(layoutNode0.getFoldedChildren$ui_release().indexOf(layoutNode1), layoutNode0.getFoldedChildren$ui_release().size(), 1);
                    ++this.o;
                }
                hashMap0.put(object0, layoutNode1);
            }
            this.c(layoutNode1, object0, function20);
        }
        return new PrecomposedSlotHandle() {
            public final LayoutNodeSubcompositionsState a;
            public final Object b;

            {
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = object0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = layoutNodeSubcompositionsState0;
                this.b = object0;
            }

            @Override  // androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle
            public void dispose() {
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = this.a;
                layoutNodeSubcompositionsState0.makeSureStateIsConsistent();
                LayoutNode layoutNode0 = (LayoutNode)layoutNodeSubcompositionsState0.j.remove(this.b);
                if(layoutNode0 != null) {
                    if(layoutNodeSubcompositionsState0.o <= 0) {
                        throw new IllegalStateException("No pre-composed items to dispose");
                    }
                    int v = layoutNodeSubcompositionsState0.a.getFoldedChildren$ui_release().indexOf(layoutNode0);
                    if(v < layoutNodeSubcompositionsState0.a.getFoldedChildren$ui_release().size() - layoutNodeSubcompositionsState0.o) {
                        throw new IllegalStateException("Item is not in pre-composed item range");
                    }
                    ++layoutNodeSubcompositionsState0.n;
                    --layoutNodeSubcompositionsState0.o;
                    int v1 = layoutNodeSubcompositionsState0.a.getFoldedChildren$ui_release().size() - layoutNodeSubcompositionsState0.o - layoutNodeSubcompositionsState0.n;
                    layoutNodeSubcompositionsState0.b(v, v1, 1);
                    layoutNodeSubcompositionsState0.disposeOrReuseStartingFromIndex(v1);
                }
            }

            @Override  // androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle
            public int getPlaceablesCount() {
                LayoutNode layoutNode0 = (LayoutNode)this.a.j.get(this.b);
                if(layoutNode0 != null) {
                    List list0 = layoutNode0.getChildren$ui_release();
                    return list0 == null ? 0 : list0.size();
                }
                return 0;
            }

            @Override  // androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle
            public void premeasure-0kLqBqw(int v, long v1) {
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = this.a;
                LayoutNode layoutNode0 = (LayoutNode)layoutNodeSubcompositionsState0.j.get(this.b);
                if(layoutNode0 != null && layoutNode0.isAttached()) {
                    int v2 = layoutNode0.getChildren$ui_release().size();
                    if(v < 0 || v >= v2) {
                        throw new IndexOutOfBoundsException("Index (" + v + ") is out of bound of [0, " + v2 + ')');
                    }
                    if(layoutNode0.isPlaced()) {
                        throw new IllegalArgumentException("Pre-measure called on node that is not placed");
                    }
                    LayoutNode layoutNode1 = layoutNodeSubcompositionsState0.a;
                    LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode1, true);
                    LayoutNodeKt.requireOwner(layoutNode0).measureAndLayout-0kLqBqw(((LayoutNode)layoutNode0.getChildren$ui_release().get(v)), v1);
                    LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode1, false);
                }
            }

            @Override  // androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle
            public void traverseDescendants(@Nullable Object object0, @NotNull Function1 function10) {
                LayoutNode layoutNode0 = (LayoutNode)this.a.j.get(this.b);
                if(layoutNode0 != null) {
                    NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                    if(nodeChain0 != null) {
                        Node modifier$Node0 = nodeChain0.getHead$ui_release();
                        if(modifier$Node0 != null) {
                            TraversableNodeKt.traverseDescendants(modifier$Node0, object0, function10);
                        }
                    }
                }
            }
        };

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$1", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "dispose", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precompose.1 implements PrecomposedSlotHandle {
            @Override  // androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle
            public void dispose() {
            }
        }

    }

    public final void setCompositionContext(@Nullable CompositionContext compositionContext0) {
        this.b = compositionContext0;
    }

    public final void setSlotReusePolicy(@NotNull SubcomposeSlotReusePolicy subcomposeSlotReusePolicy0) {
        if(this.c != subcomposeSlotReusePolicy0) {
            this.c = subcomposeSlotReusePolicy0;
            this.a(false);
            LayoutNode.requestRemeasure$ui_release$default(this.a, false, false, false, 7, null);
        }
    }

    @NotNull
    public final List subcompose(@Nullable Object object0, @NotNull Function2 function20) {
        this.makeSureStateIsConsistent();
        LayoutNode layoutNode0 = this.a;
        LayoutState layoutNode$LayoutState0 = layoutNode0.getLayoutState$ui_release();
        LayoutState layoutNode$LayoutState1 = LayoutState.Measuring;
        if(layoutNode$LayoutState0 != layoutNode$LayoutState1 && layoutNode$LayoutState0 != LayoutState.LayingOut && layoutNode$LayoutState0 != LayoutState.LookaheadMeasuring && layoutNode$LayoutState0 != LayoutState.LookaheadLayingOut) {
            InlineClassHelperKt.throwIllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        HashMap hashMap0 = this.g;
        LayoutNode layoutNode1 = hashMap0.get(object0);
        if(layoutNode1 == null) {
            layoutNode1 = (LayoutNode)this.j.remove(object0);
            if(layoutNode1 == null) {
                layoutNode1 = this.d(object0);
                if(layoutNode1 == null) {
                    int v = this.d;
                    LayoutNode layoutNode2 = new LayoutNode(true, 0, 2, null);
                    LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode0, true);
                    layoutNode0.insertAt$ui_release(v, layoutNode2);
                    LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode0, false);
                    layoutNode1 = layoutNode2;
                }
            }
            else {
                if(this.o <= 0) {
                    InlineClassHelperKt.throwIllegalStateException("Check failed.");
                }
                --this.o;
            }
            hashMap0.put(object0, layoutNode1);
        }
        if(CollectionsKt___CollectionsKt.getOrNull(layoutNode0.getFoldedChildren$ui_release(), this.d) != layoutNode1) {
            int v1 = layoutNode0.getFoldedChildren$ui_release().indexOf(layoutNode1);
            int v2 = this.d;
            if(v1 < v2) {
                throw new IllegalArgumentException(("Key \"" + object0 + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if(v2 != v1) {
                this.b(v1, v2, 1);
            }
        }
        ++this.d;
        this.c(layoutNode1, object0, function20);
        return layoutNode$LayoutState0 == layoutNode$LayoutState1 || layoutNode$LayoutState0 == LayoutState.LayingOut ? layoutNode1.getChildMeasurables$ui_release() : layoutNode1.getChildLookaheadMeasurables$ui_release();
    }
}

