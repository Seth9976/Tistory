package kotlinx.coroutines.debug;

import android.annotation.SuppressLint;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.AgentInstallationType;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.misc.Signal;
import vf.a;

@SuppressLint({"all"})
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\tJ!\u0010\u0007\u001A\u00020\u00062\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain;", "", "", "args", "Ljava/lang/instrument/Instrumentation;", "instrumentation", "", "premain", "(Ljava/lang/String;Ljava/lang/instrument/Instrumentation;)V", "DebugProbesTransformer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@IgnoreJRERequirement
public final class AgentPremain {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001JC\u0010\f\u001A\u0004\u0018\u00010\n2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\f\u0010\u0007\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001A\u00020\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain$DebugProbesTransformer;", "Ljava/lang/instrument/ClassFileTransformer;", "Ljava/lang/ClassLoader;", "loader", "", "className", "Ljava/lang/Class;", "classBeingRedefined", "Ljava/security/ProtectionDomain;", "protectionDomain", "", "classfileBuffer", "transform", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DebugProbesTransformer implements ClassFileTransformer {
        @NotNull
        public static final DebugProbesTransformer INSTANCE;

        static {
            DebugProbesTransformer.INSTANCE = new DebugProbesTransformer();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Nullable
        public byte[] transform(@Nullable ClassLoader classLoader0, @NotNull String s, @Nullable Class class0, @NotNull ProtectionDomain protectionDomain0, @Nullable byte[] arr_b) {
            if(classLoader0 != null && Intrinsics.areEqual(s, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
                return ByteStreamsKt.readBytes(classLoader0.getResourceAsStream("DebugProbesKt.bin"));
            }
            return null;
        }
    }

    @NotNull
    public static final AgentPremain INSTANCE;
    public static final boolean a;

    static {
        Boolean boolean1;
        AgentPremain.INSTANCE = new AgentPremain();  // 初始化器: Ljava/lang/Object;-><init>()V
        Boolean boolean0 = null;
        try {
            String s = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            boolean1 = s == null ? null : Boolean.valueOf(Boolean.parseBoolean(s));
        }
        catch(Throwable throwable0) {
            boolean1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
        }
        if(!Result.isFailure-impl(boolean1)) {
            boolean0 = boolean1;
        }
        AgentPremain.a = boolean0 == null ? false : boolean0.booleanValue();
    }

    public static void a() {
        try {
            Signal.handle(new Signal("TRAP"), new a());
        }
        catch(Throwable unused_ex) {
        }
    }

    @JvmStatic
    public static final void premain(@Nullable String s, @NotNull Instrumentation instrumentation0) {
        AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
        instrumentation0.addTransformer(DebugProbesTransformer.INSTANCE);
        DebugProbesImpl.INSTANCE.setEnableCreationStackTraces$kotlinx_coroutines_core(AgentPremain.a);
        DebugProbesImpl.INSTANCE.install$kotlinx_coroutines_core();
        AgentPremain.INSTANCE.getClass();
        AgentPremain.a();
    }
}

