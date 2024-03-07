package com.naman14.timber;

public class PlaylistInfo {
    public final long[] list;
    public int position;

    public PlaylistInfo(final long[] list, int position) {
        this.list = list;
        this.position = position;
    }
}
