package a;

import androidx.lifecycle.ViewModelKt;
import b.a;
import b.b0;
import com.kakao.kandinsky.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;

public final class x1 extends Lambda implements Function0 {
    public final b a;
    public final b0 b;

    public x1(b b0, b0 b00) {
        this.a = b0;
        this.b = b00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.getClass();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this.a), null, null, new u1(this.a, this.b.f, null), 3, null);
        a a0 = new a(null);
        this.a.sendEvent(a0);
        return Unit.INSTANCE;
    }
}

