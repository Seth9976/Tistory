package com.kakao.tistory.presentation.common.push;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;

@InstallIn({ServiceComponent.class})
@OriginatingElement(topLevelClass = PushMessagingService.class)
@GeneratedEntryPoint
public interface PushMessagingService_GeneratedInjector {
    void injectPushMessagingService(PushMessagingService arg1);
}

