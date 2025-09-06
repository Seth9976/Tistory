package aa;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.BackHandlerKt.BackHandler.2.1.invoke..inlined.onDispose.1;
import androidx.activity.compose.PredictiveBackHandlerKt.PredictiveBackHandler.2.1.invoke..inlined.onDispose.1;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.animation.AnimatedContentKt.AnimatedContent.6.1.5.1.1.invoke..inlined.onDispose.1;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.BoundsAnimation;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.m;
import androidx.compose.material.BottomDrawerState;
import androidx.compose.material.DrawerState;
import androidx.compose.material.MenuKt;
import androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup.1.invoke..inlined.onDispose.1;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.sd;
import androidx.compose.material3.ud;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.livedata.LiveDataAdapterKt.observeAsState.1.1.invoke..inlined.onDispose.1;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl.RegistryHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider.1.1.1.invoke..inlined.onDispose.1;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.q;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogHostKt.DialogHost.1.2.1.1.invoke..inlined.onDispose.1;
import androidx.navigation.compose.DialogNavigator;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadStates;
import androidx.paging.MutableCombinedLoadStateCollection;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.kakao.android.base.network.NetworkCheckImpl;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.textedit.TextEditorKt;
import com.kakao.kandinsky.textedit.contract.FontData;
import h1.f;
import j0.t1;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.selects.SelectInstance;
import p0.r8;
import s0.g;
import u.d0;

public final class r extends Lambda implements Function1 {
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public r(MutableState mutableState0, State state0, State state1) {
        this.w = 18;
        this.x = mutableState0;
        this.z = state0;
        this.y = state1;
        super(1);
    }

