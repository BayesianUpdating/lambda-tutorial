package org.adoptopenjdk.lambda.tutorial.exercise5.thirdpartyplugin;

/*
 * #%L
 * lambda-tutorial
 * %%
 * Copyright (C) 2013 Adopt OpenJDK
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

import org.adoptopenjdk.lambda.tutorial.exercise5.musicplayer.MusicLibrary;
import org.adoptopenjdk.lambda.tutorial.exercise5.musicplayer.Song;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LocalFilesystemMusicLibrary implements MusicLibrary {


    private final Set<Song> allSongs;

    public LocalFilesystemMusicLibrary(Song... allSongs) {
        this.allSongs = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(allSongs)));
    }

    @Override
    public Collection<Song> allSongs() {
        return allSongs;
    }
}
