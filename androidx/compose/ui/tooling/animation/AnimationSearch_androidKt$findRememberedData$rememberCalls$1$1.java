package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.data.Group;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001A\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "call", "Landroidx/compose/ui/tooling/data/Group;", "invoke", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1\n*L\n1#1,463:1\n*E\n"})
public final class AnimationSearch_androidKt.findRememberedData.rememberCalls.1.1 extends Lambda implements Function1 {
    public static final AnimationSearch_androidKt.findRememberedData.rememberCalls.1.1 INSTANCE;

    static {
        AnimationSearch_androidKt.findRememberedData.rememberCalls.1.1.INSTANCE = new AnimationSearch_androidKt.findRememberedData.rememberCalls.1.1();
    }

    public AnimationSearch_androidKt.findRememberedData.rememberCalls.1.1() {
        super(1);
    }

    @NotNull
    public final Boolean invoke(@NotNull Group group0) {
        return Boolean.valueOf(Intrinsics.areEqual(group0.getName(), "remember"));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(((Group)object0));
    }
}

