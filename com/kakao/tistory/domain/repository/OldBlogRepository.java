package com.kakao.tistory.domain.repository;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody.Part;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH&J\u001C\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000E\u001A\u00020\u000FH\u00A6@\u00A2\u0006\u0002\u0010\u0010J\u001C\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001A\u00020\nH\u00A6@\u00A2\u0006\u0002\u0010\u0013J\u001C\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0012\u001A\u00020\nH\u00A6@\u00A2\u0006\u0002\u0010\u0013J8\u0010\u0016\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\f2\u0006\u0010\u0012\u001A\u00020\n2\b\b\u0002\u0010\u0019\u001A\u00020\u001A2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\nH\u00A6@\u00A2\u0006\u0002\u0010\u001CJ0\u0010\u001D\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00170\f2\b\b\u0002\u0010\u0019\u001A\u00020\u001A2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\nH\u00A6@\u00A2\u0006\u0002\u0010\u001EJ\"\u0010\u001F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00170\f2\u0006\u0010\u0012\u001A\u00020\nH\u00A6@\u00A2\u0006\u0002\u0010\u0013J6\u0010!\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\f2\u0006\u0010\u0012\u001A\u00020\n2\b\b\u0002\u0010\u0019\u001A\u00020\u001A2\b\b\u0002\u0010$\u001A\u00020\u001AH\u00A6@\u00A2\u0006\u0002\u0010%J@\u0010&\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\f2\u0006\u0010\u0012\u001A\u00020\n2\b\b\u0002\u0010\'\u001A\u00020\u001A2\b\b\u0002\u0010\u0019\u001A\u00020\u001A2\b\b\u0002\u0010$\u001A\u00020\u001AH\u00A6@\u00A2\u0006\u0002\u0010(J\u001C\u0010)\u001A\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000E\u001A\u00020\u000FH\u00A6@\u00A2\u0006\u0002\u0010\u0010JJ\u0010*\u001A\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0012\u001A\u00020\n2\u0006\u0010+\u001A\u00020\n2\b\u0010,\u001A\u0004\u0018\u00010\n2\u0006\u0010-\u001A\u00020\n2\b\u0010.\u001A\u0004\u0018\u00010\n2\b\b\u0002\u0010/\u001A\u00020\u0004H\u00A6@\u00A2\u0006\u0002\u00100J\u001C\u00101\u001A\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001A\u00020\nH\u00A6@\u00A2\u0006\u0002\u0010\u0013J.\u00102\u001A\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001A\u00020\n2\u0006\u00103\u001A\u00020\n2\b\u00104\u001A\u0004\u0018\u00010\nH\u00A6@\u00A2\u0006\u0002\u00105R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006\u00A8\u00066"}, d2 = {"Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "", "updateBlogInfo", "Landroidx/lifecycle/MutableLiveData;", "", "getUpdateBlogInfo", "()Landroidx/lifecycle/MutableLiveData;", "createMultipartBody", "Lokhttp3/MultipartBody$Part;", "filePath", "", "deleteBlockUser", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "targetUserId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFollowBlog", "blogName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlog", "Lcom/kakao/tistory/domain/entity/Blog;", "getBlogFollowers", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/domain/entity/User;", "nextPage", "", "sortType", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlogFollowings", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "getNotices", "Lcom/kakao/tistory/domain/entity/common/EntryItemListModel;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "resultSize", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPosts", "category", "(Ljava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postBlockUser", "postBlogInfo", "title", "description", "nickName", "imageUrl", "deleteImage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postFollowBlog", "reportBlog", "reportCode", "reportMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface OldBlogRepository {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getBlogFollowers$default(OldBlogRepository oldBlogRepository0, String s, int v, String s1, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBlogFollowers");
            }
            if((v1 & 2) != 0) {
                v = 1;
            }
            if((v1 & 4) != 0) {
                s1 = null;
            }
            return oldBlogRepository0.getBlogFollowers(s, v, s1, continuation0);
        }

        public static Object getBlogFollowings$default(OldBlogRepository oldBlogRepository0, int v, String s, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBlogFollowings");
            }
            if((v1 & 1) != 0) {
                v = 1;
            }
            if((v1 & 2) != 0) {
                s = null;
            }
            return oldBlogRepository0.getBlogFollowings(v, s, continuation0);
        }

        public static Object getNotices$default(OldBlogRepository oldBlogRepository0, String s, int v, int v1, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotices");
            }
            if((v2 & 2) != 0) {
                v = 1;
            }
            if((v2 & 4) != 0) {
                v1 = 20;
            }
            return oldBlogRepository0.getNotices(s, v, v1, continuation0);
        }

        public static Object getPosts$default(OldBlogRepository oldBlogRepository0, String s, int v, int v1, int v2, Continuation continuation0, int v3, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPosts");
            }
            if((v3 & 2) != 0) {
                v = -3;
            }
            if((v3 & 4) != 0) {
                v1 = 1;
            }
            if((v3 & 8) != 0) {
                v2 = 20;
            }
            return oldBlogRepository0.getPosts(s, v, v1, v2, continuation0);
        }

        public static Object postBlogInfo$default(OldBlogRepository oldBlogRepository0, String s, String s1, String s2, String s3, String s4, boolean z, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postBlogInfo");
            }
            return (v & 0x20) == 0 ? oldBlogRepository0.postBlogInfo(s, s1, s2, s3, s4, z, continuation0) : oldBlogRepository0.postBlogInfo(s, s1, s2, s3, s4, false, continuation0);
        }
    }

    @NotNull
    Part createMultipartBody(@NotNull String arg1);

    @Nullable
    Object deleteBlockUser(long arg1, @NotNull Continuation arg2);

    @Nullable
    Object deleteFollowBlog(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getBlog(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getBlogFollowers(@NotNull String arg1, int arg2, @Nullable String arg3, @NotNull Continuation arg4);

    @Nullable
    Object getBlogFollowings(int arg1, @Nullable String arg2, @NotNull Continuation arg3);

    @Nullable
    Object getCategories(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getNotices(@NotNull String arg1, int arg2, int arg3, @NotNull Continuation arg4);

    @Nullable
    Object getPosts(@NotNull String arg1, int arg2, int arg3, int arg4, @NotNull Continuation arg5);

    @NotNull
    MutableLiveData getUpdateBlogInfo();

    @Nullable
    Object postBlockUser(long arg1, @NotNull Continuation arg2);

    @Nullable
    Object postBlogInfo(@NotNull String arg1, @NotNull String arg2, @Nullable String arg3, @NotNull String arg4, @Nullable String arg5, boolean arg6, @NotNull Continuation arg7);

    @Nullable
    Object postFollowBlog(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object reportBlog(@NotNull String arg1, @NotNull String arg2, @Nullable String arg3, @NotNull Continuation arg4);
}

