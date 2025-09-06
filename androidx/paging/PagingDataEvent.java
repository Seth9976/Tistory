package androidx.paging;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000B\f¨\u0006\r"}, d2 = {"Landroidx/paging/PagingDataEvent;", "", "T", "Append", "DropAppend", "DropPrepend", "Prepend", "Refresh", "Landroidx/paging/PagingDataEvent$Append;", "Landroidx/paging/PagingDataEvent$DropAppend;", "Landroidx/paging/PagingDataEvent$DropPrepend;", "Landroidx/paging/PagingDataEvent$Prepend;", "Landroidx/paging/PagingDataEvent$Refresh;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class PagingDataEvent {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u000E\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B/\b\u0007\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000E\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0011R\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u0017\u0010\b\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u0016\u001A\u0004\b\u001D\u0010\u0011R\u0017\u0010\t\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u0016\u001A\u0004\b\u001F\u0010\u0011¨\u0006 "}, d2 = {"Landroidx/paging/PagingDataEvent$Append;", "", "T", "Landroidx/paging/PagingDataEvent;", "", "startIndex", "", "inserted", "newPlaceholdersAfter", "oldPlaceholdersAfter", "<init>", "(ILjava/util/List;II)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getStartIndex", "b", "Ljava/util/List;", "getInserted", "()Ljava/util/List;", "c", "getNewPlaceholdersAfter", "d", "getOldPlaceholdersAfter", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Append extends PagingDataEvent {
        public final int a;
        public final List b;
        public final int c;
        public final int d;

        @RestrictTo({Scope.LIBRARY_GROUP})
        public Append(int v, @NotNull List list0, int v1, int v2) {
            Intrinsics.checkNotNullParameter(list0, "inserted");
            super(null);
            this.a = v;
            this.b = list0;
            this.c = v1;
            this.d = v2;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Append && this.a == ((Append)object0).a && Intrinsics.areEqual(this.b, ((Append)object0).b) && this.c == ((Append)object0).c && this.d == ((Append)object0).d;
        }

        @NotNull
        public final List getInserted() {
            return this.b;
        }

        public final int getNewPlaceholdersAfter() {
            return this.c;
        }

        public final int getOldPlaceholdersAfter() {
            return this.d;
        }

        public final int getStartIndex() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.d + (this.c + (this.b.hashCode() + this.a));
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("PagingDataEvent.Append loaded ");
            stringBuilder0.append(this.b.size());
            stringBuilder0.append(" items (\n                    |   startIndex: ");
            stringBuilder0.append(this.a);
            stringBuilder0.append("\n                    |   first item: ");
            stringBuilder0.append(CollectionsKt___CollectionsKt.firstOrNull(this.b));
            stringBuilder0.append("\n                    |   last item: ");
            stringBuilder0.append(CollectionsKt___CollectionsKt.lastOrNull(this.b));
            stringBuilder0.append("\n                    |   newPlaceholdersBefore: ");
            stringBuilder0.append(this.c);
            stringBuilder0.append("\n                    |   oldPlaceholdersBefore: ");
            return k.trimMargin$default(a.c(this.d, "\n                    |)\n                    |", stringBuilder0), null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\f\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B)\b\u0007\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001A\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001A\u0004\b\u001A\u0010\u0010R\u0017\u0010\b\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0015\u001A\u0004\b\u001C\u0010\u0010¨\u0006\u001D"}, d2 = {"Landroidx/paging/PagingDataEvent$DropAppend;", "", "T", "Landroidx/paging/PagingDataEvent;", "", "startIndex", "dropCount", "newPlaceholdersAfter", "oldPlaceholdersAfter", "<init>", "(IIII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getStartIndex", "b", "getDropCount", "c", "getNewPlaceholdersAfter", "d", "getOldPlaceholdersAfter", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DropAppend extends PagingDataEvent {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        @RestrictTo({Scope.LIBRARY_GROUP})
        public DropAppend(int v, int v1, int v2, int v3) {
            super(null);
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof DropAppend && this.a == ((DropAppend)object0).a && this.b == ((DropAppend)object0).b && this.c == ((DropAppend)object0).c && this.d == ((DropAppend)object0).d;
        }

        public final int getDropCount() {
            return this.b;
        }

        public final int getNewPlaceholdersAfter() {
            return this.c;
        }

        public final int getOldPlaceholdersAfter() {
            return this.d;
        }

        public final int getStartIndex() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.d + (this.c + (this.b + this.a));
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("PagingDataEvent.DropAppend dropped ");
            stringBuilder0.append(this.b);
            stringBuilder0.append(" items (\n                    |   startIndex: ");
            r0.a.A(stringBuilder0, this.a, "\n                    |   dropCount: ", this.b, "\n                    |   newPlaceholdersBefore: ");
            stringBuilder0.append(this.c);
            stringBuilder0.append("\n                    |   oldPlaceholdersBefore: ");
            return k.trimMargin$default(a.c(this.d, "\n                    |)\n                    |", stringBuilder0), null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\n\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B!\b\u0007\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u000FR\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001A\u0004\b\u0017\u0010\u000FR\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001A\u0004\b\u0019\u0010\u000F¨\u0006\u001A"}, d2 = {"Landroidx/paging/PagingDataEvent$DropPrepend;", "", "T", "Landroidx/paging/PagingDataEvent;", "", "dropCount", "newPlaceholdersBefore", "oldPlaceholdersBefore", "<init>", "(III)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getDropCount", "b", "getNewPlaceholdersBefore", "c", "getOldPlaceholdersBefore", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DropPrepend extends PagingDataEvent {
        public final int a;
        public final int b;
        public final int c;

        @RestrictTo({Scope.LIBRARY_GROUP})
        public DropPrepend(int v, int v1, int v2) {
            super(null);
            this.a = v;
            this.b = v1;
            this.c = v2;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof DropPrepend && this.a == ((DropPrepend)object0).a && this.b == ((DropPrepend)object0).b && this.c == ((DropPrepend)object0).c;
        }

        public final int getDropCount() {
            return this.a;
        }

        public final int getNewPlaceholdersBefore() {
            return this.b;
        }

        public final int getOldPlaceholdersBefore() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return this.c + (this.b + this.a);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
            r0.a.A(stringBuilder0, this.a, " items (\n                    |   dropCount: ", this.a, "\n                    |   newPlaceholdersBefore: ");
            stringBuilder0.append(this.b);
            stringBuilder0.append("\n                    |   oldPlaceholdersBefore: ");
            return k.trimMargin$default(a.c(this.c, "\n                    |)\n                    |", stringBuilder0), null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\f\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\'\b\u0007\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001D\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u0010R\u0017\u0010\b\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0019\u001A\u0004\b\u001C\u0010\u0010¨\u0006\u001D"}, d2 = {"Landroidx/paging/PagingDataEvent$Prepend;", "", "T", "Landroidx/paging/PagingDataEvent;", "", "inserted", "", "newPlaceholdersBefore", "oldPlaceholdersBefore", "<init>", "(Ljava/util/List;II)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "getInserted", "()Ljava/util/List;", "b", "I", "getNewPlaceholdersBefore", "c", "getOldPlaceholdersBefore", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Prepend extends PagingDataEvent {
        public final List a;
        public final int b;
        public final int c;

        @RestrictTo({Scope.LIBRARY_GROUP})
        public Prepend(@NotNull List list0, int v, int v1) {
            Intrinsics.checkNotNullParameter(list0, "inserted");
            super(null);
            this.a = list0;
            this.b = v;
            this.c = v1;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Prepend && Intrinsics.areEqual(this.a, ((Prepend)object0).a) && this.b == ((Prepend)object0).b && this.c == ((Prepend)object0).c;
        }

        @NotNull
        public final List getInserted() {
            return this.a;
        }

        public final int getNewPlaceholdersBefore() {
            return this.b;
        }

        public final int getOldPlaceholdersBefore() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return this.c + (this.b + this.a.hashCode());
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("PagingDataEvent.Prepend loaded ");
            stringBuilder0.append(this.a.size());
            stringBuilder0.append(" items (\n                    |   first item: ");
            stringBuilder0.append(CollectionsKt___CollectionsKt.firstOrNull(this.a));
            stringBuilder0.append("\n                    |   last item: ");
            stringBuilder0.append(CollectionsKt___CollectionsKt.lastOrNull(this.a));
            stringBuilder0.append("\n                    |   newPlaceholdersBefore: ");
            stringBuilder0.append(this.b);
            stringBuilder0.append("\n                    |   oldPlaceholdersBefore: ");
            return k.trimMargin$default(a.c(this.c, "\n                    |)\n                    |", stringBuilder0), null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B%\b\u0007\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001D\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/paging/PagingDataEvent$Refresh;", "", "T", "Landroidx/paging/PagingDataEvent;", "Landroidx/paging/PlaceholderPaddedList;", "newList", "previousList", "<init>", "(Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedList;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/paging/PlaceholderPaddedList;", "getNewList", "()Landroidx/paging/PlaceholderPaddedList;", "b", "getPreviousList", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Refresh extends PagingDataEvent {
        public final PlaceholderPaddedList a;
        public final PlaceholderPaddedList b;

        @RestrictTo({Scope.LIBRARY_GROUP})
        public Refresh(@NotNull PlaceholderPaddedList placeholderPaddedList0, @NotNull PlaceholderPaddedList placeholderPaddedList1) {
            Intrinsics.checkNotNullParameter(placeholderPaddedList0, "newList");
            Intrinsics.checkNotNullParameter(placeholderPaddedList1, "previousList");
            super(null);
            this.a = placeholderPaddedList0;
            this.b = placeholderPaddedList1;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Refresh && (this.a.getPlaceholdersBefore() == ((Refresh)object0).a.getPlaceholdersBefore() && this.a.getPlaceholdersAfter() == ((Refresh)object0).a.getPlaceholdersAfter() && this.a.getSize() == ((Refresh)object0).a.getSize() && this.a.getDataCount() == ((Refresh)object0).a.getDataCount()) && (this.b.getPlaceholdersBefore() == ((Refresh)object0).b.getPlaceholdersBefore() && this.b.getPlaceholdersAfter() == ((Refresh)object0).b.getPlaceholdersAfter() && this.b.getSize() == ((Refresh)object0).b.getSize() && this.b.getDataCount() == ((Refresh)object0).b.getDataCount());
        }

        @NotNull
        public final PlaceholderPaddedList getNewList() {
            return this.a;
        }

        @NotNull
        public final PlaceholderPaddedList getPreviousList() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return k.trimMargin$default(("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: " + this.a.getPlaceholdersBefore() + "\n                    |       placeholdersAfter: " + this.a.getPlaceholdersAfter() + "\n                    |       size: " + this.a.getSize() + "\n                    |       dataCount: " + this.a.getDataCount() + "\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: " + this.b.getPlaceholdersBefore() + "\n                    |       placeholdersAfter: " + this.b.getPlaceholdersAfter() + "\n                    |       size: " + this.b.getSize() + "\n                    |       dataCount: " + this.b.getDataCount() + "\n                    |   )\n                    |"), null, 1, null);
        }
    }

    public PagingDataEvent(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

