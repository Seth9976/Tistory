package j0;

import a5.b;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.SurfaceView;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.Transition.animateTo.1.1.invoke..inlined.onDispose.1;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt.createChildTransitionInternal.1.1.invoke..inlined.onDispose.1;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.KeyEventHelpers_androidKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.TextLinkScope.StyleAnnotation.1.1.invoke..inlined.onDispose.1;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.1;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.2;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.3;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.4;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material.BackdropScaffoldState;
import androidx.compose.material.BottomSheetScaffoldKt.BottomSheet.1.1.WhenMappings;
import androidx.compose.material.BottomSheetState;
import androidx.compose.material.BottomSheetValue;
import androidx.compose.material.DraggableAnchors;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.MutableWindowInsets;
import androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup.3.invoke..inlined.onDispose.1;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.NavHostKt.NavHost.26.1.invoke..inlined.onDispose.1;
import androidx.navigation.compose.NavHostKt.NavHost.27.1.invoke..inlined.onDispose.1;
import androidx.paging.AccessorState.BlockState;
import androidx.paging.AccessorState.PendingRequest;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.LoadStateAdapter;
import androidx.paging.LoadType;
import androidx.paging.PagingState;
import androidx.paging.a;
import androidx.paging.f1;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import com.kakao.kandinsky.signature.SignatureScreenKt;
import com.kakao.kandinsky.utils.Logger;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.picker.item.CameraItemView;
import io.reactivex.Flowable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p0.k5;
import p0.p0;
import p0.p1;
import s0.g;
import t.e0;
import u.n;

public final class b2 extends Lambda implements Function1 {
    public final int w;
    public final Object x;
    public final Object y;

