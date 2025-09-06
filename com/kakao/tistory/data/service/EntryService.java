package com.kakao.tistory.data.service;

import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000\u00A8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010\bJ\"\u0010\t\u001A\u00020\n2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u000B\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010\bJ\"\u0010\f\u001A\u00020\r2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u000B\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010\bJ\u0018\u0010\u000E\u001A\u00020\u000F2\b\b\u0001\u0010\u0004\u001A\u00020\u0005H\u00A7@\u00A2\u0006\u0002\u0010\u0010J,\u0010\u0011\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\b\b\u0001\u0010\u0004\u001A\u00020\u00052\n\b\u0003\u0010\u000B\u001A\u0004\u0018\u00010\u0007H\u00A7@\u00A2\u0006\u0002\u0010\u0014J\u001A\u0010\u0015\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0012H\u00A7@\u00A2\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001A\u00020\u001A2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010\bJ\u0018\u0010\u001B\u001A\u00020\u00032\b\b\u0001\u0010\u0004\u001A\u00020\u0005H\u00A7@\u00A2\u0006\u0002\u0010\u0010J$\u0010\u001C\u001A\u00020\u001D2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\n\b\u0003\u0010\u001E\u001A\u0004\u0018\u00010\u001FH\u00A7@\u00A2\u0006\u0002\u0010 J\"\u0010!\u001A\u00020\"2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u000B\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010\bJ.\u0010#\u001A\u00020$2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u000B\u001A\u00020\u00072\n\b\u0001\u0010%\u001A\u0004\u0018\u00010\u0005H\u00A7@\u00A2\u0006\u0002\u0010&J.\u0010#\u001A\u00020$2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\'\u001A\u00020\u00052\n\b\u0001\u0010%\u001A\u0004\u0018\u00010\u0005H\u00A7@\u00A2\u0006\u0002\u0010(J\u0018\u0010)\u001A\b\u0012\u0004\u0012\u00020+0*2\b\b\u0001\u0010,\u001A\u00020\u0005H\'J\u0018\u0010-\u001A\u00020.2\b\b\u0001\u0010\u0004\u001A\u00020\u0005H\u00A7@\u00A2\u0006\u0002\u0010\u0010J\"\u0010/\u001A\u0002002\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u00101\u001A\u000202H\u00A7@\u00A2\u0006\u0002\u00103J,\u00104\u001A\u0002052\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u000B\u001A\u00020\u00072\b\b\u0001\u00106\u001A\u00020\u0005H\u00A7@\u00A2\u0006\u0002\u0010&J,\u00104\u001A\u0002052\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\'\u001A\u00020\u00052\b\b\u0001\u00106\u001A\u00020\u0005H\u00A7@\u00A2\u0006\u0002\u0010(Jd\u00107\u001A\u00020\u001A2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\n\b\u0001\u00108\u001A\u0004\u0018\u00010\u00052\n\b\u0001\u00109\u001A\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010:\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00162\n\b\u0003\u0010;\u001A\u0004\u0018\u00010\u001F2\n\b\u0001\u0010<\u001A\u0004\u0018\u00010\u0005H\u00A7@\u00A2\u0006\u0002\u0010=J\u0098\u0001\u0010>\u001A\u00020$2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u000B\u001A\u00020\u00072\b\b\u0001\u00108\u001A\u00020\u00052\n\b\u0001\u0010;\u001A\u0004\u0018\u00010\u001F2\b\b\u0001\u0010?\u001A\u00020@2\b\b\u0001\u00109\u001A\u00020\u00052\n\b\u0001\u0010%\u001A\u0004\u0018\u00010\u00052\n\b\u0001\u0010A\u001A\u0004\u0018\u00010\u00072\b\b\u0001\u0010B\u001A\u00020\u001F2\n\b\u0001\u0010<\u001A\u0004\u0018\u00010\u00052\u0010\b\u0001\u0010:\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00162\n\b\u0001\u0010C\u001A\u0004\u0018\u00010\u001FH\u00A7@\u00A2\u0006\u0002\u0010DJ4\u0010E\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010F0\u00122\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u000B\u001A\u00020\u00072\b\b\u0001\u0010G\u001A\u00020\u0005H\u00A7@\u00A2\u0006\u0002\u0010&J\"\u0010H\u001A\u00020\r2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u000B\u001A\u00020\u0007H\u00A7@\u00A2\u0006\u0002\u0010\bJZ\u0010I\u001A\u00020\u001A2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\n\b\u0001\u00108\u001A\u0004\u0018\u00010\u00052\n\b\u0001\u00109\u001A\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010:\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00162\n\b\u0003\u0010;\u001A\u0004\u0018\u00010\u001F2\n\b\u0001\u0010<\u001A\u0004\u0018\u00010\u0005H\u00A7@\u00A2\u0006\u0002\u0010JJ\u009A\u0001\u0010K\u001A\u00020$2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\n\b\u0001\u0010\u0006\u001A\u0004\u0018\u00010\u00072\b\b\u0001\u00108\u001A\u00020\u00052\n\b\u0003\u0010;\u001A\u0004\u0018\u00010\u001F2\b\b\u0001\u0010?\u001A\u00020@2\b\b\u0001\u00109\u001A\u00020\u00052\n\b\u0003\u0010%\u001A\u0004\u0018\u00010\u00052\n\b\u0003\u0010A\u001A\u0004\u0018\u00010\u00072\b\b\u0001\u0010B\u001A\u00020\u001F2\n\b\u0003\u0010<\u001A\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010:\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00162\n\b\u0003\u0010C\u001A\u0004\u0018\u00010\u001FH\u00A7@\u00A2\u0006\u0002\u0010LJ8\u0010M\u001A\u00020\n2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u000B\u001A\u00020\u00072\b\b\u0001\u0010N\u001A\u00020\u00052\n\b\u0001\u0010O\u001A\u0004\u0018\u00010\u0005H\u00A7@\u00A2\u0006\u0002\u0010PJ,\u0010Q\u001A\u00020$2\b\b\u0001\u0010\u0004\u001A\u00020\u00052\b\b\u0001\u0010\u000B\u001A\u00020\u00072\b\b\u0001\u0010?\u001A\u00020\u0005H\u00A7@\u00A2\u0006\u0002\u0010&\u00A8\u0006R"}, d2 = {"Lcom/kakao/tistory/data/service/EntryService;", "", "deleteDraft", "Lcom/kakao/tistory/domain/entity/common/Count;", "blogName", "", "sequence", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEntry", "", "entryId", "deleteLikeIt", "Lcom/kakao/tistory/domain/entity/entry/LikeState;", "getCategories", "Lcom/kakao/tistory/domain/entity/CategoryItemListModel;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChallengeRequirements", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "Lcom/kakao/tistory/domain/entity/entry/ChallengeRequirements;", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDaumLikeCategories", "", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeCategoryItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDraft", "Lcom/kakao/tistory/domain/entity/entry/DraftItemResult;", "getDraftCount", "getDraftList", "Lcom/kakao/tistory/domain/entity/DraftListModel;", "page", "", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEditableEntry", "Lcom/kakao/tistory/domain/entity/entry/EditableEntry;", "getEntry", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "password", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "slogan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOpenGraph", "Lretrofit2/Call;", "Lcom/kakao/tistory/domain/entity/entry/OpenGraphInfo;", "url", "getRecentTags", "Lcom/kakao/tistory/domain/entity/RecentTagItemListModel;", "postBlogAttach", "Lcom/kakao/tistory/domain/entity/entry/AttachedData;", "file", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postCheckProtectedPassword", "Lcom/kakao/tistory/domain/entity/common/CheckModel;", "guestPassword", "postEditDraft", "title", "cdm", "tags", "category", "thumbnail", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEditEntry", "visibility", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "published", "acceptComment", "daumLike", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEntryChallenge", "Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "challengeCode", "postLikeIt", "postNewDraft", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postNewEntry", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postReportEntry", "reportCode", "reportMessage", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putEntryVisibility", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface EntryService {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getChallengeRequirements$default(EntryService entryService0, String s, Long long0, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChallengeRequirements");
            }
            if((v & 2) != 0) {
                long0 = null;
            }
            return entryService0.getChallengeRequirements(s, long0, continuation0);
        }

        public static Object getDraftList$default(EntryService entryService0, String s, Integer integer0, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDraftList");
            }
            if((v & 2) != 0) {
                integer0 = 1;
            }
            return entryService0.getDraftList(s, integer0, continuation0);
        }

        public static Object postEditDraft$default(EntryService entryService0, String s, long v, String s1, String s2, List list0, Integer integer0, String s3, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postEditDraft");
            }
            List list1 = (v1 & 16) == 0 ? list0 : null;
            return (v1 & 0x20) == 0 ? entryService0.postEditDraft(s, v, s1, s2, list1, integer0, s3, continuation0) : entryService0.postEditDraft(s, v, s1, s2, list1, null, s3, continuation0);
        }

        public static Object postNewDraft$default(EntryService entryService0, String s, String s1, String s2, List list0, Integer integer0, String s3, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postNewDraft");
            }
            List list1 = (v & 8) == 0 ? list0 : null;
            return (v & 16) == 0 ? entryService0.postNewDraft(s, s1, s2, list1, integer0, s3, continuation0) : entryService0.postNewDraft(s, s1, s2, list1, null, s3, continuation0);
        }

        public static Object postNewEntry$default(EntryService entryService0, String s, Long long0, String s1, Integer integer0, EntryVisibilityType entryVisibilityType0, String s2, String s3, Long long1, int v, String s4, List list0, Integer integer1, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postNewEntry");
            }
            Integer integer2 = (v1 & 8) == 0 ? integer0 : null;
            String s5 = (v1 & 0x40) == 0 ? s3 : null;
            Long long2 = (v1 & 0x80) == 0 ? long1 : null;
            String s6 = (v1 & 0x200) == 0 ? s4 : null;
            List list1 = (v1 & 0x400) == 0 ? list0 : null;
            return (v1 & 0x800) == 0 ? entryService0.postNewEntry(s, long0, s1, integer2, entryVisibilityType0, s2, s5, long2, v, s6, list1, integer1, continuation0) : entryService0.postNewEntry(s, long0, s1, integer2, entryVisibilityType0, s2, s5, long2, v, s6, list1, null, continuation0);
        }
    }

    @Nullable
    @DELETE("/app/v2/blog/{blogName}/drafts/{sequence}")
    Object deleteDraft(@NotNull @Path("blogName") String arg1, @Path("sequence") long arg2, @NotNull Continuation arg3);

    @Nullable
    @DELETE("/app/v2/blog/{blogName}/entry/{entryId}/delete")
    Object deleteEntry(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull Continuation arg3);

    @Nullable
    @DELETE("/app/v2/blog/{blogName}/posts/{entryId}/reaction")
    Object deleteLikeIt(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull Continuation arg3);

    @Nullable
    @GET("/app/v2/blog/{blogName}/categories/selection")
    Object getCategories(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v3/blog/editor/blog/{blogName}/challenge/editor/requirements")
    Object getChallengeRequirements(@NotNull @Path("blogName") String arg1, @Nullable @Query("entryId") Long arg2, @NotNull Continuation arg3);

    @Nullable
    @GET("/app/v3/daumLikeCategories")
    Object getDaumLikeCategories(@NotNull Continuation arg1);

    @Nullable
    @GET("/app/v2/blog/{blogName}/drafts/{sequence}")
    Object getDraft(@NotNull @Path("blogName") String arg1, @Path("sequence") long arg2, @NotNull Continuation arg3);

    @Nullable
    @GET("/app/v2/blog/{blogName}/drafts/count")
    Object getDraftCount(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v2/blog/{blogName}/drafts")
    Object getDraftList(@NotNull @Path("blogName") String arg1, @Nullable @Query("page") Integer arg2, @NotNull Continuation arg3);

    @Nullable
    @GET("/app/v2/blog/{blogName}/entry/{entryId}/edit")
    Object getEditableEntry(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull Continuation arg3);

    @Nullable
    @GET("/app/v2/blog/{blogName}/entry/{entryId}")
    Object getEntry(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @Nullable @Query("password") String arg3, @NotNull Continuation arg4);

    @Nullable
    @GET("/app/v2/blog/{blogName}/entry/slogan/{slogan}")
    Object getEntry(@NotNull @Path("blogName") String arg1, @NotNull @Path("slogan") String arg2, @Nullable @Query("password") String arg3, @NotNull Continuation arg4);

    @NotNull
    @GET("/app/v2/scrap")
    Call getOpenGraph(@NotNull @Query("url") String arg1);

    @Nullable
    @GET("/app/v2/blog/{blogName}/recentTags")
    Object getRecentTags(@NotNull @Path("blogName") String arg1, @NotNull Continuation arg2);

    @Nullable
    @Multipart
    @POST("/app/v2/blog/{blogName}/attach")
    Object postBlogAttach(@NotNull @Path("blogName") String arg1, @NotNull @Part okhttp3.MultipartBody.Part arg2, @NotNull Continuation arg3);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/blog/{blogName}/posts/{entryId}/checkProtectedPassword")
    Object postCheckProtectedPassword(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull @Field("GUEST_PASSWORD") String arg3, @NotNull Continuation arg4);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/blog/{blogName}/posts/{slogan}/checkProtectedPassword")
    Object postCheckProtectedPassword(@NotNull @Path("blogName") String arg1, @NotNull @Path("slogan") String arg2, @NotNull @Field("GUEST_PASSWORD") String arg3, @NotNull Continuation arg4);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/blog/{blogName}/drafts/{sequence}")
    Object postEditDraft(@NotNull @Path("blogName") String arg1, @Path("sequence") long arg2, @Nullable @Field("title") String arg3, @Nullable @Field("cdm") String arg4, @Nullable @Field("tags[]") List arg5, @Nullable @Field("categoryId") Integer arg6, @Nullable @Field("thumbnail") String arg7, @NotNull Continuation arg8);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/blog/{blogName}/entry/{entryId}")
    Object postEditEntry(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull @Field("title") String arg3, @Nullable @Field("categoryId") Integer arg4, @NotNull @Field("visibility") EntryVisibilityType arg5, @NotNull @Field("cdm") String arg6, @Nullable @Field("password") String arg7, @Nullable @Field("published") Long arg8, @Field("acceptComment") int arg9, @Nullable @Field("thumbnail") String arg10, @Nullable @Field("tags[]") List arg11, @Nullable @Field("daumLikeId") Integer arg12, @NotNull Continuation arg13);

    @Nullable
    @POST("/app/v3/blog/editor/blog/{blogName}/challenge/{challengeCode}/editor/{entryId}")
    Object postEntryChallenge(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull @Path("challengeCode") String arg3, @NotNull Continuation arg4);

    @Nullable
    @POST("/app/v2/blog/{blogName}/posts/{entryId}/reaction")
    Object postLikeIt(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull Continuation arg3);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/blog/{blogName}/drafts")
    Object postNewDraft(@NotNull @Path("blogName") String arg1, @Nullable @Field("title") String arg2, @Nullable @Field("cdm") String arg3, @Nullable @Field("tags[]") List arg4, @Nullable @Field("categoryId") Integer arg5, @Nullable @Field("thumbnail") String arg6, @NotNull Continuation arg7);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/blog/{blogName}/entry")
    Object postNewEntry(@NotNull @Path("blogName") String arg1, @Nullable @Field("draftSequence") Long arg2, @NotNull @Field("title") String arg3, @Nullable @Field("categoryId") Integer arg4, @NotNull @Field("visibility") EntryVisibilityType arg5, @NotNull @Field("cdm") String arg6, @Nullable @Field("password") String arg7, @Nullable @Field("published") Long arg8, @Field("acceptComment") int arg9, @Nullable @Field("thumbnail") String arg10, @Nullable @Field("tags[]") List arg11, @Nullable @Field("daumLikeId") Integer arg12, @NotNull Continuation arg13);

    @Nullable
    @FormUrlEncoded
    @POST("/app/v2/clean/report/entry")
    Object postReportEntry(@NotNull @Field("blogName") String arg1, @Field("entryId") long arg2, @NotNull @Field("reasonCode") String arg3, @Nullable @Field("reasonMention") String arg4, @NotNull Continuation arg5);

    @Nullable
    @FormUrlEncoded
    @PUT("/app/v2/blog/{blogName}/posts/{entryId}/visibility")
    Object putEntryVisibility(@NotNull @Path("blogName") String arg1, @Path("entryId") long arg2, @NotNull @Field("visibility") String arg3, @NotNull Continuation arg4);
}

