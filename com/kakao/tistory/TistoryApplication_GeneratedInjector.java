package com.kakao.tistory;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@InstallIn({SingletonComponent.class})
@OriginatingElement(topLevelClass = TistoryApplication.class)
@GeneratedEntryPoint
public interface TistoryApplication_GeneratedInjector {
    void injectTistoryApplication(TistoryApplication arg1);
}

