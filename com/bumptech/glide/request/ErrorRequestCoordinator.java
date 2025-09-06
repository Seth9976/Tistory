package com.bumptech.glide.request;

import androidx.annotation.Nullable;

public final class ErrorRequestCoordinator implements Request, RequestCoordinator {
    public final Object a;
    public final RequestCoordinator b;
    public volatile Request c;
    public volatile Request d;
    public RequestState e;
    public RequestState f;

    public ErrorRequestCoordinator(Object object0, @Nullable RequestCoordinator requestCoordinator0) {
        this.e = RequestState.CLEARED;
        this.f = RequestState.CLEARED;
        this.a = object0;
        this.b = requestCoordinator0;
    }

    @Override  // com.bumptech.glide.request.Request
    public void begin() {
        synchronized(this.a) {
            RequestState requestCoordinator$RequestState0 = RequestState.RUNNING;
            if(this.e != requestCoordinator$RequestState0) {
                this.e = requestCoordinator$RequestState0;
                this.c.begin();
            }
        }
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(Request request0) {
        boolean z = true;
        synchronized(this.a) {
            if(this.b != null && !this.b.canNotifyCleared(this) || !request0.equals(this.c)) {
                z = false;
            }
            return z;
        }
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(Request request0) {
        boolean z = true;
        synchronized(this.a) {
            if(this.b != null && !this.b.canNotifyStatusChanged(this) || !(this.e == RequestState.FAILED ? request0.equals(this.d) && (this.f == RequestState.SUCCESS || this.f == RequestState.FAILED) : request0.equals(this.c))) {
                z = false;
            }
            return z;
        }
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(Request request0) {
        synchronized(this.a) {
            return this.b == null || this.b.canSetImage(this);
        }
    }

    @Override  // com.bumptech.glide.request.Request
    public void clear() {
        synchronized(this.a) {
            RequestState requestCoordinator$RequestState0 = RequestState.CLEARED;
            this.e = requestCoordinator$RequestState0;
            this.c.clear();
            if(this.f != requestCoordinator$RequestState0) {
                this.f = requestCoordinator$RequestState0;
                this.d.clear();
            }
        }
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        synchronized(this.a) {
            RequestCoordinator requestCoordinator0 = this.b;
            return requestCoordinator0 == null ? this : requestCoordinator0.getRoot();
        }
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
        synchronized(this.a) {
            return this.c.isAnyResourceSet() || this.d.isAnyResourceSet();
        }
    }

    @Override  // com.bumptech.glide.request.Request
    public boolean isCleared() {
        synchronized(this.a) {
        }
        return this.e == RequestState.CLEARED && this.f == RequestState.CLEARED;
    }

    @Override  // com.bumptech.glide.request.Request
    public boolean isComplete() {
        synchronized(this.a) {
        }
        return this.e == RequestState.SUCCESS || this.f == RequestState.SUCCESS;
    }

    // 去混淆评级： 低(30)
    @Override  // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request0) {
        return request0 instanceof ErrorRequestCoordinator && this.c.isEquivalentTo(((ErrorRequestCoordinator)request0).c) && this.d.isEquivalentTo(((ErrorRequestCoordinator)request0).d);
    }

    @Override  // com.bumptech.glide.request.Request
    public boolean isRunning() {
        synchronized(this.a) {
        }
        return this.e == RequestState.RUNNING || this.f == RequestState.RUNNING;
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(Request request0) {
        synchronized(this.a) {
            if(!request0.equals(this.d)) {
                this.e = RequestState.FAILED;
                RequestState requestCoordinator$RequestState0 = RequestState.RUNNING;
                if(this.f != requestCoordinator$RequestState0) {
                    this.f = requestCoordinator$RequestState0;
                    this.d.begin();
                }
                return;
            }
            this.f = RequestState.FAILED;
            RequestCoordinator requestCoordinator0 = this.b;
            if(requestCoordinator0 != null) {
                requestCoordinator0.onRequestFailed(this);
            }
        }
    }

    @Override  // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(Request request0) {
        synchronized(this.a) {
            if(request0.equals(this.c)) {
                this.e = RequestState.SUCCESS;
            }
            else if(request0.equals(this.d)) {
                this.f = RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator0 = this.b;
            if(requestCoordinator0 != null) {
                requestCoordinator0.onRequestSuccess(this);
            }
        }
    }

    @Override  // com.bumptech.glide.request.Request
    public void pause() {
        synchronized(this.a) {
            RequestState requestCoordinator$RequestState0 = RequestState.RUNNING;
            if(this.e == requestCoordinator$RequestState0) {
                this.e = RequestState.PAUSED;
                this.c.pause();
            }
            if(this.f == requestCoordinator$RequestState0) {
                this.f = RequestState.PAUSED;
                this.d.pause();
            }
        }
    }

    public void setRequests(Request request0, Request request1) {
        this.c = request0;
        this.d = request1;
    }
}

