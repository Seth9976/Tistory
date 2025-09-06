package sa;

import com.kakao.kandinsky.core.kdphoto.Signature.Image;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.database.SignatureEntity;
import com.kakao.kandinsky.signature.database.SignatureEntityKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class h0 extends SuspendLambda implements Function2 {
    public final Signature o;
    public final Lambda p;
    public final SignatureVieModel q;

    public h0(Signature signature0, Function1 function10, SignatureVieModel signatureVieModel0, Continuation continuation0) {
        this.o = signature0;
        this.p = (Lambda)function10;
        this.q = signatureVieModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new h0(this.o, ((Function1)this.p), this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Unit unit0;
        ResultKt.throwOnFailure(object0);
        Lambda lambda0 = this.p;
        Signature signature0 = this.o;
        if(signature0 == null) {
            unit0 = null;
        }
        else {
            SignatureEntity signatureEntity0 = SignatureEntityKt.toEntity(signature0);
            int v = this.q.L0.insertOrUpdate(signatureEntity0);
            if(signature0 instanceof Image) {
                ((Function1)lambda0).invoke(Image.copy$default(((Image)signature0), v, null, 0.0f, null, 14, null));
            }
            else {
                if(!(signature0 instanceof Text)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((Function1)lambda0).invoke(Text.copy$default(((Text)signature0), v, null, false, null, 14, null));
            }
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            ((Function1)lambda0).invoke(null);
        }
        return Unit.INSTANCE;
    }
}

