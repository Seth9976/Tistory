package j0;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.foundation.text.input.internal.CodepointTransformationKt;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material.AnchoredDragScope;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.material.BottomDrawerState;
import androidx.compose.material.BottomDrawerValue;
import androidx.compose.material.BottomSheetScaffoldState;
import androidx.compose.material.DismissState;
import androidx.compose.material.DismissValue;
import androidx.compose.material.DraggableAnchors;
import androidx.compose.material.DrawerState;
import androidx.compose.material.DrawerValue;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.SnackbarData;
import androidx.compose.material3.ei;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.unit.Density;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import androidx.navigation.compose.DialogNavigator;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.kakao.kandinsky.mosaic.BlurMenu;
import com.kakao.kandinsky.mosaic.MosaicMenu;
import com.kakao.kandinsky.preview.ImagePreviewGestureInteraction;
import com.kakao.kandinsky.preview.PreviewAnimator;
import com.kakao.kandinsky.preview.PreviewGestureController;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import com.kakao.kphotopicker.PickerViewModel;
import com.kakao.kphotopicker.PreviewFragment;
import com.kakao.kphotopicker.picker.MediaItem;
import java.util.List;
import k8.f;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import m0.b0;
import m0.f1;
import m0.g1;
import n1.b;
import p0.k4;
import p0.p3;
import p0.y3;

public final class t1 extends Lambda implements Function0 {
    public final int w;
    public final Object x;
    public final Object y;

