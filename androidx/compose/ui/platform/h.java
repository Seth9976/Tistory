package androidx.compose.ui.platform;

import android.graphics.Picture;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.FullyDrawnReporter;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.text.TextFieldKeyInput;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.viewinterop.FocusGroupNode_androidKt;
import androidx.paging.SuspendingPagingSourceFactory;
import ca.n0;
import j.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import u2.l;
import y.a;

public final class h extends FunctionReferenceImpl implements SuspendFunction, Function1 {
    public final int a;

    public h(int v, Object object0, Class class0, String s, String s1, int v1, int v2) {
        this.a = v2;
        super(v, object0, class0, s, s1, v1);
    }

    public h(Object object0, int v) {
        this.a = v;
        switch(v) {
            case 11: {
                super(1, object0, ScrollScope.class, "scrollBy", "scrollBy(F)F", 0);
                return;
            }
            case 12: {
                super(1, object0, ScrollScope.class, "scrollBy", "scrollBy(F)F", 0);
                return;
            }
            default: {
                super(1, object0, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
            }
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.a) {
            case 0: {
                ((AndroidComposeView)this.receiver).registerOnEndApplyChangesListener(((Function0)object0));
                return Unit.INSTANCE;
            }
            case 1: {
                return Boolean.valueOf(AndroidComposeView.access$onMoveFocusInChildren-3ESFkO8(((AndroidComposeView)this.receiver), ((FocusDirection)object0).unbox-impl()));
            }
            case 2: {
                ((n0)this.receiver).a.invoke(object0);
                return Unit.INSTANCE;
            }
            case 3: {
                return ((n0)this.receiver).a.invoke(object0);
            }
            case 4: {
                j j0 = (j)this.receiver;
                j0.getClass();
                BooleanRef ref$BooleanRef0 = new BooleanRef();
                j.h h0 = new j.h(ref$BooleanRef0, ((Function0)object0));
                SnapshotStateObserver snapshotStateObserver0 = j0.c;
                snapshotStateObserver0.observeReads(((Function0)object0), j0.d, h0);
                if(ref$BooleanRef0.element) {
                    snapshotStateObserver0.clear(j0.b);
                    FullyDrawnReporter fullyDrawnReporter0 = j0.a;
                    if(!fullyDrawnReporter0.isFullyDrawnReported()) {
                        fullyDrawnReporter0.removeReporter();
                    }
                    snapshotStateObserver0.clear();
                    snapshotStateObserver0.stop();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                KeyEvent keyEvent0 = ((androidx.compose.ui.input.key.KeyEvent)object0).unbox-impl();
                return Boolean.valueOf(((TextFieldKeyInput)this.receiver).process-ZmokQxo(keyEvent0));
            }
            case 6: {
                TextFieldDecoratorModifierNode.access$onImeActionPerformed-KlQnJC8(((TextFieldDecoratorModifierNode)this.receiver), ((ImeAction)object0).unbox-impl());
                return Unit.INSTANCE;
            }
            case 7: {
                return ((SuspendingPagingSourceFactory)this.receiver).create(((Continuation)object0));
            }
            case 8: {
                return ((PullRefreshState)this.receiver).onPull$material_release(((Number)object0).floatValue());
            }
            case 9: {
                int v = ((FocusDirection)object0).unbox-impl();
                l l0 = (l)this.receiver;
                l0.getClass();
                View view0 = FocusGroupNode_androidKt.access$getView(l0);
                if(!view0.isFocused() && !view0.hasFocus()) {
                    FocusOwner focusOwner0 = DelegatableNodeKt.requireOwner(l0).getFocusOwner();
                    Owner owner0 = DelegatableNodeKt.requireOwner(l0);
                    Intrinsics.checkNotNull(owner0, "null cannot be cast to non-null type android.view.View");
                    return FocusInteropUtils_androidKt.requestInteropFocus(view0, FocusInteropUtils_androidKt.toAndroidFocusDirection-3ESFkO8(v), FocusGroupNode_androidKt.access$getCurrentlyFocusedRect(focusOwner0, ((View)owner0), view0)) ? FocusRequester.Companion.getDefault() : FocusRequester.Companion.getCancel();
                }
                return FocusRequester.Companion.getDefault();
            }
            case 10: {
                int v1 = ((FocusDirection)object0).unbox-impl();
                l l1 = (l)this.receiver;
                l1.getClass();
                View view1 = FocusGroupNode_androidKt.access$getView(l1);
                if(!view1.hasFocus()) {
                    return FocusRequester.Companion.getDefault();
                }
                FocusOwner focusOwner1 = DelegatableNodeKt.requireOwner(l1).getFocusOwner();
                Owner owner1 = DelegatableNodeKt.requireOwner(l1);
                Intrinsics.checkNotNull(owner1, "null cannot be cast to non-null type android.view.View");
                if(!(view1 instanceof ViewGroup)) {
                    if(!((View)owner1).requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                    return FocusRequester.Companion.getDefault();
                }
                Rect rect0 = FocusGroupNode_androidKt.access$getCurrentlyFocusedRect(focusOwner1, ((View)owner1), view1);
                Integer integer0 = FocusInteropUtils_androidKt.toAndroidFocusDirection-3ESFkO8(v1);
                int v2 = integer0 == null ? 130 : ((int)integer0);
                FocusFinder focusFinder0 = FocusFinder.getInstance();
                View view2 = l1.n;
                View view3 = view2 == null ? focusFinder0.findNextFocusFromRect(((ViewGroup)(((View)owner1))), rect0, v2) : focusFinder0.findNextFocus(((ViewGroup)(((View)owner1))), view2, v2);
                if(view3 != null && FocusGroupNode_androidKt.access$containsDescendant(view1, view3)) {
                    view3.requestFocus(v2, rect0);
                    return FocusRequester.Companion.getCancel();
                }
                if(!((View)owner1).requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
                return FocusRequester.Companion.getDefault();
            }
            case 11: {
                return ((ScrollScope)this.receiver).scrollBy(((Number)object0).floatValue());
            }
            case 12: {
                return ((ScrollScope)this.receiver).scrollBy(((Number)object0).floatValue());
            }
            default: {
                ((a)this.receiver).getClass();
                Picture picture0 = new Picture();
                ((a)this.receiver).a = picture0;
                return ((CacheDrawScope)object0).onDrawWithContent(new i(((int)Size.getWidth-impl(((CacheDrawScope)object0).getSize-NH-jbRc())), ((int)Size.getHeight-impl(((CacheDrawScope)object0).getSize-NH-jbRc())), 2, picture0));
            }
        }
    }
}

