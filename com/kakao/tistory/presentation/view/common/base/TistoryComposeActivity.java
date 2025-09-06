package com.kakao.tistory.presentation.view.common.base;

import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.databinding.ComposeContainerBinding;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\'¢\u0006\u0004\b\f\u0010\rR\u001A\u0010\u0013\u001A\u00020\u000E8UX\u0094\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryActivity;", "Lcom/kakao/tistory/presentation/databinding/ComposeContainerBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "g", "I", "getLayoutResourceId", "()I", "layoutResourceId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class TistoryComposeActivity extends TistoryActivity {
    public static final int $stable;
    public final int g;

    public TistoryComposeActivity() {
        this.g = layout.compose_container;
    }

    @Composable
    public abstract void Content(@NotNull Modifier arg1, @Nullable Composer arg2, int arg3);

    @Override  // com.kakao.android.base.ui.BaseActivity
    @LayoutRes
    public int getLayoutResourceId() {
        return this.g;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ((ComposeContainerBinding)this.getDataBinding()).composeContainer.setContent(ComposableLambdaKt.composableLambdaInstance(1961719502, true, new j(this)));
    }
}

