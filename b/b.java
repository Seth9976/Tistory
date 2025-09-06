package b;

import com.kakao.kandinsky.base.contract.DialogUiState;
import kotlin.jvm.internal.Intrinsics;

public final class b extends c {
    public final DialogUiState a;

    static {
    }

    public b(DialogUiState dialogUiState0) {
        Intrinsics.checkNotNullParameter(dialogUiState0, "dialogUiState");
        super(0);
        this.a = dialogUiState0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? Intrinsics.areEqual(this.a, ((b)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ShowDialog(dialogUiState=" + this.a + ")";
    }
}

