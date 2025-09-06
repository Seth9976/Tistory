package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.PlatformTextInputSession;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class c extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final PlatformTextInputSession q;
    public final a r;
    public final AndroidLegacyPlatformTextInputServiceAdapter s;
    public final LegacyPlatformTextInputNode t;

    public c(PlatformTextInputSession platformTextInputSession0, a a0, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter0, LegacyPlatformTextInputNode legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0, Continuation continuation0) {
        this.q = platformTextInputSession0;
        this.r = a0;
        this.s = androidLegacyPlatformTextInputServiceAdapter0;
        this.t = legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c(this.q, this.r, this.s, this.t, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter0 = this.s;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                PlatformTextInputSession platformTextInputSession0 = this.q;
                InputMethodManager inputMethodManager0 = (InputMethodManager)LegacyPlatformTextInputServiceAdapter_androidKt.getInputMethodManagerFactory().invoke(platformTextInputSession0.getView());
                LegacyTextInputMethodRequest legacyTextInputMethodRequest0 = new LegacyTextInputMethodRequest(platformTextInputSession0.getView(), new b(this.t), inputMethodManager0);
                a a0 = this.r;
                if(a0 != null) {
                    a0.invoke(legacyTextInputMethodRequest0);
                }
                androidLegacyPlatformTextInputServiceAdapter0.c = legacyTextInputMethodRequest0;
                try {
                    this.o = 1;
                    if(platformTextInputSession0.startInputMethod(legacyTextInputMethodRequest0, this) == object1) {
                        return object1;
                    label_16:
                        ResultKt.throwOnFailure(object0);
                    }
                    throw new KotlinNothingValueException();
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_16;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        androidLegacyPlatformTextInputServiceAdapter0.c = null;
        throw throwable0;
    }
}

