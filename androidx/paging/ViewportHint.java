package androidx.paging;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u001B\u001CJ\u001A\u0010\u0004\u001A\u00020\u00032\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\rR\u0017\u0010\u0014\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000F\u001A\u0004\b\u0013\u0010\rR\u0017\u0010\u0017\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000F\u001A\u0004\b\u0016\u0010\rR\u0017\u0010\u001A\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000F\u001A\u0004\b\u0019\u0010\r\u0082\u0001\u0002\u001D\u001E¨\u0006\u001F"}, d2 = {"Landroidx/paging/ViewportHint;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/paging/LoadType;", "loadType", "", "presentedItemsBeyondAnchor$paging_common_release", "(Landroidx/paging/LoadType;)I", "presentedItemsBeyondAnchor", "hashCode", "()I", "a", "I", "getPresentedItemsBefore", "presentedItemsBefore", "b", "getPresentedItemsAfter", "presentedItemsAfter", "c", "getOriginalPageOffsetFirst", "originalPageOffsetFirst", "d", "getOriginalPageOffsetLast", "originalPageOffsetLast", "Access", "Initial", "Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint$Initial;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class ViewportHint {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u000E\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001A\u0004\b\u0019\u0010\u0011¨\u0006\u001A"}, d2 = {"Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint;", "", "pageOffset", "indexInPage", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIIIII)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "I", "getPageOffset", "f", "getIndexInPage", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Access extends ViewportHint {
        public final int e;
        public final int f;

        public Access(int v, int v1, int v2, int v3, int v4, int v5) {
            super(v2, v3, v4, v5, null);
            this.e = v;
            this.f = v1;
        }

        @Override  // androidx.paging.ViewportHint
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Access ? this.e == ((Access)object0).e && this.f == ((Access)object0).f && this.getPresentedItemsBefore() == ((Access)object0).getPresentedItemsBefore() && this.getPresentedItemsAfter() == ((Access)object0).getPresentedItemsAfter() && this.getOriginalPageOffsetFirst() == ((Access)object0).getOriginalPageOffsetFirst() && this.getOriginalPageOffsetLast() == ((Access)object0).getOriginalPageOffsetLast() : false;
        }

        public final int getIndexInPage() {
            return this.f;
        }

        public final int getPageOffset() {
            return this.e;
        }

        @Override  // androidx.paging.ViewportHint
        public int hashCode() {
            return this.f + (this.e + super.hashCode());
        }

        @Override
        @NotNull
        public String toString() {
            return k.trimMargin$default(("ViewportHint.Access(\n            |    pageOffset=" + this.e + ",\n            |    indexInPage=" + this.f + ",\n            |    presentedItemsBefore=" + this.getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + this.getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + this.getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + this.getOriginalPageOffsetLast() + ",\n            |)"), null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001A\u00020\tH\u0016¨\u0006\n"}, d2 = {"Landroidx/paging/ViewportHint$Initial;", "Landroidx/paging/ViewportHint;", "presentedItemsBefore", "", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "(IIII)V", "toString", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Initial extends ViewportHint {
        public Initial(int v, int v1, int v2, int v3) {
            super(v, v1, v2, v3, null);
        }

        @Override
        @NotNull
        public String toString() {
            return k.trimMargin$default(("ViewportHint.Initial(\n            |    presentedItemsBefore=" + this.getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + this.getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + this.getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + this.getOriginalPageOffsetLast() + ",\n            |)"), null, 1, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LoadType.values().length];
            try {
                arr_v[LoadType.REFRESH.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.PREPEND.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.APPEND.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ViewportHint(int v, int v1, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ViewportHint ? this.a == ((ViewportHint)object0).a && this.b == ((ViewportHint)object0).b && this.c == ((ViewportHint)object0).c && this.d == ((ViewportHint)object0).d : false;
    }

    public final int getOriginalPageOffsetFirst() {
        return this.c;
    }

    public final int getOriginalPageOffsetLast() {
        return this.d;
    }

    public final int getPresentedItemsAfter() {
        return this.b;
    }

    public final int getPresentedItemsBefore() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.d + (this.c + (this.b + this.a));
    }

    public final int presentedItemsBeyondAnchor$paging_common_release(@NotNull LoadType loadType0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        switch(WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()]) {
            case 1: {
                throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
            }
            case 2: {
                return this.a;
            }
            case 3: {
                return this.b;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

