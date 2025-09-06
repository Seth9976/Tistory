package ka;

import androidx.compose.runtime.State;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import com.kakao.kandinsky.mosaic.MosaicScreenKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class e extends SuspendLambda implements Function2 {
    public int o;
    public final MosaicAndBlurBitmapLoader p;
    public final State q;

    public e(State state0, MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, Continuation continuation0) {
        this.p = mosaicAndBlurBitmapLoader0;
        this.q = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new e(this.q, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((KDPhoto)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                KDPhoto kDPhoto0 = MosaicScreenKt.access$MosaicScreen$lambda$0(this.q).getPhoto();
                this.p.setPhoto(kDPhoto0);
                this.o = 1;
                return this.p.loadFullBitmap(this) == object1 ? object1 : Unit.INSTANCE;
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