    public b2(int v, Object object0, Object object1) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        BottomSheetValue bottomSheetValue0;
        switch(this.w) {
            case 0: {
                KeyEvent keyEvent0 = ((androidx.compose.ui.input.key.KeyEvent)object0).unbox-impl();
                if(((LegacyTextFieldState)this.x).getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.cancelsTextSelection-ZmokQxo(keyEvent0)) {
                    TextFieldSelectionManager.deselect-_kEHs6E$foundation_release$default(((TextFieldSelectionManager)this.y), null, 1, null);
                    return true;
                }
                return false;
            }
            case 1: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                ((TextLinkScope)this.x).d.add(((Function1)this.y));
                return new TextLinkScope.StyleAnnotation.1.1.invoke..inlined.onDispose.1(((TextLinkScope)this.x), ((Function1)this.y));
            }
            case 2: {
                StringBuilder stringBuilder0 = b.t((((EditCommand)this.x) == ((EditCommand)object0) ? " > " : "   "));
                stringBuilder0.append(EditProcessor.access$toStringForLog(((EditProcessor)this.y), ((EditCommand)object0)));
                return stringBuilder0.toString();
            }
            case 3: {
                Throwable throwable1 = (Throwable)object0;
                CompletableJob completableJob0 = (CompletableJob)this.x;
                if(completableJob0.isActive()) {
                    completableJob0.cancel(new AbortFlowException(((FlowCollector)this.y)));
                }
                return Unit.INSTANCE;
            }
            case 4: {
                return ((Boolean)((Function1)this.x).invoke(((DragAndDropEvent)object0))).booleanValue() ? ((DragAndDropTarget)this.y) : null;
            }
            case 5: {
                boolean z = ((TextFieldSelectionState)this.y).canCut();
                ContextMenuScope.item$default(((ContextMenuScope)object0), new androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.1(TextContextMenuItems.Cut), null, z, null, new TextFieldSelectionState_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.1(((ContextMenuState)this.x), ((TextFieldSelectionState)this.y)), 10, null);
                boolean z1 = ((TextFieldSelectionState)this.y).canCopy();
                ContextMenuScope.item$default(((ContextMenuScope)object0), new androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.1(TextContextMenuItems.Copy), null, z1, null, new TextFieldSelectionState_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.2(((ContextMenuState)this.x), ((TextFieldSelectionState)this.y)), 10, null);
                boolean z2 = ((TextFieldSelectionState)this.y).canPaste();
                ContextMenuScope.item$default(((ContextMenuScope)object0), new androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.1(TextContextMenuItems.Paste), null, z2, null, new TextFieldSelectionState_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.3(((ContextMenuState)this.x), ((TextFieldSelectionState)this.y)), 10, null);
                boolean z3 = ((TextFieldSelectionState)this.y).canSelectAll();
                ContextMenuScope.item$default(((ContextMenuScope)object0), new androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.1(TextContextMenuItems.SelectAll), null, z3, null, new TextFieldSelectionState_androidKt.contextMenuBuilder.1.invoke..inlined.TextItem.4(((ContextMenuState)this.x), ((TextFieldSelectionState)this.y)), 10, null);
                return Unit.INSTANCE;
            }
            case 6: {
                ItemClickListener itemClickListener0 = (ItemClickListener)this.x;
                if(itemClickListener0 != null) {
                    Intrinsics.checkNotNull(((Integer)object0));
                    itemClickListener0.click(((int)(((Integer)object0))), ((CameraItemView)this.y).getAdapterPosition());
                }
                return Unit.INSTANCE;
            }
            case 7: {
                DisposableEffectScope disposableEffectScope1 = (DisposableEffectScope)object0;
                ((NavHostController)this.x).setLifecycleOwner(((LifecycleOwner)this.y));
                return new NavHostKt.NavHost.26.1.invoke..inlined.onDispose.1();
            }
            case 8: {
                DisposableEffectScope disposableEffectScope2 = (DisposableEffectScope)object0;
                return new NavHostKt.NavHost.27.1.invoke..inlined.onDispose.1(((State)this.x), ((ComposeNavigator)this.y));
            }
            case 9: {
                BackdropScaffoldState backdropScaffoldState0 = (BackdropScaffoldState)this.x;
                boolean z4 = backdropScaffoldState0.isConcealed();
                CoroutineScope coroutineScope0 = (CoroutineScope)this.y;
                if(z4) {
                    SemanticsPropertiesKt.collapse$default(((SemanticsPropertyReceiver)object0), null, new p0(backdropScaffoldState0, coroutineScope0, 0), 1, null);
                    return Unit.INSTANCE;
                }
                SemanticsPropertiesKt.expand$default(((SemanticsPropertyReceiver)object0), null, new p0(backdropScaffoldState0, coroutineScope0, 1), 1, null);
                return Unit.INSTANCE;
            }
            case 10: {
                IntSize intSize0 = IntSize.box-impl(((IntSize)object0).unbox-impl());
                DraggableAnchors draggableAnchors0 = (DraggableAnchors)((Function1)this.x).invoke(intSize0);
                BottomSheetState bottomSheetState0 = (BottomSheetState)this.y;
                switch(BottomSheetScaffoldKt.BottomSheet.1.1.WhenMappings.$EnumSwitchMapping$0[((BottomSheetValue)bottomSheetState0.getAnchoredDraggableState$material_release().getTargetValue()).ordinal()]) {
                    case 1: {
                        bottomSheetValue0 = BottomSheetValue.Collapsed;
                        break;
                    }
                    case 2: {
                        bottomSheetValue0 = BottomSheetValue.Expanded;
                        if(!draggableAnchors0.hasAnchorFor(bottomSheetValue0)) {
                            bottomSheetValue0 = BottomSheetValue.Collapsed;
                        }
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                bottomSheetState0.getAnchoredDraggableState$material_release().updateAnchors(draggableAnchors0, bottomSheetValue0);
                return Unit.INSTANCE;
            }
            case 11: {
                BottomSheetState bottomSheetState1 = (BottomSheetState)this.x;
                if(bottomSheetState1.getAnchoredDraggableState$material_release().getAnchors().getSize() > 1) {
                    boolean z5 = bottomSheetState1.isCollapsed();
                    CoroutineScope coroutineScope1 = (CoroutineScope)this.y;
                    if(z5) {
                        SemanticsPropertiesKt.expand$default(((SemanticsPropertyReceiver)object0), null, new p1(bottomSheetState1, coroutineScope1, 0), 1, null);
                        return Unit.INSTANCE;
                    }
                    SemanticsPropertiesKt.collapse$default(((SemanticsPropertyReceiver)object0), null, new p1(bottomSheetState1, coroutineScope1, 1), 1, null);
                }
                return Unit.INSTANCE;
            }
            case 12: {
                ModalBottomSheetState modalBottomSheetState0 = (ModalBottomSheetState)this.x;
                if(modalBottomSheetState0.isVisible()) {
                    CoroutineScope coroutineScope2 = (CoroutineScope)this.y;
                    SemanticsPropertiesKt.dismiss$default(((SemanticsPropertyReceiver)object0), null, new k5(modalBottomSheetState0, coroutineScope2, 1), 1, null);
                    if(modalBottomSheetState0.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                        SemanticsPropertiesKt.expand$default(((SemanticsPropertyReceiver)object0), null, new k5(modalBottomSheetState0, coroutineScope2, 2), 1, null);
                        return Unit.INSTANCE;
                    }
                    if(modalBottomSheetState0.getHasHalfExpandedState$material_release()) {
                        SemanticsPropertiesKt.collapse$default(((SemanticsPropertyReceiver)object0), null, new k5(modalBottomSheetState0, coroutineScope2, 3), 1, null);
                    }
                }
                return Unit.INSTANCE;
            }
            case 13: {
                WindowInsets windowInsets0 = WindowInsetsKt.exclude(((WindowInsets)this.y), ((WindowInsets)object0));
                ((MutableWindowInsets)this.x).setInsets(windowInsets0);
                return Unit.INSTANCE;
            }
            case 14: {
                ((PreviewAnimationClock)this.x).a(((String)this.y));
                return Unit.INSTANCE;
            }
            case 15: {
                TextFieldValue textFieldValue0 = (TextFieldValue)object0;
                Intrinsics.checkNotNullParameter(textFieldValue0, "it");
                int v = IntSize.getWidth-impl(ReSizeScreenKt.access$ResizeScreen$lambda$0(((State)this.x)).getOriginalSize-YbymL2g());
                if(TextUtils.isDigitsOnly(textFieldValue0.getText()) && !Intrinsics.areEqual(textFieldValue0.getText(), "0")) {
                    if(ReSizeScreenKt.access$toIntOrZero(textFieldValue0) > v) {
                        String s = String.valueOf(v);
                        textFieldValue0 = new TextFieldValue(s, TextRangeKt.TextRange(StringsKt__StringsKt.getLastIndex(s) + 1), null, 4, null);
                    }
                    ReSizeScreenKt.access$ResizeScreen$lambda$9$lambda$3(((MutableState)this.y), textFieldValue0);
                }
                return Unit.INSTANCE;
            }
            case 16: {
                Density density0 = ((DrawScope)object0).getDrawContext().getDensity();
                LayoutDirection layoutDirection0 = ((DrawScope)object0).getDrawContext().getLayoutDirection();
                Canvas canvas0 = ((DrawScope)object0).getDrawContext().getCanvas();
                long v1 = ((DrawScope)object0).getDrawContext().getSize-NH-jbRc();
                GraphicsLayer graphicsLayer0 = ((DrawScope)object0).getDrawContext().getGraphicsLayer();
                Density density1 = ((DrawScope)this.x).getDrawContext().getDensity();
                LayoutDirection layoutDirection1 = ((DrawScope)this.x).getDrawContext().getLayoutDirection();
                Canvas canvas1 = ((DrawScope)this.x).getDrawContext().getCanvas();
                long v2 = ((DrawScope)this.x).getDrawContext().getSize-NH-jbRc();
                GraphicsLayer graphicsLayer1 = ((DrawScope)this.x).getDrawContext().getGraphicsLayer();
                DrawContext drawContext0 = ((DrawScope)this.x).getDrawContext();
                drawContext0.setDensity(density0);
                drawContext0.setLayoutDirection(layoutDirection0);
                drawContext0.setCanvas(canvas0);
                drawContext0.setSize-uvyYCjk(v1);
                drawContext0.setGraphicsLayer(graphicsLayer0);
                canvas0.save();
                try {
                    ((Function1)this.y).invoke(((DrawScope)this.x));
                    return Unit.INSTANCE;
                }
                finally {
                    canvas0.restore();
                    DrawContext drawContext1 = ((DrawScope)this.x).getDrawContext();
                    drawContext1.setDensity(density1);
                    drawContext1.setLayoutDirection(layoutDirection1);
                    drawContext1.setCanvas(canvas1);
                    drawContext1.setSize-uvyYCjk(v2);
                    drawContext1.setGraphicsLayer(graphicsLayer1);
                }
            }
            case 17: {
                DisposableEffectScope disposableEffectScope3 = (DisposableEffectScope)object0;
                ((g)this.x).I = (PopupPositionProvider)this.y;
                ((g)this.x).updatePosition();
                return new ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup.3.invoke..inlined.onDispose.1();
            }
            case 18: {
                Intrinsics.checkNotNullParameter(((CombinedLoadStates)object0), "loadStates");
                LoadState loadState0 = ((CombinedLoadStates)object0).getPrepend();
                ((LoadStateAdapter)this.x).setLoadState(loadState0);
                LoadState loadState1 = ((CombinedLoadStates)object0).getAppend();
                ((LoadStateAdapter)this.y).setLoadState(loadState1);
                return Unit.INSTANCE;
            }
            case 19: {
                Object object1 = null;
                Intrinsics.checkNotNullParameter(((a)object0), "it");
                ((a)object0).getClass();
                LoadType loadType0 = (LoadType)this.x;
                Intrinsics.checkNotNullParameter(loadType0, "loadType");
                PagingState pagingState0 = (PagingState)this.y;
                Intrinsics.checkNotNullParameter(pagingState0, "pagingState");
                ArrayDeque arrayDeque0 = ((a)object0).c;
                for(Object object2: arrayDeque0) {
                    if(((AccessorState.PendingRequest)object2).getLoadType() == loadType0) {
                        object1 = object2;
                        break;
                    }
                }
                boolean z6 = false;
                if(((AccessorState.PendingRequest)object1) != null) {
                    ((AccessorState.PendingRequest)object1).setPagingState(pagingState0);
                    return false;
                }
                AccessorState.BlockState accessorState$BlockState0 = ((a)object0).a[loadType0.ordinal()];
                if(accessorState$BlockState0 == AccessorState.BlockState.REQUIRES_REFRESH && loadType0 != LoadType.REFRESH) {
                    arrayDeque0.add(new AccessorState.PendingRequest(loadType0, pagingState0));
                    return false;
                }
                if(accessorState$BlockState0 == AccessorState.BlockState.UNBLOCKED || loadType0 == LoadType.REFRESH) {
                    LoadType loadType1 = LoadType.REFRESH;
                    if(loadType0 == loadType1) {
                        ((a)object0).e(loadType1, null);
                    }
                    if(((a)object0).b[loadType0.ordinal()] == null) {
                        z6 = arrayDeque0.add(new AccessorState.PendingRequest(loadType0, pagingState0));
                    }
                }
                return Boolean.valueOf(z6);
            }
            case 20: {
                Intrinsics.checkNotNullParameter(((a)object0), "it");
                if(((a)object0).d) {
                    ((a)object0).d = false;
                    ((f1)this.x).a(((f1)this.x).c, LoadType.REFRESH, ((PagingState)this.y));
                }
                return Unit.INSTANCE;
            }
            case 21: {
                Uri uri0 = (Uri)object0;
                if(uri0 != null) {
                    Context context0 = (Context)this.x;
                    try {
                        context0.grantUriPermission("net.daum.android.tistoryapp", uri0, 65);
                        context0.getContentResolver().takePersistableUriPermission(uri0, 1);
                    }
                    catch(Exception exception0) {
                        Logger.INSTANCE.log("grantUriPermission error " + exception0);
                    }
                    Function1 function10 = SignatureScreenKt.access$SignatureScreen$lambda$0(((State)this.y)).getAddSignImage();
                    String s1 = uri0.toString();
                    Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
                    function10.invoke(s1);
                }
                return Unit.INSTANCE;
            }
            case 22: {
                Intrinsics.checkNotNullParameter(((Name)object0), "accessorName");
                SimpleFunctionDescriptor simpleFunctionDescriptor0 = (SimpleFunctionDescriptor)this.x;
                return Intrinsics.areEqual(simpleFunctionDescriptor0.getName(), ((Name)object0)) ? k.listOf(simpleFunctionDescriptor0) : CollectionsKt___CollectionsKt.plus(LazyJavaClassMemberScope.access$searchMethodsByNameWithoutBuiltinMagic(((LazyJavaClassMemberScope)this.y), ((Name)object0)), LazyJavaClassMemberScope.access$searchMethodsInSupertypesWithoutBuiltinMagic(((LazyJavaClassMemberScope)this.y), ((Name)object0)));
            }
            case 23: {
                Object object3 = ((AnimationScope)object0).getValue();
                Object object4 = ((TwoWayConverter)this.y).getConvertFromVector().invoke(((AnimationScope)object0).getVelocityVector());
                ((Function2)this.x).invoke(object3, object4);
                return Unit.INSTANCE;
            }
            case 24: {
                DisposableEffectScope disposableEffectScope4 = (DisposableEffectScope)object0;
                e0 e00 = new e0(((Transition)this.y), null);
                BuildersKt.launch$default(((CoroutineScope)this.x), null, CoroutineStart.UNDISPATCHED, e00, 1, null);
                return new Transition.animateTo.1.1.invoke..inlined.onDispose.1();
            }
            case 25: {
                DisposableEffectScope disposableEffectScope5 = (DisposableEffectScope)object0;
                ((Transition)this.x).addTransition$animation_core_release(((Transition)this.y));
                return new TransitionKt.createChildTransitionInternal.1.1.invoke..inlined.onDispose.1(((Transition)this.x), ((Transition)this.y));
            }
            case 26: {
                Intrinsics.checkParameterIsNotNull(((Flowable)object0), "flowable");
                return ((Flowable)object0).flatMap(new cd.b(this, 20));
            }
            case 27: {
                Throwable throwable2 = (Throwable)object0;
                HandlerContext.access$getHandler$p(((HandlerContext)this.x)).removeCallbacks(((kotlinx.coroutines.android.HandlerContext.scheduleResumeAfterDelay..inlined.Runnable.1)this.y));
                return Unit.INSTANCE;
            }
            case 28: {
                SurfaceView surfaceView0 = new SurfaceView(((Context)object0));
                ((Function1)this.x).invoke(((n)this.y));
                surfaceView0.getHolder().addCallback(((n)this.y));
                return surfaceView0;
            }
            default: {
                Throwable throwable0 = (Throwable)object0;
                ((MutableInteractionSource)this.x).tryEmit(((FocusInteraction)this.y));
                return Unit.INSTANCE;
            }
        }
    }
}

