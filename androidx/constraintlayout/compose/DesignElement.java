package androidx.constraintlayout.compose;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u001C\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ:\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\n\"\u0004\b\u001B\u0010\u001CR\"\u0010\u0004\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u0019\u001A\u0004\b\u001E\u0010\n\"\u0004\b\u001F\u0010\u001CR.\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\r\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/constraintlayout/compose/DesignElement;", "", "", "id", "type", "Ljava/util/HashMap;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/HashMap;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Landroidx/constraintlayout/compose/DesignElement;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "b", "getType", "setType", "c", "Ljava/util/HashMap;", "getParams", "setParams", "(Ljava/util/HashMap;)V", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DesignElement {
    public String a;
    public String b;
    public HashMap c;

    public DesignElement(@NotNull String s, @NotNull String s1, @NotNull HashMap hashMap0) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(s1, "type");
        Intrinsics.checkNotNullParameter(hashMap0, "params");
        super();
        this.a = s;
        this.b = s1;
        this.c = hashMap0;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final HashMap component3() {
        return this.c;
    }

    @NotNull
    public final DesignElement copy(@NotNull String s, @NotNull String s1, @NotNull HashMap hashMap0) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(s1, "type");
        Intrinsics.checkNotNullParameter(hashMap0, "params");
        return new DesignElement(s, s1, hashMap0);
    }

    public static DesignElement copy$default(DesignElement designElement0, String s, String s1, HashMap hashMap0, int v, Object object0) {
        if((v & 1) != 0) {
            s = designElement0.a;
        }
        if((v & 2) != 0) {
            s1 = designElement0.b;
        }
        if((v & 4) != 0) {
            hashMap0 = designElement0.c;
        }
        return designElement0.copy(s, s1, hashMap0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DesignElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((DesignElement)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((DesignElement)object0).b) ? Intrinsics.areEqual(this.c, ((DesignElement)object0).c) : false;
    }

    @NotNull
    public final String getId() {
        return this.a;
    }

    @NotNull
    public final HashMap getParams() {
        return this.c;
    }

    @NotNull
    public final String getType() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + q.c(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    public final void setId(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.a = s;
    }

    public final void setParams(@NotNull HashMap hashMap0) {
        Intrinsics.checkNotNullParameter(hashMap0, "<set-?>");
        this.c = hashMap0;
    }

    public final void setType(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.b = s;
    }

    @Override
    @NotNull
    public String toString() {
        return "DesignElement(id=" + this.a + ", type=" + this.b + ", params=" + this.c + ')';
    }
}

