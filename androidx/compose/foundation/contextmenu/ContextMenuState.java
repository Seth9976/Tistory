package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000E\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FR+\u0010\u0016\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00028F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState;", "", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "initialStatus", "<init>", "(Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getStatus", "()Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "setStatus", "status", "Status", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContextMenuState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,77:1\n81#2:78\n107#2,2:79\n*S KotlinDebug\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState\n*L\n34#1:78\n34#1:79,2\n*E\n"})
public final class ContextMenuState {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "", "Closed", "Open", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Closed;", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class Status {
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Closed;", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "", "toString", "()Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Closed extends Status {
            public static final int $stable;
            @NotNull
            public static final Closed INSTANCE;

            static {
                Closed.INSTANCE = new Closed(null);  // 初始化器: Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
            }

            @Override
            @NotNull
            public String toString() {
                return "Closed";
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000F\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open;", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "Landroidx/compose/ui/geometry/Offset;", "offset", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getOffset-F1C5BW0", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nContextMenuState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
        public static final class Open extends Status {
            public static final int $stable;
            public final long a;

            public Open(long v, DefaultConstructorMarker defaultConstructorMarker0) {
                super(null);
                this.a = v;
                if(!OffsetKt.isSpecified-k-4lQ0M(v)) {
                    throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
                }
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(object0 == this) {
                    return true;
                }
                return object0 instanceof Open ? Offset.equals-impl0(this.a, ((Open)object0).a) : false;
            }

            public final long getOffset-F1C5BW0() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return Offset.hashCode-impl(this.a);
            }

            @Override
            @NotNull
            public String toString() {
                return "Open(offset=" + Offset.toString-impl(this.a) + ')';
            }
        }

        public static final int $stable;

        public Status(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    public final MutableState a;

    public ContextMenuState() {
        this(null, 1, null);
    }

    public ContextMenuState(@NotNull Status contextMenuState$Status0) {
        this.a = SnapshotStateKt.mutableStateOf$default(contextMenuState$Status0, null, 2, null);
    }

    public ContextMenuState(Status contextMenuState$Status0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            contextMenuState$Status0 = Closed.INSTANCE;
        }
        this(contextMenuState$Status0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof ContextMenuState ? Intrinsics.areEqual(((ContextMenuState)object0).getStatus(), this.getStatus()) : false;
    }

    @NotNull
    public final Status getStatus() {
        return (Status)this.a.getValue();
    }

    @Override
    public int hashCode() {
        return this.getStatus().hashCode();
    }

    public final void setStatus(@NotNull Status contextMenuState$Status0) {
        this.a.setValue(contextMenuState$Status0);
    }

    @Override
    @NotNull
    public String toString() {
        return "ContextMenuState(status=" + this.getStatus() + ')';
    }
}

