package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import d0.r;
import d0.t;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.n;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003./0B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0089\u0001\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00062\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u0019¢\u0006\u0004\b\u001C\u0010\u001DJ\r\u0010\u001E\u001A\u00020\u001B¢\u0006\u0004\b\u001E\u0010\u0005J\u001F\u0010\"\u001A\u0004\u0018\u00010!2\u0006\u0010\u001F\u001A\u00020\u00032\u0006\u0010 \u001A\u00020\u0006¢\u0006\u0004\b\"\u0010#R\u0017\u0010)\u001A\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R\u0017\u0010-\u001A\u00020*8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b+\u0010,\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "T", "", "<init>", "()V", "", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "itemProvider", "", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "", "onMeasured", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)V", "reset", "key", "placeableIndex", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "getAnimation", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "Landroidx/compose/ui/Modifier;", "k", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/IntSize;", "getMinSizeToFitDisappearingItems-YbymL2g", "()J", "minSizeToFitDisappearingItems", "DisplayingDisappearingItemsElement", "d0/r", "d0/t", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,572:1\n101#2,2:573\n33#2,6:575\n103#2:581\n33#2,4:607\n38#2:618\n33#2,6:621\n33#2,6:629\n33#2,6:669\n33#2,6:677\n33#2,6:718\n405#3,3:582\n363#3,6:585\n373#3,3:592\n376#3,2:596\n409#3,2:598\n379#3,6:600\n411#3:606\n418#3,3:685\n363#3,6:688\n373#3,3:695\n376#3,2:699\n422#3:701\n423#3:704\n379#3,6:705\n424#3:711\n1810#4:591\n1672#4:595\n1810#4:646\n1672#4:650\n1810#4:694\n1672#4:698\n1#5:611\n13579#6,2:612\n13579#6,2:614\n13579#6,2:616\n13644#6,3:654\n12744#6,2:657\n13579#6,2:683\n13579#6,2:702\n13644#6,3:712\n13644#6,3:715\n1011#7,2:619\n1002#7,2:627\n1011#7,2:667\n1002#7,2:675\n267#8,4:635\n237#8,7:639\n248#8,3:647\n251#8,2:651\n272#8:653\n273#8:659\n254#8,6:660\n274#8:666\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n*L\n89#1:573,2\n89#1:575,6\n89#1:581\n112#1:607,4\n112#1:618\n189#1:621,6\n199#1:629,6\n286#1:669,6\n310#1:677,6\n424#1:718,6\n110#1:582,3\n110#1:585,6\n110#1:592,3\n110#1:596,2\n110#1:598,2\n110#1:600,6\n110#1:606\n357#1:685,3\n357#1:688,6\n357#1:695,3\n357#1:699,2\n357#1:701\n357#1:704\n357#1:705,6\n357#1:711\n110#1:591\n110#1:595\n210#1:646\n210#1:650\n357#1:694\n357#1:698\n144#1:612,2\n158#1:614,2\n166#1:616,2\n223#1:654,3\n261#1:657,2\n346#1:683,2\n358#1:702,2\n382#1:712,3\n393#1:715,3\n188#1:619,2\n198#1:627,2\n285#1:667,2\n309#1:675,2\n210#1:635,4\n210#1:639,7\n210#1:647,3\n210#1:651,2\n210#1:653\n210#1:659\n210#1:660,6\n210#1:666\n*E\n"})
public final class LazyLayoutItemAnimator {
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ld0/r;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    static final class DisplayingDisappearingItemsElement extends ModifierNodeElement {
        public final LazyLayoutItemAnimator b;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator0) {
            this.b = lazyLayoutItemAnimator0;
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public final Node create() {
            Node modifier$Node0 = new r();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
            modifier$Node0.n = this.b;
            return modifier$Node0;
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public final boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof DisplayingDisappearingItemsElement ? Intrinsics.areEqual(this.b, ((DisplayingDisappearingItemsElement)object0).b) : false;
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public final int hashCode() {
            return this.b.hashCode();
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public final void inspectableProperties(InspectorInfo inspectorInfo0) {
            inspectorInfo0.setName("DisplayingDisappearingItemsElement");
        }

        @Override
        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.b + ')';
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public final void update(Node modifier$Node0) {
            LazyLayoutItemAnimator lazyLayoutItemAnimator0 = this.b;
            if(!Intrinsics.areEqual(((r)modifier$Node0).n, lazyLayoutItemAnimator0) && ((r)modifier$Node0).getNode().isAttached()) {
                ((r)modifier$Node0).n.reset();
                lazyLayoutItemAnimator0.j = (r)modifier$Node0;
                ((r)modifier$Node0).n = lazyLayoutItemAnimator0;
            }
        }
    }

    public static final int $stable = 8;
    public final MutableScatterMap a;
    public LazyLayoutKeyIndexMap b;
    public int c;
    public final MutableScatterSet d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public DrawModifierNode j;
    public final Modifier k;

    public LazyLayoutItemAnimator() {
        this.a = ScatterMapKt.mutableScatterMapOf();
        this.d = ScatterSetKt.mutableScatterSetOf();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = new DisplayingDisappearingItemsElement(this);
    }

    public static void a(LazyLayoutMeasuredItem lazyLayoutMeasuredItem0, int v, t t0) {
        int v1 = 0;
        long v2 = lazyLayoutMeasuredItem0.getOffset-Bjo55l4(0);
        long v3 = lazyLayoutMeasuredItem0.isVertical() ? IntOffset.copy-iSbpLlY$default(v2, 0, v, 1, null) : IntOffset.copy-iSbpLlY$default(v2, v, 0, 2, null);
        LazyLayoutItemAnimation[] arr_lazyLayoutItemAnimation = t0.a;
        for(int v4 = 0; v1 < arr_lazyLayoutItemAnimation.length; ++v4) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation0 = arr_lazyLayoutItemAnimation[v1];
            if(lazyLayoutItemAnimation0 != null) {
                lazyLayoutItemAnimation0.setRawOffset--gyyYBs(IntOffset.plus-qkQi6aY(v3, IntOffset.minus-qkQi6aY(lazyLayoutMeasuredItem0.getOffset-Bjo55l4(v4), v2)));
            }
            ++v1;
        }
    }

    public static final int access$getCrossAxisOffset(LazyLayoutItemAnimator lazyLayoutItemAnimator0, LazyLayoutMeasuredItem lazyLayoutMeasuredItem0) {
        lazyLayoutItemAnimator0.getClass();
        long v = lazyLayoutMeasuredItem0.getOffset-Bjo55l4(0);
        return lazyLayoutMeasuredItem0.isVertical() ? IntOffset.getX-impl(v) : IntOffset.getY-impl(v);
    }

    public final void b(Object object0) {
        t t0 = (t)this.a.remove(object0);
        if(t0 != null) {
            LazyLayoutItemAnimation[] arr_lazyLayoutItemAnimation = t0.a;
            if(arr_lazyLayoutItemAnimation != null) {
                for(int v = 0; v < arr_lazyLayoutItemAnimation.length; ++v) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation0 = arr_lazyLayoutItemAnimation[v];
                    if(lazyLayoutItemAnimation0 != null) {
                        lazyLayoutItemAnimation0.release();
                    }
                }
            }
        }
    }

