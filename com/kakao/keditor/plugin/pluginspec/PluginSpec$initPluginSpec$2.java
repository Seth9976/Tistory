package com.kakao.keditor.plugin.pluginspec;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000E\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
final class PluginSpec.initPluginSpec.2 extends Lambda implements Function1 {
    public static final PluginSpec.initPluginSpec.2 INSTANCE;

    static {
        PluginSpec.initPluginSpec.2.INSTANCE = new PluginSpec.initPluginSpec.2();
    }

    public PluginSpec.initPluginSpec.2() {
        super(1);
    }

    @NotNull
    public final CharSequence invoke(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "it");
        return s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(((String)object0));
    }
}

