package androidx.window.core;

import i5.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \u000F*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002\u000F\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u000F\u0010\u0004\u001A\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u0007H\u0004J/\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\t\u001A\u00020\u00072\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000EH&¨\u0006\u0011"}, d2 = {"Landroidx/window/core/SpecificationComputer;", "T", "", "()V", "compute", "()Ljava/lang/Object;", "createMessage", "", "value", "message", "require", "condition", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "Companion", "VerificationMode", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public abstract class SpecificationComputer {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J=\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00010\t\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00028\u00012\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/window/core/SpecificationComputer$Companion;", "", "T", "", "tag", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "verificationMode", "Landroidx/window/core/Logger;", "logger", "Landroidx/window/core/SpecificationComputer;", "startSpecification", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/SpecificationComputer$VerificationMode;Landroidx/window/core/Logger;)Landroidx/window/core/SpecificationComputer;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final SpecificationComputer startSpecification(@NotNull Object object0, @NotNull String s, @NotNull VerificationMode specificationComputer$VerificationMode0, @NotNull Logger logger0) {
            Intrinsics.checkNotNullParameter(object0, "<this>");
            Intrinsics.checkNotNullParameter(s, "tag");
            Intrinsics.checkNotNullParameter(specificationComputer$VerificationMode0, "verificationMode");
            Intrinsics.checkNotNullParameter(logger0, "logger");
            return new b(object0, s, specificationComputer$VerificationMode0, logger0);
        }

        public static SpecificationComputer startSpecification$default(Companion specificationComputer$Companion0, Object object0, String s, VerificationMode specificationComputer$VerificationMode0, Logger logger0, int v, Object object1) {
            if((v & 2) != 0) {
                specificationComputer$VerificationMode0 = BuildConfig.INSTANCE.getVerificationMode();
            }
            if((v & 4) != 0) {
                logger0 = AndroidLogger.INSTANCE;
            }
            return specificationComputer$Companion0.startSpecification(object0, s, specificationComputer$VerificationMode0, logger0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/core/SpecificationComputer$VerificationMode;", "", "STRICT", "LOG", "QUIET", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static enum VerificationMode {
        STRICT,
        LOG,
        QUIET;

    }

    @NotNull
    public static final Companion Companion;

    static {
        SpecificationComputer.Companion = new Companion(null);
    }

    @Nullable
    public abstract Object compute();

    @NotNull
    public final String createMessage(@NotNull Object object0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(object0, "value");
        Intrinsics.checkNotNullParameter(s, "message");
        return s + " value: " + object0;
    }

    @NotNull
    public abstract SpecificationComputer require(@NotNull String arg1, @NotNull Function1 arg2);
}

