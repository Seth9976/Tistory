package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.c;
import s.i1;
import s.j1;

@ExperimentalSharedTransitionApi
@Stable
@Metadata(d1 = {"\u0000\u00BE\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001B\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001rB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0010\u001A\u00020\n*\u00020\b2\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\fH\u0096\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0014\u0010\u0011\u001A\u00020\b*\u00020\bH\u0096\u0001\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001A\u00020\u0013*\u00020\u0013H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u001F\u001A\u00020\u0013*\u00020\u00132\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\f0\u00162\u0006\u0010\u0019\u001A\u00020\u00182\u001A\u0010\u001E\u001A\u0016\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u001C\u0012\u0006\u0012\u0004\u0018\u00010\u001D0\u001AH\u0016\u00A2\u0006\u0004\b\u001F\u0010 JK\u0010+\u001A\u00020\u0013*\u00020\u00132\u0006\u0010\"\u001A\u00020!2\u0006\u0010$\u001A\u00020#2\u0006\u0010&\u001A\u00020%2\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\f2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001E\u001A\u00020*H\u0016\u00A2\u0006\u0004\b+\u0010,Jc\u00104\u001A\u00020\u0013*\u00020\u00132\u0006\u0010-\u001A\u00020!2\u0006\u0010$\u001A\u00020#2\u0006\u0010/\u001A\u00020.2\u0006\u00101\u001A\u0002002\u0006\u0010&\u001A\u00020%2\u0006\u00103\u001A\u0002022\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\f2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001E\u001A\u00020*H\u0016\u00A2\u0006\u0004\b4\u00105JK\u00107\u001A\u00020\u0013*\u00020\u00132\u0006\u0010-\u001A\u00020!2\u0006\u00106\u001A\u00020\f2\u0006\u0010&\u001A\u00020%2\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\f2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001E\u001A\u00020*H\u0016\u00A2\u0006\u0004\b7\u00108JU\u0010:\u001A\u00020\u0013*\u00020\u00132\u0006\u0010-\u001A\u00020!2\u0006\u00106\u001A\u00020\f2\b\b\u0002\u0010&\u001A\u00020%2\b\b\u0002\u0010(\u001A\u00020\'2\b\b\u0002\u0010)\u001A\u00020\f2\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001E\u001A\u00020*H\u0000\u00A2\u0006\u0004\b9\u00108J\u0017\u0010=\u001A\u00020*2\u0006\u0010<\u001A\u00020;H\u0016\u00A2\u0006\u0004\b=\u0010>J\u0017\u0010A\u001A\u00020!2\u0006\u0010@\u001A\u00020?H\u0017\u00A2\u0006\u0004\bA\u0010BJ\u0017\u0010H\u001A\u00020E2\u0006\u0010D\u001A\u00020CH\u0000\u00A2\u0006\u0004\bF\u0010GJ\u0017\u0010M\u001A\u00020E2\u0006\u0010J\u001A\u00020IH\u0000\u00A2\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001A\u00020E2\u0006\u0010J\u001A\u00020IH\u0000\u00A2\u0006\u0004\bN\u0010LJ\u0017\u0010T\u001A\u00020E2\u0006\u0010Q\u001A\u00020PH\u0000\u00A2\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001A\u00020E2\u0006\u0010Q\u001A\u00020PH\u0000\u00A2\u0006\u0004\bU\u0010SR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bW\u0010X\u001A\u0004\bY\u0010ZR+\u0010^\u001A\u00020\f2\u0006\u0010[\u001A\u00020\f8V@RX\u0096\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\\\u0010]\u001A\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010b\u001A\u00020\b8\u0000@\u0000X\u0080.\u00A2\u0006\u0012\n\u0004\bb\u0010c\u001A\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010k\u001A\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bh\u0010c\u001A\u0004\bi\u0010e\"\u0004\bj\u0010gR\u0018\u0010o\u001A\u00020\b*\u00020l8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bm\u0010nR\u0014\u0010q\u001A\u00020\b8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bp\u0010e\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006s"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl;", "Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Landroidx/compose/ui/layout/LookaheadScope;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "", "includeMotionFrameOfReference", "localLookaheadPositionOf-au-aQtc", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "localLookaheadPositionOf", "toLookaheadCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/Modifier;", "skipToLookaheadSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "renderInOverlay", "", "zIndexInOverlay", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "clipInOverlayDuringTransition", "renderInSharedTransitionScopeOverlay", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;FLkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "state", "Landroidx/compose/animation/AnimatedVisibilityScope;", "animatedVisibilityScope", "Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "placeHolderSize", "renderInOverlayDuringTransition", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "sharedElement", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "sharedContentState", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", "exit", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "resizeMode", "sharedBounds", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$ResizeMode;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "visible", "sharedElementWithCallerManagedVisibility", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;ZLandroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "sharedBoundsWithCallerManagedVisibility$animation_release", "sharedBoundsWithCallerManagedVisibility", "Landroidx/compose/ui/graphics/Shape;", "clipShape", "OverlayClip", "(Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "", "key", "rememberSharedContentState", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "scope", "", "drawInOverlay$animation_release", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "drawInOverlay", "Landroidx/compose/animation/SharedElementInternalState;", "sharedElementState", "onStateRemoved$animation_release", "(Landroidx/compose/animation/SharedElementInternalState;)V", "onStateRemoved", "onStateAdded$animation_release", "onStateAdded", "Landroidx/compose/animation/LayerRenderer;", "renderer", "onLayerRendererCreated$animation_release", "(Landroidx/compose/animation/LayerRenderer;)V", "onLayerRendererCreated", "onLayerRendererRemoved$animation_release", "onLayerRendererRemoved", "a", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "isTransitionActive", "()Z", "setTransitionActive", "(Z)V", "root", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getRoot$animation_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setRoot$animation_release", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "f", "getNullableLookaheadRoot$animation_release", "setNullableLookaheadRoot$animation_release", "nullableLookaheadRoot", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates", "getLookaheadRoot$animation_release", "lookaheadRoot", "androidx/compose/animation/s", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1337:1\n81#2:1338\n107#2,2:1339\n1223#3,6:1341\n1223#3,6:1429\n440#4:1347\n391#4,4:1348\n363#4,6:1352\n373#4,3:1359\n376#4,2:1363\n396#4:1365\n441#4,2:1366\n397#4:1368\n379#4,6:1369\n398#4:1375\n443#4:1376\n391#4,4:1377\n363#4,6:1381\n373#4,3:1388\n376#4,2:1392\n396#4,2:1394\n379#4,6:1396\n398#4:1402\n391#4,4:1403\n363#4,6:1407\n373#4,3:1414\n376#4,2:1418\n396#4,2:1420\n379#4,6:1422\n398#4:1428\n1810#5:1358\n1672#5:1362\n1810#5:1387\n1672#5:1391\n1810#5:1413\n1672#5:1417\n1002#6,2:1435\n350#6,7:1443\n33#7,6:1437\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n*L\n706#1:1338\n706#1:1339,2\n913#1:1341,6\n1033#1:1429,6\n929#1:1347\n929#1:1348,4\n929#1:1352,6\n929#1:1359,3\n929#1:1363,2\n929#1:1365\n929#1:1366,2\n929#1:1368\n929#1:1369,6\n929#1:1375\n929#1:1376\n935#1:1377,4\n935#1:1381,6\n935#1:1388,3\n935#1:1392,2\n935#1:1394,2\n935#1:1396,6\n935#1:1402\n940#1:1403,4\n940#1:1407,6\n940#1:1414,3\n940#1:1418,2\n940#1:1420,2\n940#1:1422,6\n940#1:1428\n929#1:1358\n929#1:1362\n935#1:1387\n935#1:1391\n940#1:1413\n940#1:1417\n1080#1:1435,2\n1119#1:1443,7\n1085#1:1437,6\n*E\n"})
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {
    public static final int $stable;
    public final CoroutineScope a;
    public final LookaheadScope b;
    public final MutableState c;
    public final e d;
    public final j1 e;
    public LayoutCoordinates f;
    public final SnapshotStateList g;
    public final MutableScatterMap h;
    public LayoutCoordinates root;

    public SharedTransitionScopeImpl(@NotNull LookaheadScope lookaheadScope0, @NotNull CoroutineScope coroutineScope0) {
        this.a = coroutineScope0;
        this.b = lookaheadScope0;
        this.c = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.d = new e(this, 16);
        this.e = new j1(this, 0);
        this.g = SnapshotStateKt.mutableStateListOf();
        this.h = new MutableScatterMap(0, 1, null);
    }

    @Override  // androidx.compose.animation.SharedTransitionScope
    @NotNull
    public OverlayClip OverlayClip(@NotNull Shape shape0) {
        return new s(shape0);
    }

    public static final SharedElementInternalState access$rememberSharedElementState(SharedTransitionScopeImpl sharedTransitionScopeImpl0, SharedElement sharedElement0, BoundsAnimation boundsAnimation0, PlaceHolderSize sharedTransitionScope$PlaceHolderSize0, boolean z, SharedContentState sharedTransitionScope$SharedContentState0, OverlayClip sharedTransitionScope$OverlayClip0, float f, boolean z1, Composer composer0, int v) {
        sharedTransitionScopeImpl0.getClass();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7B307374, v, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:1032)");
        }
        SharedElementInternalState sharedElementInternalState0 = composer0.rememberedValue();
        if(sharedElementInternalState0 == Composer.Companion.getEmpty()) {
            SharedElementInternalState sharedElementInternalState1 = new SharedElementInternalState(sharedElement0, boundsAnimation0, sharedTransitionScope$PlaceHolderSize0, z, sharedTransitionScope$OverlayClip0, z1, sharedTransitionScope$SharedContentState0, f);
            composer0.updateRememberedValue(sharedElementInternalState1);
            sharedElementInternalState0 = sharedElementInternalState1;
        }
        sharedTransitionScope$SharedContentState0.setInternalState$animation_release(sharedElementInternalState0);
        sharedElementInternalState0.setSharedElement(sharedElement0);
        sharedElementInternalState0.setRenderOnlyWhenVisible(z);
        sharedElementInternalState0.setBoundsAnimation(boundsAnimation0);
        sharedElementInternalState0.setPlaceHolderSize(sharedTransitionScope$PlaceHolderSize0);
        sharedElementInternalState0.setOverlayClip(sharedTransitionScope$OverlayClip0);
        sharedElementInternalState0.setZIndex(f);
        sharedElementInternalState0.setRenderInOverlayDuringTransition(z1);
        sharedElementInternalState0.setUserState(sharedTransitionScope$SharedContentState0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sharedElementInternalState0;
    }

    public static final SharedElement access$sharedElementsFor(SharedTransitionScopeImpl sharedTransitionScopeImpl0, Object object0) {
        MutableScatterMap mutableScatterMap0 = sharedTransitionScopeImpl0.h;
        SharedElement sharedElement0 = (SharedElement)mutableScatterMap0.get(object0);
        if(sharedElement0 == null) {
            sharedElement0 = new SharedElement(object0, sharedTransitionScopeImpl0);
            mutableScatterMap0.set(object0, sharedElement0);
        }
        return sharedElement0;
    }

    public static final void access$updateTransitionActiveness(SharedTransitionScopeImpl sharedTransitionScopeImpl0) {
        boolean z;
        MutableScatterMap mutableScatterMap0 = sharedTransitionScopeImpl0.h;
        Object[] arr_object = mutableScatterMap0.keys;
        Object[] arr_object1 = mutableScatterMap0.values;
        long[] arr_v = mutableScatterMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_24;
                }
                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                int v4 = 0;
                while(v4 < v3) {
                    if((v2 & 0xFFL) < 0x80L) {
                        int v5 = (v1 << 3) + v4;
                        Object object0 = arr_object[v5];
                        if(((SharedElement)arr_object1[v5]).isAnimating()) {
                            z = true;
                            goto label_30;
                        }
                    }
                    v2 >>= 8;
                    ++v4;
                }
                if(v3 == 8) {
                label_24:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    z = false;
                }
                goto label_30;
            }
        }
        z = false;
    label_30:
        if(z == sharedTransitionScopeImpl0.isTransitionActive()) {
        label_55:
            Object[] arr_object4 = mutableScatterMap0.keys;
            Object[] arr_object5 = mutableScatterMap0.values;
            long[] arr_v2 = mutableScatterMap0.metadata;
            int v12 = arr_v2.length - 2;
            if(v12 >= 0) {
                int v13 = 0;
                while(true) {
                    long v14 = arr_v2[v13];
                    if((~v14 << 7 & v14 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int v15 = 8 - (~(v13 - v12) >>> 0x1F);
                        for(int v16 = 0; v16 < v15; ++v16) {
                            if((v14 & 0xFFL) < 0x80L) {
                                int v17 = (v13 << 3) + v16;
                                Object object2 = arr_object4[v17];
                                ((SharedElement)arr_object5[v17]).updateMatch();
                            }
                            v14 >>= 8;
                        }
                        if(v15 == 8) {
                            goto label_74;
                        }
                        break;
                    }
                label_74:
                    if(v13 == v12) {
                        break;
                    }
                    ++v13;
                }
            }
        }
        else {
            sharedTransitionScopeImpl0.c.setValue(Boolean.valueOf(z));
            if(z) {
                goto label_55;
            }
            else {
                Object[] arr_object2 = mutableScatterMap0.keys;
                Object[] arr_object3 = mutableScatterMap0.values;
                long[] arr_v1 = mutableScatterMap0.metadata;
                int v6 = arr_v1.length - 2;
                if(v6 >= 0) {
                    int v7 = 0;
                    while(true) {
                        long v8 = arr_v1[v7];
                        if((~v8 << 7 & v8 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_52;
                        }
                        int v9 = 8 - (~(v7 - v6) >>> 0x1F);
                        for(int v10 = 0; v10 < v9; ++v10) {
                            if((v8 & 0xFFL) < 0x80L) {
                                int v11 = (v7 << 3) + v10;
                                Object object1 = arr_object2[v11];
                                ((SharedElement)arr_object3[v11]).onSharedTransitionFinished();
                            }
                            v8 >>= 8;
                        }
                        if(v9 == 8) {
                        label_52:
                            if(v7 != v6) {
                                ++v7;
                                continue;
                            }
                        }
                        goto label_55;
                    }
                }
                else {
                    goto label_55;
                }
            }
        }
        SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(sharedTransitionScopeImpl0, sharedTransitionScopeImpl0.e, sharedTransitionScopeImpl0.d);
    }

    public final void drawInOverlay$animation_release(@NotNull ContentDrawScope contentDrawScope0) {
        SnapshotStateList snapshotStateList0 = this.g;
        if(snapshotStateList0.size() > 1) {
            n.sortWith(snapshotStateList0, new androidx.compose.animation.SharedTransitionScopeImpl.drawInOverlay..inlined.sortBy.1());
        }
        int v = snapshotStateList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((LayerRenderer)snapshotStateList0.get(v1)).drawInOverlay(contentDrawScope0);
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000E\u0010\u0003\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0005\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n*L\n1#1,328:1\n1081#2,3:329\n*E\n"})
        public final class androidx.compose.animation.SharedTransitionScopeImpl.drawInOverlay..inlined.sortBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                float f = -1.0f;
                Float float0 = (float)(Float.compare(((LayerRenderer)object0).getZIndex(), 0.0f) != 0 || !(((LayerRenderer)object0) instanceof SharedElementInternalState) || ((SharedElementInternalState)(((LayerRenderer)object0))).getParentState() != null ? ((LayerRenderer)object0).getZIndex() : -1.0f);
                if(((LayerRenderer)object1).getZIndex() != 0.0f || !(((LayerRenderer)object1) instanceof SharedElementInternalState) || ((SharedElementInternalState)(((LayerRenderer)object1))).getParentState() != null) {
                    f = ((LayerRenderer)object1).getZIndex();
                }
                return c.compareValues(float0, f);
            }
        }

    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.a;
    }

    @NotNull
    public final LayoutCoordinates getLookaheadRoot$animation_release() {
        LayoutCoordinates layoutCoordinates0 = this.f;
        if(layoutCoordinates0 == null) {
            throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        }
        return layoutCoordinates0;
    }

    @Override  // androidx.compose.ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates getLookaheadScopeCoordinates(@NotNull PlacementScope placeable$PlacementScope0) {
        return this.b.getLookaheadScopeCoordinates(placeable$PlacementScope0);
    }

    @Nullable
    public final LayoutCoordinates getNullableLookaheadRoot$animation_release() {
        return this.f;
    }

    @NotNull
    public final LayoutCoordinates getRoot$animation_release() {
        LayoutCoordinates layoutCoordinates0 = this.root;
        if(layoutCoordinates0 != null) {
            return layoutCoordinates0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("root");
        return null;
    }

    @Override  // androidx.compose.animation.SharedTransitionScope
    public boolean isTransitionActive() {
        return ((Boolean)this.c.getValue()).booleanValue();
    }

    @Override  // androidx.compose.ui.layout.LookaheadScope
    public long localLookaheadPositionOf-au-aQtc(@NotNull LayoutCoordinates layoutCoordinates0, @NotNull LayoutCoordinates layoutCoordinates1, long v, boolean z) {
        return this.b.localLookaheadPositionOf-au-aQtc(layoutCoordinates0, layoutCoordinates1, v, z);
    }

    public final void onLayerRendererCreated$animation_release(@NotNull LayerRenderer layerRenderer0) {
        this.g.add(layerRenderer0);
    }

    public final void onLayerRendererRemoved$animation_release(@NotNull LayerRenderer layerRenderer0) {
        this.g.remove(layerRenderer0);
    }

    public final void onStateAdded$animation_release(@NotNull SharedElementInternalState sharedElementInternalState0) {
        SharedElement sharedElement0 = sharedElementInternalState0.getSharedElement();
        sharedElement0.addState(sharedElementInternalState0);
        this.e.invoke(this);
        SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(sharedElement0.getScope(), this.e, this.d);
        SnapshotStateList snapshotStateList0 = this.g;
        int v = 0;
        Iterator iterator0 = snapshotStateList0.iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                v = -1;
                break;
            }
            Object object0 = iterator0.next();
            LayerRenderer layerRenderer0 = (LayerRenderer)object0;
            SharedElement sharedElement1 = null;
            SharedElementInternalState sharedElementInternalState1 = layerRenderer0 instanceof SharedElementInternalState ? ((SharedElementInternalState)layerRenderer0) : null;
            if(sharedElementInternalState1 != null) {
                sharedElement1 = sharedElementInternalState1.getSharedElement();
            }
            if(Intrinsics.areEqual(sharedElement1, sharedElementInternalState0.getSharedElement())) {
                break;
            }
            ++v;
        }
        if(v != snapshotStateList0.size() - 1 && v != -1) {
            snapshotStateList0.add(v + 1, sharedElementInternalState0);
            return;
        }
        snapshotStateList0.add(sharedElementInternalState0);
    }

    public final void onStateRemoved$animation_release(@NotNull SharedElementInternalState sharedElementInternalState0) {
        SharedElement sharedElement0 = sharedElementInternalState0.getSharedElement();
        sharedElement0.removeState(sharedElementInternalState0);
        this.e.invoke(this);
        SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(sharedElement0.getScope(), this.e, this.d);
        this.g.remove(sharedElementInternalState0);
        if(sharedElement0.getStates().isEmpty()) {
            i1 i10 = new i1(sharedElement0, null);
            BuildersKt.launch$default(sharedElement0.getScope().a, null, null, i10, 3, null);
        }
    }

    @Override  // androidx.compose.animation.SharedTransitionScope
    @Composable
    @NotNull
    public SharedContentState rememberSharedContentState(@NotNull Object object0, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x2FAA7DF2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2FAA7DF2, v, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedContentState (SharedTransitionScope.kt:912)");
        }
        boolean z = composer0.changed(object0);
        SharedContentState sharedTransitionScope$SharedContentState0 = composer0.rememberedValue();
        if(z || sharedTransitionScope$SharedContentState0 == Composer.Companion.getEmpty()) {
            sharedTransitionScope$SharedContentState0 = new SharedContentState(object0);
            composer0.updateRememberedValue(sharedTransitionScope$SharedContentState0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return sharedTransitionScope$SharedContentState0;
    }

    @Override  // androidx.compose.animation.SharedTransitionScope
    @NotNull
    public Modifier renderInSharedTransitionScopeOverlay(@NotNull Modifier modifier0, @NotNull Function0 function00, float f, @NotNull Function2 function20) {
        return modifier0.then(new RenderInTransitionOverlayNodeElement(this, function00, f, function20));
    }

    public final void setNullableLookaheadRoot$animation_release(@Nullable LayoutCoordinates layoutCoordinates0) {
        this.f = layoutCoordinates0;
    }

    public final void setRoot$animation_release(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.root = layoutCoordinates0;
    }

    @Override  // androidx.compose.animation.SharedTransitionScope
    @NotNull
    public Modifier sharedBounds(@NotNull Modifier modifier0, @NotNull SharedContentState sharedTransitionScope$SharedContentState0, @NotNull AnimatedVisibilityScope animatedVisibilityScope0, @NotNull EnterTransition enterTransition0, @NotNull ExitTransition exitTransition0, @NotNull BoundsTransform boundsTransform0, @NotNull ResizeMode sharedTransitionScope$ResizeMode0, @NotNull PlaceHolderSize sharedTransitionScope$PlaceHolderSize0, boolean z, float f, @NotNull OverlayClip sharedTransitionScope$OverlayClip0) {
        return ComposedModifierKt.composed$default(ComposedModifierKt.composed$default(modifier0, null, new x(sharedTransitionScope$SharedContentState0, animatedVisibilityScope0.getTransition(), t.w, this, sharedTransitionScope$PlaceHolderSize0, false, sharedTransitionScope$OverlayClip0, f, z, boundsTransform0), 1, null), null, new w(animatedVisibilityScope0, enterTransition0, exitTransition0, sharedTransitionScope$SharedContentState0, sharedTransitionScope$ResizeMode0), 1, null);
    }

    @NotNull
    public final Modifier sharedBoundsWithCallerManagedVisibility$animation_release(@NotNull Modifier modifier0, @NotNull SharedContentState sharedTransitionScope$SharedContentState0, boolean z, @NotNull BoundsTransform boundsTransform0, @NotNull PlaceHolderSize sharedTransitionScope$PlaceHolderSize0, boolean z1, float f, @NotNull OverlayClip sharedTransitionScope$OverlayClip0) {
        return ComposedModifierKt.composed$default(modifier0, null, new x(sharedTransitionScope$SharedContentState0, null, new y(z), this, sharedTransitionScope$PlaceHolderSize0, false, sharedTransitionScope$OverlayClip0, f, z1, boundsTransform0), 1, null);
    }

    public static Modifier sharedBoundsWithCallerManagedVisibility$animation_release$default(SharedTransitionScopeImpl sharedTransitionScopeImpl0, Modifier modifier0, SharedContentState sharedTransitionScope$SharedContentState0, boolean z, BoundsTransform boundsTransform0, PlaceHolderSize sharedTransitionScope$PlaceHolderSize0, boolean z1, float f, OverlayClip sharedTransitionScope$OverlayClip0, int v, Object object0) {
        BoundsTransform boundsTransform1 = (v & 4) == 0 ? boundsTransform0 : SharedTransitionScopeKt.e;
        PlaceHolderSize sharedTransitionScope$PlaceHolderSize1 = (v & 8) == 0 ? sharedTransitionScope$PlaceHolderSize0 : PlaceHolderSize.Companion.getContentSize();
        boolean z2 = (v & 16) == 0 ? z1 : true;
        float f1 = (v & 0x20) == 0 ? f : 0.0f;
        return (v & 0x40) == 0 ? sharedTransitionScopeImpl0.sharedBoundsWithCallerManagedVisibility$animation_release(modifier0, sharedTransitionScope$SharedContentState0, z, boundsTransform1, sharedTransitionScope$PlaceHolderSize1, z2, f1, sharedTransitionScope$OverlayClip0) : sharedTransitionScopeImpl0.sharedBoundsWithCallerManagedVisibility$animation_release(modifier0, sharedTransitionScope$SharedContentState0, z, boundsTransform1, sharedTransitionScope$PlaceHolderSize1, z2, f1, SharedTransitionScopeKt.c);
    }

    @Override  // androidx.compose.animation.SharedTransitionScope
    @NotNull
    public Modifier sharedElement(@NotNull Modifier modifier0, @NotNull SharedContentState sharedTransitionScope$SharedContentState0, @NotNull AnimatedVisibilityScope animatedVisibilityScope0, @NotNull BoundsTransform boundsTransform0, @NotNull PlaceHolderSize sharedTransitionScope$PlaceHolderSize0, boolean z, float f, @NotNull OverlayClip sharedTransitionScope$OverlayClip0) {
        return ComposedModifierKt.composed$default(modifier0, null, new x(sharedTransitionScope$SharedContentState0, animatedVisibilityScope0.getTransition(), z.w, this, sharedTransitionScope$PlaceHolderSize0, true, sharedTransitionScope$OverlayClip0, f, z, boundsTransform0), 1, null);
    }

    @Override  // androidx.compose.animation.SharedTransitionScope
    @NotNull
    public Modifier sharedElementWithCallerManagedVisibility(@NotNull Modifier modifier0, @NotNull SharedContentState sharedTransitionScope$SharedContentState0, boolean z, @NotNull BoundsTransform boundsTransform0, @NotNull PlaceHolderSize sharedTransitionScope$PlaceHolderSize0, boolean z1, float f, @NotNull OverlayClip sharedTransitionScope$OverlayClip0) {
        return ComposedModifierKt.composed$default(modifier0, null, new x(sharedTransitionScope$SharedContentState0, null, new a0(z), this, sharedTransitionScope$PlaceHolderSize0, true, sharedTransitionScope$OverlayClip0, f, z1, boundsTransform0), 1, null);
    }

    @Override  // androidx.compose.animation.SharedTransitionScope
    @NotNull
    public Modifier skipToLookaheadSize(@NotNull Modifier modifier0) {
        return modifier0.then(new SkipToLookaheadElement(null, SharedTransitionScopeKt.a));
    }

    @Override  // androidx.compose.ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates layoutCoordinates0) {
        return this.b.toLookaheadCoordinates(layoutCoordinates0);
    }
}

