package com.kakao.tistory.data.repository;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u0001*\u0006\b\u0004\u0010\u0005 \u00012\u00020\u0006B/\u0012\u0006\u0010\u0007\u001A\u00028\u0000\u0012\u0006\u0010\b\u001A\u00028\u0001\u0012\u0006\u0010\t\u001A\u00028\u0002\u0012\u0006\u0010\n\u001A\u00028\u0003\u0012\u0006\u0010\u000B\u001A\u00028\u0004\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00028\u0000H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00028\u0001H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00028\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001A\u00028\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001A\u00028\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0012J`\u0010\u0017\u001A \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00002\b\b\u0002\u0010\u0007\u001A\u00028\u00002\b\b\u0002\u0010\b\u001A\u00028\u00012\b\b\u0002\u0010\t\u001A\u00028\u00022\b\b\u0002\u0010\n\u001A\u00028\u00032\b\b\u0002\u0010\u000B\u001A\u00028\u0004H\u00C6\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0019H\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001F\u001A\u00020\u001E2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CH\u00D6\u0003\u00A2\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0007\u001A\u00028\u00008\u0006\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u0012R\u0017\u0010\b\u001A\u00028\u00018\u0006\u00A2\u0006\f\n\u0004\b$\u0010\"\u001A\u0004\b%\u0010\u0012R\u0017\u0010\t\u001A\u00028\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010\"\u001A\u0004\b\'\u0010\u0012R\u0017\u0010\n\u001A\u00028\u00038\u0006\u00A2\u0006\f\n\u0004\b(\u0010\"\u001A\u0004\b)\u0010\u0012R\u0017\u0010\u000B\u001A\u00028\u00048\u0006\u00A2\u0006\f\n\u0004\b*\u0010\"\u001A\u0004\b+\u0010\u0012\u00A8\u0006,"}, d2 = {"Lcom/kakao/tistory/data/repository/Five;", "A", "B", "C", "D", "E", "Ljava/io/Serializable;", "first", "second", "third", "fourth", "five", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/kakao/tistory/data/repository/Five;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getFirst", "b", "getSecond", "c", "getThird", "d", "getFourth", "e", "getFive", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Five implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public Five(Object object0, Object object1, Object object2, Object object3, Object object4) {
        this.a = object0;
        this.b = object1;
        this.c = object2;
        this.d = object3;
        this.e = object4;
    }

    public final Object component1() {
        return this.a;
    }

    public final Object component2() {
        return this.b;
    }

    public final Object component3() {
        return this.c;
    }

    public final Object component4() {
        return this.d;
    }

    public final Object component5() {
        return this.e;
    }

    @NotNull
    public final Five copy(Object object0, Object object1, Object object2, Object object3, Object object4) {
        return new Five(object0, object1, object2, object3, object4);
    }

    public static Five copy$default(Five five0, Object object0, Object object1, Object object2, Object object3, Object object4, int v, Object object5) {
        if((v & 1) != 0) {
            object0 = five0.a;
        }
        if((v & 2) != 0) {
            object1 = five0.b;
        }
        if((v & 4) != 0) {
            object2 = five0.c;
        }
        if((v & 8) != 0) {
            object3 = five0.d;
        }
        if((v & 16) != 0) {
            object4 = five0.e;
        }
        return five0.copy(object0, object1, object2, object3, object4);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Five)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((Five)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((Five)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((Five)object0).c)) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((Five)object0).d) ? Intrinsics.areEqual(this.e, ((Five)object0).e) : false;
    }

    public final Object getFirst() {
        return this.a;
    }

    public final Object getFive() {
        return this.e;
    }

    public final Object getFourth() {
        return this.d;
    }

    public final Object getSecond() {
        return this.b;
    }

    public final Object getThird() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        Object object0 = this.e;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "(" + this.a + ", second=" + this.b + ", third=" + this.c + ", fourth=" + this.d + ", five=" + this.e + ")";
    }
}

