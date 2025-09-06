package com.kakao.tistory.presentation.view.accountMigration;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.kakao.tistory.presentation.R.id;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/tistory/presentation/view/accountMigration/LoginFragmentDirections;", "", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LoginFragmentDirections {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/view/accountMigration/LoginFragmentDirections$Companion;", "", "Landroidx/navigation/NavDirections;", "actionKakaoLoginFragmentToMigrationFragment", "()Landroidx/navigation/NavDirections;", "actionKakaoLoginFragmentToUsedAccountFragment", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final NavDirections actionKakaoLoginFragmentToMigrationFragment() {
            return new ActionOnlyNavDirections(id.action_kakaoLoginFragment_to_migrationFragment);
        }

        @NotNull
        public final NavDirections actionKakaoLoginFragmentToUsedAccountFragment() {
            return new ActionOnlyNavDirections(id.action_kakaoLoginFragment_to_usedAccountFragment);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;

    static {
        LoginFragmentDirections.Companion = new Companion(null);
    }
}

