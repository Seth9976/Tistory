package pa;

import android.content.Context;
import android.widget.Toast;
import com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent.2.2.WhenMappings;
import com.kakao.kandinsky.resize.contract.ResizeEvent.BounceAnimation;
import com.kakao.kandinsky.resize.contract.ResizeEvent.Go;
import com.kakao.kandinsky.resize.contract.ResizeEvent.ShowToast;
import com.kakao.kandinsky.resize.contract.ResizeEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class g extends SuspendLambda implements Function2 {
    public Object o;
    public final Function0 p;
    public final Context q;
    public final Function2 r;

    public g(Function0 function00, Context context0, Function2 function20, Continuation continuation0) {
        this.p = function00;
        this.q = context0;
        this.r = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new g(this.p, this.q, this.r, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g)this.create(((ResizeEvent)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        ResizeEvent resizeEvent0 = (ResizeEvent)this.o;
        if(!(resizeEvent0 instanceof Go)) {
            if(resizeEvent0 instanceof ShowToast) {
                CharSequence charSequence0 = this.q.getResources().getText(((ShowToast)resizeEvent0).getStringRes());
                Toast.makeText(this.q, charSequence0, 0).show();
                return Unit.INSTANCE;
            }
            if(resizeEvent0 instanceof BounceAnimation) {
                Integer integer0 = Boxing.boxInt(((BounceAnimation)resizeEvent0).getFrom());
                Integer integer1 = Boxing.boxInt(((BounceAnimation)resizeEvent0).getTo());
                this.r.invoke(integer0, integer1);
            }
        }
        else if(ReSizeScreenKt.ConsumeEvent.2.2.WhenMappings.$EnumSwitchMapping$0[((Go)resizeEvent0).getDestination().ordinal()] == 1) {
            this.p.invoke();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}

