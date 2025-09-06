package com.kakao.tistory.domain.entity;

import com.google.gson.annotations.SerializedName;
import com.kakao.tistory.domain.blog.entity.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B-\b\u0004\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u001A\u0010\u0006\u001A\u00020\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u000B\"\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\n\u0082\u0001\t\u0019\u001A\u001B\u001C\u001D\u001E\u001F !¨\u0006\""}, d2 = {"Lcom/kakao/tistory/domain/entity/SortItem;", "", "type", "", "title", "description", "isSelected", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDescription", "()Ljava/lang/String;", "()Z", "setSelected", "(Z)V", "getTitle", "getType", "BlogFollowSortItem", "DeveloperServerSortItem", "ImageSettingSortItem", "LogRefSortItem", "NotificationSortItem", "ProfilePenaltySortItem", "SearchSortItem", "StatisticsMetricSortItem", "StatisticsSortItem", "Lcom/kakao/tistory/domain/entity/SortItem$BlogFollowSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem$DeveloperServerSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem$ImageSettingSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem$LogRefSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem$NotificationSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem$ProfilePenaltySortItem;", "Lcom/kakao/tistory/domain/entity/SortItem$SearchSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem$StatisticsMetricSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem$StatisticsSortItem;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class SortItem {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/entity/SortItem$BlogFollowSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem;", "value", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class BlogFollowSortItem extends SortItem {
        @NotNull
        private final String text;
        @NotNull
        private final String value;

        public BlogFollowSortItem(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "value");
            Intrinsics.checkNotNullParameter(s1, "text");
            super(s, s1, null, false, 12, null);
            this.value = s;
            this.text = s1;
        }

        @NotNull
        public final String component1() {
            return this.value;
        }

        @NotNull
        public final String component2() {
            return this.text;
        }

        @NotNull
        public final BlogFollowSortItem copy(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "value");
            Intrinsics.checkNotNullParameter(s1, "text");
            return new BlogFollowSortItem(s, s1);
        }

        public static BlogFollowSortItem copy$default(BlogFollowSortItem sortItem$BlogFollowSortItem0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = sortItem$BlogFollowSortItem0.value;
            }
            if((v & 2) != 0) {
                s1 = sortItem$BlogFollowSortItem0.text;
            }
            return sortItem$BlogFollowSortItem0.copy(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof BlogFollowSortItem)) {
                return false;
            }
            return Intrinsics.areEqual(this.value, ((BlogFollowSortItem)object0).value) ? Intrinsics.areEqual(this.text, ((BlogFollowSortItem)object0).text) : false;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            return this.text.hashCode() + this.value.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "BlogFollowSortItem(value=" + this.value + ", text=" + this.text + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/entity/SortItem$DeveloperServerSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem;", "value", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class DeveloperServerSortItem extends SortItem {
        @NotNull
        private final String text;
        @NotNull
        private final String value;

        public DeveloperServerSortItem(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "value");
            Intrinsics.checkNotNullParameter(s1, "text");
            super(s, s1, null, false, 12, null);
            this.value = s;
            this.text = s1;
        }

        @NotNull
        public final String component1() {
            return this.value;
        }

        @NotNull
        public final String component2() {
            return this.text;
        }

        @NotNull
        public final DeveloperServerSortItem copy(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "value");
            Intrinsics.checkNotNullParameter(s1, "text");
            return new DeveloperServerSortItem(s, s1);
        }

        public static DeveloperServerSortItem copy$default(DeveloperServerSortItem sortItem$DeveloperServerSortItem0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = sortItem$DeveloperServerSortItem0.value;
            }
            if((v & 2) != 0) {
                s1 = sortItem$DeveloperServerSortItem0.text;
            }
            return sortItem$DeveloperServerSortItem0.copy(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof DeveloperServerSortItem)) {
                return false;
            }
            return Intrinsics.areEqual(this.value, ((DeveloperServerSortItem)object0).value) ? Intrinsics.areEqual(this.text, ((DeveloperServerSortItem)object0).text) : false;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            return this.text.hashCode() + this.value.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "DeveloperServerSortItem(value=" + this.value + ", text=" + this.text + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/domain/entity/SortItem$ImageSettingSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem;", "value", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getValue", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ImageSettingSortItem extends SortItem {
        @NotNull
        private final String text;
        @NotNull
        private final String value;

        public ImageSettingSortItem(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "value");
            Intrinsics.checkNotNullParameter(s1, "text");
            super(s, s1, null, false, 12, null);
            this.value = s;
            this.text = s1;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/entity/SortItem$LogRefSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem;", "value", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LogRefSortItem extends SortItem {
        @NotNull
        private final String text;
        @NotNull
        private final String value;

        public LogRefSortItem(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "value");
            Intrinsics.checkNotNullParameter(s1, "text");
            super(s, s1, null, false, 12, null);
            this.value = s;
            this.text = s1;
        }

        @NotNull
        public final String component1() {
            return this.value;
        }

        @NotNull
        public final String component2() {
            return this.text;
        }

        @NotNull
        public final LogRefSortItem copy(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "value");
            Intrinsics.checkNotNullParameter(s1, "text");
            return new LogRefSortItem(s, s1);
        }

        public static LogRefSortItem copy$default(LogRefSortItem sortItem$LogRefSortItem0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = sortItem$LogRefSortItem0.value;
            }
            if((v & 2) != 0) {
                s1 = sortItem$LogRefSortItem0.text;
            }
            return sortItem$LogRefSortItem0.copy(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LogRefSortItem)) {
                return false;
            }
            return Intrinsics.areEqual(this.value, ((LogRefSortItem)object0).value) ? Intrinsics.areEqual(this.text, ((LogRefSortItem)object0).text) : false;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            return this.text.hashCode() + this.value.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "LogRefSortItem(value=" + this.value + ", text=" + this.text + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/entity/SortItem$NotificationSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem;", "groupType", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getGroupType", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class NotificationSortItem extends SortItem {
        @NotNull
        private final String groupType;
        @NotNull
        private final String text;

        public NotificationSortItem(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "groupType");
            Intrinsics.checkNotNullParameter(s1, "text");
            super(s, s1, null, false, 12, null);
            this.groupType = s;
            this.text = s1;
        }

        @NotNull
        public final String component1() {
            return this.groupType;
        }

        @NotNull
        public final String component2() {
            return this.text;
        }

        @NotNull
        public final NotificationSortItem copy(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "groupType");
            Intrinsics.checkNotNullParameter(s1, "text");
            return new NotificationSortItem(s, s1);
        }

        public static NotificationSortItem copy$default(NotificationSortItem sortItem$NotificationSortItem0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = sortItem$NotificationSortItem0.groupType;
            }
            if((v & 2) != 0) {
                s1 = sortItem$NotificationSortItem0.text;
            }
            return sortItem$NotificationSortItem0.copy(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof NotificationSortItem)) {
                return false;
            }
            return Intrinsics.areEqual(this.groupType, ((NotificationSortItem)object0).groupType) ? Intrinsics.areEqual(this.text, ((NotificationSortItem)object0).text) : false;
        }

        @NotNull
        public final String getGroupType() {
            return this.groupType;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override
        public int hashCode() {
            return this.text.hashCode() + this.groupType.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "NotificationSortItem(groupType=" + this.groupType + ", text=" + this.text + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/entity/SortItem$ProfilePenaltySortItem;", "Lcom/kakao/tistory/domain/entity/SortItem;", "value", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ProfilePenaltySortItem extends SortItem {
        @NotNull
        private final String text;
        @NotNull
        private final String value;

        public ProfilePenaltySortItem(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "value");
            Intrinsics.checkNotNullParameter(s1, "text");
            super(s, s1, null, false, 12, null);
            this.value = s;
            this.text = s1;
        }

        @NotNull
        public final String component1() {
            return this.value;
        }

        @NotNull
        public final String component2() {
            return this.text;
        }

        @NotNull
        public final ProfilePenaltySortItem copy(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "value");
            Intrinsics.checkNotNullParameter(s1, "text");
            return new ProfilePenaltySortItem(s, s1);
        }

        public static ProfilePenaltySortItem copy$default(ProfilePenaltySortItem sortItem$ProfilePenaltySortItem0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = sortItem$ProfilePenaltySortItem0.value;
            }
            if((v & 2) != 0) {
                s1 = sortItem$ProfilePenaltySortItem0.text;
            }
            return sortItem$ProfilePenaltySortItem0.copy(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ProfilePenaltySortItem)) {
                return false;
            }
            return Intrinsics.areEqual(this.value, ((ProfilePenaltySortItem)object0).value) ? Intrinsics.areEqual(this.text, ((ProfilePenaltySortItem)object0).text) : false;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            return this.text.hashCode() + this.value.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "ProfilePenaltySortItem(value=" + this.value + ", text=" + this.text + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/entity/SortItem$SearchSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem;", "value", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SearchSortItem extends SortItem {
        @NotNull
        private final String text;
        @NotNull
        private final String value;

        public SearchSortItem(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "value");
            Intrinsics.checkNotNullParameter(s1, "text");
            super(s, s1, null, false, 12, null);
            this.value = s;
            this.text = s1;
        }

        @NotNull
        public final String component1() {
            return this.value;
        }

        @NotNull
        public final String component2() {
            return this.text;
        }

        @NotNull
        public final SearchSortItem copy(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "value");
            Intrinsics.checkNotNullParameter(s1, "text");
            return new SearchSortItem(s, s1);
        }

        public static SearchSortItem copy$default(SearchSortItem sortItem$SearchSortItem0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = sortItem$SearchSortItem0.value;
            }
            if((v & 2) != 0) {
                s1 = sortItem$SearchSortItem0.text;
            }
            return sortItem$SearchSortItem0.copy(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SearchSortItem)) {
                return false;
            }
            return Intrinsics.areEqual(this.value, ((SearchSortItem)object0).value) ? Intrinsics.areEqual(this.text, ((SearchSortItem)object0).text) : false;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            return this.text.hashCode() + this.value.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "SearchSortItem(value=" + this.value + ", text=" + this.text + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/entity/SortItem$StatisticsMetricSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem;", "metric", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getMetric", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class StatisticsMetricSortItem extends SortItem {
        @NotNull
        private final String metric;
        @NotNull
        private final String text;

        public StatisticsMetricSortItem(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "metric");
            Intrinsics.checkNotNullParameter(s1, "text");
            super(s, s1, null, false, 12, null);
            this.metric = s;
            this.text = s1;
        }

        @NotNull
        public final String component1() {
            return this.metric;
        }

        @NotNull
        public final String component2() {
            return this.text;
        }

        @NotNull
        public final StatisticsMetricSortItem copy(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "metric");
            Intrinsics.checkNotNullParameter(s1, "text");
            return new StatisticsMetricSortItem(s, s1);
        }

        public static StatisticsMetricSortItem copy$default(StatisticsMetricSortItem sortItem$StatisticsMetricSortItem0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = sortItem$StatisticsMetricSortItem0.metric;
            }
            if((v & 2) != 0) {
                s1 = sortItem$StatisticsMetricSortItem0.text;
            }
            return sortItem$StatisticsMetricSortItem0.copy(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof StatisticsMetricSortItem)) {
                return false;
            }
            return Intrinsics.areEqual(this.metric, ((StatisticsMetricSortItem)object0).metric) ? Intrinsics.areEqual(this.text, ((StatisticsMetricSortItem)object0).text) : false;
        }

        @NotNull
        public final String getMetric() {
            return this.metric;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override
        public int hashCode() {
            return this.text.hashCode() + this.metric.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "StatisticsMetricSortItem(metric=" + this.metric + ", text=" + this.text + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\'\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/domain/entity/SortItem$StatisticsSortItem;", "Lcom/kakao/tistory/domain/entity/SortItem;", "granularity", "", "text", "dateTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateTime", "()Ljava/lang/String;", "getGranularity", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class StatisticsSortItem extends SortItem {
        @NotNull
        private final String dateTime;
        @NotNull
        private final String granularity;
        @NotNull
        private final String text;

        public StatisticsSortItem(@NotNull String s, @NotNull String s1, @NotNull String s2) {
            Intrinsics.checkNotNullParameter(s, "granularity");
            Intrinsics.checkNotNullParameter(s1, "text");
            Intrinsics.checkNotNullParameter(s2, "dateTime");
            super(s, s1, s2, false, 8, null);
            this.granularity = s;
            this.text = s1;
            this.dateTime = s2;
        }

        @NotNull
        public final String component1() {
            return this.granularity;
        }

        @NotNull
        public final String component2() {
            return this.text;
        }

        @NotNull
        public final String component3() {
            return this.dateTime;
        }

        @NotNull
        public final StatisticsSortItem copy(@NotNull String s, @NotNull String s1, @NotNull String s2) {
            Intrinsics.checkNotNullParameter(s, "granularity");
            Intrinsics.checkNotNullParameter(s1, "text");
            Intrinsics.checkNotNullParameter(s2, "dateTime");
            return new StatisticsSortItem(s, s1, s2);
        }

        public static StatisticsSortItem copy$default(StatisticsSortItem sortItem$StatisticsSortItem0, String s, String s1, String s2, int v, Object object0) {
            if((v & 1) != 0) {
                s = sortItem$StatisticsSortItem0.granularity;
            }
            if((v & 2) != 0) {
                s1 = sortItem$StatisticsSortItem0.text;
            }
            if((v & 4) != 0) {
                s2 = sortItem$StatisticsSortItem0.dateTime;
            }
            return sortItem$StatisticsSortItem0.copy(s, s1, s2);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof StatisticsSortItem)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.granularity, ((StatisticsSortItem)object0).granularity)) {
                return false;
            }
            return Intrinsics.areEqual(this.text, ((StatisticsSortItem)object0).text) ? Intrinsics.areEqual(this.dateTime, ((StatisticsSortItem)object0).dateTime) : false;
        }

        @NotNull
        public final String getDateTime() {
            return this.dateTime;
        }

        @NotNull
        public final String getGranularity() {
            return this.granularity;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override
        public int hashCode() {
            return this.dateTime.hashCode() + b.a(this.text, this.granularity.hashCode() * 0x1F, 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            return a.o(a5.b.w("StatisticsSortItem(granularity=", this.granularity, ", text=", this.text, ", dateTime="), this.dateTime, ")");
        }
    }

    @Nullable
    private final String description;
    private boolean isSelected;
    @SerializedName("groupLabel")
    @NotNull
    private final String title;
    @NotNull
    private final String type;

    private SortItem(String s, String s1, String s2, boolean z) {
        this.type = s;
        this.title = s1;
        this.description = s2;
        this.isSelected = z;
    }

    public SortItem(String s, String s1, String s2, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            z = false;
        }
        this(s, s1, s2, z, null);
    }

    public SortItem(String s, String s1, String s2, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, s1, s2, z);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}

