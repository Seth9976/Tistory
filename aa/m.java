package aa;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.fa;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.ScrollObservationScope;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.platform.t1;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.constraintlayout.compose.u;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.Lifecycle;
import androidx.work.impl.constraints.controllers.ConstraintController.track.1.listener.1;
import androidx.work.impl.constraints.controllers.ConstraintController;
import b2.q;
import c0.h;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.home.contract.HomeMenu;
import com.kakao.kandinsky.textedit.contract.FontData;
import com.kakao.kandinsky.textedit.contract.InputState;
import com.kakao.kandinsky.textedit.ui.EditState;
import e0.e;
import f0.t;
import ff.a;
import ge.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.text.p;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.EnumSerializer;

public final class m extends Lambda implements Function0 {
    public final int w;
    public final Object x;
    public final Object y;

    public m(int v, Object object0, Object object1) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        super(0);
    }

    public m(State state0, ScrollableState scrollableState0, int v) {
        this.w = v;
        this.y = state0;
        this.x = scrollableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                Object object0 = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$12(((State)this.y));
                ((DecorationControllerInterface)this.x).onDelete(object0);
                return Unit.INSTANCE;
            }
            case 1: {
                long v = ((IntSize)((MutableState)this.y).getValue()).unbox-impl();
                return Offset.box-impl(SelectionManagerKt.calculateSelectionMagnifierCenterAndroid-O0kMr_c(((SelectionManager)this.x), v));
            }
            case 2: {
                long v1 = ((IntSize)((MutableState)this.y).getValue()).unbox-impl();
                return Offset.box-impl(TextFieldSelectionManagerKt.calculateSelectionMagnifierCenterAndroid-O0kMr_c(((TextFieldSelectionManager)this.x), v1));
            }
            case 3: {
                return NavigationDrawerKt.access$calculateFraction(NavigationDrawerKt.access$ModalNavigationDrawer_FHprtrg$lambda$5(((MutableFloatState)this.y)), 0.0f, ((DrawerState)this.x).requireOffset$material3_release());
            }
            case 4: {
                return new DrawerState(((DrawerValue)this.x), ((Function1)this.y));
            }
            case 5: {
                fa fa0 = (fa)this.y;
                Object object1 = fa0.a;
                SnackbarData snackbarData0 = (SnackbarData)this.x;
                if(!Intrinsics.areEqual(snackbarData0, object1)) {
                    o.removeAll(fa0.b, new g1(snackbarData0, 6));
                    RecomposeScope recomposeScope0 = fa0.c;
                    if(recomposeScope0 != null) {
                        recomposeScope0.invalidate();
                    }
                }
                return Unit.INSTANCE;
            }
            case 6: {
                return Boolean.valueOf(((AndroidComposeView)this.x).super.dispatchKeyEvent(((KeyEvent)this.y)));
            }
            case 7: {
                ((AndroidComposeView)this.x).getAndroidViewsHandler$ui_release().removeViewInLayout(((AndroidViewHolder)this.y));
                HashMap hashMap0 = ((AndroidComposeView)this.x).getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                Object object2 = ((AndroidComposeView)this.x).getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(((AndroidViewHolder)this.y));
                TypeIntrinsics.asMutableMap(hashMap0).remove(object2);
                ((AndroidViewHolder)this.y).setImportantForAccessibility(0);
                return Unit.INSTANCE;
            }
            case 8: {
                ScrollObservationScope scrollObservationScope0 = (ScrollObservationScope)this.x;
                ScrollAxisRange scrollAxisRange0 = scrollObservationScope0.getHorizontalScrollAxisRange();
                ScrollAxisRange scrollAxisRange1 = scrollObservationScope0.getVerticalScrollAxisRange();
                Float float0 = scrollObservationScope0.getOldXValue();
                Float float1 = scrollObservationScope0.getOldYValue();
                if((scrollAxisRange0 == null || float0 == null ? 0.0f : ((Number)scrollAxisRange0.getValue().invoke()).floatValue() - ((float)float0)) != 0.0f || (scrollAxisRange1 == null || float1 == null ? 0.0f : ((Number)scrollAxisRange1.getValue().invoke()).floatValue() - ((float)float1)) != 0.0f) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0 = (AndroidComposeViewAccessibilityDelegateCompat)this.y;
                    int v2 = androidComposeViewAccessibilityDelegateCompat0.u(scrollObservationScope0.getSemanticsNodeId());
                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)androidComposeViewAccessibilityDelegateCompat0.i().get(androidComposeViewAccessibilityDelegateCompat0.o);
                    if(semanticsNodeWithAdjustedBounds0 != null) {
                        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = androidComposeViewAccessibilityDelegateCompat0.p;
                        if(accessibilityNodeInfoCompat0 != null) {
                            try {
                                accessibilityNodeInfoCompat0.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat0.b(semanticsNodeWithAdjustedBounds0));
                            }
                            catch(IllegalStateException unused_ex) {
                            }
                        }
                    }
                    androidComposeViewAccessibilityDelegateCompat0.getView().invalidate();
                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds1 = (SemanticsNodeWithAdjustedBounds)androidComposeViewAccessibilityDelegateCompat0.i().get(v2);
                    if(semanticsNodeWithAdjustedBounds1 != null) {
                        SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds1.getSemanticsNode();
                        if(semanticsNode0 != null) {
                            LayoutNode layoutNode0 = semanticsNode0.getLayoutNode$ui_release();
                            if(layoutNode0 != null) {
                                if(scrollAxisRange0 != null) {
                                    androidComposeViewAccessibilityDelegateCompat0.r.set(v2, scrollAxisRange0);
                                }
                                if(scrollAxisRange1 != null) {
                                    androidComposeViewAccessibilityDelegateCompat0.s.set(v2, scrollAxisRange1);
                                }
                                androidComposeViewAccessibilityDelegateCompat0.p(layoutNode0);
                            }
                        }
                    }
                }
                if(scrollAxisRange0 != null) {
                    scrollObservationScope0.setOldXValue(((Float)scrollAxisRange0.getValue().invoke()));
                }
                if(scrollAxisRange1 != null) {
                    scrollObservationScope0.setOldYValue(((Float)scrollAxisRange1.getValue().invoke()));
                }
                return Unit.INSTANCE;
            }
            case 9: {
                ((Lifecycle)this.x).removeObserver(((t1)this.y));
                return Unit.INSTANCE;
            }
            case 10: {
                Boolean boolean0 = Boolean.valueOf(!((Boolean)((MutableState)this.x).getValue()).booleanValue());
                ((MutableState)this.x).setValue(boolean0);
                ((u)this.y).d = true;
                return Unit.INSTANCE;
            }
            case 11: {
                ((Lifecycle)this.x).removeObserver(((t1)this.y));
                return Unit.INSTANCE;
            }
            case 12: {
                ConstraintController.access$getTracker$p(((ConstraintController)this.x)).removeListener(((ConstraintController.track.1.listener.1)this.y));
                return Unit.INSTANCE;
            }
            case 13: {
                Function1 function10 = ((q)this.x).a.getRulers();
                if(function10 != null) {
                    function10.invoke(((LookaheadCapablePlaceable)this.y).getRulerScope());
                }
                return Unit.INSTANCE;
            }
            case 14: {
                LazyGridIntervalContent lazyGridIntervalContent0 = (LazyGridIntervalContent)((State)this.y).getValue();
                NearestRangeKeyIndexMap nearestRangeKeyIndexMap0 = new NearestRangeKeyIndexMap(((LazyGridState)this.x).getNearestRange$foundation_release(), lazyGridIntervalContent0);
                return new h(((LazyGridState)this.x), lazyGridIntervalContent0, nearestRangeKeyIndexMap0);
            }
            case 15: {
                LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent0 = (LazyStaggeredGridIntervalContent)((State)this.y).getValue();
                NearestRangeKeyIndexMap nearestRangeKeyIndexMap1 = new NearestRangeKeyIndexMap(((LazyStaggeredGridState)this.x).getNearestRange$foundation_release(), lazyStaggeredGridIntervalContent0);
                return new e(((LazyStaggeredGridState)this.x), lazyStaggeredGridIntervalContent0, nearestRangeKeyIndexMap1);
            }
            case 16: {
                ((Function1)this.x).invoke(((EditState)this.y));
                return Unit.INSTANCE;
            }
            case 17: {
                ((InputState)this.x).getOnChange().invoke(((FontData)this.y).getResource());
                return Unit.INSTANCE;
            }
            case 18: {
                t t0 = (t)((State)this.y).getValue();
                NearestRangeKeyIndexMap nearestRangeKeyIndexMap2 = new NearestRangeKeyIndexMap(((PagerState)this.x).getNearestRange$foundation_release(), t0);
                return new PagerLazyLayoutItemProvider(((PagerState)this.x), t0, nearestRangeKeyIndexMap2);
            }
            case 19: {
                KDeclarationContainerImpl kDeclarationContainerImpl0 = ((KFunctionImpl)this.x).getContainer();
                String s = KFunctionImpl.access$getSignature$p(((KFunctionImpl)this.x));
                return kDeclarationContainerImpl0.findFunctionDescriptor(((String)this.y), s);
            }
            case 20: {
                ((e0)this.x).getClass();
                ReflectKotlinClass reflectKotlinClass0 = (ReflectKotlinClass)((e0)this.x).c.getValue(((e0)this.x), e0.h[0]);
                if(reflectKotlinClass0 != null) {
                    KotlinClassHeader kotlinClassHeader0 = reflectKotlinClass0.getClassHeader();
                    if(kotlinClassHeader0 != null) {
                        String s1 = kotlinClassHeader0.getMultifileClassName();
                        return s1 == null || s1.length() <= 0 ? null : ((KPackageImpl)this.y).getJClass().getClassLoader().loadClass(p.replace$default(s1, '/', '.', false, 4, null));
                    }
                }
                throw new NullPointerException();
            }
            case 21: {
                Iterable iterable0 = ((AbstractTypeConstructor)this.y).getSupertypes();
                return KotlinTypeRefinerKt.refineTypes(((a)this.x).a, iterable0);
            }
            case 22: {
                KotlinTypeMarker kotlinTypeMarker0 = (KotlinTypeMarker)LazyWrappedType.access$getComputation$p(((LazyWrappedType)this.y)).invoke();
                return ((KotlinTypeRefiner)this.x).refineType(kotlinTypeMarker0);
            }
            case 23: {
                Rect rect0 = (Rect)this.x;
                if(rect0 == null) {
                    LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)this.y;
                    if(!layoutCoordinates0.isAttached()) {
                        layoutCoordinates0 = null;
                    }
                    return layoutCoordinates0 != null ? SizeKt.toRect-uvyYCjk(IntSizeKt.toSize-ozmzZPI(layoutCoordinates0.getSize-YbymL2g())) : null;
                }
                return rect0;
            }
            case 24: {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append('@');
                stringBuilder0.append(((Class)this.x).getCanonicalName());
                CollectionsKt___CollectionsKt.joinTo$default(((Map)this.y).entrySet(), stringBuilder0, ", ", "(", ")", 0, null, b.w, 0x30, null);
                String s2 = stringBuilder0.toString();
                Intrinsics.checkNotNullExpressionValue(s2, "StringBuilder().apply(builderAction).toString()");
                return s2;
            }
            case 25: {
                Iterable iterable1 = ((NewCapturedTypeConstructor)this.x).getSupertypes();
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable1, 10));
                for(Object object3: iterable1) {
                    arrayList0.add(((UnwrappedType)object3).refine(((KotlinTypeRefiner)this.y)));
                }
                return arrayList0;
            }
            case 26: {
                SerialDescriptor serialDescriptor0 = EnumSerializer.access$getOverriddenDescriptor$p(((EnumSerializer)this.x));
                return serialDescriptor0 == null ? EnumSerializer.access$createUnmarkedDescriptor(((EnumSerializer)this.x), ((String)this.y)) : serialDescriptor0;
            }
            case 27: {
                ((Function1)this.x).invoke(((HomeMenu)this.y));
                return Unit.INSTANCE;
            }
            case 28: {
                ArrayList arrayList1 = ((ib.e)this.x).g.b(((String)this.y));
                ((ib.e)this.x).h.invoke(Boolean.valueOf(arrayList1.isEmpty()));
                ((ib.e)this.x).i = arrayList1;
                ((ib.e)this.x).h.invoke(Boolean.valueOf(arrayList1.isEmpty()));
                ((ib.e)this.x).notifyDataSetChanged();
                return Unit.INSTANCE;
            }
            default: {
                TextFieldValue textFieldValue0 = (TextFieldValue)this.x;
                MutableState mutableState0 = (MutableState)this.y;
                if(!TextRange.equals-impl0(textFieldValue0.getSelection-d9O1mEE(), BasicTextFieldKt.access$BasicTextField$lambda$21(mutableState0).getSelection-d9O1mEE()) || !Intrinsics.areEqual(textFieldValue0.getComposition-MzsxiRA(), BasicTextFieldKt.access$BasicTextField$lambda$21(mutableState0).getComposition-MzsxiRA())) {
                    BasicTextFieldKt.access$BasicTextField$lambda$22(mutableState0, textFieldValue0);
                }
                return Unit.INSTANCE;
            }
        }
    }
}

