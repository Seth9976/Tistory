package com.google.firebase;

import android.os.Build;
import androidx.compose.ui.text.n0;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String s) {
        return s.replace(' ', '_').replace('/', '_');
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        List list0 = new ArrayList();
        ((ArrayList)list0).add(DefaultUserAgentPublisher.component());
        ((ArrayList)list0).add(DefaultHeartBeatController.component());
        ((ArrayList)list0).add(LibraryVersionComponent.create("fire-android", "33"));
        ((ArrayList)list0).add(LibraryVersionComponent.create("fire-core", "20.2.0"));
        ((ArrayList)list0).add(LibraryVersionComponent.create("device-name", FirebaseCommonRegistrar.a(Build.PRODUCT)));
        ((ArrayList)list0).add(LibraryVersionComponent.create("device-model", FirebaseCommonRegistrar.a(Build.DEVICE)));
        ((ArrayList)list0).add(LibraryVersionComponent.create("device-brand", FirebaseCommonRegistrar.a(Build.BRAND)));
        ((ArrayList)list0).add(LibraryVersionComponent.fromContext("android-target-sdk", new n0(21)));
        ((ArrayList)list0).add(LibraryVersionComponent.fromContext("android-min-sdk", new n0(22)));
        ((ArrayList)list0).add(LibraryVersionComponent.fromContext("android-platform", new n0(23)));
        ((ArrayList)list0).add(LibraryVersionComponent.fromContext("android-installer", new n0(24)));
        ((ArrayList)list0).add(LibraryVersionComponent.create("kotlin", "1.9.24"));
        return list0;
    }
}

