package jg;

import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.AbstractJsonLexer;
import kotlinx.serialization.json.internal.JsonTreeReader;
import qd.a;

public final class i extends RestrictedSuspendLambda implements Function3 {
    public int p;
    public DeepRecursiveScope q;
    public final JsonTreeReader r;

    public i(JsonTreeReader jsonTreeReader0, Continuation continuation0) {
        this.r = jsonTreeReader0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Unit unit0 = (Unit)object1;
        i i0 = new i(this.r, ((Continuation)object2));
        i0.q = (DeepRecursiveScope)object0;
        return i0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                DeepRecursiveScope deepRecursiveScope0 = this.q;
                JsonTreeReader jsonTreeReader0 = this.r;
                int v = JsonTreeReader.access$getLexer$p(jsonTreeReader0).peekNextToken();
                if(v == 1) {
                    return JsonTreeReader.access$readValue(jsonTreeReader0, true);
                }
                if(v == 0) {
                    return JsonTreeReader.access$readValue(jsonTreeReader0, false);
                }
                switch(v) {
                    case 6: {
                        this.p = 1;
                        object0 = JsonTreeReader.access$readObject(jsonTreeReader0, deepRecursiveScope0, this);
                        return object0 == object1 ? object1 : ((JsonElement)object0);
                    }
                    case 8: {
                        return JsonTreeReader.access$readArray(jsonTreeReader0);
                    }
                    default: {
                        AbstractJsonLexer.fail$default(JsonTreeReader.access$getLexer$p(jsonTreeReader0), "Can\'t begin reading element, unexpected token", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return (JsonElement)object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

