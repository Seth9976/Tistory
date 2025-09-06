package com.kakao.kemoticon;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\tJ.\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001A\u0004\b\u001A\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0017\u001A\u0004\b\u001C\u0010\t¨\u0006\u001D"}, d2 = {"Lcom/kakao/kemoticon/Emoticon;", "", "", "packId", "id", "src", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/kemoticon/Emoticon;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPackId", "b", "getId", "c", "getSrc", "kemoticon_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Emoticon {
    public final String a;
    public final String b;
    public final String c;

    public Emoticon(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "packId");
        Intrinsics.checkNotNullParameter(s1, "id");
        Intrinsics.checkNotNullParameter(s2, "src");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
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
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final Emoticon copy(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "packId");
        Intrinsics.checkNotNullParameter(s1, "id");
        Intrinsics.checkNotNullParameter(s2, "src");
        return new Emoticon(s, s1, s2);
    }

    public static Emoticon copy$default(Emoticon emoticon0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = emoticon0.a;
        }
        if((v & 2) != 0) {
            s1 = emoticon0.b;
        }
        if((v & 4) != 0) {
            s2 = emoticon0.c;
        }
        return emoticon0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Emoticon)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((Emoticon)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((Emoticon)object0).b) ? Intrinsics.areEqual(this.c, ((Emoticon)object0).c) : false;
    }

    @NotNull
    public final String getId() {
        return this.b;
    }

    @NotNull
    public final String getPackId() {
        return this.a;
    }

    @NotNull
    public final String getSrc() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + q.c(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Emoticon(packId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", id=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", src=");
        return a.o(stringBuilder0, this.c, ")");
    }
}

