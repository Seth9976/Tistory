package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntSize;
import com.kakao.tistory.presentation.screen.blog.common.contract.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0001\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0016\u0010\u0012\u001A\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000FJG\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0001HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001A\u0010\fJ\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\fR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001A\u0004\b#\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u000FR\u001D\u0010\u0007\u001A\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u0011R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b*\u0010%\u001A\u0004\b+\u0010\u000F\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006,"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/ui/GridItemInfo;", "", "", "index", "lane", "key", "Landroidx/compose/ui/unit/IntSize;", "size", "contentType", "<init>", "(IILjava/lang/Object;JLjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/Object;", "component4-YbymL2g", "()J", "component4", "component5", "copy-TdoYBX4", "(IILjava/lang/Object;JLjava/lang/Object;)Lcom/kakao/tistory/presentation/screen/home/ui/GridItemInfo;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIndex", "b", "getLane", "c", "Ljava/lang/Object;", "getKey", "d", "J", "getSize-YbymL2g", "e", "getContentType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GridItemInfo {
    public static final int $stable;
    public final int a;
    public final int b;
    public final Object c;
    public final long d;
    public final Object e;

    public GridItemInfo(int v, int v1, Object object0, long v2, Object object1, DefaultConstructorMarker defaultConstructorMarker0) {
        Intrinsics.checkNotNullParameter(object0, "key");
        super();
        this.a = v;
        this.b = v1;
        this.c = object0;
        this.d = v2;
        this.e = object1;
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    @NotNull
    public final Object component3() {
        return this.c;
    }

    public final long component4-YbymL2g() {
        return this.d;
    }

    @Nullable
    public final Object component5() {
        return this.e;
    }

    @NotNull
    public final GridItemInfo copy-TdoYBX4(int v, int v1, @NotNull Object object0, long v2, @Nullable Object object1) {
        Intrinsics.checkNotNullParameter(object0, "key");
        return new GridItemInfo(v, v1, object0, v2, object1, null);
    }

    public static GridItemInfo copy-TdoYBX4$default(GridItemInfo gridItemInfo0, int v, int v1, Object object0, long v2, Object object1, int v3, Object object2) {
        if((v3 & 1) != 0) {
            v = gridItemInfo0.a;
        }
        if((v3 & 2) != 0) {
            v1 = gridItemInfo0.b;
        }
        if((v3 & 4) != 0) {
            object0 = gridItemInfo0.c;
        }
        if((v3 & 8) != 0) {
            v2 = gridItemInfo0.d;
        }
        if((v3 & 16) != 0) {
            object1 = gridItemInfo0.e;
        }
        return gridItemInfo0.copy-TdoYBX4(v, v1, object0, v2, object1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GridItemInfo)) {
            return false;
        }
        if(this.a != ((GridItemInfo)object0).a) {
            return false;
        }
        if(this.b != ((GridItemInfo)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((GridItemInfo)object0).c)) {
            return false;
        }
        return IntSize.equals-impl0(this.d, ((GridItemInfo)object0).d) ? Intrinsics.areEqual(this.e, ((GridItemInfo)object0).e) : false;
    }

    @Nullable
    public final Object getContentType() {
        return this.e;
    }

    public final int getIndex() {
        return this.a;
    }

    @NotNull
    public final Object getKey() {
        return this.c;
    }

    public final int getLane() {
        return this.b;
    }

    public final long getSize-YbymL2g() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = a.a(this.b, this.a * 0x1F, 0x1F);
        int v1 = this.c.hashCode();
        int v2 = IntSize.hashCode-impl(this.d);
        return this.e == null ? (v2 + (v1 + v) * 0x1F) * 0x1F : (v2 + (v1 + v) * 0x1F) * 0x1F + this.e.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = q.u("GridItemInfo(index=", this.a, ", lane=", this.b, ", key=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", size=");
        stringBuilder0.append(IntSize.toString-impl(this.d));
        stringBuilder0.append(", contentType=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

