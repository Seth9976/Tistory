package androidx.compose.ui.input.pointer;

import androidx.compose.foundation.text.selection.w0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u2.d;
import x1.l;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A/\u0010\u0000\u001A\u00020\u0001*\u00020\u00012!\u0010\u0002\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003H\u0007\u001A,\u0010\t\u001A\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0003H\u0007\u001A\u0014\u0010\t\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u000E\u001A\u00020\u000FH\u0001¨\u0006\u0010"}, d2 = {"motionEventSpy", "Landroidx/compose/ui/Modifier;", "watcher", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lkotlin/ParameterName;", "name", "motionEvent", "", "pointerInteropFilter", "requestDisallowInterceptTouchEvent", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "onTouchEvent", "", "view", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,352:1\n135#2:353\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n73#1:353\n*E\n"})
public final class PointerInteropFilter_androidKt {
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier motionEventSpy(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier0, function10, new l(function10, null));
    }

    // 去混淆评级： 低(30)
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier pointerInteropFilter(@NotNull Modifier modifier0, @Nullable RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0, @NotNull Function1 function10) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new w0(9, requestDisallowInterceptTouchEvent0, function10));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n1#1,178:1\n74#2,4:179\n*E\n"})
        public final class androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final RequestDisallowInterceptTouchEvent w;
            public final Function1 x;

            public androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter..inlined.debugInspectorInfo.1(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0, Function1 function10) {
                this.w = requestDisallowInterceptTouchEvent0;
                this.x = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("pointerInteropFilter");
                inspectorInfo0.getProperties().set("requestDisallowInterceptTouchEvent", this.w);
                inspectorInfo0.getProperties().set("onTouchEvent", this.x);
            }
        }

    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier pointerInteropFilter(@NotNull Modifier modifier0, @NotNull AndroidViewHolder androidViewHolder0) {
        PointerInteropFilter pointerInteropFilter0 = new PointerInteropFilter();
        pointerInteropFilter0.setOnTouchEvent(new d(androidViewHolder0, 1));
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0 = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter0.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent0);
        androidViewHolder0.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent0);
        return modifier0.then(pointerInteropFilter0);
    }

    public static Modifier pointerInteropFilter$default(Modifier modifier0, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            requestDisallowInterceptTouchEvent0 = null;
        }
        return PointerInteropFilter_androidKt.pointerInteropFilter(modifier0, requestDisallowInterceptTouchEvent0, function10);
    }
}