    public final void c(LazyLayoutMeasuredItem lazyLayoutMeasuredItem0, boolean z) {
        Object object0 = lazyLayoutMeasuredItem0.getKey();
        Object object1 = this.a.get(object0);
        Intrinsics.checkNotNull(object1);
        LazyLayoutItemAnimation[] arr_lazyLayoutItemAnimation = ((t)object1).a;
        int v = 0;
        for(int v1 = 0; v < arr_lazyLayoutItemAnimation.length; ++v1) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation0 = arr_lazyLayoutItemAnimation[v];
            if(lazyLayoutItemAnimation0 != null) {
                long v2 = lazyLayoutMeasuredItem0.getOffset-Bjo55l4(v1);
                long v3 = lazyLayoutItemAnimation0.getRawOffset-nOcc-ac();
                if(!IntOffset.equals-impl0(v3, 0x7FFFFFFF7FFFFFFFL) && !IntOffset.equals-impl0(v3, v2)) {
                    lazyLayoutItemAnimation0.animatePlacementDelta-ar5cAso(IntOffset.minus-qkQi6aY(v2, v3), z);
                }
                lazyLayoutItemAnimation0.setRawOffset--gyyYBs(v2);
            }
            ++v;
        }
    }

    public static int d(int[] arr_v, LazyLayoutMeasuredItem lazyLayoutMeasuredItem0) {
        int v = lazyLayoutMeasuredItem0.getLane();
        int v1 = lazyLayoutMeasuredItem0.getSpan() + v;
        int v2 = 0;
        while(v < v1) {
            int v3 = arr_v[v];
            int v4 = lazyLayoutMeasuredItem0.getMainAxisSizeWithSpacings() + v3;
            arr_v[v] = v4;
            v2 = Math.max(v2, v4);
            ++v;
        }
        return v2;
    }

    @Nullable
    public final LazyLayoutItemAnimation getAnimation(@NotNull Object object0, int v) {
        t t0 = (t)this.a.get(object0);
        if(t0 != null) {
            return t0.a == null ? null : t0.a[v];
        }
        return null;
    }

    public final long getMinSizeToFitDisappearingItems-YbymL2g() {
        long v = 0L;
        ArrayList arrayList0 = this.i;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation0 = (LazyLayoutItemAnimation)arrayList0.get(v2);
            GraphicsLayer graphicsLayer0 = lazyLayoutItemAnimation0.getLayer();
            if(graphicsLayer0 != null) {
                v = IntSizeKt.IntSize(Math.max(IntSize.getWidth-impl(v), IntSize.getWidth-impl(graphicsLayer0.getSize-YbymL2g()) + IntOffset.getX-impl(lazyLayoutItemAnimation0.getRawOffset-nOcc-ac())), Math.max(IntSize.getHeight-impl(v), IntSize.getHeight-impl(graphicsLayer0.getSize-YbymL2g()) + IntOffset.getY-impl(lazyLayoutItemAnimation0.getRawOffset-nOcc-ac())));
            }
        }
        return v;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.k;
    }

    public final void onMeasured(int v, int v1, int v2, @NotNull List list0, @NotNull LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap0, @NotNull LazyLayoutMeasuredItemProvider lazyLayoutMeasuredItemProvider0, boolean z, boolean z1, int v3, boolean z2, int v4, int v5, @NotNull CoroutineScope coroutineScope0, @NotNull GraphicsContext graphicsContext0) {
        int v64;
        MutableScatterMap mutableScatterMap6;
        int[] arr_v9;
        int v59;
        ArrayList arrayList12;
        MutableScatterMap mutableScatterMap5;
        ArrayList arrayList11;
        int[] arr_v7;
        ArrayList arrayList9;
        LazyLayoutItemAnimation[] arr_lazyLayoutItemAnimation6;
        ArrayList arrayList8;
        LazyLayoutItemAnimation[] arr_lazyLayoutItemAnimation4;
        MutableScatterMap mutableScatterMap4;
        ArrayList arrayList7;
        int[] arr_v6;
        Object[] arr_object2;
        long[] arr_v5;
        ArrayList arrayList6;
        int v43;
        MutableScatterSet mutableScatterSet1;
        MutableScatterMap mutableScatterMap3;
        long v33;
        MutableScatterMap mutableScatterMap2;
        int v31;
        long v30;
        int v29;
        MutableScatterMap mutableScatterMap1;
        int v24;
        int v23;
        ArrayList arrayList2;
        ArrayList arrayList1;
        ArrayList arrayList0;
        long[] arr_v1;
        long v16;
        MutableScatterMap mutableScatterMap0;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap1 = this.b;
        this.b = lazyLayoutKeyIndexMap0;
        int v6 = list0.size();
    alab1:
        for(int v7 = 0; true; ++v7) {
            mutableScatterMap0 = this.a;
            if(v7 >= v6) {
                if(mutableScatterMap0.isEmpty()) {
                    this.reset();
                    return;
                }
                break;
            }
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem0 = (LazyLayoutMeasuredItem)list0.get(v7);
            int v8 = lazyLayoutMeasuredItem0.getPlaceablesCount();
            for(int v9 = 0; v9 < v8; ++v9) {
                if(LazyLayoutItemAnimatorKt.access$getSpecs(lazyLayoutMeasuredItem0.getParentData(v9)) != null) {
                    break alab1;
                }
            }
        }
        int v10 = this.c;
        LazyLayoutMeasuredItem lazyLayoutMeasuredItem1 = (LazyLayoutMeasuredItem)CollectionsKt___CollectionsKt.firstOrNull(list0);
        this.c = lazyLayoutMeasuredItem1 == null ? 0 : lazyLayoutMeasuredItem1.getIndex();
        long v11 = z ? IntOffsetKt.IntOffset(0, v) : IntOffsetKt.IntOffset(v, 0);
        int v12 = z1 || !z2 ? 1 : 0;
        Object[] arr_object = mutableScatterMap0.keys;
        long[] arr_v = mutableScatterMap0.metadata;
        int v13 = arr_v.length - 2;
        MutableScatterSet mutableScatterSet0 = this.d;
        if(v13 >= 0) {
            int v14 = 0;
            while(true) {
                long v15 = arr_v[v14];
                v16 = v11;
                if((~v15 << 7 & v15 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_47;
                }
                int v17 = 8 - (~(v14 - v13) >>> 0x1F);
                int v18 = 0;
                while(v18 < v17) {
                    if((v15 & 0xFFL) < 0x80L) {
                        arr_v1 = arr_v;
                        mutableScatterSet0.add(arr_object[(v14 << 3) + v18]);
                    }
                    else {
                        arr_v1 = arr_v;
                    }
                    v15 >>= 8;
                    ++v18;
                    arr_v = arr_v1;
                }
                long[] arr_v2 = arr_v;
                if(v17 == 8) {
                    goto label_48;
                label_47:
                    arr_v2 = arr_v;
                label_48:
                    if(v14 != v13) {
                        ++v14;
                        v11 = v16;
                        arr_v = arr_v2;
                        continue;
                    }
                }
                break;
            }
        }
        else {
            v16 = v11;
        }
        int v19 = list0.size();
        int v20 = 0;
        while(true) {
            arrayList0 = this.i;
            arrayList1 = this.f;
            arrayList2 = this.e;
            if(v20 >= v19) {
                break;
            }
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = (LazyLayoutMeasuredItem)list0.get(v20);
            mutableScatterSet0.remove(lazyLayoutMeasuredItem2.getKey());
            int v21 = lazyLayoutMeasuredItem2.getPlaceablesCount();
            int v22 = 0;
            while(true) {
                if(v22 < v21) {
                    if(LazyLayoutItemAnimatorKt.access$getSpecs(lazyLayoutMeasuredItem2.getParentData(v22)) == null) {
                        ++v22;
                        continue;
                    }
                    else {
                        t t0 = (t)mutableScatterMap0.get(lazyLayoutMeasuredItem2.getKey());
                        if(lazyLayoutKeyIndexMap1 == null) {
                            v24 = v19;
                            v23 = -1;
                        }
                        else {
                            v23 = lazyLayoutKeyIndexMap1.getIndex(lazyLayoutMeasuredItem2.getKey());
                            v24 = v19;
                        }
                        boolean z3 = v23 == -1 && lazyLayoutKeyIndexMap1 != null;
                        if(t0 == null) {
                            t t1 = new t(this);
                            t1.a(lazyLayoutMeasuredItem2, coroutineScope0, graphicsContext0, v4, v5, LazyLayoutItemAnimator.access$getCrossAxisOffset(this, lazyLayoutMeasuredItem2));
                            mutableScatterMap0.set(lazyLayoutMeasuredItem2.getKey(), t1);
                            if(lazyLayoutMeasuredItem2.getIndex() == v23 || v23 == -1) {
                                long v25 = lazyLayoutMeasuredItem2.getOffset-Bjo55l4(0);
                                LazyLayoutItemAnimator.a(lazyLayoutMeasuredItem2, (lazyLayoutMeasuredItem2.isVertical() ? IntOffset.getY-impl(v25) : IntOffset.getX-impl(v25)), t1);
                                if(z3) {
                                    LazyLayoutItemAnimation[] arr_lazyLayoutItemAnimation = t1.a;
                                    for(int v26 = 0; v26 < arr_lazyLayoutItemAnimation.length; ++v26) {
                                        LazyLayoutItemAnimation lazyLayoutItemAnimation0 = arr_lazyLayoutItemAnimation[v26];
                                        if(lazyLayoutItemAnimation0 != null) {
                                            lazyLayoutItemAnimation0.animateAppearance();
                                        }
                                    }
                                }
                            }
                            else if(v23 < v10) {
                                arrayList2.add(lazyLayoutMeasuredItem2);
                            }
                            else {
                                arrayList1.add(lazyLayoutMeasuredItem2);
                            }
                        }
                        else if(v12 != 0) {
                            t0.a(lazyLayoutMeasuredItem2, coroutineScope0, graphicsContext0, v4, v5, LazyLayoutItemAnimator.access$getCrossAxisOffset(t0.h, lazyLayoutMeasuredItem2));
                            LazyLayoutItemAnimation[] arr_lazyLayoutItemAnimation1 = t0.a;
                            int v27 = arr_lazyLayoutItemAnimation1.length;
                            int v28 = 0;
                            while(v28 < v27) {
                                LazyLayoutItemAnimation lazyLayoutItemAnimation1 = arr_lazyLayoutItemAnimation1[v28];
                                if(lazyLayoutItemAnimation1 == null) {
                                    mutableScatterMap1 = mutableScatterMap0;
                                    v29 = v27;
                                }
                                else {
                                    mutableScatterMap1 = mutableScatterMap0;
                                    v29 = v27;
                                    if(!IntOffset.equals-impl0(lazyLayoutItemAnimation1.getRawOffset-nOcc-ac(), 0x7FFFFFFF7FFFFFFFL)) {
                                        v30 = v16;
                                        lazyLayoutItemAnimation1.setRawOffset--gyyYBs(IntOffset.plus-qkQi6aY(lazyLayoutItemAnimation1.getRawOffset-nOcc-ac(), v30));
                                        goto label_113;
                                    }
                                }
                                v30 = v16;
                            label_113:
                                ++v28;
                                v16 = v30;
                                mutableScatterMap0 = mutableScatterMap1;
                                v27 = v29;
                            }
                            v31 = v10;
                            mutableScatterMap2 = mutableScatterMap0;
                            if(z3) {
                                LazyLayoutItemAnimation[] arr_lazyLayoutItemAnimation2 = t0.a;
                                for(int v32 = 0; v32 < arr_lazyLayoutItemAnimation2.length; ++v32) {
                                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = arr_lazyLayoutItemAnimation2[v32];
                                    if(lazyLayoutItemAnimation2 != null) {
                                        if(lazyLayoutItemAnimation2.isDisappearanceAnimationInProgress()) {
                                            arrayList0.remove(lazyLayoutItemAnimation2);
                                            DrawModifierNode drawModifierNode0 = this.j;
                                            if(drawModifierNode0 != null) {
                                                DrawModifierNodeKt.invalidateDraw(drawModifierNode0);
                                            }
                                        }
                                        lazyLayoutItemAnimation2.animateAppearance();
                                    }
                                }
                            }
                            this.c(lazyLayoutMeasuredItem2, false);
                            v33 = v16;
                            break;
                        }
                        v31 = v10;
                        mutableScatterMap2 = mutableScatterMap0;
                        v33 = v16;
                        break;
                    }
                }
                v24 = v19;
                v31 = v10;
                mutableScatterMap2 = mutableScatterMap0;
                v33 = v16;
                this.b(lazyLayoutMeasuredItem2.getKey());
                break;
            }
            ++v20;
            v16 = v33;
            v10 = v31;
            mutableScatterMap0 = mutableScatterMap2;
            v19 = v24;
        }
        int[] arr_v3 = new int[v3];
        for(int v34 = 0; v34 < v3; ++v34) {
            arr_v3[v34] = 0;
        }
        if(v12 == 0 || lazyLayoutKeyIndexMap1 == null) {
            mutableScatterMap3 = mutableScatterMap0;
        }
        else {
            if(arrayList2.isEmpty()) {
                mutableScatterMap3 = mutableScatterMap0;
            }
            else {
                if(arrayList2.size() > 1) {
                    n.sortWith(arrayList2, new Comparator() {
                        @Override
                        public final int compare(Object object0, Object object1) {
                            Object object2 = ((LazyLayoutMeasuredItem)object1).getKey();
                            Integer integer0 = this.a.getIndex(object2);
                            Object object3 = ((LazyLayoutMeasuredItem)object0).getKey();
                            return c.compareValues(integer0, this.a.getIndex(object3));
                        }
                    });
                }
                int v35 = arrayList2.size();
                for(int v36 = 0; v36 < v35; ++v36) {
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem3 = (LazyLayoutMeasuredItem)arrayList2.get(v36);
                    int v37 = LazyLayoutItemAnimator.d(arr_v3, lazyLayoutMeasuredItem3);
                    Object object0 = mutableScatterMap0.get(lazyLayoutMeasuredItem3.getKey());
                    Intrinsics.checkNotNull(object0);
                    LazyLayoutItemAnimator.a(lazyLayoutMeasuredItem3, v4 - v37, ((t)object0));
                    this.c(lazyLayoutMeasuredItem3, false);
                }
                mutableScatterMap3 = mutableScatterMap0;
                ArraysKt___ArraysJvmKt.fill$default(arr_v3, 0, 0, 0, 6, null);
            }
            if(!arrayList1.isEmpty()) {
                if(arrayList1.size() > 1) {
                    n.sortWith(arrayList1, new Comparator() {
                        @Override
                        public final int compare(Object object0, Object object1) {
                            Object object2 = ((LazyLayoutMeasuredItem)object0).getKey();
                            Integer integer0 = this.a.getIndex(object2);
                            Object object3 = ((LazyLayoutMeasuredItem)object1).getKey();
                            return c.compareValues(integer0, this.a.getIndex(object3));
                        }
                    });
                }
                int v38 = arrayList1.size();
                for(int v39 = 0; v39 < v38; ++v39) {
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem4 = (LazyLayoutMeasuredItem)arrayList1.get(v39);
                    int v40 = LazyLayoutItemAnimator.d(arr_v3, lazyLayoutMeasuredItem4);
                    int v41 = lazyLayoutMeasuredItem4.getMainAxisSizeWithSpacings();
                    Object object1 = mutableScatterMap3.get(lazyLayoutMeasuredItem4.getKey());
                    Intrinsics.checkNotNull(object1);
                    LazyLayoutItemAnimator.a(lazyLayoutMeasuredItem4, v40 + v5 - v41, ((t)object1));
                    this.c(lazyLayoutMeasuredItem4, false);
                }
                ArraysKt___ArraysJvmKt.fill$default(arr_v3, 0, 0, 0, 6, null);
            }
        }
        Object[] arr_object1 = mutableScatterSet0.elements;
        long[] arr_v4 = mutableScatterSet0.metadata;
        int v42 = arr_v4.length - 2;
        ArrayList arrayList3 = this.h;
        ArrayList arrayList4 = this.g;
        if(v42 >= 0) {
            mutableScatterSet1 = mutableScatterSet0;
            v43 = v12;
            int v44 = 0;
            while(true) {
                long v45 = arr_v4[v44];
                ArrayList arrayList5 = arrayList3;
                arrayList6 = arrayList2;
                if((~v45 << 7 & v45 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_326;
                }
                int v46 = 8 - (~(v44 - v42) >>> 0x1F);
                int v47 = 0;
                while(v47 < v46) {
                    if((v45 & 0xFFL) < 0x80L) {
                        arr_v5 = arr_v4;
                        Object object2 = arr_object1[(v44 << 3) + v47];
                        Object object3 = mutableScatterMap3.get(object2);
                        Intrinsics.checkNotNull(object3);
                        arr_object2 = arr_object1;
                        t t2 = (t)object3;
                        arr_v6 = arr_v3;
                        arrayList7 = arrayList1;
                        int v48 = lazyLayoutKeyIndexMap0.getIndex(object2);
                        mutableScatterMap4 = mutableScatterMap3;
                        int v49 = Math.min(v3, t2.e);
                        t2.e = v49;
                        t2.d = Math.min(v3 - v49, t2.d);
                        if(v48 == -1) {
                            LazyLayoutItemAnimation[] arr_lazyLayoutItemAnimation3 = t2.a;
                            int v50 = arr_lazyLayoutItemAnimation3.length;
                            int v51 = 0;
                            boolean z4 = false;
                            int v52 = 0;
                            while(v51 < v50) {
                                LazyLayoutItemAnimation lazyLayoutItemAnimation3 = arr_lazyLayoutItemAnimation3[v51];
                                if(lazyLayoutItemAnimation3 == null) {
                                    arr_lazyLayoutItemAnimation4 = arr_lazyLayoutItemAnimation3;
                                }
                                else if(lazyLayoutItemAnimation3.isDisappearanceAnimationInProgress()) {
                                    arr_lazyLayoutItemAnimation4 = arr_lazyLayoutItemAnimation3;
                                    z4 = true;
                                }
                                else if(lazyLayoutItemAnimation3.isDisappearanceAnimationFinished()) {
                                    lazyLayoutItemAnimation3.release();
                                    arr_lazyLayoutItemAnimation4 = arr_lazyLayoutItemAnimation3;
                                    t2.a[v52] = null;
                                    arrayList0.remove(lazyLayoutItemAnimation3);
                                    DrawModifierNode drawModifierNode1 = this.j;
                                    if(drawModifierNode1 != null) {
                                        DrawModifierNodeKt.invalidateDraw(drawModifierNode1);
                                    }
                                }
                                else {
                                    arr_lazyLayoutItemAnimation4 = arr_lazyLayoutItemAnimation3;
                                    if(lazyLayoutItemAnimation3.getLayer() != null) {
                                        lazyLayoutItemAnimation3.animateDisappearance();
                                    }
                                    if(lazyLayoutItemAnimation3.isDisappearanceAnimationInProgress()) {
                                        arrayList0.add(lazyLayoutItemAnimation3);
                                        DrawModifierNode drawModifierNode2 = this.j;
                                        if(drawModifierNode2 != null) {
                                            DrawModifierNodeKt.invalidateDraw(drawModifierNode2);
                                        }
                                        z4 = true;
                                    }
                                    else {
                                        lazyLayoutItemAnimation3.release();
                                        t2.a[v52] = null;
                                    }
                                }
                                ++v51;
                                ++v52;
                                arr_lazyLayoutItemAnimation3 = arr_lazyLayoutItemAnimation4;
                            }
                            if(!z4) {
                                this.b(object2);
                            }
                            arrayList8 = arrayList0;
                            goto label_306;
                        }
                        else {
                            Constraints constraints0 = t2.b;
                            Intrinsics.checkNotNull(constraints0);
                            LazyLayoutMeasuredItem lazyLayoutMeasuredItem5 = lazyLayoutMeasuredItemProvider0.getAndMeasure--hBUhpc(v48, t2.d, t2.e, constraints0.unbox-impl());
                            lazyLayoutMeasuredItem5.setNonScrollableItem(true);
                            LazyLayoutItemAnimation[] arr_lazyLayoutItemAnimation5 = t2.a;
                            arrayList8 = arrayList0;
                            int v53 = arr_lazyLayoutItemAnimation5.length;
                            int v54 = 0;
                            while(v54 < v53) {
                                LazyLayoutItemAnimation lazyLayoutItemAnimation4 = arr_lazyLayoutItemAnimation5[v54];
                                if(lazyLayoutItemAnimation4 == null) {
                                label_286:
                                    arr_lazyLayoutItemAnimation6 = arr_lazyLayoutItemAnimation5;
                                }
                                else {
                                    if(lazyLayoutItemAnimation4.isPlacementAnimationInProgress()) {
                                        goto label_293;
                                    }
                                    else {
                                        arr_lazyLayoutItemAnimation6 = arr_lazyLayoutItemAnimation5;
                                        goto label_287;
                                    }
                                    goto label_286;
                                }
                            label_287:
                                ++v54;
                                arr_lazyLayoutItemAnimation5 = arr_lazyLayoutItemAnimation6;
                            }
                            if(lazyLayoutKeyIndexMap1 != null && v48 == lazyLayoutKeyIndexMap1.getIndex(object2)) {
                                this.b(object2);
                                goto label_306;
                            }
                        label_293:
                            t2.a(lazyLayoutMeasuredItem5, coroutineScope0, graphicsContext0, v4, v5, t2.c);
                            if(v48 < this.c) {
                                arrayList4.add(lazyLayoutMeasuredItem5);
                                goto label_306;
                            }
                            else {
                                arrayList9 = arrayList5;
                                arrayList9.add(lazyLayoutMeasuredItem5);
                                goto label_307;
                            }
                        }
                        goto label_300;
                    }
                    else {
                    label_300:
                        arr_v6 = arr_v3;
                        arr_object2 = arr_object1;
                        arr_v5 = arr_v4;
                        arrayList8 = arrayList0;
                        arrayList7 = arrayList1;
                        mutableScatterMap4 = mutableScatterMap3;
                    }
                label_306:
                    arrayList9 = arrayList5;
                label_307:
                    v45 >>= 8;
                    ++v47;
                    arrayList5 = arrayList9;
                    arrayList1 = arrayList7;
                    arr_v4 = arr_v5;
                    arr_object1 = arr_object2;
                    arrayList0 = arrayList8;
                    arr_v3 = arr_v6;
                    mutableScatterMap3 = mutableScatterMap4;
                }
                arr_v7 = arr_v3;
                Object[] arr_object3 = arr_object1;
                long[] arr_v8 = arr_v4;
                ArrayList arrayList10 = arrayList0;
                arrayList11 = arrayList1;
                mutableScatterMap5 = mutableScatterMap3;
                arrayList12 = arrayList5;
                if(v46 == 8) {
                    goto label_333;
                label_326:
                    arr_v7 = arr_v3;
                    arr_object3 = arr_object1;
                    arr_v8 = arr_v4;
                    arrayList10 = arrayList0;
                    arrayList11 = arrayList1;
                    mutableScatterMap5 = mutableScatterMap3;
                    arrayList12 = arrayList5;
                label_333:
                    if(v44 != v42) {
                        ++v44;
                        arrayList3 = arrayList12;
                        arrayList2 = arrayList6;
                        arrayList1 = arrayList11;
                        arr_v4 = arr_v8;
                        arr_object1 = arr_object3;
                        arrayList0 = arrayList10;
                        arr_v3 = arr_v7;
                        mutableScatterMap3 = mutableScatterMap5;
                        continue;
                    }
                }
                break;
            }
        }
        else {
            arr_v7 = arr_v3;
            arrayList11 = arrayList1;
            mutableScatterSet1 = mutableScatterSet0;
            v43 = v12;
            arrayList12 = arrayList3;
            arrayList6 = arrayList2;
            mutableScatterMap5 = mutableScatterMap3;
        }
        if(arrayList4.isEmpty()) {
            arr_v9 = arr_v7;
            mutableScatterMap6 = mutableScatterMap5;
        }
        else {
            if(arrayList4.size() > 1) {
                n.sortWith(arrayList4, new Comparator() {
                    @Override
                    public final int compare(Object object0, Object object1) {
                        Object object2 = ((LazyLayoutMeasuredItem)object1).getKey();
                        Integer integer0 = this.a.getIndex(object2);
                        Object object3 = ((LazyLayoutMeasuredItem)object0).getKey();
                        return c.compareValues(integer0, this.a.getIndex(object3));
                    }
                });
            }
            int v55 = arrayList4.size();
            for(int v56 = 0; v56 < v55; ++v56) {
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem6 = (LazyLayoutMeasuredItem)arrayList4.get(v56);
                Object object4 = mutableScatterMap5.get(lazyLayoutMeasuredItem6.getKey());
                Intrinsics.checkNotNull(object4);
                t t3 = (t)object4;
                int v57 = LazyLayoutItemAnimator.d(arr_v7, lazyLayoutMeasuredItem6);
                if(z1) {
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem7 = (LazyLayoutMeasuredItem)CollectionsKt___CollectionsKt.first(list0);
                    long v58 = lazyLayoutMeasuredItem7.getOffset-Bjo55l4(0);
                    v59 = lazyLayoutMeasuredItem7.isVertical() ? IntOffset.getY-impl(v58) : IntOffset.getX-impl(v58);
                }
                else {
                    v59 = t3.f;
                }
                lazyLayoutMeasuredItem6.position(v59 - v57, t3.c, v1, v2);
                if(v43 != 0) {
                    this.c(lazyLayoutMeasuredItem6, true);
                }
            }
            arr_v9 = arr_v7;
            mutableScatterMap6 = mutableScatterMap5;
            ArraysKt___ArraysJvmKt.fill$default(arr_v9, 0, 0, 0, 6, null);
        }
        if(!arrayList12.isEmpty()) {
            if(arrayList12.size() > 1) {
                n.sortWith(arrayList12, new Comparator() {
                    @Override
                    public final int compare(Object object0, Object object1) {
                        Object object2 = ((LazyLayoutMeasuredItem)object0).getKey();
                        Integer integer0 = this.a.getIndex(object2);
                        Object object3 = ((LazyLayoutMeasuredItem)object1).getKey();
                        return c.compareValues(integer0, this.a.getIndex(object3));
                    }
                });
            }
            int v60 = arrayList12.size();
            for(int v61 = 0; v61 < v60; ++v61) {
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem8 = (LazyLayoutMeasuredItem)arrayList12.get(v61);
                Object object5 = mutableScatterMap6.get(lazyLayoutMeasuredItem8.getKey());
                Intrinsics.checkNotNull(object5);
                t t4 = (t)object5;
                int v62 = LazyLayoutItemAnimator.d(arr_v9, lazyLayoutMeasuredItem8);
                if(z1) {
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem9 = (LazyLayoutMeasuredItem)CollectionsKt___CollectionsKt.last(list0);
                    long v63 = lazyLayoutMeasuredItem9.getOffset-Bjo55l4(0);
                    v64 = lazyLayoutMeasuredItem9.isVertical() ? IntOffset.getY-impl(v63) : IntOffset.getX-impl(v63);
                }
                else {
                    v64 = t4.g - lazyLayoutMeasuredItem8.getMainAxisSizeWithSpacings();
                }
                lazyLayoutMeasuredItem8.position(v64 + v62, t4.c, v1, v2);
                if(v43 != 0) {
                    this.c(lazyLayoutMeasuredItem8, true);
                }
            }
        }
        q.reverse(arrayList4);
        list0.addAll(0, arrayList4);
        list0.addAll(arrayList12);
        arrayList6.clear();
        arrayList11.clear();
        arrayList4.clear();
        arrayList12.clear();
        mutableScatterSet1.clear();
    }

    public final void reset() {
        MutableScatterMap mutableScatterMap0 = this.a;
        if(mutableScatterMap0.isNotEmpty()) {
            Object[] arr_object = mutableScatterMap0.values;
            long[] arr_v = mutableScatterMap0.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_27;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            LazyLayoutItemAnimation[] arr_lazyLayoutItemAnimation = ((t)arr_object[(v1 << 3) + v4]).a;
                            for(int v5 = 0; v5 < arr_lazyLayoutItemAnimation.length; ++v5) {
                                LazyLayoutItemAnimation lazyLayoutItemAnimation0 = arr_lazyLayoutItemAnimation[v5];
                                if(lazyLayoutItemAnimation0 != null) {
                                    lazyLayoutItemAnimation0.release();
                                }
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                    label_27:
                        if(v1 != v) {
                            ++v1;
                            continue;
                        }
                        break;
                    }
                    else {
                        mutableScatterMap0.clear();
                    }
                    this.b = LazyLayoutKeyIndexMap.Empty;
                    this.c = -1;
                    return;
                }
            }
            mutableScatterMap0.clear();
        }
        this.b = LazyLayoutKeyIndexMap.Empty;
        this.c = -1;
    }
}

