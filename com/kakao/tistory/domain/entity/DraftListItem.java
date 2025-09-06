package com.kakao.tistory.domain.entity;

import com.kakao.tistory.domain.entity.entry.DraftItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/tistory/domain/entity/DraftListItem;", "", "()V", "Draft", "Empty", "Lcom/kakao/tistory/domain/entity/DraftListItem$Draft;", "Lcom/kakao/tistory/domain/entity/DraftListItem$Empty;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class DraftListItem {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/entity/DraftListItem$Draft;", "Lcom/kakao/tistory/domain/entity/DraftListItem;", "draftItem", "Lcom/kakao/tistory/domain/entity/entry/DraftItem;", "(Lcom/kakao/tistory/domain/entity/entry/DraftItem;)V", "getDraftItem", "()Lcom/kakao/tistory/domain/entity/entry/DraftItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Draft extends DraftListItem {
        @NotNull
        private final DraftItem draftItem;

        public Draft(@NotNull DraftItem draftItem0) {
            Intrinsics.checkNotNullParameter(draftItem0, "draftItem");
            super(null);
            this.draftItem = draftItem0;
        }

        @NotNull
        public final DraftItem component1() {
            return this.draftItem;
        }

        @NotNull
        public final Draft copy(@NotNull DraftItem draftItem0) {
            Intrinsics.checkNotNullParameter(draftItem0, "draftItem");
            return new Draft(draftItem0);
        }

        public static Draft copy$default(Draft draftListItem$Draft0, DraftItem draftItem0, int v, Object object0) {
            if((v & 1) != 0) {
                draftItem0 = draftListItem$Draft0.draftItem;
            }
            return draftListItem$Draft0.copy(draftItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Draft ? Intrinsics.areEqual(this.draftItem, ((Draft)object0).draftItem) : false;
        }

        @NotNull
        public final DraftItem getDraftItem() {
            return this.draftItem;
        }

        @Override
        public int hashCode() {
            return this.draftItem.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Draft(draftItem=" + this.draftItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/tistory/domain/entity/DraftListItem$Empty;", "Lcom/kakao/tistory/domain/entity/DraftListItem;", "()V", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Empty extends DraftListItem {
        @NotNull
        public static final Empty INSTANCE;

        static {
            Empty.INSTANCE = new Empty();
        }

        private Empty() {
            super(null);
        }
    }

    private DraftListItem() {
    }

    public DraftListItem(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

