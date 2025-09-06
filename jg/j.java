package jg;

import java.util.LinkedHashMap;
import kotlin.DeepRecursiveScope;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.internal.JsonTreeReader;

public final class j extends ContinuationImpl {
    public DeepRecursiveScope o;
    public JsonTreeReader p;
    public LinkedHashMap q;
    public String r;
    public Object s;
    public final JsonTreeReader t;
    public int u;

    public j(JsonTreeReader jsonTreeReader0, Continuation continuation0) {
        this.t = jsonTreeReader0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return JsonTreeReader.access$readObject(this.t, null, this);
    }
}