    public t1(int v, Object object0, Object object1) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TextFieldCharSequence textFieldCharSequence0;
        switch(this.w) {
            case 0: {
                ImeAction imeAction0 = ImeAction.box-impl(((ImeOptions)this.y).getImeAction-eUduSuo());
                ((LegacyTextFieldState)this.x).getOnImeActionPerformed().invoke(imeAction0);
                return true;
            }
            case 1: {
                PickerViewModel.access$updateSelectedMediaList(((PickerViewModel)this.x));
                ((Function0)this.y).invoke();
                return Unit.INSTANCE;
            }
            case 2: {
                PreviewFragment.access$renderSelectState(((PreviewFragment)this.x), ((MediaItem)this.y));
                PreviewFragment.access$clickEvent(((PreviewFragment)this.x), true, ((MediaItem)this.y));
                return Unit.INSTANCE;
            }
            case 3: {
                DeclarationDescriptor declarationDescriptor0 = (DeclarationDescriptor)JvmBuiltInClassDescriptorFactory.access$getComputeContainingDeclaration$p(((JvmBuiltInClassDescriptorFactory)this.x)).invoke(JvmBuiltInClassDescriptorFactory.access$getModuleDescriptor$p(((JvmBuiltInClassDescriptorFactory)this.x)));
                List list0 = k.listOf(JvmBuiltInClassDescriptorFactory.access$getModuleDescriptor$p(((JvmBuiltInClassDescriptorFactory)this.x)).getBuiltIns().getAnyType());
                ClassDescriptorImpl classDescriptorImpl0 = new ClassDescriptorImpl(declarationDescriptor0, JvmBuiltInClassDescriptorFactory.access$getCLONEABLE_NAME$cp(), Modality.ABSTRACT, ClassKind.INTERFACE, list0, SourceElement.NO_SOURCE, false, ((StorageManager)this.y));
                classDescriptorImpl0.initialize(new CloneableClassScope(((StorageManager)this.y), classDescriptorImpl0), f0.emptySet(), null);
                return classDescriptorImpl0;
            }
            case 4: {
                Intrinsics.checkNotNullExpressionValue(JavaResolverCache.EMPTY, "EMPTY");
                return ((LazyJavaClassDescriptor)this.x).copy$descriptors_jvm(JavaResolverCache.EMPTY, ((ClassDescriptor)this.y));
            }
            case 5: {
                return JsonNamesMapKt.access$buildDeserializationNamesMap(((SerialDescriptor)this.x), ((Json)this.y));
            }
            case 6: {
                SerialDescriptor serialDescriptor0 = (SerialDescriptor)this.x;
                int v = serialDescriptor0.getElementsCount();
                String[] arr_s = new String[v];
                for(int v1 = 0; v1 < v; ++v1) {
                    String s = serialDescriptor0.getElementName(v1);
                    arr_s[v1] = ((JsonNamingStrategy)this.y).serialNameForJson(serialDescriptor0, v1, s);
                }
                return arr_s;
            }
            case 7: {
                ((AppUpdateManager)this.x).unregisterListener(((f)this.y));
                return Unit.INSTANCE;
            }
            case 8: {
                return (MemberScope)ScopesHolderForClass.access$getScopeFactory$p(((ScopesHolderForClass)this.x)).invoke(((KotlinTypeRefiner)this.y));
            }
            case 9: {
                if(!((TextFieldSelectionState)this.x).isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(((TextFieldDecoratorModifierNode)this.y));
                }
                return Unit.INSTANCE;
            }
            case 10: {
                f1 f10 = TransformedTextFieldState.h;
                TransformedTextFieldState transformedTextFieldState0 = (TransformedTextFieldState)this.x;
                State state0 = transformedTextFieldState0.e;
                if(state0 == null) {
                    textFieldCharSequence0 = transformedTextFieldState0.a.getValue$foundation_release();
                }
                else {
                    g1 g10 = (g1)state0.getValue();
                    if(g10 == null) {
                        textFieldCharSequence0 = transformedTextFieldState0.a.getValue$foundation_release();
                    }
                    else {
                        textFieldCharSequence0 = g10.a;
                        if(textFieldCharSequence0 == null) {
                            textFieldCharSequence0 = transformedTextFieldState0.a.getValue$foundation_release();
                        }
                    }
                }
                SelectionWedgeAffinity selectionWedgeAffinity0 = transformedTextFieldState0.getSelectionWedgeAffinity();
                f10.getClass();
                OffsetMappingCalculator offsetMappingCalculator0 = new OffsetMappingCalculator();
                CharSequence charSequence0 = CodepointTransformationKt.toVisualText(textFieldCharSequence0, ((CodepointTransformation)this.y), offsetMappingCalculator0);
                if(charSequence0 != textFieldCharSequence0) {
                    long v2 = f1.b(textFieldCharSequence0.getSelection-d9O1mEE(), offsetMappingCalculator0, selectionWedgeAffinity0);
                    TextRange textRange0 = textFieldCharSequence0.getComposition-MzsxiRA();
                    if(textRange0 != null) {
                        TransformedTextFieldState.h.getClass();
                        return new g1(new TextFieldCharSequence(charSequence0, v2, TextRange.box-impl(f1.b(textRange0.unbox-impl(), offsetMappingCalculator0, selectionWedgeAffinity0)), null, 8, null), offsetMappingCalculator0);
                    }
                    return new g1(new TextFieldCharSequence(charSequence0, v2, null, null, 8, null), offsetMappingCalculator0);
                }
                return null;
            }
            case 11: {
                TextFieldCharSequence textFieldCharSequence1 = ((TransformedTextFieldState)this.x).a.getValue$foundation_release();
                SelectionWedgeAffinity selectionWedgeAffinity1 = ((TransformedTextFieldState)this.x).getSelectionWedgeAffinity();
                TransformedTextFieldState.h.getClass();
                OffsetMappingCalculator offsetMappingCalculator1 = new OffsetMappingCalculator();
                TextFieldBuffer textFieldBuffer0 = new TextFieldBuffer(textFieldCharSequence1, null, null, offsetMappingCalculator1, 6, null);
                ((OutputTransformation)this.y).transformOutput(textFieldBuffer0);
                TextRange textRange1 = null;
                if(textFieldBuffer0.getChanges().getChangeCount() != 0) {
                    long v3 = f1.b(textFieldCharSequence1.getSelection-d9O1mEE(), offsetMappingCalculator1, selectionWedgeAffinity1);
                    TextRange textRange2 = textFieldCharSequence1.getComposition-MzsxiRA();
                    if(textRange2 != null) {
                        TransformedTextFieldState.h.getClass();
                        textRange1 = TextRange.box-impl(f1.b(textRange2.unbox-impl(), offsetMappingCalculator1, selectionWedgeAffinity1));
                    }
                    return new g1(textFieldBuffer0.toTextFieldCharSequence-udt6zUU$foundation_release(v3, textRange1), offsetMappingCalculator1);
                }
                return null;
            }
            case 12: {
                ((Function1)this.x).invoke(((BlurMenu)this.y));
                return Unit.INSTANCE;
            }
            case 13: {
                ((Function1)this.x).invoke(((MosaicMenu)this.y));
                return Unit.INSTANCE;
            }
            case 14: {
                return "Selection Handle drag cancelled for draggingHandle: " + ((TextFieldSelectionState)this.x).getDraggingHandle() + " definedOn: " + ((Handle)this.y);
            }
            case 15: {
                ((b)this.x).q.invoke(((CacheDrawScope)this.y));
                return Unit.INSTANCE;
            }
            case 16: {
                NavigatorState navigatorState0 = BottomSheetNavigator.access$getState(((BottomSheetNavigator)this.x));
                NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)((State)this.y).getValue();
                Intrinsics.checkNotNull(navBackStackEntry0);
                navigatorState0.popWithTransition(navBackStackEntry0, false);
                return Unit.INSTANCE;
            }
            case 17: {
                return new ImagePreviewGestureInteraction(((PreviewGestureController)this.x), ((PreviewAnimator)this.y));
            }
            case 18: {
                return MatrixExtensionKt.buildMatrix$default(null, new ei(((State)this.x), ((State)this.y), 1), 1, null);
            }
            case 19: {
                int v4 = ((MutableIntState)this.x).getIntValue();
                ((MutableIntState)this.x).setIntValue((v4 + 1) % ((Object[])this.y).length);
                return Unit.INSTANCE;
            }
            case 20: {
                ((DialogNavigator)this.x).dismiss$navigation_compose_release(((NavBackStackEntry)this.y));
                return Unit.INSTANCE;
            }
            case 21: {
                AnchoredDraggableState anchoredDraggableState0 = (AnchoredDraggableState)this.x;
                AnchoredDragScope anchoredDragScope0 = anchoredDraggableState0.o;
                DraggableAnchors draggableAnchors0 = anchoredDraggableState0.getAnchors();
                Object object0 = this.y;
                float f = draggableAnchors0.positionOf(object0);
                if(!Float.isNaN(f)) {
                    AnchoredDragScope.dragTo$default(anchoredDragScope0, f, 0.0f, 2, null);
                    AnchoredDraggableState.access$setDragTarget(anchoredDraggableState0, null);
                }
                anchoredDraggableState0.b(object0);
                return Unit.INSTANCE;
            }
            case 22: {
                ((BottomSheetScaffoldState)this.x).getBottomSheetState().setDensity$material_release(((Density)this.y));
                return Unit.INSTANCE;
            }
            case 23: {
                ((BottomDrawerState)this.x).setDensity$material_release(((Density)this.y));
                return Unit.INSTANCE;
            }
            case 24: {
                BottomDrawerState bottomDrawerState0 = (BottomDrawerState)this.x;
                if(bottomDrawerState0.confirmStateChange$material_release(BottomDrawerValue.Closed)) {
                    p3 p30 = new p3(bottomDrawerState0, null);
                    BuildersKt.launch$default(((CoroutineScope)this.y), null, null, p30, 3, null);
                }
                return true;
            }
            case 25: {
                DrawerState drawerState0 = (DrawerState)this.x;
                if(((Boolean)drawerState0.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(DrawerValue.Closed)).booleanValue()) {
                    y3 y30 = new y3(drawerState0, null);
                    BuildersKt.launch$default(((CoroutineScope)this.y), null, null, y30, 3, null);
                }
                return true;
            }
            case 26: {
                return new DrawerState(((DrawerValue)this.x), ((Function1)this.y));
            }
            case 27: {
                ((ModalBottomSheetState)this.x).setDensity$material_release(((Density)this.y));
                return Unit.INSTANCE;
            }
            case 28: {
                k4 k40 = (k4)this.y;
                Object object1 = k40.a;
                SnackbarData snackbarData0 = (SnackbarData)this.x;
                if(!Intrinsics.areEqual(snackbarData0, object1)) {
                    o.removeAll(k40.b, new b0(snackbarData0, 19));
                    RecomposeScope recomposeScope0 = k40.c;
                    if(recomposeScope0 != null) {
                        recomposeScope0.invalidate();
                    }
                }
                return Unit.INSTANCE;
            }
            default: {
                return new DismissState(((DismissValue)this.x), ((Function1)this.y));
            }
        }
    }
}

