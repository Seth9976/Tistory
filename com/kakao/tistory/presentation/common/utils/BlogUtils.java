package com.kakao.tistory.presentation.common.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.data.R.string;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\'\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001D\u0010\r\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u001D\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/common/utils/BlogUtils;", "", "Lcom/kakao/tistory/domain/entity/User;", "user", "", "needDivider", "", "Lcom/kakao/tistory/domain/entity/Blog;", "getSortedBlogList", "(Lcom/kakao/tistory/domain/entity/User;Z)Ljava/util/List;", "", "getSortedOwnerBlogList", "(Lcom/kakao/tistory/domain/entity/User;)Ljava/util/List;", "sortedOwnerBlogList", "getSortedJoinedBlogList", "sortedJoinedBlogList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogUtils.kt\ncom/kakao/tistory/presentation/common/utils/BlogUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1#2:75\n1054#3:76\n*S KotlinDebug\n*F\n+ 1 BlogUtils.kt\ncom/kakao/tistory/presentation/common/utils/BlogUtils\n*L\n73#1:76\n*E\n"})
public final class BlogUtils {
    public static final int $stable;
    @NotNull
    public static final BlogUtils INSTANCE;

    static {
        BlogUtils.INSTANCE = new BlogUtils();
    }

    @Nullable
    public final List getSortedBlogList(@NotNull User user0, boolean z) {
        boolean z2;
        int v;
        Intrinsics.checkNotNullParameter(user0, "user");
        Blog blog0 = user0.getDefaultBlog();
        String s = blog0 == null ? null : blog0.getName();
        ArrayList arrayList0 = new ArrayList();
        List list0 = user0.getOwnerBlogs();
        boolean z1 = true;
        if(list0 == null) {
            v = -1;
            z2 = false;
        }
        else {
            if(list0.isEmpty()) {
                list0 = null;
            }
            if(list0 == null) {
                v = -1;
                z2 = false;
            }
            else {
                v = -1;
                for(Object object0: list0) {
                    Blog blog1 = (Blog)object0;
                    if(Intrinsics.areEqual(blog1.getName(), s)) {
                        v = 0;
                    }
                    else {
                        if(z) {
                            blog1.setHasDivider(list0.indexOf(blog1) != list0.size() - 1);
                        }
                        arrayList0.add(blog1);
                    }
                }
                z2 = true;
            }
        }
        List list1 = user0.getJoinedBlogs();
        if(list1 == null) {
            z1 = false;
        }
        else {
            if(list1.isEmpty()) {
                list1 = null;
            }
            if(list1 == null) {
                z1 = false;
            }
            else {
                Blog blog2 = new Blog(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, false, false, 0, false, null, 0x7FFFFFF, null);
                blog2.setCategory(BaseKt.getAppContext().getString(string.label_blog_switch_join));
                blog2.setHasDivider(z2);
                arrayList0.add(blog2);
                if(v == -1) {
                    v = arrayList0.indexOf(blog2) + 1;
                }
                for(Object object1: list1) {
                    Blog blog3 = (Blog)object1;
                    if(!Intrinsics.areEqual(blog3.getName(), s)) {
                        if(z) {
                            blog3.setHasDivider(list1.indexOf(blog3) != list1.size() - 1);
                        }
                        arrayList0.add(blog3);
                    }
                }
            }
        }
        if(v > -1 && blog0 != null) {
            arrayList0.add(v, blog0);
        }
        if(z2 && z1) {
            Blog blog4 = new Blog(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, false, false, 0, false, null, 0x7FFFFFF, null);
            blog4.setCategory(BaseKt.getAppContext().getString(string.label_blog_switch_owner));
            arrayList0.add(0, blog4);
        }
        return z2 || z1 ? arrayList0 : null;
    }

    public static List getSortedBlogList$default(BlogUtils blogUtils0, User user0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return blogUtils0.getSortedBlogList(user0, z);
    }

    @Nullable
    public final List getSortedJoinedBlogList(@NotNull User user0) {
        Intrinsics.checkNotNullParameter(user0, "<this>");
        List list0 = user0.getJoinedBlogs();
        Blog blog0 = user0.getDefaultBlog();
        Long long0 = blog0 == null ? null : blog0.getId();
        if(long0 != null) {
            return list0 == null ? null : CollectionsKt___CollectionsKt.sortedWith(list0, new BlogUtils.sortedBlogList..inlined.sortedByDescending.1(long0));
        }
        return list0;
    }

    @Nullable
    public final List getSortedOwnerBlogList(@NotNull User user0) {
        Intrinsics.checkNotNullParameter(user0, "<this>");
        List list0 = user0.getOwnerBlogs();
        Blog blog0 = user0.getDefaultBlog();
        Long long0 = blog0 == null ? null : blog0.getId();
        if(long0 != null) {
            return list0 == null ? null : CollectionsKt___CollectionsKt.sortedWith(list0, new BlogUtils.sortedBlogList..inlined.sortedByDescending.1(long0));
        }
        return list0;
    }
}

