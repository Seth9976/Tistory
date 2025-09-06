package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000 \u000B2\u00020\u0001:\u0001\u000BB\u0005¢\u0006\u0002\u0010\u0002J\u000E\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nR\u0012\u0010\u0003\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "", "()V", "receiveContentListener", "Landroidx/compose/foundation/content/ReceiveContentListener;", "getReceiveContentListener", "()Landroidx/compose/foundation/content/ReceiveContentListener;", "onCommitContent", "", "transferableContent", "Landroidx/compose/foundation/content/TransferableContent;", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class ReceiveContentConfiguration {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration$Companion;", "", "Landroidx/compose/foundation/content/ReceiveContentListener;", "receiveContentListener", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "invoke", "(Landroidx/compose/foundation/content/ReceiveContentListener;)Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ReceiveContentConfiguration invoke(@NotNull ReceiveContentListener receiveContentListener0) {
            return new a(receiveContentListener0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;

    static {
        ReceiveContentConfiguration.Companion = new Companion(null);
    }

    @NotNull
    public abstract ReceiveContentListener getReceiveContentListener();

    public final boolean onCommitContent(@NotNull TransferableContent transferableContent0) {
        return !Intrinsics.areEqual(this.getReceiveContentListener().onReceive(transferableContent0), transferableContent0);
    }
}

