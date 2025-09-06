package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000E"}, d2 = {"Landroidx/compose/animation/core/Spring;", "", "", "StiffnessHigh", "F", "StiffnessMedium", "StiffnessMediumLow", "StiffnessLow", "StiffnessVeryLow", "DampingRatioHighBouncy", "DampingRatioMediumBouncy", "DampingRatioLowBouncy", "DampingRatioNoBouncy", "DefaultDisplacementThreshold", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Spring {
    public static final int $stable = 0;
    public static final float DampingRatioHighBouncy = 0.2f;
    public static final float DampingRatioLowBouncy = 0.75f;
    public static final float DampingRatioMediumBouncy = 0.5f;
    public static final float DampingRatioNoBouncy = 1.0f;
    public static final float DefaultDisplacementThreshold = 0.01f;
    @NotNull
    public static final Spring INSTANCE = null;
    public static final float StiffnessHigh = 10000.0f;
    public static final float StiffnessLow = 200.0f;
    public static final float StiffnessMedium = 1500.0f;
    public static final float StiffnessMediumLow = 400.0f;
    public static final float StiffnessVeryLow = 50.0f;

    static {
        Spring.INSTANCE = new Spring();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

