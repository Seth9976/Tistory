package com.kakao.tistory.domain.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.domain.entity.Account;
import com.kakao.tistory.domain.entity.Blog;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import okhttp3.MultipartBody.Part;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001C\u0010$\u001A\b\u0012\u0004\u0012\u00020\u00150%2\u0006\u0010&\u001A\u00020\'H\u00A6@\u00A2\u0006\u0002\u0010(J\b\u0010)\u001A\u00020*H&J\u0010\u0010+\u001A\u00020,2\u0006\u0010-\u001A\u00020\u0003H&J\u0014\u0010.\u001A\b\u0012\u0004\u0012\u00020 0%H\u00A6@\u00A2\u0006\u0002\u0010/J\u0012\u00100\u001A\u0004\u0018\u00010\u00152\u0006\u00101\u001A\u00020\u0003H&J\u0014\u00102\u001A\b\u0012\u0004\u0012\u00020*0%H\u00A6@\u00A2\u0006\u0002\u0010/J\u001C\u00103\u001A\b\u0012\u0004\u0012\u0002040%2\u0006\u00105\u001A\u00020\u0003H\u00A6@\u00A2\u0006\u0002\u00106J>\u00107\u001A\b\u0012\u0004\u0012\u00020\u00110%2\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u00108\u001A\u00020\'2\u0006\u00109\u001A\u00020\u00032\u0006\u0010:\u001A\u00020\'2\b\u0010;\u001A\u0004\u0018\u00010\u0003H\u00A6@\u00A2\u0006\u0002\u0010<J$\u0010=\u001A\b\u0012\u0004\u0012\u00020\u00110%2\u0006\u0010>\u001A\u00020\u00032\u0006\u0010?\u001A\u00020\u0003H\u00A6@\u00A2\u0006\u0002\u0010@J\u0014\u0010A\u001A\b\u0012\u0004\u0012\u00020B0%H\u00A6@\u00A2\u0006\u0002\u0010/J\u0014\u0010C\u001A\b\u0012\u0004\u0012\u00020*0%H\u00A6@\u00A2\u0006\u0002\u0010/J\u001E\u0010D\u001A\b\u0012\u0004\u0012\u00020 0%2\b\u0010E\u001A\u0004\u0018\u00010\u0003H\u00A6@\u00A2\u0006\u0002\u00106J\u0014\u0010F\u001A\b\u0012\u0004\u0012\u00020*0%H\u00A6@\u00A2\u0006\u0002\u0010/J>\u0010G\u001A\b\u0012\u0004\u0012\u00020H0%2\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u00108\u001A\u00020\'2\u0006\u00109\u001A\u00020\u00032\u0006\u0010:\u001A\u00020\'2\b\u0010;\u001A\u0004\u0018\u00010\u0003H\u00A6@\u00A2\u0006\u0002\u0010<J\u001C\u0010I\u001A\b\u0012\u0004\u0012\u00020J0%2\u0006\u0010\u0002\u001A\u00020\u0003H\u00A6@\u00A2\u0006\u0002\u00106J\u0010\u0010K\u001A\u00020*2\u0006\u0010L\u001A\u00020\u0015H&J\u0010\u0010K\u001A\u00020*2\u0006\u00101\u001A\u00020\u0003H&J\u0014\u0010M\u001A\b\u0012\u0004\u0012\u00020\u00110%H\u00A6@\u00A2\u0006\u0002\u0010/J\u001E\u0010N\u001A\u00020*2\b\u0010L\u001A\u0004\u0018\u00010\u00152\n\b\u0002\u0010O\u001A\u0004\u0018\u00010\u0011H&J\u0010\u0010P\u001A\u00020*2\u0006\u0010L\u001A\u00020\u0015H&R\u001A\u0010\u0002\u001A\u0004\u0018\u00010\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\u000BR\u001A\u0010\f\u001A\u0004\u0018\u00010\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\r\u0010\u0005\"\u0004\b\u000E\u0010\u0007R\u001A\u0010\u000F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0014\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0016\u0010\u0013R\u001A\u0010\u0017\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0018X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u001A\u0010\u001B\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001C\u0010\u000BR\u001A\u0010\u001D\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001E\u0010\u000BR\u001A\u0010\u001F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010 0\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b!\u0010\u000BR\u001A\u0010\"\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0018X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010\u001A\u00A8\u0006Q"}, d2 = {"Lcom/kakao/tistory/domain/repository/AccountRepository;", "", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "isKakaoAccount", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "kakaoAccessToken", "getKakaoAccessToken", "setKakaoAccessToken", "oldAccount", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/tistory/domain/entity/Account;", "getOldAccount", "()Landroidx/lifecycle/MutableLiveData;", "oldCurrentBlog", "Lcom/kakao/tistory/domain/entity/Blog;", "getOldCurrentBlog", "oldCurrentBlogFlow", "Lkotlinx/coroutines/flow/Flow;", "getOldCurrentBlogFlow", "()Lkotlinx/coroutines/flow/Flow;", "oldCurrentBlogName", "getOldCurrentBlogName", "oldDefaultBlog", "getOldDefaultBlog", "oldUser", "Lcom/kakao/tistory/domain/entity/User;", "getOldUser", "oldUserFlow", "getOldUserFlow", "changeDefaultBlog", "Lcom/kakao/tistory/domain/entity/common/Result;", "blogId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAppSession", "", "createMultipartBody", "Lokhttp3/MultipartBody$Part;", "filePath", "deleteProfileImage", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyBlog", "blogName", "leave", "postCheckNickname", "Lcom/kakao/tistory/domain/entity/common/CheckModel;", "nickname", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLoginByKakao", "accessTokenExpiresAt", "refreshToken", "refreshTokenExpiresAt", "scope", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLoginByTistory", "loginId", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLoginByToken", "Lcom/kakao/tistory/domain/entity/LoginResult;", "postLogout", "postProfileImage", "imageUrl", "postSendingResetPasswordEmail", "postTransfer", "Lcom/kakao/tistory/domain/entity/common/EmptyModel;", "postTransferCheck", "Lcom/kakao/android/base/model/ErrorModel;", "switchCurrentBlog", "blog", "syncUserProfile", "updateAccountAndCurrentBlog", "account", "updateBlog", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface AccountRepository {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void updateAccountAndCurrentBlog$default(AccountRepository accountRepository0, Blog blog0, Account account0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAccountAndCurrentBlog");
            }
            if((v & 2) != 0) {
                account0 = null;
            }
            accountRepository0.updateAccountAndCurrentBlog(blog0, account0);
        }
    }

    @Nullable
    Object changeDefaultBlog(long arg1, @NotNull Continuation arg2);

    void clearAppSession();

    @NotNull
    Part createMultipartBody(@NotNull String arg1);

    @Nullable
    Object deleteProfileImage(@NotNull Continuation arg1);

    @Nullable
    String getAccessToken();

    @Nullable
    String getKakaoAccessToken();

    @Nullable
    Blog getMyBlog(@NotNull String arg1);

    @NotNull
    MutableLiveData getOldAccount();

    @NotNull
    MutableLiveData getOldCurrentBlog();

    @NotNull
    Flow getOldCurrentBlogFlow();

    @NotNull
    LiveData getOldCurrentBlogName();

    @NotNull
    LiveData getOldDefaultBlog();

    @NotNull
    LiveData getOldUser();

    @NotNull
    Flow getOldUserFlow();

    @NotNull
    LiveData isKakaoAccount();

    @Nullable
    Object leave(@NotNull Continuation arg1);

    @Nullable
    Object postCheckNickname(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object postLoginByKakao(@NotNull String arg1, long arg2, @NotNull String arg3, long arg4, @Nullable String arg5, @NotNull Continuation arg6);

    @Nullable
    Object postLoginByTistory(@NotNull String arg1, @NotNull String arg2, @NotNull Continuation arg3);

    @Nullable
    Object postLoginByToken(@NotNull Continuation arg1);

    @Nullable
    Object postLogout(@NotNull Continuation arg1);

    @Nullable
    Object postProfileImage(@Nullable String arg1, @NotNull Continuation arg2);

    @Nullable
    Object postSendingResetPasswordEmail(@NotNull Continuation arg1);

    @Nullable
    Object postTransfer(@NotNull String arg1, long arg2, @NotNull String arg3, long arg4, @Nullable String arg5, @NotNull Continuation arg6);

    @Nullable
    Object postTransferCheck(@NotNull String arg1, @NotNull Continuation arg2);

    void setAccessToken(@Nullable String arg1);

    void setKakaoAccessToken(@Nullable String arg1);

    void switchCurrentBlog(@NotNull Blog arg1);

    void switchCurrentBlog(@NotNull String arg1);

    @Nullable
    Object syncUserProfile(@NotNull Continuation arg1);

    void updateAccountAndCurrentBlog(@Nullable Blog arg1, @Nullable Account arg2);

    void updateBlog(@NotNull Blog arg1);
}