    public r(Object object0, Object object1, int v, Object object2) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        super(1);
    }

    public r(g g0, Function0 function00, String s, LayoutDirection layoutDirection0) {
        this.w = 22;
        this.x = g0;
        this.y = function00;
        this.z = layoutDirection0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Unit unit0;
        String s;
        switch(this.w) {
            case 0: {
                if(((DecorationStatus)this.x) == DecorationStatus.Selected) {
                    Object object2 = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$12(((State)this.z));
                    ((DecorationControllerInterface)this.y).onTap(object2);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v = ((SelectableInfo)object0).getTextLength();
                ((m)this.x).getClass();
                m.a(((MutableLongObjectMap)this.y), ((Selection)this.z), ((SelectableInfo)object0), 0, v);
                return Unit.INSTANCE;
            }
            case 2: {
                DateRangePickerKt.access$updateDateSelection(((Number)object0).longValue(), ((Long)this.x), ((Long)this.y), ((Function2)this.z));
                return Unit.INSTANCE;
            }
            case 3: {
                ud ud0 = new ud(((SheetState)this.y), ((Number)object0).floatValue(), null);
                BuildersKt.launch$default(((CoroutineScope)this.x), null, null, ud0, 3, null).invokeOnCompletion(new sd(((SheetState)this.y), ((Function0)this.z), 1));
                return Unit.INSTANCE;
            }
            case 4: {
                boolean z = ((Boolean)object0).booleanValue();
                TextEditorKt.access$TextEditor$lambda$13(((MutableState)this.z), z);
                TextEditorKt.access$watermarkClickEvent(((String)this.x));
                if(z) {
                    ((FocusRequester)this.y).requestFocus();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                Object object3 = null;
                for(Object object4: ((List)this.x)) {
                    if(Intrinsics.areEqual(((FontData)object4).getResource(), ((Integer)object0))) {
                        object3 = object4;
                        break;
                    }
                }
                if(((FontData)object3) == null) {
                    s = "기본서체";
                }
                else {
                    s = ((FontData)object3).getAlias();
                    if(s == null) {
                        s = "기본서체";
                    }
                }
                TextEditorKt.access$trackerClickEvent(((String)this.y), "fontstyle", s);
                TextData textData0 = TextData.copy-A15cKkk$default(TextEditorKt.access$TextEditor$lambda$9(((MutableState)this.z)), null, 0L, 0.0f, 0L, 0.0f, 0L, 0L, false, false, false, 0, ((Integer)object0), 0.0f, 0.0f, 0x37FF, null);
                TextEditorKt.access$TextEditor$lambda$10(((MutableState)this.z), textData0);
                return Unit.INSTANCE;
            }
            case 6: {
                NetworkCheckImpl networkCheckImpl0 = (NetworkCheckImpl)this.x;
                if(Intrinsics.areEqual(NetworkCheckImpl.access$get_isNetworkConnected$p(networkCheckImpl0).getValue(), Boolean.FALSE)) {
                    Intrinsics.checkNotNull(((Boolean)object0));
                    if(((Boolean)object0).booleanValue()) {
                        ((Function0)this.y).invoke();
                        NetworkCheckImpl.access$get_isNetworkConnected$p(networkCheckImpl0).postValue(((Boolean)object0));
                        return Unit.INSTANCE;
                    }
                    goto label_53;
                }
                else {
                label_53:
                    if(Intrinsics.areEqual(NetworkCheckImpl.access$get_isNetworkConnected$p(networkCheckImpl0).getValue(), Boolean.TRUE) && !((Boolean)object0).booleanValue()) {
                        ((Function0)this.z).invoke();
                    }
                }
                NetworkCheckImpl.access$get_isNetworkConnected$p(networkCheckImpl0).postValue(((Boolean)object0));
                return Unit.INSTANCE;
            }
            case 7: {
                if(((Throwable)object0) instanceof CancellationException) {
                    ((CancellationTokenSource)this.x).cancel();
                    return Unit.INSTANCE;
                }
                Deferred deferred0 = (Deferred)this.y;
                Throwable throwable0 = deferred0.getCompletionExceptionOrNull();
                TaskCompletionSource taskCompletionSource0 = (TaskCompletionSource)this.z;
                if(throwable0 == null) {
                    taskCompletionSource0.setResult(deferred0.getCompleted());
                    return Unit.INSTANCE;
                }
                Exception exception0 = throwable0 instanceof Exception ? ((Exception)throwable0) : null;
                if(exception0 == null) {
                    exception0 = new RuntimeExecutionException(throwable0);
                }
                taskCompletionSource0.setException(exception0);
                return Unit.INSTANCE;
            }
            case 8: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                q q0 = new q(((MutableState)this.z), 2);
                ((LiveData)this.x).observe(((LifecycleOwner)this.y), q0);
                return new LiveDataAdapterKt.observeAsState.1.1.invoke..inlined.onDispose.1(((LiveData)this.x), q0);
            }
            case 9: {
                DisposableEffectScope disposableEffectScope1 = (DisposableEffectScope)object0;
                f f0 = (f)this.x;
                Object object5 = this.y;
                if(f0.b.containsKey(object5)) {
                    throw new IllegalArgumentException(("Key " + object5 + " was used multiple times ").toString());
                }
                f0.a.remove(object5);
                f0.b.put(object5, ((SaveableStateHolderImpl.RegistryHolder)this.z));
                return new SaveableStateHolderImpl.SaveableStateProvider.1.1.1.invoke..inlined.onDispose.1(((SaveableStateHolderImpl.RegistryHolder)this.z), f0, object5);
            }
            case 10: {
                DisposableEffectScope disposableEffectScope2 = (DisposableEffectScope)object0;
                ((OnBackPressedDispatcher)this.x).addCallback(((LifecycleOwner)this.y), ((androidx.activity.compose.BackHandlerKt.BackHandler.backCallback.1.1)this.z));
                return new BackHandlerKt.BackHandler.2.1.invoke..inlined.onDispose.1(((androidx.activity.compose.BackHandlerKt.BackHandler.backCallback.1.1)this.z));
            }
            case 11: {
                DisposableEffectScope disposableEffectScope3 = (DisposableEffectScope)object0;
                ((OnBackPressedDispatcher)this.x).addCallback(((LifecycleOwner)this.y), ((androidx.activity.compose.PredictiveBackHandlerKt.PredictiveBackHandler.backCallBack.1.1)this.z));
                return new PredictiveBackHandlerKt.PredictiveBackHandler.2.1.invoke..inlined.onDispose.1(((androidx.activity.compose.PredictiveBackHandlerKt.PredictiveBackHandler.backCallBack.1.1)this.z));
            }
            case 12: {
                BasicTextFieldKt.access$BasicTextField$lambda$22(((MutableState)this.y), ((TextFieldValue)object0));
                boolean z1 = Intrinsics.areEqual(BasicTextFieldKt.access$BasicTextField$lambda$25(((MutableState)this.z)), ((TextFieldValue)object0).getText());
                String s1 = ((TextFieldValue)object0).getText();
                BasicTextFieldKt.access$BasicTextField$lambda$26(((MutableState)this.z), s1);
                if(!z1) {
                    String s2 = ((TextFieldValue)object0).getText();
                    ((Function1)this.x).invoke(s2);
                }
                return Unit.INSTANCE;
            }
            case 13: {
                long v1 = ((Offset)object0).unbox-impl();
                ((Function0)this.x).invoke();
                TextFieldSelectionState textFieldSelectionState0 = (TextFieldSelectionState)this.y;
                if(textFieldSelectionState0.d && textFieldSelectionState0.isFocused()) {
                    if(!textFieldSelectionState0.e) {
                        ((Function0)this.z).invoke();
                        if(textFieldSelectionState0.a.getVisualText().length() > 0) {
                            TextFieldSelectionState.access$setShowCursorHandle(textFieldSelectionState0, true);
                        }
                    }
                    textFieldSelectionState0.updateTextToolbarState(TextToolbarState.None);
                    TextFieldSelectionState.access$placeCursorAtNearestOffset-k-4lQ0M(textFieldSelectionState0, TextLayoutStateKt.fromDecorationToTextLayout-Uv8p0NA(textFieldSelectionState0.b, textFieldSelectionState0.b.coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation_release(v1)));
                }
                return Unit.INSTANCE;
            }
            case 14: {
                if(Intrinsics.areEqual(((FocusTargetNode)object0), ((FocusTargetNode)this.x))) {
                    return false;
                }
                if(Intrinsics.areEqual(((FocusTargetNode)object0), ((FocusOwnerImpl)this.y).getRootFocusNode$ui_release())) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                return Boolean.valueOf(((Boolean)((Function1)this.z).invoke(((FocusTargetNode)object0))).booleanValue());
            }
            case 15: {
                DisposableEffectScope disposableEffectScope4 = (DisposableEffectScope)object0;
                ((SnapshotStateList)this.x).add(((NavBackStackEntry)this.y));
                return new DialogHostKt.DialogHost.1.2.1.1.invoke..inlined.onDispose.1(((DialogNavigator)this.z), ((NavBackStackEntry)this.y), ((SnapshotStateList)this.x));
            }
            case 16: {
                SemanticsPropertiesKt.setPaneTitle(((SemanticsPropertyReceiver)object0), ((String)this.x));
                BottomDrawerState bottomDrawerState0 = (BottomDrawerState)this.y;
                if(bottomDrawerState0.isOpen()) {
                    SemanticsPropertiesKt.dismiss$default(((SemanticsPropertyReceiver)object0), null, new t1(24, bottomDrawerState0, ((CoroutineScope)this.z)), 1, null);
                }
                return Unit.INSTANCE;
            }
            case 17: {
                SemanticsPropertiesKt.setPaneTitle(((SemanticsPropertyReceiver)object0), ((String)this.x));
                DrawerState drawerState0 = (DrawerState)this.y;
                if(drawerState0.isOpen()) {
                    SemanticsPropertiesKt.dismiss$default(((SemanticsPropertyReceiver)object0), null, new t1(25, drawerState0, ((CoroutineScope)this.z)), 1, null);
                }
                return Unit.INSTANCE;
            }
            case 18: {
                ((GraphicsLayerScope)object0).setScaleX(MenuKt.access$DropdownMenuContent$lambda$1(((State)this.z)));
                ((GraphicsLayerScope)object0).setScaleY(MenuKt.access$DropdownMenuContent$lambda$1(((State)this.z)));
                ((GraphicsLayerScope)object0).setAlpha(MenuKt.access$DropdownMenuContent$lambda$3(((State)this.y)));
                ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(((TransformOrigin)((MutableState)this.x).getValue()).unbox-impl());
                return Unit.INSTANCE;
            }
            case 19: {
                r8 r80 = new r8(((DraggableState)this.y), ((State)this.z), null);
                BuildersKt.launch$default(((CoroutineScope)this.x), null, null, r80, 3, null);
                return Unit.INSTANCE;
            }
            case 20: {
                DisposableEffectScope disposableEffectScope5 = (DisposableEffectScope)object0;
                return new AnimatedContentKt.AnimatedContent.6.1.5.1.1.invoke..inlined.onDispose.1(((SnapshotStateList)this.x), this.y, ((AnimatedContentTransitionScopeImpl)this.z));
            }
            case 21: {
                return ((Boolean)object0).booleanValue() == ((Boolean)((BoundsAnimation)this.x).getTransition().getTargetState()).booleanValue() ? ((Rect)this.y) : ((Rect)this.z);
            }
            case 22: {
                DisposableEffectScope disposableEffectScope6 = (DisposableEffectScope)object0;
                ((g)this.x).G.addView(((g)this.x), ((g)this.x).H);
                ((g)this.x).c(((Function0)this.y), ((LayoutDirection)this.z));
                return new ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup.1.invoke..inlined.onDispose.1(((g)this.x));
            }
            case 23: {
                return MutableCombinedLoadStateCollection.access$computeNewState(((MutableCombinedLoadStateCollection)this.x), ((CombinedLoadStates)object0), ((LoadStates)this.y), ((LoadStates)this.z));
            }
            case 24: {
                d0 d00 = new d0(((CoroutineScope)this.y), ((BasicTooltipState)this.z));
                SemanticsPropertiesKt.onLongClick(((SemanticsPropertyReceiver)object0), ((String)this.x), d00);
                return Unit.INSTANCE;
            }
            case 25: {
                Canvas canvas0 = ((DrawScope)object0).getDrawContext().getCanvas();
                AndroidViewHolder androidViewHolder0 = (AndroidViewHolder)this.x;
                if(androidViewHolder0.getView().getVisibility() != 8) {
                    androidViewHolder0.u = true;
                    Owner owner0 = ((LayoutNode)this.y).getOwner$ui_release();
                    AndroidComposeView androidComposeView0 = owner0 instanceof AndroidComposeView ? ((AndroidComposeView)owner0) : null;
                    if(androidComposeView0 != null) {
                        android.graphics.Canvas canvas1 = AndroidCanvas_androidKt.getNativeCanvas(canvas0);
                        androidComposeView0.drawAndroidView(((AndroidViewHolder)this.z), canvas1);
                    }
                    androidViewHolder0.u = false;
                }
                return Unit.INSTANCE;
            }
            case 26: {
                Throwable throwable1 = (Throwable)object0;
                Object object6 = this.x;
                if(object6 != BufferedChannelKt.getCHANNEL_CLOSED()) {
                    CoroutineContext coroutineContext0 = ((SelectInstance)this.z).getContext();
                    OnUndeliveredElementKt.callUndeliveredElement(((BufferedChannel)this.y).onUndeliveredElement, object6, coroutineContext0);
                }
                return Unit.INSTANCE;
            }
            case 27: {
                w0.d0 d01 = new w0.d0(((CoroutineScope)this.y), ((TooltipState)this.z));
                SemanticsPropertiesKt.onLongClick(((SemanticsPropertyReceiver)object0), ((String)this.x), d01);
                return Unit.INSTANCE;
            }
            default: {
                ((Function1)this.x).invoke(((Throwable)object0));
                SimpleActor simpleActor0 = (SimpleActor)this.y;
                SimpleActor.access$getMessageQueue$p(simpleActor0).close(((Throwable)object0));
                do {
                    Object object1 = ChannelResult.getOrNull-impl(SimpleActor.access$getMessageQueue$p(simpleActor0).tryReceive-PtdJZtk());
                    if(object1 == null) {
                        unit0 = null;
                    }
                    else {
                        ((Function2)this.z).invoke(object1, ((Throwable)object0));
                        unit0 = Unit.INSTANCE;
                    }
                }
                while(unit0 != null);
                return Unit.INSTANCE;
            }
        }
    }
}

