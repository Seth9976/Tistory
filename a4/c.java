package a4;

import com.kakao.kdtracker.KDTracker;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import okio.Path;

public final class c extends Lambda implements Function0 {
    public final int w;
    public final Function0 x;

    public c(Function0 function00, int v) {
        this.w = v;
        this.x = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f = 1.0f;
        switch(this.w) {
            case 0: {
                return ((Path)this.x.invoke()).toFile();
            }
            case 1: {
                this.x.invoke();
                return true;
            }
            case 2: {
                this.x.invoke();
                return true;
            }
            case 3: {
                this.x.invoke();
                return true;
            }
            case 4: {
                return kotlin.ranges.c.coerceIn(((Number)this.x.invoke()).floatValue(), 0.0f, 1.0f);
            }
            case 5: {
                return kotlin.ranges.c.coerceIn(((Number)this.x.invoke()).floatValue(), 0.0f, 1.0f);
            }
            case 6: {
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 7: {
                MemberScope memberScope0 = (MemberScope)this.x.invoke();
                return memberScope0 instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter)memberScope0).getActualScope() : memberScope0;
            }
            case 8: {
                return CollectionsKt___CollectionsKt.toSet(((Iterable)this.x.invoke()));
            }
            case 9: {
                try {
                    return (List)this.x.invoke();
                }
                catch(SSLPeerUnverifiedException unused_ex) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
            }
            case 10: {
                this.x.invoke();
                return true;
            }
            case 11: {
                this.x.invoke();
                return true;
            }
            case 12: {
                this.x.invoke();
                return true;
            }
            case 13: {
                this.x.invoke();
                return true;
            }
            case 14: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "size-tab", "customsize", null, "customsize", 4, null);
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 15: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "imagelist", "cancel-list", null, null, 12, null);
                this.x.invoke();
                return Unit.INSTANCE;
            }
            default: {
                if(((Number)this.x.invoke()).floatValue() < 1.0f) {
                    f = 0.3f;
                }
                return f;
            }
        }
    }
}

