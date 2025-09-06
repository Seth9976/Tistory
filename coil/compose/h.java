package coil.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final Function1 w;
    public final Function1 x;
    public final Function1 y;

    public h(Function1 function10, Function1 function11, Function1 function12) {
        this.w = function10;
        this.x = function11;
        this.y = function12;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((State)object0) instanceof Loading) {
            Function1 function10 = this.w;
            if(function10 != null) {
                function10.invoke(((State)object0));
                return Unit.INSTANCE;
            }
        }
        else if(((State)object0) instanceof Success) {
            Function1 function11 = this.x;
            if(function11 != null) {
                function11.invoke(((State)object0));
                return Unit.INSTANCE;
            }
        }
        else if(((State)object0) instanceof Error) {
            Function1 function12 = this.y;
            if(function12 != null) {
                function12.invoke(((State)object0));
            }
        }
        return Unit.INSTANCE;
    }
}

