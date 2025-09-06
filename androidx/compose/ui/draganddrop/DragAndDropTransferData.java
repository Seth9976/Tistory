package androidx.compose.ui.draganddrop;

import android.content.ClipData;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "", "Landroid/content/ClipData;", "clipData", "localState", "", "flags", "<init>", "(Landroid/content/ClipData;Ljava/lang/Object;I)V", "a", "Landroid/content/ClipData;", "getClipData", "()Landroid/content/ClipData;", "b", "Ljava/lang/Object;", "getLocalState", "()Ljava/lang/Object;", "c", "I", "getFlags", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DragAndDropTransferData {
    public static final int $stable = 8;
    public final ClipData a;
    public final Object b;
    public final int c;

    public DragAndDropTransferData(@NotNull ClipData clipData0, @Nullable Object object0, int v) {
        this.a = clipData0;
        this.b = object0;
        this.c = v;
    }

    public DragAndDropTransferData(ClipData clipData0, Object object0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            object0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(clipData0, object0, v);
    }

    @NotNull
    public final ClipData getClipData() {
        return this.a;
    }

    public final int getFlags() {
        return this.c;
    }

    @Nullable
    public final Object getLocalState() {
        return this.b;
    }
}

