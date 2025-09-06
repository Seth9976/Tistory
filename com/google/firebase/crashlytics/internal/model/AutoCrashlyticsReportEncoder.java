package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

public final class AutoCrashlyticsReportEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG;

    static {
        AutoCrashlyticsReportEncoder.CONFIG = new AutoCrashlyticsReportEncoder();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig0) {
        encoderConfig0.registerEncoder(CrashlyticsReport.class, c.a);
        encoderConfig0.registerEncoder(w.class, c.a);
        encoderConfig0.registerEncoder(Session.class, i.a);
        encoderConfig0.registerEncoder(g0.class, i.a);
        encoderConfig0.registerEncoder(Application.class, f.a);
        encoderConfig0.registerEncoder(i0.class, f.a);
        encoderConfig0.registerEncoder(Organization.class, g.a);
        encoderConfig0.registerEncoder(k0.class, g.a);
        encoderConfig0.registerEncoder(User.class, u.a);
        encoderConfig0.registerEncoder(k1.class, u.a);
        encoderConfig0.registerEncoder(OperatingSystem.class, t.a);
        encoderConfig0.registerEncoder(i1.class, t.a);
        encoderConfig0.registerEncoder(Device.class, h.a);
        encoderConfig0.registerEncoder(m0.class, h.a);
        encoderConfig0.registerEncoder(Event.class, r.a);
        encoderConfig0.registerEncoder(o0.class, r.a);
        encoderConfig0.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.class, j.a);
        encoderConfig0.registerEncoder(q0.class, j.a);
        encoderConfig0.registerEncoder(Execution.class, l.a);
        encoderConfig0.registerEncoder(s0.class, l.a);
        encoderConfig0.registerEncoder(Thread.class, o.a);
        encoderConfig0.registerEncoder(a1.class, o.a);
        encoderConfig0.registerEncoder(Frame.class, p.a);
        encoderConfig0.registerEncoder(c1.class, p.a);
        encoderConfig0.registerEncoder(Exception.class, m.a);
        encoderConfig0.registerEncoder(w0.class, m.a);
        encoderConfig0.registerEncoder(ApplicationExitInfo.class, a.a);
        encoderConfig0.registerEncoder(y.class, a.a);
        encoderConfig0.registerEncoder(Signal.class, n.a);
        encoderConfig0.registerEncoder(y0.class, n.a);
        encoderConfig0.registerEncoder(BinaryImage.class, k.a);
        encoderConfig0.registerEncoder(u0.class, k.a);
        encoderConfig0.registerEncoder(CustomAttribute.class, b.a);
        encoderConfig0.registerEncoder(a0.class, b.a);
        encoderConfig0.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.class, q.a);
        encoderConfig0.registerEncoder(e1.class, q.a);
        encoderConfig0.registerEncoder(Log.class, s.a);
        encoderConfig0.registerEncoder(g1.class, s.a);
        encoderConfig0.registerEncoder(FilesPayload.class, d.a);
        encoderConfig0.registerEncoder(c0.class, d.a);
        encoderConfig0.registerEncoder(File.class, e.a);
        encoderConfig0.registerEncoder(e0.class, e.a);
    }
}

