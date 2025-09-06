package com.kakao.tistory.data.repository;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u00012\u00020\u0005B\'\u0012\u0006\u0010\u0006\u001A\u00028\u0000\u0012\u0006\u0010\u0007\u001A\u00028\u0001\u0012\u0006\u0010\b\u001A\u00028\u0002\u0012\u0006\u0010\t\u001A\u00028\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001A\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001A\u00028\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010JP\u0010\u0014\u001A\u001A\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0006\u001A\u00028\u00002\b\b\u0002\u0010\u0007\u001A\u00028\u00012\b\b\u0002\u0010\b\u001A\u00028\u00022\b\b\u0002\u0010\t\u001A\u00028\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0006\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u0010R\u0017\u0010\u0007\u001A\u00028\u00018\u0006¢\u0006\f\n\u0004\b!\u0010\u001F\u001A\u0004\b\"\u0010\u0010R\u0017\u0010\b\u001A\u00028\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001F\u001A\u0004\b$\u0010\u0010R\u0017\u0010\t\u001A\u00028\u00038\u0006¢\u0006\f\n\u0004\b%\u0010\u001F\u001A\u0004\b&\u0010\u0010¨\u0006\'"}, d2 = {"Lcom/kakao/tistory/data/repository/Four;", "A", "B", "C", "D", "Ljava/io/Serializable;", "first", "second", "third", "fourth", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/kakao/tistory/data/repository/Four;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getFirst", "b", "getSecond", "c", "getThird", "d", "getFourth", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Four implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public Four(Object object0, Object object1, Object object2, Object object3) {
        this.a = object0;
        this.b = object1;
        this.c = object2;
        this.d = object3;
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

    @NotNull
    public final Four copy(Object object0, Object object1, Object object2, Object object3) {
        return new Four(object0, object1, object2, object3);
    }

    public static Four copy$default(Four four0, Object object0, Object object1, Object object2, Object object3, int v, Object object4) {
        if((v & 1) != 0) {
            object0 = four0.a;
        }
        if((v & 2) != 0) {
            object1 = four0.b;
        }
        if((v & 4) != 0) {
            object2 = four0.c;
        }
        if((v & 8) != 0) {
            object3 = four0.d;
        }
        return four0.copy(object0, object1, object2, object3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Four)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((Four)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((Four)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((Four)object0).c) ? Intrinsics.areEqual(this.d, ((Four)object0).d) : false;
    }

    public final Object getFirst() {
        return this.a;
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
        Object object0 = this.d;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "(" + this.a + ", second=" + this.b + ", third=" + this.c + ", fourth=" + this.d + ")";
    }
}

