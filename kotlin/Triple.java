package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001F\u0012\u0006\u0010\u0006\u001A\u00028\u0000\u0012\u0006\u0010\u0007\u001A\u00028\u0001\u0012\u0006\u0010\b\u001A\u00028\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000FJ\u0010\u0010\u0011\u001A\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000FJ@\u0010\u0012\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00028\u00002\b\b\u0002\u0010\u0007\u001A\u00028\u00012\b\b\u0002\u0010\b\u001A\u00028\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0006\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u000FR\u0017\u0010\u0007\u001A\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u001D\u001A\u0004\b \u0010\u000FR\u0017\u0010\b\u001A\u00028\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001D\u001A\u0004\b\"\u0010\u000F¨\u0006#"}, d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Object;", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getFirst", "b", "getSecond", "c", "getThird", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Triple implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public Triple(Object object0, Object object1, Object object2) {
        this.a = object0;
        this.b = object1;
        this.c = object2;
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

    @NotNull
    public final Triple copy(Object object0, Object object1, Object object2) {
        return new Triple(object0, object1, object2);
    }

    public static Triple copy$default(Triple triple0, Object object0, Object object1, Object object2, int v, Object object3) {
        if((v & 1) != 0) {
            object0 = triple0.a;
        }
        if((v & 2) != 0) {
            object1 = triple0.b;
        }
        if((v & 4) != 0) {
            object2 = triple0.c;
        }
        return triple0.copy(object0, object1, object2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Triple)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((Triple)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((Triple)object0).b) ? Intrinsics.areEqual(this.c, ((Triple)object0).c) : false;
    }

    public final Object getFirst() {
        return this.a;
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
        Object object0 = this.c;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ')';
    }
}

