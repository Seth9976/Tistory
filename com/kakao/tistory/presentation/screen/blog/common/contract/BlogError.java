package com.kakao.tistory.presentation.screen.blog.common.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.model.common.EmojiError;
import com.kakao.tistory.data.model.common.EmojiErrorModel.Emoji;
import com.kakao.tistory.domain.blog.entity.BlogStatusType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0012\u0010\u000F\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J0\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001B\u001A\u00020\u00032\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u0004\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000ER\u001C\u0010\b\u001A\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogError;", "Lcom/kakao/android/base/model/ErrorModel;", "Lcom/kakao/tistory/data/model/common/EmojiError;", "", "isMyBlog", "Lcom/kakao/tistory/domain/blog/entity/BlogStatusType;", "blogStatus", "Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;", "emoji", "<init>", "(ZLcom/kakao/tistory/domain/blog/entity/BlogStatusType;Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;)V", "component1", "()Z", "component2", "()Lcom/kakao/tistory/domain/blog/entity/BlogStatusType;", "component3", "()Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;", "copy", "(ZLcom/kakao/tistory/domain/blog/entity/BlogStatusType;Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;)Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "Lcom/kakao/tistory/domain/blog/entity/BlogStatusType;", "getBlogStatus", "c", "Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;", "getEmoji", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogError extends ErrorModel implements EmojiError {
    public static final int $stable;
    public final boolean a;
    public final BlogStatusType b;
    public final Emoji c;

    public BlogError(boolean z, @NotNull BlogStatusType blogStatusType0, @Nullable Emoji emojiErrorModel$Emoji0) {
        Intrinsics.checkNotNullParameter(blogStatusType0, "blogStatus");
        super();
        this.a = z;
        this.b = blogStatusType0;
        this.c = emojiErrorModel$Emoji0;
    }

    public final boolean component1() {
        return this.a;
    }

    @NotNull
    public final BlogStatusType component2() {
        return this.b;
    }

    @Nullable
    public final Emoji component3() {
        return this.c;
    }

    @NotNull
    public final BlogError copy(boolean z, @NotNull BlogStatusType blogStatusType0, @Nullable Emoji emojiErrorModel$Emoji0) {
        Intrinsics.checkNotNullParameter(blogStatusType0, "blogStatus");
        return new BlogError(z, blogStatusType0, emojiErrorModel$Emoji0);
    }

    public static BlogError copy$default(BlogError blogError0, boolean z, BlogStatusType blogStatusType0, Emoji emojiErrorModel$Emoji0, int v, Object object0) {
        if((v & 1) != 0) {
            z = blogError0.a;
        }
        if((v & 2) != 0) {
            blogStatusType0 = blogError0.b;
        }
        if((v & 4) != 0) {
            emojiErrorModel$Emoji0 = blogError0.c;
        }
        return blogError0.copy(z, blogStatusType0, emojiErrorModel$Emoji0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogError)) {
            return false;
        }
        if(this.a != ((BlogError)object0).a) {
            return false;
        }
        return this.b == ((BlogError)object0).b ? this.c == ((BlogError)object0).c : false;
    }

    @NotNull
    public final BlogStatusType getBlogStatus() {
        return this.b;
    }

    @Override  // com.kakao.tistory.data.model.common.EmojiError
    @Nullable
    public Emoji getEmoji() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = Boolean.hashCode(this.a);
        int v1 = this.b.hashCode();
        return this.c == null ? (v1 + v * 0x1F) * 0x1F : (v1 + v * 0x1F) * 0x1F + this.c.hashCode();
    }

    public final boolean isMyBlog() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return "BlogError(isMyBlog=" + this.a + ", blogStatus=" + this.b + ", emoji=" + this.c + ")";
    }
}

