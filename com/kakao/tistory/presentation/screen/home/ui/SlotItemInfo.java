package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.screen.blog.common.contract.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0019\u001A\u0004\b\u001C\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u0019\u001A\u0004\b\u001E\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u0019\u001A\u0004\b \u0010\n¨\u0006!"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/ui/SlotItemInfo;", "", "", "slotListIndex", "lane", "height", "bottomPadding", "<init>", "(IIII)V", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/kakao/tistory/presentation/screen/home/ui/SlotItemInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getSlotListIndex", "b", "getLane", "c", "getHeight", "d", "getBottomPadding", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SlotItemInfo {
    public static final int $stable;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public SlotItemInfo(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public SlotItemInfo(int v, int v1, int v2, int v3, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v4 & 8) != 0) {
            v3 = 0;
        }
        this(v, v1, v2, v3);
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    @NotNull
    public final SlotItemInfo copy(int v, int v1, int v2, int v3) {
        return new SlotItemInfo(v, v1, v2, v3);
    }

    public static SlotItemInfo copy$default(SlotItemInfo slotItemInfo0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = slotItemInfo0.a;
        }
        if((v4 & 2) != 0) {
            v1 = slotItemInfo0.b;
        }
        if((v4 & 4) != 0) {
            v2 = slotItemInfo0.c;
        }
        if((v4 & 8) != 0) {
            v3 = slotItemInfo0.d;
        }
        return slotItemInfo0.copy(v, v1, v2, v3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SlotItemInfo)) {
            return false;
        }
        if(this.a != ((SlotItemInfo)object0).a) {
            return false;
        }
        if(this.b != ((SlotItemInfo)object0).b) {
            return false;
        }
        return this.c == ((SlotItemInfo)object0).c ? this.d == ((SlotItemInfo)object0).d : false;
    }

    public final int getBottomPadding() {
        return this.d;
    }

    public final int getHeight() {
        return this.c;
    }

    public final int getLane() {
        return this.b;
    }

    public final int getSlotListIndex() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.d + a.a(this.c, a.a(this.b, this.a * 0x1F, 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = q.u("SlotItemInfo(slotListIndex=", this.a, ", lane=", this.b, ", height=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", bottomPadding=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

