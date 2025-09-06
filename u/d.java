package u;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import qd.a;

public final class d extends SuspendLambda implements Function2 {
    public boolean o;
    public int p;
    public Object q;
    public final PressGestureScope r;
    public final long s;
    public final MutableInteractionSource t;
    public final AbstractClickableNode u;

    public d(PressGestureScope pressGestureScope0, long v, MutableInteractionSource mutableInteractionSource0, AbstractClickableNode abstractClickableNode0, Continuation continuation0) {
        this.r = pressGestureScope0;
        this.s = v;
        this.t = mutableInteractionSource0;
        this.u = abstractClickableNode0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d(this.r, this.s, this.t, this.u, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Release pressInteraction$Release0;
        boolean z;
        Object object2;
        Job job0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        AbstractClickableNode abstractClickableNode0 = this.u;
        MutableInteractionSource mutableInteractionSource0 = this.t;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                job0 = BuildersKt.launch$default(((CoroutineScope)this.q), null, null, new c(this.u, this.s, this.t, null), 3, null);
                this.q = job0;
                this.p = 1;
                object2 = this.r.tryAwaitRelease(this);
                if(object2 == object1) {
                    return object1;
                }
            label_24:
                boolean z1 = ((Boolean)object2).booleanValue();
                if(job0.isActive()) {
                    this.q = null;
                    this.o = z1;
                    this.p = 2;
                    if(JobKt.cancelAndJoin(job0, this) == object1) {
                        return object1;
                    }
                    z = z1;
                label_32:
                    if(z) {
                        Press pressInteraction$Press0 = new Press(this.s, null);
                        Release pressInteraction$Release1 = new Release(pressInteraction$Press0);
                        this.q = pressInteraction$Release1;
                        this.p = 3;
                        if(mutableInteractionSource0.emit(pressInteraction$Press0, this) == object1) {
                            return object1;
                        }
                        pressInteraction$Release0 = pressInteraction$Release1;
                    label_40:
                        this.q = null;
                        this.p = 4;
                        if(mutableInteractionSource0.emit(pressInteraction$Release0, this) == object1) {
                            return object1;
                        }
                    }
                }
                else {
                    Press pressInteraction$Press1 = abstractClickableNode0.z;
                    if(pressInteraction$Press1 != null) {
                        Release pressInteraction$Release2 = z1 ? new Release(pressInteraction$Press1) : new Cancel(pressInteraction$Press1);
                        this.q = null;
                        this.p = 5;
                        if(mutableInteractionSource0.emit(pressInteraction$Release2, this) == object1) {
                            return object1;
                        }
                    }
                }
                break;
            }
            case 1: {
                job0 = (Job)this.q;
                ResultKt.throwOnFailure(object0);
                object2 = object0;
                goto label_24;
            }
            case 2: {
                z = this.o;
                ResultKt.throwOnFailure(object0);
                goto label_32;
            }
            case 3: {
                pressInteraction$Release0 = (Release)this.q;
                ResultKt.throwOnFailure(object0);
                goto label_40;
            }
            case 4: 
            case 5: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        abstractClickableNode0.z = null;
        return Unit.INSTANCE;
    }
}

