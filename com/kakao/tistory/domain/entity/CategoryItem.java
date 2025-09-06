package com.kakao.tistory.domain.entity;

import com.kakao.tistory.domain.blog.entity.a;
import com.kakao.tistory.domain.blog.entity.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\b\u0086\b\u0018\u0000 I2\u00020\u0001:\u0001IB\u00A5\u0001\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001A\u00020\u0003\u0012\b\b\u0002\u0010\r\u001A\u00020\u0003\u0012\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000F\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000F\u00A2\u0006\u0002\u0010\u0015J\t\u00106\u001A\u00020\u0003H\u00C6\u0003J\u0011\u00107\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000FH\u00C6\u0003J\t\u00108\u001A\u00020\u0011H\u00C6\u0003J\u000B\u00109\u001A\u0004\u0018\u00010\u0013H\u00C6\u0003J\u0011\u0010:\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000FH\u00C6\u0003J\u0010\u0010;\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010-J\u000B\u0010<\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u0010\u0010=\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010-J\u0010\u0010>\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0002\u0010 J\u000B\u0010?\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010@\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\t\u0010A\u001A\u00020\u0003H\u00C6\u0003J\t\u0010B\u001A\u00020\u0003H\u00C6\u0003J\u00AE\u0001\u0010C\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001A\u00020\u00032\b\b\u0002\u0010\r\u001A\u00020\u00032\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000FH\u00C6\u0001\u00A2\u0006\u0002\u0010DJ\u0013\u0010E\u001A\u00020\u00112\b\u0010F\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010G\u001A\u00020\u0003H\u00D6\u0001J\t\u0010H\u001A\u00020\u0006H\u00D6\u0001R\u0013\u0010\u0012\u001A\u0004\u0018\u00010\u0013\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017R\u001A\u0010\u0018\u001A\u00020\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\u0019\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000F\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\u001ER\u0015\u0010\b\u001A\u0004\u0018\u00010\t\u00A2\u0006\n\n\u0002\u0010!\u001A\u0004\b\u001F\u0010 R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\"\u0010\u001AR\u001A\u0010#\u001A\u00020\u0011X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0013\u0010\n\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\'\u0010(R\u0013\u0010\u000B\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b)\u0010(R\u0011\u0010\u0010\u001A\u00020\u0011\u00A2\u0006\b\n\u0000\u001A\u0004\b*\u0010$R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b+\u0010(R\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010.\u001A\u0004\b,\u0010-R\u001A\u0010/\u001A\u00020\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b0\u0010\u001A\"\u0004\b1\u0010\u001CR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010.\u001A\u0004\b2\u0010-R\u0019\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000F\u00A2\u0006\b\n\u0000\u001A\u0004\b3\u0010\u001ER\u0011\u0010\r\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b4\u0010\u001AR\u0011\u0010\f\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b5\u0010\u001A\u00A8\u0006J"}, d2 = {"Lcom/kakao/tistory/domain/entity/CategoryItem;", "", "id", "", "parent", "name", "", "priority", "countOfEntries", "", "label", "lastUpdated", "visibility", "viewChannel", "children", "", "leaf", "", "categoryInfo", "Lcom/kakao/tistory/domain/entity/CategoryInfo;", "subCategories", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;ZLcom/kakao/tistory/domain/entity/CategoryInfo;Ljava/util/List;)V", "getCategoryInfo", "()Lcom/kakao/tistory/domain/entity/CategoryInfo;", "childOrder", "getChildOrder", "()I", "setChildOrder", "(I)V", "getChildren", "()Ljava/util/List;", "getCountOfEntries", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "isLastItem", "()Z", "setLastItem", "(Z)V", "getLabel", "()Ljava/lang/String;", "getLastUpdated", "getLeaf", "getName", "getParent", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "parentOrder", "getParentOrder", "setParentOrder", "getPriority", "getSubCategories", "getViewChannel", "getVisibility", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;ZLcom/kakao/tistory/domain/entity/CategoryInfo;Ljava/util/List;)Lcom/kakao/tistory/domain/entity/CategoryItem;", "equals", "other", "hashCode", "toString", "Companion", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CategoryItem {
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/domain/entity/CategoryItem$Companion;", "", "()V", "NOT_SELECTED_CATEGORY", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int NOT_SELECTED_CATEGORY = -3;
    @Nullable
    private final CategoryInfo categoryInfo;
    private int childOrder;
    @Nullable
    private final List children;
    @Nullable
    private final Long countOfEntries;
    private final int id;
    private boolean isLastItem;
    @Nullable
    private final String label;
    @Nullable
    private final String lastUpdated;
    private final boolean leaf;
    @Nullable
    private final String name;
    @Nullable
    private final Integer parent;
    private int parentOrder;
    @Nullable
    private final Integer priority;
    @Nullable
    private final List subCategories;
    private final int viewChannel;
    private final int visibility;

    static {
        CategoryItem.Companion = new Companion(null);
    }

    public CategoryItem() {
        this(0, null, null, null, null, null, null, 0, 0, null, false, null, null, 0x1FFF, null);
    }

    public CategoryItem(int v, @Nullable Integer integer0, @Nullable String s, @Nullable Integer integer1, @Nullable Long long0, @Nullable String s1, @Nullable String s2, int v1, int v2, @Nullable List list0, boolean z, @Nullable CategoryInfo categoryInfo0, @Nullable List list1) {
        this.id = v;
        this.parent = integer0;
        this.name = s;
        this.priority = integer1;
        this.countOfEntries = long0;
        this.label = s1;
        this.lastUpdated = s2;
        this.visibility = v1;
        this.viewChannel = v2;
        this.children = list0;
        this.leaf = z;
        this.categoryInfo = categoryInfo0;
        this.subCategories = list1;
    }

    public CategoryItem(int v, Integer integer0, String s, Integer integer1, Long long0, String s1, String s2, int v1, int v2, List list0, boolean z, CategoryInfo categoryInfo0, List list1, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v3 & 1) == 0 ? v : -3), ((v3 & 2) == 0 ? integer0 : null), ((v3 & 4) == 0 ? s : null), ((v3 & 8) == 0 ? integer1 : null), ((v3 & 16) == 0 ? long0 : null), ((v3 & 0x20) == 0 ? s1 : null), ((v3 & 0x40) == 0 ? s2 : null), ((v3 & 0x80) == 0 ? v1 : 20), ((v3 & 0x100) == 0 ? v2 : 0), ((v3 & 0x200) == 0 ? list0 : null), ((v3 & 0x400) == 0 ? z : false), ((v3 & 0x800) == 0 ? categoryInfo0 : null), ((v3 & 0x1000) == 0 ? list1 : null));
    }

    public final int component1() {
        return this.id;
    }

    @Nullable
    public final List component10() {
        return this.children;
    }

    public final boolean component11() {
        return this.leaf;
    }

    @Nullable
    public final CategoryInfo component12() {
        return this.categoryInfo;
    }

    @Nullable
    public final List component13() {
        return this.subCategories;
    }

    @Nullable
    public final Integer component2() {
        return this.parent;
    }

    @Nullable
    public final String component3() {
        return this.name;
    }

    @Nullable
    public final Integer component4() {
        return this.priority;
    }

    @Nullable
    public final Long component5() {
        return this.countOfEntries;
    }

    @Nullable
    public final String component6() {
        return this.label;
    }

    @Nullable
    public final String component7() {
        return this.lastUpdated;
    }

    public final int component8() {
        return this.visibility;
    }

    public final int component9() {
        return this.viewChannel;
    }

    @NotNull
    public final CategoryItem copy(int v, @Nullable Integer integer0, @Nullable String s, @Nullable Integer integer1, @Nullable Long long0, @Nullable String s1, @Nullable String s2, int v1, int v2, @Nullable List list0, boolean z, @Nullable CategoryInfo categoryInfo0, @Nullable List list1) {
        return new CategoryItem(v, integer0, s, integer1, long0, s1, s2, v1, v2, list0, z, categoryInfo0, list1);
    }

    public static CategoryItem copy$default(CategoryItem categoryItem0, int v, Integer integer0, String s, Integer integer1, Long long0, String s1, String s2, int v1, int v2, List list0, boolean z, CategoryInfo categoryInfo0, List list1, int v3, Object object0) {
        int v4 = (v3 & 1) == 0 ? v : categoryItem0.id;
        Integer integer2 = (v3 & 2) == 0 ? integer0 : categoryItem0.parent;
        String s3 = (v3 & 4) == 0 ? s : categoryItem0.name;
        Integer integer3 = (v3 & 8) == 0 ? integer1 : categoryItem0.priority;
        Long long1 = (v3 & 16) == 0 ? long0 : categoryItem0.countOfEntries;
        String s4 = (v3 & 0x20) == 0 ? s1 : categoryItem0.label;
        String s5 = (v3 & 0x40) == 0 ? s2 : categoryItem0.lastUpdated;
        int v5 = (v3 & 0x80) == 0 ? v1 : categoryItem0.visibility;
        int v6 = (v3 & 0x100) == 0 ? v2 : categoryItem0.viewChannel;
        List list2 = (v3 & 0x200) == 0 ? list0 : categoryItem0.children;
        boolean z1 = (v3 & 0x400) == 0 ? z : categoryItem0.leaf;
        CategoryInfo categoryInfo1 = (v3 & 0x800) == 0 ? categoryInfo0 : categoryItem0.categoryInfo;
        return (v3 & 0x1000) == 0 ? categoryItem0.copy(v4, integer2, s3, integer3, long1, s4, s5, v5, v6, list2, z1, categoryInfo1, list1) : categoryItem0.copy(v4, integer2, s3, integer3, long1, s4, s5, v5, v6, list2, z1, categoryInfo1, categoryItem0.subCategories);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CategoryItem)) {
            return false;
        }
        if(this.id != ((CategoryItem)object0).id) {
            return false;
        }
        if(!Intrinsics.areEqual(this.parent, ((CategoryItem)object0).parent)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.name, ((CategoryItem)object0).name)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.priority, ((CategoryItem)object0).priority)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.countOfEntries, ((CategoryItem)object0).countOfEntries)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.label, ((CategoryItem)object0).label)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.lastUpdated, ((CategoryItem)object0).lastUpdated)) {
            return false;
        }
        if(this.visibility != ((CategoryItem)object0).visibility) {
            return false;
        }
        if(this.viewChannel != ((CategoryItem)object0).viewChannel) {
            return false;
        }
        if(!Intrinsics.areEqual(this.children, ((CategoryItem)object0).children)) {
            return false;
        }
        if(this.leaf != ((CategoryItem)object0).leaf) {
            return false;
        }
        return Intrinsics.areEqual(this.categoryInfo, ((CategoryItem)object0).categoryInfo) ? Intrinsics.areEqual(this.subCategories, ((CategoryItem)object0).subCategories) : false;
    }

    @Nullable
    public final CategoryInfo getCategoryInfo() {
        return this.categoryInfo;
    }

    public final int getChildOrder() {
        return this.childOrder;
    }

    @Nullable
    public final List getChildren() {
        return this.children;
    }

    @Nullable
    public final Long getCountOfEntries() {
        return this.countOfEntries;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    public final boolean getLeaf() {
        return this.leaf;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getParent() {
        return this.parent;
    }

    public final int getParentOrder() {
        return this.parentOrder;
    }

    @Nullable
    public final Integer getPriority() {
        return this.priority;
    }

    @Nullable
    public final List getSubCategories() {
        return this.subCategories;
    }

    public final int getViewChannel() {
        return this.viewChannel;
    }

    public final int getVisibility() {
        return this.visibility;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = c.a(this.leaf, (a.a(this.viewChannel, a.a(this.visibility, ((((((this.id * 0x1F + (this.parent == null ? 0 : this.parent.hashCode())) * 0x1F + (this.name == null ? 0 : this.name.hashCode())) * 0x1F + (this.priority == null ? 0 : this.priority.hashCode())) * 0x1F + (this.countOfEntries == null ? 0 : this.countOfEntries.hashCode())) * 0x1F + (this.label == null ? 0 : this.label.hashCode())) * 0x1F + (this.lastUpdated == null ? 0 : this.lastUpdated.hashCode())) * 0x1F, 0x1F), 0x1F) + (this.children == null ? 0 : this.children.hashCode())) * 0x1F, 0x1F);
        int v2 = this.categoryInfo == null ? 0 : this.categoryInfo.hashCode();
        List list0 = this.subCategories;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return (v1 + v2) * 0x1F + v;
    }

    public final boolean isLastItem() {
        return this.isLastItem;
    }

    public final void setChildOrder(int v) {
        this.childOrder = v;
    }

    public final void setLastItem(boolean z) {
        this.isLastItem = z;
    }

    public final void setParentOrder(int v) {
        this.parentOrder = v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CategoryItem(id=");
        stringBuilder0.append(this.id);
        stringBuilder0.append(", parent=");
        stringBuilder0.append(this.parent);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(", priority=");
        stringBuilder0.append(this.priority);
        stringBuilder0.append(", countOfEntries=");
        stringBuilder0.append(this.countOfEntries);
        stringBuilder0.append(", label=");
        stringBuilder0.append(this.label);
        stringBuilder0.append(", lastUpdated=");
        stringBuilder0.append(this.lastUpdated);
        stringBuilder0.append(", visibility=");
        stringBuilder0.append(this.visibility);
        stringBuilder0.append(", viewChannel=");
        stringBuilder0.append(this.viewChannel);
        stringBuilder0.append(", children=");
        stringBuilder0.append(this.children);
        stringBuilder0.append(", leaf=");
        stringBuilder0.append(this.leaf);
        stringBuilder0.append(", categoryInfo=");
        stringBuilder0.append(this.categoryInfo);
        stringBuilder0.append(", subCategories=");
        return wb.a.e(stringBuilder0, this.subCategories, ")");
    }
}

