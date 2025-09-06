package com.kakao.tistory.domain.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\b\u0010\t\u001A\u0004\u0018\u00010\u0006H¦@¢\u0006\u0002\u0010\nJ$\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006H¦@¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/domain/repository/EntryFileRepository;", "", "postBlogAttachFile", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/entry/AttachedData;", "blogName", "", "fileName", "contentUriPath", "mimeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postBlogAttachImage", "filePath", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface EntryFileRepository {
    @Nullable
    Object postBlogAttachFile(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @Nullable String arg4, @NotNull Continuation arg5);

    @Nullable
    Object postBlogAttachImage(@NotNull String arg1, @NotNull String arg2, @NotNull Continuation arg3);
}

