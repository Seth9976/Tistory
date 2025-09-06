package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u2.b;
import x1.i;
import x1.j;

@StabilityInferred(parameters = 1)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR.\u0010\u0015\u001A\u0004\u0018\u00010\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\r8\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001C\u001A\u00020\u00068\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\u001A\u0010\"\u001A\u00020\u001D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "<init>", "()V", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "onTouchEvent", "Lkotlin/jvm/functions/Function1;", "getOnTouchEvent", "()Lkotlin/jvm/functions/Function1;", "setOnTouchEvent", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "value", "a", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "getRequestDisallowInterceptTouchEvent", "()Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "setRequestDisallowInterceptTouchEvent", "(Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;)V", "requestDisallowInterceptTouchEvent", "b", "Z", "getDisallowIntercept$ui_release", "()Z", "setDisallowIntercept$ui_release", "(Z)V", "disallowIntercept", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "c", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputFilter", "x1/i", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PointerInteropFilter implements PointerInputModifier {
    public static final int $stable;
    public RequestDisallowInterceptTouchEvent a;
    public boolean b;
    public final androidx.compose.ui.input.pointer.PointerInteropFilter.pointerInputFilter.1 c;
    public Function1 onTouchEvent;

    public PointerInteropFilter() {
        this.c = new PointerInputFilter() {
            public i c;

            {
                this.c = i.a;
            }

            public final void a(PointerEvent pointerEvent0) {
                PointerInteropFilter pointerInteropFilter0;
                List list0 = pointerEvent0.getChanges();
                int v = list0.size();
                for(int v2 = 0; true; ++v2) {
                    i i0 = i.b;
                    pointerInteropFilter0 = this.d;
                    if(v2 >= v) {
                        break;
                    }
                    if(((PointerInputChange)list0.get(v2)).isConsumed()) {
                        if(this.c == i0) {
                            LayoutCoordinates layoutCoordinates0 = this.getLayoutCoordinates$ui_release();
                            if(layoutCoordinates0 == null) {
                                throw new IllegalStateException("layoutCoordinates not set");
                            }
                            PointerInteropUtils_androidKt.toCancelMotionEventScope-d-4ec7I(pointerEvent0, layoutCoordinates0.localToRoot-MK-Hz9U(0L), new j(pointerInteropFilter0, 0));
                        }
                        this.c = i.c;
                        return;
                    }
                }
                LayoutCoordinates layoutCoordinates1 = this.getLayoutCoordinates$ui_release();
                if(layoutCoordinates1 == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                PointerInteropUtils_androidKt.toMotionEventScope-d-4ec7I(pointerEvent0, layoutCoordinates1.localToRoot-MK-Hz9U(0L), new b(6, this, pointerInteropFilter0));
                if(this.c == i0) {
                    int v3 = list0.size();
                    for(int v1 = 0; v1 < v3; ++v1) {
                        ((PointerInputChange)list0.get(v1)).consume();
                    }
                    InternalPointerEvent internalPointerEvent0 = pointerEvent0.getInternalPointerEvent$ui_release();
                    if(internalPointerEvent0 != null) {
                        internalPointerEvent0.setSuppressMovementConsumption(!pointerInteropFilter0.getDisallowIntercept$ui_release());
                    }
                }
            }

            @Override  // androidx.compose.ui.input.pointer.PointerInputFilter
            public boolean getShareWithSiblings() {
                return true;
            }

            @Override  // androidx.compose.ui.input.pointer.PointerInputFilter
            public void onCancel() {
                if(this.c == i.b) {
                    PointerInteropUtils_androidKt.emptyCancelMotionEventScope(SystemClock.uptimeMillis(), new j(this.d, 1));
                    this.c = i.a;
                    this.d.setDisallowIntercept$ui_release(false);
                }
            }

            @Override  // androidx.compose.ui.input.pointer.PointerInputFilter
            public void onPointerEvent-H0pRuoY(@NotNull PointerEvent pointerEvent0, @NotNull PointerEventPass pointerEventPass0, long v) {
                boolean z;
                List list0 = pointerEvent0.getChanges();
                PointerInteropFilter pointerInteropFilter0 = this.d;
                if(!pointerInteropFilter0.getDisallowIntercept$ui_release()) {
                    z = false;
                    int v1 = list0.size();
                    int v2 = 0;
                    while(true) {
                        if(v2 >= v1) {
                            goto label_12;
                        }
                        PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v2);
                        if(PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange0) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                            break;
                        }
                        ++v2;
                    }
                }
                z = true;
            label_12:
                if(this.c != i.c) {
                    if(pointerEventPass0 == PointerEventPass.Initial && z) {
                        this.a(pointerEvent0);
                    }
                    if(pointerEventPass0 == PointerEventPass.Final && !z) {
                        this.a(pointerEvent0);
                    }
                }
                if(pointerEventPass0 == PointerEventPass.Final) {
                    int v3 = list0.size();
                    for(int v4 = 0; true; ++v4) {
                        if(v4 >= v3) {
                            this.c = i.a;
                            pointerInteropFilter0.setDisallowIntercept$ui_release(false);
                            break;
                        }
                        if(!PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)list0.get(v4)))) {
                            break;
                        }
                    }
                }
            }
        };
    }

    public final boolean getDisallowIntercept$ui_release() {
        return this.b;
    }

    @NotNull
    public final Function1 getOnTouchEvent() {
        Function1 function10 = this.onTouchEvent;
        if(function10 != null) {
            return function10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
        return null;
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputModifier
    @NotNull
    public PointerInputFilter getPointerInputFilter() {
        return this.c;
    }

    @Nullable
    public final RequestDisallowInterceptTouchEvent getRequestDisallowInterceptTouchEvent() {
        return this.a;
    }

    public final void setDisallowIntercept$ui_release(boolean z) {
        this.b = z;
    }

    public final void setOnTouchEvent(@NotNull Function1 function10) {
        this.onTouchEvent = function10;
    }

    public final void setRequestDisallowInterceptTouchEvent(@Nullable RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent1 = this.a;
        if(requestDisallowInterceptTouchEvent1 != null) {
            requestDisallowInterceptTouchEvent1.setPointerInteropFilter$ui_release(null);
        }
        this.a = requestDisallowInterceptTouchEvent0;
        if(requestDisallowInterceptTouchEvent0 != null) {
            requestDisallowInterceptTouchEvent0.setPointerInteropFilter$ui_release(this);
        }
    }
}

