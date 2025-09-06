package m0;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.CursorAnchorInfoController;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableSharedFlow;
import qd.a;

public final class i extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final MutableSharedFlow q;
    public final TransformedTextFieldState r;
    public final TextLayoutState s;
    public final ComposeInputMethodManager t;
    public final PlatformTextInputSession u;
    public final ImeOptions v;
    public final ReceiveContentConfiguration w;
    public final Function1 x;
    public final ViewConfiguration y;

    public i(PlatformTextInputSession platformTextInputSession0, TransformedTextFieldState transformedTextFieldState0, TextLayoutState textLayoutState0, ImeOptions imeOptions0, ReceiveContentConfiguration receiveContentConfiguration0, Function1 function10, ComposeInputMethodManager composeInputMethodManager0, MutableSharedFlow mutableSharedFlow0, ViewConfiguration viewConfiguration0, Continuation continuation0) {
        this.q = mutableSharedFlow0;
        this.r = transformedTextFieldState0;
        this.s = textLayoutState0;
        this.t = composeInputMethodManager0;
        this.u = platformTextInputSession0;
        this.v = imeOptions0;
        this.w = receiveContentConfiguration0;
        this.x = function10;
        this.y = viewConfiguration0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new i(this.u, this.r, this.s, this.v, this.w, this.x, this.t, this.q, this.y, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                TransformedTextFieldState transformedTextFieldState0 = this.r;
                ComposeInputMethodManager composeInputMethodManager0 = this.t;
                g g0 = new g(transformedTextFieldState0, composeInputMethodManager0, null);
                BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, g0, 1, null);
                MutableSharedFlow mutableSharedFlow0 = this.q;
                if(mutableSharedFlow0 != null) {
                    BuildersKt.launch$default(coroutineScope0, null, null, new h(mutableSharedFlow0, composeInputMethodManager0, null), 3, null);
                }
                CursorAnchorInfoController cursorAnchorInfoController0 = new CursorAnchorInfoController(transformedTextFieldState0, this.s, composeInputMethodManager0, coroutineScope0);
                e e0 = new e(this.r, this.v, this.w, this.t, this.x, cursorAnchorInfoController0, this.s, this.y);
                this.o = 1;
                if(this.u.startInputMethod(e0, this) == object1) {
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

