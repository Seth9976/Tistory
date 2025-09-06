package androidx.compose.ui.platform;

import aa.o;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt;
import androidx.compose.ui.text.input.TextInputService;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001F\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0012\u001A\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001B\u001A\u00020\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u0011\u0010\u001D\u001A\u00020\u001C8F¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001E¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/View;", "view", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "coroutineScope", "<init>", "(Landroid/view/View;Landroidx/compose/ui/text/input/TextInputService;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "request", "", "startInputMethod", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "isReadyForConnection", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, CoroutineScope {
    public static final int $stable = 8;
    public final View a;
    public final TextInputService b;
    public final CoroutineScope c;
    public final AtomicReference d;

    public AndroidPlatformTextInputSession(@NotNull View view0, @NotNull TextInputService textInputService0, @NotNull CoroutineScope coroutineScope0) {
        this.a = view0;
        this.b = textInputService0;
        this.c = coroutineScope0;
        this.d = SessionMutex.constructor-impl();
    }

    @Nullable
    public final InputConnection createInputConnection(@NotNull EditorInfo editorInfo0) {
        c1 c10 = (c1)SessionMutex.getCurrentSession-impl(this.d);
        if(c10 != null) {
            synchronized(c10.c) {
                if(c10.e) {
                    return null;
                }
                InputConnection inputConnection0 = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(c10.a.createInputConnection(editorInfo0), new g1(c10, 10));
                WeakReference weakReference0 = new WeakReference(inputConnection0);
                c10.d.add(weakReference0);
                return inputConnection0;
            }
        }
        return null;
    }

    @Override  // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.c.getCoroutineContext();
    }

    @Override  // androidx.compose.ui.platform.PlatformTextInputSession
    @NotNull
    public View getView() {
        return this.a;
    }

    public final boolean isReadyForConnection() {
        c1 c10 = (c1)SessionMutex.getCurrentSession-impl(this.d);
        return c10 != null && !c10.e == 1;
    }

    @Override  // androidx.compose.ui.platform.PlatformTextInputSession
    @Nullable
    public Object startInputMethod(@NotNull PlatformTextInputMethodRequest platformTextInputMethodRequest0, @NotNull Continuation continuation0) {
        i0 i00;
        if(continuation0 instanceof i0) {
            i00 = (i0)continuation0;
            int v = i00.q;
            if((v & 0x80000000) == 0) {
                i00 = new i0(this, continuation0);
            }
            else {
                i00.q = v ^ 0x80000000;
            }
        }
        else {
            i00 = new i0(this, continuation0);
        }
        Object object0 = i00.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i00.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                o o0 = new o(12, platformTextInputMethodRequest0, this);
                j0 j00 = new j0(this, null);
                i00.q = 1;
                if(SessionMutex.withSessionCancellingPrevious-impl(this.d, o0, j00, i00) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new KotlinNothingValueException();
    }
}

