package kotlin.text;

import java.util.regex.Matcher;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class g extends RestrictedSuspendLambda implements Function2 {
    public Matcher p;
    public int q;
    public int r;
    public Object s;
    public final Regex t;
    public final CharSequence u;
    public final int v;

    public g(Regex regex0, CharSequence charSequence0, int v, Continuation continuation0) {
        this.t = regex0;
        this.u = charSequence0;
        this.v = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new g(this.t, this.u, this.v, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        int v2;
        Matcher matcher1;
        SequenceScope sequenceScope1;
        int v1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        int v = this.v;
        CharSequence charSequence0 = this.u;
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SequenceScope sequenceScope0 = (SequenceScope)this.s;
                Matcher matcher0 = this.t.a.matcher(charSequence0);
                if(v != 1 && matcher0.find()) {
                    v1 = 0;
                    sequenceScope1 = sequenceScope0;
                    matcher1 = matcher0;
                    v2 = 0;
                    goto label_37;
                }
                this.r = 1;
                return sequenceScope0.yield(charSequence0.toString(), this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 2: {
                v2 = this.q;
                Matcher matcher2 = this.p;
                sequenceScope1 = (SequenceScope)this.s;
                ResultKt.throwOnFailure(object0);
                matcher1 = matcher2;
                break;
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            v1 = matcher1.end();
            ++v2;
            if(v2 == v - 1 || !matcher1.find()) {
                String s = charSequence0.subSequence(v1, charSequence0.length()).toString();
                this.s = null;
                this.p = null;
                this.r = 3;
                return sequenceScope1.yield(s, this) == object1 ? object1 : Unit.INSTANCE;
            }
        label_37:
            String s1 = charSequence0.subSequence(v1, matcher1.start()).toString();
            this.s = sequenceScope1;
            this.p = matcher1;
            this.q = v2;
            this.r = 2;
        }
        while(sequenceScope1.yield(s1, this) != object1);
        return object1;
    }
}

