package androidx.compose.foundation.text.selection;

import android.graphics.RectF;
import android.widget.Toast;
import androidx.collection.LongObjectMap;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.y;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material.SnackbarData;
import androidx.compose.material.TextKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material3.ClockDialNode;
import androidx.compose.material3.DateRangePickerState;
import androidx.compose.material3.DrawerPredictiveBackState;
import androidx.compose.material3.ModalBottomSheetKt.ModalBottomSheetContent.3.1.WhenMappings;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.f4;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.td;
import androidx.compose.material3.wd;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.paging.HintHandlerKt;
import androidx.paging.LoadType;
import androidx.paging.ViewportHint;
import com.kakao.kphotopicker.PhotoPickerActivity;
import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.LoginClient;
import com.kakao.sdk.auth.model.OAuthToken;
import java.util.Set;
import java.util.concurrent.CompletionException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import s4.d0;
import sb.b;
import z.l2;

public final class b1 extends Lambda implements Function2 {
    public final int w;
    public final Object x;

    public b1(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                boolean z = ((Boolean)object0).booleanValue();
                SelectionManager selectionManager0 = (SelectionManager)this.x;
                Pair pair0 = selectionManager0.selectAllInSelectable$foundation_release(((Number)object1).longValue(), selectionManager0.getSelection());
                Selection selection0 = (Selection)pair0.component1();
                LongObjectMap longObjectMap0 = (LongObjectMap)pair0.component2();
                if(!Intrinsics.areEqual(selection0, selectionManager0.getSelection())) {
                    selectionManager0.a.setSubselections(longObjectMap0);
                    selectionManager0.getOnSelectionChange().invoke(selection0);
                }
                selectionManager0.setInTouchMode(z);
                selectionManager0.getFocusRequester().requestFocus();
                selectionManager0.setShowToolbar$foundation_release(false);
                return Unit.INSTANCE;
            }
            case 1: {
                PointerInputChange pointerInputChange0 = (PointerInputChange)object0;
                BuildersKt.launch$default(((ClockDialNode)this.x).getCoroutineScope(), null, null, new f4(((ClockDialNode)this.x), ((Offset)object1).unbox-impl(), null), 3, null);
                TimePickerKt.access$moveSelector-d3b8Pxo(ClockDialNode.access$getState$p(((ClockDialNode)this.x)), ClockDialNode.access$getOffsetX$p(((ClockDialNode)this.x)), ClockDialNode.access$getOffsetY$p(((ClockDialNode)this.x)), ClockDialNode.access$getMaxDist(((ClockDialNode)this.x)), ClockDialNode.access$getCenter$p(((ClockDialNode)this.x)));
                return Unit.INSTANCE;
            }
            case 2: {
                Long long0 = (Long)object0;
                Long long1 = (Long)object1;
                try {
                    ((DateRangePickerState)this.x).setSelection(long0, long1);
                }
                catch(IllegalArgumentException unused_ex) {
                }
                return Unit.INSTANCE;
            }
            case 3: {
                DraggableAnchors draggableAnchors0 = AnchoredDraggableKt.DraggableAnchors(new wd(((float)Constraints.getMaxHeight-impl(((Constraints)object1).unbox-impl())), ((IntSize)object0).unbox-impl(), ((SheetState)this.x)));
                switch(ModalBottomSheetKt.ModalBottomSheetContent.3.1.WhenMappings.$EnumSwitchMapping$0[((SheetValue)((SheetState)this.x).getAnchoredDraggableState$material3_release().getTargetValue()).ordinal()]) {
                    case 1: {
                        return TuplesKt.to(draggableAnchors0, SheetValue.Hidden);
                    }
                    case 2: 
                    case 3: {
                        SheetValue sheetValue0 = SheetValue.PartiallyExpanded;
                        if(!draggableAnchors0.hasAnchorFor(sheetValue0)) {
                            return draggableAnchors0.hasAnchorFor(SheetValue.Expanded) ? TuplesKt.to(draggableAnchors0, SheetValue.Expanded) : TuplesKt.to(draggableAnchors0, SheetValue.Hidden);
                        }
                        return TuplesKt.to(draggableAnchors0, sheetValue0);
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            case 4: {
                int v = ((Number)object1).intValue();
                ((Composer)object0).startReplaceGroup(-2061903609);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2061903609, v, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:258)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object0).endReplaceGroup();
                return (WindowInsets)this.x;
            }
            case 5: {
                ((Number)object1).floatValue();
                ((DrawerPredictiveBackState)this.x).setScaleXDistance(((Number)object0).floatValue());
                return Unit.INSTANCE;
            }
            case 6: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xD8E40040, v1, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:258)");
                }
                ((AbstractComposeView)this.x).Content(((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 7: {
                Rect rect0 = RectHelper_androidKt.toComposeRect(((RectF)object0));
                Rect rect1 = RectHelper_androidKt.toComposeRect(((RectF)object1));
                return Boolean.valueOf(((TextInclusionStrategy)this.x).isIncluded(rect0, rect1));
            }
            case 8: {
                NodeCoordinator nodeCoordinator0 = (NodeCoordinator)this.x;
                if(nodeCoordinator0.getLayoutNode().isPlaced()) {
                    NodeCoordinator.access$getSnapshotObserver(nodeCoordinator0).observeReads$ui_release(nodeCoordinator0, NodeCoordinator.access$getOnCommitAffectingLayer$cp(), new td(nodeCoordinator0, ((Canvas)object0), 4, ((GraphicsLayer)object1)));
                    NodeCoordinator.access$setLastLayerDrawingWasSkipped$p(nodeCoordinator0, false);
                    return Unit.INSTANCE;
                }
                NodeCoordinator.access$setLastLayerDrawingWasSkipped$p(nodeCoordinator0, true);
                return Unit.INSTANCE;
            }
            case 9: {
                ((PagerState)this.x).updateTargetPage(((ScrollScope)object0), ((Number)object1).intValue());
                return Unit.INSTANCE;
            }
            case 10: {
                Snapshot snapshot0 = (Snapshot)object1;
                SnapshotStateObserver snapshotStateObserver0 = (SnapshotStateObserver)this.x;
                SnapshotStateObserver.access$addChanges(snapshotStateObserver0, ((Set)object0));
                if(SnapshotStateObserver.access$drainChanges(snapshotStateObserver0)) {
                    SnapshotStateObserver.access$sendNotifications(snapshotStateObserver0);
                }
                return Unit.INSTANCE;
            }
            case 11: {
                SaverScope saverScope0 = (SaverScope)object0;
                long v2 = ((Number)object1).longValue();
                return SelectionRegistrarKt.hasSelection(((SelectionRegistrar)this.x), v2) ? v2 : null;
            }
            case 12: {
                String s = ((PhotoPickerActivity)this.x).getResources().getString(((Number)object0).intValue(), new Object[]{((Number)object1).intValue()});
                Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
                Toast.makeText(((PhotoPickerActivity)this.x), s, 0).show();
                return Unit.INSTANCE;
            }
            case 13: {
                int v3 = ((Number)object1).intValue();
                if((v3 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xF0648CE7, v3, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:176)");
                }
                TextKt.Text--4IGK_g(((SnackbarData)this.x).getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((Composer)object0), 0, 0, 0x1FFFE);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 14: {
                return ((EnterExitState)object0) != EnterExitState.PostExit || ((EnterExitState)object1) != EnterExitState.PostExit || ((ExitTransition)this.x).getData$animation_release().getHold() ? false : true;
            }
            case 15: {
                Intrinsics.checkNotNullParameter(((d0)object0), "prependHint");
                Intrinsics.checkNotNullParameter(((d0)object1), "appendHint");
                ViewportHint viewportHint0 = ((d0)object0).a;
                ViewportHint viewportHint1 = (ViewportHint)this.x;
                if(HintHandlerKt.shouldPrioritizeOver(viewportHint1, viewportHint0, LoadType.PREPEND)) {
                    ((d0)object0).a = viewportHint1;
                    if(viewportHint1 != null) {
                        ((d0)object0).b.tryEmit(viewportHint1);
                    }
                }
                if(HintHandlerKt.shouldPrioritizeOver(viewportHint1, ((d0)object1).a, LoadType.APPEND)) {
                    ((d0)object1).a = viewportHint1;
                    if(viewportHint1 != null) {
                        ((d0)object1).b.tryEmit(viewportHint1);
                    }
                }
                return Unit.INSTANCE;
            }
            case 16: {
                ((b)this.x).y.invoke(((OAuthToken)object0), ((Throwable)object1));
                return Unit.INSTANCE;
            }
            case 17: {
                ((b)this.x).y.invoke(((OAuthToken)object0), ((Throwable)object1));
                return Unit.INSTANCE;
            }
            case 18: {
                ((Function2)((z)((b1)this.x).x).A).invoke(((OAuthToken)object0), ((Throwable)object1));
                return Unit.INSTANCE;
            }
            case 19: {
                z z1 = (z)this.x;
                if(((Throwable)object1) != null) {
                    ((Function2)z1.A).invoke(null, ((Throwable)object1));
                    return Unit.INSTANCE;
                }
                AuthApiClient authApiClient0 = LoginClient.access$getAuthApiClient$p(((LoginClient)z1.x));
                if(((String)object0) == null) {
                    Intrinsics.throwNpe();
                }
                authApiClient0.issueAccessToken(((String)object0), new b1(this, 18));
                return Unit.INSTANCE;
            }
            case 20: {
                ((Number)object1).floatValue();
                PullRefreshState.access$set_position(((PullRefreshState)this.x), ((Number)object0).floatValue());
                return Unit.INSTANCE;
            }
            case 21: {
                int v4 = ((Number)object1).intValue();
                if((v4 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xD9B6ABEF, v4, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:39)");
                }
                ((Composer)object0).insertMovableContent(((MovableContent)this.x), Unit.INSTANCE);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 22: {
                Throwable throwable0 = (Throwable)object1;
                CompletableDeferred completableDeferred0 = (CompletableDeferred)this.x;
                try {
                    if(throwable0 == null) {
                        return Boolean.valueOf(completableDeferred0.complete(object0));
                    }
                    CompletionException completionException0 = throwable0 instanceof CompletionException ? ((CompletionException)throwable0) : null;
                    if(completionException0 != null) {
                        Throwable throwable2 = completionException0.getCause();
                        if(throwable2 != null) {
                            throwable0 = throwable2;
                        }
                    }
                    return Boolean.valueOf(completableDeferred0.completeExceptionally(throwable0));
                }
                catch(Throwable throwable1) {
                }
                CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, throwable1);
                return Unit.INSTANCE;
            }
            default: {
                BuildersKt.launch$default(((y)this.x).getCoroutineScope(), null, null, new l2(((y)this.x), ((Number)object0).floatValue(), ((Number)object1).floatValue(), null), 3, null);
                return true;
            }
        }
    }
}

