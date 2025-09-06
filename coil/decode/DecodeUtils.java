package coil.decode;

import androidx.annotation.Px;
import coil.size.Scale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J?\u0010\t\u001A\u00020\u00022\b\b\u0001\u0010\u0003\u001A\u00020\u00022\b\b\u0001\u0010\u0004\u001A\u00020\u00022\b\b\u0001\u0010\u0005\u001A\u00020\u00022\b\b\u0001\u0010\u0006\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ?\u0010\f\u001A\u00020\u000B2\b\b\u0001\u0010\u0003\u001A\u00020\u00022\b\b\u0001\u0010\u0004\u001A\u00020\u00022\b\b\u0001\u0010\u0005\u001A\u00020\u00022\b\b\u0001\u0010\u0006\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ?\u0010\f\u001A\u00020\u000E2\b\b\u0001\u0010\u0003\u001A\u00020\u000E2\b\b\u0001\u0010\u0004\u001A\u00020\u000E2\b\b\u0001\u0010\u0005\u001A\u00020\u000E2\b\b\u0001\u0010\u0006\u001A\u00020\u000E2\u0006\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000FJ?\u0010\f\u001A\u00020\u000B2\b\b\u0001\u0010\u0003\u001A\u00020\u000B2\b\b\u0001\u0010\u0004\u001A\u00020\u000B2\b\b\u0001\u0010\u0005\u001A\u00020\u000B2\b\b\u0001\u0010\u0006\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcoil/decode/DecodeUtils;", "", "", "srcWidth", "srcHeight", "dstWidth", "dstHeight", "Lcoil/size/Scale;", "scale", "calculateInSampleSize", "(IIIILcoil/size/Scale;)I", "", "computeSizeMultiplier", "(IIIILcoil/size/Scale;)D", "", "(FFFFLcoil/size/Scale;)F", "(DDDDLcoil/size/Scale;)D", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DecodeUtils {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Scale.values().length];
            try {
                arr_v[Scale.FILL.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Scale.FIT.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final DecodeUtils INSTANCE;

    static {
        DecodeUtils.INSTANCE = new DecodeUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @JvmStatic
    public static final int calculateInSampleSize(@Px int v, @Px int v1, @Px int v2, @Px int v3, @NotNull Scale scale0) {
        int v4 = Integer.highestOneBit(v / v2);
        int v5 = Integer.highestOneBit(v1 / v3);
        switch(WhenMappings.$EnumSwitchMapping$0[scale0.ordinal()]) {
            case 1: {
                return c.coerceAtLeast(Math.min(v4, v5), 1);
            }
            case 2: {
                return c.coerceAtLeast(Math.max(v4, v5), 1);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @JvmStatic
    public static final double computeSizeMultiplier(@Px double f, @Px double f1, @Px double f2, @Px double f3, @NotNull Scale scale0) {
        double f4 = f2 / f;
        double f5 = f3 / f1;
        switch(WhenMappings.$EnumSwitchMapping$0[scale0.ordinal()]) {
            case 1: {
                return Math.max(f4, f5);
            }
            case 2: {
                return Math.min(f4, f5);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @JvmStatic
    public static final double computeSizeMultiplier(@Px int v, @Px int v1, @Px int v2, @Px int v3, @NotNull Scale scale0) {
        double f = ((double)v2) / ((double)v);
        double f1 = ((double)v3) / ((double)v1);
        switch(WhenMappings.$EnumSwitchMapping$0[scale0.ordinal()]) {
            case 1: {
                return Math.max(f, f1);
            }
            case 2: {
                return Math.min(f, f1);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @JvmStatic
    public static final float computeSizeMultiplier(@Px float f, @Px float f1, @Px float f2, @Px float f3, @NotNull Scale scale0) {
        float f4 = f2 / f;
        float f5 = f3 / f1;
        switch(WhenMappings.$EnumSwitchMapping$0[scale0.ordinal()]) {
            case 1: {
                return Math.max(f4, f5);
            }
            case 2: {
                return Math.min(f4, f5);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

