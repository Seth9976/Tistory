package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0080\b\u0018\u0000 *2\u00020\u0001:\u0001*B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0016\u0010\u000F\u001A\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJ;\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001D\u001A\u00020\u00022\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\fR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0011R\u0017\u0010\b\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001A\u0004\b)\u0010\f\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "", "", "visible", "Landroidx/compose/ui/geometry/Offset;", "position", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "handlesCrossed", "<init>", "(ZJLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Z", "component2-F1C5BW0", "()J", "component2", "component3", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "component4", "copy-ubNVwUQ", "(ZJLandroidx/compose/ui/text/style/ResolvedTextDirection;Z)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getVisible", "b", "J", "getPosition-F1C5BW0", "c", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getDirection", "d", "getHandlesCrossed", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldHandleState {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState$Companion;", "", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "Hidden", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "getHidden", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TextFieldHandleState getHidden() {
            return TextFieldHandleState.e;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final boolean a;
    public final long b;
    public final ResolvedTextDirection c;
    public final boolean d;
    public static final TextFieldHandleState e;

    static {
        TextFieldHandleState.Companion = new Companion(null);
        TextFieldHandleState.e = new TextFieldHandleState(false, 0x7FC000007FC00000L, ResolvedTextDirection.Ltr, false, null);
    }

    public TextFieldHandleState(boolean z, long v, ResolvedTextDirection resolvedTextDirection0, boolean z1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = z;
        this.b = v;
        this.c = resolvedTextDirection0;
        this.d = z1;
    }

    public final boolean component1() {
        return this.a;
    }

    public final long component2-F1C5BW0() {
        return this.b;
    }

    @NotNull
    public final ResolvedTextDirection component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    @NotNull
    public final TextFieldHandleState copy-ubNVwUQ(boolean z, long v, @NotNull ResolvedTextDirection resolvedTextDirection0, boolean z1) {
        return new TextFieldHandleState(z, v, resolvedTextDirection0, z1, null);
    }

    public static TextFieldHandleState copy-ubNVwUQ$default(TextFieldHandleState textFieldHandleState0, boolean z, long v, ResolvedTextDirection resolvedTextDirection0, boolean z1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            z = textFieldHandleState0.a;
        }
        if((v1 & 2) != 0) {
            v = textFieldHandleState0.b;
        }
        if((v1 & 4) != 0) {
            resolvedTextDirection0 = textFieldHandleState0.c;
        }
        if((v1 & 8) != 0) {
            z1 = textFieldHandleState0.d;
        }
        return textFieldHandleState0.copy-ubNVwUQ(z, v, resolvedTextDirection0, z1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextFieldHandleState)) {
            return false;
        }
        if(this.a != ((TextFieldHandleState)object0).a) {
            return false;
        }
        if(!Offset.equals-impl0(this.b, ((TextFieldHandleState)object0).b)) {
            return false;
        }
        return this.c == ((TextFieldHandleState)object0).c ? this.d == ((TextFieldHandleState)object0).d : false;
    }

    @NotNull
    public final ResolvedTextDirection getDirection() {
        return this.c;
    }

    public final boolean getHandlesCrossed() {
        return this.d;
    }

    public final long getPosition-F1C5BW0() {
        return this.b;
    }

    public final boolean getVisible() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() + (Offset.hashCode-impl(this.b) + Boolean.hashCode(this.a) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TextFieldHandleState(visible=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", position=");
        stringBuilder0.append(Offset.toString-impl(this.b));
        stringBuilder0.append(", direction=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", handlesCrossed=");
        return a.p(stringBuilder0, this.d, ')');
    }
}

