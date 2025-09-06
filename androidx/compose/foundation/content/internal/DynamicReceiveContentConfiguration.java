package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\tR\u001A\u0010\u000F\u001A\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/content/internal/DynamicReceiveContentConfiguration;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "Landroidx/compose/foundation/content/ReceiveContentNode;", "receiveContentNode", "<init>", "(Landroidx/compose/foundation/content/ReceiveContentNode;)V", "a", "Landroidx/compose/foundation/content/ReceiveContentNode;", "getReceiveContentNode", "()Landroidx/compose/foundation/content/ReceiveContentNode;", "Landroidx/compose/foundation/content/ReceiveContentListener;", "b", "Landroidx/compose/foundation/content/ReceiveContentListener;", "getReceiveContentListener", "()Landroidx/compose/foundation/content/ReceiveContentListener;", "receiveContentListener", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DynamicReceiveContentConfiguration extends ReceiveContentConfiguration {
    public static final int $stable = 8;
    public final ReceiveContentNode a;
    public final androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration.receiveContentListener.1 b;

    public DynamicReceiveContentConfiguration(@NotNull ReceiveContentNode receiveContentNode0) {
        this.a = receiveContentNode0;
        this.b = new ReceiveContentListener() {
            public int a;
            public final DynamicReceiveContentConfiguration b;

            {
                this.b = dynamicReceiveContentConfiguration0;
            }

            @Override  // androidx.compose.foundation.content.ReceiveContentListener
            public void onDragEnd() {
                this.b.getReceiveContentNode().getReceiveContentListener().onDragEnd();
                this.a = 0;
            }

            @Override  // androidx.compose.foundation.content.ReceiveContentListener
            public void onDragEnter() {
                int v = this.a + 1;
                this.a = v;
                DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration0 = this.b;
                if(v == 1) {
                    dynamicReceiveContentConfiguration0.getReceiveContentNode().getReceiveContentListener().onDragEnter();
                }
                ReceiveContentListener receiveContentListener0 = DynamicReceiveContentConfiguration.access$getParentReceiveContentListener(dynamicReceiveContentConfiguration0);
                if(receiveContentListener0 != null) {
                    receiveContentListener0.onDragEnter();
                }
            }

            @Override  // androidx.compose.foundation.content.ReceiveContentListener
            public void onDragExit() {
                int v = this.a;
                int v1 = c.coerceAtLeast(v - 1, 0);
                this.a = v1;
                DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration0 = this.b;
                if(v1 == 0 && v > 0) {
                    dynamicReceiveContentConfiguration0.getReceiveContentNode().getReceiveContentListener().onDragExit();
                }
                ReceiveContentListener receiveContentListener0 = DynamicReceiveContentConfiguration.access$getParentReceiveContentListener(dynamicReceiveContentConfiguration0);
                if(receiveContentListener0 != null) {
                    receiveContentListener0.onDragExit();
                }
            }

            @Override  // androidx.compose.foundation.content.ReceiveContentListener
            public void onDragStart() {
                this.a = 0;
                this.b.getReceiveContentNode().getReceiveContentListener().onDragStart();
            }

            @Override  // androidx.compose.foundation.content.ReceiveContentListener
            @Nullable
            public TransferableContent onReceive(@NotNull TransferableContent transferableContent0) {
                DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration0 = this.b;
                TransferableContent transferableContent1 = dynamicReceiveContentConfiguration0.getReceiveContentNode().getReceiveContentListener().onReceive(transferableContent0);
                if(transferableContent1 == null) {
                    return null;
                }
                ReceiveContentListener receiveContentListener0 = DynamicReceiveContentConfiguration.access$getParentReceiveContentListener(dynamicReceiveContentConfiguration0);
                return receiveContentListener0 == null ? transferableContent1 : receiveContentListener0.onReceive(transferableContent1);
            }
        };
    }

    public static final ReceiveContentListener access$getParentReceiveContentListener(DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration0) {
        ReceiveContentConfiguration receiveContentConfiguration0 = ReceiveContentConfigurationKt.getReceiveContentConfiguration(dynamicReceiveContentConfiguration0.a);
        return receiveContentConfiguration0 == null ? null : receiveContentConfiguration0.getReceiveContentListener();
    }

    @Override  // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    @NotNull
    public ReceiveContentListener getReceiveContentListener() {
        return this.b;
    }

    @NotNull
    public final ReceiveContentNode getReceiveContentNode() {
        return this.a;
    }
}

