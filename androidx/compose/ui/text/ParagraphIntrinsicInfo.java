package androidx.compose.ui.text;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0080\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001C\u001A\u0004\b\u001F\u0010\f¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "intrinsics", "", "startIndex", "endIndex", "<init>", "(Landroidx/compose/ui/text/ParagraphIntrinsics;II)V", "component1", "()Landroidx/compose/ui/text/ParagraphIntrinsics;", "component2", "()I", "component3", "copy", "(Landroidx/compose/ui/text/ParagraphIntrinsics;II)Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "getIntrinsics", "b", "I", "getStartIndex", "c", "getEndIndex", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ParagraphIntrinsicInfo {
    public static final int $stable = 8;
    public final ParagraphIntrinsics a;
    public final int b;
    public final int c;

    public ParagraphIntrinsicInfo(@NotNull ParagraphIntrinsics paragraphIntrinsics0, int v, int v1) {
        this.a = paragraphIntrinsics0;
        this.b = v;
        this.c = v1;
    }

    @NotNull
    public final ParagraphIntrinsics component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    @NotNull
    public final ParagraphIntrinsicInfo copy(@NotNull ParagraphIntrinsics paragraphIntrinsics0, int v, int v1) {
        return new ParagraphIntrinsicInfo(paragraphIntrinsics0, v, v1);
    }

    public static ParagraphIntrinsicInfo copy$default(ParagraphIntrinsicInfo paragraphIntrinsicInfo0, ParagraphIntrinsics paragraphIntrinsics0, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            paragraphIntrinsics0 = paragraphIntrinsicInfo0.a;
        }
        if((v2 & 2) != 0) {
            v = paragraphIntrinsicInfo0.b;
        }
        if((v2 & 4) != 0) {
            v1 = paragraphIntrinsicInfo0.c;
        }
        return paragraphIntrinsicInfo0.copy(paragraphIntrinsics0, v, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((ParagraphIntrinsicInfo)object0).a)) {
            return false;
        }
        return this.b == ((ParagraphIntrinsicInfo)object0).b ? this.c == ((ParagraphIntrinsicInfo)object0).c : false;
    }

    public final int getEndIndex() {
        return this.c;
    }

    @NotNull
    public final ParagraphIntrinsics getIntrinsics() {
        return this.a;
    }

    public final int getStartIndex() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.c + a.c(this.b, this.a.hashCode() * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", startIndex=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", endIndex=");
        return b.p(stringBuilder0, this.c, ')');
    }
}

