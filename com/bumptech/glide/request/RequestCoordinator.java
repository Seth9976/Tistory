package com.bumptech.glide.request;

public interface RequestCoordinator {
    public static enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        public final boolean a;

        public RequestState(boolean z) {
            this.a = z;
        }
    }

    boolean canNotifyCleared(Request arg1);

    boolean canNotifyStatusChanged(Request arg1);

    boolean canSetImage(Request arg1);

    RequestCoordinator getRoot();

    boolean isAnyResourceSet();

    void onRequestFailed(Request arg1);

    void onRequestSuccess(Request arg1);
}

