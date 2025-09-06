package i2;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter;
import androidx.compose.ui.text.font.PlatformFontLoader;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class m extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final ArrayList q;
    public final FontListFontFamilyTypefaceAdapter r;
    public final PlatformFontLoader s;

    public m(ArrayList arrayList0, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter0, PlatformFontLoader platformFontLoader0, Continuation continuation0) {
        this.q = arrayList0;
        this.r = fontListFontFamilyTypefaceAdapter0;
        this.s = platformFontLoader0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                ArrayList arrayList0 = this.q;
                HashSet hashSet0 = new HashSet(arrayList0.size());
                ArrayList arrayList1 = new ArrayList(arrayList0.size());
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    Object object2 = arrayList0.get(v1);
                    if(hashSet0.add(((Font)object2))) {
                        arrayList1.add(object2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList1.size());
                int v2 = arrayList1.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    Font font0 = (Font)arrayList1.get(v3);
                    arrayList2.add(BuildersKt.async$default(coroutineScope0, null, null, new l(this.r, font0, this.s, null), 3, null));
                }
                this.o = 1;
                return AwaitKt.joinAll(arrayList2, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

