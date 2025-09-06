package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.Arrangement;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001A\u0010\u0007\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000Bj\u0002\b\fj\u0002\b\r¨\u0006\u000E"}, d2 = {"Lcom/google/accompanist/flowlayout/MainAxisAlignment;", "", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "a", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getArrangement$flowlayout_release", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "arrangement", "Center", "Start", "End", "SpaceEvenly", "SpaceBetween", "SpaceAround", "flowlayout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public enum MainAxisAlignment {
    Center(Arrangement.INSTANCE.getCenter()),
    Start(Arrangement.INSTANCE.getTop()),
    End(Arrangement.INSTANCE.getBottom()),
    SpaceEvenly(Arrangement.INSTANCE.getSpaceEvenly()),
    SpaceBetween(Arrangement.INSTANCE.getSpaceBetween()),
    SpaceAround(Arrangement.INSTANCE.getSpaceAround());

    public final Vertical a;

    public MainAxisAlignment(Vertical arrangement$Vertical0) {
        this.a = arrangement$Vertical0;
    }

    @NotNull
    public final Vertical getArrangement$flowlayout_release() {
        return this.a;
    }
}

