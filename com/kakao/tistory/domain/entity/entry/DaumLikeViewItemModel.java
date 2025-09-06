package com.kakao.tistory.domain.entity.entry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel;", "", "()V", "DaumLikeCategoryTitle", "PairChild", "SelectNothingItem", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel$DaumLikeCategoryTitle;", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel$PairChild;", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel$SelectNothingItem;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class DaumLikeViewItemModel {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel$DaumLikeCategoryTitle;", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel;", "categoryItem", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeCategoryItem;", "(Lcom/kakao/tistory/domain/entity/entry/DaumLikeCategoryItem;)V", "getCategoryItem", "()Lcom/kakao/tistory/domain/entity/entry/DaumLikeCategoryItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class DaumLikeCategoryTitle extends DaumLikeViewItemModel {
        @NotNull
        private final DaumLikeCategoryItem categoryItem;

        public DaumLikeCategoryTitle(@NotNull DaumLikeCategoryItem daumLikeCategoryItem0) {
            Intrinsics.checkNotNullParameter(daumLikeCategoryItem0, "categoryItem");
            super(null);
            this.categoryItem = daumLikeCategoryItem0;
        }

        @NotNull
        public final DaumLikeCategoryItem component1() {
            return this.categoryItem;
        }

        @NotNull
        public final DaumLikeCategoryTitle copy(@NotNull DaumLikeCategoryItem daumLikeCategoryItem0) {
            Intrinsics.checkNotNullParameter(daumLikeCategoryItem0, "categoryItem");
            return new DaumLikeCategoryTitle(daumLikeCategoryItem0);
        }

        public static DaumLikeCategoryTitle copy$default(DaumLikeCategoryTitle daumLikeViewItemModel$DaumLikeCategoryTitle0, DaumLikeCategoryItem daumLikeCategoryItem0, int v, Object object0) {
            if((v & 1) != 0) {
                daumLikeCategoryItem0 = daumLikeViewItemModel$DaumLikeCategoryTitle0.categoryItem;
            }
            return daumLikeViewItemModel$DaumLikeCategoryTitle0.copy(daumLikeCategoryItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof DaumLikeCategoryTitle ? Intrinsics.areEqual(this.categoryItem, ((DaumLikeCategoryTitle)object0).categoryItem) : false;
        }

        @NotNull
        public final DaumLikeCategoryItem getCategoryItem() {
            return this.categoryItem;
        }

        @Override
        public int hashCode() {
            return this.categoryItem.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "DaumLikeCategoryTitle(categoryItem=" + this.categoryItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u001F\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel$PairChild;", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel;", "daumLikeItemLeft", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;", "daumLikeItemRight", "(Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;)V", "getDaumLikeItemLeft", "()Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;", "getDaumLikeItemRight", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class PairChild extends DaumLikeViewItemModel {
        @NotNull
        private final DaumLikeItem daumLikeItemLeft;
        @Nullable
        private final DaumLikeItem daumLikeItemRight;

        public PairChild(@NotNull DaumLikeItem daumLikeItem0, @Nullable DaumLikeItem daumLikeItem1) {
            Intrinsics.checkNotNullParameter(daumLikeItem0, "daumLikeItemLeft");
            super(null);
            this.daumLikeItemLeft = daumLikeItem0;
            this.daumLikeItemRight = daumLikeItem1;
        }

        @NotNull
        public final DaumLikeItem component1() {
            return this.daumLikeItemLeft;
        }

        @Nullable
        public final DaumLikeItem component2() {
            return this.daumLikeItemRight;
        }

        @NotNull
        public final PairChild copy(@NotNull DaumLikeItem daumLikeItem0, @Nullable DaumLikeItem daumLikeItem1) {
            Intrinsics.checkNotNullParameter(daumLikeItem0, "daumLikeItemLeft");
            return new PairChild(daumLikeItem0, daumLikeItem1);
        }

        public static PairChild copy$default(PairChild daumLikeViewItemModel$PairChild0, DaumLikeItem daumLikeItem0, DaumLikeItem daumLikeItem1, int v, Object object0) {
            if((v & 1) != 0) {
                daumLikeItem0 = daumLikeViewItemModel$PairChild0.daumLikeItemLeft;
            }
            if((v & 2) != 0) {
                daumLikeItem1 = daumLikeViewItemModel$PairChild0.daumLikeItemRight;
            }
            return daumLikeViewItemModel$PairChild0.copy(daumLikeItem0, daumLikeItem1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof PairChild)) {
                return false;
            }
            return Intrinsics.areEqual(this.daumLikeItemLeft, ((PairChild)object0).daumLikeItemLeft) ? Intrinsics.areEqual(this.daumLikeItemRight, ((PairChild)object0).daumLikeItemRight) : false;
        }

        @NotNull
        public final DaumLikeItem getDaumLikeItemLeft() {
            return this.daumLikeItemLeft;
        }

        @Nullable
        public final DaumLikeItem getDaumLikeItemRight() {
            return this.daumLikeItemRight;
        }

        @Override
        public int hashCode() {
            int v = this.daumLikeItemLeft.hashCode();
            return this.daumLikeItemRight == null ? v * 0x1F : v * 0x1F + this.daumLikeItemRight.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "PairChild(daumLikeItemLeft=" + this.daumLikeItemLeft + ", daumLikeItemRight=" + this.daumLikeItemRight + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel$SelectNothingItem;", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeViewItemModel;", "()V", "id", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SelectNothingItem extends DaumLikeViewItemModel {
        @NotNull
        public static final SelectNothingItem INSTANCE = null;
        public static final int id = -3;

        static {
            SelectNothingItem.INSTANCE = new SelectNothingItem();
        }

        private SelectNothingItem() {
            super(null);
        }
    }

    private DaumLikeViewItemModel() {
    }

    public DaumLikeViewItemModel(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

