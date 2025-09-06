package androidx.lifecycle;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/lifecycle/MethodCallsLogger;", "", "<init>", "()V", "", "name", "", "type", "", "approveCall", "(Ljava/lang/String;I)Z", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class MethodCallsLogger {
    public final HashMap a;

    public MethodCallsLogger() {
        this.a = new HashMap();
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean approveCall(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "name");
        HashMap hashMap0 = this.a;
        Integer integer0 = (Integer)hashMap0.get(s);
        int v1 = 0;
        int v2 = integer0 == null ? 0 : ((int)integer0);
        if((v2 & v) != 0) {
            v1 = 1;
        }
        hashMap0.put(s, ((int)(v | v2)));
        return v1 ^ 1;
    }
}

