package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.Category;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A?\u0010\n\u001A\u00020\t*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\b\u001A\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"", "Lcom/kakao/tistory/domain/blog/entity/Category;", "Lkotlin/Function0;", "", "onClickShowCategoryList", "Lkotlin/Function2;", "", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "onClickCategory", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategory;", "toBlogMainCategory", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategory;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainCategory.kt\ncom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n288#2,2:72\n1549#2:74\n1620#2,3:75\n*S KotlinDebug\n*F\n+ 1 BlogMainCategory.kt\ncom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryKt\n*L\n38#1:72,2\n53#1:74\n53#1:75,3\n*E\n"})
public final class BlogMainCategoryKt {
    public static final ArrayList a(List list0, int v, Function2 function20) {
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            int v1 = ((Category)object0).getId();
            String s = ((Category)object0).getName();
            if(s == null) {
                s = "";
            }
            Long long0 = ((Category)object0).getCountOfEntries();
            long v2 = long0 == null ? 0L : ((long)long0);
            c c0 = new c(function20, v);
            List list1 = ((Category)object0).getSubCategories();
            List list2 = list1 == null ? CollectionsKt__CollectionsKt.emptyList() : BlogMainCategoryKt.a(list1, v + 1, function20);
            BlogMainCategoryItem blogMainCategoryItem0 = new BlogMainCategoryItem(v1, s, v2, c0, list2);
            v += blogMainCategoryItem0.getSubCategoryList().size() + 1;
            arrayList0.add(blogMainCategoryItem0);
        }
        return arrayList0;
    }

    @NotNull
    public static final BlogMainCategory toBlogMainCategory(@NotNull List list0, @NotNull Function0 function00, @NotNull Function2 function20) {
        Object object0 = null;
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onClickShowCategoryList");
        Intrinsics.checkNotNullParameter(function20, "onClickCategory");
        ArrayList arrayList0 = BlogMainCategoryKt.a(list0, 0, function20);
        for(Object object1: arrayList0) {
            if(((BlogMainCategoryItem)object1).getId() == -3) {
                object0 = object1;
                break;
            }
        }
        BlogMainCategoryItem blogMainCategoryItem0 = (BlogMainCategoryItem)object0;
        if(blogMainCategoryItem0 == null) {
            blogMainCategoryItem0 = (BlogMainCategoryItem)CollectionsKt___CollectionsKt.firstOrNull(arrayList0);
            if(blogMainCategoryItem0 == null) {
                blogMainCategoryItem0 = BlogMainCategoryItem.Companion.getDefault();
            }
        }
        return new BlogMainCategory(arrayList0, blogMainCategoryItem0, function00);
    }
}

