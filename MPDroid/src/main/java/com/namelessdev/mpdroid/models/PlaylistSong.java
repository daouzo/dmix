/*
 * Copyright (C) 2010-2014 The MPDroid Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.namelessdev.mpdroid.models;

import org.a0z.mpd.item.Music;

import java.util.ArrayList;
import java.util.List;

import static android.text.TextUtils.isEmpty;
import static android.text.TextUtils.join;

public class PlaylistSong extends AbstractPlaylistMusic {

    public PlaylistSong(final Music music) {
        super(music.getAlbum(), music.getArtist(), music.getAlbumArtist(), music.getFullPath(),
                music.getDisc(), music.getDate(), music.getGenre(), music.getTime(),
                music.getTitle(), music.getTotalTracks(), music.getTrack(), music.getSongId(),
                music.getPos(), music.getName());
    }

    public String getPlayListMainLine() {
        return getTitle();
    }

    public String getPlaylistSubLine() {
        List<String> subLineTexts = new ArrayList<>();
        if (!isEmpty(getArtist())) {
            subLineTexts.add(getArtist());
        }
        if (!isEmpty(getAlbum())) {
            subLineTexts.add(getAlbum());
        }
        return join(" - ", subLineTexts);
    }
}
