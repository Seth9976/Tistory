package a;

import b.b0;
import b.r;
import b.s;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.home.contract.HomeMenu;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z0 extends Lambda implements Function1 {
    public final KandinskyActivity a;
    public final b0 b;

    public z0(KandinskyActivity kandinskyActivity0, b0 b00) {
        this.a = kandinskyActivity0;
        this.b = b00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        String s1;
        Intrinsics.checkNotNullParameter(((HomeMenu)object0), "it");
        this.a.getClass();
        s.c.getClass();
        s s0 = r.a(((HomeMenu)object0));
        switch((s0 == null ? -1 : o1.a[s0.ordinal()])) {
            case 2: {
                s1 = "size-tab";
                break;
            }
            case 3: {
                s1 = "crop-tab";
                break;
            }
            case 4: {
                s1 = "effect-tab";
                break;
            }
            case 5: {
                s1 = "sign-tab";
                break;
            }
            case 6: {
                s1 = "sticker-tab";
                break;
            }
            case 7: {
                s1 = "mosaicblur-tab";
                break;
            }
            case 8: {
                s1 = "text-tab";
                break;
            }
            case 9: {
                s1 = "frame-tab";
                break;
            }
            default: {
                s1 = "reset-button";
            }
        }
        KDTracker.clickEvent$default(KDTracker.INSTANCE, s1, null, null, null, 14, null);
        if(y0.a[((HomeMenu)object0).ordinal()] == 1) {
            this.b.l.invoke();
            return Unit.INSTANCE;
        }
        s s2 = r.a(((HomeMenu)object0));
        if(s2 != null) {
            this.b.k.invoke(s2);
        }
        return Unit.INSTANCE;
    }
}

