package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.SessionMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001A\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0014\u0010\u000E\u001A\u00020\u000B8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"androidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "request", "", "startInputMethod", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ChainedPlatformTextInputInterceptor.textInputSession.2.scope.1 implements PlatformTextInputSessionScope {
    public final PlatformTextInputSessionScope a;
    public final PlatformTextInputSessionScope b;
    public final AtomicReference c;
    public final w0 d;

    public ChainedPlatformTextInputInterceptor.textInputSession.2.scope.1(PlatformTextInputSessionScope platformTextInputSessionScope0, AtomicReference atomicReference0, w0 w00) {
        this.b = platformTextInputSessionScope0;
        this.c = atomicReference0;
        this.d = w00;
        this.a = platformTextInputSessionScope0;
    }

    @Override  // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.a.getCoroutineContext();
    }

    @Override  // androidx.compose.ui.platform.PlatformTextInputSession
    @NotNull
    public View getView() {
        return this.a.getView();
    }

    @Override  // androidx.compose.ui.platform.PlatformTextInputSession
    @Nullable
    public Object startInputMethod(@NotNull PlatformTextInputMethodRequest platformTextInputMethodRequest0, @NotNull Continuation continuation0) {
        s0 s00;
        if(continuation0 instanceof s0) {
            s00 = (s0)continuation0;
            int v = s00.q;
            if((v & 0x80000000) == 0) {
                s00 = new s0(this, continuation0);
            }
            else {
                s00.q = v ^ 0x80000000;
            }
        }
        else {
            s00 = new s0(this, continuation0);
        }
        Object object0 = s00.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(s00.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                u0 u00 = new u0(this.d, platformTextInputMethodRequest0, this.b, null);
                s00.q = 1;
                if(SessionMutex.withSessionCancellingPrevious-impl(this.c, f.F, u00, s00) == object1) {
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

