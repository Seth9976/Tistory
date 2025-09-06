package com.kakao.tistory.presentation.editor.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/presentation/editor/contract/Category;", "", "invalidMessage", "", "getInvalidMessage", "()I", "Public", "Lcom/kakao/tistory/presentation/editor/contract/Category$Public;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Category {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\fR\u0014\u0010\u000E\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u0007¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/presentation/editor/contract/Category$Public;", "Lcom/kakao/tistory/presentation/editor/contract/Category;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "getInvalidMessage", "invalidMessage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Public implements Category {
        public static final int $stable;
        @NotNull
        public static final Public INSTANCE;

        static {
            Public.INSTANCE = new Public();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Public;
        }

        // 检测为 Lambda 实现
        @Override  // com.kakao.tistory.presentation.editor.contract.Category
        public int getInvalidMessage() [...]

        @Override
        public int hashCode() {
            return 0x96393B70;
        }

        @Override
        @NotNull
        public String toString() {
            return "Public";
        }
    }

    int getInvalidMessage();
}

