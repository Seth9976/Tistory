package androidx.compose.material3;

import android.graphics.Matrix;
import android.util.Log;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.ContentInViewNode.Request;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.material.BottomDrawerValue;
import androidx.compose.material.DrawerKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.State;
import androidx.constraintlayout.compose.p;
import androidx.constraintlayout.compose.u;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import androidx.navigation.fragment.FragmentNavigator;
import b0.h;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.preview.PreviewAnimator;
import com.kakao.kandinsky.selector.SelectorImageDate;
import com.kakao.kandinsky.textedit.TextEditorKt;
import com.kakao.kandinsky.textedit.ui.EditState;
import com.kakao.kdtracker.KDTracker;
import f0.t;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
import s0.g;

public final class td extends Lambda implements Function0 {
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public td(NavBackStackEntry navBackStackEntry0, NavigatorState navigatorState0, FragmentNavigator fragmentNavigator0, Fragment fragment0) {
        this.w = 13;
        this.x = navigatorState0;
        this.y = fragmentNavigator0;
        this.z = fragment0;
        super(0);
    }

    public td(Object object0, Object object1, int v, Object object2) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        super(0);
    }

    public td(String s, Function0 function00, MutableState mutableState0) {
        this.w = 6;
        this.x = s;
        this.z = function00;
        this.y = mutableState0;
        super(0);
    }

    public td(g g0, Function0 function00, String s, LayoutDirection layoutDirection0) {
        this.w = 16;
        this.x = g0;
        this.z = function00;
        this.y = layoutDirection0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TextData textData0 = null;
        Object object0 = this.y;
        Object object1 = this.z;
        Object object2 = this.x;
        switch(this.w) {
            case 0: {
                if(((Boolean)((SheetState)object2).getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden)).booleanValue()) {
                    BuildersKt.launch$default(((CoroutineScope)object0), null, null, new rd(((SheetState)object2), null), 3, null).invokeOnCompletion(new sd(((SheetState)object2), ((Function0)object1), 0));
                }
                return Unit.INSTANCE;
            }
            case 1: {
                if(((Boolean)((SheetState)object2).getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded)).booleanValue()) {
                    BuildersKt.launch$default(((CoroutineScope)object0), null, null, new zd(((SheetState)object1), null), 3, null);
                }
                return true;
            }
            case 2: {
                int v1 = ((List)object2).size();
                if(v1 - 1 >= 0) {
                    for(int v = 0; true; ++v) {
                        Object object3 = ((Measurable)((List)object2).get(v)).getParentData();
                        p p0 = object3 instanceof p ? ((p)object3) : null;
                        if(p0 != null) {
                            ConstrainScope constrainScope0 = new ConstrainScope(p0.a.getId());
                            p0.b.invoke(constrainScope0);
                            constrainScope0.applyTo$compose_release(((State)object0));
                        }
                        ((u)object1).f.add(p0);
                        if(v + 1 > v1 - 1) {
                            break;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            case 3: {
                LazyListIntervalContent lazyListIntervalContent0 = (LazyListIntervalContent)((androidx.compose.runtime.State)object2).getValue();
                return new h(((LazyListState)object0), lazyListIntervalContent0, ((LazyItemScopeImpl)object1), new NearestRangeKeyIndexMap(((LazyListState)object0).getNearestRange$foundation_release(), lazyListIntervalContent0));
            }
            case 4: {
                NodeCoordinator.access$drawContainedDrawModifiers(((NodeCoordinator)object2), ((Canvas)object0), ((GraphicsLayer)object1));
                return Unit.INSTANCE;
            }
            case 5: {
                TextEditorKt.access$stateTrackerClickEvent(((String)object2), EditState.KEYBOARD);
                FocusManager.clearFocus$default(((FocusManager)object0), false, 1, null);
                ((FocusRequester)object1).requestFocus();
                return Unit.INSTANCE;
            }
            case 6: {
                TextData textData1 = TextEditorKt.access$TextEditor$lambda$9(((MutableState)object0));
                if(!kotlin.text.p.isBlank(textData1.getText())) {
                    textData0 = textData1;
                }
                if(textData0 != null) {
                    TextEditorKt.access$confirmTrackerClickEvent(((String)object2));
                }
                ((Function0)object1).invoke();
                return Unit.INSTANCE;
            }
            case 7: {
                Function4 function40 = (Function4)((androidx.compose.runtime.State)object2).getValue();
                Function1 function10 = (Function1)((androidx.compose.runtime.State)object0).getValue();
                return new t(((Number)((Function0)object1).invoke()).intValue(), function10, function40);
            }
            case 8: {
                Rect rect2 = BringIntoViewResponderNode.access$bringChildIntoView$localRect(((BringIntoViewResponderNode)object2), ((LayoutCoordinates)object0), ((Function0)object1));
                return rect2 != null ? ((BringIntoViewResponderNode)object2).getResponder().calculateRectForParent(rect2) : null;
            }
            case 9: {
                CertificateChainCleaner certificateChainCleaner0 = ((CertificatePinner)object2).getCertificateChainCleaner$okhttp();
                List list0 = (List)object0;
                if(certificateChainCleaner0 != null) {
                    List list1 = certificateChainCleaner0.clean(list0, ((String)object1));
                    if(list1 != null) {
                        list0 = list1;
                    }
                }
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                for(Object object4: list0) {
                    Intrinsics.checkNotNull(((Certificate)object4), "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList0.add(((X509Certificate)(((Certificate)object4))));
                }
                return arrayList0;
            }
            case 10: {
                Matrix matrix0 = new Matrix();
                matrix0.setValues(new float[]{((Number)PreviewAnimator.access$getAnimatedMatrix$lambda$13(((androidx.compose.runtime.State)object2)).getFirst()).floatValue(), ((Number)PreviewAnimator.access$getAnimatedMatrix$lambda$13(((androidx.compose.runtime.State)object2)).getSecond()).floatValue(), ((Number)PreviewAnimator.access$getAnimatedMatrix$lambda$13(((androidx.compose.runtime.State)object2)).getThird()).floatValue(), ((Number)PreviewAnimator.access$getAnimatedMatrix$lambda$15(((androidx.compose.runtime.State)object0)).getFirst()).floatValue(), ((Number)PreviewAnimator.access$getAnimatedMatrix$lambda$15(((androidx.compose.runtime.State)object0)).getSecond()).floatValue(), ((Number)PreviewAnimator.access$getAnimatedMatrix$lambda$15(((androidx.compose.runtime.State)object0)).getThird()).floatValue(), ((Number)PreviewAnimator.access$getAnimatedMatrix$lambda$17(((androidx.compose.runtime.State)object1)).getFirst()).floatValue(), ((Number)PreviewAnimator.access$getAnimatedMatrix$lambda$17(((androidx.compose.runtime.State)object1)).getSecond()).floatValue(), ((Number)PreviewAnimator.access$getAnimatedMatrix$lambda$17(((androidx.compose.runtime.State)object1)).getThird()).floatValue()});
                return matrix0;
            }
            case 11: {
                return DrawerKt.BottomDrawerState(((BottomDrawerValue)object2), ((Density)object0), ((Function1)object1));
            }
            case 12: {
                return new SwipeableState(object2, ((AnimationSpec)object0), ((Function1)object1));
            }
            case 13: {
                for(Object object5: ((Iterable)((NavigatorState)object2).getTransitionsInProgress().getValue())) {
                    NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object5;
                    if(FragmentNavigator.access$isLoggingEnabled(((FragmentNavigator)object0), 2)) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry0 + " due to fragment " + ((Fragment)object1) + " viewmodel being cleared");
                    }
                    ((NavigatorState)object2).markTransitionComplete(navBackStackEntry0);
                }
                return Unit.INSTANCE;
            }
            case 14: {
                CertificateChainCleaner certificateChainCleaner1 = ((CertificatePinner)object2).getCertificateChainCleaner$okhttp();
                Intrinsics.checkNotNull(certificateChainCleaner1);
                return certificateChainCleaner1.clean(((Handshake)object0).peerCertificates(), ((Address)object1).url().host());
            }
            case 15: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "imagelist", "selectimage", null, "selectimage", 4, null);
                ((Function1)object2).invoke(((SelectorImageDate)object0).getIndex());
                ((Function0)object1).invoke();
                return Unit.INSTANCE;
            }
            case 16: {
                ((g)object2).c(((Function0)object1), ((LayoutDirection)object0));
                return Unit.INSTANCE;
            }
            default: {
                BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue0 = ((ContentInViewNode)object2).r;
                while(bringIntoViewRequestPriorityQueue0.a.isNotEmpty()) {
                    Rect rect0 = (Rect)((Request)bringIntoViewRequestPriorityQueue0.a.last()).getCurrentBounds().invoke();
                    if(!(rect0 == null ? true : ((ContentInViewNode)object2).c(((ContentInViewNode)object2).v, rect0))) {
                        break;
                    }
                    ((Request)bringIntoViewRequestPriorityQueue0.a.removeAt(bringIntoViewRequestPriorityQueue0.a.getSize() - 1)).getContinuation().resumeWith(Unit.INSTANCE);
                }
                if(((ContentInViewNode)object2).u) {
                    Rect rect1 = ((ContentInViewNode)object2).b();
                    if(rect1 != null && ((ContentInViewNode)object2).c(((ContentInViewNode)object2).v, rect1)) {
                        ((ContentInViewNode)object2).u = false;
                    }
                }
                ((UpdatableAnimationState)object0).setValue(ContentInViewNode.access$calculateScrollDelta(((ContentInViewNode)object2), ((BringIntoViewSpec)object1)));
                return Unit.INSTANCE;
            }
        }
    }
}

